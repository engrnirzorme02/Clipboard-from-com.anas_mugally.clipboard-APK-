package io.grpc.internal;

import androidx.appcompat.app.AbstractC2263x;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p063H5.AbstractC0541f;
import p063H5.AbstractC0551k;
import p063H5.C0509D;
import p063H5.C0510E;
import p063H5.C0516K;
import p063H5.C0530Z;
import p063H5.C0531a;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.C0554l0;
import p063H5.C0563q;
import p063H5.C0572x;
import p063H5.EnumC0561p;
import p063H5.ExecutorC0562p0;
import p063H5.InterfaceC0515J;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;
import p122P3.C1212p;
import p122P3.InterfaceC1214r;

/* JADX INFO: renamed from: io.grpc.internal.Z */
/* JADX INFO: loaded from: classes.dex */
final class C5769Z implements InterfaceC0515J, InterfaceC5760T0 {

    /* JADX INFO: renamed from: a */
    private final C0516K f22333a;

    /* JADX INFO: renamed from: b */
    private final String f22334b;

    /* JADX INFO: renamed from: c */
    private final String f22335c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5788j.a f22336d;

    /* JADX INFO: renamed from: e */
    private final j f22337e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC5810u f22338f;

    /* JADX INFO: renamed from: g */
    private final ScheduledExecutorService f22339g;

    /* JADX INFO: renamed from: h */
    private final C0510E f22340h;

    /* JADX INFO: renamed from: i */
    private final C5796n f22341i;

    /* JADX INFO: renamed from: j */
    private final C5800p f22342j;

    /* JADX INFO: renamed from: k */
    private final AbstractC0541f f22343k;

    /* JADX INFO: renamed from: l */
    private final List f22344l;

    /* JADX INFO: renamed from: m */
    private final ExecutorC0562p0 f22345m;

    /* JADX INFO: renamed from: n */
    private final k f22346n;

    /* JADX INFO: renamed from: o */
    private volatile List f22347o;

    /* JADX INFO: renamed from: p */
    private InterfaceC5788j f22348p;

    /* JADX INFO: renamed from: q */
    private final C1212p f22349q;

    /* JADX INFO: renamed from: r */
    private ExecutorC0562p0.d f22350r;

    /* JADX INFO: renamed from: s */
    private ExecutorC0562p0.d f22351s;

    /* JADX INFO: renamed from: t */
    private InterfaceC5793l0 f22352t;

    /* JADX INFO: renamed from: w */
    private InterfaceC5814w f22355w;

    /* JADX INFO: renamed from: x */
    private volatile InterfaceC5793l0 f22356x;

    /* JADX INFO: renamed from: z */
    private C0554l0 f22358z;

    /* JADX INFO: renamed from: u */
    private final Collection f22353u = new ArrayList();

    /* JADX INFO: renamed from: v */
    private final AbstractC5767X f22354v = new a();

    /* JADX INFO: renamed from: y */
    private volatile C0563q f22357y = C0563q.m2495a(EnumC0561p.IDLE);

    /* JADX INFO: renamed from: io.grpc.internal.Z$a */
    class a extends AbstractC5767X {
        a() {
        }

        @Override // io.grpc.internal.AbstractC5767X
        /* JADX INFO: renamed from: b */
        protected void mo3357b() {
            C5769Z.this.f22337e.mo25807a(C5769Z.this);
        }

