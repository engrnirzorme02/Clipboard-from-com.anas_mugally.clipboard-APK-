package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6107c;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;

/* JADX INFO: renamed from: androidx.lifecycle.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2627T {

    /* JADX INFO: renamed from: a */
    private static final List f10430a = AbstractC1638q.m6767l(Application.class, C2619K.class);

    /* JADX INFO: renamed from: b */
    private static final List f10431b = AbstractC1638q.m6759d(C2619K.class);

    /* JADX INFO: renamed from: c */
    public static final Constructor m12575c(Class modelClass, List signature) {
        AbstractC6118n.m27187e(modelClass, "modelClass");
        AbstractC6118n.m27187e(signature, "signature");
        Iterator itM27171a = AbstractC6107c.m27171a(modelClass.getConstructors());
        while (itM27171a.hasNext()) {
            Constructor constructor = (Constructor) itM27171a.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC6118n.m27186d(parameterTypes, "getParameterTypes(...)");
            List listE0 = AbstractC1631j.m6734e0(parameterTypes);
            if (AbstractC6118n.m27183a(signature, listE0)) {
                AbstractC6118n.m27185c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listE0.size() && listE0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC2632Y m12576d(Class modelClass, Constructor constructor, Object... params) {
        AbstractC6118n.m27187e(modelClass, "modelClass");
        AbstractC6118n.m27187e(constructor, "constructor");
        AbstractC6118n.m27187e(params, "params");
        try {
            return (AbstractC2632Y) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + modelClass, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e9.getCause());
        }
    }
}
