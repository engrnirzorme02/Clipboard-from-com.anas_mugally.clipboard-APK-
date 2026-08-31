package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.H5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4053H5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final long f15246a;

    /* JADX INFO: renamed from: b */
    final long f15247b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4061I5 f15248c;

    RunnableC4053H5(C4061I5 c4061i5, long j7, long j8) {
        Objects.requireNonNull(c4061i5);
        this.f15248c = c4061i5;
        this.f15246a = j7;
        this.f15247b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15248c.f15258b.f15066a.mo18422b().m18639t(new Runnable() { // from class: com.google.android.gms.measurement.internal.G5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                RunnableC4053H5 runnableC4053H5 = this.f15239a;
                C4098N5 c4098n5 = runnableC4053H5.f15248c.f15258b;
                c4098n5.mo18427h();
                C4164X2 c4164x2 = c4098n5.f15066a;
                c4164x2.mo18421a().m18858v().m18834a("Application going to the background");
                c4164x2.m18687x().f15186t.m19334b(true);
                c4098n5.m18564o(true);
                if (!c4164x2.m18686w().m18806N()) {
                    long j7 = runnableC4053H5.f15247b;
                    C4084L5 c4084l5 = c4098n5.f15335f;
                    c4084l5.m18540d(false, false, j7);
                    c4084l5.m18538b(j7);
                }
                c4164x2.mo18421a().m18857u().m18835b("Application backgrounded at: timestamp_millis", Long.valueOf(runnableC4053H5.f15246a));
                C4164X2 c4164x3 = c4098n5.f15066a;
                C4371x4 c4371x4M18660B = c4164x3.m18660B();
                c4371x4M18660B.mo18427h();
                C4164X2 c4164x4 = c4371x4M18660B.f15066a;
                c4371x4M18660B.m18748j();
                C4364w5 c4364w5M18668J = c4164x4.m18668J();
                c4364w5M18668J.mo18427h();
                c4364w5M18668J.m18748j();
                if (!c4364w5M18668J.m19245y() || c4364w5M18668J.f15066a.m18661C().m19386W() >= 242600) {
                    c4164x4.m18668J().m19240t();
                }
                if (c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15625O0)) {
                    long jM18796D = c4164x2.m18661C().m19380P(c4164x2.mo18424e().getPackageName(), c4164x2.m18686w().m18810R()) ? 1000L : c4164x2.m18686w().m18796D(c4164x2.mo18424e().getPackageName(), AbstractC4209d2.f15604E);
                    c4164x2.mo18421a().m18859w().m18835b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jM18796D));
                    c4164x3.m18672N().m18465o(jM18796D);
                }
            }
        });
    }
}
