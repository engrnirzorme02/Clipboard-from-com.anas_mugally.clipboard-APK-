package p081K;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: renamed from: K.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0724p {

    /* JADX INFO: renamed from: K.p$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static boolean m3489a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3488a(Context context) {
        return a.m3489a(context);
    }
}
