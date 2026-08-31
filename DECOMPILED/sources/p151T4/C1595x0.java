package p151T4;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.protobuf.C5065C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;
import p123P4.C1229i;
import p137R4.AbstractC1370q;
import p137R4.C1342J;
import p137R4.C1348P;
import p137R4.C1362i;
import p137R4.C1364k;
import p137R4.C1369p;
import p144S4.AbstractC1420e;
import p144S4.C1418c;
import p144S4.C1419d;
import p158U4.AbstractC1692p;
import p158U4.AbstractC1701y;
import p158U4.C1687k;
import p158U4.C1693q;
import p158U4.C1696t;
import p158U4.C1698v;
import p158U4.C1700x;
import p158U4.InterfaceC1684h;
import p164V3.C1774s;
import p186Y4.AbstractC2032B;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p186Y4.AbstractC2050r;
import p186Y4.InterfaceC2043k;
import p343r5.C6915a;
import p350s4.AbstractC7009c;
import p351s5.C7039u;

/* JADX INFO: renamed from: T4.x0 */
/* JADX INFO: loaded from: classes.dex */
final class C1595x0 implements InterfaceC1561m {

    /* JADX INFO: renamed from: k */
    private static final String f5333k = "x0";

    /* JADX INFO: renamed from: l */
    private static final byte[] f5334l = new byte[0];

    /* JADX INFO: renamed from: a */
    private final C1510S0 f5335a;

    /* JADX INFO: renamed from: b */
    private final C1570p f5336b;

    /* JADX INFO: renamed from: c */
    private final String f5337c;

    /* JADX INFO: renamed from: d */
    private final Map f5338d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final C1498M.a f5339e = new C1498M.a();

    /* JADX INFO: renamed from: f */
    private final Map f5340f = new HashMap();

