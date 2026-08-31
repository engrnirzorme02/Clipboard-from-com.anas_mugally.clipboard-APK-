package p398y4;

/* JADX INFO: renamed from: y4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7546g {

    /* JADX INFO: renamed from: a */
    private final Object f30191a;

    /* JADX INFO: renamed from: b */
    private final Object f30192b;

    public C7546g(Object obj, Object obj2) {
        this.f30191a = obj;
        this.f30192b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public Object m33211a() {
        return this.f30191a;
    }

    /* JADX INFO: renamed from: b */
    public Object m33212b() {
        return this.f30192b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7546g.class != obj.getClass()) {
            return false;
        }
        C7546g c7546g = (C7546g) obj;
        Object obj2 = this.f30191a;
        if (obj2 == null ? c7546g.f30191a != null : !obj2.equals(c7546g.f30191a)) {
            return false;
        }
        Object obj3 = this.f30192b;
        Object obj4 = c7546g.f30192b;
        return obj3 == null ? obj4 == null : obj3.equals(obj4);
    }

    public int hashCode() {
        Object obj = this.f30191a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f30192b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair(" + this.f30191a + "," + this.f30192b + ")";
    }
}
