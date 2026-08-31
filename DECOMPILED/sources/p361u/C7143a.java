package p361u;

import java.util.Arrays;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: loaded from: classes.dex */
public class C7143a implements C7144b.a {

    /* JADX INFO: renamed from: l */
    private static float f28450l = 0.001f;

    /* JADX INFO: renamed from: b */
    private final C7144b f28452b;

    /* JADX INFO: renamed from: c */
    protected final C7145c f28453c;

    /* JADX INFO: renamed from: a */
    int f28451a = 0;

    /* JADX INFO: renamed from: d */
    private int f28454d = 8;

    /* JADX INFO: renamed from: e */
    private C7151i f28455e = null;

    /* JADX INFO: renamed from: f */
    private int[] f28456f = new int[8];

    /* JADX INFO: renamed from: g */
    private int[] f28457g = new int[8];

    /* JADX INFO: renamed from: h */
    private float[] f28458h = new float[8];

    /* JADX INFO: renamed from: i */
    private int f28459i = -1;

    /* JADX INFO: renamed from: j */
    private int f28460j = -1;

    /* JADX INFO: renamed from: k */
    private boolean f28461k = false;

    C7143a(C7144b c7144b, C7145c c7145c) {
        this.f28452b = c7144b;
        this.f28453c = c7145c;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: a */
    public float mo31521a(C7144b c7144b, boolean z7) {
        float fMo31529i = mo31529i(c7144b.f28462a);
        mo31527g(c7144b.f28462a, z7);
        C7144b.a aVar = c7144b.f28466e;
        int iMo31522b = aVar.mo31522b();
        for (int i7 = 0; i7 < iMo31522b; i7++) {
            C7151i c7151iMo31524d = aVar.mo31524d(i7);
            mo31528h(c7151iMo31524d, aVar.mo31529i(c7151iMo31524d) * fMo31529i, z7);
        }
        return fMo31529i;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: b */
    public int mo31522b() {
        return this.f28451a;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: c */
    public boolean mo31523c(C7151i c7151i) {
        int i7 = this.f28459i;
        if (i7 == -1) {
            return false;
        }
        for (int i8 = 0; i7 != -1 && i8 < this.f28451a; i8++) {
            if (this.f28456f[i7] == c7151i.f28514c) {
                return true;
            }
            i7 = this.f28457g[i7];
        }
        return false;
    }

    @Override // p361u.C7144b.a
    public final void clear() {
        int i7 = this.f28459i;
        for (int i8 = 0; i7 != -1 && i8 < this.f28451a; i8++) {
            C7151i c7151i = this.f28453c.f28471d[this.f28456f[i7]];
            if (c7151i != null) {
                c7151i.m31608j(this.f28452b);
            }
            i7 = this.f28457g[i7];
        }
        this.f28459i = -1;
        this.f28460j = -1;
        this.f28461k = false;
        this.f28451a = 0;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: d */
    public C7151i mo31524d(int i7) {
        int i8 = this.f28459i;
        for (int i9 = 0; i8 != -1 && i9 < this.f28451a; i9++) {
            if (i9 == i7) {
                return this.f28453c.f28471d[this.f28456f[i8]];
            }
            i8 = this.f28457g[i8];
        }
        return null;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: e */
    public void mo31525e() {
        int i7 = this.f28459i;
        for (int i8 = 0; i7 != -1 && i8 < this.f28451a; i8++) {
            float[] fArr = this.f28458h;
            fArr[i7] = fArr[i7] * (-1.0f);
            i7 = this.f28457g[i7];
        }
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: f */
    public float mo31526f(int i7) {
        int i8 = this.f28459i;
        for (int i9 = 0; i8 != -1 && i9 < this.f28451a; i9++) {
            if (i9 == i7) {
                return this.f28458h[i8];
            }
            i8 = this.f28457g[i8];
        }
        return 0.0f;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: g */
    public final float mo31527g(C7151i c7151i, boolean z7) {
        if (this.f28455e == c7151i) {
            this.f28455e = null;
        }
        int i7 = this.f28459i;
        if (i7 == -1) {
            return 0.0f;
        }
        int i8 = 0;
        int i9 = -1;
        while (i7 != -1 && i8 < this.f28451a) {
            if (this.f28456f[i7] == c7151i.f28514c) {
                if (i7 == this.f28459i) {
                    this.f28459i = this.f28457g[i7];
                } else {
                    int[] iArr = this.f28457g;
                    iArr[i9] = iArr[i7];
                }
                if (z7) {
                    c7151i.m31608j(this.f28452b);
                }
                c7151i.f28524x--;
                this.f28451a--;
                this.f28456f[i7] = -1;
                if (this.f28461k) {
                    this.f28460j = i7;
                }
                return this.f28458h[i7];
            }
            i8++;
            i9 = i7;
            i7 = this.f28457g[i7];
        }
        return 0.0f;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: h */
    public void mo31528h(C7151i c7151i, float f7, boolean z7) {
        float f8 = f28450l;
        if (f7 <= (-f8) || f7 >= f8) {
            int i7 = this.f28459i;
            if (i7 == -1) {
                this.f28459i = 0;
                this.f28458h[0] = f7;
                this.f28456f[0] = c7151i.f28514c;
                this.f28457g[0] = -1;
                c7151i.f28524x++;
                c7151i.m31606c(this.f28452b);
                this.f28451a++;
                if (this.f28461k) {
                    return;
                }
                int i8 = this.f28460j + 1;
                this.f28460j = i8;
                int[] iArr = this.f28456f;
                if (i8 >= iArr.length) {
                    this.f28461k = true;
                    this.f28460j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i7 != -1 && i10 < this.f28451a; i10++) {
                int i11 = this.f28456f[i7];
                int i12 = c7151i.f28514c;
                if (i11 == i12) {
                    float[] fArr = this.f28458h;
                    float f9 = fArr[i7] + f7;
                    float f10 = f28450l;
                    if (f9 > (-f10) && f9 < f10) {
                        f9 = 0.0f;
                    }
                    fArr[i7] = f9;
                    if (f9 == 0.0f) {
                        if (i7 == this.f28459i) {
                            this.f28459i = this.f28457g[i7];
                        } else {
                            int[] iArr2 = this.f28457g;
                            iArr2[i9] = iArr2[i7];
                        }
                        if (z7) {
                            c7151i.m31608j(this.f28452b);
                        }
                        if (this.f28461k) {
                            this.f28460j = i7;
                        }
                        c7151i.f28524x--;
                        this.f28451a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i7;
                }
                i7 = this.f28457g[i7];
            }
            int length = this.f28460j;
            int i13 = length + 1;
            if (this.f28461k) {
                int[] iArr3 = this.f28456f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i13;
            }
            int[] iArr4 = this.f28456f;
            if (length >= iArr4.length && this.f28451a < iArr4.length) {
                int i14 = 0;
                while (true) {
                    int[] iArr5 = this.f28456f;
                    if (i14 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i14] == -1) {
                        length = i14;
                        break;
                    }
                    i14++;
                }
            }
            int[] iArr6 = this.f28456f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i15 = this.f28454d * 2;
                this.f28454d = i15;
                this.f28461k = false;
                this.f28460j = length - 1;
                this.f28458h = Arrays.copyOf(this.f28458h, i15);
                this.f28456f = Arrays.copyOf(this.f28456f, this.f28454d);
                this.f28457g = Arrays.copyOf(this.f28457g, this.f28454d);
            }
            this.f28456f[length] = c7151i.f28514c;
            this.f28458h[length] = f7;
            if (i9 != -1) {
                int[] iArr7 = this.f28457g;
                iArr7[length] = iArr7[i9];
                iArr7[i9] = length;
            } else {
                this.f28457g[length] = this.f28459i;
                this.f28459i = length;
            }
            c7151i.f28524x++;
            c7151i.m31606c(this.f28452b);
            this.f28451a++;
            if (!this.f28461k) {
                this.f28460j++;
            }
            int i16 = this.f28460j;
            int[] iArr8 = this.f28456f;
            if (i16 >= iArr8.length) {
                this.f28461k = true;
                this.f28460j = iArr8.length - 1;
            }
        }
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: i */
    public final float mo31529i(C7151i c7151i) {
        int i7 = this.f28459i;
        for (int i8 = 0; i7 != -1 && i8 < this.f28451a; i8++) {
            if (this.f28456f[i7] == c7151i.f28514c) {
                return this.f28458h[i7];
            }
            i7 = this.f28457g[i7];
        }
        return 0.0f;
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: j */
    public final void mo31530j(C7151i c7151i, float f7) {
        if (f7 == 0.0f) {
            mo31527g(c7151i, true);
            return;
        }
        int i7 = this.f28459i;
        if (i7 == -1) {
            this.f28459i = 0;
            this.f28458h[0] = f7;
            this.f28456f[0] = c7151i.f28514c;
            this.f28457g[0] = -1;
            c7151i.f28524x++;
            c7151i.m31606c(this.f28452b);
            this.f28451a++;
            if (this.f28461k) {
                return;
            }
            int i8 = this.f28460j + 1;
            this.f28460j = i8;
            int[] iArr = this.f28456f;
            if (i8 >= iArr.length) {
                this.f28461k = true;
                this.f28460j = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i7 != -1 && i10 < this.f28451a; i10++) {
            int i11 = this.f28456f[i7];
            int i12 = c7151i.f28514c;
            if (i11 == i12) {
                this.f28458h[i7] = f7;
                return;
            }
            if (i11 < i12) {
                i9 = i7;
            }
            i7 = this.f28457g[i7];
        }
        int length = this.f28460j;
        int i13 = length + 1;
        if (this.f28461k) {
            int[] iArr2 = this.f28456f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i13;
        }
        int[] iArr3 = this.f28456f;
        if (length >= iArr3.length && this.f28451a < iArr3.length) {
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.f28456f;
                if (i14 >= iArr4.length) {
                    break;
                }
                if (iArr4[i14] == -1) {
                    length = i14;
                    break;
                }
                i14++;
            }
        }
        int[] iArr5 = this.f28456f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i15 = this.f28454d * 2;
            this.f28454d = i15;
            this.f28461k = false;
            this.f28460j = length - 1;
            this.f28458h = Arrays.copyOf(this.f28458h, i15);
            this.f28456f = Arrays.copyOf(this.f28456f, this.f28454d);
            this.f28457g = Arrays.copyOf(this.f28457g, this.f28454d);
        }
        this.f28456f[length] = c7151i.f28514c;
        this.f28458h[length] = f7;
        if (i9 != -1) {
            int[] iArr6 = this.f28457g;
            iArr6[length] = iArr6[i9];
            iArr6[i9] = length;
        } else {
            this.f28457g[length] = this.f28459i;
            this.f28459i = length;
        }
        c7151i.f28524x++;
        c7151i.m31606c(this.f28452b);
        int i16 = this.f28451a + 1;
        this.f28451a = i16;
        if (!this.f28461k) {
            this.f28460j++;
        }
        int[] iArr7 = this.f28456f;
        if (i16 >= iArr7.length) {
            this.f28461k = true;
        }
        if (this.f28460j >= iArr7.length) {
            this.f28461k = true;
            this.f28460j = iArr7.length - 1;
        }
    }

    @Override // p361u.C7144b.a
    /* JADX INFO: renamed from: k */
    public void mo31531k(float f7) {
        int i7 = this.f28459i;
        for (int i8 = 0; i7 != -1 && i8 < this.f28451a; i8++) {
            float[] fArr = this.f28458h;
            fArr[i7] = fArr[i7] / f7;
            i7 = this.f28457g[i7];
        }
    }

    public String toString() {
        int i7 = this.f28459i;
        String str = "";
        for (int i8 = 0; i7 != -1 && i8 < this.f28451a; i8++) {
            str = ((str + " -> ") + this.f28458h[i7] + " : ") + this.f28453c.f28471d[this.f28456f[i7]];
            i7 = this.f28457g[i7];
        }
        return str;
    }
}
