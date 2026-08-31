package okhttp3.internal.authenticator;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import p152T5.AbstractC1638q;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class JavaNetAuthenticator implements Authenticator {

    /* JADX INFO: renamed from: d */
    private final Dns f25486d;

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25487a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25487a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    private final InetAddress m28787b(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.f25487a[type.ordinal()]) == 1) {
            return (InetAddress) AbstractC1638q.m6570J(dns.mo28432a(httpUrl.m28504h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        AbstractC6118n.m27185c(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        AbstractC6118n.m27186d(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // okhttp3.Authenticator
    /* JADX INFO: renamed from: a */
    public Request mo28312a(Route route, Response response) {
        Proxy proxy;
        Dns dnsM28302c;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        Address addressM28714a;
        AbstractC6118n.m27187e(response, "response");
        List<Challenge> listM28689x = response.m28689x();
        Request requestM28679U0 = response.m28679U0();
        HttpUrl httpUrlM28656j = requestM28679U0.m28656j();
        boolean z7 = response.m28672J() == 407;
        if (route == null || (proxy = route.m28715b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge challenge : listM28689x) {
            if (AbstractC6406h.m27564w("Basic", challenge.m28381c(), true)) {
                if (route == null || (addressM28714a = route.m28714a()) == null || (dnsM28302c = addressM28714a.m28302c()) == null) {
                    dnsM28302c = this.f25486d;
                }
                if (z7) {
                    SocketAddress socketAddressAddress = proxy.address();
                    AbstractC6118n.m27185c(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    AbstractC6118n.m27186d(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, m28787b(proxy, httpUrlM28656j, dnsM28302c), inetSocketAddress.getPort(), httpUrlM28656j.m28512p(), challenge.m28380b(), challenge.m28381c(), httpUrlM28656j.m28514r(), java.net.Authenticator.RequestorType.PROXY);
                } else {
                    String strM28504h = httpUrlM28656j.m28504h();
                    AbstractC6118n.m27186d(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(strM28504h, m28787b(proxy, httpUrlM28656j, dnsM28302c), httpUrlM28656j.m28508l(), httpUrlM28656j.m28512p(), challenge.m28380b(), challenge.m28381c(), httpUrlM28656j.m28514r(), java.net.Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z7 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    AbstractC6118n.m27186d(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    AbstractC6118n.m27186d(password, "auth.password");
                    return requestM28679U0.m28655i().m28659c(str, Credentials.m28424a(userName, new String(password), challenge.m28379a())).m28658b();
                }
            }
        }
        return null;
    }

    public JavaNetAuthenticator(Dns defaultDns) {
        AbstractC6118n.m27187e(defaultDns, "defaultDns");
        this.f25486d = defaultDns;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i7, AbstractC6112h abstractC6112h) {
        this((i7 & 1) != 0 ? Dns.f25256b : dns);
    }
}
