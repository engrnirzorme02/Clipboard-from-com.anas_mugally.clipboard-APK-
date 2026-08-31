package p252g4;

import android.os.Process;

/* JADX INFO: renamed from: g4.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC5494d implements Runnable {
    /* JADX INFO: renamed from: a */
    protected abstract void mo24691a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        mo24691a();
    }
}
