package com.google.android.gms.ads.internal.util;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3465c {
    /* JADX INFO: renamed from: a */
    public static boolean m17517a(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                return true;
            }
        }
        return false;
    }
}
