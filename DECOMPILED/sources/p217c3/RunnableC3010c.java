package p217c3;

import android.os.Process;

/* JADX INFO: renamed from: c3.c */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3010c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Runnable f12434a;

    public RunnableC3010c(Runnable runnable, int i7) {
        this.f12434a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f12434a.run();
    }
}
