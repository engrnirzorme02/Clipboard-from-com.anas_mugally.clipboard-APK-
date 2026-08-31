package p390x4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p006A4.C0023h;
import p006A4.C0024i;
import p022C4.C0144c;
import p030D4.C0198b;
import p374v4.C7245j;
import p398y4.AbstractC7551l;
import p398y4.C7543d;
import p398y4.InterfaceC7540a;
import p398y4.InterfaceC7548i;

/* JADX INFO: renamed from: x4.i */
/* JADX INFO: loaded from: classes.dex */
public class C7414i {

    /* JADX INFO: renamed from: f */
    private static final InterfaceC7548i f29673f = new a();

    /* JADX INFO: renamed from: g */
    private static final InterfaceC7548i f29674g = new b();

    /* JADX INFO: renamed from: h */
    private static final InterfaceC7548i f29675h = new c();

    /* JADX INFO: renamed from: i */
    private static final InterfaceC7548i f29676i = new d();

    /* JADX INFO: renamed from: a */
    private C7543d f29677a = new C7543d(null);

    /* JADX INFO: renamed from: b */
    private final InterfaceC7411f f29678b;

    /* JADX INFO: renamed from: c */
    private final C0144c f29679c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC7540a f29680d;

    /* JADX INFO: renamed from: e */
    private long f29681e;

    /* JADX INFO: renamed from: x4.i$a */
    class a implements InterfaceC7548i {
        a() {
        }

