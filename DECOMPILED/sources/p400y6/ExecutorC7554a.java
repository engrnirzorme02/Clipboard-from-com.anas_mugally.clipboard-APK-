package p400y6;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: y6.a */
/* JADX INFO: loaded from: classes.dex */
final class ExecutorC7554a implements Executor {

    /* JADX INFO: renamed from: a */
    public static final ExecutorC7554a f30209a = new ExecutorC7554a();

    private ExecutorC7554a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
