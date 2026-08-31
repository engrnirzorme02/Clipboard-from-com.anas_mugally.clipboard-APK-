package p200a4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: a4.p */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2223p {

    /* JADX INFO: renamed from: a4.p$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final C2210c f7191a;

        /* JADX INFO: renamed from: b */
        private final Set f7192b = new HashSet();

        /* JADX INFO: renamed from: c */
        private final Set f7193c = new HashSet();

        b(C2210c c2210c) {
            this.f7191a = c2210c;
        }

        /* JADX INFO: renamed from: a */
        void m9019a(b bVar) {
            this.f7192b.add(bVar);
        }

        /* JADX INFO: renamed from: b */
        void m9020b(b bVar) {
            this.f7193c.add(bVar);
        }

        /* JADX INFO: renamed from: c */
        C2210c m9021c() {
            return this.f7191a;
        }

        /* JADX INFO: renamed from: d */
        Set m9022d() {
            return this.f7192b;
        }

        /* JADX INFO: renamed from: e */
        boolean m9023e() {
            return this.f7192b.isEmpty();
        }

        /* JADX INFO: renamed from: f */
        boolean m9024f() {
            return this.f7193c.isEmpty();
        }

        /* JADX INFO: renamed from: g */
        void m9025g(b bVar) {
            this.f7193c.remove(bVar);
        }
    }

    /* JADX INFO: renamed from: a4.p$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        private final C2206E f7194a;

        /* JADX INFO: renamed from: b */
        private final boolean f7195b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f7194a.equals(this.f7194a) && cVar.f7195b == this.f7195b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f7194a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f7195b).hashCode();
        }

        private c(C2206E c2206e, boolean z7) {
            this.f7194a = c2206e;
            this.f7195b = z7;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m9016a(List list) {
        Set<b> setM9018c = m9018c(list);
        Set setM9017b = m9017b(setM9018c);
        int i7 = 0;
        while (!setM9017b.isEmpty()) {
            b bVar = (b) setM9017b.iterator().next();
            setM9017b.remove(bVar);
            i7++;
            for (b bVar2 : bVar.m9022d()) {
                bVar2.m9025g(bVar);
                if (bVar2.m9024f()) {
                    setM9017b.add(bVar2);
                }
            }
        }
        if (i7 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setM9018c) {
            if (!bVar3.m9024f() && !bVar3.m9023e()) {
                arrayList.add(bVar3.m9021c());
            }
        }
        throw new C2225r(arrayList);
    }

    /* JADX INFO: renamed from: b */
    private static Set m9017b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.m9024f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: c */
    private static Set m9018c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (C2224q c2224q : bVar.m9021c().m8970g()) {
                            if (c2224q.m9039e() && (set = (Set) map.get(new c(c2224q.m9037c(), c2224q.m9041g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.m9019a(bVar2);
                                    bVar2.m9020b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C2210c c2210c = (C2210c) it.next();
            b bVar3 = new b(c2210c);
            for (C2206E c2206e : c2210c.m8973j()) {
                c cVar = new c(c2206e, !c2210c.m8977p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f7195b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c2206e));
                }
                set2.add(bVar3);
            }
        }
    }
}
