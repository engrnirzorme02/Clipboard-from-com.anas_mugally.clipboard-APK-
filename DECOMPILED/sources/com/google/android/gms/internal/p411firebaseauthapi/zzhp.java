package com.google.android.gms.internal.p411firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzhp {
    private static final int[] zza = zza(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    private static int zza(int i7, int i8) {
        return (i7 >>> (-i8)) | (i7 << i8);
    }

    static int[] zzb(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        zza(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        zza(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    private static void zza(int[] iArr, int i7, int i8, int i9, int i10) {
        int i11 = iArr[i7] + iArr[i8];
        iArr[i7] = i11;
        int iZza = zza(i11 ^ iArr[i10], 16);
        iArr[i10] = iZza;
        int i12 = iArr[i9] + iZza;
        iArr[i9] = i12;
        int iZza2 = zza(iArr[i8] ^ i12, 12);
        iArr[i8] = iZza2;
        int i13 = iArr[i7] + iZza2;
        iArr[i7] = i13;
        int iZza3 = zza(iArr[i10] ^ i13, 8);
        iArr[i10] = iZza3;
        int i14 = iArr[i9] + iZza3;
        iArr[i9] = i14;
        iArr[i8] = zza(iArr[i8] ^ i14, 7);
    }

    static void zza(int[] iArr, int[] iArr2) {
        int[] iArr3 = zza;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void zza(int[] iArr) {
        for (int i7 = 0; i7 < 10; i7++) {
            zza(iArr, 0, 4, 8, 12);
            zza(iArr, 1, 5, 9, 13);
            zza(iArr, 2, 6, 10, 14);
            zza(iArr, 3, 7, 11, 15);
            zza(iArr, 0, 5, 10, 15);
            zza(iArr, 1, 6, 11, 12);
            zza(iArr, 2, 7, 8, 13);
            zza(iArr, 3, 4, 9, 14);
        }
    }

    static byte[] zza(byte[] bArr, byte[] bArr2) {
        int[] iArrZzb = zzb(zza(bArr), zza(bArr2));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrZzb.length << 2).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb);
        return byteBufferOrder.array();
    }

    static int[] zza(byte[] bArr) {
        if (bArr.length % 4 == 0) {
            IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            int[] iArr = new int[intBufferAsIntBuffer.remaining()];
            intBufferAsIntBuffer.get(iArr);
            return iArr;
        }
        throw new IllegalArgumentException("invalid input length");
    }
}
