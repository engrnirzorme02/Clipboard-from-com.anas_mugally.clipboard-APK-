package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public abstract class EventListener {

    /* JADX INFO: renamed from: a */
    public static final Companion f25258a = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static final EventListener f25259b = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public interface Factory {
        /* JADX INFO: renamed from: a */
        EventListener mo2539a(Call call);
    }

    /* JADX INFO: renamed from: A */
    public void m28433A(Call call, Response response) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(response, "response");
    }

    /* JADX INFO: renamed from: B */
    public void m28434B(Call call, Handshake handshake) {
        AbstractC6118n.m27187e(call, "call");
    }

    /* JADX INFO: renamed from: C */
    public void m28435C(Call call) {
        AbstractC6118n.m27187e(call, "call");
    }

    /* JADX INFO: renamed from: a */
    public void m28436a(Call call, Response cachedResponse) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(cachedResponse, "cachedResponse");
    }

    /* JADX INFO: renamed from: b */
    public void m28437b(Call call, Response response) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(response, "response");
    }

    /* JADX INFO: renamed from: c */
    public void m28438c(Call call) {
        AbstractC6118n.m27187e(call, "call");
    }

    /* JADX INFO: renamed from: d */
    public void m28439d(Call call) {
        AbstractC6118n.m27187e(call, "call");
    }

    /* JADX INFO: renamed from: e */
    public void m28440e(Call call, IOException ioe) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(ioe, "ioe");
    }

    /* JADX INFO: renamed from: f */
    public void m28441f(Call call) {
        AbstractC6118n.m27187e(call, "call");
    }

    /* JADX INFO: renamed from: g */
    public void m28442g(Call call) {
        AbstractC6118n.m27187e(call, "call");
    }

    /* JADX INFO: renamed from: h */
    public void m28443h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(inetSocketAddress, "inetSocketAddress");
        AbstractC6118n.m27187e(proxy, "proxy");
    }

    /* JADX INFO: renamed from: i */
    public void m28444i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(inetSocketAddress, "inetSocketAddress");
        AbstractC6118n.m27187e(proxy, "proxy");
        AbstractC6118n.m27187e(ioe, "ioe");
    }

    /* JADX INFO: renamed from: j */
    public void m28445j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(inetSocketAddress, "inetSocketAddress");
        AbstractC6118n.m27187e(proxy, "proxy");
    }

    /* JADX INFO: renamed from: k */
    public void m28446k(Call call, Connection connection) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(connection, "connection");
    }

    /* JADX INFO: renamed from: l */
    public void m28447l(Call call, Connection connection) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(connection, "connection");
    }

    /* JADX INFO: renamed from: m */
    public void m28448m(Call call, String domainName, List inetAddressList) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(domainName, "domainName");
        AbstractC6118n.m27187e(inetAddressList, "inetAddressList");
    }

    /* JADX INFO: renamed from: n */
    public void m28449n(Call call, String domainName) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(domainName, "domainName");
    }

    /* JADX INFO: renamed from: o */
    public void m28450o(Call call, HttpUrl url, List proxies) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(url, "url");
        AbstractC6118n.m27187e(proxies, "proxies");
    }

    /* JADX INFO: renamed from: p */
    public void m28451p(Call call, HttpUrl url) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(url, "url");
    }

    /* JADX INFO: renamed from: q */
    public void m28452q(Call call, long j7) {
        AbstractC6118n.m27187e(call, "call");
    }

    /* JADX INFO: renamed from: r */
    public void m28453r(Call call) {
        AbstractC6118n.m27187e(call, "call");
    }

    /* JADX INFO: renamed from: s */
    public void m28454s(Call call, IOException ioe) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(ioe, "ioe");
    }

    /* JADX INFO: renamed from: t */
    public void m28455t(Call call, Request request) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(request, "request");
    }

    /* JADX INFO: renamed from: u */
    public void m28456u(Call call) {
        AbstractC6118n.m27187e(call, "call");
    }

    /* JADX INFO: renamed from: v */
    public void m28457v(Call call, long j7) {
        AbstractC6118n.m27187e(call, "call");
    }

    /* JADX INFO: renamed from: w */
    public void m28458w(Call call) {
        AbstractC6118n.m27187e(call, "call");
    }

    /* JADX INFO: renamed from: x */
    public void m28459x(Call call, IOException ioe) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(ioe, "ioe");
    }

    /* JADX INFO: renamed from: y */
    public void m28460y(Call call, Response response) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(response, "response");
    }

    /* JADX INFO: renamed from: z */
    public void m28461z(Call call) {
        AbstractC6118n.m27187e(call, "call");
    }
}
