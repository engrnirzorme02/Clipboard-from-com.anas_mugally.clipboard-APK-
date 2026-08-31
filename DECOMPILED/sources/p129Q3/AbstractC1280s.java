package p129Q3;

/* JADX INFO: renamed from: Q3.s */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1280s {
    /* JADX INFO: renamed from: a */
    static Object m5598a(Object obj, int i7) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i7);
    }

    /* JADX INFO: renamed from: b */
    static Object[] m5599b(Object... objArr) {
        m5600c(objArr, objArr.length);
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    static Object[] m5600c(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            m5598a(objArr[i8], i8);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: d */
    public static Object[] m5601d(Object[] objArr, int i7) {
        return AbstractC1282u.m5605b(objArr, i7);
    }
}
