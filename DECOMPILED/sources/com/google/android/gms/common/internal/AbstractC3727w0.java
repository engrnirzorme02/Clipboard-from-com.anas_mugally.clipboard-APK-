package com.google.android.gms.common.internal;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.w0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3727w0 {

    /* JADX INFO: renamed from: a */
    private static final Uri f14860a;

    /* JADX INFO: renamed from: b */
    private static final Uri f14861b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f14862c = 0;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f14860a = uri;
        f14861b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
