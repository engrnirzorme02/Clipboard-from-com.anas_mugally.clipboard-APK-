package p158U4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p164V3.C1774s;

/* JADX INFO: renamed from: U4.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1692p {

    /* JADX INFO: renamed from: a */
    public static b f5608a = b.m7113a(0, a.f5610a);

    /* JADX INFO: renamed from: b */
    public static final Comparator f5609b = new Comparator() { // from class: U4.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1692p.m7104a((AbstractC1692p) obj, (AbstractC1692p) obj2);
        }
    };

    /* JADX INFO: renamed from: U4.p$a */
    public static abstract class a implements Comparable {

        /* JADX INFO: renamed from: a */
        public static final a f5610a = m7109h(C1698v.f5636b, C1687k.m7085h(), -1);

        /* JADX INFO: renamed from: b */
        public static final Comparator f5611b = new Comparator() { // from class: U4.o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC1692p.a.m7111k((C1694r) obj).compareTo(AbstractC1692p.a.m7111k((C1694r) obj2));
            }
        };

        /* JADX INFO: renamed from: h */
        public static a m7109h(C1698v c1698v, C1687k c1687k, int i7) {
            return new C1678b(c1698v, c1687k, i7);
        }

        /* JADX INFO: renamed from: j */
        public static a m7110j(C1698v c1698v, int i7) {
            long jM7438h = c1698v.m7155d().m7438h();
            int iM7437d = c1698v.m7155d().m7437d() + 1;
            return m7109h(new C1698v(((double) iM7437d) == 1.0E9d ? new C1774s(jM7438h + 1, 0) : new C1774s(jM7438h, iM7437d)), C1687k.m7085h(), i7);
        }

        /* JADX INFO: renamed from: k */
        public static a m7111k(InterfaceC1684h interfaceC1684h) {
            return m7109h(interfaceC1684h.mo7077f(), interfaceC1684h.getKey(), -1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int iCompareTo = mo7047o().compareTo(aVar.mo7047o());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = mo7045m().compareTo(aVar.mo7045m());
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(mo7046n(), aVar.mo7046n());
        }

        /* JADX INFO: renamed from: m */
        public abstract C1687k mo7045m();

        /* JADX INFO: renamed from: n */
        public abstract int mo7046n();

        /* JADX INFO: renamed from: o */
        public abstract C1698v mo7047o();
    }

    /* JADX INFO: renamed from: U4.p$b */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public static b m7113a(long j7, a aVar) {
            return new C1679c(j7, aVar);
        }

        /* JADX INFO: renamed from: b */
        public static b m7114b(long j7, C1698v c1698v, C1687k c1687k, int i7) {
            return m7113a(j7, a.m7109h(c1698v, c1687k, i7));
        }

        /* JADX INFO: renamed from: c */
        public abstract a mo7048c();

        /* JADX INFO: renamed from: d */
        public abstract long mo7049d();
    }

    /* JADX INFO: renamed from: U4.p$c */
    public static abstract class c implements Comparable {

        /* JADX INFO: renamed from: U4.p$c$a */
        public enum a {
            ASCENDING,
            DESCENDING,
            CONTAINS
        }

        /* JADX INFO: renamed from: d */
        public static c m7115d(C1693q c1693q, a aVar) {
            return new C1680d(c1693q, aVar);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int iCompareTo = mo7050h().compareTo(cVar.mo7050h());
            return iCompareTo != 0 ? iCompareTo : mo7051j().compareTo(cVar.mo7051j());
        }

        /* JADX INFO: renamed from: h */
        public abstract C1693q mo7050h();

        /* JADX INFO: renamed from: j */
        public abstract a mo7051j();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m7104a(AbstractC1692p abstractC1692p, AbstractC1692p abstractC1692p2) {
        int iCompareTo = abstractC1692p.mo7041d().compareTo(abstractC1692p2.mo7041d());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Iterator it = abstractC1692p.mo7044h().iterator();
        Iterator it2 = abstractC1692p2.mo7044h().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo2 = ((c) it.next()).compareTo((c) it2.next());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1692p m7105b(int i7, String str, List list, b bVar) {
        return new C1677a(i7, str, list, bVar);
    }

    /* JADX INFO: renamed from: c */
    public c m7106c() {
        for (c cVar : mo7044h()) {
            if (cVar.mo7051j().equals(c.a.CONTAINS)) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo7041d();

    /* JADX INFO: renamed from: e */
    public List m7107e() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : mo7044h()) {
            if (!cVar.mo7051j().equals(c.a.CONTAINS)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo7042f();

    /* JADX INFO: renamed from: g */
    public abstract b mo7043g();

    /* JADX INFO: renamed from: h */
    public abstract List mo7044h();
}
