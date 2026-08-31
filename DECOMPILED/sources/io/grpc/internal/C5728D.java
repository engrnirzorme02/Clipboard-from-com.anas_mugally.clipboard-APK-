package io.grpc.internal;

import androidx.appcompat.app.AbstractC2263x;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p063H5.AbstractC0536c0;
import p063H5.AbstractC0544g0;
import p063H5.C0531a;
import p063H5.C0554l0;
import p063H5.C0572x;
import p063H5.ExecutorC0562p0;
import p063H5.InterfaceC0546h0;
import p122P3.AbstractC1209m;
import p122P3.AbstractC1217u;
import p122P3.AbstractC1219w;
import p122P3.C1212p;
import p122P3.C1220x;

/* JADX INFO: renamed from: io.grpc.internal.D */
/* JADX INFO: loaded from: classes.dex */
public class C5728D extends AbstractC0536c0 {

    /* JADX INFO: renamed from: A */
    private static String f22119A;

    /* JADX INFO: renamed from: s */
    private static final Logger f22120s = Logger.getLogger(C5728D.class.getName());

    /* JADX INFO: renamed from: t */
    private static final Set f22121t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* JADX INFO: renamed from: u */
    private static final String f22122u;

    /* JADX INFO: renamed from: v */
    private static final String f22123v;

    /* JADX INFO: renamed from: w */
    private static final String f22124w;

    /* JADX INFO: renamed from: x */
    static boolean f22125x;

    /* JADX INFO: renamed from: y */
    static boolean f22126y;

    /* JADX INFO: renamed from: z */
    protected static boolean f22127z;

    /* JADX INFO: renamed from: a */
    final InterfaceC0546h0 f22128a;

    /* JADX INFO: renamed from: b */
    private final Random f22129b = new Random();

    /* JADX INFO: renamed from: c */
    protected volatile b f22130c = d.INSTANCE;

    /* JADX INFO: renamed from: d */
    private final AtomicReference f22131d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    private final String f22132e;

    /* JADX INFO: renamed from: f */
    private final String f22133f;

    /* JADX INFO: renamed from: g */
    private final int f22134g;

    /* JADX INFO: renamed from: h */
    private final C5745L0.d f22135h;

    /* JADX INFO: renamed from: i */
    private final long f22136i;

    /* JADX INFO: renamed from: j */
    private final ExecutorC0562p0 f22137j;

    /* JADX INFO: renamed from: k */
    private final C1212p f22138k;

    /* JADX INFO: renamed from: l */
    protected boolean f22139l;

    /* JADX INFO: renamed from: m */
    private boolean f22140m;

    /* JADX INFO: renamed from: n */
    private Executor f22141n;

    /* JADX INFO: renamed from: o */
    private final boolean f22142o;

    /* JADX INFO: renamed from: p */
    private final AbstractC0536c0.f f22143p;

    /* JADX INFO: renamed from: q */
    private boolean f22144q;

    /* JADX INFO: renamed from: r */
    private AbstractC0536c0.d f22145r;

    /* JADX INFO: renamed from: io.grpc.internal.D$b */
    public interface b {
        /* JADX INFO: renamed from: c */
        List mo25576c(String str);
    }

    /* JADX INFO: renamed from: io.grpc.internal.D$c */
    protected static final class c {

        /* JADX INFO: renamed from: a */
        private C0554l0 f22146a;

        /* JADX INFO: renamed from: b */
        private List f22147b;

        /* JADX INFO: renamed from: c */
        private AbstractC0536c0.b f22148c;

        /* JADX INFO: renamed from: d */
        public C0531a f22149d;

