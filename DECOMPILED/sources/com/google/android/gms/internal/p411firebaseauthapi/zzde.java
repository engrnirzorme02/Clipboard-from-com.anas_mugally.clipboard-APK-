package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzde {
    private static final zzps<zzdd, zzba> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdh
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzzk.zza((zzdd) zzbiVar);
        }
    }, zzdd.class, zzba.class);
    private static final zzbh<zzba> zzb = zzod.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzba.class, zzwx.zzb.SYMMETRIC, zztf.zzf());
    private static final zzot<zzdi> zzc = new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdg
    };
    private static final zzor<zzdi> zzd = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdj
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzde.zza((zzdi) zzcbVar, num);
        }
    };
    private static final zziv.zza zze = zziv.zza.zzb;

    static zzdd zza(zzdi zzdiVar, Integer num) throws GeneralSecurityException {
        if (zzdiVar.zzb() == 16 || zzdiVar.zzb() == 32) {
            return zzdd.zze().zza(zzdiVar).zza(num).zza(zzaal.zza(zzdiVar.zzb())).zzb(zzaal.zza(zzdiVar.zzc())).zza();
        }
        throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static void zza(boolean z7) {
        zziv.zza zzaVar = zze;
        if (zzaVar.zza()) {
            zzgg.zza();
            zzpa.zza().zza(zza);
            zzox zzoxVarZza = zzox.zza();
            HashMap map = new HashMap();
            map.put("AES128_CTR_HMAC_SHA256", zzfm.zze);
            zzdi.zzb zzbVarZzc = zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16);
            zzdi.zza zzaVar2 = zzdi.zza.zzc;
            zzdi.zzb zzbVarZza = zzbVarZzc.zza(zzaVar2);
            zzdi.zzc zzcVar = zzdi.zzc.zzc;
            map.put("AES128_CTR_HMAC_SHA256_RAW", zzbVarZza.zza(zzcVar).zza());
            map.put("AES256_CTR_HMAC_SHA256", zzfm.zzf);
            map.put("AES256_CTR_HMAC_SHA256_RAW", zzdi.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzaVar2).zza(zzcVar).zza());
            zzoxVarZza.zza(Collections.unmodifiableMap(map));
            zzou.zza().zza(zzc, zzdi.class);
            zzop.zza().zza(zzd, zzdi.class);
            zznq.zza().zza((zzbh) zzb, zzaVar, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
