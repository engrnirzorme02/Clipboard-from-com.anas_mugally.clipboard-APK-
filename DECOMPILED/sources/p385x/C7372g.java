package p385x;

import java.util.ArrayList;
import p361u.C7146d;

/* JADX INFO: renamed from: x.g */
/* JADX INFO: loaded from: classes.dex */
public class C7372g extends AbstractC7377l {

    /* JADX INFO: renamed from: x1 */
    private C7370e[] f29535x1;

    /* JADX INFO: renamed from: a1 */
    private int f29512a1 = -1;

    /* JADX INFO: renamed from: b1 */
    private int f29513b1 = -1;

    /* JADX INFO: renamed from: c1 */
    private int f29514c1 = -1;

    /* JADX INFO: renamed from: d1 */
    private int f29515d1 = -1;

    /* JADX INFO: renamed from: e1 */
    private int f29516e1 = -1;

    /* JADX INFO: renamed from: f1 */
    private int f29517f1 = -1;

    /* JADX INFO: renamed from: g1 */
    private float f29518g1 = 0.5f;

    /* JADX INFO: renamed from: h1 */
    private float f29519h1 = 0.5f;

    /* JADX INFO: renamed from: i1 */
    private float f29520i1 = 0.5f;

    /* JADX INFO: renamed from: j1 */
    private float f29521j1 = 0.5f;

    /* JADX INFO: renamed from: k1 */
    private float f29522k1 = 0.5f;

    /* JADX INFO: renamed from: l1 */
    private float f29523l1 = 0.5f;

    /* JADX INFO: renamed from: m1 */
    private int f29524m1 = 0;

    /* JADX INFO: renamed from: n1 */
    private int f29525n1 = 0;

    /* JADX INFO: renamed from: o1 */
    private int f29526o1 = 2;

    /* JADX INFO: renamed from: p1 */
    private int f29527p1 = 2;

    /* JADX INFO: renamed from: q1 */
    private int f29528q1 = 0;

    /* JADX INFO: renamed from: r1 */
    private int f29529r1 = -1;

    /* JADX INFO: renamed from: s1 */
    private int f29530s1 = 0;

    /* JADX INFO: renamed from: t1 */
    private ArrayList f29531t1 = new ArrayList();

    /* JADX INFO: renamed from: u1 */
    private C7370e[] f29532u1 = null;

    /* JADX INFO: renamed from: v1 */
    private C7370e[] f29533v1 = null;

    /* JADX INFO: renamed from: w1 */
    private int[] f29534w1 = null;

    /* JADX INFO: renamed from: y1 */
    private int f29536y1 = 0;

    /* JADX INFO: renamed from: x.g$a */
    private class a {

        /* JADX INFO: renamed from: a */
        private int f29537a;

        /* JADX INFO: renamed from: d */
        private C7369d f29540d;

        /* JADX INFO: renamed from: e */
        private C7369d f29541e;

        /* JADX INFO: renamed from: f */
        private C7369d f29542f;

        /* JADX INFO: renamed from: g */
        private C7369d f29543g;

        /* JADX INFO: renamed from: h */
        private int f29544h;

        /* JADX INFO: renamed from: i */
        private int f29545i;

        /* JADX INFO: renamed from: j */
        private int f29546j;

        /* JADX INFO: renamed from: k */
        private int f29547k;

        /* JADX INFO: renamed from: q */
        private int f29553q;

        /* JADX INFO: renamed from: b */
        private C7370e f29538b = null;

        /* JADX INFO: renamed from: c */
        int f29539c = 0;

        /* JADX INFO: renamed from: l */
        private int f29548l = 0;

        /* JADX INFO: renamed from: m */
        private int f29549m = 0;

        /* JADX INFO: renamed from: n */
        private int f29550n = 0;

        /* JADX INFO: renamed from: o */
        private int f29551o = 0;

        /* JADX INFO: renamed from: p */
        private int f29552p = 0;

        a(int i7, C7369d c7369d, C7369d c7369d2, C7369d c7369d3, C7369d c7369d4, int i8) {
            this.f29544h = 0;
            this.f29545i = 0;
            this.f29546j = 0;
            this.f29547k = 0;
            this.f29553q = 0;
            this.f29537a = i7;
            this.f29540d = c7369d;
            this.f29541e = c7369d2;
            this.f29542f = c7369d3;
            this.f29543g = c7369d4;
            this.f29544h = C7372g.this.m32682A1();
            this.f29545i = C7372g.this.m32684C1();
            this.f29546j = C7372g.this.m32683B1();
            this.f29547k = C7372g.this.m32702z1();
            this.f29553q = i8;
        }

