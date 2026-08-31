package p329q;

import android.os.Build;

/* JADX INFO: renamed from: q.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC6782b {
    /* JADX INFO: renamed from: a */
    static String m29632a(int i7) {
        if (i7 == 15) {
            return "BIOMETRIC_STRONG";
        }
        if (i7 == 255) {
            return "BIOMETRIC_WEAK";
        }
        if (i7 == 32768) {
            return "DEVICE_CREDENTIAL";
        }
        if (i7 != 32783) {
            return i7 != 33023 ? String.valueOf(i7) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
        }
        return "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
    }

    /* JADX INFO: renamed from: b */
    static int m29633b(C6786f.d dVar, C6786f.c cVar) {
        if (dVar.m29724a() != 0) {
            return dVar.m29724a();
        }
        int i7 = cVar != null ? 15 : 255;
        return dVar.m29730g() ? 32768 | i7 : i7;
    }

    /* JADX INFO: renamed from: c */
    static boolean m29634c(int i7) {
        return (i7 & 32768) != 0;
    }

    /* JADX INFO: renamed from: d */
    static boolean m29635d(int i7) {
        return (i7 & 32767) != 0;
    }

    /* JADX INFO: renamed from: e */
    static boolean m29636e(int i7) {
        if (i7 != 15 && i7 != 255) {
            if (i7 == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i7 != 32783) {
                return i7 == 33023 || i7 == 0;
            }
            int i8 = Build.VERSION.SDK_INT;
            return i8 < 28 || i8 > 29;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    static boolean m29637f(int i7) {
        return (i7 & 255) == 255;
    }
}
