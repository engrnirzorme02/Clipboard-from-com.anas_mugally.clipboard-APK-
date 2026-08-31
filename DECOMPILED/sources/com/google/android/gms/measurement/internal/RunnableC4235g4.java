package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4235g4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Boolean f15780a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15781b;

    RunnableC4235g4(C4371x4 c4371x4, Boolean bool) {
        this.f15780a = bool;
        Objects.requireNonNull(c4371x4);
        this.f15781b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15781b.m19278W(this.f15780a, true);
    }
}
