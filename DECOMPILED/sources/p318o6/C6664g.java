package p318o6;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1879i;

/* JADX INFO: renamed from: o6.g */
/* JADX INFO: loaded from: classes.dex */
final class C6664g extends AbstractC6649a {

    /* JADX INFO: renamed from: d */
    private final Thread f24960d;

    /* JADX INFO: renamed from: e */
    private final AbstractC6669i0 f24961e;

    public C6664g(InterfaceC1879i interfaceC1879i, Thread thread, AbstractC6669i0 abstractC6669i0) {
        super(interfaceC1879i, true, true);
        this.f24960d = thread;
        this.f24961e = abstractC6669i0;
    }

    /* JADX INFO: renamed from: N0 */
    public final Object m28179N0() throws Throwable {
        AbstractC6655c.m28161a();
        try {
            AbstractC6669i0 abstractC6669i0 = this.f24961e;
            if (abstractC6669i0 != null) {
                AbstractC6669i0.m28189a1(abstractC6669i0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC6669i0 abstractC6669i1 = this.f24961e;
                    long jMo28196d1 = abstractC6669i1 != null ? abstractC6669i1.mo28196d1() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        AbstractC6669i0 abstractC6669i2 = this.f24961e;
                        if (abstractC6669i2 != null) {
                            AbstractC6669i0.m28187V0(abstractC6669i2, false, 1, null);
                        }
                        AbstractC6655c.m28161a();
                        Object objM28072h = AbstractC6609F0.m28072h(m28026T());
                        C6602C c6602c = objM28072h instanceof C6602C ? (C6602C) objM28072h : null;
                        if (c6602c == null) {
                            return objM28072h;
                        }
                        throw c6602c.f24874a;
                    }
                    AbstractC6655c.m28161a();
                    LockSupport.parkNanos(this, jMo28196d1);
                } catch (Throwable th) {
                    AbstractC6669i0 abstractC6669i3 = this.f24961e;
                    if (abstractC6669i3 != null) {
                        AbstractC6669i0.m28187V0(abstractC6669i3, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m28043y(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC6655c.m28161a();
            throw th2;
        }
    }

    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: a0 */
    protected boolean mo28031a0() {
        return true;
    }

    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: u */
    protected void mo28038u(Object obj) {
        if (AbstractC6118n.m27183a(Thread.currentThread(), this.f24960d)) {
            return;
        }
        Thread thread = this.f24960d;
        AbstractC6655c.m28161a();
        LockSupport.unpark(thread);
    }
}
