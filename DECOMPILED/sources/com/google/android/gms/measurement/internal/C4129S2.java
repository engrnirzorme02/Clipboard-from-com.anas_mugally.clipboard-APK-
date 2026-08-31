package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.S2 */
/* JADX INFO: loaded from: classes2.dex */
final class C4129S2 extends Thread {

    /* JADX INFO: renamed from: a */
    private final Object f15405a;

    /* JADX INFO: renamed from: b */
    private final BlockingQueue f15406b;

    /* JADX INFO: renamed from: c */
    private boolean f15407c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4136T2 f15408d;

    public C4129S2(C4136T2 c4136t2, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(c4136t2);
        this.f15408d = c4136t2;
        this.f15407c = false;
        AbstractC3718s.m18083l(str);
        AbstractC3718s.m18083l(blockingQueue);
        this.f15405a = new Object();
        this.f15406b = blockingQueue;
        setName(str);
    }

    /* JADX INFO: renamed from: b */
    private final void m18625b() {
        C4136T2 c4136t2 = this.f15408d;
        synchronized (c4136t2.m18631B()) {
            try {
                if (!this.f15407c) {
                    c4136t2.m18632C().release();
                    c4136t2.m18631B().notifyAll();
                    if (this == c4136t2.m18643x()) {
                        c4136t2.m18644y(null);
                    } else if (this == c4136t2.m18645z()) {
                        c4136t2.m18630A(null);
                    } else {
                        c4136t2.f15066a.mo18421a().m18851o().m18834a("Current scheduler thread is neither worker nor network");
                    }
                    this.f15407c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m18626c(InterruptedException interruptedException) {
        this.f15408d.f15066a.mo18421a().m18854r().m18835b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* JADX INFO: renamed from: a */
    public final void m18627a() {
        Object obj = this.f15405a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z7 = false;
        while (!z7) {
            try {
                this.f15408d.m18632C().acquire();
                z7 = true;
            } catch (InterruptedException e7) {
                m18626c(e7);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f15406b;
                C4122R2 c4122r2 = (C4122R2) blockingQueue.poll();
                if (c4122r2 != null) {
                    Process.setThreadPriority(true != c4122r2.f15386b ? 10 : threadPriority);
                    c4122r2.run();
                } else {
                    Object obj = this.f15405a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f15408d.m18633D();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e8) {
                                m18626c(e8);
                            }
                        }
                    }
                    synchronized (this.f15408d.m18631B()) {
                        if (this.f15406b.peek() == null) {
                            m18625b();
                            m18625b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m18625b();
            throw th;
        }
    }
}
