package p170W2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: W2.k */
/* JADX INFO: loaded from: classes.dex */
public class C1846k {

    /* JADX INFO: renamed from: c */
    private static C1846k f5997c;

    /* JADX INFO: renamed from: a */
    private final Context f5998a;

    /* JADX INFO: renamed from: b */
    private volatile String f5999b;

    public C1846k(Context context) {
        this.f5998a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static C1846k m7641a(Context context) {
        AbstractC3718s.m18083l(context);
        synchronized (C1846k.class) {
            try {
                if (f5997c == null) {
                    AbstractC1825B.m7578d(context);
                    f5997c = new C1846k(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5997c;
    }

    /* JADX INFO: renamed from: d */
    static final AbstractBinderC1859x m7642d(PackageInfo packageInfo, AbstractBinderC1859x... abstractBinderC1859xArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC1860y binderC1860y = new BinderC1860y(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < abstractBinderC1859xArr.length; i7++) {
                if (abstractBinderC1859xArr[i7].equals(binderC1860y)) {
                    return abstractBinderC1859xArr[i7];
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m7643e(PackageInfo packageInfo, boolean z7) {
        PackageInfo packageInfo2;
        if (!z7) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z7 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z7 ? m7642d(packageInfo2, AbstractC1824A.f5942a) : m7642d(packageInfo2, AbstractC1824A.f5942a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private final C1834K m7644f(String str, boolean z7, boolean z8) {
        C1834K c1834kM7588c;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C1834K.m7588c("null pkg");
        }
        if (str.equals(this.f5999b)) {
            return C1834K.m7587b();
        }
        if (AbstractC1825B.m7579e()) {
            c1834kM7588c = AbstractC1825B.m7576b(str, AbstractC1845j.m7634f(this.f5998a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f5998a.getPackageManager().getPackageInfo(str, 64);
                boolean zM7634f = AbstractC1845j.m7634f(this.f5998a);
                if (packageInfo == null) {
                    c1834kM7588c = C1834K.m7588c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        c1834kM7588c = C1834K.m7588c("single cert required");
                    } else {
                        BinderC1860y binderC1860y = new BinderC1860y(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        C1834K c1834kM7575a = AbstractC1825B.m7575a(str2, binderC1860y, zM7634f, false);
                        c1834kM7588c = (!c1834kM7575a.f5966a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !AbstractC1825B.m7575a(str2, binderC1860y, false, true).f5966a) ? c1834kM7575a : C1834K.m7588c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e7) {
                return C1834K.m7589d("no pkg ".concat(str), e7);
            }
        }
        if (c1834kM7588c.f5966a) {
            this.f5999b = str;
        }
        return c1834kM7588c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m7645b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m7643e(packageInfo, false)) {
            return true;
        }
        if (m7643e(packageInfo, true)) {
            if (AbstractC1845j.m7634f(this.f5998a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m7646c(int i7) {
        C1834K c1834kM7588c;
        String[] packagesForUid = this.f5998a.getPackageManager().getPackagesForUid(i7);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            c1834kM7588c = C1834K.m7588c("no pkgs");
        } else {
            c1834kM7588c = null;
            for (String str : packagesForUid) {
                c1834kM7588c = m7644f(str, false, false);
                if (!c1834kM7588c.f5966a) {
                }
            }
            AbstractC3718s.m18083l(c1834kM7588c);
        }
        c1834kM7588c.m7592e();
        return c1834kM7588c.f5966a;
    }
}
