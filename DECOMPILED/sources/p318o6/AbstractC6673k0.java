package p318o6;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: o6.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6673k0 extends AbstractC6669i0 {
    /* JADX INFO: renamed from: g1 */
    protected abstract Thread mo28119g1();

    /* JADX INFO: renamed from: h1 */
    protected void mo28120h1(long j7, AbstractC6671j0.c cVar) {
        RunnableC6635T.f24923t.m28215v1(j7, cVar);
    }

    /* JADX INFO: renamed from: i1 */
    protected final void m28229i1() {
        Thread threadMo28119g1 = mo28119g1();
        if (Thread.currentThread() != threadMo28119g1) {
            AbstractC6655c.m28161a();
            LockSupport.unpark(threadMo28119g1);
        }
    }
}
