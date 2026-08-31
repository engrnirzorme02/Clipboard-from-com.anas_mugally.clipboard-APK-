package p152T5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1634m extends AbstractC1633l {
    /* JADX INFO: renamed from: c */
    public static List m6690c(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<this>");
        List listM6754a = AbstractC1636o.m6754a(objArr);
        AbstractC6118n.m27186d(listM6754a, "asList(...)");
        return listM6754a;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m6691d(byte[] bArr, byte[] destination, int i7, int i8, int i9) {
        AbstractC6118n.m27187e(bArr, "<this>");
        AbstractC6118n.m27187e(destination, "destination");
        System.arraycopy(bArr, i8, destination, i7, i9 - i8);
        return destination;
    }

    /* JADX INFO: renamed from: e */
    public static int[] m6692e(int[] iArr, int[] destination, int i7, int i8, int i9) {
        AbstractC6118n.m27187e(iArr, "<this>");
        AbstractC6118n.m27187e(destination, "destination");
        System.arraycopy(iArr, i8, destination, i7, i9 - i8);
        return destination;
    }

    /* JADX INFO: renamed from: f */
    public static long[] m6693f(long[] jArr, long[] destination, int i7, int i8, int i9) {
        AbstractC6118n.m27187e(jArr, "<this>");
        AbstractC6118n.m27187e(destination, "destination");
        System.arraycopy(jArr, i8, destination, i7, i9 - i8);
        return destination;
    }

    /* JADX INFO: renamed from: g */
    public static Object[] m6694g(Object[] objArr, Object[] destination, int i7, int i8, int i9) {
        AbstractC6118n.m27187e(objArr, "<this>");
        AbstractC6118n.m27187e(destination, "destination");
        System.arraycopy(objArr, i8, destination, i7, i9 - i8);
        return destination;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ byte[] m6695h(byte[] bArr, byte[] bArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = bArr.length;
        }
        return m6691d(bArr, bArr2, i7, i8, i9);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int[] m6696i(int[] iArr, int[] iArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = iArr.length;
        }
        return m6692e(iArr, iArr2, i7, i8, i9);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Object[] m6697j(Object[] objArr, Object[] objArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        return m6694g(objArr, objArr2, i7, i8, i9);
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m6698k(byte[] bArr, int i7, int i8) {
        AbstractC6118n.m27187e(bArr, "<this>");
        AbstractC1632k.m6689b(i8, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i8);
        AbstractC6118n.m27186d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* JADX INFO: renamed from: l */
    public static Object[] m6699l(Object[] objArr, int i7, int i8) {
        AbstractC6118n.m27187e(objArr, "<this>");
        AbstractC1632k.m6689b(i8, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i7, i8);
        AbstractC6118n.m27186d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: m */
    public static void m6700m(Object[] objArr, Object obj, int i7, int i8) {
        AbstractC6118n.m27187e(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, obj);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m6701n(Object[] objArr, Object obj, int i7, int i8, int i9, Object obj2) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = objArr.length;
        }
        m6700m(objArr, obj, i7, i8);
    }

    /* JADX INFO: renamed from: o */
    public static final void m6702o(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m6703p(Object[] objArr, Comparator comparator) {
        AbstractC6118n.m27187e(objArr, "<this>");
        AbstractC6118n.m27187e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
