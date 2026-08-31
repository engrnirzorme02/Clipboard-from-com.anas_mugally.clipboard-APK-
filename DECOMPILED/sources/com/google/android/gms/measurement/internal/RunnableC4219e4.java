package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4219e4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15731a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15732b;

    RunnableC4219e4(C4371x4 c4371x4, AtomicReference atomicReference) {
        this.f15731a = atomicReference;
        Objects.requireNonNull(c4371x4);
        this.f15732b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f15731a;
        synchronized (atomicReference) {
            try {
                try {
                    C4371x4 c4371x4 = this.f15732b;
                    atomicReference.set(Integer.valueOf(c4371x4.f15066a.m18686w().m18797E(c4371x4.f15066a.m18670L().m18754q(), AbstractC4209d2.f15661e0)));
                    this.f15731a.notify();
                } catch (Throwable th) {
                    this.f15731a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
