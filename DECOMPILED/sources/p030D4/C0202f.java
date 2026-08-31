package p030D4;

import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: D4.f */
/* JADX INFO: loaded from: classes.dex */
public class C0202f extends AbstractC0207k {

    /* JADX INFO: renamed from: c */
    private final Double f900c;

    public C0202f(Double d7, InterfaceC0210n interfaceC0210n) {
        super(interfaceC0210n);
        this.f900c = d7;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: L */
    public String mo982L(InterfaceC0210n.b bVar) {
        return (m1075p(bVar) + "number:") + AbstractC7551l.m33230c(this.f900c.doubleValue());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0202f)) {
            return false;
        }
        C0202f c0202f = (C0202f) obj;
        return this.f900c.equals(c0202f.f900c) && this.f907a.equals(c0202f.f907a);
    }

    @Override // p030D4.InterfaceC0210n
    public Object getValue() {
        return this.f900c;
    }

    public int hashCode() {
        return this.f900c.hashCode() + this.f907a.hashCode();
    }

    @Override // p030D4.AbstractC0207k
    /* JADX INFO: renamed from: n */
    protected AbstractC0207k.b mo984n() {
        return AbstractC0207k.b.Number;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p030D4.AbstractC0207k
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo983j(C0202f c0202f) {
        return this.f900c.compareTo(c0202f.f900c);
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C0202f mo981G(InterfaceC0210n interfaceC0210n) {
        AbstractC7551l.m33233f(AbstractC0214r.m1092b(interfaceC0210n));
        return new C0202f(this.f900c, interfaceC0210n);
    }
}
