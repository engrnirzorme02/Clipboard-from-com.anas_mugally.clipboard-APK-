package p329q;

import android.app.KeyguardManager;
import android.content.Context;

/* JADX INFO: renamed from: q.m */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC6793m {

    /* JADX INFO: renamed from: q.m$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static KeyguardManager m29836a(Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        /* JADX INFO: renamed from: b */
        static boolean m29837b(KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    /* JADX INFO: renamed from: a */
    static KeyguardManager m29834a(Context context) {
        return a.m29836a(context);
    }

    /* JADX INFO: renamed from: b */
    static boolean m29835b(Context context) {
        KeyguardManager keyguardManagerM29834a = m29834a(context);
        if (keyguardManagerM29834a == null) {
            return false;
        }
        return a.m29837b(keyguardManagerM29834a);
    }
}
