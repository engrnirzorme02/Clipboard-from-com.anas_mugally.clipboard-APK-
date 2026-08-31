package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b0 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4191b0 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f15553a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4008C0 f15554b;

    RunnableC4191b0(C4008C0 c4008c0, long j7) {
        this.f15553a = j7;
        Objects.requireNonNull(c4008c0);
        this.f15554b = c4008c0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15554b.m18451n(this.f15553a);
    }
}
