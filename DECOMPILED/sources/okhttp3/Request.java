package okhttp3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import p145S5.C1435m;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1638q;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class Request {

    /* JADX INFO: renamed from: a */
    private final HttpUrl f25411a;

    /* JADX INFO: renamed from: b */
    private final String f25412b;

    /* JADX INFO: renamed from: c */
    private final Headers f25413c;

    /* JADX INFO: renamed from: d */
    private final RequestBody f25414d;

    /* JADX INFO: renamed from: e */
    private final Map f25415e;

    /* JADX INFO: renamed from: f */
    private CacheControl f25416f;

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map tags) {
        AbstractC6118n.m27187e(url, "url");
        AbstractC6118n.m27187e(method, "method");
        AbstractC6118n.m27187e(headers, "headers");
        AbstractC6118n.m27187e(tags, "tags");
        this.f25411a = url;
        this.f25412b = method;
        this.f25413c = headers;
        this.f25414d = requestBody;
        this.f25415e = tags;
    }

    /* JADX INFO: renamed from: a */
    public final RequestBody m28647a() {
        return this.f25414d;
    }

    /* JADX INFO: renamed from: b */
    public final CacheControl m28648b() {
        CacheControl cacheControl = this.f25416f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControlM28362b = CacheControl.f25052n.m28362b(this.f25413c);
        this.f25416f = cacheControlM28362b;
        return cacheControlM28362b;
    }

    /* JADX INFO: renamed from: c */
    public final Map m28649c() {
        return this.f25415e;
    }

    /* JADX INFO: renamed from: d */
    public final String m28650d(String name) {
        AbstractC6118n.m27187e(name, "name");
        return this.f25413c.m28477a(name);
    }

    /* JADX INFO: renamed from: e */
    public final List m28651e(String name) {
        AbstractC6118n.m27187e(name, "name");
        return this.f25413c.m28481k(name);
    }

    /* JADX INFO: renamed from: f */
    public final Headers m28652f() {
        return this.f25413c;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m28653g() {
        return this.f25411a.m28505i();
    }

    /* JADX INFO: renamed from: h */
    public final String m28654h() {
        return this.f25412b;
    }

    /* JADX INFO: renamed from: i */
    public final Builder m28655i() {
        return new Builder(this);
    }

    /* JADX INFO: renamed from: j */
    public final HttpUrl m28656j() {
        return this.f25411a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f25412b);
        sb.append(", url=");
        sb.append(this.f25411a);
        if (this.f25413c.size() != 0) {
            sb.append(", headers=[");
            int i7 = 0;
            for (C1435m c1435m : this.f25413c) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    AbstractC1638q.m6773r();
                }
                C1435m c1435m2 = c1435m;
                String str = (String) c1435m2.m6068a();
                String str2 = (String) c1435m2.m6069b();
                if (i7 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i7 = i8;
            }
            sb.append(']');
        }
        if (!this.f25415e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f25415e);
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static class Builder {

        /* JADX INFO: renamed from: a */
        private HttpUrl f25417a;

        /* JADX INFO: renamed from: b */
        private String f25418b;

        /* JADX INFO: renamed from: c */
        private Headers.Builder f25419c;

        /* JADX INFO: renamed from: d */
        private RequestBody f25420d;

        /* JADX INFO: renamed from: e */
        private Map f25421e;

        public Builder() {
            this.f25421e = new LinkedHashMap();
            this.f25418b = "GET";
            this.f25419c = new Headers.Builder();
        }

        /* JADX INFO: renamed from: a */
        public Builder m28657a(String name, String value) {
            AbstractC6118n.m27187e(name, "name");
            AbstractC6118n.m27187e(value, "value");
            this.f25419c.m28482a(name, value);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public Request m28658b() {
            HttpUrl httpUrl = this.f25417a;
            if (httpUrl != null) {
                return new Request(httpUrl, this.f25418b, this.f25419c.m28485d(), this.f25420d, Util.m28754W(this.f25421e));
            }
            throw new IllegalStateException("url == null");
        }

        /* JADX INFO: renamed from: c */
        public Builder m28659c(String name, String value) {
            AbstractC6118n.m27187e(name, "name");
            AbstractC6118n.m27187e(value, "value");
            this.f25419c.m28489h(name, value);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public Builder m28660d(Headers headers) {
            AbstractC6118n.m27187e(headers, "headers");
            this.f25419c = headers.m28479e();
            return this;
        }

        /* JADX INFO: renamed from: e */
        public Builder m28661e(String method, RequestBody requestBody) {
            AbstractC6118n.m27187e(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                if (HttpMethod.m29065e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!HttpMethod.m29064b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f25418b = method;
            this.f25420d = requestBody;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public Builder m28662f(RequestBody body) {
            AbstractC6118n.m27187e(body, "body");
            return m28661e("POST", body);
        }

        /* JADX INFO: renamed from: g */
        public Builder m28663g(String name) {
            AbstractC6118n.m27187e(name, "name");
            this.f25419c.m28488g(name);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public Builder m28664h(String url) {
            AbstractC6118n.m27187e(url, "url");
            if (AbstractC6406h.m27555I(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = url.substring(3);
                AbstractC6118n.m27186d(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                url = sb.toString();
            } else if (AbstractC6406h.m27555I(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String strSubstring2 = url.substring(4);
                AbstractC6118n.m27186d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                url = sb2.toString();
            }
            return m28665i(HttpUrl.f25278k.m28552d(url));
        }

        /* JADX INFO: renamed from: i */
        public Builder m28665i(HttpUrl url) {
            AbstractC6118n.m27187e(url, "url");
            this.f25417a = url;
            return this;
        }

        public Builder(Request request) {
            Map mapT;
            AbstractC6118n.m27187e(request, "request");
            this.f25421e = new LinkedHashMap();
            this.f25417a = request.m28656j();
            this.f25418b = request.m28654h();
            this.f25420d = request.m28647a();
            if (request.m28649c().isEmpty()) {
                mapT = new LinkedHashMap();
            } else {
                mapT = AbstractC1610H.m6638t(request.m28649c());
            }
            this.f25421e = mapT;
            this.f25419c = request.m28652f().m28479e();
        }
    }
}
