package p342r4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p006A4.C0024i;
import p022C4.C0144c;
import p030D4.AbstractC0211o;
import p030D4.C0198b;
import p030D4.C0199c;
import p030D4.C0203g;
import p030D4.C0209m;
import p030D4.InterfaceC0210n;
import p046F4.AbstractC0432b;
import p334q4.C6835b;
import p374v4.AbstractC7241f;
import p374v4.C7230A;
import p374v4.C7236a;
import p374v4.C7245j;
import p390x4.C7412g;
import p390x4.C7413h;
import p390x4.InterfaceC7411f;
import p398y4.AbstractC7544e;
import p398y4.AbstractC7551l;
import p398y4.C7543d;
import p398y4.C7546g;

/* JADX INFO: renamed from: r4.n */
/* JADX INFO: loaded from: classes.dex */
public class C6914n implements InterfaceC7411f {

    /* JADX INFO: renamed from: e */
    private static final Charset f27745e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    private final SQLiteDatabase f27746a;

    /* JADX INFO: renamed from: b */
    private final C0144c f27747b;

    /* JADX INFO: renamed from: c */
    private boolean f27748c;

    /* JADX INFO: renamed from: d */
    private long f27749d = 0;

    /* JADX INFO: renamed from: r4.n$a */
    class a implements C7543d.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7543d f27750a;

        a(C7543d c7543d) {
            this.f27750a = c7543d;
        }

