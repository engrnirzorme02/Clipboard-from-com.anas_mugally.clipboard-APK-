package p066I0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: I0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0578a {

    /* JADX INFO: renamed from: a */
    private static long f2212a;

    /* JADX INFO: renamed from: b */
    private static Method f2213b;

    /* JADX INFO: renamed from: a */
    public static void m2543a(String str) {
        AbstractC0579b.m2549a(m2548f(str));
    }

    /* JADX INFO: renamed from: b */
    public static void m2544b() {
        AbstractC0579b.m2550b();
    }

    /* JADX INFO: renamed from: c */
    private static void m2545c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2546d() {
        return Build.VERSION.SDK_INT >= 29 ? AbstractC0580c.m2551a() : m2547e();
    }

    /* JADX INFO: renamed from: e */
    private static boolean m2547e() {
        try {
            if (f2213b == null) {
                f2212a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2213b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2213b.invoke(null, Long.valueOf(f2212a))).booleanValue();
        } catch (Exception e7) {
            m2545c("isTagEnabled", e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m2548f(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
