package p234e2;

/* JADX INFO: renamed from: e2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5338d {
    /* JADX INFO: renamed from: a */
    public static void m24328a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* JADX INFO: renamed from: b */
    public static Object m24329b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static Object m24330c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: d */
    public static Object m24331d(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
