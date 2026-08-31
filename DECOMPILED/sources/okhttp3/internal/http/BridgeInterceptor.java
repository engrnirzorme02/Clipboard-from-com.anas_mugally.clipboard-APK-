package okhttp3.internal.http;

import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import p072I6.AbstractC0659p;
import p072I6.C0656m;
import p152T5.AbstractC1638q;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class BridgeInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    private final CookieJar f25718a;

    public BridgeInterceptor(CookieJar cookieJar) {
        AbstractC6118n.m27187e(cookieJar, "cookieJar");
        this.f25718a = cookieJar;
    }

    /* JADX INFO: renamed from: b */
    private final String m29043b(List list) {
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        for (Object obj : list) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC1638q.m6773r();
            }
            Cookie cookie = (Cookie) obj;
            if (i7 > 0) {
                sb.append("; ");
            }
            sb.append(cookie.m28411e());
            sb.append('=');
            sb.append(cookie.m28413g());
            i7 = i8;
        }
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // okhttp3.Interceptor
    /* JADX INFO: renamed from: a */
    public Response mo14834a(Interceptor.Chain chain) {
        ResponseBody responseBodyM28681d;
        AbstractC6118n.m27187e(chain, "chain");
        Request requestMo28559b = chain.mo28559b();
        Request.Builder builderM28655i = requestMo28559b.m28655i();
        RequestBody requestBodyM28647a = requestMo28559b.m28647a();
        if (requestBodyM28647a != null) {
            MediaType mediaTypeMo28464b = requestBodyM28647a.mo28464b();
            if (mediaTypeMo28464b != null) {
                builderM28655i.m28659c("Content-Type", mediaTypeMo28464b.toString());
            }
            long jMo28463a = requestBodyM28647a.mo28463a();
            if (jMo28463a != -1) {
                builderM28655i.m28659c("Content-Length", String.valueOf(jMo28463a));
                builderM28655i.m28663g("Transfer-Encoding");
            } else {
                builderM28655i.m28659c("Transfer-Encoding", "chunked");
                builderM28655i.m28663g("Content-Length");
            }
        }
        boolean z7 = false;
        if (requestMo28559b.m28650d("Host") == null) {
            builderM28655i.m28659c("Host", Util.m28752U(requestMo28559b.m28656j(), false, 1, null));
        }
        if (requestMo28559b.m28650d("Connection") == null) {
            builderM28655i.m28659c("Connection", "Keep-Alive");
        }
        if (requestMo28559b.m28650d("Accept-Encoding") == null && requestMo28559b.m28650d("Range") == null) {
            builderM28655i.m28659c("Accept-Encoding", "gzip");
            z7 = true;
        }
        List listMo28423b = this.f25718a.mo28423b(requestMo28559b.m28656j());
        if (!listMo28423b.isEmpty()) {
            builderM28655i.m28659c("Cookie", m29043b(listMo28423b));
        }
        if (requestMo28559b.m28650d("User-Agent") == null) {
            builderM28655i.m28659c("User-Agent", "okhttp/4.12.0");
        }
        Response responseMo28558a = chain.mo28558a(builderM28655i.m28658b());
        HttpHeaders.m29061f(this.f25718a, requestMo28559b.m28656j(), responseMo28558a.m28686o0());
        Response.Builder builderM28707r = responseMo28558a.m28675Q0().m28707r(requestMo28559b);
        if (z7 && AbstractC6406h.m27564w("gzip", Response.m28671l0(responseMo28558a, "Content-Encoding", null, 2, null), true) && HttpHeaders.m29057b(responseMo28558a) && (responseBodyM28681d = responseMo28558a.m28681d()) != null) {
            C0656m c0656m = new C0656m(responseBodyM28681d.mo28327x());
            builderM28707r.m28700k(responseMo28558a.m28686o0().m28479e().m28488g("Content-Encoding").m28488g("Content-Length").m28485d());
            builderM28707r.m28693b(new RealResponseBody(Response.m28671l0(responseMo28558a, "Content-Type", null, 2, null), -1L, AbstractC0659p.m3132d(c0656m)));
        }
        return builderM28707r.m28694c();
    }
}
