package p252g4;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p228d4.C5235g;

/* JADX INFO: renamed from: g4.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5467E {

    /* JADX INFO: renamed from: g4.E$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f20785a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AtomicLong f20786b;

        /* JADX INFO: renamed from: g4.E$a$a, reason: collision with other inner class name */
        class C7689a extends AbstractRunnableC5494d {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Runnable f20787a;

            C7689a(Runnable runnable) {
                this.f20787a = runnable;
            }

            @Override // p252g4.AbstractRunnableC5494d
            /* JADX INFO: renamed from: a */
            public void mo24691a() {
                this.f20787a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f20785a = str;
            this.f20786b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C7689a(runnable));
            threadNewThread.setName(this.f20785a + this.f20786b.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: g4.E$b */
    class b extends AbstractRunnableC5494d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f20789a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ExecutorService f20790b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f20791c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ TimeUnit f20792d;

        b(String str, ExecutorService executorService, long j7, TimeUnit timeUnit) {
            this.f20789a = str;
            this.f20790b = executorService;
            this.f20791c = j7;
            this.f20792d = timeUnit;
        }

        @Override // p252g4.AbstractRunnableC5494d
        /* JADX INFO: renamed from: a */
        public void mo24691a() {
            try {
                C5235g.m24179f().m24180b("Executing shutdown hook for " + this.f20789a);
                this.f20790b.shutdown();
                if (this.f20790b.awaitTermination(this.f20791c, this.f20792d)) {
                    return;
                }
                C5235g.m24179f().m24180b(this.f20789a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f20790b.shutdownNow();
            } catch (InterruptedException unused) {
                C5235g.m24179f().m24180b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f20789a));
                this.f20790b.shutdownNow();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m24686a(String str, ExecutorService executorService) {
        m24687b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: b */
    private static void m24687b(String str, ExecutorService executorService, long j7, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j7, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    /* JADX INFO: renamed from: c */
    public static ExecutorService m24688c(String str) {
        ExecutorService executorServiceM24690e = m24690e(m24689d(str), new ThreadPoolExecutor.DiscardPolicy());
        m24686a(str, executorServiceM24690e);
        return executorServiceM24690e;
    }

    /* JADX INFO: renamed from: d */
    public static ThreadFactory m24689d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    /* JADX INFO: renamed from: e */
    private static ExecutorService m24690e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
