package io.grpc.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import p063H5.AbstractC0523S;
import p063H5.C0554l0;
import p063H5.C0563q;
import p063H5.EnumC0561p;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.u0 */
/* JADX INFO: loaded from: classes.dex */
final class C5811u0 extends AbstractC0523S {

    /* JADX INFO: renamed from: g */
    private final AbstractC0523S.e f22907g;

    /* JADX INFO: renamed from: h */
    private AbstractC0523S.i f22908h;

    /* JADX INFO: renamed from: i */
    private EnumC0561p f22909i = EnumC0561p.IDLE;

    /* JADX INFO: renamed from: io.grpc.internal.u0$a */
    class a implements AbstractC0523S.k {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC0523S.i f22910a;

        a(AbstractC0523S.i iVar) {
            this.f22910a = iVar;
        }

        @Override // p063H5.AbstractC0523S.k
        /* JADX INFO: renamed from: a */
        public void mo2231a(C0563q c0563q) {
            C5811u0.this.m26192i(this.f22910a, c0563q);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.u0$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f22912a;

        static {
            int[] iArr = new int[EnumC0561p.values().length];
            f22912a = iArr;
            try {
                iArr[EnumC0561p.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22912a[EnumC0561p.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22912a[EnumC0561p.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22912a[EnumC0561p.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.u0$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final Boolean f22913a;

        /* JADX INFO: renamed from: b */
        final Long f22914b;

        public c(Boolean bool) {
            this(bool, null);
        }

        c(Boolean bool, Long l7) {
            this.f22913a = bool;
            this.f22914b = l7;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.u0$d */
    private static final class d extends AbstractC0523S.j {

        /* JADX INFO: renamed from: a */
        private final AbstractC0523S.f f22915a;

        d(AbstractC0523S.f fVar) {
            this.f22915a = (AbstractC0523S.f) AbstractC1209m.m5303o(fVar, "result");
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.f mo2179a(AbstractC0523S.g gVar) {
            return this.f22915a;
        }

        public String toString() {
            return AbstractC1203g.m5266a(d.class).m5277d("result", this.f22915a).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.u0$e */
    private final class e extends AbstractC0523S.j {

        /* JADX INFO: renamed from: a */
        private final AbstractC0523S.i f22916a;

        /* JADX INFO: renamed from: b */
        private final AtomicBoolean f22917b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: io.grpc.internal.u0$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f22916a.mo2226f();
            }
        }

        e(AbstractC0523S.i iVar) {
            this.f22916a = (AbstractC0523S.i) AbstractC1209m.m5303o(iVar, "subchannel");
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.f mo2179a(AbstractC0523S.g gVar) {
            if (this.f22917b.compareAndSet(false, true)) {
                C5811u0.this.f22907g.mo2197d().execute(new a());
            }
            return AbstractC0523S.f.m2202g();
        }
    }

    C5811u0(AbstractC0523S.e eVar) {
        this.f22907g = (AbstractC0523S.e) AbstractC1209m.m5303o(eVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m26192i(AbstractC0523S.i iVar, C0563q c0563q) {
        AbstractC0523S.j eVar;
        AbstractC0523S.j dVar;
        EnumC0561p enumC0561pM2497c = c0563q.m2497c();
        if (enumC0561pM2497c == EnumC0561p.SHUTDOWN) {
            return;
        }
        EnumC0561p enumC0561p = EnumC0561p.TRANSIENT_FAILURE;
        if (enumC0561pM2497c == enumC0561p || enumC0561pM2497c == EnumC0561p.IDLE) {
            this.f22907g.mo2198e();
        }
        if (this.f22909i == enumC0561p) {
            if (enumC0561pM2497c == EnumC0561p.CONNECTING) {
                return;
            }
            if (enumC0561pM2497c == EnumC0561p.IDLE) {
                mo2177e();
                return;
            }
        }
        int i7 = b.f22912a[enumC0561pM2497c.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                dVar = new d(AbstractC0523S.f.m2202g());
            } else if (i7 == 3) {
                eVar = new d(AbstractC0523S.f.m2203h(iVar));
            } else {
                if (i7 != 4) {
                    throw new IllegalArgumentException("Unsupported state:" + enumC0561pM2497c);
                }
                dVar = new d(AbstractC0523S.f.m2201f(c0563q.m2498d()));
            }
            m26193j(enumC0561pM2497c, dVar);
        }
        eVar = new e(iVar);
        dVar = eVar;
        m26193j(enumC0561pM2497c, dVar);
    }

    /* JADX INFO: renamed from: j */
    private void m26193j(EnumC0561p enumC0561p, AbstractC0523S.j jVar) {
        this.f22909i = enumC0561p;
        this.f22907g.mo2199f(enumC0561p, jVar);
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: a */
    public C0554l0 mo2173a(AbstractC0523S.h hVar) {
        c cVar;
        Boolean bool;
        List listM2213a = hVar.m2213a();
        if (listM2213a.isEmpty()) {
            C0554l0 c0554l0M2462q = C0554l0.f2113t.m2462q("NameResolver returned no usable address. addrs=" + hVar.m2213a() + ", attrs=" + hVar.m2214b());
            mo2175c(c0554l0M2462q);
            return c0554l0M2462q;
        }
        if ((hVar.m2215c() instanceof c) && (bool = (cVar = (c) hVar.m2215c()).f22913a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(listM2213a);
            Collections.shuffle(arrayList, cVar.f22914b != null ? new Random(cVar.f22914b.longValue()) : new Random());
            listM2213a = arrayList;
        }
        AbstractC0523S.i iVar = this.f22908h;
        if (iVar == null) {
            AbstractC0523S.i iVarMo2194a = this.f22907g.mo2194a(AbstractC0523S.b.m2180d().m2189e(listM2213a).m2188c());
            iVarMo2194a.mo2228h(new a(iVarMo2194a));
            this.f22908h = iVarMo2194a;
            m26193j(EnumC0561p.CONNECTING, new d(AbstractC0523S.f.m2203h(iVarMo2194a)));
            iVarMo2194a.mo2226f();
        } else {
            iVar.mo2229i(listM2213a);
        }
        return C0554l0.f2098e;
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: c */
    public void mo2175c(C0554l0 c0554l0) {
        AbstractC0523S.i iVar = this.f22908h;
        if (iVar != null) {
            iVar.mo2227g();
            this.f22908h = null;
        }
        m26193j(EnumC0561p.TRANSIENT_FAILURE, new d(AbstractC0523S.f.m2201f(c0554l0)));
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: e */
    public void mo2177e() {
        AbstractC0523S.i iVar = this.f22908h;
        if (iVar != null) {
            iVar.mo2226f();
        }
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: f */
    public void mo2178f() {
        AbstractC0523S.i iVar = this.f22908h;
        if (iVar != null) {
            iVar.mo2227g();
        }
    }
}
