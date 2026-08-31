package p360t6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p173W5.InterfaceC1879i;
import p318o6.InterfaceC6621L0;

/* JADX INFO: renamed from: t6.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7101A extends AbstractC7118b implements InterfaceC6621L0 {

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28390d = AtomicIntegerFieldUpdater.newUpdater(AbstractC7101A.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c */
    public final long f28391c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC7101A(long j7, AbstractC7101A abstractC7101A, int i7) {
        super(abstractC7101A);
        this.f28391c = j7;
        this.cleanedAndPointers$volatile = i7 << 16;
    }

    @Override // p360t6.AbstractC7118b
    /* JADX INFO: renamed from: k */
    public boolean mo31378k() {
        return f28390d.get(this) == mo30054r() && !m31440l();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m31379p() {
        return f28390d.addAndGet(this, -65536) == mo30054r() && !m31440l();
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo30054r();

    /* JADX INFO: renamed from: s */
    public abstract void mo30055s(int i7, Throwable th, InterfaceC1879i interfaceC1879i);

    /* JADX INFO: renamed from: t */
    public final void m31380t() {
        if (f28390d.incrementAndGet(this) == mo30054r()) {
            m31442n();
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m31381u() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f28390d;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == mo30054r() && !m31440l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
