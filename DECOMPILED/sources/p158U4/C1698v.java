package p158U4;

import p164V3.C1774s;

/* JADX INFO: renamed from: U4.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1698v implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final C1698v f5636b = new C1698v(new C1774s(0, 0));

    /* JADX INFO: renamed from: a */
    private final C1774s f5637a;

    public C1698v(C1774s c1774s) {
        this.f5637a = c1774s;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1698v c1698v) {
        return this.f5637a.compareTo(c1698v.f5637a);
    }

    /* JADX INFO: renamed from: d */
    public C1774s m7155d() {
        return this.f5637a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1698v) && compareTo((C1698v) obj) == 0;
    }

    public int hashCode() {
        return m7155d().hashCode();
    }

    public String toString() {
        return "SnapshotVersion(seconds=" + this.f5637a.m7438h() + ", nanos=" + this.f5637a.m7437d() + ")";
    }
}
