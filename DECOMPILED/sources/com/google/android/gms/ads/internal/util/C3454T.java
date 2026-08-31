package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.ads.zzfro;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.T */
/* JADX INFO: loaded from: classes.dex */
public final class C3454T {

    /* JADX INFO: renamed from: a */
    private HandlerThread f14211a = null;

    /* JADX INFO: renamed from: b */
    private Handler f14212b = null;

    /* JADX INFO: renamed from: c */
    private int f14213c = 0;

    /* JADX INFO: renamed from: d */
    private final Object f14214d = new Object();

    /* JADX INFO: renamed from: a */
    public final Looper m17489a() {
        Looper looper;
        Object obj = this.f14214d;
        synchronized (obj) {
            try {
                if (this.f14213c != 0) {
                    AbstractC3718s.m18084m(this.f14211a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f14211a == null) {
                    AbstractC3490o0.m17545k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f14211a = handlerThread;
                    handlerThread.start();
                    this.f14212b = new zzfro(this.f14211a.getLooper());
                    AbstractC3490o0.m17545k("Looper thread started.");
                } else {
                    AbstractC3490o0.m17545k("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f14213c++;
                looper = this.f14211a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    /* JADX INFO: renamed from: b */
    public final Handler m17490b() {
        return this.f14212b;
    }
}
