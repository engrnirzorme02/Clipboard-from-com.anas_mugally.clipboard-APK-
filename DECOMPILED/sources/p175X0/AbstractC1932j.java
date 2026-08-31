package p175X0;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.C2895a;
import java.lang.reflect.Method;
import java.util.List;
import p112O0.AbstractC1097j;

/* JADX INFO: renamed from: X0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1932j {

    /* JADX INFO: renamed from: a */
    private static final String f6378a = AbstractC1097j.m4846f("ProcessUtils");

    /* JADX INFO: renamed from: a */
    public static String m7982a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, AbstractC1932j.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th) {
            AbstractC1097j.m4844c().mo4847a(f6378a, "Unable to check ActivityThread for processName", th);
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7983b(Context context, C2895a c2895a) {
        String strM7982a = m7982a(context);
        return !TextUtils.isEmpty(c2895a.m14482c()) ? TextUtils.equals(strM7982a, c2895a.m14482c()) : TextUtils.equals(strM7982a, context.getApplicationInfo().processName);
    }
}
