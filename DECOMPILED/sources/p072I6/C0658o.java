package p072I6;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.o */
/* JADX INFO: loaded from: classes.dex */
class C0658o implements InterfaceC0640B {

    /* JADX INFO: renamed from: a */
    private final InputStream f2582a;

    /* JADX INFO: renamed from: b */
    private final C0641C f2583b;

    public C0658o(InputStream input, C0641C timeout) {
        AbstractC6118n.m27187e(input, "input");
        AbstractC6118n.m27187e(timeout, "timeout");
        this.f2582a = input;
        this.f2583b = timeout;
    }

    @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2582a.close();
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: g */
    public C0641C mo2948g() {
        return this.f2583b;
    }

    public String toString() {
        return "source(" + this.f2582a + ')';
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: w */
    public long mo2949w(C0648e sink, long j7) throws IOException {
        AbstractC6118n.m27187e(sink, "sink");
        if (j7 == 0) {
            return 0L;
        }
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        try {
            this.f2583b.mo2955f();
            C0666w c0666wM3051k1 = sink.m3051k1(1);
            int i7 = this.f2582a.read(c0666wM3051k1.f2598a, c0666wM3051k1.f2600c, (int) Math.min(j7, 8192 - c0666wM3051k1.f2600c));
            if (i7 != -1) {
                c0666wM3051k1.f2600c += i7;
                long j8 = i7;
                sink.m3045g1(sink.m3046h1() + j8);
                return j8;
            }
            if (c0666wM3051k1.f2599b != c0666wM3051k1.f2600c) {
                return -1L;
            }
            sink.f2551a = c0666wM3051k1.m3171b();
            C0667x.m3178b(c0666wM3051k1);
            return -1L;
        } catch (AssertionError e7) {
            if (AbstractC0659p.m3133e(e7)) {
                throw new IOException(e7);
            }
            throw e7;
        }
    }
}
