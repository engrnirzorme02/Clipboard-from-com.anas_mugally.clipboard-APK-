package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e6 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4221e6 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4325r6 f15737a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4317q6 f15738b;

    RunnableC4221e6(C4317q6 c4317q6, C4325r6 c4325r6) {
        this.f15737a = c4325r6;
        Objects.requireNonNull(c4317q6);
        this.f15738b = c4317q6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4317q6 c4317q6 = this.f15738b;
        c4317q6.m18949u0(this.f15737a);
        c4317q6.m18889A0();
    }
}
