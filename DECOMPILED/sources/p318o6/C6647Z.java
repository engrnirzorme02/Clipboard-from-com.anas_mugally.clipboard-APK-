package p318o6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p360t6.AbstractC7125i;
import p360t6.C7142z;

/* JADX INFO: renamed from: o6.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C6647Z extends C7142z {

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f24932e = AtomicIntegerFieldUpdater.newUpdater(C6647Z.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C6647Z(InterfaceC1879i interfaceC1879i, InterfaceC1875e interfaceC1875e) {
        super(interfaceC1879i, interfaceC1875e);
    }

    /* JADX INFO: renamed from: P0 */
    private final boolean m28140P0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24932e;
        do {
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f24932e.compareAndSet(this, 0, 2));
        return true;
    }

    /* JADX INFO: renamed from: Q0 */
    private final boolean m28141Q0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24932e;
        do {
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f24932e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p360t6.C7142z, p318o6.AbstractC6649a
    /* JADX INFO: renamed from: I0 */
    protected void mo28142I0(Object obj) {
        if (m28140P0()) {
            return;
        }
        AbstractC7125i.m31458b(AbstractC2005b.m8367c(this.f28449d), AbstractC6606E.m27977a(obj, this.f28449d));
    }

    /* JADX INFO: renamed from: N0 */
    public final Object m28143N0() {
        if (m28141Q0()) {
            return AbstractC2005b.m8369e();
        }
        Object objM28072h = AbstractC6609F0.m28072h(m28026T());
        if (objM28072h instanceof C6602C) {
            throw ((C6602C) objM28072h).f24874a;
        }
        return objM28072h;
    }

    @Override // p360t6.C7142z, p318o6.C6607E0
    /* JADX INFO: renamed from: u */
    protected void mo28038u(Object obj) {
        mo28142I0(obj);
    }
}
