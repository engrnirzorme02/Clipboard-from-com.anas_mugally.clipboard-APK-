package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p145S5.AbstractC1430h;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5356a;

/* JADX INFO: loaded from: classes.dex */
public final class Handshake {

    /* JADX INFO: renamed from: e */
    public static final Companion f25267e = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final TlsVersion f25268a;

    /* JADX INFO: renamed from: b */
    private final CipherSuite f25269b;

    /* JADX INFO: renamed from: c */
    private final List f25270c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1429g f25271d;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: c */
        private final List m28471c(Certificate[] certificateArr) {
            return certificateArr != null ? Util.m28783w(Arrays.copyOf(certificateArr, certificateArr.length)) : AbstractC1638q.m6765j();
        }

        /* JADX INFO: renamed from: a */
        public final Handshake m28472a(SSLSession sSLSession) throws IOException {
            List listJ;
            AbstractC6118n.m27187e(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (AbstractC6118n.m27183a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : AbstractC6118n.m27183a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            CipherSuite cipherSuiteM28388b = CipherSuite.f25143b.m28388b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (AbstractC6118n.m27183a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionM28720a = TlsVersion.f25469b.m28720a(protocol);
            try {
                listJ = m28471c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listJ = AbstractC1638q.m6765j();
            }
            return new Handshake(tlsVersionM28720a, cipherSuiteM28388b, m28471c(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(listJ));
        }

        /* JADX INFO: renamed from: b */
        public final Handshake m28473b(TlsVersion tlsVersion, CipherSuite cipherSuite, List peerCertificates, List localCertificates) {
            AbstractC6118n.m27187e(tlsVersion, "tlsVersion");
            AbstractC6118n.m27187e(cipherSuite, "cipherSuite");
            AbstractC6118n.m27187e(peerCertificates, "peerCertificates");
            AbstractC6118n.m27187e(localCertificates, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.m28753V(localCertificates), new Handshake$Companion$get$1(Util.m28753V(peerCertificates)));
        }

        private Companion() {
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List localCertificates, InterfaceC5356a peerCertificatesFn) {
        AbstractC6118n.m27187e(tlsVersion, "tlsVersion");
        AbstractC6118n.m27187e(cipherSuite, "cipherSuite");
        AbstractC6118n.m27187e(localCertificates, "localCertificates");
        AbstractC6118n.m27187e(peerCertificatesFn, "peerCertificatesFn");
        this.f25268a = tlsVersion;
        this.f25269b = cipherSuite;
        this.f25270c = localCertificates;
        this.f25271d = AbstractC1430h.m6066b(new Handshake$peerCertificates$2(peerCertificatesFn));
    }

    /* JADX INFO: renamed from: b */
    private final String m28466b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        AbstractC6118n.m27186d(type, "type");
        return type;
    }

    /* JADX INFO: renamed from: a */
    public final CipherSuite m28467a() {
        return this.f25269b;
    }

    /* JADX INFO: renamed from: c */
    public final List m28468c() {
        return this.f25270c;
    }

    /* JADX INFO: renamed from: d */
    public final List m28469d() {
        return (List) this.f25271d.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final TlsVersion m28470e() {
        return this.f25268a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.f25268a == this.f25268a && AbstractC6118n.m27183a(handshake.f25269b, this.f25269b) && AbstractC6118n.m27183a(handshake.m28469d(), m28469d()) && AbstractC6118n.m27183a(handshake.f25270c, this.f25270c);
    }

    public int hashCode() {
        return ((((((527 + this.f25268a.hashCode()) * 31) + this.f25269b.hashCode()) * 31) + m28469d().hashCode()) * 31) + this.f25270c.hashCode();
    }

    public String toString() {
        List listM28469d = m28469d();
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(listM28469d, 10));
        Iterator it = listM28469d.iterator();
        while (it.hasNext()) {
            arrayList.add(m28466b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f25268a);
        sb.append(" cipherSuite=");
        sb.append(this.f25269b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List list = this.f25270c;
        ArrayList arrayList2 = new ArrayList(AbstractC1638q.m6774s(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m28466b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
