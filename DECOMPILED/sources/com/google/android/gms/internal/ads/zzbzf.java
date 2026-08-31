package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.HandlerC3492p0;
import java.util.concurrent.Executor;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzbzf implements Executor {
    private final Handler zza = new HandlerC3492p0(Looper.getMainLooper());

    zzbzf() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.zza.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            C7351t.m32349g();
            C3431F0.m17426q(C7351t.m32354l().zzp(), th);
            throw th;
        }
    }
}
