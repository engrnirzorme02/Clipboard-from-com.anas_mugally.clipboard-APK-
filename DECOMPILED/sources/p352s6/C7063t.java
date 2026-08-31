package p352s6;

import kotlin.coroutines.jvm.internal.InterfaceC6090e;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;

/* JADX INFO: renamed from: s6.t */
/* JADX INFO: loaded from: classes.dex */
final class C7063t implements InterfaceC1875e, InterfaceC6090e {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1875e f28216a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1879i f28217b;

    public C7063t(InterfaceC1875e interfaceC1875e, InterfaceC1879i interfaceC1879i) {
        this.f28216a = interfaceC1875e;
        this.f28217b = interfaceC1879i;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6090e
    public InterfaceC6090e getCallerFrame() {
        InterfaceC1875e interfaceC1875e = this.f28216a;
        if (interfaceC1875e instanceof InterfaceC6090e) {
            return (InterfaceC6090e) interfaceC1875e;
        }
        return null;
    }

    @Override // p173W5.InterfaceC1875e
    public InterfaceC1879i getContext() {
        return this.f28217b;
    }

    @Override // p173W5.InterfaceC1875e
    public void resumeWith(Object obj) {
        this.f28216a.resumeWith(obj);
    }
}
