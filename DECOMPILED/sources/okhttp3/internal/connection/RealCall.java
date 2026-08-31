package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import p072I6.C0646c;
import p145S5.AbstractC1423a;
import p145S5.C1444v;
import p152T5.AbstractC1638q;

/* JADX INFO: loaded from: classes.dex */
public final class RealCall implements Call {

    /* JADX INFO: renamed from: A */
    private volatile boolean f25650A;

    /* JADX INFO: renamed from: B */
    private volatile Exchange f25651B;

    /* JADX INFO: renamed from: C */
    private volatile RealConnection f25652C;

    /* JADX INFO: renamed from: a */
    private final OkHttpClient f25653a;

    /* JADX INFO: renamed from: b */
    private final Request f25654b;

    /* JADX INFO: renamed from: c */
    private final boolean f25655c;

    /* JADX INFO: renamed from: d */
    private final RealConnectionPool f25656d;

    /* JADX INFO: renamed from: e */
    private final EventListener f25657e;

    /* JADX INFO: renamed from: f */
    private final RealCall$timeout$1 f25658f;

    /* JADX INFO: renamed from: r */
    private final AtomicBoolean f25659r;

    /* JADX INFO: renamed from: s */
    private Object f25660s;

    /* JADX INFO: renamed from: t */
    private ExchangeFinder f25661t;

    /* JADX INFO: renamed from: u */
    private RealConnection f25662u;

    /* JADX INFO: renamed from: v */
    private boolean f25663v;

    /* JADX INFO: renamed from: w */
    private Exchange f25664w;

    /* JADX INFO: renamed from: x */
    private boolean f25665x;

    /* JADX INFO: renamed from: y */
    private boolean f25666y;

    /* JADX INFO: renamed from: z */
    private boolean f25667z;

    public final class AsyncCall implements Runnable {

        /* JADX INFO: renamed from: a */
        private final Callback f25668a;

        /* JADX INFO: renamed from: b */
        private volatile AtomicInteger f25669b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ RealCall f25670c;

