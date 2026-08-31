package p361u;

import java.util.Arrays;

/* JADX INFO: renamed from: u.j */
/* JADX INFO: loaded from: classes.dex */
public class C7152j implements C7144b.a {

    /* JADX INFO: renamed from: n */
    private static float f28533n = 0.001f;

    /* JADX INFO: renamed from: a */
    private final int f28534a = -1;

    /* JADX INFO: renamed from: b */
    private int f28535b = 16;

    /* JADX INFO: renamed from: c */
    private int f28536c = 16;

    /* JADX INFO: renamed from: d */
    int[] f28537d = new int[16];

    /* JADX INFO: renamed from: e */
    int[] f28538e = new int[16];

    /* JADX INFO: renamed from: f */
    int[] f28539f = new int[16];

    /* JADX INFO: renamed from: g */
    float[] f28540g = new float[16];

    /* JADX INFO: renamed from: h */
    int[] f28541h = new int[16];

    /* JADX INFO: renamed from: i */
    int[] f28542i = new int[16];

    /* JADX INFO: renamed from: j */
    int f28543j = 0;

    /* JADX INFO: renamed from: k */
    int f28544k = -1;

    /* JADX INFO: renamed from: l */
    private final C7144b f28545l;

    /* JADX INFO: renamed from: m */
    protected final C7145c f28546m;

    C7152j(C7144b c7144b, C7145c c7145c) {
        this.f28545l = c7144b;
        this.f28546m = c7145c;
        clear();
    }

    /* JADX INFO: renamed from: l */
    private void m31614l(C7151i c7151i, int i7) {
        int[] iArr;
        int i8 = c7151i.f28514c % this.f28536c;
        int[] iArr2 = this.f28537d;
        int i9 = iArr2[i8];
        if (i9 == -1) {
            iArr2[i8] = i7;
        } else {
            while (true) {
                iArr = this.f28538e;
                int i10 = iArr[i9];
                if (i10 == -1) {
                    break;
                } else {
                    i9 = i10;
                }
            }
            iArr[i9] = i7;
        }
        this.f28538e[i7] = -1;
    }

    /* JADX INFO: renamed from: m */
    private void m31615m(int i7, C7151i c7151i, float f7) {
        this.f28539f[i7] = c7151i.f28514c;
        this.f28540g[i7] = f7;
        this.f28541h[i7] = -1;
        this.f28542i[i7] = -1;
        c7151i.m31606c(this.f28545l);
        c7151i.f28524x++;
        this.f28543j++;
    }

