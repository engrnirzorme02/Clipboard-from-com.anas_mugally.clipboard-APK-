package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgrk implements zzgzi {
    private static final zzgrk zza = new zzgrk();
    private static final zzgzc zzb = zzgzc.zzd(zzgri.zza, zzgxv.class, zzgpx.class);

    zzgrk() {
    }

    public static void zzc() {
        zzgyl.zza().zzc(zza);
        zzgyl.zza().zzb(zzb);
    }

    public static void zzd(zzgzd zzgzdVar) throws GeneralSecurityException {
        zzgzdVar.zzb(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final Class zza() {
        return zzgpx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final Class zzb() {
        return zzgpx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final /* bridge */ /* synthetic */ Object zze(zzgxr zzgxrVar, zzgxy zzgxyVar, zzgzh zzgzhVar) throws GeneralSecurityException {
        zzgxz zzgxzVar;
        zzgxz zzgxzVarZza;
        zzhgg zzhggVarZzd;
        zzgyx zzgyxVar = new zzgyx();
        for (int i7 = 0; i7 < zzgxrVar.zzd(); i7++) {
            zzgqm zzgqmVarZze = ((zzgqo) zzgxrVar).zze(i7);
            if (zzgqmVarZze.zzb().equals(zzgqf.zza)) {
                zzgqd zzgqdVarZza = zzgqmVarZze.zza();
                if (zzgqdVarZza instanceof zzgrf) {
                    zzhggVarZzd = ((zzgrf) zzgqdVarZza).zzb();
                } else {
                    if (!(zzgqdVarZza instanceof zzgxv)) {
                        String name = zzgqdVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzgqdVarZza.zza());
                        StringBuilder sb = new StringBuilder(name.length() + 59 + strValueOf.length());
                        sb.append("Cannot get output prefix for key of class ");
                        sb.append(name);
                        sb.append(" with parameters ");
                        sb.append(strValueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    zzhggVarZzd = ((zzgxv) zzgqdVarZza).zzd();
                }
                zzgyxVar.zza(zzhggVarZzd, new zzgrh((zzgpx) zzgzhVar.zza(zzgqmVarZze), zzgqmVarZze.zzc()));
            }
        }
        if (zzgxyVar.zza()) {
            zzgxzVar = zzgyc.zza;
            zzgxzVarZza = zzgxzVar;
        } else {
            zzgya zzgyaVarZzb = zzgyj.zza().zzb();
            zzgxz zzgxzVarZza2 = zzgyaVarZzb.zza(zzgxrVar, zzgxyVar, "aead", "encrypt");
            zzgxzVarZza = zzgyaVarZzb.zza(zzgxrVar, zzgxyVar, "aead", "decrypt");
            zzgxzVar = zzgxzVarZza2;
        }
        zzgqo zzgqoVar = (zzgqo) zzgxrVar;
        return new zzgrj(new zzgrh((zzgpx) zzgzhVar.zza(zzgqoVar.zzc()), zzgqoVar.zzc().zzc()), zzgyxVar.zzb(), zzgxzVar, zzgxzVarZza, null);
    }
}
