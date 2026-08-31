package p124P5;

import io.grpc.internal.AbstractC5743K0;
import io.grpc.internal.InterfaceC5756R0;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p063H5.AbstractC0523S;
import p063H5.AbstractC0541f;
import p063H5.AbstractC0551k;
import p063H5.C0530Z;
import p063H5.C0531a;
import p063H5.C0554l0;
import p063H5.C0563q;
import p063H5.C0572x;
import p063H5.EnumC0561p;
import p063H5.ExecutorC0562p0;
import p122P3.AbstractC1209m;
import p129Q3.AbstractC1268g;
import p129Q3.AbstractC1272k;

/* JADX INFO: renamed from: P5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1237h extends AbstractC0523S {

    /* JADX INFO: renamed from: p */
    private static final C0531a.c f4370p = C0531a.c.m2319a("addressTrackerKey");

    /* JADX INFO: renamed from: g */
    final c f4371g;

    /* JADX INFO: renamed from: h */
    private final ExecutorC0562p0 f4372h;

    /* JADX INFO: renamed from: i */
    private final AbstractC0523S.e f4373i;

    /* JADX INFO: renamed from: j */
    private final C1234e f4374j;

    /* JADX INFO: renamed from: k */
    private InterfaceC5756R0 f4375k;

    /* JADX INFO: renamed from: l */
    private final ScheduledExecutorService f4376l;

    /* JADX INFO: renamed from: m */
    private ExecutorC0562p0.d f4377m;

    /* JADX INFO: renamed from: n */
    private Long f4378n;

    /* JADX INFO: renamed from: o */
    private final AbstractC0541f f4379o;

    /* JADX INFO: renamed from: P5.h$b */
    static class b {

        /* JADX INFO: renamed from: a */
        private g f4380a;

        /* JADX INFO: renamed from: b */
        private volatile a f4381b;

        /* JADX INFO: renamed from: c */
        private a f4382c;

        /* JADX INFO: renamed from: d */
        private Long f4383d;

        /* JADX INFO: renamed from: e */
        private int f4384e;

        /* JADX INFO: renamed from: f */
        private final Set f4385f = new HashSet();

        /* JADX INFO: renamed from: P5.h$b$a */
        private static class a {

            /* JADX INFO: renamed from: a */
            AtomicLong f4386a;

            /* JADX INFO: renamed from: b */
            AtomicLong f4387b;

            private a() {
                this.f4386a = new AtomicLong();
                this.f4387b = new AtomicLong();
            }

            /* JADX INFO: renamed from: a */
            void m5421a() {
                this.f4386a.set(0L);
                this.f4387b.set(0L);
            }
        }

        b(g gVar) {
            this.f4381b = new a();
            this.f4382c = new a();
            this.f4380a = gVar;
        }

        /* JADX INFO: renamed from: b */
        boolean m5406b(i iVar) {
            if (m5417m() && !iVar.m5456o()) {
                iVar.m5455n();
            } else if (!m5417m() && iVar.m5456o()) {
                iVar.m5458q();
            }
            iVar.m5457p(this);
            return this.f4385f.add(iVar);
        }

        /* JADX INFO: renamed from: c */
        void m5407c() {
            int i7 = this.f4384e;
            this.f4384e = i7 == 0 ? 0 : i7 - 1;
        }

        /* JADX INFO: renamed from: d */
        void m5408d(long j7) {
            this.f4383d = Long.valueOf(j7);
            this.f4384e++;
            Iterator it = this.f4385f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).m5455n();
            }
        }

        /* JADX INFO: renamed from: e */
        double m5409e() {
            return this.f4382c.f4387b.get() / m5410f();
        }

        /* JADX INFO: renamed from: f */
        long m5410f() {
            return this.f4382c.f4386a.get() + this.f4382c.f4387b.get();
        }

        /* JADX INFO: renamed from: g */
        void m5411g(boolean z7) {
            g gVar = this.f4380a;
            if (gVar.f4400e == null && gVar.f4401f == null) {
                return;
            }
            if (z7) {
                this.f4381b.f4386a.getAndIncrement();
            } else {
                this.f4381b.f4387b.getAndIncrement();
            }
        }

        /* JADX INFO: renamed from: h */
        public boolean m5412h(long j7) {
            return j7 > this.f4383d.longValue() + Math.min(this.f4380a.f4397b.longValue() * ((long) this.f4384e), Math.max(this.f4380a.f4397b.longValue(), this.f4380a.f4398c.longValue()));
        }

        /* JADX INFO: renamed from: i */
        boolean m5413i(i iVar) {
            iVar.m5454m();
            return this.f4385f.remove(iVar);
        }

        /* JADX INFO: renamed from: j */
        void m5414j() {
            this.f4381b.m5421a();
            this.f4382c.m5421a();
        }

        /* JADX INFO: renamed from: k */
        void m5415k() {
            this.f4384e = 0;
        }

        /* JADX INFO: renamed from: l */
        void m5416l(g gVar) {
            this.f4380a = gVar;
        }

        /* JADX INFO: renamed from: m */
        boolean m5417m() {
            return this.f4383d != null;
        }

        /* JADX INFO: renamed from: n */
        double m5418n() {
            return this.f4382c.f4386a.get() / m5410f();
        }

        /* JADX INFO: renamed from: o */
        void m5419o() {
            this.f4382c.m5421a();
            a aVar = this.f4381b;
            this.f4381b = this.f4382c;
            this.f4382c = aVar;
        }

        /* JADX INFO: renamed from: p */
        void m5420p() {
            AbstractC1209m.m5309u(this.f4383d != null, "not currently ejected");
            this.f4383d = null;
            Iterator it = this.f4385f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).m5458q();
            }
        }

        public String toString() {
            return "AddressTracker{subchannels=" + this.f4385f + '}';
        }
    }

    /* JADX INFO: renamed from: P5.h$c */
    static class c extends AbstractC1268g {

        /* JADX INFO: renamed from: a */
        private final Map f4388a = new HashMap();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p129Q3.AbstractC1269h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map mo5422a() {
            return this.f4388a;
        }

        /* JADX INFO: renamed from: c */
        void m5424c() {
            for (b bVar : this.f4388a.values()) {
                if (bVar.m5417m()) {
                    bVar.m5420p();
                }
                bVar.m5415k();
            }
        }

        /* JADX INFO: renamed from: d */
        double m5425d() {
            if (this.f4388a.isEmpty()) {
                return 0.0d;
            }
            Iterator it = this.f4388a.values().iterator();
            int i7 = 0;
            int i8 = 0;
            while (it.hasNext()) {
                i8++;
                if (((b) it.next()).m5417m()) {
                    i7++;
                }
            }
            return (((double) i7) / ((double) i8)) * 100.0d;
        }

        /* JADX INFO: renamed from: e */
        void m5426e(Long l7) {
            for (b bVar : this.f4388a.values()) {
                if (!bVar.m5417m()) {
                    bVar.m5407c();
                }
                if (bVar.m5417m() && bVar.m5412h(l7.longValue())) {
                    bVar.m5420p();
                }
            }
        }

        /* JADX INFO: renamed from: f */
        void m5427f(g gVar, Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                SocketAddress socketAddress = (SocketAddress) it.next();
                if (!this.f4388a.containsKey(socketAddress)) {
                    this.f4388a.put(socketAddress, new b(gVar));
                }
            }
        }

        /* JADX INFO: renamed from: g */
        void m5428g() {
            Iterator it = this.f4388a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).m5414j();
            }
        }

        /* JADX INFO: renamed from: h */
        void m5429h() {
            Iterator it = this.f4388a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).m5419o();
            }
        }

        /* JADX INFO: renamed from: i */
        void m5430i(g gVar) {
            Iterator it = this.f4388a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).m5416l(gVar);
            }
        }
    }

    /* JADX INFO: renamed from: P5.h$d */
    class d extends AbstractC1232c {

        /* JADX INFO: renamed from: a */
        private AbstractC0523S.e f4389a;

        d(AbstractC0523S.e eVar) {
            this.f4389a = new C1235f(eVar);
        }

        @Override // p124P5.AbstractC1232c, p063H5.AbstractC0523S.e
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.i mo2194a(AbstractC0523S.b bVar) {
            i iVar = C1237h.this.new i(bVar, this.f4389a);
            List listM2181a = bVar.m2181a();
            if (C1237h.m5403m(listM2181a) && C1237h.this.f4371g.containsKey(((C0572x) listM2181a.get(0)).m2533a().get(0))) {
                b bVar2 = (b) C1237h.this.f4371g.get(((C0572x) listM2181a.get(0)).m2533a().get(0));
                bVar2.m5406b(iVar);
                if (bVar2.f4383d != null) {
                    iVar.m5455n();
                }
            }
            return iVar;
        }

        @Override // p124P5.AbstractC1232c, p063H5.AbstractC0523S.e
        /* JADX INFO: renamed from: f */
        public void mo2199f(EnumC0561p enumC0561p, AbstractC0523S.j jVar) {
            this.f4389a.mo2199f(enumC0561p, C1237h.this.new h(jVar));
        }

        @Override // p124P5.AbstractC1232c
        /* JADX INFO: renamed from: g */
        protected AbstractC0523S.e mo5353g() {
            return this.f4389a;
        }
    }

    /* JADX INFO: renamed from: P5.h$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        g f4391a;

        /* JADX INFO: renamed from: b */
        AbstractC0541f f4392b;

        e(g gVar, AbstractC0541f abstractC0541f) {
            this.f4391a = gVar;
            this.f4392b = abstractC0541f;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1237h c1237h = C1237h.this;
            c1237h.f4378n = Long.valueOf(c1237h.f4375k.mo25662a());
            C1237h.this.f4371g.m5429h();
            for (j jVar : j.m5459a(this.f4391a, this.f4392b)) {
                C1237h c1237h2 = C1237h.this;
                jVar.mo5431b(c1237h2.f4371g, c1237h2.f4378n.longValue());
            }
            C1237h c1237h3 = C1237h.this;
            c1237h3.f4371g.m5426e(c1237h3.f4378n);
        }
    }

    /* JADX INFO: renamed from: P5.h$f */
    static class f implements j {

        /* JADX INFO: renamed from: a */
        private final g f4394a;

        /* JADX INFO: renamed from: b */
        private final AbstractC0541f f4395b;

        f(g gVar, AbstractC0541f abstractC0541f) {
            this.f4394a = gVar;
            this.f4395b = abstractC0541f;
        }

        @Override // p124P5.C1237h.j
        /* JADX INFO: renamed from: b */
        public void mo5431b(c cVar, long j7) {
            List<b> listM5404n = C1237h.m5404n(cVar, this.f4394a.f4401f.f4413d.intValue());
            if (listM5404n.size() < this.f4394a.f4401f.f4412c.intValue() || listM5404n.size() == 0) {
                return;
            }
            for (b bVar : listM5404n) {
                if (cVar.m5425d() >= this.f4394a.f4399d.intValue()) {
                    return;
                }
                if (bVar.m5410f() >= this.f4394a.f4401f.f4413d.intValue()) {
                    if (bVar.m5409e() > ((double) this.f4394a.f4401f.f4410a.intValue()) / 100.0d) {
                        this.f4395b.mo2420b(AbstractC0541f.a.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", bVar, Double.valueOf(bVar.m5409e()));
                        if (new Random().nextInt(100) < this.f4394a.f4401f.f4411b.intValue()) {
                            bVar.m5408d(j7);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: P5.h$g */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public final Long f4396a;

        /* JADX INFO: renamed from: b */
        public final Long f4397b;

        /* JADX INFO: renamed from: c */
        public final Long f4398c;

        /* JADX INFO: renamed from: d */
        public final Integer f4399d;

        /* JADX INFO: renamed from: e */
        public final c f4400e;

        /* JADX INFO: renamed from: f */
        public final b f4401f;

        /* JADX INFO: renamed from: g */
        public final AbstractC5743K0.b f4402g;

        /* JADX INFO: renamed from: P5.h$g$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            Long f4403a = 10000000000L;

            /* JADX INFO: renamed from: b */
            Long f4404b = 30000000000L;

            /* JADX INFO: renamed from: c */
            Long f4405c = 300000000000L;

            /* JADX INFO: renamed from: d */
            Integer f4406d = 10;

            /* JADX INFO: renamed from: e */
            c f4407e;

            /* JADX INFO: renamed from: f */
            b f4408f;

            /* JADX INFO: renamed from: g */
            AbstractC5743K0.b f4409g;

            /* JADX INFO: renamed from: a */
            public g m5433a() {
                AbstractC1209m.m5308t(this.f4409g != null);
                return new g(this.f4403a, this.f4404b, this.f4405c, this.f4406d, this.f4407e, this.f4408f, this.f4409g);
            }

            /* JADX INFO: renamed from: b */
            public a m5434b(Long l7) {
                AbstractC1209m.m5292d(l7 != null);
                this.f4404b = l7;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m5435c(AbstractC5743K0.b bVar) {
                AbstractC1209m.m5308t(bVar != null);
                this.f4409g = bVar;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m5436d(b bVar) {
                this.f4408f = bVar;
                return this;
            }

            /* JADX INFO: renamed from: e */
            public a m5437e(Long l7) {
                AbstractC1209m.m5292d(l7 != null);
                this.f4403a = l7;
                return this;
            }

            /* JADX INFO: renamed from: f */
            public a m5438f(Integer num) {
                AbstractC1209m.m5292d(num != null);
                this.f4406d = num;
                return this;
            }

            /* JADX INFO: renamed from: g */
            public a m5439g(Long l7) {
                AbstractC1209m.m5292d(l7 != null);
                this.f4405c = l7;
                return this;
            }

            /* JADX INFO: renamed from: h */
            public a m5440h(c cVar) {
                this.f4407e = cVar;
                return this;
            }
        }

        /* JADX INFO: renamed from: P5.h$g$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public final Integer f4410a;

            /* JADX INFO: renamed from: b */
            public final Integer f4411b;

            /* JADX INFO: renamed from: c */
            public final Integer f4412c;

            /* JADX INFO: renamed from: d */
            public final Integer f4413d;

            /* JADX INFO: renamed from: P5.h$g$b$a */
            public static class a {

                /* JADX INFO: renamed from: a */
                Integer f4414a = 85;

                /* JADX INFO: renamed from: b */
                Integer f4415b = 100;

                /* JADX INFO: renamed from: c */
                Integer f4416c = 5;

                /* JADX INFO: renamed from: d */
                Integer f4417d = 50;

                /* JADX INFO: renamed from: a */
                public b m5441a() {
                    return new b(this.f4414a, this.f4415b, this.f4416c, this.f4417d);
                }

                /* JADX INFO: renamed from: b */
                public a m5442b(Integer num) {
                    boolean z7 = false;
                    AbstractC1209m.m5292d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z7 = true;
                    }
                    AbstractC1209m.m5292d(z7);
                    this.f4415b = num;
                    return this;
                }

                /* JADX INFO: renamed from: c */
                public a m5443c(Integer num) {
                    AbstractC1209m.m5292d(num != null);
                    AbstractC1209m.m5292d(num.intValue() >= 0);
                    this.f4416c = num;
                    return this;
                }

                /* JADX INFO: renamed from: d */
                public a m5444d(Integer num) {
                    AbstractC1209m.m5292d(num != null);
                    AbstractC1209m.m5292d(num.intValue() >= 0);
                    this.f4417d = num;
                    return this;
                }

                /* JADX INFO: renamed from: e */
                public a m5445e(Integer num) {
                    boolean z7 = false;
                    AbstractC1209m.m5292d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z7 = true;
                    }
                    AbstractC1209m.m5292d(z7);
                    this.f4414a = num;
                    return this;
                }
            }

            b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f4410a = num;
                this.f4411b = num2;
                this.f4412c = num3;
                this.f4413d = num4;
            }
        }

        /* JADX INFO: renamed from: P5.h$g$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            public final Integer f4418a;

            /* JADX INFO: renamed from: b */
            public final Integer f4419b;

            /* JADX INFO: renamed from: c */
            public final Integer f4420c;

            /* JADX INFO: renamed from: d */
            public final Integer f4421d;

            /* JADX INFO: renamed from: P5.h$g$c$a */
            public static final class a {

                /* JADX INFO: renamed from: a */
                Integer f4422a = 1900;

                /* JADX INFO: renamed from: b */
                Integer f4423b = 100;

                /* JADX INFO: renamed from: c */
                Integer f4424c = 5;

                /* JADX INFO: renamed from: d */
                Integer f4425d = 100;

                /* JADX INFO: renamed from: a */
                public c m5446a() {
                    return new c(this.f4422a, this.f4423b, this.f4424c, this.f4425d);
                }

                /* JADX INFO: renamed from: b */
                public a m5447b(Integer num) {
                    boolean z7 = false;
                    AbstractC1209m.m5292d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z7 = true;
                    }
                    AbstractC1209m.m5292d(z7);
                    this.f4423b = num;
                    return this;
                }

                /* JADX INFO: renamed from: c */
                public a m5448c(Integer num) {
                    AbstractC1209m.m5292d(num != null);
                    AbstractC1209m.m5292d(num.intValue() >= 0);
                    this.f4424c = num;
                    return this;
                }

                /* JADX INFO: renamed from: d */
                public a m5449d(Integer num) {
                    AbstractC1209m.m5292d(num != null);
                    AbstractC1209m.m5292d(num.intValue() >= 0);
                    this.f4425d = num;
                    return this;
                }

                /* JADX INFO: renamed from: e */
                public a m5450e(Integer num) {
                    AbstractC1209m.m5292d(num != null);
                    this.f4422a = num;
                    return this;
                }
            }

            c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f4418a = num;
                this.f4419b = num2;
                this.f4420c = num3;
                this.f4421d = num4;
            }
        }

        /* JADX INFO: renamed from: a */
        boolean m5432a() {
            return (this.f4400e == null && this.f4401f == null) ? false : true;
        }

        private g(Long l7, Long l8, Long l9, Integer num, c cVar, b bVar, AbstractC5743K0.b bVar2) {
            this.f4396a = l7;
            this.f4397b = l8;
            this.f4398c = l9;
            this.f4399d = num;
            this.f4400e = cVar;
            this.f4401f = bVar;
            this.f4402g = bVar2;
        }
    }

    /* JADX INFO: renamed from: P5.h$h */
    class h extends AbstractC0523S.j {

        /* JADX INFO: renamed from: a */
        private final AbstractC0523S.j f4426a;

        /* JADX INFO: renamed from: P5.h$h$a */
        class a extends AbstractC0551k.a {

            /* JADX INFO: renamed from: a */
            private final b f4428a;

            /* JADX INFO: renamed from: b */
            private final AbstractC0551k.a f4429b;

            /* JADX INFO: renamed from: P5.h$h$a$a, reason: collision with other inner class name */
            class C7641a extends AbstractC1230a {

                /* JADX INFO: renamed from: b */
                final /* synthetic */ AbstractC0551k f4431b;

                C7641a(AbstractC0551k abstractC0551k) {
                    this.f4431b = abstractC0551k;
                }

                @Override // p063H5.AbstractC0560o0
                /* JADX INFO: renamed from: i */
                public void mo2487i(C0554l0 c0554l0) {
                    a.this.f4428a.m5411g(c0554l0.m2460o());
                    mo5351o().mo2487i(c0554l0);
                }

                @Override // p124P5.AbstractC1230a
                /* JADX INFO: renamed from: o */
                protected AbstractC0551k mo5351o() {
                    return this.f4431b;
                }
            }

            /* JADX INFO: renamed from: P5.h$h$a$b */
            class b extends AbstractC0551k {
                b() {
                }

                @Override // p063H5.AbstractC0560o0
                /* JADX INFO: renamed from: i */
                public void mo2487i(C0554l0 c0554l0) {
                    a.this.f4428a.m5411g(c0554l0.m2460o());
                }
            }

            a(b bVar, AbstractC0551k.a aVar) {
                this.f4428a = bVar;
                this.f4429b = aVar;
            }

            @Override // p063H5.AbstractC0551k.a
            /* JADX INFO: renamed from: a */
            public AbstractC0551k mo2432a(AbstractC0551k.b bVar, C0530Z c0530z) {
                AbstractC0551k.a aVar = this.f4429b;
                return aVar != null ? new C7641a(aVar.mo2432a(bVar, c0530z)) : new b();
            }
        }

        h(AbstractC0523S.j jVar) {
            this.f4426a = jVar;
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.f mo2179a(AbstractC0523S.g gVar) {
            AbstractC0523S.f fVarMo2179a = this.f4426a.mo2179a(gVar);
            AbstractC0523S.i iVarM2207c = fVarMo2179a.m2207c();
            return iVarM2207c != null ? AbstractC0523S.f.m2204i(iVarM2207c, new a((b) iVarM2207c.mo2223c().m2313b(C1237h.f4370p), fVarMo2179a.m2206b())) : fVarMo2179a;
        }
    }

    /* JADX INFO: renamed from: P5.h$i */
    class i extends AbstractC1233d {

        /* JADX INFO: renamed from: a */
        private final AbstractC0523S.i f4434a;

        /* JADX INFO: renamed from: b */
        private b f4435b;

        /* JADX INFO: renamed from: c */
        private boolean f4436c;

        /* JADX INFO: renamed from: d */
        private C0563q f4437d;

        /* JADX INFO: renamed from: e */
        private AbstractC0523S.k f4438e;

        /* JADX INFO: renamed from: f */
        private final AbstractC0541f f4439f;

        /* JADX INFO: renamed from: P5.h$i$a */
        class a implements AbstractC0523S.k {

            /* JADX INFO: renamed from: a */
            private final AbstractC0523S.k f4441a;

            a(AbstractC0523S.k kVar) {
                this.f4441a = kVar;
            }

            @Override // p063H5.AbstractC0523S.k
            /* JADX INFO: renamed from: a */
            public void mo2231a(C0563q c0563q) {
                i.this.f4437d = c0563q;
                if (i.this.f4436c) {
                    return;
                }
                this.f4441a.mo2231a(c0563q);
            }
        }

        i(AbstractC0523S.b bVar, AbstractC0523S.e eVar) {
            AbstractC0523S.b.C7629b c7629b = AbstractC0523S.f1942c;
            AbstractC0523S.k kVar = (AbstractC0523S.k) bVar.m2183c(c7629b);
            if (kVar != null) {
                this.f4438e = kVar;
                this.f4434a = eVar.mo2194a(bVar.m2184e().m2187b(c7629b, new a(kVar)).m2188c());
            } else {
                this.f4434a = eVar.mo2194a(bVar);
            }
            this.f4439f = this.f4434a.mo2224d();
        }

        @Override // p124P5.AbstractC1233d, p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: c */
        public C0531a mo2223c() {
            return this.f4435b != null ? this.f4434a.mo2223c().m2314d().m2318d(C1237h.f4370p, this.f4435b).m2316a() : this.f4434a.mo2223c();
        }

        @Override // p124P5.AbstractC1233d, p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: g */
        public void mo2227g() {
            b bVar = this.f4435b;
            if (bVar != null) {
                bVar.m5413i(this);
            }
            super.mo2227g();
        }

        @Override // p124P5.AbstractC1233d, p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: h */
        public void mo2228h(AbstractC0523S.k kVar) {
            if (this.f4438e != null) {
                super.mo2228h(kVar);
            } else {
                this.f4438e = kVar;
                super.mo2228h(new a(kVar));
            }
        }

        @Override // p124P5.AbstractC1233d, p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: i */
        public void mo2229i(List list) {
            if (C1237h.m5403m(mo2222b()) && C1237h.m5403m(list)) {
                if (C1237h.this.f4371g.containsValue(this.f4435b)) {
                    this.f4435b.m5413i(this);
                }
                SocketAddress socketAddress = (SocketAddress) ((C0572x) list.get(0)).m2533a().get(0);
                if (C1237h.this.f4371g.containsKey(socketAddress)) {
                    ((b) C1237h.this.f4371g.get(socketAddress)).m5406b(this);
                }
            } else if (!C1237h.m5403m(mo2222b()) || C1237h.m5403m(list)) {
                if (!C1237h.m5403m(mo2222b()) && C1237h.m5403m(list)) {
                    SocketAddress socketAddress2 = (SocketAddress) ((C0572x) list.get(0)).m2533a().get(0);
                    if (C1237h.this.f4371g.containsKey(socketAddress2)) {
                        ((b) C1237h.this.f4371g.get(socketAddress2)).m5406b(this);
                    }
                }
            } else if (C1237h.this.f4371g.containsKey(m2221a().m2533a().get(0))) {
                b bVar = (b) C1237h.this.f4371g.get(m2221a().m2533a().get(0));
                bVar.m5413i(this);
                bVar.m5414j();
            }
            this.f4434a.mo2229i(list);
        }

        @Override // p124P5.AbstractC1233d
        /* JADX INFO: renamed from: j */
        protected AbstractC0523S.i mo5354j() {
            return this.f4434a;
        }

        /* JADX INFO: renamed from: m */
        void m5454m() {
            this.f4435b = null;
        }

        /* JADX INFO: renamed from: n */
        void m5455n() {
            this.f4436c = true;
            this.f4438e.mo2231a(C0563q.m2496b(C0554l0.f2113t));
            this.f4439f.mo2420b(AbstractC0541f.a.INFO, "Subchannel ejected: {0}", this);
        }

        /* JADX INFO: renamed from: o */
        boolean m5456o() {
            return this.f4436c;
        }

        /* JADX INFO: renamed from: p */
        void m5457p(b bVar) {
            this.f4435b = bVar;
        }

        /* JADX INFO: renamed from: q */
        void m5458q() {
            this.f4436c = false;
            C0563q c0563q = this.f4437d;
            if (c0563q != null) {
                this.f4438e.mo2231a(c0563q);
                this.f4439f.mo2420b(AbstractC0541f.a.INFO, "Subchannel unejected: {0}", this);
            }
        }

        @Override // p124P5.AbstractC1233d
        public String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.f4434a.mo2222b() + '}';
        }
    }

    /* JADX INFO: renamed from: P5.h$j */
    interface j {
        /* JADX INFO: renamed from: a */
        static List m5459a(g gVar, AbstractC0541f abstractC0541f) {
            AbstractC1272k.a aVarM5533p = AbstractC1272k.m5533p();
            if (gVar.f4400e != null) {
                aVarM5533p.mo5525a(new k(gVar, abstractC0541f));
            }
            if (gVar.f4401f != null) {
                aVarM5533p.mo5525a(new f(gVar, abstractC0541f));
            }
            return aVarM5533p.m5545k();
        }

        /* JADX INFO: renamed from: b */
        void mo5431b(c cVar, long j7);
    }

    /* JADX INFO: renamed from: P5.h$k */
    static class k implements j {

        /* JADX INFO: renamed from: a */
        private final g f4443a;

        /* JADX INFO: renamed from: b */
        private final AbstractC0541f f4444b;

        k(g gVar, AbstractC0541f abstractC0541f) {
            AbstractC1209m.m5293e(gVar.f4400e != null, "success rate ejection config is null");
            this.f4443a = gVar;
            this.f4444b = abstractC0541f;
        }

        /* JADX INFO: renamed from: c */
        static double m5460c(Collection collection) {
            Iterator it = collection.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += ((Double) it.next()).doubleValue();
            }
            return dDoubleValue / ((double) collection.size());
        }

        /* JADX INFO: renamed from: d */
        static double m5461d(Collection collection, double d7) {
            Iterator it = collection.iterator();
            double d8 = 0.0d;
            while (it.hasNext()) {
                double dDoubleValue = ((Double) it.next()).doubleValue() - d7;
                d8 += dDoubleValue * dDoubleValue;
            }
            return Math.sqrt(d8 / ((double) collection.size()));
        }

        @Override // p124P5.C1237h.j
        /* JADX INFO: renamed from: b */
        public void mo5431b(c cVar, long j7) {
            List<b> listM5404n = C1237h.m5404n(cVar, this.f4443a.f4400e.f4421d.intValue());
            if (listM5404n.size() < this.f4443a.f4400e.f4420c.intValue() || listM5404n.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = listM5404n.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((b) it.next()).m5418n()));
            }
            double dM5460c = m5460c(arrayList);
            double dM5461d = m5461d(arrayList, dM5460c);
            double dIntValue = dM5460c - (((double) (this.f4443a.f4400e.f4418a.intValue() / 1000.0f)) * dM5461d);
            for (b bVar : listM5404n) {
                if (cVar.m5425d() >= this.f4443a.f4399d.intValue()) {
                    return;
                }
                if (bVar.m5418n() < dIntValue) {
                    this.f4444b.mo2420b(AbstractC0541f.a.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", bVar, Double.valueOf(bVar.m5418n()), Double.valueOf(dM5460c), Double.valueOf(dM5461d), Double.valueOf(dIntValue));
                    if (new Random().nextInt(100) < this.f4443a.f4400e.f4419b.intValue()) {
                        bVar.m5408d(j7);
                    }
                }
            }
        }
    }

    public C1237h(AbstractC0523S.e eVar, InterfaceC5756R0 interfaceC5756R0) {
        AbstractC0541f abstractC0541fMo2195b = eVar.mo2195b();
        this.f4379o = abstractC0541fMo2195b;
        d dVar = new d((AbstractC0523S.e) AbstractC1209m.m5303o(eVar, "helper"));
        this.f4373i = dVar;
        this.f4374j = new C1234e(dVar);
        this.f4371g = new c();
        this.f4372h = (ExecutorC0562p0) AbstractC1209m.m5303o(eVar.mo2197d(), "syncContext");
        this.f4376l = (ScheduledExecutorService) AbstractC1209m.m5303o(eVar.mo2196c(), "timeService");
        this.f4375k = interfaceC5756R0;
        abstractC0541fMo2195b.mo2419a(AbstractC0541f.a.DEBUG, "OutlierDetection lb created.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static boolean m5403m(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C0572x) it.next()).m2533a().size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static List m5404n(c cVar, int i7) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : cVar.values()) {
            if (bVar.m5410f() >= i7) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: a */
    public C0554l0 mo2173a(AbstractC0523S.h hVar) {
        this.f4379o.mo2420b(AbstractC0541f.a.DEBUG, "Received resolution result: {0}", hVar);
        g gVar = (g) hVar.m2215c();
        ArrayList arrayList = new ArrayList();
        Iterator it = hVar.m2213a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C0572x) it.next()).m2533a());
        }
        this.f4371g.keySet().retainAll(arrayList);
        this.f4371g.m5430i(gVar);
        this.f4371g.m5427f(gVar, arrayList);
        this.f4374j.m5365r(gVar.f4402g.m25631b());
        if (gVar.m5432a()) {
            Long lValueOf = this.f4378n == null ? gVar.f4396a : Long.valueOf(Math.max(0L, gVar.f4396a.longValue() - (this.f4375k.mo25662a() - this.f4378n.longValue())));
            ExecutorC0562p0.d dVar = this.f4377m;
            if (dVar != null) {
                dVar.m2493a();
                this.f4371g.m5428g();
            }
            this.f4377m = this.f4372h.m2491e(new e(gVar, this.f4379o), lValueOf.longValue(), gVar.f4396a.longValue(), TimeUnit.NANOSECONDS, this.f4376l);
        } else {
            ExecutorC0562p0.d dVar2 = this.f4377m;
            if (dVar2 != null) {
                dVar2.m2493a();
                this.f4378n = null;
                this.f4371g.m5424c();
            }
        }
        this.f4374j.mo2176d(hVar.m2216e().m2220d(gVar.f4402g.m25630a()).m2217a());
        return C0554l0.f2098e;
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: c */
    public void mo2175c(C0554l0 c0554l0) {
        this.f4374j.mo2175c(c0554l0);
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: f */
    public void mo2178f() {
        this.f4374j.mo2178f();
    }
}
