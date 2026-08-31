package p087K5;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: K5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0757f implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C0757f f3057a = new C0757f();

    /* JADX INFO: renamed from: b */
    private static final Pattern f3058b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private C0757f() {
    }

    /* JADX INFO: renamed from: a */
    private static List m3559a(X509Certificate x509Certificate, int i7) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i7 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: c */
    static boolean m3560c(String str) {
        return f3058b.matcher(str).matches();
    }

    /* JADX INFO: renamed from: d */
    private boolean m3561d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private boolean m3562e(String str, X509Certificate x509Certificate) {
        String strM3549b;
        String lowerCase = str.toLowerCase(Locale.US);
        List listM3559a = m3559a(x509Certificate, 2);
        int size = listM3559a.size();
        int i7 = 0;
        boolean z7 = false;
        while (i7 < size) {
            if (m3561d(lowerCase, (String) listM3559a.get(i7))) {
                return true;
            }
            i7++;
            z7 = true;
        }
        if (z7 || (strM3549b = new C0755d(x509Certificate.getSubjectX500Principal()).m3549b("cn")) == null) {
            return false;
        }
        return m3561d(lowerCase, strM3549b);
    }

    /* JADX INFO: renamed from: f */
    private boolean m3563f(String str, X509Certificate x509Certificate) {
        List listM3559a = m3559a(x509Certificate, 7);
        int size = listM3559a.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (str.equalsIgnoreCase((String) listM3559a.get(i7))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean m3564b(String str, X509Certificate x509Certificate) {
        return m3560c(str) ? m3563f(str, x509Certificate) : m3562e(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m3564b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
