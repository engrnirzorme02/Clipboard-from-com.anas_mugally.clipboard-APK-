package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: loaded from: classes.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    /* JADX INFO: renamed from: P */
    public static final Companion f25337P = new Companion(null);

    /* JADX INFO: renamed from: Q */
    private static final List f25338Q = Util.m28783w(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: R */
    private static final List f25339R = Util.m28783w(ConnectionSpec.f25217i, ConnectionSpec.f25219k);

    /* JADX INFO: renamed from: A */
    private final SocketFactory f25340A;

    /* JADX INFO: renamed from: B */
    private final SSLSocketFactory f25341B;

    /* JADX INFO: renamed from: C */
    private final X509TrustManager f25342C;

    /* JADX INFO: renamed from: D */
    private final List f25343D;

    /* JADX INFO: renamed from: E */
    private final List f25344E;

    /* JADX INFO: renamed from: F */
    private final HostnameVerifier f25345F;

    /* JADX INFO: renamed from: G */
    private final CertificatePinner f25346G;

    /* JADX INFO: renamed from: H */
    private final CertificateChainCleaner f25347H;

    /* JADX INFO: renamed from: I */
    private final int f25348I;

    /* JADX INFO: renamed from: J */
    private final int f25349J;

    /* JADX INFO: renamed from: K */
    private final int f25350K;

    /* JADX INFO: renamed from: L */
    private final int f25351L;

    /* JADX INFO: renamed from: M */
    private final int f25352M;

    /* JADX INFO: renamed from: N */
    private final long f25353N;

    /* JADX INFO: renamed from: O */
    private final RouteDatabase f25354O;

    /* JADX INFO: renamed from: a */
    private final Dispatcher f25355a;

    /* JADX INFO: renamed from: b */
    private final ConnectionPool f25356b;

    /* JADX INFO: renamed from: c */
    private final List f25357c;

    /* JADX INFO: renamed from: d */
    private final List f25358d;

    /* JADX INFO: renamed from: e */
    private final EventListener.Factory f25359e;

    /* JADX INFO: renamed from: f */
    private final boolean f25360f;

    /* JADX INFO: renamed from: r */
    private final Authenticator f25361r;

    /* JADX INFO: renamed from: s */
    private final boolean f25362s;

    /* JADX INFO: renamed from: t */
    private final boolean f25363t;

    /* JADX INFO: renamed from: u */
    private final CookieJar f25364u;

    /* JADX INFO: renamed from: v */
    private final Cache f25365v;

    /* JADX INFO: renamed from: w */
    private final Dns f25366w;

    /* JADX INFO: renamed from: x */
    private final Proxy f25367x;

    /* JADX INFO: renamed from: y */
    private final ProxySelector f25368y;

    /* JADX INFO: renamed from: z */
    private final Authenticator f25369z;

    public static final class Builder {

        /* JADX INFO: renamed from: A */
        private int f25370A;

        /* JADX INFO: renamed from: B */
        private int f25371B;

        /* JADX INFO: renamed from: C */
        private long f25372C;

        /* JADX INFO: renamed from: D */
        private RouteDatabase f25373D;

        /* JADX INFO: renamed from: a */
        private Dispatcher f25374a = new Dispatcher();

        /* JADX INFO: renamed from: b */
        private ConnectionPool f25375b = new ConnectionPool();

        /* JADX INFO: renamed from: c */
        private final List f25376c = new ArrayList();

        /* JADX INFO: renamed from: d */
        private final List f25377d = new ArrayList();

        /* JADX INFO: renamed from: e */
        private EventListener.Factory f25378e = Util.m28767g(EventListener.f25259b);

        /* JADX INFO: renamed from: f */
        private boolean f25379f = true;

        /* JADX INFO: renamed from: g */
        private Authenticator f25380g;

        /* JADX INFO: renamed from: h */
        private boolean f25381h;

        /* JADX INFO: renamed from: i */
        private boolean f25382i;

        /* JADX INFO: renamed from: j */
        private CookieJar f25383j;

        /* JADX INFO: renamed from: k */
        private Cache f25384k;

        /* JADX INFO: renamed from: l */
        private Dns f25385l;

        /* JADX INFO: renamed from: m */
        private Proxy f25386m;

        /* JADX INFO: renamed from: n */
        private ProxySelector f25387n;

        /* JADX INFO: renamed from: o */
        private Authenticator f25388o;

        /* JADX INFO: renamed from: p */
        private SocketFactory f25389p;

        /* JADX INFO: renamed from: q */
        private SSLSocketFactory f25390q;

        /* JADX INFO: renamed from: r */
        private X509TrustManager f25391r;

        /* JADX INFO: renamed from: s */
        private List f25392s;

        /* JADX INFO: renamed from: t */
        private List f25393t;

        /* JADX INFO: renamed from: u */
        private HostnameVerifier f25394u;

        /* JADX INFO: renamed from: v */
        private CertificatePinner f25395v;

        /* JADX INFO: renamed from: w */
        private CertificateChainCleaner f25396w;

        /* JADX INFO: renamed from: x */
        private int f25397x;

        /* JADX INFO: renamed from: y */
        private int f25398y;

        /* JADX INFO: renamed from: z */
        private int f25399z;

        public Builder() {
            Authenticator authenticator = Authenticator.f25014b;
            this.f25380g = authenticator;
            this.f25381h = true;
            this.f25382i = true;
            this.f25383j = CookieJar.f25245b;
            this.f25385l = Dns.f25256b;
            this.f25388o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            AbstractC6118n.m27186d(socketFactory, "getDefault()");
            this.f25389p = socketFactory;
            Companion companion = OkHttpClient.f25337P;
            this.f25392s = companion.m28642a();
            this.f25393t = companion.m28643b();
            this.f25394u = OkHostnameVerifier.f26051a;
            this.f25395v = CertificatePinner.f25077d;
            this.f25398y = 10000;
            this.f25399z = 10000;
            this.f25370A = 10000;
            this.f25372C = 1024L;
        }

        /* JADX INFO: renamed from: A */
        public final int m28606A() {
            return this.f25399z;
        }

        /* JADX INFO: renamed from: B */
        public final boolean m28607B() {
            return this.f25379f;
        }

        /* JADX INFO: renamed from: C */
        public final RouteDatabase m28608C() {
            return this.f25373D;
        }

        /* JADX INFO: renamed from: D */
        public final SocketFactory m28609D() {
            return this.f25389p;
        }

        /* JADX INFO: renamed from: E */
        public final SSLSocketFactory m28610E() {
            return this.f25390q;
        }

        /* JADX INFO: renamed from: F */
        public final int m28611F() {
            return this.f25370A;
        }

        /* JADX INFO: renamed from: G */
        public final X509TrustManager m28612G() {
            return this.f25391r;
        }

        /* JADX INFO: renamed from: H */
        public final Builder m28613H(long j7, TimeUnit unit) {
            AbstractC6118n.m27187e(unit, "unit");
            this.f25399z = Util.m28771k("timeout", j7, unit);
            return this;
        }

        /* JADX INFO: renamed from: I */
        public final Builder m28614I(boolean z7) {
            this.f25379f = z7;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public final Builder m28615J(long j7, TimeUnit unit) {
            AbstractC6118n.m27187e(unit, "unit");
            this.f25370A = Util.m28771k("timeout", j7, unit);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final Builder m28616a(Interceptor interceptor) {
            AbstractC6118n.m27187e(interceptor, "interceptor");
            this.f25376c.add(interceptor);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final OkHttpClient m28617b() {
            return new OkHttpClient(this);
        }

        /* JADX INFO: renamed from: c */
        public final Builder m28618c(long j7, TimeUnit unit) {
            AbstractC6118n.m27187e(unit, "unit");
            this.f25398y = Util.m28771k("timeout", j7, unit);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final Authenticator m28619d() {
            return this.f25380g;
        }

        /* JADX INFO: renamed from: e */
        public final Cache m28620e() {
            return this.f25384k;
        }

        /* JADX INFO: renamed from: f */
        public final int m28621f() {
            return this.f25397x;
        }

        /* JADX INFO: renamed from: g */
        public final CertificateChainCleaner m28622g() {
            return this.f25396w;
        }

        /* JADX INFO: renamed from: h */
        public final CertificatePinner m28623h() {
            return this.f25395v;
        }

        /* JADX INFO: renamed from: i */
        public final int m28624i() {
            return this.f25398y;
        }

        /* JADX INFO: renamed from: j */
        public final ConnectionPool m28625j() {
            return this.f25375b;
        }

        /* JADX INFO: renamed from: k */
        public final List m28626k() {
            return this.f25392s;
        }

        /* JADX INFO: renamed from: l */
        public final CookieJar m28627l() {
            return this.f25383j;
        }

        /* JADX INFO: renamed from: m */
        public final Dispatcher m28628m() {
            return this.f25374a;
        }

        /* JADX INFO: renamed from: n */
        public final Dns m28629n() {
            return this.f25385l;
        }

        /* JADX INFO: renamed from: o */
        public final EventListener.Factory m28630o() {
            return this.f25378e;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m28631p() {
            return this.f25381h;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m28632q() {
            return this.f25382i;
        }

        /* JADX INFO: renamed from: r */
        public final HostnameVerifier m28633r() {
            return this.f25394u;
        }

        /* JADX INFO: renamed from: s */
        public final List m28634s() {
            return this.f25376c;
        }

        /* JADX INFO: renamed from: t */
        public final long m28635t() {
            return this.f25372C;
        }

        /* JADX INFO: renamed from: u */
        public final List m28636u() {
            return this.f25377d;
        }

        /* JADX INFO: renamed from: v */
        public final int m28637v() {
            return this.f25371B;
        }

        /* JADX INFO: renamed from: w */
        public final List m28638w() {
            return this.f25393t;
        }

        /* JADX INFO: renamed from: x */
        public final Proxy m28639x() {
            return this.f25386m;
        }

        /* JADX INFO: renamed from: y */
        public final Authenticator m28640y() {
            return this.f25388o;
        }

        /* JADX INFO: renamed from: z */
        public final ProxySelector m28641z() {
            return this.f25387n;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List m28642a() {
            return OkHttpClient.f25339R;
        }

        /* JADX INFO: renamed from: b */
        public final List m28643b() {
            return OkHttpClient.f25338Q;
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorM28641z;
        AbstractC6118n.m27187e(builder, "builder");
        this.f25355a = builder.m28628m();
        this.f25356b = builder.m28625j();
        this.f25357c = Util.m28753V(builder.m28634s());
        this.f25358d = Util.m28753V(builder.m28636u());
        this.f25359e = builder.m28630o();
        this.f25360f = builder.m28607B();
        this.f25361r = builder.m28619d();
        this.f25362s = builder.m28631p();
        this.f25363t = builder.m28632q();
        this.f25364u = builder.m28627l();
        this.f25365v = builder.m28620e();
        this.f25366w = builder.m28629n();
        this.f25367x = builder.m28639x();
        if (builder.m28639x() != null) {
            proxySelectorM28641z = NullProxySelector.f26038a;
        } else {
            proxySelectorM28641z = builder.m28641z();
            proxySelectorM28641z = proxySelectorM28641z == null ? ProxySelector.getDefault() : proxySelectorM28641z;
            if (proxySelectorM28641z == null) {
                proxySelectorM28641z = NullProxySelector.f26038a;
            }
        }
        this.f25368y = proxySelectorM28641z;
        this.f25369z = builder.m28640y();
        this.f25340A = builder.m28609D();
        List listM28626k = builder.m28626k();
        this.f25343D = listM28626k;
        this.f25344E = builder.m28638w();
        this.f25345F = builder.m28633r();
        this.f25348I = builder.m28621f();
        this.f25349J = builder.m28624i();
        this.f25350K = builder.m28606A();
        this.f25351L = builder.m28611F();
        this.f25352M = builder.m28637v();
        this.f25353N = builder.m28635t();
        RouteDatabase routeDatabaseM28608C = builder.m28608C();
        this.f25354O = routeDatabaseM28608C == null ? new RouteDatabase() : routeDatabaseM28608C;
        if (listM28626k == null || !listM28626k.isEmpty()) {
            Iterator it = listM28626k.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).m28398f()) {
                    if (builder.m28610E() != null) {
                        this.f25341B = builder.m28610E();
                        CertificateChainCleaner certificateChainCleanerM28622g = builder.m28622g();
                        AbstractC6118n.m27184b(certificateChainCleanerM28622g);
                        this.f25347H = certificateChainCleanerM28622g;
                        X509TrustManager x509TrustManagerM28612G = builder.m28612G();
                        AbstractC6118n.m27184b(x509TrustManagerM28612G);
                        this.f25342C = x509TrustManagerM28612G;
                        CertificatePinner certificatePinnerM28623h = builder.m28623h();
                        AbstractC6118n.m27184b(certificateChainCleanerM28622g);
                        this.f25346G = certificatePinnerM28623h.m28370e(certificateChainCleanerM28622g);
                    } else {
                        Platform.Companion companion = Platform.f26006a;
                        X509TrustManager x509TrustManagerMo29360p = companion.m29391g().mo29360p();
                        this.f25342C = x509TrustManagerMo29360p;
                        Platform platformM29391g = companion.m29391g();
                        AbstractC6118n.m27184b(x509TrustManagerMo29360p);
                        this.f25341B = platformM29391g.mo29364o(x509TrustManagerMo29360p);
                        CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.f26050a;
                        AbstractC6118n.m27184b(x509TrustManagerMo29360p);
                        CertificateChainCleaner certificateChainCleanerM29438a = companion2.m29438a(x509TrustManagerMo29360p);
                        this.f25347H = certificateChainCleanerM29438a;
                        CertificatePinner certificatePinnerM28623h2 = builder.m28623h();
                        AbstractC6118n.m27184b(certificateChainCleanerM29438a);
                        this.f25346G = certificatePinnerM28623h2.m28370e(certificateChainCleanerM29438a);
                    }
                }
            }
            this.f25341B = null;
            this.f25347H = null;
            this.f25342C = null;
            this.f25346G = CertificatePinner.f25077d;
        } else {
            this.f25341B = null;
            this.f25347H = null;
            this.f25342C = null;
            this.f25346G = CertificatePinner.f25077d;
        }
        m28575F();
    }

    /* JADX INFO: renamed from: F */
    private final void m28575F() {
        List list = this.f25357c;
        AbstractC6118n.m27185c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f25357c).toString());
        }
        List list2 = this.f25358d;
        AbstractC6118n.m27185c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f25358d).toString());
        }
        List list3 = this.f25343D;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).m28398f()) {
                    if (this.f25341B == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f25347H == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f25342C == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f25341B != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f25347H != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f25342C != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC6118n.m27183a(this.f25346G, CertificatePinner.f25077d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: A */
    public final ProxySelector m28578A() {
        return this.f25368y;
    }

    /* JADX INFO: renamed from: B */
    public final int m28579B() {
        return this.f25350K;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m28580C() {
        return this.f25360f;
    }

    /* JADX INFO: renamed from: D */
    public final SocketFactory m28581D() {
        return this.f25340A;
    }

    /* JADX INFO: renamed from: E */
    public final SSLSocketFactory m28582E() {
        SSLSocketFactory sSLSocketFactory = this.f25341B;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* JADX INFO: renamed from: G */
    public final int m28583G() {
        return this.f25351L;
    }

    /* JADX INFO: renamed from: c */
    public final Authenticator m28584c() {
        return this.f25361r;
    }

    public Object clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: d */
    public final Cache m28585d() {
        return this.f25365v;
    }

    /* JADX INFO: renamed from: e */
    public final int m28586e() {
        return this.f25348I;
    }

    /* JADX INFO: renamed from: f */
    public final CertificatePinner m28587f() {
        return this.f25346G;
    }

    /* JADX INFO: renamed from: g */
    public final int m28588g() {
        return this.f25349J;
    }

    /* JADX INFO: renamed from: h */
    public final ConnectionPool m28589h() {
        return this.f25356b;
    }

    /* JADX INFO: renamed from: i */
    public final List m28590i() {
        return this.f25343D;
    }

    /* JADX INFO: renamed from: j */
    public final CookieJar m28591j() {
        return this.f25364u;
    }

    /* JADX INFO: renamed from: k */
    public final Dispatcher m28592k() {
        return this.f25355a;
    }

    /* JADX INFO: renamed from: l */
    public final Dns m28593l() {
        return this.f25366w;
    }

    /* JADX INFO: renamed from: o */
    public final EventListener.Factory m28594o() {
        return this.f25359e;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m28595p() {
        return this.f25362s;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m28596q() {
        return this.f25363t;
    }

    /* JADX INFO: renamed from: r */
    public final RouteDatabase m28597r() {
        return this.f25354O;
    }

    /* JADX INFO: renamed from: s */
    public final HostnameVerifier m28598s() {
        return this.f25345F;
    }

    /* JADX INFO: renamed from: t */
    public final List m28599t() {
        return this.f25357c;
    }

    /* JADX INFO: renamed from: u */
    public final List m28600u() {
        return this.f25358d;
    }

    /* JADX INFO: renamed from: v */
    public Call m28601v(Request request) {
        AbstractC6118n.m27187e(request, "request");
        return new RealCall(this, request, false);
    }

    /* JADX INFO: renamed from: w */
    public final int m28602w() {
        return this.f25352M;
    }

    /* JADX INFO: renamed from: x */
    public final List m28603x() {
        return this.f25344E;
    }

    /* JADX INFO: renamed from: y */
    public final Proxy m28604y() {
        return this.f25367x;
    }

    /* JADX INFO: renamed from: z */
    public final Authenticator m28605z() {
        return this.f25369z;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
