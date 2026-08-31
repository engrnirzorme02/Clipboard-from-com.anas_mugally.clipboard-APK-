package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgnh {
    public static long[] zza(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i7 = (int) length;
        zzghc.zze(length == ((long) i7), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i7];
        int i8 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i8, length2);
            i8 += length2;
        }
        return jArr3;
    }
}
