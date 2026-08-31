package p168W0;

/* JADX INFO: renamed from: W0.g */
/* JADX INFO: loaded from: classes.dex */
public class C1805g {

    /* JADX INFO: renamed from: a */
    public final String f5869a;

    /* JADX INFO: renamed from: b */
    public final int f5870b;

    public C1805g(String str, int i7) {
        this.f5869a = str;
        this.f5870b = i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805g)) {
            return false;
        }
        C1805g c1805g = (C1805g) obj;
        if (this.f5870b != c1805g.f5870b) {
            return false;
        }
        return this.f5869a.equals(c1805g.f5869a);
    }

    public int hashCode() {
        return (this.f5869a.hashCode() * 31) + this.f5870b;
    }
}
