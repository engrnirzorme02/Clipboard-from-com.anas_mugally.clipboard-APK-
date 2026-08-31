package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC6104G;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.tls.CertificateChainCleaner;
import p072I6.C0651h;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5356a;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class CertificatePinner {

    /* JADX INFO: renamed from: c */
    public static final Companion f25076c = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final CertificatePinner f25077d = new Builder().m28371a();

    /* JADX INFO: renamed from: a */
    private final Set f25078a;

    /* JADX INFO: renamed from: b */
    private final CertificateChainCleaner f25079b;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final List f25080a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final CertificatePinner m28371a() {
            return new CertificatePinner(AbstractC1638q.m6598l0(this.f25080a), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m28372a(Certificate certificate) {
            AbstractC6118n.m27187e(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + m28374c((X509Certificate) certificate).mo3096c();
        }

        /* JADX INFO: renamed from: b */
        public final C0651h m28373b(X509Certificate x509Certificate) {
            AbstractC6118n.m27187e(x509Certificate, "<this>");
            C0651h.a aVar = C0651h.f2562d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            AbstractC6118n.m27186d(encoded, "publicKey.encoded");
            return C0651h.a.m3110g(aVar, encoded, 0, 0, 3, null).m3088C();
        }

        /* JADX INFO: renamed from: c */
        public final C0651h m28374c(X509Certificate x509Certificate) {
            AbstractC6118n.m27187e(x509Certificate, "<this>");
            C0651h.a aVar = C0651h.f2562d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            AbstractC6118n.m27186d(encoded, "publicKey.encoded");
            return C0651h.a.m3110g(aVar, encoded, 0, 0, 3, null).m3089D();
        }

        private Companion() {
        }
    }

    public static final class Pin {

        /* JADX INFO: renamed from: a */
        private final String f25081a;

        /* JADX INFO: renamed from: b */
        private final String f25082b;

        /* JADX INFO: renamed from: c */
        private final C0651h f25083c;

        /* JADX INFO: renamed from: a */
        public final C0651h m28375a() {
            return this.f25083c;
        }

        /* JADX INFO: renamed from: b */
        public final String m28376b() {
            return this.f25082b;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m28377c(String hostname) {
            AbstractC6118n.m27187e(hostname, "hostname");
            if (AbstractC6406h.m27557K(this.f25081a, "**.", false, 2, null)) {
                int length = this.f25081a.length() - 3;
                int length2 = hostname.length() - length;
                return AbstractC6406h.m27567z(hostname, hostname.length() - length, this.f25081a, 3, length, false, 16, null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!AbstractC6406h.m27557K(this.f25081a, "*.", false, 2, null)) {
                return AbstractC6118n.m27183a(hostname, this.f25081a);
            }
            int length3 = this.f25081a.length() - 1;
            return AbstractC6406h.m27567z(hostname, hostname.length() - length3, this.f25081a, 1, length3, false, 16, null) && AbstractC6406h.m27607f0(hostname, '.', (hostname.length() - length3) + (-1), false, 4, null) == -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return AbstractC6118n.m27183a(this.f25081a, pin.f25081a) && AbstractC6118n.m27183a(this.f25082b, pin.f25082b) && AbstractC6118n.m27183a(this.f25083c, pin.f25083c);
        }

        public int hashCode() {
            return (((this.f25081a.hashCode() * 31) + this.f25082b.hashCode()) * 31) + this.f25083c.hashCode();
        }

        public String toString() {
            return this.f25082b + '/' + this.f25083c.mo3096c();
        }
    }

    public CertificatePinner(Set pins, CertificateChainCleaner certificateChainCleaner) {
        AbstractC6118n.m27187e(pins, "pins");
        this.f25078a = pins;
        this.f25079b = certificateChainCleaner;
    }

    /* JADX INFO: renamed from: a */
    public final void m28366a(String hostname, List peerCertificates) {
        AbstractC6118n.m27187e(hostname, "hostname");
        AbstractC6118n.m27187e(peerCertificates, "peerCertificates");
        m28367b(hostname, new CertificatePinner$check$1(this, peerCertificates, hostname));
    }

    /* JADX INFO: renamed from: b */
    public final void m28367b(String hostname, InterfaceC5356a cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        AbstractC6118n.m27187e(hostname, "hostname");
        AbstractC6118n.m27187e(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> listM28368c = m28368c(hostname);
        if (listM28368c.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            C0651h c0651hM28374c = null;
            C0651h c0651hM28373b = null;
            for (Pin pin : listM28368c) {
                String strM28376b = pin.m28376b();
                if (AbstractC6118n.m27183a(strM28376b, "sha256")) {
                    if (c0651hM28374c == null) {
                        c0651hM28374c = f25076c.m28374c(x509Certificate);
                    }
                    if (AbstractC6118n.m27183a(pin.m28375a(), c0651hM28374c)) {
                        return;
                    }
                } else {
                    if (!AbstractC6118n.m27183a(strM28376b, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.m28376b());
                    }
                    if (c0651hM28373b == null) {
                        c0651hM28373b = f25076c.m28373b(x509Certificate);
                    }
                    if (AbstractC6118n.m27183a(pin.m28375a(), c0651hM28373b)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f25076c.m28372a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        for (Pin pin2 : listM28368c) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    /* JADX INFO: renamed from: c */
    public final List m28368c(String hostname) {
        AbstractC6118n.m27187e(hostname, "hostname");
        Set set = this.f25078a;
        List listJ = AbstractC1638q.m6765j();
        for (Object obj : set) {
            if (((Pin) obj).m28377c(hostname)) {
                if (listJ.isEmpty()) {
                    listJ = new ArrayList();
                }
                AbstractC6118n.m27185c(listJ, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                AbstractC6104G.m27159b(listJ).add(obj);
            }
        }
        return listJ;
    }

    /* JADX INFO: renamed from: d */
    public final CertificateChainCleaner m28369d() {
        return this.f25079b;
    }

    /* JADX INFO: renamed from: e */
    public final CertificatePinner m28370e(CertificateChainCleaner certificateChainCleaner) {
        AbstractC6118n.m27187e(certificateChainCleaner, "certificateChainCleaner");
        return AbstractC6118n.m27183a(this.f25079b, certificateChainCleaner) ? this : new CertificatePinner(this.f25078a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return AbstractC6118n.m27183a(certificatePinner.f25078a, this.f25078a) && AbstractC6118n.m27183a(certificatePinner.f25079b, this.f25079b);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f25078a.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f25079b;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i7, AbstractC6112h abstractC6112h) {
        this(set, (i7 & 2) != 0 ? null : certificateChainCleaner);
    }
}
