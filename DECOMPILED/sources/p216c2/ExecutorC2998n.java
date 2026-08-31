package p216c2;

import java.util.concurrent.Executor;
import p250g2.AbstractC5459a;

/* JADX INFO: renamed from: c2.n */
/* JADX INFO: loaded from: classes.dex */
class ExecutorC2998n implements Executor {

    /* JADX INFO: renamed from: a */
    private final Executor f12411a;

    /* JADX INFO: renamed from: c2.n$a */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final Runnable f12412a;

        a(Runnable runnable) {
            this.f12412a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12412a.run();
            } catch (Exception e7) {
                AbstractC5459a.m24665c("Executor", "Background execution failure.", e7);
            }
        }
    }

    ExecutorC2998n(Executor executor) {
        this.f12411a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f12411a.execute(new a(runnable));
    }
}
