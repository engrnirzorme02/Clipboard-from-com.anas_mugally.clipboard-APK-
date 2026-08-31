package p152T5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p159U5.C1703b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1639r {
    /* JADX INFO: renamed from: a */
    public static List m6756a(List builder) {
        AbstractC6118n.m27187e(builder, "builder");
        return ((C1703b) builder).m7222z();
    }

    /* JADX INFO: renamed from: b */
    public static final Object[] m6757b(Object[] objArr, boolean z7) {
        AbstractC6118n.m27187e(objArr, "<this>");
        if (z7 && AbstractC6118n.m27183a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC6118n.m27186d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: c */
    public static List m6758c() {
        return new C1703b(0, 1, null);
    }

    /* JADX INFO: renamed from: d */
    public static List m6759d(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC6118n.m27186d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: e */
    public static List m6760e(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        List listM6595i0 = AbstractC1603A.m6595i0(iterable);
        Collections.shuffle(listM6595i0);
        return listM6595i0;
    }

    /* JADX INFO: renamed from: f */
    public static Object[] m6761f(int i7, Object[] array) {
        AbstractC6118n.m27187e(array, "array");
        if (i7 < array.length) {
            array[i7] = null;
        }
        return array;
    }
}
