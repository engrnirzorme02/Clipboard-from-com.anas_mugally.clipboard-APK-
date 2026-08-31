package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5723A0 implements InterfaceC5781f0 {

    /* JADX INFO: renamed from: b */
    private static final Logger f21922b = Logger.getLogger(C5723A0.class.getName());

    /* JADX INFO: renamed from: c */
    private static final Constructor f21923c;

    /* JADX INFO: renamed from: d */
    private static final Method f21924d;

    /* JADX INFO: renamed from: e */
    private static final Method f21925e;

    /* JADX INFO: renamed from: f */
    private static final RuntimeException f21926f;

    /* JADX INFO: renamed from: g */
    private static final Object[] f21927g;

    /* JADX INFO: renamed from: a */
    private final Object f21928a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                int i7 = 0;
                method2 = cls.getMethod("sum", new Class[0]);
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    while (true) {
                        if (i7 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = constructors[i7];
                        if (constructor.getParameterTypes().length == 0) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    th = null;
                } catch (Throwable th) {
                    th = th;
                    f21922b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                    constructor = null;
                }
            } catch (Throwable th2) {
                th = th2;
                method2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            method = null;
            method2 = null;
        }
        if (th != null || constructor == null) {
            f21923c = null;
            f21924d = null;
            f21925e = null;
            f21926f = new RuntimeException(th);
        } else {
            f21923c = constructor;
            f21924d = method;
            f21925e = method2;
            f21926f = null;
        }
        f21927g = new Object[]{1L};
    }

    C5723A0() {
        RuntimeException runtimeException = f21926f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f21928a = f21923c.newInstance(new Object[0]);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* JADX INFO: renamed from: b */
    static boolean m25420b() {
        return f21926f == null;
    }

    @Override // io.grpc.internal.InterfaceC5781f0
    /* JADX INFO: renamed from: a */
    public void mo25421a(long j7) {
        try {
            f21924d.invoke(this.f21928a, j7 == 1 ? f21927g : new Object[]{Long.valueOf(j7)});
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }
}
