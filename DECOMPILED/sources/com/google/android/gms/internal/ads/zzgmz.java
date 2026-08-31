package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgmz {
    public static long zza(long j7, long j8, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j9 = j7 / j8;
        long j10 = j7 - (j8 * j9);
        if (j10 == 0) {
            return j9;
        }
        int i7 = ((int) ((j7 ^ j8) >> 63)) | 1;
        switch (zzgmy.zza[roundingMode.ordinal()]) {
            case 1:
                zzgna.zzb(false);
                return j9;
            case 2:
                return j9;
            case 3:
                if (i7 >= 0) {
                    return j9;
                }
                break;
            case 4:
                break;
            case 5:
                if (i7 <= 0) {
                    return j9;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j10);
                long jAbs2 = jAbs - (Math.abs(j8) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j9) == 0)) {
                        return j9;
                    }
                } else if (jAbs2 <= 0) {
                    return j9;
                }
            default:
                throw new AssertionError();
        }
        return j9 + ((long) i7);
    }

    public static long zzb(long j7, long j8) {
        zzgna.zza("a", j7);
        zzgna.zza("b", j8);
        if (j7 == 0) {
            return j8;
        }
        if (j8 == 0) {
            return j7;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j7);
        long jNumberOfTrailingZeros = j7 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j8);
        long j9 = j8 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j9) {
            long j10 = jNumberOfTrailingZeros - j9;
            long j11 = (j10 >> 63) & j10;
            long j12 = (j10 - j11) - j11;
            jNumberOfTrailingZeros = j12 >> Long.numberOfTrailingZeros(j12);
            j9 += j11;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long zzc(long j7, long j8) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j7) + Long.numberOfLeadingZeros(~j7) + Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j8);
        if (iNumberOfLeadingZeros > 65) {
            return j7 * j8;
        }
        long j9 = j7 ^ j8;
        long j10 = (j9 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j8 == Long.MIN_VALUE) & (j7 < 0)))) {
            long j11 = j7 * j8;
            if (j7 == 0 || j11 / j7 == j8) {
                return j11;
            }
        }
        return j10;
    }
}
