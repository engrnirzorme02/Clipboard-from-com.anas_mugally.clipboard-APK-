package okhttp3.internal.http2;

import com.google.android.gms.common.api.C3553a;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p072I6.C0648e;
import p072I6.InterfaceC0649f;

/* JADX INFO: loaded from: classes.dex */
public final class Http2Writer implements Closeable {

    /* JADX INFO: renamed from: r */
    public static final Companion f25953r = new Companion(null);

    /* JADX INFO: renamed from: s */
    private static final Logger f25954s = Logger.getLogger(Http2.class.getName());

    /* JADX INFO: renamed from: a */
    private final InterfaceC0649f f25955a;

    /* JADX INFO: renamed from: b */
    private final boolean f25956b;

    /* JADX INFO: renamed from: c */
    private final C0648e f25957c;

    /* JADX INFO: renamed from: d */
    private int f25958d;

    /* JADX INFO: renamed from: e */
    private boolean f25959e;

    /* JADX INFO: renamed from: f */
    private final Hpack.Writer f25960f;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public Http2Writer(InterfaceC0649f sink, boolean z7) {
        AbstractC6118n.m27187e(sink, "sink");
        this.f25955a = sink;
        this.f25956b = z7;
        C0648e c0648e = new C0648e();
        this.f25957c = c0648e;
        this.f25958d = 16384;
        this.f25960f = new Hpack.Writer(0, false, c0648e, 3, null);
    }

