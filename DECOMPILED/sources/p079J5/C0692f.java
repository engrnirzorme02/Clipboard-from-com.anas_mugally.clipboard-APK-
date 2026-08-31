package p079J5;

import com.google.android.gms.common.api.C3553a;
import io.grpc.internal.AbstractC5757S;
import io.grpc.internal.C5745L0;
import io.grpc.internal.C5747M0;
import io.grpc.internal.C5762U0;
import io.grpc.internal.C5777d0;
import io.grpc.internal.C5782g;
import io.grpc.internal.C5787i0;
import io.grpc.internal.InterfaceC5803q0;
import io.grpc.internal.InterfaceC5810u;
import io.grpc.internal.InterfaceC5814w;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import p063H5.AbstractC0527W;
import p063H5.AbstractC0541f;
import p063H5.AbstractC0573y;
import p063H5.EnumC0566r0;
import p087K5.C0753b;
import p087K5.C0759h;
import p087K5.EnumC0752a;
import p087K5.EnumC0762k;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: J5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0692f extends AbstractC0573y {

    /* JADX INFO: renamed from: r */
    private static final Logger f2687r = Logger.getLogger(C0692f.class.getName());

    /* JADX INFO: renamed from: s */
    static final C0753b f2688s = new C0753b.b(C0753b.f3037f).m3536f(EnumC0752a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC0752a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC0752a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC0752a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC0752a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC0752a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).m3539i(EnumC0762k.TLS_1_2).m3538h(true).m3535e();

    /* JADX INFO: renamed from: t */
    private static final long f2689t = TimeUnit.DAYS.toNanos(1000);

    /* JADX INFO: renamed from: u */
    private static final C5745L0.d f2690u;

    /* JADX INFO: renamed from: v */
    static final InterfaceC5803q0 f2691v;

    /* JADX INFO: renamed from: w */
    private static final EnumSet f2692w;

    /* JADX INFO: renamed from: a */
    private final C5787i0 f2693a;

    /* JADX INFO: renamed from: e */
    private SocketFactory f2697e;

    /* JADX INFO: renamed from: f */
    private SSLSocketFactory f2698f;

    /* JADX INFO: renamed from: h */
    private HostnameVerifier f2700h;

    /* JADX INFO: renamed from: n */
    private boolean f2706n;

    /* JADX INFO: renamed from: b */
    private C5762U0.b f2694b = C5762U0.m25734a();

    /* JADX INFO: renamed from: c */
    private InterfaceC5803q0 f2695c = f2691v;

    /* JADX INFO: renamed from: d */
    private InterfaceC5803q0 f2696d = C5747M0.m25642c(AbstractC5757S.f22246v);

    /* JADX INFO: renamed from: i */
    private C0753b f2701i = f2688s;

    /* JADX INFO: renamed from: j */
    private c f2702j = c.TLS;

    /* JADX INFO: renamed from: k */
    private long f2703k = Long.MAX_VALUE;

    /* JADX INFO: renamed from: l */
    private long f2704l = AbstractC5757S.f22238n;

    /* JADX INFO: renamed from: m */
    private int f2705m = 65535;

    /* JADX INFO: renamed from: o */
    private int f2707o = 4194304;

    /* JADX INFO: renamed from: p */
    private int f2708p = C3553a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: q */
    private final boolean f2709q = false;

    /* JADX INFO: renamed from: g */
    private final boolean f2699g = false;

    /* JADX INFO: renamed from: J5.f$a */
    class a implements C5745L0.d {
        a() {
        }

        @Override // io.grpc.internal.C5745L0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo3239b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.C5745L0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor mo3238a() {
            return Executors.newCachedThreadPool(AbstractC5757S.m25672j("grpc-okhttp-%d", true));
        }
    }

    /* JADX INFO: renamed from: J5.f$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f2710a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f2711b;

        static {
            int[] iArr = new int[c.values().length];
            f2711b = iArr;
            try {
                iArr[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2711b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0691e.values().length];
            f2710a = iArr2;
            try {
                iArr2[EnumC0691e.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2710a[EnumC0691e.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: J5.f$c */
    private enum c {
        TLS,
        PLAINTEXT
    }

    /* JADX INFO: renamed from: J5.f$d */
    private final class d implements C5787i0.b {
        private d() {
        }

        @Override // io.grpc.internal.C5787i0.b
        /* JADX INFO: renamed from: a */
        public int mo3242a() {
            return C0692f.this.m3235i();
        }

        /* synthetic */ d(C0692f c0692f, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: J5.f$e */
    private final class e implements C5787i0.c {
        private e() {
        }

        @Override // io.grpc.internal.C5787i0.c
        /* JADX INFO: renamed from: a */
        public InterfaceC5810u mo3243a() {
            return C0692f.this.m3233f();
        }

        /* synthetic */ e(C0692f c0692f, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: J5.f$f */
    static final class f implements InterfaceC5810u {

        /* JADX INFO: renamed from: A */
        private final boolean f2717A;

        /* JADX INFO: renamed from: B */
        final int f2718B;

        /* JADX INFO: renamed from: C */
        final boolean f2719C;

        /* JADX INFO: renamed from: D */
        private boolean f2720D;

        /* JADX INFO: renamed from: a */
        private final InterfaceC5803q0 f2721a;

        /* JADX INFO: renamed from: b */
        final Executor f2722b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC5803q0 f2723c;

        /* JADX INFO: renamed from: d */
        final ScheduledExecutorService f2724d;

        /* JADX INFO: renamed from: e */
        final C5762U0.b f2725e;

        /* JADX INFO: renamed from: f */
        final SocketFactory f2726f;

        /* JADX INFO: renamed from: r */
        final SSLSocketFactory f2727r;

        /* JADX INFO: renamed from: s */
        final HostnameVerifier f2728s;

        /* JADX INFO: renamed from: t */
        final C0753b f2729t;

        /* JADX INFO: renamed from: u */
        final int f2730u;

        /* JADX INFO: renamed from: v */
        private final boolean f2731v;

        /* JADX INFO: renamed from: w */
        private final long f2732w;

        /* JADX INFO: renamed from: x */
        private final C5782g f2733x;

        /* JADX INFO: renamed from: y */
        private final long f2734y;

        /* JADX INFO: renamed from: z */
        final int f2735z;

        /* JADX INFO: renamed from: J5.f$f$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C5782g.b f2736a;

            a(C5782g.b bVar) {
                this.f2736a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2736a.m25924a();
            }
        }

        /* synthetic */ f(InterfaceC5803q0 interfaceC5803q0, InterfaceC5803q0 interfaceC5803q1, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0753b c0753b, int i7, boolean z7, long j7, long j8, int i8, boolean z8, int i9, C5762U0.b bVar, boolean z9, a aVar) {
            this(interfaceC5803q0, interfaceC5803q1, socketFactory, sSLSocketFactory, hostnameVerifier, c0753b, i7, z7, j7, j8, i8, z8, i9, bVar, z9);
        }

        @Override // io.grpc.internal.InterfaceC5810u
        /* JADX INFO: renamed from: M */
        public InterfaceC5814w mo3244M(SocketAddress socketAddress, InterfaceC5810u.a aVar, AbstractC0541f abstractC0541f) {
            if (this.f2720D) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            C5782g.b bVarM25923d = this.f2733x.m25923d();
            C0695i c0695i = new C0695i(this, (InetSocketAddress) socketAddress, aVar.m26182a(), aVar.m26185d(), aVar.m26183b(), aVar.m26184c(), new a(bVarM25923d));
            if (this.f2731v) {
                c0695i.m3340U(true, bVarM25923d.m25925b(), this.f2734y, this.f2717A);
            }
            return c0695i;
        }

        @Override // io.grpc.internal.InterfaceC5810u
        /* JADX INFO: renamed from: M0 */
        public Collection mo3245M0() {
            return C0692f.m3232j();
        }

        @Override // io.grpc.internal.InterfaceC5810u, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f2720D) {
                return;
            }
            this.f2720D = true;
            this.f2721a.mo25644b(this.f2722b);
            this.f2723c.mo25644b(this.f2724d);
        }

        @Override // io.grpc.internal.InterfaceC5810u
        /* JADX INFO: renamed from: z0 */
        public ScheduledExecutorService mo3246z0() {
            return this.f2724d;
        }

        private f(InterfaceC5803q0 interfaceC5803q0, InterfaceC5803q0 interfaceC5803q1, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0753b c0753b, int i7, boolean z7, long j7, long j8, int i8, boolean z8, int i9, C5762U0.b bVar, boolean z9) {
            this.f2721a = interfaceC5803q0;
            this.f2722b = (Executor) interfaceC5803q0.mo25643a();
            this.f2723c = interfaceC5803q1;
            this.f2724d = (ScheduledExecutorService) interfaceC5803q1.mo25643a();
            this.f2726f = socketFactory;
            this.f2727r = sSLSocketFactory;
            this.f2728s = hostnameVerifier;
            this.f2729t = c0753b;
            this.f2730u = i7;
            this.f2731v = z7;
            this.f2732w = j7;
            this.f2733x = new C5782g("keepalive time nanos", j7);
            this.f2734y = j8;
            this.f2735z = i8;
            this.f2717A = z8;
            this.f2718B = i9;
            this.f2719C = z9;
            this.f2725e = (C5762U0.b) AbstractC1209m.m5303o(bVar, "transportTracerFactory");
        }
    }

    static {
        a aVar = new a();
        f2690u = aVar;
        f2691v = C5747M0.m25642c(aVar);
        f2692w = EnumSet.of(EnumC0566r0.MTLS, EnumC0566r0.CUSTOM_MANAGERS);
    }

    private C0692f(String str) {
        a aVar = null;
        this.f2693a = new C5787i0(str, new e(this, aVar), new d(this, aVar));
    }

    /* JADX INFO: renamed from: h */
    public static C0692f m3231h(String str) {
        return new C0692f(str);
    }

    /* JADX INFO: renamed from: j */
    static Collection m3232j() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // p063H5.AbstractC0573y
    /* JADX INFO: renamed from: e */
    protected AbstractC0527W mo2535e() {
        return this.f2693a;
    }

    /* JADX INFO: renamed from: f */
    f m3233f() {
        return new f(this.f2695c, this.f2696d, this.f2697e, m3234g(), this.f2700h, this.f2701i, this.f2707o, this.f2703k != Long.MAX_VALUE, this.f2703k, this.f2704l, this.f2705m, this.f2706n, this.f2708p, this.f2694b, false, null);
    }

    /* JADX INFO: renamed from: g */
    SSLSocketFactory m3234g() {
        int i7 = b.f2711b[this.f2702j.ordinal()];
        if (i7 == 1) {
            return null;
        }
        if (i7 != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.f2702j);
        }
        try {
            if (this.f2698f == null) {
                this.f2698f = SSLContext.getInstance("Default", C0759h.m3574e().m3580g()).getSocketFactory();
            }
            return this.f2698f;
        } catch (GeneralSecurityException e7) {
            throw new RuntimeException("TLS Provider failure", e7);
        }
    }

    /* JADX INFO: renamed from: i */
    int m3235i() {
        int i7 = b.f2711b[this.f2702j.ordinal()];
        if (i7 == 1) {
            return 80;
        }
        if (i7 == 2) {
            return 443;
        }
        throw new AssertionError(this.f2702j + " not handled");
    }

    @Override // p063H5.AbstractC0527W
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0692f mo2251c(long j7, TimeUnit timeUnit) {
        AbstractC1209m.m5293e(j7 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j7);
        this.f2703k = nanos;
        long jM25899l = C5777d0.m25899l(nanos);
        this.f2703k = jM25899l;
        if (jM25899l >= f2689t) {
            this.f2703k = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // p063H5.AbstractC0527W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0692f mo2252d() {
        AbstractC1209m.m5309u(!this.f2699g, "Cannot change security when using ChannelCredentials");
        this.f2702j = c.PLAINTEXT;
        return this;
    }
}
