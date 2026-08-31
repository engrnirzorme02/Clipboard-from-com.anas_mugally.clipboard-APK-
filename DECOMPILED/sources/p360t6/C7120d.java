package p360t6;

import p173W5.InterfaceC1879i;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: t6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7120d implements InterfaceC6624N {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1879i f28410a;

    public C7120d(InterfaceC1879i interfaceC1879i) {
        this.f28410a = interfaceC1879i;
    }

    @Override // p318o6.InterfaceC6624N
    /* JADX INFO: renamed from: Q */
    public InterfaceC1879i mo12635Q() {
        return this.f28410a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + mo12635Q() + ')';
    }
}
