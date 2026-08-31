package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4227f4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15746a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15747b;

    RunnableC4227f4(C4371x4 c4371x4, AtomicReference atomicReference) {
        this.f15746a = atomicReference;
        Objects.requireNonNull(c4371x4);
        this.f15747b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f15746a;
        synchronized (atomicReference) {
            try {
                try {
                    C4371x4 c4371x4 = this.f15747b;
                    atomicReference.set(Double.valueOf(c4371x4.f15066a.m18686w().m18799G(c4371x4.f15066a.m18670L().m18754q(), AbstractC4209d2.f15664f0)));
                    this.f15746a.notify();
                } catch (Throwable th) {
                    this.f15746a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
