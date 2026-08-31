package p168W0;

/* JADX INFO: renamed from: W0.d */
/* JADX INFO: loaded from: classes.dex */
public class C1802d {

    /* JADX INFO: renamed from: a */
    public String f5864a;

    /* JADX INFO: renamed from: b */
    public Long f5865b;

    public C1802d(String str, boolean z7) {
        this(str, z7 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1802d)) {
            return false;
        }
        C1802d c1802d = (C1802d) obj;
        if (!this.f5864a.equals(c1802d.f5864a)) {
            return false;
        }
        Long l7 = this.f5865b;
        Long l8 = c1802d.f5865b;
        if (l7 != null) {
            return l7.equals(l8);
        }
        return l8 == null;
    }

    public int hashCode() {
        int iHashCode = this.f5864a.hashCode() * 31;
        Long l7 = this.f5865b;
        return iHashCode + (l7 != null ? l7.hashCode() : 0);
    }

    public C1802d(String str, long j7) {
        this.f5864a = str;
        this.f5865b = Long.valueOf(j7);
    }
}
