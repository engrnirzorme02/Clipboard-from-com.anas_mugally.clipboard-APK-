package okhttp3;

import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import p152T5.AbstractC1638q;

/* JADX INFO: loaded from: classes.dex */
public final class Response implements Closeable {

    /* JADX INFO: renamed from: a */
    private final Request f25431a;

    /* JADX INFO: renamed from: b */
    private final Protocol f25432b;

    /* JADX INFO: renamed from: c */
    private final String f25433c;

    /* JADX INFO: renamed from: d */
    private final int f25434d;

    /* JADX INFO: renamed from: e */
    private final Handshake f25435e;

    /* JADX INFO: renamed from: f */
    private final Headers f25436f;

    /* JADX INFO: renamed from: r */
    private final ResponseBody f25437r;

    /* JADX INFO: renamed from: s */
    private final Response f25438s;

    /* JADX INFO: renamed from: t */
    private final Response f25439t;

    /* JADX INFO: renamed from: u */
    private final Response f25440u;

    /* JADX INFO: renamed from: v */
    private final long f25441v;

    /* JADX INFO: renamed from: w */
    private final long f25442w;

    /* JADX INFO: renamed from: x */
    private final Exchange f25443x;

    /* JADX INFO: renamed from: y */
    private CacheControl f25444y;

