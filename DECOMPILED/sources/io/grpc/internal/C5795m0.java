package io.grpc.internal;

import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
import p063H5.C0554l0;
import p063H5.InterfaceC0553l;
import p063H5.InterfaceC0569u;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.m0 */
/* JADX INFO: loaded from: classes.dex */
public class C5795m0 implements Closeable, InterfaceC5820z {

    /* JADX INFO: renamed from: B */
    private int f22749B;

    /* JADX INFO: renamed from: a */
    private b f22752a;

    /* JADX INFO: renamed from: b */
    private int f22753b;

    /* JADX INFO: renamed from: c */
    private final C5751O0 f22754c;

    /* JADX INFO: renamed from: d */
    private final C5762U0 f22755d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0569u f22756e;

    /* JADX INFO: renamed from: f */
    private C5759T f22757f;

    /* JADX INFO: renamed from: r */
    private byte[] f22758r;

    /* JADX INFO: renamed from: s */
    private int f22759s;

    /* JADX INFO: renamed from: v */
    private boolean f22762v;

    /* JADX INFO: renamed from: w */
    private C5812v f22763w;

    /* JADX INFO: renamed from: y */
    private long f22765y;

    /* JADX INFO: renamed from: t */
    private e f22760t = e.HEADER;

    /* JADX INFO: renamed from: u */
    private int f22761u = 5;

    /* JADX INFO: renamed from: x */
    private C5812v f22764x = new C5812v();

    /* JADX INFO: renamed from: z */
    private boolean f22766z = false;

    /* JADX INFO: renamed from: A */
    private int f22748A = -1;

    /* JADX INFO: renamed from: C */
    private boolean f22750C = false;

    /* JADX INFO: renamed from: D */
    private volatile boolean f22751D = false;

    /* JADX INFO: renamed from: io.grpc.internal.m0$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f22767a;

        static {
            int[] iArr = new int[e.values().length];
            f22767a = iArr;
            try {
                iArr[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22767a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.m0$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo25632a(InterfaceC5755Q0.a aVar);

        /* JADX INFO: renamed from: c */
        void mo3281c(boolean z7);

        /* JADX INFO: renamed from: d */
        void mo3283d(int i7);

