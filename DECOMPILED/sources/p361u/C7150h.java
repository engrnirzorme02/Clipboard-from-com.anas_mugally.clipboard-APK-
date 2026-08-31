package p361u;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: u.h */
/* JADX INFO: loaded from: classes.dex */
public class C7150h extends C7144b {

    /* JADX INFO: renamed from: g */
    private int f28499g;

    /* JADX INFO: renamed from: h */
    private C7151i[] f28500h;

    /* JADX INFO: renamed from: i */
    private C7151i[] f28501i;

    /* JADX INFO: renamed from: j */
    private int f28502j;

    /* JADX INFO: renamed from: k */
    b f28503k;

    /* JADX INFO: renamed from: l */
    C7145c f28504l;

    /* JADX INFO: renamed from: u.h$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C7151i c7151i, C7151i c7151i2) {
            return c7151i.f28514c - c7151i2.f28514c;
        }
    }

    /* JADX INFO: renamed from: u.h$b */
    class b {

        /* JADX INFO: renamed from: a */
        C7151i f28506a;

        /* JADX INFO: renamed from: b */
        C7150h f28507b;

        b(C7150h c7150h) {
            this.f28507b = c7150h;
        }

        /* JADX INFO: renamed from: a */
        public boolean m31600a(C7151i c7151i, float f7) {
            boolean z7 = true;
            if (!this.f28506a.f28512a) {
                for (int i7 = 0; i7 < 9; i7++) {
                    float f8 = c7151i.f28520t[i7];
                    if (f8 != 0.0f) {
                        float f9 = f8 * f7;
                        if (Math.abs(f9) < 1.0E-4f) {
                            f9 = 0.0f;
                        }
                        this.f28506a.f28520t[i7] = f9;
                    } else {
                        this.f28506a.f28520t[i7] = 0.0f;
                    }
                }
                return true;
            }
            for (int i8 = 0; i8 < 9; i8++) {
                float[] fArr = this.f28506a.f28520t;
                float f10 = fArr[i8] + (c7151i.f28520t[i8] * f7);
                fArr[i8] = f10;
                if (Math.abs(f10) < 1.0E-4f) {
                    this.f28506a.f28520t[i8] = 0.0f;
                } else {
                    z7 = false;
                }
            }
            if (z7) {
                C7150h.this.m31598G(this.f28506a);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public void m31601b(C7151i c7151i) {
            this.f28506a = c7151i;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m31602c() {
            for (int i7 = 8; i7 >= 0; i7--) {
                float f7 = this.f28506a.f28520t[i7];
                if (f7 > 0.0f) {
                    return false;
                }
                if (f7 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m31603d(C7151i c7151i) {
            for (int i7 = 8; i7 >= 0; i7--) {
                float f7 = c7151i.f28520t[i7];
                float f8 = this.f28506a.f28520t[i7];
                if (f8 != f7) {
                    if (f8 < f7) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void m31604e() {
            Arrays.fill(this.f28506a.f28520t, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f28506a != null) {
                for (int i7 = 0; i7 < 9; i7++) {
                    str = str + this.f28506a.f28520t[i7] + " ";
                }
            }
            return str + "] " + this.f28506a;
        }
    }

    public C7150h(C7145c c7145c) {
        super(c7145c);
        this.f28499g = 128;
        this.f28500h = new C7151i[128];
        this.f28501i = new C7151i[128];
        this.f28502j = 0;
        this.f28503k = new b(this);
        this.f28504l = c7145c;
    }

    /* JADX INFO: renamed from: F */
    private void m31597F(C7151i c7151i) {
        int i7;
        int i8 = this.f28502j + 1;
        C7151i[] c7151iArr = this.f28500h;
        if (i8 > c7151iArr.length) {
            C7151i[] c7151iArr2 = (C7151i[]) Arrays.copyOf(c7151iArr, c7151iArr.length * 2);
            this.f28500h = c7151iArr2;
            this.f28501i = (C7151i[]) Arrays.copyOf(c7151iArr2, c7151iArr2.length * 2);
        }
        C7151i[] c7151iArr3 = this.f28500h;
        int i9 = this.f28502j;
        c7151iArr3[i9] = c7151i;
        int i10 = i9 + 1;
        this.f28502j = i10;
        if (i10 > 1 && c7151iArr3[i9].f28514c > c7151i.f28514c) {
            int i11 = 0;
            while (true) {
                i7 = this.f28502j;
                if (i11 >= i7) {
                    break;
                }
                this.f28501i[i11] = this.f28500h[i11];
                i11++;
            }
            Arrays.sort(this.f28501i, 0, i7, new a());
            for (int i12 = 0; i12 < this.f28502j; i12++) {
                this.f28500h[i12] = this.f28501i[i12];
            }
        }
        c7151i.f28512a = true;
        c7151i.m31606c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m31598G(C7151i c7151i) {
        int i7 = 0;
        while (i7 < this.f28502j) {
            if (this.f28500h[i7] == c7151i) {
                while (true) {
                    int i8 = this.f28502j;
                    if (i7 >= i8 - 1) {
                        this.f28502j = i8 - 1;
                        c7151i.f28512a = false;
                        return;
                    } else {
                        C7151i[] c7151iArr = this.f28500h;
                        int i9 = i7 + 1;
                        c7151iArr[i7] = c7151iArr[i9];
                        i7 = i9;
                    }
                }
            } else {
                i7++;
            }
        }
    }

    @Override // p361u.C7144b
    /* JADX INFO: renamed from: B */
    public void mo31535B(C7146d c7146d, C7144b c7144b, boolean z7) {
        C7151i c7151i = c7144b.f28462a;
        if (c7151i == null) {
            return;
        }
        C7144b.a aVar = c7144b.f28466e;
        int iMo31522b = aVar.mo31522b();
        for (int i7 = 0; i7 < iMo31522b; i7++) {
            C7151i c7151iMo31524d = aVar.mo31524d(i7);
            float fMo31526f = aVar.mo31526f(i7);
            this.f28503k.m31601b(c7151iMo31524d);
            if (this.f28503k.m31600a(c7151i, fMo31526f)) {
                m31597F(c7151iMo31524d);
            }
            this.f28463b += c7144b.f28463b * fMo31526f;
        }
        m31598G(c7151i);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // p361u.C7144b, p361u.C7146d.a
    /* JADX INFO: renamed from: b */
    public C7151i mo31539b(C7146d c7146d, boolean[] zArr) {
        int i7 = -1;
        for (int i8 = 0; i8 < this.f28502j; i8++) {
            C7151i c7151i = this.f28500h[i8];
            if (!zArr[c7151i.f28514c]) {
                this.f28503k.m31601b(c7151i);
                if (i7 == -1) {
                    if (this.f28503k.m31602c()) {
                        i7 = i8;
                    }
                } else if (this.f28503k.m31603d(this.f28500h[i7])) {
                    i7 = i8;
                }
            }
        }
        if (i7 == -1) {
            return null;
        }
        return this.f28500h[i7];
    }

    @Override // p361u.C7144b, p361u.C7146d.a
    /* JADX INFO: renamed from: c */
    public void mo31540c(C7151i c7151i) {
        this.f28503k.m31601b(c7151i);
        this.f28503k.m31604e();
        c7151i.f28520t[c7151i.f28516e] = 1.0f;
        m31597F(c7151i);
    }

    @Override // p361u.C7144b, p361u.C7146d.a
    public void clear() {
        this.f28502j = 0;
        this.f28463b = 0.0f;
    }

    @Override // p361u.C7144b, p361u.C7146d.a
    public boolean isEmpty() {
        return this.f28502j == 0;
    }

    @Override // p361u.C7144b
    public String toString() {
        String str = " goal -> (" + this.f28463b + ") : ";
        for (int i7 = 0; i7 < this.f28502j; i7++) {
            this.f28503k.m31601b(this.f28500h[i7]);
            str = str + this.f28503k + " ";
        }
        return str;
    }
}
