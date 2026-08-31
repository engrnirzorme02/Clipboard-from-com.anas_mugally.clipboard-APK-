package p318o6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p173W5.InterfaceC1879i;

/* JADX INFO: renamed from: o6.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6685q0 extends AbstractC6683p0 implements InterfaceC6643X {

    /* JADX INFO: renamed from: d */
    private final Executor f24989d;

    public C6685q0(Executor executor) {
        this.f24989d = executor;
        if (m28279V0() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) m28279V0()).setRemoveOnCancelPolicy(true);
        }
    }

    /* JADX INFO: renamed from: U0 */
    private final void m28277U0(InterfaceC1879i interfaceC1879i, RejectedExecutionException rejectedExecutionException) {
        AbstractC6601B0.m27946c(interfaceC1879i, AbstractC6679n0.m28241a("The task was rejected", rejectedExecutionException));
    }

    /* JADX INFO: renamed from: W0 */
    private final ScheduledFuture m28278W0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, InterfaceC1879i interfaceC1879i, long j7) {
        try {
            return scheduledExecutorService.schedule(runnable, j7, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e7) {
            m28277U0(interfaceC1879i, e7);
            return null;
        }
    }

    @Override // p318o6.InterfaceC6643X
    /* JADX INFO: renamed from: Q */
    public void mo28132Q(long j7, InterfaceC6678n interfaceC6678n) {
        long j8;
        Executor executorM28279V0 = m28279V0();
        ScheduledFuture scheduledFutureM28278W0 = null;
        ScheduledExecutorService scheduledExecutorService = executorM28279V0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorM28279V0 : null;
        if (scheduledExecutorService != null) {
            j8 = j7;
            scheduledFutureM28278W0 = m28278W0(scheduledExecutorService, new RunnableC6629P0(this, interfaceC6678n), interfaceC6678n.getContext(), j8);
        } else {
            j8 = j7;
        }
        if (scheduledFutureM28278W0 != null) {
            AbstractC6686r.m28282c(interfaceC6678n, new C6674l(scheduledFutureM28278W0));
        } else {
            RunnableC6635T.f24923t.mo28132Q(j8, interfaceC6678n);
        }
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: Q0 */
    public void mo28090Q0(InterfaceC1879i interfaceC1879i, Runnable runnable) {
        try {
            Executor executorM28279V0 = m28279V0();
            AbstractC6655c.m28161a();
            executorM28279V0.execute(runnable);
        } catch (RejectedExecutionException e7) {
            AbstractC6655c.m28161a();
            m28277U0(interfaceC1879i, e7);
            C6656c0.m28163b().mo28090Q0(interfaceC1879i, runnable);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public Executor m28279V0() {
        return this.f24989d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorM28279V0 = m28279V0();
        ExecutorService executorService = executorM28279V0 instanceof ExecutorService ? (ExecutorService) executorM28279V0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6685q0) && ((C6685q0) obj).m28279V0() == m28279V0();
    }

    public int hashCode() {
        return System.identityHashCode(m28279V0());
    }

    @Override // p318o6.InterfaceC6643X
    /* JADX INFO: renamed from: k0 */
    public InterfaceC6661e0 mo28121k0(long j7, Runnable runnable, InterfaceC1879i interfaceC1879i) {
        long j8;
        Runnable runnable2;
        InterfaceC1879i interfaceC1879i2;
        Executor executorM28279V0 = m28279V0();
        ScheduledFuture scheduledFutureM28278W0 = null;
        ScheduledExecutorService scheduledExecutorService = executorM28279V0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorM28279V0 : null;
        if (scheduledExecutorService != null) {
            j8 = j7;
            runnable2 = runnable;
            interfaceC1879i2 = interfaceC1879i;
            scheduledFutureM28278W0 = m28278W0(scheduledExecutorService, runnable2, interfaceC1879i2, j8);
        } else {
            j8 = j7;
            runnable2 = runnable;
            interfaceC1879i2 = interfaceC1879i;
        }
        return scheduledFutureM28278W0 != null ? new C6659d0(scheduledFutureM28278W0) : RunnableC6635T.f24923t.mo28121k0(j8, runnable2, interfaceC1879i2);
    }

    @Override // p318o6.AbstractC6618K
    public String toString() {
        return m28279V0().toString();
    }
}
