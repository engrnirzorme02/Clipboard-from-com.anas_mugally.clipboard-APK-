package p129Q3;

/* JADX INFO: renamed from: Q3.d */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1265d {
    /* JADX INFO: renamed from: a */
    static void m5508a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: renamed from: b */
    static int m5509b(int i7, String str) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i7);
    }
}
