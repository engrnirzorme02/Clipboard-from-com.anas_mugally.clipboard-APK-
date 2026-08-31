package p030D4;

import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: D4.j */
/* JADX INFO: loaded from: classes.dex */
public class C0206j extends AbstractC0204h {

    /* JADX INFO: renamed from: a */
    private static final C0206j f906a = new C0206j();

    private C0206j() {
    }

    /* JADX INFO: renamed from: j */
    public static C0206j m1071j() {
        return f906a;
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: c */
    public String mo1054c() {
        return ".key";
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: e */
    public boolean mo1056e(InterfaceC0210n interfaceC0210n) {
        return true;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C0206j;
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: f */
    public C0209m mo1057f(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        AbstractC7551l.m33233f(interfaceC0210n instanceof C0216t);
        return new C0209m(C0198b.m988j((String) interfaceC0210n.getValue()), C0203g.m1050w());
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: g */
    public C0209m mo1058g() {
        return C0209m.m1080a();
    }

    public int hashCode() {
        return 37;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compare(C0209m c0209m, C0209m c0209m2) {
        return c0209m.m1082c().compareTo(c0209m2.m1082c());
    }

    public String toString() {
        return "KeyIndex";
    }
}
