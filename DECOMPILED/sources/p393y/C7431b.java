package p393y;

import java.util.ArrayList;
import p361u.C7146d;
import p385x.AbstractC7376k;
import p385x.AbstractC7377l;
import p385x.C7366a;
import p385x.C7369d;
import p385x.C7370e;
import p385x.C7371f;
import p385x.C7373h;
import p385x.InterfaceC7374i;

/* JADX INFO: renamed from: y.b */
/* JADX INFO: loaded from: classes.dex */
public class C7431b {

    /* JADX INFO: renamed from: a */
    private final ArrayList f29756a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private a f29757b = new a();

    /* JADX INFO: renamed from: c */
    private C7371f f29758c;

    /* JADX INFO: renamed from: y.b$a */
    public static class a {

        /* JADX INFO: renamed from: k */
        public static int f29759k = 0;

        /* JADX INFO: renamed from: l */
        public static int f29760l = 1;

        /* JADX INFO: renamed from: m */
        public static int f29761m = 2;

        /* JADX INFO: renamed from: a */
        public C7370e.b f29762a;

        /* JADX INFO: renamed from: b */
        public C7370e.b f29763b;

        /* JADX INFO: renamed from: c */
        public int f29764c;

        /* JADX INFO: renamed from: d */
        public int f29765d;

        /* JADX INFO: renamed from: e */
        public int f29766e;

        /* JADX INFO: renamed from: f */
        public int f29767f;

        /* JADX INFO: renamed from: g */
        public int f29768g;

        /* JADX INFO: renamed from: h */
        public boolean f29769h;

        /* JADX INFO: renamed from: i */
        public boolean f29770i;

        /* JADX INFO: renamed from: j */
        public int f29771j;
    }

