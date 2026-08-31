package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.C0170a;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0180k;
import p145S5.C1444v;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p220c6.AbstractC3026b;
import p302m6.AbstractC6406h;
import p311o.C6510b;
import p394y0.AbstractC7462q;
import p394y0.C7448c;
import p394y0.C7456k;

/* JADX INFO: renamed from: androidx.room.c */
/* JADX INFO: loaded from: classes.dex */
public class C2805c {

    /* JADX INFO: renamed from: q */
    public static final a f11272q = new a(null);

    /* JADX INFO: renamed from: r */
    private static final String[] f11273r = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f11274a;

    /* JADX INFO: renamed from: b */
    private final Map f11275b;

    /* JADX INFO: renamed from: c */
    private final Map f11276c;

    /* JADX INFO: renamed from: d */
    private final Map f11277d;

    /* JADX INFO: renamed from: e */
    private final String[] f11278e;

    /* JADX INFO: renamed from: f */
    private C7448c f11279f;

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f11280g;

    /* JADX INFO: renamed from: h */
    private volatile boolean f11281h;

    /* JADX INFO: renamed from: i */
    private volatile InterfaceC0180k f11282i;

    /* JADX INFO: renamed from: j */
    private final b f11283j;

    /* JADX INFO: renamed from: k */
    private final C7456k f11284k;

    /* JADX INFO: renamed from: l */
    private final C6510b f11285l;

    /* JADX INFO: renamed from: m */
    private C2806d f11286m;

    /* JADX INFO: renamed from: n */
    private final Object f11287n;

    /* JADX INFO: renamed from: o */
    private final Object f11288o;

    /* JADX INFO: renamed from: p */
    public final Runnable f11289p;

