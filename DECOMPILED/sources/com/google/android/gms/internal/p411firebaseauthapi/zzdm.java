package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdm {
    private static final zzps<zzdl, zzba> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdp
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzyw.zza((zzdl) zzbiVar);
        }
    }, zzdl.class, zzba.class);
    private static final zzbh<zzba> zzb = zzod.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", zzba.class, zzwx.zzb.SYMMETRIC, zztu.zzf());
    private static final zzor<zzdq> zzc = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdo
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzdm.zza((zzdq) zzcbVar, num);
        }
    };

    public static /* synthetic */ zzdl zza(zzdq zzdqVar, Integer num) throws GeneralSecurityException {
        if (zzdqVar.zzc() != 24) {
            return zzdl.zze().zza(zzdqVar).zza(num).zza(zzaal.zza(zzdqVar.zzc())).zza();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static void zza(boolean z7) {
        if (zziv.zza.zza.zza()) {
            zzgl.zza();
            zzpa.zza().zza(zza);
            zzox zzoxVarZza = zzox.zza();
            HashMap map = new HashMap();
            map.put("AES128_EAX", zzfm.zzc);
            zzdq.zza zzaVarZzc = zzdq.zze().zza(16).zzb(16).zzc(16);
            zzdq.zzb zzbVar = zzdq.zzb.zzc;
            map.put("AES128_EAX_RAW", zzaVarZzc.zza(zzbVar).zza());
            map.put("AES256_EAX", zzfm.zzd);
            map.put("AES256_EAX_RAW", zzdq.zze().zza(16).zzb(32).zzc(16).zza(zzbVar).zza());
            zzoxVarZza.zza(Collections.unmodifiableMap(map));
            zzop.zza().zza(zzc, zzdq.class);
            zznq.zza().zza((zzbh) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
    }
}