        @Override // p398y4.C7543d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer mo30316a(C7245j c7245j, Void r7, Integer num) {
            return Integer.valueOf(this.f27750a.m33197n(c7245j) == null ? num.intValue() + 1 : num.intValue());
        }
    }

    /* JADX INFO: renamed from: r4.n$b */
    class b implements C7543d.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7543d f27752a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f27753b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C7245j f27754c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC0210n f27755d;

        b(C7543d c7543d, List list, C7245j c7245j, InterfaceC0210n interfaceC0210n) {
            this.f27752a = c7543d;
            this.f27753b = list;
            this.f27754c = c7245j;
            this.f27755d = interfaceC0210n;
        }

        @Override // p398y4.C7543d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo30316a(C7245j c7245j, Void r7, Void r8) {
            if (this.f27752a.m33197n(c7245j) != null) {
                return null;
            }
            this.f27753b.add(new C7546g(this.f27754c.m32000q(c7245j), this.f27755d.mo1013r(c7245j)));
            return null;
        }
    }

    /* JADX INFO: renamed from: r4.n$c */
    private static class c extends SQLiteOpenHelper {
        public c(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        }

        /* JADX INFO: renamed from: d */
        private void m30319d(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            AbstractC7551l.m33234g(i8 == 2, "Why is onUpgrade() called with a different version?");
            if (i7 > 1) {
                throw new AssertionError("We don't handle upgrading to " + i8);
            }
            m30319d(sQLiteDatabase, "serverCache");
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            m30319d(sQLiteDatabase, "complete");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
        }
    }

    public C6914n(Context context, AbstractC7241f abstractC7241f, String str) {
        try {
            String strEncode = URLEncoder.encode(str, "utf-8");
            this.f27747b = abstractC7241f.m31972q("Persistence");
            this.f27746a = m30276B(context, strEncode);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: A */
    private Cursor m30275A(C7245j c7245j, String[] strArr) {
        String strM30279E = m30279E(c7245j);
        String strM30278D = m30278D(strM30279E);
        String[] strArr2 = new String[c7245j.size() + 3];
        String str = m30290v(c7245j, strArr2) + " OR (path > ? AND path < ?)";
        strArr2[c7245j.size() + 1] = strM30279E;
        strArr2[c7245j.size() + 2] = strM30278D;
        return this.f27746a.query("serverCache", strArr, str, strArr2, null, null, "path");
    }

    /* JADX INFO: renamed from: B */
    private SQLiteDatabase m30276B(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new c(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (SQLiteException e7) {
            if (e7 instanceof SQLiteDatabaseLockedException) {
                throw new C6835b("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e7);
            }
            throw e7;
        }
    }

    /* JADX INFO: renamed from: C */
    private String m30277C(C7245j c7245j, int i7) {
        return m30279E(c7245j) + String.format(Locale.US, ".part-%04d", Integer.valueOf(i7));
    }

    /* JADX INFO: renamed from: D */
    private static String m30278D(String str) {
        AbstractC7551l.m33234g(str.endsWith("/"), "Path keys must end with a '/'");
        return str.substring(0, str.length() - 1) + '0';
    }

    /* JADX INFO: renamed from: E */
    private static String m30279E(C7245j c7245j) {
        if (c7245j.isEmpty()) {
            return "/";
        }
        return c7245j.toString() + "/";
    }

    /* JADX INFO: renamed from: F */
    private void m30280F(C7245j c7245j, C7245j c7245j2, C7543d c7543d, C7543d c7543d2, C7412g c7412g, List list) {
        if (c7543d.getValue() == null) {
            for (Map.Entry entry : c7543d.m33199q()) {
                C0198b c0198b = (C0198b) entry.getKey();
                m30280F(c7245j, c7245j2.m31999p(c0198b), (C7543d) entry.getValue(), c7543d2.m33198p(c0198b), c7412g.m32750a((C0198b) entry.getKey()), list);
            }
            return;
        }
        Integer num = (Integer) c7412g.m32751b(0, new a(c7543d2));
        if (num.intValue() > 0) {
            C7245j c7245jM32000q = c7245j.m32000q(c7245j2);
            if (this.f27747b.m627f()) {
                this.f27747b.m624b(String.format(Locale.US, "Need to rewrite %d nodes below path %s", num, c7245jM32000q), new Object[0]);
            }
            c7412g.m32751b(null, new b(c7543d2, list, c7245j2, m30294z(c7245jM32000q)));
        }
    }

    /* JADX INFO: renamed from: G */
    private int m30281G(String str, C7245j c7245j) {
        String strM30279E = m30279E(c7245j);
        return this.f27746a.delete(str, "path >= ? AND path < ?", new String[]{strM30279E, m30278D(strM30279E)});
    }

    /* JADX INFO: renamed from: H */
    private int m30282H(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        long jM33208b = AbstractC7544e.m33208b(interfaceC0210n);
        if (!(interfaceC0210n instanceof C0199c) || jM33208b <= 16384) {
            m30283I(c7245j, interfaceC0210n);
            return 1;
        }
        int iM30282H = 0;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", c7245j, Long.valueOf(jM33208b), 16384), new Object[0]);
        }
        Iterator it = interfaceC0210n.iterator();
        while (it.hasNext()) {
            C0209m c0209m = (C0209m) it.next();
            iM30282H += m30282H(c7245j.m31999p(c0209m.m1082c()), c0209m.m1083d());
        }
        if (!interfaceC0210n.mo1006i().isEmpty()) {
            m30283I(c7245j.m31999p(C0198b.m991n()), interfaceC0210n.mo1006i());
            iM30282H++;
        }
        m30283I(c7245j, C0203g.m1050w());
        return iM30282H + 1;
    }

    /* JADX INFO: renamed from: I */
    private void m30283I(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        byte[] bArrM30285K = m30285K(interfaceC0210n.mo1001N(true));
        if (bArrM30285K.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", m30279E(c7245j));
            contentValues.put("value", bArrM30285K);
            this.f27746a.insertWithOnConflict("serverCache", null, contentValues, 5);
            return;
        }
        List listM30286L = m30286L(bArrM30285K, 262144);
        if (this.f27747b.m627f()) {
            this.f27747b.m624b("Saving huge leaf node with " + listM30286L.size() + " parts.", new Object[0]);
        }
        for (int i7 = 0; i7 < listM30286L.size(); i7++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("path", m30277C(c7245j, i7));
            contentValues2.put("value", (byte[]) listM30286L.get(i7));
            this.f27746a.insertWithOnConflict("serverCache", null, contentValues2, 5);
        }
    }

    /* JADX INFO: renamed from: J */
    private void m30284J(C7245j c7245j, long j7, String str, byte[] bArr) {
        m30289O();
        this.f27746a.delete("writes", "id = ?", new String[]{String.valueOf(j7)});
        if (bArr.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j7));
            contentValues.put("path", m30279E(c7245j));
            contentValues.put("type", str);
            contentValues.put("part", (Integer) null);
            contentValues.put("node", bArr);
            this.f27746a.insertWithOnConflict("writes", null, contentValues, 5);
            return;
        }
        List listM30286L = m30286L(bArr, 262144);
        for (int i7 = 0; i7 < listM30286L.size(); i7++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("id", Long.valueOf(j7));
            contentValues2.put("path", m30279E(c7245j));
            contentValues2.put("type", str);
            contentValues2.put("part", Integer.valueOf(i7));
            contentValues2.put("node", (byte[]) listM30286L.get(i7));
            this.f27746a.insertWithOnConflict("writes", null, contentValues2, 5);
        }
    }

    /* JADX INFO: renamed from: K */
    private byte[] m30285K(Object obj) {
        try {
            return AbstractC0432b.m1864d(obj).getBytes(f27745e);
        } catch (IOException e7) {
            throw new RuntimeException("Could not serialize leaf node", e7);
        }
    }

    /* JADX INFO: renamed from: L */
    private static List m30286L(byte[] bArr, int i7) {
        int length = ((bArr.length - 1) / i7) + 1;
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * i7;
            int iMin = Math.min(i7, bArr.length - i9);
            byte[] bArr2 = new byte[iMin];
            System.arraycopy(bArr, i9, bArr2, 0, iMin);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    private int m30287M(C7245j c7245j, List list, int i7) {
        int i8 = i7 + 1;
        String strM30279E = m30279E(c7245j);
        if (!((String) list.get(i7)).startsWith(strM30279E)) {
            throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
        }
        while (i8 < list.size() && ((String) list.get(i8)).equals(m30277C(c7245j, i8 - i7))) {
            i8++;
        }
        if (i8 < list.size()) {
            if (((String) list.get(i8)).startsWith(strM30279E + ".part-")) {
                throw new IllegalStateException("Run did not finish with all parts");
            }
        }
        return i8 - i7;
    }

    /* JADX INFO: renamed from: N */
    private void m30288N(C7245j c7245j, InterfaceC0210n interfaceC0210n, boolean z7) {
        int iM30282H;
        int iM30281G;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z7) {
            Iterator it = interfaceC0210n.iterator();
            int iM30282H2 = 0;
            int iM30281G2 = 0;
            while (it.hasNext()) {
                C0209m c0209m = (C0209m) it.next();
                iM30281G2 += m30281G("serverCache", c7245j.m31999p(c0209m.m1082c()));
                iM30282H2 += m30282H(c7245j.m31999p(c0209m.m1082c()), c0209m.m1083d());
            }
            iM30282H = iM30282H2;
            iM30281G = iM30281G2;
        } else {
            iM30281G = m30281G("serverCache", c7245j);
            iM30282H = m30282H(c7245j, interfaceC0210n);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", Integer.valueOf(iM30282H), Integer.valueOf(iM30281G), c7245j.toString(), Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: O */
    private void m30289O() {
        AbstractC7551l.m33234g(this.f27748c, "Transaction expected to already be in progress.");
    }

    /* JADX INFO: renamed from: v */
    private static String m30290v(C7245j c7245j, String[] strArr) {
        int i7 = 0;
        AbstractC7551l.m33233f(strArr.length >= c7245j.size() + 1);
        StringBuilder sb = new StringBuilder("(");
        while (!c7245j.isEmpty()) {
            sb.append("path");
            sb.append(" = ? OR ");
            strArr[i7] = m30279E(c7245j);
            c7245j = c7245j.m31995A();
            i7++;
        }
        sb.append("path");
        sb.append(" = ?)");
        strArr[i7] = m30279E(C7245j.m31994y());
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    private String m30291w(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (!z7) {
                sb.append(",");
            }
            sb.append(jLongValue);
            z7 = false;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    private InterfaceC0210n m30292x(byte[] bArr) {
        try {
            return AbstractC0211o.m1085a(AbstractC0432b.m1862b(new String(bArr, f27745e)));
        } catch (IOException e7) {
            throw new RuntimeException("Could not deserialize node: " + new String(bArr, f27745e), e7);
        }
    }

    /* JADX INFO: renamed from: y */
    private byte[] m30293y(List list) {
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        byte[] bArr = new byte[length];
        Iterator it2 = list.iterator();
        int length2 = 0;
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: z */
    private InterfaceC0210n m30294z(C7245j c7245j) {
        InterfaceC0210n interfaceC0210nM30292x;
        C7245j c7245j2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorM30275A = m30275A(c7245j, new String[]{"path", "value"});
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        while (cursorM30275A.moveToNext()) {
            try {
                arrayList.add(cursorM30275A.getString(0));
                arrayList2.add(cursorM30275A.getBlob(1));
            } catch (Throwable th) {
                cursorM30275A.close();
                throw th;
            }
        }
        cursorM30275A.close();
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        InterfaceC0210n interfaceC0210nM1050w = C0203g.m1050w();
        HashMap map = new HashMap();
        int i7 = 0;
        boolean z7 = false;
        while (i7 < arrayList2.size()) {
            long j7 = jCurrentTimeMillis;
            if (((String) arrayList.get(i7)).endsWith(".part-0000")) {
                String str = (String) arrayList.get(i7);
                c7245j2 = new C7245j(str.substring(0, str.length() - 10));
                int iM30287M = m30287M(c7245j2, arrayList, i7);
                if (this.f27747b.m627f()) {
                    this.f27747b.m624b("Loading split node with " + iM30287M + " parts.", new Object[0]);
                }
                int i8 = i7 + iM30287M;
                interfaceC0210nM30292x = m30292x(m30293y(arrayList2.subList(i7, i8)));
                i7 = i8 - 1;
            } else {
                interfaceC0210nM30292x = m30292x((byte[]) arrayList2.get(i7));
                c7245j2 = new C7245j((String) arrayList.get(i7));
            }
            if (c7245j2.m32003x() != null && c7245j2.m32003x().m996q()) {
                map.put(c7245j2, interfaceC0210nM30292x);
            } else if (c7245j2.m32002w(c7245j)) {
                AbstractC7551l.m33234g(!z7, "Descendants of path must come after ancestors.");
                interfaceC0210nM1050w = interfaceC0210nM30292x.mo1013r(C7245j.m31990B(c7245j2, c7245j));
            } else {
                if (!c7245j.m32002w(c7245j2)) {
                    throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", c7245j2, c7245j));
                }
                interfaceC0210nM1050w = interfaceC0210nM1050w.mo1015u(C7245j.m31990B(c7245j, c7245j2), interfaceC0210nM30292x);
                z7 = true;
            }
            i7++;
            jCurrentTimeMillis = j7;
            jCurrentTimeMillis2 = jCurrentTimeMillis2;
        }
        long j8 = jCurrentTimeMillis;
        long j9 = jCurrentTimeMillis2;
        InterfaceC0210n interfaceC0210nMo1015u = interfaceC0210nM1050w;
        for (Map.Entry entry : map.entrySet()) {
            interfaceC0210nMo1015u = interfaceC0210nMo1015u.mo1015u(C7245j.m31990B(c7245j, (C7245j) entry.getKey()), (InterfaceC0210n) entry.getValue());
        }
        long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis5;
        long jCurrentTimeMillis7 = System.currentTimeMillis() - j8;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", Integer.valueOf(arrayList2.size()), Integer.valueOf(AbstractC7544e.m33209c(interfaceC0210nMo1015u)), c7245j, Long.valueOf(jCurrentTimeMillis7), Long.valueOf(j9), Long.valueOf(jCurrentTimeMillis4), Long.valueOf(jCurrentTimeMillis6)), new Object[0]);
        }
        return interfaceC0210nMo1015u;
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: a */
    public void mo30295a(long j7) {
        m30289O();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iDelete = this.f27746a.delete("writes", "id = ?", new String[]{String.valueOf(j7)});
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Deleted %d write(s) with writeId %d in %dms", Integer.valueOf(iDelete), Long.valueOf(j7), Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: b */
    public void mo30296b(C7245j c7245j, InterfaceC0210n interfaceC0210n, long j7) {
        m30289O();
        long jCurrentTimeMillis = System.currentTimeMillis();
        m30284J(c7245j, j7, "o", m30285K(interfaceC0210n.mo1001N(true)));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Persisted user overwrite in %dms", Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: c */
    public void mo30297c() {
        AbstractC7551l.m33234g(!this.f27748c, "runInTransaction called when an existing transaction is already in progress.");
        if (this.f27747b.m627f()) {
            this.f27747b.m624b("Starting transaction.", new Object[0]);
        }
        this.f27746a.beginTransaction();
        this.f27748c = true;
        this.f27749d = System.currentTimeMillis();
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: d */
    public void mo30298d(C7245j c7245j, C7236a c7236a, long j7) {
        m30289O();
        long jCurrentTimeMillis = System.currentTimeMillis();
        m30284J(c7245j, j7, "m", m30285K(c7236a.m31942x(true)));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Persisted user merge in %dms", Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: e */
    public List mo30299e() {
        byte[] bArrM30293y;
        C7230A c7230a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorQuery = this.f27746a.query("writes", new String[]{"id", "path", "type", "part", "node"}, null, null, null, null, "id, part");
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    long j7 = cursorQuery.getLong(0);
                    C7245j c7245j = new C7245j(cursorQuery.getString(1));
                    String string = cursorQuery.getString(2);
                    if (cursorQuery.isNull(3)) {
                        bArrM30293y = cursorQuery.getBlob(4);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            arrayList2.add(cursorQuery.getBlob(4));
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                        } while (cursorQuery.getLong(0) == j7);
                        cursorQuery.moveToPrevious();
                        bArrM30293y = m30293y(arrayList2);
                    }
                    Object objM1862b = AbstractC0432b.m1862b(new String(bArrM30293y, f27745e));
                    if ("o".equals(string)) {
                        c7230a = new C7230A(j7, c7245j, AbstractC0211o.m1085a(objM1862b), true);
                    } else {
                        if (!"m".equals(string)) {
                            throw new IllegalStateException("Got invalid write type: " + string);
                        }
                        c7230a = new C7230A(j7, c7245j, C7236a.m31932q((Map) objM1862b));
                    }
                    arrayList.add(c7230a);
                } catch (IOException e7) {
                    throw new RuntimeException("Failed to load writes", e7);
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Loaded %d writes in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
        cursorQuery.close();
        return arrayList;
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: f */
    public void mo30300f(long j7) {
        m30289O();
        String strValueOf = String.valueOf(j7);
        this.f27746a.delete("trackedQueries", "id = ?", new String[]{strValueOf});
        this.f27746a.delete("trackedKeys", "id = ?", new String[]{strValueOf});
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: g */
    public Set mo30301g(long j7) {
        return mo30306l(Collections.singleton(Long.valueOf(j7)));
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: h */
    public void mo30302h() {
        this.f27746a.setTransactionSuccessful();
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: i */
    public InterfaceC0210n mo30303i(C7245j c7245j) {
        return m30294z(c7245j);
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: j */
    public void mo30304j() {
        this.f27746a.endTransaction();
        this.f27748c = false;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f27749d;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Transaction completed. Elapsed: %dms", Long.valueOf(jCurrentTimeMillis)), new Object[0]);
        }
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: k */
    public void mo30305k(C7245j c7245j, C7412g c7412g) {
        C6914n c6914n;
        int size;
        int size2;
        if (c7412g.m32754e()) {
            m30289O();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Cursor cursorM30275A = m30275A(c7245j, new String[]{"rowid", "path"});
            C7543d c7543d = new C7543d(null);
            C7543d c7543d2 = new C7543d(null);
            while (cursorM30275A.moveToNext()) {
                long j7 = cursorM30275A.getLong(0);
                C7245j c7245j2 = new C7245j(cursorM30275A.getString(1));
                if (c7245j.m32002w(c7245j2)) {
                    C7245j c7245jM31990B = C7245j.m31990B(c7245j, c7245j2);
                    if (c7412g.m32756g(c7245jM31990B)) {
                        c7543d = c7543d.m33204z(c7245jM31990B, Long.valueOf(j7));
                    } else if (c7412g.m32755f(c7245jM31990B)) {
                        c7543d2 = c7543d2.m33204z(c7245jM31990B, Long.valueOf(j7));
                    } else {
                        this.f27747b.m628i("We are pruning at " + c7245j + " and have data at " + c7245j2 + " that isn't marked for pruning or keeping. Ignoring.");
                    }
                } else {
                    this.f27747b.m628i("We are pruning at " + c7245j + " but we have data stored higher up at " + c7245j2 + ". Ignoring.");
                }
            }
            if (c7543d.isEmpty()) {
                c6914n = this;
                size = 0;
                size2 = 0;
            } else {
                ArrayList<C7546g> arrayList = new ArrayList();
                c6914n = this;
                c6914n.m30280F(c7245j, C7245j.m31994y(), c7543d, c7543d2, c7412g, arrayList);
                Collection collectionM33191C = c7543d.m33191C();
                c6914n.f27746a.delete("serverCache", "rowid IN (" + m30291w(collectionM33191C) + ")", null);
                for (C7546g c7546g : arrayList) {
                    m30282H(c7245j.m32000q((C7245j) c7546g.m33211a()), (InterfaceC0210n) c7546g.m33212b());
                }
                size = collectionM33191C.size();
                size2 = arrayList.size();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (c6914n.f27747b.m627f()) {
                c6914n.f27747b.m624b(String.format(Locale.US, "Pruned %d rows with %d nodes resaved in %dms", Integer.valueOf(size), Integer.valueOf(size2), Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
            }
        }
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: l */
    public Set mo30306l(Set set) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorQuery = this.f27746a.query(true, "trackedKeys", new String[]{"key"}, "id IN (" + m30291w(set) + ")", null, null, null, null, null);
        HashSet hashSet = new HashSet();
        while (cursorQuery.moveToNext()) {
            try {
                hashSet.add(C0198b.m988j(cursorQuery.getString(0)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Loaded %d tracked queries keys for tracked queries %s in %dms", Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
        cursorQuery.close();
        return hashSet;
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: m */
    public void mo30307m(C7245j c7245j, C7236a c7236a) {
        m30289O();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = c7236a.iterator();
        int iM30281G = 0;
        int iM30282H = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM30281G += m30281G("serverCache", c7245j.m32000q((C7245j) entry.getKey()));
            iM30282H += m30282H(c7245j.m32000q((C7245j) entry.getKey()), (InterfaceC0210n) entry.getValue());
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", Integer.valueOf(iM30282H), Integer.valueOf(iM30281G), c7245j.toString(), Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: n */
    public void mo30308n(long j7) {
        m30289O();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.FALSE);
        contentValues.put("lastUse", Long.valueOf(j7));
        this.f27746a.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Reset active tracked queries in %dms", Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: o */
    public void mo30309o(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        m30289O();
        m30288N(c7245j, interfaceC0210n, true);
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: p */
    public void mo30310p(long j7, Set set) {
        m30289O();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f27746a.delete("trackedKeys", "id = ?", new String[]{String.valueOf(j7)});
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0198b c0198b = (C0198b) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j7));
            contentValues.put("key", c0198b.m992d());
            this.f27746a.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Set %d tracked query keys for tracked query %d in %dms", Integer.valueOf(set.size()), Long.valueOf(j7), Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: q */
    public void mo30311q(C7413h c7413h) {
        m30289O();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(c7413h.f29668a));
        contentValues.put("path", m30279E(c7413h.f29669b.m138e()));
        contentValues.put("queryParams", c7413h.f29669b.m137d().m132q());
        contentValues.put("lastUse", Long.valueOf(c7413h.f29670c));
        contentValues.put("complete", Boolean.valueOf(c7413h.f29671d));
        contentValues.put("active", Boolean.valueOf(c7413h.f29672e));
        this.f27746a.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Saved new tracked query in %dms", Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: r */
    public void mo30312r(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        m30289O();
        m30288N(c7245j, interfaceC0210n, false);
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: s */
    public long mo30313s() {
        Cursor cursorRawQuery = this.f27746a.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", "value", "path", "serverCache"), null);
        try {
            if (!cursorRawQuery.moveToFirst()) {
                throw new IllegalStateException("Couldn't read database result!");
            }
            long j7 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j7;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: t */
    public List mo30314t() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorQuery = this.f27746a.query("trackedQueries", new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"}, null, null, null, null, "id");
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    arrayList.add(new C7413h(cursorQuery.getLong(0), C0024i.m135b(new C7245j(cursorQuery.getString(1)), AbstractC0432b.m1861a(cursorQuery.getString(2))), cursorQuery.getLong(3), cursorQuery.getInt(4) != 0, cursorQuery.getInt(5) != 0));
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Loaded %d tracked queries in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
        cursorQuery.close();
        return arrayList;
    }

    @Override // p390x4.InterfaceC7411f
    /* JADX INFO: renamed from: u */
    public void mo30315u(long j7, Set set, Set set2) {
        m30289O();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strValueOf = String.valueOf(j7);
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            this.f27746a.delete("trackedKeys", "id = ? AND key = ?", new String[]{strValueOf, ((C0198b) it.next()).m992d()});
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            C0198b c0198b = (C0198b) it2.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j7));
            contentValues.put("key", c0198b.m992d());
            this.f27746a.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f27747b.m627f()) {
            this.f27747b.m624b(String.format(Locale.US, "Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j7), Long.valueOf(jCurrentTimeMillis2)), new Object[0]);
        }
    }
}