        private c() {
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.D$d */
    private enum d implements b {
        INSTANCE;

        @Override // io.grpc.internal.C5728D.b
        /* JADX INFO: renamed from: c */
        public List mo25576c(String str) {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.D$e */
    private final class e implements Runnable {

        /* JADX INFO: renamed from: a */
        private final AbstractC0536c0.d f22152a;

        /* JADX INFO: renamed from: io.grpc.internal.D$e$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ boolean f22154a;

            a(boolean z7) {
                this.f22154a = z7;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f22154a) {
                    C5728D c5728d = C5728D.this;
                    c5728d.f22139l = true;
                    if (c5728d.f22136i > 0) {
                        C5728D.this.f22138k.m5321f().m5322g();
                    }
                }
                C5728D.this.f22144q = false;
            }
        }

        e(AbstractC0536c0.d dVar) {
            this.f22152a = (AbstractC0536c0.d) AbstractC1209m.m5303o(dVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z7;
            ExecutorC0562p0 executorC0562p0;
            a aVar;
            Logger logger = C5728D.f22120s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                C5728D.f22120s.finer("Attempting DNS resolution of " + C5728D.this.f22133f);
            }
            c cVarM25574n = null;
            try {
                try {
                    C0572x c0572xM25562m = C5728D.this.m25562m();
                    AbstractC0536c0.e.a aVarM2394d = AbstractC0536c0.e.m2394d();
                    if (c0572xM25562m == null) {
                        cVarM25574n = C5728D.this.m25574n(false);
                        if (cVarM25574n.f22146a != null) {
                            this.f22152a.mo2392a(cVarM25574n.f22146a);
                            z7 = cVarM25574n != null && cVarM25574n.f22146a == null;
                            executorC0562p0 = C5728D.this.f22137j;
                            aVar = new a(z7);
                        } else {
                            if (cVarM25574n.f22147b != null) {
                                aVarM2394d.m2400b(cVarM25574n.f22147b);
                            }
                            if (cVarM25574n.f22148c != null) {
                                aVarM2394d.m2402d(cVarM25574n.f22148c);
                            }
                            C0531a c0531a = cVarM25574n.f22149d;
                            if (c0531a != null) {
                                aVarM2394d.m2401c(c0531a);
                            }
                        }
                        executorC0562p0.execute(aVar);
                    }
                    if (C5728D.f22120s.isLoggable(level)) {
                        C5728D.f22120s.finer("Using proxy address " + c0572xM25562m);
                    }
                    aVarM2394d.m2400b(Collections.singletonList(c0572xM25562m));
                    this.f22152a.mo2393b(aVarM2394d.m2399a());
                    z7 = cVarM25574n != null && cVarM25574n.f22146a == null;
                    executorC0562p0 = C5728D.this.f22137j;
                    aVar = new a(z7);
                    executorC0562p0.execute(aVar);
                } catch (IOException e7) {
                    this.f22152a.mo2392a(C0554l0.f2113t.m2462q("Unable to resolve host " + C5728D.this.f22133f).m2461p(e7));
                    C5728D.this.f22137j.execute(new a(0 != 0 && null.f22146a == null));
                }
            } catch (Throwable th) {
                C5728D.this.f22137j.execute(new a(0 != 0 && null.f22146a == null));
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.D$f */
    public interface f {
    }

    /* JADX INFO: renamed from: io.grpc.internal.D$g */
    interface g {
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f22122u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f22123v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f22124w = property3;
        f22125x = Boolean.parseBoolean(property);
        f22126y = Boolean.parseBoolean(property2);
        f22127z = Boolean.parseBoolean(property3);
        m25568u(C5728D.class.getClassLoader());
    }

    protected C5728D(String str, String str2, AbstractC0536c0.a aVar, C5745L0.d dVar, C1212p c1212p, boolean z7) {
        AbstractC1209m.m5303o(aVar, "args");
        this.f22135h = dVar;
        URI uriCreate = URI.create("//" + ((String) AbstractC1209m.m5303o(str2, "name")));
        AbstractC1209m.m5298j(uriCreate.getHost() != null, "Invalid DNS name: %s", str2);
        this.f22132e = (String) AbstractC1209m.m5304p(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.f22133f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f22134g = aVar.m2371a();
        } else {
            this.f22134g = uriCreate.getPort();
        }
        this.f22128a = (InterfaceC0546h0) AbstractC1209m.m5303o(aVar.m2373c(), "proxyDetector");
        this.f22136i = m25566r(z7);
        this.f22138k = (C1212p) AbstractC1209m.m5303o(c1212p, "stopwatch");
        this.f22137j = (ExecutorC0562p0) AbstractC1209m.m5303o(aVar.m2376f(), "syncContext");
        Executor executorM2372b = aVar.m2372b();
        this.f22141n = executorM2372b;
        this.f22142o = executorM2372b == null;
        this.f22143p = (AbstractC0536c0.f) AbstractC1209m.m5303o(aVar.m2375e(), "serviceConfigParser");
    }

    /* JADX INFO: renamed from: A */
    private AbstractC0536c0.b m25552A() {
        List list = Collections.EMPTY_LIST;
        m25575t();
        if (list.isEmpty()) {
            f22120s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f22133f});
            return null;
        }
        AbstractC0536c0.b bVarM25570w = m25570w(list, this.f22129b, m25565q());
        if (bVarM25570w == null) {
            return null;
        }
        if (bVarM25570w.m2389d() != null) {
            return AbstractC0536c0.b.m2387b(bVarM25570w.m2389d());
        }
        return this.f22143p.mo2403a((Map) bVarM25570w.m2388c());
    }

    /* JADX INFO: renamed from: B */
    protected static boolean m25553B(boolean z7, boolean z8, String str) {
        if (!z7) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z8;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z9 = true;
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != '.') {
                z9 &= cCharAt >= '0' && cCharAt <= '9';
            }
        }
        return true ^ z9;
    }

