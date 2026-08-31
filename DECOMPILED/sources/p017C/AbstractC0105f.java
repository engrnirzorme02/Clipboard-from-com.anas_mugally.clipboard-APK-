package p017C;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: renamed from: C.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0105f {

    /* JADX INFO: renamed from: C.f$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static Object m411a(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        /* JADX INFO: renamed from: b */
        static int m412b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* JADX INFO: renamed from: c */
        static String m413c(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: renamed from: C.f$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static int m414a(AppOpsManager appOpsManager, String str, int i7, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i7, str2);
        }

        /* JADX INFO: renamed from: b */
        static String m415b(Context context) {
            return context.getOpPackageName();
        }

        /* JADX INFO: renamed from: c */
        static AppOpsManager m416c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m408a(Context context, int i7, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m409b(context, str, str2);
        }
        AppOpsManager appOpsManagerM416c = b.m416c(context);
        int iM414a = b.m414a(appOpsManagerM416c, str, Binder.getCallingUid(), str2);
        return iM414a != 0 ? iM414a : b.m414a(appOpsManagerM416c, str, i7, b.m415b(context));
    }

    /* JADX INFO: renamed from: b */
    public static int m409b(Context context, String str, String str2) {
        return a.m412b((AppOpsManager) a.m411a(context, AppOpsManager.class), str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static String m410c(String str) {
        return a.m413c(str);
    }
}
