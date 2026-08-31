package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzco {
    private static final zznp zza = zzb();

    public static /* synthetic */ zzba zza(zzgb zzgbVar) {
        return zzik.zza() ? zzik.zza(zzgbVar) : zzaak.zza(zzgbVar);
    }

    private static zznp zzb() {
        try {
            zzpy zzpyVarZza = zzpw.zza();
            zzcx.zza(zzpyVarZza);
            zzpyVarZza.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcn
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzzk.zza((zzdd) zzbiVar);
                }
            }, zzdd.class, zzba.class));
            zzpyVarZza.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcq
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzyy.zza((zzds) zzbiVar);
                }
            }, zzds.class, zzba.class));
            zzpyVarZza.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcp
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzip.zza((zzdz) zzbiVar);
                }
            }, zzdz.class, zzba.class));
            zzpyVarZza.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcs
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzyw.zza((zzdl) zzbiVar);
                }
            }, zzdl.class, zzba.class));
            zzpyVarZza.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcr
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzco.zza((zzej) zzbiVar);
                }
            }, zzej.class, zzba.class));
            zzpyVarZza.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcu
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzco.zza((zzgb) zzbiVar);
                }
            }, zzgb.class, zzba.class));
            zzpyVarZza.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzct
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzib.zza((zzfw) zzbiVar);
                }
            }, zzfw.class, zzba.class));
            return zznp.zza(zzpyVarZza.zza());
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static /* synthetic */ zzba zza(zzej zzejVar) {
        if (zzhh.zzb()) {
            return zzhh.zza(zzejVar);
        }
        return zzzc.zza(zzejVar);
    }

    public static zzbb zza() throws GeneralSecurityException {
        if (!zziv.zzb()) {
            return zza;
        }
        throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
    }
}
