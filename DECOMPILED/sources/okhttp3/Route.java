package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class Route {

    /* JADX INFO: renamed from: a */
    private final Address f25466a;

    /* JADX INFO: renamed from: b */
    private final Proxy f25467b;

    /* JADX INFO: renamed from: c */
    private final InetSocketAddress f25468c;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC6118n.m27187e(address, "address");
        AbstractC6118n.m27187e(proxy, "proxy");
        AbstractC6118n.m27187e(socketAddress, "socketAddress");
        this.f25466a = address;
        this.f25467b = proxy;
        this.f25468c = socketAddress;
    }

    /* JADX INFO: renamed from: a */
    public final Address m28714a() {
        return this.f25466a;
    }

    /* JADX INFO: renamed from: b */
    public final Proxy m28715b() {
        return this.f25467b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m28716c() {
        return this.f25466a.m28310k() != null && this.f25467b.type() == Proxy.Type.HTTP;
    }

    /* JADX INFO: renamed from: d */
    public final InetSocketAddress m28717d() {
        return this.f25468c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return AbstractC6118n.m27183a(route.f25466a, this.f25466a) && AbstractC6118n.m27183a(route.f25467b, this.f25467b) && AbstractC6118n.m27183a(route.f25468c, this.f25468c);
    }

    public int hashCode() {
        return ((((527 + this.f25466a.hashCode()) * 31) + this.f25467b.hashCode()) * 31) + this.f25468c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f25468c + '}';
    }
}
