package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmg {
    private static final zzps<zzki, zzbd> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmj
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzma.zza((zzki) zzbiVar);
        }
    }, zzki.class, zzbd.class);
    private static final zzps<zzkq, zzbg> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmi
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzmd.zza((zzkq) zzbiVar);
        }
    }, zzkq.class, zzbg.class);
    private static final zzcd<zzbd> zzc = zzod.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", zzbd.class, zzwr.zzf());
    private static final zzbh<zzbg> zzd = zzod.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzbg.class, zzwx.zzb.ASYMMETRIC_PUBLIC, zzwu.zzg());
    private static final zzor<zzkg> zze = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzml
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzmg.zza((zzkg) zzcbVar, num);
        }
    };

    public static /* synthetic */ zzki zza(zzkg zzkgVar, Integer num) throws GeneralSecurityException {
        byte[] bArr;
        zzaaj zzaajVarZza;
        zzaal zzaalVarZza;
        if (zzkgVar.zze().equals(zzkg.zzf.zzd)) {
            byte[] bArrZza = zzaah.zza();
            zzaalVarZza = zzaal.zza(bArrZza, zzbf.zza());
            zzaajVarZza = zzaaj.zza(zzaah.zza(bArrZza));
        } else {
            if (!zzkgVar.zze().equals(zzkg.zzf.zza) && !zzkgVar.zze().equals(zzkg.zzf.zzb) && !zzkgVar.zze().equals(zzkg.zzf.zzc)) {
                throw new GeneralSecurityException("Unknown KEM ID");
            }
            zzzi zzziVarZzc = zzmk.zzc(zzkgVar.zze());
            KeyPair keyPairZza = zzzf.zza(zzzf.zza(zzziVarZzc));
            zzzh zzzhVar = zzzh.UNCOMPRESSED;
            ECPoint w7 = ((ECPublicKey) keyPairZza.getPublic()).getW();
            EllipticCurve curve = zzzf.zza(zzziVarZzc).getCurve();
            zznj.zza(w7, curve);
            int iZza = zzzf.zza(curve);
            int iOrdinal = zzzhVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    int i7 = iZza + 1;
                    bArr = new byte[i7];
                    byte[] bArrZza2 = zzne.zza(w7.getAffineX());
                    System.arraycopy(bArrZza2, 0, bArr, i7 - bArrZza2.length, bArrZza2.length);
                    bArr[0] = (byte) (w7.getAffineY().testBit(0) ? 3 : 2);
                } else {
                    if (iOrdinal != 2) {
                        throw new GeneralSecurityException("invalid format:" + String.valueOf(zzzhVar));
                    }
                    int i8 = iZza * 2;
                    bArr = new byte[i8];
                    byte[] bArrZza3 = zzne.zza(w7.getAffineX());
                    if (bArrZza3.length > iZza) {
                        bArrZza3 = Arrays.copyOfRange(bArrZza3, bArrZza3.length - iZza, bArrZza3.length);
                    }
                    byte[] bArrZza4 = zzne.zza(w7.getAffineY());
                    if (bArrZza4.length > iZza) {
                        bArrZza4 = Arrays.copyOfRange(bArrZza4, bArrZza4.length - iZza, bArrZza4.length);
                    }
                    System.arraycopy(bArrZza4, 0, bArr, i8 - bArrZza4.length, bArrZza4.length);
                    System.arraycopy(bArrZza3, 0, bArr, iZza - bArrZza3.length, bArrZza3.length);
                }
            } else {
                int i9 = (iZza * 2) + 1;
                bArr = new byte[i9];
                byte[] bArrZza5 = zzne.zza(w7.getAffineX());
                byte[] bArrZza6 = zzne.zza(w7.getAffineY());
                System.arraycopy(bArrZza6, 0, bArr, i9 - bArrZza6.length, bArrZza6.length);
                System.arraycopy(bArrZza5, 0, bArr, (iZza + 1) - bArrZza5.length, bArrZza5.length);
                bArr[0] = 4;
            }
            zzaajVarZza = zzaaj.zza(bArr);
            zzaalVarZza = zzaal.zza(zzne.zza(((ECPrivateKey) keyPairZza.getPrivate()).getS(), zzmk.zza(zzkgVar.zze())), zzbf.zza());
        }
        return zzki.zza(zzkq.zza(zzkgVar, zzaajVarZza, num), zzaalVarZza);
    }

    public static void zza(boolean z7) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzkl.zza();
            zzox zzoxVarZza = zzox.zza();
            HashMap map = new HashMap();
            zzkg.zzd zzdVarZzc = zzkg.zzc();
            zzkg.zze zzeVar = zzkg.zze.zza;
            zzkg.zzd zzdVarZza = zzdVarZzc.zza(zzeVar);
            zzkg.zzf zzfVar = zzkg.zzf.zzd;
            zzkg.zzd zzdVarZza2 = zzdVarZza.zza(zzfVar);
            zzkg.zzc zzcVar = zzkg.zzc.zza;
            zzkg.zzd zzdVarZza3 = zzdVarZza2.zza(zzcVar);
            zzkg.zzb zzbVar = zzkg.zzb.zza;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzdVarZza3.zza(zzbVar).zza());
            zzkg.zzd zzdVarZzc2 = zzkg.zzc();
            zzkg.zze zzeVar2 = zzkg.zze.zzc;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzdVarZzc2.zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar).zza());
            zzkg.zzd zzdVarZza4 = zzkg.zzc().zza(zzeVar).zza(zzfVar).zza(zzcVar);
            zzkg.zzb zzbVar2 = zzkg.zzb.zzb;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzdVarZza4.zza(zzbVar2).zza());
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar2).zza());
            zzkg.zzd zzdVarZza5 = zzkg.zzc().zza(zzeVar).zza(zzfVar).zza(zzcVar);
            zzkg.zzb zzbVar3 = zzkg.zzb.zzc;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzdVarZza5.zza(zzbVar3).zza());
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar3).zza());
            zzkg.zzd zzdVarZza6 = zzkg.zzc().zza(zzeVar);
            zzkg.zzf zzfVar2 = zzkg.zzf.zza;
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzdVarZza6.zza(zzfVar2).zza(zzcVar).zza(zzbVar).zza());
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar2).zza(zzcVar).zza(zzbVar).zza());
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzkg.zzc().zza(zzeVar).zza(zzfVar2).zza(zzcVar).zza(zzbVar2).zza());
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar2).zza(zzcVar).zza(zzbVar2).zza());
            zzkg.zzd zzdVarZza7 = zzkg.zzc().zza(zzeVar);
            zzkg.zzf zzfVar3 = zzkg.zzf.zzb;
            zzkg.zzd zzdVarZza8 = zzdVarZza7.zza(zzfVar3);
            zzkg.zzc zzcVar2 = zzkg.zzc.zzb;
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzdVarZza8.zza(zzcVar2).zza(zzbVar).zza());
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar3).zza(zzcVar2).zza(zzbVar).zza());
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzkg.zzc().zza(zzeVar).zza(zzfVar3).zza(zzcVar2).zza(zzbVar2).zza());
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar3).zza(zzcVar2).zza(zzbVar2).zza());
            zzkg.zzd zzdVarZza9 = zzkg.zzc().zza(zzeVar);
            zzkg.zzf zzfVar4 = zzkg.zzf.zzc;
            zzkg.zzd zzdVarZza10 = zzdVarZza9.zza(zzfVar4);
            zzkg.zzc zzcVar3 = zzkg.zzc.zzc;
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzdVarZza10.zza(zzcVar3).zza(zzbVar).zza());
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar4).zza(zzcVar3).zza(zzbVar).zza());
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzkg.zzc().zza(zzeVar).zza(zzfVar4).zza(zzcVar3).zza(zzbVar2).zza());
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar4).zza(zzcVar3).zza(zzbVar2).zza());
            zzoxVarZza.zza(Collections.unmodifiableMap(map));
            zzpa.zza().zza(zza);
            zzpa.zza().zza(zzb);
            zzop.zza().zza(zze, zzkg.class);
            zznq.zza().zza((zzbh) zzc, true);
            zznq.zza().zza((zzbh) zzd, false);
            return;
        }
        throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
    }
}
