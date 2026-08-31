package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

    /* JADX INFO: renamed from: d */
    public static final Companion f26010d = new Companion(null);

    /* JADX INFO: renamed from: b */
    private final X509TrustManager f26011b;

    /* JADX INFO: renamed from: c */
    private final X509TrustManagerExtensions f26012c;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AndroidCertificateChainCleaner m29401a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            AbstractC6118n.m27187e(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new AndroidCertificateChainCleaner(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        private Companion() {
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        AbstractC6118n.m27187e(trustManager, "trustManager");
        AbstractC6118n.m27187e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f26011b = trustManager;
        this.f26012c = x509TrustManagerExtensions;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    /* JADX INFO: renamed from: a */
    public List mo29400a(List chain, String hostname) throws SSLPeerUnverifiedException {
        AbstractC6118n.m27187e(chain, "chain");
        AbstractC6118n.m27187e(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f26012c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            AbstractC6118n.m27186d(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e7) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e7.getMessage());
            sSLPeerUnverifiedException.initCause(e7);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof AndroidCertificateChainCleaner) && ((AndroidCertificateChainCleaner) obj).f26011b == this.f26011b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f26011b);
    }
}
