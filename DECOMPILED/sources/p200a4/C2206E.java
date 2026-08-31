package p200a4;

/* JADX INFO: renamed from: a4.E */
/* JADX INFO: loaded from: classes.dex */
public final class C2206E {

    /* JADX INFO: renamed from: a */
    private final Class f7139a;

    /* JADX INFO: renamed from: b */
    private final Class f7140b;

    /* JADX INFO: renamed from: a4.E$a */
    private @interface a {
    }

    public C2206E(Class cls, Class cls2) {
        this.f7139a = cls;
        this.f7140b = cls2;
    }

    /* JADX INFO: renamed from: a */
    public static C2206E m8951a(Class cls, Class cls2) {
        return new C2206E(cls, cls2);
    }

    /* JADX INFO: renamed from: b */
    public static C2206E m8952b(Class cls) {
        return new C2206E(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2206E.class != obj.getClass()) {
            return false;
        }
        C2206E c2206e = (C2206E) obj;
        if (this.f7140b.equals(c2206e.f7140b)) {
            return this.f7139a.equals(c2206e.f7139a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f7140b.hashCode() * 31) + this.f7139a.hashCode();
    }

    public String toString() {
        if (this.f7139a == a.class) {
            return this.f7140b.getName();
        }
        return "@" + this.f7139a.getName() + " " + this.f7140b.getName();
    }
}
