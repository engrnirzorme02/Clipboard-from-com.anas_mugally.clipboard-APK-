package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4211d4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15714a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15715b;

    RunnableC4211d4(C4371x4 c4371x4, AtomicReference atomicReference) {
        this.f15714a = atomicReference;
        Objects.requireNonNull(c4371x4);
        this.f15715b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f15714a;
        synchronized (atomicReference) {
            try {
                try {
                    C4371x4 c4371x4 = this.f15715b;
                    atomicReference.set(Long.valueOf(c4371x4.f15066a.m18686w().m18796D(c4371x4.f15066a.m18670L().m18754q(), AbstractC4209d2.f15658d0)));
                    this.f15714a.notify();
                } catch (Throwable th) {
                    this.f15714a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
