package p157U3;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: U3.a */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC1669a implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
