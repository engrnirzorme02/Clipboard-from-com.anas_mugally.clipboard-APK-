package p318o6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1879i;
import p278j6.AbstractC5905g;

/* JADX INFO: renamed from: o6.T */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6635T extends AbstractC6671j0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: t */
    public static final RunnableC6635T f24923t;

    /* JADX INFO: renamed from: u */
    private static final long f24924u;

    static {
        Long l7;
        RunnableC6635T runnableC6635T = new RunnableC6635T();
        f24923t = runnableC6635T;
        AbstractC6669i0.m28189a1(runnableC6635T, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f24924u = timeUnit.toNanos(l7.longValue());
    }

    private RunnableC6635T() {
    }

    /* JADX INFO: renamed from: A1 */
    private final synchronized void m28113A1() {
        if (m28116D1()) {
            debugStatus = 3;
            m28214u1();
            AbstractC6118n.m27185c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: B1 */
    private final synchronized Thread m28114B1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f24923t.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* JADX INFO: renamed from: C1 */
    private final boolean m28115C1() {
        return debugStatus == 4;
    }

    /* JADX INFO: renamed from: D1 */
    private final boolean m28116D1() {
        int i7 = debugStatus;
        return i7 == 2 || i7 == 3;
    }

    /* JADX INFO: renamed from: E1 */
    private final synchronized boolean m28117E1() {
        if (m28116D1()) {
            return false;
        }
        debugStatus = 1;
        AbstractC6118n.m27185c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: F1 */
    private final void m28118F1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p318o6.AbstractC6673k0
    /* JADX INFO: renamed from: g1 */
    protected Thread mo28119g1() {
        Thread thread = _thread;
        return thread == null ? m28114B1() : thread;
    }

    @Override // p318o6.AbstractC6673k0
    /* JADX INFO: renamed from: h1 */
    protected void mo28120h1(long j7, AbstractC6671j0.c cVar) {
        m28118F1();
    }

    @Override // p318o6.AbstractC6671j0, p318o6.InterfaceC6643X
    /* JADX INFO: renamed from: k0 */
    public InterfaceC6661e0 mo28121k0(long j7, Runnable runnable, InterfaceC1879i interfaceC1879i) {
        return m28216x1(j7, runnable);
    }

    @Override // p318o6.AbstractC6671j0
    /* JADX INFO: renamed from: m1 */
    public void mo28122m1(Runnable runnable) {
        if (m28115C1()) {
            m28118F1();
        }
        super.mo28122m1(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM28213s1;
        C6638U0.f24927a.m28130d(this);
        AbstractC6655c.m28161a();
        try {
            if (!m28117E1()) {
                if (zM28213s1) {
                    return;
                } else {
                    return;
                }
            }
            long j7 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo28196d1 = mo28196d1();
                if (jMo28196d1 == Long.MAX_VALUE) {
                    AbstractC6655c.m28161a();
                    long jNanoTime = System.nanoTime();
                    if (j7 == Long.MAX_VALUE) {
                        j7 = f24924u + jNanoTime;
                    }
                    long j8 = j7 - jNanoTime;
                    if (j8 <= 0) {
                        if (zM28213s1) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jMo28196d1 = AbstractC5905g.m26657e(jMo28196d1, j8);
                } else {
                    j7 = Long.MAX_VALUE;
                }
                if (jMo28196d1 > 0) {
                    if (m28116D1()) {
                        if (zM28213s1) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        AbstractC6655c.m28161a();
                        LockSupport.parkNanos(this, jMo28196d1);
                    }
                }
            }
        } finally {
            _thread = null;
            m28113A1();
            AbstractC6655c.m28161a();
            if (!m28213s1()) {
                mo28119g1();
            }
        }
    }

    @Override // p318o6.AbstractC6671j0, p318o6.AbstractC6669i0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p318o6.AbstractC6618K
    public String toString() {
        return "DefaultExecutor";
    }
}
