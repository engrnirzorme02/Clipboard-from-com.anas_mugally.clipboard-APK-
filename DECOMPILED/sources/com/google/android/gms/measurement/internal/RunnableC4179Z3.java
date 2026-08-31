package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.Z3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4179Z3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15530a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15531b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15532c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f15533d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4371x4 f15534e;

    RunnableC4179Z3(C4371x4 c4371x4, AtomicReference atomicReference, String str, String str2, String str3, boolean z7) {
        this.f15530a = atomicReference;
        this.f15531b = str2;
        this.f15532c = str3;
        this.f15533d = z7;
        Objects.requireNonNull(c4371x4);
        this.f15534e = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15534e.f15066a.m18668J().m19229g0(this.f15530a, null, this.f15531b, this.f15532c, this.f15533d);
    }
}
