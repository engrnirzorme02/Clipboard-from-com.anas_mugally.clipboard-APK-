package p198a2;

/* JADX INFO: renamed from: a2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2187c {

    /* JADX INFO: renamed from: a */
    private final String f7120a;

    private C2187c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f7120a = str;
    }

    /* JADX INFO: renamed from: b */
    public static C2187c m8925b(String str) {
        return new C2187c(str);
    }

    /* JADX INFO: renamed from: a */
    public String m8926a() {
        return this.f7120a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2187c) {
            return this.f7120a.equals(((C2187c) obj).f7120a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7120a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f7120a + "\"}";
    }
}
