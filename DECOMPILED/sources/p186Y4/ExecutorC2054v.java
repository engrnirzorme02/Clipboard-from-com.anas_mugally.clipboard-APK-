package p186Y4;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: Y4.v */
/* JADX INFO: loaded from: classes.dex */
class ExecutorC2054v implements Executor {

    /* JADX INFO: renamed from: a */
    private final Executor f6784a;

    /* JADX INFO: renamed from: b */
    private final Semaphore f6785b;

    ExecutorC2054v(int i7, Executor executor) {
        this.f6785b = new Semaphore(i7);
        this.f6784a = executor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8523a(ExecutorC2054v executorC2054v, Runnable runnable) {
        executorC2054v.getClass();
        runnable.run();
        executorC2054v.f6785b.release();
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        if (!this.f6785b.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.f6784a.execute(new Runnable() { // from class: Y4.u
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorC2054v.m8523a(this.f6782a, runnable);
                }
            });
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
