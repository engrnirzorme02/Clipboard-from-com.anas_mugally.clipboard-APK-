package p151T4;

import android.database.Cursor;
import com.google.android.gms.common.api.C3553a;
import com.google.protobuf.C5065C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p137R4.C1343K;
import p158U4.AbstractC1685i;
import p158U4.AbstractC1692p;
import p158U4.C1687k;
import p158U4.C1694r;
import p158U4.C1696t;
import p158U4.C1698v;
import p164V3.C1774s;
import p172W4.C1866a;
import p186Y4.AbstractC2032B;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2044l;
import p186Y4.ExecutorC2042j;
import p186Y4.InterfaceC2043k;
import p186Y4.InterfaceC2047o;
import p350s4.AbstractC7009c;

/* JADX INFO: renamed from: T4.Y0 */
/* JADX INFO: loaded from: classes.dex */
final class C1522Y0 implements InterfaceC1541f0 {

    /* JADX INFO: renamed from: a */
    private final C1510S0 f5183a;

    /* JADX INFO: renamed from: b */
    private final C1570p f5184b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1561m f5185c;

    /* JADX INFO: renamed from: d */
    private final c f5186d = new c();

    /* JADX INFO: renamed from: T4.Y0$b */
    private enum b {
        NO_DOCUMENT(1),
        FOUND_DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        INVALID_DOCUMENT(4);


        /* JADX INFO: renamed from: a */
        final int f5192a;

        b(int i7) {
            this.f5192a = i7;
        }

