package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Address {

    /* JADX INFO: renamed from: a */
    private final Dns f25002a;

    /* JADX INFO: renamed from: b */
    private final SocketFactory f25003b;

    /* JADX INFO: renamed from: c */
    private final SSLSocketFactory f25004c;

    /* JADX INFO: renamed from: d */
    private final HostnameVerifier f25005d;

    /* JADX INFO: renamed from: e */
    private final CertificatePinner f25006e;

    /* JADX INFO: renamed from: f */
    private final Authenticator f25007f;

    /* JADX INFO: renamed from: g */
    private final Proxy f25008g;

    /* JADX INFO: renamed from: h */
    private final ProxySelector f25009h;

    /* JADX INFO: renamed from: i */
    private final HttpUrl f25010i;

    /* JADX INFO: renamed from: j */
    private final List f25011j;

    /* JADX INFO: renamed from: k */
    private final List f25012k;

    public Address(String uriHost, int i7, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC6118n.m27187e(uriHost, "uriHost");
        AbstractC6118n.m27187e(dns, "dns");
        AbstractC6118n.m27187e(socketFactory, "socketFactory");
        AbstractC6118n.m27187e(proxyAuthenticator, "proxyAuthenticator");
        AbstractC6118n.m27187e(protocols, "protocols");
        AbstractC6118n.m27187e(connectionSpecs, "connectionSpecs");
        AbstractC6118n.m27187e(proxySelector, "proxySelector");
        this.f25002a = dns;
        this.f25003b = socketFactory;
        this.f25004c = sSLSocketFactory;
        this.f25005d = hostnameVerifier;
        this.f25006e = certificatePinner;
        this.f25007f = proxyAuthenticator;
        this.f25008g = proxy;
        this.f25009h = proxySelector;
        this.f25010i = new HttpUrl.Builder().m28529o(sSLSocketFactory != null ? "https" : "http").m28524e(uriHost).m28527k(i7).m28521a();
        this.f25011j = Util.m28753V(protocols);
        this.f25012k = Util.m28753V(connectionSpecs);
    }

    /* JADX INFO: renamed from: a */
    public final CertificatePinner m28300a() {
        return this.f25006e;
    }

    /* JADX INFO: renamed from: b */
    public final List m28301b() {
        return this.f25012k;
    }

    /* JADX INFO: renamed from: c */
    public final Dns m28302c() {
        return this.f25002a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m28303d(Address that) {
        AbstractC6118n.m27187e(that, "that");
        return AbstractC6118n.m27183a(this.f25002a, that.f25002a) && AbstractC6118n.m27183a(this.f25007f, that.f25007f) && AbstractC6118n.m27183a(this.f25011j, that.f25011j) && AbstractC6118n.m27183a(this.f25012k, that.f25012k) && AbstractC6118n.m27183a(this.f25009h, that.f25009h) && AbstractC6118n.m27183a(this.f25008g, that.f25008g) && AbstractC6118n.m27183a(this.f25004c, that.f25004c) && AbstractC6118n.m27183a(this.f25005d, that.f25005d) && AbstractC6118n.m27183a(this.f25006e, that.f25006e) && this.f25010i.m28508l() == that.f25010i.m28508l();
    }

    /* JADX INFO: renamed from: e */
    public final HostnameVerifier m28304e() {
        return this.f25005d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return AbstractC6118n.m27183a(this.f25010i, address.f25010i) && m28303d(address);
    }

    /* JADX INFO: renamed from: f */
    public final List m28305f() {
        return this.f25011j;
    }

    /* JADX INFO: renamed from: g */
    public final Proxy m28306g() {
        return this.f25008g;
    }

    /* JADX INFO: renamed from: h */
    public final Authenticator m28307h() {
        return this.f25007f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f25010i.hashCode()) * 31) + this.f25002a.hashCode()) * 31) + this.f25007f.hashCode()) * 31) + this.f25011j.hashCode()) * 31) + this.f25012k.hashCode()) * 31) + this.f25009h.hashCode()) * 31) + Objects.hashCode(this.f25008g)) * 31) + Objects.hashCode(this.f25004c)) * 31) + Objects.hashCode(this.f25005d)) * 31) + Objects.hashCode(this.f25006e);
    }

    /* JADX INFO: renamed from: i */
    public final ProxySelector m28308i() {
        return this.f25009h;
    }

    /* JADX INFO: renamed from: j */
    public final SocketFactory m28309j() {
        return this.f25003b;
    }

    /* JADX INFO: renamed from: k */
    public final SSLSocketFactory m28310k() {
        return this.f25004c;
    }

    /* JADX INFO: renamed from: l */
    public final HttpUrl m28311l() {
        return this.f25010i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f25010i.m28504h());
        sb2.append(':');
        sb2.append(this.f25010i.m28508l());
        sb2.append(", ");
        if (this.f25008g != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f25008g;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f25009h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
