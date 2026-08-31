package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.T3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4137T3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15432a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15433b;

    RunnableC4137T3(C4371x4 c4371x4, AtomicReference atomicReference) {
        this.f15432a = atomicReference;
        Objects.requireNonNull(c4371x4);
        this.f15433b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f15432a;
        synchronized (atomicReference) {
            try {
                try {
                    C4371x4 c4371x4 = this.f15433b;
                    atomicReference.set(Boolean.valueOf(c4371x4.f15066a.m18686w().m18800H(c4371x4.f15066a.m18670L().m18754q(), AbstractC4209d2.f15652b0)));
                    this.f15432a.notify();
                } catch (Throwable th) {
                    this.f15432a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
