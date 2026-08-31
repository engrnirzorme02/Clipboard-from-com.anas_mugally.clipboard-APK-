package p072I6;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0657n implements InterfaceC0640B {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0650g f2578a;

    /* JADX INFO: renamed from: b */
    private final Inflater f2579b;

    /* JADX INFO: renamed from: c */
    private int f2580c;

    /* JADX INFO: renamed from: d */
    private boolean f2581d;

    public C0657n(InterfaceC0650g source, Inflater inflater) {
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(inflater, "inflater");
        this.f2578a = source;
        this.f2579b = inflater;
    }

    /* JADX INFO: renamed from: n */
    private final void m3126n() {
        int i7 = this.f2580c;
        if (i7 == 0) {
            return;
        }
        int remaining = i7 - this.f2579b.getRemaining();
        this.f2580c -= remaining;
        this.f2578a.mo3052l(remaining);
    }

    @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f2581d) {
            return;
        }
        this.f2579b.end();
        this.f2581d = true;
        this.f2578a.close();
    }

    /* JADX INFO: renamed from: d */
    public final long m3127d(C0648e sink, long j7) throws IOException {
        AbstractC6118n.m27187e(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (this.f2581d) {
            throw new IllegalStateException("closed");
        }
        if (j7 == 0) {
            return 0L;
        }
        try {
            C0666w c0666wM3051k1 = sink.m3051k1(1);
            int iMin = (int) Math.min(j7, 8192 - c0666wM3051k1.f2600c);
            m3128m();
            int iInflate = this.f2579b.inflate(c0666wM3051k1.f2598a, c0666wM3051k1.f2600c, iMin);
            m3126n();
            if (iInflate > 0) {
                c0666wM3051k1.f2600c += iInflate;
                long j8 = iInflate;
                sink.m3045g1(sink.m3046h1() + j8);
                return j8;
            }
            if (c0666wM3051k1.f2599b == c0666wM3051k1.f2600c) {
                sink.f2551a = c0666wM3051k1.m3171b();
                C0667x.m3178b(c0666wM3051k1);
            }
            return 0L;
        } catch (DataFormatException e7) {
            throw new IOException(e7);
        }
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: g */
    public C0641C mo2948g() {
        return this.f2578a.mo2948g();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3128m() {
        if (!this.f2579b.needsInput()) {
            return false;
        }
        if (this.f2578a.mo3009E()) {
            return true;
        }
        C0666w c0666w = this.f2578a.mo3043f().f2551a;
        AbstractC6118n.m27184b(c0666w);
        int i7 = c0666w.f2600c;
        int i8 = c0666w.f2599b;
        int i9 = i7 - i8;
        this.f2580c = i9;
        this.f2579b.setInput(c0666w.f2598a, i8, i9);
        return false;
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: w */
    public long mo2949w(C0648e sink, long j7) throws IOException {
        AbstractC6118n.m27187e(sink, "sink");
        do {
            long jM3127d = m3127d(sink, j7);
            if (jM3127d > 0) {
                return jM3127d;
            }
            if (this.f2579b.finished() || this.f2579b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f2578a.mo3009E());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0657n(InterfaceC0640B source, Inflater inflater) {
        this(AbstractC0659p.m3132d(source), inflater);
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(inflater, "inflater");
    }
}
