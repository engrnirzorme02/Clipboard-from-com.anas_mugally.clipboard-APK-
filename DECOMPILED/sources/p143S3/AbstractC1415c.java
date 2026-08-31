package p143S3;

/* JADX INFO: renamed from: S3.c */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1415c {
    /* JADX INFO: renamed from: a */
    static void m6008a(boolean z7, String str, long j7, long j8) {
        if (z7) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j7 + ", " + j8 + ")");
    }

    /* JADX INFO: renamed from: b */
    static int m6009b(String str, int i7) {
        if (i7 > 0) {
            return i7;
        }
        throw new IllegalArgumentException(str + " (" + i7 + ") must be > 0");
    }

    /* JADX INFO: renamed from: c */
    static void m6010c(boolean z7) {
        if (!z7) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
