package p137R4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import p158U4.C1687k;
import p158U4.C1693q;
import p158U4.C1696t;
import p158U4.InterfaceC1684h;

/* JADX INFO: renamed from: R4.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1343K {

    /* JADX INFO: renamed from: k */
    private static final C1342J f4679k;

    /* JADX INFO: renamed from: l */
    private static final C1342J f4680l;

    /* JADX INFO: renamed from: a */
    private final List f4681a;

    /* JADX INFO: renamed from: b */
    private List f4682b;

    /* JADX INFO: renamed from: c */
    private C1348P f4683c;

    /* JADX INFO: renamed from: d */
    private final List f4684d;

    /* JADX INFO: renamed from: e */
    private final C1696t f4685e;

    /* JADX INFO: renamed from: f */
    private final String f4686f;

    /* JADX INFO: renamed from: g */
    private final long f4687g;

    /* JADX INFO: renamed from: h */
    private final a f4688h;

    /* JADX INFO: renamed from: i */
    private final C1362i f4689i;

    /* JADX INFO: renamed from: j */
    private final C1362i f4690j;

    /* JADX INFO: renamed from: R4.K$a */
    public enum a {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    /* JADX INFO: renamed from: R4.K$b */
    private static class b implements Comparator {

        /* JADX INFO: renamed from: a */
        private final List f4694a;

        b(List list) {
            boolean z7;
            Iterator it = list.iterator();
            loop0: while (true) {
                z7 = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    } else {
                        z7 = (z7 || ((C1342J) it.next()).m5741c().equals(C1693q.f5616b)) ? true : z7;
                    }
                }
            }
            if (!z7) {
                throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
            }
            this.f4694a = list;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(InterfaceC1684h interfaceC1684h, InterfaceC1684h interfaceC1684h2) {
            Iterator it = this.f4694a.iterator();
            while (it.hasNext()) {
                int iM5739a = ((C1342J) it.next()).m5739a(interfaceC1684h, interfaceC1684h2);
                if (iM5739a != 0) {
                    return iM5739a;
                }
            }
            return 0;
        }
    }

    static {
        C1342J.a aVar = C1342J.a.ASCENDING;
        C1693q c1693q = C1693q.f5616b;
        f4679k = C1342J.m5738d(aVar, c1693q);
        f4680l = C1342J.m5738d(C1342J.a.DESCENDING, c1693q);
    }

    public C1343K(C1696t c1696t, String str, List list, List list2, long j7, a aVar, C1362i c1362i, C1362i c1362i2) {
        this.f4685e = c1696t;
        this.f4686f = str;
        this.f4681a = list2;
        this.f4684d = list;
        this.f4687g = j7;
        this.f4688h = aVar;
        this.f4689i = c1362i;
        this.f4690j = c1362i2;
    }

    /* JADX INFO: renamed from: b */
    public static C1343K m5744b(C1696t c1696t) {
        return new C1343K(c1696t, null);
    }

    /* JADX INFO: renamed from: t */
    private boolean m5745t(InterfaceC1684h interfaceC1684h) {
        C1362i c1362i = this.f4689i;
        if (c1362i != null && !c1362i.m5877f(m5759k(), interfaceC1684h)) {
            return false;
        }
        C1362i c1362i2 = this.f4690j;
        return c1362i2 == null || c1362i2.m5876e(m5759k(), interfaceC1684h);
    }

    /* JADX INFO: renamed from: u */
    private boolean m5746u(InterfaceC1684h interfaceC1684h) {
        Iterator it = this.f4684d.iterator();
        while (it.hasNext()) {
            if (!((AbstractC1370q) it.next()).mo5717d(interfaceC1684h)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    private boolean m5747v(InterfaceC1684h interfaceC1684h) {
        for (C1342J c1342j : m5759k()) {
            if (!c1342j.m5741c().equals(C1693q.f5616b) && interfaceC1684h.mo7078g(c1342j.f4674b) == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    private boolean m5748w(InterfaceC1684h interfaceC1684h) {
        C1696t c1696tM7095t = interfaceC1684h.getKey().m7095t();
        if (this.f4686f != null) {
            return interfaceC1684h.getKey().m7096v(this.f4686f) && this.f4685e.m7062t(c1696tM7095t);
        }
        if (C1687k.m7090w(this.f4685e)) {
            return this.f4685e.equals(c1696tM7095t);
        }
        return this.f4685e.m7062t(c1696tM7095t) && this.f4685e.m7063v() == c1696tM7095t.m7063v() - 1;
    }

    /* JADX INFO: renamed from: y */
    private synchronized C1348P m5749y(List list) {
        if (this.f4688h == a.LIMIT_TO_FIRST) {
            return new C1348P(m5760l(), m5752d(), m5755g(), list, this.f4687g, m5761m(), m5753e());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1342J c1342j = (C1342J) it.next();
            C1342J.a aVarM5740b = c1342j.m5740b();
            C1342J.a aVar = C1342J.a.DESCENDING;
            if (aVarM5740b == aVar) {
                aVar = C1342J.a.ASCENDING;
            }
            arrayList.add(C1342J.m5738d(aVar, c1342j.m5741c()));
        }
        C1362i c1362i = this.f4690j;
        C1362i c1362i2 = c1362i != null ? new C1362i(c1362i.m5873b(), this.f4690j.m5874c()) : null;
        C1362i c1362i3 = this.f4689i;
        return new C1348P(m5760l(), m5752d(), m5755g(), arrayList, this.f4687g, c1362i2, c1362i3 != null ? new C1362i(c1362i3.m5873b(), this.f4689i.m5874c()) : null);
    }

    /* JADX INFO: renamed from: a */
    public C1343K m5750a(C1696t c1696t) {
        return new C1343K(c1696t, null, this.f4684d, this.f4681a, this.f4687g, this.f4688h, this.f4689i, this.f4690j);
    }

    /* JADX INFO: renamed from: c */
    public Comparator m5751c() {
        return new b(m5759k());
    }

    /* JADX INFO: renamed from: d */
    public String m5752d() {
        return this.f4686f;
    }

    /* JADX INFO: renamed from: e */
    public C1362i m5753e() {
        return this.f4690j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1343K.class != obj.getClass()) {
            return false;
        }
        C1343K c1343k = (C1343K) obj;
        if (this.f4688h != c1343k.f4688h) {
            return false;
        }
        return m5768x().equals(c1343k.m5768x());
    }

    /* JADX INFO: renamed from: f */
    public List m5754f() {
        return this.f4681a;
    }

    /* JADX INFO: renamed from: g */
    public List m5755g() {
        return this.f4684d;
    }

    /* JADX INFO: renamed from: h */
    public SortedSet m5756h() {
        TreeSet treeSet = new TreeSet();
        Iterator it = m5755g().iterator();
        while (it.hasNext()) {
            for (C1369p c1369p : ((AbstractC1370q) it.next()).mo5892c()) {
                if (c1369p.m5925i()) {
                    treeSet.add(c1369p.m5922f());
                }
            }
        }
        return treeSet;
    }

    public int hashCode() {
        return (m5768x().hashCode() * 31) + this.f4688h.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public long m5757i() {
        return this.f4687g;
    }

    /* JADX INFO: renamed from: j */
    public a m5758j() {
        return this.f4688h;
    }

    /* JADX INFO: renamed from: k */
    public synchronized List m5759k() {
        C1342J.a aVarM5740b;
        try {
            if (this.f4682b == null) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (C1342J c1342j : this.f4681a) {
                    arrayList.add(c1342j);
                    hashSet.add(c1342j.f4674b.mo7057h());
                }
                if (this.f4681a.size() > 0) {
                    List list = this.f4681a;
                    aVarM5740b = ((C1342J) list.get(list.size() - 1)).m5740b();
                } else {
                    aVarM5740b = C1342J.a.ASCENDING;
                }
                for (C1693q c1693q : m5756h()) {
                    if (!hashSet.contains(c1693q.mo7057h()) && !c1693q.m7121B()) {
                        arrayList.add(C1342J.m5738d(aVarM5740b, c1693q));
                    }
                }
                if (!hashSet.contains(C1693q.f5616b.mo7057h())) {
                    arrayList.add(aVarM5740b.equals(C1342J.a.ASCENDING) ? f4679k : f4680l);
                }
                this.f4682b = Collections.unmodifiableList(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4682b;
    }

    /* JADX INFO: renamed from: l */
    public C1696t m5760l() {
        return this.f4685e;
    }

    /* JADX INFO: renamed from: m */
    public C1362i m5761m() {
        return this.f4689i;
    }

    /* JADX INFO: renamed from: n */
    public boolean m5762n() {
        return this.f4687g != -1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m5763o() {
        return this.f4686f != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m5764p() {
        return C1687k.m7090w(this.f4685e) && this.f4686f == null && this.f4684d.isEmpty();
    }

    /* JADX INFO: renamed from: q */
    public C1343K m5765q(long j7) {
        return new C1343K(this.f4685e, this.f4686f, this.f4684d, this.f4681a, j7, a.LIMIT_TO_FIRST, this.f4689i, this.f4690j);
    }

    /* JADX INFO: renamed from: r */
    public boolean m5766r(InterfaceC1684h interfaceC1684h) {
        return interfaceC1684h.mo7073b() && m5748w(interfaceC1684h) && m5747v(interfaceC1684h) && m5746u(interfaceC1684h) && m5745t(interfaceC1684h);
    }

    /* JADX INFO: renamed from: s */
    public boolean m5767s() {
        return this.f4684d.isEmpty() && this.f4687g == -1 && this.f4689i == null && this.f4690j == null && (m5754f().isEmpty() || (m5754f().size() == 1 && ((C1342J) m5754f().get(0)).f4674b.m7121B()));
    }

    public String toString() {
        return "Query(target=" + m5768x().toString() + ";limitType=" + this.f4688h.toString() + ")";
    }

    /* JADX INFO: renamed from: x */
    public synchronized C1348P m5768x() {
        try {
            if (this.f4683c == null) {
                this.f4683c = m5749y(m5759k());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4683c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1343K(C1696t c1696t, String str) {
        List list = Collections.EMPTY_LIST;
        this(c1696t, str, list, list, -1L, a.LIMIT_TO_FIRST, null, null);
    }
}
