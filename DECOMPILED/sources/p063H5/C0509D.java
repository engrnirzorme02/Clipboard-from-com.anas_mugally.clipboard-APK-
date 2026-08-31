package p063H5;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0509D extends AbstractC0544g0 {

    /* JADX INFO: renamed from: a */
    private final SocketAddress f1895a;

    /* JADX INFO: renamed from: b */
    private final InetSocketAddress f1896b;

    /* JADX INFO: renamed from: c */
    private final String f1897c;

    /* JADX INFO: renamed from: d */
    private final String f1898d;

    /* JADX INFO: renamed from: H5.D$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private SocketAddress f1899a;

        /* JADX INFO: renamed from: b */
        private InetSocketAddress f1900b;

        /* JADX INFO: renamed from: c */
        private String f1901c;

        /* JADX INFO: renamed from: d */
        private String f1902d;

        /* JADX INFO: renamed from: a */
        public C0509D m2130a() {
            return new C0509D(this.f1899a, this.f1900b, this.f1901c, this.f1902d);
        }

        /* JADX INFO: renamed from: b */
        public b m2131b(String str) {
            this.f1902d = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m2132c(SocketAddress socketAddress) {
            this.f1899a = (SocketAddress) AbstractC1209m.m5303o(socketAddress, "proxyAddress");
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m2133d(InetSocketAddress inetSocketAddress) {
            this.f1900b = (InetSocketAddress) AbstractC1209m.m5303o(inetSocketAddress, "targetAddress");
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m2134e(String str) {
            this.f1901c = str;
            return this;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static b m2125e() {
        return new b();
    }

    /* JADX INFO: renamed from: a */
    public String m2126a() {
        return this.f1898d;
    }

    /* JADX INFO: renamed from: b */
    public SocketAddress m2127b() {
        return this.f1895a;
    }

    /* JADX INFO: renamed from: c */
    public InetSocketAddress m2128c() {
        return this.f1896b;
    }

    /* JADX INFO: renamed from: d */
    public String m2129d() {
        return this.f1897c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0509D)) {
            return false;
        }
        C0509D c0509d = (C0509D) obj;
        return AbstractC1205i.m5282a(this.f1895a, c0509d.f1895a) && AbstractC1205i.m5282a(this.f1896b, c0509d.f1896b) && AbstractC1205i.m5282a(this.f1897c, c0509d.f1897c) && AbstractC1205i.m5282a(this.f1898d, c0509d.f1898d);
    }

    public int hashCode() {
        return AbstractC1205i.m5283b(this.f1895a, this.f1896b, this.f1897c, this.f1898d);
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("proxyAddr", this.f1895a).m5277d("targetAddr", this.f1896b).m5277d("username", this.f1897c).m5278e("hasPassword", this.f1898d != null).toString();
    }

    private C0509D(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        AbstractC1209m.m5303o(socketAddress, "proxyAddress");
        AbstractC1209m.m5303o(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            AbstractC1209m.m5311w(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f1895a = socketAddress;
        this.f1896b = inetSocketAddress;
        this.f1897c = str;
        this.f1898d = str2;
    }
}
