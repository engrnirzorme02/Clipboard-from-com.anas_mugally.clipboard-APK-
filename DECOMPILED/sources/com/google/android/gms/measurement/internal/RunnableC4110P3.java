package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.P3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4110P3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f15363a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15364b;

    RunnableC4110P3(C4371x4 c4371x4, long j7) {
        this.f15363a = j7;
        Objects.requireNonNull(c4371x4);
        this.f15364b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4164X2 c4164x2 = this.f15364b.f15066a;
        C4002B2 c4002b2 = c4164x2.m18687x().f15178l;
        long j7 = this.f15363a;
        c4002b2.m18434b(j7);
        c4164x2.mo18421a().m18858v().m18835b("Session timeout duration set", Long.valueOf(j7));
    }
}
