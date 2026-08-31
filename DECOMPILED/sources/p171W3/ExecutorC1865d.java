package p171W3;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: W3.d */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ExecutorC1865d implements Executor {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ ExecutorC1865d f6020a = new ExecutorC1865d();

    private /* synthetic */ ExecutorC1865d() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