        /* JADX INFO: renamed from: e */
        void mo3284e(Throwable th);
    }

    /* JADX INFO: renamed from: io.grpc.internal.m0$c */
    private static class c implements InterfaceC5755Q0.a {

        /* JADX INFO: renamed from: a */
        private InputStream f22768a;

        /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        @Override // io.grpc.internal.InterfaceC5755Q0.a
        public InputStream next() {
            InputStream inputStream = this.f22768a;
            this.f22768a = null;
            return inputStream;
        }

        private c(InputStream inputStream) {
            this.f22768a = inputStream;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.m0$e */
    private enum e {
        HEADER,
        BODY
    }

    public C5795m0(b bVar, InterfaceC0569u interfaceC0569u, int i7, C5751O0 c5751o0, C5762U0 c5762u0) {
        this.f22752a = (b) AbstractC1209m.m5303o(bVar, "sink");
        this.f22756e = (InterfaceC0569u) AbstractC1209m.m5303o(interfaceC0569u, "decompressor");
        this.f22753b = i7;
        this.f22754c = (C5751O0) AbstractC1209m.m5303o(c5751o0, "statsTraceCtx");
        this.f22755d = (C5762U0) AbstractC1209m.m5303o(c5762u0, "transportTracer");
    }

    /* JADX INFO: renamed from: K0 */
    private boolean m26063K0() throws Throwable {
        int iM25719p0;
        int i7 = 0;
        try {
            if (this.f22763w == null) {
                this.f22763w = new C5812v();
            }
            int iM25718o0 = 0;
            iM25719p0 = 0;
            while (true) {
                try {
                    int iMo3397e = this.f22761u - this.f22763w.mo3397e();
                    if (iMo3397e <= 0) {
                        if (iM25718o0 > 0) {
                            this.f22752a.mo3283d(iM25718o0);
                            if (this.f22760t == e.BODY) {
                                if (this.f22757f != null) {
                                    this.f22754c.m25653g(iM25719p0);
                                    this.f22749B += iM25719p0;
                                    return true;
                                }
                                this.f22754c.m25653g(iM25718o0);
                                this.f22749B += iM25718o0;
                            }
                        }
                        return true;
                    }
                    if (this.f22757f != null) {
                        try {
                            byte[] bArr = this.f22758r;
                            if (bArr == null || this.f22759s == bArr.length) {
                                this.f22758r = new byte[Math.min(iMo3397e, 2097152)];
                                this.f22759s = 0;
                            }
                            int iM25715Q0 = this.f22757f.m25715Q0(this.f22758r, this.f22759s, Math.min(iMo3397e, this.f22758r.length - this.f22759s));
                            iM25718o0 += this.f22757f.m25718o0();
                            iM25719p0 += this.f22757f.m25719p0();
                            if (iM25715Q0 == 0) {
                                if (iM25718o0 > 0) {
                                    this.f22752a.mo3283d(iM25718o0);
                                    if (this.f22760t == e.BODY) {
                                        if (this.f22757f != null) {
                                            this.f22754c.m25653g(iM25719p0);
                                            this.f22749B += iM25719p0;
                                            return false;
                                        }
                                        this.f22754c.m25653g(iM25718o0);
                                        this.f22749B += iM25718o0;
                                    }
                                }
                                return false;
                            }
                            this.f22763w.m26200m(AbstractC5821z0.m26222f(this.f22758r, this.f22759s, iM25715Q0));
                            this.f22759s += iM25715Q0;
                        } catch (IOException e7) {
                            throw new RuntimeException(e7);
                        } catch (DataFormatException e8) {
                            throw new RuntimeException(e8);
                        }
                    } else {
                        if (this.f22764x.mo3397e() == 0) {
                            if (iM25718o0 > 0) {
                                this.f22752a.mo3283d(iM25718o0);
                                if (this.f22760t == e.BODY) {
                                    if (this.f22757f != null) {
                                        this.f22754c.m25653g(iM25719p0);
                                        this.f22749B += iM25719p0;
                                        return false;
                                    }
                                    this.f22754c.m25653g(iM25718o0);
                                    this.f22749B += iM25718o0;
                                }
                            }
                            return false;
                        }
                        int iMin = Math.min(iMo3397e, this.f22764x.mo3397e());
                        iM25718o0 += iMin;
                        this.f22763w.m26200m(this.f22764x.mo3394B(iMin));
                    }
                } catch (Throwable th) {
                    int i8 = iM25718o0;
                    th = th;
                    i7 = i8;
                    if (i7 > 0) {
                        this.f22752a.mo3283d(i7);
                        if (this.f22760t == e.BODY) {
                            if (this.f22757f != null) {
                                this.f22754c.m25653g(iM25719p0);
                                this.f22749B += iM25719p0;
                            } else {
                                this.f22754c.m25653g(i7);
                                this.f22749B += i7;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            iM25719p0 = 0;
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m26064Q() {
        if (this.f22766z) {
            return;
        }
        this.f22766z = true;
        while (!this.f22751D && this.f22765y > 0 && m26063K0()) {
            try {
                int i7 = a.f22767a[this.f22760t.ordinal()];
                if (i7 == 1) {
                    m26070w0();
                } else {
                    if (i7 != 2) {
                        throw new AssertionError("Invalid state: " + this.f22760t);
                    }
                    m26069p0();
                    this.f22765y--;
                }
            } catch (Throwable th) {
                this.f22766z = false;
                throw th;
            }
        }
        if (this.f22751D) {
            close();
            this.f22766z = false;
        } else {
            if (this.f22750C && m26068o0()) {
                close();
            }
            this.f22766z = false;
        }
    }

    /* JADX INFO: renamed from: d0 */
    private InputStream m26065d0() {
        InterfaceC0569u interfaceC0569u = this.f22756e;
        if (interfaceC0569u == InterfaceC0553l.b.f2096a) {
            throw C0554l0.f2112s.m2462q("Can't decode compressed gRPC message as compression not configured").m2455d();
        }
        try {
            return new d(interfaceC0569u.mo2444b(AbstractC5821z0.m26219c(this.f22763w, true)), this.f22753b, this.f22754c);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: k0 */
    private InputStream m26066k0() {
        this.f22754c.m25652f(this.f22763w.mo3397e());
        return AbstractC5821z0.m26219c(this.f22763w, true);
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m26067l0() {
        return isClosed() || this.f22750C;
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m26068o0() {
        C5759T c5759t = this.f22757f;
        if (c5759t != null) {
            return c5759t.m25716S0();
        }
        return this.f22764x.mo3397e() == 0;
    }

    /* JADX INFO: renamed from: p0 */
    private void m26069p0() {
        this.f22754c.m25651e(this.f22748A, this.f22749B, -1L);
        this.f22749B = 0;
        InputStream inputStreamM26065d0 = this.f22762v ? m26065d0() : m26066k0();
        this.f22763w.m26216v0();
        this.f22763w = null;
        this.f22752a.mo25632a(new c(inputStreamM26065d0, null));
        this.f22760t = e.HEADER;
        this.f22761u = 5;
    }

    /* JADX INFO: renamed from: w0 */
    private void m26070w0() {
        int unsignedByte = this.f22763w.readUnsignedByte();
        if ((unsignedByte & 254) != 0) {
            throw C0554l0.f2112s.m2462q("gRPC frame header malformed: reserved bits not zero").m2455d();
        }
        this.f22762v = (unsignedByte & 1) != 0;
        int i7 = this.f22763w.readInt();
        this.f22761u = i7;
        if (i7 < 0 || i7 > this.f22753b) {
            throw C0554l0.f2107n.m2462q(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f22753b), Integer.valueOf(this.f22761u))).m2455d();
        }
        int i8 = this.f22748A + 1;
        this.f22748A = i8;
        this.f22754c.m25650d(i8);
        this.f22755d.m25737d();
        this.f22760t = e.BODY;
    }

    @Override // io.grpc.internal.InterfaceC5820z
    /* JADX INFO: renamed from: J */
    public void mo25912J(InterfaceC5819y0 interfaceC5819y0) throws Throwable {
        AbstractC1209m.m5303o(interfaceC5819y0, "data");
        boolean z7 = true;
        try {
            if (m26067l0()) {
                interfaceC5819y0.close();
                return;
            }
            C5759T c5759t = this.f22757f;
            if (c5759t != null) {
                c5759t.m25717k0(interfaceC5819y0);
            } else {
                this.f22764x.m26200m(interfaceC5819y0);
            }
            try {
                m26064Q();
            } catch (Throwable th) {
                th = th;
                z7 = false;
                if (z7) {
                    interfaceC5819y0.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m26071Q0(C5759T c5759t) {
        AbstractC1209m.m5309u(this.f22756e == InterfaceC0553l.b.f2096a, "per-message decompressor already set");
        AbstractC1209m.m5309u(this.f22757f == null, "full stream decompressor already set");
        this.f22757f = (C5759T) AbstractC1209m.m5303o(c5759t, "Can't pass a null full stream decompressor");
        this.f22764x = null;
    }

    /* JADX INFO: renamed from: R0 */
    void m26072R0(b bVar) {
        this.f22752a = bVar;
    }

    /* JADX INFO: renamed from: S0 */
    void m26073S0() {
        this.f22751D = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.InterfaceC5820z
    public void close() {
        if (isClosed()) {
            return;
        }
        C5812v c5812v = this.f22763w;
        boolean z7 = c5812v != null && c5812v.mo3397e() > 0;
        try {
            C5759T c5759t = this.f22757f;
            if (c5759t != null) {
                boolean z8 = z7 || c5759t.m25720w0();
                this.f22757f.close();
                z7 = z8;
            }
            C5812v c5812v2 = this.f22764x;
            if (c5812v2 != null) {
                c5812v2.close();
            }
            C5812v c5812v3 = this.f22763w;
            if (c5812v3 != null) {
                c5812v3.close();
            }
            this.f22757f = null;
            this.f22764x = null;
            this.f22763w = null;
            this.f22752a.mo3281c(z7);
        } catch (Throwable th) {
            this.f22757f = null;
            this.f22764x = null;
            this.f22763w = null;
            throw th;
        }
    }

    @Override // io.grpc.internal.InterfaceC5820z
    /* JADX INFO: renamed from: d */
    public void mo25913d(int i7) {
        AbstractC1209m.m5293e(i7 > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f22765y += (long) i7;
        m26064Q();
    }

    public boolean isClosed() {
        return this.f22764x == null && this.f22757f == null;
    }

    @Override // io.grpc.internal.InterfaceC5820z
    /* JADX INFO: renamed from: m */
    public void mo25914m(int i7) {
        this.f22753b = i7;
    }

    @Override // io.grpc.internal.InterfaceC5820z
    /* JADX INFO: renamed from: n */
    public void mo25915n(InterfaceC0569u interfaceC0569u) {
        AbstractC1209m.m5309u(this.f22757f == null, "Already set full stream decompressor");
        this.f22756e = (InterfaceC0569u) AbstractC1209m.m5303o(interfaceC0569u, "Can't pass an empty decompressor");
    }

    @Override // io.grpc.internal.InterfaceC5820z
    /* JADX INFO: renamed from: x */
    public void mo25916x() {
        if (isClosed()) {
            return;
        }
        if (m26068o0()) {
            close();
        } else {
            this.f22750C = true;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.m0$d */
    static final class d extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        private final int f22769a;

        /* JADX INFO: renamed from: b */
        private final C5751O0 f22770b;

        /* JADX INFO: renamed from: c */
        private long f22771c;

        /* JADX INFO: renamed from: d */
        private long f22772d;

        /* JADX INFO: renamed from: e */
        private long f22773e;

        d(InputStream inputStream, int i7, C5751O0 c5751o0) {
            super(inputStream);
            this.f22773e = -1L;
            this.f22769a = i7;
            this.f22770b = c5751o0;
        }

        /* JADX INFO: renamed from: d */
        private void m26074d() {
            long j7 = this.f22772d;
            long j8 = this.f22771c;
            if (j7 > j8) {
                this.f22770b.m25652f(j7 - j8);
                this.f22771c = this.f22772d;
            }
        }

        /* JADX INFO: renamed from: m */
        private void m26075m() {
            if (this.f22772d <= this.f22769a) {
                return;
            }
            throw C0554l0.f2107n.m2462q("Decompressed gRPC message exceeds maximum size " + this.f22769a).m2455d();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i7) {
            ((FilterInputStream) this).in.mark(i7);
            this.f22773e = this.f22772d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i7 = ((FilterInputStream) this).in.read();
            if (i7 != -1) {
                this.f22772d++;
            }
            m26075m();
            m26074d();
            return i7;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f22773e == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f22772d = this.f22773e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j7) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j7);
            this.f22772d += jSkip;
            m26075m();
            m26074d();
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) throws IOException {
            int i9 = ((FilterInputStream) this).in.read(bArr, i7, i8);
            if (i9 != -1) {
                this.f22772d += (long) i9;
            }
            m26075m();
            m26074d();
            return i9;
        }
    }
}
