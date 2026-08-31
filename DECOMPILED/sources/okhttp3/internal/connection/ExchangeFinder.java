package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p145S5.C1444v;

/* JADX INFO: loaded from: classes.dex */
public final class ExchangeFinder {

    /* JADX INFO: renamed from: a */
    private final RealConnectionPool f25640a;

    /* JADX INFO: renamed from: b */
    private final Address f25641b;

    /* JADX INFO: renamed from: c */
    private final RealCall f25642c;

    /* JADX INFO: renamed from: d */
    private final EventListener f25643d;

    /* JADX INFO: renamed from: e */
    private RouteSelector.Selection f25644e;

    /* JADX INFO: renamed from: f */
    private RouteSelector f25645f;

    /* JADX INFO: renamed from: g */
    private int f25646g;

    /* JADX INFO: renamed from: h */
    private int f25647h;

    /* JADX INFO: renamed from: i */
    private int f25648i;

    /* JADX INFO: renamed from: j */
    private Route f25649j;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        AbstractC6118n.m27187e(connectionPool, "connectionPool");
        AbstractC6118n.m27187e(address, "address");
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(eventListener, "eventListener");
        this.f25640a = connectionPool;
        this.f25641b = address;
        this.f25642c = call;
        this.f25643d = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x012c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    private final RealConnection m28949b(int i7, int i8, int i9, int i10, boolean z7) throws IOException {
        List listM29040a;
        RealConnection realConnection;
        Socket socketM28978v;
        if (this.f25642c.m28974r()) {
            throw new IOException("Canceled");
        }
        RealConnection realConnectionM28969k = this.f25642c.m28969k();
        if (realConnectionM28969k != null) {
            synchronized (realConnectionM28969k) {
                try {
                    socketM28978v = (realConnectionM28969k.m29008p() || !m28955g(realConnectionM28969k.m28996A().m28714a().m28311l())) ? this.f25642c.m28978v() : null;
                    C1444v c1444v = C1444v.f4971a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f25642c.m28969k() != null) {
                if (socketM28978v == null) {
                    return realConnectionM28969k;
                }
                throw new IllegalStateException("Check failed.");
            }
            if (socketM28978v != null) {
                Util.m28774n(socketM28978v);
            }
            this.f25643d.m28447l(this.f25642c, realConnectionM28969k);
        }
        this.f25646g = 0;
        this.f25647h = 0;
        this.f25648i = 0;
        if (this.f25640a.m29022a(this.f25641b, this.f25642c, null, false)) {
            RealConnection realConnectionM28969k2 = this.f25642c.m28969k();
            AbstractC6118n.m27184b(realConnectionM28969k2);
            this.f25643d.m28446k(this.f25642c, realConnectionM28969k2);
            return realConnectionM28969k2;
        }
        Route routeM29042c = this.f25649j;
        try {
            if (routeM29042c == null) {
                RouteSelector.Selection selection = this.f25644e;
                if (selection != null) {
                    AbstractC6118n.m27184b(selection);
                    if (selection.m29041b()) {
                        RouteSelector.Selection selection2 = this.f25644e;
                        AbstractC6118n.m27184b(selection2);
                        routeM29042c = selection2.m29042c();
                    }
                    realConnection = new RealConnection(this.f25640a, routeM29042c);
                    this.f25642c.m28980x(realConnection);
                    realConnection.m29004f(i7, i8, i9, i10, z7, this.f25642c, this.f25643d);
                    this.f25642c.m28980x(null);
                    this.f25642c.m28968j().m28597r().m29026a(realConnection.m28996A());
                    if (this.f25640a.m29022a(this.f25641b, this.f25642c, listM29040a, true)) {
                        RealConnection realConnectionM28969k3 = this.f25642c.m28969k();
                        AbstractC6118n.m27184b(realConnectionM28969k3);
                        this.f25649j = routeM29042c;
                        Util.m28774n(realConnection.m28999E());
                        this.f25643d.m28446k(this.f25642c, realConnectionM28969k3);
                        return realConnectionM28969k3;
                    }
                    synchronized (realConnection) {
                        this.f25640a.m29025e(realConnection);
                        this.f25642c.m28964c(realConnection);
                        C1444v c1444v2 = C1444v.f4971a;
                    }
                    this.f25643d.m28446k(this.f25642c, realConnection);
                    return realConnection;
                }
                RouteSelector routeSelector = this.f25645f;
                if (routeSelector == null) {
                    routeSelector = new RouteSelector(this.f25641b, this.f25642c.m28968j().m28597r(), this.f25642c, this.f25643d);
                    this.f25645f = routeSelector;
                }
                RouteSelector.Selection selectionM29038c = routeSelector.m29038c();
                this.f25644e = selectionM29038c;
                listM29040a = selectionM29038c.m29040a();
                if (this.f25642c.m28974r()) {
                    throw new IOException("Canceled");
                }
                if (this.f25640a.m29022a(this.f25641b, this.f25642c, listM29040a, false)) {
                    RealConnection realConnectionM28969k4 = this.f25642c.m28969k();
                    AbstractC6118n.m27184b(realConnectionM28969k4);
                    this.f25643d.m28446k(this.f25642c, realConnectionM28969k4);
                    return realConnectionM28969k4;
                }
                routeM29042c = selectionM29038c.m29042c();
                realConnection = new RealConnection(this.f25640a, routeM29042c);
                this.f25642c.m28980x(realConnection);
                realConnection.m29004f(i7, i8, i9, i10, z7, this.f25642c, this.f25643d);
                this.f25642c.m28980x(null);
                this.f25642c.m28968j().m28597r().m29026a(realConnection.m28996A());
                if (this.f25640a.m29022a(this.f25641b, this.f25642c, listM29040a, true)) {
                    RealConnection realConnectionM28969k5 = this.f25642c.m28969k();
                    AbstractC6118n.m27184b(realConnectionM28969k5);
                    this.f25649j = routeM29042c;
                    Util.m28774n(realConnection.m28999E());
                    this.f25643d.m28446k(this.f25642c, realConnectionM28969k5);
                    return realConnectionM28969k5;
                }
                synchronized (realConnection) {
                    this.f25640a.m29025e(realConnection);
                    this.f25642c.m28964c(realConnection);
                    C1444v c1444v3 = C1444v.f4971a;
                    this.f25643d.m28446k(this.f25642c, realConnection);
                    return realConnection;
                }
            }
            AbstractC6118n.m27184b(routeM29042c);
            this.f25649j = null;
            realConnection.m29004f(i7, i8, i9, i10, z7, this.f25642c, this.f25643d);
            this.f25642c.m28980x(null);
            this.f25642c.m28968j().m28597r().m29026a(realConnection.m28996A());
            if (this.f25640a.m29022a(this.f25641b, this.f25642c, listM29040a, true)) {
                RealConnection realConnectionM28969k6 = this.f25642c.m28969k();
                AbstractC6118n.m27184b(realConnectionM28969k6);
                this.f25649j = routeM29042c;
                Util.m28774n(realConnection.m28999E());
                this.f25643d.m28446k(this.f25642c, realConnectionM28969k6);
                return realConnectionM28969k6;
            }
            synchronized (realConnection) {
                this.f25640a.m29025e(realConnection);
                this.f25642c.m28964c(realConnection);
                C1444v c1444v4 = C1444v.f4971a;
                this.f25643d.m28446k(this.f25642c, realConnection);
                return realConnection;
            }
        } catch (Throwable th2) {
            this.f25642c.m28980x(null);
            throw th2;
        }
        listM29040a = null;
        realConnection = new RealConnection(this.f25640a, routeM29042c);
        this.f25642c.m28980x(realConnection);
    }

    /* JADX INFO: renamed from: c */
    private final RealConnection m28950c(int i7, int i8, int i9, int i10, boolean z7, boolean z8) throws IOException {
        while (true) {
            RealConnection realConnectionM28949b = m28949b(i7, i8, i9, i10, z7);
            boolean z9 = z7;
            int i11 = i10;
            int i12 = i9;
            int i13 = i8;
            int i14 = i7;
            if (realConnectionM28949b.m29013u(z8)) {
                return realConnectionM28949b;
            }
            realConnectionM28949b.m29018z();
            if (this.f25649j == null) {
                RouteSelector.Selection selection = this.f25644e;
                if (selection != null ? selection.m29041b() : true) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.f25645f;
                    if (!(routeSelector != null ? routeSelector.m29037a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i7 = i14;
            i8 = i13;
            i9 = i12;
            i10 = i11;
            z7 = z9;
        }
    }

    /* JADX INFO: renamed from: f */
    private final Route m28951f() {
        RealConnection realConnectionM28969k;
        if (this.f25646g > 1 || this.f25647h > 1 || this.f25648i > 0 || (realConnectionM28969k = this.f25642c.m28969k()) == null) {
            return null;
        }
        synchronized (realConnectionM28969k) {
            if (realConnectionM28969k.m29009q() != 0) {
                return null;
            }
            if (Util.m28770j(realConnectionM28969k.m28996A().m28714a().m28311l(), this.f25641b.m28311l())) {
                return realConnectionM28969k.m28996A();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final ExchangeCodec m28952a(OkHttpClient client, RealInterceptorChain chain) {
        AbstractC6118n.m27187e(client, "client");
        AbstractC6118n.m27187e(chain, "chain");
        try {
            try {
                return m28950c(chain.m29072f(), chain.m29074h(), chain.m29076j(), client.m28602w(), client.m28580C(), !AbstractC6118n.m27183a(chain.m29075i().m28654h(), "GET")).m29015w(client, chain);
            } catch (IOException e7) {
                e = e7;
                IOException iOException = e;
                m28956h(iOException);
                throw new RouteException(iOException);
            } catch (RouteException e8) {
                e = e8;
                RouteException routeException = e;
                m28956h(routeException.m29031c());
                throw routeException;
            }
        } catch (IOException e9) {
            e = e9;
        } catch (RouteException e10) {
            e = e10;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Address m28953d() {
        return this.f25641b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m28954e() {
        RouteSelector routeSelector;
        if (this.f25646g == 0 && this.f25647h == 0 && this.f25648i == 0) {
            return false;
        }
        if (this.f25649j != null) {
            return true;
        }
        Route routeM28951f = m28951f();
        if (routeM28951f != null) {
            this.f25649j = routeM28951f;
            return true;
        }
        RouteSelector.Selection selection = this.f25644e;
        if ((selection == null || !selection.m29041b()) && (routeSelector = this.f25645f) != null) {
            return routeSelector.m29037a();
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m28955g(HttpUrl url) {
        AbstractC6118n.m27187e(url, "url");
        HttpUrl httpUrlM28311l = this.f25641b.m28311l();
        return url.m28508l() == httpUrlM28311l.m28508l() && AbstractC6118n.m27183a(url.m28504h(), httpUrlM28311l.m28504h());
    }

    /* JADX INFO: renamed from: h */
    public final void m28956h(IOException e7) {
        AbstractC6118n.m27187e(e7, "e");
        this.f25649j = null;
        if ((e7 instanceof StreamResetException) && ((StreamResetException) e7).f25974a == ErrorCode.REFUSED_STREAM) {
            this.f25646g++;
        } else if (e7 instanceof ConnectionShutdownException) {
            this.f25647h++;
        } else {
            this.f25648i++;
        }
    }
}
