package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.internal.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4532h {
    /* JADX INFO: renamed from: a */
    private static String m20706a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20707b() {
        return m20708c() || m20710e();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m20708c() {
        return m20706a().equals("lge");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m20709d() {
        return m20706a().equals("meizu");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m20710e() {
        return m20706a().equals("samsung");
    }
}
