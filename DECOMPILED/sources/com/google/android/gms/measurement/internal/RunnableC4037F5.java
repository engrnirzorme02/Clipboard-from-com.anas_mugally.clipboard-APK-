package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.F5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4037F5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f15216a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4098N5 f15217b;

    RunnableC4037F5(C4098N5 c4098n5, long j7) {
        this.f15216a = j7;
        Objects.requireNonNull(c4098n5);
        this.f15217b = c4098n5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15217b.m18568s(this.f15216a);
    }
}
