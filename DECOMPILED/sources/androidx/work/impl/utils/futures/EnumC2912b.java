package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.work.impl.utils.futures.b */
/* JADX INFO: loaded from: classes.dex */
enum EnumC2912b implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
