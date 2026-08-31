package p030D4;

/* JADX INFO: renamed from: D4.q */
/* JADX INFO: loaded from: classes.dex */
public class C0213q extends AbstractC0204h {

    /* JADX INFO: renamed from: a */
    private static final C0213q f925a = new C0213q();

    private C0213q() {
    }

    /* JADX INFO: renamed from: j */
    public static C0213q m1089j() {
        return f925a;
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: c */
    public String mo1054c() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: e */
    public boolean mo1056e(InterfaceC0210n interfaceC0210n) {
        return !interfaceC0210n.mo1006i().isEmpty();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C0213q;
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: f */
    public C0209m mo1057f(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        return new C0209m(c0198b, new C0216t("[PRIORITY-POST]", interfaceC0210n));
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: g */
    public C0209m mo1058g() {
        return mo1057f(C0198b.m989k(), InterfaceC0210n.f920g);
    }

    public int hashCode() {
        return 3155577;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compare(C0209m c0209m, C0209m c0209m2) {
        return AbstractC0211o.m1087c(c0209m.m1082c(), c0209m.m1083d().mo1006i(), c0209m2.m1082c(), c0209m2.m1083d().mo1006i());
    }

    public String toString() {
        return "PriorityIndex";
    }
}
