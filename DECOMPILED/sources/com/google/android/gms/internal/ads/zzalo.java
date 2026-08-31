package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalo {
    public static long zza(String str) {
        String str2 = zzeo.zza;
        String[] strArrSplit = str.split("\\.", 2);
        long j7 = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j7 = (j7 * 60) + Long.parseLong(str3);
        }
        long j8 = j7 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j8 += Long.parseLong(strTrim);
        }
        return j8 * 1000;
    }

    public static float zzb(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
