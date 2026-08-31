package p063H5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0523S {

    /* JADX INFO: renamed from: b */
    public static final C0531a.c f1941b = C0531a.c.m2319a("internal:health-checking-config");

    /* JADX INFO: renamed from: c */
    public static final b.C7629b f1942c = b.C7629b.m2192b("internal:health-check-consumer-listener");

    /* JADX INFO: renamed from: d */
    public static final C0531a.c f1943d = C0531a.c.m2319a("internal:has-health-check-producer-listener");

    /* JADX INFO: renamed from: e */
    public static final C0531a.c f1944e = C0531a.c.m2319a("io.grpc.IS_PETIOLE_POLICY");

    /* JADX INFO: renamed from: f */
    public static final j f1945f = new a();

    /* JADX INFO: renamed from: a */
    private int f1946a;

    /* JADX INFO: renamed from: H5.S$a */
    class a extends j {
        a() {
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public f mo2179a(g gVar) {
            return f.m2202g();
        }

        public String toString() {
            return "EMPTY_PICKER";
        }
    }

    /* JADX INFO: renamed from: H5.S$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final List f1947a;

        /* JADX INFO: renamed from: b */
        private final C0531a f1948b;

        /* JADX INFO: renamed from: c */
        private final Object[][] f1949c;

        /* JADX INFO: renamed from: H5.S$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private List f1950a;

            /* JADX INFO: renamed from: b */
            private C0531a f1951b = C0531a.f1994c;

            /* JADX INFO: renamed from: c */
            private Object[][] f1952c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: d */
            public a m2186d(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.f1952c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            /* JADX INFO: renamed from: b */
            public a m2187b(C7629b c7629b, Object obj) {
                AbstractC1209m.m5303o(c7629b, "key");
                AbstractC1209m.m5303o(obj, "value");
                int length = 0;
                while (true) {
                    Object[][] objArr = this.f1952c;
                    if (length >= objArr.length) {
                        length = -1;
                        break;
                    }
                    if (c7629b.equals(objArr[length][0])) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f1952c.length + 1, 2);
                    Object[][] objArr3 = this.f1952c;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.f1952c = objArr2;
                    length = objArr2.length - 1;
                }
                this.f1952c[length] = new Object[]{c7629b, obj};
                return this;
            }

            /* JADX INFO: renamed from: c */
            public b m2188c() {
                return new b(this.f1950a, this.f1951b, this.f1952c, null);
            }

            /* JADX INFO: renamed from: e */
            public a m2189e(List list) {
                AbstractC1209m.m5293e(!list.isEmpty(), "addrs is empty");
                this.f1950a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            /* JADX INFO: renamed from: f */
            public a m2190f(C0531a c0531a) {
                this.f1951b = (C0531a) AbstractC1209m.m5303o(c0531a, "attrs");
                return this;
            }
        }

        /* JADX INFO: renamed from: H5.S$b$b, reason: collision with other inner class name */
        public static final class C7629b {

            /* JADX INFO: renamed from: a */
            private final String f1953a;

            /* JADX INFO: renamed from: b */
            private final Object f1954b;

            private C7629b(String str, Object obj) {
                this.f1953a = str;
                this.f1954b = obj;
            }

            /* JADX INFO: renamed from: b */
            public static C7629b m2192b(String str) {
                AbstractC1209m.m5303o(str, "debugString");
                return new C7629b(str, null);
            }

            public String toString() {
                return this.f1953a;
            }
        }

        /* synthetic */ b(List list, C0531a c0531a, Object[][] objArr, a aVar) {
            this(list, c0531a, objArr);
        }

        /* JADX INFO: renamed from: d */
        public static a m2180d() {
            return new a();
        }

        /* JADX INFO: renamed from: a */
        public List m2181a() {
            return this.f1947a;
        }

        /* JADX INFO: renamed from: b */
        public C0531a m2182b() {
            return this.f1948b;
        }

        /* JADX INFO: renamed from: c */
        public Object m2183c(C7629b c7629b) {
            AbstractC1209m.m5303o(c7629b, "key");
            int i7 = 0;
            while (true) {
                Object[][] objArr = this.f1949c;
                if (i7 >= objArr.length) {
                    return c7629b.f1954b;
                }
                if (c7629b.equals(objArr[i7][0])) {
                    return this.f1949c[i7][1];
                }
                i7++;
            }
        }

        /* JADX INFO: renamed from: e */
        public a m2184e() {
            return m2180d().m2189e(this.f1947a).m2190f(this.f1948b).m2186d(this.f1949c);
        }

        public String toString() {
            return AbstractC1203g.m5267b(this).m5277d("addrs", this.f1947a).m5277d("attrs", this.f1948b).m5277d("customOptions", Arrays.deepToString(this.f1949c)).toString();
        }

        private b(List list, C0531a c0531a, Object[][] objArr) {
            this.f1947a = (List) AbstractC1209m.m5303o(list, "addresses are not set");
            this.f1948b = (C0531a) AbstractC1209m.m5303o(c0531a, "attrs");
            this.f1949c = (Object[][]) AbstractC1209m.m5303o(objArr, "customOptions");
        }
    }

    /* JADX INFO: renamed from: H5.S$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC0523S mo2193a(e eVar);
    }

    /* JADX INFO: renamed from: H5.S$d */
    public static final class d extends j {

        /* JADX INFO: renamed from: a */
        private final f f1955a;

        public d(f fVar) {
            this.f1955a = (f) AbstractC1209m.m5303o(fVar, "result");
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public f mo2179a(g gVar) {
            return this.f1955a;
        }

        public String toString() {
            return "FixedResultPicker(" + this.f1955a + ")";
        }
    }

    /* JADX INFO: renamed from: H5.S$e */
    public static abstract class e {
        /* JADX INFO: renamed from: a */
        public abstract i mo2194a(b bVar);

        /* JADX INFO: renamed from: b */
        public abstract AbstractC0541f mo2195b();

        /* JADX INFO: renamed from: c */
        public abstract ScheduledExecutorService mo2196c();

        /* JADX INFO: renamed from: d */
        public abstract ExecutorC0562p0 mo2197d();

        /* JADX INFO: renamed from: e */
        public abstract void mo2198e();

        /* JADX INFO: renamed from: f */
        public abstract void mo2199f(EnumC0561p enumC0561p, j jVar);
    }

    /* JADX INFO: renamed from: H5.S$f */
    public static final class f {

        /* JADX INFO: renamed from: e */
        private static final f f1956e = new f(null, null, C0554l0.f2098e, false);

        /* JADX INFO: renamed from: a */
        private final i f1957a;

        /* JADX INFO: renamed from: b */
        private final AbstractC0551k.a f1958b;

        /* JADX INFO: renamed from: c */
        private final C0554l0 f1959c;

        /* JADX INFO: renamed from: d */
        private final boolean f1960d;

        private f(i iVar, AbstractC0551k.a aVar, C0554l0 c0554l0, boolean z7) {
            this.f1957a = iVar;
            this.f1958b = aVar;
            this.f1959c = (C0554l0) AbstractC1209m.m5303o(c0554l0, "status");
            this.f1960d = z7;
        }

        /* JADX INFO: renamed from: e */
        public static f m2200e(C0554l0 c0554l0) {
            AbstractC1209m.m5293e(!c0554l0.m2460o(), "drop status shouldn't be OK");
            return new f(null, null, c0554l0, true);
        }

        /* JADX INFO: renamed from: f */
        public static f m2201f(C0554l0 c0554l0) {
            AbstractC1209m.m5293e(!c0554l0.m2460o(), "error status shouldn't be OK");
            return new f(null, null, c0554l0, false);
        }

        /* JADX INFO: renamed from: g */
        public static f m2202g() {
            return f1956e;
        }

        /* JADX INFO: renamed from: h */
        public static f m2203h(i iVar) {
            return m2204i(iVar, null);
        }

        /* JADX INFO: renamed from: i */
        public static f m2204i(i iVar, AbstractC0551k.a aVar) {
            return new f((i) AbstractC1209m.m5303o(iVar, "subchannel"), aVar, C0554l0.f2098e, false);
        }

        /* JADX INFO: renamed from: a */
        public C0554l0 m2205a() {
            return this.f1959c;
        }

        /* JADX INFO: renamed from: b */
        public AbstractC0551k.a m2206b() {
            return this.f1958b;
        }

        /* JADX INFO: renamed from: c */
        public i m2207c() {
            return this.f1957a;
        }

        /* JADX INFO: renamed from: d */
        public boolean m2208d() {
            return this.f1960d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC1205i.m5282a(this.f1957a, fVar.f1957a) && AbstractC1205i.m5282a(this.f1959c, fVar.f1959c) && AbstractC1205i.m5282a(this.f1958b, fVar.f1958b) && this.f1960d == fVar.f1960d;
        }

        public int hashCode() {
            return AbstractC1205i.m5283b(this.f1957a, this.f1959c, this.f1958b, Boolean.valueOf(this.f1960d));
        }

        public String toString() {
            return AbstractC1203g.m5267b(this).m5277d("subchannel", this.f1957a).m5277d("streamTracerFactory", this.f1958b).m5277d("status", this.f1959c).m5278e("drop", this.f1960d).toString();
        }
    }

    /* JADX INFO: renamed from: H5.S$g */
    public static abstract class g {
        /* JADX INFO: renamed from: a */
        public abstract C0535c mo2209a();

        /* JADX INFO: renamed from: b */
        public abstract C0530Z mo2210b();

        /* JADX INFO: renamed from: c */
        public abstract C0532a0 mo2211c();
    }

    /* JADX INFO: renamed from: H5.S$h */
    public static final class h {

        /* JADX INFO: renamed from: a */
        private final List f1961a;

        /* JADX INFO: renamed from: b */
        private final C0531a f1962b;

        /* JADX INFO: renamed from: c */
        private final Object f1963c;

        /* JADX INFO: renamed from: H5.S$h$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private List f1964a;

            /* JADX INFO: renamed from: b */
            private C0531a f1965b = C0531a.f1994c;

            /* JADX INFO: renamed from: c */
            private Object f1966c;

            a() {
            }

            /* JADX INFO: renamed from: a */
            public h m2217a() {
                return new h(this.f1964a, this.f1965b, this.f1966c, null);
            }

            /* JADX INFO: renamed from: b */
            public a m2218b(List list) {
                this.f1964a = list;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m2219c(C0531a c0531a) {
                this.f1965b = c0531a;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m2220d(Object obj) {
                this.f1966c = obj;
                return this;
            }
        }

        /* synthetic */ h(List list, C0531a c0531a, Object obj, a aVar) {
            this(list, c0531a, obj);
        }

        /* JADX INFO: renamed from: d */
        public static a m2212d() {
            return new a();
        }

        /* JADX INFO: renamed from: a */
        public List m2213a() {
            return this.f1961a;
        }

        /* JADX INFO: renamed from: b */
        public C0531a m2214b() {
            return this.f1962b;
        }

        /* JADX INFO: renamed from: c */
        public Object m2215c() {
            return this.f1963c;
        }

        /* JADX INFO: renamed from: e */
        public a m2216e() {
            return m2212d().m2218b(this.f1961a).m2219c(this.f1962b).m2220d(this.f1963c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return AbstractC1205i.m5282a(this.f1961a, hVar.f1961a) && AbstractC1205i.m5282a(this.f1962b, hVar.f1962b) && AbstractC1205i.m5282a(this.f1963c, hVar.f1963c);
        }

        public int hashCode() {
            return AbstractC1205i.m5283b(this.f1961a, this.f1962b, this.f1963c);
        }

        public String toString() {
            return AbstractC1203g.m5267b(this).m5277d("addresses", this.f1961a).m5277d("attributes", this.f1962b).m5277d("loadBalancingPolicyConfig", this.f1963c).toString();
        }

        private h(List list, C0531a c0531a, Object obj) {
            this.f1961a = Collections.unmodifiableList(new ArrayList((Collection) AbstractC1209m.m5303o(list, "addresses")));
            this.f1962b = (C0531a) AbstractC1209m.m5303o(c0531a, "attributes");
            this.f1963c = obj;
        }
    }

    /* JADX INFO: renamed from: H5.S$i */
    public static abstract class i {
        /* JADX WARN: Code duplicated, block: B:7:0x000f  */
        /* JADX INFO: renamed from: a */
        public final C0572x m2221a() {
            boolean z7;
            List listMo2222b = mo2222b();
            if (listMo2222b != null) {
                z7 = listMo2222b.size() == 1;
            }
            AbstractC1209m.m5311w(z7, "%s does not have exactly one group", listMo2222b);
            return (C0572x) listMo2222b.get(0);
        }

        /* JADX INFO: renamed from: b */
        public abstract List mo2222b();

        /* JADX INFO: renamed from: c */
        public abstract C0531a mo2223c();

        /* JADX INFO: renamed from: d */
        public abstract AbstractC0541f mo2224d();

        /* JADX INFO: renamed from: e */
        public abstract Object mo2225e();

        /* JADX INFO: renamed from: f */
        public abstract void mo2226f();

        /* JADX INFO: renamed from: g */
        public abstract void mo2227g();

        /* JADX INFO: renamed from: h */
        public abstract void mo2228h(k kVar);

        /* JADX INFO: renamed from: i */
        public abstract void mo2229i(List list);
    }

    /* JADX INFO: renamed from: H5.S$j */
    public static abstract class j {
        /* JADX INFO: renamed from: a */
        public abstract f mo2179a(g gVar);

        /* JADX INFO: renamed from: b */
        public void m2230b() {
        }
    }

    /* JADX INFO: renamed from: H5.S$k */
    public interface k {
        /* JADX INFO: renamed from: a */
        void mo2231a(C0563q c0563q);
    }

    /* JADX INFO: renamed from: a */
    public C0554l0 mo2173a(h hVar) {
        if (!hVar.m2213a().isEmpty() || mo2174b()) {
            int i7 = this.f1946a;
            this.f1946a = i7 + 1;
            if (i7 == 0) {
                mo2176d(hVar);
            }
            this.f1946a = 0;
            return C0554l0.f2098e;
        }
        C0554l0 c0554l0M2462q = C0554l0.f2113t.m2462q("NameResolver returned no usable address. addrs=" + hVar.m2213a() + ", attrs=" + hVar.m2214b());
        mo2175c(c0554l0M2462q);
        return c0554l0M2462q;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo2174b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo2175c(C0554l0 c0554l0);

    /* JADX INFO: renamed from: d */
    public void mo2176d(h hVar) {
        int i7 = this.f1946a;
        this.f1946a = i7 + 1;
        if (i7 == 0) {
            mo2173a(hVar);
        }
        this.f1946a = 0;
    }

    /* JADX INFO: renamed from: e */
    public void mo2177e() {
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo2178f();
}
