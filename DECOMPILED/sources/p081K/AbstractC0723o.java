package p081K;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: K.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0723o {

    /* JADX INFO: renamed from: a */
    private static long f2893a;

    /* JADX INFO: renamed from: b */
    private static Method f2894b;

    /* JADX INFO: renamed from: c */
    private static Method f2895c;

    /* JADX INFO: renamed from: d */
    private static Method f2896d;

    /* JADX INFO: renamed from: e */
    private static Method f2897e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f2893a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f2894b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f2895c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f2896d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f2897e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e7) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e7);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3486a(String str) {
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m3487b() {
        Trace.endSection();
    }
}
