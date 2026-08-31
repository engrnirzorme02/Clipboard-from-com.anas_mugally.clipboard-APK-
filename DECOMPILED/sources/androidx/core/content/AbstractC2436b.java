package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.concurrent.Executor;
import p017C.AbstractC0107h;
import p017C.C0114o;
import p025D.AbstractC0165h;
import p081K.AbstractC0714f;
import p081K.AbstractC0716h;
import p081K.C0718j;
import p104N.AbstractC0905b;

/* JADX INFO: renamed from: androidx.core.content.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2436b {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    /* JADX INFO: renamed from: androidx.core.content.b$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static File m10579a(Context context) {
            return context.getCodeCacheDir();
        }

        /* JADX INFO: renamed from: b */
        static Drawable m10580b(Context context, int i7) {
            return context.getDrawable(i7);
        }

        /* JADX INFO: renamed from: c */
        static File m10581c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static int m10582a(Context context, int i7) {
            return context.getColor(i7);
        }

        /* JADX INFO: renamed from: b */
        static Object m10583b(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        /* JADX INFO: renamed from: c */
        static String m10584c(Context context, Class cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static Context m10585a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* JADX INFO: renamed from: b */
        static File m10586b(Context context) {
            return context.getDataDir();
        }

        /* JADX INFO: renamed from: c */
        static boolean m10587c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$d */
    static class d {
        /* JADX INFO: renamed from: a */
        static Intent m10588a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
            return ((i7 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, AbstractC2436b.obtainAndCheckReceiverPermission(context), handler);
        }

        /* JADX INFO: renamed from: b */
        static ComponentName m10589b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$e */
    static class e {
        /* JADX INFO: renamed from: a */
        static Executor m10590a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$f */
    static class f {
        /* JADX INFO: renamed from: a */
        static Context m10591a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        /* JADX INFO: renamed from: b */
        static String m10592b(Context context) {
            return context.getAttributionTag();
        }

        /* JADX INFO: renamed from: c */
        static Display m10593c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(AbstractC2436b.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$g */
    static class g {
        /* JADX INFO: renamed from: a */
        static Intent m10594a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7);
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        AbstractC0905b.m4128d(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return C0114o.m540b(context).m544a() ? 0 : -1;
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? f.m10591a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return c.m10585a(context);
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.m10592b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return a.m10579a(context);
    }

    public static int getColor(Context context, int i7) {
        return b.m10582a(context, i7);
    }

    public static ColorStateList getColorStateList(Context context, int i7) {
        return AbstractC0165h.m812d(context.getResources(), i7, context.getTheme());
    }

    public static Context getContextForLanguage(Context context) {
        C0718j c0718jM421a = AbstractC0107h.m421a(context);
        if (Build.VERSION.SDK_INT > 32 || c0718jM421a.m3476e()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        AbstractC0714f.m3465b(configuration, c0718jM421a);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        return c.m10586b(context);
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? f.m10593c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i7) {
        return a.m10580b(context, i7);
    }

    @Deprecated
    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.m10590a(context) : AbstractC0716h.m3468a(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return a.m10581c(context);
    }

    @Deprecated
    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i7) {
        return getContextForLanguage(context).getString(i7);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) b.m10583b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return b.m10584c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return c.m10587c(context);
    }

    static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getApplicationContext().getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (AbstractC2439e.m10600b(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
            if (AbstractC2439e.m10600b(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i7) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i7);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @Deprecated
    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        d.m10589b(context, intent);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
        int i8 = i7 & 1;
        if (i8 != 0 && (i7 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i8 != 0) {
            i7 |= 2;
        }
        int i9 = i7;
        int i10 = i9 & 2;
        if (i10 == 0 && (i9 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i10 == 0 || (i9 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? g.m10594a(context, broadcastReceiver, intentFilter, str, handler, i9) : d.m10588a(context, broadcastReceiver, intentFilter, str, handler, i9);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
