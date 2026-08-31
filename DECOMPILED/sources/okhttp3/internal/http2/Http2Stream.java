package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Headers;
import okhttp3.internal.Util;
import p072I6.C0641C;
import p072I6.C0646c;
import p072I6.C0648e;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0650g;
import p072I6.InterfaceC0669z;
import p145S5.C1444v;

/* JADX INFO: loaded from: classes.dex */
public final class Http2Stream {

    /* JADX INFO: renamed from: o */
    public static final Companion f25925o = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final int f25926a;

    /* JADX INFO: renamed from: b */
    private final Http2Connection f25927b;

    /* JADX INFO: renamed from: c */
    private long f25928c;

    /* JADX INFO: renamed from: d */
    private long f25929d;

    /* JADX INFO: renamed from: e */
    private long f25930e;

    /* JADX INFO: renamed from: f */
    private long f25931f;

    /* JADX INFO: renamed from: g */
    private final ArrayDeque f25932g;

    /* JADX INFO: renamed from: h */
    private boolean f25933h;

    /* JADX INFO: renamed from: i */
    private final FramingSource f25934i;

    /* JADX INFO: renamed from: j */
    private final FramingSink f25935j;

    /* JADX INFO: renamed from: k */
    private final StreamTimeout f25936k;

    /* JADX INFO: renamed from: l */
    private final StreamTimeout f25937l;

    /* JADX INFO: renamed from: m */
    private ErrorCode f25938m;

