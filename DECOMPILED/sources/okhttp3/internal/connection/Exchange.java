package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.p320ws.RealWebSocket;
import p072I6.AbstractC0653j;
import p072I6.AbstractC0654k;
import p072I6.AbstractC0659p;
import p072I6.C0648e;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0669z;

/* JADX INFO: loaded from: classes.dex */
public final class Exchange {

    /* JADX INFO: renamed from: a */
    private final RealCall f25622a;

    /* JADX INFO: renamed from: b */
    private final EventListener f25623b;

    /* JADX INFO: renamed from: c */
    private final ExchangeFinder f25624c;

    /* JADX INFO: renamed from: d */
    private final ExchangeCodec f25625d;

    /* JADX INFO: renamed from: e */
    private boolean f25626e;

    /* JADX INFO: renamed from: f */
    private boolean f25627f;

    /* JADX INFO: renamed from: g */
    private final RealConnection f25628g;

    private final class RequestBodySink extends AbstractC0653j {

        /* JADX INFO: renamed from: b */
        private final long f25629b;

        /* JADX INFO: renamed from: c */
        private boolean f25630c;

        /* JADX INFO: renamed from: d */
        private long f25631d;

        /* JADX INFO: renamed from: e */
        private boolean f25632e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Exchange f25633f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, InterfaceC0669z delegate, long j7) {
            super(delegate);
            AbstractC6118n.m27187e(delegate, "delegate");
            this.f25633f = exchange;
            this.f25629b = j7;
        }

        /* JADX INFO: renamed from: d */
        private final IOException m28947d(IOException iOException) {
            if (this.f25630c) {
                return iOException;
            }
            this.f25630c = true;
            return this.f25633f.m28925a(this.f25631d, false, true, iOException);
        }

        @Override // p072I6.AbstractC0653j, p072I6.InterfaceC0669z
        /* JADX INFO: renamed from: I */
        public void mo3003I(C0648e source, long j7) throws IOException {
            AbstractC6118n.m27187e(source, "source");
            if (this.f25632e) {
                throw new IllegalStateException("closed");
            }
            long j8 = this.f25629b;
            if (j8 == -1 || this.f25631d + j7 <= j8) {
                try {
                    super.mo3003I(source, j7);
                    this.f25631d += j7;
                    return;
                } catch (IOException e7) {
                    throw m28947d(e7);
                }
            }
            throw new ProtocolException("expected " + this.f25629b + " bytes but received " + (this.f25631d + j7));
        }

