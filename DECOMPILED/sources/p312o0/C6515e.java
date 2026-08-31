package p312o0;

import androidx.lifecycle.AbstractC2632Y;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: o0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6515e {

    /* JADX INFO: renamed from: a */
    public static final C6515e f24638a = new C6515e();

    private C6515e() {
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC2632Y m27745a(Class modelClass) throws InvocationTargetException {
        AbstractC6118n.m27187e(modelClass, "modelClass");
        try {
            Constructor declaredConstructor = modelClass.getDeclaredConstructor(new Class[0]);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + modelClass);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                AbstractC6118n.m27184b(objNewInstance);
                return (AbstractC2632Y) objNewInstance;
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e8);
            }
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e9);
        }
    }
}
