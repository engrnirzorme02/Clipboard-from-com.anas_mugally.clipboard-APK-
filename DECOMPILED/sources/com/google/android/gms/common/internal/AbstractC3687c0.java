package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p227d3.C5228d;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3687c0 {

    /* JADX INFO: renamed from: a */
    private static final Object f14744a = new Object();

    /* JADX INFO: renamed from: b */
    private static boolean f14745b;

    /* JADX INFO: renamed from: c */
    private static String f14746c;

    /* JADX INFO: renamed from: d */
    private static int f14747d;

    /* JADX INFO: renamed from: a */
    public static int m18002a(Context context) {
        m18003b(context);
        return f14747d;
    }

    /* JADX INFO: renamed from: b */
    private static void m18003b(Context context) {
        synchronized (f14744a) {
            try {
                if (f14745b) {
                    return;
                }
                f14745b = true;
                try {
                    Bundle bundle = C5228d.m24155a(context).m24149c(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f14746c = bundle.getString("com.google.app.id");
                    f14747d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
