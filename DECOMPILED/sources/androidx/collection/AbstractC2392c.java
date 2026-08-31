package androidx.collection;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: androidx.collection.c */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2392c {
    /* JADX INFO: renamed from: a */
    static Object[] m10271a(Object[] objArr, int i7) {
        if (objArr.length < i7) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
