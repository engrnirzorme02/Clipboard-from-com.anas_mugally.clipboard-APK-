package p165V4;

import p158U4.C1694r;
import p158U4.C1698v;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: V4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1787m {

    /* JADX INFO: renamed from: c */
    public static final C1787m f5852c = new C1787m(null, null);

    /* JADX INFO: renamed from: a */
    private final C1698v f5853a;

    /* JADX INFO: renamed from: b */
    private final Boolean f5854b;

    private C1787m(C1698v c1698v, Boolean bool) {
        AbstractC2034b.m8460d(c1698v == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f5853a = c1698v;
        this.f5854b = bool;
    }

    /* JADX INFO: renamed from: a */
    public static C1787m m7495a(boolean z7) {
        return new C1787m(null, Boolean.valueOf(z7));
    }

    /* JADX INFO: renamed from: f */
    public static C1787m m7496f(C1698v c1698v) {
        return new C1787m(c1698v, null);
    }

    /* JADX INFO: renamed from: b */
    public Boolean m7497b() {
        return this.f5854b;
    }

    /* JADX INFO: renamed from: c */
    public C1698v m7498c() {
        return this.f5853a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m7499d() {
        return this.f5853a == null && this.f5854b == null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m7500e(C1694r c1694r) {
        if (this.f5853a != null) {
            return c1694r.mo7073b() && c1694r.mo7081j().equals(this.f5853a);
        }
        Boolean bool = this.f5854b;
        if (bool != null) {
            return bool.booleanValue() == c1694r.mo7073b();
        }
        AbstractC2034b.m8460d(m7499d(), "Precondition should be empty", new Object[0]);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1787m.class == obj.getClass()) {
            C1787m c1787m = (C1787m) obj;
            C1698v c1698v = this.f5853a;
            if (c1698v == null ? c1787m.f5853a != null : !c1698v.equals(c1787m.f5853a)) {
                return false;
            }
            Boolean bool = this.f5854b;
            Boolean bool2 = c1787m.f5854b;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C1698v c1698v = this.f5853a;
        int iHashCode = (c1698v != null ? c1698v.hashCode() : 0) * 31;
        Boolean bool = this.f5854b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        if (m7499d()) {
            return "Precondition{<none>}";
        }
        if (this.f5853a != null) {
            return "Precondition{updateTime=" + this.f5853a + "}";
        }
        if (this.f5854b == null) {
            throw AbstractC2034b.m8457a("Invalid Precondition", new Object[0]);
        }
        return "Precondition{exists=" + this.f5854b + "}";
    }
}
