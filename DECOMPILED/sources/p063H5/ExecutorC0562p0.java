package p063H5;

import androidx.lifecycle.AbstractC2636b;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0562p0 implements Executor {

    /* JADX INFO: renamed from: a */
    private final Thread.UncaughtExceptionHandler f2165a;

    /* JADX INFO: renamed from: b */
    private final Queue f2166b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c */
    private final AtomicReference f2167c = new AtomicReference();

    /* JADX INFO: renamed from: H5.p0$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f2168a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f2169b;

        a(c cVar, Runnable runnable) {
            this.f2168a = cVar;
            this.f2169b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorC0562p0.this.execute(this.f2168a);
        }

        public String toString() {
            return this.f2169b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* JADX INFO: renamed from: H5.p0$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f2171a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f2172b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f2173c;

        b(c cVar, Runnable runnable, long j7) {
            this.f2171a = cVar;
            this.f2172b = runnable;
            this.f2173c = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorC0562p0.this.execute(this.f2171a);
        }

        public String toString() {
            return this.f2172b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f2173c + ")";
        }
    }

    /* JADX INFO: renamed from: H5.p0$c */
    private static class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final Runnable f2175a;

        /* JADX INFO: renamed from: b */
        boolean f2176b;

        /* JADX INFO: renamed from: c */
        boolean f2177c;

        c(Runnable runnable) {
            this.f2175a = (Runnable) AbstractC1209m.m5303o(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2176b) {
                return;
            }
            this.f2177c = true;
            this.f2175a.run();
        }
    }

    /* JADX INFO: renamed from: H5.p0$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final c f2178a;

        /* JADX INFO: renamed from: b */
        private final ScheduledFuture f2179b;

        /* synthetic */ d(c cVar, ScheduledFuture scheduledFuture, a aVar) {
            this(cVar, scheduledFuture);
        }

        /* JADX INFO: renamed from: a */
        public void m2493a() {
            this.f2178a.f2176b = true;
            this.f2179b.cancel(false);
        }

        /* JADX INFO: renamed from: b */
        public boolean m2494b() {
            c cVar = this.f2178a;
            return (cVar.f2177c || cVar.f2176b) ? false : true;
        }

        private d(c cVar, ScheduledFuture scheduledFuture) {
            this.f2178a = (c) AbstractC1209m.m5303o(cVar, "runnable");
            this.f2179b = (ScheduledFuture) AbstractC1209m.m5303o(scheduledFuture, "future");
        }
    }

    public ExecutorC0562p0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f2165a = (Thread.UncaughtExceptionHandler) AbstractC1209m.m5303o(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    /* JADX INFO: renamed from: a */
    public final void m2488a() {
        while (AbstractC2636b.m12603a(this.f2167c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f2166b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.f2165a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.f2167c.set(null);
                    throw th2;
                }
            }
            this.f2167c.set(null);
            if (this.f2166b.isEmpty()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2489b(Runnable runnable) {
        this.f2166b.add((Runnable) AbstractC1209m.m5303o(runnable, "runnable is null"));
    }

    /* JADX INFO: renamed from: c */
    public final d m2490c(Runnable runnable, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.schedule(new a(cVar, runnable), j7, timeUnit), null);
    }

    /* JADX INFO: renamed from: e */
    public final d m2491e(Runnable runnable, long j7, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new b(cVar, runnable, j8), j7, j8, timeUnit), null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m2489b(runnable);
        m2488a();
    }

    /* JADX INFO: renamed from: f */
    public void m2492f() {
        AbstractC1209m.m5309u(Thread.currentThread() == this.f2167c.get(), "Not called from the SynchronizationContext");
    }
}
