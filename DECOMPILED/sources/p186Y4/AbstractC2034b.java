package p186Y4;

/* JADX INFO: renamed from: Y4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2034b {
    /* JADX INFO: renamed from: a */
    public static AssertionError m8457a(String str, Object... objArr) {
        throw new AssertionError(m8459c(str, objArr));
    }

    /* JADX INFO: renamed from: b */
    public static AssertionError m8458b(Throwable th, String str, Object... objArr) {
        throw AbstractC2033a.m8456a(m8459c(str, objArr), th);
    }

    /* JADX INFO: renamed from: c */
    private static String m8459c(String str, Object... objArr) {
        return "INTERNAL ASSERTION FAILED: " + String.format(str, objArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m8460d(boolean z7, String str, Object... objArr) {
        if (!z7) {
            throw m8457a(str, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m8461e(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw m8457a(str, objArr);
    }
}
