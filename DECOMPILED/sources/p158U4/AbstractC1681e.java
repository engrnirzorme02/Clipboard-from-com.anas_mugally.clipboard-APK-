package p158U4;

import java.util.ArrayList;
import java.util.List;
import p186Y4.AbstractC2032B;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: U4.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1681e implements Comparable {

    /* JADX INFO: renamed from: a */
    final List f5596a;

    AbstractC1681e(List list) {
        this.f5596a = list;
    }

    /* JADX INFO: renamed from: j */
    private static int m7052j(String str, String str2) {
        boolean zM7054q = m7054q(str);
        boolean zM7054q2 = m7054q(str2);
        if (zM7054q && !zM7054q2) {
            return -1;
        }
        if (zM7054q || !zM7054q2) {
            return (zM7054q && zM7054q2) ? Long.compare(m7053n(str), m7053n(str2)) : AbstractC2032B.m8447l(str, str2);
        }
        return 1;
    }

    /* JADX INFO: renamed from: n */
    private static long m7053n(String str) {
        return Long.parseLong(str.substring(4, str.length() - 2));
    }

    /* JADX INFO: renamed from: q */
    private static boolean m7054q(String str) {
        return str.startsWith("__id") && str.endsWith("__");
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1681e m7055c(AbstractC1681e abstractC1681e) {
        ArrayList arrayList = new ArrayList(this.f5596a);
        arrayList.addAll(abstractC1681e.f5596a);
        return mo7059m(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public AbstractC1681e m7056d(String str) {
        ArrayList arrayList = new ArrayList(this.f5596a);
        arrayList.add(str);
        return mo7059m(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC1681e) && compareTo((AbstractC1681e) obj) == 0;
    }

    /* JADX INFO: renamed from: h */
    public abstract String mo7057h();

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.f5596a.hashCode();
    }

    public boolean isEmpty() {
        return m7063v() == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC1681e abstractC1681e) {
        int iM7063v = m7063v();
        int iM7063v2 = abstractC1681e.m7063v();
        for (int i7 = 0; i7 < iM7063v && i7 < iM7063v2; i7++) {
            int iM7052j = m7052j(m7061p(i7), abstractC1681e.m7061p(i7));
            if (iM7052j != 0) {
                return iM7052j;
            }
        }
        return Integer.compare(iM7063v, iM7063v2);
    }

    /* JADX INFO: renamed from: m */
    abstract AbstractC1681e mo7059m(List list);

    /* JADX INFO: renamed from: o */
    public String m7060o() {
        return (String) this.f5596a.get(m7063v() - 1);
    }

    /* JADX INFO: renamed from: p */
    public String m7061p(int i7) {
        return (String) this.f5596a.get(i7);
    }

    /* JADX INFO: renamed from: t */
    public boolean m7062t(AbstractC1681e abstractC1681e) {
        if (m7063v() > abstractC1681e.m7063v()) {
            return false;
        }
        for (int i7 = 0; i7 < m7063v(); i7++) {
            if (!m7061p(i7).equals(abstractC1681e.m7061p(i7))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return mo7057h();
    }

    /* JADX INFO: renamed from: v */
    public int m7063v() {
        return this.f5596a.size();
    }

    /* JADX INFO: renamed from: w */
    public AbstractC1681e m7064w(int i7) {
        int iM7063v = m7063v();
        AbstractC2034b.m8460d(iM7063v >= i7, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i7), Integer.valueOf(iM7063v));
        return mo7059m(this.f5596a.subList(i7, iM7063v));
    }

    /* JADX INFO: renamed from: x */
    public AbstractC1681e m7065x() {
        return mo7059m(this.f5596a.subList(0, m7063v() - 1));
    }
}
