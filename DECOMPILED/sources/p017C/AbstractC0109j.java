package p017C;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: C.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0109j {
    /* JADX INFO: renamed from: a */
    public static Intent m425a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strM427c = m427c(activity);
        if (strM427c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM427c);
        try {
            return m428d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM427c + "' in manifest");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Intent m426b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM428d = m428d(context, componentName);
        if (strM428d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM428d);
        return m428d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: c */
    public static String m427c(Activity activity) {
        try {
            return m428d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m428d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: e */
    public static void m429e(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m430f(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
