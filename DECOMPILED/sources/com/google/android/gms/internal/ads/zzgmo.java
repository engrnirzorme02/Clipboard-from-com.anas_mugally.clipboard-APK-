package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgmo {
    static {
        new zzgmm();
    }

    public static byte[] zza(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(8192, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i7 = 0;
        while (i7 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i7);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i8 = 0;
            while (i8 < iMin2) {
                int i9 = inputStream.read(bArr, i8, iMin2 - i8);
                if (i9 == -1) {
                    return zzc(arrayDeque, i7);
                }
                i8 += i9;
                i7 += i9;
            }
            iMin = zzgne.zzb(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream zzb(InputStream inputStream, long j7) {
        return new zzgmn(inputStream, j7);
    }

    private static byte[] zzc(Queue queue, int i7) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i7) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i7);
        int i8 = i7 - length;
        while (i8 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i8, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i7 - i8, iMin);
            i8 -= iMin;
        }
        return bArrCopyOf;
    }
}
