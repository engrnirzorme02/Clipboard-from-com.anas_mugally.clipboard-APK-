package p081K;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: K.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0716h {

    /* JADX INFO: renamed from: K.h$a */
    private static class a implements Executor {

        /* JADX INFO: renamed from: a */
        private final Handler f2888a;

        a(Handler handler) {
            this.f2888a = (Handler) AbstractC0910g.m4139g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f2888a.post((Runnable) AbstractC0910g.m4139g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f2888a + " is shutting down");
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m3468a(Handler handler) {
        return new a(handler);
    }
}
