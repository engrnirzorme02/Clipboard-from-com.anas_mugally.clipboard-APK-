package p072I6;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0656m implements InterfaceC0640B {

    /* JADX INFO: renamed from: a */
    private byte f2573a;

    /* JADX INFO: renamed from: b */
    private final C0665v f2574b;

    /* JADX INFO: renamed from: c */
    private final Inflater f2575c;

    /* JADX INFO: renamed from: d */
    private final C0657n f2576d;

    /* JADX INFO: renamed from: e */
    private final CRC32 f2577e;

    public C0656m(InterfaceC0640B source) {
        AbstractC6118n.m27187e(source, "source");
        C0665v c0665v = new C0665v(source);
        this.f2574b = c0665v;
        Inflater inflater = new Inflater(true);
        this.f2575c = inflater;
        this.f2576d = new C0657n((InterfaceC0650g) c0665v, inflater);
        this.f2577e = new CRC32();
    }

    /* JADX INFO: renamed from: d */
    private final void m3122d(String str, int i7, int i8) throws IOException {
        if (i8 == i7) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i8), Integer.valueOf(i7)}, 3));
        AbstractC6118n.m27186d(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    /* JADX INFO: renamed from: m */
    private final void m3123m() throws IOException {
        this.f2574b.mo3011G0(10L);
        byte bM3060p0 = this.f2574b.f2594b.m3060p0(3L);
        boolean z7 = ((bM3060p0 >> 1) & 1) == 1;
        if (z7) {
            m3125x(this.f2574b.f2594b, 0L, 10L);
        }
        m3122d("ID1ID2", 8075, this.f2574b.readShort());
        this.f2574b.mo3052l(8L);
        if (((bM3060p0 >> 2) & 1) == 1) {
            this.f2574b.mo3011G0(2L);
            if (z7) {
                m3125x(this.f2574b.f2594b, 0L, 2L);
            }
            long jM3037c1 = this.f2574b.f2594b.m3037c1() & 65535;
            this.f2574b.mo3011G0(jM3037c1);
            if (z7) {
                m3125x(this.f2574b.f2594b, 0L, jM3037c1);
            }
            this.f2574b.mo3052l(jM3037c1);
        }
        if (((bM3060p0 >> 3) & 1) == 1) {
            long jM3166d = this.f2574b.m3166d((byte) 0);
            if (jM3166d == -1) {
                throw new EOFException();
            }
            if (z7) {
                m3125x(this.f2574b.f2594b, 0L, jM3166d + 1);
            }
            this.f2574b.mo3052l(jM3166d + 1);
        }
        if (((bM3060p0 >> 4) & 1) == 1) {
            long jM3166d2 = this.f2574b.m3166d((byte) 0);
            if (jM3166d2 == -1) {
                throw new EOFException();
            }
            if (z7) {
                m3125x(this.f2574b.f2594b, 0L, jM3166d2 + 1);
            }
            this.f2574b.mo3052l(jM3166d2 + 1);
        }
        if (z7) {
            m3122d("FHCRC", this.f2574b.m3169x(), (short) this.f2577e.getValue());
            this.f2577e.reset();
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m3124n() throws IOException {
        m3122d("CRC", this.f2574b.m3168n(), (int) this.f2577e.getValue());
        m3122d("ISIZE", this.f2574b.m3168n(), (int) this.f2575c.getBytesWritten());
    }

    /* JADX INFO: renamed from: x */
    private final void m3125x(C0648e c0648e, long j7, long j8) {
        C0666w c0666w = c0648e.f2551a;
        AbstractC6118n.m27184b(c0666w);
        while (true) {
            int i7 = c0666w.f2600c;
            int i8 = c0666w.f2599b;
            if (j7 < i7 - i8) {
                break;
            }
            j7 -= (long) (i7 - i8);
            c0666w = c0666w.f2603f;
            AbstractC6118n.m27184b(c0666w);
        }
        while (j8 > 0) {
            int i9 = (int) (((long) c0666w.f2599b) + j7);
            int iMin = (int) Math.min(c0666w.f2600c - i9, j8);
            this.f2577e.update(c0666w.f2598a, i9, iMin);
            j8 -= (long) iMin;
            c0666w = c0666w.f2603f;
            AbstractC6118n.m27184b(c0666w);
            j7 = 0;
        }
    }

    @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2576d.close();
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: g */
    public C0641C mo2948g() {
        return this.f2574b.mo2948g();
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: w */
    public long mo2949w(C0648e sink, long j7) throws IOException {
        C0656m c0656m;
        AbstractC6118n.m27187e(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (j7 == 0) {
            return 0L;
        }
        if (this.f2573a == 0) {
            m3123m();
            this.f2573a = (byte) 1;
        }
        if (this.f2573a == 1) {
            long jM3046h1 = sink.m3046h1();
            long jMo2949w = this.f2576d.mo2949w(sink, j7);
            if (jMo2949w != -1) {
                m3125x(sink, jM3046h1, jMo2949w);
                return jMo2949w;
            }
            c0656m = this;
            c0656m.f2573a = (byte) 2;
        } else {
            c0656m = this;
        }
        if (c0656m.f2573a == 2) {
            m3124n();
            c0656m.f2573a = (byte) 3;
            if (!c0656m.f2574b.mo3009E()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