    /* JADX INFO: renamed from: g */
    private final Queue f5341g = new PriorityQueue(10, new Comparator() { // from class: T4.p0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1595x0.m6534o((AbstractC1692p) obj, (AbstractC1692p) obj2);
        }
    });

    /* JADX INFO: renamed from: h */
    private boolean f5342h = false;

    /* JADX INFO: renamed from: i */
    private int f5343i = -1;

    /* JADX INFO: renamed from: j */
    private long f5344j = -1;

    C1595x0(C1510S0 c1510s0, C1570p c1570p, C1229i c1229i) {
        this.f5335a = c1510s0;
        this.f5336b = c1570p;
        this.f5337c = c1229i.m5350b() ? c1229i.m5349a() : "";
    }

    /* JADX INFO: renamed from: A */
    private Object[] m6518A(AbstractC1692p abstractC1692p, C1348P c1348p, Collection collection) {
        if (collection == null) {
            return null;
        }
        List<C1419d> arrayList = new ArrayList();
        arrayList.add(new C1419d());
        Iterator it = collection.iterator();
        for (AbstractC1692p.c cVar : abstractC1692p.m7107e()) {
            C7039u c7039u = (C7039u) it.next();
            for (C1419d c1419d : arrayList) {
                if (m6527K(c1348p, cVar.mo7050h()) && AbstractC1701y.m7193u(c7039u)) {
                    arrayList = m6519B(arrayList, cVar, c7039u);
                } else {
                    C1418c.f4932a.m6029e(c7039u, c1419d.m6031b(cVar.mo7051j()));
                }
            }
        }
        return m6522E(arrayList);
    }

    /* JADX INFO: renamed from: B */
    private List m6519B(List list, AbstractC1692p.c cVar, C7039u c7039u) {
        ArrayList<C1419d> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (C7039u c7039u2 : c7039u.m31034l0().mo30668g()) {
            for (C1419d c1419d : arrayList) {
                C1419d c1419d2 = new C1419d();
                c1419d2.m6033d(c1419d.m6032c());
                C1418c.f4932a.m6029e(c7039u2, c1419d2.m6031b(cVar.mo7051j()));
                arrayList2.add(c1419d2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: C */
    private Object[] m6520C(int i7, int i8, List list, Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = i7 / (list != null ? list.size() : 1);
        int i9 = 0;
        Object[] objArr4 = new Object[(i7 * 5) + (objArr3 != null ? objArr3.length : 0)];
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            objArr4[i10] = Integer.valueOf(i8);
            int i12 = i10 + 2;
            objArr4[i10 + 1] = this.f5337c;
            int i13 = i10 + 3;
            objArr4[i12] = list != null ? m6544z((C7039u) list.get(i11 / size)) : f5334l;
            int i14 = i10 + 4;
            int i15 = i11 % size;
            objArr4[i13] = objArr[i15];
            i10 += 5;
            objArr4[i14] = objArr2[i15];
        }
        if (objArr3 != null) {
            int length = objArr3.length;
            while (i9 < length) {
                objArr4[i10] = objArr3[i9];
                i9++;
                i10++;
            }
        }
        return objArr4;
    }

    /* JADX INFO: renamed from: D */
    private Object[] m6521D(C1348P c1348p, int i7, List list, Object[] objArr, String str, Object[] objArr2, String str2, Object[] objArr3) {
        StringBuilder sb;
        List list2;
        int size = (list != null ? list.size() : 1) * Math.max(objArr.length, objArr2.length);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT document_key, directional_value FROM index_entries ");
        sb2.append("WHERE index_id = ? AND uid = ? ");
        sb2.append("AND array_value = ? ");
        sb2.append("AND directional_value ");
        sb2.append(str);
        sb2.append(" ? ");
        sb2.append("AND directional_value ");
        sb2.append(str2);
        sb2.append(" ? ");
        CharSequence charSequenceM8454s = AbstractC2032B.m8454s(sb2, size, " UNION ");
        if (objArr3 != null) {
            StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
            sb3.append(charSequenceM8454s);
            sb3.append(") WHERE directional_value NOT IN (");
            sb3.append((CharSequence) AbstractC2032B.m8454s("?", objArr3.length, ", "));
            sb3.append(")");
            list2 = list;
            sb = sb3;
        } else {
            sb = charSequenceM8454s;
            list2 = list;
        }
        Object[] objArrM6520C = m6520C(size, i7, list2, objArr, objArr2, objArr3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb.toString());
        arrayList.addAll(Arrays.asList(objArrM6520C));
        return arrayList.toArray();
    }

    /* JADX INFO: renamed from: E */
    private Object[] m6522E(List list) {
        Object[] objArr = new Object[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            objArr[i7] = ((C1419d) list.get(i7)).m6032c();
        }
        return objArr;
    }

    /* JADX INFO: renamed from: F */
    private SortedSet m6523F(final C1687k c1687k, final AbstractC1692p abstractC1692p) {
        final TreeSet treeSet = new TreeSet();
        this.f5335a.m6331B("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?").m6345b(Integer.valueOf(abstractC1692p.mo7042f()), c1687k.toString(), this.f5337c).m6348e(new InterfaceC2043k() { // from class: T4.u0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                Cursor cursor = (Cursor) obj;
                treeSet.add(AbstractC1420e.m6034d(abstractC1692p.mo7042f(), c1687k, cursor.getBlob(0), cursor.getBlob(1)));
            }
        });
        return treeSet;
    }

    /* JADX INFO: renamed from: G */
    private AbstractC1692p m6524G(C1348P c1348p) {
        AbstractC2034b.m8460d(this.f5342h, "IndexManager not started", new Object[0]);
        C1700x c1700x = new C1700x(c1348p);
        Collection<AbstractC1692p> collectionM6545H = m6545H(c1348p.m5812d() != null ? c1348p.m5812d() : c1348p.m5820n().m7060o());
        AbstractC1692p abstractC1692p = null;
        if (collectionM6545H.isEmpty()) {
            return null;
        }
        for (AbstractC1692p abstractC1692p2 : collectionM6545H) {
            if (c1700x.m7162g(abstractC1692p2) && (abstractC1692p == null || abstractC1692p2.mo7044h().size() > abstractC1692p.mo7044h().size())) {
                abstractC1692p = abstractC1692p2;
            }
        }
        return abstractC1692p;
    }

    /* JADX INFO: renamed from: I */
    private AbstractC1692p.a m6525I(Collection collection) {
        AbstractC2034b.m8460d(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator it = collection.iterator();
        AbstractC1692p.a aVarMo7048c = ((AbstractC1692p) it.next()).mo7043g().mo7048c();
        int iMo7046n = aVarMo7048c.mo7046n();
        while (it.hasNext()) {
            AbstractC1692p.a aVarMo7048c2 = ((AbstractC1692p) it.next()).mo7043g().mo7048c();
            if (aVarMo7048c2.compareTo(aVarMo7048c) < 0) {
                aVarMo7048c = aVarMo7048c2;
            }
            iMo7046n = Math.max(aVarMo7048c2.mo7046n(), iMo7046n);
        }
        return AbstractC1692p.a.m7109h(aVarMo7048c.mo7047o(), aVarMo7048c.mo7045m(), iMo7046n);
    }

    /* JADX INFO: renamed from: J */
    private List m6526J(C1348P c1348p) {
        if (this.f5338d.containsKey(c1348p)) {
            return (List) this.f5338d.get(c1348p);
        }
        ArrayList arrayList = new ArrayList();
        if (c1348p.m5814h().isEmpty()) {
            arrayList.add(c1348p);
        } else {
            Iterator it = AbstractC2050r.m8515i(new C1364k(c1348p.m5814h(), C1364k.a.AND)).iterator();
            while (it.hasNext()) {
                arrayList.add(new C1348P(c1348p.m5820n(), c1348p.m5812d(), ((AbstractC1370q) it.next()).mo5891b(), c1348p.m5819m(), c1348p.m5816j(), c1348p.m5822p(), c1348p.m5813f()));
            }
        }
        this.f5338d.put(c1348p, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    private boolean m6527K(C1348P c1348p, C1693q c1693q) {
        for (AbstractC1370q abstractC1370q : c1348p.m5814h()) {
            if (abstractC1370q instanceof C1369p) {
                C1369p c1369p = (C1369p) abstractC1370q;
                if (c1369p.m5922f().equals(c1693q)) {
                    C1369p.b bVarM5923g = c1369p.m5923g();
                    if (bVarM5923g.equals(C1369p.b.IN) || bVarM5923g.equals(C1369p.b.NOT_IN)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    private void m6528L(AbstractC1692p abstractC1692p) {
        Map map = (Map) this.f5340f.get(abstractC1692p.mo7041d());
        if (map == null) {
            map = new HashMap();
            this.f5340f.put(abstractC1692p.mo7041d(), map);
        }
        AbstractC1692p abstractC1692p2 = (AbstractC1692p) map.get(Integer.valueOf(abstractC1692p.mo7042f()));
        if (abstractC1692p2 != null) {
            this.f5341g.remove(abstractC1692p2);
        }
        map.put(Integer.valueOf(abstractC1692p.mo7042f()), abstractC1692p);
        this.f5341g.add(abstractC1692p);
        this.f5343i = Math.max(this.f5343i, abstractC1692p.mo7042f());
        this.f5344j = Math.max(this.f5344j, abstractC1692p.mo7043g().mo7049d());
    }

    /* JADX INFO: renamed from: M */
    private void m6529M(final InterfaceC1684h interfaceC1684h, SortedSet sortedSet, SortedSet sortedSet2) {
        AbstractC2049q.m8502a(f5333k, "Updating index entries for document '%s'", interfaceC1684h.getKey());
        AbstractC2032B.m8451p(sortedSet, sortedSet2, new InterfaceC2043k() { // from class: T4.q0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                this.f5294a.m6538t(interfaceC1684h, (AbstractC1420e) obj);
            }
        }, new InterfaceC2043k() { // from class: T4.r0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                this.f5298a.m6540v(interfaceC1684h, (AbstractC1420e) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m6532m(C1595x0 c1595x0, Map map, Cursor cursor) {
        c1595x0.getClass();
        try {
            int i7 = cursor.getInt(0);
            c1595x0.m6528L(AbstractC1692p.m7105b(i7, cursor.getString(1), c1595x0.f5336b.m6458b(C6915a.m30326g0(cursor.getBlob(2))), map.containsKey(Integer.valueOf(i7)) ? (AbstractC1692p.b) map.get(Integer.valueOf(i7)) : AbstractC1692p.f5608a));
        } catch (C5065C e7) {
            throw AbstractC2034b.m8457a("Failed to decode index: " + e7, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m6534o(AbstractC1692p abstractC1692p, AbstractC1692p abstractC1692p2) {
        int iCompare = Long.compare(abstractC1692p.mo7043g().mo7049d(), abstractC1692p2.mo7043g().mo7049d());
        return iCompare == 0 ? abstractC1692p.mo7041d().compareTo(abstractC1692p2.mo7041d()) : iCompare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m6538t(InterfaceC1684h interfaceC1684h, AbstractC1420e abstractC1420e) {
        this.f5335a.m6333u("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(abstractC1420e.mo6014m()), this.f5337c, abstractC1420e.mo6011h(), abstractC1420e.mo6012j(), interfaceC1684h.getKey().toString());
    }

    /* JADX INFO: renamed from: u */
    private SortedSet m6539u(InterfaceC1684h interfaceC1684h, AbstractC1692p abstractC1692p) {
        TreeSet treeSet = new TreeSet();
        byte[] bArrM6542x = m6542x(abstractC1692p, interfaceC1684h);
        if (bArrM6542x != null) {
            AbstractC1692p.c cVarM7106c = abstractC1692p.m7106c();
            if (cVarM7106c == null) {
                treeSet.add(AbstractC1420e.m6034d(abstractC1692p.mo7042f(), interfaceC1684h.getKey(), new byte[0], bArrM6542x));
                return treeSet;
            }
            C7039u c7039uMo7078g = interfaceC1684h.mo7078g(cVarM7106c.mo7050h());
            if (AbstractC1701y.m7193u(c7039uMo7078g)) {
                Iterator it = c7039uMo7078g.m31034l0().mo30668g().iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC1420e.m6034d(abstractC1692p.mo7042f(), interfaceC1684h.getKey(), m6544z((C7039u) it.next()), bArrM6542x));
                }
            }
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m6540v(InterfaceC1684h interfaceC1684h, AbstractC1420e abstractC1420e) {
        this.f5335a.m6333u("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(abstractC1420e.mo6014m()), this.f5337c, abstractC1420e.mo6011h(), abstractC1420e.mo6012j(), interfaceC1684h.getKey().toString());
    }

    /* JADX INFO: renamed from: w */
    private Object[] m6541w(AbstractC1692p abstractC1692p, C1348P c1348p, C1362i c1362i) {
        return m6518A(abstractC1692p, c1348p, c1362i.m5873b());
    }

    /* JADX INFO: renamed from: x */
    private byte[] m6542x(AbstractC1692p abstractC1692p, InterfaceC1684h interfaceC1684h) {
        C1419d c1419d = new C1419d();
        for (AbstractC1692p.c cVar : abstractC1692p.m7107e()) {
            C7039u c7039uMo7078g = interfaceC1684h.mo7078g(cVar.mo7050h());
            if (c7039uMo7078g == null) {
                return null;
            }
            C1418c.f4932a.m6029e(c7039uMo7078g, c1419d.m6031b(cVar.mo7051j()));
        }
        return c1419d.m6032c();
    }

    /* JADX INFO: renamed from: y */
    private byte[] m6543y(AbstractC1692p abstractC1692p) {
        return this.f5336b.m6463j(abstractC1692p.mo7044h()).mo22973h();
    }

    /* JADX INFO: renamed from: z */
    private byte[] m6544z(C7039u c7039u) {
        C1419d c1419d = new C1419d();
        C1418c.f4932a.m6029e(c7039u, c1419d.m6031b(AbstractC1692p.c.a.ASCENDING));
        return c1419d.m6032c();
    }

    /* JADX INFO: renamed from: H */
    public Collection m6545H(String str) {
        AbstractC2034b.m8460d(this.f5342h, "IndexManager not started", new Object[0]);
        Map map = (Map) this.f5340f.get(str);
        return map == null ? Collections.EMPTY_LIST : map.values();
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: a */
    public InterfaceC1561m.a mo6274a(C1348P c1348p) {
        InterfaceC1561m.a aVar = InterfaceC1561m.a.FULL;
        List<C1348P> listM6526J = m6526J(c1348p);
        for (C1348P c1348p2 : listM6526J) {
            AbstractC1692p abstractC1692pM6524G = m6524G(c1348p2);
            if (abstractC1692pM6524G == null) {
                aVar = InterfaceC1561m.a.NONE;
                break;
            }
            if (abstractC1692pM6524G.mo7044h().size() < c1348p2.m5821o()) {
                aVar = InterfaceC1561m.a.PARTIAL;
            }
        }
        return (c1348p.m5824r() && listM6526J.size() > 1 && aVar == InterfaceC1561m.a.FULL) ? InterfaceC1561m.a.PARTIAL : aVar;
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: b */
    public void mo6275b(AbstractC7009c abstractC7009c) {
        AbstractC2034b.m8460d(this.f5342h, "IndexManager not started", new Object[0]);
        Iterator it = abstractC7009c.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            for (AbstractC1692p abstractC1692p : m6545H(((C1687k) entry.getKey()).m7092o())) {
                SortedSet sortedSetM6523F = m6523F((C1687k) entry.getKey(), abstractC1692p);
                SortedSet sortedSetM6539u = m6539u((InterfaceC1684h) entry.getValue(), abstractC1692p);
                if (!sortedSetM6523F.equals(sortedSetM6539u)) {
                    m6529M((InterfaceC1684h) entry.getValue(), sortedSetM6523F, sortedSetM6539u);
                }
            }
        }
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: c */
    public String mo6276c() {
        AbstractC2034b.m8460d(this.f5342h, "IndexManager not started", new Object[0]);
        AbstractC1692p abstractC1692p = (AbstractC1692p) this.f5341g.peek();
        if (abstractC1692p != null) {
            return abstractC1692p.mo7041d();
        }
        return null;
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: d */
    public List mo6277d(String str) {
        AbstractC2034b.m8460d(this.f5342h, "IndexManager not started", new Object[0]);
        final ArrayList arrayList = new ArrayList();
        this.f5335a.m6331B("SELECT parent FROM collection_parents WHERE collection_id = ?").m6345b(str).m6348e(new InterfaceC2043k() { // from class: T4.s0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                arrayList.add(AbstractC1540f.m6409b(((Cursor) obj).getString(0)));
            }
        });
        return arrayList;
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: e */
    public void mo6278e(C1696t c1696t) {
        AbstractC2034b.m8460d(this.f5342h, "IndexManager not started", new Object[0]);
        AbstractC2034b.m8460d(c1696t.m7063v() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f5339e.m6284a(c1696t)) {
            this.f5335a.m6333u("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", c1696t.m7060o(), AbstractC1540f.m6410c((C1696t) c1696t.m7065x()));
        }
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: f */
    public List mo6279f(C1348P c1348p) {
        AbstractC2034b.m8460d(this.f5342h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C1348P c1348p2 : m6526J(c1348p)) {
            AbstractC1692p abstractC1692pM6524G = m6524G(c1348p2);
            if (abstractC1692pM6524G == null) {
                return null;
            }
            arrayList3.add(Pair.create(c1348p2, abstractC1692pM6524G));
        }
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            C1348P c1348p3 = (C1348P) pair.first;
            AbstractC1692p abstractC1692p = (AbstractC1692p) pair.second;
            List listM5810a = c1348p3.m5810a(abstractC1692p);
            Collection collectionM5818l = c1348p3.m5818l(abstractC1692p);
            C1362i c1362iM5817k = c1348p3.m5817k(abstractC1692p);
            C1362i c1362iM5823q = c1348p3.m5823q(abstractC1692p);
            if (AbstractC2049q.m8504c()) {
                AbstractC2049q.m8502a(f5333k, "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", abstractC1692p, c1348p3, listM5810a, c1362iM5817k, c1362iM5823q);
            }
            Object[] objArrM6521D = m6521D(c1348p3, abstractC1692p.mo7042f(), listM5810a, m6541w(abstractC1692p, c1348p3, c1362iM5817k), c1362iM5817k.m5874c() ? ">=" : ">", m6541w(abstractC1692p, c1348p3, c1362iM5823q), c1362iM5823q.m5874c() ? "<=" : "<", m6518A(abstractC1692p, c1348p3, collectionM5818l));
            arrayList.add(String.valueOf(objArrM6521D[0]));
            arrayList2.addAll(Arrays.asList(objArrM6521D).subList(1, objArrM6521D.length));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.join(" UNION ", arrayList));
        sb.append("ORDER BY directional_value, document_key ");
        sb.append(c1348p.m5815i().equals(C1342J.a.ASCENDING) ? "asc " : "desc ");
        String str = "SELECT DISTINCT document_key FROM (" + sb.toString() + ")";
        if (c1348p.m5824r()) {
            str = str + " LIMIT " + c1348p.m5816j();
        }
        AbstractC2034b.m8460d(arrayList2.size() < 1000, "Cannot perform query with more than 999 bind elements", new Object[0]);
        C1510S0.d dVarM6345b = this.f5335a.m6331B(str).m6345b(arrayList2.toArray());
        final ArrayList arrayList4 = new ArrayList();
        dVarM6345b.m6348e(new InterfaceC2043k() { // from class: T4.t0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                arrayList4.add(C1687k.m7088m(C1696t.m7147A(((Cursor) obj).getString(0))));
            }
        });
        AbstractC2049q.m8502a(f5333k, "Index scan returned %s documents", Integer.valueOf(arrayList4.size()));
        return arrayList4;
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: g */
    public void mo6280g(String str, AbstractC1692p.a aVar) {
        AbstractC2034b.m8460d(this.f5342h, "IndexManager not started", new Object[0]);
        this.f5344j++;
        for (AbstractC1692p abstractC1692p : m6545H(str)) {
            AbstractC1692p abstractC1692pM7105b = AbstractC1692p.m7105b(abstractC1692p.mo7042f(), abstractC1692p.mo7041d(), abstractC1692p.mo7044h(), AbstractC1692p.b.m7113a(this.f5344j, aVar));
            this.f5335a.m6333u("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(abstractC1692p.mo7042f()), this.f5337c, Long.valueOf(this.f5344j), Long.valueOf(aVar.mo7047o().m7155d().m7438h()), Integer.valueOf(aVar.mo7047o().m7155d().m7437d()), AbstractC1540f.m6410c(aVar.mo7045m().m7095t()), Integer.valueOf(aVar.mo7046n()));
            m6528L(abstractC1692pM7105b);
        }
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: h */
    public AbstractC1692p.a mo6281h(C1348P c1348p) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m6526J(c1348p).iterator();
        while (it.hasNext()) {
            AbstractC1692p abstractC1692pM6524G = m6524G((C1348P) it.next());
            if (abstractC1692pM6524G != null) {
                arrayList.add(abstractC1692pM6524G);
            }
        }
        return m6525I(arrayList);
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: i */
    public AbstractC1692p.a mo6282i(String str) {
        Collection collectionM6545H = m6545H(str);
        AbstractC2034b.m8460d(!collectionM6545H.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return m6525I(collectionM6545H);
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: j */
    public void mo6283j(C1348P c1348p) {
        AbstractC2034b.m8460d(this.f5342h, "IndexManager not started", new Object[0]);
        for (C1348P c1348p2 : m6526J(c1348p)) {
            InterfaceC1561m.a aVarMo6274a = mo6274a(c1348p2);
            if (aVarMo6274a == InterfaceC1561m.a.NONE || aVarMo6274a == InterfaceC1561m.a.PARTIAL) {
                AbstractC1692p abstractC1692pM7160b = new C1700x(c1348p2).m7160b();
                if (abstractC1692pM7160b != null) {
                    m6546s(abstractC1692pM7160b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m6546s(AbstractC1692p abstractC1692p) {
        AbstractC2034b.m8460d(this.f5342h, "IndexManager not started", new Object[0]);
        int i7 = this.f5343i + 1;
        AbstractC1692p abstractC1692pM7105b = AbstractC1692p.m7105b(i7, abstractC1692p.mo7041d(), abstractC1692p.mo7044h(), abstractC1692p.mo7043g());
        this.f5335a.m6333u("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", Integer.valueOf(i7), abstractC1692pM7105b.mo7041d(), m6543y(abstractC1692pM7105b));
        m6528L(abstractC1692pM7105b);
    }

    @Override // p151T4.InterfaceC1561m
    public void start() {
        final HashMap map = new HashMap();
        this.f5335a.m6331B("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?").m6345b(this.f5337c).m6348e(new InterfaceC2043k() { // from class: T4.v0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                Cursor cursor = (Cursor) obj;
                map.put(Integer.valueOf(cursor.getInt(0)), AbstractC1692p.b.m7114b(cursor.getLong(1), new C1698v(new C1774s(cursor.getLong(2), cursor.getInt(3))), C1687k.m7088m(AbstractC1540f.m6409b(cursor.getString(4))), cursor.getInt(5)));
            }
        });
        this.f5335a.m6331B("SELECT index_id, collection_group, index_proto FROM index_configuration").m6348e(new InterfaceC2043k() { // from class: T4.w0
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1595x0.m6532m(this.f5325a, map, (Cursor) obj);
            }
        });
        this.f5342h = true;
    }
}
