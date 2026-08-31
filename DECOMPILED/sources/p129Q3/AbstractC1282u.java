package p129Q3;

import java.util.Arrays;

/* JADX INFO: renamed from: Q3.u */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1282u {
    /* JADX INFO: renamed from: a */
    static Object[] m5604a(Object[] objArr, int i7, int i8, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i7, i8, objArr2.getClass());
    }

    /* JADX INFO: renamed from: b */
    static Object[] m5605b(Object[] objArr, int i7) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i7);
    }
}
