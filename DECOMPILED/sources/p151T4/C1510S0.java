package p151T4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p123P4.C1229i;
import p158U4.C1682f;
import p186Y4.AbstractC2032B;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p186Y4.InterfaceC2043k;
import p186Y4.InterfaceC2047o;
import p186Y4.InterfaceC2052t;

/* JADX INFO: renamed from: T4.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1510S0 extends AbstractC1521Y {

    /* JADX INFO: renamed from: c */
    private final c f5128c;

    /* JADX INFO: renamed from: d */
    private final C1570p f5129d;

    /* JADX INFO: renamed from: e */
    private final C1599y1 f5130e;

    /* JADX INFO: renamed from: f */
    private final C1544g0 f5131f;

    /* JADX INFO: renamed from: g */
    private final C1522Y0 f5132g;

    /* JADX INFO: renamed from: h */
    private final C1476B0 f5133h;

    /* JADX INFO: renamed from: i */
    private final SQLiteTransactionListener f5134i;

    /* JADX INFO: renamed from: j */
    private SQLiteDatabase f5135j;

    /* JADX INFO: renamed from: k */
    private boolean f5136k;

    /* JADX INFO: renamed from: T4.S0$a */
    class a implements SQLiteTransactionListener {
        a() {
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onBegin() {
            C1510S0.this.f5133h.mo6198i();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onCommit() {
            C1510S0.this.f5133h.mo6195f();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onRollback() {
        }
    }

    /* JADX INFO: renamed from: T4.S0$c */
    static class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a */
        private final C1570p f5144a;

        /* JADX INFO: renamed from: b */
        private boolean f5145b;

        /* synthetic */ c(Context context, C1570p c1570p, String str, a aVar) {
            this(context, c1570p, str);
        }

        /* JADX INFO: renamed from: d */
        private void m6342d(SQLiteDatabase sQLiteDatabase) {
            if (this.f5145b) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f5145b = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m6342d(sQLiteDatabase);
            new C1581s1(sQLiteDatabase, this.f5144a).m6516U(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            m6342d(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            m6342d(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            m6342d(sQLiteDatabase);
            new C1581s1(sQLiteDatabase, this.f5144a).m6516U(i7);
        }

        private c(Context context, C1570p c1570p, String str) {
            this(context, c1570p, str, 18);
        }

        c(Context context, C1570p c1570p, String str, int i7) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i7);
            this.f5144a = c1570p;
        }
    }

    /* JADX INFO: renamed from: T4.S0$d */
    static class d {

        /* JADX INFO: renamed from: a */
        private final SQLiteDatabase f5146a;

        /* JADX INFO: renamed from: b */
        private final String f5147b;

        /* JADX INFO: renamed from: c */
        private SQLiteDatabase.CursorFactory f5148c;

        d(SQLiteDatabase sQLiteDatabase, String str) {
            this.f5146a = sQLiteDatabase;
            this.f5147b = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Cursor m6343a(Object[] objArr, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            C1510S0.m6326r(sQLiteQuery, objArr);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        /* JADX INFO: renamed from: g */
        private Cursor m6344g() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f5148c;
            return cursorFactory != null ? this.f5146a.rawQueryWithFactory(cursorFactory, this.f5147b, null, null) : this.f5146a.rawQuery(this.f5147b, null);
        }

        /* JADX INFO: renamed from: b */
        d m6345b(final Object... objArr) {
            this.f5148c = new SQLiteDatabase.CursorFactory() { // from class: T4.T0
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return C1510S0.d.m6343a(objArr, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
            return this;
        }

        /* JADX INFO: renamed from: c */
        int m6346c(InterfaceC2043k interfaceC2043k) {
            Cursor cursorM6344g = m6344g();
            try {
                if (!cursorM6344g.moveToFirst()) {
                    cursorM6344g.close();
                    return 0;
                }
                interfaceC2043k.accept(cursorM6344g);
                cursorM6344g.close();
                return 1;
            } catch (Throwable th) {
                if (cursorM6344g != null) {
                    try {
                        cursorM6344g.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: d */
        Object m6347d(InterfaceC2047o interfaceC2047o) {
            Cursor cursorM6344g = m6344g();
            try {
                if (!cursorM6344g.moveToFirst()) {
                    cursorM6344g.close();
                    return null;
                }
                Object objApply = interfaceC2047o.apply(cursorM6344g);
                cursorM6344g.close();
                return objApply;
            } catch (Throwable th) {
                if (cursorM6344g != null) {
                    try {
                        cursorM6344g.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: e */
        int m6348e(InterfaceC2043k interfaceC2043k) {
            Cursor cursorM6344g = m6344g();
            int i7 = 0;
            while (cursorM6344g.moveToNext()) {
                try {
                    i7++;
                    interfaceC2043k.accept(cursorM6344g);
                } catch (Throwable th) {
                    if (cursorM6344g != null) {
                        try {
                            cursorM6344g.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorM6344g.close();
            return i7;
        }

        /* JADX INFO: renamed from: f */
        boolean m6349f() {
            Cursor cursorM6344g = m6344g();
            try {
                boolean z7 = !cursorM6344g.moveToFirst();
                cursorM6344g.close();
                return z7;
            } catch (Throwable th) {
                if (cursorM6344g != null) {
                    try {
                        cursorM6344g.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public C1510S0(Context context, String str, C1682f c1682f, C1570p c1570p, C1486G.b bVar) {
        this(c1570p, bVar, new c(context, c1570p, m6327s(str, c1682f), (a) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static void m6326r(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i7 = 0; i7 < objArr.length; i7++) {
            Object obj = objArr[i7];
            if (obj == null) {
                sQLiteProgram.bindNull(i7 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i7 + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i7 + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i7 + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i7 + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    throw AbstractC2034b.m8457a("Unknown argument %s of type %s", obj, obj.getClass());
                }
                sQLiteProgram.bindBlob(i7 + 1, (byte[]) obj);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m6327s(String str, C1682f c1682f) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(c1682f.m7070k(), "utf-8") + "." + URLEncoder.encode(c1682f.m7069j(), "utf-8");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    /* JADX INFO: renamed from: w */
    private long m6328w() {
        return ((Long) m6331B("PRAGMA page_count").m6347d(new InterfaceC2047o() { // from class: T4.Q0
            @Override // p186Y4.InterfaceC2047o
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        })).longValue();
    }

    /* JADX INFO: renamed from: x */
    private long m6329x() {
        return ((Long) m6331B("PRAGMA page_size").m6347d(new InterfaceC2047o() { // from class: T4.R0
            @Override // p186Y4.InterfaceC2047o
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        })).longValue();
    }

    /* JADX INFO: renamed from: A */
    SQLiteStatement m6330A(String str) {
        return this.f5135j.compileStatement(str);
    }

    /* JADX INFO: renamed from: B */
    d m6331B(String str) {
        return new d(this.f5135j, str);
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: a */
    InterfaceC1525a mo6305a() {
        return this.f5131f;
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: b */
    InterfaceC1528b mo6306b(C1229i c1229i) {
        return new C1565n0(this, this.f5129d, c1229i);
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: c */
    InterfaceC1543g mo6307c() {
        return new C1568o0(this);
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: d */
    InterfaceC1561m mo6308d(C1229i c1229i) {
        return new C1595x0(this, this.f5129d, c1229i);
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: e */
    InterfaceC1515V mo6309e(C1229i c1229i, InterfaceC1561m interfaceC1561m) {
        return new C1497L0(this, this.f5129d, c1229i, interfaceC1561m);
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: f */
    InterfaceC1517W mo6310f() {
        return new C1505P0(this);
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: h */
    InterfaceC1541f0 mo6312h() {
        return this.f5132g;
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: j */
    public boolean mo6314j() {
        return this.f5136k;
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: k */
    Object mo6315k(String str, InterfaceC2052t interfaceC2052t) {
        AbstractC2049q.m8502a(AbstractC1521Y.f5181a, "Starting transaction: %s", str);
        this.f5135j.beginTransactionWithListener(this.f5134i);
        try {
            Object obj = interfaceC2052t.get();
            this.f5135j.setTransactionSuccessful();
            return obj;
        } finally {
            this.f5135j.endTransaction();
        }
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: l */
    void mo6316l(String str, Runnable runnable) {
        AbstractC2049q.m8502a(AbstractC1521Y.f5181a, "Starting transaction: %s", str);
        this.f5135j.beginTransactionWithListener(this.f5134i);
        try {
            runnable.run();
            this.f5135j.setTransactionSuccessful();
        } finally {
            this.f5135j.endTransaction();
        }
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: m */
    public void mo6317m() {
        AbstractC2034b.m8460d(!this.f5136k, "SQLitePersistence double-started!", new Object[0]);
        this.f5136k = true;
        try {
            this.f5135j = this.f5128c.getWritableDatabase();
            this.f5130e.m6562w();
            this.f5133h.m6206w(this.f5130e.m6558q());
        } catch (SQLiteDatabaseLockedException e7) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e7);
        }
    }

    /* JADX INFO: renamed from: t */
    int m6332t(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        m6326r(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    /* JADX INFO: renamed from: u */
    void m6333u(String str, Object... objArr) {
        this.f5135j.execSQL(str, objArr);
    }

    /* JADX INFO: renamed from: v */
    long m6334v() {
        return m6328w() * m6329x();
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C1476B0 mo6311g() {
        return this.f5133h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C1599y1 mo6313i() {
        return this.f5130e;
    }

    public C1510S0(C1570p c1570p, C1486G.b bVar, c cVar) {
        this.f5134i = new a();
        this.f5128c = cVar;
        this.f5129d = c1570p;
        this.f5130e = new C1599y1(this, c1570p);
        this.f5131f = new C1544g0(this, c1570p);
        this.f5132g = new C1522Y0(this, c1570p);
        this.f5133h = new C1476B0(this, bVar);
    }

    /* JADX INFO: renamed from: T4.S0$b */
    static class b {

        /* JADX INFO: renamed from: a */
        private final C1510S0 f5138a;

        /* JADX INFO: renamed from: b */
        private final String f5139b;

        /* JADX INFO: renamed from: c */
        private final String f5140c;

        /* JADX INFO: renamed from: d */
        private final List f5141d;

        /* JADX INFO: renamed from: e */
        private int f5142e;

        /* JADX INFO: renamed from: f */
        private final Iterator f5143f;

        b(C1510S0 c1510s0, String str, List list, String str2) {
            this.f5142e = 0;
            this.f5138a = c1510s0;
            this.f5139b = str;
            this.f5141d = Collections.EMPTY_LIST;
            this.f5140c = str2;
            this.f5143f = list.iterator();
        }

        /* JADX INFO: renamed from: b */
        private Object[] m6337b() {
            ArrayList arrayList = new ArrayList(this.f5141d);
            for (int i7 = 0; this.f5143f.hasNext() && i7 < 900 - this.f5141d.size(); i7++) {
                arrayList.add(this.f5143f.next());
            }
            return arrayList.toArray();
        }

        /* JADX INFO: renamed from: a */
        void m6338a() {
            this.f5142e++;
            Object[] objArrM6337b = m6337b();
            this.f5138a.m6333u(this.f5139b + ((Object) AbstractC2032B.m8454s("?", objArrM6337b.length, ", ")) + this.f5140c, objArrM6337b);
        }

        /* JADX INFO: renamed from: c */
        int m6339c() {
            return this.f5142e;
        }

        /* JADX INFO: renamed from: d */
        boolean m6340d() {
            return this.f5143f.hasNext();
        }

        /* JADX INFO: renamed from: e */
        d m6341e() {
            this.f5142e++;
            Object[] objArrM6337b = m6337b();
            return this.f5138a.m6331B(this.f5139b + ((Object) AbstractC2032B.m8454s("?", objArrM6337b.length, ", ")) + this.f5140c).m6345b(objArrM6337b);
        }

        b(C1510S0 c1510s0, String str, List list, List list2, String str2) {
            this.f5142e = 0;
            this.f5138a = c1510s0;
            this.f5139b = str;
            this.f5141d = list;
            this.f5140c = str2;
            this.f5143f = list2.iterator();
        }
    }
}
