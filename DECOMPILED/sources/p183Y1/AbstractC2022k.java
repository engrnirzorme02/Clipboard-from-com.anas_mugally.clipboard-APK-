package p183Y1;

import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: renamed from: Y1.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2022k {
    /* JADX INFO: renamed from: a */
    public static void m8404a(boolean z7) {
        m8405b(z7, "");
    }

    /* JADX INFO: renamed from: b */
    public static void m8405b(boolean z7, String str) {
        if (!z7) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m8406c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static Collection m8407d(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return collection;
    }

    /* JADX INFO: renamed from: e */
    public static Object m8408e(Object obj) {
        return m8409f(obj, "Argument must not be null");
    }

    /* JADX INFO: renamed from: f */
    public static Object m8409f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
