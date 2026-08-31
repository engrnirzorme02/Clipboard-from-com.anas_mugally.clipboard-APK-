package p030D4;

/* JADX INFO: renamed from: D4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0209m {

    /* JADX INFO: renamed from: c */
    private static final C0209m f916c = new C0209m(C0198b.m990m(), C0203g.m1050w());

    /* JADX INFO: renamed from: d */
    private static final C0209m f917d = new C0209m(C0198b.m989k(), InterfaceC0210n.f920g);

    /* JADX INFO: renamed from: a */
    private final C0198b f918a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0210n f919b;

    public C0209m(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        this.f918a = c0198b;
        this.f919b = interfaceC0210n;
    }

    /* JADX INFO: renamed from: a */
    public static C0209m m1080a() {
        return f917d;
    }

    /* JADX INFO: renamed from: b */
    public static C0209m m1081b() {
        return f916c;
    }

    /* JADX INFO: renamed from: c */
    public C0198b m1082c() {
        return this.f918a;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0210n m1083d() {
        return this.f919b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0209m.class != obj.getClass()) {
            return false;
        }
        C0209m c0209m = (C0209m) obj;
        return this.f918a.equals(c0209m.f918a) && this.f919b.equals(c0209m.f919b);
    }

    public int hashCode() {
        return (this.f918a.hashCode() * 31) + this.f919b.hashCode();
    }

    public String toString() {
        return "NamedNode{name=" + this.f918a + ", node=" + this.f919b + '}';
    }
}
