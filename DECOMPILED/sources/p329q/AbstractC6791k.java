package p329q;

import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: q.k */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC6791k {
    /* JADX INFO: renamed from: a */
    static String m29818a(Context context, int i7) {
        if (context == null) {
            return "";
        }
        if (i7 == 1) {
            return context.getString(AbstractC6800t.f27354d);
        }
        if (i7 != 7) {
            switch (i7) {
                case 9:
                    break;
                case 10:
                    return context.getString(AbstractC6800t.f27358h);
                case 11:
                    return context.getString(AbstractC6800t.f27357g);
                case 12:
                    return context.getString(AbstractC6800t.f27355e);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i7);
                    return context.getString(AbstractC6800t.f27352b);
            }
        }
        return context.getString(AbstractC6800t.f27356f);
    }

    /* JADX INFO: renamed from: b */
    static boolean m29819b(int i7) {
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 6:
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: c */
    static boolean m29820c(int i7) {
        return i7 == 7 || i7 == 9;
    }
}
