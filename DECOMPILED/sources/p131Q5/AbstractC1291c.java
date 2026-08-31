package p131Q5;

/* JADX INFO: renamed from: Q5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1291c {

    /* JADX INFO: renamed from: a */
    private static final C1289a f4578a;

    static {
        Object obj;
        Class<?> cls;
        C1289a c1289a;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                c1289a = (C1289a) cls.asSubclass(C1289a.class).getConstructor(C1292d.class).newInstance(C1289a.f4575a);
            } catch (Throwable th2) {
                obj = th2;
                c1289a = null;
            }
        } else {
            c1289a = null;
        }
        if (c1289a != null) {
            f4578a = c1289a;
        } else {
            f4578a = new C1289a(C1289a.f4575a);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, AbstractC1291c.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5625a(C1292d c1292d) {
        f4578a.m5618a(c1292d);
    }

    /* JADX INFO: renamed from: b */
    public static C1292d m5626b(String str) {
        return f4578a.m5619b(str, Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public static C1292d m5627c(String str, long j7) {
        return f4578a.m5619b(str, j7);
    }

    /* JADX INFO: renamed from: d */
    public static void m5628d(String str, C1292d c1292d) {
        f4578a.m5620c(str, c1292d);
    }

    /* JADX INFO: renamed from: e */
    public static void m5629e(C1290b c1290b) {
        f4578a.m5621d(c1290b);
    }

    /* JADX INFO: renamed from: f */
    public static C1290b m5630f() {
        return f4578a.m5622e();
    }

    /* JADX INFO: renamed from: g */
    public static void m5631g() {
        f4578a.m5624g();
    }

    /* JADX INFO: renamed from: h */
    public static C1293e m5632h(String str) {
        f4578a.m5623f(str);
        return C1293e.f4581a;
    }
}
