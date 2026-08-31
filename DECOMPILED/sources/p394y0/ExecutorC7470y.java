package p394y0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;

/* JADX INFO: renamed from: y0.y */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC7470y implements Executor {

    /* JADX INFO: renamed from: a */
    private final Executor f30000a;

    /* JADX INFO: renamed from: b */
    private final ArrayDeque f30001b;

    /* JADX INFO: renamed from: c */
    private Runnable f30002c;

    /* JADX INFO: renamed from: d */
    private final Object f30003d;

    public ExecutorC7470y(Executor executor) {
        AbstractC6118n.m27187e(executor, "executor");
        this.f30000a = executor;
        this.f30001b = new ArrayDeque();
        this.f30003d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m33088b(Runnable command, ExecutorC7470y this$0) {
        AbstractC6118n.m27187e(command, "$command");
        AbstractC6118n.m27187e(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.m33089c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m33089c() {
        synchronized (this.f30003d) {
            try {
                Object objPoll = this.f30001b.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f30002c = runnable;
                if (objPoll != null) {
                    this.f30000a.execute(runnable);
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        AbstractC6118n.m27187e(command, "command");
        synchronized (this.f30003d) {
            try {
                this.f30001b.offer(new Runnable() { // from class: y0.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorC7470y.m33088b(command, this);
                    }
                });
                if (this.f30002c == null) {
                    m33089c();
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
