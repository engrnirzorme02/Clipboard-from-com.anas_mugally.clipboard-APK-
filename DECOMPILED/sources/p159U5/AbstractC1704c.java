package p159U5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: U5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1704c {
    /* JADX INFO: renamed from: d */
    public static final Object[] m7243d(int i7) {
        if (i7 >= 0) {
            return new Object[i7];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    /* JADX INFO: renamed from: e */
    public static final Object[] m7244e(Object[] objArr, int i7) {
        AbstractC6118n.m27187e(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i7);
        AbstractC6118n.m27186d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: f */
    public static final void m7245f(Object[] objArr, int i7) {
        AbstractC6118n.m27187e(objArr, "<this>");
        objArr[i7] = null;
    }

    /* JADX INFO: renamed from: g */
    public static final void m7246g(Object[] objArr, int i7, int i8) {
        AbstractC6118n.m27187e(objArr, "<this>");
        while (i7 < i8) {
            m7245f(objArr, i7);
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final boolean m7247h(Object[] objArr, int i7, int i8, List list) {
        if (i8 != list.size()) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!AbstractC6118n.m27183a(objArr[i7 + i9], list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final int m7248i(Object[] objArr, int i7, int i8) {
        int iHashCode = 1;
        for (int i9 = 0; i9 < i8; i9++) {
            Object obj = objArr[i7 + i9];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final String m7249j(Object[] objArr, int i7, int i8, Collection collection) {
        StringBuilder sb = new StringBuilder((i8 * 3) + 2);
        sb.append("[");
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i7 + i9];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "toString(...)");
        return string;
    }
}