    /* JADX INFO: renamed from: androidx.room.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m13958a(InterfaceC0176g database) {
            AbstractC6118n.m27187e(database, "database");
            if (database.mo890y0()) {
                database.mo880T();
            } else {
                database.mo882c();
            }
        }

        /* JADX INFO: renamed from: b */
        public final String m13959b(String tableName, String triggerType) {
            AbstractC6118n.m27187e(tableName, "tableName");
            AbstractC6118n.m27187e(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$b */
    public static final class b {

        /* JADX INFO: renamed from: e */
        public static final a f11290e = new a(null);

        /* JADX INFO: renamed from: a */
        private final long[] f11291a;

        /* JADX INFO: renamed from: b */
        private final boolean[] f11292b;

        /* JADX INFO: renamed from: c */
        private final int[] f11293c;

        /* JADX INFO: renamed from: d */
        private boolean f11294d;

        /* JADX INFO: renamed from: androidx.room.c$b$a */
        public static final class a {
            public /* synthetic */ a(AbstractC6112h abstractC6112h) {
                this();
            }

            private a() {
            }
        }

        public b(int i7) {
            this.f11291a = new long[i7];
            this.f11292b = new boolean[i7];
            this.f11293c = new int[i7];
        }

        /* JADX INFO: renamed from: a */
        public final int[] m13960a() {
            synchronized (this) {
                try {
                    if (!this.f11294d) {
                        return null;
                    }
                    long[] jArr = this.f11291a;
                    int length = jArr.length;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        int i9 = i8 + 1;
                        int i10 = 1;
                        boolean z7 = jArr[i7] > 0;
                        boolean[] zArr = this.f11292b;
                        if (z7 != zArr[i8]) {
                            int[] iArr = this.f11293c;
                            if (!z7) {
                                i10 = 2;
                            }
                            iArr[i8] = i10;
                        } else {
                            this.f11293c[i8] = 0;
                        }
                        zArr[i8] = z7;
                        i7++;
                        i8 = i9;
                    }
                    this.f11294d = false;
                    return (int[]) this.f11293c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m13961b(int... tableIds) {
            boolean z7;
            AbstractC6118n.m27187e(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z7 = false;
                    for (int i7 : tableIds) {
                        long[] jArr = this.f11291a;
                        long j7 = jArr[i7];
                        jArr[i7] = 1 + j7;
                        if (j7 == 0) {
                            this.f11294d = true;
                            z7 = true;
                        }
                    }
                    C1444v c1444v = C1444v.f4971a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z7;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m13962c(int... tableIds) {
            boolean z7;
            AbstractC6118n.m27187e(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z7 = false;
                    for (int i7 : tableIds) {
                        long[] jArr = this.f11291a;
                        long j7 = jArr[i7];
                        jArr[i7] = j7 - 1;
                        if (j7 == 1) {
                            this.f11294d = true;
                            z7 = true;
                        }
                    }
                    C1444v c1444v = C1444v.f4971a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z7;
        }

        /* JADX INFO: renamed from: d */
        public final void m13963d() {
            synchronized (this) {
                Arrays.fill(this.f11292b, false);
                this.f11294d = true;
                C1444v c1444v = C1444v.f4971a;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        private final String[] f11295a;

        public c(String[] tables) {
            AbstractC6118n.m27187e(tables, "tables");
            this.f11295a = tables;
        }

        /* JADX INFO: renamed from: a */
        public final String[] m13964a() {
            return this.f11295a;
        }

        /* JADX INFO: renamed from: b */
        public abstract boolean mo13965b();

        /* JADX INFO: renamed from: c */
        public abstract void mo13966c(Set set);
    }

    /* JADX INFO: renamed from: androidx.room.c$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final c f11296a;

        /* JADX INFO: renamed from: b */
        private final int[] f11297b;

        /* JADX INFO: renamed from: c */
        private final String[] f11298c;

        /* JADX INFO: renamed from: d */
        private final Set f11299d;

        public d(c observer, int[] tableIds, String[] tableNames) {
            AbstractC6118n.m27187e(observer, "observer");
            AbstractC6118n.m27187e(tableIds, "tableIds");
            AbstractC6118n.m27187e(tableNames, "tableNames");
            this.f11296a = observer;
            this.f11297b = tableIds;
            this.f11298c = tableNames;
            this.f11299d = !(tableNames.length == 0) ? AbstractC1617O.m6649c(tableNames[0]) : AbstractC1617O.m6650d();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        /* JADX INFO: renamed from: a */
        public final int[] m13967a() {
            return this.f11297b;
        }

        /* JADX INFO: renamed from: b */
        public final void m13968b(Set invalidatedTablesIds) {
            Set setD;
            AbstractC6118n.m27187e(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f11297b;
            int length = iArr.length;
            if (length != 0) {
                int i7 = 0;
                if (length != 1) {
                    Set setB = AbstractC1617O.m6648b();
                    int[] iArr2 = this.f11297b;
                    int length2 = iArr2.length;
                    int i8 = 0;
                    while (i7 < length2) {
                        int i9 = i8 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i7]))) {
                            setB.add(this.f11298c[i8]);
                        }
                        i7++;
                        i8 = i9;
                    }
                    setD = AbstractC1617O.m6647a(setB);
                } else {
                    setD = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f11299d : AbstractC1617O.m6650d();
                }
            } else {
                setD = AbstractC1617O.m6650d();
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f11296a.mo13966c(setD);
        }

        /* JADX INFO: renamed from: c */
        public final void m13969c(String[] tables) {
            Set setD;
            AbstractC6118n.m27187e(tables, "tables");
            int length = this.f11298c.length;
            if (length == 0) {
                setD = AbstractC1617O.m6650d();
            } else if (length == 1) {
                int length2 = tables.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        setD = AbstractC1617O.m6650d();
                        break;
                    } else {
                        if (AbstractC6406h.m27564w(tables[i7], this.f11298c[0], true)) {
                            setD = this.f11299d;
                            break;
                        }
                        i7++;
                    }
                }
            } else {
                Set setB = AbstractC1617O.m6648b();
                for (String str : tables) {
                    for (String str2 : this.f11298c) {
                        if (AbstractC6406h.m27564w(str2, str, true)) {
                            setB.add(str2);
                        }
                    }
                }
                setD = AbstractC1617O.m6647a(setB);
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f11296a.mo13966c(setD);
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$e */
    public static final class e implements Runnable {
        e() {
        }

        /* JADX INFO: renamed from: a */
        private final Set m13970a() throws IOException {
            C2805c c2805c = C2805c.this;
            Set setB = AbstractC1617O.m6648b();
            Cursor cursorM33026y = AbstractC7462q.m33026y(c2805c.m13946f(), new C0170a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (cursorM33026y.moveToNext()) {
                try {
                    setB.add(Integer.valueOf(cursorM33026y.getInt(0)));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3026b.m14999a(cursorM33026y, th);
                        throw th2;
                    }
                }
            }
            C1444v c1444v = C1444v.f4971a;
            AbstractC3026b.m14999a(cursorM33026y, null);
            Set setA = AbstractC1617O.m6647a(setB);
            if (setA.isEmpty()) {
                return setA;
            }
            if (C2805c.this.m13945e() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            InterfaceC0180k interfaceC0180kM13945e = C2805c.this.m13945e();
            if (interfaceC0180kM13945e == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            interfaceC0180kM13945e.mo913y();
            return setA;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set setD;
            C7448c c7448c;
            Lock lockM33032k = C2805c.this.m13946f().m33032k();
            lockM33032k.lock();
            try {
                try {
                    if (!C2805c.this.m13944d()) {
                        lockM33032k.unlock();
                        C7448c c7448c2 = C2805c.this.f11279f;
                        if (c7448c2 != null) {
                            c7448c2.m32986e();
                            return;
                        }
                        return;
                    }
                    if (!C2805c.this.m13948h().compareAndSet(true, false)) {
                        lockM33032k.unlock();
                        C7448c c7448c3 = C2805c.this.f11279f;
                        if (c7448c3 != null) {
                            c7448c3.m32986e();
                            return;
                        }
                        return;
                    }
                    if (C2805c.this.m13946f().m33036q()) {
                        lockM33032k.unlock();
                        C7448c c7448c4 = C2805c.this.f11279f;
                        if (c7448c4 != null) {
                            c7448c4.m32986e();
                            return;
                        }
                        return;
                    }
                    InterfaceC0176g interfaceC0176gMo892Y = C2805c.this.m13946f().m33034m().mo892Y();
                    interfaceC0176gMo892Y.mo880T();
                    try {
                        setD = m13970a();
                        interfaceC0176gMo892Y.mo883h();
                        interfaceC0176gMo892Y.mo885j();
                        lockM33032k.unlock();
                        c7448c = C2805c.this.f11279f;
                        if (c7448c != null) {
                            c7448c.m32986e();
                        }
                        if (setD.isEmpty()) {
                            return;
                        }
                        C6510b c6510bM13947g = C2805c.this.m13947g();
                        C2805c c2805c = C2805c.this;
                        synchronized (c6510bM13947g) {
                            try {
                                Iterator it = c2805c.m13947g().iterator();
                                while (it.hasNext()) {
                                    ((d) ((Map.Entry) it.next()).getValue()).m13968b(setD);
                                }
                                C1444v c1444v = C1444v.f4971a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        interfaceC0176gMo892Y.mo885j();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    lockM33032k.unlock();
                    C7448c c7448c5 = C2805c.this.f11279f;
                    if (c7448c5 != null) {
                        c7448c5.m32986e();
                    }
                    throw th3;
                }
            } catch (SQLiteException e7) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
                setD = AbstractC1617O.m6650d();
                lockM33032k.unlock();
                c7448c = C2805c.this.f11279f;
                if (c7448c != null) {
                }
            } catch (IllegalStateException e8) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
                setD = AbstractC1617O.m6650d();
                lockM33032k.unlock();
                c7448c = C2805c.this.f11279f;
                if (c7448c != null) {
                }
            }
        }
    }

    public C2805c(AbstractC7462q database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        String lowerCase;
        AbstractC6118n.m27187e(database, "database");
        AbstractC6118n.m27187e(shadowTablesMap, "shadowTablesMap");
        AbstractC6118n.m27187e(viewTables, "viewTables");
        AbstractC6118n.m27187e(tableNames, "tableNames");
        this.f11274a = database;
        this.f11275b = shadowTablesMap;
        this.f11276c = viewTables;
        this.f11280g = new AtomicBoolean(false);
        this.f11283j = new b(tableNames.length);
        this.f11284k = new C7456k(database);
        this.f11285l = new C6510b();
        this.f11287n = new Object();
        this.f11288o = new Object();
        this.f11277d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str = tableNames[i7];
            Locale US = Locale.US;
            AbstractC6118n.m27186d(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            AbstractC6118n.m27186d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f11277d.put(lowerCase2, Integer.valueOf(i7));
            String str2 = (String) this.f11275b.get(tableNames[i7]);
            if (str2 != null) {
                AbstractC6118n.m27186d(US, "US");
                lowerCase = str2.toLowerCase(US);
                AbstractC6118n.m27186d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i7] = lowerCase2;
        }
        this.f11278e = strArr;
        for (Map.Entry entry : this.f11275b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            AbstractC6118n.m27186d(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            AbstractC6118n.m27186d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f11277d.containsKey(lowerCase3)) {
                String str4 = (String) entry.getKey();
                AbstractC6118n.m27186d(US2, "US");
                String lowerCase4 = str4.toLowerCase(US2);
                AbstractC6118n.m27186d(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f11277d;
                map.put(lowerCase4, AbstractC1610H.m6627i(map, lowerCase3));
            }
        }
        this.f11289p = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final void m13939l() {
        synchronized (this.f11288o) {
            this.f11281h = false;
            this.f11283j.m13963d();
            InterfaceC0180k interfaceC0180k = this.f11282i;
            if (interfaceC0180k != null) {
                interfaceC0180k.close();
                C1444v c1444v = C1444v.f4971a;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private final String[] m13940o(String[] strArr) {
        Set setB = AbstractC1617O.m6648b();
        for (String str : strArr) {
            Map map = this.f11276c;
            Locale US = Locale.US;
            AbstractC6118n.m27186d(US, "US");
            String lowerCase = str.toLowerCase(US);
            AbstractC6118n.m27186d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f11276c;
                AbstractC6118n.m27186d(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                AbstractC6118n.m27186d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                AbstractC6118n.m27184b(obj);
                setB.addAll((Collection) obj);
            } else {
                setB.add(str);
            }
        }
        return (String[]) AbstractC1617O.m6647a(setB).toArray(new String[0]);
    }

    /* JADX INFO: renamed from: r */
    private final void m13941r(InterfaceC0176g interfaceC0176g, int i7) {
        interfaceC0176g.mo888s("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i7 + ", 0)");
        String str = this.f11278e[i7];
        for (String str2 : f11273r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f11272q.m13959b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i7 + " AND invalidated = 0; END";
            AbstractC6118n.m27186d(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC0176g.mo888s(str3);
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m13942s(InterfaceC0176g interfaceC0176g, int i7) {
        String str = this.f11278e[i7];
        for (String str2 : f11273r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f11272q.m13959b(str, str2);
            AbstractC6118n.m27186d(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC0176g.mo888s(str3);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m13943c(c observer) {
        d dVar;
        AbstractC6118n.m27187e(observer, "observer");
        String[] strArrM13940o = m13940o(observer.m13964a());
        ArrayList arrayList = new ArrayList(strArrM13940o.length);
        for (String str : strArrM13940o) {
            Map map = this.f11277d;
            Locale US = Locale.US;
            AbstractC6118n.m27186d(US, "US");
            String lowerCase = str.toLowerCase(US);
            AbstractC6118n.m27186d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] iArrF0 = AbstractC1638q.m6592f0(arrayList);
        d dVar2 = new d(observer, iArrF0, strArrM13940o);
        synchronized (this.f11285l) {
            dVar = (d) this.f11285l.mo27730k(observer, dVar2);
        }
        if (dVar == null && this.f11283j.m13961b(Arrays.copyOf(iArrF0, iArrF0.length))) {
            m13956t();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13944d() {
        if (!this.f11274a.m33040w()) {
            return false;
        }
        if (!this.f11281h) {
            this.f11274a.m33034m().mo892Y();
        }
        if (this.f11281h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0180k m13945e() {
        return this.f11282i;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC7462q m13946f() {
        return this.f11274a;
    }

    /* JADX INFO: renamed from: g */
    public final C6510b m13947g() {
        return this.f11285l;
    }

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean m13948h() {
        return this.f11280g;
    }

    /* JADX INFO: renamed from: i */
    public final Map m13949i() {
        return this.f11277d;
    }

    /* JADX INFO: renamed from: j */
    public final void m13950j(InterfaceC0176g database) {
        AbstractC6118n.m27187e(database, "database");
        synchronized (this.f11288o) {
            if (this.f11281h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.mo888s("PRAGMA temp_store = MEMORY;");
            database.mo888s("PRAGMA recursive_triggers='ON';");
            database.mo888s("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m13957u(database);
            this.f11282i = database.mo891z("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f11281h = true;
            C1444v c1444v = C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m13951k(String... tables) {
        AbstractC6118n.m27187e(tables, "tables");
        synchronized (this.f11285l) {
            try {
                for (Map.Entry entry : this.f11285l) {
                    AbstractC6118n.m27186d(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.mo13965b()) {
                        dVar.m13969c(tables);
                    }
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m13952m() {
        if (this.f11280g.compareAndSet(false, true)) {
            C7448c c7448c = this.f11279f;
            if (c7448c != null) {
                c7448c.m32990j();
            }
            this.f11274a.m33035n().execute(this.f11289p);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m13953n(c observer) {
        d dVar;
        AbstractC6118n.m27187e(observer, "observer");
        synchronized (this.f11285l) {
            dVar = (d) this.f11285l.mo27731m(observer);
        }
        if (dVar != null) {
            b bVar = this.f11283j;
            int[] iArrM13967a = dVar.m13967a();
            if (bVar.m13962c(Arrays.copyOf(iArrM13967a, iArrM13967a.length))) {
                m13956t();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m13954p(C7448c autoCloser) {
        AbstractC6118n.m27187e(autoCloser, "autoCloser");
        this.f11279f = autoCloser;
        autoCloser.m32992l(new Runnable() { // from class: y0.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f29913a.m13939l();
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m13955q(Context context, String name, Intent serviceIntent) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(name, "name");
        AbstractC6118n.m27187e(serviceIntent, "serviceIntent");
        this.f11286m = new C2806d(context, name, serviceIntent, this, this.f11274a.m33035n());
    }

    /* JADX INFO: renamed from: t */
    public final void m13956t() {
        if (this.f11274a.m33040w()) {
            m13957u(this.f11274a.m33034m().mo892Y());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m13957u(InterfaceC0176g database) {
        AbstractC6118n.m27187e(database, "database");
        if (database.mo889t0()) {
            return;
        }
        try {
            Lock lockM33032k = this.f11274a.m33032k();
            lockM33032k.lock();
            try {
                synchronized (this.f11287n) {
                    int[] iArrM13960a = this.f11283j.m13960a();
                    if (iArrM13960a != null) {
                        f11272q.m13958a(database);
                        try {
                            int length = iArrM13960a.length;
                            int i7 = 0;
                            int i8 = 0;
                            while (i7 < length) {
                                int i9 = iArrM13960a[i7];
                                int i10 = i8 + 1;
                                if (i9 == 1) {
                                    m13941r(database, i8);
                                } else if (i9 == 2) {
                                    m13942s(database, i8);
                                }
                                i7++;
                                i8 = i10;
                            }
                            database.mo883h();
                            database.mo885j();
                            C1444v c1444v = C1444v.f4971a;
                        } catch (Throwable th) {
                            database.mo885j();
                            throw th;
                        }
                    }
                }
                lockM33032k.unlock();
            } catch (Throwable th2) {
                lockM33032k.unlock();
                throw th2;
            }
        } catch (SQLiteException e7) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
        } catch (IllegalStateException e8) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
        }
    }
}
