package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {

    /* JADX INFO: renamed from: c */
    public static final Companion f26047c = new Companion(null);

    /* JADX INFO: renamed from: b */
    private final TrustRootIndex f26048b;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
        AbstractC6118n.m27187e(trustRootIndex, "trustRootIndex");
        this.f26048b = trustRootIndex;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m29437b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!AbstractC6118n.m27183a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    /* JADX INFO: renamed from: a */
    public List mo29400a(List chain, String hostname) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        AbstractC6118n.m27187e(chain, "chain");
        AbstractC6118n.m27187e(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC6118n.m27186d(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z7 = false;
        for (int i7 = 0; i7 < 9; i7++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate2 = (X509Certificate) obj;
            X509Certificate x509CertificateMo29357a = this.f26048b.mo29357a(x509Certificate2);
            if (x509CertificateMo29357a != null) {
                if (arrayList.size() > 1 || !AbstractC6118n.m27183a(x509Certificate2, x509CertificateMo29357a)) {
                    arrayList.add(x509CertificateMo29357a);
                }
                if (m29437b(x509CertificateMo29357a, x509CertificateMo29357a)) {
                    return arrayList;
                }
                z7 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                AbstractC6118n.m27186d(it, "queue.iterator()");
                do {
                    if (!it.hasNext()) {
                        if (!z7) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                        }
                        return arrayList;
                    }
                    Object next = it.next();
                    AbstractC6118n.m27185c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    x509Certificate = (X509Certificate) next;
                } while (!m29437b(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BasicCertificateChainCleaner) && AbstractC6118n.m27183a(((BasicCertificateChainCleaner) obj).f26048b, this.f26048b);
    }

    public int hashCode() {
        return this.f26048b.hashCode();
    }
}
