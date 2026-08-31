package p252g4;

import android.content.Context;

/* JADX INFO: renamed from: g4.J */
/* JADX INFO: loaded from: classes.dex */
class C5472J {

    /* JADX INFO: renamed from: a */
    private String f20806a;

    C5472J() {
    }

    /* JADX INFO: renamed from: b */
    private static String m24717b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* JADX INFO: renamed from: a */
    synchronized String m24718a(Context context) {
        try {
            if (this.f20806a == null) {
                this.f20806a = m24717b(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return "".equals(this.f20806a) ? null : this.f20806a;
    }
}
