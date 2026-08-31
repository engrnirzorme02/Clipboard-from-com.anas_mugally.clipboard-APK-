package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class zzre implements zzqj {
    protected zzre(zzrd zzrdVar) {
    }

    protected static int zza(int i7, int i8, int i9) {
        return zzgne.zza(((((long) i7) * ((long) i8)) * ((long) i9)) / 1000000);
    }

    protected static final int zzb(int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = 250000;
        if (i9 == 0) {
            int iZza = zza(250000, i11, i10);
            int iZza2 = zza(750000, i11, i10);
            String str = zzeo.zza;
            return Math.max(iZza, Math.min(i7 * 4, iZza2));
        }
        if (i9 == 1) {
            return zzgne.zza((((long) zzc(i8)) * 50000000) / 1000000);
        }
        if (i8 == 5) {
            i13 = 500000;
        } else if (i8 == 8) {
            i13 = 1000000;
            i8 = 8;
        }
        return zzgne.zza((((long) i13) * ((long) (i12 != -1 ? zzgmx.zzb(i12, 8, RoundingMode.CEILING) : zzc(i8)))) / 1000000);
    }

    private static int zzc(int i7) {
        int iZzf = zzacy.zzf(i7);
        zzghc.zzh(iZzf != -2147483647);
        return iZzf;
    }
}
