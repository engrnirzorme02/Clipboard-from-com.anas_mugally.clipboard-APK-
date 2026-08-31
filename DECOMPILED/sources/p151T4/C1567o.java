package p151T4;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import p137R4.C1343K;
import p158U4.AbstractC1685i;
import p158U4.AbstractC1692p;
import p158U4.C1687k;
import p158U4.C1694r;
import p158U4.C1696t;
import p158U4.InterfaceC1684h;
import p164V3.C1774s;
import p165V4.AbstractC1780f;
import p165V4.AbstractC1785k;
import p165V4.C1778d;
import p165V4.C1781g;
import p165V4.C1786l;
import p186Y4.AbstractC2034b;
import p350s4.AbstractC7009c;

/* JADX INFO: renamed from: T4.o */
/* JADX INFO: loaded from: classes.dex */
class C1567o {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1541f0 f5283a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1515V f5284b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1528b f5285c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1561m f5286d;

    C1567o(InterfaceC1541f0 interfaceC1541f0, InterfaceC1515V interfaceC1515V, InterfaceC1528b interfaceC1528b, InterfaceC1561m interfaceC1561m) {
        this.f5283a = interfaceC1541f0;
        this.f5284b = interfaceC1515V;
        this.f5285c = interfaceC1528b;
        this.f5286d = interfaceC1561m;
    }