        /* JADX INFO: renamed from: h */
        private void m32656h() {
            this.f29548l = 0;
            this.f29549m = 0;
            this.f29538b = null;
            this.f29539c = 0;
            int i7 = this.f29551o;
            for (int i8 = 0; i8 < i7 && this.f29550n + i8 < C7372g.this.f29536y1; i8++) {
                C7370e c7370e = C7372g.this.f29535x1[this.f29550n + i8];
                if (this.f29537a == 0) {
                    int iM32508W = c7370e.m32508W();
                    int i9 = C7372g.this.f29524m1;
                    if (c7370e.m32506V() == 8) {
                        i9 = 0;
                    }
                    this.f29548l += iM32508W + i9;
                    int iM32629l2 = C7372g.this.m32629l2(c7370e, this.f29553q);
                    if (this.f29538b == null || this.f29539c < iM32629l2) {
                        this.f29538b = c7370e;
                        this.f29539c = iM32629l2;
                        this.f29549m = iM32629l2;
                    }
                } else {
                    int iM32630m2 = C7372g.this.m32630m2(c7370e, this.f29553q);
                    int iM32629l3 = C7372g.this.m32629l2(c7370e, this.f29553q);
                    int i10 = C7372g.this.f29525n1;
                    if (c7370e.m32506V() == 8) {
                        i10 = 0;
                    }
                    this.f29549m += iM32629l3 + i10;
                    if (this.f29538b == null || this.f29539c < iM32630m2) {
                        this.f29538b = c7370e;
                        this.f29539c = iM32630m2;
                        this.f29548l = iM32630m2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m32657b(C7370e c7370e) {
            if (this.f29537a == 0) {
                int iM32630m2 = C7372g.this.m32630m2(c7370e, this.f29553q);
                if (c7370e.m32467A() == C7370e.b.MATCH_CONSTRAINT) {
                    this.f29552p++;
                    iM32630m2 = 0;
                }
                this.f29548l += iM32630m2 + (c7370e.m32506V() != 8 ? C7372g.this.f29524m1 : 0);
                int iM32629l2 = C7372g.this.m32629l2(c7370e, this.f29553q);
                if (this.f29538b == null || this.f29539c < iM32629l2) {
                    this.f29538b = c7370e;
                    this.f29539c = iM32629l2;
                    this.f29549m = iM32629l2;
                }
            } else {
                int iM32630m3 = C7372g.this.m32630m2(c7370e, this.f29553q);
                int iM32629l3 = C7372g.this.m32629l2(c7370e, this.f29553q);
                if (c7370e.m32502T() == C7370e.b.MATCH_CONSTRAINT) {
                    this.f29552p++;
                    iM32629l3 = 0;
                }
                this.f29549m += iM32629l3 + (c7370e.m32506V() != 8 ? C7372g.this.f29525n1 : 0);
                if (this.f29538b == null || this.f29539c < iM32630m3) {
                    this.f29538b = c7370e;
                    this.f29539c = iM32630m3;
                    this.f29548l = iM32630m3;
                }
            }
            this.f29551o++;
        }

        /* JADX INFO: renamed from: c */
        public void m32658c() {
            this.f29539c = 0;
            this.f29538b = null;
            this.f29548l = 0;
            this.f29549m = 0;
            this.f29550n = 0;
            this.f29551o = 0;
            this.f29552p = 0;
        }

        /* JADX INFO: renamed from: d */
        public void m32659d(boolean z7, int i7, boolean z8) {
            C7370e c7370e;
            int i8;
            char c7;
            float f7;
            float f8;
            int i9 = this.f29551o;
            for (int i10 = 0; i10 < i9 && this.f29550n + i10 < C7372g.this.f29536y1; i10++) {
                C7370e c7370e2 = C7372g.this.f29535x1[this.f29550n + i10];
                if (c7370e2 != null) {
                    c7370e2.m32565u0();
                }
            }
            if (i9 == 0 || this.f29538b == null) {
                return;
            }
            boolean z9 = z8 && i7 == 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = z7 ? (i9 - 1) - i13 : i13;
                if (this.f29550n + i14 >= C7372g.this.f29536y1) {
                    break;
                }
                C7370e c7370e3 = C7372g.this.f29535x1[this.f29550n + i14];
                if (c7370e3 != null && c7370e3.m32506V() == 0) {
                    if (i11 == -1) {
                        i11 = i13;
                    }
                    i12 = i13;
                }
            }
            C7370e c7370e4 = null;
            if (this.f29537a != 0) {
                C7370e c7370e5 = this.f29538b;
                c7370e5.m32495O0(C7372g.this.f29512a1);
                int i15 = this.f29544h;
                if (i7 > 0) {
                    i15 += C7372g.this.f29524m1;
                }
                if (z7) {
                    c7370e5.f29414Q.m32436a(this.f29542f, i15);
                    if (z8) {
                        c7370e5.f29412O.m32436a(this.f29540d, this.f29546j);
                    }
                    if (i7 > 0) {
                        this.f29542f.f29371d.f29412O.m32436a(c7370e5.f29414Q, 0);
                    }
                } else {
                    c7370e5.f29412O.m32436a(this.f29540d, i15);
                    if (z8) {
                        c7370e5.f29414Q.m32436a(this.f29542f, this.f29546j);
                    }
                    if (i7 > 0) {
                        this.f29540d.f29371d.f29414Q.m32436a(c7370e5.f29412O, 0);
                    }
                }
                for (int i16 = 0; i16 < i9 && this.f29550n + i16 < C7372g.this.f29536y1; i16++) {
                    C7370e c7370e6 = C7372g.this.f29535x1[this.f29550n + i16];
                    if (c7370e6 != null) {
                        if (i16 == 0) {
                            c7370e6.m32538k(c7370e6.f29413P, this.f29541e, this.f29545i);
                            int i17 = C7372g.this.f29513b1;
                            float f9 = C7372g.this.f29519h1;
                            if (this.f29550n == 0 && C7372g.this.f29515d1 != -1) {
                                i17 = C7372g.this.f29515d1;
                                f9 = C7372g.this.f29521j1;
                            } else if (z8 && C7372g.this.f29517f1 != -1) {
                                i17 = C7372g.this.f29517f1;
                                f9 = C7372g.this.f29523l1;
                            }
                            c7370e6.m32528f1(i17);
                            c7370e6.m32526e1(f9);
                        }
                        if (i16 == i9 - 1) {
                            c7370e6.m32538k(c7370e6.f29415R, this.f29543g, this.f29547k);
                        }
                        if (c7370e4 != null) {
                            c7370e6.f29413P.m32436a(c7370e4.f29415R, C7372g.this.f29525n1);
                            if (i16 == i11) {
                                c7370e6.f29413P.m32456u(this.f29545i);
                            }
                            c7370e4.f29415R.m32436a(c7370e6.f29413P, 0);
                            if (i16 == i12 + 1) {
                                c7370e4.f29415R.m32456u(this.f29547k);
                            }
                        }
                        if (c7370e6 != c7370e5) {
                            if (z7) {
                                int i18 = C7372g.this.f29526o1;
                                if (i18 == 0) {
                                    c7370e6.f29414Q.m32436a(c7370e5.f29414Q, 0);
                                } else if (i18 == 1) {
                                    c7370e6.f29412O.m32436a(c7370e5.f29412O, 0);
                                } else if (i18 == 2) {
                                    c7370e6.f29412O.m32436a(c7370e5.f29412O, 0);
                                    c7370e6.f29414Q.m32436a(c7370e5.f29414Q, 0);
                                }
                            } else {
                                int i19 = C7372g.this.f29526o1;
                                if (i19 == 0) {
                                    c7370e6.f29412O.m32436a(c7370e5.f29412O, 0);
                                } else if (i19 == 1) {
                                    c7370e6.f29414Q.m32436a(c7370e5.f29414Q, 0);
                                } else if (i19 == 2) {
                                    if (z9) {
                                        c7370e6.f29412O.m32436a(this.f29540d, this.f29544h);
                                        c7370e6.f29414Q.m32436a(this.f29542f, this.f29546j);
                                    } else {
                                        c7370e6.f29412O.m32436a(c7370e5.f29412O, 0);
                                        c7370e6.f29414Q.m32436a(c7370e5.f29414Q, 0);
                                    }
                                }
                            }
                        }
                        c7370e4 = c7370e6;
                    }
                }
                return;
            }
            C7370e c7370e7 = this.f29538b;
            c7370e7.m32528f1(C7372g.this.f29513b1);
            int i20 = this.f29545i;
            if (i7 > 0) {
                i20 += C7372g.this.f29525n1;
            }
            c7370e7.f29413P.m32436a(this.f29541e, i20);
            if (z8) {
                c7370e7.f29415R.m32436a(this.f29543g, this.f29547k);
            }
            if (i7 > 0) {
                this.f29541e.f29371d.f29415R.m32436a(c7370e7.f29413P, 0);
            }
            char c8 = 3;
            if (C7372g.this.f29527p1 != 3 || c7370e7.m32514Z()) {
                c7370e = c7370e7;
                break;
            }
            int i21 = 0;
            while (true) {
                if (i21 < i9) {
                    int i22 = z7 ? (i9 - 1) - i21 : i21;
                    if (this.f29550n + i22 < C7372g.this.f29536y1) {
                        c7370e = C7372g.this.f29535x1[this.f29550n + i22];
                        if (c7370e.m32514Z()) {
                            break;
                        } else {
                            i21++;
                        }
                    }
                }
                c7370e = c7370e7;
                break;
            }
            int i23 = 0;
            while (i23 < i9) {
                int i24 = z7 ? (i9 - 1) - i23 : i23;
                if (this.f29550n + i24 >= C7372g.this.f29536y1) {
                    return;
                }
                C7370e c7370e8 = C7372g.this.f29535x1[this.f29550n + i24];
                if (c7370e8 == null) {
                    c7370e8 = c7370e4;
                    c7 = c8;
                } else {
                    if (i23 == 0) {
                        i8 = 1;
                        c7370e8.m32538k(c7370e8.f29412O, this.f29540d, this.f29544h);
                    } else {
                        i8 = 1;
                    }
                    if (i24 == 0) {
                        int i25 = C7372g.this.f29512a1;
                        float f10 = C7372g.this.f29518g1;
                        if (z7) {
                            f10 = 1.0f - f10;
                        }
                        if (this.f29550n == 0 && C7372g.this.f29514c1 != -1) {
                            i25 = C7372g.this.f29514c1;
                            if (z7) {
                                f8 = C7372g.this.f29520i1;
                                f7 = 1.0f - f8;
                            } else {
                                f7 = C7372g.this.f29520i1;
                            }
                            f10 = f7;
                        } else if (z8 && C7372g.this.f29516e1 != -1) {
                            i25 = C7372g.this.f29516e1;
                            if (z7) {
                                f8 = C7372g.this.f29522k1;
                                f7 = 1.0f - f8;
                            } else {
                                f7 = C7372g.this.f29522k1;
                            }
                            f10 = f7;
                        }
                        c7370e8.m32495O0(i25);
                        c7370e8.m32493N0(f10);
                    }
                    if (i23 == i9 - 1) {
                        c7370e8.m32538k(c7370e8.f29414Q, this.f29542f, this.f29546j);
                    }
                    if (c7370e4 != null) {
                        c7370e8.f29412O.m32436a(c7370e4.f29414Q, C7372g.this.f29524m1);
                        if (i23 == i11) {
                            c7370e8.f29412O.m32456u(this.f29544h);
                        }
                        c7370e4.f29414Q.m32436a(c7370e8.f29412O, 0);
                        if (i23 == i12 + 1) {
                            c7370e4.f29414Q.m32456u(this.f29546j);
                        }
                    }
                    if (c7370e8 != c7370e7) {
                        c7 = 3;
                        if (C7372g.this.f29527p1 == 3 && c7370e.m32514Z() && c7370e8 != c7370e && c7370e8.m32514Z()) {
                            c7370e8.f29416S.m32436a(c7370e.f29416S, 0);
                        } else {
                            int i26 = C7372g.this.f29527p1;
                            if (i26 == 0) {
                                c7370e8.f29413P.m32436a(c7370e7.f29413P, 0);
                            } else if (i26 == i8) {
                                c7370e8.f29415R.m32436a(c7370e7.f29415R, 0);
                            } else if (z9) {
                                c7370e8.f29413P.m32436a(this.f29541e, this.f29545i);
                                c7370e8.f29415R.m32436a(this.f29543g, this.f29547k);
                            } else {
                                c7370e8.f29413P.m32436a(c7370e7.f29413P, 0);
                                c7370e8.f29415R.m32436a(c7370e7.f29415R, 0);
                            }
                        }
                    } else {
                        c7 = 3;
                    }
                }
                i23++;
                c8 = c7;
                c7370e4 = c7370e8;
            }
        }

        /* JADX INFO: renamed from: e */
        public int m32660e() {
            return this.f29537a == 1 ? this.f29549m - C7372g.this.f29525n1 : this.f29549m;
        }

        /* JADX INFO: renamed from: f */
        public int m32661f() {
            return this.f29537a == 0 ? this.f29548l - C7372g.this.f29524m1 : this.f29548l;
        }

        /* JADX INFO: renamed from: g */
        public void m32662g(int i7) {
            int i8 = this.f29552p;
            if (i8 == 0) {
                return;
            }
            int i9 = this.f29551o;
            int i10 = i7 / i8;
            for (int i11 = 0; i11 < i9 && this.f29550n + i11 < C7372g.this.f29536y1; i11++) {
                C7370e c7370e = C7372g.this.f29535x1[this.f29550n + i11];
                if (this.f29537a == 0) {
                    if (c7370e != null && c7370e.m32467A() == C7370e.b.MATCH_CONSTRAINT && c7370e.f29468w == 0) {
                        C7372g.this.m32685E1(c7370e, C7370e.b.FIXED, i10, c7370e.m32502T(), c7370e.m32570x());
                    }
                } else if (c7370e != null && c7370e.m32502T() == C7370e.b.MATCH_CONSTRAINT && c7370e.f29470x == 0) {
                    int i12 = i10;
                    C7372g.this.m32685E1(c7370e, c7370e.m32467A(), c7370e.m32508W(), C7370e.b.FIXED, i12);
                    i10 = i12;
                }
            }
            m32656h();
        }

        /* JADX INFO: renamed from: i */
        public void m32663i(int i7) {
            this.f29550n = i7;
        }

        /* JADX INFO: renamed from: j */
        public void m32664j(int i7, C7369d c7369d, C7369d c7369d2, C7369d c7369d3, C7369d c7369d4, int i8, int i9, int i10, int i11, int i12) {
            this.f29537a = i7;
            this.f29540d = c7369d;
            this.f29541e = c7369d2;
            this.f29542f = c7369d3;
            this.f29543g = c7369d4;
            this.f29544h = i8;
            this.f29545i = i9;
            this.f29546j = i10;
            this.f29547k = i11;
            this.f29553q = i12;
        }
    }

    /* JADX INFO: renamed from: k2 */
    private void m32628k2(boolean z7) {
        C7370e c7370e;
        float f7;
        int i7;
        if (this.f29534w1 == null || this.f29533v1 == null || this.f29532u1 == null) {
            return;
        }
        for (int i8 = 0; i8 < this.f29536y1; i8++) {
            this.f29535x1[i8].m32565u0();
        }
        int[] iArr = this.f29534w1;
        int i9 = iArr[0];
        int i10 = iArr[1];
        float f8 = this.f29518g1;
        C7370e c7370e2 = null;
        int i11 = 0;
        while (i11 < i9) {
            if (z7) {
                i7 = (i9 - i11) - 1;
                f7 = 1.0f - this.f29518g1;
            } else {
                f7 = f8;
                i7 = i11;
            }
            C7370e c7370e3 = this.f29533v1[i7];
            if (c7370e3 != null && c7370e3.m32506V() != 8) {
                if (i11 == 0) {
                    c7370e3.m32538k(c7370e3.f29412O, this.f29412O, m32682A1());
                    c7370e3.m32495O0(this.f29512a1);
                    c7370e3.m32493N0(f7);
                }
                if (i11 == i9 - 1) {
                    c7370e3.m32538k(c7370e3.f29414Q, this.f29414Q, m32683B1());
                }
                if (i11 > 0 && c7370e2 != null) {
                    c7370e3.m32538k(c7370e3.f29412O, c7370e2.f29414Q, this.f29524m1);
                    c7370e2.m32538k(c7370e2.f29414Q, c7370e3.f29412O, 0);
                }
                c7370e2 = c7370e3;
            }
            i11++;
            f8 = f7;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C7370e c7370e4 = this.f29532u1[i12];
            if (c7370e4 != null && c7370e4.m32506V() != 8) {
                if (i12 == 0) {
                    c7370e4.m32538k(c7370e4.f29413P, this.f29413P, m32684C1());
                    c7370e4.m32528f1(this.f29513b1);
                    c7370e4.m32526e1(this.f29519h1);
                }
                if (i12 == i10 - 1) {
                    c7370e4.m32538k(c7370e4.f29415R, this.f29415R, m32702z1());
                }
                if (i12 > 0 && c7370e2 != null) {
                    c7370e4.m32538k(c7370e4.f29413P, c7370e2.f29415R, this.f29525n1);
                    c7370e2.m32538k(c7370e2.f29415R, c7370e4.f29413P, 0);
                }
                c7370e2 = c7370e4;
            }
        }
        for (int i13 = 0; i13 < i9; i13++) {
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = (i14 * i9) + i13;
                if (this.f29530s1 == 1) {
                    i15 = (i13 * i10) + i14;
                }
                C7370e[] c7370eArr = this.f29535x1;
                if (i15 < c7370eArr.length && (c7370e = c7370eArr[i15]) != null && c7370e.m32506V() != 8) {
                    C7370e c7370e5 = this.f29533v1[i13];
                    C7370e c7370e6 = this.f29532u1[i14];
                    if (c7370e != c7370e5) {
                        c7370e.m32538k(c7370e.f29412O, c7370e5.f29412O, 0);
                        c7370e.m32538k(c7370e.f29414Q, c7370e5.f29414Q, 0);
                    }
                    if (c7370e != c7370e6) {
                        c7370e.m32538k(c7370e.f29413P, c7370e6.f29413P, 0);
                        c7370e.m32538k(c7370e.f29415R, c7370e6.f29415R, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public int m32629l2(C7370e c7370e, int i7) {
        C7370e c7370e2;
        if (c7370e == null) {
            return 0;
        }
        if (c7370e.m32502T() == C7370e.b.MATCH_CONSTRAINT) {
            int i8 = c7370e.f29470x;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (c7370e.f29396E * i7);
                if (i9 != c7370e.m32570x()) {
                    c7370e.m32515Z0(true);
                    m32685E1(c7370e, c7370e.m32467A(), c7370e.m32508W(), C7370e.b.FIXED, i9);
                }
                return i9;
            }
            c7370e2 = c7370e;
            if (i8 == 1) {
                return c7370e2.m32570x();
            }
            if (i8 == 3) {
                return (int) ((c7370e2.m32508W() * c7370e2.f29431d0) + 0.5f);
            }
        } else {
            c7370e2 = c7370e;
        }
        return c7370e2.m32570x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public int m32630m2(C7370e c7370e, int i7) {
        C7370e c7370e2;
        if (c7370e == null) {
            return 0;
        }
        if (c7370e.m32467A() == C7370e.b.MATCH_CONSTRAINT) {
            int i8 = c7370e.f29468w;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (c7370e.f29390B * i7);
                if (i9 != c7370e.m32508W()) {
                    c7370e.m32515Z0(true);
                    m32685E1(c7370e, C7370e.b.FIXED, i9, c7370e.m32502T(), c7370e.m32570x());
                }
                return i9;
            }
            c7370e2 = c7370e;
            if (i8 == 1) {
                return c7370e2.m32508W();
            }
            if (i8 == 3) {
                return (int) ((c7370e2.m32570x() * c7370e2.f29431d0) + 0.5f);
            }
        } else {
            c7370e2 = c7370e;
        }
        return c7370e2.m32508W();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:119:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:122:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX WARN: Code duplicated, block: B:66:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x009f  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: n2 */
    private void m32631n2(p385x.C7370e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p385x.C7372g.m32631n2(x.e[], int, int, int, int[]):void");
    }

    /* JADX INFO: renamed from: o2 */
    private void m32632o2(C7370e[] c7370eArr, int i7, int i8, int i9, int[] iArr) {
        int i10;
        C7372g c7372g;
        int i11;
        C7369d c7369d;
        int i12;
        C7372g c7372g2 = this;
        if (i7 == 0) {
            return;
        }
        c7372g2.f29531t1.clear();
        int i13 = i9;
        a aVar = c7372g2.new a(i8, c7372g2.f29412O, c7372g2.f29413P, c7372g2.f29414Q, c7372g2.f29415R, i13);
        c7372g2.f29531t1.add(aVar);
        if (i8 == 0) {
            i10 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < i7) {
                C7370e c7370e = c7370eArr[i15];
                int iM32630m2 = c7372g2.m32630m2(c7370e, i13);
                if (c7370e.m32467A() == C7370e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i16 = i10;
                boolean z7 = (i14 == i13 || (c7372g2.f29524m1 + i14) + iM32630m2 > i13) && aVar.f29538b != null;
                if (!z7 && i15 > 0 && (i12 = c7372g2.f29529r1) > 0 && i15 % i12 == 0) {
                    z7 = true;
                }
                if (z7) {
                    aVar = c7372g2.new a(i8, c7372g2.f29412O, c7372g2.f29413P, c7372g2.f29414Q, c7372g2.f29415R, i13);
                    aVar.m32663i(i15);
                    c7372g2.f29531t1.add(aVar);
                } else {
                    if (i15 > 0) {
                        i14 += c7372g2.f29524m1 + iM32630m2;
                    }
                    aVar.m32657b(c7370e);
                    i15++;
                    i10 = i16;
                }
                i14 = iM32630m2;
                aVar.m32657b(c7370e);
                i15++;
                i10 = i16;
            }
        } else {
            i10 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i7) {
                C7370e c7370e2 = c7370eArr[i18];
                int iM32629l2 = c7372g2.m32629l2(c7370e2, i13);
                if (c7370e2.m32502T() == C7370e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i19 = i10;
                boolean z8 = (i17 == i13 || (c7372g2.f29525n1 + i17) + iM32629l2 > i13) && aVar.f29538b != null;
                if (!z8 && i18 > 0 && (i11 = c7372g2.f29529r1) > 0 && i18 % i11 == 0) {
                    z8 = true;
                }
                if (z8) {
                    aVar = c7372g2.new a(i8, c7372g2.f29412O, c7372g2.f29413P, c7372g2.f29414Q, c7372g2.f29415R, i13);
                    c7372g = c7372g2;
                    aVar.m32663i(i18);
                    c7372g.f29531t1.add(aVar);
                } else {
                    c7372g = c7372g2;
                    if (i18 > 0) {
                        i17 += c7372g.f29525n1 + iM32629l2;
                    }
                    aVar.m32657b(c7370e2);
                    i18++;
                    i13 = i9;
                    i10 = i19;
                    c7372g2 = c7372g;
                }
                i17 = iM32629l2;
                aVar.m32657b(c7370e2);
                i18++;
                i13 = i9;
                i10 = i19;
                c7372g2 = c7372g;
            }
        }
        C7372g c7372g3 = c7372g2;
        int size = c7372g3.f29531t1.size();
        C7369d c7369d2 = c7372g3.f29412O;
        C7369d c7369d3 = c7372g3.f29413P;
        C7369d c7369d4 = c7372g3.f29414Q;
        C7369d c7369d5 = c7372g3.f29415R;
        int iM32682A1 = c7372g3.m32682A1();
        int iM32684C1 = c7372g3.m32684C1();
        int iM32683B1 = c7372g3.m32683B1();
        int iM32702z1 = c7372g3.m32702z1();
        C7370e.b bVarM32467A = c7372g3.m32467A();
        C7370e.b bVar = C7370e.b.WRAP_CONTENT;
        boolean z9 = bVarM32467A == bVar || c7372g3.m32502T() == bVar;
        if (i10 > 0 && z9) {
            for (int i20 = 0; i20 < size; i20++) {
                a aVar2 = (a) c7372g3.f29531t1.get(i20);
                if (i8 == 0) {
                    aVar2.m32662g(i9 - aVar2.m32661f());
                } else {
                    aVar2.m32662g(i9 - aVar2.m32660e());
                }
            }
        }
        C7369d c7369d6 = c7369d2;
        int iM32702z2 = iM32702z1;
        int i21 = 0;
        int iM32683B2 = iM32683B1;
        int i22 = iM32684C1;
        int i23 = iM32682A1;
        C7369d c7369d7 = c7369d5;
        C7369d c7369d8 = c7369d4;
        C7369d c7369d9 = c7369d3;
        int i24 = 0;
        for (int i25 = 0; i25 < size; i25++) {
            a aVar3 = (a) c7372g3.f29531t1.get(i25);
            if (i8 == 0) {
                if (i25 < size - 1) {
                    c7369d7 = ((a) c7372g3.f29531t1.get(i25 + 1)).f29538b.f29413P;
                    iM32702z2 = 0;
                } else {
                    c7369d7 = c7372g3.f29415R;
                    iM32702z2 = c7372g3.m32702z1();
                }
                C7369d c7369d10 = aVar3.f29538b.f29415R;
                int i26 = i24;
                aVar3.m32664j(i8, c7369d6, c7369d9, c7369d8, c7369d7, i23, i22, iM32683B2, iM32702z2, i9);
                int iMax = Math.max(i21, aVar3.m32661f());
                int iM32660e = aVar3.m32660e() + i26;
                if (i25 > 0) {
                    iM32660e += c7372g3.f29525n1;
                }
                i24 = iM32660e;
                i21 = iMax;
                c7369d9 = c7369d10;
                i22 = 0;
            } else {
                int i27 = i21;
                int i28 = i24;
                if (i25 < size - 1) {
                    c7369d = ((a) c7372g3.f29531t1.get(i25 + 1)).f29538b.f29412O;
                    iM32683B2 = 0;
                } else {
                    c7369d = c7372g3.f29414Q;
                    iM32683B2 = c7372g3.m32683B1();
                }
                c7369d8 = c7369d;
                C7369d c7369d11 = aVar3.f29538b.f29414Q;
                aVar3.m32664j(i8, c7369d6, c7369d9, c7369d8, c7369d7, i23, i22, iM32683B2, iM32702z2, i9);
                int iM32661f = aVar3.m32661f() + i27;
                int iMax2 = Math.max(i28, aVar3.m32660e());
                if (i25 > 0) {
                    iM32661f += c7372g3.f29524m1;
                }
                int i29 = iM32661f;
                i24 = iMax2;
                i21 = i29;
                i23 = 0;
                c7369d6 = c7369d11;
            }
        }
        iArr[0] = i21;
        iArr[1] = i24;
    }

    /* JADX INFO: renamed from: p2 */
    private void m32633p2(C7370e[] c7370eArr, int i7, int i8, int i9, int[] iArr) {
        int i10;
        C7372g c7372g;
        int i11;
        C7369d c7369d;
        int i12;
        C7372g c7372g2 = this;
        if (i7 == 0) {
            return;
        }
        c7372g2.f29531t1.clear();
        int i13 = i9;
        a aVar = c7372g2.new a(i8, c7372g2.f29412O, c7372g2.f29413P, c7372g2.f29414Q, c7372g2.f29415R, i13);
        c7372g2.f29531t1.add(aVar);
        boolean z7 = true;
        if (i8 == 0) {
            int i14 = 0;
            i10 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < i7) {
                i14++;
                C7370e c7370e = c7370eArr[i16];
                int iM32630m2 = c7372g2.m32630m2(c7370e, i13);
                if (c7370e.m32467A() == C7370e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i17 = i10;
                boolean z8 = (i15 == i13 || (c7372g2.f29524m1 + i15) + iM32630m2 > i13) && aVar.f29538b != null;
                if (!z8 && i16 > 0 && (i12 = c7372g2.f29529r1) > 0 && i14 > i12) {
                    z8 = true;
                }
                if (z8) {
                    aVar = c7372g2.new a(i8, c7372g2.f29412O, c7372g2.f29413P, c7372g2.f29414Q, c7372g2.f29415R, i13);
                    aVar.m32663i(i16);
                    c7372g2.f29531t1.add(aVar);
                    i14 = 1;
                } else {
                    if (i16 > 0) {
                        i15 += c7372g2.f29524m1 + iM32630m2;
                    }
                    aVar.m32657b(c7370e);
                    i16++;
                    i10 = i17;
                }
                i15 = iM32630m2;
                aVar.m32657b(c7370e);
                i16++;
                i10 = i17;
            }
        } else {
            int i18 = 0;
            i10 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i20 < i7) {
                i18++;
                C7370e c7370e2 = c7370eArr[i20];
                int iM32629l2 = c7372g2.m32629l2(c7370e2, i13);
                if (c7370e2.m32502T() == C7370e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i21 = i10;
                boolean z9 = (i19 == i13 || (c7372g2.f29525n1 + i19) + iM32629l2 > i13) && aVar.f29538b != null;
                if (!z9 && i20 > 0 && (i11 = c7372g2.f29529r1) > 0 && i18 > i11) {
                    z9 = true;
                }
                if (z9) {
                    aVar = c7372g2.new a(i8, c7372g2.f29412O, c7372g2.f29413P, c7372g2.f29414Q, c7372g2.f29415R, i13);
                    c7372g = c7372g2;
                    aVar.m32663i(i20);
                    c7372g.f29531t1.add(aVar);
                    i18 = 1;
                } else {
                    c7372g = c7372g2;
                    if (i20 > 0) {
                        i19 += c7372g.f29525n1 + iM32629l2;
                    }
                    aVar.m32657b(c7370e2);
                    i20++;
                    i13 = i9;
                    i10 = i21;
                    c7372g2 = c7372g;
                }
                i19 = iM32629l2;
                aVar.m32657b(c7370e2);
                i20++;
                i13 = i9;
                i10 = i21;
                c7372g2 = c7372g;
            }
        }
        C7372g c7372g3 = c7372g2;
        int size = c7372g3.f29531t1.size();
        C7369d c7369d2 = c7372g3.f29412O;
        C7369d c7369d3 = c7372g3.f29413P;
        C7369d c7369d4 = c7372g3.f29414Q;
        C7369d c7369d5 = c7372g3.f29415R;
        int iM32682A1 = c7372g3.m32682A1();
        int iM32684C1 = c7372g3.m32684C1();
        int iM32683B1 = c7372g3.m32683B1();
        int iM32702z1 = c7372g3.m32702z1();
        C7370e.b bVarM32467A = c7372g3.m32467A();
        C7370e.b bVar = C7370e.b.WRAP_CONTENT;
        boolean z10 = bVarM32467A == bVar || c7372g3.m32502T() == bVar;
        if (i10 > 0 && z10) {
            for (int i22 = 0; i22 < size; i22++) {
                a aVar2 = (a) c7372g3.f29531t1.get(i22);
                if (i8 == 0) {
                    aVar2.m32662g(i9 - aVar2.m32661f());
                } else {
                    aVar2.m32662g(i9 - aVar2.m32660e());
                }
            }
        }
        C7369d c7369d6 = c7369d3;
        int iM32702z2 = iM32702z1;
        int i23 = 0;
        int i24 = 0;
        int iM32683B2 = iM32683B1;
        int i25 = iM32684C1;
        int i26 = iM32682A1;
        C7369d c7369d7 = c7369d5;
        C7369d c7369d8 = c7369d4;
        C7369d c7369d9 = c7369d2;
        int i27 = 0;
        while (i24 < size) {
            a aVar3 = (a) c7372g3.f29531t1.get(i24);
            if (i8 == 0) {
                if (i24 < size - 1) {
                    c7369d7 = ((a) c7372g3.f29531t1.get(i24 + 1)).f29538b.f29413P;
                    iM32702z2 = 0;
                } else {
                    c7369d7 = c7372g3.f29415R;
                    iM32702z2 = c7372g3.m32702z1();
                }
                C7369d c7369d10 = aVar3.f29538b.f29415R;
                int i28 = i23;
                aVar3.m32664j(i8, c7369d9, c7369d6, c7369d8, c7369d7, i26, i25, iM32683B2, iM32702z2, i9);
                int iMax = Math.max(i27, aVar3.m32661f());
                int iM32660e = aVar3.m32660e() + i28;
                if (i24 > 0) {
                    iM32660e += c7372g3.f29525n1;
                }
                i23 = iM32660e;
                i27 = iMax;
                c7369d6 = c7369d10;
                i25 = 0;
            } else {
                int i29 = i23;
                int i30 = i27;
                if (i24 < size - 1) {
                    c7369d = ((a) c7372g3.f29531t1.get(i24 + 1)).f29538b.f29412O;
                    iM32683B2 = 0;
                } else {
                    c7369d = c7372g3.f29414Q;
                    iM32683B2 = c7372g3.m32683B1();
                }
                c7369d8 = c7369d;
                C7369d c7369d11 = aVar3.f29538b.f29414Q;
                aVar3.m32664j(i8, c7369d9, c7369d6, c7369d8, c7369d7, i26, i25, iM32683B2, iM32702z2, i9);
                int iM32661f = aVar3.m32661f() + i30;
                int iMax2 = Math.max(i29, aVar3.m32660e());
                if (i24 > 0) {
                    iM32661f += c7372g3.f29524m1;
                }
                int i31 = iM32661f;
                i23 = iMax2;
                i27 = i31;
                i26 = 0;
                c7369d9 = c7369d11;
            }
            i24++;
            z7 = z7;
        }
        iArr[0] = i27;
        iArr[z7 ? 1 : 0] = i23;
    }

    /* JADX INFO: renamed from: q2 */
    private void m32634q2(C7370e[] c7370eArr, int i7, int i8, int i9, int[] iArr) {
        a aVar;
        if (i7 == 0) {
            return;
        }
        if (this.f29531t1.size() == 0) {
            aVar = new a(i8, this.f29412O, this.f29413P, this.f29414Q, this.f29415R, i9);
            this.f29531t1.add(aVar);
        } else {
            a aVar2 = (a) this.f29531t1.get(0);
            aVar2.m32658c();
            aVar2.m32664j(i8, this.f29412O, this.f29413P, this.f29414Q, this.f29415R, m32682A1(), m32684C1(), m32683B1(), m32702z1(), i9);
            aVar = aVar2;
        }
        for (int i10 = 0; i10 < i7; i10++) {
            aVar.m32657b(c7370eArr[i10]);
        }
        iArr[0] = aVar.m32661f();
        iArr[1] = aVar.m32660e();
    }

    /* JADX INFO: renamed from: A2 */
    public void m32635A2(int i7) {
        this.f29516e1 = i7;
    }

    /* JADX INFO: renamed from: B2 */
    public void m32636B2(float f7) {
        this.f29523l1 = f7;
    }

    /* JADX INFO: renamed from: C2 */
    public void m32637C2(int i7) {
        this.f29517f1 = i7;
    }

    @Override // p385x.AbstractC7377l
    /* JADX INFO: renamed from: D1 */
    public void mo32638D1(int i7, int i8, int i9, int i10) {
        int i11;
        C7370e[] c7370eArr;
        if (this.f29565M0 > 0 && !m32686F1()) {
            m32689I1(0, 0);
            m32688H1(false);
            return;
        }
        int iM32682A1 = m32682A1();
        int iM32683B1 = m32683B1();
        int iM32684C1 = m32684C1();
        int iM32702z1 = m32702z1();
        int[] iArr = new int[2];
        int i12 = (i8 - iM32682A1) - iM32683B1;
        int i13 = this.f29530s1;
        if (i13 == 1) {
            i12 = (i10 - iM32684C1) - iM32702z1;
        }
        int i14 = i12;
        if (i13 == 0) {
            if (this.f29512a1 == -1) {
                this.f29512a1 = 0;
            }
            if (this.f29513b1 == -1) {
                this.f29513b1 = 0;
            }
        } else {
            if (this.f29512a1 == -1) {
                this.f29512a1 = 0;
            }
            if (this.f29513b1 == -1) {
                this.f29513b1 = 0;
            }
        }
        C7370e[] c7370eArr2 = this.f29564L0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = this.f29565M0;
            if (i15 >= i11) {
                break;
            }
            if (this.f29564L0[i15].m32506V() == 8) {
                i16++;
            }
            i15++;
        }
        if (i16 > 0) {
            C7370e[] c7370eArr3 = new C7370e[i11 - i16];
            int i17 = 0;
            i11 = 0;
            while (i17 < this.f29565M0) {
                C7370e c7370e = this.f29564L0[i17];
                C7370e[] c7370eArr4 = c7370eArr3;
                if (c7370e.m32506V() != 8) {
                    c7370eArr4[i11] = c7370e;
                    i11++;
                }
                i17++;
                c7370eArr3 = c7370eArr4;
            }
            c7370eArr = c7370eArr3;
        } else {
            c7370eArr = c7370eArr2;
        }
        int i18 = i11;
        this.f29535x1 = c7370eArr;
        this.f29536y1 = i18;
        int i19 = this.f29528q1;
        if (i19 == 0) {
            m32634q2(c7370eArr, i18, this.f29530s1, i14, iArr);
        } else if (i19 == 1) {
            m32632o2(c7370eArr, i18, this.f29530s1, i14, iArr);
        } else if (i19 == 2) {
            m32631n2(c7370eArr, i18, this.f29530s1, i14, iArr);
        } else if (i19 == 3) {
            m32633p2(c7370eArr, i18, this.f29530s1, i14, iArr);
        }
        int iMin = iArr[0] + iM32682A1 + iM32683B1;
        int iMin2 = iArr[1] + iM32684C1 + iM32702z1;
        if (i7 == 1073741824) {
            iMin = i8;
        } else if (i7 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i8);
        } else if (i7 != 0) {
            iMin = 0;
        }
        if (i9 == 1073741824) {
            iMin2 = i10;
        } else if (i9 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i10);
        } else if (i9 != 0) {
            iMin2 = 0;
        }
        m32689I1(iMin, iMin2);
        m32543l1(iMin);
        m32491M0(iMin2);
        m32688H1(this.f29565M0 > 0);
    }

    /* JADX INFO: renamed from: D2 */
    public void m32639D2(int i7) {
        this.f29529r1 = i7;
    }

    /* JADX INFO: renamed from: E2 */
    public void m32640E2(int i7) {
        this.f29530s1 = i7;
    }

    /* JADX INFO: renamed from: F2 */
    public void m32641F2(int i7) {
        this.f29527p1 = i7;
    }

    /* JADX INFO: renamed from: G2 */
    public void m32642G2(float f7) {
        this.f29519h1 = f7;
    }

    /* JADX INFO: renamed from: H2 */
    public void m32643H2(int i7) {
        this.f29525n1 = i7;
    }

    /* JADX INFO: renamed from: I2 */
    public void m32644I2(int i7) {
        this.f29513b1 = i7;
    }

    /* JADX INFO: renamed from: J2 */
    public void m32645J2(int i7) {
        this.f29528q1 = i7;
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: g */
    public void mo32421g(C7146d c7146d, boolean z7) {
        super.mo32421g(c7146d, z7);
        boolean z8 = m32486K() != null && ((C7371f) m32486K()).m32594R1();
        int i7 = this.f29528q1;
        if (i7 != 0) {
            if (i7 == 1) {
                int size = this.f29531t1.size();
                int i8 = 0;
                while (i8 < size) {
                    ((a) this.f29531t1.get(i8)).m32659d(z8, i8, i8 == size + (-1));
                    i8++;
                }
            } else if (i7 == 2) {
                m32628k2(z8);
            } else if (i7 == 3) {
                int size2 = this.f29531t1.size();
                int i9 = 0;
                while (i9 < size2) {
                    ((a) this.f29531t1.get(i9)).m32659d(z8, i9, i9 == size2 + (-1));
                    i9++;
                }
            }
        } else if (this.f29531t1.size() > 0) {
            ((a) this.f29531t1.get(0)).m32659d(z8, 0, true);
        }
        m32688H1(false);
    }

    /* JADX INFO: renamed from: r2 */
    public void m32646r2(float f7) {
        this.f29520i1 = f7;
    }

    /* JADX INFO: renamed from: s2 */
    public void m32647s2(int i7) {
        this.f29514c1 = i7;
    }

    /* JADX INFO: renamed from: t2 */
    public void m32648t2(float f7) {
        this.f29521j1 = f7;
    }

    /* JADX INFO: renamed from: u2 */
    public void m32649u2(int i7) {
        this.f29515d1 = i7;
    }

    /* JADX INFO: renamed from: v2 */
    public void m32650v2(int i7) {
        this.f29526o1 = i7;
    }

    /* JADX INFO: renamed from: w2 */
    public void m32651w2(float f7) {
        this.f29518g1 = f7;
    }

    /* JADX INFO: renamed from: x2 */
    public void m32652x2(int i7) {
        this.f29524m1 = i7;
    }

    /* JADX INFO: renamed from: y2 */
    public void m32653y2(int i7) {
        this.f29512a1 = i7;
    }

    /* JADX INFO: renamed from: z2 */
    public void m32654z2(float f7) {
        this.f29522k1 = f7;
    }
}
