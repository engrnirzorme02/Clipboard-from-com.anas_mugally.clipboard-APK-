package p179X4;

import com.google.protobuf.AbstractC5104i;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p063H5.C0554l0;
import p137R4.EnumC1341I;
import p151T4.C1472A;
import p151T4.C1477B1;
import p151T4.EnumC1529b0;
import p158U4.C1682f;
import p158U4.C1698v;
import p165V4.C1781g;
import p165V4.C1782h;
import p186Y4.AbstractC2032B;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p186Y4.C2037e;
import p186Y4.InterfaceC2043k;
import p350s4.C7011e;

/* JADX INFO: renamed from: X4.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1968O implements C1975W.c {

    /* JADX INFO: renamed from: a */
    private final C1682f f6487a;

    /* JADX INFO: renamed from: b */
    private final c f6488b;

    /* JADX INFO: renamed from: c */
    private final C1472A f6489c;

    /* JADX INFO: renamed from: d */
    private final C1992o f6490d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1991n f6491e;

    /* JADX INFO: renamed from: g */
    private final C1961H f6493g;

    /* JADX INFO: renamed from: i */
    private final C1976X f6495i;

    /* JADX INFO: renamed from: j */
    private final C1977Y f6496j;

    /* JADX INFO: renamed from: k */
    private C1975W f6497k;

    /* JADX INFO: renamed from: h */
    private boolean f6494h = false;

    /* JADX INFO: renamed from: f */
    private final Map f6492f = new HashMap();

    /* JADX INFO: renamed from: l */
    private final Deque f6498l = new ArrayDeque();

    /* JADX INFO: renamed from: X4.O$a */
    class a implements C1976X.a {
        a() {
        }

        @Override // p179X4.InterfaceC1970Q
        /* JADX INFO: renamed from: a */
        public void mo8218a() {
            C1968O.this.m8204v();
        }

        @Override // p179X4.InterfaceC1970Q
        /* JADX INFO: renamed from: b */
        public void mo8219b(C0554l0 c0554l0) {
            C1968O.this.m8203u(c0554l0);
        }

        @Override // p179X4.C1976X.a
        /* JADX INFO: renamed from: d */
        public void mo8220d(C1698v c1698v, AbstractC1974V abstractC1974V) {
            C1968O.this.m8202t(c1698v, abstractC1974V);
        }
    }

    /* JADX INFO: renamed from: X4.O$b */
    class b implements C1977Y.a {
        b() {
        }

        @Override // p179X4.InterfaceC1970Q
        /* JADX INFO: renamed from: a */
        public void mo8218a() {
            C1968O.this.f6496j.m8301C();
        }

        @Override // p179X4.InterfaceC1970Q
        /* JADX INFO: renamed from: b */
        public void mo8219b(C0554l0 c0554l0) {
            C1968O.this.m8207y(c0554l0);
        }

        @Override // p179X4.C1977Y.a
        /* JADX INFO: renamed from: c */
        public void mo8221c() {
            C1968O.this.m8208z();
        }

        @Override // p179X4.C1977Y.a
        /* JADX INFO: renamed from: e */
        public void mo8222e(C1698v c1698v, List list) {
            C1968O.this.m8179A(c1698v, list);
        }
    }

    /* JADX INFO: renamed from: X4.O$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo5731a(EnumC1341I enumC1341I);

        /* JADX INFO: renamed from: b */
        C7011e mo5732b(int i7);

        /* JADX INFO: renamed from: c */
        void mo5733c(int i7, C0554l0 c0554l0);

        /* JADX INFO: renamed from: d */
        void mo5734d(int i7, C0554l0 c0554l0);

        /* JADX INFO: renamed from: e */
        void mo5735e(C1963J c1963j);

        /* JADX INFO: renamed from: f */
        void mo5736f(C1782h c1782h);
    }

    public C1968O(C1682f c1682f, final c cVar, C1472A c1472a, C1992o c1992o, final C2037e c2037e, InterfaceC1991n interfaceC1991n) {
        this.f6487a = c1682f;
        this.f6488b = cVar;
        this.f6489c = c1472a;
        this.f6490d = c1992o;
        this.f6491e = interfaceC1991n;
        Objects.requireNonNull(cVar);
        this.f6493g = new C1961H(c2037e, new C1961H.a() { // from class: X4.L
            @Override // p179X4.C1961H.a
            /* JADX INFO: renamed from: a */
            public final void mo8111a(EnumC1341I enumC1341I) {
                cVar.mo5731a(enumC1341I);
            }
        });
        this.f6495i = c1992o.m8351a(new a());
        this.f6496j = c1992o.m8352b(new b());
        interfaceC1991n.mo8335a(new InterfaceC2043k() { // from class: X4.M
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1968O.m8190d(this.f6483a, c2037e, (InterfaceC1991n.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m8179A(C1698v c1698v, List list) {
        this.f6488b.mo5736f(C1782h.m7477a((C1781g) this.f6498l.poll(), c1698v, list, this.f6496j.m8304x()));
        m8216r();
    }

    /* JADX INFO: renamed from: C */
    private void m8180C(AbstractC1974V.d dVar) {
        AbstractC2034b.m8460d(dVar.m8263a() != null, "Processing target error without a cause", new Object[0]);
        for (Integer num : dVar.m8266d()) {
            if (this.f6492f.containsKey(num)) {
                this.f6492f.remove(num);
                this.f6497k.m8286q(num.intValue());
                this.f6488b.mo5734d(num.intValue(), dVar.m8263a());
            }
        }
    }

    /* JADX INFO: renamed from: D */
    private void m8181D(C1698v c1698v) {
        AbstractC2034b.m8460d(!c1698v.equals(C1698v.f5636b), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        C1963J c1963jM8281c = this.f6497k.m8281c(c1698v);
        for (Map.Entry entry : c1963jM8281c.m8126d().entrySet()) {
            C1971S c1971s = (C1971S) entry.getValue();
            if (!c1971s.m8228e().isEmpty()) {
                Integer num = (Integer) entry.getKey();
                num.intValue();
                C1477B1 c1477b1 = (C1477B1) this.f6492f.get(num);
                if (c1477b1 != null) {
                    this.f6492f.put(num, c1477b1.m6217k(c1971s.m8228e(), c1698v));
                }
            }
        }
        for (Map.Entry entry2 : c1963jM8281c.m8127e().entrySet()) {
            Integer num2 = (Integer) entry2.getKey();
            int iIntValue = num2.intValue();
            C1477B1 c1477b2 = (C1477B1) this.f6492f.get(num2);
            if (c1477b2 != null) {
                this.f6492f.put(num2, c1477b2.m6217k(AbstractC5104i.f19401b, c1477b2.m6212f()));
                m8183F(iIntValue);
                m8184G(new C1477B1(c1477b2.m6213g(), iIntValue, c1477b2.m6211e(), (EnumC1529b0) entry2.getValue()));
            }
        }
        this.f6488b.mo5735e(c1963jM8281c);
    }

    /* JADX INFO: renamed from: E */
    private void m8182E() {
        this.f6494h = false;
        m8201p();
        this.f6493g.m8110h(EnumC1341I.UNKNOWN);
        this.f6496j.mo8289l();
        this.f6495i.mo8289l();
        m8215q();
    }

    /* JADX INFO: renamed from: F */
    private void m8183F(int i7) {
        this.f6497k.m8285o(i7);
        this.f6495i.m8298z(i7);
    }

    /* JADX INFO: renamed from: G */
    private void m8184G(C1477B1 c1477b1) {
        this.f6497k.m8285o(c1477b1.m6214h());
        if (!c1477b1.m6210d().isEmpty() || c1477b1.m6212f().compareTo(C1698v.f5636b) > 0) {
            c1477b1 = c1477b1.m6215i(Integer.valueOf(mo8213b(c1477b1.m6214h()).size()));
        }
        this.f6495i.m8288A(c1477b1);
    }

    /* JADX INFO: renamed from: H */
    private boolean m8185H() {
        return (!m8214n() || this.f6495i.mo8291n() || this.f6492f.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: I */
    private boolean m8186I() {
        return (!m8214n() || this.f6496j.mo8291n() || this.f6498l.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    private void m8187K() {
        AbstractC2034b.m8460d(m8185H(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f6497k = new C1975W(this.f6487a, this);
        this.f6495i.mo8294t();
        this.f6493g.m8109e();
    }

    /* JADX INFO: renamed from: L */
    private void m8188L() {
        AbstractC2034b.m8460d(m8186I(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.f6496j.mo8294t();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m8189c(C1968O c1968o, InterfaceC1991n.a aVar) {
        c1968o.getClass();
        if (aVar.equals(InterfaceC1991n.a.REACHABLE) && c1968o.f6493g.m8107c().equals(EnumC1341I.ONLINE)) {
            return;
        }
        if (!(aVar.equals(InterfaceC1991n.a.UNREACHABLE) && c1968o.f6493g.m8107c().equals(EnumC1341I.OFFLINE)) && c1968o.m8214n()) {
            AbstractC2049q.m8502a("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
            c1968o.m8182E();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8190d(final C1968O c1968o, C2037e c2037e, final InterfaceC1991n.a aVar) {
        c1968o.getClass();
        c2037e.m8471i(new Runnable() { // from class: X4.N
            @Override // java.lang.Runnable
            public final void run() {
                C1968O.m8189c(this.f6485a, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    private void m8198l(C1781g c1781g) {
        AbstractC2034b.m8460d(m8199m(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.f6498l.add(c1781g);
        if (this.f6496j.mo8290m() && this.f6496j.m8305y()) {
            this.f6496j.m8302D(c1781g.m7476g());
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m8199m() {
        return m8214n() && this.f6498l.size() < 10;
    }

    /* JADX INFO: renamed from: o */
    private void m8200o() {
        this.f6497k = null;
    }

    /* JADX INFO: renamed from: p */
    private void m8201p() {
        this.f6495i.mo8295u();
        this.f6496j.mo8295u();
        if (!this.f6498l.isEmpty()) {
            AbstractC2049q.m8502a("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(this.f6498l.size()));
            this.f6498l.clear();
        }
        m8200o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m8202t(C1698v c1698v, AbstractC1974V abstractC1974V) {
        this.f6493g.m8110h(EnumC1341I.ONLINE);
        AbstractC2034b.m8460d((this.f6495i == null || this.f6497k == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z7 = abstractC1974V instanceof AbstractC1974V.d;
        AbstractC1974V.d dVar = z7 ? (AbstractC1974V.d) abstractC1974V : null;
        if (dVar != null && dVar.m8264b().equals(AbstractC1974V.e.Removed) && dVar.m8263a() != null) {
            m8180C(dVar);
            return;
        }
        if (abstractC1974V instanceof AbstractC1974V.b) {
            this.f6497k.m8282i((AbstractC1974V.b) abstractC1974V);
        } else if (abstractC1974V instanceof AbstractC1974V.c) {
            this.f6497k.m8283j((AbstractC1974V.c) abstractC1974V);
        } else {
            AbstractC2034b.m8460d(z7, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
            this.f6497k.m8284k((AbstractC1974V.d) abstractC1974V);
        }
        if (c1698v.equals(C1698v.f5636b) || c1698v.compareTo(this.f6489c.m6160s()) < 0) {
            return;
        }
        m8181D(c1698v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m8203u(C0554l0 c0554l0) {
        if (c0554l0.m2460o()) {
            AbstractC2034b.m8460d(!m8185H(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        m8200o();
        if (!m8185H()) {
            this.f6493g.m8110h(EnumC1341I.UNKNOWN);
        } else {
            this.f6493g.m8108d(c0554l0);
            m8187K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m8204v() {
        Iterator it = this.f6492f.values().iterator();
        while (it.hasNext()) {
            m8184G((C1477B1) it.next());
        }
    }

    /* JADX INFO: renamed from: w */
    private void m8205w(C0554l0 c0554l0) {
        AbstractC2034b.m8460d(!c0554l0.m2460o(), "Handling write error with status OK.", new Object[0]);
        if (C1992o.m8350f(c0554l0)) {
            C1781g c1781g = (C1781g) this.f6498l.poll();
            this.f6496j.mo8289l();
            this.f6488b.mo5733c(c1781g.m7473d(), c0554l0);
            m8216r();
        }
    }

    /* JADX INFO: renamed from: x */
    private void m8206x(C0554l0 c0554l0) {
        AbstractC2034b.m8460d(!c0554l0.m2460o(), "Handling write error with status OK.", new Object[0]);
        if (C1992o.m8348d(c0554l0)) {
            AbstractC2049q.m8502a("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", AbstractC2032B.m8455t(this.f6496j.m8304x()), c0554l0);
            C1977Y c1977y = this.f6496j;
            AbstractC5104i abstractC5104i = C1977Y.f6550v;
            c1977y.m8300B(abstractC5104i);
            this.f6489c.m6152E(abstractC5104i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m8207y(C0554l0 c0554l0) {
        if (c0554l0.m2460o()) {
            AbstractC2034b.m8460d(!m8186I(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!c0554l0.m2460o() && !this.f6498l.isEmpty()) {
            if (this.f6496j.m8305y()) {
                m8205w(c0554l0);
            } else {
                m8206x(c0554l0);
            }
        }
        if (m8186I()) {
            m8188L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public void m8208z() {
        this.f6489c.m6152E(this.f6496j.m8304x());
        Iterator it = this.f6498l.iterator();
        while (it.hasNext()) {
            this.f6496j.m8302D(((C1781g) it.next()).m7476g());
        }
    }

    /* JADX INFO: renamed from: B */
    public void m8209B(C1477B1 c1477b1) {
        Integer numValueOf = Integer.valueOf(c1477b1.m6214h());
        if (this.f6492f.containsKey(numValueOf)) {
            return;
        }
        this.f6492f.put(numValueOf, c1477b1);
        if (m8185H()) {
            m8187K();
        } else if (this.f6495i.mo8290m()) {
            m8184G(c1477b1);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m8210J() {
        m8215q();
    }

    /* JADX INFO: renamed from: M */
    public void m8211M(int i7) {
        AbstractC2034b.m8460d(((C1477B1) this.f6492f.remove(Integer.valueOf(i7))) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i7));
        if (this.f6495i.mo8290m()) {
            m8183F(i7);
        }
        if (this.f6492f.isEmpty()) {
            if (this.f6495i.mo8290m()) {
                this.f6495i.m8320o();
            } else if (m8214n()) {
                this.f6493g.m8110h(EnumC1341I.UNKNOWN);
            }
        }
    }

    @Override // p179X4.C1975W.c
    /* JADX INFO: renamed from: a */
    public C1477B1 mo8212a(int i7) {
        return (C1477B1) this.f6492f.get(Integer.valueOf(i7));
    }

    @Override // p179X4.C1975W.c
    /* JADX INFO: renamed from: b */
    public C7011e mo8213b(int i7) {
        return this.f6488b.mo5732b(i7);
    }

    /* JADX INFO: renamed from: n */
    public boolean m8214n() {
        return this.f6494h;
    }

    /* JADX INFO: renamed from: q */
    public void m8215q() {
        this.f6494h = true;
        if (m8214n()) {
            this.f6496j.m8300B(this.f6489c.m6161t());
            if (m8185H()) {
                m8187K();
            } else {
                this.f6493g.m8110h(EnumC1341I.UNKNOWN);
            }
            m8216r();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m8216r() {
        int iM7473d = this.f6498l.isEmpty() ? -1 : ((C1781g) this.f6498l.getLast()).m7473d();
        while (m8199m()) {
            C1781g c1781gM6163v = this.f6489c.m6163v(iM7473d);
            if (c1781gM6163v == null) {
                if (this.f6498l.size() != 0) {
                    break;
                }
                this.f6496j.m8320o();
                break;
            }
            m8198l(c1781gM6163v);
            iM7473d = c1781gM6163v.m7473d();
        }
        if (m8186I()) {
            m8188L();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m8217s() {
        if (m8214n()) {
            AbstractC2049q.m8502a("RemoteStore", "Restarting streams for new credential.", new Object[0]);
            m8182E();
        }
    }
}
