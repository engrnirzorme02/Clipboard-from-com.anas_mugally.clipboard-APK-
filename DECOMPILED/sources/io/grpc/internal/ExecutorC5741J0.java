package io.grpc.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC5741J0 implements Executor, Runnable {

    /* JADX INFO: renamed from: d */
    private static final Logger f22192d = Logger.getLogger(ExecutorC5741J0.class.getName());

    /* JADX INFO: renamed from: e */
    private static final b f22193e = m25596c();

    /* JADX INFO: renamed from: a */
    private Executor f22194a;

    /* JADX INFO: renamed from: b */
    private final Queue f22195b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c */
    private volatile int f22196c = 0;

    /* JADX INFO: renamed from: io.grpc.internal.J0$b */
    private static abstract class b {
        private b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo25598a(ExecutorC5741J0 executorC5741J0, int i7, int i8);

        /* JADX INFO: renamed from: b */
        public abstract void mo25599b(ExecutorC5741J0 executorC5741J0, int i7);
    }

    /* JADX INFO: renamed from: io.grpc.internal.J0$c */
    private static final class c extends b {

        /* JADX INFO: renamed from: a */
        private final AtomicIntegerFieldUpdater f22197a;

        @Override // io.grpc.internal.ExecutorC5741J0.b
        /* JADX INFO: renamed from: a */
        public boolean mo25598a(ExecutorC5741J0 executorC5741J0, int i7, int i8) {
            return this.f22197a.compareAndSet(executorC5741J0, i7, i8);
        }

        @Override // io.grpc.internal.ExecutorC5741J0.b
        /* JADX INFO: renamed from: b */
        public void mo25599b(ExecutorC5741J0 executorC5741J0, int i7) {
            this.f22197a.set(executorC5741J0, i7);
        }

        private c(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f22197a = atomicIntegerFieldUpdater;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.J0$d */
    private static final class d extends b {
        private d() {
            super();
        }

        @Override // io.grpc.internal.ExecutorC5741J0.b
        /* JADX INFO: renamed from: a */
        public boolean mo25598a(ExecutorC5741J0 executorC5741J0, int i7, int i8) {
            synchronized (executorC5741J0) {
                try {
                    if (executorC5741J0.f22196c != i7) {
                        return false;
                    }
                    executorC5741J0.f22196c = i8;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.ExecutorC5741J0.b
        /* JADX INFO: renamed from: b */
        public void mo25599b(ExecutorC5741J0 executorC5741J0, int i7) {
            synchronized (executorC5741J0) {
                executorC5741J0.f22196c = i7;
            }
        }
    }

    public ExecutorC5741J0(Executor executor) {
        AbstractC1209m.m5303o(executor, "'executor' must not be null.");
        this.f22194a = executor;
    }

    /* JADX INFO: renamed from: c */
    private static b m25596c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(ExecutorC5741J0.class, "c"));
        } catch (Throwable th) {
            f22192d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new d();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m25597e(Runnable runnable) {
        if (f22193e.mo25598a(this, 0, -1)) {
            try {
                this.f22194a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f22195b.remove(runnable);
                }
                f22193e.mo25599b(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f22195b.add((Runnable) AbstractC1209m.m5303o(runnable, "'r' must not be null."));
        m25597e(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable;
        try {
            Executor executor = this.f22194a;
            while (executor == this.f22194a && (runnable = (Runnable) this.f22195b.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e7) {
                    f22192d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e7);
                }
            }
            f22193e.mo25599b(this, 0);
            if (this.f22195b.isEmpty()) {
                return;
            }
            m25597e(null);
        } catch (Throwable th) {
            f22193e.mo25599b(this, 0);
            throw th;
        }
    }
}
