package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjx {
    private static final zzps<zzke, zzbd> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzka
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzzb.zza((zzke) zzbiVar);
        }
    }, zzke.class, zzbd.class);
    private static final zzps<zzkh, zzbg> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjz
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzze.zza((zzkh) zzbiVar);
        }
    }, zzkh.class, zzbg.class);
    private static final zzcd<zzbd> zzc = zzod.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzbd.class, zzvn.zzf());
    private static final zzbh<zzbg> zzd = zzod.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzbg.class, zzwx.zzb.ASYMMETRIC_PUBLIC, zzvq.zzh());
    private static final zzor<zzkb> zze = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkc
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzjx.zza((zzkb) zzcbVar, num);
        }
    };

    public static /* synthetic */ zzke zza(zzkb zzkbVar, Integer num) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        zzkb.zzc zzcVarZzd = zzkbVar.zzd();
        if (zzcVarZzd == zzkb.zzc.zza) {
            eCParameterSpec = zznj.zza;
        } else if (zzcVarZzd == zzkb.zzc.zzb) {
            eCParameterSpec = zznj.zzb;
        } else {
            if (zzcVarZzd != zzkb.zzc.zzc) {
                throw new GeneralSecurityException("Unsupported curve type: " + String.valueOf(zzcVarZzd));
            }
            eCParameterSpec = zznj.zzc;
        }
        KeyPair keyPairZza = zzzf.zza(eCParameterSpec);
        return zzke.zza(zzkh.zza(zzkbVar, ((ECPublicKey) keyPairZza.getPublic()).getW(), num), zzaam.zza(((ECPrivateKey) keyPairZza.getPrivate()).getS(), zzbf.zza()));
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public static void zza(boolean z7) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzlq.zza();
            zzox zzoxVarZza = zzox.zza();
            HashMap map = new HashMap();
            zzkb.zza zzaVarZzc = zzkb.zzc();
            zzkb.zzc zzcVar = zzkb.zzc.zza;
            zzkb.zza zzaVarZza = zzaVarZzc.zza(zzcVar);
            zzkb.zzb zzbVar = zzkb.zzb.zzc;
            zzkb.zza zzaVarZza2 = zzaVarZza.zza(zzbVar);
            zzkb.zze zzeVar = zzkb.zze.zzb;
            zzkb.zza zzaVarZza3 = zzaVarZza2.zza(zzeVar);
            zzkb.zzd zzdVar = zzkb.zzd.zza;
            zzkb.zza zzaVarZza4 = zzaVarZza3.zza(zzdVar);
            zzdx.zzb zzbVarZzc = zzdx.zze().zza(12).zzb(16).zzc(16);
            zzdx.zza zzaVar = zzdx.zza.zzc;
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzaVarZza4.zza(zzbVarZzc.zza(zzaVar).zza()).zza());
            zzkb.zza zzaVarZza5 = zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar);
            zzkb.zzd zzdVar2 = zzkb.zzd.zzc;
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzaVarZza5.zza(zzdVar2).zza(zzdx.zze().zza(12).zzb(16).zzc(16).zza(zzaVar).zza()).zza());
            zzkb.zza zzaVarZza6 = zzkb.zzc().zza(zzcVar).zza(zzbVar);
            zzkb.zze zzeVar2 = zzkb.zze.zza;
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzaVarZza6.zza(zzeVar2).zza(zzdVar).zza(zzdx.zze().zza(12).zzb(16).zzc(16).zza(zzaVar).zza()).zza());
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdx.zze().zza(12).zzb(16).zzc(16).zza(zzaVar).zza()).zza());
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdx.zze().zza(12).zzb(16).zzc(16).zza(zzaVar).zza()).zza());
            zzkb.zza zzaVarZza7 = zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar).zza(zzdVar);
            zzdi.zzb zzbVarZzc2 = zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16);
            zzdi.zza zzaVar2 = zzdi.zza.zzc;
            zzdi.zzb zzbVarZza = zzbVarZzc2.zza(zzaVar2);
            zzdi.zzc zzcVar2 = zzdi.zzc.zzc;
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzaVarZza7.zza(zzbVarZza.zza(zzcVar2).zza()).zza());
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar).zza(zzdVar2).zza(zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzaVar2).zza(zzcVar2).zza()).zza());
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar).zza(zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzaVar2).zza(zzcVar2).zza()).zza());
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzkb.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzaVar2).zza(zzcVar2).zza()).zza());
            zzoxVarZza.zza(Collections.unmodifiableMap(map));
            zzpa.zza().zza(zza);
            zzpa.zza().zza(zzb);
            zzop.zza().zza(zze, zzkb.class);
            zznq.zza().zza((zzbh) zzc, true);
            zznq.zza().zza((zzbh) zzd, false);
            return;
        }
        throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
    }
}
