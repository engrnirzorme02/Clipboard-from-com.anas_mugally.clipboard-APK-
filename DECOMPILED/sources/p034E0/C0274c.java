package p034E0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p026D0.C0170a;
import p026D0.C0171b;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0179j;
import p026D0.InterfaceC0180k;
import p238e6.InterfaceC5373r;

/* JADX INFO: renamed from: E0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0274c implements InterfaceC0176g {

    /* JADX INFO: renamed from: b */
    public static final a f1013b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final String[] f1014c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d */
    private static final String[] f1015d = new String[0];

    /* JADX INFO: renamed from: a */
    private final SQLiteDatabase f1016a;

    /* JADX INFO: renamed from: E0.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: E0.c$b */
    static final class b extends AbstractC6119o implements InterfaceC5373r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC0179j f1017a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC0179j interfaceC0179j) {
            super(4);
            this.f1017a = interfaceC0179j;
        }

        @Override // p238e6.InterfaceC5373r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor mo1284y(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            InterfaceC0179j interfaceC0179j = this.f1017a;
            AbstractC6118n.m27184b(sQLiteQuery);
            interfaceC0179j.mo864d(new C0278g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C0274c(SQLiteDatabase delegate) {
        AbstractC6118n.m27187e(delegate, "delegate");
        this.f1016a = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final Cursor m1278J(InterfaceC0179j query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC6118n.m27187e(query, "$query");
        AbstractC6118n.m27184b(sQLiteQuery);
        query.mo864d(new C0278g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Cursor m1281x(InterfaceC5373r tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC6118n.m27187e(tmp0, "$tmp0");
        return (Cursor) tmp0.mo1284y(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: A0 */
    public Cursor mo878A0(final InterfaceC0179j query, CancellationSignal cancellationSignal) {
        AbstractC6118n.m27187e(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f1016a;
        String strMo865m = query.mo865m();
        String[] strArr = f1015d;
        AbstractC6118n.m27184b(cancellationSignal);
        return C0171b.m870c(sQLiteDatabase, strMo865m, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: E0.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return C0274c.m1278J(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: S */
    public void mo879S(String sql, Object[] bindArgs) {
        AbstractC6118n.m27187e(sql, "sql");
        AbstractC6118n.m27187e(bindArgs, "bindArgs");
        this.f1016a.execSQL(sql, bindArgs);
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: T */
    public void mo880T() {
        this.f1016a.beginTransactionNonExclusive();
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: a0 */
    public Cursor mo881a0(String query) {
        AbstractC6118n.m27187e(query, "query");
        return mo884i0(new C0170a(query));
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: c */
    public void mo882c() {
        this.f1016a.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1016a.close();
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: h */
    public void mo883h() {
        this.f1016a.setTransactionSuccessful();
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: i0 */
    public Cursor mo884i0(InterfaceC0179j query) {
        AbstractC6118n.m27187e(query, "query");
        final b bVar = new b(query);
        Cursor cursorRawQueryWithFactory = this.f1016a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: E0.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return C0274c.m1281x(bVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.mo865m(), f1015d, null);
        AbstractC6118n.m27186d(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // p026D0.InterfaceC0176g
    public boolean isOpen() {
        return this.f1016a.isOpen();
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: j */
    public void mo885j() {
        this.f1016a.endTransaction();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1282n(SQLiteDatabase sqLiteDatabase) {
        AbstractC6118n.m27187e(sqLiteDatabase, "sqLiteDatabase");
        return AbstractC6118n.m27183a(this.f1016a, sqLiteDatabase);
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: q */
    public List mo886q() {
        return this.f1016a.getAttachedDbs();
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: q0 */
    public String mo887q0() {
        return this.f1016a.getPath();
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: s */
    public void mo888s(String sql) {
        AbstractC6118n.m27187e(sql, "sql");
        this.f1016a.execSQL(sql);
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: t0 */
    public boolean mo889t0() {
        return this.f1016a.inTransaction();
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: y0 */
    public boolean mo890y0() {
        return C0171b.m869b(this.f1016a);
    }

    @Override // p026D0.InterfaceC0176g
    /* JADX INFO: renamed from: z */
    public InterfaceC0180k mo891z(String sql) {
        AbstractC6118n.m27187e(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f1016a.compileStatement(sql);
        AbstractC6118n.m27186d(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new C0279h(sQLiteStatementCompileStatement);
    }
}
