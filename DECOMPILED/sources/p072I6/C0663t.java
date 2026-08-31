package p072I6;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.t */
/* JADX INFO: loaded from: classes.dex */
final class C0663t implements InterfaceC0669z {

    /* JADX INFO: renamed from: a */
    private final OutputStream f2588a;

    /* JADX INFO: renamed from: b */
    private final C0641C f2589b;

    public C0663t(OutputStream out, C0641C timeout) {
        AbstractC6118n.m27187e(out, "out");
        AbstractC6118n.m27187e(timeout, "timeout");
        this.f2588a = out;
        this.f2589b = timeout;
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: I */
    public void mo3003I(C0648e source, long j7) throws IOException {
        AbstractC6118n.m27187e(source, "source");
        AbstractC0645b.m2968b(source.m3046h1(), 0L, j7);
        while (j7 > 0) {
            this.f2589b.mo2955f();
            C0666w c0666w = source.f2551a;
            AbstractC6118n.m27184b(c0666w);
            int iMin = (int) Math.min(j7, c0666w.f2600c - c0666w.f2599b);
            this.f2588a.write(c0666w.f2598a, c0666w.f2599b, iMin);
            c0666w.f2599b += iMin;
            long j8 = iMin;
            j7 -= j8;
            source.m3045g1(source.m3046h1() - j8);
            if (c0666w.f2599b == c0666w.f2600c) {
                source.f2551a = c0666w.m3171b();
                C0667x.m3178b(c0666w);
            }
        }
    }

    @Override // p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2588a.close();
    }

    @Override // p072I6.InterfaceC0669z, java.io.Flushable
    public void flush() throws IOException {
        this.f2588a.flush();
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: g */
    public C0641C mo3005g() {
        return this.f2589b;
    }

    public String toString() {
        return "sink(" + this.f2588a + ')';
    }
}
