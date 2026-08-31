package p318o6;

import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1876f;
import p173W5.InterfaceC1879i;
import p360t6.AbstractC7111K;
import p360t6.C7142z;

/* JADX INFO: renamed from: o6.Z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6648Z0 extends C7142z {

    /* JADX INFO: renamed from: e */
    private final ThreadLocal f24933e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6648Z0(InterfaceC1879i interfaceC1879i, InterfaceC1875e interfaceC1875e) {
        C6651a1 c6651a1 = C6651a1.f24936a;
        super(interfaceC1879i.get(c6651a1) == null ? interfaceC1879i.plus(c6651a1) : interfaceC1879i, interfaceC1875e);
        this.f24933e = new ThreadLocal();
        if (interfaceC1875e.getContext().get(InterfaceC1876f.f6042h) instanceof AbstractC6618K) {
            return;
        }
        Object objM31410i = AbstractC7111K.m31410i(interfaceC1879i, null);
        AbstractC7111K.m31407f(interfaceC1879i, objM31410i);
        m28145O0(interfaceC1879i, objM31410i);
    }

    @Override // p360t6.C7142z, p318o6.AbstractC6649a
    /* JADX INFO: renamed from: I0 */
    protected void mo28142I0(Object obj) {
        if (this.threadLocalIsSet) {
            C1435m c1435m = (C1435m) this.f24933e.get();
            if (c1435m != null) {
                AbstractC7111K.m31407f((InterfaceC1879i) c1435m.m6068a(), c1435m.m6069b());
            }
            this.f24933e.remove();
        }
        Object objM27977a = AbstractC6606E.m27977a(obj, this.f28449d);
        InterfaceC1875e interfaceC1875e = this.f28449d;
        InterfaceC1879i context = interfaceC1875e.getContext();
        Object objM31410i = AbstractC7111K.m31410i(context, null);
        C6648Z0 c6648z0M28085m = objM31410i != AbstractC7111K.f28397a ? AbstractC6614I.m28085m(interfaceC1875e, context, objM31410i) : null;
        try {
            this.f28449d.resumeWith(objM27977a);
            C1444v c1444v = C1444v.f4971a;
        } finally {
            if (c6648z0M28085m == null || c6648z0M28085m.m28144N0()) {
                AbstractC7111K.m31407f(context, objM31410i);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m28144N0() {
        boolean z7 = this.threadLocalIsSet && this.f24933e.get() == null;
        this.f24933e.remove();
        return !z7;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m28145O0(InterfaceC1879i interfaceC1879i, Object obj) {
        this.threadLocalIsSet = true;
        this.f24933e.set(AbstractC1440r.m6083a(interfaceC1879i, obj));
    }
}
