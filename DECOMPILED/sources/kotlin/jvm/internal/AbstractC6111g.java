package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.jvm.internal.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6111g {

    /* JADX INFO: renamed from: a */
    private static final Object[] f23881a = new Object[0];

    /* JADX INFO: renamed from: a */
    public static final Object[] m27180a(Collection collection) {
        AbstractC6118n.m27187e(collection, "collection");
        int size = collection.size();
        if (size == 0) {
            return f23881a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return f23881a;
        }
        Object[] objArrCopyOf = new Object[size];
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            objArrCopyOf[i7] = it.next();
            if (i8 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i9 = ((i8 * 3) + 1) >>> 1;
                if (i9 <= i8) {
                    i9 = 2147483645;
                    if (i8 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i9);
                AbstractC6118n.m27186d(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i8);
                AbstractC6118n.m27186d(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i7 = i8;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object[] m27181b(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        AbstractC6118n.m27187e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i7 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    AbstractC6118n.m27185c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i8 = i7 + 1;
                    objArrCopyOf[i7] = it.next();
                    if (i8 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i9 = ((i8 * 3) + 1) >>> 1;
                        if (i9 <= i8) {
                            i9 = 2147483645;
                            if (i8 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i9);
                        AbstractC6118n.m27186d(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i8] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i8);
                        AbstractC6118n.m27186d(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i7 = i8;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
