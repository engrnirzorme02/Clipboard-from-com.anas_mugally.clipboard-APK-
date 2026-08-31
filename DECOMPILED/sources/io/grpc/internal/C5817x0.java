package io.grpc.internal;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p063H5.AbstractC0544g0;
import p063H5.C0509D;
import p063H5.InterfaceC0546h0;
import p122P3.AbstractC1209m;
import p122P3.InterfaceC1214r;

/* JADX INFO: renamed from: io.grpc.internal.x0 */
/* JADX INFO: loaded from: classes.dex */
class C5817x0 implements InterfaceC0546h0 {

    /* JADX INFO: renamed from: d */
    private static final Logger f22939d = Logger.getLogger(C5817x0.class.getName());

    /* JADX INFO: renamed from: e */
    private static final c f22940e = new a();

    /* JADX INFO: renamed from: f */
    private static final InterfaceC1214r f22941f = new b();

    /* JADX INFO: renamed from: a */
    private final InterfaceC1214r f22942a;

    /* JADX INFO: renamed from: b */
    private final c f22943b;

    /* JADX INFO: renamed from: c */
    private final InetSocketAddress f22944c;

    /* JADX INFO: renamed from: io.grpc.internal.x0$a */
    class a implements c {
        a() {
        }

        @Override // io.grpc.internal.C5817x0.c
        /* JADX INFO: renamed from: a */
        public PasswordAuthentication mo26214a(String str, InetAddress inetAddress, int i7, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i7, "");
            } catch (MalformedURLException unused) {
                C5817x0.f22939d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i7, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.x0$b */
    class b implements InterfaceC1214r {
        b() {
        }

        @Override // p122P3.InterfaceC1214r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.x0$c */
    interface c {
        /* JADX INFO: renamed from: a */
        PasswordAuthentication mo26214a(String str, InetAddress inetAddress, int i7, String str2, String str3, String str4);
    }

    public C5817x0() {
        this(f22941f, f22940e, System.getenv("GRPC_PROXY_EXP"));
    }

    /* JADX INFO: renamed from: c */
    private AbstractC0544g0 m26212c(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI("https", null, AbstractC5757S.m25671i(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = (ProxySelector) this.f22942a.get();
                if (proxySelector == null) {
                    f22939d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    f22939d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication passwordAuthenticationMo26214a = this.f22943b.mo26214a(AbstractC5757S.m25671i(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                C0509D.b bVarM2132c = C0509D.m2125e().m2133d(inetSocketAddress).m2132c(inetSocketAddress2);
                if (passwordAuthenticationMo26214a == null) {
                    return bVarM2132c.m2130a();
                }
                return bVarM2132c.m2134e(passwordAuthenticationMo26214a.getUserName()).m2131b(passwordAuthenticationMo26214a.getPassword() != null ? new String(passwordAuthenticationMo26214a.getPassword()) : null).m2130a();
            } catch (URISyntaxException e7) {
                f22939d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e7);
                return null;
            }
        } catch (Throwable th) {
            f22939d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static InetSocketAddress m26213d(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(":", 2);
        int i7 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f22939d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(strArrSplit[0], i7);
    }

    @Override // p063H5.InterfaceC0546h0
    /* JADX INFO: renamed from: a */
    public AbstractC0544g0 mo2425a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return this.f22944c != null ? C0509D.m2125e().m2132c(this.f22944c).m2133d((InetSocketAddress) socketAddress).m2130a() : m26212c((InetSocketAddress) socketAddress);
        }
        return null;
    }

    C5817x0(InterfaceC1214r interfaceC1214r, c cVar, String str) {
        this.f22942a = (InterfaceC1214r) AbstractC1209m.m5302n(interfaceC1214r);
        this.f22943b = (c) AbstractC1209m.m5302n(cVar);
        if (str != null) {
            this.f22944c = m26213d(str);
        } else {
            this.f22944c = null;
        }
    }
}
