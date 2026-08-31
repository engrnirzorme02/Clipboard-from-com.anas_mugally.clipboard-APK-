package io.grpc.internal;

import java.util.List;
import java.util.Map;
import p063H5.AbstractC0523S;
import p063H5.AbstractC0524T;
import p063H5.AbstractC0536c0;
import p063H5.AbstractC0541f;
import p063H5.C0525U;
import p063H5.C0554l0;
import p063H5.EnumC0561p;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5786i {

    /* JADX INFO: renamed from: a */
    private final C0525U f22654a;

    /* JADX INFO: renamed from: b */
    private final String f22655b;

    /* JADX INFO: renamed from: io.grpc.internal.i$b */
    public final class b {

        /* JADX INFO: renamed from: a */
        private final AbstractC0523S.e f22656a;

        /* JADX INFO: renamed from: b */
        private AbstractC0523S f22657b;

        /* JADX INFO: renamed from: c */
        private AbstractC0524T f22658c;

        b(AbstractC0523S.e eVar) {
            this.f22656a = eVar;
            AbstractC0524T abstractC0524TM2240d = C5786i.this.f22654a.m2240d(C5786i.this.f22655b);
            this.f22658c = abstractC0524TM2240d;
            if (abstractC0524TM2240d != null) {
                this.f22657b = abstractC0524TM2240d.mo2193a(eVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + C5786i.this.f22655b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        /* JADX INFO: renamed from: a */
        public AbstractC0523S m26034a() {
            return this.f22657b;
        }

        /* JADX INFO: renamed from: b */
        void m26035b(C0554l0 c0554l0) {
            m26034a().mo2175c(c0554l0);
        }

        /* JADX INFO: renamed from: c */
        void m26036c() {
            m26034a().mo2177e();
        }

        /* JADX INFO: renamed from: d */
        void m26037d() {
            this.f22657b.mo2178f();
            this.f22657b = null;
        }

        /* JADX INFO: renamed from: e */
        C0554l0 m26038e(AbstractC0523S.h hVar) {
            AbstractC5743K0.b bVar = (AbstractC5743K0.b) hVar.m2215c();
            if (bVar == null) {
                try {
                    C5786i c5786i = C5786i.this;
                    bVar = new AbstractC5743K0.b(c5786i.m26031d(c5786i.f22655b, "using default policy"), null);
                } catch (f e7) {
                    this.f22656a.mo2199f(EnumC0561p.TRANSIENT_FAILURE, new d(C0554l0.f2112s.m2462q(e7.getMessage())));
                    this.f22657b.mo2178f();
                    this.f22658c = null;
                    this.f22657b = new e();
                    return C0554l0.f2098e;
                }
            }
            if (this.f22658c == null || !bVar.f22200a.mo2232b().equals(this.f22658c.mo2232b())) {
                this.f22656a.mo2199f(EnumC0561p.CONNECTING, new c());
                this.f22657b.mo2178f();
                AbstractC0524T abstractC0524T = bVar.f22200a;
                this.f22658c = abstractC0524T;
                AbstractC0523S abstractC0523S = this.f22657b;
                this.f22657b = abstractC0524T.mo2193a(this.f22656a);
                this.f22656a.mo2195b().mo2420b(AbstractC0541f.a.INFO, "Load balancer changed from {0} to {1}", abstractC0523S.getClass().getSimpleName(), this.f22657b.getClass().getSimpleName());
            }
            Object obj = bVar.f22201b;
            if (obj != null) {
                this.f22656a.mo2195b().mo2420b(AbstractC0541f.a.DEBUG, "Load-balancing config: {0}", bVar.f22201b);
            }
            return m26034a().mo2173a(AbstractC0523S.h.m2212d().m2218b(hVar.m2213a()).m2219c(hVar.m2214b()).m2220d(obj).m2217a());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.i$c */
    private static final class c extends AbstractC0523S.j {
        private c() {
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.f mo2179a(AbstractC0523S.g gVar) {
            return AbstractC0523S.f.m2202g();
        }

        public String toString() {
            return AbstractC1203g.m5266a(c.class).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.i$d */
    private static final class d extends AbstractC0523S.j {

        /* JADX INFO: renamed from: a */
        private final C0554l0 f22660a;

        d(C0554l0 c0554l0) {
            this.f22660a = c0554l0;
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.f mo2179a(AbstractC0523S.g gVar) {
            return AbstractC0523S.f.m2201f(this.f22660a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.i$e */
    private static final class e extends AbstractC0523S {
        private e() {
        }

        @Override // p063H5.AbstractC0523S
        /* JADX INFO: renamed from: a */
        public C0554l0 mo2173a(AbstractC0523S.h hVar) {
            return C0554l0.f2098e;
        }

        @Override // p063H5.AbstractC0523S
        /* JADX INFO: renamed from: c */
        public void mo2175c(C0554l0 c0554l0) {
        }

        @Override // p063H5.AbstractC0523S
        /* JADX INFO: renamed from: d */
        public void mo2176d(AbstractC0523S.h hVar) {
        }

        @Override // p063H5.AbstractC0523S
        /* JADX INFO: renamed from: f */
        public void mo2178f() {
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.i$f */
    static final class f extends Exception {
        private f(String str) {
            super(str);
        }
    }

    public C5786i(String str) {
        this(C0525U.m2237b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public AbstractC0524T m26031d(String str, String str2) throws f {
        AbstractC0524T abstractC0524TM2240d = this.f22654a.m2240d(str);
        if (abstractC0524TM2240d != null) {
            return abstractC0524TM2240d;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    /* JADX INFO: renamed from: e */
    public b m26032e(AbstractC0523S.e eVar) {
        return new b(eVar);
    }

    /* JADX INFO: renamed from: f */
    AbstractC0536c0.b m26033f(Map map) {
        List listM25601A;
        if (map != null) {
            try {
                listM25601A = AbstractC5743K0.m25601A(AbstractC5743K0.m25608g(map));
            } catch (RuntimeException e7) {
                return AbstractC0536c0.b.m2387b(C0554l0.f2100g.m2462q("can't parse load balancer configuration").m2461p(e7));
            }
        } else {
            listM25601A = null;
        }
        if (listM25601A == null || listM25601A.isEmpty()) {
            return null;
        }
        return AbstractC5743K0.m25626y(listM25601A, this.f22654a);
    }

    C5786i(C0525U c0525u, String str) {
        this.f22654a = (C0525U) AbstractC1209m.m5303o(c0525u, "registry");
        this.f22655b = (String) AbstractC1209m.m5303o(str, "defaultPolicy");
    }
}
