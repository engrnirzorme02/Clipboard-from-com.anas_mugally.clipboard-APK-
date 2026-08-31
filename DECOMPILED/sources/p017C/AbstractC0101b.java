package p017C;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.content.AbstractC2436b;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: C.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0101b extends AbstractC2436b {

    /* JADX INFO: renamed from: C.b$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m392a(Activity activity, String[] strArr, int i7) {
            activity.requestPermissions(strArr, i7);
        }

        /* JADX INFO: renamed from: b */
        static boolean m393b(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: C.b$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static boolean m394a(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: renamed from: C.b$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static boolean m395a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: C.b$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo396a(int i7);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m385a(Activity activity) {
        if (activity.isFinishing() || AbstractC0103d.m405i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* JADX INFO: renamed from: b */
    public static void m386b(Activity activity) {
        activity.finishAffinity();
    }

    /* JADX INFO: renamed from: c */
    public static void m387c(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: C.a
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0101b.m385a(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static void m388d(Activity activity, String[] strArr, int i7) {
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (TextUtils.isEmpty(strArr[i8])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i8], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i8));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i9 = 0;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    strArr2[i9] = strArr[i10];
                    i9++;
                }
            }
        }
        if (activity instanceof d) {
            ((d) activity).mo396a(i7);
        }
        a.m392a(activity, strArr, i7);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m389e(Activity activity, String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i7 >= 32) {
            return c.m395a(activity, str);
        }
        return i7 == 31 ? b.m394a(activity, str) : a.m393b(activity, str);
    }

    /* JADX INFO: renamed from: f */
    public static void m390f(Activity activity, Intent intent, int i7, Bundle bundle) {
        activity.startActivityForResult(intent, i7, bundle);
    }

    /* JADX INFO: renamed from: g */
    public static void m391g(Activity activity, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }
}
