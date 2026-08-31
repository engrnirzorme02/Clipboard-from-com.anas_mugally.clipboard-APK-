package p318o6;

import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;

/* JADX INFO: renamed from: o6.W */
/* JADX INFO: loaded from: classes.dex */
class C6641W extends AbstractC6649a implements InterfaceC6639V {
    public C6641W(InterfaceC1879i interfaceC1879i, boolean z7) {
        super(interfaceC1879i, true, z7);
    }

    /* JADX INFO: renamed from: N0 */
    static /* synthetic */ Object m28131N0(C6641W c6641w, InterfaceC1875e interfaceC1875e) throws Throwable {
        Object objM28039v = c6641w.m28039v(interfaceC1875e);
        AbstractC2005b.m8369e();
        return objM28039v;
    }

    @Override // p318o6.InterfaceC6639V
    public Object await(InterfaceC1875e interfaceC1875e) {
        return m28131N0(this, interfaceC1875e);
    }

    @Override // p318o6.InterfaceC6639V
    public Object getCompleted() {
        return m28023K();
    }
}
