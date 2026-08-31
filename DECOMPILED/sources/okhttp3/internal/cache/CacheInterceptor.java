package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import p072I6.AbstractC0659p;
import p072I6.C0641C;
import p072I6.C0648e;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0649f;
import p072I6.InterfaceC0650g;
import p072I6.InterfaceC0669z;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class CacheInterceptor implements Interceptor {

    /* JADX INFO: renamed from: b */
    public static final Companion f25488b = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final Cache f25489a;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final Headers m28791c(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i7 = 0; i7 < size; i7++) {
                String strM28478b = headers.m28478b(i7);
                String strM28480g = headers.m28480g(i7);
                if ((!AbstractC6406h.m27564w("Warning", strM28478b, true) || !AbstractC6406h.m27557K(strM28480g, "1", false, 2, null)) && (m28792d(strM28478b) || !m28793e(strM28478b) || headers2.m28477a(strM28478b) == null)) {
                    builder.m28484c(strM28478b, strM28480g);
                }
            }
            int size2 = headers2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                String strM28478b2 = headers2.m28478b(i8);
                if (!m28792d(strM28478b2) && m28793e(strM28478b2)) {
                    builder.m28484c(strM28478b2, headers2.m28480g(i8));
                }
            }
            return builder.m28485d();
        }

        /* JADX INFO: renamed from: d */
        private final boolean m28792d(String str) {
            return AbstractC6406h.m27564w("Content-Length", str, true) || AbstractC6406h.m27564w("Content-Encoding", str, true) || AbstractC6406h.m27564w("Content-Type", str, true);
        }

        /* JADX INFO: renamed from: e */
        private final boolean m28793e(String str) {
            return (AbstractC6406h.m27564w("Connection", str, true) || AbstractC6406h.m27564w("Keep-Alive", str, true) || AbstractC6406h.m27564w("Proxy-Authenticate", str, true) || AbstractC6406h.m27564w("Proxy-Authorization", str, true) || AbstractC6406h.m27564w("TE", str, true) || AbstractC6406h.m27564w("Trailers", str, true) || AbstractC6406h.m27564w("Transfer-Encoding", str, true) || AbstractC6406h.m27564w("Upgrade", str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public final Response m28794f(Response response) {
            return (response != null ? response.m28681d() : null) != null ? response.m28675Q0().m28693b(null).m28694c() : response;
        }

        private Companion() {
        }
    }

    public CacheInterceptor(Cache cache) {
        this.f25489a = cache;
    }

    /* JADX INFO: renamed from: b */
    private final Response m28788b(final CacheRequest cacheRequest, Response response) {
        if (cacheRequest == null) {
            return response;
        }
        InterfaceC0669z interfaceC0669zMo28343b = cacheRequest.mo28343b();
        ResponseBody responseBodyM28681d = response.m28681d();
        AbstractC6118n.m27184b(responseBodyM28681d);
        final InterfaceC0650g interfaceC0650gMo28327x = responseBodyM28681d.mo28327x();
        final InterfaceC0649f interfaceC0649fM3131c = AbstractC0659p.m3131c(interfaceC0669zMo28343b);
        InterfaceC0640B interfaceC0640B = new InterfaceC0640B() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1

            /* JADX INFO: renamed from: a */
            private boolean f25490a;

            @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (!this.f25490a && !Util.m28779s(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f25490a = true;
                    cacheRequest.mo28342a();
                }
                interfaceC0650gMo28327x.close();
            }

            @Override // p072I6.InterfaceC0640B
            /* JADX INFO: renamed from: g */
            public C0641C mo2948g() {
                return interfaceC0650gMo28327x.mo2948g();
            }

            @Override // p072I6.InterfaceC0640B
            /* JADX INFO: renamed from: w */
            public long mo2949w(C0648e sink, long j7) throws IOException {
                AbstractC6118n.m27187e(sink, "sink");
                try {
                    long jMo2949w = interfaceC0650gMo28327x.mo2949w(sink, j7);
                    if (jMo2949w != -1) {
                        sink.m3050k0(interfaceC0649fM3131c.mo3043f(), sink.m3046h1() - jMo2949w, jMo2949w);
                        interfaceC0649fM3131c.mo3016N();
                        return jMo2949w;
                    }
                    if (!this.f25490a) {
                        this.f25490a = true;
                        interfaceC0649fM3131c.close();
                    }
                    return -1L;
                } catch (IOException e7) {
                    if (this.f25490a) {
                        throw e7;
                    }
                    this.f25490a = true;
                    cacheRequest.mo28342a();
                    throw e7;
                }
            }
        };
        return response.m28675Q0().m28693b(new RealResponseBody(Response.m28671l0(response, "Content-Type", null, 2, null), response.m28681d().mo28325m(), AbstractC0659p.m3132d(interfaceC0640B))).m28694c();
    }

    @Override // okhttp3.Interceptor
    /* JADX INFO: renamed from: a */
    public Response mo14834a(Interceptor.Chain chain) {
        EventListener eventListenerM28970l;
        ResponseBody responseBodyM28681d;
        ResponseBody responseBodyM28681d2;
        ResponseBody responseBodyM28681d3;
        AbstractC6118n.m27187e(chain, "chain");
        Call call = chain.call();
        Cache cache = this.f25489a;
        Response responseM28319m = cache != null ? cache.m28319m(chain.mo28559b()) : null;
        CacheStrategy cacheStrategyM28803b = new CacheStrategy.Factory(System.currentTimeMillis(), chain.mo28559b(), responseM28319m).m28803b();
        Request requestM28796b = cacheStrategyM28803b.m28796b();
        Response responseM28795a = cacheStrategyM28803b.m28795a();
        Cache cache2 = this.f25489a;
        if (cache2 != null) {
            cache2.m28321o0(cacheStrategyM28803b);
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        if (realCall == null || (eventListenerM28970l = realCall.m28970l()) == null) {
            eventListenerM28970l = EventListener.f25259b;
        }
        if (responseM28319m != null && responseM28795a == null && (responseBodyM28681d3 = responseM28319m.m28681d()) != null) {
            Util.m28773m(responseBodyM28681d3);
        }
        if (requestM28796b == null && responseM28795a == null) {
            Response responseM28694c = new Response.Builder().m28707r(chain.mo28559b()).m28705p(Protocol.HTTP_1_1).m28696g(504).m28702m("Unsatisfiable Request (only-if-cached)").m28693b(Util.f25479c).m28708s(-1L).m28706q(System.currentTimeMillis()).m28694c();
            eventListenerM28970l.m28433A(call, responseM28694c);
            return responseM28694c;
        }
        if (requestM28796b == null) {
            AbstractC6118n.m27184b(responseM28795a);
            Response responseM28694c2 = responseM28795a.m28675Q0().m28695d(f25488b.m28794f(responseM28795a)).m28694c();
            eventListenerM28970l.m28437b(call, responseM28694c2);
            return responseM28694c2;
        }
        if (responseM28795a != null) {
            eventListenerM28970l.m28436a(call, responseM28795a);
        } else if (this.f25489a != null) {
            eventListenerM28970l.m28438c(call);
        }
        try {
            Response responseMo28558a = chain.mo28558a(requestM28796b);
            if (responseMo28558a == null && responseM28319m != null && (responseBodyM28681d2 = responseM28319m.m28681d()) != null) {
                Util.m28773m(responseBodyM28681d2);
            }
            if (responseM28795a != null) {
                if (responseMo28558a != null && responseMo28558a.m28672J() == 304) {
                    Response.Builder builderM28675Q0 = responseM28795a.m28675Q0();
                    Companion companion = f25488b;
                    Response responseM28694c3 = builderM28675Q0.m28700k(companion.m28791c(responseM28795a.m28686o0(), responseMo28558a.m28686o0())).m28708s(responseMo28558a.m28680V0()).m28706q(responseMo28558a.m28678T0()).m28695d(companion.m28794f(responseM28795a)).m28703n(companion.m28794f(responseMo28558a)).m28694c();
                    ResponseBody responseBodyM28681d4 = responseMo28558a.m28681d();
                    AbstractC6118n.m27184b(responseBodyM28681d4);
                    responseBodyM28681d4.close();
                    Cache cache3 = this.f25489a;
                    AbstractC6118n.m27184b(cache3);
                    cache3.m28318l0();
                    this.f25489a.m28322p0(responseM28795a, responseM28694c3);
                    eventListenerM28970l.m28437b(call, responseM28694c3);
                    return responseM28694c3;
                }
                ResponseBody responseBodyM28681d5 = responseM28795a.m28681d();
                if (responseBodyM28681d5 != null) {
                    Util.m28773m(responseBodyM28681d5);
                }
            }
            AbstractC6118n.m27184b(responseMo28558a);
            Response.Builder builderM28675Q1 = responseMo28558a.m28675Q0();
            Companion companion2 = f25488b;
            Response responseM28694c4 = builderM28675Q1.m28695d(companion2.m28794f(responseM28795a)).m28703n(companion2.m28794f(responseMo28558a)).m28694c();
            if (this.f25489a != null) {
                if (HttpHeaders.m29057b(responseM28694c4) && CacheStrategy.f25494c.m28797a(responseM28694c4, requestM28796b)) {
                    Response responseM28788b = m28788b(this.f25489a.m28314J(responseM28694c4), responseM28694c4);
                    if (responseM28795a != null) {
                        eventListenerM28970l.m28438c(call);
                    }
                    return responseM28788b;
                }
                if (HttpMethod.f25726a.m29066a(requestM28796b.m28654h())) {
                    try {
                        this.f25489a.m28315Q(requestM28796b);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseM28694c4;
        } catch (Throwable th) {
            if (responseM28319m != null && (responseBodyM28681d = responseM28319m.m28681d()) != null) {
                Util.m28773m(responseBodyM28681d);
            }
            throw th;
        }
    }
}
