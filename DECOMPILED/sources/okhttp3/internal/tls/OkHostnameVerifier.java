package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import p072I6.AbstractC0642D;
import p152T5.AbstractC1638q;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final OkHostnameVerifier f26051a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    /* JADX INFO: renamed from: b */
    private final String m29439b(String str) {
        if (!m29441d(str)) {
            return str;
        }
        Locale US = Locale.US;
        AbstractC6118n.m27186d(US, "US");
        String lowerCase = str.toLowerCase(US);
        AbstractC6118n.m27186d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: c */
    private final List m29440c(X509Certificate x509Certificate, int i7) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return AbstractC1638q.m6765j();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC6118n.m27183a(list.get(0), Integer.valueOf(i7)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return AbstractC1638q.m6765j();
        }
    }

    /* JADX INFO: renamed from: d */
    private final boolean m29441d(String str) {
        return str.length() == ((int) AbstractC0642D.m2961b(str, 0, 0, 3, null));
    }

    /* JADX INFO: renamed from: f */
    private final boolean m29442f(String str, String str2) {
        if (str != null && str.length() != 0 && !AbstractC6406h.m27557K(str, ".", false, 2, null) && !AbstractC6406h.m27563v(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !AbstractC6406h.m27557K(str2, ".", false, 2, null) && !AbstractC6406h.m27563v(str2, "..", false, 2, null)) {
            if (!AbstractC6406h.m27563v(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!AbstractC6406h.m27563v(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String strM29439b = m29439b(str2);
            if (!AbstractC6406h.m27589Q(strM29439b, "*", false, 2, null)) {
                return AbstractC6118n.m27183a(str3, strM29439b);
            }
            if (!AbstractC6406h.m27557K(strM29439b, "*.", false, 2, null) || AbstractC6406h.m27601Z(strM29439b, '*', 1, false, 4, null) != -1 || str3.length() < strM29439b.length() || AbstractC6118n.m27183a("*.", strM29439b)) {
                return false;
            }
            String strSubstring = strM29439b.substring(1);
            AbstractC6118n.m27186d(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!AbstractC6406h.m27563v(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || AbstractC6406h.m27607f0(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m29443g(String str, X509Certificate x509Certificate) {
        String strM29439b = m29439b(str);
        List listM29440c = m29440c(x509Certificate, 2);
        if (listM29440c != null && listM29440c.isEmpty()) {
            return false;
        }
        Iterator it = listM29440c.iterator();
        while (it.hasNext()) {
            if (f26051a.m29442f(strM29439b, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private final boolean m29444h(String str, X509Certificate x509Certificate) {
        String strM28731e = HostnamesKt.m28731e(str);
        List listM29440c = m29440c(x509Certificate, 7);
        if (listM29440c != null && listM29440c.isEmpty()) {
            return false;
        }
        Iterator it = listM29440c.iterator();
        while (it.hasNext()) {
            if (AbstractC6118n.m27183a(strM28731e, HostnamesKt.m28731e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final List m29445a(X509Certificate certificate) {
        AbstractC6118n.m27187e(certificate, "certificate");
        return AbstractC1638q.m6582V(m29440c(certificate, 7), m29440c(certificate, 2));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m29446e(String host, X509Certificate certificate) {
        AbstractC6118n.m27187e(host, "host");
        AbstractC6118n.m27187e(certificate, "certificate");
        return Util.m28769i(host) ? m29444h(host, certificate) : m29443g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        AbstractC6118n.m27187e(host, "host");
        AbstractC6118n.m27187e(session, "session");
        if (!m29441d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            AbstractC6118n.m27185c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m29446e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
