package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p170W2.AbstractC1845j;

/* JADX INFO: renamed from: com.google.android.gms.common.util.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3754i {

    /* JADX INFO: renamed from: a */
    private static Boolean f14898a;

    /* JADX INFO: renamed from: b */
    private static Boolean f14899b;

    /* JADX INFO: renamed from: c */
    private static Boolean f14900c;

    /* JADX INFO: renamed from: d */
    private static Boolean f14901d;

    /* JADX INFO: renamed from: e */
    private static Boolean f14902e;

    /* JADX INFO: renamed from: f */
    private static Boolean f14903f;

    /* JADX INFO: renamed from: a */
    public static boolean m18172a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f14902e == null) {
            boolean z7 = false;
            if (AbstractC3760o.m18199g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z7 = true;
            }
            f14902e = Boolean.valueOf(z7);
        }
        return f14902e.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18173b(Context context) {
        if (f14903f == null) {
            boolean z7 = false;
            if (AbstractC3760o.m18202j() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z7 = true;
            }
            f14903f = Boolean.valueOf(z7);
        }
        return f14903f.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18174c(Context context) {
        if (f14900c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z7 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z7 = true;
            }
            f14900c = Boolean.valueOf(z7);
        }
        return f14900c.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m18175d(Context context) {
        return m18179h(context);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18176e() {
        int i7 = AbstractC1845j.f5992a;
        return "user".equals(Build.TYPE);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18177f(Context context) {
        return m18181j(context.getPackageManager());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18178g(Context context) {
        if (m18177f(context) && !AbstractC3760o.m18198f()) {
            return true;
        }
        if (m18179h(context)) {
            return !AbstractC3760o.m18199g() || AbstractC3760o.m18202j();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m18179h(Context context) {
        if (f14899b == null) {
            f14899b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f14899b.booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m18180i(Context context) {
        if (f14901d == null) {
            boolean z7 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z7 = false;
            }
            f14901d = Boolean.valueOf(z7);
        }
        return f14901d.booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m18181j(PackageManager packageManager) {
        if (f14898a == null) {
            f14898a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f14898a.booleanValue();
    }
}
