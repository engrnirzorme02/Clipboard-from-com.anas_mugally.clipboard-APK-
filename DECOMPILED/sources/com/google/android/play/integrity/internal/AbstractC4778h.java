package com.google.android.play.integrity.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4778h {
    /* JADX INFO: renamed from: a */
    public static Context m21922a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
