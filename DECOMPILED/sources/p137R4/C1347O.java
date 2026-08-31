package p137R4;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.C4928n;
import com.google.protobuf.AbstractC5104i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p063H5.C0554l0;
import p123P4.C1229i;
import p151T4.C1472A;
import p151T4.C1475B;
import p151T4.C1477B1;
import p151T4.C1532c0;
import p151T4.C1538e0;
import p151T4.EnumC1529b0;
import p158U4.C1687k;
import p158U4.C1694r;
import p158U4.C1698v;
import p165V4.C1782h;
import p179X4.C1963J;
import p179X4.C1968O;
import p179X4.C1971S;
import p186Y4.AbstractC2032B;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p350s4.AbstractC7009c;
import p350s4.C7011e;

/* JADX INFO: renamed from: R4.O */
/* JADX INFO: loaded from: classes.dex */
public class C1347O implements C1968O.c {

    /* JADX INFO: renamed from: o */
    private static final String f4704o = "O";

    /* JADX INFO: renamed from: a */
    private final C1472A f4705a;

    /* JADX INFO: renamed from: b */
    private final C1968O f4706b;

    /* JADX INFO: renamed from: e */
    private final int f4709e;

    /* JADX INFO: renamed from: m */
    private C1229i f4717m;

    /* JADX INFO: renamed from: n */
    private c f4718n;

    /* JADX INFO: renamed from: c */
    private final Map f4707c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final Map f4708d = new HashMap();

    /* JADX INFO: renamed from: f */
    private final LinkedHashSet f4710f = new LinkedHashSet();

    /* JADX INFO: renamed from: g */
    private final Map f4711g = new HashMap();

    /* JADX INFO: renamed from: h */
    private final Map f4712h = new HashMap();

    /* JADX INFO: renamed from: i */
    private final C1538e0 f4713i = new C1538e0();

    /* JADX INFO: renamed from: j */
    private final Map f4714j = new HashMap();

    /* JADX INFO: renamed from: l */
    private final C1349Q f4716l = C1349Q.m5826a();

    /* JADX INFO: renamed from: k */
    private final Map f4715k = new HashMap();

    /* JADX INFO: renamed from: R4.O$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4719a;

        static {
            int[] iArr = new int[C1337E.a.values().length];
            f4719a = iArr;
            try {
                iArr[C1337E.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4719a[C1337E.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: R4.O$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final C1687k f4720a;

        /* JADX INFO: renamed from: b */
        private boolean f4721b;

