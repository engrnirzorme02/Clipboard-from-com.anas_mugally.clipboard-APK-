package p104N;

import java.util.Objects;

/* JADX INFO: renamed from: N.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0905b {
    /* JADX INFO: renamed from: a */
    public static boolean m4125a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public static int m4126b(Object... objArr) {
        return Objects.hash(objArr);
    }

    /* JADX INFO: renamed from: c */
    public static Object m4127c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Object m4128d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
