package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzic {
    private static long zza(byte[] bArr, int i7, int i8) {
        return (zza(bArr, i7) >> i8) & 67108863;
    }

    private static long zza(byte[] bArr, int i7) {
        return ((long) (((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16))) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j7, int i7) {
        int i8 = 0;
        while (i8 < 4) {
            bArr[i7 + i8] = (byte) (255 & j7);
            i8++;
            j7 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long jZza = zza(bArr, 0, 0) & 67108863;
            long jZza2 = zza(bArr, 3, 2) & 67108611;
            long jZza3 = zza(bArr, 6, 4) & 67092735;
            long jZza4 = zza(bArr, 9, 6) & 66076671;
            long jZza5 = zza(bArr, 12, 8) & 1048575;
            long j7 = jZza2 * 5;
            long j8 = jZza3 * 5;
            long j9 = jZza4 * 5;
            long j10 = jZza5 * 5;
            int i7 = 17;
            byte[] bArr3 = new byte[17];
            long j11 = 0;
            int i8 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            while (i8 < bArr2.length) {
                int iMin = Math.min(16, bArr2.length - i8);
                System.arraycopy(bArr2, i8, bArr3, 0, iMin);
                bArr3[iMin] = 1;
                if (iMin != 16) {
                    Arrays.fill(bArr3, iMin + 1, i7, (byte) 0);
                }
                long jZza6 = j15 + zza(bArr3, 0, 0);
                long jZza7 = j11 + zza(bArr3, 3, 2);
                long jZza8 = j12 + zza(bArr3, 6, 4);
                long jZza9 = j13 + zza(bArr3, 9, 6);
                long jZza10 = j14 + (zza(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
                long j16 = (jZza6 * jZza) + (jZza7 * j10) + (jZza8 * j9) + (jZza9 * j8) + (jZza10 * j7);
                long j17 = (jZza6 * jZza2) + (jZza7 * jZza) + (jZza8 * j10) + (jZza9 * j9) + (jZza10 * j8);
                long j18 = (jZza6 * jZza3) + (jZza7 * jZza2) + (jZza8 * jZza) + (jZza9 * j10) + (jZza10 * j9);
                long j19 = (jZza6 * jZza4) + (jZza7 * jZza3) + (jZza8 * jZza2) + (jZza9 * jZza) + (jZza10 * j10);
                long j20 = j17 + (j16 >> 26);
                long j21 = j18 + (j20 >> 26);
                long j22 = j19 + (j21 >> 26);
                long j23 = (jZza6 * jZza5) + (jZza7 * jZza4) + (jZza8 * jZza3) + (jZza9 * jZza2) + (jZza10 * jZza) + (j22 >> 26);
                long j24 = (j16 & 67108863) + ((j23 >> 26) * 5);
                j11 = (j20 & 67108863) + (j24 >> 26);
                i8 += 16;
                j12 = j21 & 67108863;
                j13 = j22 & 67108863;
                j14 = j23 & 67108863;
                i7 = 17;
                j15 = j24 & 67108863;
            }
            long j25 = j12 + (j11 >> 26);
            long j26 = j25 & 67108863;
            long j27 = j13 + (j25 >> 26);
            long j28 = j27 & 67108863;
            long j29 = j14 + (j27 >> 26);
            long j30 = j29 & 67108863;
            long j31 = j15 + ((j29 >> 26) * 5);
            long j32 = j31 & 67108863;
            long j33 = (j11 & 67108863) + (j31 >> 26);
            long j34 = j32 + 5;
            long j35 = j34 & 67108863;
            long j36 = (j34 >> 26) + j33;
            long j37 = j26 + (j36 >> 26);
            long j38 = j28 + (j37 >> 26);
            long j39 = (j30 + (j38 >> 26)) - 67108864;
            long j40 = j39 >> 63;
            long j41 = ~j40;
            long j42 = (j33 & j40) | (j36 & 67108863 & j41);
            long j43 = (j26 & j40) | (j37 & 67108863 & j41);
            long j44 = (j28 & j40) | (j38 & 67108863 & j41);
            long j45 = ((j42 << 26) | (j32 & j40) | (j35 & j41)) & 4294967295L;
            long j46 = ((j42 >> 6) | (j43 << 20)) & 4294967295L;
            long j47 = ((j43 >> 12) | (j44 << 14)) & 4294967295L;
            long j48 = ((((j39 & j41) | (j30 & j40)) << 8) | (j44 >> 18)) & 4294967295L;
            long jZza11 = j45 + zza(bArr, 16);
            long j49 = jZza11 & 4294967295L;
            long jZza12 = j46 + zza(bArr, 20) + (jZza11 >> 32);
            long jZza13 = j47 + zza(bArr, 24) + (jZza12 >> 32);
            long jZza14 = (j48 + zza(bArr, 28) + (jZza13 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j49, 0);
            zza(bArr4, jZza12 & 4294967295L, 4);
            zza(bArr4, jZza13 & 4294967295L, 8);
            zza(bArr4, jZza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