        @Override // p072I6.AbstractC0653j, p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f25632e) {
                return;
            }
            this.f25632e = true;
            long j7 = this.f25629b;
            if (j7 != -1 && this.f25631d != j7) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m28947d(null);
            } catch (IOException e7) {
                throw m28947d(e7);
            }
        }

        @Override // p072I6.AbstractC0653j, p072I6.InterfaceC0669z, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e7) {
                throw m28947d(e7);
            }
        }
    }

    public final class ResponseBodySource extends AbstractC0654k {

        /* JADX INFO: renamed from: b */
        private final long f25634b;

        /* JADX INFO: renamed from: c */
        private long f25635c;

        /* JADX INFO: renamed from: d */
        private boolean f25636d;

        /* JADX INFO: renamed from: e */
        private boolean f25637e;

        /* JADX INFO: renamed from: f */
        private boolean f25638f;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ Exchange f25639r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, InterfaceC0640B delegate, long j7) {
            super(delegate);
            AbstractC6118n.m27187e(delegate, "delegate");
            this.f25639r = exchange;
            this.f25634b = j7;
            this.f25636d = true;
            if (j7 == 0) {
                m28948m(null);
            }
        }

        @Override // p072I6.AbstractC0654k, p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f25638f) {
                return;
            }
            this.f25638f = true;
            try {
                super.close();
                m28948m(null);
            } catch (IOException e7) {
                throw m28948m(e7);
            }
        }

        /* JADX INFO: renamed from: m */
        public final IOException m28948m(IOException iOException) {
            if (this.f25637e) {
                return iOException;
            }
            this.f25637e = true;
            if (iOException == null && this.f25636d) {
                this.f25636d = false;
                this.f25639r.m28933i().m28458w(this.f25639r.m28931g());
            }
            return this.f25639r.m28925a(this.f25635c, true, false, iOException);
        }

        @Override // p072I6.AbstractC0654k, p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: w */
        public long mo2949w(C0648e sink, long j7) throws IOException {
            AbstractC6118n.m27187e(sink, "sink");
            if (this.f25638f) {
                throw new IllegalStateException("closed");
            }
            try {
                long jMo2949w = m3119d().mo2949w(sink, j7);
                if (this.f25636d) {
                    this.f25636d = false;
                    this.f25639r.m28933i().m28458w(this.f25639r.m28931g());
                }
                if (jMo2949w == -1) {
                    m28948m(null);
                    return -1L;
                }
                long j8 = this.f25635c + jMo2949w;
                long j9 = this.f25634b;
                if (j9 != -1 && j8 > j9) {
                    throw new ProtocolException("expected " + this.f25634b + " bytes but received " + j8);
                }
                this.f25635c = j8;
                if (j8 == j9) {
                    m28948m(null);
                }
                return jMo2949w;
            } catch (IOException e7) {
                throw m28948m(e7);
            }
        }
    }

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec codec) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(eventListener, "eventListener");
        AbstractC6118n.m27187e(finder, "finder");
        AbstractC6118n.m27187e(codec, "codec");
        this.f25622a = call;
        this.f25623b = eventListener;
        this.f25624c = finder;
        this.f25625d = codec;
        this.f25628g = codec.mo29052e();
    }

    /* JADX INFO: renamed from: u */
    private final void m28924u(IOException iOException) {
        this.f25627f = true;
        this.f25624c.m28956h(iOException);
        this.f25625d.mo29052e().m29000H(this.f25622a, iOException);
    }

    /* JADX INFO: renamed from: a */
    public final IOException m28925a(long j7, boolean z7, boolean z8, IOException iOException) {
        if (iOException != null) {
            m28924u(iOException);
        }
        if (z8) {
            if (iOException != null) {
                this.f25623b.m28454s(this.f25622a, iOException);
            } else {
                this.f25623b.m28452q(this.f25622a, j7);
            }
        }
        if (z7) {
            if (iOException != null) {
                this.f25623b.m28459x(this.f25622a, iOException);
            } else {
                this.f25623b.m28457v(this.f25622a, j7);
            }
        }
        return this.f25622a.m28975s(this, z8, z7, iOException);
    }

    /* JADX INFO: renamed from: b */
    public final void m28926b() {
        this.f25625d.cancel();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0669z m28927c(Request request, boolean z7) {
        AbstractC6118n.m27187e(request, "request");
        this.f25626e = z7;
        RequestBody requestBodyM28647a = request.m28647a();
        AbstractC6118n.m27184b(requestBodyM28647a);
        long jMo28463a = requestBodyM28647a.mo28463a();
        this.f25623b.m28453r(this.f25622a);
        return new RequestBodySink(this, this.f25625d.mo29055h(request, jMo28463a), jMo28463a);
    }

    /* JADX INFO: renamed from: d */
    public final void m28928d() {
        this.f25625d.cancel();
        this.f25622a.m28975s(this, true, true, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m28929e() throws IOException {
        try {
            this.f25625d.mo29048a();
        } catch (IOException e7) {
            this.f25623b.m28454s(this.f25622a, e7);
            m28924u(e7);
            throw e7;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m28930f() throws IOException {
        try {
            this.f25625d.mo29053f();
        } catch (IOException e7) {
            this.f25623b.m28454s(this.f25622a, e7);
            m28924u(e7);
            throw e7;
        }
    }

    /* JADX INFO: renamed from: g */
    public final RealCall m28931g() {
        return this.f25622a;
    }

    /* JADX INFO: renamed from: h */
    public final RealConnection m28932h() {
        return this.f25628g;
    }

    /* JADX INFO: renamed from: i */
    public final EventListener m28933i() {
        return this.f25623b;
    }

    /* JADX INFO: renamed from: j */
    public final ExchangeFinder m28934j() {
        return this.f25624c;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m28935k() {
        return this.f25627f;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m28936l() {
        return !AbstractC6118n.m27183a(this.f25624c.m28953d().m28311l().m28504h(), this.f25628g.m28996A().m28714a().m28311l().m28504h());
    }

    /* JADX INFO: renamed from: m */
    public final boolean m28937m() {
        return this.f25626e;
    }

    /* JADX INFO: renamed from: n */
    public final RealWebSocket.Streams m28938n() {
        this.f25622a.m28981y();
        return this.f25625d.mo29052e().m29016x(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m28939o() {
        this.f25625d.mo29052e().m29018z();
    }

    /* JADX INFO: renamed from: p */
    public final void m28940p() {
        this.f25622a.m28975s(this, true, false, null);
    }

    /* JADX INFO: renamed from: q */
    public final ResponseBody m28941q(Response response) throws IOException {
        AbstractC6118n.m27187e(response, "response");
        try {
            String strM28671l0 = Response.m28671l0(response, "Content-Type", null, 2, null);
            long jMo29054g = this.f25625d.mo29054g(response);
            return new RealResponseBody(strM28671l0, jMo29054g, AbstractC0659p.m3132d(new ResponseBodySource(this, this.f25625d.mo29050c(response), jMo29054g)));
        } catch (IOException e7) {
            this.f25623b.m28459x(this.f25622a, e7);
            m28924u(e7);
            throw e7;
        }
    }

    /* JADX INFO: renamed from: r */
    public final Response.Builder m28942r(boolean z7) throws IOException {
        try {
            Response.Builder builderMo29051d = this.f25625d.mo29051d(z7);
            if (builderMo29051d == null) {
                return builderMo29051d;
            }
            builderMo29051d.m28701l(this);
            return builderMo29051d;
        } catch (IOException e7) {
            this.f25623b.m28459x(this.f25622a, e7);
            m28924u(e7);
            throw e7;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m28943s(Response response) {
        AbstractC6118n.m27187e(response, "response");
        this.f25623b.m28460y(this.f25622a, response);
    }

    /* JADX INFO: renamed from: t */
    public final void m28944t() {
        this.f25623b.m28461z(this.f25622a);
    }

    /* JADX INFO: renamed from: v */
    public final void m28945v() {
        m28925a(-1L, true, true, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m28946w(Request request) throws IOException {
        AbstractC6118n.m27187e(request, "request");
        try {
            this.f25623b.m28456u(this.f25622a);
            this.f25625d.mo29049b(request);
            this.f25623b.m28455t(this.f25622a, request);
        } catch (IOException e7) {
            this.f25623b.m28454s(this.f25622a, e7);
            m28924u(e7);
            throw e7;
        }
    }
}
