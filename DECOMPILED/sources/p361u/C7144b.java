package p361u;

import java.util.ArrayList;

/* JADX INFO: renamed from: u.b */
/* JADX INFO: loaded from: classes.dex */
public class C7144b implements C7146d.a {

    /* JADX INFO: renamed from: e */
    public a f28466e;

    /* JADX INFO: renamed from: a */
    C7151i f28462a = null;

    /* JADX INFO: renamed from: b */
    float f28463b = 0.0f;

    /* JADX INFO: renamed from: c */
    boolean f28464c = false;

    /* JADX INFO: renamed from: d */
    ArrayList f28465d = new ArrayList();

    /* JADX INFO: renamed from: f */
    boolean f28467f = false;

    /* JADX INFO: renamed from: u.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        float mo31521a(C7144b c7144b, boolean z7);

        /* JADX INFO: renamed from: b */
        int mo31522b();

        /* JADX INFO: renamed from: c */
        boolean mo31523c(C7151i c7151i);

        void clear();

        /* JADX INFO: renamed from: d */
        C7151i mo31524d(int i7);

        /* JADX INFO: renamed from: e */
        void mo31525e();

        /* JADX INFO: renamed from: f */
        float mo31526f(int i7);

        /* JADX INFO: renamed from: g */
        float mo31527g(C7151i c7151i, boolean z7);

        /* JADX INFO: renamed from: h */
        void mo31528h(C7151i c7151i, float f7, boolean z7);

        /* JADX INFO: renamed from: i */
        float mo31529i(C7151i c7151i);

        /* JADX INFO: renamed from: j */
        void mo31530j(C7151i c7151i, float f7);

