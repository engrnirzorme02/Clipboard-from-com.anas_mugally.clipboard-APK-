package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkk {
    public static long zza(long j7, long j8) {
        long j9 = j7 + j8;
        zzkl.zza(((j7 ^ j8) < 0) | ((j7 ^ j9) >= 0), "checkedAdd", j7, j8);
        return j9;
    }

    public static long zzb(long j7, long j8) {
        long j9 = (-1) + j7;
        zzkl.zza(((1 ^ j7) >= 0) | ((j7 ^ j9) >= 0), "checkedSubtract", j7, 1L);
        return j9;
    }
}