        /* JADX INFO: renamed from: a */
        public final void m28982a(ExecutorService executorService) {
            AbstractC6118n.m27187e(executorService, "executorService");
            Dispatcher dispatcherM28592k = this.f25670c.m28968j().m28592k();
            if (Util.f25484h && Thread.holdsLock(dispatcherM28592k)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcherM28592k);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e7) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e7);
                    this.f25670c.m28976t(interruptedIOException);
                    this.f25668a.mo28365b(this.f25670c, interruptedIOException);
                    this.f25670c.m28968j().m28592k().m28429d(this);
                }
            } catch (Throwable th) {
                this.f25670c.m28968j().m28592k().m28429d(this);
                throw th;
            }
        }

        /* JADX INFO: renamed from: b */
        public final AtomicInteger m28983b() {
            return this.f25669b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z7;
            Throwable th;
            IOException e7;
            Dispatcher dispatcherM28592k;
            String str = "OkHttp " + this.f25670c.m28977u();
            RealCall realCall = this.f25670c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                realCall.f25658f.m2994w();
                try {
                    try {
                        z7 = true;
                        try {
                            this.f25668a.mo28364a(realCall, realCall.m28972p());
                            dispatcherM28592k = realCall.m28968j().m28592k();
                        } catch (IOException e8) {
                            e7 = e8;
                            if (z7) {
                                Platform.f26006a.m29391g().m29381k("Callback failure for " + realCall.m28957A(), 4, e7);
                            } else {
                                this.f25668a.mo28365b(realCall, e7);
                            }
                            dispatcherM28592k = realCall.m28968j().m28592k();
                        } catch (Throwable th2) {
                            th = th2;
                            realCall.cancel();
                            if (!z7) {
                                IOException iOException = new IOException("canceled due to " + th);
                                AbstractC1423a.m6060a(iOException, th);
                                this.f25668a.mo28365b(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        realCall.m28968j().m28592k().m28429d(this);
                        throw th3;
                    }
                } catch (IOException e9) {
                    z7 = false;
                    e7 = e9;
                } catch (Throwable th4) {
                    z7 = false;
                    th = th4;
                }
                dispatcherM28592k.m28429d(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th5) {
                threadCurrentThread.setName(name);
                throw th5;
            }
        }
    }

    public static final class CallReference extends WeakReference<RealCall> {

        /* JADX INFO: renamed from: a */
        private final Object f25671a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall referent, Object obj) {
            super(referent);
            AbstractC6118n.m27187e(referent, "referent");
            this.f25671a = obj;
        }

        /* JADX INFO: renamed from: a */
        public final Object m28984a() {
            return this.f25671a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [I6.C, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient client, Request originalRequest, boolean z7) {
        AbstractC6118n.m27187e(client, "client");
        AbstractC6118n.m27187e(originalRequest, "originalRequest");
        this.f25653a = client;
        this.f25654b = originalRequest;
        this.f25655c = z7;
        this.f25656d = client.m28589h().m28391a();
        this.f25657e = client.m28594o().mo2539a(this);
        ?? r7 = new C0646c() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // p072I6.C0646c
            /* JADX INFO: renamed from: C */
            protected void mo2946C() {
                this.f25672o.cancel();
            }
        };
        r7.mo2956g(client.m28586e(), TimeUnit.MILLISECONDS);
        this.f25658f = r7;
        this.f25659r = new AtomicBoolean();
        this.f25667z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final String m28957A() {
        StringBuilder sb = new StringBuilder();
        sb.append(m28974r() ? "canceled " : "");
        sb.append(this.f25655c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(m28977u());
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    private final IOException m28960d(IOException iOException) {
        Socket socketM28978v;
        boolean z7 = Util.f25484h;
        if (z7 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.f25662u;
        if (realConnection != null) {
            if (z7 && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                socketM28978v = m28978v();
            }
            if (this.f25662u == null) {
                if (socketM28978v != null) {
                    Util.m28774n(socketM28978v);
                }
                this.f25657e.m28447l(this, realConnection);
            } else if (socketM28978v != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionM28963z = m28963z(iOException);
        if (iOException == null) {
            this.f25657e.m28439d(this);
            return iOExceptionM28963z;
        }
        EventListener eventListener = this.f25657e;
        AbstractC6118n.m27184b(iOExceptionM28963z);
        eventListener.m28440e(this, iOExceptionM28963z);
        return iOExceptionM28963z;
    }

    /* JADX INFO: renamed from: e */
    private final void m28961e() {
        this.f25660s = Platform.f26006a.m29391g().mo29353i("response.body().close()");
        this.f25657e.m28441f(this);
    }

    /* JADX INFO: renamed from: g */
    private final Address m28962g(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactoryM28582E;
        HostnameVerifier hostnameVerifierM28598s;
        CertificatePinner certificatePinnerM28587f;
        if (httpUrl.m28505i()) {
            sSLSocketFactoryM28582E = this.f25653a.m28582E();
            hostnameVerifierM28598s = this.f25653a.m28598s();
            certificatePinnerM28587f = this.f25653a.m28587f();
        } else {
            sSLSocketFactoryM28582E = null;
            hostnameVerifierM28598s = null;
            certificatePinnerM28587f = null;
        }
        return new Address(httpUrl.m28504h(), httpUrl.m28508l(), this.f25653a.m28593l(), this.f25653a.m28581D(), sSLSocketFactoryM28582E, hostnameVerifierM28598s, certificatePinnerM28587f, this.f25653a.m28605z(), this.f25653a.m28604y(), this.f25653a.m28603x(), this.f25653a.m28590i(), this.f25653a.m28578A());
    }

    /* JADX INFO: renamed from: z */
    private final IOException m28963z(IOException iOException) {
        if (this.f25663v || !m2995x()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: c */
    public final void m28964c(RealConnection connection) {
        AbstractC6118n.m27187e(connection, "connection");
        if (!Util.f25484h || Thread.holdsLock(connection)) {
            if (this.f25662u != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f25662u = connection;
            connection.m29006n().add(new CallReference(this, this.f25660s));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.f25650A) {
            return;
        }
        this.f25650A = true;
        Exchange exchange = this.f25651B;
        if (exchange != null) {
            exchange.m28926b();
        }
        RealConnection realConnection = this.f25652C;
        if (realConnection != null) {
            realConnection.m29003d();
        }
        this.f25657e.m28442g(this);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public RealCall clone() {
        return new RealCall(this.f25653a, this.f25654b, this.f25655c);
    }

    /* JADX INFO: renamed from: h */
    public final void m28966h(Request request, boolean z7) {
        AbstractC6118n.m27187e(request, "request");
        if (this.f25664w != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f25666y) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f25665x) {
                throw new IllegalStateException("Check failed.");
            }
            C1444v c1444v = C1444v.f4971a;
        }
        if (z7) {
            this.f25661t = new ExchangeFinder(this.f25656d, m28962g(request.m28656j()), this, this.f25657e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m28967i(boolean z7) {
        Exchange exchange;
        synchronized (this) {
            if (!this.f25667z) {
                throw new IllegalStateException("released");
            }
            C1444v c1444v = C1444v.f4971a;
        }
        if (z7 && (exchange = this.f25651B) != null) {
            exchange.m28928d();
        }
        this.f25664w = null;
    }

    /* JADX INFO: renamed from: j */
    public final OkHttpClient m28968j() {
        return this.f25653a;
    }

    /* JADX INFO: renamed from: k */
    public final RealConnection m28969k() {
        return this.f25662u;
    }

    /* JADX INFO: renamed from: l */
    public final EventListener m28970l() {
        return this.f25657e;
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: n */
    public Response mo28363n() {
        if (!this.f25659r.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        m2994w();
        m28961e();
        try {
            this.f25653a.m28592k().m28427a(this);
            return m28972p();
        } finally {
            this.f25653a.m28592k().m28430e(this);
        }
    }

    /* JADX INFO: renamed from: o */
    public final Exchange m28971o() {
        return this.f25664w;
    }

    /* JADX INFO: renamed from: p */
    public final Response m28972p() {
        ArrayList arrayList = new ArrayList();
        AbstractC1638q.m6779v(arrayList, this.f25653a.m28599t());
        arrayList.add(new RetryAndFollowUpInterceptor(this.f25653a));
        arrayList.add(new BridgeInterceptor(this.f25653a.m28591j()));
        arrayList.add(new CacheInterceptor(this.f25653a.m28585d()));
        arrayList.add(ConnectInterceptor.f25617a);
        if (!this.f25655c) {
            AbstractC1638q.m6779v(arrayList, this.f25653a.m28600u());
        }
        arrayList.add(new CallServerInterceptor(this.f25655c));
        try {
            try {
                Response responseMo28558a = new RealInterceptorChain(this, arrayList, 0, null, this.f25654b, this.f25653a.m28588g(), this.f25653a.m28579B(), this.f25653a.m28583G()).mo28558a(this.f25654b);
                if (m28974r()) {
                    Util.m28773m(responseMo28558a);
                    throw new IOException("Canceled");
                }
                m28976t(null);
                return responseMo28558a;
            } catch (IOException e7) {
                IOException iOExceptionM28976t = m28976t(e7);
                AbstractC6118n.m27185c(iOExceptionM28976t, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM28976t;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                m28976t(null);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final Exchange m28973q(RealInterceptorChain chain) throws IOException {
        AbstractC6118n.m27187e(chain, "chain");
        synchronized (this) {
            if (!this.f25667z) {
                throw new IllegalStateException("released");
            }
            if (this.f25666y) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f25665x) {
                throw new IllegalStateException("Check failed.");
            }
            C1444v c1444v = C1444v.f4971a;
        }
        ExchangeFinder exchangeFinder = this.f25661t;
        AbstractC6118n.m27184b(exchangeFinder);
        Exchange exchange = new Exchange(this, this.f25657e, exchangeFinder, exchangeFinder.m28952a(this.f25653a, chain));
        this.f25664w = exchange;
        this.f25651B = exchange;
        synchronized (this) {
            this.f25665x = true;
            this.f25666y = true;
        }
        if (this.f25650A) {
            throw new IOException("Canceled");
        }
        return exchange;
    }

    /* JADX INFO: renamed from: r */
    public boolean m28974r() {
        return this.f25650A;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    /* JADX INFO: renamed from: s */
    public final IOException m28975s(Exchange exchange, boolean z7, boolean z8, IOException iOException) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC6118n.m27187e(exchange, "exchange");
        if (AbstractC6118n.m27183a(exchange, this.f25651B)) {
            synchronized (this) {
                z9 = false;
                if (z7) {
                    try {
                        if (this.f25665x) {
                            if (z7) {
                                this.f25665x = false;
                            }
                            if (z8) {
                                this.f25666y = false;
                            }
                            z11 = this.f25665x;
                            if (z11) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (!z11) {
                                z9 = true;
                            }
                            z10 = z9;
                            z9 = z12;
                        } else if (z8 || !this.f25666y) {
                            z10 = false;
                        } else {
                            if (z7) {
                                this.f25665x = false;
                            }
                            if (z8) {
                                this.f25666y = false;
                            }
                            z11 = this.f25665x;
                            if (z11 || this.f25666y) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (!z11 && !this.f25666y && !this.f25667z) {
                                z9 = true;
                            }
                            z10 = z9;
                            z9 = z12;
                        }
                        C1444v c1444v = C1444v.f4971a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z8) {
                    }
                    z10 = false;
                    C1444v c1444v2 = C1444v.f4971a;
                }
            }
            if (z9) {
                this.f25651B = null;
                RealConnection realConnection = this.f25662u;
                if (realConnection != null) {
                    realConnection.m29011s();
                }
            }
            if (z10) {
                return m28960d(iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: t */
    public final IOException m28976t(IOException iOException) {
        boolean z7;
        synchronized (this) {
            try {
                z7 = false;
                if (this.f25667z) {
                    this.f25667z = false;
                    if (!this.f25665x && !this.f25666y) {
                        z7 = true;
                    }
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7 ? m28960d(iOException) : iOException;
    }

    /* JADX INFO: renamed from: u */
    public final String m28977u() {
        return this.f25654b.m28656j().m28510n();
    }

    /* JADX INFO: renamed from: v */
    public final Socket m28978v() {
        RealConnection realConnection = this.f25662u;
        AbstractC6118n.m27184b(realConnection);
        if (Util.f25484h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List listM29006n = realConnection.m29006n();
        Iterator it = listM29006n.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (AbstractC6118n.m27183a(((Reference) it.next()).get(), this)) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listM29006n.remove(i7);
        this.f25662u = null;
        if (listM29006n.isEmpty()) {
            realConnection.m28997C(System.nanoTime());
            if (this.f25656d.m29024c(realConnection)) {
                return realConnection.m28999E();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m28979w() {
        ExchangeFinder exchangeFinder = this.f25661t;
        AbstractC6118n.m27184b(exchangeFinder);
        return exchangeFinder.m28954e();
    }

    /* JADX INFO: renamed from: x */
    public final void m28980x(RealConnection realConnection) {
        this.f25652C = realConnection;
    }

    /* JADX INFO: renamed from: y */
    public final void m28981y() {
        if (this.f25663v) {
            throw new IllegalStateException("Check failed.");
        }
        this.f25663v = true;
        m2995x();
    }
}
