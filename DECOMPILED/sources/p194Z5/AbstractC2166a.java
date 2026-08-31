package p194Z5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1631j;
import p262h6.AbstractC5657c;
import p262h6.C5656b;

/* JADX INFO: renamed from: Z5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2166a {

    /* JADX INFO: renamed from: Z5.a$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f7029a = new a();

        /* JADX INFO: renamed from: b */
        public static final Method f7030b;

        /* JADX INFO: renamed from: c */
        public static final Method f7031c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC6118n.m27184b(methods);
            int length = methods.length;
            int i7 = 0;
            while (true) {
                method = null;
                if (i7 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i7];
                if (AbstractC6118n.m27183a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC6118n.m27186d(parameterTypes, "getParameterTypes(...)");
                    if (AbstractC6118n.m27183a(AbstractC1631j.m6725V(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i7++;
            }
            f7030b = method2;
            for (Method method3 : methods) {
                if (AbstractC6118n.m27183a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f7031c = method;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo8786a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        AbstractC6118n.m27187e(cause, "cause");
        AbstractC6118n.m27187e(exception, "exception");
        Method method = a.f7030b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC5657c mo8787b() {
        return new C5656b();
    }
}
