package p030D4;

/* JADX INFO: renamed from: D4.u */
/* JADX INFO: loaded from: classes.dex */
public class C0217u extends AbstractC0204h {

    /* JADX INFO: renamed from: a */
    private static final C0217u f931a = new C0217u();

    private C0217u() {
    }

    /* JADX INFO: renamed from: j */
    public static C0217u m1099j() {
        return f931a;
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: c */
    public String mo1054c() {
        return ".value";
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: e */
    public boolean mo1056e(InterfaceC0210n interfaceC0210n) {
        return true;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C0217u;
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: f */
    public C0209m mo1057f(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        return new C0209m(c0198b, interfaceC0210n);
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: g */
    public C0209m mo1058g() {
        return new C0209m(C0198b.m989k(), InterfaceC0210n.f920g);
    }

    public int hashCode() {
        return 4;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compare(C0209m c0209m, C0209m c0209m2) {
        int iCompareTo = c0209m.m1083d().compareTo(c0209m2.m1083d());
        return iCompareTo == 0 ? c0209m.m1082c().compareTo(c0209m2.m1082c()) : iCompareTo;
    }

    public String toString() {
        return "ValueIndex";
    }
}
