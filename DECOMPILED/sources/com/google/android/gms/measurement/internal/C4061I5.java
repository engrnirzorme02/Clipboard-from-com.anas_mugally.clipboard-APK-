package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.I5 */
/* JADX INFO: loaded from: classes2.dex */
final class C4061I5 {

    /* JADX INFO: renamed from: a */
    private RunnableC4053H5 f15257a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4098N5 f15258b;

    C4061I5(C4098N5 c4098n5) {
        Objects.requireNonNull(c4098n5);
        this.f15258b = c4098n5;
    }

    /* JADX INFO: renamed from: a */
    final void m18530a() {
        C4098N5 c4098n5 = this.f15258b;
        c4098n5.mo18427h();
        RunnableC4053H5 runnableC4053H5 = this.f15257a;
        if (runnableC4053H5 != null) {
            c4098n5.m18569t().removeCallbacks(runnableC4053H5);
        }
        C4164X2 c4164x2 = c4098n5.f15066a;
        c4164x2.m18687x().f15186t.m19334b(false);
        c4098n5.m18564o(false);
        if (c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15637U0)) {
            C4164X2 c4164x3 = c4098n5.f15066a;
            if (c4164x3.m18660B().m19308v0()) {
                c4164x2.mo18421a().m18859w().m18834a("Retrying trigger URI registration in foreground");
                c4164x3.m18660B().m19312x0();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final void m18531b(long j7) {
        C4098N5 c4098n5 = this.f15258b;
        this.f15257a = new RunnableC4053H5(this, c4098n5.f15066a.mo18425f().mo18159a(), j7);
        c4098n5.m18569t().postDelayed(this.f15257a, 2000L);
    }
}