    /* JADX INFO: renamed from: l0 */
    private final void m29301l0(int i7, long j7) {
        while (j7 > 0) {
            long jMin = Math.min(this.f25958d, j7);
            j7 -= jMin;
            m29313n(i7, (int) jMin, 9, j7 == 0 ? 4 : 0);
            this.f25955a.mo3003I(this.f25957c, jMin);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final int m29302E0() {
        return this.f25958d;
    }

    /* JADX INFO: renamed from: H */
    public final synchronized void m29303H() {
        try {
            if (this.f25959e) {
                throw new IOException("closed");
            }
            if (this.f25956b) {
                Logger logger = f25954s;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.m28780t(">> CONNECTION " + Http2.f25823b.mo3104q(), new Object[0]));
                }
                this.f25955a.mo3017N0(Http2.f25823b);
                this.f25955a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: J */
    public final synchronized void m29304J(boolean z7, int i7, List headerBlock) {
        AbstractC6118n.m27187e(headerBlock, "headerBlock");
        if (this.f25959e) {
            throw new IOException("closed");
        }
        this.f25960f.m29145g(headerBlock);
        long jM3046h1 = this.f25957c.m3046h1();
        long jMin = Math.min(this.f25958d, jM3046h1);
        int i8 = jM3046h1 == jMin ? 4 : 0;
        if (z7) {
            i8 |= 1;
        }
        m29313n(i7, (int) jMin, 1, i8);
        this.f25955a.mo3003I(this.f25957c, jMin);
        if (jM3046h1 > jMin) {
            m29301l0(i7, jM3046h1 - jMin);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final synchronized void m29305Q(int i7, int i8, List requestHeaders) {
        AbstractC6118n.m27187e(requestHeaders, "requestHeaders");
        if (this.f25959e) {
            throw new IOException("closed");
        }
        this.f25960f.m29145g(requestHeaders);
        long jM3046h1 = this.f25957c.m3046h1();
        int iMin = (int) Math.min(((long) this.f25958d) - 4, jM3046h1);
        long j7 = iMin;
        m29313n(i7, iMin + 4, 5, jM3046h1 == j7 ? 4 : 0);
        this.f25955a.mo3008A(i8 & C3553a.e.API_PRIORITY_OTHER);
        this.f25955a.mo3003I(this.f25957c, j7);
        if (jM3046h1 > j7) {
            m29301l0(i7, jM3046h1 - j7);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m29306a(int i7, long j7) {
        if (this.f25959e) {
            throw new IOException("closed");
        }
        if (j7 == 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j7).toString());
        }
        m29313n(i7, 4, 8, 0);
        this.f25955a.mo3008A((int) j7);
        this.f25955a.flush();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m29307b(boolean z7, int i7, int i8) {
        if (this.f25959e) {
            throw new IOException("closed");
        }
        m29313n(0, 8, 6, z7 ? 1 : 0);
        this.f25955a.mo3008A(i7);
        this.f25955a.mo3008A(i8);
        this.f25955a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f25959e = true;
        this.f25955a.close();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m29308d(Settings peerSettings) {
        try {
            AbstractC6118n.m27187e(peerSettings, "peerSettings");
            if (this.f25959e) {
                throw new IOException("closed");
            }
            this.f25958d = peerSettings.m29330e(this.f25958d);
            if (peerSettings.m29327b() != -1) {
                this.f25960f.m29143e(peerSettings.m29327b());
            }
            m29313n(0, 0, 4, 1);
            this.f25955a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final synchronized void m29309d0(int i7, ErrorCode errorCode) {
        AbstractC6118n.m27187e(errorCode, "errorCode");
        if (this.f25959e) {
            throw new IOException("closed");
        }
        if (errorCode.m29114d() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m29313n(i7, 4, 3, 0);
        this.f25955a.mo3008A(errorCode.m29114d());
        this.f25955a.flush();
    }

    public final synchronized void flush() {
        if (this.f25959e) {
            throw new IOException("closed");
        }
        this.f25955a.flush();
    }

    /* JADX INFO: renamed from: j0 */
    public final synchronized void m29310j0(boolean z7, int i7, C0648e c0648e, int i8) {
        if (this.f25959e) {
            throw new IOException("closed");
        }
        m29312m(i7, z7 ? 1 : 0, c0648e, i8);
    }

    /* JADX INFO: renamed from: k0 */
    public final synchronized void m29311k0(Settings settings) {
        int i7;
        try {
            AbstractC6118n.m27187e(settings, "settings");
            if (this.f25959e) {
                throw new IOException("closed");
            }
            int i8 = 0;
            m29313n(0, settings.m29334i() * 6, 4, 0);
            while (i8 < 10) {
                if (settings.m29331f(i8)) {
                    if (i8 != 4) {
                        i7 = i8 != 7 ? i8 : 4;
                    } else {
                        i7 = 3;
                    }
                    this.f25955a.mo3072v(i7);
                    this.f25955a.mo3008A(settings.m29326a(i8));
                }
                i8++;
            }
            this.f25955a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m29312m(int i7, int i8, C0648e c0648e, int i9) {
        m29313n(i7, i9, 0, i8);
        if (i9 > 0) {
            InterfaceC0649f interfaceC0649f = this.f25955a;
            AbstractC6118n.m27184b(c0648e);
            interfaceC0649f.mo3003I(c0648e, i9);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m29313n(int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        Logger logger = f25954s;
        if (logger.isLoggable(Level.FINE)) {
            i11 = i7;
            i12 = i8;
            i13 = i9;
            i14 = i10;
            logger.fine(Http2.f25822a.m29149c(false, i11, i12, i13, i14));
        } else {
            i11 = i7;
            i12 = i8;
            i13 = i9;
            i14 = i10;
        }
        if (i12 > this.f25958d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f25958d + ": " + i12).toString());
        }
        if ((Integer.MIN_VALUE & i11) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i11).toString());
        }
        Util.m28763c0(this.f25955a, i12);
        this.f25955a.mo3010F(i13 & 255);
        this.f25955a.mo3010F(i14 & 255);
        this.f25955a.mo3008A(Integer.MAX_VALUE & i11);
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m29314x(int i7, ErrorCode errorCode, byte[] debugData) {
        try {
            AbstractC6118n.m27187e(errorCode, "errorCode");
            AbstractC6118n.m27187e(debugData, "debugData");
            if (this.f25959e) {
                throw new IOException("closed");
            }
            if (errorCode.m29114d() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m29313n(0, debugData.length + 8, 7, 0);
            this.f25955a.mo3008A(i7);
            this.f25955a.mo3008A(errorCode.m29114d());
            if (!(debugData.length == 0)) {
                this.f25955a.mo3070u0(debugData);
            }
            this.f25955a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }
}
