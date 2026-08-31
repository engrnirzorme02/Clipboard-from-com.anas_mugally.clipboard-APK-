package p151T4;

import android.util.SparseArray;
import com.google.protobuf.AbstractC5104i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p123P4.C1229i;
import p137R4.C1343K;
import p137R4.C1348P;
import p137R4.C1349Q;
import p158U4.C1687k;
import p158U4.C1694r;
import p158U4.C1698v;
import p158U4.InterfaceC1684h;
import p165V4.AbstractC1780f;
import p165V4.C1781g;
import p165V4.C1782h;
import p165V4.C1783i;
import p179X4.C1963J;
import p179X4.C1971S;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p186Y4.InterfaceC2052t;
import p350s4.AbstractC7009c;
import p350s4.C7011e;

/* JADX INFO: renamed from: T4.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1472A {

    /* JADX INFO: renamed from: o */
    private static final long f5011o = TimeUnit.MINUTES.toSeconds(5);

    /* JADX INFO: renamed from: a */
    private final AbstractC1521Y f5012a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1543g f5013b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1561m f5014c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1515V f5015d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1528b f5016e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1541f0 f5017f;

    /* JADX INFO: renamed from: g */
    private C1567o f5018g;

    /* JADX INFO: renamed from: h */
    private final C1526a0 f5019h;

    /* JADX INFO: renamed from: i */
    private final C1538e0 f5020i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC1474A1 f5021j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC1525a f5022k;

    /* JADX INFO: renamed from: l */
    private final SparseArray f5023l;

    /* JADX INFO: renamed from: m */
    private final Map f5024m;

    /* JADX INFO: renamed from: n */
    private final C1349Q f5025n;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4.A$b */
    static class b {

        /* JADX INFO: renamed from: a */
        C1477B1 f5026a;

        /* JADX INFO: renamed from: b */
        int f5027b;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4.A$c */
    static class c {

        /* JADX INFO: renamed from: a */
        private final Map f5028a;

        /* JADX INFO: renamed from: b */
        private final Set f5029b;

        private c(Map map, Set set) {
            this.f5028a = map;
            this.f5029b = set;
        }
    }

    public C1472A(AbstractC1521Y abstractC1521Y, C1526a0 c1526a0, C1229i c1229i) {
        AbstractC2034b.m8460d(abstractC1521Y.mo6314j(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f5012a = abstractC1521Y;
        this.f5019h = c1526a0;
        this.f5013b = abstractC1521Y.mo6307c();
        InterfaceC1474A1 interfaceC1474A1Mo6313i = abstractC1521Y.mo6313i();
        this.f5021j = interfaceC1474A1Mo6313i;
        this.f5022k = abstractC1521Y.mo6305a();
        this.f5025n = C1349Q.m5827b(interfaceC1474A1Mo6313i.mo6170b());
        this.f5017f = abstractC1521Y.mo6312h();
        C1538e0 c1538e0 = new C1538e0();
        this.f5020i = c1538e0;
        this.f5023l = new SparseArray();
        this.f5024m = new HashMap();
        abstractC1521Y.mo6311g().mo6196g(c1538e0);
        m6148y(c1229i);
    }

    /* JADX INFO: renamed from: A */
    private c m6132A(Map map) {
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map mapMo6354d = this.f5017f.mo6354d(map.keySet());
        for (Map.Entry entry : map.entrySet()) {
            C1687k c1687k = (C1687k) entry.getKey();
            C1694r c1694r = (C1694r) entry.getValue();
            C1694r c1694r2 = (C1694r) mapMo6354d.get(c1687k);
            if (c1694r.mo7073b() != c1694r2.mo7073b()) {
                hashSet.add(c1687k);
            }
            if (c1694r.mo7079h() && c1694r.mo7081j().equals(C1698v.f5636b)) {
                arrayList.add(c1694r.getKey());
                map2.put(c1687k, c1694r);
            } else if (!c1694r2.m7130o() || c1694r.mo7081j().compareTo(c1694r2.mo7081j()) > 0 || (c1694r.mo7081j().compareTo(c1694r2.mo7081j()) == 0 && c1694r2.mo7076e())) {
                AbstractC2034b.m8460d(!C1698v.f5636b.equals(c1694r.mo7077f()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.f5017f.mo6356f(c1694r, c1694r.mo7077f());
                map2.put(c1687k, c1694r);
            } else {
                AbstractC2049q.m8502a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", c1687k, c1694r2.mo7081j(), c1694r.mo7081j());
            }
        }
        this.f5017f.removeAll(arrayList);
        return new c(map2, hashSet);
    }

    /* JADX INFO: renamed from: F */
    private static boolean m6133F(C1477B1 c1477b1, C1477B1 c1477b2, C1971S c1971s) {
        if (c1477b1.m6210d().isEmpty()) {
            return true;
        }
        long jM7438h = c1477b2.m6212f().m7155d().m7438h() - c1477b1.m6212f().m7155d().m7438h();
        long j7 = f5011o;
        if (jM7438h < j7 && c1477b2.m6208b().m7155d().m7438h() - c1477b1.m6208b().m7155d().m7438h() < j7) {
            return c1971s != null && (c1971s.m8225b().size() + c1971s.m8226c().size()) + c1971s.m8227d().size() > 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    private void m6134H() {
        this.f5012a.mo6316l("Start IndexManager", new Runnable() { // from class: T4.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f5293a.f5014c.start();
            }
        });
    }

    /* JADX INFO: renamed from: I */
    private void m6135I() {
        this.f5012a.mo6316l("Start MutationQueue", new Runnable() { // from class: T4.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f5297a.f5015d.start();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ AbstractC7009c m6136a(C1472A c1472a, int i7) {
        C1781g c1781gMo6265g = c1472a.f5015d.mo6265g(i7);
        AbstractC2034b.m8460d(c1781gMo6265g != null, "Attempt to reject nonexistent batch!", new Object[0]);
        c1472a.f5015d.mo6263e(c1781gMo6265g);
        c1472a.f5015d.mo6259a();
        c1472a.f5016e.mo6241c(i7);
        c1472a.f5018g.m6451n(c1781gMo6265g.m7474e());
        return c1472a.f5018g.m6446d(c1781gMo6265g.m7474e());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6137b(C1472A c1472a, int i7) {
        C1477B1 c1477b1 = (C1477B1) c1472a.f5023l.get(i7);
        AbstractC2034b.m8460d(c1477b1 != null, "Tried to release nonexistent target: %s", Integer.valueOf(i7));
        Iterator it = c1472a.f5020i.m6407h(i7).iterator();
        while (it.hasNext()) {
            c1472a.f5012a.mo6311g().mo6191b((C1687k) it.next());
        }
        c1472a.f5012a.mo6311g().mo6202m(c1477b1);
        c1472a.f5023l.remove(i7);
        c1472a.f5024m.remove(c1477b1.m6213g());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6138c(C1472A c1472a, List list) {
        c1472a.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1475B c1475b = (C1475B) it.next();
            int iM6181d = c1475b.m6181d();
            c1472a.f5020i.m6402b(c1475b.m6179b(), iM6181d);
            C7011e c7011eM6180c = c1475b.m6180c();
            Iterator it2 = c7011eM6180c.iterator();
            while (it2.hasNext()) {
                c1472a.f5012a.mo6311g().mo6191b((C1687k) it2.next());
            }
            c1472a.f5020i.m6406g(c7011eM6180c, iM6181d);
            if (!c1475b.m6182e()) {
                C1477B1 c1477b1 = (C1477B1) c1472a.f5023l.get(iM6181d);
                AbstractC2034b.m8460d(c1477b1 != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(iM6181d));
                C1477B1 c1477b1M6216j = c1477b1.m6216j(c1477b1.m6212f());
                c1472a.f5023l.put(iM6181d, c1477b1M6216j);
                if (m6133F(c1477b1, c1477b1M6216j, null)) {
                    c1472a.f5021j.mo6171c(c1477b1M6216j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AbstractC7009c m6140e(C1472A c1472a, C1963J c1963j, C1698v c1698v) {
        c1472a.getClass();
        Map mapM8126d = c1963j.m8126d();
        long jMo6201l = c1472a.f5012a.mo6311g().mo6201l();
        for (Map.Entry entry : mapM8126d.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iIntValue = num.intValue();
            C1971S c1971s = (C1971S) entry.getValue();
            C1477B1 c1477b1 = (C1477B1) c1472a.f5023l.get(iIntValue);
            if (c1477b1 != null) {
                c1472a.f5021j.mo6169a(c1971s.m8227d(), iIntValue);
                c1472a.f5021j.mo6175g(c1971s.m8225b(), iIntValue);
                C1477B1 c1477b1M6218l = c1477b1.m6218l(jMo6201l);
                if (c1963j.m8127e().containsKey(num)) {
                    AbstractC5104i abstractC5104i = AbstractC5104i.f19401b;
                    C1698v c1698v2 = C1698v.f5636b;
                    c1477b1M6218l = c1477b1M6218l.m6217k(abstractC5104i, c1698v2).m6216j(c1698v2);
                } else if (!c1971s.m8228e().isEmpty()) {
                    c1477b1M6218l = c1477b1M6218l.m6217k(c1971s.m8228e(), c1963j.m8125c());
                }
                c1472a.f5023l.put(iIntValue, c1477b1M6218l);
                if (m6133F(c1477b1, c1477b1M6218l, c1971s)) {
                    c1472a.f5021j.mo6171c(c1477b1M6218l);
                }
            }
        }
        Map mapM8123a = c1963j.m8123a();
        Set setM8124b = c1963j.m8124b();
        for (C1687k c1687k : mapM8123a.keySet()) {
            if (setM8124b.contains(c1687k)) {
                c1472a.f5012a.mo6311g().mo6200k(c1687k);
            }
        }
        c cVarM6132A = c1472a.m6132A(mapM8123a);
        Map map = cVarM6132A.f5028a;
        C1698v c1698vMo6173e = c1472a.f5021j.mo6173e();
        if (!c1698v.equals(C1698v.f5636b)) {
            AbstractC2034b.m8460d(c1698v.compareTo(c1698vMo6173e) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", c1698v, c1698vMo6173e);
            c1472a.f5021j.mo6174f(c1698v);
        }
        return c1472a.f5018g.m6449j(map, cVarM6132A.f5029b);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ AbstractC7009c m6141f(C1472A c1472a, C1782h c1782h) {
        c1472a.getClass();
        C1781g c1781gM7478b = c1782h.m7478b();
        c1472a.f5015d.mo6261c(c1781gM7478b, c1782h.m7482f());
        c1472a.m6146n(c1782h);
        c1472a.f5015d.mo6259a();
        c1472a.f5016e.mo6241c(c1782h.m7478b().m7473d());
        c1472a.f5018g.m6451n(c1472a.m6147r(c1782h));
        return c1472a.f5018g.m6446d(c1781gM7478b.m7474e());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6142g(C1472A c1472a, b bVar, C1348P c1348p) {
        int iM5829c = c1472a.f5025n.m5829c();
        bVar.f5027b = iM5829c;
        C1477B1 c1477b1 = new C1477B1(c1348p, iM5829c, c1472a.f5012a.mo6311g().mo6201l(), EnumC1529b0.LISTEN);
        bVar.f5026a = c1477b1;
        c1472a.f5021j.mo6176h(c1477b1);
    }

    /* JADX INFO: renamed from: n */
    private void m6146n(C1782h c1782h) {
        C1781g c1781gM7478b = c1782h.m7478b();
        for (C1687k c1687k : c1781gM7478b.m7474e()) {
            C1694r c1694rMo6353c = this.f5017f.mo6353c(c1687k);
            C1698v c1698v = (C1698v) c1782h.m7480d().mo30599b(c1687k);
            AbstractC2034b.m8460d(c1698v != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (c1694rMo6353c.mo7081j().compareTo(c1698v) < 0) {
                c1781gM7478b.m7471b(c1694rMo6353c, c1782h);
                if (c1694rMo6353c.m7130o()) {
                    this.f5017f.mo6356f(c1694rMo6353c, c1782h.m7479c());
                }
            }
        }
        this.f5015d.mo6263e(c1781gM7478b);
    }

    /* JADX INFO: renamed from: r */
    private Set m6147r(C1782h c1782h) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < c1782h.m7481e().size(); i7++) {
            if (!((C1783i) c1782h.m7481e().get(i7)).m7483a().isEmpty()) {
                hashSet.add(((AbstractC1780f) c1782h.m7478b().m7476g().get(i7)).m7462f());
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: y */
    private void m6148y(C1229i c1229i) {
        InterfaceC1561m interfaceC1561mMo6308d = this.f5012a.mo6308d(c1229i);
        this.f5014c = interfaceC1561mMo6308d;
        this.f5015d = this.f5012a.mo6309e(c1229i, interfaceC1561mMo6308d);
        InterfaceC1528b interfaceC1528bMo6306b = this.f5012a.mo6306b(c1229i);
        this.f5016e = interfaceC1528bMo6306b;
        this.f5018g = new C1567o(this.f5017f, this.f5015d, interfaceC1528bMo6306b, this.f5014c);
        this.f5017f.mo6355e(this.f5014c);
        this.f5019h.m6392f(this.f5018g, this.f5014c);
    }

    /* JADX INFO: renamed from: B */
    public InterfaceC1684h m6149B(C1687k c1687k) {
        return this.f5018g.m6445c(c1687k);
    }

    /* JADX INFO: renamed from: C */
    public AbstractC7009c m6150C(final int i7) {
        return (AbstractC7009c) this.f5012a.mo6315k("Reject batch", new InterfaceC2052t() { // from class: T4.u
            @Override // p186Y4.InterfaceC2052t
            public final Object get() {
                return C1472A.m6136a(this.f5311a, i7);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m6151D(final int i7) {
        this.f5012a.mo6316l("Release target", new Runnable() { // from class: T4.w
            @Override // java.lang.Runnable
            public final void run() {
                C1472A.m6137b(this.f5323a, i7);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public void m6152E(final AbstractC5104i abstractC5104i) {
        this.f5012a.mo6316l("Set stream token", new Runnable() { // from class: T4.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f5307a.f5015d.mo6262d(abstractC5104i);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m6153G() {
        this.f5012a.mo6310f().run();
        m6134H();
        m6135I();
    }

    /* JADX INFO: renamed from: k */
    public AbstractC7009c m6154k(final C1782h c1782h) {
        return (AbstractC7009c) this.f5012a.mo6315k("Acknowledge batch", new InterfaceC2052t() { // from class: T4.z
            @Override // p186Y4.InterfaceC2052t
            public final Object get() {
                return C1472A.m6141f(this.f5362a, c1782h);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public C1477B1 m6155l(final C1348P c1348p) {
        int iM6214h;
        C1477B1 c1477b1Mo6177i = this.f5021j.mo6177i(c1348p);
        if (c1477b1Mo6177i != null) {
            iM6214h = c1477b1Mo6177i.m6214h();
        } else {
            final b bVar = new b();
            this.f5012a.mo6316l("Allocate target", new Runnable() { // from class: T4.x
                @Override // java.lang.Runnable
                public final void run() {
                    C1472A.m6142g(this.f5330a, bVar, c1348p);
                }
            });
            iM6214h = bVar.f5027b;
            c1477b1Mo6177i = bVar.f5026a;
        }
        if (this.f5023l.get(iM6214h) == null) {
            this.f5023l.put(iM6214h, c1477b1Mo6177i);
            this.f5024m.put(c1348p, Integer.valueOf(iM6214h));
        }
        return c1477b1Mo6177i;
    }

    /* JADX INFO: renamed from: m */
    public AbstractC7009c m6156m(final C1963J c1963j) {
        final C1698v c1698vM8125c = c1963j.m8125c();
        return (AbstractC7009c) this.f5012a.mo6315k("Apply remote event", new InterfaceC2052t() { // from class: T4.y
            @Override // p186Y4.InterfaceC2052t
            public final Object get() {
                return C1472A.m6140e(this.f5347a, c1963j, c1698vM8125c);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public C1486G.c m6157o(final C1486G c1486g) {
        return (C1486G.c) this.f5012a.mo6315k("Collect garbage", new InterfaceC2052t() { // from class: T4.s
            @Override // p186Y4.InterfaceC2052t
            public final Object get() {
                return c1486g.m6225f(this.f5302a.f5023l);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public C1532c0 m6158p(C1343K c1343k, boolean z7) {
        C7011e c7011eMo6172d;
        C1698v c1698vM6208b;
        C1477B1 c1477b1M6164w = m6164w(c1343k.m5768x());
        C1698v c1698v = C1698v.f5636b;
        C7011e c7011eM7086j = C1687k.m7086j();
        if (c1477b1M6164w != null) {
            c1698vM6208b = c1477b1M6164w.m6208b();
            c7011eMo6172d = this.f5021j.mo6172d(c1477b1M6164w.m6214h());
        } else {
            c7011eMo6172d = c7011eM7086j;
            c1698vM6208b = c1698v;
        }
        C1526a0 c1526a0 = this.f5019h;
        if (z7) {
            c1698v = c1698vM6208b;
        }
        return new C1532c0(c1526a0.m6391e(c1343k, c1698v, c7011eMo6172d), c7011eMo6172d);
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC1561m m6159q() {
        return this.f5014c;
    }

    /* JADX INFO: renamed from: s */
    public C1698v m6160s() {
        return this.f5021j.mo6173e();
    }

    /* JADX INFO: renamed from: t */
    public AbstractC5104i m6161t() {
        return this.f5015d.mo6266h();
    }

    /* JADX INFO: renamed from: u */
    public C1567o m6162u() {
        return this.f5018g;
    }

    /* JADX INFO: renamed from: v */
    public C1781g m6163v(int i7) {
        return this.f5015d.mo6264f(i7);
    }

    /* JADX INFO: renamed from: w */
    C1477B1 m6164w(C1348P c1348p) {
        Integer num = (Integer) this.f5024m.get(c1348p);
        return num != null ? (C1477B1) this.f5023l.get(num.intValue()) : this.f5021j.mo6177i(c1348p);
    }

    /* JADX INFO: renamed from: x */
    public AbstractC7009c m6165x(C1229i c1229i) {
        List listMo6267i = this.f5015d.mo6267i();
        m6148y(c1229i);
        m6134H();
        m6135I();
        List listMo6267i2 = this.f5015d.mo6267i();
        C7011e c7011eM7086j = C1687k.m7086j();
        Iterator it = Arrays.asList(listMo6267i, listMo6267i2).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C1781g) it2.next()).m7476g().iterator();
                while (it3.hasNext()) {
                    c7011eM7086j = c7011eM7086j.m30620g(((AbstractC1780f) it3.next()).m7462f());
                }
            }
        }
        return this.f5018g.m6446d(c7011eM7086j);
    }

    /* JADX INFO: renamed from: z */
    public void m6166z(final List list) {
        this.f5012a.mo6316l("notifyLocalViewChanges", new Runnable() { // from class: T4.v
            @Override // java.lang.Runnable
            public final void run() {
                C1472A.m6138c(this.f5317a, list);
            }
        });
    }
}