        @Override // io.grpc.internal.AbstractC5767X
        /* JADX INFO: renamed from: c */
        protected void mo3358c() {
            C5769Z.this.f22337e.mo25808b(C5769Z.this);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5769Z.this.f22350r = null;
            C5769Z.this.f22343k.mo2419a(AbstractC0541f.a.INFO, "CONNECTING after backoff");
            C5769Z.this.m25778O(EnumC0561p.CONNECTING);
            C5769Z.this.m25784U();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5769Z.this.f22357y.m2497c() == EnumC0561p.IDLE) {
                C5769Z.this.f22343k.mo2419a(AbstractC0541f.a.INFO, "CONNECTING as requested");
                C5769Z.this.m25778O(EnumC0561p.CONNECTING);
                C5769Z.this.m25784U();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f22362a;

        /* JADX INFO: renamed from: io.grpc.internal.Z$d$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC5793l0 interfaceC5793l0 = C5769Z.this.f22352t;
                C5769Z.this.f22351s = null;
                C5769Z.this.f22352t = null;
                interfaceC5793l0.mo3353h(C0554l0.f2113t.m2462q("InternalSubchannel closed transport due to address change"));
            }
        }

        d(List list) {
            this.f22362a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC5793l0 interfaceC5793l0;
            SocketAddress socketAddressM25811a = C5769Z.this.f22346n.m25811a();
            C5769Z.this.f22346n.m25818h(this.f22362a);
            C5769Z.this.f22347o = this.f22362a;
            EnumC0561p enumC0561pM2497c = C5769Z.this.f22357y.m2497c();
            EnumC0561p enumC0561p = EnumC0561p.READY;
            if ((enumC0561pM2497c != enumC0561p && C5769Z.this.f22357y.m2497c() != EnumC0561p.CONNECTING) || C5769Z.this.f22346n.m25817g(socketAddressM25811a)) {
                interfaceC5793l0 = null;
            } else if (C5769Z.this.f22357y.m2497c() == enumC0561p) {
                interfaceC5793l0 = C5769Z.this.f22356x;
                C5769Z.this.f22356x = null;
                C5769Z.this.f22346n.m25816f();
                C5769Z.this.m25778O(EnumC0561p.IDLE);
            } else {
                C5769Z.this.f22355w.mo3353h(C0554l0.f2113t.m2462q("InternalSubchannel closed pending transport due to address change"));
                C5769Z.this.f22355w = null;
                C5769Z.this.f22346n.m25816f();
                C5769Z.this.m25784U();
                interfaceC5793l0 = null;
            }
            if (interfaceC5793l0 != null) {
                if (C5769Z.this.f22351s != null) {
                    C5769Z.this.f22352t.mo3353h(C0554l0.f2113t.m2462q("InternalSubchannel closed transport early due to address change"));
                    C5769Z.this.f22351s.m2493a();
                    C5769Z.this.f22351s = null;
                    C5769Z.this.f22352t = null;
                }
                C5769Z.this.f22352t = interfaceC5793l0;
                C5769Z c5769z = C5769Z.this;
                c5769z.f22351s = c5769z.f22345m.m2490c(new a(), 5L, TimeUnit.SECONDS, C5769Z.this.f22339g);
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0554l0 f22365a;

        e(C0554l0 c0554l0) {
            this.f22365a = c0554l0;
        }

        @Override // java.lang.Runnable
        public void run() {
            EnumC0561p enumC0561pM2497c = C5769Z.this.f22357y.m2497c();
            EnumC0561p enumC0561p = EnumC0561p.SHUTDOWN;
            if (enumC0561pM2497c == enumC0561p) {
                return;
            }
            C5769Z.this.f22358z = this.f22365a;
            InterfaceC5793l0 interfaceC5793l0 = C5769Z.this.f22356x;
            InterfaceC5814w interfaceC5814w = C5769Z.this.f22355w;
            C5769Z.this.f22356x = null;
            C5769Z.this.f22355w = null;
            C5769Z.this.m25778O(enumC0561p);
            C5769Z.this.f22346n.m25816f();
            if (C5769Z.this.f22353u.isEmpty()) {
                C5769Z.this.m25780Q();
            }
            C5769Z.this.m25776M();
            if (C5769Z.this.f22351s != null) {
                C5769Z.this.f22351s.m2493a();
                C5769Z.this.f22352t.mo3353h(this.f22365a);
                C5769Z.this.f22351s = null;
                C5769Z.this.f22352t = null;
            }
            if (interfaceC5793l0 != null) {
                interfaceC5793l0.mo3353h(this.f22365a);
            }
            if (interfaceC5814w != null) {
                interfaceC5814w.mo3353h(this.f22365a);
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$f */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5769Z.this.f22343k.mo2419a(AbstractC0541f.a.INFO, "Terminated");
            C5769Z.this.f22337e.mo25810d(C5769Z.this);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5814w f22368a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f22369b;

        g(InterfaceC5814w interfaceC5814w, boolean z7) {
            this.f22368a = interfaceC5814w;
            this.f22369b = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5769Z.this.f22354v.m25761e(this.f22368a, this.f22369b);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0554l0 f22371a;

        h(C0554l0 c0554l0) {
            this.f22371a = c0554l0;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(C5769Z.this.f22353u).iterator();
            while (it.hasNext()) {
                ((InterfaceC5793l0) it.next()).mo3350d(this.f22371a);
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$i */
    static final class i extends AbstractC5742K {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5814w f22373a;

        /* JADX INFO: renamed from: b */
        private final C5796n f22374b;

        /* JADX INFO: renamed from: io.grpc.internal.Z$i$a */
        class a extends AbstractC5738I {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5804r f22375a;

            /* JADX INFO: renamed from: io.grpc.internal.Z$i$a$a, reason: collision with other inner class name */
            class C7691a extends AbstractC5740J {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ InterfaceC5806s f22377a;

                C7691a(InterfaceC5806s interfaceC5806s) {
                    this.f22377a = interfaceC5806s;
                }

                @Override // io.grpc.internal.AbstractC5740J, io.grpc.internal.InterfaceC5806s
                /* JADX INFO: renamed from: c */
                public void mo25475c(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
                    i.this.f22374b.m26076a(c0554l0.m2460o());
                    super.mo25475c(c0554l0, aVar, c0530z);
                }

                @Override // io.grpc.internal.AbstractC5740J
                /* JADX INFO: renamed from: e */
                protected InterfaceC5806s mo25593e() {
                    return this.f22377a;
                }
            }

            a(InterfaceC5804r interfaceC5804r) {
                this.f22375a = interfaceC5804r;
            }

            @Override // io.grpc.internal.AbstractC5738I
            /* JADX INFO: renamed from: h */
            protected InterfaceC5804r mo25590h() {
                return this.f22375a;
            }

            @Override // io.grpc.internal.AbstractC5738I, io.grpc.internal.InterfaceC5804r
            /* JADX INFO: renamed from: s */
            public void mo25467s(InterfaceC5806s interfaceC5806s) {
                i.this.f22374b.m26077b();
                super.mo25467s(new C7691a(interfaceC5806s));
            }
        }

        /* synthetic */ i(InterfaceC5814w interfaceC5814w, C5796n c5796n, a aVar) {
            this(interfaceC5814w, c5796n);
        }

        @Override // io.grpc.internal.AbstractC5742K
        /* JADX INFO: renamed from: a */
        protected InterfaceC5814w mo25600a() {
            return this.f22373a;
        }

        @Override // io.grpc.internal.AbstractC5742K, io.grpc.internal.InterfaceC5808t
        /* JADX INFO: renamed from: c */
        public InterfaceC5804r mo3348c(C0532a0 c0532a0, C0530Z c0530z, C0535c c0535c, AbstractC0551k[] abstractC0551kArr) {
            return new a(super.mo3348c(c0532a0, c0530z, c0535c, abstractC0551kArr));
        }

        private i(InterfaceC5814w interfaceC5814w, C5796n c5796n) {
            this.f22373a = interfaceC5814w;
            this.f22374b = c5796n;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$j */
    static abstract class j {
        j() {
        }

        /* JADX INFO: renamed from: a */
        abstract void mo25807a(C5769Z c5769z);

        /* JADX INFO: renamed from: b */
        abstract void mo25808b(C5769Z c5769z);

        /* JADX INFO: renamed from: c */
        abstract void mo25809c(C5769Z c5769z, C0563q c0563q);

        /* JADX INFO: renamed from: d */
        abstract void mo25810d(C5769Z c5769z);
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$k */
    static final class k {

        /* JADX INFO: renamed from: a */
        private List f22379a;

        /* JADX INFO: renamed from: b */
        private int f22380b;

        /* JADX INFO: renamed from: c */
        private int f22381c;

        public k(List list) {
            this.f22379a = list;
        }

        /* JADX INFO: renamed from: a */
        public SocketAddress m25811a() {
            return (SocketAddress) ((C0572x) this.f22379a.get(this.f22380b)).m2533a().get(this.f22381c);
        }

        /* JADX INFO: renamed from: b */
        public C0531a m25812b() {
            return ((C0572x) this.f22379a.get(this.f22380b)).m2534b();
        }

        /* JADX INFO: renamed from: c */
        public void m25813c() {
            C0572x c0572x = (C0572x) this.f22379a.get(this.f22380b);
            int i7 = this.f22381c + 1;
            this.f22381c = i7;
            if (i7 >= c0572x.m2533a().size()) {
                this.f22380b++;
                this.f22381c = 0;
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m25814d() {
            return this.f22380b == 0 && this.f22381c == 0;
        }

        /* JADX INFO: renamed from: e */
        public boolean m25815e() {
            return this.f22380b < this.f22379a.size();
        }

        /* JADX INFO: renamed from: f */
        public void m25816f() {
            this.f22380b = 0;
            this.f22381c = 0;
        }

        /* JADX INFO: renamed from: g */
        public boolean m25817g(SocketAddress socketAddress) {
            for (int i7 = 0; i7 < this.f22379a.size(); i7++) {
                int iIndexOf = ((C0572x) this.f22379a.get(i7)).m2533a().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.f22380b = i7;
                    this.f22381c = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: h */
        public void m25818h(List list) {
            this.f22379a = list;
            m25816f();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$l */
    private class l implements InterfaceC5793l0.a {

        /* JADX INFO: renamed from: a */
        final InterfaceC5814w f22382a;

        /* JADX INFO: renamed from: b */
        boolean f22383b = false;

        /* JADX INFO: renamed from: io.grpc.internal.Z$l$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5769Z.this.f22348p = null;
                if (C5769Z.this.f22358z != null) {
                    AbstractC1209m.m5309u(C5769Z.this.f22356x == null, "Unexpected non-null activeTransport");
                    l lVar = l.this;
                    lVar.f22382a.mo3353h(C5769Z.this.f22358z);
                    return;
                }
                InterfaceC5814w interfaceC5814w = C5769Z.this.f22355w;
                l lVar2 = l.this;
                InterfaceC5814w interfaceC5814w2 = lVar2.f22382a;
                if (interfaceC5814w == interfaceC5814w2) {
                    C5769Z.this.f22356x = interfaceC5814w2;
                    C5769Z.this.f22355w = null;
                    C5769Z.this.m25778O(EnumC0561p.READY);
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.Z$l$b */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0554l0 f22386a;

            b(C0554l0 c0554l0) {
                this.f22386a = c0554l0;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C5769Z.this.f22357y.m2497c() == EnumC0561p.SHUTDOWN) {
                    return;
                }
                InterfaceC5793l0 interfaceC5793l0 = C5769Z.this.f22356x;
                l lVar = l.this;
                if (interfaceC5793l0 == lVar.f22382a) {
                    C5769Z.this.f22356x = null;
                    C5769Z.this.f22346n.m25816f();
                    C5769Z.this.m25778O(EnumC0561p.IDLE);
                    return;
                }
                InterfaceC5814w interfaceC5814w = C5769Z.this.f22355w;
                l lVar2 = l.this;
                if (interfaceC5814w == lVar2.f22382a) {
                    AbstractC1209m.m5311w(C5769Z.this.f22357y.m2497c() == EnumC0561p.CONNECTING, "Expected state is CONNECTING, actual state is %s", C5769Z.this.f22357y.m2497c());
                    C5769Z.this.f22346n.m25813c();
                    if (C5769Z.this.f22346n.m25815e()) {
                        C5769Z.this.m25784U();
                        return;
                    }
                    C5769Z.this.f22355w = null;
                    C5769Z.this.f22346n.m25816f();
                    C5769Z.this.m25783T(this.f22386a);
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.Z$l$c */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5769Z.this.f22353u.remove(l.this.f22382a);
                if (C5769Z.this.f22357y.m2497c() == EnumC0561p.SHUTDOWN && C5769Z.this.f22353u.isEmpty()) {
                    C5769Z.this.m25780Q();
                }
            }
        }

        l(InterfaceC5814w interfaceC5814w) {
            this.f22382a = interfaceC5814w;
        }

        @Override // io.grpc.internal.InterfaceC5793l0.a
        /* JADX INFO: renamed from: a */
        public C0531a mo25819a(C0531a c0531a) {
            Iterator it = C5769Z.this.f22344l.iterator();
            if (!it.hasNext()) {
                return c0531a;
            }
            AbstractC2263x.m9328a(it.next());
            throw null;
        }

        @Override // io.grpc.internal.InterfaceC5793l0.a
        /* JADX INFO: renamed from: b */
        public void mo25820b() {
            C5769Z.this.f22343k.mo2419a(AbstractC0541f.a.INFO, "READY");
            C5769Z.this.f22345m.execute(new a());
        }

        @Override // io.grpc.internal.InterfaceC5793l0.a
        /* JADX INFO: renamed from: c */
        public void mo25821c() {
            AbstractC1209m.m5309u(this.f22383b, "transportShutdown() must be called before transportTerminated().");
            C5769Z.this.f22343k.mo2420b(AbstractC0541f.a.INFO, "{0} Terminated", this.f22382a.mo2172g());
            C5769Z.this.f22340h.m2143i(this.f22382a);
            C5769Z.this.m25781R(this.f22382a, false);
            Iterator it = C5769Z.this.f22344l.iterator();
            if (!it.hasNext()) {
                C5769Z.this.f22345m.execute(new c());
            } else {
                AbstractC2263x.m9328a(it.next());
                this.f22382a.mo3346b();
                throw null;
            }
        }

        @Override // io.grpc.internal.InterfaceC5793l0.a
        /* JADX INFO: renamed from: d */
        public void mo25822d(boolean z7) {
            C5769Z.this.m25781R(this.f22382a, z7);
        }

        @Override // io.grpc.internal.InterfaceC5793l0.a
        /* JADX INFO: renamed from: e */
        public void mo25823e(C0554l0 c0554l0) {
            C5769Z.this.f22343k.mo2420b(AbstractC0541f.a.INFO, "{0} SHUTDOWN with {1}", this.f22382a.mo2172g(), C5769Z.this.m25782S(c0554l0));
            this.f22383b = true;
            C5769Z.this.f22345m.execute(new b(c0554l0));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.Z$m */
    static final class m extends AbstractC0541f {

        /* JADX INFO: renamed from: a */
        C0516K f22389a;

        m() {
        }

        @Override // p063H5.AbstractC0541f
        /* JADX INFO: renamed from: a */
        public void mo2419a(AbstractC0541f.a aVar, String str) {
            C5798o.m26095d(this.f22389a, aVar, str);
        }

        @Override // p063H5.AbstractC0541f
        /* JADX INFO: renamed from: b */
        public void mo2420b(AbstractC0541f.a aVar, String str, Object... objArr) {
            C5798o.m26096e(this.f22389a, aVar, str, objArr);
        }
    }

    C5769Z(List list, String str, String str2, InterfaceC5788j.a aVar, InterfaceC5810u interfaceC5810u, ScheduledExecutorService scheduledExecutorService, InterfaceC1214r interfaceC1214r, ExecutorC0562p0 executorC0562p0, j jVar, C0510E c0510e, C5796n c5796n, C5800p c5800p, C0516K c0516k, AbstractC0541f abstractC0541f, List list2) {
        AbstractC1209m.m5303o(list, "addressGroups");
        AbstractC1209m.m5293e(!list.isEmpty(), "addressGroups is empty");
        m25777N(list, "addressGroups contains null entry");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f22347o = listUnmodifiableList;
        this.f22346n = new k(listUnmodifiableList);
        this.f22334b = str;
        this.f22335c = str2;
        this.f22336d = aVar;
        this.f22338f = interfaceC5810u;
        this.f22339g = scheduledExecutorService;
        this.f22349q = (C1212p) interfaceC1214r.get();
        this.f22345m = executorC0562p0;
        this.f22337e = jVar;
        this.f22340h = c0510e;
        this.f22341i = c5796n;
        this.f22342j = (C5800p) AbstractC1209m.m5303o(c5800p, "channelTracer");
        this.f22333a = (C0516K) AbstractC1209m.m5303o(c0516k, "logId");
        this.f22343k = (AbstractC0541f) AbstractC1209m.m5303o(abstractC0541f, "channelLogger");
        this.f22344l = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m25776M() {
        this.f22345m.m2492f();
        ExecutorC0562p0.d dVar = this.f22350r;
        if (dVar != null) {
            dVar.m2493a();
            this.f22350r = null;
            this.f22348p = null;
        }
    }

    /* JADX INFO: renamed from: N */
    private static void m25777N(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1209m.m5303o(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public void m25778O(EnumC0561p enumC0561p) {
        this.f22345m.m2492f();
        m25779P(C0563q.m2495a(enumC0561p));
    }

    /* JADX INFO: renamed from: P */
    private void m25779P(C0563q c0563q) {
        this.f22345m.m2492f();
        if (this.f22357y.m2497c() != c0563q.m2497c()) {
            AbstractC1209m.m5309u(this.f22357y.m2497c() != EnumC0561p.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + c0563q);
            this.f22357y = c0563q;
            this.f22337e.mo25809c(this, c0563q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public void m25780Q() {
        this.f22345m.execute(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public void m25781R(InterfaceC5814w interfaceC5814w, boolean z7) {
        this.f22345m.execute(new g(interfaceC5814w, z7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public String m25782S(C0554l0 c0554l0) {
        StringBuilder sb = new StringBuilder();
        sb.append(c0554l0.m2458m());
        if (c0554l0.m2459n() != null) {
            sb.append("(");
            sb.append(c0554l0.m2459n());
            sb.append(")");
        }
        if (c0554l0.m2457l() != null) {
            sb.append("[");
            sb.append(c0554l0.m2457l());
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m25783T(C0554l0 c0554l0) {
        this.f22345m.m2492f();
        m25779P(C0563q.m2496b(c0554l0));
        if (this.f22348p == null) {
            this.f22348p = this.f22336d.get();
        }
        long jMo25585a = this.f22348p.mo25585a();
        C1212p c1212p = this.f22349q;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jM5320d = jMo25585a - c1212p.m5320d(timeUnit);
        this.f22343k.mo2420b(AbstractC0541f.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", m25782S(c0554l0), Long.valueOf(jM5320d));
        AbstractC1209m.m5309u(this.f22350r == null, "previous reconnectTask is not done");
        this.f22350r = this.f22345m.m2490c(new b(), jM5320d, timeUnit, this.f22339g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public void m25784U() {
        SocketAddress socketAddressM2128c;
        C0509D c0509d;
        this.f22345m.m2492f();
        AbstractC1209m.m5309u(this.f22350r == null, "Should have no reconnectTask scheduled");
        if (this.f22346n.m25814d()) {
            this.f22349q.m5321f().m5322g();
        }
        SocketAddress socketAddressM25811a = this.f22346n.m25811a();
        a aVar = null;
        if (socketAddressM25811a instanceof C0509D) {
            c0509d = (C0509D) socketAddressM25811a;
            socketAddressM2128c = c0509d.m2128c();
        } else {
            socketAddressM2128c = socketAddressM25811a;
            c0509d = null;
        }
        C0531a c0531aM25812b = this.f22346n.m25812b();
        String str = (String) c0531aM25812b.m2313b(C0572x.f2205d);
        InterfaceC5810u.a aVar2 = new InterfaceC5810u.a();
        if (str == null) {
            str = this.f22334b;
        }
        InterfaceC5810u.a aVarM26188g = aVar2.m26186e(str).m26187f(c0531aM25812b).m26189h(this.f22335c).m26188g(c0509d);
        m mVar = new m();
        mVar.f22389a = mo2172g();
        i iVar = new i(this.f22338f.mo3244M(socketAddressM2128c, aVarM26188g, mVar), this.f22341i, aVar);
        mVar.f22389a = iVar.mo2172g();
        this.f22340h.m2140c(iVar);
        this.f22355w = iVar;
        this.f22353u.add(iVar);
        Runnable runnableMo3351e = iVar.mo3351e(new l(iVar));
        if (runnableMo3351e != null) {
            this.f22345m.m2489b(runnableMo3351e);
        }
        this.f22343k.mo2420b(AbstractC0541f.a.INFO, "Started transport {0}", mVar.f22389a);
    }

    /* JADX INFO: renamed from: V */
    public void m25803V(List list) {
        AbstractC1209m.m5303o(list, "newAddressGroups");
        m25777N(list, "newAddressGroups contains null entry");
        AbstractC1209m.m5293e(!list.isEmpty(), "newAddressGroups is empty");
        this.f22345m.execute(new d(Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // io.grpc.internal.InterfaceC5760T0
    /* JADX INFO: renamed from: a */
    public InterfaceC5808t mo25733a() {
        InterfaceC5793l0 interfaceC5793l0 = this.f22356x;
        if (interfaceC5793l0 != null) {
            return interfaceC5793l0;
        }
        this.f22345m.execute(new c());
        return null;
    }

    /* JADX INFO: renamed from: d */
    void m25804d(C0554l0 c0554l0) {
        m25805h(c0554l0);
        this.f22345m.execute(new h(c0554l0));
    }

    @Override // p063H5.InterfaceC0521P
    /* JADX INFO: renamed from: g */
    public C0516K mo2172g() {
        return this.f22333a;
    }

    /* JADX INFO: renamed from: h */
    public void m25805h(C0554l0 c0554l0) {
        this.f22345m.execute(new e(c0554l0));
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5276c("logId", this.f22333a.m2164d()).m5277d("addressGroups", this.f22347o).toString();
    }
}
