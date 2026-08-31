package p186Y4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p137R4.AbstractC1370q;
import p137R4.C1333A;
import p137R4.C1364k;
import p137R4.C1369p;
import p351s5.C7039u;

/* JADX INFO: renamed from: Y4.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2050r {
    /* JADX INFO: renamed from: a */
    protected static AbstractC1370q m8507a(AbstractC1370q abstractC1370q) {
        m8512f(abstractC1370q);
        if (m8519m(abstractC1370q)) {
            return abstractC1370q;
        }
        C1364k c1364k = (C1364k) abstractC1370q;
        List listMo5891b = c1364k.mo5891b();
        if (listMo5891b.size() == 1) {
            return m8507a((AbstractC1370q) listMo5891b.get(0));
        }
        if (c1364k.m5896h()) {
            return c1364k;
        }
        ArrayList<AbstractC1370q> arrayList = new ArrayList();
        Iterator it = listMo5891b.iterator();
        while (it.hasNext()) {
            arrayList.add(m8507a((AbstractC1370q) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC1370q abstractC1370q2 : arrayList) {
            if (abstractC1370q2 instanceof C1369p) {
                arrayList2.add(abstractC1370q2);
            } else if (abstractC1370q2 instanceof C1364k) {
                C1364k c1364k2 = (C1364k) abstractC1370q2;
                if (c1364k2.m5893e().equals(c1364k.m5893e())) {
                    arrayList2.addAll(c1364k2.mo5891b());
                } else {
                    arrayList2.add(c1364k2);
                }
            }
        }
        return arrayList2.size() == 1 ? (AbstractC1370q) arrayList2.get(0) : new C1364k(arrayList2, c1364k.m5893e());
    }

    /* JADX INFO: renamed from: b */
    private static AbstractC1370q m8508b(C1364k c1364k, C1364k c1364k2) {
        AbstractC2034b.m8460d((c1364k.mo5891b().isEmpty() || c1364k2.mo5891b().isEmpty()) ? false : true, "Found an empty composite filter", new Object[0]);
        if (c1364k.m5894f() && c1364k2.m5894f()) {
            return c1364k.m5898j(c1364k2.mo5891b());
        }
        C1364k c1364k3 = c1364k.m5895g() ? c1364k : c1364k2;
        if (c1364k.m5895g()) {
            c1364k = c1364k2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c1364k3.mo5891b().iterator();
        while (it.hasNext()) {
            arrayList.add(m8511e((AbstractC1370q) it.next(), c1364k));
        }
        return new C1364k(arrayList, C1364k.a.OR);
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC1370q m8509c(C1369p c1369p, C1364k c1364k) {
        if (c1364k.m5894f()) {
            return c1364k.m5898j(Collections.singletonList(c1369p));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c1364k.mo5891b().iterator();
        while (it.hasNext()) {
            arrayList.add(m8511e(c1369p, (AbstractC1370q) it.next()));
        }
        return new C1364k(arrayList, C1364k.a.OR);
    }

    /* JADX INFO: renamed from: d */
    private static AbstractC1370q m8510d(C1369p c1369p, C1369p c1369p2) {
        return new C1364k(Arrays.asList(c1369p, c1369p2), C1364k.a.AND);
    }

    /* JADX INFO: renamed from: e */
    protected static AbstractC1370q m8511e(AbstractC1370q abstractC1370q, AbstractC1370q abstractC1370q2) {
        AbstractC1370q abstractC1370qM8509c;
        m8512f(abstractC1370q);
        m8512f(abstractC1370q2);
        boolean z7 = abstractC1370q instanceof C1369p;
        if (z7 && (abstractC1370q2 instanceof C1369p)) {
            abstractC1370qM8509c = m8510d((C1369p) abstractC1370q, (C1369p) abstractC1370q2);
        } else if (z7 && (abstractC1370q2 instanceof C1364k)) {
            abstractC1370qM8509c = m8509c((C1369p) abstractC1370q, (C1364k) abstractC1370q2);
        } else {
            abstractC1370qM8509c = ((abstractC1370q instanceof C1364k) && (abstractC1370q2 instanceof C1369p)) ? m8509c((C1369p) abstractC1370q2, (C1364k) abstractC1370q) : m8508b((C1364k) abstractC1370q, (C1364k) abstractC1370q2);
        }
        return m8507a(abstractC1370qM8509c);
    }

    /* JADX INFO: renamed from: f */
    private static void m8512f(AbstractC1370q abstractC1370q) {
        AbstractC2034b.m8460d((abstractC1370q instanceof C1369p) || (abstractC1370q instanceof C1364k), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    /* JADX INFO: renamed from: g */
    protected static AbstractC1370q m8513g(AbstractC1370q abstractC1370q) {
        m8512f(abstractC1370q);
        if (abstractC1370q instanceof C1369p) {
            return abstractC1370q;
        }
        C1364k c1364k = (C1364k) abstractC1370q;
        if (c1364k.mo5891b().size() == 1) {
            return m8513g((AbstractC1370q) abstractC1370q.mo5891b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c1364k.mo5891b().iterator();
        while (it.hasNext()) {
            arrayList.add(m8513g((AbstractC1370q) it.next()));
        }
        AbstractC1370q abstractC1370qM8507a = m8507a(new C1364k(arrayList, c1364k.m5893e()));
        if (m8517k(abstractC1370qM8507a)) {
            return abstractC1370qM8507a;
        }
        AbstractC2034b.m8460d(abstractC1370qM8507a instanceof C1364k, "field filters are already in DNF form.", new Object[0]);
        C1364k c1364k2 = (C1364k) abstractC1370qM8507a;
        AbstractC2034b.m8460d(c1364k2.m5894f(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        AbstractC2034b.m8460d(c1364k2.mo5891b().size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        AbstractC1370q abstractC1370qM8511e = (AbstractC1370q) c1364k2.mo5891b().get(0);
        for (int i7 = 1; i7 < c1364k2.mo5891b().size(); i7++) {
            abstractC1370qM8511e = m8511e(abstractC1370qM8511e, (AbstractC1370q) c1364k2.mo5891b().get(i7));
        }
        return abstractC1370qM8511e;
    }

    /* JADX INFO: renamed from: h */
    protected static AbstractC1370q m8514h(AbstractC1370q abstractC1370q) {
        m8512f(abstractC1370q);
        ArrayList arrayList = new ArrayList();
        if (!(abstractC1370q instanceof C1369p)) {
            C1364k c1364k = (C1364k) abstractC1370q;
            Iterator it = c1364k.mo5891b().iterator();
            while (it.hasNext()) {
                arrayList.add(m8514h((AbstractC1370q) it.next()));
            }
            return new C1364k(arrayList, c1364k.m5893e());
        }
        if (!(abstractC1370q instanceof C1333A)) {
            return abstractC1370q;
        }
        C1333A c1333a = (C1333A) abstractC1370q;
        Iterator it2 = c1333a.m5924h().m31034l0().mo30668g().iterator();
        while (it2.hasNext()) {
            arrayList.add(C1369p.m5921e(c1333a.m5922f(), C1369p.b.EQUAL, (C7039u) it2.next()));
        }
        return new C1364k(arrayList, C1364k.a.OR);
    }

    /* JADX INFO: renamed from: i */
    public static List m8515i(C1364k c1364k) {
        if (c1364k.mo5891b().isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        AbstractC1370q abstractC1370qM8513g = m8513g(m8514h(c1364k));
        AbstractC2034b.m8460d(m8517k(abstractC1370qM8513g), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
        return (m8519m(abstractC1370qM8513g) || m8518l(abstractC1370qM8513g)) ? Collections.singletonList(abstractC1370qM8513g) : abstractC1370qM8513g.mo5891b();
    }

    /* JADX INFO: renamed from: j */
    private static boolean m8516j(AbstractC1370q abstractC1370q) {
        if (abstractC1370q instanceof C1364k) {
            C1364k c1364k = (C1364k) abstractC1370q;
            if (c1364k.m5895g()) {
                for (AbstractC1370q abstractC1370q2 : c1364k.mo5891b()) {
                    if (!m8519m(abstractC1370q2) && !m8518l(abstractC1370q2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m8517k(AbstractC1370q abstractC1370q) {
        return m8519m(abstractC1370q) || m8518l(abstractC1370q) || m8516j(abstractC1370q);
    }

    /* JADX INFO: renamed from: l */
    private static boolean m8518l(AbstractC1370q abstractC1370q) {
        return (abstractC1370q instanceof C1364k) && ((C1364k) abstractC1370q).m5897i();
    }

    /* JADX INFO: renamed from: m */
    private static boolean m8519m(AbstractC1370q abstractC1370q) {
        return abstractC1370q instanceof C1369p;
    }
}
