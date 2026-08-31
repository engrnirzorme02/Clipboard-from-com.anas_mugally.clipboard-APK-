package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.T2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4136T2 extends AbstractC4003B3 {

    /* JADX INFO: renamed from: k */
    private static final AtomicLong f15423k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c */
    private C4129S2 f15424c;

    /* JADX INFO: renamed from: d */
    private C4129S2 f15425d;

    /* JADX INFO: renamed from: e */
    private final PriorityBlockingQueue f15426e;

    /* JADX INFO: renamed from: f */
    private final BlockingQueue f15427f;

    /* JADX INFO: renamed from: g */
    private final Thread.UncaughtExceptionHandler f15428g;

    /* JADX INFO: renamed from: h */
    private final Thread.UncaughtExceptionHandler f15429h;

    /* JADX INFO: renamed from: i */
    private final Object f15430i;

    /* JADX INFO: renamed from: j */
    private final Semaphore f15431j;

    C4136T2(C4164X2 c4164x2) {
        super(c4164x2);
        this.f15430i = new Object();
        this.f15431j = new Semaphore(2);
        this.f15426e = new PriorityBlockingQueue();
        this.f15427f = new LinkedBlockingQueue();
        this.f15428g = new C4116Q2(this, "Thread death: Uncaught exception on worker thread");
        this.f15429h = new C4116Q2(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: renamed from: F */
    private final void m18629F(C4122R2 c4122r2) {
        synchronized (this.f15430i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f15426e;
                priorityBlockingQueue.add(c4122r2);
                C4129S2 c4129s2 = this.f15424c;
                if (c4129s2 == null) {
                    C4129S2 c4129s3 = new C4129S2(this, "Measurement Worker", priorityBlockingQueue);
                    this.f15424c = c4129s3;
                    c4129s3.setUncaughtExceptionHandler(this.f15428g);
                    this.f15424c.start();
                } else {
                    c4129s2.m18627a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    final /* synthetic */ void m18630A(C4129S2 c4129s2) {
        this.f15425d = null;
    }

    /* JADX INFO: renamed from: B */
    final /* synthetic */ Object m18631B() {
        return this.f15430i;
    }

    /* JADX INFO: renamed from: C */
    final /* synthetic */ Semaphore m18632C() {
        return this.f15431j;
    }

    /* JADX INFO: renamed from: D */
    final /* synthetic */ boolean m18633D() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3995A3
    /* JADX INFO: renamed from: g */
    public final void mo18426g() {
        if (Thread.currentThread() != this.f15425d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3995A3
    /* JADX INFO: renamed from: h */
    public final void mo18427h() {
        if (Thread.currentThread() != this.f15424c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4003B3
    /* JADX INFO: renamed from: i */
    protected final boolean mo18416i() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m18634o() {
        if (Thread.currentThread() == this.f15424c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m18635p() {
        return Thread.currentThread() == this.f15424c;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m18636q() {
        return Thread.currentThread() == this.f15425d;
    }

    /* JADX INFO: renamed from: r */
    public final Future m18637r(Callable callable) {
        m18437l();
        AbstractC3718s.m18083l(callable);
        C4122R2 c4122r2 = new C4122R2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f15424c) {
            m18629F(c4122r2);
            return c4122r2;
        }
        if (!this.f15426e.isEmpty()) {
            this.f15066a.mo18421a().m18854r().m18834a("Callable skipped the worker queue.");
        }
        c4122r2.run();
        return c4122r2;
    }

    /* JADX INFO: renamed from: s */
    public final Future m18638s(Callable callable) {
        m18437l();
        AbstractC3718s.m18083l(callable);
        C4122R2 c4122r2 = new C4122R2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f15424c) {
            c4122r2.run();
            return c4122r2;
        }
        m18629F(c4122r2);
        return c4122r2;
    }

    /* JADX INFO: renamed from: t */
    public final void m18639t(Runnable runnable) {
        m18437l();
        AbstractC3718s.m18083l(runnable);
        m18629F(new C4122R2(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: u */
    final Object m18640u(AtomicReference atomicReference, long j7, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f15066a.mo18422b().m18639t(runnable);
            try {
                atomicReference.wait(j7);
            } catch (InterruptedException unused) {
                C4297o2 c4297o2M18854r = this.f15066a.mo18421a().m18854r();
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                c4297o2M18854r.m18834a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f15066a.mo18421a().m18854r().m18834a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* JADX INFO: renamed from: v */
    public final void m18641v(Runnable runnable) {
        m18437l();
        AbstractC3718s.m18083l(runnable);
        m18629F(new C4122R2(this, runnable, true, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: w */
    public final void m18642w(Runnable runnable) {
        m18437l();
        AbstractC3718s.m18083l(runnable);
        C4122R2 c4122r2 = new C4122R2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f15430i) {
            try {
                BlockingQueue blockingQueue = this.f15427f;
                blockingQueue.add(c4122r2);
                C4129S2 c4129s2 = this.f15425d;
                if (c4129s2 == null) {
                    C4129S2 c4129s3 = new C4129S2(this, "Measurement Network", blockingQueue);
                    this.f15425d = c4129s3;
                    c4129s3.setUncaughtExceptionHandler(this.f15429h);
                    this.f15425d.start();
                } else {
                    c4129s2.m18627a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    final /* synthetic */ C4129S2 m18643x() {
        return this.f15424c;
    }

    /* JADX INFO: renamed from: y */
    final /* synthetic */ void m18644y(C4129S2 c4129s2) {
        this.f15424c = null;
    }

    /* JADX INFO: renamed from: z */
    final /* synthetic */ C4129S2 m18645z() {
        return this.f15425d;
    }
}