    public Response(Request request, Protocol protocol, String message, int i7, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j7, long j8, Exchange exchange) {
        AbstractC6118n.m27187e(request, "request");
        AbstractC6118n.m27187e(protocol, "protocol");
        AbstractC6118n.m27187e(message, "message");
        AbstractC6118n.m27187e(headers, "headers");
        this.f25431a = request;
        this.f25432b = protocol;
        this.f25433c = message;
        this.f25434d = i7;
        this.f25435e = handshake;
        this.f25436f = headers;
        this.f25437r = responseBody;
        this.f25438s = response;
        this.f25439t = response2;
        this.f25440u = response3;
        this.f25441v = j7;
        this.f25442w = j8;
        this.f25443x = exchange;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ String m28671l0(Response response, String str, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        return response.m28683k0(str, str2);
    }

    /* JADX INFO: renamed from: J */
    public final int m28672J() {
        return this.f25434d;
    }

    /* JADX INFO: renamed from: K0 */
    public final Response m28673K0() {
        return this.f25438s;
    }

    /* JADX INFO: renamed from: Q */
    public final Exchange m28674Q() {
        return this.f25443x;
    }

    /* JADX INFO: renamed from: Q0 */
    public final Builder m28675Q0() {
        return new Builder(this);
    }

    /* JADX INFO: renamed from: R0 */
    public final Response m28676R0() {
        return this.f25440u;
    }

    /* JADX INFO: renamed from: S0 */
    public final Protocol m28677S0() {
        return this.f25432b;
    }

    /* JADX INFO: renamed from: T0 */
    public final long m28678T0() {
        return this.f25442w;
    }

    /* JADX INFO: renamed from: U0 */
    public final Request m28679U0() {
        return this.f25431a;
    }

    /* JADX INFO: renamed from: V0 */
    public final long m28680V0() {
        return this.f25441v;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.f25437r;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    /* JADX INFO: renamed from: d */
    public final ResponseBody m28681d() {
        return this.f25437r;
    }

    /* JADX INFO: renamed from: d0 */
    public final Handshake m28682d0() {
        return this.f25435e;
    }

    /* JADX INFO: renamed from: k0 */
    public final String m28683k0(String name, String str) {
        AbstractC6118n.m27187e(name, "name");
        String strM28477a = this.f25436f.m28477a(name);
        return strM28477a == null ? str : strM28477a;
    }

    /* JADX INFO: renamed from: m */
    public final CacheControl m28684m() {
        CacheControl cacheControl = this.f25444y;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControlM28362b = CacheControl.f25052n.m28362b(this.f25436f);
        this.f25444y = cacheControlM28362b;
        return cacheControlM28362b;
    }

    /* JADX INFO: renamed from: n */
    public final Response m28685n() {
        return this.f25439t;
    }

    /* JADX INFO: renamed from: o0 */
    public final Headers m28686o0() {
        return this.f25436f;
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m28687p0() {
        int i7 = this.f25434d;
        return 200 <= i7 && i7 < 300;
    }

    public String toString() {
        return "Response{protocol=" + this.f25432b + ", code=" + this.f25434d + ", message=" + this.f25433c + ", url=" + this.f25431a.m28656j() + '}';
    }

    /* JADX INFO: renamed from: w0 */
    public final String m28688w0() {
        return this.f25433c;
    }

    /* JADX INFO: renamed from: x */
    public final List m28689x() {
        String str;
        Headers headers = this.f25436f;
        int i7 = this.f25434d;
        if (i7 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i7 != 407) {
                return AbstractC1638q.m6765j();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.m29056a(headers, str);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a */
        private Request f25445a;

        /* JADX INFO: renamed from: b */
        private Protocol f25446b;

        /* JADX INFO: renamed from: c */
        private int f25447c;

        /* JADX INFO: renamed from: d */
        private String f25448d;

        /* JADX INFO: renamed from: e */
        private Handshake f25449e;

        /* JADX INFO: renamed from: f */
        private Headers.Builder f25450f;

        /* JADX INFO: renamed from: g */
        private ResponseBody f25451g;

        /* JADX INFO: renamed from: h */
        private Response f25452h;

        /* JADX INFO: renamed from: i */
        private Response f25453i;

        /* JADX INFO: renamed from: j */
        private Response f25454j;

        /* JADX INFO: renamed from: k */
        private long f25455k;

        /* JADX INFO: renamed from: l */
        private long f25456l;

        /* JADX INFO: renamed from: m */
        private Exchange f25457m;

        public Builder() {
            this.f25447c = -1;
            this.f25450f = new Headers.Builder();
        }

        /* JADX INFO: renamed from: e */
        private final void m28690e(Response response) {
            if (response != null && response.m28681d() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* JADX INFO: renamed from: f */
        private final void m28691f(String str, Response response) {
            if (response != null) {
                if (response.m28681d() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (response.m28673K0() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (response.m28685n() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (response.m28676R0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        /* JADX INFO: renamed from: a */
        public Builder m28692a(String name, String value) {
            AbstractC6118n.m27187e(name, "name");
            AbstractC6118n.m27187e(value, "value");
            this.f25450f.m28482a(name, value);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public Builder m28693b(ResponseBody responseBody) {
            this.f25451g = responseBody;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public Response m28694c() {
            int i7 = this.f25447c;
            if (i7 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f25447c).toString());
            }
            Request request = this.f25445a;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f25446b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f25448d;
            if (str != null) {
                return new Response(request, protocol, str, i7, this.f25449e, this.f25450f.m28485d(), this.f25451g, this.f25452h, this.f25453i, this.f25454j, this.f25455k, this.f25456l, this.f25457m);
            }
            throw new IllegalStateException("message == null");
        }

        /* JADX INFO: renamed from: d */
        public Builder m28695d(Response response) {
            m28691f("cacheResponse", response);
            this.f25453i = response;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public Builder m28696g(int i7) {
            this.f25447c = i7;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final int m28697h() {
            return this.f25447c;
        }

        /* JADX INFO: renamed from: i */
        public Builder m28698i(Handshake handshake) {
            this.f25449e = handshake;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public Builder m28699j(String name, String value) {
            AbstractC6118n.m27187e(name, "name");
            AbstractC6118n.m27187e(value, "value");
            this.f25450f.m28489h(name, value);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public Builder m28700k(Headers headers) {
            AbstractC6118n.m27187e(headers, "headers");
            this.f25450f = headers.m28479e();
            return this;
        }

        /* JADX INFO: renamed from: l */
        public final void m28701l(Exchange deferredTrailers) {
            AbstractC6118n.m27187e(deferredTrailers, "deferredTrailers");
            this.f25457m = deferredTrailers;
        }

        /* JADX INFO: renamed from: m */
        public Builder m28702m(String message) {
            AbstractC6118n.m27187e(message, "message");
            this.f25448d = message;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public Builder m28703n(Response response) {
            m28691f("networkResponse", response);
            this.f25452h = response;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public Builder m28704o(Response response) {
            m28690e(response);
            this.f25454j = response;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public Builder m28705p(Protocol protocol) {
            AbstractC6118n.m27187e(protocol, "protocol");
            this.f25446b = protocol;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public Builder m28706q(long j7) {
            this.f25456l = j7;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public Builder m28707r(Request request) {
            AbstractC6118n.m27187e(request, "request");
            this.f25445a = request;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public Builder m28708s(long j7) {
            this.f25455k = j7;
            return this;
        }

        public Builder(Response response) {
            AbstractC6118n.m27187e(response, "response");
            this.f25447c = -1;
            this.f25445a = response.m28679U0();
            this.f25446b = response.m28677S0();
            this.f25447c = response.m28672J();
            this.f25448d = response.m28688w0();
            this.f25449e = response.m28682d0();
            this.f25450f = response.m28686o0().m28479e();
            this.f25451g = response.m28681d();
            this.f25452h = response.m28673K0();
            this.f25453i = response.m28685n();
            this.f25454j = response.m28676R0();
            this.f25455k = response.m28680V0();
            this.f25456l = response.m28678T0();
            this.f25457m = response.m28674Q();
        }
    }
}