        /* JADX INFO: renamed from: d */
        static b m6378d(C1694r c1694r) {
            if (c1694r.mo7079h()) {
                return NO_DOCUMENT;
            }
            if (c1694r.mo7073b()) {
                return FOUND_DOCUMENT;
            }
            if (c1694r.mo7080i()) {
                return UNKNOWN_DOCUMENT;
            }
            AbstractC2034b.m8460d(!c1694r.m7130o(), "MutableDocument has an unknown type", new Object[0]);
            return INVALID_DOCUMENT;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4.Y0$c */
    static class c {

        /* JADX INFO: renamed from: a */
        private final ConcurrentHashMap f5193a;

        /* JADX INFO: renamed from: T4.Y0$c$a */
        private static class a {

            /* JADX INFO: renamed from: a */
            final String f5194a;

            /* JADX INFO: renamed from: b */
            final int f5195b;

            /* JADX INFO: renamed from: c */
            final int f5196c;

            a(String str, int i7, int i8) {
                this.f5194a = str;
                this.f5195b = i7;
                this.f5196c = i8;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f5195b == aVar.f5195b && this.f5196c == aVar.f5196c && Objects.equals(this.f5194a, aVar.f5194a);
            }

            public int hashCode() {
                return Objects.hash(this.f5194a, Integer.valueOf(this.f5195b), Integer.valueOf(this.f5196c));
            }

            public String toString() {
                return "DocumentTypeBackfiller.BackfillKey(path=" + this.f5194a + ", readTimeSeconds=" + this.f5195b + ", readTimeNanos=" + this.f5196c + ")";
            }
        }

        /* JADX INFO: renamed from: T4.Y0$c$b */
        private static class b {

            /* JADX INFO: renamed from: a */
            final String f5197a;

            /* JADX INFO: renamed from: b */
            final Object[] f5198b;

            /* JADX INFO: renamed from: c */
            final int f5199c;

            b(String str, Object[] objArr, int i7) {
                this.f5197a = str;
                this.f5198b = objArr;
                this.f5199c = i7;
            }
        }

        private c() {
            this.f5193a = new ConcurrentHashMap();
        }

        /* JADX INFO: renamed from: a */
        void m6379a(C1510S0 c1510s0) {
            while (true) {
                b bVarM6380b = m6380b();
                if (bVarM6380b == null) {
                    return;
                } else {
                    c1510s0.m6333u(bVarM6380b.f5197a, bVarM6380b.f5198b);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        b m6380b() {
            if (this.f5193a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f5193a.keySet().iterator();
            int i7 = 0;
            while (it.hasNext() && arrayList.size() < 900) {
                a aVar = (a) it.next();
                b bVar = (b) this.f5193a.remove(aVar);
                if (bVar != null) {
                    i7++;
                    arrayList.add(aVar.f5194a);
                    int size = arrayList.size();
                    arrayList.add(Integer.valueOf(aVar.f5195b));
                    int size2 = arrayList.size();
                    arrayList.add(Integer.valueOf(aVar.f5196c));
                    int size3 = arrayList.size();
                    arrayList.add(Integer.valueOf(bVar.f5192a));
                    int size4 = arrayList.size();
                    sb.append(" WHEN path=?");
                    sb.append(size);
                    sb.append(" AND read_time_seconds=?");
                    sb.append(size2);
                    sb.append(" AND read_time_nanos=?");
                    sb.append(size3);
                    sb.append(" THEN ?");
                    sb.append(size4);
                    if (sb2.length() > 0) {
                        sb2.append(" OR");
                    }
                    sb2.append(" (path=?");
                    sb2.append(size);
                    sb2.append(" AND read_time_seconds=?");
                    sb2.append(size2);
                    sb2.append(" AND read_time_nanos=?");
                    sb2.append(size3);
                    sb2.append(')');
                }
            }
            if (i7 == 0) {
                return null;
            }
            return new b("UPDATE remote_documents SET document_type = CASE" + ((Object) sb) + " ELSE NULL END WHERE" + ((Object) sb2), arrayList.toArray(), i7);
        }

        /* JADX INFO: renamed from: c */
        void m6381c(String str, int i7, int i8, C1694r c1694r) {
            this.f5193a.putIfAbsent(new a(str, i7, i8), b.m6378d(c1694r));
        }
    }

    C1522Y0(C1510S0 c1510s0, C1570p c1570p) {
        this.f5183a = c1510s0;
        this.f5184b = c1570p;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m6370h(C1522Y0 c1522y0, byte[] bArr, int i7, int i8, boolean z7, String str, InterfaceC2047o interfaceC2047o, Map map) {
        C1694r c1694rM6373k = c1522y0.m6373k(bArr, i7, i8);
        if (z7) {
            c1522y0.f5186d.m6381c(str, i7, i8, c1694rM6373k);
        }
        if (interfaceC2047o == null || ((Boolean) interfaceC2047o.apply(c1694rM6373k)).booleanValue()) {
            synchronized (map) {
                map.put(c1694rM6373k.getKey(), c1694rM6373k);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m6371i(C1522Y0 c1522y0, ExecutorC2042j executorC2042j, Map map, InterfaceC2047o interfaceC2047o, C1523Z c1523z, Cursor cursor) {
        c1522y0.m6376n(executorC2042j, map, cursor, interfaceC2047o);
        if (c1523z != null) {
            c1523z.m6383b();
        }
    }

    /* JADX INFO: renamed from: k */
    private C1694r m6373k(byte[] bArr, int i7, int i8) {
        try {
            return this.f5184b.m6459c(C1866a.m7667k0(bArr)).m7133v(new C1698v(new C1774s(i7, i8)));
        } catch (C5065C e7) {
            throw AbstractC2034b.m8457a("MaybeDocument failed to parse: %s", e7);
        }
    }

    /* JADX INFO: renamed from: l */
    private Map m6374l(List list, AbstractC1692p.a aVar, int i7, b bVar, final InterfaceC2047o interfaceC2047o, final C1523Z c1523z) {
        C1774s c1774sM7155d = aVar.mo7047o().m7155d();
        C1687k c1687kMo7045m = aVar.mo7045m();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? ");
        sb.append(bVar == null ? "" : " AND (document_type IS NULL OR document_type = ?) ");
        sb.append("AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ");
        StringBuilder sbM8454s = AbstractC2032B.m8454s(sb.toString(), list.size(), " UNION ");
        sbM8454s.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        int i8 = 0;
        Object[] objArr = new Object[(((bVar != null ? 1 : 0) + 9) * list.size()) + 1];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1696t c1696t = (C1696t) it.next();
            String strM6410c = AbstractC1540f.m6410c(c1696t);
            objArr[i8] = strM6410c;
            objArr[i8 + 1] = AbstractC1540f.m6413f(strM6410c);
            int i9 = i8 + 3;
            objArr[i8 + 2] = Integer.valueOf(c1696t.m7063v() + 1);
            if (bVar != null) {
                objArr[i9] = Integer.valueOf(bVar.f5192a);
                i9 = i8 + 4;
            }
            objArr[i9] = Long.valueOf(c1774sM7155d.m7438h());
            objArr[i9 + 1] = Long.valueOf(c1774sM7155d.m7438h());
            objArr[i9 + 2] = Integer.valueOf(c1774sM7155d.m7437d());
            objArr[i9 + 3] = Long.valueOf(c1774sM7155d.m7438h());
            objArr[i9 + 4] = Integer.valueOf(c1774sM7155d.m7437d());
            objArr[i9 + 5] = AbstractC1540f.m6410c(c1687kMo7045m.m7095t());
            i8 = i9 + 6;
        }
        objArr[i8] = Integer.valueOf(i7);
        final ExecutorC2042j executorC2042j = new ExecutorC2042j();
        final HashMap map = new HashMap();
        this.f5183a.m6331B(sbM8454s.toString()).m6345b(objArr).m6348e(new InterfaceC2043k() { // from class: T4.X0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1522Y0.m6371i(this.f5176a, executorC2042j, map, interfaceC2047o, c1523z, (Cursor) obj);
            }
        });
        executorC2042j.m8494b();
        this.f5186d.m6379a(this.f5183a);
        synchronized (map) {
        }
        return map;
    }

    /* JADX INFO: renamed from: m */
    private Map m6375m(List list, AbstractC1692p.a aVar, int i7, InterfaceC2047o interfaceC2047o) {
        return m6374l(list, aVar, i7, null, interfaceC2047o, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m6376n(ExecutorC2042j executorC2042j, final Map map, Cursor cursor, final InterfaceC2047o interfaceC2047o) {
        final byte[] blob = cursor.getBlob(0);
        final int i7 = cursor.getInt(1);
        final int i8 = cursor.getInt(2);
        final boolean zIsNull = cursor.isNull(3);
        final String string = cursor.getString(4);
        Executor executor = executorC2042j;
        if (cursor.isLast()) {
            executor = AbstractC2044l.f6763b;
        }
        executor.execute(new Runnable() { // from class: T4.V0
            @Override // java.lang.Runnable
            public final void run() {
                C1522Y0.m6370h(this.f5164a, blob, i7, i8, zIsNull, string, interfaceC2047o, map);
            }
        });
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: a */
    public Map mo6351a(String str, AbstractC1692p.a aVar, int i7) {
        List listMo6277d = this.f5185c.mo6277d(str);
        ArrayList arrayList = new ArrayList(listMo6277d.size());
        Iterator it = listMo6277d.iterator();
        while (it.hasNext()) {
            arrayList.add((C1696t) ((C1696t) it.next()).m7056d(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        if (arrayList.size() * 9 < 900) {
            return m6375m(arrayList, aVar, i7, null);
        }
        HashMap map = new HashMap();
        int i8 = 0;
        while (i8 < arrayList.size()) {
            int i9 = i8 + 100;
            map.putAll(m6375m(arrayList.subList(i8, Math.min(arrayList.size(), i9)), aVar, i7, null));
            i8 = i9;
        }
        return AbstractC2032B.m8453r(map, i7, AbstractC1692p.a.f5611b);
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: b */
    public Map mo6352b(final C1343K c1343k, AbstractC1692p.a aVar, final Set set, C1523Z c1523z) {
        return m6374l(Collections.singletonList(c1343k.m5760l()), aVar, C3553a.e.API_PRIORITY_OTHER, b.FOUND_DOCUMENT, new InterfaceC2047o() { // from class: T4.W0
            @Override // p186Y4.InterfaceC2047o
            public final Object apply(Object obj) {
                C1694r c1694r = (C1694r) obj;
                return Boolean.valueOf(c1343k.m5766r(c1694r) || set.contains(c1694r.getKey()));
            }
        }, c1523z);
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: c */
    public C1694r mo6353c(C1687k c1687k) {
        return (C1694r) mo6354d(Collections.singletonList(c1687k)).get(c1687k);
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: d */
    public Map mo6354d(Iterable iterable) {
        final HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1687k c1687k = (C1687k) it.next();
            arrayList.add(AbstractC1540f.m6410c(c1687k.m7095t()));
            map.put(c1687k, C1694r.m7124q(c1687k));
        }
        C1510S0.b bVar = new C1510S0.b(this.f5183a, "SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        final ExecutorC2042j executorC2042j = new ExecutorC2042j();
        while (bVar.m6340d()) {
            bVar.m6341e().m6348e(new InterfaceC2043k() { // from class: T4.U0
                @Override // p186Y4.InterfaceC2043k
                public final void accept(Object obj) {
                    this.f5161a.m6376n(executorC2042j, map, (Cursor) obj, null);
                }
            });
        }
        executorC2042j.m8494b();
        this.f5186d.m6379a(this.f5183a);
        synchronized (map) {
        }
        return map;
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: e */
    public void mo6355e(InterfaceC1561m interfaceC1561m) {
        this.f5185c = interfaceC1561m;
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: f */
    public void mo6356f(C1694r c1694r, C1698v c1698v) {
        AbstractC2034b.m8460d(!c1698v.equals(C1698v.f5636b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        C1687k key = c1694r.getKey();
        C1774s c1774sM7155d = c1698v.m7155d();
        this.f5183a.m6333u("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, document_type, contents) VALUES (?, ?, ?, ?, ?, ?)", AbstractC1540f.m6410c(key.m7095t()), Integer.valueOf(key.m7095t().m7063v()), Long.valueOf(c1774sM7155d.m7438h()), Integer.valueOf(c1774sM7155d.m7437d()), Integer.valueOf(b.m6378d(c1694r).f5192a), this.f5184b.m6464k(c1694r).mo22973h());
        this.f5185c.mo6278e(c1694r.getKey().m7093p());
    }

    @Override // p151T4.InterfaceC1541f0
    public void removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC7009c abstractC7009cM7082a = AbstractC1685i.m7082a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1687k c1687k = (C1687k) it.next();
            arrayList.add(AbstractC1540f.m6410c(c1687k.m7095t()));
            abstractC7009cM7082a = abstractC7009cM7082a.mo30605n(c1687k, C1694r.m7125r(c1687k, C1698v.f5636b));
        }
        C1510S0.b bVar = new C1510S0.b(this.f5183a, "DELETE FROM remote_documents WHERE path IN (", arrayList, ")");
        while (bVar.m6340d()) {
            bVar.m6338a();
        }
        this.f5185c.mo6275b(abstractC7009cM7082a);
    }
}
