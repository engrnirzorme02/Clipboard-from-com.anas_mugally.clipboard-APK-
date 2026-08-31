package p179X4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p137R4.C1348P;
import p137R4.C1366m;
import p151T4.C1477B1;
import p151T4.EnumC1529b0;
import p158U4.C1682f;
import p158U4.C1687k;
import p158U4.C1694r;
import p158U4.C1698v;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p350s4.C7011e;
import p351s5.C7022d;

/* JADX INFO: renamed from: X4.W */
/* JADX INFO: loaded from: classes.dex */
public class C1975W {

    /* JADX INFO: renamed from: a */
    private final c f6537a;

    /* JADX INFO: renamed from: b */
    private final Map f6538b = new HashMap();

    /* JADX INFO: renamed from: c */
    private Map f6539c = new HashMap();

    /* JADX INFO: renamed from: d */
    private Map f6540d = new HashMap();

    /* JADX INFO: renamed from: e */
    private Map f6541e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final C1682f f6542f;

    /* JADX INFO: renamed from: X4.W$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6543a;

        static {
            int[] iArr = new int[AbstractC1974V.e.values().length];
            f6543a = iArr;
            try {
                iArr[AbstractC1974V.e.NoChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6543a[AbstractC1974V.e.Added.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6543a[AbstractC1974V.e.Removed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6543a[AbstractC1974V.e.Current.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6543a[AbstractC1974V.e.Reset.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: X4.W$b */
    enum b {
        SUCCESS,
        SKIPPED,
        FALSE_POSITIVE
    }

