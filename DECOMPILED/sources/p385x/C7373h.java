package p385x;

import p361u.C7146d;
import p361u.C7151i;

/* JADX INFO: renamed from: x.h */
/* JADX INFO: loaded from: classes.dex */
public class C7373h extends C7370e {

    /* JADX INFO: renamed from: L0 */
    protected float f29555L0 = -1.0f;

    /* JADX INFO: renamed from: M0 */
    protected int f29556M0 = -1;

    /* JADX INFO: renamed from: N0 */
    protected int f29557N0 = -1;

    /* JADX INFO: renamed from: O0 */
    protected boolean f29558O0 = true;

    /* JADX INFO: renamed from: P0 */
    private C7369d f29559P0 = this.f29413P;

    /* JADX INFO: renamed from: Q0 */
    private int f29560Q0 = 0;

    /* JADX INFO: renamed from: R0 */
    private int f29561R0 = 0;

    /* JADX INFO: renamed from: S0 */
    private boolean f29562S0;

    /* JADX INFO: renamed from: x.h$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f29563a;

        static {
            int[] iArr = new int[C7369d.a.values().length];
            f29563a = iArr;
            try {
                iArr[C7369d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29563a[C7369d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29563a[C7369d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29563a[C7369d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29563a[C7369d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29563a[C7369d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29563a[C7369d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29563a[C7369d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29563a[C7369d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C7373h() {
        this.f29421X.clear();
        this.f29421X.add(this.f29559P0);
        int length = this.f29420W.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f29420W[i7] = this.f29559P0;
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m32665A1(float f7) {
        if (f7 > -1.0f) {
            this.f29555L0 = f7;
            this.f29556M0 = -1;
            this.f29557N0 = -1;
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m32666B1(int i7) {
        if (this.f29560Q0 == i7) {
            return;
        }
        this.f29560Q0 = i7;
        this.f29421X.clear();
        if (this.f29560Q0 == 1) {
            this.f29559P0 = this.f29412O;
        } else {
            this.f29559P0 = this.f29413P;
        }
        this.f29421X.add(this.f29559P0);
        int length = this.f29420W.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.f29420W[i8] = this.f29559P0;
        }
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: g */
    public void mo32421g(C7146d c7146d, boolean z7) {
        C7371f c7371f = (C7371f) m32486K();
        if (c7371f == null) {
            return;
        }
        C7369d c7369dMo32549o = c7371f.mo32549o(C7369d.a.LEFT);
        C7369d c7369dMo32549o2 = c7371f.mo32549o(C7369d.a.RIGHT);
        C7370e c7370e = this.f29425a0;
        boolean z8 = c7370e != null && c7370e.f29423Z[0] == C7370e.b.WRAP_CONTENT;
        if (this.f29560Q0 == 0) {
            c7369dMo32549o = c7371f.mo32549o(C7369d.a.TOP);
            c7369dMo32549o2 = c7371f.mo32549o(C7369d.a.BOTTOM);
            C7370e c7370e2 = this.f29425a0;
            z8 = c7370e2 != null && c7370e2.f29423Z[1] == C7370e.b.WRAP_CONTENT;
        }
        if (this.f29562S0 && this.f29559P0.m32449n()) {
            C7151i c7151iM31587q = c7146d.m31587q(this.f29559P0);
            c7146d.m31578f(c7151iM31587q, this.f29559P0.m32440e());
            if (this.f29556M0 != -1) {
                if (z8) {
                    c7146d.m31580h(c7146d.m31587q(c7369dMo32549o2), c7151iM31587q, 0, 5);
                }
            } else if (this.f29557N0 != -1 && z8) {
                C7151i c7151iM31587q2 = c7146d.m31587q(c7369dMo32549o2);
                c7146d.m31580h(c7151iM31587q, c7146d.m31587q(c7369dMo32549o), 0, 5);
                c7146d.m31580h(c7151iM31587q2, c7151iM31587q, 0, 5);
            }
            this.f29562S0 = false;
            return;
        }
        if (this.f29556M0 != -1) {
            C7151i c7151iM31587q3 = c7146d.m31587q(this.f29559P0);
            c7146d.m31577e(c7151iM31587q3, c7146d.m31587q(c7369dMo32549o), this.f29556M0, 8);
            if (z8) {
                c7146d.m31580h(c7146d.m31587q(c7369dMo32549o2), c7151iM31587q3, 0, 5);
                return;
            }
            return;
        }
        if (this.f29557N0 == -1) {
            if (this.f29555L0 != -1.0f) {
                c7146d.m31576d(C7146d.m31567s(c7146d, c7146d.m31587q(this.f29559P0), c7146d.m31587q(c7369dMo32549o2), this.f29555L0));
                return;
            }
            return;
        }
        C7151i c7151iM31587q4 = c7146d.m31587q(this.f29559P0);
        C7151i c7151iM31587q5 = c7146d.m31587q(c7369dMo32549o2);
        c7146d.m31577e(c7151iM31587q4, c7151iM31587q5, -this.f29557N0, 8);
        if (z8) {
            c7146d.m31580h(c7151iM31587q4, c7146d.m31587q(c7369dMo32549o), 0, 5);
            c7146d.m31580h(c7151iM31587q5, c7151iM31587q4, 0, 5);
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
        return this.f29562S0;
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: o */
    public C7369d mo32549o(C7369d.a aVar) {
        int i7 = a.f29563a[aVar.ordinal()];
        if (i7 == 1 || i7 == 2) {
            if (this.f29560Q0 == 1) {
                return this.f29559P0;
            }
            return null;
        }
        if ((i7 == 3 || i7 == 4) && this.f29560Q0 == 0) {
            return this.f29559P0;
        }
        return null;
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: o0 */
    public boolean mo32424o0() {
        return this.f29562S0;
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: r1 */
    public void mo32559r1(C7146d c7146d, boolean z7) {
        if (m32486K() == null) {
            return;
        }
        int iM31592y = c7146d.m31592y(this.f29559P0);
        if (this.f29560Q0 == 1) {
            m32548n1(iM31592y);
            m32550o1(0);
            m32491M0(m32486K().m32570x());
            m32543l1(0);
            return;
        }
        m32548n1(0);
        m32550o1(iM31592y);
        m32543l1(m32486K().m32508W());
        m32491M0(0);
    }

    /* JADX INFO: renamed from: s1 */
    public C7369d m32667s1() {
        return this.f29559P0;
    }

    /* JADX INFO: renamed from: t1 */
    public int m32668t1() {
        return this.f29560Q0;
    }

    /* JADX INFO: renamed from: u1 */
    public int m32669u1() {
        return this.f29556M0;
    }

    /* JADX INFO: renamed from: v1 */
    public int m32670v1() {
        return this.f29557N0;
    }

    /* JADX INFO: renamed from: w1 */
    public float m32671w1() {
        return this.f29555L0;
    }

    /* JADX INFO: renamed from: x1 */
    public void m32672x1(int i7) {
        this.f29559P0.m32455t(i7);
        this.f29562S0 = true;
    }

    /* JADX INFO: renamed from: y1 */
    public void m32673y1(int i7) {
        if (i7 > -1) {
            this.f29555L0 = -1.0f;
            this.f29556M0 = i7;
            this.f29557N0 = -1;
        }
    }

    /* JADX INFO: renamed from: z1 */
    public void m32674z1(int i7) {
        if (i7 > -1) {
            this.f29555L0 = -1.0f;
            this.f29556M0 = -1;
            this.f29557N0 = i7;
        }
    }
}
