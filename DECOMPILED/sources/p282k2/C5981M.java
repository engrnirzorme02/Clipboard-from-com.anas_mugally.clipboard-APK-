package p282k2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p138R5.InterfaceC1380a;
import p198a2.C2187c;
import p198a2.EnumC2190f;
import p216c2.AbstractC2993i;
import p216c2.AbstractC3000p;
import p216c2.C2992h;
import p242f2.C5429a;
import p242f2.C5430b;
import p242f2.C5431c;
import p242f2.C5432d;
import p242f2.C5433e;
import p242f2.C5434f;
import p250g2.AbstractC5459a;
import p290l2.C6293a;
import p290l2.InterfaceC6294b;
import p298m2.InterfaceC6328a;
import p306n2.AbstractC6482a;

/* JADX INFO: renamed from: k2.M */
/* JADX INFO: loaded from: classes.dex */
public class C5981M implements InterfaceC5995d, InterfaceC6294b, InterfaceC5994c {

    /* JADX INFO: renamed from: f */
    private static final C2187c f23725f = C2187c.m8925b("proto");

    /* JADX INFO: renamed from: a */
    private final C5990W f23726a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC6328a f23727b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6328a f23728c;

    /* JADX INFO: renamed from: d */
    private final AbstractC5996e f23729d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1380a f23730e;

    /* JADX INFO: renamed from: k2.M$b */
    interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2.M$c */
    static class c {

        /* JADX INFO: renamed from: a */
        final String f23731a;

        /* JADX INFO: renamed from: b */
        final String f23732b;

        private c(String str, String str2) {
            this.f23731a = str;
            this.f23732b = str2;
        }
    }

    /* JADX INFO: renamed from: k2.M$d */
    interface d {
        /* JADX INFO: renamed from: a */
        Object mo26929a();
    }

    C5981M(InterfaceC6328a interfaceC6328a, InterfaceC6328a interfaceC6328a2, AbstractC5996e abstractC5996e, C5990W c5990w, InterfaceC1380a interfaceC1380a) {
        this.f23726a = c5990w;
        this.f23727b = interfaceC6328a;
        this.f23728c = interfaceC6328a2;
        this.f23729d = abstractC5996e;
        this.f23730e = interfaceC1380a;
    }

