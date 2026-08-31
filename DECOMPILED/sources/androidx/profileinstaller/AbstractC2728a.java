package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* JADX INFO: renamed from: androidx.profileinstaller.a */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2728a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static File m12853a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.a$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        static Context m12854a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m12851a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z7 = true;
        for (File file2 : fileArrListFiles) {
            z7 = m12851a(file2) && z7;
        }
        return z7;
    }

    /* JADX INFO: renamed from: b */
    static void m12852b(Context context, ProfileInstallReceiver.C2725a c2725a) {
        if (m12851a(Build.VERSION.SDK_INT >= 34 ? b.m12854a(context).getCacheDir() : a.m12853a(b.m12854a(context)))) {
            c2725a.mo12843b(14, null);
        } else {
            c2725a.mo12843b(15, null);
        }
    }
}
