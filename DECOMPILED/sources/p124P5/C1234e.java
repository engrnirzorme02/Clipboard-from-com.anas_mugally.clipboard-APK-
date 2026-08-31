package p124P5;

import p063H5.AbstractC0523S;
import p063H5.C0554l0;
import p063H5.EnumC0561p;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: P5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1234e extends AbstractC1231b {

    /* JADX INFO: renamed from: p */
    static final AbstractC0523S.j f4332p = new c();

    /* JADX INFO: renamed from: g */
    private final AbstractC0523S f4333g;

    /* JADX INFO: renamed from: h */
    private final AbstractC0523S.e f4334h;

    /* JADX INFO: renamed from: i */
    private AbstractC0523S.c f4335i;

    /* JADX INFO: renamed from: j */
    private AbstractC0523S f4336j;

    /* JADX INFO: renamed from: k */
    private AbstractC0523S.c f4337k;

    /* JADX INFO: renamed from: l */
    private AbstractC0523S f4338l;

    /* JADX INFO: renamed from: m */
    private EnumC0561p f4339m;

    /* JADX INFO: renamed from: n */
    private AbstractC0523S.j f4340n;

    /* JADX INFO: renamed from: o */
    private boolean f4341o;

    /* JADX INFO: renamed from: P5.e$a */
    class a extends AbstractC0523S {
        a() {
        }

        @Override // p063H5.AbstractC0523S
        /* JADX INFO: renamed from: c */
        public void mo2175c(C0554l0 c0554l0) {
            C1234e.this.f4334h.mo2199f(EnumC0561p.TRANSIENT_FAILURE, new AbstractC0523S.d(AbstractC0523S.f.m2201f(c0554l0)));
        }

        @Override // p063H5.AbstractC0523S
        /* JADX INFO: renamed from: d */
        public void mo2176d(AbstractC0523S.h hVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // p063H5.AbstractC0523S
        /* JADX INFO: renamed from: f */
        public void mo2178f() {
        }
    }

    /* JADX INFO: renamed from: P5.e$b */
    class b extends AbstractC1232c {

        /* JADX INFO: renamed from: a */
        AbstractC0523S f4343a;

        b() {
        }

        @Override // p124P5.AbstractC1232c, p063H5.AbstractC0523S.e
        /* JADX INFO: renamed from: f */
        public void mo2199f(EnumC0561p enumC0561p, AbstractC0523S.j jVar) {
            if (this.f4343a == C1234e.this.f4338l) {
                AbstractC1209m.m5309u(C1234e.this.f4341o, "there's pending lb while current lb has been out of READY");
                C1234e.this.f4339m = enumC0561p;
                C1234e.this.f4340n = jVar;
                if (enumC0561p == EnumC0561p.READY) {
                    C1234e.this.m5364q();
                    return;
                }
                return;
            }
            if (this.f4343a == C1234e.this.f4336j) {
                C1234e.this.f4341o = enumC0561p == EnumC0561p.READY;
                if (C1234e.this.f4341o || C1234e.this.f4338l == C1234e.this.f4333g) {
                    C1234e.this.f4334h.mo2199f(enumC0561p, jVar);
                } else {
                    C1234e.this.m5364q();
                }
            }
        }

        @Override // p124P5.AbstractC1232c
        /* JADX INFO: renamed from: g */
        protected AbstractC0523S.e mo5353g() {
            return C1234e.this.f4334h;
        }
    }

    /* JADX INFO: renamed from: P5.e$c */
    class c extends AbstractC0523S.j {
        c() {
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.f mo2179a(AbstractC0523S.g gVar) {
            return AbstractC0523S.f.m2202g();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public C1234e(AbstractC0523S.e eVar) {
        a aVar = new a();
        this.f4333g = aVar;
        this.f4336j = aVar;
        this.f4338l = aVar;
        this.f4334h = (AbstractC0523S.e) AbstractC1209m.m5303o(eVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m5364q() {
        this.f4334h.mo2199f(this.f4339m, this.f4340n);
        this.f4336j.mo2178f();
        this.f4336j = this.f4338l;
        this.f4335i = this.f4337k;
        this.f4338l = this.f4333g;
        this.f4337k = null;
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: f */
    public void mo2178f() {
        this.f4338l.mo2178f();
        this.f4336j.mo2178f();
    }

    @Override // p124P5.AbstractC1231b
    /* JADX INFO: renamed from: g */
    protected AbstractC0523S mo5352g() {
        AbstractC0523S abstractC0523S = this.f4338l;
        return abstractC0523S == this.f4333g ? this.f4336j : abstractC0523S;
    }

    /* JADX INFO: renamed from: r */
    public void m5365r(AbstractC0523S.c cVar) {
        AbstractC1209m.m5303o(cVar, "newBalancerFactory");
        if (cVar.equals(this.f4337k)) {
            return;
        }
        this.f4338l.mo2178f();
        this.f4338l = this.f4333g;
        this.f4337k = null;
        this.f4339m = EnumC0561p.CONNECTING;
        this.f4340n = f4332p;
        if (cVar.equals(this.f4335i)) {
            return;
        }
        b bVar = new b();
        AbstractC0523S abstractC0523SMo2193a = cVar.mo2193a(bVar);
        bVar.f4343a = abstractC0523SMo2193a;
        this.f4338l = abstractC0523SMo2193a;
        this.f4337k = cVar;
        if (this.f4341o) {
            return;
        }
        m5364q();
    }
}