    /* JADX INFO: renamed from: A1 */
    private static String m26930A1(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC6002k) it.next()).mo27019c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: B1 */
    static Object m26931B1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ C5434f m26932J(long j7, Cursor cursor) {
        cursor.moveToNext();
        return C5434f.m24636c().m24641c(cursor.getLong(0)).m24640b(j7).m24639a();
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ Object m26933K0(long j7, AbstractC3000p abstractC3000p, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j7));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC3000p.mo14929b(), String.valueOf(AbstractC6482a.m27649a(abstractC3000p.mo14931d()))}) < 1) {
            contentValues.put("backend_name", abstractC3000p.mo14929b());
            contentValues.put("priority", Integer.valueOf(AbstractC6482a.m27649a(abstractC3000p.mo14931d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ List m26934Q(C5981M c5981m, AbstractC3000p abstractC3000p, SQLiteDatabase sQLiteDatabase) {
        List listM26966t1 = c5981m.m26966t1(sQLiteDatabase, abstractC3000p, c5981m.f23729d.mo27009d());
        for (EnumC2190f enumC2190f : EnumC2190f.values()) {
            if (enumC2190f != abstractC3000p.mo14931d()) {
                int iMo27009d = c5981m.f23729d.mo27009d() - listM26966t1.size();
                if (iMo27009d <= 0) {
                    break;
                }
                listM26966t1.addAll(c5981m.m26966t1(sQLiteDatabase, abstractC3000p.m14966f(enumC2190f), iMo27009d));
            }
        }
        return c5981m.m26965s1(listM26966t1, c5981m.m26967u1(sQLiteDatabase, listM26966t1));
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ byte[] m26935Q0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            byte[] bArr2 = (byte[]) arrayList.get(i7);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ List m26936R0(SQLiteDatabase sQLiteDatabase) {
        return (List) m26931B1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: k2.J
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26948d0((Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ C5429a m26937S0(C5981M c5981m, Map map, C5429a.a aVar, Cursor cursor) {
        c5981m.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C5431c.b bVarM26952g1 = c5981m.m26952g1(cursor.getInt(1));
            long j7 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C5431c.m24618c().m24623c(bVarM26952g1).m24622b(j7).m24621a());
        }
        c5981m.m26970w1(aVar, map);
        return aVar.m24613e(c5981m.m26961o1()).m24612d(c5981m.m26957l1()).m24611c((String) c5981m.f23730e.get()).m24610b();
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ Long m26939U0(C5981M c5981m, AbstractC2993i abstractC2993i, AbstractC3000p abstractC3000p, SQLiteDatabase sQLiteDatabase) {
        if (c5981m.m26964r1()) {
            c5981m.mo26989x(1L, C5431c.b.CACHE_FULL, abstractC2993i.mo14904n());
            return -1L;
        }
        long jM26954i1 = c5981m.m26954i1(sQLiteDatabase, abstractC3000p);
        int iMo27010e = c5981m.f23729d.mo27010e();
        byte[] bArrM14944a = abstractC2993i.mo14898e().m14944a();
        boolean z7 = bArrM14944a.length <= iMo27010e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jM26954i1));
        contentValues.put("transport_name", abstractC2993i.mo14904n());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC2993i.mo14899f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC2993i.mo14905o()));
        contentValues.put("payload_encoding", abstractC2993i.mo14898e().m14945b().m8926a());
        contentValues.put("code", abstractC2993i.mo14897d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z7));
        contentValues.put("payload", z7 ? bArrM14944a : new byte[0]);
        contentValues.put("product_id", abstractC2993i.mo14902l());
        contentValues.put("pseudonymous_id", abstractC2993i.mo14903m());
        contentValues.put("experiment_ids_clear_blob", abstractC2993i.mo14900g());
        contentValues.put("experiment_ids_encrypted_blob", abstractC2993i.mo14901h());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z7) {
            int iCeil = (int) Math.ceil(((double) bArrM14944a.length) / ((double) iMo27010e));
            for (int i7 = 1; i7 <= iCeil; i7++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrM14944a, (i7 - 1) * iMo27010e, Math.min(i7 * iMo27010e, bArrM14944a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i7));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : abstractC2993i.m14950k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ Object m26940V0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ Long m26941W0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ Object m26942X0(Throwable th) {
        throw new C6293a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ Object m26943Y0(String str, C5431c.b bVar, long j7, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) m26931B1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo4226a())}), new b() { // from class: k2.y
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j7 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo4226a())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.mo4226a()));
        contentValues.put("events_dropped_count", Long.valueOf(j7));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ Object m26944Z0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j7 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j7));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j7), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Integer m26945a1(final C5981M c5981m, long j7, SQLiteDatabase sQLiteDatabase) {
        c5981m.getClass();
        String[] strArr = {String.valueOf(j7)};
        m26931B1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: k2.r
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26960o0(this.f23783a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ Object m26946b1(C5981M c5981m, List list, AbstractC3000p abstractC3000p, Cursor cursor) {
        c5981m.getClass();
        while (cursor.moveToNext()) {
            long j7 = cursor.getLong(0);
            boolean z7 = cursor.getInt(7) != 0;
            AbstractC2993i.a aVarMo14917o = AbstractC2993i.m14946a().mo14916n(cursor.getString(1)).mo14911i(cursor.getLong(2)).mo14917o(cursor.getLong(3));
            if (z7) {
                aVarMo14917o.mo14910h(new C2992h(m26973z1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarMo14917o.mo14910h(new C2992h(m26973z1(cursor.getString(4)), c5981m.m26971x1(j7)));
            }
            if (!cursor.isNull(6)) {
                aVarMo14917o.mo14909g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarMo14917o.mo14914l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarMo14917o.mo14915m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarMo14917o.mo14912j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarMo14917o.mo14913k(cursor.getBlob(11));
            }
            list.add(AbstractC6002k.m27041a(j7, abstractC3000p, aVarMo14917o.mo14906d()));
        }
        return null;
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ Object m26947c1(C5981M c5981m, SQLiteDatabase sQLiteDatabase) {
        c5981m.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c5981m.f23727b.mo27283a()).execute();
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ List m26948d0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC3000p.m14964a().mo14933b(cursor.getString(1)).mo14935d(AbstractC6482a.m27650b(cursor.getInt(2))).mo14934c(m26968v1(cursor.getString(3))).mo14932a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ C5429a m26949d1(final C5981M c5981m, String str, final Map map, final C5429a.a aVar, SQLiteDatabase sQLiteDatabase) {
        c5981m.getClass();
        return (C5429a) m26931B1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: k2.A
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26937S0(this.f23712a, map, aVar, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ Long m26950e1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ C5434f m26951f1(final long j7, SQLiteDatabase sQLiteDatabase) {
        return (C5434f) m26931B1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: k2.D
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26932J(j7, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    private C5431c.b m26952g1(int i7) {
        C5431c.b bVar = C5431c.b.REASON_UNKNOWN;
        if (i7 == bVar.mo4226a()) {
            return bVar;
        }
        C5431c.b bVar2 = C5431c.b.MESSAGE_TOO_OLD;
        if (i7 == bVar2.mo4226a()) {
            return bVar2;
        }
        C5431c.b bVar3 = C5431c.b.CACHE_FULL;
        if (i7 == bVar3.mo4226a()) {
            return bVar3;
        }
        C5431c.b bVar4 = C5431c.b.PAYLOAD_TOO_BIG;
        if (i7 == bVar4.mo4226a()) {
            return bVar4;
        }
        C5431c.b bVar5 = C5431c.b.MAX_RETRIES_REACHED;
        if (i7 == bVar5.mo4226a()) {
            return bVar5;
        }
        C5431c.b bVar6 = C5431c.b.INVALID_PAYLOD;
        if (i7 == bVar6.mo4226a()) {
            return bVar6;
        }
        C5431c.b bVar7 = C5431c.b.SERVER_ERROR;
        if (i7 == bVar7.mo4226a()) {
            return bVar7;
        }
        AbstractC5459a.m24663a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i7));
        return bVar;
    }

    /* JADX INFO: renamed from: h1 */
    private void m26953h1(final SQLiteDatabase sQLiteDatabase) {
        m26972y1(new d() { // from class: k2.l
            @Override // p282k2.C5981M.d
            /* JADX INFO: renamed from: a */
            public final Object mo26929a() {
                return C5981M.m26940V0(sQLiteDatabase);
            }
        }, new b() { // from class: k2.w
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26942X0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i1 */
    private long m26954i1(SQLiteDatabase sQLiteDatabase, AbstractC3000p abstractC3000p) {
        Long lM26963p1 = m26963p1(sQLiteDatabase, abstractC3000p);
        if (lM26963p1 != null) {
            return lM26963p1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC3000p.mo14929b());
        contentValues.put("priority", Integer.valueOf(AbstractC6482a.m27649a(abstractC3000p.mo14931d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC3000p.mo14930c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC3000p.mo14930c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Object m26955k0(C5981M c5981m, Cursor cursor) {
        c5981m.getClass();
        while (cursor.moveToNext()) {
            c5981m.mo26989x(cursor.getInt(0), C5431c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ SQLiteDatabase m26956l0(Throwable th) {
        throw new C6293a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: renamed from: l1 */
    private C5430b m26957l1() {
        return C5430b.m24614b().m24617b(C5433e.m24630c().m24634b(m26982j1()).m24635c(AbstractC5996e.f23766a.mo27011f()).m24633a()).m24616a();
    }

    /* JADX INFO: renamed from: m1 */
    private long m26958m1() {
        return m26983k1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* JADX INFO: renamed from: n1 */
    private long m26959n1() {
        return m26983k1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ Object m26960o0(C5981M c5981m, Cursor cursor) {
        c5981m.getClass();
        while (cursor.moveToNext()) {
            c5981m.mo26989x(cursor.getInt(0), C5431c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: renamed from: o1 */
    private C5434f m26961o1() {
        final long jMo27283a = this.f23727b.mo27283a();
        return (C5434f) m26988q1(new b() { // from class: k2.C
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26951f1(jMo27283a, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Object m26962p0(final C5981M c5981m, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        c5981m.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        m26931B1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: k2.u
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26955k0(this.f23788a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: renamed from: p1 */
    private Long m26963p1(SQLiteDatabase sQLiteDatabase, AbstractC3000p abstractC3000p) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC3000p.mo14929b(), String.valueOf(AbstractC6482a.m27649a(abstractC3000p.mo14931d()))));
        if (abstractC3000p.mo14930c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC3000p.mo14930c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m26931B1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: k2.x
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26941W0((Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r1 */
    private boolean m26964r1() {
        return m26958m1() * m26959n1() >= this.f23729d.mo27011f();
    }

    /* JADX INFO: renamed from: s1 */
    private List m26965s1(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC6002k abstractC6002k = (AbstractC6002k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC6002k.mo27019c()))) {
                AbstractC2993i.a aVarM14951p = abstractC6002k.mo27018b().m14951p();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC6002k.mo27019c()))) {
                    aVarM14951p.m14954c(cVar.f23731a, cVar.f23732b);
                }
                listIterator.set(AbstractC6002k.m27041a(abstractC6002k.mo27019c(), abstractC6002k.mo27020d(), aVarM14951p.mo14906d()));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: t1 */
    private List m26966t1(SQLiteDatabase sQLiteDatabase, final AbstractC3000p abstractC3000p, int i7) {
        final ArrayList arrayList = new ArrayList();
        Long lM26963p1 = m26963p1(sQLiteDatabase, abstractC3000p);
        if (lM26963p1 == null) {
            return arrayList;
        }
        m26931B1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lM26963p1.toString()}, null, null, null, String.valueOf(i7)), new b() { // from class: k2.v
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26946b1(this.f23789a, arrayList, abstractC3000p, (Cursor) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: u1 */
    private Map m26967u1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < list.size(); i7++) {
            sb.append(((AbstractC6002k) list.get(i7)).mo27019c());
            if (i7 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m26931B1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: k2.z
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26944Z0(map, (Cursor) obj);
            }
        });
        return map;
    }

    /* JADX INFO: renamed from: v1 */
    private static byte[] m26968v1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ Boolean m26969w0(C5981M c5981m, AbstractC3000p abstractC3000p, SQLiteDatabase sQLiteDatabase) {
        Long lM26963p1 = c5981m.m26963p1(sQLiteDatabase, abstractC3000p);
        return lM26963p1 == null ? Boolean.FALSE : (Boolean) m26931B1(c5981m.m26983k1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM26963p1.toString()}), new b() { // from class: k2.t
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: renamed from: w1 */
    private void m26970w1(C5429a.a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.m24609a(C5432d.m24624c().m24629c((String) entry.getKey()).m24628b((List) entry.getValue()).m24627a());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m26971x1(long j7) {
        return (byte[]) m26931B1(m26983k1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j7)}, null, null, "sequence_num"), new b() { // from class: k2.B
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26935Q0((Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y1 */
    private Object m26972y1(d dVar, b bVar) {
        long jMo27283a = this.f23728c.mo27283a();
        while (true) {
            try {
                return dVar.mo26929a();
            } catch (SQLiteDatabaseLockedException e7) {
                if (this.f23728c.mo27283a() >= ((long) this.f23729d.mo27007b()) + jMo27283a) {
                    return bVar.apply(e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* JADX INFO: renamed from: z1 */
    private static C2187c m26973z1(String str) {
        return str == null ? f23725f : C2187c.m8925b(str);
    }

    @Override // p282k2.InterfaceC5995d
    /* JADX INFO: renamed from: C */
    public void mo26974C(final AbstractC3000p abstractC3000p, final long j7) {
        m26988q1(new b() { // from class: k2.o
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26933K0(j7, abstractC3000p, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p282k2.InterfaceC5995d
    /* JADX INFO: renamed from: C0 */
    public void mo26975C0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m26930A1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m26988q1(new b() { // from class: k2.K
                @Override // p282k2.C5981M.b
                public final Object apply(Object obj) {
                    return C5981M.m26962p0(this.f23720a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // p282k2.InterfaceC5995d
    /* JADX INFO: renamed from: D0 */
    public long mo26976D0(AbstractC3000p abstractC3000p) {
        return ((Long) m26931B1(m26983k1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC3000p.mo14929b(), String.valueOf(AbstractC6482a.m27649a(abstractC3000p.mo14931d()))}), new b() { // from class: k2.H
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26950e1((Cursor) obj);
            }
        })).longValue();
    }

    @Override // p282k2.InterfaceC5995d
    /* JADX INFO: renamed from: G */
    public AbstractC6002k mo26977G(final AbstractC3000p abstractC3000p, final AbstractC2993i abstractC2993i) {
        AbstractC5459a.m24664b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC3000p.mo14931d(), abstractC2993i.mo14904n(), abstractC3000p.mo14929b());
        long jLongValue = ((Long) m26988q1(new b() { // from class: k2.m
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26939U0(this.f23772a, abstractC2993i, abstractC3000p, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC6002k.m27041a(jLongValue, abstractC3000p, abstractC2993i);
    }

    @Override // p282k2.InterfaceC5995d
    /* JADX INFO: renamed from: K */
    public Iterable mo26978K(final AbstractC3000p abstractC3000p) {
        return (Iterable) m26988q1(new b() { // from class: k2.L
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26934Q(this.f23723a, abstractC3000p, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p282k2.InterfaceC5995d
    /* JADX INFO: renamed from: L */
    public Iterable mo26979L() {
        return (Iterable) m26988q1(new b() { // from class: k2.G
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26936R0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // p282k2.InterfaceC5995d
    /* JADX INFO: renamed from: P0 */
    public boolean mo26980P0(final AbstractC3000p abstractC3000p) {
        return ((Boolean) m26988q1(new b() { // from class: k2.n
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26969w0(this.f23775a, abstractC3000p, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23726a.close();
    }

    @Override // p282k2.InterfaceC5994c
    /* JADX INFO: renamed from: d */
    public void mo26981d() {
        m26988q1(new b() { // from class: k2.p
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26947c1(this.f23779a, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j1 */
    long m26982j1() {
        return m26958m1() * m26959n1();
    }

    /* JADX INFO: renamed from: k1 */
    SQLiteDatabase m26983k1() {
        final C5990W c5990w = this.f23726a;
        Objects.requireNonNull(c5990w);
        return (SQLiteDatabase) m26972y1(new d() { // from class: k2.E
            @Override // p282k2.C5981M.d
            /* JADX INFO: renamed from: a */
            public final Object mo26929a() {
                return c5990w.getWritableDatabase();
            }
        }, new b() { // from class: k2.F
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26956l0((Throwable) obj);
            }
        });
    }

    @Override // p290l2.InterfaceC6294b
    /* JADX INFO: renamed from: m */
    public Object mo26984m(InterfaceC6294b.a aVar) {
        SQLiteDatabase sQLiteDatabaseM26983k1 = m26983k1();
        m26953h1(sQLiteDatabaseM26983k1);
        try {
            Object objMo25235n = aVar.mo25235n();
            sQLiteDatabaseM26983k1.setTransactionSuccessful();
            return objMo25235n;
        } finally {
            sQLiteDatabaseM26983k1.endTransaction();
        }
    }

    @Override // p282k2.InterfaceC5994c
    /* JADX INFO: renamed from: n */
    public C5429a mo26985n() {
        final C5429a.a aVarM24603e = C5429a.m24603e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C5429a) m26988q1(new b() { // from class: k2.s
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26949d1(this.f23784a, str, map, aVarM24603e, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p282k2.InterfaceC5995d
    /* JADX INFO: renamed from: o */
    public int mo26986o() {
        final long jMo27283a = this.f23727b.mo27283a() - this.f23729d.mo27008c();
        return ((Integer) m26988q1(new b() { // from class: k2.I
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26945a1(this.f23718a, jMo27283a, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // p282k2.InterfaceC5995d
    /* JADX INFO: renamed from: p */
    public void mo26987p(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            m26983k1().compileStatement("DELETE FROM events WHERE _id in " + m26930A1(iterable)).execute();
        }
    }

    /* JADX INFO: renamed from: q1 */
    Object m26988q1(b bVar) {
        SQLiteDatabase sQLiteDatabaseM26983k1 = m26983k1();
        sQLiteDatabaseM26983k1.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseM26983k1);
            sQLiteDatabaseM26983k1.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM26983k1.endTransaction();
        }
    }

    @Override // p282k2.InterfaceC5994c
    /* JADX INFO: renamed from: x */
    public void mo26989x(final long j7, final C5431c.b bVar, final String str) {
        m26988q1(new b() { // from class: k2.q
            @Override // p282k2.C5981M.b
            public final Object apply(Object obj) {
                return C5981M.m26943Y0(str, bVar, j7, (SQLiteDatabase) obj);
            }
        });
    }
}
