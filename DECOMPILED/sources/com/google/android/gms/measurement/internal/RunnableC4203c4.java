package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4203c4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15584a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15585b;

    RunnableC4203c4(C4371x4 c4371x4, AtomicReference atomicReference) {
        this.f15584a = atomicReference;
        Objects.requireNonNull(c4371x4);
        this.f15585b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f15584a;
        synchronized (atomicReference) {
            try {
                try {
                    C4371x4 c4371x4 = this.f15585b;
                    atomicReference.set(c4371x4.f15066a.m18686w().m18795C(c4371x4.f15066a.m18670L().m18754q(), AbstractC4209d2.f15655c0));
                    this.f15584a.notify();
                } catch (Throwable th) {
                    this.f15584a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
