package p170W2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.internal.AbstractC3687c0;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3754i;
import com.google.android.gms.common.util.AbstractC3766u;
import com.google.android.gms.common.util.AbstractC3768w;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p227d3.C5228d;

/* JADX INFO: renamed from: W2.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1845j {

    /* JADX INFO: renamed from: a */
    public static final int f5992a = 12451000;

    /* JADX INFO: renamed from: c */
    private static boolean f5994c = false;

    /* JADX INFO: renamed from: d */
    static boolean f5995d = false;

    /* JADX INFO: renamed from: b */
    static final AtomicBoolean f5993b = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    private static final AtomicBoolean f5996e = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public static void m7629a(Context context, int i7) throws C1842g, C1843h {
        int iMo7609h = C1841f.m7623f().mo7609h(context, i7);
        if (iMo7609h != 0) {
            Intent intentMo7605b = C1841f.m7623f().mo7605b(context, iMo7609h, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iMo7609h);
            if (intentMo7605b != null) {
                throw new C1843h(iMo7609h, "Google Play Services not available", intentMo7605b);
            }
            throw new C1842g(iMo7609h);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m7630b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m7631c(int i7) {
        return C1837b.m7595Y(i7);
    }

    /* JADX INFO: renamed from: d */
    public static Context m7632d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Resources m7633e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7634f(Context context) {
        try {
            if (!f5995d) {
                PackageInfo packageInfoM24152f = C5228d.m24155a(context).m24152f("com.google.android.gms", 64);
                C1846k.m7641a(context);
                if (packageInfoM24152f == null || C1846k.m7643e(packageInfoM24152f, false) || !C1846k.m7643e(packageInfoM24152f, true)) {
                    f5994c = false;
                } else {
                    f5994c = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
        } finally {
            f5995d = true;
        }
        return f5994c || !AbstractC3754i.m18176e();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0122 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00de, please report this as an issue */
    /* JADX INFO: renamed from: g */
    public static int m7635g(Context context, int i7) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(AbstractC1847l.f6000a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f5996e.get()) {
            int iM18002a = AbstractC3687c0.m18002a(context);
            if (iM18002a == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (iM18002a != f5992a) {
                throw new GooglePlayServicesIncorrectManifestValueException(iM18002a);
            }
        }
        boolean z7 = (AbstractC3754i.m18178g(context) || AbstractC3754i.m18180i(context)) ? false : true;
        AbstractC3718s.m18072a(i7 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z7) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1846k.m7641a(context);
            if (!C1846k.m7643e(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (!z7) {
                    if (z7) {
                    }
                    if (AbstractC3768w.m18215a(packageInfo2.versionCode) < AbstractC3768w.m18215a(i7)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i7 + " but found " + packageInfo2.versionCode);
                    return 2;
                }
                AbstractC3718s.m18083l(packageInfo);
                if (!C1846k.m7643e(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else {
                    if (z7 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        if (AbstractC3768w.m18215a(packageInfo2.versionCode) < AbstractC3768w.m18215a(i7)) {
                            applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e7) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e7);
                                    return 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                return 3;
                            }
                            return 0;
                        }
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i7 + " but found " + packageInfo2.versionCode);
                        return 2;
                    }
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7636h(Context context, int i7) {
        if (i7 == 18) {
            return true;
        }
        if (i7 == 1) {
            return m7640l(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m7637i(Context context) {
        Object systemService = context.getSystemService("user");
        AbstractC3718s.m18083l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m7638j(int i7) {
        return i7 == 1 || i7 == 2 || i7 == 3 || i7 == 9;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m7639k(Context context, int i7, String str) {
        return AbstractC3766u.m18211b(context, i7, str);
    }

    /* JADX INFO: renamed from: l */
    static boolean m7640l(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !m7637i(context);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
    }
}
