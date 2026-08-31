package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwk {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzc = zzc(bArr, 0, 0);
        long jZzc2 = zzc(bArr, 3, 2) & 67108611;
        long jZzc3 = zzc(bArr, 6, 4) & 67092735;
        long jZzc4 = zzc(bArr, 9, 6) & 66076671;
        long jZzc5 = zzc(bArr, 12, 8) & 1048575;
        int i7 = 17;
        byte[] bArr3 = new byte[17];
        long j7 = 0;
        int i8 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            int length = bArr2.length;
            if (i8 >= length) {
                long j12 = j7 + (j8 >> 26);
                long j13 = j12 & 67108863;
                long j14 = j9 + (j12 >> 26);
                long j15 = j14 & 67108863;
                long j16 = j10 + (j14 >> 26);
                long j17 = j16 & 67108863;
                long j18 = j11 + ((j16 >> 26) * 5);
                long j19 = j18 & 67108863;
                long j20 = j19 + 5;
                long j21 = (j8 & 67108863) + (j18 >> 26);
                long j22 = j21 + (j20 >> 26);
                long j23 = (j22 >> 26) + j13;
                long j24 = j15 + (j23 >> 26);
                long j25 = (j17 + (j24 >> 26)) - 67108864;
                long j26 = j25 >> 63;
                long j27 = ~j26;
                long j28 = (j21 & j26) | (j22 & 67108863 & j27);
                long j29 = (j13 & j26) | (j23 & 67108863 & j27);
                long j30 = (j15 & j26) | (j24 & 67108863 & j27);
                long j31 = (j17 & j26) | (j25 & j27);
                long jZzb = (((j26 & j19) | (j20 & 67108863 & j27) | (j28 << 26)) & 4294967295L) + zzb(bArr, 16);
                long jZzb2 = (((j28 >> 6) | (j29 << 20)) & 4294967295L) + zzb(bArr, 20);
                long jZzb3 = (((j29 >> 12) | (j30 << 14)) & 4294967295L) + zzb(bArr, 24);
                long jZzb4 = (((j30 >> 18) | (j31 << 8)) & 4294967295L) + zzb(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzb & 4294967295L, 0);
                long j32 = jZzb2 + (jZzb >> 32);
                zzd(bArr4, j32 & 4294967295L, 4);
                long j33 = jZzb3 + (j32 >> 32);
                zzd(bArr4, j33 & 4294967295L, 8);
                zzd(bArr4, (jZzb4 + (j33 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i8);
            System.arraycopy(bArr2, i8, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i7, (byte) 0);
            }
            long j34 = jZzc5 * 5;
            long j35 = jZzc4 * 5;
            long j36 = jZzc3 * 5;
            long jZzc6 = j11 + zzc(bArr3, 0, 0);
            long jZzc7 = j8 + zzc(bArr3, 3, 2);
            long jZzc8 = j7 + zzc(bArr3, 6, 4);
            long jZzc9 = j9 + zzc(bArr3, 9, 6);
            long jZzc10 = j10 + (zzc(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j37 = jZzc7 * jZzc;
            long j38 = jZzc7 * jZzc2;
            long j39 = jZzc7 * jZzc3;
            long j40 = jZzc9 * jZzc;
            long j41 = jZzc7 * jZzc4;
            long j42 = jZzc10 * jZzc;
            long j43 = (jZzc6 * jZzc) + (jZzc7 * j34) + (jZzc8 * j35) + (jZzc9 * j36) + (jZzc2 * 5 * jZzc10);
            long j44 = (jZzc6 * jZzc2) + j37 + (jZzc8 * j34) + (jZzc9 * j35) + (j36 * jZzc10) + (j43 >> 26);
            long j45 = (jZzc6 * jZzc3) + j38 + (jZzc8 * jZzc) + (jZzc9 * j34) + (j35 * jZzc10) + (j44 >> 26);
            long j46 = (jZzc6 * jZzc4) + j39 + (jZzc8 * jZzc2) + j40 + (jZzc10 * j34) + (j45 >> 26);
            long j47 = (jZzc6 * jZzc5) + j41 + (jZzc8 * jZzc3) + (jZzc9 * jZzc2) + j42 + (j46 >> 26);
            long j48 = (j43 & 67108863) + ((j47 >> 26) * 5);
            j8 = (j44 & 67108863) + (j48 >> 26);
            i8 += 16;
            j7 = j45 & 67108863;
            j9 = j46 & 67108863;
            j10 = j47 & 67108863;
            i7 = 17;
            j11 = j48 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((long) (((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16))) & 4294967295L;
    }

    private static long zzc(byte[] bArr, int i7, int i8) {
        return (zzb(bArr, i7) >> i8) & 67108863;
    }

    private static void zzd(byte[] bArr, long j7, int i7) {
        for (int i8 = 0; i8 < 4; i8++) {
            bArr[i7 + i8] = (byte) (255 & j7);
            j7 >>= 8;
        }
    }
}
