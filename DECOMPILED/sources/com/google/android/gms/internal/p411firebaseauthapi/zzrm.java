package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrm implements zzpz<zzcc, zzcc> {
    private static final zzrm zza = new zzrm();
    private static final zzps<zzof, zzcc> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrp
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzsm.zza((zzof) zzbiVar);
        }
    }, zzof.class, zzcc.class);

    zzrm() {
    }

    static void zzc() {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpz
    public final Class<zzcc> zza() {
        return zzcc.class;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpz
    public final Class<zzcc> zzb() {
        return zzcc.class;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpz
    public final /* synthetic */ zzcc zza(zzob zzobVar, zzok zzokVar, zzqc<zzcc> zzqcVar) throws GeneralSecurityException {
        zzoo zzooVar;
        zzoo zzooVarZza;
        zzaaj zzaajVarZzc;
        zzpn zzpnVar = new zzpn();
        for (int i7 = 0; i7 < zzobVar.zza(); i7++) {
            zzoa zzoaVarZza = zzobVar.zza(i7);
            if (zzoaVarZza.zzc().equals(zzbk.zza)) {
                zzcc zzccVarZza = zzqcVar.zza(zzoaVarZza);
                zzbi zzbiVarZzb = zzoaVarZza.zzb();
                if (zzbiVarZzb instanceof zzrk) {
                    zzaajVarZzc = ((zzrk) zzbiVarZzb).zze();
                } else {
                    if (!(zzbiVarZzb instanceof zzof)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzbiVarZzb.getClass().getName() + " with parameters " + String.valueOf(zzbiVarZzb.zza()));
                    }
                    zzaajVarZzc = ((zzof) zzbiVarZzb).zzc();
                }
                zzpnVar.zza(zzaajVarZzc, new zzro(zzccVarZza, zzoaVarZza.zza()));
            }
        }
        if (zzokVar.zza()) {
            zzooVar = zzon.zza;
            zzooVarZza = zzooVar;
        } else {
            zzol zzolVarZza = zzow.zzb().zza();
            zzoo zzooVarZza2 = zzolVarZza.zza(zzobVar, zzokVar, "mac", "compute");
            zzooVarZza = zzolVarZza.zza(zzobVar, zzokVar, "mac", "verify");
            zzooVar = zzooVarZza2;
        }
        return new zzrr(new zzro(zzqcVar.zza(zzobVar.zzc()), zzobVar.zzc().zza()), zzpnVar.zza(), zzooVar, zzooVarZza);
    }
}
