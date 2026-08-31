package com.google.android.recaptcha.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzbv implements Executor {
    public static final zzbv zza = new zzbv();

    private zzbv() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
