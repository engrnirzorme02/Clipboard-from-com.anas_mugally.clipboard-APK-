package p173W5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: W5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1874d implements InterfaceC1879i, Serializable {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1879i f6040a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1879i.b f6041b;

    public C1874d(InterfaceC1879i left, InterfaceC1879i.b element) {
        AbstractC6118n.m27187e(left, "left");
        AbstractC6118n.m27187e(element, "element");
        this.f6040a = left;
        this.f6041b = element;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m7770b(InterfaceC1879i.b bVar) {
        return AbstractC6118n.m27183a(get(bVar.getKey()), bVar);
    }

    /* JADX INFO: renamed from: c */
    private final boolean m7771c(C1874d c1874d) {
        while (m7770b(c1874d.f6041b)) {
            InterfaceC1879i interfaceC1879i = c1874d.f6040a;
            if (!(interfaceC1879i instanceof C1874d)) {
                AbstractC6118n.m27185c(interfaceC1879i, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m7770b((InterfaceC1879i.b) interfaceC1879i);
            }
            c1874d = (C1874d) interfaceC1879i;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private final int m7772d() {
        int i7 = 2;
        C1874d c1874d = this;
        while (true) {
            InterfaceC1879i interfaceC1879i = c1874d.f6040a;
            c1874d = interfaceC1879i instanceof C1874d ? (C1874d) interfaceC1879i : null;
            if (c1874d == null) {
                return i7;
            }
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final String m7773e(String acc, InterfaceC1879i.b element) {
        AbstractC6118n.m27187e(acc, "acc");
        AbstractC6118n.m27187e(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1874d)) {
            return false;
        }
        C1874d c1874d = (C1874d) obj;
        return c1874d.m7772d() == m7772d() && c1874d.m7771c(this);
    }

    @Override // p173W5.InterfaceC1879i
    public Object fold(Object obj, InterfaceC5371p operation) {
        AbstractC6118n.m27187e(operation, "operation");
        return operation.invoke(this.f6040a.fold(obj, operation), this.f6041b);
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i.b get(InterfaceC1879i.c key) {
        AbstractC6118n.m27187e(key, "key");
        C1874d c1874d = this;
        while (true) {
            InterfaceC1879i.b bVar = c1874d.f6041b.get(key);
            if (bVar != null) {
                return bVar;
            }
            InterfaceC1879i interfaceC1879i = c1874d.f6040a;
            if (!(interfaceC1879i instanceof C1874d)) {
                return interfaceC1879i.get(key);
            }
            c1874d = (C1874d) interfaceC1879i;
        }
    }

    public int hashCode() {
        return this.f6040a.hashCode() + this.f6041b.hashCode();
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i minusKey(InterfaceC1879i.c key) {
        AbstractC6118n.m27187e(key, "key");
        if (this.f6041b.get(key) != null) {
            return this.f6040a;
        }
        InterfaceC1879i interfaceC1879iMinusKey = this.f6040a.minusKey(key);
        if (interfaceC1879iMinusKey == this.f6040a) {
            return this;
        }
        return interfaceC1879iMinusKey == C1880j.f6044a ? this.f6041b : new C1874d(interfaceC1879iMinusKey, this.f6041b);
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i plus(InterfaceC1879i interfaceC1879i) {
        return InterfaceC1879i.a.m7780b(this, interfaceC1879i);
    }

    public String toString() {
        return '[' + ((String) fold("", new InterfaceC5371p() { // from class: W5.c
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return C1874d.m7773e((String) obj, (InterfaceC1879i.b) obj2);
            }
        })) + ']';
    }
}
