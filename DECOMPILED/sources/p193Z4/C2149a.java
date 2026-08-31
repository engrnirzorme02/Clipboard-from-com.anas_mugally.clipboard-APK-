package p193Z4;

import java.util.List;

/* JADX INFO: renamed from: Z4.a */
/* JADX INFO: loaded from: classes.dex */
final class C2149a extends AbstractC2165q {

    /* JADX INFO: renamed from: a */
    private final String f6999a;

    /* JADX INFO: renamed from: b */
    private final List f7000b;

    C2149a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f6999a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f7000b = list;
    }

    @Override // p193Z4.AbstractC2165q
    /* JADX INFO: renamed from: b */
    public List mo8754b() {
        return this.f7000b;
    }

    @Override // p193Z4.AbstractC2165q
    /* JADX INFO: renamed from: c */
    public String mo8755c() {
        return this.f6999a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2165q) {
            AbstractC2165q abstractC2165q = (AbstractC2165q) obj;
            if (this.f6999a.equals(abstractC2165q.mo8755c()) && this.f7000b.equals(abstractC2165q.mo8754b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6999a.hashCode() ^ 1000003) * 1000003) ^ this.f7000b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f6999a + ", usedDates=" + this.f7000b + "}";
    }
}
