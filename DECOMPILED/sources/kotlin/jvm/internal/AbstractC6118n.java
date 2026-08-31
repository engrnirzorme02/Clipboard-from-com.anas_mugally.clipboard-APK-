package kotlin.jvm.internal;

import java.util.Arrays;
import p145S5.C1443u;

/* JADX INFO: renamed from: kotlin.jvm.internal.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6118n {
    /* JADX INFO: renamed from: a */
    public static boolean m27183a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static void m27184b(Object obj) {
        if (obj == null) {
            m27193k();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m27185c(Object obj, String str) {
        if (obj == null) {
            m27194l(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m27186d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m27191i(new NullPointerException(str + " must not be null")));
    }

    /* JADX INFO: renamed from: e */
    public static void m27187e(Object obj, String str) {
        if (obj == null) {
            m27195m(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m27188f(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 == i8 ? 0 : 1;
    }

    /* JADX INFO: renamed from: g */
    public static int m27189g(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 == j8 ? 0 : 1;
    }

    /* JADX INFO: renamed from: h */
    private static String m27190h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC6118n.class.getName();
        int i7 = 0;
        while (!stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        while (stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        StackTraceElement stackTraceElement = stackTrace[i7];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* JADX INFO: renamed from: i */
    private static Throwable m27191i(Throwable th) {
        return m27192j(th, AbstractC6118n.class.getName());
    }

    /* JADX INFO: renamed from: j */
    static Throwable m27192j(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i7 = i8;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
        return th;
    }

    /* JADX INFO: renamed from: k */
    public static void m27193k() {
        throw ((NullPointerException) m27191i(new NullPointerException()));
    }

    /* JADX INFO: renamed from: l */
    public static void m27194l(String str) {
        throw ((NullPointerException) m27191i(new NullPointerException(str)));
    }

    /* JADX INFO: renamed from: m */
    private static void m27195m(String str) {
        throw ((NullPointerException) m27191i(new NullPointerException(m27190h(str))));
    }

    /* JADX INFO: renamed from: n */
    public static void m27196n(String str) {
        throw ((C1443u) m27191i(new C1443u(str)));
    }

    /* JADX INFO: renamed from: o */
    public static void m27197o(String str) {
        m27196n("lateinit property " + str + " has not been initialized");
    }
}
