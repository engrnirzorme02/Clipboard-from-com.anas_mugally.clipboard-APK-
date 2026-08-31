package p158U4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import p137R4.AbstractC1370q;
import p137R4.C1342J;
import p137R4.C1348P;
import p137R4.C1369p;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: U4.x */
/* JADX INFO: loaded from: classes.dex */
public class C1700x {

    /* JADX INFO: renamed from: a */
    private final String f5638a;

    /* JADX INFO: renamed from: b */
    private final SortedSet f5639b;

    /* JADX INFO: renamed from: c */
    private final List f5640c;

    /* JADX INFO: renamed from: d */
    private final List f5641d;

    public C1700x(C1348P c1348p) {
        this.f5638a = c1348p.m5812d() != null ? c1348p.m5812d() : c1348p.m5820n().m7060o();
        this.f5641d = c1348p.m5819m();
        this.f5639b = new TreeSet(new Comparator() { // from class: U4.w
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C1369p) obj).m5922f().compareTo(((C1369p) obj2).m5922f());
            }
        });
        this.f5640c = new ArrayList();
        Iterator it = c1348p.m5814h().iterator();
        while (it.hasNext()) {
            C1369p c1369p = (C1369p) ((AbstractC1370q) it.next());
            if (c1369p.m5925i()) {
                this.f5639b.add(c1369p);
            } else {
                this.f5640c.add(c1369p);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m7157c(AbstractC1692p.c cVar) {
        Iterator it = this.f5640c.iterator();
        while (it.hasNext()) {
            if (m7158e((C1369p) it.next(), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private boolean m7158e(C1369p c1369p, AbstractC1692p.c cVar) {
        if (c1369p != null && c1369p.m5922f().equals(cVar.mo7050h())) {
            if (cVar.mo7051j().equals(AbstractC1692p.c.a.CONTAINS) == (c1369p.m5923g().equals(C1369p.b.ARRAY_CONTAINS) || c1369p.m5923g().equals(C1369p.b.ARRAY_CONTAINS_ANY))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private boolean m7159f(C1342J c1342j, AbstractC1692p.c cVar) {
        if (!c1342j.m5741c().equals(cVar.mo7050h())) {
            return false;
        }
        if (cVar.mo7051j().equals(AbstractC1692p.c.a.ASCENDING) && c1342j.m5740b().equals(C1342J.a.ASCENDING)) {
            return true;
        }
        return cVar.mo7051j().equals(AbstractC1692p.c.a.DESCENDING) && c1342j.m5740b().equals(C1342J.a.DESCENDING);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1692p m7160b() {
        if (m7161d()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (C1369p c1369p : this.f5640c) {
            if (!c1369p.m5922f().m7121B()) {
                if (c1369p.m5923g().equals(C1369p.b.ARRAY_CONTAINS) || c1369p.m5923g().equals(C1369p.b.ARRAY_CONTAINS_ANY)) {
                    arrayList.add(AbstractC1692p.c.m7115d(c1369p.m5922f(), AbstractC1692p.c.a.CONTAINS));
                } else if (!hashSet.contains(c1369p.m5922f())) {
                    hashSet.add(c1369p.m5922f());
                    arrayList.add(AbstractC1692p.c.m7115d(c1369p.m5922f(), AbstractC1692p.c.a.ASCENDING));
                }
            }
        }
        for (C1342J c1342j : this.f5641d) {
            if (!c1342j.m5741c().m7121B() && !hashSet.contains(c1342j.m5741c())) {
                hashSet.add(c1342j.m5741c());
                arrayList.add(AbstractC1692p.c.m7115d(c1342j.m5741c(), c1342j.m5740b() == C1342J.a.ASCENDING ? AbstractC1692p.c.a.ASCENDING : AbstractC1692p.c.a.DESCENDING));
            }
        }
        return AbstractC1692p.m7105b(-1, this.f5638a, arrayList, AbstractC1692p.f5608a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m7161d() {
        return this.f5639b.size() > 1;
    }

    /* JADX INFO: renamed from: g */
    public boolean m7162g(AbstractC1692p abstractC1692p) {
        AbstractC2034b.m8460d(abstractC1692p.mo7041d().equals(this.f5638a), "Collection IDs do not match", new Object[0]);
        if (m7161d()) {
            return false;
        }
        AbstractC1692p.c cVarM7106c = abstractC1692p.m7106c();
        if (cVarM7106c != null && !m7157c(cVarM7106c)) {
            return false;
        }
        Iterator it = this.f5641d.iterator();
        List listM7107e = abstractC1692p.m7107e();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (i7 < listM7107e.size() && m7157c((AbstractC1692p.c) listM7107e.get(i7))) {
            hashSet.add(((AbstractC1692p.c) listM7107e.get(i7)).mo7050h().mo7057h());
            i7++;
        }
        if (i7 == listM7107e.size()) {
            return true;
        }
        if (this.f5639b.size() > 0) {
            C1369p c1369p = (C1369p) this.f5639b.first();
            if (!hashSet.contains(c1369p.m5922f().mo7057h())) {
                AbstractC1692p.c cVar = (AbstractC1692p.c) listM7107e.get(i7);
                if (!m7158e(c1369p, cVar) || !m7159f((C1342J) it.next(), cVar)) {
                    return false;
                }
            }
            i7++;
        }
        while (i7 < listM7107e.size()) {
            AbstractC1692p.c cVar2 = (AbstractC1692p.c) listM7107e.get(i7);
            if (!it.hasNext() || !m7159f((C1342J) it.next(), cVar2)) {
                return false;
            }
            i7++;
        }
        return true;
    }
}