    /* JADX INFO: renamed from: n */
    private IOException f25939n;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public final class FramingSink implements InterfaceC0669z {

        /* JADX INFO: renamed from: a */
        private boolean f25940a;

        /* JADX INFO: renamed from: b */
        private final C0648e f25941b = new C0648e();

        /* JADX INFO: renamed from: c */
        private Headers f25942c;

        /* JADX INFO: renamed from: d */
        private boolean f25943d;

        public FramingSink(boolean z7) {
            this.f25940a = z7;
        }

        /* JADX INFO: renamed from: d */
        private final void m29291d(boolean z7) throws IOException {
            long jMin;
            boolean z8;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                try {
                    http2Stream.m29283s().m2994w();
                    while (http2Stream.m29282r() >= http2Stream.m29281q() && !this.f25940a && !this.f25943d && http2Stream.m29272h() == null) {
                        try {
                            http2Stream.m29264D();
                        } catch (Throwable th) {
                            http2Stream.m29283s().m29300D();
                            throw th;
                        }
                    }
                    http2Stream.m29283s().m29300D();
                    http2Stream.m29268c();
                    jMin = Math.min(http2Stream.m29281q() - http2Stream.m29282r(), this.f25941b.m3046h1());
                    http2Stream.m29262B(http2Stream.m29282r() + jMin);
                    z8 = z7 && jMin == this.f25941b.m3046h1();
                    C1444v c1444v = C1444v.f4971a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Http2Stream.this.m29283s().m2994w();
            try {
                Http2Stream.this.m29271g().m29201y1(Http2Stream.this.m29274j(), z8, this.f25941b, jMin);
            } finally {
                Http2Stream.this.m29283s().m29300D();
            }
        }

        @Override // p072I6.InterfaceC0669z
        /* JADX INFO: renamed from: I */
        public void mo3003I(C0648e source, long j7) throws IOException {
            AbstractC6118n.m27187e(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.f25484h || !Thread.holdsLock(http2Stream)) {
                this.f25941b.mo3003I(source, j7);
                while (this.f25941b.m3046h1() >= 16384) {
                    m29291d(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
        }

        @Override // p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.f25484h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.f25943d) {
                    return;
                }
                boolean z7 = http2Stream2.m29272h() == null;
                C1444v c1444v = C1444v.f4971a;
                if (!Http2Stream.this.m29279o().f25940a) {
                    boolean z8 = this.f25941b.m3046h1() > 0;
                    if (this.f25942c != null) {
                        while (this.f25941b.m3046h1() > 0) {
                            m29291d(false);
                        }
                        Http2Connection http2ConnectionM29271g = Http2Stream.this.m29271g();
                        int iM29274j = Http2Stream.this.m29274j();
                        Headers headers = this.f25942c;
                        AbstractC6118n.m27184b(headers);
                        http2ConnectionM29271g.m29202z1(iM29274j, z7, Util.m28747P(headers));
                    } else if (z8) {
                        while (this.f25941b.m3046h1() > 0) {
                            m29291d(true);
                        }
                    } else if (z7) {
                        Http2Stream.this.m29271g().m29201y1(Http2Stream.this.m29274j(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.f25943d = true;
                    C1444v c1444v2 = C1444v.f4971a;
                }
                Http2Stream.this.m29271g().flush();
                Http2Stream.this.m29267b();
            }
        }

        @Override // p072I6.InterfaceC0669z, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.f25484h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.m29268c();
                C1444v c1444v = C1444v.f4971a;
            }
            while (this.f25941b.m3046h1() > 0) {
                m29291d(false);
                Http2Stream.this.m29271g().flush();
            }
        }

        @Override // p072I6.InterfaceC0669z
        /* JADX INFO: renamed from: g */
        public C0641C mo3005g() {
            return Http2Stream.this.m29283s();
        }

        /* JADX INFO: renamed from: m */
        public final boolean m29292m() {
            return this.f25943d;
        }

        /* JADX INFO: renamed from: n */
        public final boolean m29293n() {
            return this.f25940a;
        }
    }

    public final class FramingSource implements InterfaceC0640B {

        /* JADX INFO: renamed from: a */
        private final long f25945a;

        /* JADX INFO: renamed from: b */
        private boolean f25946b;

        /* JADX INFO: renamed from: c */
        private final C0648e f25947c = new C0648e();

        /* JADX INFO: renamed from: d */
        private final C0648e f25948d = new C0648e();

        /* JADX INFO: renamed from: e */
        private Headers f25949e;

        /* JADX INFO: renamed from: f */
        private boolean f25950f;

        public FramingSource(long j7, boolean z7) {
            this.f25945a = j7;
            this.f25946b = z7;
        }

        /* JADX INFO: renamed from: Q */
        private final void m29294Q(long j7) {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.f25484h || !Thread.holdsLock(http2Stream)) {
                Http2Stream.this.m29271g().m29200x1(j7);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        /* JADX INFO: renamed from: J */
        public final void m29295J(Headers headers) {
            this.f25949e = headers;
        }

        @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long jM3046h1;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.f25950f = true;
                jM3046h1 = this.f25948d.m3046h1();
                this.f25948d.m3076x();
                AbstractC6118n.m27185c(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
                C1444v c1444v = C1444v.f4971a;
            }
            if (jM3046h1 > 0) {
                m29294Q(jM3046h1);
            }
            Http2Stream.this.m29267b();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m29296d() {
            return this.f25950f;
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: g */
        public C0641C mo2948g() {
            return Http2Stream.this.m29277m();
        }

        /* JADX INFO: renamed from: m */
        public final boolean m29297m() {
            return this.f25946b;
        }

        /* JADX INFO: renamed from: n */
        public final void m29298n(InterfaceC0650g source, long j7) throws EOFException {
            boolean z7;
            boolean z8;
            AbstractC6118n.m27187e(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.f25484h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            long j8 = j7;
            while (j8 > 0) {
                synchronized (Http2Stream.this) {
                    z7 = this.f25946b;
                    z8 = this.f25948d.m3046h1() + j8 > this.f25945a;
                    C1444v c1444v = C1444v.f4971a;
                }
                if (z8) {
                    source.mo3052l(j8);
                    Http2Stream.this.m29270f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z7) {
                    source.mo3052l(j8);
                    return;
                }
                long jMo2949w = source.mo2949w(this.f25947c, j8);
                if (jMo2949w == -1) {
                    throw new EOFException();
                }
                j8 -= jMo2949w;
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    try {
                        if (this.f25950f) {
                            this.f25947c.m3076x();
                        } else {
                            boolean z9 = this.f25948d.m3046h1() == 0;
                            this.f25948d.mo3029W(this.f25947c);
                            if (z9) {
                                AbstractC6118n.m27185c(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                                http2Stream2.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            m29294Q(j7);
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: w */
        public long mo2949w(C0648e sink, long j7) throws IOException {
            IOException iOExceptionM29273i;
            boolean z7;
            long jMo2949w;
            AbstractC6118n.m27187e(sink, "sink");
            long j8 = 0;
            if (j7 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.m29277m().m2994w();
                    try {
                        if (http2Stream.m29272h() == null || this.f25946b) {
                            iOExceptionM29273i = null;
                        } else {
                            iOExceptionM29273i = http2Stream.m29273i();
                            if (iOExceptionM29273i == null) {
                                ErrorCode errorCodeM29272h = http2Stream.m29272h();
                                AbstractC6118n.m27184b(errorCodeM29272h);
                                iOExceptionM29273i = new StreamResetException(errorCodeM29272h);
                            }
                        }
                        if (this.f25950f) {
                            throw new IOException("stream closed");
                        }
                        z7 = false;
                        if (this.f25948d.m3046h1() > j8) {
                            C0648e c0648e = this.f25948d;
                            jMo2949w = c0648e.mo2949w(sink, Math.min(j7, c0648e.m3046h1()));
                            http2Stream.m29261A(http2Stream.m29276l() + jMo2949w);
                            long jM29276l = http2Stream.m29276l() - http2Stream.m29275k();
                            if (iOExceptionM29273i == null && jM29276l >= http2Stream.m29271g().m29181c1().m29328c() / 2) {
                                http2Stream.m29271g().m29174D1(http2Stream.m29274j(), jM29276l);
                                http2Stream.m29290z(http2Stream.m29276l());
                            }
                        } else {
                            if (!this.f25946b && iOExceptionM29273i == null) {
                                http2Stream.m29264D();
                                z7 = true;
                            }
                            jMo2949w = -1;
                        }
                        http2Stream.m29277m().m29300D();
                        C1444v c1444v = C1444v.f4971a;
                    } catch (Throwable th) {
                        http2Stream.m29277m().m29300D();
                        throw th;
                    }
                    throw th;
                }
                if (!z7) {
                    if (jMo2949w != -1) {
                        return jMo2949w;
                    }
                    if (iOExceptionM29273i == null) {
                        return -1L;
                    }
                    throw iOExceptionM29273i;
                }
                j8 = 0;
            }
        }

        /* JADX INFO: renamed from: x */
        public final void m29299x(boolean z7) {
            this.f25946b = z7;
        }
    }

    public final class StreamTimeout extends C0646c {
        public StreamTimeout() {
        }

        @Override // p072I6.C0646c
        /* JADX INFO: renamed from: C */
        protected void mo2946C() {
            Http2Stream.this.m29270f(ErrorCode.CANCEL);
            Http2Stream.this.m29271g().m29195r1();
        }

        /* JADX INFO: renamed from: D */
        public final void m29300D() throws IOException {
            if (m2995x()) {
                throw mo2947y(null);
            }
        }

        @Override // p072I6.C0646c
        /* JADX INFO: renamed from: y */
        protected IOException mo2947y(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public Http2Stream(int i7, Http2Connection connection, boolean z7, boolean z8, Headers headers) {
        AbstractC6118n.m27187e(connection, "connection");
        this.f25926a = i7;
        this.f25927b = connection;
        this.f25931f = connection.m29182d1().m29328c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f25932g = arrayDeque;
        this.f25934i = new FramingSource(connection.m29181c1().m29328c(), z8);
        this.f25935j = new FramingSink(z7);
        this.f25936k = new StreamTimeout();
        this.f25937l = new StreamTimeout();
        if (headers == null) {
            if (!m29284t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m29284t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    /* JADX INFO: renamed from: e */
    private final boolean m29260e(ErrorCode errorCode, IOException iOException) {
        if (Util.f25484h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f25938m != null) {
                return false;
            }
            this.f25938m = errorCode;
            this.f25939n = iOException;
            AbstractC6118n.m27185c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f25934i.m29297m() && this.f25935j.m29293n()) {
                return false;
            }
            C1444v c1444v = C1444v.f4971a;
            this.f25927b.m29194q1(this.f25926a);
            return true;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m29261A(long j7) {
        this.f25928c = j7;
    }

    /* JADX INFO: renamed from: B */
    public final void m29262B(long j7) {
        this.f25930e = j7;
    }

    /* JADX INFO: renamed from: C */
    public final synchronized Headers m29263C() {
        Object objRemoveFirst;
        this.f25936k.m2994w();
        while (this.f25932g.isEmpty() && this.f25938m == null) {
            try {
                m29264D();
            } catch (Throwable th) {
                this.f25936k.m29300D();
                throw th;
            }
        }
        this.f25936k.m29300D();
        if (this.f25932g.isEmpty()) {
            IOException iOException = this.f25939n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f25938m;
            AbstractC6118n.m27184b(errorCode);
            throw new StreamResetException(errorCode);
        }
        objRemoveFirst = this.f25932g.removeFirst();
        AbstractC6118n.m27186d(objRemoveFirst, "headersQueue.removeFirst()");
        return (Headers) objRemoveFirst;
    }

    /* JADX INFO: renamed from: D */
    public final void m29264D() throws InterruptedIOException {
        try {
            AbstractC6118n.m27185c(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: E */
    public final C0641C m29265E() {
        return this.f25937l;
    }

    /* JADX INFO: renamed from: a */
    public final void m29266a(long j7) {
        this.f25931f += j7;
        if (j7 > 0) {
            AbstractC6118n.m27185c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m29267b() {
        boolean z7;
        boolean zM29285u;
        if (Util.f25484h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z7 = !this.f25934i.m29297m() && this.f25934i.m29296d() && (this.f25935j.m29293n() || this.f25935j.m29292m());
                zM29285u = m29285u();
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            m29269d(ErrorCode.CANCEL, null);
        } else {
            if (zM29285u) {
                return;
            }
            this.f25927b.m29194q1(this.f25926a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m29268c() throws IOException {
        if (this.f25935j.m29292m()) {
            throw new IOException("stream closed");
        }
        if (this.f25935j.m29293n()) {
            throw new IOException("stream finished");
        }
        if (this.f25938m != null) {
            IOException iOException = this.f25939n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f25938m;
            AbstractC6118n.m27184b(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m29269d(ErrorCode rstStatusCode, IOException iOException) {
        AbstractC6118n.m27187e(rstStatusCode, "rstStatusCode");
        if (m29260e(rstStatusCode, iOException)) {
            this.f25927b.m29172B1(this.f25926a, rstStatusCode);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m29270f(ErrorCode errorCode) {
        AbstractC6118n.m27187e(errorCode, "errorCode");
        if (m29260e(errorCode, null)) {
            this.f25927b.m29173C1(this.f25926a, errorCode);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Http2Connection m29271g() {
        return this.f25927b;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized ErrorCode m29272h() {
        return this.f25938m;
    }

    /* JADX INFO: renamed from: i */
    public final IOException m29273i() {
        return this.f25939n;
    }

    /* JADX INFO: renamed from: j */
    public final int m29274j() {
        return this.f25926a;
    }

    /* JADX INFO: renamed from: k */
    public final long m29275k() {
        return this.f25929d;
    }

    /* JADX INFO: renamed from: l */
    public final long m29276l() {
        return this.f25928c;
    }

    /* JADX INFO: renamed from: m */
    public final StreamTimeout m29277m() {
        return this.f25936k;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC0669z m29278n() {
        synchronized (this) {
            try {
                if (!this.f25933h && !m29284t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f25935j;
    }

    /* JADX INFO: renamed from: o */
    public final FramingSink m29279o() {
        return this.f25935j;
    }

    /* JADX INFO: renamed from: p */
    public final FramingSource m29280p() {
        return this.f25934i;
    }

    /* JADX INFO: renamed from: q */
    public final long m29281q() {
        return this.f25931f;
    }

    /* JADX INFO: renamed from: r */
    public final long m29282r() {
        return this.f25930e;
    }

    /* JADX INFO: renamed from: s */
    public final StreamTimeout m29283s() {
        return this.f25937l;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m29284t() {
        return this.f25927b.m29176X0() == ((this.f25926a & 1) == 1);
    }

    /* JADX INFO: renamed from: u */
    public final synchronized boolean m29285u() {
        try {
            if (this.f25938m != null) {
                return false;
            }
            if (this.f25934i.m29297m() || this.f25934i.m29296d()) {
                if ((this.f25935j.m29293n() || this.f25935j.m29292m()) && this.f25933h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public final C0641C m29286v() {
        return this.f25936k;
    }

    /* JADX INFO: renamed from: w */
    public final void m29287w(InterfaceC0650g source, int i7) {
        AbstractC6118n.m27187e(source, "source");
        if (!Util.f25484h || !Thread.holdsLock(this)) {
            this.f25934i.m29298n(source, i7);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX INFO: renamed from: x */
    public final void m29288x(Headers headers, boolean z7) {
        boolean zM29285u;
        AbstractC6118n.m27187e(headers, "headers");
        if (Util.f25484h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f25933h && z7) {
                    this.f25934i.m29295J(headers);
                } else {
                    this.f25933h = true;
                    this.f25932g.add(headers);
                }
                if (z7) {
                    this.f25934i.m29299x(true);
                }
                zM29285u = m29285u();
                AbstractC6118n.m27185c(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM29285u) {
            return;
        }
        this.f25927b.m29194q1(this.f25926a);
    }

    /* JADX INFO: renamed from: y */
    public final synchronized void m29289y(ErrorCode errorCode) {
        AbstractC6118n.m27187e(errorCode, "errorCode");
        if (this.f25938m == null) {
            this.f25938m = errorCode;
            AbstractC6118n.m27185c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m29290z(long j7) {
        this.f25929d = j7;
    }
}
