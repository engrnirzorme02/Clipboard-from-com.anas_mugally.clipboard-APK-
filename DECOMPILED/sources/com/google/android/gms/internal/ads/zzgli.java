package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgli {
    static Object[] zza(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            zzb(objArr[i8], i8);
        }
        return objArr;
    }

    static Object zzb(Object obj, int i7) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 9);
        sb.append("at index ");
        sb.append(i7);
        throw new NullPointerException(sb.toString());
    }
}
