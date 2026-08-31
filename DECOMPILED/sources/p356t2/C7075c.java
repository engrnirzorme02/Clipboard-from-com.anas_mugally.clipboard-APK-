package p356t2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: t2.c */
/* JADX INFO: loaded from: classes.dex */
final class C7075c extends Thread {

    /* JADX INFO: renamed from: a */
    private final WeakReference f28251a;

    /* JADX INFO: renamed from: b */
    private final long f28252b;

    /* JADX INFO: renamed from: c */
    final CountDownLatch f28253c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    boolean f28254d = false;

    public C7075c(C7073a c7073a, long j7) {
        this.f28251a = new WeakReference(c7073a);
        this.f28252b = j7;
        start();
    }

    /* JADX INFO: renamed from: a */
    private final void m31192a() {
        C7073a c7073a = (C7073a) this.f28251a.get();
        if (c7073a != null) {
            c7073a.m31187e();
            this.f28254d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f28253c.await(this.f28252b, TimeUnit.MILLISECONDS)) {
                return;
            }
            m31192a();
        } catch (InterruptedException unused) {
            m31192a();
        }
    }
}
