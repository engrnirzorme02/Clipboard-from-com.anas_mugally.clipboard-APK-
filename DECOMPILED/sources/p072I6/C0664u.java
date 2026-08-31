package p072I6;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0664u implements InterfaceC0649f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0669z f2590a;

    /* JADX INFO: renamed from: b */
    public final C0648e f2591b;

    /* JADX INFO: renamed from: c */
    public boolean f2592c;

    public C0664u(InterfaceC0669z sink) {
        AbstractC6118n.m27187e(sink, "sink");
        this.f2590a = sink;
        this.f2591b = new C0648e();
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: A */
    public InterfaceC0649f mo3008A(int i7) {
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        this.f2591b.mo3008A(i7);
        return mo3016N();
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: F */
    public InterfaceC0649f mo3010F(int i7) {
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        this.f2591b.mo3010F(i7);
        return mo3016N();
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: I */
    public void mo3003I(C0648e source, long j7) {
        AbstractC6118n.m27187e(source, "source");
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        this.f2591b.mo3003I(source, j7);
        mo3016N();
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: I0 */
    public InterfaceC0649f mo3012I0(long j7) {
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        this.f2591b.mo3012I0(j7);
        return mo3016N();
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: N */
    public InterfaceC0649f mo3016N() {
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        long jM3021Q = this.f2591b.m3021Q();
        if (jM3021Q > 0) {
            this.f2590a.mo3003I(this.f2591b, jM3021Q);
        }
        return this;
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: N0 */
    public InterfaceC0649f mo3017N0(C0651h byteString) {
        AbstractC6118n.m27187e(byteString, "byteString");
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        this.f2591b.mo3017N0(byteString);
        return mo3016N();
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: W */
    public long mo3029W(InterfaceC0640B source) {
        AbstractC6118n.m27187e(source, "source");
        long j7 = 0;
        while (true) {
            long jMo2949w = source.mo2949w(this.f2591b, 8192L);
            if (jMo2949w == -1) {
                return j7;
            }
            j7 += jMo2949w;
            mo3016N();
        }
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: X */
    public InterfaceC0649f mo3031X(String string) {
        AbstractC6118n.m27187e(string, "string");
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        this.f2591b.mo3031X(string);
        return mo3016N();
    }

    @Override // p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f2592c) {
            return;
        }
        if (this.f2591b.m3046h1() > 0) {
            InterfaceC0669z interfaceC0669z = this.f2590a;
            C0648e c0648e = this.f2591b;
            interfaceC0669z.mo3003I(c0648e, c0648e.m3046h1());
        }
        th = null;
        try {
            this.f2590a.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f2592c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: e0 */
    public InterfaceC0649f mo3041e0(long j7) {
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        this.f2591b.mo3041e0(j7);
        return mo3016N();
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: f */
    public C0648e mo3043f() {
        return this.f2591b;
    }

    @Override // p072I6.InterfaceC0649f, p072I6.InterfaceC0669z, java.io.Flushable
    public void flush() {
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        if (this.f2591b.m3046h1() > 0) {
            InterfaceC0669z interfaceC0669z = this.f2590a;
            C0648e c0648e = this.f2591b;
            interfaceC0669z.mo3003I(c0648e, c0648e.m3046h1());
        }
        this.f2590a.flush();
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: g */
    public C0641C mo3005g() {
        return this.f2590a.mo3005g();
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: i */
    public InterfaceC0649f mo3047i(byte[] source, int i7, int i8) {
        AbstractC6118n.m27187e(source, "source");
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        this.f2591b.mo3047i(source, i7, i8);
        return mo3016N();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f2592c;
    }

    public String toString() {
        return "buffer(" + this.f2590a + ')';
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: u */
    public InterfaceC0649f mo3069u() {
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        long jM3046h1 = this.f2591b.m3046h1();
        if (jM3046h1 > 0) {
            this.f2590a.mo3003I(this.f2591b, jM3046h1);
        }
        return this;
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: u0 */
    public InterfaceC0649f mo3070u0(byte[] source) {
        AbstractC6118n.m27187e(source, "source");
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        this.f2591b.mo3070u0(source);
        return mo3016N();
    }

    @Override // p072I6.InterfaceC0649f
    /* JADX INFO: renamed from: v */
    public InterfaceC0649f mo3072v(int i7) {
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        this.f2591b.mo3072v(i7);
        return mo3016N();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC6118n.m27187e(source, "source");
        if (this.f2592c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f2591b.write(source);
        mo3016N();
        return iWrite;
    }
}