        @Override // p398y4.InterfaceC7548i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo31917a(Map map) {
            C7413h c7413h = (C7413h) map.get(C0023h.f119i);
            return c7413h != null && c7413h.f29671d;
        }
    }

    /* JADX INFO: renamed from: x4.i$b */
    class b implements InterfaceC7548i {
        b() {
        }

        @Override // p398y4.InterfaceC7548i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo31917a(Map map) {
            C7413h c7413h = (C7413h) map.get(C0023h.f119i);
            return c7413h != null && c7413h.f29672e;
        }
    }

    /* JADX INFO: renamed from: x4.i$c */
    class c implements InterfaceC7548i {
        c() {
        }

        @Override // p398y4.InterfaceC7548i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo31917a(C7413h c7413h) {
            return !c7413h.f29672e;
        }
    }

    /* JADX INFO: renamed from: x4.i$d */
    class d implements InterfaceC7548i {
        d() {
        }

        @Override // p398y4.InterfaceC7548i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo31917a(C7413h c7413h) {
            return !C7414i.f29675h.mo31917a(c7413h);
        }
    }

    /* JADX INFO: renamed from: x4.i$e */
    class e implements C7543d.c {
        e() {
        }

        @Override // p398y4.C7543d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo30316a(C7245j c7245j, Map map, Void r7) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                C7413h c7413h = (C7413h) ((Map.Entry) it.next()).getValue();
                if (!c7413h.f29671d) {
                    C7414i.this.m32773s(c7413h.m32761b());
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: x4.i$f */
    class f implements Comparator {
        f() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C7413h c7413h, C7413h c7413h2) {
            return AbstractC7551l.m33229b(c7413h.f29670c, c7413h2.f29670c);
        }
    }

    public C7414i(InterfaceC7411f interfaceC7411f, C0144c c0144c, InterfaceC7540a interfaceC7540a) {
        this.f29681e = 0L;
        this.f29678b = interfaceC7411f;
        this.f29679c = c0144c;
        this.f29680d = interfaceC7540a;
        m32772r();
        for (C7413h c7413h : interfaceC7411f.mo30314t()) {
            this.f29681e = Math.max(c7413h.f29668a + 1, this.f29681e);
            m32766d(c7413h);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m32765c(C0024i c0024i) {
        AbstractC7551l.m33234g(!c0024i.m140g() || c0024i.m139f(), "Can't have tracked non-default query that loads all data");
    }

    /* JADX INFO: renamed from: d */
    private void m32766d(C7413h c7413h) {
        m32765c(c7413h.f29669b);
        Map map = (Map) this.f29677a.m33197n(c7413h.f29669b.m138e());
        if (map == null) {
            map = new HashMap();
            this.f29677a = this.f29677a.m33204z(c7413h.f29669b.m138e(), map);
        }
        C7413h c7413h2 = (C7413h) map.get(c7413h.f29669b.m137d());
        AbstractC7551l.m33233f(c7413h2 == null || c7413h2.f29668a == c7413h.f29668a);
        map.put(c7413h.f29669b.m137d(), c7413h);
    }

    /* JADX INFO: renamed from: e */
    private static long m32767e(InterfaceC7406a interfaceC7406a, long j7) {
        return j7 - Math.min((long) Math.floor(j7 * (1.0f - interfaceC7406a.mo32731c())), interfaceC7406a.mo32730b());
    }

    /* JADX INFO: renamed from: h */
    private Set m32768h(C7245j c7245j) {
        HashSet hashSet = new HashSet();
        Map map = (Map) this.f29677a.m33197n(c7245j);
        if (map != null) {
            for (C7413h c7413h : map.values()) {
                if (!c7413h.f29669b.m140g()) {
                    hashSet.add(Long.valueOf(c7413h.f29668a));
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: k */
    private List m32769k(InterfaceC7548i interfaceC7548i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f29677a.iterator();
        while (it.hasNext()) {
            for (C7413h c7413h : ((Map) ((Map.Entry) it.next()).getValue()).values()) {
                if (interfaceC7548i.mo31917a(c7413h)) {
                    arrayList.add(c7413h);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    private boolean m32770m(C7245j c7245j) {
        return this.f29677a.m33193e(c7245j, f29673f) != null;
    }

    /* JADX INFO: renamed from: o */
    private static C0024i m32771o(C0024i c0024i) {
        return c0024i.m140g() ? C0024i.m134a(c0024i.m138e()) : c0024i;
    }

    /* JADX INFO: renamed from: r */
    private void m32772r() {
        try {
            this.f29678b.mo30297c();
            this.f29678b.mo30308n(this.f29680d.mo33182a());
            this.f29678b.mo30302h();
        } finally {
            this.f29678b.mo30304j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m32773s(C7413h c7413h) {
        m32766d(c7413h);
        this.f29678b.mo30311q(c7413h);
    }

    /* JADX INFO: renamed from: v */
    private void m32774v(C0024i c0024i, boolean z7) {
        C7413h c7413h;
        C0024i c0024iM32771o = m32771o(c0024i);
        C7413h c7413hM32777i = m32777i(c0024iM32771o);
        long jMo33182a = this.f29680d.mo33182a();
        if (c7413hM32777i != null) {
            c7413h = c7413hM32777i.m32762c(jMo33182a).m32760a(z7);
        } else {
            AbstractC7551l.m33234g(z7, "If we're setting the query to inactive, we should already be tracking it!");
            long j7 = this.f29681e;
            this.f29681e = 1 + j7;
            c7413h = new C7413h(j7, c0024iM32771o, jMo33182a, false, z7);
        }
        m32773s(c7413h);
    }

    /* JADX INFO: renamed from: f */
    public long m32775f() {
        return m32769k(f29675h).size();
    }

    /* JADX INFO: renamed from: g */
    public void m32776g(C7245j c7245j) {
        C7413h c7413hM32761b;
        if (m32770m(c7245j)) {
            return;
        }
        C0024i c0024iM134a = C0024i.m134a(c7245j);
        C7413h c7413hM32777i = m32777i(c0024iM134a);
        if (c7413hM32777i == null) {
            long j7 = this.f29681e;
            this.f29681e = 1 + j7;
            c7413hM32761b = new C7413h(j7, c0024iM134a, this.f29680d.mo33182a(), true, false);
        } else {
            AbstractC7551l.m33234g(!c7413hM32777i.f29671d, "This should have been handled above!");
            c7413hM32761b = c7413hM32777i.m32761b();
        }
        m32773s(c7413hM32761b);
    }

    /* JADX INFO: renamed from: i */
    public C7413h m32777i(C0024i c0024i) {
        C0024i c0024iM32771o = m32771o(c0024i);
        Map map = (Map) this.f29677a.m33197n(c0024iM32771o.m138e());
        if (map != null) {
            return (C7413h) map.get(c0024iM32771o.m137d());
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public Set m32778j(C7245j c7245j) {
        AbstractC7551l.m33234g(!m32780n(C0024i.m134a(c7245j)), "Path is fully complete.");
        HashSet hashSet = new HashSet();
        Set setM32768h = m32768h(c7245j);
        if (!setM32768h.isEmpty()) {
            hashSet.addAll(this.f29678b.mo30306l(setM32768h));
        }
        for (Map.Entry entry : this.f29677a.m33190B(c7245j).m33199q()) {
            C0198b c0198b = (C0198b) entry.getKey();
            C7543d c7543d = (C7543d) entry.getValue();
            if (c7543d.getValue() != null && f29673f.mo31917a((Map) c7543d.getValue())) {
                hashSet.add(c0198b);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: l */
    public boolean m32779l(C7245j c7245j) {
        return this.f29677a.m33203y(c7245j, f29674g) != null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m32780n(C0024i c0024i) {
        Map map;
        if (m32770m(c0024i.m138e())) {
            return true;
        }
        return !c0024i.m140g() && (map = (Map) this.f29677a.m33197n(c0024i.m138e())) != null && map.containsKey(c0024i.m137d()) && ((C7413h) map.get(c0024i.m137d())).f29671d;
    }

    /* JADX INFO: renamed from: p */
    public C7412g m32781p(InterfaceC7406a interfaceC7406a) {
        List listM32769k = m32769k(f29675h);
        long jM32767e = m32767e(interfaceC7406a, listM32769k.size());
        C7412g c7412g = new C7412g();
        if (this.f29679c.m627f()) {
            this.f29679c.m624b("Pruning old queries.  Prunable: " + listM32769k.size() + " Count to prune: " + jM32767e, new Object[0]);
        }
        Collections.sort(listM32769k, new f());
        for (int i7 = 0; i7 < jM32767e; i7++) {
            C7413h c7413h = (C7413h) listM32769k.get(i7);
            c7412g = c7412g.m32753d(c7413h.f29669b.m138e());
            m32782q(c7413h.f29669b);
        }
        for (int i8 = (int) jM32767e; i8 < listM32769k.size(); i8++) {
            c7412g = c7412g.m32752c(((C7413h) listM32769k.get(i8)).f29669b.m138e());
        }
        List listM32769k2 = m32769k(f29676i);
        if (this.f29679c.m627f()) {
            this.f29679c.m624b("Unprunable queries: " + listM32769k2.size(), new Object[0]);
        }
        Iterator it = listM32769k2.iterator();
        while (it.hasNext()) {
            c7412g = c7412g.m32752c(((C7413h) it.next()).f29669b.m138e());
        }
        return c7412g;
    }

    /* JADX INFO: renamed from: q */
    public void m32782q(C0024i c0024i) {
        C0024i c0024iM32771o = m32771o(c0024i);
        C7413h c7413hM32777i = m32777i(c0024iM32771o);
        AbstractC7551l.m33234g(c7413hM32777i != null, "Query must exist to be removed.");
        this.f29678b.mo30300f(c7413hM32777i.f29668a);
        Map map = (Map) this.f29677a.m33197n(c0024iM32771o.m138e());
        map.remove(c0024iM32771o.m137d());
        if (map.isEmpty()) {
            this.f29677a = this.f29677a.m33202x(c0024iM32771o.m138e());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m32783t(C7245j c7245j) {
        this.f29677a.m33190B(c7245j).m33196m(new e());
    }

    /* JADX INFO: renamed from: u */
    public void m32784u(C0024i c0024i) {
        m32774v(c0024i, true);
    }

    /* JADX INFO: renamed from: w */
    public void m32785w(C0024i c0024i) {
        C7413h c7413hM32777i = m32777i(m32771o(c0024i));
        if (c7413hM32777i == null || c7413hM32777i.f29671d) {
            return;
        }
        m32773s(c7413hM32777i.m32761b());
    }

    /* JADX INFO: renamed from: x */
    public void m32786x(C0024i c0024i) {
        m32774v(c0024i, false);
    }
}
