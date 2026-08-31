package io.grpc.internal;

import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import p063H5.AbstractC0523S;
import p063H5.C0554l0;
import p063H5.C0563q;
import p063H5.C0572x;
import p063H5.EnumC0561p;
import p063H5.ExecutorC0562p0;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;
import p129Q3.AbstractC1260B;
import p129Q3.AbstractC1272k;
import p129Q3.AbstractC1276o;

/* JADX INFO: renamed from: io.grpc.internal.s0 */
/* JADX INFO: loaded from: classes.dex */
final class C5807s0 extends AbstractC0523S {

    /* JADX INFO: renamed from: p */
    private static final Logger f22876p = Logger.getLogger(C5807s0.class.getName());

    /* JADX INFO: renamed from: g */
    private final AbstractC0523S.e f22877g;

    /* JADX INFO: renamed from: i */
    private d f22879i;

    /* JADX INFO: renamed from: l */
    private ExecutorC0562p0.d f22882l;

    /* JADX INFO: renamed from: m */
    private EnumC0561p f22883m;

    /* JADX INFO: renamed from: n */
    private EnumC0561p f22884n;

    /* JADX INFO: renamed from: o */
    private final boolean f22885o;

    /* JADX INFO: renamed from: h */
    private final Map f22878h = new HashMap();

    /* JADX INFO: renamed from: j */
    private int f22880j = 0;

    /* JADX INFO: renamed from: k */
    private boolean f22881k = true;

    /* JADX INFO: renamed from: io.grpc.internal.s0$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f22886a;

        static {
            int[] iArr = new int[EnumC0561p.values().length];
            f22886a = iArr;
            try {
                iArr[EnumC0561p.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22886a[EnumC0561p.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22886a[EnumC0561p.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22886a[EnumC0561p.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22886a[EnumC0561p.SHUTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5807s0.this.f22882l = null;
            if (C5807s0.this.f22879i.m26166b()) {
                C5807s0.this.mo2177e();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$d */
    static final class d {

        /* JADX INFO: renamed from: a */
        private List f22891a;

        /* JADX INFO: renamed from: b */
        private int f22892b;

        /* JADX INFO: renamed from: c */
        private int f22893c;

        public d(List list) {
            this.f22891a = list == null ? Collections.EMPTY_LIST : list;
        }

        /* JADX INFO: renamed from: a */
        public SocketAddress m26165a() {
            if (m26167c()) {
                return (SocketAddress) ((C0572x) this.f22891a.get(this.f22892b)).m2533a().get(this.f22893c);
            }
            throw new IllegalStateException("Index is past the end of the address group list");
        }

        /* JADX INFO: renamed from: b */
        public boolean m26166b() {
            if (!m26167c()) {
                return false;
            }
            C0572x c0572x = (C0572x) this.f22891a.get(this.f22892b);
            int i7 = this.f22893c + 1;
            this.f22893c = i7;
            if (i7 < c0572x.m2533a().size()) {
                return true;
            }
            int i8 = this.f22892b + 1;
            this.f22892b = i8;
            this.f22893c = 0;
            return i8 < this.f22891a.size();
        }

        /* JADX INFO: renamed from: c */
        public boolean m26167c() {
            return this.f22892b < this.f22891a.size();
        }

        /* JADX INFO: renamed from: d */
        public void m26168d() {
            this.f22892b = 0;
            this.f22893c = 0;
        }

