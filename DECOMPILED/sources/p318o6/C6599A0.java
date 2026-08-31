package p318o6;

/* JADX INFO: renamed from: o6.A0 */
/* JADX INFO: loaded from: classes.dex */
public class C6599A0 extends C6607E0 implements InterfaceC6598A {

    /* JADX INFO: renamed from: c */
    private final boolean f24867c;

    public C6599A0(InterfaceC6701y0 interfaceC6701y0) {
        super(true);
        m28029Y(interfaceC6701y0);
        this.f24867c = m27937I0();
    }

    /* JADX INFO: renamed from: I0 */
    private final boolean m27937I0() {
        C6607E0 c6607e0M27973u;
        InterfaceC6692u interfaceC6692uM28025S = m28025S();
        C6694v c6694v = interfaceC6692uM28025S instanceof C6694v ? (C6694v) interfaceC6692uM28025S : null;
        if (c6694v != null && (c6607e0M27973u = c6694v.m27973u()) != null) {
            while (!c6607e0M27973u.mo27938N()) {
                InterfaceC6692u interfaceC6692uM28025S2 = c6607e0M27973u.m28025S();
                C6694v c6694v2 = interfaceC6692uM28025S2 instanceof C6694v ? (C6694v) interfaceC6692uM28025S2 : null;
                if (c6694v2 == null || (c6607e0M27973u = c6694v2.m27973u()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: N */
    public boolean mo27938N() {
        return this.f24867c;
    }

    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: P */
    public boolean mo27939P() {
        return true;
    }
}
