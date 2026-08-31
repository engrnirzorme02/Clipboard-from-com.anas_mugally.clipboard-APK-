package p072I6;

import kotlin.jvm.internal.AbstractC6118n;
import p080J6.AbstractC0707b;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: I6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0645b {

    /* JADX INFO: renamed from: a */
    private static final C0648e.a f2536a = new C0648e.a();

    /* JADX INFO: renamed from: b */
    private static final int f2537b = -1234567890;

    /* JADX INFO: renamed from: a */
    public static final boolean m2967a(byte[] a7, int i7, byte[] b7, int i8, int i9) {
        AbstractC6118n.m27187e(a7, "a");
        AbstractC6118n.m27187e(b7, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (a7[i10 + i7] != b7[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final void m2968b(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException("size=" + j7 + " offset=" + j8 + " byteCount=" + j9);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m2969c() {
        return f2537b;
    }

    /* JADX INFO: renamed from: d */
    public static final C0648e.a m2970d() {
        return f2536a;
    }

    /* JADX INFO: renamed from: e */
    public static final int m2971e(C0651h c0651h, int i7) {
        AbstractC6118n.m27187e(c0651h, "<this>");
        return i7 == f2537b ? c0651h.m3090F() : i7;
    }

    /* JADX INFO: renamed from: f */
    public static final int m2972f(byte[] bArr, int i7) {
        AbstractC6118n.m27187e(bArr, "<this>");
        return i7 == f2537b ? bArr.length : i7;
    }

    /* JADX INFO: renamed from: g */
    public static final C0648e.a m2973g(C0648e.a unsafeCursor) {
        AbstractC6118n.m27187e(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f2536a ? new C0648e.a() : unsafeCursor;
    }

    /* JADX INFO: renamed from: h */
    public static final int m2974h(int i7) {
        return ((i7 & 255) << 24) | (((-16777216) & i7) >>> 24) | ((16711680 & i7) >>> 8) | ((65280 & i7) << 8);
    }

    /* JADX INFO: renamed from: i */
    public static final short m2975i(short s7) {
        return (short) (((s7 & 255) << 8) | ((65280 & s7) >>> 8));
    }

    /* JADX INFO: renamed from: j */
    public static final String m2976j(byte b7) {
        return AbstractC6406h.m27558q(new char[]{AbstractC0707b.m3447f()[(b7 >> 4) & 15], AbstractC0707b.m3447f()[b7 & 15]});
    }

    /* JADX INFO: renamed from: k */
    public static final String m2977k(int i7) {
        int i8 = 0;
        if (i7 == 0) {
            return "0";
        }
        char[] cArr = {AbstractC0707b.m3447f()[(i7 >> 28) & 15], AbstractC0707b.m3447f()[(i7 >> 24) & 15], AbstractC0707b.m3447f()[(i7 >> 20) & 15], AbstractC0707b.m3447f()[(i7 >> 16) & 15], AbstractC0707b.m3447f()[(i7 >> 12) & 15], AbstractC0707b.m3447f()[(i7 >> 8) & 15], AbstractC0707b.m3447f()[(i7 >> 4) & 15], AbstractC0707b.m3447f()[i7 & 15]};
        while (i8 < 8 && cArr[i8] == '0') {
            i8++;
        }
        return AbstractC6406h.m27559r(cArr, i8, 8);
    }
}
