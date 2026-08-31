package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.M3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4089M3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f15308a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15309b;

    RunnableC4089M3(C4371x4 c4371x4, boolean z7) {
        this.f15308a = z7;
        Objects.requireNonNull(c4371x4);
        this.f15309b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4371x4 c4371x4 = this.f15309b;
        C4164X2 c4164x2 = c4371x4.f15066a;
        boolean zM18675g = c4164x2.m18675g();
        boolean zM18674d = c4164x2.m18674d();
        boolean z7 = this.f15308a;
        c4164x2.m18673P(z7);
        if (zM18674d == z7) {
            c4164x2.mo18421a().m18859w().m18835b("Default data collection state already set to", Boolean.valueOf(z7));
        }
        if (c4164x2.m18675g() == zM18675g || c4164x2.m18675g() != c4164x2.m18674d()) {
            c4164x2.mo18421a().m18856t().m18836c("Default data collection is different than actual status", Boolean.valueOf(z7), Boolean.valueOf(zM18675g));
        }
        c4371x4.m19280Y();
    }
}
