package okhttp3.internal.http2;

import com.google.android.gms.common.api.C3553a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p072I6.C0641C;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0650g;
import p278j6.AbstractC5905g;
import p278j6.C5902d;

/* JADX INFO: loaded from: classes.dex */
public final class Http2Reader implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final Companion f25913e = new Companion(null);

    /* JADX INFO: renamed from: f */
    private static final Logger f25914f;

    /* JADX INFO: renamed from: a */
    private final InterfaceC0650g f25915a;

    /* JADX INFO: renamed from: b */
    private final boolean f25916b;

    /* JADX INFO: renamed from: c */
    private final ContinuationSource f25917c;

    /* JADX INFO: renamed from: d */
    private final Hpack.Reader f25918d;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Logger m29251a() {
            return Http2Reader.f25914f;
        }

        /* JADX INFO: renamed from: b */
        public final int m29252b(int i7, int i8, int i9) throws IOException {
            if ((i8 & 8) != 0) {
                i7--;
            }
            if (i9 <= i7) {
                return i7 - i9;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i9 + " > remaining length " + i7);
        }

        private Companion() {
        }
    }

    public static final class ContinuationSource implements InterfaceC0640B {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0650g f25919a;

        /* JADX INFO: renamed from: b */
        private int f25920b;

        /* JADX INFO: renamed from: c */
        private int f25921c;

        /* JADX INFO: renamed from: d */
        private int f25922d;

        /* JADX INFO: renamed from: e */
        private int f25923e;

        /* JADX INFO: renamed from: f */
        private int f25924f;

        public ContinuationSource(InterfaceC0650g source) {
            AbstractC6118n.m27187e(source, "source");
            this.f25919a = source;
        }

        /* JADX INFO: renamed from: m */
        private final void m29253m() throws IOException {
            int i7 = this.f25922d;
            int iM28742K = Util.m28742K(this.f25919a);
            this.f25923e = iM28742K;
            this.f25920b = iM28742K;
            int iM28764d = Util.m28764d(this.f25919a.readByte(), 255);
            this.f25921c = Util.m28764d(this.f25919a.readByte(), 255);
            Companion companion = Http2Reader.f25913e;
            if (companion.m29251a().isLoggable(Level.FINE)) {
                companion.m29251a().fine(Http2.f25822a.m29149c(true, this.f25922d, this.f25920b, iM28764d, this.f25921c));
            }
            int i8 = this.f25919a.readInt() & C3553a.e.API_PRIORITY_OTHER;
            this.f25922d = i8;
            if (iM28764d == 9) {
                if (i8 != i7) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iM28764d + " != TYPE_CONTINUATION");
            }
        }

        /* JADX INFO: renamed from: J */
        public final void m29254J(int i7) {
            this.f25920b = i7;
        }

        /* JADX INFO: renamed from: Q */
        public final void m29255Q(int i7) {
            this.f25924f = i7;
        }

        @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* JADX INFO: renamed from: d */
        public final int m29256d() {
            return this.f25923e;
        }

        /* JADX INFO: renamed from: d0 */
        public final void m29257d0(int i7) {
            this.f25922d = i7;
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: g */
        public C0641C mo2948g() {
            return this.f25919a.mo2948g();
        }

        /* JADX INFO: renamed from: n */
        public final void m29258n(int i7) {
            this.f25921c = i7;
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: w */
        public long mo2949w(C0648e sink, long j7) throws IOException {
            AbstractC6118n.m27187e(sink, "sink");
            while (true) {
                int i7 = this.f25923e;
                if (i7 != 0) {
                    long jMo2949w = this.f25919a.mo2949w(sink, Math.min(j7, i7));
                    if (jMo2949w == -1) {
                        return -1L;
                    }
                    this.f25923e -= (int) jMo2949w;
                    return jMo2949w;
                }
                this.f25919a.mo3052l(this.f25924f);
                this.f25924f = 0;
                if ((this.f25921c & 4) != 0) {
                    return -1L;
                }
                m29253m();
            }
        }

        /* JADX INFO: renamed from: x */
        public final void m29259x(int i7) {
            this.f25923e = i7;
        }
    }

    public interface Handler {
        /* JADX INFO: renamed from: a */
        void mo29221a(int i7, long j7);

        /* JADX INFO: renamed from: b */
        void mo29222b(boolean z7, int i7, int i8);

        /* JADX INFO: renamed from: c */
        void mo29223c();

        /* JADX INFO: renamed from: d */
        void mo29224d(boolean z7, Settings settings);

        /* JADX INFO: renamed from: e */
        void mo29225e(boolean z7, int i7, int i8, List list);

        /* JADX INFO: renamed from: f */
        void mo29226f(boolean z7, int i7, InterfaceC0650g interfaceC0650g, int i8);

        /* JADX INFO: renamed from: g */
        void mo29227g(int i7, ErrorCode errorCode, C0651h c0651h);

        /* JADX INFO: renamed from: h */
        void mo29228h(int i7, ErrorCode errorCode);

        /* JADX INFO: renamed from: l */
        void mo29231l(int i7, int i8, int i9, boolean z7);

        /* JADX INFO: renamed from: m */
        void mo29232m(int i7, int i8, List list);
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        AbstractC6118n.m27186d(logger, "getLogger(Http2::class.java.name)");
        f25914f = logger;
    }

    public Http2Reader(InterfaceC0650g source, boolean z7) {
        AbstractC6118n.m27187e(source, "source");
        this.f25915a = source;
        this.f25916b = z7;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.f25917c = continuationSource;
        this.f25918d = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    /* JADX INFO: renamed from: J */
    private final void m29237J(Handler handler, int i7, int i8, int i9) throws IOException {
        if (i7 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i7);
        }
        if (i9 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i10 = this.f25915a.readInt();
        int i11 = this.f25915a.readInt();
        int i12 = i7 - 8;
        ErrorCode errorCodeM29115a = ErrorCode.f25776b.m29115a(i11);
        if (errorCodeM29115a == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i11);
        }
        C0651h c0651hMo3063r = C0651h.f2563e;
        if (i12 > 0) {
            c0651hMo3063r = this.f25915a.mo3063r(i12);
        }
        handler.mo29227g(i10, errorCodeM29115a, c0651hMo3063r);
    }

    /* JADX INFO: renamed from: K0 */
    private final void m29238K0(Handler handler, int i7, int i8, int i9) throws IOException {
        if (i9 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i8 & 1) != 0) {
            if (i7 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.mo29223c();
            return;
        }
        if (i7 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i7);
        }
        Settings settings = new Settings();
        C5902d c5902dJ = AbstractC5905g.m26662j(AbstractC5905g.m26663k(0, i7), 6);
        int iM26643a = c5902dJ.m26643a();
        int iM26644b = c5902dJ.m26644b();
        int iM26645e = c5902dJ.m26645e();
        if ((iM26645e > 0 && iM26643a <= iM26644b) || (iM26645e < 0 && iM26644b <= iM26643a)) {
            while (true) {
                int iM28765e = Util.m28765e(this.f25915a.readShort(), 65535);
                int i10 = this.f25915a.readInt();
                if (iM28765e != 2) {
                    if (iM28765e == 3) {
                        iM28765e = 4;
                    } else if (iM28765e != 4) {
                        if (iM28765e == 5 && (i10 < 16384 || i10 > 16777215)) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i10);
                        }
                    } else {
                        if (i10 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iM28765e = 7;
                    }
                } else if (i10 != 0 && i10 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.m29333h(iM28765e, i10);
                if (iM26643a != iM26644b) {
                    iM26643a += iM26645e;
                }
            }
        }
        handler.mo29224d(false, settings);
    }

    /* JADX INFO: renamed from: Q */
    private final List m29239Q(int i7, int i8, int i9, int i10) throws IOException {
        this.f25917c.m29259x(i7);
        ContinuationSource continuationSource = this.f25917c;
        continuationSource.m29254J(continuationSource.m29256d());
        this.f25917c.m29255Q(i8);
        this.f25917c.m29258n(i9);
        this.f25917c.m29257d0(i10);
        this.f25918d.m29137k();
        return this.f25918d.m29135e();
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m29240Q0(Handler handler, int i7, int i8, int i9) throws IOException {
        if (i7 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i7);
        }
        long jM28766f = Util.m28766f(this.f25915a.readInt(), 2147483647L);
        if (jM28766f == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.mo29221a(i9, jM28766f);
    }

    /* JADX INFO: renamed from: d0 */
    private final void m29242d0(Handler handler, int i7, int i8, int i9) throws IOException {
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z7 = (i8 & 1) != 0;
        int iM28764d = (i8 & 8) != 0 ? Util.m28764d(this.f25915a.readByte(), 255) : 0;
        if ((i8 & 32) != 0) {
            m29244l0(handler, i9);
            i7 -= 5;
        }
        handler.mo29225e(z7, i9, -1, m29239Q(f25913e.m29252b(i7, i8, iM28764d), iM28764d, i8, i9));
    }

    /* JADX INFO: renamed from: k0 */
    private final void m29243k0(Handler handler, int i7, int i8, int i9) throws IOException {
        if (i7 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i7);
        }
        if (i9 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.mo29222b((i8 & 1) != 0, this.f25915a.readInt(), this.f25915a.readInt());
    }

    /* JADX INFO: renamed from: l0 */
    private final void m29244l0(Handler handler, int i7) {
        int i8 = this.f25915a.readInt();
        handler.mo29231l(i7, i8 & C3553a.e.API_PRIORITY_OTHER, Util.m28764d(this.f25915a.readByte(), 255) + 1, (Integer.MIN_VALUE & i8) != 0);
    }

    /* JADX INFO: renamed from: o0 */
    private final void m29245o0(Handler handler, int i7, int i8, int i9) throws IOException {
        if (i7 == 5) {
            if (i9 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m29244l0(handler, i9);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i7 + " != 5");
        }
    }

    /* JADX INFO: renamed from: p0 */
    private final void m29246p0(Handler handler, int i7, int i8, int i9) throws IOException {
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iM28764d = (i8 & 8) != 0 ? Util.m28764d(this.f25915a.readByte(), 255) : 0;
        handler.mo29232m(i9, this.f25915a.readInt() & C3553a.e.API_PRIORITY_OTHER, m29239Q(f25913e.m29252b(i7 - 4, i8, iM28764d), iM28764d, i8, i9));
    }

    /* JADX INFO: renamed from: w0 */
    private final void m29247w0(Handler handler, int i7, int i8, int i9) throws IOException {
        if (i7 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i7 + " != 4");
        }
        if (i9 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i10 = this.f25915a.readInt();
        ErrorCode errorCodeM29115a = ErrorCode.f25776b.m29115a(i10);
        if (errorCodeM29115a != null) {
            handler.mo29228h(i9, errorCodeM29115a);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i10);
    }

    /* JADX INFO: renamed from: x */
    private final void m29248x(Handler handler, int i7, int i8, int i9) throws IOException {
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z7 = (i8 & 1) != 0;
        if ((i8 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iM28764d = (i8 & 8) != 0 ? Util.m28764d(this.f25915a.readByte(), 255) : 0;
        handler.mo29226f(z7, i9, this.f25915a, f25913e.m29252b(i7, i8, iM28764d));
        this.f25915a.mo3052l(iM28764d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25915a.close();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m29249m(boolean z7, Handler handler) throws IOException {
        AbstractC6118n.m27187e(handler, "handler");
        try {
            this.f25915a.mo3011G0(9L);
            int iM28742K = Util.m28742K(this.f25915a);
            if (iM28742K > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iM28742K);
            }
            int iM28764d = Util.m28764d(this.f25915a.readByte(), 255);
            int iM28764d2 = Util.m28764d(this.f25915a.readByte(), 255);
            int i7 = this.f25915a.readInt() & C3553a.e.API_PRIORITY_OTHER;
            Logger logger = f25914f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.f25822a.m29149c(true, i7, iM28742K, iM28764d, iM28764d2));
            }
            if (z7 && iM28764d != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.f25822a.m29148b(iM28764d));
            }
            switch (iM28764d) {
                case 0:
                    m29248x(handler, iM28742K, iM28764d2, i7);
                    return true;
                case 1:
                    m29242d0(handler, iM28742K, iM28764d2, i7);
                    return true;
                case 2:
                    m29245o0(handler, iM28742K, iM28764d2, i7);
                    return true;
                case 3:
                    m29247w0(handler, iM28742K, iM28764d2, i7);
                    return true;
                case 4:
                    m29238K0(handler, iM28742K, iM28764d2, i7);
                    return true;
                case 5:
                    m29246p0(handler, iM28742K, iM28764d2, i7);
                    return true;
                case 6:
                    m29243k0(handler, iM28742K, iM28764d2, i7);
                    return true;
                case 7:
                    m29237J(handler, iM28742K, iM28764d2, i7);
                    return true;
                case 8:
                    m29240Q0(handler, iM28742K, iM28764d2, i7);
                    return true;
                default:
                    this.f25915a.mo3052l(iM28742K);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m29250n(Handler handler) throws IOException {
        AbstractC6118n.m27187e(handler, "handler");
        if (this.f25916b) {
            if (!m29249m(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC0650g interfaceC0650g = this.f25915a;
        C0651h c0651h = Http2.f25823b;
        C0651h c0651hMo3063r = interfaceC0650g.mo3063r(c0651h.m3090F());
        Logger logger = f25914f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.m28780t("<< CONNECTION " + c0651hMo3063r.mo3104q(), new Object[0]));
        }
        if (AbstractC6118n.m27183a(c0651h, c0651hMo3063r)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + c0651hMo3063r.m3094M());
    }
}
