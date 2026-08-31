package p367u5;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: u5.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7165D {
    /* JADX INFO: renamed from: a */
    public static boolean m31670a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    /* JADX INFO: renamed from: b */
    public static Class m31671b(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }
}
