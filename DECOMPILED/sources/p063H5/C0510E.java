package p063H5;

import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0510E {

    /* JADX INFO: renamed from: f */
    private static final Logger f1903f = Logger.getLogger(C0510E.class.getName());

    /* JADX INFO: renamed from: g */
    private static final C0510E f1904g = new C0510E();

    /* JADX INFO: renamed from: a */
    private final ConcurrentNavigableMap f1905a = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: b */
    private final ConcurrentNavigableMap f1906b = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: c */
    private final ConcurrentMap f1907c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    private final ConcurrentMap f1908d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    private final ConcurrentMap f1909e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: H5.E$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final c f1910a;

        public b(c cVar) {
            this.f1910a = (c) AbstractC1209m.m5302n(cVar);
        }
    }

    /* JADX INFO: renamed from: H5.E$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final String f1911a;

        /* JADX INFO: renamed from: b */
        public final Certificate f1912b;

        /* JADX INFO: renamed from: c */
        public final Certificate f1913c;

        public c(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e7) {
                C0510E.f1903f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e7);
            }
            this.f1911a = cipherSuite;
            this.f1912b = certificate2;
            this.f1913c = certificate;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m2136b(Map map, InterfaceC0515J interfaceC0515J) {
    }

    /* JADX INFO: renamed from: f */
    public static long m2137f(InterfaceC0521P interfaceC0521P) {
        return interfaceC0521P.mo2172g().m2164d();
    }

    /* JADX INFO: renamed from: g */
    public static C0510E m2138g() {
        return f1904g;
    }

    /* JADX INFO: renamed from: h */
    private static void m2139h(Map map, InterfaceC0515J interfaceC0515J) {
    }

    /* JADX INFO: renamed from: c */
    public void m2140c(InterfaceC0515J interfaceC0515J) {
        m2136b(this.f1908d, interfaceC0515J);
    }

    /* JADX INFO: renamed from: d */
    public void m2141d(InterfaceC0515J interfaceC0515J) {
        m2136b(this.f1906b, interfaceC0515J);
    }

    /* JADX INFO: renamed from: e */
    public void m2142e(InterfaceC0515J interfaceC0515J) {
        m2136b(this.f1907c, interfaceC0515J);
    }

    /* JADX INFO: renamed from: i */
    public void m2143i(InterfaceC0515J interfaceC0515J) {
        m2139h(this.f1908d, interfaceC0515J);
    }

    /* JADX INFO: renamed from: j */
    public void m2144j(InterfaceC0515J interfaceC0515J) {
        m2139h(this.f1906b, interfaceC0515J);
    }

    /* JADX INFO: renamed from: k */
    public void m2145k(InterfaceC0515J interfaceC0515J) {
        m2139h(this.f1907c, interfaceC0515J);
    }
}
