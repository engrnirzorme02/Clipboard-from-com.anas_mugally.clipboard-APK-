package p393y;

import java.util.ArrayList;
import java.util.Iterator;
import p385x.AbstractC7375j;
import p385x.C7366a;
import p385x.C7369d;
import p385x.C7370e;
import p385x.C7371f;
import p385x.C7372g;
import p385x.C7373h;

/* JADX INFO: renamed from: y.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7438i {
    /* JADX INFO: renamed from: a */
    public static C7444o m32947a(C7370e c7370e, int i7, ArrayList arrayList, C7444o c7444o) {
        int iM32679t1;
        int i8 = i7 == 0 ? c7370e.f29405I0 : c7370e.f29407J0;
        if (i8 != -1 && (c7444o == null || i8 != c7444o.m32964c())) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                C7444o c7444o2 = (C7444o) arrayList.get(i9);
                if (c7444o2.m32964c() == i8) {
                    if (c7444o != null) {
                        c7444o.m32967g(i7, c7444o2);
                        arrayList.remove(c7444o);
                    }
                    c7444o = c7444o2;
                    break;
                }
            }
        } else if (i8 != -1) {
            return c7444o;
        }
        if (c7444o == null) {
            if ((c7370e instanceof AbstractC7375j) && (iM32679t1 = ((AbstractC7375j) c7370e).m32679t1(i7)) != -1) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    C7444o c7444o3 = (C7444o) arrayList.get(i10);
                    if (c7444o3.m32964c() == iM32679t1) {
                        c7444o = c7444o3;
                        break;
                    }
                }
            }
            if (c7444o == null) {
                c7444o = new C7444o(i7);
            }
            arrayList.add(c7444o);
        }
        if (c7444o.m32962a(c7370e)) {
            if (c7370e instanceof C7373h) {
                C7373h c7373h = (C7373h) c7370e;
                c7373h.m32667s1().m32438c(c7373h.m32668t1() == 0 ? 1 : 0, arrayList, c7444o);
            }
            if (i7 == 0) {
                c7370e.f29405I0 = c7444o.m32964c();
                c7370e.f29412O.m32438c(i7, arrayList, c7444o);
                c7370e.f29414Q.m32438c(i7, arrayList, c7444o);
            } else {
                c7370e.f29407J0 = c7444o.m32964c();
                c7370e.f29413P.m32438c(i7, arrayList, c7444o);
                c7370e.f29416S.m32438c(i7, arrayList, c7444o);
                c7370e.f29415R.m32438c(i7, arrayList, c7444o);
            }
            c7370e.f29419V.m32438c(i7, arrayList, c7444o);
        }
        return c7444o;
    }

    /* JADX INFO: renamed from: b */
    private static C7444o m32948b(ArrayList arrayList, int i7) {
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C7444o c7444o = (C7444o) arrayList.get(i8);
            if (i7 == c7444o.m32964c()) {
                return c7444o;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0349  */
    /* JADX INFO: renamed from: c */
    public static boolean m32949c(C7371f c7371f, C7431b.b bVar) {
        C7444o c7444o;
        boolean z7;
        C7444o c7444o2;
        ArrayList arrayListM32704s1 = c7371f.m32704s1();
        int size = arrayListM32704s1.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            C7370e c7370e = (C7370e) arrayListM32704s1.get(i8);
            if (!m32950d(c7371f.m32467A(), c7371f.m32502T(), c7370e.m32467A(), c7370e.m32502T()) || (c7370e instanceof C7372g)) {
                return false;
            }
        }
        int i9 = 0;
        ArrayList arrayList = null;
        ArrayList<AbstractC7375j> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<AbstractC7375j> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i9 < size) {
            C7370e c7370e2 = (C7370e) arrayListM32704s1.get(i9);
            if (!m32950d(c7371f.m32467A(), c7371f.m32502T(), c7370e2.m32467A(), c7370e2.m32502T())) {
                C7371f.m32577U1(i7, c7370e2, bVar, c7371f.f29511p1, C7431b.a.f29759k);
            }
            boolean z8 = c7370e2 instanceof C7373h;
            if (z8) {
                C7373h c7373h = (C7373h) c7370e2;
                if (c7373h.m32668t1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c7373h);
                }
                if (c7373h.m32668t1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c7373h);
                }
            }
            if (c7370e2 instanceof AbstractC7375j) {
                if (c7370e2 instanceof C7366a) {
                    C7366a c7366a = (C7366a) c7370e2;
                    if (c7366a.m32429y1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c7366a);
                    }
                    if (c7366a.m32429y1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(c7366a);
                    }
                } else {
                    AbstractC7375j abstractC7375j = (AbstractC7375j) c7370e2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(abstractC7375j);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(abstractC7375j);
                }
            }
            if (c7370e2.f29412O.f29373f == null && c7370e2.f29414Q.f29373f == null && !z8 && !(c7370e2 instanceof C7366a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(c7370e2);
            }
            if (c7370e2.f29413P.f29373f == null && c7370e2.f29415R.f29373f == null && c7370e2.f29416S.f29373f == null && !z8 && !(c7370e2 instanceof C7366a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(c7370e2);
            }
            i9++;
            i7 = 0;
        }
        ArrayList<C7444o> arrayList7 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m32947a((C7373h) it.next(), 0, arrayList7, null);
            }
        }
        int i10 = 0;
        C7444o c7444o3 = null;
        if (arrayList2 != null) {
            for (AbstractC7375j abstractC7375j2 : arrayList2) {
                C7444o c7444oM32947a = m32947a(abstractC7375j2, i10, arrayList7, c7444o3);
                abstractC7375j2.m32678s1(arrayList7, i10, c7444oM32947a);
                c7444oM32947a.m32963b(arrayList7);
                i10 = 0;
                c7444o3 = null;
            }
        }
        C7369d c7369dMo32549o = c7371f.mo32549o(C7369d.a.LEFT);
        if (c7369dMo32549o.m32439d() != null) {
            Iterator it2 = c7369dMo32549o.m32439d().iterator();
            while (it2.hasNext()) {
                m32947a(((C7369d) it2.next()).f29371d, 0, arrayList7, null);
            }
        }
        C7369d c7369dMo32549o2 = c7371f.mo32549o(C7369d.a.RIGHT);
        if (c7369dMo32549o2.m32439d() != null) {
            Iterator it3 = c7369dMo32549o2.m32439d().iterator();
            while (it3.hasNext()) {
                m32947a(((C7369d) it3.next()).f29371d, 0, arrayList7, null);
            }
        }
        C7369d c7369dMo32549o3 = c7371f.mo32549o(C7369d.a.CENTER);
        if (c7369dMo32549o3.m32439d() != null) {
            Iterator it4 = c7369dMo32549o3.m32439d().iterator();
            while (it4.hasNext()) {
                m32947a(((C7369d) it4.next()).f29371d, 0, arrayList7, null);
            }
        }
        C7444o c7444o4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                m32947a((C7370e) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                m32947a((C7373h) it6.next(), 1, arrayList7, null);
            }
        }
        int i11 = 1;
        if (arrayList4 != null) {
            for (AbstractC7375j abstractC7375j3 : arrayList4) {
                C7444o c7444oM32947a2 = m32947a(abstractC7375j3, i11, arrayList7, c7444o4);
                abstractC7375j3.m32678s1(arrayList7, i11, c7444oM32947a2);
                c7444oM32947a2.m32963b(arrayList7);
                c7444o4 = null;
                i11 = 1;
            }
        }
        C7369d c7369dMo32549o4 = c7371f.mo32549o(C7369d.a.TOP);
        if (c7369dMo32549o4.m32439d() != null) {
            Iterator it7 = c7369dMo32549o4.m32439d().iterator();
            while (it7.hasNext()) {
                m32947a(((C7369d) it7.next()).f29371d, 1, arrayList7, null);
            }
        }
        C7369d c7369dMo32549o5 = c7371f.mo32549o(C7369d.a.BASELINE);
        if (c7369dMo32549o5.m32439d() != null) {
            Iterator it8 = c7369dMo32549o5.m32439d().iterator();
            while (it8.hasNext()) {
                m32947a(((C7369d) it8.next()).f29371d, 1, arrayList7, null);
            }
        }
        C7369d c7369dMo32549o6 = c7371f.mo32549o(C7369d.a.BOTTOM);
        if (c7369dMo32549o6.m32439d() != null) {
            Iterator it9 = c7369dMo32549o6.m32439d().iterator();
            while (it9.hasNext()) {
                m32947a(((C7369d) it9.next()).f29371d, 1, arrayList7, null);
            }
        }
        C7369d c7369dMo32549o7 = c7371f.mo32549o(C7369d.a.CENTER);
        if (c7369dMo32549o7.m32439d() != null) {
            Iterator it10 = c7369dMo32549o7.m32439d().iterator();
            while (it10.hasNext()) {
                m32947a(((C7369d) it10.next()).f29371d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                m32947a((C7370e) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            C7370e c7370e3 = (C7370e) arrayListM32704s1.get(i12);
            if (c7370e3.m32561s0()) {
                C7444o c7444oM32948b = m32948b(arrayList7, c7370e3.f29405I0);
                C7444o c7444oM32948b2 = m32948b(arrayList7, c7370e3.f29407J0);
                if (c7444oM32948b != null && c7444oM32948b2 != null) {
                    c7444oM32948b.m32967g(0, c7444oM32948b2);
                    c7444oM32948b2.m32969i(2);
                    arrayList7.remove(c7444oM32948b);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (c7371f.m32467A() == C7370e.b.WRAP_CONTENT) {
            c7444o = null;
            int i13 = 0;
            for (C7444o c7444o5 : arrayList7) {
                if (c7444o5.m32965d() != 1) {
                    c7444o5.m32968h(false);
                    int iM32966f = c7444o5.m32966f(c7371f.m32589M1(), 0);
                    if (iM32966f > i13) {
                        c7444o = c7444o5;
                        i13 = iM32966f;
                    }
                }
            }
            if (c7444o != null) {
                c7371f.m32497Q0(C7370e.b.FIXED);
                c7371f.m32543l1(i13);
                c7444o.m32968h(true);
            } else {
                c7444o = null;
            }
        } else {
            c7444o = null;
        }
        if (c7371f.m32502T() == C7370e.b.WRAP_CONTENT) {
            C7444o c7444o6 = null;
            int i14 = 0;
            for (C7444o c7444o7 : arrayList7) {
                if (c7444o7.m32965d() != 0) {
                    c7444o7.m32968h(false);
                    int iM32966f2 = c7444o7.m32966f(c7371f.m32589M1(), 1);
                    if (iM32966f2 > i14) {
                        c7444o6 = c7444o7;
                        i14 = iM32966f2;
                    }
                }
            }
            z7 = true;
            if (c7444o6 != null) {
                c7371f.m32532h1(C7370e.b.FIXED);
                c7371f.m32491M0(i14);
                c7444o6.m32968h(true);
                c7444o2 = c7444o6;
            }
            if (c7444o == null || c7444o2 != null) {
                return z7;
            }
            return false;
        }
        z7 = true;
        c7444o2 = null;
        if (c7444o == null) {
        }
        return z7;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m32950d(C7370e.b bVar, C7370e.b bVar2, C7370e.b bVar3, C7370e.b bVar4) {
        C7370e.b bVar5;
        C7370e.b bVar6;
        C7370e.b bVar7 = C7370e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = C7370e.b.WRAP_CONTENT) || (bVar3 == C7370e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = C7370e.b.WRAP_CONTENT) || (bVar4 == C7370e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
