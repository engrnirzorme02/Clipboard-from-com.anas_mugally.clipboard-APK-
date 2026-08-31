package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: com.google.android.gms.common.util.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3752g {

    /* JADX INFO: renamed from: a */
    private static final String[] f14896a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* JADX INFO: renamed from: a */
    public static boolean m18170a(Context context, Throwable th) {
        try {
            AbstractC3718s.m18083l(context);
            AbstractC3718s.m18083l(th);
            return false;
        } catch (Exception e7) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e7);
            return false;
        }
    }
}
