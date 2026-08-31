package p151T4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.google.protobuf.C5065C;
import java.util.ArrayList;
import java.util.List;
import p158U4.C1696t;
import p172W4.C1868c;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p186Y4.InterfaceC2043k;
import p186Y4.InterfaceC2047o;

/* JADX INFO: renamed from: T4.s1 */
/* JADX INFO: loaded from: classes.dex */
class C1581s1 {

    /* JADX INFO: renamed from: a */
    private final SQLiteDatabase f5305a;

    /* JADX INFO: renamed from: b */
    private final C1570p f5306b;

    C1581s1(SQLiteDatabase sQLiteDatabase, C1570p c1570p) {
        this.f5305a = sQLiteDatabase;
        this.f5306b = c1570p;
    }

    /* JADX INFO: renamed from: A */
    private void m6468A() {
        m6483Q(new String[]{"data_migrations"}, new Runnable() { // from class: T4.m1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5276a.f5305a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
            }
        });
    }

    /* JADX INFO: renamed from: B */
    private void m6469B() {
        m6483Q(new String[]{"index_configuration", "index_state", "index_entries"}, new Runnable() { // from class: T4.g1
            @Override // java.lang.Runnable
            public final void run() {
                C1581s1.m6505q(this.f5230a);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    private void m6470C() {
        m6483Q(new String[]{"globals"}, new Runnable() { // from class: T4.n1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5282a.f5305a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
            }
        });
    }

    /* JADX INFO: renamed from: D */
    private void m6471D() {
        m6483Q(new String[]{"document_overlays"}, new Runnable() { // from class: T4.c1
            @Override // java.lang.Runnable
            public final void run() {
                C1581s1.m6499k(this.f5217a);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private void m6472E() {
        m6483Q(new String[]{"mutation_queues", "mutations", "document_mutations"}, new Runnable() { // from class: T4.d1
            @Override // java.lang.Runnable
            public final void run() {
                C1581s1.m6502n(this.f5218a);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    private void m6473F() {
        m6483Q(new String[]{"remote_documents"}, new Runnable() { // from class: T4.p1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5292a.f5305a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
            }
        });
    }

    /* JADX INFO: renamed from: G */
    private void m6474G() {
        m6483Q(new String[]{"targets", "target_globals", "target_documents"}, new Runnable() { // from class: T4.h1
            @Override // java.lang.Runnable
            public final void run() {
                C1581s1.m6498j(this.f5233a);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    private void m6475H() {
        m6483Q(new String[]{"collection_parents"}, new Runnable() { // from class: T4.Z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5201a.f5305a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
            }
        });
        final C1498M.a aVar = new C1498M.a();
        final SQLiteStatement sQLiteStatementCompileStatement = this.f5305a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)");
        final InterfaceC2043k interfaceC2043k = new InterfaceC2043k() { // from class: T4.j1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1581s1.m6496h(aVar, sQLiteStatementCompileStatement, (C1696t) obj);
            }
        };
        new C1510S0.d(this.f5305a, "SELECT path FROM remote_documents").m6348e(new InterfaceC2043k() { // from class: T4.k1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                interfaceC2043k.accept((C1696t) AbstractC1540f.m6409b(((Cursor) obj).getString(0)).m7065x());
            }
        });
        new C1510S0.d(this.f5305a, "SELECT path FROM document_mutations").m6348e(new InterfaceC2043k() { // from class: T4.l1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                interfaceC2043k.accept((C1696t) AbstractC1540f.m6409b(((Cursor) obj).getString(0)).m7065x());
            }
        });
    }

    /* JADX INFO: renamed from: I */
    private void m6476I() {
        new C1510S0.d(this.f5305a, "SELECT target_id, target_proto FROM targets").m6348e(new InterfaceC2043k() { // from class: T4.o1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1581s1.m6507s(this.f5288a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    private void m6477J() {
        if (m6488X("targets")) {
            this.f5305a.execSQL("DROP TABLE targets");
        }
        if (m6488X("target_globals")) {
            this.f5305a.execSQL("DROP TABLE target_globals");
        }
        if (m6488X("target_documents")) {
            this.f5305a.execSQL("DROP TABLE target_documents");
        }
    }

    /* JADX INFO: renamed from: K */
    private void m6478K() {
        final boolean[] zArr;
        C1510S0.d dVarM6345b = new C1510S0.d(this.f5305a, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").m6345b(100);
        final SQLiteStatement sQLiteStatementCompileStatement = this.f5305a.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        do {
            zArr = new boolean[]{false};
            dVarM6345b.m6348e(new InterfaceC2043k() { // from class: T4.r1
                @Override // p186Y4.InterfaceC2043k
                public final void accept(Object obj) {
                    C1581s1.m6501m(zArr, sQLiteStatementCompileStatement, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    /* JADX INFO: renamed from: L */
    private void m6479L() {
        this.f5305a.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    /* JADX INFO: renamed from: M */
    private void m6480M() {
        final boolean[] zArr;
        Long l7 = (Long) new C1510S0.d(this.f5305a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").m6347d(new InterfaceC2047o() { // from class: T4.e1
            @Override // p186Y4.InterfaceC2047o
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        });
        AbstractC2034b.m8460d(l7 != null, "Missing highest sequence number", new Object[0]);
        final long jLongValue = l7.longValue();
        final SQLiteStatement sQLiteStatementCompileStatement = this.f5305a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        C1510S0.d dVarM6345b = new C1510S0.d(this.f5305a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").m6345b(100);
        do {
            zArr = new boolean[]{false};
            dVarM6345b.m6348e(new InterfaceC2043k() { // from class: T4.f1
                @Override // p186Y4.InterfaceC2043k
                public final void accept(Object obj) {
                    C1581s1.m6500l(zArr, sQLiteStatementCompileStatement, jLongValue, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    /* JADX INFO: renamed from: N */
    private void m6481N() {
        if (DatabaseUtils.queryNumEntries(this.f5305a, "target_globals") == 1) {
            return;
        }
        this.f5305a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
    }

    /* JADX INFO: renamed from: P */
    private boolean m6482P() {
        boolean zM6487W = m6487W("remote_documents", "read_time_seconds");
        boolean zM6487W2 = m6487W("remote_documents", "read_time_nanos");
        AbstractC2034b.m8460d(zM6487W == zM6487W2, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return zM6487W && zM6487W2;
    }

    /* JADX INFO: renamed from: Q */
    private void m6483Q(String[] strArr, Runnable runnable) {
        String str = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z7 = false;
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str2 = strArr[i7];
            boolean zM6488X = m6488X(str2);
            if (i7 == 0) {
                z7 = zM6488X;
            } else if (zM6488X != z7) {
                String str3 = "Expected all of " + str + " to either exist or not, but ";
                throw new IllegalStateException(z7 ? str3 + strArr[0] + " exists and " + str2 + " does not" : str3 + strArr[0] + " does not exist and " + str2 + " does");
            }
        }
        if (!z7) {
            runnable.run();
            return;
        }
        AbstractC2049q.m8502a("SQLiteSchema", "Skipping migration because all of " + str + " already exist", new Object[0]);
    }

    /* JADX INFO: renamed from: R */
    private void m6484R() {
        new C1510S0.d(this.f5305a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").m6348e(new InterfaceC2043k() { // from class: T4.b1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1581s1.m6497i(this.f5214a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    private void m6485S(String str, int i7) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f5305a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        sQLiteStatementCompileStatement.bindString(1, str);
        sQLiteStatementCompileStatement.bindLong(2, i7);
        AbstractC2034b.m8460d(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i7));
        this.f5305a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i7)});
    }

    /* JADX INFO: renamed from: T */
    private void m6486T() {
        new C1510S0.d(this.f5305a, "SELECT target_id, target_proto FROM targets").m6348e(new InterfaceC2043k() { // from class: T4.q1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1581s1.m6495g(this.f5296a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    private boolean m6487W(String str, String str2) {
        return m6515O(str).indexOf(str2) != -1;
    }

    /* JADX INFO: renamed from: X */
    private boolean m6488X(String str) {
        return !new C1510S0.d(this.f5305a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").m6345b(str).m6349f();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6492d(C1581s1 c1581s1, String str, Cursor cursor) {
        c1581s1.getClass();
        c1581s1.m6485S(str, cursor.getInt(0));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m6494f(C1581s1 c1581s1) {
        c1581s1.f5305a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        c1581s1.f5305a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6495g(C1581s1 c1581s1, Cursor cursor) {
        c1581s1.getClass();
        int i7 = cursor.getInt(0);
        try {
            c1581s1.f5305a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{c1581s1.f5306b.m6462g(C1868c.m7706s0(cursor.getBlob(1))).m6213g().m5811c(), Integer.valueOf(i7)});
        } catch (C5065C unused) {
            throw AbstractC2034b.m8457a("Failed to decode Query data for target %s", Integer.valueOf(i7));
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m6496h(C1498M.a aVar, SQLiteStatement sQLiteStatement, C1696t c1696t) {
        if (aVar.m6284a(c1696t)) {
            String strM7060o = c1696t.m7060o();
            C1696t c1696t2 = (C1696t) c1696t.m7065x();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, strM7060o);
            sQLiteStatement.bindString(2, AbstractC1540f.m6410c(c1696t2));
            sQLiteStatement.execute();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m6497i(final C1581s1 c1581s1, Cursor cursor) {
        c1581s1.getClass();
        final String string = cursor.getString(0);
        new C1510S0.d(c1581s1.f5305a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").m6345b(string, Long.valueOf(cursor.getLong(1))).m6348e(new InterfaceC2043k() { // from class: T4.i1
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1581s1.m6492d(this.f5238a, string, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m6498j(C1581s1 c1581s1) {
        c1581s1.f5305a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        c1581s1.f5305a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        c1581s1.f5305a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        c1581s1.f5305a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        c1581s1.f5305a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m6499k(C1581s1 c1581s1) {
        c1581s1.f5305a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        c1581s1.f5305a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        c1581s1.f5305a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m6500l(boolean[] zArr, SQLiteStatement sQLiteStatement, long j7, Cursor cursor) {
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j7);
        AbstractC2034b.m8460d(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m6501m(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        zArr[0] = true;
        String string = cursor.getString(0);
        C1696t c1696tM6409b = AbstractC1540f.m6409b(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, c1696tM6409b.m7063v());
        sQLiteStatement.bindString(2, string);
        AbstractC2034b.m8460d(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m6502n(C1581s1 c1581s1) {
        c1581s1.f5305a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        c1581s1.f5305a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        c1581s1.f5305a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m6505q(C1581s1 c1581s1) {
        c1581s1.f5305a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        c1581s1.f5305a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        c1581s1.f5305a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        c1581s1.f5305a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m6507s(C1581s1 c1581s1, Cursor cursor) {
        c1581s1.getClass();
        int i7 = cursor.getInt(0);
        try {
            c1581s1.f5305a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((C1868c) ((C1868c.b) C1868c.m7706s0(cursor.getBlob(1)).m23710Y()).m7727x().m23721o()).mo22973h(), Integer.valueOf(i7)});
        } catch (C5065C unused) {
            throw AbstractC2034b.m8457a("Failed to decode Query data for target %s", Integer.valueOf(i7));
        }
    }

    /* JADX INFO: renamed from: t */
    private void m6508t() {
        if (m6487W("remote_documents", "document_type")) {
            return;
        }
        this.f5305a.execSQL("ALTER TABLE remote_documents ADD COLUMN document_type INTEGER");
    }

    /* JADX INFO: renamed from: u */
    private void m6509u() {
        if (m6487W("remote_documents", "path_length")) {
            return;
        }
        this.f5305a.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
    }

    /* JADX INFO: renamed from: v */
    private void m6510v(String str) {
        this.f5305a.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    /* JADX INFO: renamed from: w */
    private void m6511w() {
        this.f5305a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f5305a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    /* JADX INFO: renamed from: x */
    private void m6512x() {
        if (m6487W("target_documents", "sequence_number")) {
            return;
        }
        this.f5305a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
    }

    /* JADX INFO: renamed from: y */
    private void m6513y() {
        if (!m6487W("target_globals", "target_count")) {
            this.f5305a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(this.f5305a, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(jQueryNumEntries));
        this.f5305a.update("target_globals", contentValues, null, null);
    }

    /* JADX INFO: renamed from: z */
    private void m6514z() {
        m6483Q(new String[]{"bundles", "named_queries"}, new Runnable() { // from class: T4.a1
            @Override // java.lang.Runnable
            public final void run() {
                C1581s1.m6494f(this.f5208a);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    List m6515O(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f5305a.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursorRawQuery.getColumnIndex("name");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: U */
    void m6516U(int i7) {
        m6517V(i7, 18);
    }

    /* JADX INFO: renamed from: V */
    void m6517V(int i7, int i8) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i7 < 1 && i8 >= 1) {
            m6472E();
            m6474G();
            m6473F();
        }
        if (i7 < 3 && i8 >= 3 && i7 != 0) {
            m6477J();
            m6474G();
        }
        if (i7 < 4 && i8 >= 4) {
            m6481N();
            m6513y();
        }
        if (i7 < 5 && i8 >= 5) {
            m6512x();
        }
        if (i7 < 6 && i8 >= 6) {
            m6484R();
        }
        if (i7 < 7 && i8 >= 7) {
            m6480M();
        }
        if (i7 < 8 && i8 >= 8) {
            m6475H();
        }
        if (i7 < 9 && i8 >= 9) {
            if (m6482P()) {
                m6476I();
            } else {
                m6511w();
            }
        }
        if (i7 == 9 && i8 >= 10) {
            m6476I();
        }
        if (i7 < 11 && i8 >= 11) {
            m6486T();
        }
        if (i7 < 12 && i8 >= 12) {
            m6514z();
        }
        if (i7 < 13 && i8 >= 13) {
            m6509u();
            m6478K();
        }
        if (i7 < 14 && i8 >= 14) {
            m6471D();
            m6468A();
            m6510v(AbstractC1521Y.f5182b);
        }
        if (i7 < 15 && i8 >= 15) {
            m6479L();
        }
        if (i7 < 16 && i8 >= 16) {
            m6469B();
        }
        if (i7 < 17 && i8 >= 17) {
            m6470C();
        }
        if (i7 < 18 && i8 >= 18) {
            m6508t();
        }
        AbstractC2049q.m8502a("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i7), Integer.valueOf(i8), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
