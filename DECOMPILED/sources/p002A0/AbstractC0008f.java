package p002A0;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0176g;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p220c6.AbstractC3026b;

/* JADX INFO: renamed from: A0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0008f {
    /* JADX INFO: renamed from: a */
    private static final Map m19a(InterfaceC0176g interfaceC0176g, String str) throws IOException {
        Cursor cursorMo881a0 = interfaceC0176g.mo881a0("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorMo881a0.getColumnCount() <= 0) {
                Map mapH = AbstractC1610H.m6626h();
                AbstractC3026b.m14999a(cursorMo881a0, null);
                return mapH;
            }
            int columnIndex = cursorMo881a0.getColumnIndex("name");
            int columnIndex2 = cursorMo881a0.getColumnIndex("type");
            int columnIndex3 = cursorMo881a0.getColumnIndex("notnull");
            int columnIndex4 = cursorMo881a0.getColumnIndex("pk");
            int columnIndex5 = cursorMo881a0.getColumnIndex("dflt_value");
            Map mapC = AbstractC1610H.m6621c();
            while (cursorMo881a0.moveToNext()) {
                String name = cursorMo881a0.getString(columnIndex);
                String type = cursorMo881a0.getString(columnIndex2);
                boolean z7 = cursorMo881a0.getInt(columnIndex3) != 0;
                int i7 = cursorMo881a0.getInt(columnIndex4);
                String string = cursorMo881a0.getString(columnIndex5);
                AbstractC6118n.m27186d(name, "name");
                AbstractC6118n.m27186d(type, "type");
                mapC.put(name, new C0007e.a(name, type, z7, i7, string, 2));
            }
            Map mapB = AbstractC1610H.m6620b(mapC);
            AbstractC3026b.m14999a(cursorMo881a0, null);
            return mapB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(cursorMo881a0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static final List m20b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listC = AbstractC1638q.m6758c();
        while (cursor.moveToNext()) {
            int i7 = cursor.getInt(columnIndex);
            int i8 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            AbstractC6118n.m27186d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            AbstractC6118n.m27186d(string2, "cursor.getString(toColumnIndex)");
            listC.add(new C0007e.d(i7, i8, string, string2));
        }
        return AbstractC1638q.m6587a0(AbstractC1638q.m6756a(listC));
    }

    /* JADX INFO: renamed from: c */
    private static final Set m21c(InterfaceC0176g interfaceC0176g, String str) throws IOException {
        Cursor cursorMo881a0 = interfaceC0176g.mo881a0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorMo881a0.getColumnIndex("id");
            int columnIndex2 = cursorMo881a0.getColumnIndex("seq");
            int columnIndex3 = cursorMo881a0.getColumnIndex("table");
            int columnIndex4 = cursorMo881a0.getColumnIndex("on_delete");
            int columnIndex5 = cursorMo881a0.getColumnIndex("on_update");
            List listM20b = m20b(cursorMo881a0);
            cursorMo881a0.moveToPosition(-1);
            Set setB = AbstractC1617O.m6648b();
            while (cursorMo881a0.moveToNext()) {
                if (cursorMo881a0.getInt(columnIndex2) == 0) {
                    int i7 = cursorMo881a0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<C0007e.d> arrayList3 = new ArrayList();
                    for (Object obj : listM20b) {
                        if (((C0007e.d) obj).m17h() == i7) {
                            arrayList3.add(obj);
                        }
                    }
                    for (C0007e.d dVar : arrayList3) {
                        arrayList.add(dVar.m16d());
                        arrayList2.add(dVar.m18j());
                    }
                    String string = cursorMo881a0.getString(columnIndex3);
                    AbstractC6118n.m27186d(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorMo881a0.getString(columnIndex4);
                    AbstractC6118n.m27186d(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorMo881a0.getString(columnIndex5);
                    AbstractC6118n.m27186d(string3, "cursor.getString(onUpdateColumnIndex)");
                    setB.add(new C0007e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set setA = AbstractC1617O.m6647a(setB);
            AbstractC3026b.m14999a(cursorMo881a0, null);
            return setA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(cursorMo881a0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private static final C0007e.e m22d(InterfaceC0176g interfaceC0176g, String str, boolean z7) throws IOException {
        Cursor cursorMo881a0 = interfaceC0176g.mo881a0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorMo881a0.getColumnIndex("seqno");
            int columnIndex2 = cursorMo881a0.getColumnIndex("cid");
            int columnIndex3 = cursorMo881a0.getColumnIndex("name");
            int columnIndex4 = cursorMo881a0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorMo881a0.moveToNext()) {
                    if (cursorMo881a0.getInt(columnIndex2) >= 0) {
                        int i7 = cursorMo881a0.getInt(columnIndex);
                        String columnName = cursorMo881a0.getString(columnIndex3);
                        String str2 = cursorMo881a0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i7);
                        AbstractC6118n.m27186d(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i7), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                AbstractC6118n.m27186d(collectionValues, "columnsMap.values");
                List listG0 = AbstractC1638q.m6593g0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                AbstractC6118n.m27186d(collectionValues2, "ordersMap.values");
                C0007e.e eVar = new C0007e.e(str, z7, listG0, AbstractC1638q.m6593g0(collectionValues2));
                AbstractC3026b.m14999a(cursorMo881a0, null);
                return eVar;
            }
            AbstractC3026b.m14999a(cursorMo881a0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(cursorMo881a0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static final Set m23e(InterfaceC0176g interfaceC0176g, String str) throws IOException {
        Cursor cursorMo881a0 = interfaceC0176g.mo881a0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorMo881a0.getColumnIndex("name");
            int columnIndex2 = cursorMo881a0.getColumnIndex("origin");
            int columnIndex3 = cursorMo881a0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setB = AbstractC1617O.m6648b();
                while (cursorMo881a0.moveToNext()) {
                    if (AbstractC6118n.m27183a("c", cursorMo881a0.getString(columnIndex2))) {
                        String name = cursorMo881a0.getString(columnIndex);
                        boolean z7 = true;
                        if (cursorMo881a0.getInt(columnIndex3) != 1) {
                            z7 = false;
                        }
                        AbstractC6118n.m27186d(name, "name");
                        C0007e.e eVarM22d = m22d(interfaceC0176g, name, z7);
                        if (eVarM22d == null) {
                            AbstractC3026b.m14999a(cursorMo881a0, null);
                            return null;
                        }
                        setB.add(eVarM22d);
                    }
                }
                Set setA = AbstractC1617O.m6647a(setB);
                AbstractC3026b.m14999a(cursorMo881a0, null);
                return setA;
            }
            AbstractC3026b.m14999a(cursorMo881a0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(cursorMo881a0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C0007e m24f(InterfaceC0176g database, String tableName) {
        AbstractC6118n.m27187e(database, "database");
        AbstractC6118n.m27187e(tableName, "tableName");
        return new C0007e(tableName, m19a(database, tableName), m21c(database, tableName), m23e(database, tableName));
    }
}