    /* JADX INFO: renamed from: X4.W$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        C1477B1 mo8212a(int i7);

        /* JADX INFO: renamed from: b */
        C7011e mo8213b(int i7);
    }

    public C1975W(C1682f c1682f, c cVar) {
        this.f6542f = c1682f;
        this.f6537a = cVar;
    }

    /* JADX INFO: renamed from: a */
    private void m8268a(int i7, C1694r c1694r) {
        if (m8275l(i7)) {
            m8271e(i7).m8230a(c1694r.getKey(), m8280s(i7, c1694r.getKey()) ? C1366m.a.MODIFIED : C1366m.a.ADDED);
            this.f6539c.put(c1694r.getKey(), c1694r);
            m8270d(c1694r.getKey()).add(Integer.valueOf(i7));
        }
    }

    /* JADX INFO: renamed from: b */
    private b m8269b(C1990m c1990m, AbstractC1974V.c cVar, int i7) {
        return cVar.m8261a().m8353a() == i7 - m8272f(c1990m, cVar.m8262b()) ? b.SUCCESS : b.FALSE_POSITIVE;
    }

    /* JADX INFO: renamed from: d */
    private Set m8270d(C1687k c1687k) {
        Set set = (Set) this.f6540d.get(c1687k);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.f6540d.put(c1687k, hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: e */
    private C1972T m8271e(int i7) {
        C1972T c1972t = (C1972T) this.f6538b.get(Integer.valueOf(i7));
        if (c1972t != null) {
            return c1972t;
        }
        C1972T c1972t2 = new C1972T();
        this.f6538b.put(Integer.valueOf(i7), c1972t2);
        return c1972t2;
    }

    /* JADX INFO: renamed from: f */
    private int m8272f(C1990m c1990m, int i7) {
        C7011e<C1687k> c7011eMo8213b = this.f6537a.mo8213b(i7);
        String str = "projects/" + this.f6542f.m7070k() + "/databases/" + this.f6542f.m7069j() + "/documents/";
        int i8 = 0;
        for (C1687k c1687k : c7011eMo8213b) {
            if (!c1990m.m8345h(str + c1687k.m7095t().mo7057h())) {
                m8278p(i7, c1687k, null);
                i8++;
            }
        }
        return i8;
    }

    /* JADX INFO: renamed from: g */
    private int m8273g(int i7) {
        C1971S c1971sM8239j = m8271e(i7).m8239j();
        return (this.f6537a.mo8213b(i7).size() + c1971sM8239j.m8225b().size()) - c1971sM8239j.m8227d().size();
    }

    /* JADX INFO: renamed from: h */
    private Collection m8274h(AbstractC1974V.d dVar) {
        List listM8266d = dVar.m8266d();
        if (!listM8266d.isEmpty()) {
            return listM8266d;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f6538b.keySet()) {
            if (m8275l(num.intValue())) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    private boolean m8275l(int i7) {
        return m8277n(i7) != null;
    }

    /* JADX INFO: renamed from: m */
    private C1990m m8276m(AbstractC1974V.c cVar) {
        C7022d c7022dM8354b = cVar.m8261a().m8354b();
        if (c7022dM8354b != null && c7022dM8354b.m30684d0()) {
            try {
                C1990m c1990mM8337a = C1990m.m8337a(c7022dM8354b.m30682a0().m30678a0(), c7022dM8354b.m30682a0().m30679c0(), c7022dM8354b.m30683c0());
                if (c1990mM8337a.m8344c() == 0) {
                    return null;
                }
                return c1990mM8337a;
            } catch (C1990m.a e7) {
                AbstractC2049q.m8505d("WatchChangeAggregator", "Applying bloom filter failed: (" + e7.getMessage() + "); ignoring the bloom filter and falling back to full re-query.", new Object[0]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private C1477B1 m8277n(int i7) {
        C1972T c1972t = (C1972T) this.f6538b.get(Integer.valueOf(i7));
        if (c1972t == null || !c1972t.m8234e()) {
            return this.f6537a.mo8212a(i7);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    private void m8278p(int i7, C1687k c1687k, C1694r c1694r) {
        if (m8275l(i7)) {
            C1972T c1972tM8271e = m8271e(i7);
            if (m8280s(i7, c1687k)) {
                c1972tM8271e.m8230a(c1687k, C1366m.a.REMOVED);
            } else {
                c1972tM8271e.m8238i(c1687k);
            }
            m8270d(c1687k).add(Integer.valueOf(i7));
            if (c1694r != null) {
                this.f6539c.put(c1687k, c1694r);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m8279r(int i7) {
        AbstractC2034b.m8460d((this.f6538b.get(Integer.valueOf(i7)) == null || ((C1972T) this.f6538b.get(Integer.valueOf(i7))).m8234e()) ? false : true, "Should only reset active targets", new Object[0]);
        this.f6538b.put(Integer.valueOf(i7), new C1972T());
        Iterator it = this.f6537a.mo8213b(i7).iterator();
        while (it.hasNext()) {
            m8278p(i7, (C1687k) it.next(), null);
        }
    }

    /* JADX INFO: renamed from: s */
    private boolean m8280s(int i7, C1687k c1687k) {
        return this.f6537a.mo8213b(i7).contains(c1687k);
    }

    /* JADX INFO: renamed from: c */
    public C1963J m8281c(C1698v c1698v) {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f6538b.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iIntValue = num.intValue();
            C1972T c1972t = (C1972T) entry.getValue();
            C1477B1 c1477b1M8277n = m8277n(iIntValue);
            if (c1477b1M8277n != null) {
                if (c1972t.m8233d() && c1477b1M8277n.m6213g().m5825s()) {
                    C1687k c1687kM7088m = C1687k.m7088m(c1477b1M8277n.m6213g().m5820n());
                    if (this.f6539c.get(c1687kM7088m) == null && !m8280s(iIntValue, c1687kM7088m)) {
                        m8278p(iIntValue, c1687kM7088m, C1694r.m7125r(c1687kM7088m, c1698v));
                    }
                }
                if (c1972t.m8232c()) {
                    map.put(num, c1972t.m8239j());
                    c1972t.m8231b();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry2 : this.f6540d.entrySet()) {
            C1687k c1687k = (C1687k) entry2.getKey();
            Iterator it = ((Set) entry2.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.add(c1687k);
                    break;
                }
                C1477B1 c1477b1M8277n2 = m8277n(((Integer) it.next()).intValue());
                if (c1477b1M8277n2 != null && !c1477b1M8277n2.m6209c().equals(EnumC1529b0.LIMBO_RESOLUTION)) {
                    break;
                }
            }
        }
        Iterator it2 = this.f6539c.values().iterator();
        while (it2.hasNext()) {
            ((C1694r) it2.next()).m7133v(c1698v);
        }
        C1963J c1963j = new C1963J(c1698v, Collections.unmodifiableMap(map), Collections.unmodifiableMap(this.f6541e), Collections.unmodifiableMap(this.f6539c), Collections.unmodifiableSet(hashSet));
        this.f6539c = new HashMap();
        this.f6540d = new HashMap();
        this.f6541e = new HashMap();
        return c1963j;
    }

    /* JADX INFO: renamed from: i */
    public void m8282i(AbstractC1974V.b bVar) {
        C1694r c1694rM8258b = bVar.m8258b();
        C1687k c1687kM8257a = bVar.m8257a();
        Iterator it = bVar.m8260d().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (c1694rM8258b == null || !c1694rM8258b.mo7073b()) {
                m8278p(iIntValue, c1687kM8257a, c1694rM8258b);
            } else {
                m8268a(iIntValue, c1694rM8258b);
            }
        }
        Iterator it2 = bVar.m8259c().iterator();
        while (it2.hasNext()) {
            m8278p(((Integer) it2.next()).intValue(), c1687kM8257a, bVar.m8258b());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m8283j(AbstractC1974V.c cVar) {
        int iM8262b = cVar.m8262b();
        int iM8353a = cVar.m8261a().m8353a();
        C1477B1 c1477b1M8277n = m8277n(iM8262b);
        if (c1477b1M8277n != null) {
            C1348P c1348pM6213g = c1477b1M8277n.m6213g();
            if (c1348pM6213g.m5825s()) {
                if (iM8353a != 0) {
                    AbstractC2034b.m8460d(iM8353a == 1, "Single document existence filter with count: %d", Integer.valueOf(iM8353a));
                    return;
                } else {
                    C1687k c1687kM7088m = C1687k.m7088m(c1348pM6213g.m5820n());
                    m8278p(iM8262b, c1687kM7088m, C1694r.m7125r(c1687kM7088m, C1698v.f5636b));
                    return;
                }
            }
            int iM8273g = m8273g(iM8262b);
            if (iM8273g != iM8353a) {
                C1990m c1990mM8276m = m8276m(cVar);
                b bVarM8269b = c1990mM8276m != null ? m8269b(c1990mM8276m, cVar, iM8273g) : b.SKIPPED;
                if (bVarM8269b != b.SUCCESS) {
                    m8279r(iM8262b);
                    this.f6541e.put(Integer.valueOf(iM8262b), bVarM8269b == b.FALSE_POSITIVE ? EnumC1529b0.EXISTENCE_FILTER_MISMATCH_BLOOM : EnumC1529b0.EXISTENCE_FILTER_MISMATCH);
                }
                C1973U.m8241a().m8242b(C1973U.b.m8251e(iM8273g, cVar.m8261a(), this.f6542f, c1990mM8276m, bVarM8269b));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m8284k(AbstractC1974V.d dVar) {
        Iterator it = m8274h(dVar).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            C1972T c1972tM8271e = m8271e(iIntValue);
            int i7 = a.f6543a[dVar.m8264b().ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    c1972tM8271e.m8237h();
                    if (!c1972tM8271e.m8234e()) {
                        c1972tM8271e.m8231b();
                    }
                    c1972tM8271e.m8240k(dVar.m8265c());
                } else if (i7 == 3) {
                    c1972tM8271e.m8237h();
                    if (!c1972tM8271e.m8234e()) {
                        m8286q(iIntValue);
                    }
                    AbstractC2034b.m8460d(dVar.m8263a() == null, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i7 != 4) {
                    if (i7 != 5) {
                        throw AbstractC2034b.m8457a("Unknown target watch change state: %s", dVar.m8264b());
                    }
                    if (m8275l(iIntValue)) {
                        m8279r(iIntValue);
                        c1972tM8271e.m8240k(dVar.m8265c());
                    }
                } else if (m8275l(iIntValue)) {
                    c1972tM8271e.m8235f();
                    c1972tM8271e.m8240k(dVar.m8265c());
                }
            } else if (m8275l(iIntValue)) {
                c1972tM8271e.m8240k(dVar.m8265c());
            }
        }
    }

    /* JADX INFO: renamed from: o */
    void m8285o(int i7) {
        m8271e(i7).m8236g();
    }

    /* JADX INFO: renamed from: q */
    void m8286q(int i7) {
        this.f6538b.remove(Integer.valueOf(i7));
    }
}
