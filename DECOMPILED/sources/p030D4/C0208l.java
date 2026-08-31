package p030D4;

import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: D4.l */
/* JADX INFO: loaded from: classes.dex */
public class C0208l extends AbstractC0207k {

    /* JADX INFO: renamed from: c */
    private final long f915c;

    public C0208l(Long l7, InterfaceC0210n interfaceC0210n) {
        super(interfaceC0210n);
        this.f915c = l7.longValue();
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: L */
    public String mo982L(InterfaceC0210n.b bVar) {
        return (m1075p(bVar) + "number:") + AbstractC7551l.m33230c(this.f915c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0208l)) {
            return false;
        }
        C0208l c0208l = (C0208l) obj;
        return this.f915c == c0208l.f915c && this.f907a.equals(c0208l.f907a);
    }

    @Override // p030D4.InterfaceC0210n
    public Object getValue() {
        return Long.valueOf(this.f915c);
    }

    public int hashCode() {
        long j7 = this.f915c;
        return ((int) (j7 ^ (j7 >>> 32))) + this.f907a.hashCode();
    }

    @Override // p030D4.AbstractC0207k
    /* JADX INFO: renamed from: n */
    protected AbstractC0207k.b mo984n() {
        return AbstractC0207k.b.Number;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p030D4.AbstractC0207k
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo983j(C0208l c0208l) {
        return AbstractC7551l.m33229b(this.f915c, c0208l.f915c);
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C0208l mo981G(InterfaceC0210n interfaceC0210n) {
        return new C0208l(Long.valueOf(this.f915c), interfaceC0210n);
    }
}
