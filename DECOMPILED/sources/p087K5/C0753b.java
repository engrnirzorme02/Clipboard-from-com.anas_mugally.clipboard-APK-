package p087K5;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: K5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0753b {

    /* JADX INFO: renamed from: e */
    private static final EnumC0752a[] f3036e;

    /* JADX INFO: renamed from: f */
    public static final C0753b f3037f;

    /* JADX INFO: renamed from: g */
    public static final C0753b f3038g;

    /* JADX INFO: renamed from: h */
    public static final C0753b f3039h;

    /* JADX INFO: renamed from: a */
    final boolean f3040a;

    /* JADX INFO: renamed from: b */
    private final String[] f3041b;

    /* JADX INFO: renamed from: c */
    private final String[] f3042c;

    /* JADX INFO: renamed from: d */
    final boolean f3043d;

    static {
        EnumC0752a[] enumC0752aArr = {EnumC0752a.TLS_AES_128_GCM_SHA256, EnumC0752a.TLS_AES_256_GCM_SHA384, EnumC0752a.TLS_CHACHA20_POLY1305_SHA256, EnumC0752a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC0752a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC0752a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC0752a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC0752a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC0752a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, EnumC0752a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, EnumC0752a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, EnumC0752a.TLS_RSA_WITH_AES_128_GCM_SHA256, EnumC0752a.TLS_RSA_WITH_AES_256_GCM_SHA384, EnumC0752a.TLS_RSA_WITH_AES_128_CBC_SHA, EnumC0752a.TLS_RSA_WITH_AES_256_CBC_SHA, EnumC0752a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f3036e = enumC0752aArr;
        b bVarM3536f = new b(true).m3536f(enumC0752aArr);
        EnumC0762k enumC0762k = EnumC0762k.TLS_1_3;
        EnumC0762k enumC0762k2 = EnumC0762k.TLS_1_2;
        C0753b c0753bM3535e = bVarM3536f.m3539i(enumC0762k, enumC0762k2).m3538h(true).m3535e();
        f3037f = c0753bM3535e;
        f3038g = new b(c0753bM3535e).m3539i(enumC0762k, enumC0762k2, EnumC0762k.TLS_1_1, EnumC0762k.TLS_1_0).m3538h(true).m3535e();
        f3039h = new b(false).m3535e();
    }

    /* JADX INFO: renamed from: e */
    private C0753b m3526e(SSLSocket sSLSocket, boolean z7) {
        String[] enabledCipherSuites;
        if (this.f3041b != null) {
            enabledCipherSuites = (String[]) AbstractC0763l.m3593c(String.class, this.f3041b, sSLSocket.getEnabledCipherSuites());
        } else {
            enabledCipherSuites = null;
        }
        if (z7 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (enabledCipherSuites == null) {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            int length = enabledCipherSuites.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
            strArr[length] = "TLS_FALLBACK_SCSV";
            enabledCipherSuites = strArr;
        }
        return new b(this).m3537g(enabledCipherSuites).m3540j((String[]) AbstractC0763l.m3593c(String.class, this.f3042c, sSLSocket.getEnabledProtocols())).m3535e();
    }

    /* JADX INFO: renamed from: c */
    public void m3527c(SSLSocket sSLSocket, boolean z7) {
        C0753b c0753bM3526e = m3526e(sSLSocket, z7);
        sSLSocket.setEnabledProtocols(c0753bM3526e.f3042c);
        String[] strArr = c0753bM3526e.f3041b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public List m3528d() {
        String[] strArr = this.f3041b;
        if (strArr == null) {
            return null;
        }
        EnumC0752a[] enumC0752aArr = new EnumC0752a[strArr.length];
        int i7 = 0;
        while (true) {
            String[] strArr2 = this.f3041b;
            if (i7 >= strArr2.length) {
                return AbstractC0763l.m3591a(enumC0752aArr);
            }
            enumC0752aArr[i7] = EnumC0752a.m3523c(strArr2[i7]);
            i7++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0753b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0753b c0753b = (C0753b) obj;
        boolean z7 = this.f3040a;
        if (z7 != c0753b.f3040a) {
            return false;
        }
        return !z7 || (Arrays.equals(this.f3041b, c0753b.f3041b) && Arrays.equals(this.f3042c, c0753b.f3042c) && this.f3043d == c0753b.f3043d);
    }

    /* JADX INFO: renamed from: f */
    public boolean m3529f() {
        return this.f3043d;
    }

    /* JADX INFO: renamed from: g */
    public List m3530g() {
        EnumC0762k[] enumC0762kArr = new EnumC0762k[this.f3042c.length];
        int i7 = 0;
        while (true) {
            String[] strArr = this.f3042c;
            if (i7 >= strArr.length) {
                return AbstractC0763l.m3591a(enumC0762kArr);
            }
            enumC0762kArr[i7] = EnumC0762k.m3590c(strArr[i7]);
            i7++;
        }
    }

    public int hashCode() {
        if (this.f3040a) {
            return ((((527 + Arrays.hashCode(this.f3041b)) * 31) + Arrays.hashCode(this.f3042c)) * 31) + (!this.f3043d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f3040a) {
            return "ConnectionSpec()";
        }
        List listM3528d = m3528d();
        return "ConnectionSpec(cipherSuites=" + (listM3528d == null ? "[use default]" : listM3528d.toString()) + ", tlsVersions=" + m3530g() + ", supportsTlsExtensions=" + this.f3043d + ")";
    }

    /* JADX INFO: renamed from: K5.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private boolean f3044a;

        /* JADX INFO: renamed from: b */
        private String[] f3045b;

        /* JADX INFO: renamed from: c */
        private String[] f3046c;

        /* JADX INFO: renamed from: d */
        private boolean f3047d;

        public b(boolean z7) {
            this.f3044a = z7;
        }

        /* JADX INFO: renamed from: e */
        public C0753b m3535e() {
            return new C0753b(this);
        }

        /* JADX INFO: renamed from: f */
        public b m3536f(EnumC0752a... enumC0752aArr) {
            if (!this.f3044a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[enumC0752aArr.length];
            for (int i7 = 0; i7 < enumC0752aArr.length; i7++) {
                strArr[i7] = enumC0752aArr[i7].f3035a;
            }
            this.f3045b = strArr;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m3537g(String... strArr) {
            if (!this.f3044a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.f3045b = null;
                return this;
            }
            this.f3045b = (String[]) strArr.clone();
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m3538h(boolean z7) {
            if (!this.f3044a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f3047d = z7;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public b m3539i(EnumC0762k... enumC0762kArr) {
            if (!this.f3044a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (enumC0762kArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[enumC0762kArr.length];
            for (int i7 = 0; i7 < enumC0762kArr.length; i7++) {
                strArr[i7] = enumC0762kArr[i7].f3102a;
            }
            this.f3046c = strArr;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m3540j(String... strArr) {
            if (!this.f3044a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.f3046c = null;
                return this;
            }
            this.f3046c = (String[]) strArr.clone();
            return this;
        }

        public b(C0753b c0753b) {
            this.f3044a = c0753b.f3040a;
            this.f3045b = c0753b.f3041b;
            this.f3046c = c0753b.f3042c;
            this.f3047d = c0753b.f3043d;
        }
    }

    private C0753b(b bVar) {
        this.f3040a = bVar.f3044a;
        this.f3041b = bVar.f3045b;
        this.f3042c = bVar.f3046c;
        this.f3043d = bVar.f3047d;
    }
}