    /* JADX INFO: renamed from: a */
    private Map m6438a(Map map, Map map2, Set set) {
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (C1694r c1694r : map.values()) {
            AbstractC1785k abstractC1785k = (AbstractC1785k) map2.get(c1694r.getKey());
            if (set.contains(c1694r.getKey()) && (abstractC1785k == null || (abstractC1785k.mo7452d() instanceof C1786l))) {
                map3.put(c1694r.getKey(), c1694r);
            } else if (abstractC1785k != null) {
                map4.put(c1694r.getKey(), abstractC1785k.mo7452d().mo7455d());
                abstractC1785k.mo7452d().mo7453a(c1694r, abstractC1785k.mo7452d().mo7455d(), C1774s.m7435m());
            } else {
                map4.put(c1694r.getKey(), C1778d.f5831b);
            }
        }
        map4.putAll(m6444m(map3));
        HashMap map5 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map5.put((C1687k) entry.getKey(), new C1519X((InterfaceC1684h) entry.getValue(), (C1778d) map4.get(entry.getKey())));
        }
        return map5;
    }

    /* JADX INFO: renamed from: b */
    private C1694r m6439b(C1687k c1687k, AbstractC1785k abstractC1785k) {
        return (abstractC1785k == null || (abstractC1785k.mo7452d() instanceof C1786l)) ? this.f5283a.mo6353c(c1687k) : C1694r.m7124q(c1687k);
    }

    /* JADX INFO: renamed from: e */
    private AbstractC7009c m6440e(C1343K c1343k, AbstractC1692p.a aVar, C1523Z c1523z) {
        AbstractC2034b.m8460d(c1343k.m5760l().isEmpty(), "Currently we only support collection group queries at the root.", new Object[0]);
        String strM5752d = c1343k.m5752d();
        AbstractC7009c abstractC7009cM7082a = AbstractC1685i.m7082a();
        Iterator it = this.f5286d.mo6277d(strM5752d).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : m6441f(c1343k.m5750a((C1696t) ((C1696t) it.next()).m7056d(strM5752d)), aVar, c1523z)) {
                abstractC7009cM7082a = abstractC7009cM7082a.mo30605n((C1687k) entry.getKey(), (InterfaceC1684h) entry.getValue());
            }
        }
        return abstractC7009cM7082a;
    }

    /* JADX INFO: renamed from: f */
    private AbstractC7009c m6441f(C1343K c1343k, AbstractC1692p.a aVar, C1523Z c1523z) {
        Map mapMo6244f = this.f5285c.mo6244f(c1343k.m5760l(), aVar.mo7046n());
        Map mapMo6352b = this.f5283a.mo6352b(c1343k, aVar, mapMo6244f.keySet(), c1523z);
        for (Map.Entry entry : mapMo6244f.entrySet()) {
            if (!mapMo6352b.containsKey(entry.getKey())) {
                mapMo6352b.put((C1687k) entry.getKey(), C1694r.m7124q((C1687k) entry.getKey()));
            }
        }
        AbstractC7009c abstractC7009cM7082a = AbstractC1685i.m7082a();
        for (Map.Entry entry2 : mapMo6352b.entrySet()) {
            AbstractC1785k abstractC1785k = (AbstractC1785k) mapMo6244f.get(entry2.getKey());
            if (abstractC1785k != null) {
                abstractC1785k.mo7452d().mo7453a((C1694r) entry2.getValue(), C1778d.f5831b, C1774s.m7435m());
            }
            if (c1343k.m5766r((InterfaceC1684h) entry2.getValue())) {
                abstractC7009cM7082a = abstractC7009cM7082a.mo30605n((C1687k) entry2.getKey(), (InterfaceC1684h) entry2.getValue());
            }
        }
        return abstractC7009cM7082a;
    }

    /* JADX INFO: renamed from: g */
    private AbstractC7009c m6442g(C1696t c1696t) {
        AbstractC7009c abstractC7009cM7082a = AbstractC1685i.m7082a();
        InterfaceC1684h interfaceC1684hM6445c = m6445c(C1687k.m7088m(c1696t));
        return interfaceC1684hM6445c.mo7073b() ? abstractC7009cM7082a.mo30605n(interfaceC1684hM6445c.getKey(), interfaceC1684hM6445c) : abstractC7009cM7082a;
    }

    /* JADX INFO: renamed from: l */
    private void m6443l(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1687k c1687k = (C1687k) it.next();
            if (!map.containsKey(c1687k)) {
                treeSet.add(c1687k);
            }
        }
        map.putAll(this.f5285c.mo6239a(treeSet));
    }

    /* JADX INFO: renamed from: m */
    private Map m6444m(Map map) {
        List<C1781g> listMo6260b = this.f5284b.mo6260b(map.keySet());
        HashMap map2 = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (C1781g c1781g : listMo6260b) {
            for (C1687k c1687k : c1781g.m7474e()) {
                C1694r c1694r = (C1694r) map.get(c1687k);
                if (c1694r != null) {
                    map2.put(c1687k, c1781g.m7470a(c1694r, map2.containsKey(c1687k) ? (C1778d) map2.get(c1687k) : C1778d.f5831b));
                    int iM7473d = c1781g.m7473d();
                    if (!treeMap.containsKey(Integer.valueOf(iM7473d))) {
                        treeMap.put(Integer.valueOf(iM7473d), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(iM7473d))).add(c1687k);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap map3 = new HashMap();
            for (C1687k c1687k2 : (Set) entry.getValue()) {
                if (!hashSet.contains(c1687k2)) {
                    AbstractC1780f abstractC1780fM7460c = AbstractC1780f.m7460c((C1694r) map.get(c1687k2), (C1778d) map2.get(c1687k2));
                    if (abstractC1780fM7460c != null) {
                        map3.put(c1687k2, abstractC1780fM7460c);
                    }
                    hashSet.add(c1687k2);
                }
            }
            this.f5285c.mo6242d(((Integer) entry.getKey()).intValue(), map3);
        }
        return map2;
    }

    /* JADX INFO: renamed from: c */
    InterfaceC1684h m6445c(C1687k c1687k) {
        AbstractC1785k abstractC1785kMo6240b = this.f5285c.mo6240b(c1687k);
        C1694r c1694rM6439b = m6439b(c1687k, abstractC1785kMo6240b);
        if (abstractC1785kMo6240b != null) {
            abstractC1785kMo6240b.mo7452d().mo7453a(c1694rM6439b, C1778d.f5831b, C1774s.m7435m());
        }
        return c1694rM6439b;
    }

    /* JADX INFO: renamed from: d */
    AbstractC7009c m6446d(Iterable iterable) {
        return m6449j(this.f5283a.mo6354d(iterable), new HashSet());
    }

    /* JADX INFO: renamed from: h */
    AbstractC7009c m6447h(C1343K c1343k, AbstractC1692p.a aVar) {
        return m6448i(c1343k, aVar, null);
    }

    /* JADX INFO: renamed from: i */
    AbstractC7009c m6448i(C1343K c1343k, AbstractC1692p.a aVar, C1523Z c1523z) {
        C1696t c1696tM5760l = c1343k.m5760l();
        if (c1343k.m5764p()) {
            return m6442g(c1696tM5760l);
        }
        return c1343k.m5763o() ? m6440e(c1343k, aVar, c1523z) : m6441f(c1343k, aVar, c1523z);
    }

    /* JADX INFO: renamed from: j */
    AbstractC7009c m6449j(Map map, Set set) {
        HashMap map2 = new HashMap();
        m6443l(map2, map.keySet());
        AbstractC7009c abstractC7009cM7082a = AbstractC1685i.m7082a();
        for (Map.Entry entry : m6438a(map, map2, set).entrySet()) {
            abstractC7009cM7082a = abstractC7009cM7082a.mo30605n((C1687k) entry.getKey(), ((C1519X) entry.getValue()).m6368a());
        }
        return abstractC7009cM7082a;
    }

    /* JADX INFO: renamed from: k */
    C1564n m6450k(String str, AbstractC1692p.a aVar, int i7) {
        Map mapMo6351a = this.f5283a.mo6351a(str, aVar, i7);
        Map mapMo6243e = i7 - mapMo6351a.size() > 0 ? this.f5285c.mo6243e(str, aVar.mo7046n(), i7 - mapMo6351a.size()) : new HashMap();
        int iMax = -1;
        for (AbstractC1785k abstractC1785k : mapMo6243e.values()) {
            if (!mapMo6351a.containsKey(abstractC1785k.m7491b())) {
                mapMo6351a.put(abstractC1785k.m7491b(), m6439b(abstractC1785k.m7491b(), abstractC1785k));
            }
            iMax = Math.max(iMax, abstractC1785k.mo7451c());
        }
        m6443l(mapMo6243e, mapMo6351a.keySet());
        return C1564n.m6425a(iMax, m6438a(mapMo6351a, mapMo6243e, Collections.EMPTY_SET));
    }

    /* JADX INFO: renamed from: n */
    void m6451n(Set set) {
        m6444m(this.f5283a.mo6354d(set));
    }
}
