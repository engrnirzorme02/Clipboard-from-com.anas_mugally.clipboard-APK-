package p030D4;

import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: D4.t */
/* JADX INFO: loaded from: classes.dex */
public class C0216t extends AbstractC0207k {

    /* JADX INFO: renamed from: c */
    private final String f929c;

    /* JADX INFO: renamed from: D4.t$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f930a;

        static {
            int[] iArr = new int[InterfaceC0210n.b.values().length];
            f930a = iArr;
            try {
                iArr[InterfaceC0210n.b.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f930a[InterfaceC0210n.b.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C0216t(String str, InterfaceC0210n interfaceC0210n) {
        super(interfaceC0210n);
        this.f929c = str;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: L */
    public String mo982L(InterfaceC0210n.b bVar) {
        int i7 = a.f930a[bVar.ordinal()];
        if (i7 == 1) {
            return m1075p(bVar) + "string:" + this.f929c;
        }
        if (i7 != 2) {
            throw new IllegalArgumentException("Invalid hash version for string node: " + bVar);
        }
        return m1075p(bVar) + "string:" + AbstractC7551l.m33237j(this.f929c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0216t)) {
            return false;
        }
        C0216t c0216t = (C0216t) obj;
        return this.f929c.equals(c0216t.f929c) && this.f907a.equals(c0216t.f907a);
    }

    @Override // p030D4.InterfaceC0210n
    public Object getValue() {
        return this.f929c;
    }

    public int hashCode() {
        return this.f929c.hashCode() + this.f907a.hashCode();
    }

    @Override // p030D4.AbstractC0207k
    /* JADX INFO: renamed from: n */
    protected AbstractC0207k.b mo984n() {
        return AbstractC0207k.b.String;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p030D4.AbstractC0207k
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo983j(C0216t c0216t) {
        return this.f929c.compareTo(c0216t.f929c);
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C0216t mo981G(InterfaceC0210n interfaceC0210n) {
        return new C0216t(this.f929c, interfaceC0210n);
    }
}
