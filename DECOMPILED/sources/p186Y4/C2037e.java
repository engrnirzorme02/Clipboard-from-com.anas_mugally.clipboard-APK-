package p186Y4;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Y4.e */
/* JADX INFO: loaded from: classes.dex */
public class C2037e {

    /* JADX INFO: renamed from: c */
    private final ArrayList f6727c = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final ArrayList f6726b = new ArrayList();

    /* JADX INFO: renamed from: a */
    private final c f6725a = new c();

    /* JADX INFO: renamed from: Y4.e$b */
    public class b {

        /* JADX INFO: renamed from: a */
        private final d f6728a;

        /* JADX INFO: renamed from: b */
        private final long f6729b;

        /* JADX INFO: renamed from: c */
        private final Runnable f6730c;

        /* JADX INFO: renamed from: d */
        private ScheduledFuture f6731d;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public void m8478d() {
            C2037e.this.m8475n();
            if (this.f6731d != null) {
                m8479e();
                this.f6730c.run();
            }
        }

        /* JADX INFO: renamed from: e */
        private void m8479e() {
            AbstractC2034b.m8460d(this.f6731d != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.f6731d = null;
            C2037e.this.m8467m(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public void m8480f(long j7) {
            this.f6731d = C2037e.this.f6725a.schedule(new Runnable() { // from class: Y4.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6754a.m8478d();
                }
            }, j7, TimeUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: c */
        public void m8481c() {
            C2037e.this.m8475n();
            ScheduledFuture scheduledFuture = this.f6731d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                m8479e();
            }
        }

        private b(d dVar, long j7, Runnable runnable) {
            this.f6728a = dVar;
            this.f6729b = j7;
            this.f6730c = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4.e$c */
    class c implements Executor {

        /* JADX INFO: renamed from: a */
        private final ScheduledThreadPoolExecutor f6733a;

        /* JADX INFO: renamed from: b */
        private boolean f6734b;

        /* JADX INFO: renamed from: c */
        private final Thread f6735c;

        /* JADX INFO: renamed from: Y4.e$c$a */
        class a extends ScheduledThreadPoolExecutor {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C2037e f6737a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i7, ThreadFactory threadFactory, C2037e c2037e) {
                super(i7, threadFactory);
                this.f6737a = c2037e;
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            protected void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e7) {
                        th = e7.getCause();
                    }
                }
                if (th != null) {
                    C2037e.this.m8474l(th);
                }
            }
        }

        /* JADX INFO: renamed from: Y4.e$c$b */
        private class b implements Runnable, ThreadFactory {

            /* JADX INFO: renamed from: a */
            private final CountDownLatch f6739a;

            /* JADX INFO: renamed from: b */
            private Runnable f6740b;

            private b() {
                this.f6739a = new CountDownLatch(1);
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                AbstractC2034b.m8460d(this.f6740b == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f6740b = runnable;
                this.f6739a.countDown();
                return c.this.f6735c;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f6739a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f6740b.run();
            }
        }

        c() {
            b bVar = new b();
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(bVar);
            this.f6735c = threadNewThread;
            threadNewThread.setName("FirestoreWorker");
            threadNewThread.setDaemon(true);
            threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: Y4.g
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    C2037e.this.m8474l(th);
                }
            });
            a aVar = new a(1, bVar, C2037e.this);
            this.f6733a = aVar;
            aVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
            this.f6734b = false;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m8482a(TaskCompletionSource taskCompletionSource, Callable callable) {
            try {
                taskCompletionSource.setResult(callable.call());
            } catch (Exception e7) {
                taskCompletionSource.setException(e7);
                throw new RuntimeException(e7);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public Task m8489i(final Callable callable) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                execute(new Runnable() { // from class: Y4.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2037e.c.m8482a(taskCompletionSource, callable);
                    }
                });
            } catch (RejectedExecutionException unused) {
                AbstractC2049q.m8505d(C2037e.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public synchronized boolean m8490j() {
            return this.f6734b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public void m8491k() {
            this.f6733a.shutdownNow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized ScheduledFuture schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
            if (this.f6734b) {
                return null;
            }
            return this.f6733a.schedule(runnable, j7, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            if (!this.f6734b) {
                this.f6733a.execute(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: Y4.e$d */
    public enum d {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Void m8462a(Runnable runnable) {
        runnable.run();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8463b(Throwable th) {
        if (!(th instanceof OutOfMemoryError)) {
            throw new RuntimeException("Internal error in Cloud Firestore (26.0.1).", th);
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (26.0.1) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
        outOfMemoryError.initCause(th);
        throw outOfMemoryError;
    }

    /* JADX INFO: renamed from: e */
    private b m8466e(d dVar, long j7, Runnable runnable) {
        b bVar = new b(dVar, System.currentTimeMillis() + j7, runnable);
        bVar.m8480f(j7);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m8467m(b bVar) {
        AbstractC2034b.m8460d(this.f6726b.remove(bVar), "Delayed task not found.", new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    public Task m8468f(final Runnable runnable) {
        return m8469g(new Callable() { // from class: Y4.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2037e.m8462a(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public Task m8469g(Callable callable) {
        return this.f6725a.m8489i(callable);
    }

    /* JADX INFO: renamed from: h */
    public b m8470h(d dVar, long j7, Runnable runnable) {
        if (this.f6727c.contains(dVar)) {
            j7 = 0;
        }
        b bVarM8466e = m8466e(dVar, j7, runnable);
        this.f6726b.add(bVarM8466e);
        return bVarM8466e;
    }

    /* JADX INFO: renamed from: i */
    public void m8471i(Runnable runnable) {
        m8468f(runnable);
    }

    /* JADX INFO: renamed from: j */
    public Executor m8472j() {
        return this.f6725a;
    }

    /* JADX INFO: renamed from: k */
    public boolean m8473k() {
        return this.f6725a.m8490j();
    }

    /* JADX INFO: renamed from: l */
    public void m8474l(final Throwable th) {
        this.f6725a.m8491k();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Y4.c
            @Override // java.lang.Runnable
            public final void run() {
                C2037e.m8463b(th);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m8475n() {
        Thread threadCurrentThread = Thread.currentThread();
        if (this.f6725a.f6735c != threadCurrentThread) {
            throw AbstractC2034b.m8457a("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.f6725a.f6735c.getName(), Long.valueOf(this.f6725a.f6735c.getId()), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        }
    }
}
