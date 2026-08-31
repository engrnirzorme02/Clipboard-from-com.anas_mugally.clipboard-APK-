package p122P3;

/* JADX INFO: renamed from: P3.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1209m {
    /* JADX INFO: renamed from: a */
    private static String m5289a(int i7, int i8, String str) {
        if (i7 < 0) {
            return AbstractC1213q.m5324b("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return AbstractC1213q.m5324b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException("negative size: " + i8);
    }

    /* JADX INFO: renamed from: b */
    private static String m5290b(int i7, int i8, String str) {
        if (i7 < 0) {
            return AbstractC1213q.m5324b("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return AbstractC1213q.m5324b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException("negative size: " + i8);
    }

    /* JADX INFO: renamed from: c */
    private static String m5291c(int i7, int i8, int i9) {
        if (i7 < 0 || i7 > i9) {
            return m5290b(i7, i9, "start index");
        }
        return (i8 < 0 || i8 > i9) ? m5290b(i8, i9, "end index") : AbstractC1213q.m5324b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
    }

    /* JADX INFO: renamed from: d */
    public static void m5292d(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5293e(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m5294f(boolean z7, String str, char c7) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC1213q.m5324b(str, Character.valueOf(c7)));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m5295g(boolean z7, String str, char c7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC1213q.m5324b(str, Character.valueOf(c7), obj));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m5296h(boolean z7, String str, int i7) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC1213q.m5324b(str, Integer.valueOf(i7)));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m5297i(boolean z7, String str, long j7) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC1213q.m5324b(str, Long.valueOf(j7)));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m5298j(boolean z7, String str, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC1213q.m5324b(str, obj));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m5299k(boolean z7, String str, Object obj, Object obj2) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC1213q.m5324b(str, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m5300l(int i7, int i8) {
        return m5301m(i7, i8, "index");
    }

    /* JADX INFO: renamed from: m */
    public static int m5301m(int i7, int i8, String str) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(m5289a(i7, i8, str));
        }
        return i7;
    }

    /* JADX INFO: renamed from: n */
    public static Object m5302n(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: o */
    public static Object m5303o(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* JADX INFO: renamed from: p */
    public static Object m5304p(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(AbstractC1213q.m5324b(str, obj2));
    }

    /* JADX INFO: renamed from: q */
    public static int m5305q(int i7, int i8) {
        return m5306r(i7, i8, "index");
    }

    /* JADX INFO: renamed from: r */
    public static int m5306r(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(m5290b(i7, i8, str));
        }
        return i7;
    }

    /* JADX INFO: renamed from: s */
    public static void m5307s(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException(m5291c(i7, i8, i9));
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m5308t(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m5309u(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m5310v(boolean z7, String str, int i7) {
        if (!z7) {
            throw new IllegalStateException(AbstractC1213q.m5324b(str, Integer.valueOf(i7)));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m5311w(boolean z7, String str, Object obj) {
        if (!z7) {
            throw new IllegalStateException(AbstractC1213q.m5324b(str, obj));
        }
    }
}
