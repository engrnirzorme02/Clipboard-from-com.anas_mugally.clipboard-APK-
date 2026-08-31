package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import p177X2.AbstractC1946b;
import p283k3.C6040k;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4249i2 extends AbstractC4225f2 {

    /* JADX INFO: renamed from: e */
    private static final String[] f15819e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: c */
    private final C4241h2 f15820c;

    /* JADX INFO: renamed from: d */
    private boolean f15821d;

    C4249i2(C4164X2 c4164x2) {
        super(c4164x2);
        Context contextMo18424e = this.f15066a.mo18424e();
        this.f15066a.m18686w();
        this.f15820c = new C4241h2(this, contextMo18424e, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    /* JADX WARN: Code duplicated, block: B:75:0x012e A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #11 {all -> 0x0098, blocks: (B:30:0x008d, B:32:0x0093, B:45:0x00b6, B:47:0x00da, B:49:0x00e4, B:51:0x00ec, B:61:0x0106, B:75:0x012e, B:77:0x0134, B:78:0x0137, B:93:0x016c, B:85:0x0157), top: B:109:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:80:0x014c  */
    /* JADX WARN: Code duplicated, block: B:88:0x015e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0163 A[PHI: r8 r10 r17
      0x0163: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0180  */
    /* JADX INFO: renamed from: z */
    private final boolean m18763z(int i7, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM18772w;
        boolean z7;
        boolean z8;
        Cursor cursorRawQuery;
        mo18427h();
        boolean z9 = false;
        z9 = false;
        if (!this.f15821d) {
            C4164X2 c4164x2 = this.f15066a;
            C4278m c4278mM18686w = c4164x2.m18686w();
            C4201c2 c4201c2 = AbstractC4209d2.f15656c1;
            Cursor cursor = null;
            cursor = null;
            C4006B6 c4006b6M18752o = c4278mM18686w.m18800H(null, c4201c2) ? this.f15066a.m18670L().m18752o(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i7));
            contentValues.put("entry", bArr);
            if (c4164x2.m18686w().m18800H(null, c4201c2) && c4006b6M18752o != null) {
                contentValues.put("app_version", c4006b6M18752o.f15114c);
                contentValues.put("app_version_int", Long.valueOf(c4006b6M18752o.f15121u));
            }
            c4164x2.m18686w();
            int i8 = 0;
            int i9 = 5;
            for (int i10 = 5; i8 < i10; i10 = 5) {
                try {
                    sQLiteDatabaseM18772w = m18772w();
                    if (sQLiteDatabaseM18772w == null) {
                        this.f15821d = true;
                    } else {
                        try {
                            sQLiteDatabaseM18772w.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseM18772w.rawQuery("select count(1) from messages", null);
                            long j7 = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j7 = cursorRawQuery.getLong(z9 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorRawQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseM18772w != null) {
                                            sQLiteDatabaseM18772w.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z7 = z9 ? 1 : 0;
                                    SystemClock.sleep(i9);
                                    i9 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM18772w != null) {
                                        sQLiteDatabaseM18772w.close();
                                    }
                                    i8++;
                                    z9 = z7;
                                } catch (SQLiteFullException e7) {
                                    e = e7;
                                    z7 = z9 ? 1 : 0;
                                    this.f15066a.mo18421a().m18851o().m18835b("Error writing entry; local database full", e);
                                    this.f15821d = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM18772w != null) {
                                        sQLiteDatabaseM18772w.close();
                                    }
                                    i8++;
                                    z9 = z7;
                                } catch (SQLiteException e8) {
                                    e = e8;
                                    z7 = z9 ? 1 : 0;
                                    z8 = true;
                                    if (sQLiteDatabaseM18772w != null) {
                                        sQLiteDatabaseM18772w.endTransaction();
                                    }
                                    this.f15066a.mo18421a().m18851o().m18835b("Error writing entry to local database", e);
                                    this.f15821d = z8;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM18772w != null) {
                                        sQLiteDatabaseM18772w.close();
                                    }
                                    i8++;
                                    z9 = z7;
                                }
                            }
                            if (j7 >= 100000) {
                                c4164x2.mo18421a().m18851o().m18834a("Data loss, local db full");
                                long j8 = 100001 - j7;
                                long jDelete = sQLiteDatabaseM18772w.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j8)});
                                if (jDelete != j8) {
                                    C4297o2 c4297o2M18851o = c4164x2.mo18421a().m18851o();
                                    z7 = z9 ? 1 : 0;
                                    try {
                                        try {
                                            z8 = true;
                                            try {
                                                c4297o2M18851o.m18837d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j8), Long.valueOf(jDelete), Long.valueOf(j8 - jDelete));
                                            } catch (SQLiteFullException e9) {
                                                e = e9;
                                                this.f15066a.mo18421a().m18851o().m18835b("Error writing entry; local database full", e);
                                                this.f15821d = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM18772w != null) {
                                                    sQLiteDatabaseM18772w.close();
                                                }
                                                i8++;
                                                z9 = z7;
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                                if (sQLiteDatabaseM18772w != null && sQLiteDatabaseM18772w.inTransaction()) {
                                                    sQLiteDatabaseM18772w.endTransaction();
                                                }
                                                this.f15066a.mo18421a().m18851o().m18835b("Error writing entry to local database", e);
                                                this.f15821d = z8;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM18772w != null) {
                                                    sQLiteDatabaseM18772w.close();
                                                }
                                                i8++;
                                                z9 = z7;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i9);
                                            i9 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM18772w != null) {
                                                sQLiteDatabaseM18772w.close();
                                            }
                                            i8++;
                                            z9 = z7;
                                        }
                                    } catch (SQLiteFullException e11) {
                                        e = e11;
                                        this.f15066a.mo18421a().m18851o().m18835b("Error writing entry; local database full", e);
                                        this.f15821d = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM18772w != null) {
                                            sQLiteDatabaseM18772w.close();
                                        }
                                        i8++;
                                        z9 = z7;
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        z8 = true;
                                        if (sQLiteDatabaseM18772w != null) {
                                            sQLiteDatabaseM18772w.endTransaction();
                                        }
                                        this.f15066a.mo18421a().m18851o().m18835b("Error writing entry to local database", e);
                                        this.f15821d = z8;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM18772w != null) {
                                            sQLiteDatabaseM18772w.close();
                                        }
                                        i8++;
                                        z9 = z7;
                                    }
                                } else {
                                    z7 = z9 ? 1 : 0;
                                    z8 = true;
                                }
                            } else {
                                z7 = z9 ? 1 : 0;
                                z8 = true;
                            }
                            sQLiteDatabaseM18772w.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseM18772w.setTransactionSuccessful();
                            sQLiteDatabaseM18772w.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseM18772w.close();
                            return z8;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z7 = z9 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e13) {
                            e = e13;
                            z7 = z9 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e14) {
                            e = e14;
                            z7 = z9 ? 1 : 0;
                            z8 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z7 = z9 ? 1 : 0;
                    sQLiteDatabaseM18772w = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e15) {
                    e = e15;
                    z7 = z9 ? 1 : 0;
                    sQLiteDatabaseM18772w = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e16) {
                    e = e16;
                    z7 = z9 ? 1 : 0;
                    z8 = true;
                    sQLiteDatabaseM18772w = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseM18772w = null;
                }
            }
            boolean z10 = z9 ? 1 : 0;
            this.f15066a.mo18421a().m18859w().m18834a("Failed to write entry to local database");
            return z10;
        }
        return z9;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4225f2
    /* JADX INFO: renamed from: m */
    protected final boolean mo18463m() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m18764o() {
        int iDelete;
        mo18427h();
        try {
            SQLiteDatabase sQLiteDatabaseM18772w = m18772w();
            if (sQLiteDatabaseM18772w == null || (iDelete = sQLiteDatabaseM18772w.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f15066a.mo18421a().m18859w().m18835b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("Error resetting local analytics data. error", e7);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m18765p(C4039G c4039g) {
        Parcel parcelObtain = Parcel.obtain();
        C4047H.m18522a(c4039g, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return m18763z(0, bArrMarshall);
        }
        this.f15066a.mo18421a().m18852p().m18834a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m18766q(C4357v6 c4357v6) {
        Parcel parcelObtain = Parcel.obtain();
        C4365w6.m19247a(c4357v6, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return m18763z(1, bArrMarshall);
        }
        this.f15066a.mo18421a().m18852p().m18834a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m18767r(C4246i c4246i) {
        C4164X2 c4164x2 = this.f15066a;
        byte[] bArrM19384T = c4164x2.m18661C().m19384T(c4246i);
        if (bArrM19384T.length <= 131072) {
            return m18763z(2, bArrM19384T);
        }
        c4164x2.mo18421a().m18852p().m18834a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m18768s(C4023E c4023e) {
        C4164X2 c4164x2 = this.f15066a;
        byte[] bArrM19384T = c4164x2.m18661C().m19384T(c4023e);
        if (bArrM19384T == null) {
            c4164x2.mo18421a().m18852p().m18834a("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrM19384T.length <= 131072) {
            return m18763z(4, bArrM19384T);
        }
        c4164x2.mo18421a().m18852p().m18834a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x0338 A[Catch: all -> 0x0111, TryCatch #37 {all -> 0x0111, blocks: (B:38:0x00de, B:40:0x00e4, B:42:0x00f7, B:44:0x00fd, B:58:0x0137, B:63:0x014f, B:65:0x0154, B:183:0x0332, B:185:0x0338, B:186:0x033b, B:193:0x035d, B:201:0x0377, B:80:0x0189, B:81:0x018c, B:79:0x0185, B:89:0x019f, B:91:0x01b3, B:98:0x01ce, B:99:0x01d7, B:100:0x01da, B:96:0x01c8, B:103:0x01de, B:107:0x01f4, B:121:0x021b, B:122:0x0225, B:123:0x0228, B:119:0x0215, B:126:0x022e, B:130:0x0242, B:144:0x0267, B:146:0x0271, B:147:0x0274, B:142:0x0261, B:150:0x0279, B:151:0x0289, B:158:0x02c8, B:160:0x02e5, B:161:0x02f4), top: B:235:0x0332 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x034d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0364  */
    /* JADX WARN: Code duplicated, block: B:198:0x0369 A[PHI: r6 r11 r13 r17 r19 r21
      0x0369: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r13v9 ??) = (r13v5 ??), (r13v7 ??), (r13v10 ??) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x0389  */
    /* JADX WARN: Code duplicated, block: B:208:0x039e  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:235:0x0332 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x038f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.google.android.gms.measurement.internal.m] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX INFO: renamed from: t */
    public final List m18769t(int i7) {
        Cursor cursor;
        ?? r13;
        ?? M18772w;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j7;
        ?? r17;
        ?? r16;
        long j8;
        String string;
        C4164X2 c4164x2;
        int i8;
        int i9;
        C4023E c4023eCreateFromParcel;
        C4246i c4246iCreateFromParcel;
        C4357v6 c4357v6CreateFromParcel;
        String str = "entry";
        String str2 = "type";
        String str3 = "rowid";
        mo18427h();
        ?? r7 = 0;
        if (this.f15821d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!m18773x()) {
            return arrayList;
        }
        int i10 = 0;
        int i11 = 5;
        int i12 = 0;
        for (int i13 = 5; i12 < i13; i13 = 5) {
            try {
                M18772w = m18772w();
                try {
                    if (M18772w == 0) {
                        this.f15821d = true;
                        return r7;
                    }
                    try {
                        M18772w.beginTransaction();
                        try {
                            cursorQuery2 = M18772w.query("messages", new String[]{str3}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                            try {
                                long j9 = -1;
                                if (cursorQuery2.moveToFirst()) {
                                    j7 = cursorQuery2.getLong(i10);
                                    cursorQuery2.close();
                                } else {
                                    cursorQuery2.close();
                                    j7 = -1;
                                }
                                if (j7 != -1) {
                                    String[] strArr = new String[1];
                                    strArr[i10] = String.valueOf(j7);
                                    r16 = "rowid<?";
                                    r17 = strArr;
                                } else {
                                    ?? r18 = r7;
                                    r17 = r18;
                                    r16 = r18;
                                }
                                String[] strArr2 = {str3, str2, str};
                                C4164X2 c4164x3 = this.f15066a;
                                ?? M18686w = c4164x3.m18686w();
                                int i14 = 1;
                                C4201c2 c4201c2 = AbstractC4209d2.f15656c1;
                                boolean zM18800H = M18686w.m18800H(r7, c4201c2);
                                int i15 = 4;
                                int i16 = 3;
                                int i17 = 2;
                                if (zM18800H) {
                                    strArr2 = new String[i13];
                                    strArr2[i10] = str3;
                                    strArr2[1] = str2;
                                    strArr2[2] = str;
                                    strArr2[3] = "app_version";
                                    strArr2[4] = "app_version_int";
                                }
                                String[] strArr3 = strArr2;
                                C4164X2 c4164x4 = c4164x3;
                                cursorQuery = M18772w.query("messages", strArr3, r16, r17, null, null, "rowid asc", Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j9 = cursorQuery.getLong(i10);
                                        int i18 = cursorQuery.getInt(i14);
                                        byte[] blob = cursorQuery.getBlob(i17);
                                        try {
                                            if (c4164x4.m18686w().m18800H(null, c4201c2)) {
                                                string = cursorQuery.getString(i16);
                                                j8 = cursorQuery.getLong(i15);
                                            } else {
                                                j8 = 0;
                                                string = null;
                                            }
                                            String str4 = str;
                                            long j10 = j8;
                                            str2 = str2;
                                            if (i18 == 0) {
                                                try {
                                                    Parcel parcelObtain = Parcel.obtain();
                                                    c4164x2 = c4164x4;
                                                    try {
                                                        str3 = str3;
                                                        try {
                                                            try {
                                                                parcelObtain.unmarshall(blob, 0, blob.length);
                                                                parcelObtain.setDataPosition(0);
                                                                C4039G c4039gCreateFromParcel = C4039G.CREATOR.createFromParcel(parcelObtain);
                                                                try {
                                                                    parcelObtain.recycle();
                                                                    if (c4039gCreateFromParcel != null) {
                                                                        arrayList.add(new C6040k(c4039gCreateFromParcel, string, j10));
                                                                    }
                                                                    str = str4;
                                                                    i9 = 2;
                                                                    i8 = 3;
                                                                    i10 = 0;
                                                                } catch (SQLiteDatabaseLockedException unused) {
                                                                    str = str4;
                                                                    i10 = 0;
                                                                    SystemClock.sleep(i11);
                                                                    i11 += 20;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (M18772w != 0) {
                                                                        M18772w.close();
                                                                    }
                                                                    i12++;
                                                                    i10 = i10;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r7 = 0;
                                                                } catch (SQLiteFullException e7) {
                                                                    e = e7;
                                                                    str = str4;
                                                                    i10 = 0;
                                                                    this.f15066a.mo18421a().m18851o().m18835b("Error reading entries from local database", e);
                                                                    this.f15821d = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (M18772w != 0) {
                                                                        M18772w.close();
                                                                    }
                                                                    i12++;
                                                                    i10 = i10;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r7 = 0;
                                                                } catch (SQLiteException e8) {
                                                                    e = e8;
                                                                    str = str4;
                                                                    i10 = 0;
                                                                    if (M18772w != 0) {
                                                                        try {
                                                                            if (M18772w.inTransaction()) {
                                                                                M18772w.endTransaction();
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            cursor = cursorQuery;
                                                                            r13 = M18772w;
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                            if (r13 != 0) {
                                                                                r13.close();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    this.f15066a.mo18421a().m18851o().m18835b("Error reading entries from local database", e);
                                                                    this.f15821d = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (M18772w != 0) {
                                                                        M18772w.close();
                                                                    }
                                                                    i12++;
                                                                    i10 = i10;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r7 = 0;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                parcelObtain.recycle();
                                                                throw th;
                                                            }
                                                        } catch (AbstractC1946b.a unused2) {
                                                            this.f15066a.mo18421a().m18851o().m18834a("Failed to load event from local database");
                                                            parcelObtain.recycle();
                                                        }
                                                    } catch (AbstractC1946b.a unused3) {
                                                        str3 = str3;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused4) {
                                                    str3 = str3;
                                                } catch (SQLiteFullException e9) {
                                                    e = e9;
                                                    str3 = str3;
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    str3 = str3;
                                                }
                                            } else {
                                                c4164x2 = c4164x4;
                                                str3 = str3;
                                                if (i18 == 1) {
                                                    Parcel parcelObtain2 = Parcel.obtain();
                                                    try {
                                                        try {
                                                            parcelObtain2.unmarshall(blob, 0, blob.length);
                                                            parcelObtain2.setDataPosition(0);
                                                            c4357v6CreateFromParcel = C4357v6.CREATOR.createFromParcel(parcelObtain2);
                                                            parcelObtain2.recycle();
                                                        } catch (Throwable th4) {
                                                            parcelObtain2.recycle();
                                                            throw th4;
                                                        }
                                                    } catch (AbstractC1946b.a unused5) {
                                                        this.f15066a.mo18421a().m18851o().m18834a("Failed to load user property from local database");
                                                        parcelObtain2.recycle();
                                                        c4357v6CreateFromParcel = null;
                                                    }
                                                    if (c4357v6CreateFromParcel != null) {
                                                        arrayList.add(new C6040k(c4357v6CreateFromParcel, string, j10));
                                                    }
                                                    str = str4;
                                                    i9 = 2;
                                                    i8 = 3;
                                                    i10 = 0;
                                                } else {
                                                    i9 = 2;
                                                    if (i18 == 2) {
                                                        Parcel parcelObtain3 = Parcel.obtain();
                                                        try {
                                                            str = str4;
                                                            try {
                                                                try {
                                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain3.setDataPosition(0);
                                                                    c4246iCreateFromParcel = C4246i.CREATOR.createFromParcel(parcelObtain3);
                                                                    try {
                                                                        parcelObtain3.recycle();
                                                                        if (c4246iCreateFromParcel != null) {
                                                                            arrayList.add(new C6040k(c4246iCreateFromParcel, string, j10));
                                                                        }
                                                                        i8 = 3;
                                                                        i10 = 0;
                                                                    } catch (SQLiteDatabaseLockedException unused6) {
                                                                        i10 = 0;
                                                                        SystemClock.sleep(i11);
                                                                        i11 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (M18772w != 0) {
                                                                            M18772w.close();
                                                                        }
                                                                        i12++;
                                                                        i10 = i10;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r7 = 0;
                                                                    } catch (SQLiteFullException e11) {
                                                                        e = e11;
                                                                        i10 = 0;
                                                                        this.f15066a.mo18421a().m18851o().m18835b("Error reading entries from local database", e);
                                                                        this.f15821d = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (M18772w != 0) {
                                                                            M18772w.close();
                                                                        }
                                                                        i12++;
                                                                        i10 = i10;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r7 = 0;
                                                                    } catch (SQLiteException e12) {
                                                                        e = e12;
                                                                        i10 = 0;
                                                                        if (M18772w != 0) {
                                                                            if (M18772w.inTransaction()) {
                                                                                M18772w.endTransaction();
                                                                            }
                                                                        }
                                                                        this.f15066a.mo18421a().m18851o().m18835b("Error reading entries from local database", e);
                                                                        this.f15821d = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (M18772w != 0) {
                                                                            M18772w.close();
                                                                        }
                                                                        i12++;
                                                                        i10 = i10;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r7 = 0;
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    parcelObtain3.recycle();
                                                                    throw th;
                                                                }
                                                            } catch (AbstractC1946b.a unused7) {
                                                                this.f15066a.mo18421a().m18851o().m18834a("Failed to load conditional user property from local database");
                                                                parcelObtain3.recycle();
                                                                c4246iCreateFromParcel = null;
                                                            }
                                                        } catch (AbstractC1946b.a unused8) {
                                                            str = str4;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            str = str4;
                                                        }
                                                    } else {
                                                        str = str4;
                                                        if (i18 == 4) {
                                                            Parcel parcelObtain4 = Parcel.obtain();
                                                            try {
                                                                i10 = 0;
                                                                try {
                                                                    try {
                                                                        parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                        parcelObtain4.setDataPosition(0);
                                                                        c4023eCreateFromParcel = C4023E.CREATOR.createFromParcel(parcelObtain4);
                                                                        try {
                                                                            parcelObtain4.recycle();
                                                                            if (c4023eCreateFromParcel != null) {
                                                                                arrayList.add(new C6040k(c4023eCreateFromParcel, string, j10));
                                                                            }
                                                                            i8 = 3;
                                                                        } catch (SQLiteDatabaseLockedException unused9) {
                                                                            SystemClock.sleep(i11);
                                                                            i11 += 20;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (M18772w != 0) {
                                                                                M18772w.close();
                                                                            }
                                                                            i12++;
                                                                            i10 = i10;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r7 = 0;
                                                                        } catch (SQLiteFullException e13) {
                                                                            e = e13;
                                                                            this.f15066a.mo18421a().m18851o().m18835b("Error reading entries from local database", e);
                                                                            this.f15821d = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (M18772w != 0) {
                                                                                M18772w.close();
                                                                            }
                                                                            i12++;
                                                                            i10 = i10;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r7 = 0;
                                                                        } catch (SQLiteException e14) {
                                                                            e = e14;
                                                                            if (M18772w != 0) {
                                                                                if (M18772w.inTransaction()) {
                                                                                    M18772w.endTransaction();
                                                                                }
                                                                            }
                                                                            this.f15066a.mo18421a().m18851o().m18835b("Error reading entries from local database", e);
                                                                            this.f15821d = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (M18772w != 0) {
                                                                                M18772w.close();
                                                                            }
                                                                            i12++;
                                                                            i10 = i10;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r7 = 0;
                                                                        }
                                                                    } catch (AbstractC1946b.a unused10) {
                                                                        this.f15066a.mo18421a().m18851o().m18834a("Failed to load default event parameters from local database");
                                                                        parcelObtain4.recycle();
                                                                        c4023eCreateFromParcel = null;
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    parcelObtain4.recycle();
                                                                    throw th;
                                                                }
                                                            } catch (AbstractC1946b.a unused11) {
                                                                i10 = 0;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                            }
                                                        } else {
                                                            i8 = 3;
                                                            i10 = 0;
                                                            if (i18 == 3) {
                                                                this.f15066a.mo18421a().m18859w().m18834a("Skipping app launch break");
                                                            } else {
                                                                this.f15066a.mo18421a().m18851o().m18834a("Unknown record type in local database");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i16 = i8;
                                            i10 = i10;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                            i14 = 1;
                                            i15 = 4;
                                            i17 = i9;
                                            c4164x4 = c4164x2;
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteFullException e15) {
                                            e = e15;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteException e16) {
                                            e = e16;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused13) {
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i10 = i10;
                                    } catch (SQLiteFullException e17) {
                                        e = e17;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i10 = i10;
                                    } catch (SQLiteException e18) {
                                        e = e18;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i10 = i10;
                                    }
                                }
                                if (M18772w.delete("messages", "rowid <= ?", new String[]{Long.toString(j9)}) < arrayList.size()) {
                                    this.f15066a.mo18421a().m18851o().m18834a("Fewer entries removed from local database than expected");
                                }
                                M18772w.setTransactionSuccessful();
                                M18772w.endTransaction();
                                cursorQuery.close();
                                M18772w.close();
                                return arrayList;
                            } catch (Throwable th9) {
                                th = th9;
                                if (cursorQuery2 != null) {
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused14) {
                                        cursorQuery = null;
                                        SystemClock.sleep(i11);
                                        i11 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (M18772w != 0) {
                                            M18772w.close();
                                        }
                                        i12++;
                                        i10 = i10;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r7 = 0;
                                    } catch (SQLiteFullException e19) {
                                        e = e19;
                                        M18772w = M18772w;
                                        cursorQuery = null;
                                        this.f15066a.mo18421a().m18851o().m18835b("Error reading entries from local database", e);
                                        this.f15821d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (M18772w != 0) {
                                            M18772w.close();
                                        }
                                        i12++;
                                        i10 = i10;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r7 = 0;
                                    } catch (SQLiteException e20) {
                                        e = e20;
                                        M18772w = M18772w;
                                        cursorQuery = null;
                                        if (M18772w != 0) {
                                            if (M18772w.inTransaction()) {
                                                M18772w.endTransaction();
                                            }
                                        }
                                        this.f15066a.mo18421a().m18851o().m18835b("Error reading entries from local database", e);
                                        this.f15821d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (M18772w != 0) {
                                            M18772w.close();
                                        }
                                        i12++;
                                        i10 = i10;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r7 = 0;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            cursorQuery2 = null;
                        }
                    } catch (SQLiteDatabaseLockedException unused15) {
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i10 = i10;
                    } catch (SQLiteFullException e21) {
                        e = e21;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i10 = i10;
                        M18772w = M18772w;
                    } catch (SQLiteException e22) {
                        e = e22;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i10 = i10;
                        M18772w = M18772w;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    cursor = null;
                    r13 = M18772w;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (r13 != 0) {
                        r13.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused16) {
                str = str;
                str2 = str2;
                str3 = str3;
                i10 = i10;
                M18772w = 0;
            } catch (SQLiteFullException e23) {
                e = e23;
                str = str;
                str2 = str2;
                str3 = str3;
                i10 = i10;
                M18772w = 0;
            } catch (SQLiteException e24) {
                e = e24;
                str = str;
                str2 = str2;
                str3 = str3;
                i10 = i10;
                M18772w = 0;
            } catch (Throwable th12) {
                th = th12;
                cursor = null;
                r13 = 0;
            }
        }
        this.f15066a.mo18421a().m18854r().m18834a("Failed to read events from database in reasonable time");
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m18770u() {
        return m18763z(3, new byte[0]);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b A[PHI: r4
      0x006b: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:34:0x007e, B:31:0x0069, B:28:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: v */
    public final boolean m18771v() {
        mo18427h();
        if (!this.f15821d && m18773x()) {
            int i7 = 5;
            for (int i8 = 0; i8 < 5; i8++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseM18772w = m18772w();
                            if (sQLiteDatabaseM18772w != null) {
                                sQLiteDatabaseM18772w.beginTransaction();
                                sQLiteDatabaseM18772w.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                sQLiteDatabaseM18772w.setTransactionSuccessful();
                                sQLiteDatabaseM18772w.endTransaction();
                                sQLiteDatabaseM18772w.close();
                                return true;
                            }
                            this.f15821d = true;
                        } catch (SQLiteException e7) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.f15066a.mo18421a().m18851o().m18835b("Error deleting app launch break from local database", e7);
                            this.f15821d = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i7);
                        i7 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e8) {
                    this.f15066a.mo18421a().m18851o().m18835b("Error deleting app launch break from local database", e8);
                    this.f15821d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f15066a.mo18421a().m18854r().m18834a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    final SQLiteDatabase m18772w() {
        if (this.f15821d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f15820c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f15821d = true;
        return null;
    }

    /* JADX INFO: renamed from: x */
    final boolean m18773x() {
        C4164X2 c4164x2 = this.f15066a;
        Context contextMo18424e = c4164x2.mo18424e();
        c4164x2.m18686w();
        return contextMo18424e.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
