package okhttp3.internal.http1;

import com.google.android.gms.common.api.C3553a;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p072I6.C0641C;
import p072I6.C0648e;
import p072I6.C0655l;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0649f;
import p072I6.InterfaceC0650g;
import p072I6.InterfaceC0669z;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* JADX INFO: renamed from: h */
    public static final Companion f25749h = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final OkHttpClient f25750a;

    /* JADX INFO: renamed from: b */
    private final RealConnection f25751b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0650g f25752c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0649f f25753d;

    /* JADX INFO: renamed from: e */
    private int f25754e;

    /* JADX INFO: renamed from: f */
    private final HeadersReader f25755f;

    /* JADX INFO: renamed from: g */
    private Headers f25756g;

    private abstract class AbstractSource implements InterfaceC0640B {

        /* JADX INFO: renamed from: a */
        private final C0655l f25757a;

        /* JADX INFO: renamed from: b */
        private boolean f25758b;

        public AbstractSource() {
            this.f25757a = new C0655l(Http1ExchangeCodec.this.f25752c.mo2948g());
        }

        /* JADX INFO: renamed from: d */
        protected final boolean m29109d() {
            return this.f25758b;
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: g */
        public C0641C mo2948g() {
            return this.f25757a;
        }

        /* JADX INFO: renamed from: m */
        public final void m29110m() {
            if (Http1ExchangeCodec.this.f25754e == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.f25754e == 5) {
                Http1ExchangeCodec.this.m29099r(this.f25757a);
                Http1ExchangeCodec.this.f25754e = 6;
            } else {
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.f25754e);
            }
        }

        /* JADX INFO: renamed from: n */
        protected final void m29111n(boolean z7) {
            this.f25758b = z7;
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: w */
        public long mo2949w(C0648e sink, long j7) throws IOException {
            AbstractC6118n.m27187e(sink, "sink");
            try {
                return Http1ExchangeCodec.this.f25752c.mo2949w(sink, j7);
            } catch (IOException e7) {
                Http1ExchangeCodec.this.mo29052e().m29018z();
                m29110m();
                throw e7;
            }
        }
    }

    private final class ChunkedSink implements InterfaceC0669z {

        /* JADX INFO: renamed from: a */
        private final C0655l f25760a;

        /* JADX INFO: renamed from: b */
        private boolean f25761b;

        public ChunkedSink() {
            this.f25760a = new C0655l(Http1ExchangeCodec.this.f25753d.mo3005g());
        }

        @Override // p072I6.InterfaceC0669z
        /* JADX INFO: renamed from: I */
        public void mo3003I(C0648e source, long j7) {
            AbstractC6118n.m27187e(source, "source");
            if (this.f25761b) {
                throw new IllegalStateException("closed");
            }
            if (j7 == 0) {
                return;
            }
            Http1ExchangeCodec.this.f25753d.mo3041e0(j7);
            Http1ExchangeCodec.this.f25753d.mo3031X("\r\n");
            Http1ExchangeCodec.this.f25753d.mo3003I(source, j7);
            Http1ExchangeCodec.this.f25753d.mo3031X("\r\n");
        }

        @Override // p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f25761b) {
                return;
            }
            this.f25761b = true;
            Http1ExchangeCodec.this.f25753d.mo3031X("0\r\n\r\n");
            Http1ExchangeCodec.this.m29099r(this.f25760a);
            Http1ExchangeCodec.this.f25754e = 3;
        }

        @Override // p072I6.InterfaceC0669z, java.io.Flushable
        public synchronized void flush() {
            if (this.f25761b) {
                return;
            }
            Http1ExchangeCodec.this.f25753d.flush();
        }

        @Override // p072I6.InterfaceC0669z
        /* JADX INFO: renamed from: g */
        public C0641C mo3005g() {
            return this.f25760a;
        }
    }

    private final class ChunkedSource extends AbstractSource {

        /* JADX INFO: renamed from: d */
        private final HttpUrl f25763d;

        /* JADX INFO: renamed from: e */
        private long f25764e;

        /* JADX INFO: renamed from: f */
        private boolean f25765f;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ Http1ExchangeCodec f25766r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super();
            AbstractC6118n.m27187e(url, "url");
            this.f25766r = http1ExchangeCodec;
            this.f25763d = url;
            this.f25764e = -1L;
            this.f25765f = true;
        }

        /* JADX INFO: renamed from: x */
        private final void m29112x() throws ProtocolException {
            if (this.f25764e != -1) {
                this.f25766r.f25752c.mo3056n0();
            }
            try {
                this.f25764e = this.f25766r.f25752c.mo3015L0();
                String string = AbstractC6406h.m27594S0(this.f25766r.f25752c.mo3056n0()).toString();
                if (this.f25764e < 0 || (string.length() > 0 && !AbstractC6406h.m27557K(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f25764e + string + '\"');
                }
                if (this.f25764e == 0) {
                    this.f25765f = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.f25766r;
                    http1ExchangeCodec.f25756g = http1ExchangeCodec.f25755f.m29088a();
                    OkHttpClient okHttpClient = this.f25766r.f25750a;
                    AbstractC6118n.m27184b(okHttpClient);
                    CookieJar cookieJarM28591j = okHttpClient.m28591j();
                    HttpUrl httpUrl = this.f25763d;
                    Headers headers = this.f25766r.f25756g;
                    AbstractC6118n.m27184b(headers);
                    HttpHeaders.m29061f(cookieJarM28591j, httpUrl, headers);
                    m29110m();
                }
            } catch (NumberFormatException e7) {
                throw new ProtocolException(e7.getMessage());
            }
        }

        @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m29109d()) {
                return;
            }
            if (this.f25765f && !Util.m28779s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f25766r.mo29052e().m29018z();
                m29110m();
            }
            m29111n(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: w */
        public long mo2949w(C0648e sink, long j7) throws IOException {
            AbstractC6118n.m27187e(sink, "sink");
            if (j7 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            }
            if (m29109d()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f25765f) {
                return -1L;
            }
            long j8 = this.f25764e;
            if (j8 == 0 || j8 == -1) {
                m29112x();
                if (!this.f25765f) {
                    return -1L;
                }
            }
            long jMo2949w = super.mo2949w(sink, Math.min(j7, this.f25764e));
            if (jMo2949w != -1) {
                this.f25764e -= jMo2949w;
                return jMo2949w;
            }
            this.f25766r.mo29052e().m29018z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m29110m();
            throw protocolException;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    private final class FixedLengthSource extends AbstractSource {

        /* JADX INFO: renamed from: d */
        private long f25767d;

        public FixedLengthSource(long j7) {
            super();
            this.f25767d = j7;
            if (j7 == 0) {
                m29110m();
            }
        }

        @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m29109d()) {
                return;
            }
            if (this.f25767d != 0 && !Util.m28779s(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.mo29052e().m29018z();
                m29110m();
            }
            m29111n(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: w */
        public long mo2949w(C0648e sink, long j7) throws IOException {
            AbstractC6118n.m27187e(sink, "sink");
            if (j7 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            }
            if (m29109d()) {
                throw new IllegalStateException("closed");
            }
            long j8 = this.f25767d;
            if (j8 == 0) {
                return -1L;
            }
            long jMo2949w = super.mo2949w(sink, Math.min(j8, j7));
            if (jMo2949w == -1) {
                Http1ExchangeCodec.this.mo29052e().m29018z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m29110m();
                throw protocolException;
            }
            long j9 = this.f25767d - jMo2949w;
            this.f25767d = j9;
            if (j9 == 0) {
                m29110m();
            }
            return jMo2949w;
        }
    }

    private final class KnownLengthSink implements InterfaceC0669z {

        /* JADX INFO: renamed from: a */
        private final C0655l f25769a;

        /* JADX INFO: renamed from: b */
        private boolean f25770b;

        public KnownLengthSink() {
            this.f25769a = new C0655l(Http1ExchangeCodec.this.f25753d.mo3005g());
        }

        @Override // p072I6.InterfaceC0669z
        /* JADX INFO: renamed from: I */
        public void mo3003I(C0648e source, long j7) {
            AbstractC6118n.m27187e(source, "source");
            if (this.f25770b) {
                throw new IllegalStateException("closed");
            }
            Util.m28772l(source.m3046h1(), 0L, j7);
            Http1ExchangeCodec.this.f25753d.mo3003I(source, j7);
        }

        @Override // p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f25770b) {
                return;
            }
            this.f25770b = true;
            Http1ExchangeCodec.this.m29099r(this.f25769a);
            Http1ExchangeCodec.this.f25754e = 3;
        }

        @Override // p072I6.InterfaceC0669z, java.io.Flushable
        public void flush() {
            if (this.f25770b) {
                return;
            }
            Http1ExchangeCodec.this.f25753d.flush();
        }

        @Override // p072I6.InterfaceC0669z
        /* JADX INFO: renamed from: g */
        public C0641C mo3005g() {
            return this.f25769a;
        }
    }

    private final class UnknownLengthSource extends AbstractSource {

        /* JADX INFO: renamed from: d */
        private boolean f25772d;

        public UnknownLengthSource() {
            super();
        }

        @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m29109d()) {
                return;
            }
            if (!this.f25772d) {
                m29110m();
            }
            m29111n(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: w */
        public long mo2949w(C0648e sink, long j7) throws IOException {
            AbstractC6118n.m27187e(sink, "sink");
            if (j7 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            }
            if (m29109d()) {
                throw new IllegalStateException("closed");
            }
            if (this.f25772d) {
                return -1L;
            }
            long jMo2949w = super.mo2949w(sink, j7);
            if (jMo2949w != -1) {
                return jMo2949w;
            }
            this.f25772d = true;
            m29110m();
            return -1L;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection connection, InterfaceC0650g source, InterfaceC0649f sink) {
        AbstractC6118n.m27187e(connection, "connection");
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(sink, "sink");
        this.f25750a = okHttpClient;
        this.f25751b = connection;
        this.f25752c = source;
        this.f25753d = sink;
        this.f25755f = new HeadersReader(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m29099r(C0655l c0655l) {
        C0641C c0641cM3120j = c0655l.m3120j();
        c0655l.m3121k(C0641C.f2530e);
        c0641cM3120j.mo2950a();
        c0641cM3120j.mo2951b();
    }

    /* JADX INFO: renamed from: s */
    private final boolean m29100s(Request request) {
        return AbstractC6406h.m27564w("chunked", request.m28650d("Transfer-Encoding"), true);
    }

    /* JADX INFO: renamed from: t */
    private final boolean m29101t(Response response) {
        return AbstractC6406h.m27564w("chunked", Response.m28671l0(response, "Transfer-Encoding", null, 2, null), true);
    }

    /* JADX INFO: renamed from: u */
    private final InterfaceC0669z m29102u() {
        if (this.f25754e == 1) {
            this.f25754e = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.f25754e).toString());
    }

    /* JADX INFO: renamed from: v */
    private final InterfaceC0640B m29103v(HttpUrl httpUrl) {
        if (this.f25754e == 4) {
            this.f25754e = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.f25754e).toString());
    }

    /* JADX INFO: renamed from: w */
    private final InterfaceC0640B m29104w(long j7) {
        if (this.f25754e == 4) {
            this.f25754e = 5;
            return new FixedLengthSource(j7);
        }
        throw new IllegalStateException(("state: " + this.f25754e).toString());
    }

    /* JADX INFO: renamed from: x */
    private final InterfaceC0669z m29105x() {
        if (this.f25754e == 1) {
            this.f25754e = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.f25754e).toString());
    }

    /* JADX INFO: renamed from: y */
    private final InterfaceC0640B m29106y() {
        if (this.f25754e == 4) {
            this.f25754e = 5;
            mo29052e().m29018z();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.f25754e).toString());
    }

    /* JADX INFO: renamed from: A */
    public final void m29107A(Headers headers, String requestLine) {
        AbstractC6118n.m27187e(headers, "headers");
        AbstractC6118n.m27187e(requestLine, "requestLine");
        if (this.f25754e != 0) {
            throw new IllegalStateException(("state: " + this.f25754e).toString());
        }
        this.f25753d.mo3031X(requestLine).mo3031X("\r\n");
        int size = headers.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f25753d.mo3031X(headers.m28478b(i7)).mo3031X(": ").mo3031X(headers.m28480g(i7)).mo3031X("\r\n");
        }
        this.f25753d.mo3031X("\r\n");
        this.f25754e = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: a */
    public void mo29048a() {
        this.f25753d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: b */
    public void mo29049b(Request request) {
        AbstractC6118n.m27187e(request, "request");
        RequestLine requestLine = RequestLine.f25739a;
        Proxy.Type type = mo29052e().m28996A().m28715b().type();
        AbstractC6118n.m27186d(type, "connection.route().proxy.type()");
        m29107A(request.m28652f(), requestLine.m29079a(request, type));
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: c */
    public InterfaceC0640B mo29050c(Response response) {
        AbstractC6118n.m27187e(response, "response");
        if (!HttpHeaders.m29057b(response)) {
            return m29104w(0L);
        }
        if (m29101t(response)) {
            return m29103v(response.m28679U0().m28656j());
        }
        long jM28782v = Util.m28782v(response);
        return jM28782v != -1 ? m29104w(jM28782v) : m29106y();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        mo29052e().m29003d();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: d */
    public Response.Builder mo29051d(boolean z7) {
        int i7 = this.f25754e;
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            throw new IllegalStateException(("state: " + this.f25754e).toString());
        }
        try {
            StatusLine statusLineM29087a = StatusLine.f25742d.m29087a(this.f25755f.m29089b());
            Response.Builder builderM28700k = new Response.Builder().m28705p(statusLineM29087a.f25743a).m28696g(statusLineM29087a.f25744b).m28702m(statusLineM29087a.f25745c).m28700k(this.f25755f.m29088a());
            if (z7 && statusLineM29087a.f25744b == 100) {
                return null;
            }
            int i8 = statusLineM29087a.f25744b;
            if (i8 == 100) {
                this.f25754e = 3;
                return builderM28700k;
            }
            if (102 > i8 || i8 >= 200) {
                this.f25754e = 4;
                return builderM28700k;
            }
            this.f25754e = 3;
            return builderM28700k;
        } catch (EOFException e7) {
            throw new IOException("unexpected end of stream on " + mo29052e().m28996A().m28714a().m28311l().m28510n(), e7);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: e */
    public RealConnection mo29052e() {
        return this.f25751b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: f */
    public void mo29053f() {
        this.f25753d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: g */
    public long mo29054g(Response response) {
        AbstractC6118n.m27187e(response, "response");
        if (!HttpHeaders.m29057b(response)) {
            return 0L;
        }
        if (m29101t(response)) {
            return -1L;
        }
        return Util.m28782v(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: h */
    public InterfaceC0669z mo29055h(Request request, long j7) throws ProtocolException {
        AbstractC6118n.m27187e(request, "request");
        if (request.m28647a() != null && request.m28647a().m28666c()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m29100s(request)) {
            return m29102u();
        }
        if (j7 != -1) {
            return m29105x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* JADX INFO: renamed from: z */
    public final void m29108z(Response response) {
        AbstractC6118n.m27187e(response, "response");
        long jM28782v = Util.m28782v(response);
        if (jM28782v == -1) {
            return;
        }
        InterfaceC0640B interfaceC0640BM29104w = m29104w(jM28782v);
        Util.m28744M(interfaceC0640BM29104w, C3553a.e.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        interfaceC0640BM29104w.close();
    }
}
