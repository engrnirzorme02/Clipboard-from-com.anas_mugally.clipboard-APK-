package p104N;

/* JADX INFO: renamed from: N.c */
/* JADX INFO: loaded from: classes.dex */
public class C0906c {

    /* JADX INFO: renamed from: a */
    public final Object f3546a;

    /* JADX INFO: renamed from: b */
    public final Object f3547b;

    public C0906c(Object obj, Object obj2) {
        this.f3546a = obj;
        this.f3547b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public static C0906c m4129a(Object obj, Object obj2) {
        return new C0906c(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0906c)) {
            return false;
        }
        C0906c c0906c = (C0906c) obj;
        return AbstractC0905b.m4125a(c0906c.f3546a, this.f3546a) && AbstractC0905b.m4125a(c0906c.f3547b, this.f3547b);
    }

    public int hashCode() {
        Object obj = this.f3546a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3547b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f3546a + " " + this.f3547b + "}";
    }
}
