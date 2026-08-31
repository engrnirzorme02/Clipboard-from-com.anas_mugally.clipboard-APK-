package p151T4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import p158U4.C1687k;
import p158U4.C1696t;
import p165V4.AbstractC1780f;
import p165V4.AbstractC1785k;
import p186Y4.AbstractC2051s;

/* JADX INFO: renamed from: T4.J */
/* JADX INFO: loaded from: classes.dex */
public class C1492J implements InterfaceC1528b {

    /* JADX INFO: renamed from: a */
    private final TreeMap f5082a = new TreeMap();

    /* JADX INFO: renamed from: b */
    private final Map f5083b = new HashMap();

    /* JADX INFO: renamed from: g */
    private void m6238g(int i7, AbstractC1780f abstractC1780f) {
        AbstractC1785k abstractC1785k = (AbstractC1785k) this.f5082a.get(abstractC1780f.m7462f());
        if (abstractC1785k != null) {
            ((Set) this.f5083b.get(Integer.valueOf(abstractC1785k.mo7451c()))).remove(abstractC1780f.m7462f());
        }
        this.f5082a.put(abstractC1780f.m7462f(), AbstractC1785k.m7490a(i7, abstractC1780f));
        if (this.f5083b.get(Integer.valueOf(i7)) == null) {
            this.f5083b.put(Integer.valueOf(i7), new HashSet());
        }
        ((Set) this.f5083b.get(Integer.valueOf(i7))).add(abstractC1780f.m7462f());
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: a */
    public Map mo6239a(SortedSet sortedSet) {
        HashMap map = new HashMap();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            C1687k c1687k = (C1687k) it.next();
            AbstractC1785k abstractC1785k = (AbstractC1785k) this.f5082a.get(c1687k);
            if (abstractC1785k != null) {
                map.put(c1687k, abstractC1785k);
            }
        }
        return map;
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: b */
    public AbstractC1785k mo6240b(C1687k c1687k) {
        return (AbstractC1785k) this.f5082a.get(c1687k);
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: c */
    public void mo6241c(int i7) {
        if (this.f5083b.containsKey(Integer.valueOf(i7))) {
            Set set = (Set) this.f5083b.get(Integer.valueOf(i7));
            this.f5083b.remove(Integer.valueOf(i7));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f5082a.remove((C1687k) it.next());
            }
        }
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: d */
    public void mo6242d(int i7, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            m6238g(i7, (AbstractC1780f) AbstractC2051s.m8522c((AbstractC1780f) entry.getValue(), "null value for key: %s", entry.getKey()));
        }
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: e */
    public Map mo6243e(String str, int i7, int i8) {
        TreeMap treeMap = new TreeMap();
        for (AbstractC1785k abstractC1785k : this.f5082a.values()) {
            if (abstractC1785k.m7491b().m7092o().equals(str) && abstractC1785k.mo7451c() > i7) {
                Map map = (Map) treeMap.get(Integer.valueOf(abstractC1785k.mo7451c()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(abstractC1785k.mo7451c()), map);
                }
                map.put(abstractC1785k.m7491b(), abstractC1785k);
            }
        }
        HashMap map2 = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            map2.putAll((Map) it.next());
            if (map2.size() >= i8) {
                break;
            }
        }
        return map2;
    }

    @Override // p151T4.InterfaceC1528b
    /* JADX INFO: renamed from: f */
    public Map mo6244f(C1696t c1696t, int i7) {
        HashMap map = new HashMap();
        int iM7063v = c1696t.m7063v() + 1;
        for (AbstractC1785k abstractC1785k : this.f5082a.tailMap(C1687k.m7088m((C1696t) c1696t.m7056d(""))).values()) {
            C1687k c1687kM7491b = abstractC1785k.m7491b();
            if (!c1696t.m7062t(c1687kM7491b.m7095t())) {
                break;
            }
            if (c1687kM7491b.m7095t().m7063v() == iM7063v && abstractC1785k.mo7451c() > i7) {
                map.put(abstractC1785k.m7491b(), abstractC1785k);
            }
        }
        return map;
    }
}
