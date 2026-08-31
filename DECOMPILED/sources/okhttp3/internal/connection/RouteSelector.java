package okhttp3.internal.connection;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import p152T5.AbstractC1638q;

/* JADX INFO: loaded from: classes.dex */
public final class RouteSelector {

    /* JADX INFO: renamed from: i */
    public static final Companion f25707i = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final Address f25708a;

    /* JADX INFO: renamed from: b */
    private final RouteDatabase f25709b;

    /* JADX INFO: renamed from: c */
    private final Call f25710c;

    /* JADX INFO: renamed from: d */
    private final EventListener f25711d;

    /* JADX INFO: renamed from: e */
    private List f25712e;

    /* JADX INFO: renamed from: f */
    private int f25713f;

    /* JADX INFO: renamed from: g */
    private List f25714g;

    /* JADX INFO: renamed from: h */
    private final List f25715h;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m29039a(InetSocketAddress inetSocketAddress) {
            AbstractC6118n.m27187e(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                AbstractC6118n.m27186d(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            AbstractC6118n.m27186d(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private Companion() {
        }
    }

    public static final class Selection {

        /* JADX INFO: renamed from: a */
        private final List f25716a;

        /* JADX INFO: renamed from: b */
        private int f25717b;

        public Selection(List routes) {
            AbstractC6118n.m27187e(routes, "routes");
            this.f25716a = routes;
        }

        /* JADX INFO: renamed from: a */
        public final List m29040a() {
            return this.f25716a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m29041b() {
            return this.f25717b < this.f25716a.size();
        }

        /* JADX INFO: renamed from: c */
        public final Route m29042c() {
            if (!m29041b()) {
                throw new NoSuchElementException();
            }
            List list = this.f25716a;
            int i7 = this.f25717b;
            this.f25717b = i7 + 1;
            return (Route) list.get(i7);
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        AbstractC6118n.m27187e(address, "address");
        AbstractC6118n.m27187e(routeDatabase, "routeDatabase");
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(eventListener, "eventListener");
        this.f25708a = address;
        this.f25709b = routeDatabase;
        this.f25710c = call;
        this.f25711d = eventListener;
        this.f25712e = AbstractC1638q.m6765j();
        this.f25714g = AbstractC1638q.m6765j();
        this.f25715h = new ArrayList();
        m29035f(address.m28311l(), address.m28306g());
    }

    /* JADX INFO: renamed from: b */
    private final boolean m29032b() {
        return this.f25713f < this.f25712e.size();
    }

    /* JADX INFO: renamed from: d */
    private final Proxy m29033d() throws SocketException, UnknownHostException {
        if (m29032b()) {
            List list = this.f25712e;
            int i7 = this.f25713f;
            this.f25713f = i7 + 1;
            Proxy proxy = (Proxy) list.get(i7);
            m29034e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f25708a.m28311l().m28504h() + "; exhausted proxy configurations: " + this.f25712e);
    }

    /* JADX INFO: renamed from: e */
    private final void m29034e(Proxy proxy) throws SocketException, UnknownHostException {
        String strM28504h;
        int iM28508l;
        List listMo28432a;
        ArrayList arrayList = new ArrayList();
        this.f25714g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM28504h = this.f25708a.m28311l().m28504h();
            iM28508l = this.f25708a.m28311l().m28508l();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            Companion companion = f25707i;
            AbstractC6118n.m27186d(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strM28504h = companion.m29039a(inetSocketAddress);
            iM28508l = inetSocketAddress.getPort();
        }
        if (1 > iM28508l || iM28508l >= 65536) {
            throw new SocketException("No route to " + strM28504h + ':' + iM28508l + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strM28504h, iM28508l));
            return;
        }
        if (Util.m28769i(strM28504h)) {
            listMo28432a = AbstractC1638q.m6759d(InetAddress.getByName(strM28504h));
        } else {
            this.f25711d.m28449n(this.f25710c, strM28504h);
            listMo28432a = this.f25708a.m28302c().mo28432a(strM28504h);
            if (listMo28432a.isEmpty()) {
                throw new UnknownHostException(this.f25708a.m28302c() + " returned no addresses for " + strM28504h);
            }
            this.f25711d.m28448m(this.f25710c, strM28504h, listMo28432a);
        }
        Iterator it = listMo28432a.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iM28508l));
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m29035f(HttpUrl httpUrl, Proxy proxy) {
        this.f25711d.m28451p(this.f25710c, httpUrl);
        List listM29036g = m29036g(proxy, httpUrl, this);
        this.f25712e = listM29036g;
        this.f25713f = 0;
        this.f25711d.m28450o(this.f25710c, httpUrl, listM29036g);
    }

    /* JADX INFO: renamed from: g */
    private static final List m29036g(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        if (proxy != null) {
            return AbstractC1638q.m6759d(proxy);
        }
        URI uriM28513q = httpUrl.m28513q();
        if (uriM28513q.getHost() == null) {
            return Util.m28783w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = routeSelector.f25708a.m28308i().select(uriM28513q);
        if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
            return Util.m28783w(Proxy.NO_PROXY);
        }
        AbstractC6118n.m27186d(proxiesOrNull, "proxiesOrNull");
        return Util.m28753V(proxiesOrNull);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29037a() {
        return m29032b() || !this.f25715h.isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public final Selection m29038c() {
        if (!m29037a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m29032b()) {
            Proxy proxyM29033d = m29033d();
            Iterator it = this.f25714g.iterator();
            while (it.hasNext()) {
                Route route = new Route(this.f25708a, proxyM29033d, (InetSocketAddress) it.next());
                if (this.f25709b.m29028c(route)) {
                    this.f25715h.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC1638q.m6779v(arrayList, this.f25715h);
            this.f25715h.clear();
        }
        return new Selection(arrayList);
    }
}
