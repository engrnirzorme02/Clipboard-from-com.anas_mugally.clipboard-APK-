package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhbt implements zzgqr {
    private zzhbt(zzgqr zzgqrVar, zzhep zzhepVar, byte[] bArr) {
    }

    public static zzgqr zza(zzgxv zzgxvVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzgzj zzgzjVarZzc = zzgxvVar.zzc(zzgqc.zza());
        zzgqr zzgqrVar = (zzgqr) zzgxk.zza().zzc(zzgzjVarZzc.zzg(), zzgqr.class).zza(zzgzjVarZzc.zzb());
        zzhep zzhepVarZzd = zzgzjVarZzc.zzd();
        int iOrdinal = zzhepVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzgyp.zzb(zzgxvVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzgyp.zza(zzgxvVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = zzgyp.zza(zzgxvVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzgyp.zza.zzc();
        }
        return new zzhbt(zzgqrVar, zzhepVarZzd, bArrZzc);
    }
}
