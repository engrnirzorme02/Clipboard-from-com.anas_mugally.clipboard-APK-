package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.E5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4029E5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f15202a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4098N5 f15203b;

    RunnableC4029E5(C4098N5 c4098n5, long j7) {
        this.f15202a = j7;
        Objects.requireNonNull(c4098n5);
        this.f15203b = c4098n5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15203b.m18567r(this.f15202a);
    }
}
