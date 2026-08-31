package p235e3;

import android.os.Process;

/* JADX INFO: renamed from: e3.c */
/* JADX INFO: loaded from: classes.dex */
final class C5341c extends Thread {
    C5341c(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