    /* JADX INFO: renamed from: n */
    private int m31616n() {
        for (int i7 = 0; i7 < this.f28535b; i7++) {
            if (this.f28539f[i7] == -1) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    private void m31617o() {
        int i7 = this.f28535b * 2;
        this.f28539f = Arrays.copyOf(this.f28539f, i7);
        this.f28540g = Arrays.copyOf(this.f28540g, i7);
        this.f28541h = Arrays.copyOf(this.f28541h, i7);
        this.f28542i = Arrays.copyOf(this.f28542i, i7);
        this.f28538e = Arrays.copyOf(this.f28538e, i7);
        for (int i8 = this.f28535b; i8 < i7; i8++) {
            this.f28539f[i8] = -1;
            this.f28538e[i8] = -1;
        }
        this.f28535b = i7;
    }

    /* JADX INFO: renamed from: q */
    private void m31618q(int i7, C7151i c7151i, float f7) {
        int iM31616n = m31616n();
        m31615m(iM31616n, c7151i, f7);
        if (i7 != -1) {
            this.f28541h[iM31616n] = i7;
            int[] iArr = this.f28542i;
            iArr[iM31616n] = iArr[i7];
            iArr[i7] = iM31616n;
        } else {
            this.f28541h[iM31616n] = -1;
            if (this.f28543j > 0) {
                this.f28542i[iM31616n] = this.f28544k;
                this.f28544k = iM31616n;
            } else {
                this.f28542i[iM31616n] = -1;
            }
        }
        int i8 = this.f28542i[iM31616n];
        if (i8 != -1) {
            this.f28541h[i8] = iM31616n;
        }
        m31614l(c7151i, iM31616n);
    }

    /* JADX INFO: renamed from: r */
    private void m31619r(C7151i c7151i) {
        int[] iArr;
        int i7;
        int i8 = c7151i.f28514c;
        int i9 = i8 % this.f28536c;
        int[] iArr2 = this.f28537d;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            return;
        }
        if (this.f28539f[i10] == i8) {
            int[] iArr3 = this.f28538e;
            iArr2[i9] = iArr3[i10];
            iArr3[i10] = -1;
            return;
        }
        while (true) {
            iArr = this.f28538e;
            i7 = iArr[i10];
            if (i7 == -1 || this.f28539f[i7] == i8) {
                break;
            } else {
                i10 = i7;
            }
        }
        if (i7 == -1 || this.f28539f[i7] != i8) {
            return;
        }
        iArr[i10] = iArr[i7];
        iArr[i7] = -1;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: a */
    public float mo31521a(C7144b c7144b, boolean z7) {
        float fMo31529i = mo31529i(c7144b.f28462a);
        mo31527g(c7144b.f28462a, z7);
        C7152j c7152j = (C7152j) c7144b.f28466e;
        int iMo31522b = c7152j.mo31522b();
        int i7 = 0;
        int i8 = 0;
        while (i7 < iMo31522b) {
            int i9 = c7152j.f28539f[i8];
            if (i9 != -1) {
                mo31528h(this.f28546m.f28471d[i9], c7152j.f28540g[i8] * fMo31529i, z7);
                i7++;
            }
            i8++;
        }
        return fMo31529i;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: b */
    public int mo31522b() {
        return this.f28543j;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: c */
    public boolean mo31523c(C7151i c7151i) {
        return m31620p(c7151i) != -1;
    }

    @Override // p361u.C7144b.a
    public void clear() {
        int i7 = this.f28543j;
        for (int i8 = 0; i8 < i7; i8++) {
            C7151i c7151iMo31524d = mo31524d(i8);
            if (c7151iMo31524d != null) {
                c7151iMo31524d.m31608j(this.f28545l);
            }
        }
        for (int i9 = 0; i9 < this.f28535b; i9++) {
            this.f28539f[i9] = -1;
            this.f28538e[i9] = -1;
        }
        for (int i10 = 0; i10 < this.f28536c; i10++) {
            this.f28537d[i10] = -1;
        }
        this.f28543j = 0;
        this.f28544k = -1;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: d */
    public C7151i mo31524d(int i7) {
        int i8 = this.f28543j;
        if (i8 == 0) {
            return null;
        }
        int i9 = this.f28544k;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7 && i9 != -1) {
                return this.f28546m.f28471d[this.f28539f[i9]];
            }
            i9 = this.f28542i[i9];
            if (i9 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: e */
    public void mo31525e() {
        int i7 = this.f28543j;
        int i8 = this.f28544k;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f28540g;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.f28542i[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: f */
    public float mo31526f(int i7) {
        int i8 = this.f28543j;
        int i9 = this.f28544k;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7) {
                return this.f28540g[i9];
            }
            i9 = this.f28542i[i9];
            if (i9 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: g */
    public float mo31527g(C7151i c7151i, boolean z7) {
        int iM31620p = m31620p(c7151i);
        if (iM31620p == -1) {
            return 0.0f;
        }
        m31619r(c7151i);
        float f7 = this.f28540g[iM31620p];
        if (this.f28544k == iM31620p) {
            this.f28544k = this.f28542i[iM31620p];
        }
        this.f28539f[iM31620p] = -1;
        int[] iArr = this.f28541h;
        int i7 = iArr[iM31620p];
        if (i7 != -1) {
            int[] iArr2 = this.f28542i;
            iArr2[i7] = iArr2[iM31620p];
        }
        int i8 = this.f28542i[iM31620p];
        if (i8 != -1) {
            iArr[i8] = iArr[iM31620p];
        }
        this.f28543j--;
        c7151i.f28524x--;
        if (z7) {
            c7151i.m31608j(this.f28545l);
        }
        return f7;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: h */
    public void mo31528h(C7151i c7151i, float f7, boolean z7) {
        float f8 = f28533n;
        if (f7 <= (-f8) || f7 >= f8) {
            int iM31620p = m31620p(c7151i);
            if (iM31620p == -1) {
                mo31530j(c7151i, f7);
                return;
            }
            float[] fArr = this.f28540g;
            float f9 = fArr[iM31620p] + f7;
            fArr[iM31620p] = f9;
            float f10 = f28533n;
            if (f9 <= (-f10) || f9 >= f10) {
                return;
            }
            fArr[iM31620p] = 0.0f;
            mo31527g(c7151i, z7);
        }
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: i */
    public float mo31529i(C7151i c7151i) {
        int iM31620p = m31620p(c7151i);
        if (iM31620p != -1) {
            return this.f28540g[iM31620p];
        }
        return 0.0f;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: j */
    public void mo31530j(C7151i c7151i, float f7) {
        float f8 = f28533n;
        if (f7 > (-f8) && f7 < f8) {
            mo31527g(c7151i, true);
            return;
        }
        if (this.f28543j == 0) {
            m31615m(0, c7151i, f7);
            m31614l(c7151i, 0);
            this.f28544k = 0;
            return;
        }
        int iM31620p = m31620p(c7151i);
        if (iM31620p != -1) {
            this.f28540g[iM31620p] = f7;
            return;
        }
        if (this.f28543j + 1 >= this.f28535b) {
            m31617o();
        }
        int i7 = this.f28543j;
        int i8 = this.f28544k;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f28539f[i8];
            int i12 = c7151i.f28514c;
            if (i11 == i12) {
                this.f28540g[i8] = f7;
                return;
            }
            if (i11 < i12) {
                i9 = i8;
            }
            i8 = this.f28542i[i8];
            if (i8 == -1) {
                break;
            }
        }
        m31618q(i9, c7151i, f7);
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: k */
    public void mo31531k(float f7) {
        int i7 = this.f28543j;
        int i8 = this.f28544k;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f28540g;
            fArr[i8] = fArr[i8] / f7;
            i8 = this.f28542i[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public int m31620p(C7151i c7151i) {
        if (this.f28543j != 0 && c7151i != null) {
            int i7 = c7151i.f28514c;
            int i8 = this.f28537d[i7 % this.f28536c];
            if (i8 == -1) {
                return -1;
            }
            if (this.f28539f[i8] == i7) {
                return i8;
            }
            do {
                i8 = this.f28538e[i8];
                if (i8 == -1) {
                    break;
                }
            } while (this.f28539f[i8] != i7);
            if (i8 != -1 && this.f28539f[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i7 = this.f28543j;
        for (int i8 = 0; i8 < i7; i8++) {
            C7151i c7151iMo31524d = mo31524d(i8);
            if (c7151iMo31524d != null) {
                String str2 = str + c7151iMo31524d + " = " + mo31526f(i8) + " ";
                int iM31620p = m31620p(c7151iMo31524d);
                String str3 = str2 + "[p: ";
                String str4 = (this.f28541h[iM31620p] != -1 ? str3 + this.f28546m.f28471d[this.f28539f[this.f28541h[iM31620p]]] : str3 + "none") + ", n: ";
                str = (this.f28542i[iM31620p] != -1 ? str4 + this.f28546m.f28471d[this.f28539f[this.f28542i[iM31620p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
