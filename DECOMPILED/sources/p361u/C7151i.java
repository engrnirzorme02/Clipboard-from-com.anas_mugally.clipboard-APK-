package p361u;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: u.i */
/* JADX INFO: loaded from: classes.dex */
public class C7151i implements Comparable {

    /* JADX INFO: renamed from: C */
    private static int f28509C = 1;

    /* JADX INFO: renamed from: a */
    public boolean f28512a;

    /* JADX INFO: renamed from: b */
    private String f28513b;

    /* JADX INFO: renamed from: f */
    public float f28517f;

    /* JADX INFO: renamed from: u */
    a f28521u;

    /* JADX INFO: renamed from: c */
    public int f28514c = -1;

    /* JADX INFO: renamed from: d */
    int f28515d = -1;

    /* JADX INFO: renamed from: e */
    public int f28516e = 0;

    /* JADX INFO: renamed from: r */
    public boolean f28518r = false;

    /* JADX INFO: renamed from: s */
    float[] f28519s = new float[9];

    /* JADX INFO: renamed from: t */
    float[] f28520t = new float[9];

    /* JADX INFO: renamed from: v */
    C7144b[] f28522v = new C7144b[16];

    /* JADX INFO: renamed from: w */
    int f28523w = 0;

    /* JADX INFO: renamed from: x */
    public int f28524x = 0;

    /* JADX INFO: renamed from: y */
    boolean f28525y = false;

    /* JADX INFO: renamed from: z */
    int f28526z = -1;

    /* JADX INFO: renamed from: A */
    float f28510A = 0.0f;

    /* JADX INFO: renamed from: B */
    HashSet f28511B = null;

    /* JADX INFO: renamed from: u.i$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C7151i(a aVar, String str) {
        this.f28521u = aVar;
    }

    /* JADX INFO: renamed from: h */
    static void m31605h() {
        f28509C++;
    }

    /* JADX INFO: renamed from: c */
    public final void m31606c(C7144b c7144b) {
        int i7 = 0;
        while (true) {
            int i8 = this.f28523w;
            if (i7 >= i8) {
                C7144b[] c7144bArr = this.f28522v;
                if (i8 >= c7144bArr.length) {
                    this.f28522v = (C7144b[]) Arrays.copyOf(c7144bArr, c7144bArr.length * 2);
                }
                C7144b[] c7144bArr2 = this.f28522v;
                int i9 = this.f28523w;
                c7144bArr2[i9] = c7144b;
                this.f28523w = i9 + 1;
                return;
            }
            if (this.f28522v[i7] == c7144b) {
                return;
            } else {
                i7++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7151i c7151i) {
        return this.f28514c - c7151i.f28514c;
    }

    /* JADX INFO: renamed from: j */
    public final void m31608j(C7144b c7144b) {
        int i7 = this.f28523w;
        int i8 = 0;
        while (i8 < i7) {
            if (this.f28522v[i8] == c7144b) {
                while (i8 < i7 - 1) {
                    C7144b[] c7144bArr = this.f28522v;
                    int i9 = i8 + 1;
                    c7144bArr[i8] = c7144bArr[i9];
                    i8 = i9;
                }
                this.f28523w--;
                return;
            }
            i8++;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m31609k() {
        this.f28513b = null;
        this.f28521u = a.UNKNOWN;
        this.f28516e = 0;
        this.f28514c = -1;
        this.f28515d = -1;
        this.f28517f = 0.0f;
        this.f28518r = false;
        this.f28525y = false;
        this.f28526z = -1;
        this.f28510A = 0.0f;
        int i7 = this.f28523w;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f28522v[i8] = null;
        }
        this.f28523w = 0;
        this.f28524x = 0;
        this.f28512a = false;
        Arrays.fill(this.f28520t, 0.0f);
    }

    /* JADX INFO: renamed from: m */
    public void m31610m(C7146d c7146d, float f7) {
        this.f28517f = f7;
        this.f28518r = true;
        this.f28525y = false;
        this.f28526z = -1;
        this.f28510A = 0.0f;
        int i7 = this.f28523w;
        this.f28515d = -1;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f28522v[i8].m31534A(c7146d, this, false);
        }
        this.f28523w = 0;
    }

    /* JADX INFO: renamed from: n */
    public void m31611n(a aVar, String str) {
        this.f28521u = aVar;
    }

    /* JADX INFO: renamed from: o */
    public final void m31612o(C7146d c7146d, C7144b c7144b) {
        int i7 = this.f28523w;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f28522v[i8].mo31535B(c7146d, c7144b, false);
        }
        this.f28523w = 0;
    }

    public String toString() {
        if (this.f28513b != null) {
            return "" + this.f28513b;
        }
        return "" + this.f28514c;
    }
}
