package p200a4;

/* JADX INFO: renamed from: a4.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2205D {
    /* JADX INFO: renamed from: a */
    public static void m8947a(boolean z7, String str) {
        if (!z7) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m8948b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static Object m8949c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m8950d(boolean z7, String str) {
        if (!z7) {
            throw new IllegalStateException(str);
        }
    }
}
