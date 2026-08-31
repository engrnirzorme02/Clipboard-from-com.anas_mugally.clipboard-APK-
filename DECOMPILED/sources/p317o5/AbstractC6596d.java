package p317o5;

/* JADX INFO: renamed from: o5.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6596d {
    /* JADX INFO: renamed from: a */
    public static void m27933a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* JADX INFO: renamed from: b */
    public static Object m27934b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static Object m27935c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: d */
    public static Object m27936d(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
