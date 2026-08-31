package p072I6;

import com.google.android.gms.common.api.C3553a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6118n;
import p080J6.AbstractC0706a;
import p302m6.AbstractC6399a;

/* JADX INFO: renamed from: I6.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0665v implements InterfaceC0650g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0640B f2593a;

    /* JADX INFO: renamed from: b */
    public final C0648e f2594b;

    /* JADX INFO: renamed from: c */
    public boolean f2595c;

    public C0665v(InterfaceC0640B source) {
        AbstractC6118n.m27187e(source, "source");
        this.f2593a = source;
        this.f2594b = new C0648e();
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: E */
    public boolean mo3009E() {
        if (this.f2595c) {
            throw new IllegalStateException("closed");
        }
        return this.f2594b.mo3009E() && this.f2593a.mo2949w(this.f2594b, 8192L) == -1;
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: G0 */
    public void mo3011G0(long j7) throws EOFException {
        if (!m3165J(j7)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m3165J(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (this.f2595c) {
            throw new IllegalStateException("closed");
        }
        while (this.f2594b.m3046h1() < j7) {
            if (this.f2593a.mo2949w(this.f2594b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: L0 */
    public long mo3015L0() throws EOFException {
        mo3011G0(1L);
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            if (!m3165J(i8)) {
                break;
            }
            byte bM3060p0 = this.f2594b.m3060p0(i7);
            if ((bM3060p0 < 48 || bM3060p0 > 57) && ((bM3060p0 < 97 || bM3060p0 > 102) && (bM3060p0 < 65 || bM3060p0 > 70))) {
                if (i7 != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bM3060p0, AbstractC6399a.m27516a(AbstractC6399a.m27516a(16)));
                AbstractC6118n.m27186d(string, "toString(this, checkRadix(radix))");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            i7 = i8;
        }
        return this.f2594b.mo3015L0();
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: O */
    public long mo3018O() throws EOFException {
        mo3011G0(1L);
        long j7 = 0;
        while (true) {
            long j8 = j7 + 1;
            if (!m3165J(j8)) {
                break;
            }
            byte bM3060p0 = this.f2594b.m3060p0(j7);
            if ((bM3060p0 < 48 || bM3060p0 > 57) && !(j7 == 0 && bM3060p0 == 45)) {
                if (j7 != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bM3060p0, AbstractC6399a.m27516a(AbstractC6399a.m27516a(16)));
                AbstractC6118n.m27186d(string, "toString(this, checkRadix(radix))");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            j7 = j8;
        }
        return this.f2594b.mo3018O();
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: O0 */
    public InputStream mo3019O0() {
        return new a();
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: P */
    public String mo3020P(long j7) throws EOFException {
        if (j7 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j7).toString());
        }
        long j8 = j7 == Long.MAX_VALUE ? Long.MAX_VALUE : j7 + 1;
        long jM3167m = m3167m((byte) 10, 0L, j8);
        if (jM3167m != -1) {
            return AbstractC0706a.m3439d(this.f2594b, jM3167m);
        }
        if (j8 < Long.MAX_VALUE && m3165J(j8) && this.f2594b.m3060p0(j8 - 1) == 13 && m3165J(j8 + 1) && this.f2594b.m3060p0(j8) == 10) {
            return AbstractC0706a.m3439d(this.f2594b, j8);
        }
        C0648e c0648e = new C0648e();
        C0648e c0648e2 = this.f2594b;
        c0648e2.m3050k0(c0648e, 0L, Math.min(32, c0648e2.m3046h1()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f2594b.m3046h1(), j7) + " content=" + c0648e.m3034a1().mo3104q() + (char) 8230);
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: U */
    public void mo3026U(C0648e sink, long j7) throws EOFException {
        AbstractC6118n.m27187e(sink, "sink");
        try {
            mo3011G0(j7);
            this.f2594b.mo3026U(sink, j7);
        } catch (EOFException e7) {
            sink.mo3029W(this.f2594b);
            throw e7;
        }
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: b0 */
    public String mo3035b0(Charset charset) {
        AbstractC6118n.m27187e(charset, "charset");
        this.f2594b.mo3029W(this.f2593a);
        return this.f2594b.mo3035b0(charset);
    }

    @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f2595c) {
            return;
        }
        this.f2595c = true;
        this.f2593a.close();
        this.f2594b.m3076x();
    }

    /* JADX INFO: renamed from: d */
    public long m3166d(byte b7) {
        return m3167m(b7, 0L, Long.MAX_VALUE);
    }

    @Override // p072I6.InterfaceC0650g, p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: f */
    public C0648e mo3043f() {
        return this.f2594b;
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: g */
    public C0641C mo2948g() {
        return this.f2593a.mo2948g();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f2595c;
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: l */
    public void mo3052l(long j7) throws EOFException {
        if (this.f2595c) {
            throw new IllegalStateException("closed");
        }
        while (j7 > 0) {
            if (this.f2594b.m3046h1() == 0 && this.f2593a.mo2949w(this.f2594b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j7, this.f2594b.m3046h1());
            this.f2594b.mo3052l(jMin);
            j7 -= jMin;
        }
    }

    /* JADX INFO: renamed from: m */
    public long m3167m(byte b7, long j7, long j8) {
        if (this.f2595c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j7 || j7 > j8) {
            throw new IllegalArgumentException(("fromIndex=" + j7 + " toIndex=" + j8).toString());
        }
        long jMax = j7;
        while (jMax < j8) {
            byte b8 = b7;
            long j9 = j8;
            long jM3074w0 = this.f2594b.m3074w0(b8, jMax, j9);
            if (jM3074w0 != -1) {
                return jM3074w0;
            }
            long jM3046h1 = this.f2594b.m3046h1();
            if (jM3046h1 >= j9 || this.f2593a.mo2949w(this.f2594b, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, jM3046h1);
            b7 = b8;
            j8 = j9;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: n */
    public int m3168n() throws EOFException {
        mo3011G0(4L);
        return this.f2594b.m3036b1();
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: n0 */
    public String mo3056n0() {
        return mo3020P(Long.MAX_VALUE);
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: r */
    public C0651h mo3063r(long j7) throws EOFException {
        mo3011G0(j7);
        return this.f2594b.mo3063r(j7);
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: r0 */
    public int mo3064r0(C0662s options) throws EOFException {
        AbstractC6118n.m27187e(options, "options");
        if (this.f2595c) {
            throw new IllegalStateException("closed");
        }
        do {
            int iM3440e = AbstractC0706a.m3440e(this.f2594b, options, true);
            if (iM3440e != -2) {
                if (iM3440e == -1) {
                    return -1;
                }
                this.f2594b.mo3052l(options.m3157m()[iM3440e].m3090F());
                return iM3440e;
            }
        } while (this.f2593a.mo2949w(this.f2594b, 8192L) != -1);
        return -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC6118n.m27187e(sink, "sink");
        if (this.f2594b.m3046h1() == 0 && this.f2593a.mo2949w(this.f2594b, 8192L) == -1) {
            return -1;
        }
        return this.f2594b.read(sink);
    }

    @Override // p072I6.InterfaceC0650g
    public byte readByte() throws EOFException {
        mo3011G0(1L);
        return this.f2594b.readByte();
    }

    @Override // p072I6.InterfaceC0650g
    public void readFully(byte[] sink) throws EOFException {
        AbstractC6118n.m27187e(sink, "sink");
        try {
            mo3011G0(sink.length);
            this.f2594b.readFully(sink);
        } catch (EOFException e7) {
            int i7 = 0;
            while (this.f2594b.m3046h1() > 0) {
                C0648e c0648e = this.f2594b;
                int iM3030W0 = c0648e.m3030W0(sink, i7, (int) c0648e.m3046h1());
                if (iM3030W0 == -1) {
                    throw new AssertionError();
                }
                i7 += iM3030W0;
            }
            throw e7;
        }
    }

    @Override // p072I6.InterfaceC0650g
    public int readInt() throws EOFException {
        mo3011G0(4L);
        return this.f2594b.readInt();
    }

    @Override // p072I6.InterfaceC0650g
    public long readLong() throws EOFException {
        mo3011G0(8L);
        return this.f2594b.readLong();
    }

    @Override // p072I6.InterfaceC0650g
    public short readShort() throws EOFException {
        mo3011G0(2L);
        return this.f2594b.readShort();
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: s0 */
    public byte[] mo3066s0(long j7) throws EOFException {
        mo3011G0(j7);
        return this.f2594b.mo3066s0(j7);
    }

    public String toString() {
        return "buffer(" + this.f2593a + ')';
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: w */
    public long mo2949w(C0648e sink, long j7) {
        AbstractC6118n.m27187e(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (this.f2595c) {
            throw new IllegalStateException("closed");
        }
        if (this.f2594b.m3046h1() == 0 && this.f2593a.mo2949w(this.f2594b, 8192L) == -1) {
            return -1L;
        }
        return this.f2594b.mo2949w(sink, Math.min(j7, this.f2594b.m3046h1()));
    }

    /* JADX INFO: renamed from: x */
    public short m3169x() throws EOFException {
        mo3011G0(2L);
        return this.f2594b.m3037c1();
    }

    /* JADX INFO: renamed from: I6.v$a */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C0665v c0665v = C0665v.this;
            if (c0665v.f2595c) {
                throw new IOException("closed");
            }
            return (int) Math.min(c0665v.f2594b.m3046h1(), C3553a.e.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            C0665v.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C0665v c0665v = C0665v.this;
            if (c0665v.f2595c) {
                throw new IOException("closed");
            }
            if (c0665v.f2594b.m3046h1() == 0) {
                C0665v c0665v2 = C0665v.this;
                if (c0665v2.f2593a.mo2949w(c0665v2.f2594b, 8192L) == -1) {
                    return -1;
                }
            }
            return C0665v.this.f2594b.readByte() & 255;
        }

        public String toString() {
            return C0665v.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i7, int i8) throws IOException {
            AbstractC6118n.m27187e(data, "data");
            if (!C0665v.this.f2595c) {
                AbstractC0645b.m2968b(data.length, i7, i8);
                if (C0665v.this.f2594b.m3046h1() == 0) {
                    C0665v c0665v = C0665v.this;
                    if (c0665v.f2593a.mo2949w(c0665v.f2594b, 8192L) == -1) {
                        return -1;
                    }
                }
                return C0665v.this.f2594b.m3030W0(data, i7, i8);
            }
            throw new IOException("closed");
        }
    }
}
