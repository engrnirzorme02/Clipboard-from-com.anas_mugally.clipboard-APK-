package p026D0;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: D0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0172c {

    /* JADX INFO: renamed from: a */
    public static final C0172c f816a = new C0172c();

    private C0172c() {
    }

    /* JADX INFO: renamed from: a */
    public static final Uri m872a(Cursor cursor) {
        AbstractC6118n.m27187e(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        AbstractC6118n.m27186d(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m873b(ActivityManager activityManager) {
        AbstractC6118n.m27187e(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