        /* JADX INFO: renamed from: e */
        public boolean m26169e(SocketAddress socketAddress) {
            for (int i7 = 0; i7 < this.f22891a.size(); i7++) {
                int iIndexOf = ((C0572x) this.f22891a.get(i7)).m2533a().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.f22892b = i7;
                    this.f22893c = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public int m26170f() {
            List list = this.f22891a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX INFO: renamed from: g */
        public void m26171g(AbstractC1272k abstractC1272k) {
            List list = abstractC1272k;
            if (abstractC1272k == null) {
                list = Collections.EMPTY_LIST;
            }
            this.f22891a = list;
            m26168d();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$e */
    private static final class e extends AbstractC0523S.j {

        /* JADX INFO: renamed from: a */
        private final AbstractC0523S.f f22894a;

        e(AbstractC0523S.f fVar) {
            this.f22894a = (AbstractC0523S.f) AbstractC1209m.m5303o(fVar, "result");
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.f mo2179a(AbstractC0523S.g gVar) {
            return this.f22894a;
        }

        public String toString() {
            return AbstractC1203g.m5266a(e.class).m5277d("result", this.f22894a).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$f */
    private final class f extends AbstractC0523S.j {

        /* JADX INFO: renamed from: a */
        private final C5807s0 f22895a;

        /* JADX INFO: renamed from: b */
        private final AtomicBoolean f22896b = new AtomicBoolean(false);

        f(C5807s0 c5807s0) {
            this.f22895a = (C5807s0) AbstractC1209m.m5303o(c5807s0, "pickFirstLeafLoadBalancer");
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.f mo2179a(AbstractC0523S.g gVar) {
            if (this.f22896b.compareAndSet(false, true)) {
                ExecutorC0562p0 executorC0562p0Mo2197d = C5807s0.this.f22877g.mo2197d();
                final C5807s0 c5807s0 = this.f22895a;
                Objects.requireNonNull(c5807s0);
                executorC0562p0Mo2197d.execute(new Runnable() { // from class: io.grpc.internal.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c5807s0.mo2177e();
                    }
                });
            }
            return AbstractC0523S.f.m2202g();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$g */
    private static final class g {

        /* JADX INFO: renamed from: a */
        private final AbstractC0523S.i f22898a;

        /* JADX INFO: renamed from: b */
        private EnumC0561p f22899b;

        /* JADX INFO: renamed from: c */
        private final c f22900c;

        /* JADX INFO: renamed from: d */
        private boolean f22901d = false;

        public g(AbstractC0523S.i iVar, EnumC0561p enumC0561p, c cVar) {
            this.f22898a = iVar;
            this.f22899b = enumC0561p;
            this.f22900c = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public EnumC0561p m26177f() {
            return this.f22900c.f22888a.m2497c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public void m26178j(EnumC0561p enumC0561p) {
            this.f22899b = enumC0561p;
            if (enumC0561p == EnumC0561p.READY || enumC0561p == EnumC0561p.TRANSIENT_FAILURE) {
                this.f22901d = true;
            } else if (enumC0561p == EnumC0561p.IDLE) {
                this.f22901d = false;
            }
        }

        /* JADX INFO: renamed from: g */
        public EnumC0561p m26179g() {
            return this.f22899b;
        }

        /* JADX INFO: renamed from: h */
        public AbstractC0523S.i m26180h() {
            return this.f22898a;
        }

        /* JADX INFO: renamed from: i */
        public boolean m26181i() {
            return this.f22901d;
        }
    }

    C5807s0(AbstractC0523S.e eVar) {
        EnumC0561p enumC0561p = EnumC0561p.IDLE;
        this.f22883m = enumC0561p;
        this.f22884n = enumC0561p;
        this.f22885o = AbstractC5757S.m25669g("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS", false);
        this.f22877g = (AbstractC0523S.e) AbstractC1209m.m5303o(eVar, "helper");
    }

    /* JADX INFO: renamed from: n */
    private void m26153n() {
        ExecutorC0562p0.d dVar = this.f22882l;
        if (dVar != null) {
            dVar.m2493a();
            this.f22882l = null;
        }
    }

    /* JADX INFO: renamed from: o */
    private AbstractC0523S.i m26154o(SocketAddress socketAddress) {
        c cVar = new c(this, null);
        final AbstractC0523S.i iVarMo2194a = this.f22877g.mo2194a(AbstractC0523S.b.m2180d().m2189e(AbstractC1276o.m5590g(new C0572x(socketAddress))).m2187b(AbstractC0523S.f1942c, cVar).m2188c());
        if (iVarMo2194a == null) {
            f22876p.warning("Was not able to create subchannel for " + socketAddress);
            throw new IllegalStateException("Can't create subchannel");
        }
        g gVar = new g(iVarMo2194a, EnumC0561p.IDLE, cVar);
        cVar.f22889b = gVar;
        this.f22878h.put(socketAddress, gVar);
        if (iVarMo2194a.mo2223c().m2313b(AbstractC0523S.f1943d) == null) {
            cVar.f22888a = C0563q.m2495a(EnumC0561p.READY);
        }
        iVarMo2194a.mo2228h(new AbstractC0523S.k() { // from class: io.grpc.internal.r0
            @Override // p063H5.AbstractC0523S.k
            /* JADX INFO: renamed from: a */
            public final void mo2231a(C0563q c0563q) {
                this.f22869a.m26161r(iVarMo2194a, c0563q);
            }
        });
        return iVarMo2194a;
    }

    /* JADX INFO: renamed from: p */
    private SocketAddress m26155p(AbstractC0523S.i iVar) {
        return (SocketAddress) iVar.m2221a().m2533a().get(0);
    }

    /* JADX INFO: renamed from: q */
    private boolean m26156q() {
        d dVar = this.f22879i;
        if (dVar == null || dVar.m26167c() || this.f22878h.size() < this.f22879i.m26170f()) {
            return false;
        }
        Iterator it = this.f22878h.values().iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).m26181i()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    private void m26157s() {
        if (this.f22885o) {
            ExecutorC0562p0.d dVar = this.f22882l;
            if (dVar == null || !dVar.m2494b()) {
                this.f22882l = this.f22877g.mo2197d().m2490c(new b(), 250L, TimeUnit.MILLISECONDS, this.f22877g.mo2196c());
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private void m26158t(g gVar) {
        m26153n();
        for (g gVar2 : this.f22878h.values()) {
            if (!gVar2.m26180h().equals(gVar.f22898a)) {
                gVar2.m26180h().mo2227g();
            }
        }
        this.f22878h.clear();
        gVar.m26178j(EnumC0561p.READY);
        this.f22878h.put(m26155p(gVar.f22898a), gVar);
    }

    /* JADX INFO: renamed from: u */
    private void m26159u(EnumC0561p enumC0561p, AbstractC0523S.j jVar) {
        if (enumC0561p == this.f22884n && (enumC0561p == EnumC0561p.IDLE || enumC0561p == EnumC0561p.CONNECTING)) {
            return;
        }
        this.f22884n = enumC0561p;
        this.f22877g.mo2199f(enumC0561p, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m26160v(g gVar) {
        EnumC0561p enumC0561p = gVar.f22899b;
        EnumC0561p enumC0561p2 = EnumC0561p.READY;
        if (enumC0561p != enumC0561p2) {
            return;
        }
        if (gVar.m26177f() == enumC0561p2) {
            m26159u(enumC0561p2, new AbstractC0523S.d(AbstractC0523S.f.m2203h(gVar.f22898a)));
            return;
        }
        EnumC0561p enumC0561pM26177f = gVar.m26177f();
        EnumC0561p enumC0561p3 = EnumC0561p.TRANSIENT_FAILURE;
        if (enumC0561pM26177f == enumC0561p3) {
            m26159u(enumC0561p3, new e(AbstractC0523S.f.m2201f(gVar.f22900c.f22888a.m2498d())));
        } else if (this.f22884n != enumC0561p3) {
            m26159u(gVar.m26177f(), new e(AbstractC0523S.f.m2202g()));
        }
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: a */
    public C0554l0 mo2173a(AbstractC0523S.h hVar) {
        EnumC0561p enumC0561p;
        if (this.f22883m == EnumC0561p.SHUTDOWN) {
            return C0554l0.f2108o.m2462q("Already shut down");
        }
        List listM2213a = hVar.m2213a();
        if (listM2213a.isEmpty()) {
            C0554l0 c0554l0M2462q = C0554l0.f2113t.m2462q("NameResolver returned no usable address. addrs=" + hVar.m2213a() + ", attrs=" + hVar.m2214b());
            mo2175c(c0554l0M2462q);
            return c0554l0M2462q;
        }
        Iterator it = listM2213a.iterator();
        while (it.hasNext()) {
            if (((C0572x) it.next()) == null) {
                C0554l0 c0554l0M2462q2 = C0554l0.f2113t.m2462q("NameResolver returned address list with null endpoint. addrs=" + hVar.m2213a() + ", attrs=" + hVar.m2214b());
                mo2175c(c0554l0M2462q2);
                return c0554l0M2462q2;
            }
        }
        this.f22881k = true;
        hVar.m2215c();
        AbstractC1272k abstractC1272kM5545k = AbstractC1272k.m5533p().m5544j(listM2213a).m5545k();
        d dVar = this.f22879i;
        if (dVar == null) {
            this.f22879i = new d(abstractC1272kM5545k);
        } else if (this.f22883m == EnumC0561p.READY) {
            SocketAddress socketAddressM26165a = dVar.m26165a();
            this.f22879i.m26171g(abstractC1272kM5545k);
            if (this.f22879i.m26169e(socketAddressM26165a)) {
                return C0554l0.f2098e;
            }
            this.f22879i.m26168d();
        } else {
            dVar.m26171g(abstractC1272kM5545k);
        }
        HashSet<SocketAddress> hashSet = new HashSet(this.f22878h.keySet());
        HashSet hashSet2 = new HashSet();
        AbstractC1260B it2 = abstractC1272kM5545k.iterator();
        while (it2.hasNext()) {
            hashSet2.addAll(((C0572x) it2.next()).m2533a());
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((g) this.f22878h.remove(socketAddress)).m26180h().mo2227g();
            }
        }
        if (hashSet.size() == 0 || (enumC0561p = this.f22883m) == EnumC0561p.CONNECTING || enumC0561p == EnumC0561p.READY) {
            EnumC0561p enumC0561p2 = EnumC0561p.CONNECTING;
            this.f22883m = enumC0561p2;
            m26159u(enumC0561p2, new e(AbstractC0523S.f.m2202g()));
            m26153n();
            mo2177e();
        } else {
            EnumC0561p enumC0561p3 = EnumC0561p.IDLE;
            if (enumC0561p == enumC0561p3) {
                m26159u(enumC0561p3, new f(this));
            } else if (enumC0561p == EnumC0561p.TRANSIENT_FAILURE) {
                m26153n();
                mo2177e();
            }
        }
        return C0554l0.f2098e;
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: c */
    public void mo2175c(C0554l0 c0554l0) {
        Iterator it = this.f22878h.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).m26180h().mo2227g();
        }
        this.f22878h.clear();
        m26159u(EnumC0561p.TRANSIENT_FAILURE, new e(AbstractC0523S.f.m2201f(c0554l0)));
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: e */
    public void mo2177e() {
        d dVar = this.f22879i;
        if (dVar == null || !dVar.m26167c() || this.f22883m == EnumC0561p.SHUTDOWN) {
            return;
        }
        SocketAddress socketAddressM26165a = this.f22879i.m26165a();
        AbstractC0523S.i iVarM26180h = this.f22878h.containsKey(socketAddressM26165a) ? ((g) this.f22878h.get(socketAddressM26165a)).m26180h() : m26154o(socketAddressM26165a);
        int i7 = a.f22886a[((g) this.f22878h.get(socketAddressM26165a)).m26179g().ordinal()];
        if (i7 == 1) {
            iVarM26180h.mo2226f();
            ((g) this.f22878h.get(socketAddressM26165a)).m26178j(EnumC0561p.CONNECTING);
            m26157s();
        } else {
            if (i7 == 2) {
                if (this.f22885o) {
                    m26157s();
                    return;
                } else {
                    iVarM26180h.mo2226f();
                    return;
                }
            }
            if (i7 == 3) {
                f22876p.warning("Requesting a connection even though we have a READY subchannel");
            } else {
                if (i7 != 4) {
                    return;
                }
                this.f22879i.m26166b();
                mo2177e();
            }
        }
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: f */
    public void mo2178f() {
        f22876p.log(Level.FINE, "Shutting down, currently have {} subchannels created", Integer.valueOf(this.f22878h.size()));
        EnumC0561p enumC0561p = EnumC0561p.SHUTDOWN;
        this.f22883m = enumC0561p;
        this.f22884n = enumC0561p;
        m26153n();
        Iterator it = this.f22878h.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).m26180h().mo2227g();
        }
        this.f22878h.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: r */
    public void m26161r(AbstractC0523S.i iVar, C0563q c0563q) {
        EnumC0561p enumC0561pM2497c = c0563q.m2497c();
        g gVar = (g) this.f22878h.get(m26155p(iVar));
        if (gVar == null || gVar.m26180h() != iVar || enumC0561pM2497c == EnumC0561p.SHUTDOWN) {
            return;
        }
        EnumC0561p enumC0561p = EnumC0561p.IDLE;
        if (enumC0561pM2497c == enumC0561p) {
            this.f22877g.mo2198e();
        }
        gVar.m26178j(enumC0561pM2497c);
        EnumC0561p enumC0561p2 = this.f22883m;
        EnumC0561p enumC0561p3 = EnumC0561p.TRANSIENT_FAILURE;
        if (enumC0561p2 == enumC0561p3 || this.f22884n == enumC0561p3) {
            if (enumC0561pM2497c == EnumC0561p.CONNECTING) {
                return;
            }
            if (enumC0561pM2497c == enumC0561p) {
                mo2177e();
                return;
            }
        }
        int i7 = a.f22886a[enumC0561pM2497c.ordinal()];
        if (i7 == 1) {
            this.f22879i.m26168d();
            this.f22883m = enumC0561p;
            m26159u(enumC0561p, new f(this));
            return;
        }
        if (i7 == 2) {
            EnumC0561p enumC0561p4 = EnumC0561p.CONNECTING;
            this.f22883m = enumC0561p4;
            m26159u(enumC0561p4, new e(AbstractC0523S.f.m2202g()));
            return;
        }
        if (i7 == 3) {
            m26158t(gVar);
            this.f22879i.m26169e(m26155p(iVar));
            this.f22883m = EnumC0561p.READY;
            m26160v(gVar);
            return;
        }
        if (i7 != 4) {
            throw new IllegalArgumentException("Unsupported state:" + enumC0561pM2497c);
        }
        if (this.f22879i.m26167c() && ((g) this.f22878h.get(this.f22879i.m26165a())).m26180h() == iVar && this.f22879i.m26166b()) {
            m26153n();
            mo2177e();
        }
        if (m26156q()) {
            this.f22883m = enumC0561p3;
            m26159u(enumC0561p3, new e(AbstractC0523S.f.m2201f(c0563q.m2498d())));
            int i8 = this.f22880j + 1;
            this.f22880j = i8;
            if (i8 >= this.f22879i.m26170f() || this.f22881k) {
                this.f22881k = false;
                this.f22880j = 0;
                this.f22877g.mo2198e();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$c */
    private final class c implements AbstractC0523S.k {

        /* JADX INFO: renamed from: a */
        private C0563q f22888a;

        /* JADX INFO: renamed from: b */
        private g f22889b;

        private c() {
            this.f22888a = C0563q.m2495a(EnumC0561p.IDLE);
        }

        @Override // p063H5.AbstractC0523S.k
        /* JADX INFO: renamed from: a */
        public void mo2231a(C0563q c0563q) {
            C5807s0.f22876p.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{c0563q, this.f22889b.f22898a});
            this.f22888a = c0563q;
            if (C5807s0.this.f22879i.m26167c() && ((g) C5807s0.this.f22878h.get(C5807s0.this.f22879i.m26165a())).f22900c == this) {
                C5807s0.this.m26160v(this.f22889b);
            }
        }

        /* synthetic */ c(C5807s0 c5807s0, a aVar) {
            this();
        }
    }
}
