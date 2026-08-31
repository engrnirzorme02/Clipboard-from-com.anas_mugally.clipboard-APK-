package p227d3;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.AbstractC3760o;
import p104N.C0906c;

/* JADX INFO: renamed from: d3.c */
/* JADX INFO: loaded from: classes.dex */
public class C5227c {

    /* JADX INFO: renamed from: a */
    protected final Context f19949a;

    public C5227c(Context context) {
        this.f19949a = context;
    }

    /* JADX INFO: renamed from: a */
    public int m24147a(String str) {
        return this.f19949a.checkCallingOrSelfPermission(str);
    }

    /* JADX INFO: renamed from: b */
    public int m24148b(String str, String str2) {
        return this.f19949a.getPackageManager().checkPermission(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public ApplicationInfo m24149c(String str, int i7) {
        return this.f19949a.getPackageManager().getApplicationInfo(str, i7);
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m24150d(String str) {
        Context context = this.f19949a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    /* JADX INFO: renamed from: e */
    public C0906c m24151e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f19949a.getPackageManager().getApplicationInfo(str, 0);
        return C0906c.m4129a(this.f19949a.getPackageManager().getApplicationLabel(applicationInfo), this.f19949a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    /* JADX INFO: renamed from: f */
    public PackageInfo m24152f(String str, int i7) {
        return this.f19949a.getPackageManager().getPackageInfo(str, i7);
    }

    /* JADX INFO: renamed from: g */
    public boolean m24153g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC5226b.m24146a(this.f19949a);
        }
        if (!AbstractC3760o.m18199g() || (nameForUid = this.f19949a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f19949a.getPackageManager().isInstantApp(nameForUid);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m24154h(int i7, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f19949a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i7, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
