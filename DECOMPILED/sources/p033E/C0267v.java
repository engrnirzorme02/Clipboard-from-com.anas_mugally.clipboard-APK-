package p033E;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: E.v */
/* JADX INFO: loaded from: classes.dex */
public class C0267v extends C0266u {
    @Override // p033E.C0266u
    /* JADX INFO: renamed from: i */
    protected Typeface mo1250i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f1002g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f1008m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p033E.C0266u
    /* JADX INFO: renamed from: t */
    protected Method mo1254t(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
