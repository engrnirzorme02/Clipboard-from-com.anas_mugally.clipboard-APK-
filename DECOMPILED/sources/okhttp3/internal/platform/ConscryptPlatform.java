package okhttp3.internal.platform;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: loaded from: classes.dex */
public final class ConscryptPlatform extends Platform {

    /* JADX INFO: renamed from: e */
    public static final Companion f25988e;

    /* JADX INFO: renamed from: f */
    private static final boolean f25989f;

    /* JADX INFO: renamed from: d */
    private final Provider f25990d;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m29365a(int i7, int i8, int i9) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i7) {
                return version.major() > i7;
            }
            if (version.minor() != i8) {
                return version.minor() > i8;
            }
            return version.patch() >= i9;
        }

        /* JADX INFO: renamed from: b */
        public final ConscryptPlatform m29366b() {
            AbstractC6112h abstractC6112h = null;
            if (m29367c()) {
                return new ConscryptPlatform(abstractC6112h);
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m29367c() {
            return ConscryptPlatform.f25989f;
        }

        private Companion() {
        }
    }

    public static final class DisabledHostnameVerifier implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: a */
        public static final DisabledHostnameVerifier f25991a = new DisabledHostnameVerifier();

        private DisabledHostnameVerifier() {
        }
    }

    static {
        Companion companion = new Companion(null);
        f25988e = companion;
        boolean z7 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && companion.m29365a(2, 1, 0)) {
                z7 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f25989f = z7;
    }

    public /* synthetic */ ConscryptPlatform(AbstractC6112h abstractC6112h) {
        this();
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: e */
    public void mo29345e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        AbstractC6118n.m27187e(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.mo29345e(sslSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) Platform.f26006a.m29389b(protocols).toArray(new String[0]));
        }
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: h */
    public String mo29346h(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.mo29346h(sslSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: n */
    public SSLContext mo29359n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f25990d);
        AbstractC6118n.m27186d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: o */
    public SSLSocketFactory mo29364o(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        AbstractC6118n.m27187e(trustManager, "trustManager");
        SSLContext sSLContextMo29359n = mo29359n();
        sSLContextMo29359n.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo29359n.getSocketFactory();
        AbstractC6118n.m27186d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // okhttp3.internal.platform.Platform
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
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, DisabledHostnameVerifier.f25991a);
                return x509TrustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        AbstractC6118n.m27186d(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    private ConscryptPlatform() {
        Provider providerNewProvider = Conscrypt.newProvider();
        AbstractC6118n.m27186d(providerNewProvider, "newProvider()");
        this.f25990d = providerNewProvider;
    }
}
