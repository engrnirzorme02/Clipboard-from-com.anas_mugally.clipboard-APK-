package io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p063H5.AbstractC0518M;
import p063H5.AbstractC0523S;
import p063H5.AbstractC0544g0;
import p063H5.AbstractC0551k;
import p063H5.C0516K;
import p063H5.C0530Z;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.C0554l0;
import p063H5.InterfaceC0546h0;
import p122P3.AbstractC1209m;
import p122P3.AbstractC1213q;
import p122P3.C1211o;
import p122P3.C1212p;
import p122P3.InterfaceC1214r;
import p157U3.C1675g;

/* JADX INFO: renamed from: io.grpc.internal.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5757S {

    /* JADX INFO: renamed from: a */
    private static final Logger f22225a = Logger.getLogger(AbstractC5757S.class.getName());

    /* JADX INFO: renamed from: b */
    private static final Set f22226b = Collections.unmodifiableSet(EnumSet.of(C0554l0.b.OK, C0554l0.b.INVALID_ARGUMENT, C0554l0.b.NOT_FOUND, C0554l0.b.ALREADY_EXISTS, C0554l0.b.FAILED_PRECONDITION, C0554l0.b.ABORTED, C0554l0.b.OUT_OF_RANGE, C0554l0.b.DATA_LOSS));

    /* JADX INFO: renamed from: c */
    public static final Charset f22227c = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: d */
    public static final C0530Z.g f22228d = C0530Z.g.m2296e("grpc-timeout", new i());

    /* JADX INFO: renamed from: e */
    public static final C0530Z.g f22229e;

    /* JADX INFO: renamed from: f */
    public static final C0530Z.g f22230f;

    /* JADX INFO: renamed from: g */
    public static final C0530Z.g f22231g;

    /* JADX INFO: renamed from: h */
    public static final C0530Z.g f22232h;

    /* JADX INFO: renamed from: i */
    static final C0530Z.g f22233i;

    /* JADX INFO: renamed from: j */
    public static final C0530Z.g f22234j;

    /* JADX INFO: renamed from: k */
    public static final C0530Z.g f22235k;

    /* JADX INFO: renamed from: l */
    public static final C0530Z.g f22236l;

    /* JADX INFO: renamed from: m */
    public static final C1211o f22237m;

    /* JADX INFO: renamed from: n */
    public static final long f22238n;

    /* JADX INFO: renamed from: o */
    public static final long f22239o;

    /* JADX INFO: renamed from: p */
    public static final long f22240p;

    /* JADX INFO: renamed from: q */
    public static final InterfaceC0546h0 f22241q;

    /* JADX INFO: renamed from: r */
    public static final InterfaceC0546h0 f22242r;

    /* JADX INFO: renamed from: s */
    public static final C0535c.c f22243s;

    /* JADX INFO: renamed from: t */
    private static final AbstractC0551k f22244t;

    /* JADX INFO: renamed from: u */
    public static final C5745L0.d f22245u;

    /* JADX INFO: renamed from: v */
    public static final C5745L0.d f22246v;

    /* JADX INFO: renamed from: w */
    public static final InterfaceC1214r f22247w;

    /* JADX INFO: renamed from: io.grpc.internal.S$a */
    class a implements InterfaceC0546h0 {
        a() {
        }

        @Override // p063H5.InterfaceC0546h0
        /* JADX INFO: renamed from: a */
        public AbstractC0544g0 mo2425a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.S$b */
    class b extends AbstractC0551k {
        b() {
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.S$c */
    class c implements C5745L0.d {
        c() {
        }

        @Override // io.grpc.internal.C5745L0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo3239b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.C5745L0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor mo3238a() {
            return Executors.newCachedThreadPool(AbstractC5757S.m25672j("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.S$d */
    class d implements C5745L0.d {
        d() {
        }

        @Override // io.grpc.internal.C5745L0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo3239b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // io.grpc.internal.C5745L0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService mo3238a() {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, AbstractC5757S.m25672j("grpc-timer-%d", true));
            try {
                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.S$e */
    class e implements InterfaceC1214r {
        e() {
        }

        @Override // p122P3.InterfaceC1214r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1212p get() {
            return C1212p.m5318c();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.S$f */
    class f implements InterfaceC5808t {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC0551k.a f22248a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5808t f22249b;

        f(AbstractC0551k.a aVar, InterfaceC5808t interfaceC5808t) {
            this.f22248a = aVar;
            this.f22249b = interfaceC5808t;
        }

        @Override // io.grpc.internal.InterfaceC5808t
        /* JADX INFO: renamed from: c */
        public InterfaceC5804r mo3348c(C0532a0 c0532a0, C0530Z c0530z, C0535c c0535c, AbstractC0551k[] abstractC0551kArr) {
            AbstractC0551k abstractC0551kMo2432a = this.f22248a.mo2432a(AbstractC0551k.b.m2433a().m2435b(c0535c).m2434a(), c0530z);
            AbstractC1209m.m5309u(abstractC0551kArr[abstractC0551kArr.length - 1] == AbstractC5757S.f22244t, "lb tracer already assigned");
            abstractC0551kArr[abstractC0551kArr.length - 1] = abstractC0551kMo2432a;
            return this.f22249b.mo3348c(c0532a0, c0530z, c0535c, abstractC0551kArr);
        }

        @Override // p063H5.InterfaceC0521P
        /* JADX INFO: renamed from: g */
        public C0516K mo2172g() {
            return this.f22249b.mo2172g();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.S$g */
    private static final class g implements AbstractC0518M.a {
        private g() {
        }

        @Override // p063H5.C0530Z.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] mo2310b(byte[] bArr) {
            return bArr;
        }

        @Override // p063H5.C0530Z.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] mo2309a(byte[] bArr) {
            return bArr;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: io.grpc.internal.S$h */
    public static final class h {

        /* JADX INFO: renamed from: A */
        public static final h f22250A;

        /* JADX INFO: renamed from: B */
        private static final h[] f22251B;

        /* JADX INFO: renamed from: C */
        private static final /* synthetic */ h[] f22252C;

        /* JADX INFO: renamed from: c */
        public static final h f22253c;

        /* JADX INFO: renamed from: d */
        public static final h f22254d;

        /* JADX INFO: renamed from: e */
        public static final h f22255e;

        /* JADX INFO: renamed from: f */
        public static final h f22256f;

        /* JADX INFO: renamed from: r */
        public static final h f22257r;

        /* JADX INFO: renamed from: s */
        public static final h f22258s;

        /* JADX INFO: renamed from: t */
        public static final h f22259t;

        /* JADX INFO: renamed from: u */
        public static final h f22260u;

        /* JADX INFO: renamed from: v */
        public static final h f22261v;

        /* JADX INFO: renamed from: w */
        public static final h f22262w;

        /* JADX INFO: renamed from: x */
        public static final h f22263x;

        /* JADX INFO: renamed from: y */
        public static final h f22264y;

        /* JADX INFO: renamed from: z */
        public static final h f22265z;

        /* JADX INFO: renamed from: a */
        private final int f22266a;

        /* JADX INFO: renamed from: b */
        private final C0554l0 f22267b;

        static {
            C0554l0 c0554l0 = C0554l0.f2113t;
            h hVar = new h("NO_ERROR", 0, 0, c0554l0);
            f22253c = hVar;
            C0554l0 c0554l1 = C0554l0.f2112s;
            h hVar2 = new h("PROTOCOL_ERROR", 1, 1, c0554l1);
            f22254d = hVar2;
            h hVar3 = new h("INTERNAL_ERROR", 2, 2, c0554l1);
            f22255e = hVar3;
            h hVar4 = new h("FLOW_CONTROL_ERROR", 3, 3, c0554l1);
            f22256f = hVar4;
            h hVar5 = new h("SETTINGS_TIMEOUT", 4, 4, c0554l1);
            f22257r = hVar5;
            h hVar6 = new h("STREAM_CLOSED", 5, 5, c0554l1);
            f22258s = hVar6;
            h hVar7 = new h("FRAME_SIZE_ERROR", 6, 6, c0554l1);
            f22259t = hVar7;
            h hVar8 = new h("REFUSED_STREAM", 7, 7, c0554l0);
            f22260u = hVar8;
            h hVar9 = new h("CANCEL", 8, 8, C0554l0.f2099f);
            f22261v = hVar9;
            h hVar10 = new h("COMPRESSION_ERROR", 9, 9, c0554l1);
            f22262w = hVar10;
            h hVar11 = new h("CONNECT_ERROR", 10, 10, c0554l1);
            f22263x = hVar11;
            h hVar12 = new h("ENHANCE_YOUR_CALM", 11, 11, C0554l0.f2107n.m2462q("Bandwidth exhausted"));
            f22264y = hVar12;
            h hVar13 = new h("INADEQUATE_SECURITY", 12, 12, C0554l0.f2105l.m2462q("Permission denied as protocol is not secure enough to call"));
            f22265z = hVar13;
            h hVar14 = new h("HTTP_1_1_REQUIRED", 13, 13, C0554l0.f2100g);
            f22250A = hVar14;
            f22252C = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14};
            f22251B = m25686c();
        }

        private h(String str, int i7, int i8, C0554l0 c0554l0) {
            super(str, i7);
            this.f22266a = i8;
            String str2 = "HTTP/2 error code: " + name();
            if (c0554l0.m2459n() != null) {
                str2 = str2 + " (" + c0554l0.m2459n() + ")";
            }
            this.f22267b = c0554l0.m2462q(str2);
        }

        /* JADX INFO: renamed from: c */
        private static h[] m25686c() {
            h[] hVarArrValues = values();
            h[] hVarArr = new h[((int) hVarArrValues[hVarArrValues.length - 1].m25689d()) + 1];
            for (h hVar : hVarArrValues) {
                hVarArr[(int) hVar.m25689d()] = hVar;
            }
            return hVarArr;
        }

        /* JADX INFO: renamed from: h */
        public static h m25687h(long j7) {
            h[] hVarArr = f22251B;
            if (j7 >= hVarArr.length || j7 < 0) {
                return null;
            }
            return hVarArr[(int) j7];
        }

        /* JADX INFO: renamed from: k */
        public static C0554l0 m25688k(long j7) {
            h hVarM25687h = m25687h(j7);
            if (hVarM25687h != null) {
                return hVarM25687h.m25690j();
            }
            return C0554l0.m2450h(f22255e.m25690j().m2458m().m2466h()).m2462q("Unrecognized HTTP/2 error code: " + j7);
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f22252C.clone();
        }

        /* JADX INFO: renamed from: d */
        public long m25689d() {
            return this.f22266a;
        }

        /* JADX INFO: renamed from: j */
        public C0554l0 m25690j() {
            return this.f22267b;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.S$i */
    static class i implements C0530Z.d {
        i() {
        }

        @Override // p063H5.C0530Z.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long mo2290b(String str) {
            AbstractC1209m.m5293e(str.length() > 0, "empty timeout");
            AbstractC1209m.m5293e(str.length() <= 9, "bad timeout format");
            long j7 = Long.parseLong(str.substring(0, str.length() - 1));
            char cCharAt = str.charAt(str.length() - 1);
            if (cCharAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(j7));
            }
            if (cCharAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(j7));
            }
            if (cCharAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(j7));
            }
            if (cCharAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j7));
            }
            if (cCharAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j7));
            }
            if (cCharAt == 'n') {
                return Long.valueOf(j7);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
        }

        @Override // p063H5.C0530Z.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String mo2289a(Long l7) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l7.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l7.longValue() < 100000000) {
                return l7 + "n";
            }
            if (l7.longValue() < 100000000000L) {
                return timeUnit.toMicros(l7.longValue()) + "u";
            }
            if (l7.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l7.longValue()) + "m";
            }
            if (l7.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l7.longValue()) + "S";
            }
            if (l7.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l7.longValue()) + "M";
            }
            return timeUnit.toHours(l7.longValue()) + "H";
        }
    }

    static {
        C0530Z.d dVar = C0530Z.f1980e;
        f22229e = C0530Z.g.m2296e("grpc-encoding", dVar);
        a aVar = null;
        f22230f = AbstractC0518M.m2168b("grpc-accept-encoding", new g(aVar));
        f22231g = C0530Z.g.m2296e("content-encoding", dVar);
        f22232h = AbstractC0518M.m2168b("accept-encoding", new g(aVar));
        f22233i = C0530Z.g.m2296e("content-length", dVar);
        f22234j = C0530Z.g.m2296e("content-type", dVar);
        f22235k = C0530Z.g.m2296e("te", dVar);
        f22236l = C0530Z.g.m2296e("user-agent", dVar);
        f22237m = C1211o.m5312a(',').m5314c();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f22238n = timeUnit.toNanos(20L);
        f22239o = TimeUnit.HOURS.toNanos(2L);
        f22240p = timeUnit.toNanos(20L);
        f22241q = new C5817x0();
        f22242r = new a();
        f22243s = C0535c.c.m2365b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f22244t = new b();
        f22245u = new c();
        f22246v = new d();
        f22247w = new e();
    }

    /* JADX INFO: renamed from: b */
    public static URI m25664b(String str) {
        String str2;
        AbstractC1209m.m5303o(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e7) {
                e = e7;
                throw new IllegalArgumentException("Invalid authority: " + str2, e);
            }
        } catch (URISyntaxException e8) {
            e = e8;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m25665c(String str) {
        AbstractC1209m.m5298j(m25664b(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    /* JADX INFO: renamed from: d */
    static void m25666d(InterfaceC5755Q0.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                m25667e(next);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m25667e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e7) {
            f22225a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e7);
        }
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC0551k[] m25668f(C0535c c0535c, C0530Z c0530z, int i7, boolean z7) {
        List listM2351i = c0535c.m2351i();
        int size = listM2351i.size();
        AbstractC0551k[] abstractC0551kArr = new AbstractC0551k[size + 1];
        AbstractC0551k.b bVarM2434a = AbstractC0551k.b.m2433a().m2435b(c0535c).m2437d(i7).m2436c(z7).m2434a();
        for (int i8 = 0; i8 < listM2351i.size(); i8++) {
            abstractC0551kArr[i8] = ((AbstractC0551k.a) listM2351i.get(i8)).mo2432a(bVarM2434a, c0530z);
        }
        abstractC0551kArr[size] = f22244t;
        return abstractC0551kArr;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m25669g(String str, boolean z7) {
        String property = System.getenv(str);
        if (property == null) {
            property = System.getProperty(str);
        }
        if (z7) {
            return AbstractC1213q.m5323a(property) || Boolean.parseBoolean(property);
        }
        return !AbstractC1213q.m5323a(property) && Boolean.parseBoolean(property);
    }

    /* JADX INFO: renamed from: h */
    public static String m25670h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.62.2");
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m25671i(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* JADX INFO: renamed from: j */
    public static ThreadFactory m25672j(String str, boolean z7) {
        return new C1675g().m7038e(z7).m7039f(str).m7037b();
    }

    /* JADX INFO: renamed from: k */
    static InterfaceC5808t m25673k(AbstractC0523S.f fVar, boolean z7) {
        AbstractC0523S.i iVarM2207c = fVar.m2207c();
        InterfaceC5808t interfaceC5808tMo25733a = iVarM2207c != null ? ((InterfaceC5760T0) iVarM2207c.mo2225e()).mo25733a() : null;
        if (interfaceC5808tMo25733a != null) {
            AbstractC0551k.a aVarM2206b = fVar.m2206b();
            return aVarM2206b == null ? interfaceC5808tMo25733a : new f(aVarM2206b, interfaceC5808tMo25733a);
        }
        if (!fVar.m2205a().m2460o()) {
            if (fVar.m2208d()) {
                return new C5736H(m25677o(fVar.m2205a()), InterfaceC5806s.a.DROPPED);
            }
            if (!z7) {
                return new C5736H(m25677o(fVar.m2205a()), InterfaceC5806s.a.PROCESSED);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    private static C0554l0.b m25674l(int i7) {
        if (i7 >= 100 && i7 < 200) {
            return C0554l0.b.INTERNAL;
        }
        if (i7 != 400) {
            if (i7 == 401) {
                return C0554l0.b.UNAUTHENTICATED;
            }
            if (i7 == 403) {
                return C0554l0.b.PERMISSION_DENIED;
            }
            if (i7 == 404) {
                return C0554l0.b.UNIMPLEMENTED;
            }
            if (i7 != 429) {
                if (i7 != 431) {
                    switch (i7) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return C0554l0.b.UNKNOWN;
                    }
                }
            }
            return C0554l0.b.UNAVAILABLE;
        }
        return C0554l0.b.INTERNAL;
    }

    /* JADX INFO: renamed from: m */
    public static C0554l0 m25675m(int i7) {
        return m25674l(i7).m2465d().m2462q("HTTP status code " + i7);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m25676n(String str) {
        char cCharAt;
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.startsWith("application/grpc")) {
            return lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';';
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static C0554l0 m25677o(C0554l0 c0554l0) {
        AbstractC1209m.m5292d(c0554l0 != null);
        if (!f22226b.contains(c0554l0.m2458m())) {
            return c0554l0;
        }
        return C0554l0.f2112s.m2462q("Inappropriate status code from control plane: " + c0554l0.m2458m() + " " + c0554l0.m2459n()).m2461p(c0554l0.m2457l());
    }

    /* JADX INFO: renamed from: p */
    public static boolean m25678p(C0535c c0535c) {
        return !Boolean.TRUE.equals(c0535c.m2350h(f22243s));
    }
}
