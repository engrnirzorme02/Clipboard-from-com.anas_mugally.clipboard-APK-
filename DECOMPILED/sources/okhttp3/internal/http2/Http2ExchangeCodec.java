package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p072I6.C0641C;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0669z;

/* JADX INFO: loaded from: classes.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* JADX INFO: renamed from: g */
    public static final Companion f25904g = new Companion(null);

    /* JADX INFO: renamed from: h */
    private static final List f25905h = Util.m28783w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i */
    private static final List f25906i = Util.m28783w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a */
    private final RealConnection f25907a;

    /* JADX INFO: renamed from: b */
    private final RealInterceptorChain f25908b;

    /* JADX INFO: renamed from: c */
    private final Http2Connection f25909c;

    /* JADX INFO: renamed from: d */
    private volatile Http2Stream f25910d;

    /* JADX INFO: renamed from: e */
    private final Protocol f25911e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f25912f;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List m29235a(Request request) {
            AbstractC6118n.m27187e(request, "request");
            Headers headersM28652f = request.m28652f();
            ArrayList arrayList = new ArrayList(headersM28652f.size() + 4);
            arrayList.add(new Header(Header.f25794g, request.m28654h()));
            arrayList.add(new Header(Header.f25795h, RequestLine.f25739a.m29080c(request.m28656j())));
            String strM28650d = request.m28650d("Host");
            if (strM28650d != null) {
                arrayList.add(new Header(Header.f25797j, strM28650d));
            }
            arrayList.add(new Header(Header.f25796i, request.m28656j().m28512p()));
            int size = headersM28652f.size();
            for (int i7 = 0; i7 < size; i7++) {
                String strM28478b = headersM28652f.m28478b(i7);
                Locale US = Locale.US;
                AbstractC6118n.m27186d(US, "US");
                String lowerCase = strM28478b.toLowerCase(US);
                AbstractC6118n.m27186d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.f25905h.contains(lowerCase) || (AbstractC6118n.m27183a(lowerCase, "te") && AbstractC6118n.m27183a(headersM28652f.m28480g(i7), "trailers"))) {
                    arrayList.add(new Header(lowerCase, headersM28652f.m28480g(i7)));
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public final Response.Builder m29236b(Headers headerBlock, Protocol protocol) throws ProtocolException {
            AbstractC6118n.m27187e(headerBlock, "headerBlock");
            AbstractC6118n.m27187e(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headerBlock.size();
            StatusLine statusLineM29087a = null;
            for (int i7 = 0; i7 < size; i7++) {
                String strM28478b = headerBlock.m28478b(i7);
                String strM28480g = headerBlock.m28480g(i7);
                if (AbstractC6118n.m27183a(strM28478b, ":status")) {
                    statusLineM29087a = StatusLine.f25742d.m29087a("HTTP/1.1 " + strM28480g);
                } else if (!Http2ExchangeCodec.f25906i.contains(strM28478b)) {
                    builder.m28484c(strM28478b, strM28480g);
                }
            }
            if (statusLineM29087a != null) {
                return new Response.Builder().m28705p(protocol).m28696g(statusLineM29087a.f25744b).m28702m(statusLineM29087a.f25745c).m28700k(builder.m28485d());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient client, RealConnection connection, RealInterceptorChain chain, Http2Connection http2Connection) {
        AbstractC6118n.m27187e(client, "client");
        AbstractC6118n.m27187e(connection, "connection");
        AbstractC6118n.m27187e(chain, "chain");
        AbstractC6118n.m27187e(http2Connection, "http2Connection");
        this.f25907a = connection;
        this.f25908b = chain;
        this.f25909c = http2Connection;
        List listM28603x = client.m28603x();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f25911e = listM28603x.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: a */
    public void mo29048a() {
        Http2Stream http2Stream = this.f25910d;
        AbstractC6118n.m27184b(http2Stream);
        http2Stream.m29278n().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: b */
    public void mo29049b(Request request) throws IOException {
        AbstractC6118n.m27187e(request, "request");
        if (this.f25910d != null) {
            return;
        }
        this.f25910d = this.f25909c.m29188k1(f25904g.m29235a(request), request.m28647a() != null);
        if (this.f25912f) {
            Http2Stream http2Stream = this.f25910d;
            AbstractC6118n.m27184b(http2Stream);
            http2Stream.m29270f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream2 = this.f25910d;
        AbstractC6118n.m27184b(http2Stream2);
        C0641C c0641cM29286v = http2Stream2.m29286v();
        long jM29074h = this.f25908b.m29074h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0641cM29286v.mo2956g(jM29074h, timeUnit);
        Http2Stream http2Stream3 = this.f25910d;
        AbstractC6118n.m27184b(http2Stream3);
        http2Stream3.m29265E().mo2956g(this.f25908b.m29076j(), timeUnit);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: c */
    public InterfaceC0640B mo29050c(Response response) {
        AbstractC6118n.m27187e(response, "response");
        Http2Stream http2Stream = this.f25910d;
        AbstractC6118n.m27184b(http2Stream);
        return http2Stream.m29280p();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.f25912f = true;
        Http2Stream http2Stream = this.f25910d;
        if (http2Stream != null) {
            http2Stream.m29270f(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: d */
    public Response.Builder mo29051d(boolean z7) throws IOException {
        Http2Stream http2Stream = this.f25910d;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        Response.Builder builderM29236b = f25904g.m29236b(http2Stream.m29263C(), this.f25911e);
        if (z7 && builderM29236b.m28697h() == 100) {
            return null;
        }
        return builderM29236b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: e */
    public RealConnection mo29052e() {
        return this.f25907a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: f */
    public void mo29053f() {
        this.f25909c.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: g */
    public long mo29054g(Response response) {
        AbstractC6118n.m27187e(response, "response");
        if (HttpHeaders.m29057b(response)) {
            return Util.m28782v(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: h */
    public InterfaceC0669z mo29055h(Request request, long j7) {
        AbstractC6118n.m27187e(request, "request");
        Http2Stream http2Stream = this.f25910d;
        AbstractC6118n.m27184b(http2Stream);
        return http2Stream.m29278n();
    }
}
