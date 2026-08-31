package p072I6;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0652i implements InterfaceC0669z {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0649f f2567a;

    /* JADX INFO: renamed from: b */
    private final Deflater f2568b;

    /* JADX INFO: renamed from: c */
    private boolean f2569c;

    public C0652i(InterfaceC0649f sink, Deflater deflater) {
        AbstractC6118n.m27187e(sink, "sink");
        AbstractC6118n.m27187e(deflater, "deflater");
        this.f2567a = sink;
        this.f2568b = deflater;
    }

    /* JADX INFO: renamed from: d */
    private final void m3117d(boolean z7) throws IOException {
        C0666w c0666wM3051k1;
        int iDeflate;
        C0648e c0648eMo3043f = this.f2567a.mo3043f();
        while (true) {
            c0666wM3051k1 = c0648eMo3043f.m3051k1(1);
            if (z7) {
                try {
                    Deflater deflater = this.f2568b;
                    byte[] bArr = c0666wM3051k1.f2598a;
                    int i7 = c0666wM3051k1.f2600c;
                    iDeflate = deflater.deflate(bArr, i7, 8192 - i7, 2);
                } catch (NullPointerException e7) {
                    throw new IOException("Deflater already closed", e7);
                }
            } else {
                Deflater deflater2 = this.f2568b;
                byte[] bArr2 = c0666wM3051k1.f2598a;
                int i8 = c0666wM3051k1.f2600c;
                iDeflate = deflater2.deflate(bArr2, i8, 8192 - i8);
            }
            if (iDeflate > 0) {
                c0666wM3051k1.f2600c += iDeflate;
                c0648eMo3043f.m3045g1(c0648eMo3043f.m3046h1() + ((long) iDeflate));
                this.f2567a.mo3016N();
            } else if (this.f2568b.needsInput()) {
                break;
            }
        }
        if (c0666wM3051k1.f2599b == c0666wM3051k1.f2600c) {
            c0648eMo3043f.f2551a = c0666wM3051k1.m3171b();
            C0667x.m3178b(c0666wM3051k1);
        }
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: I */
    public void mo3003I(C0648e source, long j7) throws IOException {
        AbstractC6118n.m27187e(source, "source");
        AbstractC0645b.m2968b(source.m3046h1(), 0L, j7);
        while (j7 > 0) {
            C0666w c0666w = source.f2551a;
            AbstractC6118n.m27184b(c0666w);
            int iMin = (int) Math.min(j7, c0666w.f2600c - c0666w.f2599b);
            this.f2568b.setInput(c0666w.f2598a, c0666w.f2599b, iMin);
            m3117d(false);
            long j8 = iMin;
            source.m3045g1(source.m3046h1() - j8);
            int i7 = c0666w.f2599b + iMin;
            c0666w.f2599b = i7;
            if (i7 == c0666w.f2600c) {
                source.f2551a = c0666w.m3171b();
                C0667x.m3178b(c0666w);
            }
            j7 -= j8;
        }
    }

    @Override // p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f2569c) {
            return;
        }
        m3118m();
        th = null;
        try {
            this.f2568b.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f2567a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f2569c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p072I6.InterfaceC0669z, java.io.Flushable
    public void flush() throws IOException {
        m3117d(true);
        this.f2567a.flush();
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: g */
    public C0641C mo3005g() {
        return this.f2567a.mo3005g();
    }

    /* JADX INFO: renamed from: m */
    public final void m3118m() throws IOException {
        this.f2568b.finish();
        m3117d(false);
    }

    public String toString() {
        return "DeflaterSink(" + this.f2567a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0652i(InterfaceC0669z sink, Deflater deflater) {
        this(AbstractC0659p.m3131c(sink), deflater);
        AbstractC6118n.m27187e(sink, "sink");
        AbstractC6118n.m27187e(deflater, "deflater");
    }
}
