package p025D;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: D.g */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0164g {
    /* JADX INFO: renamed from: a */
    public static int[] m806a(int[] iArr, int i7, int i8) {
        if (i7 + 1 > iArr.length) {
            int[] iArr2 = new int[m808c(i7)];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            iArr = iArr2;
        }
        iArr[i7] = i8;
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m807b(Object[] objArr, int i7, Object obj) {
        if (i7 + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m808c(i7));
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            objArr = objArr2;
        }
        objArr[i7] = obj;
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m808c(int i7) {
        if (i7 <= 4) {
            return 8;
        }
        return i7 * 2;
    }
}
