package p329q;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: q.n */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC6794n {

    /* JADX INFO: renamed from: q.n$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static boolean m29839a(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m29838a(Context context) {
        return (context == null || context.getPackageManager() == null || !a.m29839a(context.getPackageManager())) ? false : true;
    }
}