    /* JADX INFO: renamed from: y.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo10378a();

        /* JADX INFO: renamed from: b */
        void mo10379b(C7370e c7370e, a aVar);
    }

    public C7431b(C7371f c7371f) {
        this.f29758c = c7371f;
    }

    /* JADX INFO: renamed from: a */
    private boolean m32906a(b bVar, C7370e c7370e, int i7) {
        this.f29757b.f29762a = c7370e.m32467A();
        this.f29757b.f29763b = c7370e.m32502T();
        this.f29757b.f29764c = c7370e.m32508W();
        this.f29757b.f29765d = c7370e.m32570x();
        a aVar = this.f29757b;
        aVar.f29770i = false;
        aVar.f29771j = i7;
        C7370e.b bVar2 = aVar.f29762a;
        C7370e.b bVar3 = C7370e.b.MATCH_CONSTRAINT;
        boolean z7 = bVar2 == bVar3;
        boolean z8 = aVar.f29763b == bVar3;
        boolean z9 = z7 && c7370e.f29431d0 > 0.0f;
        boolean z10 = z8 && c7370e.f29431d0 > 0.0f;
        if (z9 && c7370e.f29472y[0] == 4) {
            aVar.f29762a = C7370e.b.FIXED;
        }
        if (z10 && c7370e.f29472y[1] == 4) {
            aVar.f29763b = C7370e.b.FIXED;
        }
        bVar.mo10379b(c7370e, aVar);
        c7370e.m32543l1(this.f29757b.f29766e);
        c7370e.m32491M0(this.f29757b.f29767f);
        c7370e.m32489L0(this.f29757b.f29769h);
        c7370e.m32469B0(this.f29757b.f29768g);
        a aVar2 = this.f29757b;
        aVar2.f29771j = a.f29759k;
        return aVar2.f29770i;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    private void m32907b(C7371f c7371f) {
        boolean z7;
        C7441l c7441l;
        C7443n c7443n;
        int size = c7371f.f29580L0.size();
        boolean zM32597V1 = c7371f.m32597V1(64);
        b bVarM32587K1 = c7371f.m32587K1();
        for (int i7 = 0; i7 < size; i7++) {
            C7370e c7370e = (C7370e) c7371f.f29580L0.get(i7);
            if (!(c7370e instanceof C7373h) && !(c7370e instanceof C7366a) && !c7370e.m32542l0() && (!zM32597V1 || (c7441l = c7370e.f29432e) == null || (c7443n = c7370e.f29434f) == null || !c7441l.f29839e.f29792j || !c7443n.f29839e.f29792j)) {
                C7370e.b bVarM32564u = c7370e.m32564u(0);
                C7370e.b bVarM32564u2 = c7370e.m32564u(1);
                C7370e.b bVar = C7370e.b.MATCH_CONSTRAINT;
                boolean z8 = bVarM32564u == bVar && c7370e.f29468w != 1 && bVarM32564u2 == bVar && c7370e.f29470x != 1;
                if (!z8 && c7371f.m32597V1(1) && !(c7370e instanceof AbstractC7377l)) {
                    if (bVarM32564u == bVar && c7370e.f29468w == 0 && bVarM32564u2 != bVar && !c7370e.m32533i0()) {
                        z8 = true;
                    }
                    if (bVarM32564u2 == bVar && c7370e.f29470x == 0 && bVarM32564u != bVar && !c7370e.m32533i0()) {
                        z8 = true;
                    }
                    z7 = (!(bVarM32564u == bVar || bVarM32564u2 == bVar) || c7370e.f29431d0 <= 0.0f) ? z8 : true;
                }
                if (!z7) {
                    m32906a(bVarM32587K1, c7370e, a.f29759k);
                }
            }
        }
        bVarM32587K1.mo10378a();
    }

    /* JADX INFO: renamed from: c */
    private void m32908c(C7371f c7371f, String str, int i7, int i8, int i9) {
        c7371f.getClass();
        int iM32482I = c7371f.m32482I();
        int iM32480H = c7371f.m32480H();
        c7371f.m32519b1(0);
        c7371f.m32517a1(0);
        c7371f.m32543l1(i8);
        c7371f.m32491M0(i9);
        c7371f.m32519b1(iM32482I);
        c7371f.m32517a1(iM32480H);
        this.f29758c.m32600Z1(i7);
        this.f29758c.mo32604t1();
    }

    /* JADX INFO: renamed from: d */
    public long m32909d(C7371f c7371f, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        boolean zM32585I1;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z7;
        boolean zM32585I2;
        C7431b c7431b = this;
        b bVarM32587K1 = c7371f.m32587K1();
        int size = c7371f.f29580L0.size();
        int iM32508W = c7371f.m32508W();
        int iM32570x = c7371f.m32570x();
        boolean zM32681b = AbstractC7376k.m32681b(i7, 128);
        int i24 = (zM32681b || AbstractC7376k.m32681b(i7, 64)) ? 1 : 0;
        if (i24 != 0) {
            int i25 = 0;
            while (true) {
                if (i25 < size) {
                    C7370e c7370e = (C7370e) c7371f.f29580L0.get(i25);
                    C7370e.b bVarM32467A = c7370e.m32467A();
                    C7370e.b bVar = C7370e.b.MATCH_CONSTRAINT;
                    i16 = 1;
                    boolean z8 = (bVarM32467A == bVar) && (c7370e.m32502T() == bVar) && c7370e.m32566v() > 0.0f;
                    if ((c7370e.m32533i0() && z8) || ((c7370e.m32539k0() && z8) || (c7370e instanceof AbstractC7377l) || c7370e.m32533i0() || c7370e.m32539k0())) {
                        i24 = 0;
                    } else {
                        i25++;
                    }
                } else {
                    i16 = 1;
                }
            }
        } else {
            i16 = 1;
        }
        if (i24 != 0) {
            boolean z9 = C7146d.f28472s;
        }
        int i26 = i24 & (((i10 == 1073741824 && i12 == 1073741824) || zM32681b) ? i16 : 0);
        int i27 = 2;
        if (i26 != 0) {
            int iMin = Math.min(c7371f.m32478G(), i11);
            int iMin2 = Math.min(c7371f.m32476F(), i13);
            if (i10 == 1073741824 && c7371f.m32508W() != iMin) {
                c7371f.m32543l1(iMin);
                c7371f.m32591O1();
            }
            if (i12 == 1073741824 && c7371f.m32570x() != iMin2) {
                c7371f.m32491M0(iMin2);
                c7371f.m32591O1();
            }
            if (i10 == 1073741824 && i12 == 1073741824) {
                zM32585I1 = c7371f.m32583G1(zM32681b);
                i17 = 2;
            } else {
                boolean zM32584H1 = c7371f.m32584H1(zM32681b);
                if (i10 == 1073741824) {
                    zM32585I2 = zM32584H1 & c7371f.m32585I1(zM32681b, 0);
                    i17 = i16;
                } else {
                    zM32585I2 = zM32584H1;
                    i17 = 0;
                }
                if (i12 == 1073741824) {
                    int i28 = i16;
                    zM32585I1 = c7371f.m32585I1(zM32681b, i28) & zM32585I2;
                    i17 += i28;
                } else {
                    zM32585I1 = zM32585I2;
                }
            }
            if (zM32585I1) {
                c7371f.mo32556q1(i10 == 1073741824, i12 == 1073741824);
            }
        } else {
            zM32585I1 = false;
            i17 = 0;
        }
        if (zM32585I1 && i17 == 2) {
            return 0L;
        }
        int iM32588L1 = c7371f.m32588L1();
        if (size > 0) {
            m32907b(c7371f);
        }
        m32910e(c7371f);
        int size2 = c7431b.f29756a.size();
        if (size > 0) {
            c7431b.m32908c(c7371f, "First pass", 0, iM32508W, iM32570x);
            i18 = iM32508W;
            i19 = iM32570x;
        } else {
            i18 = iM32508W;
            i19 = iM32570x;
        }
        if (size2 > 0) {
            C7370e.b bVarM32467A2 = c7371f.m32467A();
            C7370e.b bVar2 = C7370e.b.WRAP_CONTENT;
            boolean z10 = bVarM32467A2 == bVar2;
            boolean z11 = c7371f.m32502T() == bVar2;
            int iMax = Math.max(c7371f.m32508W(), c7431b.f29758c.m32482I());
            int iMax2 = Math.max(c7371f.m32570x(), c7431b.f29758c.m32480H());
            int i29 = 0;
            boolean zM32687G1 = false;
            while (i29 < size2) {
                C7370e c7370e2 = (C7370e) c7431b.f29756a.get(i29);
                if (c7370e2 instanceof AbstractC7377l) {
                    int iM32508W2 = c7370e2.m32508W();
                    int iM32570x2 = c7370e2.m32570x();
                    boolean zM32906a = c7431b.m32906a(bVarM32587K1, c7370e2, a.f29760l) | zM32687G1;
                    int iM32508W3 = c7370e2.m32508W();
                    int iM32570x3 = c7370e2.m32570x();
                    if (iM32508W3 != iM32508W2) {
                        c7370e2.m32543l1(iM32508W3);
                        if (z10 && c7370e2.m32490M() > iMax) {
                            iMax = Math.max(iMax, c7370e2.m32490M() + c7370e2.mo32549o(C7369d.a.RIGHT).m32441f());
                        }
                        i23 = iMax;
                        z7 = true;
                    } else {
                        i23 = iMax;
                        z7 = zM32906a;
                    }
                    if (iM32570x3 != iM32570x2) {
                        c7370e2.m32491M0(iM32570x3);
                        if (z11 && c7370e2.m32557r() > iMax2) {
                            iMax2 = Math.max(iMax2, c7370e2.m32557r() + c7370e2.mo32549o(C7369d.a.BOTTOM).m32441f());
                        }
                        z7 = true;
                    }
                    zM32687G1 = z7 | ((AbstractC7377l) c7370e2).m32687G1();
                    iMax = i23;
                }
                i29++;
                i18 = i18;
                i27 = 2;
            }
            int i30 = i18;
            int i31 = i27;
            int i32 = 0;
            while (i32 < i31) {
                int i33 = 0;
                while (i33 < size2) {
                    C7370e c7370e3 = (C7370e) c7431b.f29756a.get(i33);
                    if (((c7370e3 instanceof InterfaceC7374i) && !(c7370e3 instanceof AbstractC7377l)) || (c7370e3 instanceof C7373h) || c7370e3.m32506V() == 8 || ((i26 != 0 && c7370e3.f29432e.f29839e.f29792j && c7370e3.f29434f.f29839e.f29792j) || (c7370e3 instanceof AbstractC7377l))) {
                        i20 = i26;
                        i21 = size2;
                    } else {
                        int iM32508W4 = c7370e3.m32508W();
                        int iM32570x4 = c7370e3.m32570x();
                        i20 = i26;
                        int iM32551p = c7370e3.m32551p();
                        int i34 = a.f29760l;
                        i21 = size2;
                        if (i32 == 1) {
                            i34 = a.f29761m;
                        }
                        boolean zM32906a2 = c7431b.m32906a(bVarM32587K1, c7370e3, i34) | zM32687G1;
                        int iM32508W5 = c7370e3.m32508W();
                        int iM32570x5 = c7370e3.m32570x();
                        if (iM32508W5 != iM32508W4) {
                            c7370e3.m32543l1(iM32508W5);
                            if (z10 && c7370e3.m32490M() > iMax) {
                                iMax = Math.max(iMax, c7370e3.m32490M() + c7370e3.mo32549o(C7369d.a.RIGHT).m32441f());
                            }
                            zM32906a2 = true;
                        }
                        if (iM32570x5 != iM32570x4) {
                            c7370e3.m32491M0(iM32570x5);
                            if (z11 && c7370e3.m32557r() > iMax2) {
                                iMax2 = Math.max(iMax2, c7370e3.m32557r() + c7370e3.mo32549o(C7369d.a.BOTTOM).m32441f());
                            }
                            zM32906a2 = true;
                        }
                        if (!c7370e3.m32514Z() || iM32551p == c7370e3.m32551p()) {
                            zM32687G1 = zM32906a2;
                        } else {
                            i22 = 1;
                            zM32687G1 = true;
                        }
                        i33 += i22;
                        c7431b = this;
                        size2 = i21;
                        i26 = i20;
                    }
                    i22 = 1;
                    i33 += i22;
                    c7431b = this;
                    size2 = i21;
                    i26 = i20;
                }
                int i35 = i26;
                int i36 = size2;
                if (!zM32687G1) {
                    break;
                }
                i32++;
                m32908c(c7371f, "intermediate pass", i32, i30, i19);
                c7431b = this;
                size2 = i36;
                i26 = i35;
                i31 = 2;
                zM32687G1 = false;
            }
        }
        c7371f.m32599Y1(iM32588L1);
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public void m32910e(C7371f c7371f) {
        this.f29756a.clear();
        int size = c7371f.f29580L0.size();
        for (int i7 = 0; i7 < size; i7++) {
            C7370e c7370e = (C7370e) c7371f.f29580L0.get(i7);
            C7370e.b bVarM32467A = c7370e.m32467A();
            C7370e.b bVar = C7370e.b.MATCH_CONSTRAINT;
            if (bVarM32467A == bVar || c7370e.m32502T() == bVar) {
                this.f29756a.add(c7370e);
            }
        }
        c7371f.m32591O1();
    }
}
