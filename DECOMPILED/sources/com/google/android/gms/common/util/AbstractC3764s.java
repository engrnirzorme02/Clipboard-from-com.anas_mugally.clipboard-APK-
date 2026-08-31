package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.common.util.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3764s {
    /* JADX INFO: renamed from: a */
    public static void m18207a(Context context, SharedPreferences.Editor editor, String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
