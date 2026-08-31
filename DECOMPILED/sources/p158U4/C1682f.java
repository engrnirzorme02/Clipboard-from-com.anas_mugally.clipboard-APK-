package p158U4;

import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: U4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1682f implements Comparable {

    /* JADX INFO: renamed from: c */
    public static final C1682f f5597c = m7066d("", "");

    /* JADX INFO: renamed from: a */
    private final String f5598a;

    /* JADX INFO: renamed from: b */
    private final String f5599b;

    private C1682f(String str, String str2) {
        this.f5598a = str;
        this.f5599b = str2;
    }

    /* JADX INFO: renamed from: d */
    public static C1682f m7066d(String str, String str2) {
        return new C1682f(str, str2);
    }

    /* JADX INFO: renamed from: h */
    public static C1682f m7067h(String str) {
        C1696t c1696tM7147A = C1696t.m7147A(str);
        boolean z7 = false;
        if (c1696tM7147A.m7063v() > 3 && c1696tM7147A.m7061p(0).equals("projects") && c1696tM7147A.m7061p(2).equals("databases")) {
            z7 = true;
        }
        AbstractC2034b.m8460d(z7, "Tried to parse an invalid resource name: %s", c1696tM7147A);
        return new C1682f(c1696tM7147A.m7061p(1), c1696tM7147A.m7061p(3));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1682f c1682f) {
        int iCompareTo = this.f5598a.compareTo(c1682f.f5598a);
        return iCompareTo != 0 ? iCompareTo : this.f5599b.compareTo(c1682f.f5599b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1682f.class == obj.getClass()) {
            C1682f c1682f = (C1682f) obj;
            if (this.f5598a.equals(c1682f.f5598a) && this.f5599b.equals(c1682f.f5599b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f5598a.hashCode() * 31) + this.f5599b.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public String m7069j() {
        return this.f5599b;
    }

    /* JADX INFO: renamed from: k */
    public String m7070k() {
        return this.f5598a;
    }

    public String toString() {
        return "DatabaseId(" + this.f5598a + ", " + this.f5599b + ")";
    }
}