    /* JADX INFO: renamed from: l */
    private boolean m25561l() {
        if (!this.f22139l) {
            return true;
        }
        long j7 = this.f22136i;
        if (j7 != 0) {
            return j7 > 0 && this.f22138k.m5320d(TimeUnit.NANOSECONDS) > this.f22136i;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public C0572x m25562m() {
        AbstractC0544g0 abstractC0544g0Mo2425a = this.f22128a.mo2425a(InetSocketAddress.createUnresolved(this.f22133f, this.f22134g));
        if (abstractC0544g0Mo2425a != null) {
            return new C0572x(abstractC0544g0Mo2425a);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    private static final List m25563o(Map map) {
        return AbstractC5775c0.m25878g(map, "clientLanguage");
    }

    /* JADX INFO: renamed from: p */
    private static final List m25564p(Map map) {
        return AbstractC5775c0.m25878g(map, "clientHostname");
    }

    /* JADX INFO: renamed from: q */
    private static String m25565q() {
        if (f22119A == null) {
            try {
                f22119A = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e7) {
                throw new RuntimeException(e7);
            }
        }
        return f22119A;
    }

    /* JADX INFO: renamed from: r */
    private static long m25566r(boolean z7) {
        if (z7) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j7 = 30;
        if (property != null) {
            try {
                j7 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f22120s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j7 > 0 ? TimeUnit.SECONDS.toNanos(j7) : j7;
    }

    /* JADX INFO: renamed from: s */
    private static final Double m25567s(Map map) {
        return AbstractC5775c0.m25879h(map, "percentage");
    }

    /* JADX INFO: renamed from: u */
    static g m25568u(ClassLoader classLoader) {
        try {
            try {
                try {
                    AbstractC2263x.m9328a(Class.forName("io.grpc.internal.a0", true, classLoader).asSubclass(g.class).getConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e7) {
                    f22120s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e7);
                    return null;
                }
            } catch (Exception e8) {
                f22120s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e8);
                return null;
            }
        } catch (ClassCastException e9) {
            f22120s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e9);
            return null;
        } catch (ClassNotFoundException e10) {
            f22120s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    static Map m25569v(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            AbstractC1219w.m5337a(f22121t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listM25563o = m25563o(map);
        if (listM25563o != null && !listM25563o.isEmpty()) {
            Iterator it = listM25563o.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dM25567s = m25567s(map);
        if (dM25567s != null) {
            int iIntValue = dM25567s.intValue();
            AbstractC1219w.m5337a(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dM25567s);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listM25564p = m25564p(map);
        if (listM25564p != null && !listM25564p.isEmpty()) {
            Iterator it2 = listM25564p.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapM25881j = AbstractC5775c0.m25881j(map, "serviceConfig");
        if (mapM25881j != null) {
            return mapM25881j;
        }
        throw new C1220x(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    /* JADX INFO: renamed from: w */
    static AbstractC0536c0.b m25570w(List list, Random random, String str) {
        try {
            Iterator it = m25571x(list).iterator();
            Map mapM25569v = null;
            while (it.hasNext()) {
                try {
                    mapM25569v = m25569v((Map) it.next(), random, str);
                    if (mapM25569v != null) {
                        break;
                    }
                } catch (RuntimeException e7) {
                    return AbstractC0536c0.b.m2387b(C0554l0.f2100g.m2462q("failed to pick service config choice").m2461p(e7));
                }
            }
            if (mapM25569v == null) {
                return null;
            }
            return AbstractC0536c0.b.m2386a(mapM25569v);
        } catch (IOException | RuntimeException e8) {
            return AbstractC0536c0.b.m2387b(C0554l0.f2100g.m2462q("failed to parse TXT records").m2461p(e8));
        }
    }

    /* JADX INFO: renamed from: x */
    static List m25571x(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                Object objM25848a = AbstractC5773b0.m25848a(str.substring(12));
                if (!(objM25848a instanceof List)) {
                    throw new ClassCastException("wrong type " + objM25848a);
                }
                arrayList.addAll(AbstractC5775c0.m25872a((List) objM25848a));
            } else {
                f22120s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    private void m25572y() {
        if (this.f22144q || this.f22140m || !m25561l()) {
            return;
        }
        this.f22144q = true;
        this.f22141n.execute(new e(this.f22145r));
    }

    /* JADX INFO: renamed from: z */
    private List m25573z() {
        Exception e7 = null;
        try {
            try {
                List listMo25576c = this.f22130c.mo25576c(this.f22133f);
                ArrayList arrayList = new ArrayList(listMo25576c.size());
                Iterator it = listMo25576c.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C0572x(new InetSocketAddress((InetAddress) it.next(), this.f22134g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e8) {
                e7 = e8;
                AbstractC1217u.m5334f(e7);
                throw new RuntimeException(e7);
            }
        } catch (Throwable th) {
            if (e7 != null) {
                f22120s.log(Level.FINE, "Address resolution failure", (Throwable) e7);
            }
            throw th;
        }
    }

    @Override // p063H5.AbstractC0536c0
    /* JADX INFO: renamed from: a */
    public String mo2366a() {
        return this.f22132e;
    }

    @Override // p063H5.AbstractC0536c0
    /* JADX INFO: renamed from: b */
    public void mo2367b() {
        AbstractC1209m.m5309u(this.f22145r != null, "not started");
        m25572y();
    }

    @Override // p063H5.AbstractC0536c0
    /* JADX INFO: renamed from: c */
    public void mo2368c() {
        if (this.f22140m) {
            return;
        }
        this.f22140m = true;
        Executor executor = this.f22141n;
        if (executor == null || !this.f22142o) {
            return;
        }
        this.f22141n = (Executor) C5745L0.m25638f(this.f22135h, executor);
    }

    @Override // p063H5.AbstractC0536c0
    /* JADX INFO: renamed from: d */
    public void mo2369d(AbstractC0536c0.d dVar) {
        AbstractC1209m.m5309u(this.f22145r == null, "already started");
        if (this.f22142o) {
            this.f22141n = (Executor) C5745L0.m25637d(this.f22135h);
        }
        this.f22145r = (AbstractC0536c0.d) AbstractC1209m.m5303o(dVar, "listener");
        m25572y();
    }

    /* JADX INFO: renamed from: n */
    protected c m25574n(boolean z7) {
        c cVar = new c();
        try {
            cVar.f22147b = m25573z();
        } catch (Exception e7) {
            if (!z7) {
                cVar.f22146a = C0554l0.f2113t.m2462q("Unable to resolve host " + this.f22133f).m2461p(e7);
                return cVar;
            }
        }
        if (f22127z) {
            cVar.f22148c = m25552A();
        }
        return cVar;
    }

    /* JADX INFO: renamed from: t */
    protected f m25575t() {
        if (!m25553B(f22125x, f22126y, this.f22133f)) {
            return null;
        }
        AbstractC2263x.m9328a(this.f22131d.get());
        return null;
    }
}
