package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.concurrent.o */
/* JADX INFO: loaded from: classes.dex */
class ScheduledExecutorServiceC4900o implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a */
    private final ExecutorService f18613a;

    /* JADX INFO: renamed from: b */
    private final ScheduledExecutorService f18614b;

    ScheduledExecutorServiceC4900o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f18613a = executorService;
        this.f18614b = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m22079J(Callable callable, ScheduledFutureC4901p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e7) {
            bVar.mo22094a(e7);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m22081Q(Runnable runnable, ScheduledFutureC4901p.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e7) {
            bVar.mo22094a(e7);
            throw e7;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m22087o0(Runnable runnable, ScheduledFutureC4901p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e7) {
            bVar.mo22094a(e7);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m22089w0(Runnable runnable, ScheduledFutureC4901p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e7) {
            bVar.mo22094a(e7);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return this.f18613a.awaitTermination(j7, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f18613a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f18613a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f18613a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f18613a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f18613a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j7, final TimeUnit timeUnit) {
        return new ScheduledFutureC4901p(new ScheduledFutureC4901p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.ScheduledFutureC4901p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo22078a(ScheduledFutureC4901p.b bVar) {
                ScheduledExecutorServiceC4900o scheduledExecutorServiceC4900o = this.f18575a;
                return scheduledExecutorServiceC4900o.f18614b.schedule(new Runnable() { // from class: com.google.firebase.concurrent.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC4900o.f18613a.execute(new Runnable() { // from class: com.google.firebase.concurrent.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC4900o.m22089w0(runnable, bVar);
                            }
                        });
                    }
                }, j7, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j7, final long j8, final TimeUnit timeUnit) {
        return new ScheduledFutureC4901p(new ScheduledFutureC4901p.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.ScheduledFutureC4901p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo22078a(ScheduledFutureC4901p.b bVar) {
                ScheduledExecutorServiceC4900o scheduledExecutorServiceC4900o = this.f18583a;
                return scheduledExecutorServiceC4900o.f18614b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC4900o.f18613a.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                ScheduledExecutorServiceC4900o.m22081Q(runnable, bVar);
                            }
                        });
                    }
                }, j7, j8, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j7, final long j8, final TimeUnit timeUnit) {
        return new ScheduledFutureC4901p(new ScheduledFutureC4901p.c() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.ScheduledFutureC4901p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo22078a(ScheduledFutureC4901p.b bVar) {
                ScheduledExecutorServiceC4900o scheduledExecutorServiceC4900o = this.f18588a;
                return scheduledExecutorServiceC4900o.f18614b.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC4900o.f18613a.execute(new Runnable() { // from class: com.google.firebase.concurrent.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC4900o.m22087o0(runnable, bVar);
                            }
                        });
                    }
                }, j7, j8, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f18613a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f18613a.invokeAll(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f18613a.invokeAny(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j7, final TimeUnit timeUnit) {
        return new ScheduledFutureC4901p(new ScheduledFutureC4901p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.ScheduledFutureC4901p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo22078a(ScheduledFutureC4901p.b bVar) {
                ScheduledExecutorServiceC4900o scheduledExecutorServiceC4900o = this.f18593a;
                return scheduledExecutorServiceC4900o.f18614b.schedule(new Callable() { // from class: com.google.firebase.concurrent.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return scheduledExecutorServiceC4900o.f18613a.submit(new Runnable() { // from class: com.google.firebase.concurrent.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC4900o.m22079J(callable, bVar);
                            }
                        });
                    }
                }, j7, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f18613a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f18613a.submit(runnable);
    }
}
