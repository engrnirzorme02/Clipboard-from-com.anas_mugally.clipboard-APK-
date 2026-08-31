package p350s4;

/* JADX INFO: renamed from: s4.i */
/* JADX INFO: loaded from: classes.dex */
public class C7015i extends AbstractC7016j {
    C7015i(Object obj, Object obj2) {
        super(obj, obj2, C7013g.m30628j(), C7013g.m30628j());
    }

    @Override // p350s4.InterfaceC7014h
    /* JADX INFO: renamed from: f */
    public boolean mo30624f() {
        return true;
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
        return new C7015i(obj, obj2, interfaceC7014h, interfaceC7014h2);
    }

    @Override // p350s4.AbstractC7016j
    /* JADX INFO: renamed from: n */
    protected InterfaceC7014h.a mo30626n() {
        return InterfaceC7014h.a.RED;
    }

    @Override // p350s4.InterfaceC7014h
    public int size() {
        return mo30629a().size() + 1 + mo30634g().size();
    }

    C7015i(Object obj, Object obj2, InterfaceC7014h interfaceC7014h, InterfaceC7014h interfaceC7014h2) {
        super(obj, obj2, interfaceC7014h, interfaceC7014h2);
    }
}
