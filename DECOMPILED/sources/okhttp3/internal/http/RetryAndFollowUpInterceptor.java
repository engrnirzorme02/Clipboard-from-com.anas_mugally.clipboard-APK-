package okhttp3.internal.http;

import com.google.android.gms.common.api.C3553a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import p152T5.AbstractC1638q;
import p302m6.C6405g;

/* JADX INFO: loaded from: classes.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* JADX INFO: renamed from: b */
    public static final Companion f25740b = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final OkHttpClient f25741a;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public RetryAndFollowUpInterceptor(OkHttpClient client) {
        AbstractC6118n.m27187e(client, "client");
        this.f25741a = client;
    }

    /* JADX INFO: renamed from: b */
    private final Request m29081b(Response response, String str) {
        String strM28671l0;
        HttpUrl httpUrlM28511o;
        if (!this.f25741a.m28595p() || (strM28671l0 = Response.m28671l0(response, "Location", null, 2, null)) == null || (httpUrlM28511o = response.m28679U0().m28656j().m28511o(strM28671l0)) == null) {
            return null;
        }
        if (!AbstractC6118n.m27183a(httpUrlM28511o.m28512p(), response.m28679U0().m28656j().m28512p()) && !this.f25741a.m28596q()) {
            return null;
        }
        Request.Builder builderM28655i = response.m28679U0().m28655i();
        if (HttpMethod.m29064b(str)) {
            int iM28672J = response.m28672J();
            HttpMethod httpMethod = HttpMethod.f25726a;
            boolean z7 = httpMethod.m29068d(str) || iM28672J == 308 || iM28672J == 307;
            if (!httpMethod.m29067c(str) || iM28672J == 308 || iM28672J == 307) {
                builderM28655i.m28661e(str, z7 ? response.m28679U0().m28647a() : null);
            } else {
                builderM28655i.m28661e("GET", null);
            }
            if (!z7) {
                builderM28655i.m28663g("Transfer-Encoding");
                builderM28655i.m28663g("Content-Length");
                builderM28655i.m28663g("Content-Type");
            }
        }
        if (!Util.m28770j(response.m28679U0().m28656j(), httpUrlM28511o)) {
            builderM28655i.m28663g("Authorization");
        }
        return builderM28655i.m28665i(httpUrlM28511o).m28658b();
    }

    /* JADX INFO: renamed from: c */
    private final Request m29082c(Response response, Exchange exchange) throws ProtocolException {
        RealConnection realConnectionM28932h;
        Route routeM28996A = (exchange == null || (realConnectionM28932h = exchange.m28932h()) == null) ? null : realConnectionM28932h.m28996A();
        int iM28672J = response.m28672J();
        String strM28654h = response.m28679U0().m28654h();
        if (iM28672J != 307 && iM28672J != 308) {
            if (iM28672J == 401) {
                return this.f25741a.m28584c().mo28312a(routeM28996A, response);
            }
            if (iM28672J == 421) {
                RequestBody requestBodyM28647a = response.m28679U0().m28647a();
                if ((requestBodyM28647a != null && requestBodyM28647a.m28667d()) || exchange == null || !exchange.m28936l()) {
                    return null;
                }
                exchange.m28932h().m29017y();
                return response.m28679U0();
            }
            if (iM28672J == 503) {
                Response responseM28676R0 = response.m28676R0();
                if ((responseM28676R0 == null || responseM28676R0.m28672J() != 503) && m29086g(response, C3553a.e.API_PRIORITY_OTHER) == 0) {
                    return response.m28679U0();
                }
                return null;
            }
            if (iM28672J == 407) {
                AbstractC6118n.m27184b(routeM28996A);
                if (routeM28996A.m28715b().type() == Proxy.Type.HTTP) {
                    return this.f25741a.m28605z().mo28312a(routeM28996A, response);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iM28672J == 408) {
                if (!this.f25741a.m28580C()) {
                    return null;
                }
                RequestBody requestBodyM28647a2 = response.m28679U0().m28647a();
                if (requestBodyM28647a2 != null && requestBodyM28647a2.m28667d()) {
                    return null;
                }
                Response responseM28676R1 = response.m28676R0();
                if ((responseM28676R1 == null || responseM28676R1.m28672J() != 408) && m29086g(response, 0) <= 0) {
                    return response.m28679U0();
                }
                return null;
            }
            switch (iM28672J) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return m29081b(response, strM28654h);
    }

    /* JADX INFO: renamed from: d */
    private final boolean m29083d(IOException iOException, boolean z7) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z7;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m29084e(IOException iOException, RealCall realCall, Request request, boolean z7) {
        if (this.f25741a.m28580C()) {
            return !(z7 && m29085f(iOException, request)) && m29083d(iOException, z7) && realCall.m28979w();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private final boolean m29085f(IOException iOException, Request request) {
        RequestBody requestBodyM28647a = request.m28647a();
        return (requestBodyM28647a != null && requestBodyM28647a.m28667d()) || (iOException instanceof FileNotFoundException);
    }

    /* JADX INFO: renamed from: g */
    private final int m29086g(Response response, int i7) {
        String strM28671l0 = Response.m28671l0(response, "Retry-After", null, 2, null);
        if (strM28671l0 == null) {
            return i7;
        }
        if (!new C6405g("\\d+").m27529a(strM28671l0)) {
            return C3553a.e.API_PRIORITY_OTHER;
        }
        Integer numValueOf = Integer.valueOf(strM28671l0);
        AbstractC6118n.m27186d(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // okhttp3.Interceptor
    /* JADX INFO: renamed from: a */
    public Response mo14834a(Interceptor.Chain chain) {
        Response responseMo28558a;
        AbstractC6118n.m27187e(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request requestM29075i = realInterceptorChain.m29075i();
        RealCall realCallM29071e = realInterceptorChain.m29071e();
        List listJ = AbstractC1638q.m6765j();
        int i7 = 0;
        Response response = null;
        while (true) {
            boolean z7 = true;
            while (true) {
                realCallM29071e.m28966h(requestM29075i, z7);
                try {
                    if (realCallM29071e.m28974r()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        responseMo28558a = realInterceptorChain.mo28558a(requestM29075i);
                    } catch (IOException e7) {
                        if (!m29084e(e7, realCallM29071e, requestM29075i, !(e7 instanceof ConnectionShutdownException))) {
                            throw Util.m28761b0(e7, listJ);
                        }
                        listJ = AbstractC1638q.m6583W(listJ, e7);
                        realCallM29071e.m28967i(true);
                        z7 = false;
                    } catch (RouteException e8) {
                        if (!m29084e(e8.m29031c(), realCallM29071e, requestM29075i, false)) {
                            throw Util.m28761b0(e8.m29030b(), listJ);
                        }
                        listJ = AbstractC1638q.m6583W(listJ, e8.m29030b());
                        realCallM29071e.m28967i(true);
                        z7 = false;
                    }
                    realCallM29071e.m28967i(true);
                    z7 = false;
                } catch (Throwable th) {
                    realCallM29071e.m28967i(true);
                    throw th;
                }
            }
            if (response != null) {
                responseMo28558a = responseMo28558a.m28675Q0().m28704o(response.m28675Q0().m28693b(null).m28694c()).m28694c();
            }
            response = responseMo28558a;
            Exchange exchangeM28971o = realCallM29071e.m28971o();
            Request requestM29082c = m29082c(response, exchangeM28971o);
            if (requestM29082c == null) {
                if (exchangeM28971o != null && exchangeM28971o.m28937m()) {
                    realCallM29071e.m28981y();
                }
                realCallM29071e.m28967i(false);
                return response;
            }
            RequestBody requestBodyM28647a = requestM29082c.m28647a();
            if (requestBodyM28647a != null && requestBodyM28647a.m28667d()) {
                realCallM29071e.m28967i(false);
                return response;
            }
            ResponseBody responseBodyM28681d = response.m28681d();
            if (responseBodyM28681d != null) {
                Util.m28773m(responseBodyM28681d);
            }
            i7++;
            if (i7 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i7);
            }
            realCallM29071e.m28967i(true);
            requestM29075i = requestM29082c;
        }
    }
}
