package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4251i4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4027E3 f15824a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f15825b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean f15826c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4371x4 f15827d;

    RunnableC4251i4(C4371x4 c4371x4, C4027E3 c4027e3, long j7, boolean z7) {
        this.f15824a = c4027e3;
        this.f15825b = j7;
        this.f15826c = z7;
        Objects.requireNonNull(c4371x4);
        this.f15827d = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4371x4 c4371x4 = this.f15827d;
        C4027E3 c4027e3 = this.f15824a;
        c4371x4.m19293o(c4027e3);
        c4371x4.m19279X(c4027e3, this.f15825b, true, this.f15826c);
    }
}