        /* JADX INFO: renamed from: k */
        void mo31531k(float f7);
    }

    public C7144b() {
    }

    /* JADX INFO: renamed from: u */
    private boolean m31532u(C7151i c7151i, C7146d c7146d) {
        return c7151i.f28524x <= 1;
    }

    /* JADX INFO: renamed from: w */
    private C7151i m31533w(boolean[] zArr, C7151i c7151i) {
        C7151i.a aVar;
        int iMo31522b = this.f28466e.mo31522b();
        C7151i c7151i2 = null;
        float f7 = 0.0f;
        for (int i7 = 0; i7 < iMo31522b; i7++) {
            float fMo31526f = this.f28466e.mo31526f(i7);
            if (fMo31526f < 0.0f) {
                C7151i c7151iMo31524d = this.f28466e.mo31524d(i7);
                if ((zArr == null || !zArr[c7151iMo31524d.f28514c]) && c7151iMo31524d != c7151i && (((aVar = c7151iMo31524d.f28521u) == C7151i.a.SLACK || aVar == C7151i.a.ERROR) && fMo31526f < f7)) {
                    f7 = fMo31526f;
                    c7151i2 = c7151iMo31524d;
                }
            }
        }
        return c7151i2;
    }

    /* JADX INFO: renamed from: A */
    public void m31534A(C7146d c7146d, C7151i c7151i, boolean z7) {
        if (c7151i == null || !c7151i.f28518r) {
            return;
        }
        this.f28463b += c7151i.f28517f * this.f28466e.mo31529i(c7151i);
        this.f28466e.mo31527g(c7151i, z7);
        if (z7) {
            c7151i.m31608j(this);
        }
        if (C7146d.f28474u && this.f28466e.mo31522b() == 0) {
            this.f28467f = true;
            c7146d.f28480b = true;
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo31535B(C7146d c7146d, C7144b c7144b, boolean z7) {
        this.f28463b += c7144b.f28463b * this.f28466e.mo31521a(c7144b, z7);
        if (z7) {
            c7144b.f28462a.m31608j(this);
        }
        if (C7146d.f28474u && this.f28462a != null && this.f28466e.mo31522b() == 0) {
            this.f28467f = true;
            c7146d.f28480b = true;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m31536C(C7146d c7146d, C7151i c7151i, boolean z7) {
        if (c7151i == null || !c7151i.f28525y) {
            return;
        }
        float fMo31529i = this.f28466e.mo31529i(c7151i);
        this.f28463b += c7151i.f28510A * fMo31529i;
        this.f28466e.mo31527g(c7151i, z7);
        if (z7) {
            c7151i.m31608j(this);
        }
        this.f28466e.mo31528h(c7146d.f28493o.f28471d[c7151i.f28526z], fMo31529i, z7);
        if (C7146d.f28474u && this.f28466e.mo31522b() == 0) {
            this.f28467f = true;
            c7146d.f28480b = true;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m31537D(C7146d c7146d) {
        if (c7146d.f28486h.length == 0) {
            return;
        }
        boolean z7 = false;
        while (!z7) {
            int iMo31522b = this.f28466e.mo31522b();
            for (int i7 = 0; i7 < iMo31522b; i7++) {
                C7151i c7151iMo31524d = this.f28466e.mo31524d(i7);
                if (c7151iMo31524d.f28515d != -1 || c7151iMo31524d.f28518r || c7151iMo31524d.f28525y) {
                    this.f28465d.add(c7151iMo31524d);
                }
            }
            int size = this.f28465d.size();
            if (size > 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    C7151i c7151i = (C7151i) this.f28465d.get(i8);
                    if (c7151i.f28518r) {
                        m31534A(c7146d, c7151i, true);
                    } else if (c7151i.f28525y) {
                        m31536C(c7146d, c7151i, true);
                    } else {
                        mo31535B(c7146d, c7146d.f28486h[c7151i.f28515d], true);
                    }
                }
                this.f28465d.clear();
            } else {
                z7 = true;
            }
        }
        if (C7146d.f28474u && this.f28462a != null && this.f28466e.mo31522b() == 0) {
            this.f28467f = true;
            c7146d.f28480b = true;
        }
    }

    @Override // p361u.C7146d.a
    /* JADX INFO: renamed from: a */
    public void mo31538a(C7146d.a aVar) {
        if (aVar instanceof C7144b) {
            C7144b c7144b = (C7144b) aVar;
            this.f28462a = null;
            this.f28466e.clear();
            for (int i7 = 0; i7 < c7144b.f28466e.mo31522b(); i7++) {
                this.f28466e.mo31528h(c7144b.f28466e.mo31524d(i7), c7144b.f28466e.mo31526f(i7), true);
            }
        }
    }

    @Override // p361u.C7146d.a
    /* JADX INFO: renamed from: b */
    public C7151i mo31539b(C7146d c7146d, boolean[] zArr) {
        return m31533w(zArr, null);
    }

    @Override // p361u.C7146d.a
    /* JADX INFO: renamed from: c */
    public void mo31540c(C7151i c7151i) {
        int i7 = c7151i.f28516e;
        float f7 = 1.0f;
        if (i7 != 1) {
            if (i7 == 2) {
                f7 = 1000.0f;
            } else if (i7 == 3) {
                f7 = 1000000.0f;
            } else if (i7 == 4) {
                f7 = 1.0E9f;
            } else if (i7 == 5) {
                f7 = 1.0E12f;
            }
        }
        this.f28466e.mo31530j(c7151i, f7);
    }

    @Override // p361u.C7146d.a
    public void clear() {
        this.f28466e.clear();
        this.f28462a = null;
        this.f28463b = 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public C7144b m31541d(C7146d c7146d, int i7) {
        this.f28466e.mo31530j(c7146d.m31585o(i7, "ep"), 1.0f);
        this.f28466e.mo31530j(c7146d.m31585o(i7, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: e */
    C7144b m31542e(C7151i c7151i, int i7) {
        this.f28466e.mo31530j(c7151i, i7);
        return this;
    }

    /* JADX INFO: renamed from: f */
    boolean m31543f(C7146d c7146d) {
        boolean z7;
        C7151i c7151iM31544g = m31544g(c7146d);
        if (c7151iM31544g == null) {
            z7 = true;
        } else {
            m31559x(c7151iM31544g);
            z7 = false;
        }
        if (this.f28466e.mo31522b() == 0) {
            this.f28467f = true;
        }
        return z7;
    }

    /* JADX INFO: renamed from: g */
    C7151i m31544g(C7146d c7146d) {
        int iMo31522b = this.f28466e.mo31522b();
        C7151i c7151i = null;
        float f7 = 0.0f;
        float f8 = 0.0f;
        boolean z7 = false;
        boolean z8 = false;
        C7151i c7151i2 = null;
        for (int i7 = 0; i7 < iMo31522b; i7++) {
            float fMo31526f = this.f28466e.mo31526f(i7);
            C7151i c7151iMo31524d = this.f28466e.mo31524d(i7);
            if (c7151iMo31524d.f28521u == C7151i.a.UNRESTRICTED) {
                if (c7151i == null || f7 > fMo31526f) {
                    boolean zM31532u = m31532u(c7151iMo31524d, c7146d);
                    z7 = zM31532u;
                    f7 = fMo31526f;
                    c7151i = c7151iMo31524d;
                } else if (!z7 && m31532u(c7151iMo31524d, c7146d)) {
                    f7 = fMo31526f;
                    c7151i = c7151iMo31524d;
                    z7 = true;
                }
            } else if (c7151i == null && fMo31526f < 0.0f) {
                if (c7151i2 == null || f8 > fMo31526f) {
                    boolean zM31532u2 = m31532u(c7151iMo31524d, c7146d);
                    z8 = zM31532u2;
                    f8 = fMo31526f;
                    c7151i2 = c7151iMo31524d;
                } else if (!z8 && m31532u(c7151iMo31524d, c7146d)) {
                    f8 = fMo31526f;
                    c7151i2 = c7151iMo31524d;
                    z8 = true;
                }
            }
        }
        return c7151i != null ? c7151i : c7151i2;
    }

    @Override // p361u.C7146d.a
    public C7151i getKey() {
        return this.f28462a;
    }

    /* JADX INFO: renamed from: h */
    C7144b m31545h(C7151i c7151i, C7151i c7151i2, int i7, float f7, C7151i c7151i3, C7151i c7151i4, int i8) {
        if (c7151i2 == c7151i3) {
            this.f28466e.mo31530j(c7151i, 1.0f);
            this.f28466e.mo31530j(c7151i4, 1.0f);
            this.f28466e.mo31530j(c7151i2, -2.0f);
            return this;
        }
        if (f7 == 0.5f) {
            this.f28466e.mo31530j(c7151i, 1.0f);
            this.f28466e.mo31530j(c7151i2, -1.0f);
            this.f28466e.mo31530j(c7151i3, -1.0f);
            this.f28466e.mo31530j(c7151i4, 1.0f);
            if (i7 > 0 || i8 > 0) {
                this.f28463b = (-i7) + i8;
                return this;
            }
        } else {
            if (f7 <= 0.0f) {
                this.f28466e.mo31530j(c7151i, -1.0f);
                this.f28466e.mo31530j(c7151i2, 1.0f);
                this.f28463b = i7;
                return this;
            }
            if (f7 >= 1.0f) {
                this.f28466e.mo31530j(c7151i4, -1.0f);
                this.f28466e.mo31530j(c7151i3, 1.0f);
                this.f28463b = -i8;
                return this;
            }
            float f8 = 1.0f - f7;
            this.f28466e.mo31530j(c7151i, f8 * 1.0f);
            this.f28466e.mo31530j(c7151i2, f8 * (-1.0f));
            this.f28466e.mo31530j(c7151i3, (-1.0f) * f7);
            this.f28466e.mo31530j(c7151i4, 1.0f * f7);
            if (i7 > 0 || i8 > 0) {
                this.f28463b = ((-i7) * f8) + (i8 * f7);
                return this;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    C7144b m31546i(C7151i c7151i, int i7) {
        this.f28462a = c7151i;
        float f7 = i7;
        c7151i.f28517f = f7;
        this.f28463b = f7;
        this.f28467f = true;
        return this;
    }

    @Override // p361u.C7146d.a
    public boolean isEmpty() {
        return this.f28462a == null && this.f28463b == 0.0f && this.f28466e.mo31522b() == 0;
    }

    /* JADX INFO: renamed from: j */
    C7144b m31547j(C7151i c7151i, C7151i c7151i2, float f7) {
        this.f28466e.mo31530j(c7151i, -1.0f);
        this.f28466e.mo31530j(c7151i2, f7);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C7144b m31548k(C7151i c7151i, C7151i c7151i2, C7151i c7151i3, C7151i c7151i4, float f7) {
        this.f28466e.mo31530j(c7151i, -1.0f);
        this.f28466e.mo31530j(c7151i2, 1.0f);
        this.f28466e.mo31530j(c7151i3, f7);
        this.f28466e.mo31530j(c7151i4, -f7);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C7144b m31549l(float f7, float f8, float f9, C7151i c7151i, C7151i c7151i2, C7151i c7151i3, C7151i c7151i4) {
        this.f28463b = 0.0f;
        if (f8 == 0.0f || f7 == f9) {
            this.f28466e.mo31530j(c7151i, 1.0f);
            this.f28466e.mo31530j(c7151i2, -1.0f);
            this.f28466e.mo31530j(c7151i4, 1.0f);
            this.f28466e.mo31530j(c7151i3, -1.0f);
            return this;
        }
        if (f7 == 0.0f) {
            this.f28466e.mo31530j(c7151i, 1.0f);
            this.f28466e.mo31530j(c7151i2, -1.0f);
            return this;
        }
        if (f9 == 0.0f) {
            this.f28466e.mo31530j(c7151i3, 1.0f);
            this.f28466e.mo31530j(c7151i4, -1.0f);
            return this;
        }
        float f10 = (f7 / f8) / (f9 / f8);
        this.f28466e.mo31530j(c7151i, 1.0f);
        this.f28466e.mo31530j(c7151i2, -1.0f);
        this.f28466e.mo31530j(c7151i4, f10);
        this.f28466e.mo31530j(c7151i3, -f10);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C7144b m31550m(C7151i c7151i, int i7) {
        if (i7 < 0) {
            this.f28463b = i7 * (-1);
            this.f28466e.mo31530j(c7151i, 1.0f);
            return this;
        }
        this.f28463b = i7;
        this.f28466e.mo31530j(c7151i, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C7144b m31551n(C7151i c7151i, C7151i c7151i2, int i7) {
        boolean z7 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z7 = true;
            }
            this.f28463b = i7;
        }
        if (z7) {
            this.f28466e.mo31530j(c7151i, 1.0f);
            this.f28466e.mo31530j(c7151i2, -1.0f);
            return this;
        }
        this.f28466e.mo31530j(c7151i, -1.0f);
        this.f28466e.mo31530j(c7151i2, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public C7144b m31552o(C7151i c7151i, C7151i c7151i2, C7151i c7151i3, int i7) {
        boolean z7 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z7 = true;
            }
            this.f28463b = i7;
        }
        if (z7) {
            this.f28466e.mo31530j(c7151i, 1.0f);
            this.f28466e.mo31530j(c7151i2, -1.0f);
            this.f28466e.mo31530j(c7151i3, -1.0f);
            return this;
        }
        this.f28466e.mo31530j(c7151i, -1.0f);
        this.f28466e.mo31530j(c7151i2, 1.0f);
        this.f28466e.mo31530j(c7151i3, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C7144b m31553p(C7151i c7151i, C7151i c7151i2, C7151i c7151i3, int i7) {
        boolean z7 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z7 = true;
            }
            this.f28463b = i7;
        }
        if (z7) {
            this.f28466e.mo31530j(c7151i, 1.0f);
            this.f28466e.mo31530j(c7151i2, -1.0f);
            this.f28466e.mo31530j(c7151i3, 1.0f);
            return this;
        }
        this.f28466e.mo31530j(c7151i, -1.0f);
        this.f28466e.mo31530j(c7151i2, 1.0f);
        this.f28466e.mo31530j(c7151i3, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C7144b m31554q(C7151i c7151i, C7151i c7151i2, C7151i c7151i3, C7151i c7151i4, float f7) {
        this.f28466e.mo31530j(c7151i3, 0.5f);
        this.f28466e.mo31530j(c7151i4, 0.5f);
        this.f28466e.mo31530j(c7151i, -0.5f);
        this.f28466e.mo31530j(c7151i2, -0.5f);
        this.f28463b = -f7;
        return this;
    }

    /* JADX INFO: renamed from: r */
    void m31555r() {
        float f7 = this.f28463b;
        if (f7 < 0.0f) {
            this.f28463b = f7 * (-1.0f);
            this.f28466e.mo31525e();
        }
    }

    /* JADX INFO: renamed from: s */
    boolean m31556s() {
        C7151i c7151i = this.f28462a;
        if (c7151i != null) {
            return c7151i.f28521u == C7151i.a.UNRESTRICTED || this.f28463b >= 0.0f;
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    boolean m31557t(C7151i c7151i) {
        return this.f28466e.mo31523c(c7151i);
    }

    public String toString() {
        return m31561z();
    }

    /* JADX INFO: renamed from: v */
    public C7151i m31558v(C7151i c7151i) {
        return m31533w(null, c7151i);
    }

    /* JADX INFO: renamed from: x */
    void m31559x(C7151i c7151i) {
        C7151i c7151i2 = this.f28462a;
        if (c7151i2 != null) {
            this.f28466e.mo31530j(c7151i2, -1.0f);
            this.f28462a.f28515d = -1;
            this.f28462a = null;
        }
        float fMo31527g = this.f28466e.mo31527g(c7151i, true) * (-1.0f);
        this.f28462a = c7151i;
        if (fMo31527g == 1.0f) {
            return;
        }
        this.f28463b /= fMo31527g;
        this.f28466e.mo31531k(fMo31527g);
    }

    /* JADX INFO: renamed from: y */
    public void m31560y() {
        this.f28462a = null;
        this.f28466e.clear();
        this.f28463b = 0.0f;
        this.f28467f = false;
    }

    /* JADX INFO: renamed from: z */
    String m31561z() {
        boolean z7;
        String str = (this.f28462a == null ? "0" : "" + this.f28462a) + " = ";
        if (this.f28463b != 0.0f) {
            str = str + this.f28463b;
            z7 = true;
        } else {
            z7 = false;
        }
        int iMo31522b = this.f28466e.mo31522b();
        for (int i7 = 0; i7 < iMo31522b; i7++) {
            C7151i c7151iMo31524d = this.f28466e.mo31524d(i7);
            if (c7151iMo31524d != null) {
                float fMo31526f = this.f28466e.mo31526f(i7);
                if (fMo31526f != 0.0f) {
                    String string = c7151iMo31524d.toString();
                    if (z7) {
                        if (fMo31526f > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fMo31526f *= -1.0f;
                        }
                    } else if (fMo31526f < 0.0f) {
                        str = str + "- ";
                        fMo31526f *= -1.0f;
                    }
                    str = fMo31526f == 1.0f ? str + string : str + fMo31526f + " " + string;
                    z7 = true;
                }
            }
        }
        if (z7) {
            return str;
        }
        return str + "0.0";
    }

    public C7144b(C7145c c7145c) {
        this.f28466e = new C7143a(this, c7145c);
    }
}