        b(C1687k c1687k) {
            this.f4720a = c1687k;
        }
    }

    /* JADX INFO: renamed from: R4.O$c */
    interface c {
        /* JADX INFO: renamed from: a */
        void mo5804a(EnumC1341I enumC1341I);

        /* JADX INFO: renamed from: b */
        void mo5805b(C1343K c1343k, C0554l0 c0554l0);

        /* JADX INFO: renamed from: c */
        void mo5806c(List list);
    }

    public C1347O(C1472A c1472a, C1968O c1968o, C1229i c1229i, int i7) {
        this.f4705a = c1472a;
        this.f4706b = c1968o;
        this.f4709e = i7;
        this.f4717m = c1229i;
    }

    /* JADX INFO: renamed from: g */
    private void m5782g(String str) {
        AbstractC2034b.m8460d(this.f4718n != null, "Trying to call %s before setting callback", str);
    }

    /* JADX INFO: renamed from: h */
    private void m5783h(AbstractC7009c abstractC7009c, C1963J c1963j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f4707c.entrySet().iterator();
        while (it.hasNext()) {
            C1345M c1345m = (C1345M) ((Map.Entry) it.next()).getValue();
            C1351T c1351tM5781c = c1345m.m5781c();
            C1351T.b bVarM5840h = c1351tM5781c.m5840h(abstractC7009c);
            boolean z7 = false;
            if (bVarM5840h.m5845b()) {
                bVarM5840h = c1351tM5781c.m5841i(this.f4705a.m6158p(c1345m.m5779a(), false).m6394a(), bVarM5840h);
            }
            C1971S c1971s = c1963j == null ? null : (C1971S) c1963j.m8126d().get(Integer.valueOf(c1345m.m5780b()));
            if (c1963j != null && c1963j.m8127e().get(Integer.valueOf(c1345m.m5780b())) != null) {
                z7 = true;
            }
            C1352U c1352uM5838d = c1345m.m5781c().m5838d(bVarM5840h, c1971s, z7);
            m5794y(c1352uM5838d.m5846a(), c1345m.m5780b());
            if (c1352uM5838d.m5847b() != null) {
                arrayList.add(c1352uM5838d.m5847b());
                arrayList2.add(C1475B.m6178a(c1345m.m5780b(), c1352uM5838d.m5847b()));
            }
        }
        this.f4718n.mo5806c(arrayList);
        this.f4705a.m6166z(arrayList2);
    }

    /* JADX INFO: renamed from: i */
    private boolean m5784i(C0554l0 c0554l0) {
        C0554l0.b bVarM2458m = c0554l0.m2458m();
        return (bVarM2458m == C0554l0.b.FAILED_PRECONDITION && (c0554l0.m2459n() != null ? c0554l0.m2459n() : "").contains("requires an index")) || bVarM2458m == C0554l0.b.PERMISSION_DENIED;
    }

    /* JADX INFO: renamed from: j */
    private void m5785j() {
        Iterator it = this.f4715k.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
            while (it2.hasNext()) {
                ((TaskCompletionSource) it2.next()).setException(new C4928n("'waitForPendingWrites' task is cancelled due to User change.", C4928n.a.CANCELLED));
            }
        }
        this.f4715k.clear();
    }

    /* JADX INFO: renamed from: l */
    private C1353V m5786l(C1343K c1343k, int i7, AbstractC5104i abstractC5104i) {
        C1532c0 c1532c0M6158p = this.f4705a.m6158p(c1343k, true);
        C1353V.a aVarM5842j = C1353V.a.NONE;
        if (this.f4708d.get(Integer.valueOf(i7)) != null) {
            aVarM5842j = ((C1345M) this.f4707c.get((C1343K) ((List) this.f4708d.get(Integer.valueOf(i7))).get(0))).m5781c().m5842j();
        }
        C1971S c1971sM8224a = C1971S.m8224a(aVarM5842j == C1353V.a.SYNCED, abstractC5104i);
        C1351T c1351t = new C1351T(c1343k, c1532c0M6158p.m6395b());
        C1352U c1352uM5837c = c1351t.m5837c(c1351t.m5840h(c1532c0M6158p.m6394a()), c1971sM8224a);
        m5794y(c1352uM5837c.m5846a(), i7);
        this.f4707c.put(c1343k, new C1345M(c1343k, i7, c1351t));
        if (!this.f4708d.containsKey(Integer.valueOf(i7))) {
            this.f4708d.put(Integer.valueOf(i7), new ArrayList(1));
        }
        ((List) this.f4708d.get(Integer.valueOf(i7))).add(c1343k);
        return c1352uM5837c.m5847b();
    }

    /* JADX INFO: renamed from: o */
    private void m5787o(C0554l0 c0554l0, String str, Object... objArr) {
        if (m5784i(c0554l0)) {
            AbstractC2049q.m8505d("Firestore", "%s: %s", String.format(str, objArr), c0554l0);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m5788p(int i7, C0554l0 c0554l0) {
        Map map = (Map) this.f4714j.get(this.f4717m);
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i7);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(numValueOf);
            if (taskCompletionSource != null) {
                if (c0554l0 != null) {
                    taskCompletionSource.setException(AbstractC2032B.m8452q(c0554l0));
                } else {
                    taskCompletionSource.setResult(null);
                }
                map.remove(numValueOf);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m5789q() {
        while (!this.f4710f.isEmpty() && this.f4711g.size() < this.f4709e) {
            Iterator it = this.f4710f.iterator();
            C1687k c1687k = (C1687k) it.next();
            it.remove();
            int iM5829c = this.f4716l.m5829c();
            this.f4712h.put(Integer.valueOf(iM5829c), new b(c1687k));
            this.f4711g.put(c1687k, Integer.valueOf(iM5829c));
            this.f4706b.m8209B(new C1477B1(C1343K.m5744b(c1687k.m7095t()).m5768x(), iM5829c, -1L, EnumC1529b0.LIMBO_RESOLUTION));
        }
    }

    /* JADX INFO: renamed from: r */
    private void m5790r(int i7, C0554l0 c0554l0) {
        for (C1343K c1343k : (List) this.f4708d.get(Integer.valueOf(i7))) {
            this.f4707c.remove(c1343k);
            if (!c0554l0.m2460o()) {
                this.f4718n.mo5805b(c1343k, c0554l0);
                m5787o(c0554l0, "Listen for %s failed", c1343k);
            }
        }
        this.f4708d.remove(Integer.valueOf(i7));
        C7011e<C1687k> c7011eM6404d = this.f4713i.m6404d(i7);
        this.f4713i.m6407h(i7);
        for (C1687k c1687k : c7011eM6404d) {
            if (!this.f4713i.m6403c(c1687k)) {
                m5791s(c1687k);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m5791s(C1687k c1687k) {
        this.f4710f.remove(c1687k);
        Integer num = (Integer) this.f4711g.get(c1687k);
        if (num != null) {
            this.f4706b.m8211M(num.intValue());
            this.f4711g.remove(c1687k);
            this.f4712h.remove(num);
            m5789q();
        }
    }

    /* JADX INFO: renamed from: t */
    private void m5792t(int i7) {
        if (this.f4715k.containsKey(Integer.valueOf(i7))) {
            Iterator it = ((List) this.f4715k.get(Integer.valueOf(i7))).iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).setResult(null);
            }
            this.f4715k.remove(Integer.valueOf(i7));
        }
    }

    /* JADX INFO: renamed from: x */
    private void m5793x(C1337E c1337e) {
        C1687k c1687kM5719a = c1337e.m5719a();
        if (this.f4711g.containsKey(c1687kM5719a) || this.f4710f.contains(c1687kM5719a)) {
            return;
        }
        AbstractC2049q.m8502a(f4704o, "New document in limbo: %s", c1687kM5719a);
        this.f4710f.add(c1687kM5719a);
        m5789q();
    }

    /* JADX INFO: renamed from: y */
    private void m5794y(List list, int i7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1337E c1337e = (C1337E) it.next();
            int i8 = a.f4719a[c1337e.m5720b().ordinal()];
            if (i8 == 1) {
                this.f4713i.m6401a(c1337e.m5719a(), i7);
                m5793x(c1337e);
            } else {
                if (i8 != 2) {
                    throw AbstractC2034b.m8457a("Unknown limbo change type: %s", c1337e.m5720b());
                }
                AbstractC2049q.m8502a(f4704o, "Document no longer in limbo: %s", c1337e.m5719a());
                C1687k c1687kM5719a = c1337e.m5719a();
                this.f4713i.m6405f(c1687kM5719a, i7);
                if (!this.f4713i.m6403c(c1687kM5719a)) {
                    m5791s(c1687kM5719a);
                }
            }
        }
    }

    @Override // p179X4.C1968O.c
    /* JADX INFO: renamed from: a */
    public void mo5731a(EnumC1341I enumC1341I) {
        m5782g("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f4707c.entrySet().iterator();
        while (it.hasNext()) {
            C1352U c1352uM5839e = ((C1345M) ((Map.Entry) it.next()).getValue()).m5781c().m5839e(enumC1341I);
            AbstractC2034b.m8460d(c1352uM5839e.m5846a().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (c1352uM5839e.m5847b() != null) {
                arrayList.add(c1352uM5839e.m5847b());
            }
        }
        this.f4718n.mo5806c(arrayList);
        this.f4718n.mo5804a(enumC1341I);
    }

    @Override // p179X4.C1968O.c
    /* JADX INFO: renamed from: b */
    public C7011e mo5732b(int i7) {
        b bVar = (b) this.f4712h.get(Integer.valueOf(i7));
        if (bVar != null && bVar.f4721b) {
            return C1687k.m7086j().m30620g(bVar.f4720a);
        }
        C7011e c7011eM7086j = C1687k.m7086j();
        if (this.f4708d.containsKey(Integer.valueOf(i7))) {
            for (C1343K c1343k : (List) this.f4708d.get(Integer.valueOf(i7))) {
                if (this.f4707c.containsKey(c1343k)) {
                    c7011eM7086j = c7011eM7086j.m30623m(((C1345M) this.f4707c.get(c1343k)).m5781c().m5843k());
                }
            }
        }
        return c7011eM7086j;
    }

    @Override // p179X4.C1968O.c
    /* JADX INFO: renamed from: c */
    public void mo5733c(int i7, C0554l0 c0554l0) {
        m5782g("handleRejectedWrite");
        AbstractC7009c abstractC7009cM6150C = this.f4705a.m6150C(i7);
        if (!abstractC7009cM6150C.isEmpty()) {
            m5787o(c0554l0, "Write failed at %s", ((C1687k) abstractC7009cM6150C.mo30602j()).m7095t());
        }
        m5788p(i7, c0554l0);
        m5792t(i7);
        m5783h(abstractC7009cM6150C, null);
    }

    @Override // p179X4.C1968O.c
    /* JADX INFO: renamed from: d */
    public void mo5734d(int i7, C0554l0 c0554l0) {
        m5782g("handleRejectedListen");
        b bVar = (b) this.f4712h.get(Integer.valueOf(i7));
        C1687k c1687k = bVar != null ? bVar.f4720a : null;
        if (c1687k == null) {
            this.f4705a.m6151D(i7);
            m5790r(i7, c0554l0);
            return;
        }
        this.f4711g.remove(c1687k);
        this.f4712h.remove(Integer.valueOf(i7));
        m5789q();
        C1698v c1698v = C1698v.f5636b;
        Map mapSingletonMap = Collections.singletonMap(c1687k, C1694r.m7125r(c1687k, c1698v));
        Set setSingleton = Collections.singleton(c1687k);
        Map map = Collections.EMPTY_MAP;
        mo5735e(new C1963J(c1698v, map, map, mapSingletonMap, setSingleton));
    }

    @Override // p179X4.C1968O.c
    /* JADX INFO: renamed from: e */
    public void mo5735e(C1963J c1963j) {
        m5782g("handleRemoteEvent");
        for (Map.Entry entry : c1963j.m8126d().entrySet()) {
            Integer num = (Integer) entry.getKey();
            C1971S c1971s = (C1971S) entry.getValue();
            b bVar = (b) this.f4712h.get(num);
            if (bVar != null) {
                AbstractC2034b.m8460d((c1971s.m8225b().size() + c1971s.m8226c().size()) + c1971s.m8227d().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (c1971s.m8225b().size() > 0) {
                    bVar.f4721b = true;
                } else if (c1971s.m8226c().size() > 0) {
                    AbstractC2034b.m8460d(bVar.f4721b, "Received change for limbo target document without add.", new Object[0]);
                } else if (c1971s.m8227d().size() > 0) {
                    AbstractC2034b.m8460d(bVar.f4721b, "Received remove for limbo target document without add.", new Object[0]);
                    bVar.f4721b = false;
                }
            }
        }
        m5783h(this.f4705a.m6156m(c1963j), c1963j);
    }

    @Override // p179X4.C1968O.c
    /* JADX INFO: renamed from: f */
    public void mo5736f(C1782h c1782h) {
        m5782g("handleSuccessfulWrite");
        m5788p(c1782h.m7478b().m7473d(), null);
        m5792t(c1782h.m7478b().m7473d());
        m5783h(this.f4705a.m6154k(c1782h), null);
    }

    /* JADX INFO: renamed from: k */
    public void m5795k(C1229i c1229i) {
        boolean zEquals = this.f4717m.equals(c1229i);
        this.f4717m = c1229i;
        if (!zEquals) {
            m5785j();
            m5783h(this.f4705a.m6165x(c1229i), null);
        }
        this.f4706b.m8217s();
    }

    /* JADX INFO: renamed from: m */
    public int m5796m(C1343K c1343k, boolean z7) {
        m5782g("listen");
        AbstractC2034b.m8460d(!this.f4707c.containsKey(c1343k), "We already listen to query: %s", c1343k);
        C1477B1 c1477b1M6155l = this.f4705a.m6155l(c1343k.m5768x());
        this.f4718n.mo5806c(Collections.singletonList(m5786l(c1343k, c1477b1M6155l.m6214h(), c1477b1M6155l.m6210d())));
        if (z7) {
            this.f4706b.m8209B(c1477b1M6155l);
        }
        return c1477b1M6155l.m6214h();
    }

    /* JADX INFO: renamed from: n */
    public void m5797n(C1343K c1343k) {
        m5782g("listenToRemoteStore");
        AbstractC2034b.m8460d(this.f4707c.containsKey(c1343k), "This is the first listen to query: %s", c1343k);
        this.f4706b.m8209B(this.f4705a.m6155l(c1343k.m5768x()));
    }

    /* JADX INFO: renamed from: u */
    public void m5798u(c cVar) {
        this.f4718n = cVar;
    }

    /* JADX INFO: renamed from: v */
    void m5799v(C1343K c1343k, boolean z7) {
        m5782g("stopListening");
        C1345M c1345m = (C1345M) this.f4707c.get(c1343k);
        AbstractC2034b.m8460d(c1345m != null, "Trying to stop listening to a query not found", new Object[0]);
        this.f4707c.remove(c1343k);
        int iM5780b = c1345m.m5780b();
        List list = (List) this.f4708d.get(Integer.valueOf(iM5780b));
        list.remove(c1343k);
        if (list.isEmpty()) {
            this.f4705a.m6151D(iM5780b);
            if (z7) {
                this.f4706b.m8211M(iM5780b);
            }
            m5790r(iM5780b, C0554l0.f2098e);
        }
    }

    /* JADX INFO: renamed from: w */
    void m5800w(C1343K c1343k) {
        m5782g("stopListeningToRemoteStore");
        C1345M c1345m = (C1345M) this.f4707c.get(c1343k);
        AbstractC2034b.m8460d(c1345m != null, "Trying to stop listening to a query not found", new Object[0]);
        int iM5780b = c1345m.m5780b();
        List list = (List) this.f4708d.get(Integer.valueOf(iM5780b));
        list.remove(c1343k);
        if (list.isEmpty()) {
            this.f4706b.m8211M(iM5780b);
        }
    }
}
