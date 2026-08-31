package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p152T5.AbstractC1638q;
import p166V5.AbstractC1792a;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionSpec {

    /* JADX INFO: renamed from: e */
    public static final Companion f25213e = new Companion(null);

    /* JADX INFO: renamed from: f */
    private static final CipherSuite[] f25214f;

    /* JADX INFO: renamed from: g */
    private static final CipherSuite[] f25215g;

    /* JADX INFO: renamed from: h */
    public static final ConnectionSpec f25216h;

    /* JADX INFO: renamed from: i */
    public static final ConnectionSpec f25217i;

    /* JADX INFO: renamed from: j */
    public static final ConnectionSpec f25218j;

    /* JADX INFO: renamed from: k */
    public static final ConnectionSpec f25219k;

    /* JADX INFO: renamed from: a */
    private final boolean f25220a;

    /* JADX INFO: renamed from: b */
    private final boolean f25221b;

    /* JADX INFO: renamed from: c */
    private final String[] f25222c;

    /* JADX INFO: renamed from: d */
    private final String[] f25223d;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.f25184o1;
        CipherSuite cipherSuite2 = CipherSuite.f25187p1;
        CipherSuite cipherSuite3 = CipherSuite.f25190q1;
        CipherSuite cipherSuite4 = CipherSuite.f25142a1;
        CipherSuite cipherSuite5 = CipherSuite.f25154e1;
        CipherSuite cipherSuite6 = CipherSuite.f25145b1;
        CipherSuite cipherSuite7 = CipherSuite.f25157f1;
        CipherSuite cipherSuite8 = CipherSuite.f25175l1;
        CipherSuite cipherSuite9 = CipherSuite.f25172k1;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        f25214f = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.f25112L0, CipherSuite.f25114M0, CipherSuite.f25168j0, CipherSuite.f25171k0, CipherSuite.f25103H, CipherSuite.f25111L, CipherSuite.f25173l};
        f25215g = cipherSuiteArr2;
        Builder builderM28403c = new Builder(true).m28403c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f25216h = builderM28403c.m28406f(tlsVersion, tlsVersion2).m28404d(true).m28401a();
        f25217i = new Builder(true).m28403c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).m28406f(tlsVersion, tlsVersion2).m28404d(true).m28401a();
        f25218j = new Builder(true).m28403c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).m28406f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m28404d(true).m28401a();
        f25219k = new Builder(false).m28401a();
    }

    public ConnectionSpec(boolean z7, boolean z8, String[] strArr, String[] strArr2) {
        this.f25220a = z7;
        this.f25221b = z8;
        this.f25222c = strArr;
        this.f25223d = strArr2;
    }

    /* JADX INFO: renamed from: g */
    private final ConnectionSpec m28394g(SSLSocket sSLSocket, boolean z7) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f25222c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            AbstractC6118n.m27186d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = Util.m28736E(enabledCipherSuites, this.f25222c, CipherSuite.f25143b.m28389c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f25223d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            AbstractC6118n.m27186d(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Util.m28736E(enabledProtocols, this.f25223d, AbstractC1792a.m7506d());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC6118n.m27186d(supportedCipherSuites, "supportedCipherSuites");
        int iM28784x = Util.m28784x(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.f25143b.m28389c());
        if (z7 && iM28784x != -1) {
            AbstractC6118n.m27186d(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iM28784x];
            AbstractC6118n.m27186d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = Util.m28775o(cipherSuitesIntersection, str);
        }
        Builder builder = new Builder(this);
        AbstractC6118n.m27186d(cipherSuitesIntersection, "cipherSuitesIntersection");
        Builder builderM28402b = builder.m28402b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        AbstractC6118n.m27186d(tlsVersionsIntersection, "tlsVersionsIntersection");
        return builderM28402b.m28405e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).m28401a();
    }

    /* JADX INFO: renamed from: c */
    public final void m28395c(SSLSocket sslSocket, boolean z7) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        ConnectionSpec connectionSpecM28394g = m28394g(sslSocket, z7);
        if (connectionSpecM28394g.m28400i() != null) {
            sslSocket.setEnabledProtocols(connectionSpecM28394g.f25223d);
        }
        if (connectionSpecM28394g.m28396d() != null) {
            sslSocket.setEnabledCipherSuites(connectionSpecM28394g.f25222c);
        }
    }

    /* JADX INFO: renamed from: d */
    public final List m28396d() {
        String[] strArr = this.f25222c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f25143b.m28388b(str));
        }
        return AbstractC1638q.m6593g0(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m28397e(SSLSocket socket) {
        AbstractC6118n.m27187e(socket, "socket");
        if (!this.f25220a) {
            return false;
        }
        String[] strArr = this.f25223d;
        if (strArr != null && !Util.m28781u(strArr, socket.getEnabledProtocols(), AbstractC1792a.m7506d())) {
            return false;
        }
        String[] strArr2 = this.f25222c;
        return strArr2 == null || Util.m28781u(strArr2, socket.getEnabledCipherSuites(), CipherSuite.f25143b.m28389c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z7 = this.f25220a;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z7 != connectionSpec.f25220a) {
            return false;
        }
        return !z7 || (Arrays.equals(this.f25222c, connectionSpec.f25222c) && Arrays.equals(this.f25223d, connectionSpec.f25223d) && this.f25221b == connectionSpec.f25221b);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m28398f() {
        return this.f25220a;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m28399h() {
        return this.f25221b;
    }

    public int hashCode() {
        if (!this.f25220a) {
            return 17;
        }
        String[] strArr = this.f25222c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f25223d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f25221b ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List m28400i() {
        String[] strArr = this.f25223d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.f25469b.m28720a(str));
        }
        return AbstractC1638q.m6593g0(arrayList);
    }

    public String toString() {
        if (!this.f25220a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m28396d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m28400i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f25221b + ')';
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private boolean f25224a;

        /* JADX INFO: renamed from: b */
        private String[] f25225b;

        /* JADX INFO: renamed from: c */
        private String[] f25226c;

        /* JADX INFO: renamed from: d */
        private boolean f25227d;

        public Builder(boolean z7) {
            this.f25224a = z7;
        }

        /* JADX INFO: renamed from: a */
        public final ConnectionSpec m28401a() {
            return new ConnectionSpec(this.f25224a, this.f25227d, this.f25225b, this.f25226c);
        }

        /* JADX INFO: renamed from: b */
        public final Builder m28402b(String... cipherSuites) {
            AbstractC6118n.m27187e(cipherSuites, "cipherSuites");
            if (!this.f25224a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f25225b = (String[]) cipherSuites.clone();
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final Builder m28403c(CipherSuite... cipherSuites) {
            AbstractC6118n.m27187e(cipherSuites, "cipherSuites");
            if (!this.f25224a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.m28384c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m28402b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* JADX INFO: renamed from: d */
        public final Builder m28404d(boolean z7) {
            if (!this.f25224a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f25227d = z7;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final Builder m28405e(String... tlsVersions) {
            AbstractC6118n.m27187e(tlsVersions, "tlsVersions");
            if (!this.f25224a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f25226c = (String[]) tlsVersions.clone();
            return this;
        }

        /* JADX INFO: renamed from: f */
        public final Builder m28406f(TlsVersion... tlsVersions) {
            AbstractC6118n.m27187e(tlsVersions, "tlsVersions");
            if (!this.f25224a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.m28719d());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m28405e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public Builder(ConnectionSpec connectionSpec) {
            AbstractC6118n.m27187e(connectionSpec, "connectionSpec");
            this.f25224a = connectionSpec.m28398f();
            this.f25225b = connectionSpec.f25222c;
            this.f25226c = connectionSpec.f25223d;
            this.f25227d = connectionSpec.m28399h();
        }
    }
}
