package com.google.android.recaptcha.internal;

import android.content.Context;
import p170W2.C1841f;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbs {
    private final C1841f zza;

    public zzbs(C1841f c1841f) {
        this.zza = c1841f;
    }

    public final int zza(Context context) {
        int iMo7608g = this.zza.mo7608g(context);
        return (iMo7608g == 1 || iMo7608g == 3 || iMo7608g == 9) ? 4 : 3;
    }

    public zzbs() {
        this.zza = C1841f.m7623f();
    }
}
