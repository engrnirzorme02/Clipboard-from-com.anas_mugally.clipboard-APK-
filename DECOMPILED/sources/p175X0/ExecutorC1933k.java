package p175X0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X0.k */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC1933k implements Executor {

    /* JADX INFO: renamed from: b */
    private final Executor f6380b;

    /* JADX INFO: renamed from: d */
    private volatile Runnable f6382d;

    /* JADX INFO: renamed from: a */
    private final ArrayDeque f6379a = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    private final Object f6381c = new Object();

    /* JADX INFO: renamed from: X0.k$a */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final ExecutorC1933k f6383a;

        /* JADX INFO: renamed from: b */
        final Runnable f6384b;

        a(ExecutorC1933k executorC1933k, Runnable runnable) {
            this.f6383a = executorC1933k;
            this.f6384b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f6384b.run();
            } finally {
                this.f6383a.m7985b();
            }
        }
    }

    public ExecutorC1933k(Executor executor) {
        this.f6380b = executor;
    }

    /* JADX INFO: renamed from: a */
    public boolean m7984a() {
        boolean z7;
        synchronized (this.f6381c) {
            z7 = !this.f6379a.isEmpty();
        }
        return z7;
    }

    /* JADX INFO: renamed from: b */
    void m7985b() {
        synchronized (this.f6381c) {
            try {
                Runnable runnable = (Runnable) this.f6379a.poll();
                this.f6382d = runnable;
                if (runnable != null) {
                    this.f6380b.execute(this.f6382d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f6381c) {
            try {
                this.f6379a.add(new a(this, runnable));
                if (this.f6382d == null) {
                    m7985b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
