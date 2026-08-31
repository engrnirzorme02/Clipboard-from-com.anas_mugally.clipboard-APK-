package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgna {
    static long zza(String str, long j7) {
        if (j7 >= 0) {
            return j7;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(j7).length() + 14);
        sb.append(str);
        sb.append(" (");
        sb.append(j7);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    static void zzb(boolean z7) {
        if (!z7) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
