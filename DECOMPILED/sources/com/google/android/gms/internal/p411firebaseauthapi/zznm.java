package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zznm {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i7 = 2; i7 < 10; i7 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i8 = 2; i8 < 20; i8 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i9 = 2; i9 < 10; i9 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i10 = 2; i10 < 50; i10 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i11 = 2; i11 < 100; i11 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i12 = 2; i12 < 50; i12 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j7 = jArr2[0];
        long j8 = jArr3[1] * j7;
        long j9 = jArr2[1];
        long j10 = jArr3[0];
        jArr[1] = j8 + (j9 * j10);
        long j11 = jArr2[1];
        long j12 = jArr3[1];
        jArr[2] = (j11 * 2 * j12) + (jArr3[2] * j7) + (jArr2[2] * j10);
        long j13 = jArr3[2];
        long j14 = jArr2[2];
        jArr[3] = (j11 * j13) + (j14 * j12) + (jArr3[3] * j7) + (jArr2[3] * j10);
        long j15 = jArr3[3];
        long j16 = jArr2[3];
        jArr[4] = (j14 * j13) + (((j11 * j15) + (j16 * j12)) * 2) + (jArr3[4] * j7) + (jArr2[4] * j10);
        long j17 = jArr3[4];
        long j18 = jArr2[4];
        jArr[5] = (j14 * j15) + (j16 * j13) + (j11 * j17) + (j18 * j12) + (jArr3[5] * j7) + (jArr2[5] * j10);
        long j19 = jArr3[5];
        long j20 = jArr2[5];
        jArr[6] = (((j16 * j15) + (j11 * j19) + (j20 * j12)) * 2) + (j14 * j17) + (j18 * j13) + (jArr3[6] * j7) + (jArr2[6] * j10);
        long j21 = jArr3[6];
        long j22 = jArr2[6];
        jArr[7] = (j16 * j17) + (j18 * j15) + (j14 * j19) + (j20 * j13) + (j11 * j21) + (j22 * j12) + (jArr3[7] * j7) + (jArr2[7] * j10);
        long j23 = jArr3[7];
        long j24 = jArr2[7];
        jArr[8] = (j18 * j17) + (((j16 * j19) + (j20 * j15) + (j11 * j23) + (j24 * j12)) * 2) + (j14 * j21) + (j22 * j13) + (jArr3[8] * j7) + (jArr2[8] * j10);
        long j25 = jArr3[8];
        long j26 = jArr2[8];
        jArr[9] = (j18 * j19) + (j20 * j17) + (j16 * j21) + (j22 * j15) + (j14 * j23) + (j24 * j13) + (j11 * j25) + (j26 * j12) + (j7 * jArr3[9]) + (jArr2[9] * j10);
        long j27 = jArr3[9];
        long j28 = jArr2[9];
        jArr[10] = (((j20 * j19) + (j16 * j23) + (j24 * j15) + (j11 * j27) + (j12 * j28)) * 2) + (j18 * j21) + (j22 * j17) + (j14 * j25) + (j26 * j13);
        jArr[11] = (j20 * j21) + (j22 * j19) + (j18 * j23) + (j24 * j17) + (j16 * j25) + (j26 * j15) + (j14 * j27) + (j13 * j28);
        jArr[12] = (j22 * j21) + (((j20 * j23) + (j24 * j19) + (j16 * j27) + (j15 * j28)) * 2) + (j18 * j25) + (j26 * j17);
        jArr[13] = (j22 * j23) + (j24 * j21) + (j20 * j25) + (j26 * j19) + (j18 * j27) + (j17 * j28);
        jArr[14] = (((j24 * j23) + (j20 * j27) + (j19 * j28)) * 2) + (j22 * j25) + (j26 * j21);
        jArr[15] = (j24 * j25) + (j26 * j23) + (j22 * j27) + (j21 * j28);
        jArr[16] = (j26 * j25) + (((j24 * j27) + (j23 * j28)) * 2);
        jArr[17] = (j26 * j27) + (j25 * j28);
        jArr[18] = j28 * 2 * j27;
    }

    static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] - jArr3[i7];
        }
    }

    static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] + jArr3[i7];
        }
    }

    public static byte[] zzc(long[] jArr) {
        int i7;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                break;
            }
            int i10 = 0;
            while (i10 < 9) {
                long j7 = jArrCopyOf[i10];
                int i11 = zzd[i10 & 1];
                int i12 = -((int) (((j7 >> 31) & j7) >> i11));
                jArrCopyOf[i10] = j7 + ((long) (i12 << i11));
                i10++;
                jArrCopyOf[i10] = jArrCopyOf[i10] - ((long) i12);
            }
            long j8 = jArrCopyOf[9];
            int i13 = -((int) (((j8 >> 31) & j8) >> 25));
            jArrCopyOf[9] = j8 + ((long) (i13 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i13) * 19);
            i9++;
        }
        long j9 = jArrCopyOf[0];
        int i14 = -((int) (((j9 >> 31) & j9) >> 26));
        jArrCopyOf[0] = j9 + ((long) (i14 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i14);
        int i15 = 0;
        while (i15 < 2) {
            int i16 = i8;
            while (i16 < 9) {
                long j10 = jArrCopyOf[i16];
                int i17 = i16 & 1;
                int i18 = i8;
                int i19 = (int) (j10 >> zzd[i17]);
                jArrCopyOf[i16] = j10 & ((long) zzc[i17]);
                i16++;
                jArrCopyOf[i16] = jArrCopyOf[i16] + ((long) i19);
                i8 = i18;
                i15 = i15;
            }
            i15++;
        }
        int i20 = i8;
        long j11 = jArrCopyOf[9];
        jArrCopyOf[9] = j11 & 33554431;
        long j12 = jArrCopyOf[i20] + (((long) ((int) (j11 >> 25))) * 19);
        jArrCopyOf[i20] = j12;
        int i21 = ~((((int) j12) - 67108845) >> 31);
        for (int i22 = 1; i22 < 10; i22++) {
            int i23 = ~(((int) jArrCopyOf[i22]) ^ zzc[i22 & 1]);
            int i24 = i23 & (i23 << 16);
            int i25 = i24 & (i24 << 8);
            int i26 = i25 & (i25 << 4);
            int i27 = i26 & (i26 << 2);
            i21 &= (i27 & (i27 << 1)) >> 31;
        }
        jArrCopyOf[i20] = jArrCopyOf[i20] - ((long) (67108845 & i21));
        long j13 = 33554431 & i21;
        jArrCopyOf[1] = jArrCopyOf[1] - j13;
        for (i7 = 2; i7 < 10; i7 += 2) {
            jArrCopyOf[i7] = jArrCopyOf[i7] - ((long) (67108863 & i21));
            int i28 = i7 + 1;
            jArrCopyOf[i28] = jArrCopyOf[i28] - j13;
        }
        for (int i29 = i20; i29 < 10; i29++) {
            jArrCopyOf[i29] = jArrCopyOf[i29] << zzb[i29];
        }
        byte[] bArr = new byte[32];
        for (int i30 = i20; i30 < 10; i30++) {
            int i31 = zza[i30];
            long j14 = bArr[i31];
            long j15 = jArrCopyOf[i30];
            bArr[i31] = (byte) (j14 | (j15 & 255));
            int i32 = i31 + 1;
            bArr[i32] = (byte) (((long) bArr[i32]) | ((j15 >> 8) & 255));
            int i33 = i31 + 2;
            bArr[i33] = (byte) (((long) bArr[i33]) | ((j15 >> 16) & 255));
            int i34 = i31 + 3;
            bArr[i34] = (byte) (((long) bArr[i34]) | ((j15 >> 24) & 255));
        }
        return bArr;
    }

    static void zzb(long[] jArr) {
        long j7 = jArr[8];
        long j8 = jArr[18];
        long j9 = j7 + (j8 << 4);
        jArr[8] = j9;
        long j10 = j9 + (j8 << 1);
        jArr[8] = j10;
        jArr[8] = j10 + j8;
        long j11 = jArr[7];
        long j12 = jArr[17];
        long j13 = j11 + (j12 << 4);
        jArr[7] = j13;
        long j14 = j13 + (j12 << 1);
        jArr[7] = j14;
        jArr[7] = j14 + j12;
        long j15 = jArr[6];
        long j16 = jArr[16];
        long j17 = j15 + (j16 << 4);
        jArr[6] = j17;
        long j18 = j17 + (j16 << 1);
        jArr[6] = j18;
        jArr[6] = j18 + j16;
        long j19 = jArr[5];
        long j20 = jArr[15];
        long j21 = j19 + (j20 << 4);
        jArr[5] = j21;
        long j22 = j21 + (j20 << 1);
        jArr[5] = j22;
        jArr[5] = j22 + j20;
        long j23 = jArr[4];
        long j24 = jArr[14];
        long j25 = j23 + (j24 << 4);
        jArr[4] = j25;
        long j26 = j25 + (j24 << 1);
        jArr[4] = j26;
        jArr[4] = j26 + j24;
        long j27 = jArr[3];
        long j28 = jArr[13];
        long j29 = j27 + (j28 << 4);
        jArr[3] = j29;
        long j30 = j29 + (j28 << 1);
        jArr[3] = j30;
        jArr[3] = j30 + j28;
        long j31 = jArr[2];
        long j32 = jArr[12];
        long j33 = j31 + (j32 << 4);
        jArr[2] = j33;
        long j34 = j33 + (j32 << 1);
        jArr[2] = j34;
        jArr[2] = j34 + j32;
        long j35 = jArr[1];
        long j36 = jArr[11];
        long j37 = j35 + (j36 << 4);
        jArr[1] = j37;
        long j38 = j37 + (j36 << 1);
        jArr[1] = j38;
        jArr[1] = j38 + j36;
        long j39 = jArr[0];
        long j40 = jArr[10];
        long j41 = j39 + (j40 << 4);
        jArr[0] = j41;
        long j42 = j41 + (j40 << 1);
        jArr[0] = j42;
        jArr[0] = j42 + j40;
    }

    static void zzb(long[] jArr, long[] jArr2) {
        long j7 = jArr2[0];
        long j8 = jArr2[1];
        long j9 = jArr2[2];
        long j10 = jArr2[3];
        long j11 = jArr2[4];
        long j12 = jArr2[5];
        long j13 = jArr2[6];
        long j14 = jArr2[7];
        long j15 = jArr2[8];
        long j16 = jArr2[9];
        zze(new long[]{j7 * j7, j7 * 2 * j8, ((j8 * j8) + (j7 * j9)) * 2, ((j8 * j9) + (j7 * j10)) * 2, (j9 * j9) + (j8 * 4 * j10) + (j7 * 2 * j11), ((j9 * j10) + (j8 * j11) + (j7 * j12)) * 2, ((j10 * j10) + (j9 * j11) + (j7 * j13) + (j8 * 2 * j12)) * 2, ((j10 * j11) + (j9 * j12) + (j8 * j13) + (j7 * j14)) * 2, (j11 * j11) + (((j9 * j13) + (j7 * j15) + (((j8 * j14) + (j10 * j12)) * 2)) * 2), ((j11 * j12) + (j10 * j13) + (j9 * j14) + (j8 * j15) + (j7 * j16)) * 2, ((j12 * j12) + (j11 * j13) + (j9 * j15) + (((j10 * j14) + (j8 * j16)) * 2)) * 2, ((j12 * j13) + (j11 * j14) + (j10 * j15) + (j9 * j16)) * 2, (j13 * j13) + (((j11 * j15) + (((j12 * j14) + (j10 * j16)) * 2)) * 2), ((j13 * j14) + (j12 * j15) + (j11 * j16)) * 2, ((j14 * j14) + (j13 * j15) + (j12 * 2 * j16)) * 2, ((j14 * j15) + (j13 * j16)) * 2, (j15 * j15) + (j14 * 4 * j16), j15 * 2 * j16, 2 * j16 * j16}, jArr);
    }

    static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    static void zza(long[] jArr) {
        jArr[10] = 0;
        int i7 = 0;
        while (i7 < 10) {
            long j7 = jArr[i7];
            long j8 = j7 / 67108864;
            jArr[i7] = j7 - (j8 << 26);
            int i8 = i7 + 1;
            long j9 = jArr[i8] + j8;
            jArr[i8] = j9;
            long j10 = j9 / 33554432;
            jArr[i8] = j9 - (j10 << 25);
            i7 += 2;
            jArr[i7] = jArr[i7] + j10;
        }
        long j11 = jArr[0];
        long j12 = jArr[10];
        long j13 = j11 + (j12 << 4);
        jArr[0] = j13;
        long j14 = j13 + (j12 << 1);
        jArr[0] = j14;
        long j15 = j14 + j12;
        jArr[0] = j15;
        jArr[10] = 0;
        long j16 = j15 / 67108864;
        jArr[0] = j15 - (j16 << 26);
        jArr[1] = jArr[1] + j16;
    }

    static void zza(long[] jArr, long[] jArr2, long j7) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] * j7;
        }
    }

    static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i7 = 0; i7 < 10; i7++) {
            int i8 = zza[i7];
            jArr[i7] = ((((((long) (bArr[i8] & 255)) | (((long) (bArr[i8 + 1] & 255)) << 8)) | (((long) (bArr[i8 + 2] & 255)) << 16)) | (((long) (bArr[i8 + 3] & 255)) << 24)) >> zzb[i7]) & ((long) zzc[i7 & 1]);
        }
        return jArr;
    }
}
