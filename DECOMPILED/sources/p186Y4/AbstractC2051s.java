package p186Y4;

import java.util.Locale;

/* JADX INFO: renamed from: Y4.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2051s {
    /* JADX INFO: renamed from: a */
    public static Object m8520a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static Object m8521b(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* JADX INFO: renamed from: c */
    public static Object m8522c(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.format(Locale.US, str, objArr));
    }
}
