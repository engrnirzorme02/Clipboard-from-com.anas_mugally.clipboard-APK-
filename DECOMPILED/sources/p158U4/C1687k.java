package p158U4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p186Y4.AbstractC2034b;
import p350s4.C7011e;

/* JADX INFO: renamed from: U4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1687k implements Comparable {

    /* JADX INFO: renamed from: b */
    private static final Comparator f5602b;

    /* JADX INFO: renamed from: c */
    private static final C7011e f5603c;

    /* JADX INFO: renamed from: a */
    private final C1696t f5604a;

    static {
        Comparator comparator = new Comparator() { // from class: U4.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C1687k) obj).compareTo((C1687k) obj2);
            }
        };
        f5602b = comparator;
        f5603c = new C7011e(Collections.EMPTY_LIST, comparator);
    }

    private C1687k(C1696t c1696t) {
        AbstractC2034b.m8460d(m7090w(c1696t), "Not a document key path: %s", c1696t);
        this.f5604a = c1696t;
    }

    /* JADX INFO: renamed from: c */
    public static Comparator m7084c() {
        return f5602b;
    }

    /* JADX INFO: renamed from: h */
    public static C1687k m7085h() {
        return m7089n(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: j */
    public static C7011e m7086j() {
        return f5603c;
    }

    /* JADX INFO: renamed from: k */
    public static C1687k m7087k(String str) {
        C1696t c1696tM7147A = C1696t.m7147A(str);
        boolean z7 = false;
        if (c1696tM7147A.m7063v() > 4 && c1696tM7147A.m7061p(0).equals("projects") && c1696tM7147A.m7061p(2).equals("databases") && c1696tM7147A.m7061p(4).equals("documents")) {
            z7 = true;
        }
        AbstractC2034b.m8460d(z7, "Tried to parse an invalid key: %s", c1696tM7147A);
        return m7088m((C1696t) c1696tM7147A.m7064w(5));
    }

    /* JADX INFO: renamed from: m */
    public static C1687k m7088m(C1696t c1696t) {
        return new C1687k(c1696t);
    }

    /* JADX INFO: renamed from: n */
    public static C1687k m7089n(List list) {
        return new C1687k(C1696t.m7148z(list));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m7090w(C1696t c1696t) {
        return c1696t.m7063v() % 2 == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1687k c1687k) {
        return this.f5604a.compareTo(c1687k.f5604a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1687k.class != obj.getClass()) {
            return false;
        }
        return this.f5604a.equals(((C1687k) obj).f5604a);
    }

    public int hashCode() {
        return this.f5604a.hashCode();
    }

    /* JADX INFO: renamed from: o */
    public String m7092o() {
        C1696t c1696t = this.f5604a;
        return c1696t.m7061p(c1696t.m7063v() - 2);
    }

    /* JADX INFO: renamed from: p */
    public C1696t m7093p() {
        return (C1696t) this.f5604a.m7065x();
    }

    /* JADX INFO: renamed from: q */
    public String m7094q() {
        return this.f5604a.m7060o();
    }

    /* JADX INFO: renamed from: t */
    public C1696t m7095t() {
        return this.f5604a;
    }

    public String toString() {
        return this.f5604a.toString();
    }

    /* JADX INFO: renamed from: v */
    public boolean m7096v(String str) {
        if (this.f5604a.m7063v() < 2) {
            return false;
        }
        C1696t c1696t = this.f5604a;
        return ((String) c1696t.f5596a.get(c1696t.m7063v() - 2)).equals(str);
    }
}
