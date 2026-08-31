package p026D0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: D0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0175f {

    /* JADX INFO: renamed from: a */
    public static final C0175f f819a = new C0175f();

    private C0175f() {
    }

    /* JADX INFO: renamed from: a */
    public static final List m876a(Cursor cursor) {
        AbstractC6118n.m27187e(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        AbstractC6118n.m27184b(notificationUris);
        return notificationUris;
    }

    /* JADX INFO: renamed from: b */
    public static final void m877b(Cursor cursor, ContentResolver cr, List uris) {
        AbstractC6118n.m27187e(cursor, "cursor");
        AbstractC6118n.m27187e(cr, "cr");
        AbstractC6118n.m27187e(uris, "uris");
        cursor.setNotificationUris(cr, uris);
    }
}
