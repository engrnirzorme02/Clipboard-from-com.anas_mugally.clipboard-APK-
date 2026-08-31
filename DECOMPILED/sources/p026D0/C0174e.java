package p026D0;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: D0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0174e {

    /* JADX INFO: renamed from: a */
    public static final C0174e f818a = new C0174e();

    private C0174e() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m875a(Cursor cursor, Bundle extras) {
        AbstractC6118n.m27187e(cursor, "cursor");
        AbstractC6118n.m27187e(extras, "extras");
        cursor.setExtras(extras);
    }
}
