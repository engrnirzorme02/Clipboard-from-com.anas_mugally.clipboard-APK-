package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzks {
    private static final zznp zza = zzb();

    public static zzbb zza() throws GeneralSecurityException {
        if (zziv.zzb()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV1 in FIPS mode");
        }
        return zza;
    }

    private static zznp zzb() {
        try {
            zzpy zzpyVarZza = zzpw.zza();
            zzld.zza(zzpyVarZza);
            zzpyVarZza.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkv
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzze.zza((zzkh) zzbiVar);
                }
            }, zzkh.class, zzbg.class));
            zzpyVarZza.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzku
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzmd.zza((zzkq) zzbiVar);
                }
            }, zzkq.class, zzbg.class));
            zzkz.zza(zzpyVarZza);
            zzpyVarZza.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkx
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzzb.zza((zzke) zzbiVar);
                }
            }, zzke.class, zzbd.class));
            zzpyVarZza.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkw
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzma.zza((zzki) zzbiVar);
                }
            }, zzki.class, zzbd.class));
            return zznp.zza(zzpyVarZza.zza());
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
