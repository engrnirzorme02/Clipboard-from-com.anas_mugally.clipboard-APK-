package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzld implements zzpz<zzbg, zzbg> {
    private static final zzld zza = new zzld();
    private static final zzps<zzof, zzbg> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlc
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzmp.zza((zzof) zzbiVar);
        }
    }, zzof.class, zzbg.class);

    zzld() {
    }

    public static void zzc() {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpz
    public final Class<zzbg> zza() {
        return zzbg.class;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpz
    public final Class<zzbg> zzb() {
        return zzbg.class;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpz
    public final /* synthetic */ zzbg zza(zzob zzobVar, zzok zzokVar, zzqc<zzbg> zzqcVar) {
        zzoo zzooVarZza = !zzokVar.zza() ? zzow.zzb().zza().zza(zzobVar, zzokVar, "hybrid_encrypt", "encrypt") : zzon.zza;
        zzoa zzoaVarZzc = zzobVar.zzc();
        return new zzle(new zzlf(zzqcVar.zza(zzoaVarZzc), zzoaVarZzc.zza()), zzooVarZza);
    }

    public static void zza(zzpy zzpyVar) throws GeneralSecurityException {
        zzpyVar.zza(zza);
    }
}
