package p151T4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p137R4.C1343K;
import p158U4.AbstractC1685i;
import p158U4.AbstractC1692p;
import p158U4.C1687k;
import p158U4.C1694r;
import p158U4.C1696t;
import p158U4.C1698v;
import p158U4.InterfaceC1684h;
import p186Y4.AbstractC2034b;
import p350s4.AbstractC7009c;

/* JADX INFO: renamed from: T4.T */
/* JADX INFO: loaded from: classes.dex */
final class C1511T implements InterfaceC1541f0 {

    /* JADX INFO: renamed from: a */
    private AbstractC7009c f5149a = AbstractC1685i.m7082a();

    /* JADX INFO: renamed from: b */
    private InterfaceC1561m f5150b;

    /* JADX INFO: renamed from: T4.T$b */
    private class b implements Iterable {

        /* JADX INFO: renamed from: T4.T$b$a */
        class a implements Iterator {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Iterator f5152a;

            a(Iterator it) {
                this.f5152a = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC1684h next() {
                return (InterfaceC1684h) ((Map.Entry) this.f5152a.next()).getValue();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f5152a.hasNext();
            }
        }

        private b() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(C1511T.this.f5149a.iterator());
        }
    }

    C1511T() {
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: a */
    public Map mo6351a(String str, AbstractC1692p.a aVar, int i7) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: b */
    public Map mo6352b(C1343K c1343k, AbstractC1692p.a aVar, Set set, C1523Z c1523z) {
        HashMap map = new HashMap();
        Iterator itMo30606p = this.f5149a.mo30606p(C1687k.m7088m((C1696t) c1343k.m5760l().m7056d("")));
        while (itMo30606p.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo30606p.next();
            InterfaceC1684h interfaceC1684h = (InterfaceC1684h) entry.getValue();
            C1687k c1687k = (C1687k) entry.getKey();
            if (!c1343k.m5760l().m7062t(c1687k.m7095t())) {
                break;
            }
            if (c1687k.m7095t().m7063v() <= c1343k.m5760l().m7063v() + 1 && AbstractC1692p.a.m7111k(interfaceC1684h).compareTo(aVar) > 0 && (set.contains(interfaceC1684h.getKey()) || c1343k.m5766r(interfaceC1684h))) {
                map.put(interfaceC1684h.getKey(), interfaceC1684h.mo7072a());
            }
        }
        return map;
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: c */
    public C1694r mo6353c(C1687k c1687k) {
        InterfaceC1684h interfaceC1684h = (InterfaceC1684h) this.f5149a.mo30599b(c1687k);
        return interfaceC1684h != null ? interfaceC1684h.mo7072a() : C1694r.m7124q(c1687k);
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: d */
    public Map mo6354d(Iterable iterable) {
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1687k c1687k = (C1687k) it.next();
            map.put(c1687k, mo6353c(c1687k));
        }
        return map;
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: e */
    public void mo6355e(InterfaceC1561m interfaceC1561m) {
        this.f5150b = interfaceC1561m;
    }

    @Override // p151T4.InterfaceC1541f0
    /* JADX INFO: renamed from: f */
    public void mo6356f(C1694r c1694r, C1698v c1698v) {
        AbstractC2034b.m8460d(this.f5150b != null, "setIndexManager() not called", new Object[0]);
        AbstractC2034b.m8460d(!c1698v.equals(C1698v.f5636b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.f5149a = this.f5149a.mo30605n(c1694r.getKey(), c1694r.mo7072a().m7133v(c1698v));
        this.f5150b.mo6278e(c1694r.getKey().m7093p());
    }

    /* JADX INFO: renamed from: h */
    long m6357h(C1570p c1570p) {
        Iterator it = new b().iterator();
        long jMo22969b = 0;
        while (it.hasNext()) {
            jMo22969b += (long) c1570p.m6464k((InterfaceC1684h) it.next()).mo22969b();
        }
        return jMo22969b;
    }

    /* JADX INFO: renamed from: i */
    Iterable m6358i() {
        return new b();
    }

    @Override // p151T4.InterfaceC1541f0
    public void removeAll(Collection collection) {
        AbstractC2034b.m8460d(this.f5150b != null, "setIndexManager() not called", new Object[0]);
        AbstractC7009c abstractC7009cM7082a = AbstractC1685i.m7082a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1687k c1687k = (C1687k) it.next();
            this.f5149a = this.f5149a.mo30607q(c1687k);
            abstractC7009cM7082a = abstractC7009cM7082a.mo30605n(c1687k, C1694r.m7125r(c1687k, C1698v.f5636b));
        }
        this.f5150b.mo6275b(abstractC7009cM7082a);
    }
}
