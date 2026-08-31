package p034E0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p026D0.C0171b;
import p026D0.C0173d;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0177h;
import p042F0.C0402a;
import p145S5.AbstractC1430h;
import p145S5.InterfaceC1429g;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: E0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0275d implements InterfaceC0177h {

    /* JADX INFO: renamed from: s */
    public static final a f1018s = new a(null);

    /* JADX INFO: renamed from: a */
    private final Context f1019a;

    /* JADX INFO: renamed from: b */
    private final String f1020b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0177h.a f1021c;

    /* JADX INFO: renamed from: d */
    private final boolean f1022d;

    /* JADX INFO: renamed from: e */
    private final boolean f1023e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1429g f1024f;

    /* JADX INFO: renamed from: r */
    private boolean f1025r;

    /* JADX INFO: renamed from: E0.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0.d$b */
    static final class b {

        /* JADX INFO: renamed from: a */
        private C0274c f1026a;

        public b(C0274c c0274c) {
            this.f1026a = c0274c;
        }

        /* JADX INFO: renamed from: a */
        public final C0274c m1292a() {
            return this.f1026a;
        }

        /* JADX INFO: renamed from: b */
        public final void m1293b(C0274c c0274c) {
            this.f1026a = c0274c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0.d$c */
    static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: s */
        public static final C7625c f1027s = new C7625c(null);

        /* JADX INFO: renamed from: a */
        private final Context f1028a;

        /* JADX INFO: renamed from: b */
        private final b f1029b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC0177h.a f1030c;

        /* JADX INFO: renamed from: d */
        private final boolean f1031d;

        /* JADX INFO: renamed from: e */
        private boolean f1032e;

        /* JADX INFO: renamed from: f */
        private final C0402a f1033f;

        /* JADX INFO: renamed from: r */
        private boolean f1034r;

        /* JADX INFO: renamed from: E0.d$c$a */
        private static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a */
            private final b f1035a;

            /* JADX INFO: renamed from: b */
            private final Throwable f1036b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                AbstractC6118n.m27187e(callbackName, "callbackName");
                AbstractC6118n.m27187e(cause, "cause");
                this.f1035a = callbackName;
                this.f1036b = cause;
            }

            /* JADX INFO: renamed from: a */
            public final b m1300a() {
                return this.f1035a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f1036b;
            }
        }

        /* JADX INFO: renamed from: E0.d$c$b */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: E0.d$c$c, reason: collision with other inner class name */
        public static final class C7625c {
            public /* synthetic */ C7625c(AbstractC6112h abstractC6112h) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final C0274c m1302a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                AbstractC6118n.m27187e(refHolder, "refHolder");
                AbstractC6118n.m27187e(sqLiteDatabase, "sqLiteDatabase");
                C0274c c0274cM1292a = refHolder.m1292a();
                if (c0274cM1292a != null && c0274cM1292a.m1282n(sqLiteDatabase)) {
                    return c0274cM1292a;
                }
                C0274c c0274c = new C0274c(sqLiteDatabase);
                refHolder.m1293b(c0274c);
                return c0274c;
            }

            private C7625c() {
            }
        }

        /* JADX INFO: renamed from: E0.d$c$d */
        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f1043a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f1043a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final InterfaceC0177h.a callback, boolean z7) {
            String string;
            super(context, str, null, callback.f821a, new DatabaseErrorHandler() { // from class: E0.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C0275d.c.m1297m(callback, dbRef, sQLiteDatabase);
                }
            });
            AbstractC6118n.m27187e(context, "context");
            AbstractC6118n.m27187e(dbRef, "dbRef");
            AbstractC6118n.m27187e(callback, "callback");
            this.f1028a = context;
            this.f1029b = dbRef;
            this.f1030c = callback;
            this.f1031d = z7;
            if (str == null) {
                string = UUID.randomUUID().toString();
                AbstractC6118n.m27186d(string, "randomUUID().toString()");
            } else {
                string = str;
            }
            this.f1033f = new C0402a(string, context.getCacheDir(), false);
        }

        /* JADX INFO: renamed from: J */
        private final SQLiteDatabase m1294J(boolean z7) {
            if (z7) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                AbstractC6118n.m27186d(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            AbstractC6118n.m27186d(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* JADX INFO: renamed from: Q */
        private final SQLiteDatabase m1295Q(boolean z7) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z8 = this.f1034r;
            if (databaseName != null && !z8 && (parentFile = this.f1028a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return m1294J(z7);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return m1294J(z7);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i7 = d.f1043a[aVar.m1300a().ordinal()];
                        if (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f1031d) {
                        throw th;
                    }
                    this.f1028a.deleteDatabase(databaseName);
                    try {
                        return m1294J(z7);
                    } catch (a e7) {
                        throw e7.getCause();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public static final void m1297m(InterfaceC0177h.a callback, b dbRef, SQLiteDatabase dbObj) {
            AbstractC6118n.m27187e(callback, "$callback");
            AbstractC6118n.m27187e(dbRef, "$dbRef");
            C7625c c7625c = f1027s;
            AbstractC6118n.m27186d(dbObj, "dbObj");
            callback.m895c(c7625c.m1302a(dbRef, dbObj));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C0402a.m1727c(this.f1033f, false, 1, null);
                super.close();
                this.f1029b.m1293b(null);
                this.f1034r = false;
            } finally {
                this.f1033f.m1729d();
            }
        }

        /* JADX INFO: renamed from: n */
        public final InterfaceC0176g m1298n(boolean z7) {
            InterfaceC0176g interfaceC0176gM1299x;
            try {
                this.f1033f.m1728b((this.f1034r || getDatabaseName() == null) ? false : true);
                this.f1032e = false;
                SQLiteDatabase sQLiteDatabaseM1295Q = m1295Q(z7);
                if (this.f1032e) {
                    close();
                    interfaceC0176gM1299x = m1298n(z7);
                } else {
                    interfaceC0176gM1299x = m1299x(sQLiteDatabaseM1295Q);
                }
                return interfaceC0176gM1299x;
            } finally {
                this.f1033f.m1729d();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db) {
            AbstractC6118n.m27187e(db, "db");
            if (!this.f1032e && this.f1030c.f821a != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                this.f1030c.mo894b(m1299x(db));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            AbstractC6118n.m27187e(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f1030c.mo896d(m1299x(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db, int i7, int i8) {
            AbstractC6118n.m27187e(db, "db");
            this.f1032e = true;
            try {
                this.f1030c.mo897e(m1299x(db), i7, i8);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db) {
            AbstractC6118n.m27187e(db, "db");
            if (!this.f1032e) {
                try {
                    this.f1030c.mo898f(m1299x(db));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f1034r = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i7, int i8) {
            AbstractC6118n.m27187e(sqLiteDatabase, "sqLiteDatabase");
            this.f1032e = true;
            try {
                this.f1030c.mo899g(m1299x(sqLiteDatabase), i7, i8);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }

        /* JADX INFO: renamed from: x */
        public final C0274c m1299x(SQLiteDatabase sqLiteDatabase) {
            AbstractC6118n.m27187e(sqLiteDatabase, "sqLiteDatabase");
            return f1027s.m1302a(this.f1029b, sqLiteDatabase);
        }
    }

    /* JADX INFO: renamed from: E0.d$d */
    static final class d extends AbstractC6119o implements InterfaceC5356a {
        d() {
            super(0);
        }

        @Override // p238e6.InterfaceC5356a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (C0275d.this.f1020b == null || !C0275d.this.f1022d) {
                cVar = new c(C0275d.this.f1019a, C0275d.this.f1020b, new b(null), C0275d.this.f1021c, C0275d.this.f1023e);
            } else {
                cVar = new c(C0275d.this.f1019a, new File(C0173d.m874a(C0275d.this.f1019a), C0275d.this.f1020b).getAbsolutePath(), new b(null), C0275d.this.f1021c, C0275d.this.f1023e);
            }
            C0171b.m871d(cVar, C0275d.this.f1025r);
            return cVar;
        }
    }

    public C0275d(Context context, String str, InterfaceC0177h.a callback, boolean z7, boolean z8) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(callback, "callback");
        this.f1019a = context;
        this.f1020b = str;
        this.f1021c = callback;
        this.f1022d = z7;
        this.f1023e = z8;
        this.f1024f = AbstractC1430h.m6066b(new d());
    }

    /* JADX INFO: renamed from: d0 */
    private final c m1288d0() {
        return (c) this.f1024f.getValue();
    }

    @Override // p026D0.InterfaceC0177h
    /* JADX INFO: renamed from: Y */
    public InterfaceC0176g mo892Y() {
        return m1288d0().m1298n(true);
    }

    @Override // p026D0.InterfaceC0177h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f1024f.mo6064d()) {
            m1288d0().close();
        }
    }

    @Override // p026D0.InterfaceC0177h
    public String getDatabaseName() {
        return this.f1020b;
    }

    @Override // p026D0.InterfaceC0177h
    public void setWriteAheadLoggingEnabled(boolean z7) {
        if (this.f1024f.mo6064d()) {
            C0171b.m871d(m1288d0(), z7);
        }
        this.f1025r = z7;
    }
}
