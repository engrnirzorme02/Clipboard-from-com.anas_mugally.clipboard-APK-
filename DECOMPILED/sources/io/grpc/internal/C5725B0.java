package io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p122P3.C1212p;

/* JADX INFO: renamed from: io.grpc.internal.B0 */
/* JADX INFO: loaded from: classes.dex */
final class C5725B0 {

    /* JADX INFO: renamed from: a */
    private final ScheduledExecutorService f21953a;

    /* JADX INFO: renamed from: b */
    private final Executor f21954b;

    /* JADX INFO: renamed from: c */
    private final Runnable f21955c;

    /* JADX INFO: renamed from: d */
    private final C1212p f21956d;

    /* JADX INFO: renamed from: e */
    private long f21957e;

    /* JADX INFO: renamed from: f */
    private boolean f21958f;

    /* JADX INFO: renamed from: g */
    private ScheduledFuture f21959g;

    /* JADX INFO: renamed from: io.grpc.internal.B0$b */
    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C5725B0.this.f21958f) {
                C5725B0.this.f21959g = null;
                return;
            }
            long jM25449j = C5725B0.this.m25449j();
            if (C5725B0.this.f21957e - jM25449j > 0) {
                C5725B0 c5725b0 = C5725B0.this;
                c5725b0.f21959g = c5725b0.f21953a.schedule(new c(), C5725B0.this.f21957e - jM25449j, TimeUnit.NANOSECONDS);
            } else {
                C5725B0.this.f21958f = false;
                C5725B0.this.f21959g = null;
                C5725B0.this.f21955c.run();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.B0$c */
    private final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5725B0.this.f21954b.execute(new b());
        }
    }

    C5725B0(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, C1212p c1212p) {
        this.f21955c = runnable;
        this.f21954b = executor;
        this.f21953a = scheduledExecutorService;
        this.f21956d = c1212p;
        c1212p.m5322g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public long m25449j() {
        return this.f21956d.m5320d(TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: i */
    void m25450i(boolean z7) {
        ScheduledFuture scheduledFuture;
        this.f21958f = false;
        if (!z7 || (scheduledFuture = this.f21959g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f21959g = null;
    }

    /* JADX INFO: renamed from: k */
    void m25451k(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        long jM25449j = m25449j() + nanos;
        this.f21958f = true;
        if (jM25449j - this.f21957e < 0 || this.f21959g == null) {
            ScheduledFuture scheduledFuture = this.f21959g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f21959g = this.f21953a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f21957e = jM25449j;
    }
}
