package p200a4;

/* JADX INFO: renamed from: a4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2224q {

    /* JADX INFO: renamed from: a */
    private final C2206E f7196a;

    /* JADX INFO: renamed from: b */
    private final int f7197b;

    /* JADX INFO: renamed from: c */
    private final int f7198c;

    private C2224q(Class cls, int i7, int i8) {
        this(C2206E.m8952b(cls), i7, i8);
    }

    /* JADX INFO: renamed from: a */
    public static C2224q m9027a(Class cls) {
        return new C2224q(cls, 0, 2);
    }

    /* JADX INFO: renamed from: b */
    private static String m9028b(int i7) {
        if (i7 == 0) {
            return "direct";
        }
        if (i7 == 1) {
            return "provider";
        }
        if (i7 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i7);
    }

    /* JADX INFO: renamed from: h */
    public static C2224q m9029h(Class cls) {
        return new C2224q(cls, 0, 0);
    }

    /* JADX INFO: renamed from: i */
    public static C2224q m9030i(C2206E c2206e) {
        return new C2224q(c2206e, 0, 1);
    }

    /* JADX INFO: renamed from: j */
    public static C2224q m9031j(Class cls) {
        return new C2224q(cls, 0, 1);
    }

    /* JADX INFO: renamed from: k */
    public static C2224q m9032k(C2206E c2206e) {
        return new C2224q(c2206e, 1, 0);
    }

    /* JADX INFO: renamed from: l */
    public static C2224q m9033l(Class cls) {
        return new C2224q(cls, 1, 0);
    }

    /* JADX INFO: renamed from: m */
    public static C2224q m9034m(C2206E c2206e) {
        return new C2224q(c2206e, 1, 1);
    }

    /* JADX INFO: renamed from: n */
    public static C2224q m9035n(Class cls) {
        return new C2224q(cls, 1, 1);
    }

    /* JADX INFO: renamed from: o */
    public static C2224q m9036o(Class cls) {
        return new C2224q(cls, 2, 0);
    }

    /* JADX INFO: renamed from: c */
    public C2206E m9037c() {
        return this.f7196a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m9038d() {
        return this.f7198c == 2;
    }

    /* JADX INFO: renamed from: e */
    public boolean m9039e() {
        return this.f7198c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2224q) {
            C2224q c2224q = (C2224q) obj;
            if (this.f7196a.equals(c2224q.f7196a) && this.f7197b == c2224q.f7197b && this.f7198c == c2224q.f7198c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m9040f() {
        return this.f7197b == 1;
    }

    /* JADX INFO: renamed from: g */
    public boolean m9041g() {
        return this.f7197b == 2;
    }

    public int hashCode() {
        return ((((this.f7196a.hashCode() ^ 1000003) * 1000003) ^ this.f7197b) * 1000003) ^ this.f7198c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f7196a);
        sb.append(", type=");
        int i7 = this.f7197b;
        if (i7 == 1) {
            str = "required";
        } else {
            str = i7 == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(m9028b(this.f7198c));
        sb.append("}");
        return sb.toString();
    }

    private C2224q(C2206E c2206e, int i7, int i8) {
        this.f7196a = (C2206E) AbstractC2205D.m8949c(c2206e, "Null dependency anInterface.");
        this.f7197b = i7;
        this.f7198c = i8;
    }
}
