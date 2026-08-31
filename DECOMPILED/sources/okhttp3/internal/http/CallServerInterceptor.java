package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import p072I6.AbstractC0659p;
import p072I6.InterfaceC0649f;
import p145S5.AbstractC1423a;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    private final boolean f25719a;

    public CallServerInterceptor(boolean z7) {
        this.f25719a = z7;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m29044b(int i7) {
        if (i7 == 100) {
            return true;
        }
        return 102 <= i7 && i7 < 200;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[Catch: IOException -> 0x006a, TRY_LEAVE, TryCatch #0 {IOException -> 0x006a, blocks: (B:17:0x0055, B:19:0x005b, B:30:0x0093, B:32:0x0099, B:22:0x006c, B:23:0x007b, B:25:0x0088), top: B:83:0x002c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [okhttp3.Response$Builder] */
    @Override // okhttp3.Interceptor
    /* JADX INFO: renamed from: a */
    public Response mo14834a(Interceptor.Chain chain) throws IOException {
        boolean z7;
        ?? r9;
        ?? M28942r;
        Response.Builder builder;
        AbstractC6118n.m27187e(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchangeM29073g = realInterceptorChain.m29073g();
        AbstractC6118n.m27184b(exchangeM29073g);
        Request requestM29075i = realInterceptorChain.m29075i();
        RequestBody requestBodyM28647a = requestM29075i.m28647a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            exchangeM29073g.m28946w(requestM29075i);
            ?? M29064b = HttpMethod.m29064b(requestM29075i.m28654h());
            try {
                if (M29064b == 0 || requestBodyM28647a == null) {
                    exchangeM29073g.m28940p();
                    z7 = true;
                    M29064b = 0;
                } else {
                    if (AbstractC6406h.m27564w("100-continue", requestM29075i.m28650d("Expect"), true)) {
                        exchangeM29073g.m28930f();
                        Response.Builder builderM28942r = exchangeM29073g.m28942r(true);
                        try {
                            exchangeM29073g.m28944t();
                            z7 = false;
                            builder = builderM28942r;
                        } catch (IOException e7) {
                            e = e7;
                            z7 = true;
                            r9 = builderM28942r;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!exchangeM29073g.m28935k()) {
                                M28942r = r9;
                                throw e;
                            }
                        }
                    } else {
                        z7 = true;
                        builder = null;
                    }
                    if (builder != null) {
                        exchangeM29073g.m28940p();
                        if (!exchangeM29073g.m28932h().m29014v()) {
                            M29064b = builder;
                            exchangeM29073g.m28939o();
                            M29064b = builder;
                        }
                    } else if (requestBodyM28647a.m28666c()) {
                        exchangeM29073g.m28930f();
                        requestBodyM28647a.mo28465e(AbstractC0659p.m3131c(exchangeM29073g.m28927c(requestM29075i, true)));
                    } else {
                        InterfaceC0649f interfaceC0649fM3131c = AbstractC0659p.m3131c(exchangeM29073g.m28927c(requestM29075i, false));
                        requestBodyM28647a.mo28465e(interfaceC0649fM3131c);
                        interfaceC0649fM3131c.close();
                    }
                }
                if (requestBodyM28647a != null) {
                    M29064b = builder;
                    if (!requestBodyM28647a.m28666c()) {
                        M29064b = builder;
                        M29064b = builder;
                        M29064b = builder;
                        exchangeM29073g.m28929e();
                    }
                } else {
                    M29064b = builder;
                    M29064b = builder;
                    M29064b = builder;
                    exchangeM29073g.m28929e();
                }
                M29064b = builder;
                e = null;
                M28942r = M29064b;
            } catch (IOException e8) {
                e = e8;
                r9 = M29064b;
            }
        } catch (IOException e9) {
            e = e9;
            z7 = true;
            r9 = 0;
        }
        if (M28942r == 0) {
            try {
                M28942r = exchangeM29073g.m28942r(false);
                AbstractC6118n.m27184b(M28942r);
                if (z7) {
                    exchangeM29073g.m28944t();
                    z7 = false;
                }
            } catch (IOException e10) {
                if (e == null) {
                    throw e10;
                }
                AbstractC1423a.m6060a(e, e10);
                throw e;
            }
        }
        Response responseM28694c = M28942r.m28707r(requestM29075i).m28698i(exchangeM29073g.m28932h().m29010r()).m28708s(jCurrentTimeMillis).m28706q(System.currentTimeMillis()).m28694c();
        int iM28672J = responseM28694c.m28672J();
        if (m29044b(iM28672J)) {
            Response.Builder builderM28942r2 = exchangeM29073g.m28942r(false);
            AbstractC6118n.m27184b(builderM28942r2);
            if (z7) {
                exchangeM29073g.m28944t();
            }
            responseM28694c = builderM28942r2.m28707r(requestM29075i).m28698i(exchangeM29073g.m28932h().m29010r()).m28708s(jCurrentTimeMillis).m28706q(System.currentTimeMillis()).m28694c();
            iM28672J = responseM28694c.m28672J();
        }
        exchangeM29073g.m28943s(responseM28694c);
        Response responseM28694c2 = (this.f25719a && iM28672J == 101) ? responseM28694c.m28675Q0().m28693b(Util.f25479c).m28694c() : responseM28694c.m28675Q0().m28693b(exchangeM29073g.m28941q(responseM28694c)).m28694c();
        if (AbstractC6406h.m27564w("close", responseM28694c2.m28679U0().m28650d("Connection"), true) || AbstractC6406h.m27564w("close", Response.m28671l0(responseM28694c2, "Connection", null, 2, null), true)) {
            exchangeM29073g.m28939o();
        }
        if (iM28672J == 204 || iM28672J == 205) {
            ResponseBody responseBodyM28681d = responseM28694c2.m28681d();
            if ((responseBodyM28681d != null ? responseBodyM28681d.mo28325m() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iM28672J);
                sb.append(" had non-zero Content-Length: ");
                ResponseBody responseBodyM28681d2 = responseM28694c2.m28681d();
                sb.append(responseBodyM28681d2 != null ? Long.valueOf(responseBodyM28681d2.mo28325m()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return responseM28694c2;
    }
}
