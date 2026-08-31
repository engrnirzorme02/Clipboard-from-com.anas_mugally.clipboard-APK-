package io.grpc.internal;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.T */
/* JADX INFO: loaded from: classes.dex */
class C5759T implements Closeable {

    /* JADX INFO: renamed from: e */
    private int f22274e;

    /* JADX INFO: renamed from: f */
    private int f22275f;

    /* JADX INFO: renamed from: r */
    private Inflater f22276r;

    /* JADX INFO: renamed from: u */
    private int f22279u;

    /* JADX INFO: renamed from: v */
    private int f22280v;

    /* JADX INFO: renamed from: w */
    private long f22281w;

    /* JADX INFO: renamed from: a */
    private final C5812v f22270a = new C5812v();

    /* JADX INFO: renamed from: b */
    private final CRC32 f22271b = new CRC32();

    /* JADX INFO: renamed from: c */
    private final b f22272c = new b(this, null);

    /* JADX INFO: renamed from: d */
    private final byte[] f22273d = new byte[512];

    /* JADX INFO: renamed from: s */
    private c f22277s = c.HEADER;

    /* JADX INFO: renamed from: t */
    private boolean f22278t = false;

    /* JADX INFO: renamed from: x */
    private int f22282x = 0;

    /* JADX INFO: renamed from: y */
    private int f22283y = 0;

    /* JADX INFO: renamed from: z */
    private boolean f22284z = true;

