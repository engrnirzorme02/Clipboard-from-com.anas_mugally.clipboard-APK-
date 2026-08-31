package okhttp3.internal.http;

import java.net.Proxy;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes.dex */
public final class RequestLine {

    /* JADX INFO: renamed from: a */
    public static final RequestLine f25739a = new RequestLine();

    private RequestLine() {
    }

    /* JADX INFO: renamed from: b */
    private final boolean m29078b(Request request, Proxy.Type type) {
        return !request.m28653g() && type == Proxy.Type.HTTP;
    }

    /* JADX INFO: renamed from: a */
    public final String m29079a(Request request, Proxy.Type proxyType) {
        AbstractC6118n.m27187e(request, "request");
        AbstractC6118n.m27187e(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.m28654h());
        sb.append(' ');
        RequestLine requestLine = f25739a;
        if (requestLine.m29078b(request, proxyType)) {
            sb.append(request.m28656j());
        } else {
            sb.append(requestLine.m29080c(request.m28656j()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: c */
    public final String m29080c(HttpUrl url) {
        AbstractC6118n.m27187e(url, "url");
        String strM28500d = url.m28500d();
        String strM28502f = url.m28502f();
        if (strM28502f == null) {
            return strM28500d;
        }
        return strM28500d + '?' + strM28502f;
    }
}
