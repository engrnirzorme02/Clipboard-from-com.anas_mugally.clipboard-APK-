package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import p072I6.C0648e;
import p152T5.AbstractC1638q;

/* JADX INFO: loaded from: classes.dex */
public class Platform {

    /* JADX INFO: renamed from: a */
    public static final Companion f26006a;

    /* JADX INFO: renamed from: b */
    private static volatile Platform f26007b;

    /* JADX INFO: renamed from: c */
    private static final Logger f26008c;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: d */
        private final Platform m29383d() {
            AndroidLog.f26013a.m29405b();
            Platform platformM29348a = Android10Platform.f25976e.m29348a();
            if (platformM29348a != null) {
                return platformM29348a;
            }
            Platform platformM29355a = AndroidPlatform.f25979f.m29355a();
            AbstractC6118n.m27184b(platformM29355a);
            return platformM29355a;
        }

        /* JADX INFO: renamed from: e */
        private final Platform m29384e() {
            OpenJSSEPlatform openJSSEPlatformM29376a;
            BouncyCastlePlatform bouncyCastlePlatformM29361a;
            ConscryptPlatform conscryptPlatformM29366b;
            if (m29387j() && (conscryptPlatformM29366b = ConscryptPlatform.f25988e.m29366b()) != null) {
                return conscryptPlatformM29366b;
            }
            if (m29386i() && (bouncyCastlePlatformM29361a = BouncyCastlePlatform.f25985e.m29361a()) != null) {
                return bouncyCastlePlatformM29361a;
            }
            if (m29388k() && (openJSSEPlatformM29376a = OpenJSSEPlatform.f26003e.m29376a()) != null) {
                return openJSSEPlatformM29376a;
            }
            Jdk9Platform jdk9PlatformM29373a = Jdk9Platform.f26001d.m29373a();
            if (jdk9PlatformM29373a != null) {
                return jdk9PlatformM29373a;
            }
            Platform platformM29371a = Jdk8WithJettyBootPlatform.f25992i.m29371a();
            return platformM29371a != null ? platformM29371a : new Platform();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public final Platform m29385f() {
            return m29392h() ? m29383d() : m29384e();
        }

        /* JADX INFO: renamed from: i */
        private final boolean m29386i() {
            return AbstractC6118n.m27183a("BC", Security.getProviders()[0].getName());
        }

        /* JADX INFO: renamed from: j */
        private final boolean m29387j() {
            return AbstractC6118n.m27183a("Conscrypt", Security.getProviders()[0].getName());
        }

        /* JADX INFO: renamed from: k */
        private final boolean m29388k() {
            return AbstractC6118n.m27183a("OpenJSSE", Security.getProviders()[0].getName());
        }

        /* JADX INFO: renamed from: b */
        public final List m29389b(List protocols) {
            AbstractC6118n.m27187e(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1638q.m6774s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        /* JADX INFO: renamed from: c */
        public final byte[] m29390c(List protocols) {
            AbstractC6118n.m27187e(protocols, "protocols");
            C0648e c0648e = new C0648e();
            for (String str : m29389b(protocols)) {
                c0648e.mo3010F(str.length());
                c0648e.mo3031X(str);
            }
            return c0648e.m3033Z0();
        }

        /* JADX INFO: renamed from: g */
        public final Platform m29391g() {
            return Platform.f26007b;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m29392h() {
            return AbstractC6118n.m27183a("Dalvik", System.getProperty("java.vm.name"));
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        f26006a = companion;
        f26007b = companion.m29385f();
        f26008c = Logger.getLogger(OkHttpClient.class.getName());
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m29379l(Platform platform, String str, int i7, Throwable th, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i8 & 2) != 0) {
            i7 = 4;
        }
        if ((i8 & 4) != 0) {
            th = null;
        }
        platform.m29381k(str, i7, th);
    }

    /* JADX INFO: renamed from: b */
    public void mo29368b(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
    }

    /* JADX INFO: renamed from: c */
    public CertificateChainCleaner mo29344c(X509TrustManager trustManager) {
        AbstractC6118n.m27187e(trustManager, "trustManager");
        return new BasicCertificateChainCleaner(mo29351d(trustManager));
    }

    /* JADX INFO: renamed from: d */
    public TrustRootIndex mo29351d(X509TrustManager trustManager) {
        AbstractC6118n.m27187e(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        AbstractC6118n.m27186d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* JADX INFO: renamed from: e */
    public void mo29345e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        AbstractC6118n.m27187e(protocols, "protocols");
    }

    /* JADX INFO: renamed from: f */
    public void mo29352f(Socket socket, InetSocketAddress address, int i7) throws IOException {
        AbstractC6118n.m27187e(socket, "socket");
        AbstractC6118n.m27187e(address, "address");
        socket.connect(address, i7);
    }

    /* JADX INFO: renamed from: g */
    public final String m29380g() {
        return "OkHttp";
    }

    /* JADX INFO: renamed from: h */
    public String mo29346h(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public Object mo29353i(String closer) {
        AbstractC6118n.m27187e(closer, "closer");
        if (f26008c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo29347j(String hostname) {
        AbstractC6118n.m27187e(hostname, "hostname");
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m29381k(String message, int i7, Throwable th) {
        AbstractC6118n.m27187e(message, "message");
        f26008c.log(i7 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* JADX INFO: renamed from: m */
    public void mo29354m(String message, Object obj) {
        AbstractC6118n.m27187e(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m29381k(message, 5, (Throwable) obj);
    }

    /* JADX INFO: renamed from: n */
    public SSLContext mo29359n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC6118n.m27186d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* JADX INFO: renamed from: o */
    public SSLSocketFactory mo29364o(X509TrustManager trustManager) {
        AbstractC6118n.m27187e(trustManager, "trustManager");
        try {
            SSLContext sSLContextMo29359n = mo29359n();
            sSLContextMo29359n.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo29359n.getSocketFactory();
            AbstractC6118n.m27186d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e7) {
            throw new AssertionError("No System TLS: " + e7, e7);
        }
    }

    /* JADX INFO: renamed from: p */
    public X509TrustManager mo29360p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC6118n.m27184b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC6118n.m27185c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        AbstractC6118n.m27186d(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        AbstractC6118n.m27186d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
