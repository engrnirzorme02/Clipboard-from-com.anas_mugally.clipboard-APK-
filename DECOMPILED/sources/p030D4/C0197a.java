package p030D4;

/* JADX INFO: renamed from: D4.a */
/* JADX INFO: loaded from: classes.dex */
public class C0197a extends AbstractC0207k {

    /* JADX INFO: renamed from: c */
    private final boolean f872c;

    public C0197a(Boolean bool, InterfaceC0210n interfaceC0210n) {
        super(interfaceC0210n);
        this.f872c = bool.booleanValue();
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: L */
    public String mo982L(InterfaceC0210n.b bVar) {
        return m1075p(bVar) + "boolean:" + this.f872c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0197a)) {
            return false;
        }
        C0197a c0197a = (C0197a) obj;
        return this.f872c == c0197a.f872c && this.f907a.equals(c0197a.f907a);
    }

    @Override // p030D4.InterfaceC0210n
    public Object getValue() {
        return Boolean.valueOf(this.f872c);
    }

    public int hashCode() {
        boolean z7 = this.f872c;
        return (z7 ? 1 : 0) + this.f907a.hashCode();
    }

    @Override // p030D4.AbstractC0207k
    /* JADX INFO: renamed from: n */
    protected AbstractC0207k.b mo984n() {
        return AbstractC0207k.b.Boolean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p030D4.AbstractC0207k
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo983j(C0197a c0197a) {
        boolean z7 = this.f872c;
        if (z7 == c0197a.f872c) {
            return 0;
        }
        return z7 ? 1 : -1;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C0197a mo981G(InterfaceC0210n interfaceC0210n) {
        return new C0197a(Boolean.valueOf(this.f872c), interfaceC0210n);
    }
}
