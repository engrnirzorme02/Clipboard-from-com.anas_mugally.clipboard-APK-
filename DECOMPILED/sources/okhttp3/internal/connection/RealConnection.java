package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.p320ws.RealWebSocket;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import p072I6.AbstractC0659p;
import p072I6.C0641C;
import p072I6.InterfaceC0649f;
import p072I6.InterfaceC0650g;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* JADX INFO: renamed from: t */
    public static final Companion f25673t = new Companion(null);

    /* JADX INFO: renamed from: c */
    private final RealConnectionPool f25674c;

    /* JADX INFO: renamed from: d */
    private final Route f25675d;

    /* JADX INFO: renamed from: e */
    private Socket f25676e;

    /* JADX INFO: renamed from: f */
    private Socket f25677f;

    /* JADX INFO: renamed from: g */
    private Handshake f25678g;

    /* JADX INFO: renamed from: h */
    private Protocol f25679h;

    /* JADX INFO: renamed from: i */
    private Http2Connection f25680i;

    /* JADX INFO: renamed from: j */
    private InterfaceC0650g f25681j;

    /* JADX INFO: renamed from: k */
    private InterfaceC0649f f25682k;

    /* JADX INFO: renamed from: l */
    private boolean f25683l;

    /* JADX INFO: renamed from: m */
    private boolean f25684m;

    /* JADX INFO: renamed from: n */
    private int f25685n;

    /* JADX INFO: renamed from: o */
    private int f25686o;

    /* JADX INFO: renamed from: p */
    private int f25687p;

    /* JADX INFO: renamed from: q */
    private int f25688q;

    /* JADX INFO: renamed from: r */
    private final List f25689r;

    /* JADX INFO: renamed from: s */
    private long f25690s;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25691a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25691a = iArr;
        }
    }

    public RealConnection(RealConnectionPool connectionPool, Route route) {
        AbstractC6118n.m27187e(connectionPool, "connectionPool");
        AbstractC6118n.m27187e(route, "route");
        this.f25674c = connectionPool;
        this.f25675d = route;
        this.f25688q = 1;
        this.f25689r = new ArrayList();
        this.f25690s = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: B */
    private final boolean m28985B(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Route route = (Route) it.next();
            Proxy.Type type = route.m28715b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f25675d.m28715b().type() == type2 && AbstractC6118n.m27183a(this.f25675d.m28717d(), route.m28717d())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    private final void m28986F(int i7) throws SocketException {
        Socket socket = this.f25677f;
        AbstractC6118n.m27184b(socket);
        InterfaceC0650g interfaceC0650g = this.f25681j;
        AbstractC6118n.m27184b(interfaceC0650g);
        InterfaceC0649f interfaceC0649f = this.f25682k;
        AbstractC6118n.m27184b(interfaceC0649f);
        socket.setSoTimeout(0);
        Http2Connection http2ConnectionM29203a = new Http2Connection.Builder(true, TaskRunner.f25606i).m29219q(socket, this.f25675d.m28714a().m28311l().m28504h(), interfaceC0650g, interfaceC0649f).m29213k(this).m29214l(i7).m29203a();
        this.f25680i = http2ConnectionM29203a;
        this.f25688q = Http2Connection.f25827N.m29220a().m29329d();
        Http2Connection.m29169w1(http2ConnectionM29203a, false, null, 3, null);
    }

    /* JADX INFO: renamed from: G */
    private final boolean m28987G(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.f25484h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        HttpUrl httpUrlM28311l = this.f25675d.m28714a().m28311l();
        if (httpUrl.m28508l() != httpUrlM28311l.m28508l()) {
            return false;
        }
        if (AbstractC6118n.m27183a(httpUrl.m28504h(), httpUrlM28311l.m28504h())) {
            return true;
        }
        if (!this.f25684m && (handshake = this.f25678g) != null) {
            AbstractC6118n.m27184b(handshake);
            if (m28989e(httpUrl, handshake)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m28989e(HttpUrl httpUrl, Handshake handshake) {
        List listM28469d = handshake.m28469d();
        if (!listM28469d.isEmpty()) {
            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f26051a;
            String strM28504h = httpUrl.m28504h();
            Object obj = listM28469d.get(0);
            AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (okHostnameVerifier.m29446e(strM28504h, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private final void m28990h(int i7, int i8, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyM28715b = this.f25675d.m28715b();
        Address addressM28714a = this.f25675d.m28714a();
        Proxy.Type type = proxyM28715b.type();
        int i9 = type == null ? -1 : WhenMappings.f25691a[type.ordinal()];
        if (i9 == 1 || i9 == 2) {
            socketCreateSocket = addressM28714a.m28309j().createSocket();
            AbstractC6118n.m27184b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyM28715b);
        }
        this.f25676e = socketCreateSocket;
        eventListener.m28445j(call, this.f25675d.m28717d(), proxyM28715b);
        socketCreateSocket.setSoTimeout(i8);
        try {
            Platform.f26006a.m29391g().mo29352f(socketCreateSocket, this.f25675d.m28717d(), i7);
            try {
                this.f25681j = AbstractC0659p.m3132d(AbstractC0659p.m3140l(socketCreateSocket));
                this.f25682k = AbstractC0659p.m3131c(AbstractC0659p.m3136h(socketCreateSocket));
            } catch (NullPointerException e7) {
                if (AbstractC6118n.m27183a(e7.getMessage(), "throw with null exception")) {
                    throw new IOException(e7);
                }
            }
        } catch (ConnectException e8) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f25675d.m28717d());
            connectException.initCause(e8);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    private final void m28991i(ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        Address addressM28714a = this.f25675d.m28714a();
        SSLSocketFactory sSLSocketFactoryM28310k = addressM28714a.m28310k();
        SSLSocket sSLSocket = null;
        try {
            AbstractC6118n.m27184b(sSLSocketFactoryM28310k);
            Socket socketCreateSocket = sSLSocketFactoryM28310k.createSocket(this.f25676e, addressM28714a.m28311l().m28504h(), addressM28714a.m28311l().m28508l(), true);
            AbstractC6118n.m27185c(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecM28922a = connectionSpecSelector.m28922a(sSLSocket2);
                if (connectionSpecM28922a.m28399h()) {
                    Platform.f26006a.m29391g().mo29345e(sSLSocket2, addressM28714a.m28311l().m28504h(), addressM28714a.m28305f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.f25267e;
                AbstractC6118n.m27186d(sslSocketSession, "sslSocketSession");
                Handshake handshakeM28472a = companion.m28472a(sslSocketSession);
                HostnameVerifier hostnameVerifierM28304e = addressM28714a.m28304e();
                AbstractC6118n.m27184b(hostnameVerifierM28304e);
                if (hostnameVerifierM28304e.verify(addressM28714a.m28311l().m28504h(), sslSocketSession)) {
                    CertificatePinner certificatePinnerM28300a = addressM28714a.m28300a();
                    AbstractC6118n.m27184b(certificatePinnerM28300a);
                    this.f25678g = new Handshake(handshakeM28472a.m28470e(), handshakeM28472a.m28467a(), handshakeM28472a.m28468c(), new RealConnection$connectTls$1(certificatePinnerM28300a, handshakeM28472a, addressM28714a));
                    certificatePinnerM28300a.m28367b(addressM28714a.m28311l().m28504h(), new RealConnection$connectTls$2(this));
                    String strMo29346h = connectionSpecM28922a.m28399h() ? Platform.f26006a.m29391g().mo29346h(sSLSocket2) : null;
                    this.f25677f = sSLSocket2;
                    this.f25681j = AbstractC0659p.m3132d(AbstractC0659p.m3140l(sSLSocket2));
                    this.f25682k = AbstractC0659p.m3131c(AbstractC0659p.m3136h(sSLSocket2));
                    this.f25679h = strMo29346h != null ? Protocol.f25402b.m28646a(strMo29346h) : Protocol.HTTP_1_1;
                    Platform.f26006a.m29391g().mo29368b(sSLSocket2);
                    return;
                }
                List listM28469d = handshakeM28472a.m28469d();
                if (listM28469d.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + addressM28714a.m28311l().m28504h() + " not verified (no certificates)");
                }
                Object obj = listM28469d.get(0);
                AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                throw new SSLPeerUnverifiedException(AbstractC6406h.m27542l("\n              |Hostname " + addressM28714a.m28311l().m28504h() + " not verified:\n              |    certificate: " + CertificatePinner.f25076c.m28372a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + OkHostnameVerifier.f26051a.m29445a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.f26006a.m29391g().mo29368b(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.m28774n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m28992j(int i7, int i8, int i9, Call call, EventListener eventListener) throws IOException {
        Request requestM28994l = m28994l();
        HttpUrl httpUrlM28656j = requestM28994l.m28656j();
        for (int i10 = 0; i10 < 21; i10++) {
            m28990h(i7, i8, call, eventListener);
            requestM28994l = m28993k(i8, i9, requestM28994l, httpUrlM28656j);
            if (requestM28994l == null) {
                return;
            }
            Socket socket = this.f25676e;
            if (socket != null) {
                Util.m28774n(socket);
            }
            this.f25676e = null;
            this.f25682k = null;
            this.f25681j = null;
            eventListener.m28443h(call, this.f25675d.m28717d(), this.f25675d.m28715b(), null);
        }
    }

    /* JADX INFO: renamed from: k */
    private final Request m28993k(int i7, int i8, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.m28751T(httpUrl, true) + " HTTP/1.1";
        while (true) {
            InterfaceC0650g interfaceC0650g = this.f25681j;
            AbstractC6118n.m27184b(interfaceC0650g);
            InterfaceC0649f interfaceC0649f = this.f25682k;
            AbstractC6118n.m27184b(interfaceC0649f);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, interfaceC0650g, interfaceC0649f);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            interfaceC0650g.mo2948g().mo2956g(i7, timeUnit);
            interfaceC0649f.mo3005g().mo2956g(i8, timeUnit);
            http1ExchangeCodec.m29107A(request.m28652f(), str);
            http1ExchangeCodec.mo29048a();
            Response.Builder builderMo29051d = http1ExchangeCodec.mo29051d(false);
            AbstractC6118n.m27184b(builderMo29051d);
            Response responseM28694c = builderMo29051d.m28707r(request).m28694c();
            http1ExchangeCodec.m29108z(responseM28694c);
            int iM28672J = responseM28694c.m28672J();
            if (iM28672J == 200) {
                if (interfaceC0650g.mo3043f().mo3009E() && interfaceC0649f.mo3043f().mo3009E()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iM28672J != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + responseM28694c.m28672J());
            }
            Request requestMo28312a = this.f25675d.m28714a().m28307h().mo28312a(this.f25675d, responseM28694c);
            if (requestMo28312a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (AbstractC6406h.m27564w("close", Response.m28671l0(responseM28694c, "Connection", null, 2, null), true)) {
                return requestMo28312a;
            }
            request = requestMo28312a;
        }
    }

    /* JADX INFO: renamed from: l */
    private final Request m28994l() {
        Request requestM28658b = new Request.Builder().m28665i(this.f25675d.m28714a().m28311l()).m28661e("CONNECT", null).m28659c("Host", Util.m28751T(this.f25675d.m28714a().m28311l(), true)).m28659c("Proxy-Connection", "Keep-Alive").m28659c("User-Agent", "okhttp/4.12.0").m28658b();
        Request requestMo28312a = this.f25675d.m28714a().m28307h().mo28312a(this.f25675d, new Response.Builder().m28707r(requestM28658b).m28705p(Protocol.HTTP_1_1).m28696g(407).m28702m("Preemptive Authenticate").m28693b(Util.f25479c).m28708s(-1L).m28706q(-1L).m28699j("Proxy-Authenticate", "OkHttp-Preemptive").m28694c());
        return requestMo28312a == null ? requestM28658b : requestMo28312a;
    }

    /* JADX INFO: renamed from: m */
    private final void m28995m(ConnectionSpecSelector connectionSpecSelector, int i7, Call call, EventListener eventListener) throws Throwable {
        if (this.f25675d.m28714a().m28310k() != null) {
            eventListener.m28435C(call);
            m28991i(connectionSpecSelector);
            eventListener.m28434B(call, this.f25678g);
            if (this.f25679h == Protocol.HTTP_2) {
                m28986F(i7);
                return;
            }
            return;
        }
        List listM28305f = this.f25675d.m28714a().m28305f();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!listM28305f.contains(protocol)) {
            this.f25677f = this.f25676e;
            this.f25679h = Protocol.HTTP_1_1;
        } else {
            this.f25677f = this.f25676e;
            this.f25679h = protocol;
            m28986F(i7);
        }
    }

    /* JADX INFO: renamed from: A */
    public Route m28996A() {
        return this.f25675d;
    }

    /* JADX INFO: renamed from: C */
    public final void m28997C(long j7) {
        this.f25690s = j7;
    }

    /* JADX INFO: renamed from: D */
    public final void m28998D(boolean z7) {
        this.f25683l = z7;
    }

    /* JADX INFO: renamed from: E */
    public Socket m28999E() {
        Socket socket = this.f25677f;
        AbstractC6118n.m27184b(socket);
        return socket;
    }

    /* JADX INFO: renamed from: H */
    public final synchronized void m29000H(RealCall call, IOException iOException) {
        try {
            AbstractC6118n.m27187e(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).f25974a == ErrorCode.REFUSED_STREAM) {
                    int i7 = this.f25687p + 1;
                    this.f25687p = i7;
                    if (i7 > 1) {
                        this.f25683l = true;
                        this.f25685n++;
                    }
                } else if (((StreamResetException) iOException).f25974a != ErrorCode.CANCEL || !call.m28974r()) {
                    this.f25683l = true;
                    this.f25685n++;
                }
            } else if (!m29014v() || (iOException instanceof ConnectionShutdownException)) {
                this.f25683l = true;
                if (this.f25686o == 0) {
                    if (iOException != null) {
                        m29005g(call.m28968j(), this.f25675d, iOException);
                    }
                    this.f25685n++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    /* JADX INFO: renamed from: a */
    public synchronized void mo29001a(Http2Connection connection, Settings settings) {
        AbstractC6118n.m27187e(connection, "connection");
        AbstractC6118n.m27187e(settings, "settings");
        this.f25688q = settings.m29329d();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    /* JADX INFO: renamed from: b */
    public void mo29002b(Http2Stream stream) {
        AbstractC6118n.m27187e(stream, "stream");
        stream.m29269d(ErrorCode.REFUSED_STREAM, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m29003d() {
        Socket socket = this.f25676e;
        if (socket != null) {
            Util.m28774n(socket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139 A[LOOP:0: B:69:0x0092->B:61:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x013f A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final void m29004f(int i7, int i8, int i9, int i10, boolean z7, Call call, EventListener eventListener) throws Throwable {
        IOException iOException;
        Socket socket;
        Socket socket2;
        Call call2 = call;
        EventListener eventListener2 = eventListener;
        AbstractC6118n.m27187e(call2, "call");
        AbstractC6118n.m27187e(eventListener2, "eventListener");
        if (this.f25679h != null) {
            throw new IllegalStateException("already connected");
        }
        List listM28301b = this.f25675d.m28714a().m28301b();
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(listM28301b);
        if (this.f25675d.m28714a().m28310k() == null) {
            if (!listM28301b.contains(ConnectionSpec.f25219k)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strM28504h = this.f25675d.m28714a().m28311l().m28504h();
            if (!Platform.f26006a.m29391g().mo29347j(strM28504h)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication to " + strM28504h + " not permitted by network security policy"));
            }
        } else if (this.f25675d.m28714a().m28305f().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                if (this.f25675d.m28716c()) {
                    EventListener eventListener3 = eventListener2;
                    Call call3 = call2;
                    try {
                        m28992j(i7, i8, i9, call3, eventListener3);
                        call2 = call3;
                        eventListener2 = eventListener3;
                        try {
                            if (this.f25676e != null) {
                                break;
                            } else {
                                break;
                            }
                        } catch (IOException e7) {
                            e = e7;
                            iOException = e;
                            socket = this.f25677f;
                            if (socket != null) {
                                Util.m28774n(socket);
                            }
                            socket2 = this.f25676e;
                            if (socket2 != null) {
                                Util.m28774n(socket2);
                            }
                            this.f25677f = null;
                            this.f25676e = null;
                            this.f25681j = null;
                            this.f25682k = null;
                            this.f25678g = null;
                            this.f25679h = null;
                            this.f25680i = null;
                            this.f25688q = 1;
                            eventListener2.m28444i(call2, this.f25675d.m28717d(), this.f25675d.m28715b(), null, iOException);
                            if (routeException == null) {
                                routeException = new RouteException(iOException);
                            } else {
                                routeException.m29029a(iOException);
                            }
                            if (z7) {
                                throw routeException;
                            }
                            if (connectionSpecSelector.m28923b(iOException)) {
                                throw routeException;
                            }
                            call2 = call;
                            eventListener2 = eventListener;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        call2 = call3;
                        eventListener2 = eventListener3;
                    }
                } else {
                    m28990h(i7, i8, call2, eventListener2);
                }
                try {
                    m28995m(connectionSpecSelector, i10, call2, eventListener2);
                    eventListener2.m28443h(call2, this.f25675d.m28717d(), this.f25675d.m28715b(), this.f25679h);
                    break;
                } catch (IOException e9) {
                    e = e9;
                    iOException = e;
                    socket = this.f25677f;
                    if (socket != null) {
                        Util.m28774n(socket);
                    }
                    socket2 = this.f25676e;
                    if (socket2 != null) {
                        Util.m28774n(socket2);
                    }
                    this.f25677f = null;
                    this.f25676e = null;
                    this.f25681j = null;
                    this.f25682k = null;
                    this.f25678g = null;
                    this.f25679h = null;
                    this.f25680i = null;
                    this.f25688q = 1;
                    eventListener2.m28444i(call2, this.f25675d.m28717d(), this.f25675d.m28715b(), null, iOException);
                    if (routeException == null) {
                        routeException = new RouteException(iOException);
                    } else {
                        routeException.m29029a(iOException);
                    }
                    if (z7) {
                        throw routeException;
                    }
                    if (connectionSpecSelector.m28923b(iOException)) {
                        throw routeException;
                    }
                    call2 = call;
                    eventListener2 = eventListener;
                }
            } catch (IOException e10) {
                e = e10;
            }
            call2 = call;
            eventListener2 = eventListener;
        }
        if (this.f25675d.m28716c() && this.f25676e == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f25690s = System.nanoTime();
    }

    /* JADX INFO: renamed from: g */
    public final void m29005g(OkHttpClient client, Route failedRoute, IOException failure) {
        AbstractC6118n.m27187e(client, "client");
        AbstractC6118n.m27187e(failedRoute, "failedRoute");
        AbstractC6118n.m27187e(failure, "failure");
        if (failedRoute.m28715b().type() != Proxy.Type.DIRECT) {
            Address addressM28714a = failedRoute.m28714a();
            addressM28714a.m28308i().connectFailed(addressM28714a.m28311l().m28513q(), failedRoute.m28715b().address(), failure);
        }
        client.m28597r().m29027b(failedRoute);
    }

    /* JADX INFO: renamed from: n */
    public final List m29006n() {
        return this.f25689r;
    }

    /* JADX INFO: renamed from: o */
    public final long m29007o() {
        return this.f25690s;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m29008p() {
        return this.f25683l;
    }

    /* JADX INFO: renamed from: q */
    public final int m29009q() {
        return this.f25685n;
    }

    /* JADX INFO: renamed from: r */
    public Handshake m29010r() {
        return this.f25678g;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized void m29011s() {
        this.f25686o++;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m29012t(Address address, List list) {
        AbstractC6118n.m27187e(address, "address");
        if (Util.f25484h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f25689r.size() >= this.f25688q || this.f25683l || !this.f25675d.m28714a().m28303d(address)) {
            return false;
        }
        if (AbstractC6118n.m27183a(address.m28311l().m28504h(), m28996A().m28714a().m28311l().m28504h())) {
            return true;
        }
        if (this.f25680i == null || list == null || !m28985B(list) || address.m28304e() != OkHostnameVerifier.f26051a || !m28987G(address.m28311l())) {
            return false;
        }
        try {
            CertificatePinner certificatePinnerM28300a = address.m28300a();
            AbstractC6118n.m27184b(certificatePinnerM28300a);
            String strM28504h = address.m28311l().m28504h();
            Handshake handshakeM29010r = m29010r();
            AbstractC6118n.m27184b(handshakeM29010r);
            certificatePinnerM28300a.m28366a(strM28504h, handshakeM29010r.m28469d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        Object objM28467a;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f25675d.m28714a().m28311l().m28504h());
        sb.append(':');
        sb.append(this.f25675d.m28714a().m28311l().m28508l());
        sb.append(", proxy=");
        sb.append(this.f25675d.m28715b());
        sb.append(" hostAddress=");
        sb.append(this.f25675d.m28717d());
        sb.append(" cipherSuite=");
        Handshake handshake = this.f25678g;
        if (handshake == null || (objM28467a = handshake.m28467a()) == null) {
            objM28467a = "none";
        }
        sb.append(objM28467a);
        sb.append(" protocol=");
        sb.append(this.f25679h);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m29013u(boolean z7) {
        long j7;
        if (Util.f25484h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f25676e;
        AbstractC6118n.m27184b(socket);
        Socket socket2 = this.f25677f;
        AbstractC6118n.m27184b(socket2);
        InterfaceC0650g interfaceC0650g = this.f25681j;
        AbstractC6118n.m27184b(interfaceC0650g);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f25680i;
        if (http2Connection != null) {
            return http2Connection.m29187i1(jNanoTime);
        }
        synchronized (this) {
            j7 = jNanoTime - this.f25690s;
        }
        if (j7 < 10000000000L || !z7) {
            return true;
        }
        return Util.m28738G(socket2, interfaceC0650g);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m29014v() {
        return this.f25680i != null;
    }

    /* JADX INFO: renamed from: w */
    public final ExchangeCodec m29015w(OkHttpClient client, RealInterceptorChain chain) throws SocketException {
        AbstractC6118n.m27187e(client, "client");
        AbstractC6118n.m27187e(chain, "chain");
        Socket socket = this.f25677f;
        AbstractC6118n.m27184b(socket);
        InterfaceC0650g interfaceC0650g = this.f25681j;
        AbstractC6118n.m27184b(interfaceC0650g);
        InterfaceC0649f interfaceC0649f = this.f25682k;
        AbstractC6118n.m27184b(interfaceC0649f);
        Http2Connection http2Connection = this.f25680i;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        socket.setSoTimeout(chain.m29077k());
        C0641C c0641cMo2948g = interfaceC0650g.mo2948g();
        long jM29074h = chain.m29074h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0641cMo2948g.mo2956g(jM29074h, timeUnit);
        interfaceC0649f.mo3005g().mo2956g(chain.m29076j(), timeUnit);
        return new Http1ExchangeCodec(client, this, interfaceC0650g, interfaceC0649f);
    }

    /* JADX INFO: renamed from: x */
    public final RealWebSocket.Streams m29016x(final Exchange exchange) throws SocketException {
        AbstractC6118n.m27187e(exchange, "exchange");
        Socket socket = this.f25677f;
        AbstractC6118n.m27184b(socket);
        final InterfaceC0650g interfaceC0650g = this.f25681j;
        AbstractC6118n.m27184b(interfaceC0650g);
        final InterfaceC0649f interfaceC0649f = this.f25682k;
        AbstractC6118n.m27184b(interfaceC0649f);
        socket.setSoTimeout(0);
        m29018z();
        return new RealWebSocket.Streams(interfaceC0650g, interfaceC0649f) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                exchange.m28925a(-1L, true, true, null);
            }
        };
    }

    /* JADX INFO: renamed from: y */
    public final synchronized void m29017y() {
        this.f25684m = true;
    }

    /* JADX INFO: renamed from: z */
    public final synchronized void m29018z() {
        this.f25683l = true;
    }
}
