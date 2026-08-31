package p353t;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7065a {

    /* JADX INFO: renamed from: a */
    public static final int[] f28224a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f28225b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f28226c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static final int m31154a(int[] array, int i7, int i8) {
        AbstractC6118n.m27187e(array, "array");
        int i9 = i7 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = array[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i8) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    /* JADX INFO: renamed from: b */
    public static final int m31155b(long[] array, int i7, long j7) {
        AbstractC6118n.m27187e(array, "array");
        int i8 = i7 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j8 = array[i10];
            if (j8 < j7) {
                i9 = i10 + 1;
            } else {
                if (j8 <= j7) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m31156c(Object obj, Object obj2) {
        return AbstractC6118n.m27183a(obj, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static final int m31157d(int i7) {
        for (int i8 = 4; i8 < 32; i8++) {
            int i9 = (1 << i8) - 12;
            if (i7 <= i9) {
                return i9;
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: e */
    public static final int m31158e(int i7) {
        return m31157d(i7 * 4) / 4;
    }

    /* JADX INFO: renamed from: f */
    public static final int m31159f(int i7) {
        return m31157d(i7 * 8) / 8;
    }
}
