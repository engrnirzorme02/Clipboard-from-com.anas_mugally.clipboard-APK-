package p152T5;

import java.lang.reflect.Array;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: T5.k */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1632k {
    /* JADX INFO: renamed from: a */
    public static final Object[] m6688a(Object[] reference, int i7) {
        AbstractC6118n.m27187e(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i7);
        AbstractC6118n.m27185c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    /* JADX INFO: renamed from: b */
    public static final void m6689b(int i7, int i8) {
        if (i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + i8 + ").");
    }
}
