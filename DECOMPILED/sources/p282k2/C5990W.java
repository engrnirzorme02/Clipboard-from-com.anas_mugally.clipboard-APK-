package p282k2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: k2.W */
/* JADX INFO: loaded from: classes.dex */
final class C5990W extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c */
    private static final String f23738c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: d */
    static int f23739d = 7;

    /* JADX INFO: renamed from: e */
    private static final a f23740e;

    /* JADX INFO: renamed from: f */
    private static final a f23741f;

    /* JADX INFO: renamed from: r */
    private static final a f23742r;

    /* JADX INFO: renamed from: s */
    private static final a f23743s;

    /* JADX INFO: renamed from: t */
    private static final a f23744t;

    /* JADX INFO: renamed from: u */
    private static final a f23745u;

    /* JADX INFO: renamed from: v */
    private static final a f23746v;

    /* JADX INFO: renamed from: w */
    private static final List f23747w;

    /* JADX INFO: renamed from: a */
    private final int f23748a;

    /* JADX INFO: renamed from: b */
    private boolean f23749b;

    /* JADX INFO: renamed from: k2.W$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo26993a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: k2.O
            @Override // p282k2.C5990W.a
            /* JADX INFO: renamed from: a */
            public final void mo26993a(SQLiteDatabase sQLiteDatabase) {
                C5990W.m26996d(sQLiteDatabase);
            }
        };
        f23740e = aVar;
        a aVar2 = new a() { // from class: k2.P
            @Override // p282k2.C5990W.a
            /* JADX INFO: renamed from: a */
            public final void mo26993a(SQLiteDatabase sQLiteDatabase) {
                C5990W.m26995Q(sQLiteDatabase);
            }
        };
        f23741f = aVar2;
        a aVar3 = new a() { // from class: k2.Q
            @Override // p282k2.C5990W.a
            /* JADX INFO: renamed from: a */
            public final void mo26993a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f23742r = aVar3;
        a aVar4 = new a() { // from class: k2.S
            @Override // p282k2.C5990W.a
            /* JADX INFO: renamed from: a */
            public final void mo26993a(SQLiteDatabase sQLiteDatabase) {
                C5990W.m26997d0(sQLiteDatabase);
            }
        };
        f23743s = aVar4;
        a aVar5 = new a() { // from class: k2.T
            @Override // p282k2.C5990W.a
            /* JADX INFO: renamed from: a */
            public final void mo26993a(SQLiteDatabase sQLiteDatabase) {
                C5990W.m27003x(sQLiteDatabase);
            }
        };
        f23744t = aVar5;
        a aVar6 = new a() { // from class: k2.U
            @Override // p282k2.C5990W.a
            /* JADX INFO: renamed from: a */
            public final void mo26993a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f23745u = aVar6;
        a aVar7 = new a() { // from class: k2.V
            @Override // p282k2.C5990W.a
            /* JADX INFO: renamed from: a */
            public final void mo26993a(SQLiteDatabase sQLiteDatabase) {
                C5990W.m27000m(sQLiteDatabase);
            }
        };
        f23746v = aVar7;
        f23747w = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    C5990W(Context context, String str, int i7) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i7);
        this.f23749b = false;
        this.f23748a = i7;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m26995Q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m26996d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m26997d0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: renamed from: k0 */
    private void m26998k0(SQLiteDatabase sQLiteDatabase) {
        if (this.f23749b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: renamed from: l0 */
    private void m26999l0(SQLiteDatabase sQLiteDatabase, int i7) {
        m26998k0(sQLiteDatabase);
        m27002o0(sQLiteDatabase, 0, i7);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m27000m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    /* JADX INFO: renamed from: o0 */
    private void m27002o0(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        List list = f23747w;
        if (i8 <= list.size()) {
            while (i7 < i8) {
                ((a) f23747w.get(i7)).mo26993a(sQLiteDatabase);
                i7++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i7 + " to " + i8 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m27003x(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f23738c);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f23749b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m26999l0(sQLiteDatabase, this.f23748a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m26999l0(sQLiteDatabase, i8);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m26998k0(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        m26998k0(sQLiteDatabase);
        m27002o0(sQLiteDatabase, i7, i8);
    }
}
