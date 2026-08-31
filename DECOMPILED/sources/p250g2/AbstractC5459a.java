package p250g2;

import android.util.Log;

/* JADX INFO: renamed from: g2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5459a {
    /* JADX INFO: renamed from: a */
    public static void m24663a(String str, String str2, Object obj) {
        String strM24666d = m24666d(str);
        if (Log.isLoggable(strM24666d, 3)) {
            Log.d(strM24666d, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24664b(String str, String str2, Object... objArr) {
        String strM24666d = m24666d(str);
        if (Log.isLoggable(strM24666d, 3)) {
            Log.d(strM24666d, String.format(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m24665c(String str, String str2, Throwable th) {
        String strM24666d = m24666d(str);
        if (Log.isLoggable(strM24666d, 6)) {
            Log.e(strM24666d, str2, th);
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m24666d(String str) {
        return "TRuntime." + str;
    }

    /* JADX INFO: renamed from: e */
    public static void m24667e(String str, String str2, Object obj) {
        String strM24666d = m24666d(str);
        if (Log.isLoggable(strM24666d, 4)) {
            Log.i(strM24666d, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m24668f(String str, String str2, Object obj) {
        String strM24666d = m24666d(str);
        if (Log.isLoggable(strM24666d, 5)) {
            Log.w(strM24666d, String.format(str2, obj));
        }
    }
}
