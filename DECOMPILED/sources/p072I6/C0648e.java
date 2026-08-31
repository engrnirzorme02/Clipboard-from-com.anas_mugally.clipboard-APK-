package p072I6;

import com.google.android.gms.common.api.C3553a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6118n;
import p080J6.AbstractC0706a;
import p152T5.AbstractC1631j;
import p302m6.C6402d;

/* JADX INFO: renamed from: I6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0648e implements InterfaceC0650g, InterfaceC0649f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a */
    public C0666w f2551a;

    /* JADX INFO: renamed from: b */
    private long f2552b;

    /* JADX INFO: renamed from: I6.e$a */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a */
        public C0648e f2553a;

        /* JADX INFO: renamed from: b */
        public boolean f2554b;

        /* JADX INFO: renamed from: c */
        private C0666w f2555c;

        /* JADX INFO: renamed from: e */
        public byte[] f2557e;

        /* JADX INFO: renamed from: d */
        public long f2556d = -1;

        /* JADX INFO: renamed from: f */
        public int f2558f = -1;

        /* JADX INFO: renamed from: r */
        public int f2559r = -1;

        /* JADX INFO: renamed from: J */
        public final void m3079J(C0666w c0666w) {
            this.f2555c = c0666w;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f2553a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f2553a = null;
            m3079J(null);
            this.f2556d = -1L;
            this.f2557e = null;
            this.f2558f = -1;
            this.f2559r = -1;
        }

        /* JADX INFO: renamed from: d */
        public final C0666w m3080d() {
            return this.f2555c;
        }

        /* JADX INFO: renamed from: m */
        public final int m3081m() {
            long j7 = this.f2556d;
            C0648e c0648e = this.f2553a;
            AbstractC6118n.m27184b(c0648e);
            if (j7 == c0648e.m3046h1()) {
                throw new IllegalStateException("no more bytes");
            }
            long j8 = this.f2556d;
            return m3083x(j8 == -1 ? 0L : j8 + ((long) (this.f2559r - this.f2558f)));
        }

        /* JADX INFO: renamed from: n */
        public final long m3082n(long j7) {
            C0648e c0648e = this.f2553a;
            if (c0648e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f2554b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long jM3046h1 = c0648e.m3046h1();
            if (j7 <= jM3046h1) {
                if (j7 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j7).toString());
                }
                long j8 = jM3046h1 - j7;
                while (j8 > 0) {
                    C0666w c0666w = c0648e.f2551a;
                    AbstractC6118n.m27184b(c0666w);
                    C0666w c0666w2 = c0666w.f2604g;
                    AbstractC6118n.m27184b(c0666w2);
                    int i7 = c0666w2.f2600c;
                    long j9 = i7 - c0666w2.f2599b;
                    if (j9 > j8) {
                        c0666w2.f2600c = i7 - ((int) j8);
                        break;
                    }
                    c0648e.f2551a = c0666w2.m3171b();
                    C0667x.m3178b(c0666w2);
                    j8 -= j9;
                }
                m3079J(null);
                this.f2556d = j7;
                this.f2557e = null;
                this.f2558f = -1;
                this.f2559r = -1;
            } else if (j7 > jM3046h1) {
                long j10 = j7 - jM3046h1;
                boolean z7 = true;
                while (j10 > 0) {
                    C0666w c0666wM3051k1 = c0648e.m3051k1(1);
                    int iMin = (int) Math.min(j10, 8192 - c0666wM3051k1.f2600c);
                    c0666wM3051k1.f2600c += iMin;
                    j10 -= (long) iMin;
                    if (z7) {
                        m3079J(c0666wM3051k1);
                        this.f2556d = jM3046h1;
                        this.f2557e = c0666wM3051k1.f2598a;
                        int i8 = c0666wM3051k1.f2600c;
                        this.f2558f = i8 - iMin;
                        this.f2559r = i8;
                        z7 = false;
                    }
                }
            }
            c0648e.m3045g1(j7);
            return jM3046h1;
        }

        /* JADX INFO: renamed from: x */
        public final int m3083x(long j7) {
            C0666w c0666wM3172c;
            C0648e c0648e = this.f2553a;
            if (c0648e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j7 < -1 || j7 > c0648e.m3046h1()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j7 + " > size=" + c0648e.m3046h1());
            }
            if (j7 == -1 || j7 == c0648e.m3046h1()) {
                m3079J(null);
                this.f2556d = j7;
                this.f2557e = null;
                this.f2558f = -1;
                this.f2559r = -1;
                return -1;
            }
            long jM3046h1 = c0648e.m3046h1();
            C0666w c0666wM3080d = c0648e.f2551a;
            long j8 = 0;
            if (m3080d() != null) {
                long j9 = this.f2556d;
                int i7 = this.f2558f;
                C0666w c0666wM3080d2 = m3080d();
                AbstractC6118n.m27184b(c0666wM3080d2);
                long j10 = j9 - ((long) (i7 - c0666wM3080d2.f2599b));
                if (j10 > j7) {
                    c0666wM3172c = c0666wM3080d;
                    c0666wM3080d = m3080d();
                    jM3046h1 = j10;
                } else {
                    c0666wM3172c = m3080d();
                    j8 = j10;
                }
            } else {
                c0666wM3172c = c0666wM3080d;
            }
            if (jM3046h1 - j7 > j7 - j8) {
                while (true) {
                    AbstractC6118n.m27184b(c0666wM3172c);
                    int i8 = c0666wM3172c.f2600c;
                    int i9 = c0666wM3172c.f2599b;
                    if (j7 < ((long) (i8 - i9)) + j8) {
                        break;
                    }
                    j8 += (long) (i8 - i9);
                    c0666wM3172c = c0666wM3172c.f2603f;
                }
            } else {
                while (jM3046h1 > j7) {
                    AbstractC6118n.m27184b(c0666wM3080d);
                    c0666wM3080d = c0666wM3080d.f2604g;
                    AbstractC6118n.m27184b(c0666wM3080d);
                    jM3046h1 -= (long) (c0666wM3080d.f2600c - c0666wM3080d.f2599b);
                }
                j8 = jM3046h1;
                c0666wM3172c = c0666wM3080d;
            }
            if (this.f2554b) {
                AbstractC6118n.m27184b(c0666wM3172c);
                if (c0666wM3172c.f2601d) {
                    C0666w c0666wM3175f = c0666wM3172c.m3175f();
                    if (c0648e.f2551a == c0666wM3172c) {
                        c0648e.f2551a = c0666wM3175f;
                    }
                    c0666wM3172c = c0666wM3172c.m3172c(c0666wM3175f);
                    C0666w c0666w = c0666wM3172c.f2604g;
                    AbstractC6118n.m27184b(c0666w);
                    c0666w.m3171b();
                }
            }
            m3079J(c0666wM3172c);
            this.f2556d = j7;
            AbstractC6118n.m27184b(c0666wM3172c);
            this.f2557e = c0666wM3172c.f2598a;
            int i10 = c0666wM3172c.f2599b + ((int) (j7 - j8));
            this.f2558f = i10;
            int i11 = c0666wM3172c.f2600c;
            this.f2559r = i11;
            return i11 - i10;
        }
    }

    /* JADX INFO: renamed from: I6.e$c */
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C0648e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            C0648e.this.mo3010F(i7);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i7, int i8) {
            AbstractC6118n.m27187e(data, "data");
            C0648e.this.mo3047i(data, i7, i8);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ a m3007Y0(C0648e c0648e, a aVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = AbstractC0645b.m2970d();
        }
        return c0648e.m3032X0(aVar);
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: E */
    public boolean mo3009E() {
        return this.f2552b == 0;
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: G0 */
    public void mo3011G0(long j7) throws EOFException {
        if (this.f2552b < j7) {
            throw new EOFException();
        }
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: I */
    public void mo3003I(C0648e source, long j7) {
        C0666w c0666w;
        AbstractC6118n.m27187e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0645b.m2968b(source.m3046h1(), 0L, j7);
        while (j7 > 0) {
            C0666w c0666w2 = source.f2551a;
            AbstractC6118n.m27184b(c0666w2);
            int i7 = c0666w2.f2600c;
            C0666w c0666w3 = source.f2551a;
            AbstractC6118n.m27184b(c0666w3);
            if (j7 < i7 - c0666w3.f2599b) {
                C0666w c0666w4 = this.f2551a;
                if (c0666w4 != null) {
                    AbstractC6118n.m27184b(c0666w4);
                    c0666w = c0666w4.f2604g;
                } else {
                    c0666w = null;
                }
                if (c0666w != null && c0666w.f2602e) {
                    if ((((long) c0666w.f2600c) + j7) - ((long) (c0666w.f2601d ? 0 : c0666w.f2599b)) <= 8192) {
                        C0666w c0666w5 = source.f2551a;
                        AbstractC6118n.m27184b(c0666w5);
                        c0666w5.m3176g(c0666w, (int) j7);
                        source.m3045g1(source.m3046h1() - j7);
                        m3045g1(m3046h1() + j7);
                        return;
                    }
                }
                C0666w c0666w6 = source.f2551a;
                AbstractC6118n.m27184b(c0666w6);
                source.f2551a = c0666w6.m3174e((int) j7);
            }
            C0666w c0666w7 = source.f2551a;
            AbstractC6118n.m27184b(c0666w7);
            long j8 = c0666w7.f2600c - c0666w7.f2599b;
            source.f2551a = c0666w7.m3171b();
            C0666w c0666w8 = this.f2551a;
            if (c0666w8 == null) {
                this.f2551a = c0666w7;
                c0666w7.f2604g = c0666w7;
                c0666w7.f2603f = c0666w7;
            } else {
                AbstractC6118n.m27184b(c0666w8);
                C0666w c0666w9 = c0666w8.f2604g;
                AbstractC6118n.m27184b(c0666w9);
                c0666w9.m3172c(c0666w7).m3170a();
            }
            source.m3045g1(source.m3046h1() - j8);
            m3045g1(m3046h1() + j8);
            j7 -= j8;
        }
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public C0648e clone() {
        return m3039d0();
    }

    /* JADX INFO: renamed from: K0 */
    public long m3014K0(C0651h bytes) {
        AbstractC6118n.m27187e(bytes, "bytes");
        return m3022Q0(bytes, 0L);
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: L0 */
    public long mo3015L0() throws EOFException {
        int i7;
        if (m3046h1() == 0) {
            throw new EOFException();
        }
        int i8 = 0;
        boolean z7 = false;
        long j7 = 0;
        do {
            C0666w c0666w = this.f2551a;
            AbstractC6118n.m27184b(c0666w);
            byte[] bArr = c0666w.f2598a;
            int i9 = c0666w.f2599b;
            int i10 = c0666w.f2600c;
            while (i9 < i10) {
                byte b7 = bArr[i9];
                if (b7 >= 48 && b7 <= 57) {
                    i7 = b7 - 48;
                } else if (b7 >= 97 && b7 <= 102) {
                    i7 = b7 - 87;
                } else {
                    if (b7 < 65 || b7 > 70) {
                        if (i8 != 0) {
                            z7 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC0645b.m2976j(b7));
                    }
                    i7 = b7 - 55;
                }
                if (((-1152921504606846976L) & j7) != 0) {
                    throw new NumberFormatException("Number too large: " + new C0648e().mo3041e0(j7).mo3010F(b7).m3042e1());
                }
                j7 = (j7 << 4) | ((long) i7);
                i9++;
                i8++;
            }
            if (i9 == i10) {
                this.f2551a = c0666w.m3171b();
                C0667x.m3178b(c0666w);
            } else {
                c0666w.f2599b = i9;
            }
            if (z7) {
                break;
            }
        } while (this.f2551a != null);
        m3045g1(m3046h1() - ((long) i8));
        return j7;
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: O */
    public long mo3018O() throws EOFException {
        long j7;
        byte b7;
        long j8 = 0;
        if (m3046h1() == 0) {
            throw new EOFException();
        }
        int i7 = 0;
        boolean z7 = false;
        long j9 = 0;
        long j10 = -7;
        boolean z8 = false;
        loop0: while (true) {
            C0666w c0666w = this.f2551a;
            AbstractC6118n.m27184b(c0666w);
            byte[] bArr = c0666w.f2598a;
            int i8 = c0666w.f2599b;
            int i9 = c0666w.f2600c;
            while (true) {
                if (i8 >= i9) {
                    j7 = j8;
                    break;
                }
                b7 = bArr[i8];
                if (b7 >= 48 && b7 <= 57) {
                    int i10 = 48 - b7;
                    if (j9 < -922337203685477580L) {
                        break loop0;
                    }
                    j7 = j8;
                    if (j9 == -922337203685477580L && i10 < j10) {
                        break loop0;
                    }
                    j9 = (j9 * 10) + ((long) i10);
                } else {
                    j7 = j8;
                    if (b7 != 45 || i7 != 0) {
                        z8 = true;
                        break;
                    }
                    j10--;
                    z7 = true;
                }
                i8++;
                i7++;
                j8 = j7;
            }
            if (i8 == i9) {
                this.f2551a = c0666w.m3171b();
                C0667x.m3178b(c0666w);
            } else {
                c0666w.f2599b = i8;
            }
            if (z8 || this.f2551a == null) {
                m3045g1(m3046h1() - ((long) i7));
                if (i7 >= (z7 ? 2 : 1)) {
                    return z7 ? j9 : -j9;
                }
                if (m3046h1() == j7) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z7 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + AbstractC0645b.m2976j(m3060p0(j7)));
            }
            j8 = j7;
        }
        C0648e c0648eMo3010F = new C0648e().mo3012I0(j9).mo3010F(b7);
        if (!z7) {
            c0648eMo3010F.readByte();
        }
        throw new NumberFormatException("Number too large: " + c0648eMo3010F.m3042e1());
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: O0 */
    public InputStream mo3019O0() {
        return new b();
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: P */
    public String mo3020P(long j7) throws EOFException {
        if (j7 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j7).toString());
        }
        long j8 = j7 != Long.MAX_VALUE ? j7 + 1 : Long.MAX_VALUE;
        long jM3074w0 = m3074w0((byte) 10, 0L, j8);
        if (jM3074w0 != -1) {
            return AbstractC0706a.m3439d(this, jM3074w0);
        }
        if (j8 < m3046h1() && m3060p0(j8 - 1) == 13 && m3060p0(j8) == 10) {
            return AbstractC0706a.m3439d(this, j8);
        }
        C0648e c0648e = new C0648e();
        m3050k0(c0648e, 0L, Math.min(32, m3046h1()));
        throw new EOFException("\\n not found: limit=" + Math.min(m3046h1(), j7) + " content=" + c0648e.m3034a1().mo3104q() + (char) 8230);
    }

    /* JADX INFO: renamed from: Q */
    public final long m3021Q() {
        long jM3046h1 = m3046h1();
        if (jM3046h1 == 0) {
            return 0L;
        }
        C0666w c0666w = this.f2551a;
        AbstractC6118n.m27184b(c0666w);
        C0666w c0666w2 = c0666w.f2604g;
        AbstractC6118n.m27184b(c0666w2);
        int i7 = c0666w2.f2600c;
        return (i7 >= 8192 || !c0666w2.f2602e) ? jM3046h1 : jM3046h1 - ((long) (i7 - c0666w2.f2599b));
    }

    /* JADX INFO: renamed from: Q0 */
    public long m3022Q0(C0651h bytes, long j7) {
        int i7;
        long j8 = j7;
        AbstractC6118n.m27187e(bytes, "bytes");
        if (bytes.m3090F() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long jM3046h1 = 0;
        if (j8 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j8).toString());
        }
        C0666w c0666w = this.f2551a;
        if (c0666w == null) {
            return -1L;
        }
        if (m3046h1() - j8 >= j8) {
            while (true) {
                long j9 = ((long) (c0666w.f2600c - c0666w.f2599b)) + jM3046h1;
                if (j9 > j8) {
                    break;
                }
                c0666w = c0666w.f2603f;
                AbstractC6118n.m27184b(c0666w);
                jM3046h1 = j9;
            }
            byte[] bArrMo3105t = bytes.mo3105t();
            byte b7 = bArrMo3105t[0];
            int iM3090F = bytes.m3090F();
            long jM3046h2 = (m3046h1() - ((long) iM3090F)) + 1;
            while (jM3046h1 < jM3046h2) {
                byte[] bArr = c0666w.f2598a;
                int iMin = (int) Math.min(c0666w.f2600c, (((long) c0666w.f2599b) + jM3046h2) - jM3046h1);
                i7 = (int) ((((long) c0666w.f2599b) + j8) - jM3046h1);
                while (i7 < iMin) {
                    if (bArr[i7] == b7 && AbstractC0706a.m3438c(c0666w, i7 + 1, bArrMo3105t, 1, iM3090F)) {
                    }
                    i7++;
                }
                jM3046h1 += (long) (c0666w.f2600c - c0666w.f2599b);
                c0666w = c0666w.f2603f;
                AbstractC6118n.m27184b(c0666w);
                j8 = jM3046h1;
            }
            return -1L;
        }
        jM3046h1 = m3046h1();
        while (jM3046h1 > j8) {
            c0666w = c0666w.f2604g;
            AbstractC6118n.m27184b(c0666w);
            jM3046h1 -= (long) (c0666w.f2600c - c0666w.f2599b);
        }
        byte[] bArrMo3105t2 = bytes.mo3105t();
        byte b8 = bArrMo3105t2[0];
        int iM3090F2 = bytes.m3090F();
        long jM3046h3 = (m3046h1() - ((long) iM3090F2)) + 1;
        while (jM3046h1 < jM3046h3) {
            byte[] bArr2 = c0666w.f2598a;
            long j10 = jM3046h3;
            int iMin2 = (int) Math.min(c0666w.f2600c, (((long) c0666w.f2599b) + jM3046h3) - jM3046h1);
            i7 = (int) ((((long) c0666w.f2599b) + j8) - jM3046h1);
            while (i7 < iMin2) {
                if (bArr2[i7] != b8 || !AbstractC0706a.m3438c(c0666w, i7 + 1, bArrMo3105t2, 1, iM3090F2)) {
                    i7++;
                }
            }
            jM3046h1 += (long) (c0666w.f2600c - c0666w.f2599b);
            c0666w = c0666w.f2603f;
            AbstractC6118n.m27184b(c0666w);
            j8 = jM3046h1;
            jM3046h3 = j10;
        }
        return -1L;
        return ((long) (i7 - c0666w.f2599b)) + jM3046h1;
    }

    /* JADX INFO: renamed from: R0 */
    public long m3023R0(C0651h targetBytes) {
        AbstractC6118n.m27187e(targetBytes, "targetBytes");
        return m3024S0(targetBytes, 0L);
    }

    /* JADX INFO: renamed from: S0 */
    public long m3024S0(C0651h targetBytes, long j7) {
        int i7;
        int i8;
        AbstractC6118n.m27187e(targetBytes, "targetBytes");
        long jM3046h1 = 0;
        if (j7 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j7).toString());
        }
        C0666w c0666w = this.f2551a;
        if (c0666w == null) {
            return -1L;
        }
        if (m3046h1() - j7 < j7) {
            jM3046h1 = m3046h1();
            while (jM3046h1 > j7) {
                c0666w = c0666w.f2604g;
                AbstractC6118n.m27184b(c0666w);
                jM3046h1 -= (long) (c0666w.f2600c - c0666w.f2599b);
            }
            if (targetBytes.m3090F() == 2) {
                byte bM3099k = targetBytes.m3099k(0);
                byte bM3099k2 = targetBytes.m3099k(1);
                while (jM3046h1 < m3046h1()) {
                    byte[] bArr = c0666w.f2598a;
                    i7 = (int) ((((long) c0666w.f2599b) + j7) - jM3046h1);
                    int i9 = c0666w.f2600c;
                    while (true) {
                        if (i7 >= i9) {
                            jM3046h1 += (long) (c0666w.f2600c - c0666w.f2599b);
                            c0666w = c0666w.f2603f;
                            AbstractC6118n.m27184b(c0666w);
                            j7 = jM3046h1;
                        } else {
                            byte b7 = bArr[i7];
                            if (b7 == bM3099k || b7 == bM3099k2) {
                                i8 = c0666w.f2599b;
                            } else {
                                i7++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrMo3105t = targetBytes.mo3105t();
                while (jM3046h1 < m3046h1()) {
                    byte[] bArr2 = c0666w.f2598a;
                    i7 = (int) ((((long) c0666w.f2599b) + j7) - jM3046h1);
                    int i10 = c0666w.f2600c;
                    while (true) {
                        if (i7 < i10) {
                            byte b8 = bArr2[i7];
                            int length = bArrMo3105t.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length) {
                                    i7++;
                                } else if (b8 == bArrMo3105t[i11]) {
                                    i8 = c0666w.f2599b;
                                } else {
                                    i11++;
                                }
                            }
                        } else {
                            jM3046h1 += (long) (c0666w.f2600c - c0666w.f2599b);
                            c0666w = c0666w.f2603f;
                            AbstractC6118n.m27184b(c0666w);
                            j7 = jM3046h1;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j8 = ((long) (c0666w.f2600c - c0666w.f2599b)) + jM3046h1;
            if (j8 > j7) {
                break;
            }
            c0666w = c0666w.f2603f;
            AbstractC6118n.m27184b(c0666w);
            jM3046h1 = j8;
        }
        if (targetBytes.m3090F() == 2) {
            byte bM3099k3 = targetBytes.m3099k(0);
            byte bM3099k4 = targetBytes.m3099k(1);
            while (jM3046h1 < m3046h1()) {
                byte[] bArr3 = c0666w.f2598a;
                i7 = (int) ((((long) c0666w.f2599b) + j7) - jM3046h1);
                int i12 = c0666w.f2600c;
                while (true) {
                    if (i7 >= i12) {
                        jM3046h1 += (long) (c0666w.f2600c - c0666w.f2599b);
                        c0666w = c0666w.f2603f;
                        AbstractC6118n.m27184b(c0666w);
                        j7 = jM3046h1;
                    } else {
                        byte b9 = bArr3[i7];
                        if (b9 == bM3099k3 || b9 == bM3099k4) {
                            i8 = c0666w.f2599b;
                        } else {
                            i7++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrMo3105t2 = targetBytes.mo3105t();
            while (jM3046h1 < m3046h1()) {
                byte[] bArr4 = c0666w.f2598a;
                i7 = (int) ((((long) c0666w.f2599b) + j7) - jM3046h1);
                int i13 = c0666w.f2600c;
                while (true) {
                    if (i7 < i13) {
                        byte b10 = bArr4[i7];
                        int length2 = bArrMo3105t2.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length2) {
                                i7++;
                            } else if (b10 == bArrMo3105t2[i14]) {
                                i8 = c0666w.f2599b;
                            } else {
                                i14++;
                            }
                        }
                    } else {
                        jM3046h1 += (long) (c0666w.f2600c - c0666w.f2599b);
                        c0666w = c0666w.f2603f;
                        AbstractC6118n.m27184b(c0666w);
                        j7 = jM3046h1;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i7 - i8)) + jM3046h1;
    }

    /* JADX INFO: renamed from: T0 */
    public OutputStream m3025T0() {
        return new c();
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: U */
    public void mo3026U(C0648e sink, long j7) throws EOFException {
        AbstractC6118n.m27187e(sink, "sink");
        if (m3046h1() >= j7) {
            sink.mo3003I(this, j7);
        } else {
            sink.mo3003I(this, m3046h1());
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m3027U0(long j7, C0651h bytes) {
        AbstractC6118n.m27187e(bytes, "bytes");
        return m3028V0(j7, bytes, 0, bytes.m3090F());
    }

    /* JADX INFO: renamed from: V0 */
    public boolean m3028V0(long j7, C0651h bytes, int i7, int i8) {
        AbstractC6118n.m27187e(bytes, "bytes");
        if (j7 < 0 || i7 < 0 || i8 < 0 || m3046h1() - j7 < i8 || bytes.m3090F() - i7 < i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (m3060p0(((long) i9) + j7) != bytes.m3099k(i7 + i9)) {
                return false;
            }
        }
        return true;
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: W */
    public long mo3029W(InterfaceC0640B source) {
        AbstractC6118n.m27187e(source, "source");
        long j7 = 0;
        while (true) {
            long jMo2949w = source.mo2949w(this, 8192L);
            if (jMo2949w == -1) {
                return j7;
            }
            j7 += jMo2949w;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public int m3030W0(byte[] sink, int i7, int i8) {
        AbstractC6118n.m27187e(sink, "sink");
        AbstractC0645b.m2968b(sink.length, i7, i8);
        C0666w c0666w = this.f2551a;
        if (c0666w == null) {
            return -1;
        }
        int iMin = Math.min(i8, c0666w.f2600c - c0666w.f2599b);
        byte[] bArr = c0666w.f2598a;
        int i9 = c0666w.f2599b;
        AbstractC1631j.m6691d(bArr, sink, i7, i9, i9 + iMin);
        c0666w.f2599b += iMin;
        m3045g1(m3046h1() - ((long) iMin));
        if (c0666w.f2599b == c0666w.f2600c) {
            this.f2551a = c0666w.m3171b();
            C0667x.m3178b(c0666w);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: X0 */
    public final a m3032X0(a unsafeCursor) {
        AbstractC6118n.m27187e(unsafeCursor, "unsafeCursor");
        return AbstractC0706a.m3436a(this, unsafeCursor);
    }

    /* JADX INFO: renamed from: Z0 */
    public byte[] m3033Z0() {
        return mo3066s0(m3046h1());
    }

    /* JADX INFO: renamed from: a1 */
    public C0651h m3034a1() {
        return mo3063r(m3046h1());
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: b0 */
    public String mo3035b0(Charset charset) {
        AbstractC6118n.m27187e(charset, "charset");
        return m3040d1(this.f2552b, charset);
    }

    /* JADX INFO: renamed from: b1 */
    public int m3036b1() {
        return AbstractC0645b.m2974h(readInt());
    }

    /* JADX INFO: renamed from: c1 */
    public short m3037c1() {
        return AbstractC0645b.m2975i(readShort());
    }

    @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: renamed from: d */
    public C0648e m3038d() {
        return this;
    }

    /* JADX INFO: renamed from: d0 */
    public final C0648e m3039d0() {
        C0648e c0648e = new C0648e();
        if (m3046h1() == 0) {
            return c0648e;
        }
        C0666w c0666w = this.f2551a;
        AbstractC6118n.m27184b(c0666w);
        C0666w c0666wM3173d = c0666w.m3173d();
        c0648e.f2551a = c0666wM3173d;
        c0666wM3173d.f2604g = c0666wM3173d;
        c0666wM3173d.f2603f = c0666wM3173d;
        for (C0666w c0666w2 = c0666w.f2603f; c0666w2 != c0666w; c0666w2 = c0666w2.f2603f) {
            C0666w c0666w3 = c0666wM3173d.f2604g;
            AbstractC6118n.m27184b(c0666w3);
            AbstractC6118n.m27184b(c0666w2);
            c0666w3.m3172c(c0666w2.m3173d());
        }
        c0648e.m3045g1(m3046h1());
        return c0648e;
    }

    /* JADX INFO: renamed from: d1 */
    public String m3040d1(long j7, Charset charset) throws EOFException {
        AbstractC6118n.m27187e(charset, "charset");
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        }
        if (this.f2552b < j7) {
            throw new EOFException();
        }
        if (j7 == 0) {
            return "";
        }
        C0666w c0666w = this.f2551a;
        AbstractC6118n.m27184b(c0666w);
        int i7 = c0666w.f2599b;
        if (((long) i7) + j7 > c0666w.f2600c) {
            return new String(mo3066s0(j7), charset);
        }
        int i8 = (int) j7;
        String str = new String(c0666w.f2598a, i7, i8, charset);
        int i9 = c0666w.f2599b + i8;
        c0666w.f2599b = i9;
        this.f2552b -= j7;
        if (i9 == c0666w.f2600c) {
            this.f2551a = c0666w.m3171b();
            C0667x.m3178b(c0666w);
        }
        return str;
    }

    /* JADX INFO: renamed from: e1 */
    public String m3042e1() {
        return m3040d1(this.f2552b, C6402d.f24428b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0648e)) {
            return false;
        }
        C0648e c0648e = (C0648e) obj;
        if (m3046h1() != c0648e.m3046h1()) {
            return false;
        }
        if (m3046h1() == 0) {
            return true;
        }
        C0666w c0666w = this.f2551a;
        AbstractC6118n.m27184b(c0666w);
        C0666w c0666w2 = c0648e.f2551a;
        AbstractC6118n.m27184b(c0666w2);
        int i7 = c0666w.f2599b;
        int i8 = c0666w2.f2599b;
        long j7 = 0;
        while (j7 < m3046h1()) {
            long jMin = Math.min(c0666w.f2600c - i7, c0666w2.f2600c - i8);
            long j8 = 0;
            while (j8 < jMin) {
                int i9 = i7 + 1;
                int i10 = i8 + 1;
                if (c0666w.f2598a[i7] != c0666w2.f2598a[i8]) {
                    return false;
                }
                j8++;
                i7 = i9;
                i8 = i10;
            }
            if (i7 == c0666w.f2600c) {
                c0666w = c0666w.f2603f;
                AbstractC6118n.m27184b(c0666w);
                i7 = c0666w.f2599b;
            }
            if (i8 == c0666w2.f2600c) {
                c0666w2 = c0666w2.f2603f;
                AbstractC6118n.m27184b(c0666w2);
                i8 = c0666w2.f2599b;
            }
            j7 += jMin;
        }
        return true;
    }

    @Override // p072I6.InterfaceC0650g, p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: f */
    public C0648e mo3043f() {
        return this;
    }

    /* JADX INFO: renamed from: f1 */
    public String m3044f1(long j7) throws EOFException {
        return m3040d1(j7, C6402d.f24428b);
    }

    @Override // p072I6.InterfaceC0649f, p072I6.InterfaceC0669z, java.io.Flushable
    public void flush() {
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: g */
    public C0641C mo2948g() {
        return C0641C.f2530e;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m3045g1(long j7) {
        this.f2552b = j7;
    }

    /* JADX INFO: renamed from: h1 */
    public final long m3046h1() {
        return this.f2552b;
    }

    public int hashCode() {
        C0666w c0666w = this.f2551a;
        if (c0666w == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = c0666w.f2600c;
            for (int i9 = c0666w.f2599b; i9 < i8; i9++) {
                i7 = (i7 * 31) + c0666w.f2598a[i9];
            }
            c0666w = c0666w.f2603f;
            AbstractC6118n.m27184b(c0666w);
        } while (c0666w != this.f2551a);
        return i7;
    }

    /* JADX INFO: renamed from: i1 */
    public final C0651h m3048i1() {
        if (m3046h1() <= 2147483647L) {
            return m3049j1((int) m3046h1());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + m3046h1()).toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j1 */
    public final C0651h m3049j1(int i7) {
        if (i7 == 0) {
            return C0651h.f2563e;
        }
        AbstractC0645b.m2968b(m3046h1(), 0L, i7);
        C0666w c0666w = this.f2551a;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            AbstractC6118n.m27184b(c0666w);
            int i11 = c0666w.f2600c;
            int i12 = c0666w.f2599b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            c0666w = c0666w.f2603f;
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        C0666w c0666w2 = this.f2551a;
        int i13 = 0;
        while (i8 < i7) {
            AbstractC6118n.m27184b(c0666w2);
            bArr[i13] = c0666w2.f2598a;
            i8 += c0666w2.f2600c - c0666w2.f2599b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = c0666w2.f2599b;
            c0666w2.f2601d = true;
            i13++;
            c0666w2 = c0666w2.f2603f;
        }
        return new C0668y(bArr, iArr);
    }

    /* JADX INFO: renamed from: k0 */
    public final C0648e m3050k0(C0648e out, long j7, long j8) {
        AbstractC6118n.m27187e(out, "out");
        long j9 = j7;
        AbstractC0645b.m2968b(m3046h1(), j9, j8);
        if (j8 != 0) {
            out.m3045g1(out.m3046h1() + j8);
            C0666w c0666w = this.f2551a;
            while (true) {
                AbstractC6118n.m27184b(c0666w);
                int i7 = c0666w.f2600c;
                int i8 = c0666w.f2599b;
                if (j9 < i7 - i8) {
                    break;
                }
                j9 -= (long) (i7 - i8);
                c0666w = c0666w.f2603f;
            }
            C0666w c0666w2 = c0666w;
            long j10 = j8;
            while (j10 > 0) {
                AbstractC6118n.m27184b(c0666w2);
                C0666w c0666wM3173d = c0666w2.m3173d();
                int i9 = c0666wM3173d.f2599b + ((int) j9);
                c0666wM3173d.f2599b = i9;
                c0666wM3173d.f2600c = Math.min(i9 + ((int) j10), c0666wM3173d.f2600c);
                C0666w c0666w3 = out.f2551a;
                if (c0666w3 == null) {
                    c0666wM3173d.f2604g = c0666wM3173d;
                    c0666wM3173d.f2603f = c0666wM3173d;
                    out.f2551a = c0666wM3173d;
                } else {
                    AbstractC6118n.m27184b(c0666w3);
                    C0666w c0666w4 = c0666w3.f2604g;
                    AbstractC6118n.m27184b(c0666w4);
                    c0666w4.m3172c(c0666wM3173d);
                }
                j10 -= (long) (c0666wM3173d.f2600c - c0666wM3173d.f2599b);
                c0666w2 = c0666w2.f2603f;
                j9 = 0;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: k1 */
    public final C0666w m3051k1(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C0666w c0666w = this.f2551a;
        if (c0666w != null) {
            AbstractC6118n.m27184b(c0666w);
            C0666w c0666w2 = c0666w.f2604g;
            AbstractC6118n.m27184b(c0666w2);
            return (c0666w2.f2600c + i7 > 8192 || !c0666w2.f2602e) ? c0666w2.m3172c(C0667x.m3179c()) : c0666w2;
        }
        C0666w c0666wM3179c = C0667x.m3179c();
        this.f2551a = c0666wM3179c;
        c0666wM3179c.f2604g = c0666wM3179c;
        c0666wM3179c.f2603f = c0666wM3179c;
        return c0666wM3179c;
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: l */
    public void mo3052l(long j7) throws EOFException {
        while (j7 > 0) {
            C0666w c0666w = this.f2551a;
            if (c0666w == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j7, c0666w.f2600c - c0666w.f2599b);
            long j8 = iMin;
            m3045g1(m3046h1() - j8);
            j7 -= j8;
            int i7 = c0666w.f2599b + iMin;
            c0666w.f2599b = i7;
            if (i7 == c0666w.f2600c) {
                this.f2551a = c0666w.m3171b();
                C0667x.m3178b(c0666w);
            }
        }
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C0648e mo3069u() {
        return this;
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public C0648e mo3017N0(C0651h byteString) {
        AbstractC6118n.m27187e(byteString, "byteString");
        byteString.mo3095O(this, 0, byteString.m3090F());
        return this;
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C0648e mo3070u0(byte[] source) {
        AbstractC6118n.m27187e(source, "source");
        return mo3047i(source, 0, source.length);
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: n0 */
    public String mo3056n0() {
        return mo3020P(Long.MAX_VALUE);
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public C0648e mo3047i(byte[] source, int i7, int i8) {
        AbstractC6118n.m27187e(source, "source");
        long j7 = i8;
        AbstractC0645b.m2968b(source.length, i7, j7);
        int i9 = i8 + i7;
        while (i7 < i9) {
            C0666w c0666wM3051k1 = m3051k1(1);
            int iMin = Math.min(i9 - i7, 8192 - c0666wM3051k1.f2600c);
            int i10 = i7 + iMin;
            AbstractC1631j.m6691d(source, c0666wM3051k1.f2598a, c0666wM3051k1.f2600c, i7, i10);
            c0666wM3051k1.f2600c += iMin;
            i7 = i10;
        }
        m3045g1(m3046h1() + j7);
        return this;
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C0648e mo3016N() {
        return this;
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C0648e mo3010F(int i7) {
        C0666w c0666wM3051k1 = m3051k1(1);
        byte[] bArr = c0666wM3051k1.f2598a;
        int i8 = c0666wM3051k1.f2600c;
        c0666wM3051k1.f2600c = i8 + 1;
        bArr[i8] = (byte) i7;
        m3045g1(m3046h1() + 1);
        return this;
    }

    /* JADX INFO: renamed from: p0 */
    public final byte m3060p0(long j7) {
        AbstractC0645b.m2968b(m3046h1(), j7, 1L);
        C0666w c0666w = this.f2551a;
        if (c0666w == null) {
            AbstractC6118n.m27184b(null);
            throw null;
        }
        if (m3046h1() - j7 < j7) {
            long jM3046h1 = m3046h1();
            while (jM3046h1 > j7) {
                c0666w = c0666w.f2604g;
                AbstractC6118n.m27184b(c0666w);
                jM3046h1 -= (long) (c0666w.f2600c - c0666w.f2599b);
            }
            AbstractC6118n.m27184b(c0666w);
            return c0666w.f2598a[(int) ((((long) c0666w.f2599b) + j7) - jM3046h1)];
        }
        long j8 = 0;
        while (true) {
            long j9 = ((long) (c0666w.f2600c - c0666w.f2599b)) + j8;
            if (j9 > j7) {
                AbstractC6118n.m27184b(c0666w);
                return c0666w.f2598a[(int) ((((long) c0666w.f2599b) + j7) - j8)];
            }
            c0666w = c0666w.f2603f;
            AbstractC6118n.m27184b(c0666w);
            j8 = j9;
        }
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public C0648e mo3012I0(long j7) {
        boolean z7;
        if (j7 == 0) {
            return mo3010F(48);
        }
        int i7 = 1;
        if (j7 < 0) {
            j7 = -j7;
            if (j7 < 0) {
                return mo3031X("-9223372036854775808");
            }
            z7 = true;
        } else {
            z7 = false;
        }
        if (j7 < 100000000) {
            if (j7 < 10000) {
                if (j7 >= 100) {
                    i7 = j7 < 1000 ? 3 : 4;
                } else if (j7 >= 10) {
                    i7 = 2;
                }
            } else if (j7 < 1000000) {
                i7 = j7 < 100000 ? 5 : 6;
            } else {
                i7 = j7 < 10000000 ? 7 : 8;
            }
        } else if (j7 < 1000000000000L) {
            if (j7 < 10000000000L) {
                i7 = j7 < 1000000000 ? 9 : 10;
            } else {
                i7 = j7 < 100000000000L ? 11 : 12;
            }
        } else if (j7 < 1000000000000000L) {
            if (j7 < 10000000000000L) {
                i7 = 13;
            } else {
                i7 = j7 < 100000000000000L ? 14 : 15;
            }
        } else if (j7 < 100000000000000000L) {
            i7 = j7 < 10000000000000000L ? 16 : 17;
        } else {
            i7 = j7 < 1000000000000000000L ? 18 : 19;
        }
        if (z7) {
            i7++;
        }
        C0666w c0666wM3051k1 = m3051k1(i7);
        byte[] bArr = c0666wM3051k1.f2598a;
        int i8 = c0666wM3051k1.f2600c + i7;
        while (j7 != 0) {
            long j8 = 10;
            i8--;
            bArr[i8] = AbstractC0706a.m3437b()[(int) (j7 % j8)];
            j7 /= j8;
        }
        if (z7) {
            bArr[i8 - 1] = 45;
        }
        c0666wM3051k1.f2600c += i7;
        m3045g1(m3046h1() + ((long) i7));
        return this;
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public C0648e mo3041e0(long j7) {
        if (j7 == 0) {
            return mo3010F(48);
        }
        long j8 = (j7 >>> 1) | j7;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i7 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C0666w c0666wM3051k1 = m3051k1(i7);
        byte[] bArr = c0666wM3051k1.f2598a;
        int i8 = c0666wM3051k1.f2600c;
        for (int i9 = (i8 + i7) - 1; i9 >= i8; i9--) {
            bArr[i9] = AbstractC0706a.m3437b()[(int) (15 & j7)];
            j7 >>>= 4;
        }
        c0666wM3051k1.f2600c += i7;
        m3045g1(m3046h1() + ((long) i7));
        return this;
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: r */
    public C0651h mo3063r(long j7) throws EOFException {
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        }
        if (m3046h1() < j7) {
            throw new EOFException();
        }
        if (j7 < 4096) {
            return new C0651h(mo3066s0(j7));
        }
        C0651h c0651hM3049j1 = m3049j1((int) j7);
        mo3052l(j7);
        return c0651hM3049j1;
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: r0 */
    public int mo3064r0(C0662s options) throws EOFException {
        AbstractC6118n.m27187e(options, "options");
        int iM3441f = AbstractC0706a.m3441f(this, options, false, 2, null);
        if (iM3441f == -1) {
            return -1;
        }
        mo3052l(options.m3157m()[iM3441f].m3090F());
        return iM3441f;
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C0648e mo3008A(int i7) {
        C0666w c0666wM3051k1 = m3051k1(4);
        byte[] bArr = c0666wM3051k1.f2598a;
        int i8 = c0666wM3051k1.f2600c;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i7 & 255);
        c0666wM3051k1.f2600c = i8 + 4;
        m3045g1(m3046h1() + 4);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC6118n.m27187e(sink, "sink");
        C0666w c0666w = this.f2551a;
        if (c0666w == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), c0666w.f2600c - c0666w.f2599b);
        sink.put(c0666w.f2598a, c0666w.f2599b, iMin);
        int i7 = c0666w.f2599b + iMin;
        c0666w.f2599b = i7;
        this.f2552b -= (long) iMin;
        if (i7 == c0666w.f2600c) {
            this.f2551a = c0666w.m3171b();
            C0667x.m3178b(c0666w);
        }
        return iMin;
    }

    @Override // p072I6.InterfaceC0650g
    public byte readByte() throws EOFException {
        if (m3046h1() == 0) {
            throw new EOFException();
        }
        C0666w c0666w = this.f2551a;
        AbstractC6118n.m27184b(c0666w);
        int i7 = c0666w.f2599b;
        int i8 = c0666w.f2600c;
        int i9 = i7 + 1;
        byte b7 = c0666w.f2598a[i7];
        m3045g1(m3046h1() - 1);
        if (i9 != i8) {
            c0666w.f2599b = i9;
            return b7;
        }
        this.f2551a = c0666w.m3171b();
        C0667x.m3178b(c0666w);
        return b7;
    }

    @Override // p072I6.InterfaceC0650g
    public void readFully(byte[] sink) throws EOFException {
        AbstractC6118n.m27187e(sink, "sink");
        int i7 = 0;
        while (i7 < sink.length) {
            int iM3030W0 = m3030W0(sink, i7, sink.length - i7);
            if (iM3030W0 == -1) {
                throw new EOFException();
            }
            i7 += iM3030W0;
        }
    }

    @Override // p072I6.InterfaceC0650g
    public int readInt() throws EOFException {
        if (m3046h1() < 4) {
            throw new EOFException();
        }
        C0666w c0666w = this.f2551a;
        AbstractC6118n.m27184b(c0666w);
        int i7 = c0666w.f2599b;
        int i8 = c0666w.f2600c;
        if (i8 - i7 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c0666w.f2598a;
        int i9 = i7 + 3;
        int i10 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 2] & 255) << 8);
        int i11 = i7 + 4;
        int i12 = (bArr[i9] & 255) | i10;
        m3045g1(m3046h1() - 4);
        if (i11 != i8) {
            c0666w.f2599b = i11;
            return i12;
        }
        this.f2551a = c0666w.m3171b();
        C0667x.m3178b(c0666w);
        return i12;
    }

    @Override // p072I6.InterfaceC0650g
    public long readLong() throws EOFException {
        if (m3046h1() < 8) {
            throw new EOFException();
        }
        C0666w c0666w = this.f2551a;
        AbstractC6118n.m27184b(c0666w);
        int i7 = c0666w.f2599b;
        int i8 = c0666w.f2600c;
        if (i8 - i7 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c0666w.f2598a;
        int i9 = i7 + 7;
        long j7 = ((((long) bArr[i7]) & 255) << 56) | ((((long) bArr[i7 + 1]) & 255) << 48) | ((((long) bArr[i7 + 2]) & 255) << 40) | ((((long) bArr[i7 + 3]) & 255) << 32) | ((((long) bArr[i7 + 4]) & 255) << 24) | ((((long) bArr[i7 + 5]) & 255) << 16) | ((((long) bArr[i7 + 6]) & 255) << 8);
        int i10 = i7 + 8;
        long j8 = j7 | (((long) bArr[i9]) & 255);
        m3045g1(m3046h1() - 8);
        if (i10 != i8) {
            c0666w.f2599b = i10;
            return j8;
        }
        this.f2551a = c0666w.m3171b();
        C0667x.m3178b(c0666w);
        return j8;
    }

    @Override // p072I6.InterfaceC0650g
    public short readShort() throws EOFException {
        if (m3046h1() < 2) {
            throw new EOFException();
        }
        C0666w c0666w = this.f2551a;
        AbstractC6118n.m27184b(c0666w);
        int i7 = c0666w.f2599b;
        int i8 = c0666w.f2600c;
        if (i8 - i7 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c0666w.f2598a;
        int i9 = i7 + 1;
        int i10 = (bArr[i7] & 255) << 8;
        int i11 = i7 + 2;
        int i12 = (bArr[i9] & 255) | i10;
        m3045g1(m3046h1() - 2);
        if (i11 == i8) {
            this.f2551a = c0666w.m3171b();
            C0667x.m3178b(c0666w);
        } else {
            c0666w.f2599b = i11;
        }
        return (short) i12;
    }

    @Override // p072I6.InterfaceC0650g
    /* JADX INFO: renamed from: s0 */
    public byte[] mo3066s0(long j7) throws EOFException {
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        }
        if (m3046h1() < j7) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j7];
        readFully(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: s1 */
    public C0648e m3067s1(long j7) {
        C0666w c0666wM3051k1 = m3051k1(8);
        byte[] bArr = c0666wM3051k1.f2598a;
        int i7 = c0666wM3051k1.f2600c;
        bArr[i7] = (byte) ((j7 >>> 56) & 255);
        bArr[i7 + 1] = (byte) ((j7 >>> 48) & 255);
        bArr[i7 + 2] = (byte) ((j7 >>> 40) & 255);
        bArr[i7 + 3] = (byte) ((j7 >>> 32) & 255);
        bArr[i7 + 4] = (byte) ((j7 >>> 24) & 255);
        bArr[i7 + 5] = (byte) ((j7 >>> 16) & 255);
        bArr[i7 + 6] = (byte) ((j7 >>> 8) & 255);
        bArr[i7 + 7] = (byte) (j7 & 255);
        c0666wM3051k1.f2600c = i7 + 8;
        m3045g1(m3046h1() + 8);
        return this;
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public C0648e mo3072v(int i7) {
        C0666w c0666wM3051k1 = m3051k1(2);
        byte[] bArr = c0666wM3051k1.f2598a;
        int i8 = c0666wM3051k1.f2600c;
        bArr[i8] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 1] = (byte) (i7 & 255);
        c0666wM3051k1.f2600c = i8 + 2;
        m3045g1(m3046h1() + 2);
        return this;
    }

    public String toString() {
        return m3048i1().toString();
    }

    /* JADX INFO: renamed from: u1 */
    public C0648e m3071u1(String string, int i7, int i8, Charset charset) {
        AbstractC6118n.m27187e(string, "string");
        AbstractC6118n.m27187e(charset, "charset");
        if (i7 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i7).toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i8 + " < " + i7).toString());
        }
        if (i8 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i8 + " > " + string.length()).toString());
        }
        if (AbstractC6118n.m27183a(charset, C6402d.f24428b)) {
            return m3077x1(string, i7, i8);
        }
        String strSubstring = string.substring(i7, i8);
        AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        AbstractC6118n.m27186d(bytes, "this as java.lang.String).getBytes(charset)");
        return mo3047i(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: v1 */
    public final C0648e m3073v1(OutputStream out, long j7) throws IOException {
        AbstractC6118n.m27187e(out, "out");
        AbstractC0645b.m2968b(this.f2552b, 0L, j7);
        C0666w c0666w = this.f2551a;
        long j8 = j7;
        while (j8 > 0) {
            AbstractC6118n.m27184b(c0666w);
            int iMin = (int) Math.min(j8, c0666w.f2600c - c0666w.f2599b);
            out.write(c0666w.f2598a, c0666w.f2599b, iMin);
            int i7 = c0666w.f2599b + iMin;
            c0666w.f2599b = i7;
            long j9 = iMin;
            this.f2552b -= j9;
            j8 -= j9;
            if (i7 == c0666w.f2600c) {
                C0666w c0666wM3171b = c0666w.m3171b();
                this.f2551a = c0666wM3171b;
                C0667x.m3178b(c0666w);
                c0666w = c0666wM3171b;
            }
        }
        return this;
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: w */
    public long mo2949w(C0648e sink, long j7) {
        AbstractC6118n.m27187e(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (m3046h1() == 0) {
            return -1L;
        }
        if (j7 > m3046h1()) {
            j7 = m3046h1();
        }
        sink.mo3003I(this, j7);
        return j7;
    }

    /* JADX INFO: renamed from: w0 */
    public long m3074w0(byte b7, long j7, long j8) {
        C0666w c0666w;
        int i7;
        long jM3046h1 = 0;
        if (0 > j7 || j7 > j8) {
            throw new IllegalArgumentException(("size=" + m3046h1() + " fromIndex=" + j7 + " toIndex=" + j8).toString());
        }
        if (j8 > m3046h1()) {
            j8 = m3046h1();
        }
        if (j7 == j8 || (c0666w = this.f2551a) == null) {
            return -1L;
        }
        if (m3046h1() - j7 < j7) {
            jM3046h1 = m3046h1();
            while (jM3046h1 > j7) {
                c0666w = c0666w.f2604g;
                AbstractC6118n.m27184b(c0666w);
                jM3046h1 -= (long) (c0666w.f2600c - c0666w.f2599b);
            }
            while (jM3046h1 < j8) {
                byte[] bArr = c0666w.f2598a;
                int iMin = (int) Math.min(c0666w.f2600c, (((long) c0666w.f2599b) + j8) - jM3046h1);
                i7 = (int) ((((long) c0666w.f2599b) + j7) - jM3046h1);
                while (i7 < iMin) {
                    if (bArr[i7] != b7) {
                        i7++;
                    }
                }
                jM3046h1 += (long) (c0666w.f2600c - c0666w.f2599b);
                c0666w = c0666w.f2603f;
                AbstractC6118n.m27184b(c0666w);
                j7 = jM3046h1;
            }
            return -1L;
        }
        while (true) {
            long j9 = ((long) (c0666w.f2600c - c0666w.f2599b)) + jM3046h1;
            if (j9 > j7) {
                break;
            }
            c0666w = c0666w.f2603f;
            AbstractC6118n.m27184b(c0666w);
            jM3046h1 = j9;
        }
        while (jM3046h1 < j8) {
            byte[] bArr2 = c0666w.f2598a;
            int iMin2 = (int) Math.min(c0666w.f2600c, (((long) c0666w.f2599b) + j8) - jM3046h1);
            i7 = (int) ((((long) c0666w.f2599b) + j7) - jM3046h1);
            while (i7 < iMin2) {
                if (bArr2[i7] != b7) {
                    i7++;
                }
            }
            jM3046h1 += (long) (c0666w.f2600c - c0666w.f2599b);
            c0666w = c0666w.f2603f;
            AbstractC6118n.m27184b(c0666w);
            j7 = jM3046h1;
        }
        return -1L;
        return ((long) (i7 - c0666w.f2599b)) + jM3046h1;
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public C0648e mo3031X(String string) {
        AbstractC6118n.m27187e(string, "string");
        return m3077x1(string, 0, string.length());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC6118n.m27187e(source, "source");
        int iRemaining = source.remaining();
        int i7 = iRemaining;
        while (i7 > 0) {
            C0666w c0666wM3051k1 = m3051k1(1);
            int iMin = Math.min(i7, 8192 - c0666wM3051k1.f2600c);
            source.get(c0666wM3051k1.f2598a, c0666wM3051k1.f2600c, iMin);
            i7 -= iMin;
            c0666wM3051k1.f2600c += iMin;
        }
        this.f2552b += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: x */
    public final void m3076x() throws EOFException {
        mo3052l(m3046h1());
    }

    /* JADX INFO: renamed from: x1 */
    public C0648e m3077x1(String string, int i7, int i8) {
        char cCharAt;
        AbstractC6118n.m27187e(string, "string");
        if (i7 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i7).toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i8 + " < " + i7).toString());
        }
        if (i8 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i8 + " > " + string.length()).toString());
        }
        while (i7 < i8) {
            char cCharAt2 = string.charAt(i7);
            if (cCharAt2 < 128) {
                C0666w c0666wM3051k1 = m3051k1(1);
                byte[] bArr = c0666wM3051k1.f2598a;
                int i9 = c0666wM3051k1.f2600c - i7;
                int iMin = Math.min(i8, 8192 - i9);
                int i10 = i7 + 1;
                bArr[i7 + i9] = (byte) cCharAt2;
                while (true) {
                    i7 = i10;
                    if (i7 >= iMin || (cCharAt = string.charAt(i7)) >= 128) {
                        break;
                    }
                    i10 = i7 + 1;
                    bArr[i7 + i9] = (byte) cCharAt;
                }
                int i11 = c0666wM3051k1.f2600c;
                int i12 = (i9 + i7) - i11;
                c0666wM3051k1.f2600c = i11 + i12;
                m3045g1(m3046h1() + ((long) i12));
            } else {
                if (cCharAt2 < 2048) {
                    C0666w c0666wM3051k2 = m3051k1(2);
                    byte[] bArr2 = c0666wM3051k2.f2598a;
                    int i13 = c0666wM3051k2.f2600c;
                    bArr2[i13] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c0666wM3051k2.f2600c = i13 + 2;
                    m3045g1(m3046h1() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C0666w c0666wM3051k3 = m3051k1(3);
                    byte[] bArr3 = c0666wM3051k3.f2598a;
                    int i14 = c0666wM3051k3.f2600c;
                    bArr3[i14] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c0666wM3051k3.f2600c = i14 + 3;
                    m3045g1(m3046h1() + 3);
                } else {
                    int i15 = i7 + 1;
                    char cCharAt3 = i15 < i8 ? string.charAt(i15) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        mo3010F(63);
                        i7 = i15;
                    } else {
                        int i16 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C0666w c0666wM3051k4 = m3051k1(4);
                        byte[] bArr4 = c0666wM3051k4.f2598a;
                        int i17 = c0666wM3051k4.f2600c;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        c0666wM3051k4.f2600c = i17 + 4;
                        m3045g1(m3046h1() + 4);
                        i7 += 2;
                    }
                }
                i7++;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: y1 */
    public C0648e m3078y1(int i7) {
        if (i7 < 128) {
            mo3010F(i7);
            return this;
        }
        if (i7 < 2048) {
            C0666w c0666wM3051k1 = m3051k1(2);
            byte[] bArr = c0666wM3051k1.f2598a;
            int i8 = c0666wM3051k1.f2600c;
            bArr[i8] = (byte) ((i7 >> 6) | 192);
            bArr[i8 + 1] = (byte) ((i7 & 63) | 128);
            c0666wM3051k1.f2600c = i8 + 2;
            m3045g1(m3046h1() + 2);
            return this;
        }
        if (55296 <= i7 && i7 < 57344) {
            mo3010F(63);
            return this;
        }
        if (i7 < 65536) {
            C0666w c0666wM3051k2 = m3051k1(3);
            byte[] bArr2 = c0666wM3051k2.f2598a;
            int i9 = c0666wM3051k2.f2600c;
            bArr2[i9] = (byte) ((i7 >> 12) | 224);
            bArr2[i9 + 1] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[i9 + 2] = (byte) ((i7 & 63) | 128);
            c0666wM3051k2.f2600c = i9 + 3;
            m3045g1(m3046h1() + 3);
            return this;
        }
        if (i7 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC0645b.m2977k(i7));
        }
        C0666w c0666wM3051k3 = m3051k1(4);
        byte[] bArr3 = c0666wM3051k3.f2598a;
        int i10 = c0666wM3051k3.f2600c;
        bArr3[i10] = (byte) ((i7 >> 18) | 240);
        bArr3[i10 + 1] = (byte) (((i7 >> 12) & 63) | 128);
        bArr3[i10 + 2] = (byte) (((i7 >> 6) & 63) | 128);
        bArr3[i10 + 3] = (byte) ((i7 & 63) | 128);
        c0666wM3051k3.f2600c = i10 + 4;
        m3045g1(m3046h1() + 4);
        return this;
    }

    /* JADX INFO: renamed from: I6.e$b */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C0648e.this.m3046h1(), C3553a.e.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (C0648e.this.m3046h1() > 0) {
                return C0648e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C0648e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i7, int i8) {
            AbstractC6118n.m27187e(sink, "sink");
            return C0648e.this.m3030W0(sink, i7, i8);
        }
    }
}
