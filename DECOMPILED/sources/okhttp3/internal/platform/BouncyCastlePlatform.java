package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: loaded from: classes.dex */
public final class BouncyCastlePlatform extends Platform {

    /* JADX INFO: renamed from: e */
    public static final Companion f25985e;

    /* JADX INFO: renamed from: f */
    private static final boolean f25986f;

    /* JADX INFO: renamed from: d */
    private final Provider f25987d;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final BouncyCastlePlatform m29361a() {
            AbstractC6112h abstractC6112h = null;
            if (m29362b()) {
                return new BouncyCastlePlatform(abstractC6112h);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m29362b() {
            return BouncyCastlePlatform.f25986f;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        f25985e = companion;
        boolean z7 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, companion.getClass().getClassLoader());
            z7 = true;
        } catch (ClassNotFoundException unused) {
        }
        f25986f = z7;
    }

    public /* synthetic */ BouncyCastlePlatform(AbstractC6112h abstractC6112h) {
        this();
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: e */
    public void mo29345e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        AbstractC6118n.m27187e(protocols, "protocols");
        super.mo29345e(sslSocket, str, protocols);
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: h */
    public String mo29346h(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        return super.mo29346h(sslSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: n */
    public SSLContext mo29359n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f25987d);
        AbstractC6118n.m27186d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: p */
    public X509TrustManager mo29360p() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    private BouncyCastlePlatform() {
        this.f25987d = new BouncyCastleJsseProvider();
    }
}
