package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrw {
    public static final boolean zza;

    static {
        boolean z7 = false;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z7 = true;
            }
        }
        zza = z7;
    }
}
