package p186Y4;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: Y4.j */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC2042j implements Executor {

    /* JADX INFO: renamed from: a */
    private Semaphore f6760a = new Semaphore(0);

    /* JADX INFO: renamed from: b */
    private int f6761b = 0;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8493a(ExecutorC2042j executorC2042j, Runnable runnable) {
        executorC2042j.getClass();
        runnable.run();
        executorC2042j.f6760a.release();
    }

    /* JADX INFO: renamed from: b */
    public void m8494b() {
        try {
            this.f6760a.acquire(this.f6761b);
            this.f6761b = 0;
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            AbstractC2034b.m8457a("Interrupted while waiting for background task", e7);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        this.f6761b++;
        AbstractC2044l.f6764c.execute(new Runnable() { // from class: Y4.i
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC2042j.m8493a(this.f6758a, runnable);
            }
        });
    }
}
