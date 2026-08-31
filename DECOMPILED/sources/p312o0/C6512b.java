package p312o0;

import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1879i;
import p318o6.AbstractC6603C0;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6512b implements AutoCloseable, InterfaceC6624N {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1879i f24636a;

    public C6512b(InterfaceC1879i coroutineContext) {
        AbstractC6118n.m27187e(coroutineContext, "coroutineContext");
        this.f24636a = coroutineContext;
    }

    @Override // p318o6.InterfaceC6624N
    /* JADX INFO: renamed from: Q */
    public InterfaceC1879i mo12635Q() {
        return this.f24636a;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        AbstractC6603C0.m27962d(mo12635Q(), null, 1, null);
    }
}
