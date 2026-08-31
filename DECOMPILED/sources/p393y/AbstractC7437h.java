package p393y;

import java.util.ArrayList;
import p385x.C7366a;
import p385x.C7369d;
import p385x.C7370e;
import p385x.C7371f;
import p385x.C7373h;

/* JADX INFO: renamed from: y.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7437h {

    /* JADX INFO: renamed from: a */
    private static C7431b.a f29805a = new C7431b.a();

    /* JADX INFO: renamed from: b */
    private static int f29806b = 0;

    /* JADX INFO: renamed from: c */
    private static int f29807c = 0;

    /* JADX INFO: renamed from: a */
    private static boolean m32938a(int i7, C7370e c7370e) {
        C7370e.b bVar;
        C7370e.b bVar2;
        C7370e.b bVarM32467A = c7370e.m32467A();
        C7370e.b bVarM32502T = c7370e.m32502T();
        C7371f c7371f = c7370e.m32486K() != null ? (C7371f) c7370e.m32486K() : null;
        if (c7371f != null) {
            c7371f.m32467A();
            C7370e.b bVar3 = C7370e.b.FIXED;
        }
        if (c7371f != null) {
            c7371f.m32502T();
            C7370e.b bVar4 = C7370e.b.FIXED;
        }
        C7370e.b bVar5 = C7370e.b.FIXED;
        boolean z7 = bVarM32467A == bVar5 || c7370e.mo32423n0() || bVarM32467A == C7370e.b.WRAP_CONTENT || (bVarM32467A == (bVar2 = C7370e.b.MATCH_CONSTRAINT) && c7370e.f29468w == 0 && c7370e.f29431d0 == 0.0f && c7370e.m32516a0(0)) || (bVarM32467A == bVar2 && c7370e.f29468w == 1 && c7370e.m32522d0(0, c7370e.m32508W()));
        boolean z8 = bVarM32502T == bVar5 || c7370e.mo32424o0() || bVarM32502T == C7370e.b.WRAP_CONTENT || (bVarM32502T == (bVar = C7370e.b.MATCH_CONSTRAINT) && c7370e.f29470x == 0 && c7370e.f29431d0 == 0.0f && c7370e.m32516a0(1)) || (bVarM32502T == bVar && c7370e.f29470x == 1 && c7370e.m32522d0(1, c7370e.m32570x()));
        if (c7370e.f29431d0 <= 0.0f || !(z7 || z8)) {
            return z7 && z8;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static void m32939b(int i7, C7370e c7370e, C7431b.b bVar, boolean z7) {
        C7369d c7369d;
        C7369d c7369d2;
        C7369d c7369d3;
        C7369d c7369d4;
        if (c7370e.m32529g0()) {
            return;
        }
        boolean z8 = true;
        f29806b++;
        if (!(c7370e instanceof C7371f) && c7370e.m32545m0()) {
            int i8 = i7 + 1;
            if (m32938a(i8, c7370e)) {
                C7371f.m32577U1(i8, c7370e, bVar, new C7431b.a(), C7431b.a.f29759k);
            }
        }
        C7369d c7369dMo32549o = c7370e.mo32549o(C7369d.a.LEFT);
        C7369d c7369dMo32549o2 = c7370e.mo32549o(C7369d.a.RIGHT);
        int iM32440e = c7369dMo32549o.m32440e();
        int iM32440e2 = c7369dMo32549o2.m32440e();
        if (c7369dMo32549o.m32439d() != null && c7369dMo32549o.m32449n()) {
            for (C7369d c7369d5 : c7369dMo32549o.m32439d()) {
                C7370e c7370e2 = c7369d5.f29371d;
                int i9 = i7 + 1;
                boolean zM32938a = m32938a(i9, c7370e2);
                if (c7370e2.m32545m0() && zM32938a) {
                    C7371f.m32577U1(i9, c7370e2, bVar, new C7431b.a(), C7431b.a.f29759k);
                }
                boolean z9 = ((c7369d5 == c7370e2.f29412O && (c7369d4 = c7370e2.f29414Q.f29373f) != null && c7369d4.m32449n()) || (c7369d5 == c7370e2.f29414Q && (c7369d3 = c7370e2.f29412O.f29373f) != null && c7369d3.m32449n())) ? z8 : false;
                C7370e.b bVarM32467A = c7370e2.m32467A();
                C7370e.b bVar2 = C7370e.b.MATCH_CONSTRAINT;
                if (bVarM32467A != bVar2 || zM32938a) {
                    if (!c7370e2.m32545m0()) {
                        C7369d c7369d6 = c7370e2.f29412O;
                        if (c7369d5 == c7369d6 && c7370e2.f29414Q.f29373f == null) {
                            int iM32441f = c7369d6.m32441f() + iM32440e;
                            c7370e2.m32479G0(iM32441f, c7370e2.m32508W() + iM32441f);
                            m32939b(i9, c7370e2, bVar, z7);
                        } else {
                            C7369d c7369d7 = c7370e2.f29414Q;
                            if (c7369d5 == c7369d7 && c7369d6.f29373f == null) {
                                int iM32441f2 = iM32440e - c7369d7.m32441f();
                                c7370e2.m32479G0(iM32441f2 - c7370e2.m32508W(), iM32441f2);
                                m32939b(i9, c7370e2, bVar, z7);
                            } else if (z9 && !c7370e2.m32533i0()) {
                                m32941d(i9, bVar, c7370e2, z7);
                            }
                        }
                    }
                } else if (c7370e2.m32467A() == bVar2 && c7370e2.f29388A >= 0 && c7370e2.f29474z >= 0 && ((c7370e2.m32506V() == 8 || (c7370e2.f29468w == 0 && c7370e2.m32566v() == 0.0f)) && !c7370e2.m32533i0() && !c7370e2.m32542l0() && z9 && !c7370e2.m32533i0())) {
                    m32942e(i9, c7370e, bVar, c7370e2, z7);
                }
                z8 = z8;
            }
        }
        boolean z10 = z8;
        if (c7370e instanceof C7373h) {
            return;
        }
        if (c7369dMo32549o2.m32439d() != null && c7369dMo32549o2.m32449n()) {
            for (C7369d c7369d8 : c7369dMo32549o2.m32439d()) {
                C7370e c7370e3 = c7369d8.f29371d;
                int i10 = i7 + 1;
                boolean zM32938a2 = m32938a(i10, c7370e3);
                if (c7370e3.m32545m0() && zM32938a2) {
                    C7371f.m32577U1(i10, c7370e3, bVar, new C7431b.a(), C7431b.a.f29759k);
                }
                boolean z11 = ((c7369d8 == c7370e3.f29412O && (c7369d2 = c7370e3.f29414Q.f29373f) != null && c7369d2.m32449n()) || (c7369d8 == c7370e3.f29414Q && (c7369d = c7370e3.f29412O.f29373f) != null && c7369d.m32449n())) ? z10 : false;
                C7370e.b bVarM32467A2 = c7370e3.m32467A();
                C7370e.b bVar3 = C7370e.b.MATCH_CONSTRAINT;
                if (bVarM32467A2 != bVar3 || zM32938a2) {
                    if (!c7370e3.m32545m0()) {
                        C7369d c7369d9 = c7370e3.f29412O;
                        if (c7369d8 == c7369d9 && c7370e3.f29414Q.f29373f == null) {
                            int iM32441f3 = c7369d9.m32441f() + iM32440e2;
                            c7370e3.m32479G0(iM32441f3, c7370e3.m32508W() + iM32441f3);
                            m32939b(i10, c7370e3, bVar, z7);
                        } else {
                            C7369d c7369d10 = c7370e3.f29414Q;
                            if (c7369d8 == c7369d10 && c7369d9.f29373f == null) {
                                int iM32441f4 = iM32440e2 - c7369d10.m32441f();
                                c7370e3.m32479G0(iM32441f4 - c7370e3.m32508W(), iM32441f4);
                                m32939b(i10, c7370e3, bVar, z7);
                            } else if (z11 && !c7370e3.m32533i0()) {
                                m32941d(i10, bVar, c7370e3, z7);
                            }
                        }
                    }
                } else if (c7370e3.m32467A() == bVar3 && c7370e3.f29388A >= 0 && c7370e3.f29474z >= 0 && (c7370e3.m32506V() == 8 || (c7370e3.f29468w == 0 && c7370e3.m32566v() == 0.0f))) {
                    if (!c7370e3.m32533i0() && !c7370e3.m32542l0() && z11 && !c7370e3.m32533i0()) {
                        m32942e(i10, c7370e, bVar, c7370e3, z7);
                    }
                }
            }
        }
        c7370e.m32555q0();
    }

    /* JADX INFO: renamed from: c */
    private static void m32940c(int i7, C7366a c7366a, C7431b.b bVar, int i8, boolean z7) {
        if (c7366a.m32425u1()) {
            if (i8 == 0) {
                m32939b(i7 + 1, c7366a, bVar, z7);
            } else {
                m32946i(i7 + 1, c7366a, bVar);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m32941d(int i7, C7431b.b bVar, C7370e c7370e, boolean z7) {
        float fM32571y = c7370e.m32571y();
        int iM32440e = c7370e.f29412O.f29373f.m32440e();
        int iM32440e2 = c7370e.f29414Q.f29373f.m32440e();
        int iM32441f = c7370e.f29412O.m32441f() + iM32440e;
        int iM32441f2 = iM32440e2 - c7370e.f29414Q.m32441f();
        if (iM32440e == iM32440e2) {
            fM32571y = 0.5f;
        } else {
            iM32440e = iM32441f;
            iM32440e2 = iM32441f2;
        }
        int iM32508W = c7370e.m32508W();
        int i8 = (iM32440e2 - iM32440e) - iM32508W;
        if (iM32440e > iM32440e2) {
            i8 = (iM32440e - iM32440e2) - iM32508W;
        }
        int i9 = ((int) (i8 > 0 ? (fM32571y * i8) + 0.5f : fM32571y * i8)) + iM32440e;
        int i10 = i9 + iM32508W;
        if (iM32440e > iM32440e2) {
            i10 = i9 - iM32508W;
        }
        c7370e.m32479G0(i9, i10);
        m32939b(i7 + 1, c7370e, bVar, z7);
    }

    /* JADX INFO: renamed from: e */
    private static void m32942e(int i7, C7370e c7370e, C7431b.b bVar, C7370e c7370e2, boolean z7) {
        float fM32571y = c7370e2.m32571y();
        int iM32440e = c7370e2.f29412O.f29373f.m32440e() + c7370e2.f29412O.m32441f();
        int iM32440e2 = c7370e2.f29414Q.f29373f.m32440e() - c7370e2.f29414Q.m32441f();
        if (iM32440e2 >= iM32440e) {
            int iM32508W = c7370e2.m32508W();
            if (c7370e2.m32506V() != 8) {
                int i8 = c7370e2.f29468w;
                if (i8 == 2) {
                    iM32508W = (int) (c7370e2.m32571y() * 0.5f * (c7370e instanceof C7371f ? c7370e.m32508W() : c7370e.m32486K().m32508W()));
                } else if (i8 == 0) {
                    iM32508W = iM32440e2 - iM32440e;
                }
                iM32508W = Math.max(c7370e2.f29474z, iM32508W);
                int i9 = c7370e2.f29388A;
                if (i9 > 0) {
                    iM32508W = Math.min(i9, iM32508W);
                }
            }
            int i10 = iM32440e + ((int) ((fM32571y * ((iM32440e2 - iM32440e) - iM32508W)) + 0.5f));
            c7370e2.m32479G0(i10, iM32508W + i10);
            m32939b(i7 + 1, c7370e2, bVar, z7);
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m32943f(int i7, C7431b.b bVar, C7370e c7370e) {
        float fM32498R = c7370e.m32498R();
        int iM32440e = c7370e.f29413P.f29373f.m32440e();
        int iM32440e2 = c7370e.f29415R.f29373f.m32440e();
        int iM32441f = c7370e.f29413P.m32441f() + iM32440e;
        int iM32441f2 = iM32440e2 - c7370e.f29415R.m32441f();
        if (iM32440e == iM32440e2) {
            fM32498R = 0.5f;
        } else {
            iM32440e = iM32441f;
            iM32440e2 = iM32441f2;
        }
        int iM32570x = c7370e.m32570x();
        int i8 = (iM32440e2 - iM32440e) - iM32570x;
        if (iM32440e > iM32440e2) {
            i8 = (iM32440e - iM32440e2) - iM32570x;
        }
        int i9 = (int) (i8 > 0 ? (fM32498R * i8) + 0.5f : fM32498R * i8);
        int i10 = iM32440e + i9;
        int i11 = i10 + iM32570x;
        if (iM32440e > iM32440e2) {
            i10 = iM32440e - i9;
            i11 = i10 - iM32570x;
        }
        c7370e.m32485J0(i10, i11);
        m32946i(i7 + 1, c7370e, bVar);
    }

    /* JADX INFO: renamed from: g */
    private static void m32944g(int i7, C7370e c7370e, C7431b.b bVar, C7370e c7370e2) {
        float fM32498R = c7370e2.m32498R();
        int iM32440e = c7370e2.f29413P.f29373f.m32440e() + c7370e2.f29413P.m32441f();
        int iM32440e2 = c7370e2.f29415R.f29373f.m32440e() - c7370e2.f29415R.m32441f();
        if (iM32440e2 >= iM32440e) {
            int iM32570x = c7370e2.m32570x();
            if (c7370e2.m32506V() != 8) {
                int i8 = c7370e2.f29470x;
                if (i8 == 2) {
                    iM32570x = (int) (fM32498R * 0.5f * (c7370e instanceof C7371f ? c7370e.m32570x() : c7370e.m32486K().m32570x()));
                } else if (i8 == 0) {
                    iM32570x = iM32440e2 - iM32440e;
                }
                iM32570x = Math.max(c7370e2.f29392C, iM32570x);
                int i9 = c7370e2.f29394D;
                if (i9 > 0) {
                    iM32570x = Math.min(i9, iM32570x);
                }
            }
            int i10 = iM32440e + ((int) ((fM32498R * ((iM32440e2 - iM32440e) - iM32570x)) + 0.5f));
            c7370e2.m32485J0(i10, iM32570x + i10);
            m32946i(i7 + 1, c7370e2, bVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m32945h(C7371f c7371f, C7431b.b bVar) {
        C7370e.b bVarM32467A = c7371f.m32467A();
        C7370e.b bVarM32502T = c7371f.m32502T();
        f29806b = 0;
        f29807c = 0;
        c7371f.m32567v0();
        ArrayList arrayListM32704s1 = c7371f.m32704s1();
        int size = arrayListM32704s1.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C7370e) arrayListM32704s1.get(i7)).m32567v0();
        }
        boolean zM32594R1 = c7371f.m32594R1();
        if (bVarM32467A == C7370e.b.FIXED) {
            c7371f.m32479G0(0, c7371f.m32508W());
        } else {
            c7371f.m32481H0(0);
        }
        boolean z7 = false;
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            C7370e c7370e = (C7370e) arrayListM32704s1.get(i8);
            if (c7370e instanceof C7373h) {
                C7373h c7373h = (C7373h) c7370e;
                if (c7373h.m32668t1() == 1) {
                    if (c7373h.m32669u1() != -1) {
                        c7373h.m32672x1(c7373h.m32669u1());
                    } else if (c7373h.m32670v1() != -1 && c7371f.mo32423n0()) {
                        c7373h.m32672x1(c7371f.m32508W() - c7373h.m32670v1());
                    } else if (c7371f.mo32423n0()) {
                        c7373h.m32672x1((int) ((c7373h.m32671w1() * c7371f.m32508W()) + 0.5f));
                    }
                    z7 = true;
                }
            } else if ((c7370e instanceof C7366a) && ((C7366a) c7370e).m32429y1() == 0) {
                z8 = true;
            }
        }
        if (z7) {
            for (int i9 = 0; i9 < size; i9++) {
                C7370e c7370e2 = (C7370e) arrayListM32704s1.get(i9);
                if (c7370e2 instanceof C7373h) {
                    C7373h c7373h2 = (C7373h) c7370e2;
                    if (c7373h2.m32668t1() == 1) {
                        m32939b(0, c7373h2, bVar, zM32594R1);
                    }
                }
            }
        }
        m32939b(0, c7371f, bVar, zM32594R1);
        if (z8) {
            for (int i10 = 0; i10 < size; i10++) {
                C7370e c7370e3 = (C7370e) arrayListM32704s1.get(i10);
                if (c7370e3 instanceof C7366a) {
                    C7366a c7366a = (C7366a) c7370e3;
                    if (c7366a.m32429y1() == 0) {
                        m32940c(0, c7366a, bVar, 0, zM32594R1);
                    }
                }
            }
        }
        if (bVarM32502T == C7370e.b.FIXED) {
            c7371f.m32485J0(0, c7371f.m32570x());
        } else {
            c7371f.m32483I0(0);
        }
        boolean z9 = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C7370e c7370e4 = (C7370e) arrayListM32704s1.get(i11);
            if (c7370e4 instanceof C7373h) {
                C7373h c7373h3 = (C7373h) c7370e4;
                if (c7373h3.m32668t1() == 0) {
                    if (c7373h3.m32669u1() != -1) {
                        c7373h3.m32672x1(c7373h3.m32669u1());
                    } else if (c7373h3.m32670v1() != -1 && c7371f.mo32424o0()) {
                        c7373h3.m32672x1(c7371f.m32570x() - c7373h3.m32670v1());
                    } else if (c7371f.mo32424o0()) {
                        c7373h3.m32672x1((int) ((c7373h3.m32671w1() * c7371f.m32570x()) + 0.5f));
                    }
                    z9 = true;
                }
            } else if ((c7370e4 instanceof C7366a) && ((C7366a) c7370e4).m32429y1() == 1) {
                z10 = true;
            }
        }
        if (z9) {
            for (int i12 = 0; i12 < size; i12++) {
                C7370e c7370e5 = (C7370e) arrayListM32704s1.get(i12);
                if (c7370e5 instanceof C7373h) {
                    C7373h c7373h4 = (C7373h) c7370e5;
                    if (c7373h4.m32668t1() == 0) {
                        m32946i(1, c7373h4, bVar);
                    }
                }
            }
        }
        m32946i(0, c7371f, bVar);
        if (z10) {
            for (int i13 = 0; i13 < size; i13++) {
                C7370e c7370e6 = (C7370e) arrayListM32704s1.get(i13);
                if (c7370e6 instanceof C7366a) {
                    C7366a c7366a2 = (C7366a) c7370e6;
                    if (c7366a2.m32429y1() == 1) {
                        m32940c(0, c7366a2, bVar, 1, zM32594R1);
                    }
                }
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            C7370e c7370e7 = (C7370e) arrayListM32704s1.get(i14);
            if (c7370e7.m32545m0() && m32938a(0, c7370e7)) {
                C7371f.m32577U1(0, c7370e7, bVar, f29805a, C7431b.a.f29759k);
                if (!(c7370e7 instanceof C7373h)) {
                    m32939b(0, c7370e7, bVar, zM32594R1);
                    m32946i(0, c7370e7, bVar);
                } else if (((C7373h) c7370e7).m32668t1() == 0) {
                    m32946i(0, c7370e7, bVar);
                } else {
                    m32939b(0, c7370e7, bVar, zM32594R1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m32946i(int i7, C7370e c7370e, C7431b.b bVar) {
        C7369d c7369d;
        C7369d c7369d2;
        C7369d c7369d3;
        C7369d c7369d4;
        if (c7370e.m32552p0()) {
            return;
        }
        boolean z7 = true;
        f29807c++;
        if (!(c7370e instanceof C7371f) && c7370e.m32545m0()) {
            int i8 = i7 + 1;
            if (m32938a(i8, c7370e)) {
                C7371f.m32577U1(i8, c7370e, bVar, new C7431b.a(), C7431b.a.f29759k);
            }
        }
        C7369d c7369dMo32549o = c7370e.mo32549o(C7369d.a.TOP);
        C7369d c7369dMo32549o2 = c7370e.mo32549o(C7369d.a.BOTTOM);
        int iM32440e = c7369dMo32549o.m32440e();
        int iM32440e2 = c7369dMo32549o2.m32440e();
        if (c7369dMo32549o.m32439d() != null && c7369dMo32549o.m32449n()) {
            for (C7369d c7369d5 : c7369dMo32549o.m32439d()) {
                C7370e c7370e2 = c7369d5.f29371d;
                int i9 = i7 + 1;
                boolean zM32938a = m32938a(i9, c7370e2);
                if (c7370e2.m32545m0() && zM32938a) {
                    C7371f.m32577U1(i9, c7370e2, bVar, new C7431b.a(), C7431b.a.f29759k);
                }
                boolean z8 = ((c7369d5 == c7370e2.f29413P && (c7369d4 = c7370e2.f29415R.f29373f) != null && c7369d4.m32449n()) || (c7369d5 == c7370e2.f29415R && (c7369d3 = c7370e2.f29413P.f29373f) != null && c7369d3.m32449n())) ? z7 : false;
                C7370e.b bVarM32502T = c7370e2.m32502T();
                boolean z9 = z7;
                C7370e.b bVar2 = C7370e.b.MATCH_CONSTRAINT;
                if (bVarM32502T != bVar2 || zM32938a) {
                    if (!c7370e2.m32545m0()) {
                        C7369d c7369d6 = c7370e2.f29413P;
                        if (c7369d5 == c7369d6 && c7370e2.f29415R.f29373f == null) {
                            int iM32441f = c7369d6.m32441f() + iM32440e;
                            c7370e2.m32485J0(iM32441f, c7370e2.m32570x() + iM32441f);
                            m32946i(i9, c7370e2, bVar);
                        } else {
                            C7369d c7369d7 = c7370e2.f29415R;
                            if (c7369d5 == c7369d7 && c7369d6.f29373f == null) {
                                int iM32441f2 = iM32440e - c7369d7.m32441f();
                                c7370e2.m32485J0(iM32441f2 - c7370e2.m32570x(), iM32441f2);
                                m32946i(i9, c7370e2, bVar);
                            } else if (z8 && !c7370e2.m32539k0()) {
                                m32943f(i9, bVar, c7370e2);
                            }
                        }
                    }
                } else if (c7370e2.m32502T() == bVar2 && c7370e2.f29394D >= 0 && c7370e2.f29392C >= 0 && ((c7370e2.m32506V() == 8 || (c7370e2.f29470x == 0 && c7370e2.m32566v() == 0.0f)) && !c7370e2.m32539k0() && !c7370e2.m32542l0() && z8 && !c7370e2.m32539k0())) {
                    m32944g(i9, c7370e, bVar, c7370e2);
                }
                z7 = z9;
            }
        }
        boolean z10 = z7;
        if (c7370e instanceof C7373h) {
            return;
        }
        if (c7369dMo32549o2.m32439d() != null && c7369dMo32549o2.m32449n()) {
            for (C7369d c7369d8 : c7369dMo32549o2.m32439d()) {
                C7370e c7370e3 = c7369d8.f29371d;
                int i10 = i7 + 1;
                boolean zM32938a2 = m32938a(i10, c7370e3);
                if (c7370e3.m32545m0() && zM32938a2) {
                    C7371f.m32577U1(i10, c7370e3, bVar, new C7431b.a(), C7431b.a.f29759k);
                }
                boolean z11 = ((c7369d8 == c7370e3.f29413P && (c7369d2 = c7370e3.f29415R.f29373f) != null && c7369d2.m32449n()) || (c7369d8 == c7370e3.f29415R && (c7369d = c7370e3.f29413P.f29373f) != null && c7369d.m32449n())) ? z10 : false;
                C7370e.b bVarM32502T2 = c7370e3.m32502T();
                C7370e.b bVar3 = C7370e.b.MATCH_CONSTRAINT;
                if (bVarM32502T2 != bVar3 || zM32938a2) {
                    if (!c7370e3.m32545m0()) {
                        C7369d c7369d9 = c7370e3.f29413P;
                        if (c7369d8 == c7369d9 && c7370e3.f29415R.f29373f == null) {
                            int iM32441f3 = c7369d9.m32441f() + iM32440e2;
                            c7370e3.m32485J0(iM32441f3, c7370e3.m32570x() + iM32441f3);
                            m32946i(i10, c7370e3, bVar);
                        } else {
                            C7369d c7369d10 = c7370e3.f29415R;
                            if (c7369d8 == c7369d10 && c7369d9.f29373f == null) {
                                int iM32441f4 = iM32440e2 - c7369d10.m32441f();
                                c7370e3.m32485J0(iM32441f4 - c7370e3.m32570x(), iM32441f4);
                                m32946i(i10, c7370e3, bVar);
                            } else if (z11 && !c7370e3.m32539k0()) {
                                m32943f(i10, bVar, c7370e3);
                            }
                        }
                    }
                } else if (c7370e3.m32502T() == bVar3 && c7370e3.f29394D >= 0 && c7370e3.f29392C >= 0 && (c7370e3.m32506V() == 8 || (c7370e3.f29470x == 0 && c7370e3.m32566v() == 0.0f))) {
                    if (!c7370e3.m32539k0() && !c7370e3.m32542l0() && z11 && !c7370e3.m32539k0()) {
                        m32944g(i10, c7370e, bVar, c7370e3);
                    }
                }
            }
        }
        C7369d c7369dMo32549o3 = c7370e.mo32549o(C7369d.a.BASELINE);
        if (c7369dMo32549o3.m32439d() != null && c7369dMo32549o3.m32449n()) {
            int iM32440e3 = c7369dMo32549o3.m32440e();
            for (C7369d c7369d11 : c7369dMo32549o3.m32439d()) {
                C7370e c7370e4 = c7369d11.f29371d;
                int i11 = i7 + 1;
                boolean zM32938a3 = m32938a(i11, c7370e4);
                if (c7370e4.m32545m0() && zM32938a3) {
                    C7371f.m32577U1(i11, c7370e4, bVar, new C7431b.a(), C7431b.a.f29759k);
                }
                if (c7370e4.m32502T() != C7370e.b.MATCH_CONSTRAINT || zM32938a3) {
                    if (!c7370e4.m32545m0() && c7369d11 == c7370e4.f29416S) {
                        c7370e4.m32477F0(c7369d11.m32441f() + iM32440e3);
                        m32946i(i11, c7370e4, bVar);
                    }
                }
            }
        }
        c7370e.m32558r0();
    }
}
