package p318o6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: o6.w0 */
/* JADX INFO: loaded from: classes.dex */
final class C6697w0 extends AbstractC6605D0 {

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f24996f = AtomicIntegerFieldUpdater.newUpdater(C6697w0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: e */
    private final InterfaceC5367l f24997e;

    public C6697w0(InterfaceC5367l interfaceC5367l) {
        this.f24997e = interfaceC5367l;
    }

    @Override // p318o6.AbstractC6605D0
    /* JADX INFO: renamed from: v */
    public boolean mo27974v() {
        return true;
    }

    @Override // p318o6.AbstractC6605D0
    /* JADX INFO: renamed from: w */
    public void mo27975w(Throwable th) {
        if (f24996f.compareAndSet(this, 0, 1)) {
            this.f24997e.invoke(th);
        }
    }
}
