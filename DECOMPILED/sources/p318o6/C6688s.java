package p318o6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p173W5.InterfaceC1875e;

/* JADX INFO: renamed from: o6.s */
/* JADX INFO: loaded from: classes.dex */
public final class C6688s extends C6602C {

    /* JADX INFO: renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f24990c = AtomicIntegerFieldUpdater.newUpdater(C6688s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C6688s(InterfaceC1875e interfaceC1875e, Throwable th, boolean z7) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC1875e + " was cancelled normally");
        }
        super(th, z7);
        this._resumed$volatile = 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m28286e() {
        return f24990c.compareAndSet(this, 0, 1);
    }
}
