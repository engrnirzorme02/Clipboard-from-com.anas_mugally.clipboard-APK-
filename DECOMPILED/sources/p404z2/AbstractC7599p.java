package p404z2;

import android.util.Log;
import com.google.android.gms.internal.ads.zzghq;

/* JADX INFO: renamed from: z2.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7599p {

    /* JADX INFO: renamed from: a */
    protected static final zzghq f30269a = zzghq.zzc(4000);

    /* JADX INFO: renamed from: a */
    public static void m33326a(String str) {
        if (m33335j(3)) {
            if (str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f30269a.zzd(str)) {
                if (z7) {
                    Log.d("Ads", str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m33327b(String str, Throwable th) {
        if (m33335j(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m33328c(String str) {
        if (m33335j(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f30269a.zzd(str)) {
                if (z7) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m33329d(String str, Throwable th) {
        if (m33335j(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m33330e(String str) {
        if (m33335j(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f30269a.zzd(str)) {
                if (z7) {
                    Log.i("Ads", str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m33331f(String str) {
        if (m33335j(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f30269a.zzd(str)) {
                if (z7) {
                    Log.w("Ads", str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m33332g(String str, Throwable th) {
        if (m33335j(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: h */
    static String m33333h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static void m33334i(String str, Throwable th) {
        if (m33335j(5)) {
            if (th != null) {
                m33332g(m33333h(str), th);
            } else {
                m33331f(m33333h(str));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m33335j(int i7) {
        return i7 >= 5 || Log.isLoggable("Ads", i7);
    }
}
