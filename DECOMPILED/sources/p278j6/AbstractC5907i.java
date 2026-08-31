package p278j6;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j6.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5907i extends AbstractC5906h {
    /* JADX INFO: renamed from: b */
    public static int m26654b(int i7, int i8) {
        return i7 < i8 ? i8 : i7;
    }

    /* JADX INFO: renamed from: c */
    public static long m26655c(long j7, long j8) {
        return j7 < j8 ? j8 : j7;
    }

    /* JADX INFO: renamed from: d */
    public static int m26656d(int i7, int i8) {
        return i7 > i8 ? i8 : i7;
    }

    /* JADX INFO: renamed from: e */
    public static long m26657e(long j7, long j8) {
        return j7 > j8 ? j8 : j7;
    }

    /* JADX INFO: renamed from: f */
    public static float m26658f(float f7, float f8, float f9) {
        if (f8 <= f9) {
            if (f7 < f8) {
                return f8;
            }
            return f7 > f9 ? f9 : f7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f9 + " is less than minimum " + f8 + '.');
    }

    /* JADX INFO: renamed from: g */
    public static int m26659g(int i7, int i8, int i9) {
        if (i8 <= i9) {
            if (i7 < i8) {
                return i8;
            }
            return i7 > i9 ? i9 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    /* JADX INFO: renamed from: h */
    public static long m26660h(long j7, long j8, long j9) {
        if (j8 <= j9) {
            if (j7 < j8) {
                return j8;
            }
            return j7 > j9 ? j9 : j7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j9 + " is less than minimum " + j8 + '.');
    }

    /* JADX INFO: renamed from: i */
    public static C5902d m26661i(int i7, int i8) {
        return C5902d.f23472d.m26647a(i7, i8, -1);
    }

    /* JADX INFO: renamed from: j */
    public static C5902d m26662j(C5902d c5902d, int i7) {
        AbstractC6118n.m27187e(c5902d, "<this>");
        AbstractC5906h.m26653a(i7 > 0, Integer.valueOf(i7));
        C5902d.a aVar = C5902d.f23472d;
        int iM26643a = c5902d.m26643a();
        int iM26644b = c5902d.m26644b();
        if (c5902d.m26645e() <= 0) {
            i7 = -i7;
        }
        return aVar.m26647a(iM26643a, iM26644b, i7);
    }

    /* JADX INFO: renamed from: k */
    public static C5904f m26663k(int i7, int i8) {
        return i8 <= Integer.MIN_VALUE ? C5904f.f23480e.m26652a() : new C5904f(i7, i8 - 1);
    }
}
