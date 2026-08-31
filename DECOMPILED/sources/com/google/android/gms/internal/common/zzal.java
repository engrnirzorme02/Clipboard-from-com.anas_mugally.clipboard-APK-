package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public final class zzal {
    static Object[] zza(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (objArr[i8] == null) {
                throw new NullPointerException("at index " + i8);
            }
        }
        return objArr;
    }
}