    /* JADX INFO: renamed from: io.grpc.internal.T$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f22285a;

        static {
            int[] iArr = new int[c.values().length];
            f22285a = iArr;
            try {
                iArr[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22285a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22285a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22285a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22285a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22285a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22285a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22285a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22285a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22285a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.T$b */
    private class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public boolean m25727g() {
            while (m25731k() > 0) {
                if (m25728h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public int m25728h() {
            int unsignedByte;
            if (C5759T.this.f22275f - C5759T.this.f22274e > 0) {
                unsignedByte = C5759T.this.f22273d[C5759T.this.f22274e] & 255;
                C5759T.m25713n(C5759T.this, 1);
            } else {
                unsignedByte = C5759T.this.f22270a.readUnsignedByte();
            }
            C5759T.this.f22271b.update(unsignedByte);
            C5759T.m25710d0(C5759T.this, 1);
            return unsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public long m25729i() {
            return ((long) m25730j()) | (((long) m25730j()) << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public int m25730j() {
            return m25728h() | (m25728h() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public int m25731k() {
            return (C5759T.this.f22275f - C5759T.this.f22274e) + C5759T.this.f22270a.mo3397e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public void m25732l(int i7) {
            int i8;
            int i9 = C5759T.this.f22275f - C5759T.this.f22274e;
            if (i9 > 0) {
                int iMin = Math.min(i9, i7);
                C5759T.this.f22271b.update(C5759T.this.f22273d, C5759T.this.f22274e, iMin);
                C5759T.m25713n(C5759T.this, iMin);
                i8 = i7 - iMin;
            } else {
                i8 = i7;
            }
            if (i8 > 0) {
                byte[] bArr = new byte[512];
                int i10 = 0;
                while (i10 < i8) {
                    int iMin2 = Math.min(i8 - i10, 512);
                    C5759T.this.f22270a.mo3396c0(bArr, 0, iMin2);
                    C5759T.this.f22271b.update(bArr, 0, iMin2);
                    i10 += iMin2;
                }
            }
            C5759T.m25710d0(C5759T.this, i7);
        }

        /* synthetic */ b(C5759T c5759t, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.T$c */
    private enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    C5759T() {
    }

    /* JADX INFO: renamed from: K0 */
    private int m25699K0(byte[] bArr, int i7, int i8) throws DataFormatException {
        AbstractC1209m.m5309u(this.f22276r != null, "inflater is null");
        try {
            int totalIn = this.f22276r.getTotalIn();
            int iInflate = this.f22276r.inflate(bArr, i7, i8);
            int totalIn2 = this.f22276r.getTotalIn() - totalIn;
            this.f22282x += totalIn2;
            this.f22283y += totalIn2;
            this.f22274e += totalIn2;
            this.f22271b.update(bArr, i7, iInflate);
            if (this.f22276r.finished()) {
                this.f22281w = this.f22276r.getBytesWritten() & 4294967295L;
                this.f22277s = c.TRAILER;
                return iInflate;
            }
            if (this.f22276r.needsInput()) {
                this.f22277s = c.INFLATER_NEEDS_INPUT;
            }
            return iInflate;
        } catch (DataFormatException e7) {
            throw new DataFormatException("Inflater data format exception: " + e7.getMessage());
        }
    }

    /* JADX INFO: renamed from: R0 */
    private boolean m25701R0() {
        Inflater inflater = this.f22276r;
        if (inflater == null) {
            this.f22276r = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f22271b.reset();
        int i7 = this.f22275f;
        int i8 = this.f22274e;
        int i9 = i7 - i8;
        if (i9 > 0) {
            this.f22276r.setInput(this.f22273d, i8, i9);
            this.f22277s = c.INFLATING;
        } else {
            this.f22277s = c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    /* JADX INFO: renamed from: T0 */
    private boolean m25702T0() throws ZipException {
        if (this.f22272c.m25731k() < 10) {
            return false;
        }
        if (this.f22272c.m25730j() != 35615) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.f22272c.m25728h() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.f22279u = this.f22272c.m25728h();
        this.f22272c.m25732l(6);
        this.f22277s = c.HEADER_EXTRA_LEN;
        return true;
    }

    /* JADX INFO: renamed from: U0 */
    private boolean m25703U0() {
        if ((this.f22279u & 16) != 16) {
            this.f22277s = c.HEADER_CRC;
            return true;
        }
        if (!this.f22272c.m25727g()) {
            return false;
        }
        this.f22277s = c.HEADER_CRC;
        return true;
    }

    /* JADX INFO: renamed from: V0 */
    private boolean m25704V0() throws ZipException {
        if ((this.f22279u & 2) != 2) {
            this.f22277s = c.INITIALIZE_INFLATER;
            return true;
        }
        if (this.f22272c.m25731k() < 2) {
            return false;
        }
        if ((((int) this.f22271b.getValue()) & 65535) != this.f22272c.m25730j()) {
            throw new ZipException("Corrupt GZIP header");
        }
        this.f22277s = c.INITIALIZE_INFLATER;
        return true;
    }

    /* JADX INFO: renamed from: W0 */
    private boolean m25705W0() {
        int iM25731k = this.f22272c.m25731k();
        int i7 = this.f22280v;
        if (iM25731k < i7) {
            return false;
        }
        this.f22272c.m25732l(i7);
        this.f22277s = c.HEADER_NAME;
        return true;
    }

    /* JADX INFO: renamed from: X0 */
    private boolean m25706X0() {
        if ((this.f22279u & 4) != 4) {
            this.f22277s = c.HEADER_NAME;
            return true;
        }
        if (this.f22272c.m25731k() < 2) {
            return false;
        }
        this.f22280v = this.f22272c.m25730j();
        this.f22277s = c.HEADER_EXTRA;
        return true;
    }

    /* JADX INFO: renamed from: Y0 */
    private boolean m25707Y0() {
        if ((this.f22279u & 8) != 8) {
            this.f22277s = c.HEADER_COMMENT;
            return true;
        }
        if (!this.f22272c.m25727g()) {
            return false;
        }
        this.f22277s = c.HEADER_COMMENT;
        return true;
    }

    /* JADX INFO: renamed from: Z0 */
    private boolean m25708Z0() throws ZipException {
        if (this.f22276r != null && this.f22272c.m25731k() <= 18) {
            this.f22276r.end();
            this.f22276r = null;
        }
        if (this.f22272c.m25731k() < 8) {
            return false;
        }
        if (this.f22271b.getValue() != this.f22272c.m25729i() || this.f22281w != this.f22272c.m25729i()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.f22271b.reset();
        this.f22277s = c.HEADER;
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    static /* synthetic */ int m25710d0(C5759T c5759t, int i7) {
        int i8 = c5759t.f22282x + i7;
        c5759t.f22282x = i8;
        return i8;
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m25711l0() {
        AbstractC1209m.m5309u(this.f22276r != null, "inflater is null");
        AbstractC1209m.m5309u(this.f22274e == this.f22275f, "inflaterInput has unconsumed bytes");
        int iMin = Math.min(this.f22270a.mo3397e(), 512);
        if (iMin == 0) {
            return false;
        }
        this.f22274e = 0;
        this.f22275f = iMin;
        this.f22270a.mo3396c0(this.f22273d, 0, iMin);
        this.f22276r.setInput(this.f22273d, this.f22274e, iMin);
        this.f22277s = c.INFLATING;
        return true;
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ int m25713n(C5759T c5759t, int i7) {
        int i8 = c5759t.f22274e + i7;
        c5759t.f22274e = i8;
        return i8;
    }

    /* JADX INFO: renamed from: Q0 */
    int m25715Q0(byte[] bArr, int i7, int i8) throws ZipException {
        boolean zM25708Z0;
        boolean z7 = true;
        AbstractC1209m.m5309u(!this.f22278t, "GzipInflatingBuffer is closed");
        int iM25699K0 = 0;
        while (true) {
            zM25708Z0 = true;
            while (true) {
                if (zM25708Z0) {
                    int i9 = i8 - iM25699K0;
                    if (i9 > 0) {
                        switch (a.f22285a[this.f22277s.ordinal()]) {
                            case 1:
                                zM25708Z0 = m25702T0();
                                break;
                            case 2:
                                zM25708Z0 = m25706X0();
                                break;
                            case 3:
                                zM25708Z0 = m25705W0();
                                break;
                            case 4:
                                zM25708Z0 = m25707Y0();
                                break;
                            case 5:
                                zM25708Z0 = m25703U0();
                                break;
                            case 6:
                                zM25708Z0 = m25704V0();
                                break;
                            case 7:
                                zM25708Z0 = m25701R0();
                                break;
                            case 8:
                                iM25699K0 += m25699K0(bArr, i7 + iM25699K0, i9);
                                if (this.f22277s == c.TRAILER) {
                                    zM25708Z0 = m25708Z0();
                                }
                                break;
                            case 9:
                                zM25708Z0 = m25711l0();
                                break;
                            case 10:
                                zM25708Z0 = m25708Z0();
                                break;
                            default:
                                throw new AssertionError("Invalid state: " + this.f22277s);
                        }
                    }
                }
            }
        }
        if (zM25708Z0 && (this.f22277s != c.HEADER || this.f22272c.m25731k() >= 10)) {
            z7 = false;
        }
        this.f22284z = z7;
        return iM25699K0;
    }

    /* JADX INFO: renamed from: S0 */
    boolean m25716S0() {
        AbstractC1209m.m5309u(!this.f22278t, "GzipInflatingBuffer is closed");
        return this.f22284z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f22278t) {
            return;
        }
        this.f22278t = true;
        this.f22270a.close();
        Inflater inflater = this.f22276r;
        if (inflater != null) {
            inflater.end();
            this.f22276r = null;
        }
    }

    /* JADX INFO: renamed from: k0 */
    void m25717k0(InterfaceC5819y0 interfaceC5819y0) {
        AbstractC1209m.m5309u(!this.f22278t, "GzipInflatingBuffer is closed");
        this.f22270a.m26200m(interfaceC5819y0);
        this.f22284z = false;
    }

    /* JADX INFO: renamed from: o0 */
    int m25718o0() {
        int i7 = this.f22282x;
        this.f22282x = 0;
        return i7;
    }

    /* JADX INFO: renamed from: p0 */
    int m25719p0() {
        int i7 = this.f22283y;
        this.f22283y = 0;
        return i7;
    }

    /* JADX INFO: renamed from: w0 */
    boolean m25720w0() {
        AbstractC1209m.m5309u(!this.f22278t, "GzipInflatingBuffer is closed");
        return (this.f22272c.m25731k() == 0 && this.f22277s == c.HEADER) ? false : true;
    }
}
