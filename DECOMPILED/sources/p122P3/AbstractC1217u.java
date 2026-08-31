package p122P3;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: P3.u */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1217u {

    /* JADX INFO: renamed from: a */
    private static final Object f4312a;

    /* JADX INFO: renamed from: b */
    private static final Method f4313b;

    /* JADX INFO: renamed from: c */
    private static final Method f4314c;

    static {
        Object objM5330b = m5330b();
        f4312a = objM5330b;
        f4313b = objM5330b == null ? null : m5329a();
        f4314c = objM5330b != null ? m5332d(objM5330b) : null;
    }

    /* JADX INFO: renamed from: a */
    private static Method m5329a() {
        return m5331c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* JADX INFO: renamed from: b */
    private static Object m5330b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e7) {
            throw e7;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static Method m5331c(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e7) {
            throw e7;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static Method m5332d(Object obj) {
        try {
            Method methodM5331c = m5331c("getStackTraceDepth", Throwable.class);
            if (methodM5331c == null) {
                return null;
            }
            methodM5331c.invoke(obj, new Throwable());
            return methodM5331c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m5333e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: f */
    public static void m5334f(Throwable th) {
        AbstractC1209m.m5302n(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
