package p026D0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: D0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0171b {

    /* JADX INFO: renamed from: a */
    public static final C0171b f815a = new C0171b();

    private C0171b() {
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m868a(File file) {
        AbstractC6118n.m27187e(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m869b(SQLiteDatabase sQLiteDatabase) {
        AbstractC6118n.m27187e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    /* JADX INFO: renamed from: c */
    public static final Cursor m870c(SQLiteDatabase sQLiteDatabase, String sql, String[] selectionArgs, String str, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        AbstractC6118n.m27187e(sQLiteDatabase, "sQLiteDatabase");
        AbstractC6118n.m27187e(sql, "sql");
        AbstractC6118n.m27187e(selectionArgs, "selectionArgs");
        AbstractC6118n.m27187e(cancellationSignal, "cancellationSignal");
        AbstractC6118n.m27187e(cursorFactory, "cursorFactory");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
        AbstractC6118n.m27186d(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    /* JADX INFO: renamed from: d */
    public static final void m871d(SQLiteOpenHelper sQLiteOpenHelper, boolean z7) {
        AbstractC6118n.m27187e(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z7);
    }
}
