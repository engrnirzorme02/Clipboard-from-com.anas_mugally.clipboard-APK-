package p087K5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: K5.g */
/* JADX INFO: loaded from: classes.dex */
public class C0758g {

    /* JADX INFO: renamed from: a */
    private final Class f3059a;

    /* JADX INFO: renamed from: b */
    private final String f3060b;

    /* JADX INFO: renamed from: c */
    private final Class[] f3061c;

    public C0758g(Class cls, String str, Class... clsArr) {
        this.f3059a = cls;
        this.f3060b = str;
        this.f3061c = clsArr;
    }

    /* JADX INFO: renamed from: a */
    private Method m3565a(Class cls) {
        Class cls2;
        String str = this.f3060b;
        if (str == null) {
            return null;
        }
        Method methodM3566b = m3566b(cls, str, this.f3061c);
        if (methodM3566b == null || (cls2 = this.f3059a) == null || cls2.isAssignableFrom(methodM3566b.getReturnType())) {
            return methodM3566b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static Method m3566b(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return m3566b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (NoSuchMethodException unused) {
                return method;
            }
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public Object m3567c(Object obj, Object... objArr) {
        Method methodM3565a = m3565a(obj.getClass());
        if (methodM3565a == null) {
            throw new AssertionError("Method " + this.f3060b + " not supported for object " + obj);
        }
        try {
            return methodM3565a.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM3565a);
            assertionError.initCause(e7);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: d */
    public Object m3568d(Object obj, Object... objArr) {
        Method methodM3565a = m3565a(obj.getClass());
        if (methodM3565a == null) {
            return null;
        }
        try {
            return methodM3565a.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public Object m3569e(Object obj, Object... objArr) {
        try {
            return m3568d(obj, objArr);
        } catch (InvocationTargetException e7) {
            Throwable targetException = e7.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: f */
    public Object m3570f(Object obj, Object... objArr) {
        try {
            return m3567c(obj, objArr);
        } catch (InvocationTargetException e7) {
            Throwable targetException = e7.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m3571g(Object obj) {
        return m3565a(obj.getClass()) != null;
    }
}
