package p006A4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p030D4.AbstractC0204h;
import p030D4.C0205i;
import p030D4.C0209m;
import p374v4.AbstractC7243h;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: A4.f */
/* JADX INFO: loaded from: classes.dex */
public class C0021f {

    /* JADX INFO: renamed from: a */
    private final C0024i f112a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0204h f113b;

    /* JADX INFO: renamed from: A4.f$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0018c c0018c, C0018c c0018c2) {
            AbstractC7551l.m33233f((c0018c.m101i() == null || c0018c2.m101i() == null) ? false : true);
            return C0021f.this.f113b.compare(new C0209m(c0018c.m101i(), c0018c.m103k().m1066k()), new C0209m(c0018c2.m101i(), c0018c2.m103k().m1066k()));
        }
    }

    public C0021f(C0024i c0024i) {
        this.f112a = c0024i;
        this.f113b = c0024i.m136c();
    }

    /* JADX INFO: renamed from: b */
    private Comparator m109b() {
        return new a();
    }

    /* JADX INFO: renamed from: c */
    private C0019d m110c(C0018c c0018c, AbstractC7243h abstractC7243h, C0205i c0205i) {
        if (!c0018c.m102j().equals(InterfaceC0020e.a.VALUE) && !c0018c.m102j().equals(InterfaceC0020e.a.CHILD_REMOVED)) {
            c0018c = c0018c.m100a(c0205i.m1067m(c0018c.m101i(), c0018c.m103k().m1066k(), this.f113b));
        }
        return abstractC7243h.mo31895a(c0018c, this.f112a);
    }

    /* JADX INFO: renamed from: e */
    private void m111e(List list, InterfaceC0020e.a aVar, List list2, List list3, C0205i c0205i) {
        ArrayList<C0018c> arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C0018c c0018c = (C0018c) it.next();
            if (c0018c.m102j().equals(aVar)) {
                arrayList.add(c0018c);
            }
        }
        Collections.sort(arrayList, m109b());
        for (C0018c c0018c2 : arrayList) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                AbstractC7243h abstractC7243h = (AbstractC7243h) it2.next();
                if (abstractC7243h.mo31900g(aVar)) {
                    list.add(m110c(c0018c2, abstractC7243h, c0205i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public List m112d(List list, C0205i c0205i, List list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0018c c0018c = (C0018c) it.next();
            if (c0018c.m102j().equals(InterfaceC0020e.a.CHILD_CHANGED) && this.f113b.m1055d(c0018c.m104l().m1066k(), c0018c.m103k().m1066k())) {
                arrayList2.add(C0018c.m96f(c0018c.m101i(), c0018c.m103k()));
            }
        }
        m111e(arrayList, InterfaceC0020e.a.CHILD_REMOVED, list, list2, c0205i);
        m111e(arrayList, InterfaceC0020e.a.CHILD_ADDED, list, list2, c0205i);
        m111e(arrayList, InterfaceC0020e.a.CHILD_MOVED, arrayList2, list2, c0205i);
        m111e(arrayList, InterfaceC0020e.a.CHILD_CHANGED, list, list2, c0205i);
        m111e(arrayList, InterfaceC0020e.a.VALUE, list, list2, c0205i);
        return arrayList;
    }
}
