package p080J6;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.AbstractC0643E;
import p072I6.AbstractC0645b;
import p072I6.C0648e;
import p072I6.C0662s;
import p072I6.C0666w;

/* JADX INFO: renamed from: J6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0706a {

    /* JADX INFO: renamed from: a */
    private static final byte[] f2874a = AbstractC0643E.m2962a("0123456789abcdef");

    /* JADX INFO: renamed from: a */
    public static final C0648e.a m3436a(C0648e c0648e, C0648e.a unsafeCursor) {
        AbstractC6118n.m27187e(c0648e, "<this>");
        AbstractC6118n.m27187e(unsafeCursor, "unsafeCursor");
        C0648e.a aVarM2973g = AbstractC0645b.m2973g(unsafeCursor);
        if (aVarM2973g.f2553a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarM2973g.f2553a = c0648e;
        aVarM2973g.f2554b = true;
        return aVarM2973g;
    }

    /* JADX INFO: renamed from: b */
    public static final byte[] m3437b() {
        return f2874a;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m3438c(C0666w segment, int i7, byte[] bytes, int i8, int i9) {
        AbstractC6118n.m27187e(segment, "segment");
        AbstractC6118n.m27187e(bytes, "bytes");
        int i10 = segment.f2600c;
        byte[] bArr = segment.f2598a;
        while (i8 < i9) {
            if (i7 == i10) {
                segment = segment.f2603f;
                AbstractC6118n.m27184b(segment);
                byte[] bArr2 = segment.f2598a;
                bArr = bArr2;
                i7 = segment.f2599b;
                i10 = segment.f2600c;
            }
            if (bArr[i7] != bytes[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static final String m3439d(C0648e c0648e, long j7) throws EOFException {
        AbstractC6118n.m27187e(c0648e, "<this>");
        if (j7 > 0) {
            long j8 = j7 - 1;
            if (c0648e.m3060p0(j8) == 13) {
                String strM3044f1 = c0648e.m3044f1(j8);
                c0648e.mo3052l(2L);
                return strM3044f1;
            }
        }
        String strM3044f2 = c0648e.m3044f1(j7);
        c0648e.mo3052l(1L);
        return strM3044f2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final int m3440e(C0648e c0648e, C0662s options, boolean z7) {
        int i7;
        int i8;
        C0666w c0666w;
        int i9;
        int i10;
        AbstractC6118n.m27187e(c0648e, "<this>");
        AbstractC6118n.m27187e(options, "options");
        C0666w c0666w2 = c0648e.f2551a;
        if (c0666w2 == null) {
            return z7 ? -2 : -1;
        }
        byte[] bArr = c0666w2.f2598a;
        int i11 = c0666w2.f2599b;
        int i12 = c0666w2.f2600c;
        int[] iArrM3158n = options.m3158n();
        C0666w c0666w3 = c0666w2;
        int i13 = -1;
        int i14 = 0;
        loop0: while (true) {
            int i15 = i14 + 1;
            int i16 = iArrM3158n[i14];
            int i17 = i14 + 2;
            int i18 = iArrM3158n[i15];
            if (i18 != -1) {
                i13 = i18;
            }
            if (c0666w3 == null) {
                break;
            }
            if (i16 >= 0) {
                i7 = i11 + 1;
                int i19 = bArr[i11] & 255;
                int i20 = i17 + i16;
                while (i17 != i20) {
                    if (i19 == iArrM3158n[i17]) {
                        i8 = iArrM3158n[i17 + i16];
                        if (i7 == i12) {
                            c0666w3 = c0666w3.f2603f;
                            AbstractC6118n.m27184b(c0666w3);
                            i7 = c0666w3.f2599b;
                            bArr = c0666w3.f2598a;
                            i12 = c0666w3.f2600c;
                            if (c0666w3 == c0666w2) {
                                c0666w3 = null;
                            }
                        }
                        if (i8 >= 0) {
                            return i8;
                        }
                        i14 = -i8;
                        i11 = i7;
                    } else {
                        i17++;
                    }
                }
                return i13;
            }
            int i21 = i17 + (i16 * (-1));
            while (true) {
                int i22 = i11 + 1;
                int i23 = i17 + 1;
                if ((bArr[i11] & 255) == iArrM3158n[i17]) {
                    boolean z8 = i23 == i21;
                    if (i22 == i12) {
                        AbstractC6118n.m27184b(c0666w3);
                        C0666w c0666w4 = c0666w3.f2603f;
                        AbstractC6118n.m27184b(c0666w4);
                        i10 = c0666w4.f2599b;
                        byte[] bArr2 = c0666w4.f2598a;
                        i9 = c0666w4.f2600c;
                        if (c0666w4 != c0666w2) {
                            c0666w = c0666w4;
                            bArr = bArr2;
                        } else {
                            if (!z8) {
                                break loop0;
                            }
                            bArr = bArr2;
                            c0666w = null;
                        }
                    } else {
                        c0666w = c0666w3;
                        i9 = i12;
                        i10 = i22;
                    }
                    if (z8) {
                        i8 = iArrM3158n[i23];
                        i7 = i10;
                        i12 = i9;
                        c0666w3 = c0666w;
                        break;
                    }
                    i11 = i10;
                    i12 = i9;
                    c0666w3 = c0666w;
                    i17 = i23;
                }
                return i13;
            }
            if (i8 >= 0) {
                return i8;
            }
            i14 = -i8;
            i11 = i7;
        }
        if (z7) {
            return -2;
        }
        return i13;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3441f(C0648e c0648e, C0662s c0662s, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return m3440e(c0648e, c0662s, z7);
    }
}
