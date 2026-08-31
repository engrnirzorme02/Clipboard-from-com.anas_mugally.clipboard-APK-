package p072I6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1631j;

/* JADX INFO: renamed from: I6.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0666w {

    /* JADX INFO: renamed from: h */
    public static final a f2597h = new a(null);

    /* JADX INFO: renamed from: a */
    public final byte[] f2598a;

    /* JADX INFO: renamed from: b */
    public int f2599b;

    /* JADX INFO: renamed from: c */
    public int f2600c;

    /* JADX INFO: renamed from: d */
    public boolean f2601d;

    /* JADX INFO: renamed from: e */
    public boolean f2602e;

    /* JADX INFO: renamed from: f */
    public C0666w f2603f;

    /* JADX INFO: renamed from: g */
    public C0666w f2604g;

    /* JADX INFO: renamed from: I6.w$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C0666w() {
        this.f2598a = new byte[8192];
        this.f2602e = true;
        this.f2601d = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3170a() {
        int i7;
        C0666w c0666w = this.f2604g;
        if (c0666w == this) {
            throw new IllegalStateException("cannot compact");
        }
        AbstractC6118n.m27184b(c0666w);
        if (c0666w.f2602e) {
            int i8 = this.f2600c - this.f2599b;
            C0666w c0666w2 = this.f2604g;
            AbstractC6118n.m27184b(c0666w2);
            int i9 = 8192 - c0666w2.f2600c;
            C0666w c0666w3 = this.f2604g;
            AbstractC6118n.m27184b(c0666w3);
            if (c0666w3.f2601d) {
                i7 = 0;
            } else {
                C0666w c0666w4 = this.f2604g;
                AbstractC6118n.m27184b(c0666w4);
                i7 = c0666w4.f2599b;
            }
            if (i8 > i9 + i7) {
                return;
            }
            C0666w c0666w5 = this.f2604g;
            AbstractC6118n.m27184b(c0666w5);
            m3176g(c0666w5, i8);
            m3171b();
            C0667x.m3178b(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0666w m3171b() {
        C0666w c0666w = this.f2603f;
        if (c0666w == this) {
            c0666w = null;
        }
        C0666w c0666w2 = this.f2604g;
        AbstractC6118n.m27184b(c0666w2);
        c0666w2.f2603f = this.f2603f;
        C0666w c0666w3 = this.f2603f;
        AbstractC6118n.m27184b(c0666w3);
        c0666w3.f2604g = this.f2604g;
        this.f2603f = null;
        this.f2604g = null;
        return c0666w;
    }

    /* JADX INFO: renamed from: c */
    public final C0666w m3172c(C0666w segment) {
        AbstractC6118n.m27187e(segment, "segment");
        segment.f2604g = this;
        segment.f2603f = this.f2603f;
        C0666w c0666w = this.f2603f;
        AbstractC6118n.m27184b(c0666w);
        c0666w.f2604g = segment;
        this.f2603f = segment;
        return segment;
    }

    /* JADX INFO: renamed from: d */
    public final C0666w m3173d() {
        this.f2601d = true;
        return new C0666w(this.f2598a, this.f2599b, this.f2600c, true, false);
    }

    /* JADX INFO: renamed from: e */
    public final C0666w m3174e(int i7) {
        C0666w c0666wM3179c;
        if (i7 <= 0 || i7 > this.f2600c - this.f2599b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i7 >= 1024) {
            c0666wM3179c = m3173d();
        } else {
            c0666wM3179c = C0667x.m3179c();
            byte[] bArr = this.f2598a;
            byte[] bArr2 = c0666wM3179c.f2598a;
            int i8 = this.f2599b;
            AbstractC1631j.m6695h(bArr, bArr2, 0, i8, i8 + i7, 2, null);
        }
        c0666wM3179c.f2600c = c0666wM3179c.f2599b + i7;
        this.f2599b += i7;
        C0666w c0666w = this.f2604g;
        AbstractC6118n.m27184b(c0666w);
        c0666w.m3172c(c0666wM3179c);
        return c0666wM3179c;
    }

    /* JADX INFO: renamed from: f */
    public final C0666w m3175f() {
        byte[] bArr = this.f2598a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC6118n.m27186d(bArrCopyOf, "copyOf(this, size)");
        return new C0666w(bArrCopyOf, this.f2599b, this.f2600c, false, true);
    }

    /* JADX INFO: renamed from: g */
    public final void m3176g(C0666w sink, int i7) {
        AbstractC6118n.m27187e(sink, "sink");
        if (!sink.f2602e) {
            throw new IllegalStateException("only owner can write");
        }
        int i8 = sink.f2600c;
        if (i8 + i7 > 8192) {
            if (sink.f2601d) {
                throw new IllegalArgumentException();
            }
            int i9 = sink.f2599b;
            if ((i8 + i7) - i9 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f2598a;
            AbstractC1631j.m6695h(bArr, bArr, 0, i9, i8, 2, null);
            sink.f2600c -= sink.f2599b;
            sink.f2599b = 0;
        }
        byte[] bArr2 = this.f2598a;
        byte[] bArr3 = sink.f2598a;
        int i10 = sink.f2600c;
        int i11 = this.f2599b;
        AbstractC1631j.m6691d(bArr2, bArr3, i10, i11, i11 + i7);
        sink.f2600c += i7;
        this.f2599b += i7;
    }

    public C0666w(byte[] data, int i7, int i8, boolean z7, boolean z8) {
        AbstractC6118n.m27187e(data, "data");
        this.f2598a = data;
        this.f2599b = i7;
        this.f2600c = i8;
        this.f2601d = z7;
        this.f2602e = z8;
    }
}
