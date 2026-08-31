package p088K6;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* JADX INFO: renamed from: K6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0764a {

    /* JADX INFO: renamed from: K6.a$a */
    private static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        private final Object f3105a;

        public a(Object obj) {
            this.f3105a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return AbstractC0764a.m3597d(method, this.f3105a.getClass().getClassLoader()).invoke(this.f3105a, objArr);
            } catch (InvocationTargetException e7) {
                throw e7.getTargetException();
            } catch (ReflectiveOperationException e8) {
                throw new RuntimeException("Reflection failed for method " + method, e8);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m3594a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(AbstractC0764a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3595b(Collection collection, String str) {
        if (collection.contains(str)) {
            return true;
        }
        if (!m3598e()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return collection.contains(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static InvocationHandler m3596c(Object obj) {
        if (obj == null) {
            return null;
        }
        return new a(obj);
    }

    /* JADX INFO: renamed from: d */
    public static Method m3597d(Method method, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    /* JADX INFO: renamed from: e */
    private static boolean m3598e() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
