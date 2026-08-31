package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p170W2.C1846k;
import p227d3.C5228d;

/* JADX INFO: renamed from: com.google.android.gms.common.util.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3766u {
    /* JADX INFO: renamed from: a */
    public static boolean m18210a(Context context, int i7) {
        if (!m18211b(context, i7, "com.google.android.gms")) {
            return false;
        }
        try {
            return C1846k.m7641a(context).m7645b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18211b(Context context, int i7, String str) {
        return C5228d.m24155a(context).m24154h(i7, str);
    }
}
