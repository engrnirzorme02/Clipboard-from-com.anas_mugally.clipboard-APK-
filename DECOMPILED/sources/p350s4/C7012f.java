package p350s4;

/* JADX INFO: renamed from: s4.f */
/* JADX INFO: loaded from: classes.dex */
public class C7012f extends AbstractC7016j {

    /* JADX INFO: renamed from: e */
    private int f28027e;

    C7012f(Object obj, Object obj2, InterfaceC7014h interfaceC7014h, InterfaceC7014h interfaceC7014h2) {
        super(obj, obj2, interfaceC7014h, interfaceC7014h2);
        this.f28027e = -1;
    }

    @Override // p350s4.InterfaceC7014h
    /* JADX INFO: renamed from: f */
    public boolean mo30624f() {
        return false;
    }

    @Override // p350s4.AbstractC7016j
    /* JADX INFO: renamed from: l */
    protected AbstractC7016j mo30625l(Object obj, Object obj2, InterfaceC7014h interfaceC7014h, InterfaceC7014h interfaceC7014h2) {
        if (obj == null) {
            obj = getKey();
        }
        if (obj2 == null) {
            obj2 = getValue();
        }
        if (interfaceC7014h == null) {
            interfaceC7014h = mo30629a();
        }
        if (interfaceC7014h2 == null) {
            interfaceC7014h2 = mo30634g();
        }
        return new C7012f(obj, obj2, interfaceC7014h, interfaceC7014h2);
    }

    @Override // p350s4.AbstractC7016j
    /* JADX INFO: renamed from: n */
    protected InterfaceC7014h.a mo30626n() {
        return InterfaceC7014h.a.BLACK;
    }

    @Override // p350s4.InterfaceC7014h
    public int size() {
        if (this.f28027e == -1) {
            this.f28027e = mo30629a().size() + 1 + mo30634g().size();
        }
        return this.f28027e;
    }

    @Override // p350s4.AbstractC7016j
    /* JADX INFO: renamed from: u */
    void mo30627u(InterfaceC7014h interfaceC7014h) {
        if (this.f28027e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.mo30627u(interfaceC7014h);
    }
}
