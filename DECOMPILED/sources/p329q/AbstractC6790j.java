package p329q;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: q.j */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC6790j {
    /* JADX INFO: renamed from: a */
    static boolean m29811a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return m29812b(context, str, AbstractC6795o.f27338a);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m29812b(Context context, String str, int i7) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i7)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m29813c(Context context, String str, int i7) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i7)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m29814d(Context context, String str, int i7) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i7)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    static boolean m29815e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return m29812b(context, str, AbstractC6795o.f27341d);
    }

    /* JADX INFO: renamed from: f */
    static boolean m29816f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return m29813c(context, str, AbstractC6795o.f27342e);
    }

    /* JADX INFO: renamed from: g */
    static boolean m29817g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return m29814d(context, str, AbstractC6795o.f27340c) || m29813c(context, str2, AbstractC6795o.f27339b);
    }
}
