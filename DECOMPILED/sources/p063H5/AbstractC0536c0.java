package p063H5;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0536c0 {

    /* JADX INFO: renamed from: H5.c0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final int f2046a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0546h0 f2047b;

        /* JADX INFO: renamed from: c */
        private final ExecutorC0562p0 f2048c;

        /* JADX INFO: renamed from: d */
        private final f f2049d;

        /* JADX INFO: renamed from: e */
        private final ScheduledExecutorService f2050e;

        /* JADX INFO: renamed from: f */
        private final AbstractC0541f f2051f;

        /* JADX INFO: renamed from: g */
        private final Executor f2052g;

        /* JADX INFO: renamed from: h */
        private final String f2053h;

        /* JADX INFO: renamed from: H5.c0$a$a, reason: collision with other inner class name */
        public static final class C7630a {

            /* JADX INFO: renamed from: a */
            private Integer f2054a;

            /* JADX INFO: renamed from: b */
            private InterfaceC0546h0 f2055b;

            /* JADX INFO: renamed from: c */
            private ExecutorC0562p0 f2056c;

            /* JADX INFO: renamed from: d */
            private f f2057d;

            /* JADX INFO: renamed from: e */
            private ScheduledExecutorService f2058e;

            /* JADX INFO: renamed from: f */
            private AbstractC0541f f2059f;

            /* JADX INFO: renamed from: g */
            private Executor f2060g;

            /* JADX INFO: renamed from: h */
            private String f2061h;

            C7630a() {
            }

            /* JADX INFO: renamed from: a */
            public a m2377a() {
                return new a(this.f2054a, this.f2055b, this.f2056c, this.f2057d, this.f2058e, this.f2059f, this.f2060g, this.f2061h, null);
            }

            /* JADX INFO: renamed from: b */
            public C7630a m2378b(AbstractC0541f abstractC0541f) {
                this.f2059f = (AbstractC0541f) AbstractC1209m.m5302n(abstractC0541f);
                return this;
            }

            /* JADX INFO: renamed from: c */
            public C7630a m2379c(int i7) {
                this.f2054a = Integer.valueOf(i7);
                return this;
            }

            /* JADX INFO: renamed from: d */
            public C7630a m2380d(Executor executor) {
                this.f2060g = executor;
                return this;
            }

            /* JADX INFO: renamed from: e */
            public C7630a m2381e(String str) {
                this.f2061h = str;
                return this;
            }

            /* JADX INFO: renamed from: f */
            public C7630a m2382f(InterfaceC0546h0 interfaceC0546h0) {
                this.f2055b = (InterfaceC0546h0) AbstractC1209m.m5302n(interfaceC0546h0);
                return this;
            }

            /* JADX INFO: renamed from: g */
            public C7630a m2383g(ScheduledExecutorService scheduledExecutorService) {
                this.f2058e = (ScheduledExecutorService) AbstractC1209m.m5302n(scheduledExecutorService);
                return this;
            }

            /* JADX INFO: renamed from: h */
            public C7630a m2384h(f fVar) {
                this.f2057d = (f) AbstractC1209m.m5302n(fVar);
                return this;
            }

            /* JADX INFO: renamed from: i */
            public C7630a m2385i(ExecutorC0562p0 executorC0562p0) {
                this.f2056c = (ExecutorC0562p0) AbstractC1209m.m5302n(executorC0562p0);
                return this;
            }
        }

        /* synthetic */ a(Integer num, InterfaceC0546h0 interfaceC0546h0, ExecutorC0562p0 executorC0562p0, f fVar, ScheduledExecutorService scheduledExecutorService, AbstractC0541f abstractC0541f, Executor executor, String str, AbstractC0534b0 abstractC0534b0) {
            this(num, interfaceC0546h0, executorC0562p0, fVar, scheduledExecutorService, abstractC0541f, executor, str);
        }

        /* JADX INFO: renamed from: g */
        public static C7630a m2370g() {
            return new C7630a();
        }

        /* JADX INFO: renamed from: a */
        public int m2371a() {
            return this.f2046a;
        }

        /* JADX INFO: renamed from: b */
        public Executor m2372b() {
            return this.f2052g;
        }

        /* JADX INFO: renamed from: c */
        public InterfaceC0546h0 m2373c() {
            return this.f2047b;
        }

        /* JADX INFO: renamed from: d */
        public ScheduledExecutorService m2374d() {
            ScheduledExecutorService scheduledExecutorService = this.f2050e;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService;
            }
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }

        /* JADX INFO: renamed from: e */
        public f m2375e() {
            return this.f2049d;
        }

        /* JADX INFO: renamed from: f */
        public ExecutorC0562p0 m2376f() {
            return this.f2048c;
        }

        public String toString() {
            return AbstractC1203g.m5267b(this).m5275b("defaultPort", this.f2046a).m5277d("proxyDetector", this.f2047b).m5277d("syncContext", this.f2048c).m5277d("serviceConfigParser", this.f2049d).m5277d("scheduledExecutorService", this.f2050e).m5277d("channelLogger", this.f2051f).m5277d("executor", this.f2052g).m5277d("overrideAuthority", this.f2053h).toString();
        }

        private a(Integer num, InterfaceC0546h0 interfaceC0546h0, ExecutorC0562p0 executorC0562p0, f fVar, ScheduledExecutorService scheduledExecutorService, AbstractC0541f abstractC0541f, Executor executor, String str) {
            this.f2046a = ((Integer) AbstractC1209m.m5303o(num, "defaultPort not set")).intValue();
            this.f2047b = (InterfaceC0546h0) AbstractC1209m.m5303o(interfaceC0546h0, "proxyDetector not set");
            this.f2048c = (ExecutorC0562p0) AbstractC1209m.m5303o(executorC0562p0, "syncContext not set");
            this.f2049d = (f) AbstractC1209m.m5303o(fVar, "serviceConfigParser not set");
            this.f2050e = scheduledExecutorService;
            this.f2051f = abstractC0541f;
            this.f2052g = executor;
            this.f2053h = str;
        }
    }

    /* JADX INFO: renamed from: H5.c0$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract String mo2390a();

        /* JADX INFO: renamed from: b */
        public abstract AbstractC0536c0 mo2391b(URI uri, a aVar);
    }

    /* JADX INFO: renamed from: H5.c0$d */
    public static abstract class d {
        /* JADX INFO: renamed from: a */
        public abstract void mo2392a(C0554l0 c0554l0);

        /* JADX INFO: renamed from: b */
        public abstract void mo2393b(e eVar);
    }

    /* JADX INFO: renamed from: H5.c0$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        private final List f2064a;

        /* JADX INFO: renamed from: b */
        private final C0531a f2065b;

        /* JADX INFO: renamed from: c */
        private final b f2066c;

        /* JADX INFO: renamed from: H5.c0$e$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private List f2067a = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: b */
            private C0531a f2068b = C0531a.f1994c;

            /* JADX INFO: renamed from: c */
            private b f2069c;

            a() {
            }

            /* JADX INFO: renamed from: a */
            public e m2399a() {
                return new e(this.f2067a, this.f2068b, this.f2069c);
            }

            /* JADX INFO: renamed from: b */
            public a m2400b(List list) {
                this.f2067a = list;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m2401c(C0531a c0531a) {
                this.f2068b = c0531a;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m2402d(b bVar) {
                this.f2069c = bVar;
                return this;
            }
        }

        e(List list, C0531a c0531a, b bVar) {
            this.f2064a = Collections.unmodifiableList(new ArrayList(list));
            this.f2065b = (C0531a) AbstractC1209m.m5303o(c0531a, "attributes");
            this.f2066c = bVar;
        }

        /* JADX INFO: renamed from: d */
        public static a m2394d() {
            return new a();
        }

        /* JADX INFO: renamed from: a */
        public List m2395a() {
            return this.f2064a;
        }

        /* JADX INFO: renamed from: b */
        public C0531a m2396b() {
            return this.f2065b;
        }

        /* JADX INFO: renamed from: c */
        public b m2397c() {
            return this.f2066c;
        }

        /* JADX INFO: renamed from: e */
        public a m2398e() {
            return m2394d().m2400b(this.f2064a).m2401c(this.f2065b).m2402d(this.f2066c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC1205i.m5282a(this.f2064a, eVar.f2064a) && AbstractC1205i.m5282a(this.f2065b, eVar.f2065b) && AbstractC1205i.m5282a(this.f2066c, eVar.f2066c);
        }

        public int hashCode() {
            return AbstractC1205i.m5283b(this.f2064a, this.f2065b, this.f2066c);
        }

        public String toString() {
            return AbstractC1203g.m5267b(this).m5277d("addresses", this.f2064a).m5277d("attributes", this.f2065b).m5277d("serviceConfig", this.f2066c).toString();
        }
    }

    /* JADX INFO: renamed from: H5.c0$f */
    public static abstract class f {
        /* JADX INFO: renamed from: a */
        public abstract b mo2403a(Map map);
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo2366a();

    /* JADX INFO: renamed from: b */
    public abstract void mo2367b();

    /* JADX INFO: renamed from: c */
    public abstract void mo2368c();

    /* JADX INFO: renamed from: d */
    public abstract void mo2369d(d dVar);

    /* JADX INFO: renamed from: H5.c0$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final C0554l0 f2062a;

        /* JADX INFO: renamed from: b */
        private final Object f2063b;

        private b(Object obj) {
            this.f2063b = AbstractC1209m.m5303o(obj, "config");
            this.f2062a = null;
        }

        /* JADX INFO: renamed from: a */
        public static b m2386a(Object obj) {
            return new b(obj);
        }

        /* JADX INFO: renamed from: b */
        public static b m2387b(C0554l0 c0554l0) {
            return new b(c0554l0);
        }

        /* JADX INFO: renamed from: c */
        public Object m2388c() {
            return this.f2063b;
        }

        /* JADX INFO: renamed from: d */
        public C0554l0 m2389d() {
            return this.f2062a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (AbstractC1205i.m5282a(this.f2062a, bVar.f2062a) && AbstractC1205i.m5282a(this.f2063b, bVar.f2063b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC1205i.m5283b(this.f2062a, this.f2063b);
        }

        public String toString() {
            return this.f2063b != null ? AbstractC1203g.m5267b(this).m5277d("config", this.f2063b).toString() : AbstractC1203g.m5267b(this).m5277d("error", this.f2062a).toString();
        }

        private b(C0554l0 c0554l0) {
            this.f2063b = null;
            this.f2062a = (C0554l0) AbstractC1209m.m5303o(c0554l0, "status");
            AbstractC1209m.m5298j(!c0554l0.m2460o(), "cannot use OK status: %s", c0554l0);
        }
    }
}
