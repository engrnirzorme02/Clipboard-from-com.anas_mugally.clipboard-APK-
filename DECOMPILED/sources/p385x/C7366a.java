package p385x;

import p361u.C7146d;
import p361u.C7151i;

/* JADX INFO: renamed from: x.a */
/* JADX INFO: loaded from: classes.dex */
public class C7366a extends AbstractC7375j {

    /* JADX INFO: renamed from: N0 */
    private int f29342N0 = 0;

    /* JADX INFO: renamed from: O0 */
    private boolean f29343O0 = true;

    /* JADX INFO: renamed from: P0 */
    private int f29344P0 = 0;

    /* JADX INFO: renamed from: Q0 */
    boolean f29345Q0 = false;

    /* JADX INFO: renamed from: A1 */
    public void m32418A1(boolean z7) {
        this.f29343O0 = z7;
    }

    /* JADX INFO: renamed from: B1 */
    public void m32419B1(int i7) {
        this.f29342N0 = i7;
    }

    /* JADX INFO: renamed from: C1 */
    public void m32420C1(int i7) {
        this.f29344P0 = i7;
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: g */
    public void mo32421g(C7146d c7146d, boolean z7) {
        C7369d[] c7369dArr;
        boolean z8;
        int i7;
        int i8;
        int i9;
        C7369d[] c7369dArr2 = this.f29420W;
        c7369dArr2[0] = this.f29412O;
        c7369dArr2[2] = this.f29413P;
        c7369dArr2[1] = this.f29414Q;
        c7369dArr2[3] = this.f29415R;
        int i10 = 0;
        while (true) {
            c7369dArr = this.f29420W;
            if (i10 >= c7369dArr.length) {
                break;
            }
            C7369d c7369d = c7369dArr[i10];
            c7369d.f29376i = c7146d.m31587q(c7369d);
            i10++;
        }
        int i11 = this.f29342N0;
        if (i11 < 0 || i11 >= 4) {
            return;
        }
        C7369d c7369d2 = c7369dArr[i11];
        if (!this.f29345Q0) {
            m32425u1();
        }
        if (this.f29345Q0) {
            this.f29345Q0 = false;
            int i12 = this.f29342N0;
            if (i12 == 0 || i12 == 1) {
                c7146d.m31578f(this.f29412O.f29376i, this.f29435f0);
                c7146d.m31578f(this.f29414Q.f29376i, this.f29435f0);
                return;
            } else {
                if (i12 == 2 || i12 == 3) {
                    c7146d.m31578f(this.f29413P.f29376i, this.f29437g0);
                    c7146d.m31578f(this.f29415R.f29376i, this.f29437g0);
                    return;
                }
                return;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 >= this.f29565M0) {
                z8 = false;
                break;
            }
            C7370e c7370e = this.f29564L0[i13];
            if ((this.f29343O0 || c7370e.mo32422h()) && ((((i8 = this.f29342N0) == 0 || i8 == 1) && c7370e.m32467A() == C7370e.b.MATCH_CONSTRAINT && c7370e.f29412O.f29373f != null && c7370e.f29414Q.f29373f != null) || (((i9 = this.f29342N0) == 2 || i9 == 3) && c7370e.m32502T() == C7370e.b.MATCH_CONSTRAINT && c7370e.f29413P.f29373f != null && c7370e.f29415R.f29373f != null))) {
                z8 = true;
                break;
            }
            i13++;
        }
        boolean z9 = this.f29412O.m32447l() || this.f29414Q.m32447l();
        boolean z10 = this.f29413P.m32447l() || this.f29415R.m32447l();
        int i14 = !(!z8 && (((i7 = this.f29342N0) == 0 && z9) || ((i7 == 2 && z10) || ((i7 == 1 && z9) || (i7 == 3 && z10))))) ? 4 : 5;
        for (int i15 = 0; i15 < this.f29565M0; i15++) {
            C7370e c7370e2 = this.f29564L0[i15];
            if (this.f29343O0 || c7370e2.mo32422h()) {
                C7151i c7151iM31587q = c7146d.m31587q(c7370e2.f29420W[this.f29342N0]);
                C7369d[] c7369dArr3 = c7370e2.f29420W;
                int i16 = this.f29342N0;
                C7369d c7369d3 = c7369dArr3[i16];
                c7369d3.f29376i = c7151iM31587q;
                C7369d c7369d4 = c7369d3.f29373f;
                int i17 = (c7369d4 == null || c7369d4.f29371d != this) ? 0 : c7369d3.f29374g;
                if (i16 == 0 || i16 == 2) {
                    c7146d.m31581i(c7369d2.f29376i, c7151iM31587q, this.f29344P0 - i17, z8);
                } else {
                    c7146d.m31579g(c7369d2.f29376i, c7151iM31587q, this.f29344P0 + i17, z8);
                }
                c7146d.m31577e(c7369d2.f29376i, c7151iM31587q, this.f29344P0 + i17, i14);
            }
        }
        int i18 = this.f29342N0;
        if (i18 == 0) {
            c7146d.m31577e(this.f29414Q.f29376i, this.f29412O.f29376i, 0, 8);
            c7146d.m31577e(this.f29412O.f29376i, this.f29425a0.f29414Q.f29376i, 0, 4);
            c7146d.m31577e(this.f29412O.f29376i, this.f29425a0.f29412O.f29376i, 0, 0);
            return;
        }
        if (i18 == 1) {
            c7146d.m31577e(this.f29412O.f29376i, this.f29414Q.f29376i, 0, 8);
            c7146d.m31577e(this.f29412O.f29376i, this.f29425a0.f29412O.f29376i, 0, 4);
            c7146d.m31577e(this.f29412O.f29376i, this.f29425a0.f29414Q.f29376i, 0, 0);
        } else if (i18 == 2) {
            c7146d.m31577e(this.f29415R.f29376i, this.f29413P.f29376i, 0, 8);
            c7146d.m31577e(this.f29413P.f29376i, this.f29425a0.f29415R.f29376i, 0, 4);
            c7146d.m31577e(this.f29413P.f29376i, this.f29425a0.f29413P.f29376i, 0, 0);
        } else if (i18 == 3) {
            c7146d.m31577e(this.f29413P.f29376i, this.f29415R.f29376i, 0, 8);
            c7146d.m31577e(this.f29413P.f29376i, this.f29425a0.f29413P.f29376i, 0, 4);
            c7146d.m31577e(this.f29413P.f29376i, this.f29425a0.f29415R.f29376i, 0, 0);
        }
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: h */
    public boolean mo32422h() {
        return true;
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: n0 */
    public boolean mo32423n0() {
        return this.f29345Q0;
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: o0 */
    public boolean mo32424o0() {
        return this.f29345Q0;
    }

    @Override // p385x.C7370e
    public String toString() {
        String str = "[Barrier] " + m32562t() + " {";
        for (int i7 = 0; i7 < this.f29565M0; i7++) {
            C7370e c7370e = this.f29564L0[i7];
            if (i7 > 0) {
                str = str + ", ";
            }
            str = str + c7370e.m32562t();
        }
        return str + "}";
    }

    /* JADX INFO: renamed from: u1 */
    public boolean m32425u1() {
        int i7;
        int i8;
        int i9;
        boolean z7 = true;
        int i10 = 0;
        while (true) {
            i7 = this.f29565M0;
            if (i10 >= i7) {
                break;
            }
            C7370e c7370e = this.f29564L0[i10];
            if ((this.f29343O0 || c7370e.mo32422h()) && ((((i8 = this.f29342N0) == 0 || i8 == 1) && !c7370e.mo32423n0()) || (((i9 = this.f29342N0) == 2 || i9 == 3) && !c7370e.mo32424o0()))) {
                z7 = false;
            }
            i10++;
        }
        if (!z7 || i7 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z8 = false;
        for (int i11 = 0; i11 < this.f29565M0; i11++) {
            C7370e c7370e2 = this.f29564L0[i11];
            if (this.f29343O0 || c7370e2.mo32422h()) {
                if (!z8) {
                    int i12 = this.f29342N0;
                    if (i12 == 0) {
                        iMax = c7370e2.mo32549o(C7369d.a.LEFT).m32440e();
                    } else if (i12 == 1) {
                        iMax = c7370e2.mo32549o(C7369d.a.RIGHT).m32440e();
                    } else if (i12 == 2) {
                        iMax = c7370e2.mo32549o(C7369d.a.TOP).m32440e();
                    } else if (i12 == 3) {
                        iMax = c7370e2.mo32549o(C7369d.a.BOTTOM).m32440e();
                    }
                    z8 = true;
                }
                int i13 = this.f29342N0;
                if (i13 == 0) {
                    iMax = Math.min(iMax, c7370e2.mo32549o(C7369d.a.LEFT).m32440e());
                } else if (i13 == 1) {
                    iMax = Math.max(iMax, c7370e2.mo32549o(C7369d.a.RIGHT).m32440e());
                } else if (i13 == 2) {
                    iMax = Math.min(iMax, c7370e2.mo32549o(C7369d.a.TOP).m32440e());
                } else if (i13 == 3) {
                    iMax = Math.max(iMax, c7370e2.mo32549o(C7369d.a.BOTTOM).m32440e());
                }
            }
        }
        int i14 = iMax + this.f29344P0;
        int i15 = this.f29342N0;
        if (i15 == 0 || i15 == 1) {
            m32479G0(i14, i14);
        } else {
            m32485J0(i14, i14);
        }
        this.f29345Q0 = true;
        return true;
    }

    /* JADX INFO: renamed from: v1 */
    public boolean m32426v1() {
        return this.f29343O0;
    }

    /* JADX INFO: renamed from: w1 */
    public int m32427w1() {
        return this.f29342N0;
    }

    /* JADX INFO: renamed from: x1 */
    public int m32428x1() {
        return this.f29344P0;
    }

    /* JADX INFO: renamed from: y1 */
    public int m32429y1() {
        int i7 = this.f29342N0;
        if (i7 == 0 || i7 == 1) {
            return 0;
        }
        return (i7 == 2 || i7 == 3) ? 1 : -1;
    }

    /* JADX INFO: renamed from: z1 */
    protected void m32430z1() {
        for (int i7 = 0; i7 < this.f29565M0; i7++) {
            C7370e c7370e = this.f29564L0[i7];
            if (this.f29343O0 || c7370e.mo32422h()) {
                int i8 = this.f29342N0;
                if (i8 == 0 || i8 == 1) {
                    c7370e.m32503T0(0, true);
                } else if (i8 == 2 || i8 == 3) {
                    c7370e.m32503T0(1, true);
                }
            }
        }
    }
}
