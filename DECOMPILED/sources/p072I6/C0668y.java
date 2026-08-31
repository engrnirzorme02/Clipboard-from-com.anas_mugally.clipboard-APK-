package p072I6;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC6118n;
import p080J6.AbstractC0708c;
import p152T5.AbstractC1631j;

/* JADX INFO: renamed from: I6.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0668y extends C0651h {

    /* JADX INFO: renamed from: f */
    private final transient byte[][] f2610f;

    /* JADX INFO: renamed from: r */
    private final transient int[] f2611r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0668y(byte[][] segments, int[] directory) {
        super(C0651h.f2563e.m3100m());
        AbstractC6118n.m27187e(segments, "segments");
        AbstractC6118n.m27187e(directory, "directory");
        this.f2610f = segments;
        this.f2611r = directory;
    }

    /* JADX INFO: renamed from: U */
    private final C0651h m3180U() {
        return new C0651h(mo3093K());
    }

    @Override // p072I6.C0651h
    /* JADX INFO: renamed from: J */
    public C0651h mo3092J() {
        return m3180U().mo3092J();
    }

    @Override // p072I6.C0651h
    /* JADX INFO: renamed from: K */
    public byte[] mo3093K() {
        byte[] bArr = new byte[m3090F()];
        int length = m3182T().length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int i10 = m3181P()[length + i7];
            int i11 = m3181P()[i7];
            int i12 = i11 - i8;
            AbstractC1631j.m6691d(m3182T()[i7], bArr, i9, i10, i10 + i12);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    @Override // p072I6.C0651h
    /* JADX INFO: renamed from: O */
    public void mo3095O(C0648e buffer, int i7, int i8) {
        AbstractC6118n.m27187e(buffer, "buffer");
        int i9 = i7 + i8;
        int iM3449b = AbstractC0708c.m3449b(this, i7);
        while (i7 < i9) {
            int i10 = iM3449b == 0 ? 0 : m3181P()[iM3449b - 1];
            int i11 = m3181P()[iM3449b] - i10;
            int i12 = m3181P()[m3182T().length + iM3449b];
            int iMin = Math.min(i9, i11 + i10) - i7;
            int i13 = i12 + (i7 - i10);
            C0666w c0666w = new C0666w(m3182T()[iM3449b], i13, i13 + iMin, true, false);
            C0666w c0666w2 = buffer.f2551a;
            if (c0666w2 == null) {
                c0666w.f2604g = c0666w;
                c0666w.f2603f = c0666w;
                buffer.f2551a = c0666w;
            } else {
                AbstractC6118n.m27184b(c0666w2);
                C0666w c0666w3 = c0666w2.f2604g;
                AbstractC6118n.m27184b(c0666w3);
                c0666w3.m3172c(c0666w);
            }
            i7 += iMin;
            iM3449b++;
        }
        buffer.m3045g1(buffer.m3046h1() + ((long) i8));
    }

    /* JADX INFO: renamed from: P */
    public final int[] m3181P() {
        return this.f2611r;
    }

    /* JADX INFO: renamed from: T */
    public final byte[][] m3182T() {
        return this.f2610f;
    }

    @Override // p072I6.C0651h
    /* JADX INFO: renamed from: c */
    public String mo3096c() {
        return m3180U().mo3096c();
    }

    @Override // p072I6.C0651h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0651h) {
            C0651h c0651h = (C0651h) obj;
            if (c0651h.m3090F() == m3090F() && mo3108y(0, c0651h, 0, m3090F())) {
                return true;
            }
        }
        return false;
    }

    @Override // p072I6.C0651h
    /* JADX INFO: renamed from: h */
    public C0651h mo3098h(String algorithm) throws NoSuchAlgorithmException {
        AbstractC6118n.m27187e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = m3182T().length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = m3181P()[length + i7];
            int i10 = m3181P()[i7];
            messageDigest.update(m3182T()[i7], i9, i10 - i8);
            i7++;
            i8 = i10;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC6118n.m27184b(bArrDigest);
        return new C0651h(bArrDigest);
    }

    @Override // p072I6.C0651h
    public int hashCode() {
        int iM3101n = m3101n();
        if (iM3101n != 0) {
            return iM3101n;
        }
        int length = m3182T().length;
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        while (i7 < length) {
            int i10 = m3181P()[length + i7];
            int i11 = m3181P()[i7];
            byte[] bArr = m3182T()[i7];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i8 = (i8 * 31) + bArr[i10];
                i10++;
            }
            i7++;
            i9 = i11;
        }
        m3086A(i8);
        return i8;
    }

    @Override // p072I6.C0651h
    /* JADX INFO: renamed from: o */
    public int mo3102o() {
        return m3181P()[m3182T().length - 1];
    }

    @Override // p072I6.C0651h
    /* JADX INFO: renamed from: q */
    public String mo3104q() {
        return m3180U().mo3104q();
    }

    @Override // p072I6.C0651h
    /* JADX INFO: renamed from: t */
    public byte[] mo3105t() {
        return mo3093K();
    }

    @Override // p072I6.C0651h
    public String toString() {
        return m3180U().toString();
    }

    @Override // p072I6.C0651h
    /* JADX INFO: renamed from: v */
    public byte mo3106v(int i7) {
        AbstractC0645b.m2968b(m3181P()[m3182T().length - 1], i7, 1L);
        int iM3449b = AbstractC0708c.m3449b(this, i7);
        return m3182T()[iM3449b][(i7 - (iM3449b == 0 ? 0 : m3181P()[iM3449b - 1])) + m3181P()[m3182T().length + iM3449b]];
    }

    @Override // p072I6.C0651h
    /* JADX INFO: renamed from: y */
    public boolean mo3108y(int i7, C0651h other, int i8, int i9) {
        AbstractC6118n.m27187e(other, "other");
        if (i7 < 0 || i7 > m3090F() - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int iM3449b = AbstractC0708c.m3449b(this, i7);
        while (i7 < i10) {
            int i11 = iM3449b == 0 ? 0 : m3181P()[iM3449b - 1];
            int i12 = m3181P()[iM3449b] - i11;
            int i13 = m3181P()[m3182T().length + iM3449b];
            int iMin = Math.min(i10, i12 + i11) - i7;
            if (!other.mo3109z(i8, m3182T()[iM3449b], i13 + (i7 - i11), iMin)) {
                return false;
            }
            i8 += iMin;
            i7 += iMin;
            iM3449b++;
        }
        return true;
    }

    @Override // p072I6.C0651h
    /* JADX INFO: renamed from: z */
    public boolean mo3109z(int i7, byte[] other, int i8, int i9) {
        AbstractC6118n.m27187e(other, "other");
        if (i7 < 0 || i7 > m3090F() - i9 || i8 < 0 || i8 > other.length - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int iM3449b = AbstractC0708c.m3449b(this, i7);
        while (i7 < i10) {
            int i11 = iM3449b == 0 ? 0 : m3181P()[iM3449b - 1];
            int i12 = m3181P()[iM3449b] - i11;
            int i13 = m3181P()[m3182T().length + iM3449b];
            int iMin = Math.min(i10, i12 + i11) - i7;
            if (!AbstractC0645b.m2967a(m3182T()[iM3449b], i13 + (i7 - i11), other, i8, iMin)) {
                return false;
            }
            i8 += iMin;
            i7 += iMin;
            iM3449b++;
        }
        return true;
    }
}
