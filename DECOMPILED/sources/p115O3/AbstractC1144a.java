package p115O3;

/* JADX INFO: renamed from: O3.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1144a {
    /* JADX INFO: renamed from: a */
    public static int m4967a(double d7, long j7) {
        if (Double.isNaN(d7) || d7 < -9.223372036854776E18d) {
            return -1;
        }
        if (d7 >= 9.223372036854776E18d) {
            return 1;
        }
        int iCompare = Long.compare((long) d7, j7);
        return iCompare != 0 ? iCompare : m4968b(d7, j7);
    }

    /* JADX INFO: renamed from: b */
    public static int m4968b(double d7, double d8) {
        if (d7 < d8) {
            return -1;
        }
        if (d7 > d8) {
            return 1;
        }
        if (d7 == d8) {
            return 0;
        }
        if (Double.isNaN(d8)) {
            return !Double.isNaN(d7) ? 1 : 0;
        }
        return -1;
    }
}
