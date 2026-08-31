package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.V3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4151V3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f15451a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15452b;

    RunnableC4151V3(C4371x4 c4371x4, long j7) {
        this.f15451a = j7;
        Objects.requireNonNull(c4371x4);
        this.f15452b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4371x4 c4371x4 = this.f15452b;
        c4371x4.mo18427h();
        c4371x4.m18748j();
        C4164X2 c4164x2 = c4371x4.f15066a;
        c4164x2.mo18421a().m18858v().m18834a("Resetting analytics data (FE)");
        C4164X2 c4164x3 = c4371x4.f15066a;
        C4098N5 c4098n5M18689z = c4164x3.m18689z();
        c4098n5M18689z.mo18427h();
        c4098n5M18689z.f15335f.m18539c();
        c4164x3.m18670L().m18753p();
        boolean z7 = !c4371x4.f15066a.m18675g();
        C4026E2 c4026e2M18687x = c4164x2.m18687x();
        c4026e2M18687x.f15172f.m18434b(this.f15451a);
        C4164X2 c4164x4 = c4026e2M18687x.f15066a;
        if (!TextUtils.isEmpty(c4164x4.m18687x().f15189w.m18459a())) {
            c4026e2M18687x.f15189w.m18460b(null);
        }
        c4026e2M18687x.f15183q.m18434b(0L);
        c4026e2M18687x.f15184r.m18434b(0L);
        if (!c4164x4.m18686w().m18804L()) {
            c4026e2M18687x.m18497y(z7);
        }
        c4026e2M18687x.f15190x.m18460b(null);
        c4026e2M18687x.f15191y.m18434b(0L);
        c4026e2M18687x.f15192z.m18420b(null);
        c4164x3.m18668J().m19236p();
        c4164x3.m18689z().f15334e.m18560a();
        c4371x4.f16220s = z7;
        c4164x3.m18668J().m19237q(new AtomicReference());
    }
}
