package p318o6;

import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p384w6.InterfaceC7362c;

/* JADX INFO: renamed from: o6.y */
/* JADX INFO: loaded from: classes.dex */
final class C6700y extends C6607E0 implements InterfaceC6698x {
    public C6700y(InterfaceC6701y0 interfaceC6701y0) {
        super(true);
        m28029Y(interfaceC6701y0);
    }

    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: P */
    public boolean mo27939P() {
        return true;
    }

    @Override // p318o6.InterfaceC6639V
    public Object await(InterfaceC1875e interfaceC1875e) throws Throwable {
        Object objM28039v = m28039v(interfaceC1875e);
        AbstractC2005b.m8369e();
        return objM28039v;
    }

    @Override // p318o6.InterfaceC6639V
    public Object getCompleted() {
        return m28023K();
    }

    @Override // p318o6.InterfaceC6639V
    public InterfaceC7362c getOnAwait() {
        InterfaceC7362c interfaceC7362cM28024O = m28024O();
        AbstractC6118n.m27185c(interfaceC7362cM28024O, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return interfaceC7362cM28024O;
    }

    @Override // p318o6.InterfaceC6698x
    /* JADX INFO: renamed from: o0 */
    public boolean mo28288o0(Throwable th) {
        return m28032f0(new C6602C(th, false, 2, null));
    }

    @Override // p318o6.InterfaceC6698x
    /* JADX INFO: renamed from: p0 */
    public boolean mo28289p0(Object obj) {
        return m28032f0(obj);
    }
}
