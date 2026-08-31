package p393y;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p385x.AbstractC7375j;
import p385x.C7369d;
import p385x.C7370e;
import p385x.C7371f;
import p385x.C7373h;

/* JADX INFO: renamed from: y.e */
/* JADX INFO: loaded from: classes.dex */
public class C7434e {

    /* JADX INFO: renamed from: a */
    private C7371f f29774a;

    /* JADX INFO: renamed from: d */
    private C7371f f29777d;

    /* JADX INFO: renamed from: b */
    private boolean f29775b = true;

    /* JADX INFO: renamed from: c */
    private boolean f29776c = true;

    /* JADX INFO: renamed from: e */
    private ArrayList f29778e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private ArrayList f29779f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private C7431b.b f29780g = null;

    /* JADX INFO: renamed from: h */
    private C7431b.a f29781h = new C7431b.a();

    /* JADX INFO: renamed from: i */
    ArrayList f29782i = new ArrayList();

    public C7434e(C7371f c7371f) {
        this.f29774a = c7371f;
        this.f29777d = c7371f;
    }

    /* JADX INFO: renamed from: a */
    private void m32920a(C7435f c7435f, int i7, int i8, C7435f c7435f2, ArrayList arrayList, C7442m c7442m) {
        int i9;
        C7435f c7435f3;
        ArrayList arrayList2;
        AbstractC7445p abstractC7445p = c7435f.f29786d;
        if (abstractC7445p.f29837c == null) {
            C7371f c7371f = this.f29774a;
            if (abstractC7445p == c7371f.f29432e || abstractC7445p == c7371f.f29434f) {
                return;
            }
            if (c7442m == null) {
                c7442m = new C7442m(abstractC7445p, i8);
                arrayList.add(c7442m);
            }
            C7442m c7442m2 = c7442m;
            abstractC7445p.f29837c = c7442m2;
            c7442m2.m32957a(abstractC7445p);
            for (InterfaceC7433d interfaceC7433d : abstractC7445p.f29842h.f29793k) {
                if (interfaceC7433d instanceof C7435f) {
                    i9 = i7;
                    c7435f3 = c7435f2;
                    arrayList2 = arrayList;
                    m32920a((C7435f) interfaceC7433d, i9, 0, c7435f3, arrayList2, c7442m2);
                } else {
                    i9 = i7;
                    c7435f3 = c7435f2;
                    arrayList2 = arrayList;
                }
                i7 = i9;
                c7435f2 = c7435f3;
                arrayList = arrayList2;
            }
            int i10 = i7;
            C7435f c7435f4 = c7435f2;
            ArrayList arrayList3 = arrayList;
            for (InterfaceC7433d interfaceC7433d2 : abstractC7445p.f29843i.f29793k) {
                if (interfaceC7433d2 instanceof C7435f) {
                    m32920a((C7435f) interfaceC7433d2, i10, 1, c7435f4, arrayList3, c7442m2);
                }
            }
            if (i10 == 1 && (abstractC7445p instanceof C7443n)) {
                for (InterfaceC7433d interfaceC7433d3 : ((C7443n) abstractC7445p).f29818k.f29793k) {
                    if (interfaceC7433d3 instanceof C7435f) {
                        m32920a((C7435f) interfaceC7433d3, i10, 2, c7435f4, arrayList3, c7442m2);
                    }
                }
            }
            for (C7435f c7435f5 : abstractC7445p.f29842h.f29794l) {
                if (c7435f5 == c7435f4) {
                    c7442m2.f29812b = true;
                }
                m32920a(c7435f5, i10, 0, c7435f4, arrayList3, c7442m2);
            }
            for (C7435f c7435f6 : abstractC7445p.f29843i.f29794l) {
                if (c7435f6 == c7435f4) {
                    c7442m2.f29812b = true;
                }
                m32920a(c7435f6, i10, 1, c7435f4, arrayList3, c7442m2);
            }
            if (i10 == 1 && (abstractC7445p instanceof C7443n)) {
                Iterator it = ((C7443n) abstractC7445p).f29818k.f29794l.iterator();
                while (it.hasNext()) {
                    m32920a((C7435f) it.next(), i10, 2, c7435f4, arrayList3, c7442m2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    private boolean m32921b(C7371f c7371f) {
        C7370e.b bVar;
        int i7;
        char c7;
        C7370e.b bVar2;
        C7370e.b bVar3;
        C7370e.b bVar4;
        C7370e.b bVar5;
        for (C7370e c7370e : c7371f.f29580L0) {
            C7370e.b[] bVarArr = c7370e.f29423Z;
            C7370e.b bVar6 = bVarArr[0];
            C7370e.b bVar7 = bVarArr[1];
            if (c7370e.m32506V() == 8) {
                c7370e.f29424a = true;
            } else {
                if (c7370e.f29390B < 1.0f && bVar6 == C7370e.b.MATCH_CONSTRAINT) {
                    c7370e.f29468w = 2;
                }
                if (c7370e.f29396E < 1.0f && bVar7 == C7370e.b.MATCH_CONSTRAINT) {
                    c7370e.f29470x = 2;
                }
                if (c7370e.m32566v() > 0.0f) {
                    C7370e.b bVar8 = C7370e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == C7370e.b.WRAP_CONTENT || bVar7 == C7370e.b.FIXED)) {
                        c7370e.f29468w = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == C7370e.b.WRAP_CONTENT || bVar6 == C7370e.b.FIXED)) {
                        c7370e.f29470x = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (c7370e.f29468w == 0) {
                            c7370e.f29468w = 3;
                        }
                        if (c7370e.f29470x == 0) {
                            c7370e.f29470x = 3;
                        }
                    }
                }
                C7370e.b bVar9 = C7370e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && c7370e.f29468w == 1 && (c7370e.f29412O.f29373f == null || c7370e.f29414Q.f29373f == null)) {
                    bVar6 = C7370e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && c7370e.f29470x == 1 && (c7370e.f29413P.f29373f == null || c7370e.f29415R.f29373f == null)) {
                    bVar7 = C7370e.b.WRAP_CONTENT;
                }
                C7441l c7441l = c7370e.f29432e;
                c7441l.f29838d = bVar6;
                int i8 = c7370e.f29468w;
                c7441l.f29835a = i8;
                C7443n c7443n = c7370e.f29434f;
                c7443n.f29838d = bVar7;
                int i9 = c7370e.f29470x;
                c7443n.f29835a = i9;
                C7370e.b bVar10 = C7370e.b.MATCH_PARENT;
                if ((bVar6 == bVar10 || bVar6 == C7370e.b.FIXED || bVar6 == C7370e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == C7370e.b.FIXED || bVar7 == C7370e.b.WRAP_CONTENT)) {
                    C7370e.b bVar11 = bVar7;
                    C7370e.b bVar12 = bVar6;
                    int iM32508W = c7370e.m32508W();
                    if (bVar12 == bVar10) {
                        iM32508W = (c7371f.m32508W() - c7370e.f29412O.f29374g) - c7370e.f29414Q.f29374g;
                        bVar12 = C7370e.b.FIXED;
                    }
                    int i10 = iM32508W;
                    int iM32570x = c7370e.m32570x();
                    if (bVar11 == bVar10) {
                        iM32570x = (c7371f.m32570x() - c7370e.f29413P.f29374g) - c7370e.f29415R.f29374g;
                        bVar11 = C7370e.b.FIXED;
                    }
                    m32924l(c7370e, bVar12, i10, bVar11, iM32570x);
                    c7370e.f29432e.f29839e.mo32936d(c7370e.m32508W());
                    c7370e.f29434f.f29839e.mo32936d(c7370e.m32570x());
                    c7370e.f29424a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        C7370e.b bVar13 = C7370e.b.WRAP_CONTENT;
                        c7 = 0;
                        if (bVar7 != bVar13 && bVar7 != C7370e.b.FIXED) {
                            bVar = bVar7;
                            i7 = 3;
                        } else if (i8 == 3) {
                            if (bVar7 == bVar13) {
                                m32924l(c7370e, bVar13, 0, bVar13, 0);
                            }
                            int iM32570x2 = c7370e.m32570x();
                            int i11 = (int) ((iM32570x2 * c7370e.f29431d0) + 0.5f);
                            C7370e.b bVar14 = C7370e.b.FIXED;
                            m32924l(c7370e, bVar14, i11, bVar14, iM32570x2);
                            c7370e.f29432e.f29839e.mo32936d(c7370e.m32508W());
                            c7370e.f29434f.f29839e.mo32936d(c7370e.m32570x());
                            c7370e.f29424a = true;
                        } else if (i8 == 1) {
                            m32924l(c7370e, bVar13, 0, bVar7, 0);
                            c7370e.f29432e.f29839e.f29804m = c7370e.m32508W();
                        } else {
                            bVar = bVar7;
                            i7 = 3;
                            if (i8 == 2) {
                                C7370e.b bVar15 = c7371f.f29423Z[0];
                                C7370e.b bVar16 = C7370e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    m32924l(c7370e, bVar16, (int) ((c7370e.f29390B * c7371f.m32508W()) + 0.5f), bVar, c7370e.m32570x());
                                    c7370e.f29432e.f29839e.mo32936d(c7370e.m32508W());
                                    c7370e.f29434f.f29839e.mo32936d(c7370e.m32570x());
                                    c7370e.f29424a = true;
                                }
                            } else {
                                C7369d[] c7369dArr = c7370e.f29420W;
                                if (c7369dArr[0].f29373f == null || c7369dArr[1].f29373f == null) {
                                    m32924l(c7370e, bVar13, 0, bVar, 0);
                                    c7370e.f29432e.f29839e.mo32936d(c7370e.m32508W());
                                    c7370e.f29434f.f29839e.mo32936d(c7370e.m32570x());
                                    c7370e.f29424a = true;
                                } else if (bVar == bVar2 || !(bVar6 == (bVar4 = C7370e.b.WRAP_CONTENT) || bVar6 == C7370e.b.FIXED)) {
                                    bVar3 = bVar6;
                                    if (bVar3 != bVar2 && bVar == bVar2) {
                                        if (i8 == 1 || i9 == 1) {
                                            C7370e.b bVar17 = C7370e.b.WRAP_CONTENT;
                                            m32924l(c7370e, bVar17, 0, bVar17, 0);
                                            c7370e.f29432e.f29839e.f29804m = c7370e.m32508W();
                                            c7370e.f29434f.f29839e.f29804m = c7370e.m32570x();
                                        } else if (i9 == 2 && i8 == 2) {
                                            C7370e.b[] bVarArr2 = c7371f.f29423Z;
                                            C7370e.b bVar18 = bVarArr2[c7];
                                            C7370e.b bVar19 = C7370e.b.FIXED;
                                            if (bVar18 == bVar19 && bVarArr2[1] == bVar19) {
                                                m32924l(c7370e, bVar19, (int) ((c7370e.f29390B * c7371f.m32508W()) + 0.5f), bVar19, (int) ((c7370e.f29396E * c7371f.m32570x()) + 0.5f));
                                                c7370e.f29432e.f29839e.mo32936d(c7370e.m32508W());
                                                c7370e.f29434f.f29839e.mo32936d(c7370e.m32570x());
                                                c7370e.f29424a = true;
                                            }
                                        }
                                    }
                                } else if (i9 == i7) {
                                    if (bVar6 == bVar4) {
                                        m32924l(c7370e, bVar4, 0, bVar4, 0);
                                    }
                                    int iM32508W2 = c7370e.m32508W();
                                    float f7 = c7370e.f29431d0;
                                    if (c7370e.m32568w() == -1) {
                                        f7 = 1.0f / f7;
                                    }
                                    C7370e.b bVar20 = C7370e.b.FIXED;
                                    m32924l(c7370e, bVar20, iM32508W2, bVar20, (int) ((iM32508W2 * f7) + 0.5f));
                                    c7370e.f29432e.f29839e.mo32936d(c7370e.m32508W());
                                    c7370e.f29434f.f29839e.mo32936d(c7370e.m32570x());
                                    c7370e.f29424a = true;
                                } else if (i9 == 1) {
                                    m32924l(c7370e, bVar6, 0, bVar4, 0);
                                    c7370e.f29434f.f29839e.f29804m = c7370e.m32570x();
                                } else {
                                    bVar3 = bVar6;
                                    if (i9 == 2) {
                                        C7370e.b bVar21 = c7371f.f29423Z[1];
                                        bVar5 = bVar;
                                        C7370e.b bVar22 = C7370e.b.FIXED;
                                        if (bVar21 == bVar22 || bVar21 == bVar10) {
                                            m32924l(c7370e, bVar3, c7370e.m32508W(), bVar22, (int) ((c7370e.f29396E * c7371f.m32570x()) + 0.5f));
                                            c7370e.f29432e.f29839e.mo32936d(c7370e.m32508W());
                                            c7370e.f29434f.f29839e.mo32936d(c7370e.m32570x());
                                            c7370e.f29424a = true;
                                        } else {
                                            bVar = bVar5;
                                            if (bVar3 != bVar2) {
                                            }
                                        }
                                    } else {
                                        bVar5 = bVar;
                                        C7369d[] c7369dArr2 = c7370e.f29420W;
                                        if (c7369dArr2[2].f29373f == null || c7369dArr2[i7].f29373f == null) {
                                            m32924l(c7370e, bVar4, 0, bVar5, 0);
                                            c7370e.f29432e.f29839e.mo32936d(c7370e.m32508W());
                                            c7370e.f29434f.f29839e.mo32936d(c7370e.m32570x());
                                            c7370e.f29424a = true;
                                        } else {
                                            bVar = bVar5;
                                            if (bVar3 != bVar2) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i7 = 3;
                        c7 = 0;
                        bVar2 = bVar9;
                    }
                    if (bVar == bVar2) {
                    }
                    bVar3 = bVar6;
                    if (bVar3 != bVar2) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private int m32922e(C7371f c7371f, int i7) {
        int size = this.f29782i.size();
        long jMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            jMax = Math.max(jMax, ((C7442m) this.f29782i.get(i8)).m32958b(c7371f, i7));
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: i */
    private void m32923i(AbstractC7445p abstractC7445p, int i7, ArrayList arrayList) {
        for (InterfaceC7433d interfaceC7433d : abstractC7445p.f29842h.f29793k) {
            if (interfaceC7433d instanceof C7435f) {
                m32920a((C7435f) interfaceC7433d, i7, 0, abstractC7445p.f29843i, arrayList, null);
            } else if (interfaceC7433d instanceof AbstractC7445p) {
                m32920a(((AbstractC7445p) interfaceC7433d).f29842h, i7, 0, abstractC7445p.f29843i, arrayList, null);
            }
        }
        for (InterfaceC7433d interfaceC7433d2 : abstractC7445p.f29843i.f29793k) {
            if (interfaceC7433d2 instanceof C7435f) {
                m32920a((C7435f) interfaceC7433d2, i7, 1, abstractC7445p.f29842h, arrayList, null);
            } else if (interfaceC7433d2 instanceof AbstractC7445p) {
                m32920a(((AbstractC7445p) interfaceC7433d2).f29843i, i7, 1, abstractC7445p.f29842h, arrayList, null);
            }
        }
        int i8 = i7;
        if (i8 == 1) {
            for (InterfaceC7433d interfaceC7433d3 : ((C7443n) abstractC7445p).f29818k.f29793k) {
                if (interfaceC7433d3 instanceof C7435f) {
                    m32920a((C7435f) interfaceC7433d3, i8, 2, null, arrayList, null);
                }
                i8 = i7;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m32924l(C7370e c7370e, C7370e.b bVar, int i7, C7370e.b bVar2, int i8) {
        C7431b.a aVar = this.f29781h;
        aVar.f29762a = bVar;
        aVar.f29763b = bVar2;
        aVar.f29764c = i7;
        aVar.f29765d = i8;
        this.f29780g.mo10379b(c7370e, aVar);
        c7370e.m32543l1(this.f29781h.f29766e);
        c7370e.m32491M0(this.f29781h.f29767f);
        c7370e.m32489L0(this.f29781h.f29769h);
        c7370e.m32469B0(this.f29781h.f29768g);
    }

    /* JADX INFO: renamed from: c */
    public void m32925c() {
        m32926d(this.f29778e);
        this.f29782i.clear();
        C7442m.f29810h = 0;
        m32923i(this.f29774a.f29432e, 0, this.f29782i);
        m32923i(this.f29774a.f29434f, 1, this.f29782i);
        this.f29775b = false;
    }

    /* JADX INFO: renamed from: d */
    public void m32926d(ArrayList arrayList) {
        arrayList.clear();
        this.f29777d.f29432e.mo32917f();
        this.f29777d.f29434f.mo32917f();
        arrayList.add(this.f29777d.f29432e);
        arrayList.add(this.f29777d.f29434f);
        HashSet hashSet = null;
        for (C7370e c7370e : this.f29777d.f29580L0) {
            if (c7370e instanceof C7373h) {
                arrayList.add(new C7439j(c7370e));
            } else {
                if (c7370e.m32533i0()) {
                    if (c7370e.f29428c == null) {
                        c7370e.f29428c = new C7432c(c7370e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c7370e.f29428c);
                } else {
                    arrayList.add(c7370e.f29432e);
                }
                if (c7370e.m32539k0()) {
                    if (c7370e.f29430d == null) {
                        c7370e.f29430d = new C7432c(c7370e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c7370e.f29430d);
                } else {
                    arrayList.add(c7370e.f29434f);
                }
                if (c7370e instanceof AbstractC7375j) {
                    arrayList.add(new C7440k(c7370e));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC7445p) it.next()).mo32917f();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC7445p abstractC7445p = (AbstractC7445p) it2.next();
            if (abstractC7445p.f29836b != this.f29777d) {
                abstractC7445p.mo32915d();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m32927f(boolean z7) {
        boolean z8;
        boolean z9 = false;
        if (this.f29775b || this.f29776c) {
            for (C7370e c7370e : this.f29774a.f29580L0) {
                c7370e.m32547n();
                c7370e.f29424a = false;
                c7370e.f29432e.m32954r();
                c7370e.f29434f.m32959q();
            }
            this.f29774a.m32547n();
            C7371f c7371f = this.f29774a;
            c7371f.f29424a = false;
            c7371f.f29432e.m32954r();
            this.f29774a.f29434f.m32959q();
            this.f29776c = false;
        }
        if (m32921b(this.f29777d)) {
            return false;
        }
        this.f29774a.m32548n1(0);
        this.f29774a.m32550o1(0);
        C7370e.b bVarM32564u = this.f29774a.m32564u(0);
        C7370e.b bVarM32564u2 = this.f29774a.m32564u(1);
        if (this.f29775b) {
            m32925c();
        }
        int iM32510X = this.f29774a.m32510X();
        int iM32512Y = this.f29774a.m32512Y();
        this.f29774a.f29432e.f29842h.mo32936d(iM32510X);
        this.f29774a.f29434f.f29842h.mo32936d(iM32512Y);
        m32932m();
        C7370e.b bVar = C7370e.b.WRAP_CONTENT;
        if (bVarM32564u == bVar || bVarM32564u2 == bVar) {
            if (z7) {
                Iterator it = this.f29778e.iterator();
                while (it.hasNext()) {
                    if (!((AbstractC7445p) it.next()).mo32919m()) {
                        z7 = false;
                        break;
                    }
                }
            }
            if (z7 && bVarM32564u == C7370e.b.WRAP_CONTENT) {
                this.f29774a.m32497Q0(C7370e.b.FIXED);
                C7371f c7371f2 = this.f29774a;
                c7371f2.m32543l1(m32922e(c7371f2, 0));
                C7371f c7371f3 = this.f29774a;
                c7371f3.f29432e.f29839e.mo32936d(c7371f3.m32508W());
            }
            if (z7 && bVarM32564u2 == C7370e.b.WRAP_CONTENT) {
                this.f29774a.m32532h1(C7370e.b.FIXED);
                C7371f c7371f4 = this.f29774a;
                c7371f4.m32491M0(m32922e(c7371f4, 1));
                C7371f c7371f5 = this.f29774a;
                c7371f5.f29434f.f29839e.mo32936d(c7371f5.m32570x());
            }
        }
        C7371f c7371f6 = this.f29774a;
        C7370e.b bVar2 = c7371f6.f29423Z[0];
        C7370e.b bVar3 = C7370e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C7370e.b.MATCH_PARENT) {
            int iM32508W = c7371f6.m32508W() + iM32510X;
            this.f29774a.f29432e.f29843i.mo32936d(iM32508W);
            this.f29774a.f29432e.f29839e.mo32936d(iM32508W - iM32510X);
            m32932m();
            C7371f c7371f7 = this.f29774a;
            C7370e.b bVar4 = c7371f7.f29423Z[1];
            if (bVar4 == bVar3 || bVar4 == C7370e.b.MATCH_PARENT) {
                int iM32570x = c7371f7.m32570x() + iM32512Y;
                this.f29774a.f29434f.f29843i.mo32936d(iM32570x);
                this.f29774a.f29434f.f29839e.mo32936d(iM32570x - iM32512Y);
            }
            m32932m();
            z8 = true;
        } else {
            z8 = false;
        }
        for (AbstractC7445p abstractC7445p : this.f29778e) {
            if (abstractC7445p.f29836b != this.f29774a || abstractC7445p.f29841g) {
                abstractC7445p.mo32916e();
            }
        }
        for (AbstractC7445p abstractC7445p2 : this.f29778e) {
            if (z8 || abstractC7445p2.f29836b != this.f29774a) {
                if (!abstractC7445p2.f29842h.f29792j || ((!abstractC7445p2.f29843i.f29792j && !(abstractC7445p2 instanceof C7439j)) || (!abstractC7445p2.f29839e.f29792j && !(abstractC7445p2 instanceof C7432c) && !(abstractC7445p2 instanceof C7439j)))) {
                    this.f29774a.m32497Q0(bVarM32564u);
                    this.f29774a.m32532h1(bVarM32564u2);
                    return z9;
                }
            }
        }
        z9 = true;
        this.f29774a.m32497Q0(bVarM32564u);
        this.f29774a.m32532h1(bVarM32564u2);
        return z9;
    }

    /* JADX INFO: renamed from: g */
    public boolean m32928g(boolean z7) {
        if (this.f29775b) {
            for (C7370e c7370e : this.f29774a.f29580L0) {
                c7370e.m32547n();
                c7370e.f29424a = false;
                C7441l c7441l = c7370e.f29432e;
                c7441l.f29839e.f29792j = false;
                c7441l.f29841g = false;
                c7441l.m32954r();
                C7443n c7443n = c7370e.f29434f;
                c7443n.f29839e.f29792j = false;
                c7443n.f29841g = false;
                c7443n.m32959q();
            }
            this.f29774a.m32547n();
            C7371f c7371f = this.f29774a;
            c7371f.f29424a = false;
            C7441l c7441l2 = c7371f.f29432e;
            c7441l2.f29839e.f29792j = false;
            c7441l2.f29841g = false;
            c7441l2.m32954r();
            C7443n c7443n2 = this.f29774a.f29434f;
            c7443n2.f29839e.f29792j = false;
            c7443n2.f29841g = false;
            c7443n2.m32959q();
            m32925c();
        }
        if (m32921b(this.f29777d)) {
            return false;
        }
        this.f29774a.m32548n1(0);
        this.f29774a.m32550o1(0);
        this.f29774a.f29432e.f29842h.mo32936d(0);
        this.f29774a.f29434f.f29842h.mo32936d(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    /* JADX INFO: renamed from: h */
    public boolean m32929h(boolean z7, int i7) {
        boolean z8;
        C7370e.b bVar;
        boolean z9 = false;
        C7370e.b bVarM32564u = this.f29774a.m32564u(0);
        C7370e.b bVarM32564u2 = this.f29774a.m32564u(1);
        int iM32510X = this.f29774a.m32510X();
        int iM32512Y = this.f29774a.m32512Y();
        if (z7 && (bVarM32564u == (bVar = C7370e.b.WRAP_CONTENT) || bVarM32564u2 == bVar)) {
            for (AbstractC7445p abstractC7445p : this.f29778e) {
                if (abstractC7445p.f29840f == i7 && !abstractC7445p.mo32919m()) {
                    z7 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z7 && bVarM32564u == C7370e.b.WRAP_CONTENT) {
                    this.f29774a.m32497Q0(C7370e.b.FIXED);
                    C7371f c7371f = this.f29774a;
                    c7371f.m32543l1(m32922e(c7371f, 0));
                    C7371f c7371f2 = this.f29774a;
                    c7371f2.f29432e.f29839e.mo32936d(c7371f2.m32508W());
                }
            } else if (z7 && bVarM32564u2 == C7370e.b.WRAP_CONTENT) {
                this.f29774a.m32532h1(C7370e.b.FIXED);
                C7371f c7371f3 = this.f29774a;
                c7371f3.m32491M0(m32922e(c7371f3, 1));
                C7371f c7371f4 = this.f29774a;
                c7371f4.f29434f.f29839e.mo32936d(c7371f4.m32570x());
            }
        }
        if (i7 == 0) {
            C7371f c7371f5 = this.f29774a;
            C7370e.b bVar2 = c7371f5.f29423Z[0];
            if (bVar2 == C7370e.b.FIXED || bVar2 == C7370e.b.MATCH_PARENT) {
                int iM32508W = c7371f5.m32508W() + iM32510X;
                this.f29774a.f29432e.f29843i.mo32936d(iM32508W);
                this.f29774a.f29432e.f29839e.mo32936d(iM32508W - iM32510X);
                z8 = true;
            } else {
                z8 = false;
            }
        } else {
            C7371f c7371f6 = this.f29774a;
            C7370e.b bVar3 = c7371f6.f29423Z[1];
            if (bVar3 == C7370e.b.FIXED || bVar3 == C7370e.b.MATCH_PARENT) {
                int iM32570x = c7371f6.m32570x() + iM32512Y;
                this.f29774a.f29434f.f29843i.mo32936d(iM32570x);
                this.f29774a.f29434f.f29839e.mo32936d(iM32570x - iM32512Y);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        m32932m();
        for (AbstractC7445p abstractC7445p2 : this.f29778e) {
            if (abstractC7445p2.f29840f == i7 && (abstractC7445p2.f29836b != this.f29774a || abstractC7445p2.f29841g)) {
                abstractC7445p2.mo32916e();
            }
        }
        for (AbstractC7445p abstractC7445p3 : this.f29778e) {
            if (abstractC7445p3.f29840f == i7 && (z8 || abstractC7445p3.f29836b != this.f29774a)) {
                if (!abstractC7445p3.f29842h.f29792j || !abstractC7445p3.f29843i.f29792j || (!(abstractC7445p3 instanceof C7432c) && !abstractC7445p3.f29839e.f29792j)) {
                    this.f29774a.m32497Q0(bVarM32564u);
                    this.f29774a.m32532h1(bVarM32564u2);
                    return z9;
                }
            }
        }
        z9 = true;
        this.f29774a.m32497Q0(bVarM32564u);
        this.f29774a.m32532h1(bVarM32564u2);
        return z9;
    }

    /* JADX INFO: renamed from: j */
    public void m32930j() {
        this.f29775b = true;
    }

    /* JADX INFO: renamed from: k */
    public void m32931k() {
        this.f29776c = true;
    }

    /* JADX INFO: renamed from: m */
    public void m32932m() {
        C7436g c7436g;
        for (C7370e c7370e : this.f29774a.f29580L0) {
            if (!c7370e.f29424a) {
                C7370e.b[] bVarArr = c7370e.f29423Z;
                boolean z7 = false;
                C7370e.b bVar = bVarArr[0];
                C7370e.b bVar2 = bVarArr[1];
                int i7 = c7370e.f29468w;
                int i8 = c7370e.f29470x;
                C7370e.b bVar3 = C7370e.b.WRAP_CONTENT;
                boolean z8 = bVar == bVar3 || (bVar == C7370e.b.MATCH_CONSTRAINT && i7 == 1);
                if (bVar2 == bVar3 || (bVar2 == C7370e.b.MATCH_CONSTRAINT && i8 == 1)) {
                    z7 = true;
                }
                C7436g c7436g2 = c7370e.f29432e.f29839e;
                boolean z9 = c7436g2.f29792j;
                C7436g c7436g3 = c7370e.f29434f.f29839e;
                boolean z10 = c7436g3.f29792j;
                if (z9 && z10) {
                    C7370e.b bVar4 = C7370e.b.FIXED;
                    m32924l(c7370e, bVar4, c7436g2.f29789g, bVar4, c7436g3.f29789g);
                    c7370e.f29424a = true;
                } else if (z9 && z7) {
                    m32924l(c7370e, C7370e.b.FIXED, c7436g2.f29789g, bVar3, c7436g3.f29789g);
                    if (bVar2 == C7370e.b.MATCH_CONSTRAINT) {
                        c7370e.f29434f.f29839e.f29804m = c7370e.m32570x();
                    } else {
                        c7370e.f29434f.f29839e.mo32936d(c7370e.m32570x());
                        c7370e.f29424a = true;
                    }
                } else if (z10 && z8) {
                    m32924l(c7370e, bVar3, c7436g2.f29789g, C7370e.b.FIXED, c7436g3.f29789g);
                    if (bVar == C7370e.b.MATCH_CONSTRAINT) {
                        c7370e.f29432e.f29839e.f29804m = c7370e.m32508W();
                    } else {
                        c7370e.f29432e.f29839e.mo32936d(c7370e.m32508W());
                        c7370e.f29424a = true;
                    }
                }
                if (c7370e.f29424a && (c7436g = c7370e.f29434f.f29819l) != null) {
                    c7436g.mo32936d(c7370e.m32551p());
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m32933n(C7431b.b bVar) {
        this.f29780g = bVar;
    }
}
