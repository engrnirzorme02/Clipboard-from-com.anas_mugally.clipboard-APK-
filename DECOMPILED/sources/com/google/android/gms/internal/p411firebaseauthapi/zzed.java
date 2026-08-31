package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzed {
    private static final zzps<zzdz, zzba> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzec
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzip.zza((zzdz) zzbiVar);
        }
    }, zzdz.class, zzba.class);
    private static final zzor<zzeg> zzb = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzef
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            zzeg zzegVar = (zzeg) zzcbVar;
            return zzdz.zze().zza(zzegVar).zza(num).zza(zzaal.zza(zzegVar.zzb())).zza();
        }
    };
    private static final zzot<zzeg> zzc = new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzee
    };
    private static final zzbh<zzba> zzd = zzod.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzba.class, zzwx.zzb.SYMMETRIC, zzuj.zze());

    public static void zza(boolean z7) {
        if (zziv.zza.zza.zza()) {
            zzhb.zza();
            zzox zzoxVarZza = zzox.zza();
            HashMap map = new HashMap();
            zzeg.zza zzaVarZza = zzeg.zzc().zza(16);
            zzeg.zzb zzbVar = zzeg.zzb.zza;
            map.put("AES128_GCM_SIV", zzaVarZza.zza(zzbVar).zza());
            zzeg.zza zzaVarZza2 = zzeg.zzc().zza(16);
            zzeg.zzb zzbVar2 = zzeg.zzb.zzc;
            map.put("AES128_GCM_SIV_RAW", zzaVarZza2.zza(zzbVar2).zza());
            map.put("AES256_GCM_SIV", zzeg.zzc().zza(32).zza(zzbVar).zza());
            map.put("AES256_GCM_SIV_RAW", zzeg.zzc().zza(32).zza(zzbVar2).zza());
            zzoxVarZza.zza(Collections.unmodifiableMap(map));
            zzou.zza().zza(zzc, zzeg.class);
            zzop.zza().zza(zzb, zzeg.class);
            zzpa.zza().zza(zza);
            zznq.zza().zza((zzbh) zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
    }
}
