package p104N;

import java.util.Locale;

/* JADX INFO: renamed from: N.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0910g {
    /* JADX INFO: renamed from: a */
    public static void m4133a(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4134b(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m4135c(int i7, int i8, int i9, String str) {
        if (i7 < i8) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        if (i7 <= i9) {
            return i7;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    /* JADX INFO: renamed from: d */
    public static int m4136d(int i7) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: e */
    public static int m4137e(int i7, String str) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: f */
    public static int m4138f(int i7, int i8) {
        if ((i7 & i8) == i7) {
            return i7;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i7) + ", but only 0x" + Integer.toHexString(i8) + " are allowed");
    }

    /* JADX INFO: renamed from: g */
    public static Object m4139g(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static Object m4140h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* JADX INFO: renamed from: i */
    public static void m4141i(boolean z7, String str) {
        if (!z7) {
            throw new IllegalStateException(str);
        }
    }
}
