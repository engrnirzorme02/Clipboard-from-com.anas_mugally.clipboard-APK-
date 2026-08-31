package io.grpc.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p063H5.ExecutorC0562p0;

/* JADX INFO: renamed from: io.grpc.internal.l */
/* JADX INFO: loaded from: classes.dex */
final class C5792l implements InterfaceC5731E0 {

    /* JADX INFO: renamed from: f */
    private static final Logger f22727f = Logger.getLogger(C5792l.class.getName());

    /* JADX INFO: renamed from: a */
    private final ScheduledExecutorService f22728a;

    /* JADX INFO: renamed from: b */
    private final ExecutorC0562p0 f22729b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5788j.a f22730c;

    /* JADX INFO: renamed from: d */
    private InterfaceC5788j f22731d;

    /* JADX INFO: renamed from: e */
    private ExecutorC0562p0.d f22732e;

    C5792l(InterfaceC5788j.a aVar, ScheduledExecutorService scheduledExecutorService, ExecutorC0562p0 executorC0562p0) {
        this.f22730c = aVar;
        this.f22728a = scheduledExecutorService;
        this.f22729b = executorC0562p0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m26056b(C5792l c5792l) {
        ExecutorC0562p0.d dVar = c5792l.f22732e;
        if (dVar != null && dVar.m2494b()) {
            c5792l.f22732e.m2493a();
        }
        c5792l.f22731d = null;
    }

    @Override // io.grpc.internal.InterfaceC5731E0
    /* JADX INFO: renamed from: a */
    public void mo25583a(Runnable runnable) {
        this.f22729b.m2492f();
        if (this.f22731d == null) {
            this.f22731d = this.f22730c.get();
        }
        ExecutorC0562p0.d dVar = this.f22732e;
        if (dVar == null || !dVar.m2494b()) {
            long jMo25585a = this.f22731d.mo25585a();
            this.f22732e = this.f22729b.m2490c(runnable, jMo25585a, TimeUnit.NANOSECONDS, this.f22728a);
            f22727f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jMo25585a));
        }
    }

    @Override // io.grpc.internal.InterfaceC5731E0
    public void reset() {
        this.f22729b.m2492f();
        this.f22729b.execute(new Runnable() { // from class: io.grpc.internal.k
            @Override // java.lang.Runnable
            public final void run() {
                C5792l.m26056b(this.f22712a);
            }
        });
    }
}
