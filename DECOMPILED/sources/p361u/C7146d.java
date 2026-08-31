package p361u;

import com.google.android.gms.internal.ads.zzbbn;
import java.util.Arrays;
import java.util.HashMap;
import p385x.C7369d;
import p385x.C7370e;

/* JADX INFO: renamed from: u.d */
/* JADX INFO: loaded from: classes.dex */
public class C7146d {

    /* JADX INFO: renamed from: s */
    public static boolean f28472s = false;

    /* JADX INFO: renamed from: t */
    public static boolean f28473t = true;

    /* JADX INFO: renamed from: u */
    public static boolean f28474u = true;

    /* JADX INFO: renamed from: v */
    public static boolean f28475v = true;

    /* JADX INFO: renamed from: w */
    public static boolean f28476w = false;

    /* JADX INFO: renamed from: x */
    public static long f28477x;

    /* JADX INFO: renamed from: y */
    public static long f28478y;

    /* JADX INFO: renamed from: e */
    private a f28483e;

    /* JADX INFO: renamed from: o */
    final C7145c f28493o;

    /* JADX INFO: renamed from: r */
    private a f28496r;

    /* JADX INFO: renamed from: a */
    private int f28479a = zzbbn.zzq.zzf;

    /* JADX INFO: renamed from: b */
    public boolean f28480b = false;

    /* JADX INFO: renamed from: c */
    int f28481c = 0;

    /* JADX INFO: renamed from: d */
    private HashMap f28482d = null;

    /* JADX INFO: renamed from: f */
    private int f28484f = 32;

    /* JADX INFO: renamed from: g */
    private int f28485g = 32;

    /* JADX INFO: renamed from: i */
    public boolean f28487i = false;

    /* JADX INFO: renamed from: j */
    public boolean f28488j = false;

    /* JADX INFO: renamed from: k */
    private boolean[] f28489k = new boolean[32];

    /* JADX INFO: renamed from: l */
    int f28490l = 1;

    /* JADX INFO: renamed from: m */
    int f28491m = 0;

    /* JADX INFO: renamed from: n */
    private int f28492n = 32;

    /* JADX INFO: renamed from: p */
    private C7151i[] f28494p = new C7151i[zzbbn.zzq.zzf];

    /* JADX INFO: renamed from: q */
    private int f28495q = 0;

    /* JADX INFO: renamed from: h */
    C7144b[] f28486h = new C7144b[32];

    /* JADX INFO: renamed from: u.d$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo31538a(a aVar);

        /* JADX INFO: renamed from: b */
        C7151i mo31539b(C7146d c7146d, boolean[] zArr);

        /* JADX INFO: renamed from: c */
        void mo31540c(C7151i c7151i);

        void clear();

        C7151i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: renamed from: u.d$b */
    static class b extends C7144b {
        b(C7145c c7145c) {
            this.f28466e = new C7152j(this, c7145c);
        }
    }

    public C7146d() {
        m31563D();
        C7145c c7145c = new C7145c();
        this.f28493o = c7145c;
        this.f28483e = new C7150h(c7145c);
        if (f28476w) {
            this.f28496r = new b(c7145c);
        } else {
            this.f28496r = new C7144b(c7145c);
        }
    }

    /* JADX INFO: renamed from: C */
    private int m31562C(a aVar, boolean z7) {
        for (int i7 = 0; i7 < this.f28490l; i7++) {
            this.f28489k[i7] = false;
        }
        boolean z8 = false;
        int i8 = 0;
        while (!z8) {
            i8++;
            if (i8 < this.f28490l * 2) {
                if (aVar.getKey() != null) {
                    this.f28489k[aVar.getKey().f28514c] = true;
                }
                C7151i c7151iMo31539b = aVar.mo31539b(this, this.f28489k);
                if (c7151iMo31539b != null) {
                    boolean[] zArr = this.f28489k;
                    int i9 = c7151iMo31539b.f28514c;
                    if (!zArr[i9]) {
                        zArr[i9] = true;
                    }
                }
                if (c7151iMo31539b != null) {
                    float f7 = Float.MAX_VALUE;
                    int i10 = -1;
                    for (int i11 = 0; i11 < this.f28491m; i11++) {
                        C7144b c7144b = this.f28486h[i11];
                        if (c7144b.f28462a.f28521u != C7151i.a.UNRESTRICTED && !c7144b.f28467f && c7144b.m31557t(c7151iMo31539b)) {
                            float fMo31529i = c7144b.f28466e.mo31529i(c7151iMo31539b);
                            if (fMo31529i < 0.0f) {
                                float f8 = (-c7144b.f28463b) / fMo31529i;
                                if (f8 < f7) {
                                    i10 = i11;
                                    f7 = f8;
                                }
                            }
                        }
                    }
                    if (i10 > -1) {
                        C7144b c7144b2 = this.f28486h[i10];
                        c7144b2.f28462a.f28515d = -1;
                        c7144b2.m31559x(c7151iMo31539b);
                        C7151i c7151i = c7144b2.f28462a;
                        c7151i.f28515d = i10;
                        c7151i.m31612o(this, c7144b2);
                    }
                } else {
                    z8 = true;
                }
            }
            return i8;
        }
        return i8;
    }

    /* JADX INFO: renamed from: D */
    private void m31563D() {
        int i7 = 0;
        if (f28476w) {
            while (i7 < this.f28491m) {
                C7144b c7144b = this.f28486h[i7];
                if (c7144b != null) {
                    this.f28493o.f28468a.mo31593a(c7144b);
                }
                this.f28486h[i7] = null;
                i7++;
            }
            return;
        }
        while (i7 < this.f28491m) {
            C7144b c7144b2 = this.f28486h[i7];
            if (c7144b2 != null) {
                this.f28493o.f28469b.mo31593a(c7144b2);
            }
            this.f28486h[i7] = null;
            i7++;
        }
    }

    /* JADX INFO: renamed from: a */
    private C7151i m31564a(C7151i.a aVar, String str) {
        C7151i c7151i = (C7151i) this.f28493o.f28470c.mo31594b();
        if (c7151i == null) {
            c7151i = new C7151i(aVar, str);
            c7151i.m31611n(aVar, str);
        } else {
            c7151i.m31609k();
            c7151i.m31611n(aVar, str);
        }
        int i7 = this.f28495q;
        int i8 = this.f28479a;
        if (i7 >= i8) {
            int i9 = i8 * 2;
            this.f28479a = i9;
            this.f28494p = (C7151i[]) Arrays.copyOf(this.f28494p, i9);
        }
        C7151i[] c7151iArr = this.f28494p;
        int i10 = this.f28495q;
        this.f28495q = i10 + 1;
        c7151iArr[i10] = c7151i;
        return c7151i;
    }

    /* JADX INFO: renamed from: l */
    private void m31565l(C7144b c7144b) {
        int i7;
        if (f28474u && c7144b.f28467f) {
            c7144b.f28462a.m31610m(this, c7144b.f28463b);
        } else {
            C7144b[] c7144bArr = this.f28486h;
            int i8 = this.f28491m;
            c7144bArr[i8] = c7144b;
            C7151i c7151i = c7144b.f28462a;
            c7151i.f28515d = i8;
            this.f28491m = i8 + 1;
            c7151i.m31612o(this, c7144b);
        }
        if (f28474u && this.f28480b) {
            int i9 = 0;
            while (i9 < this.f28491m) {
                if (this.f28486h[i9] == null) {
                    System.out.println("WTF");
                }
                C7144b c7144b2 = this.f28486h[i9];
                if (c7144b2 != null && c7144b2.f28467f) {
                    c7144b2.f28462a.m31610m(this, c7144b2.f28463b);
                    if (f28476w) {
                        this.f28493o.f28468a.mo31593a(c7144b2);
                    } else {
                        this.f28493o.f28469b.mo31593a(c7144b2);
                    }
                    this.f28486h[i9] = null;
                    int i10 = i9 + 1;
                    int i11 = i10;
                    while (true) {
                        i7 = this.f28491m;
                        if (i10 >= i7) {
                            break;
                        }
                        C7144b[] c7144bArr2 = this.f28486h;
                        int i12 = i10 - 1;
                        C7144b c7144b3 = c7144bArr2[i10];
                        c7144bArr2[i12] = c7144b3;
                        C7151i c7151i2 = c7144b3.f28462a;
                        if (c7151i2.f28515d == i10) {
                            c7151i2.f28515d = i12;
                        }
                        i11 = i10;
                        i10++;
                    }
                    if (i11 < i7) {
                        this.f28486h[i11] = null;
                    }
                    this.f28491m = i7 - 1;
                    i9--;
                }
                i9++;
            }
            this.f28480b = false;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m31566n() {
        for (int i7 = 0; i7 < this.f28491m; i7++) {
            C7144b c7144b = this.f28486h[i7];
            c7144b.f28462a.f28517f = c7144b.f28463b;
        }
    }

    /* JADX INFO: renamed from: s */
    public static C7144b m31567s(C7146d c7146d, C7151i c7151i, C7151i c7151i2, float f7) {
        return c7146d.m31588r().m31547j(c7151i, c7151i2, f7);
    }

    /* JADX INFO: renamed from: u */
    private int m31568u(a aVar) {
        float f7;
        for (int i7 = 0; i7 < this.f28491m; i7++) {
            C7144b c7144b = this.f28486h[i7];
            if (c7144b.f28462a.f28521u != C7151i.a.UNRESTRICTED) {
                float f8 = 0.0f;
                if (c7144b.f28463b < 0.0f) {
                    boolean z7 = false;
                    int i8 = 0;
                    while (!z7) {
                        i8++;
                        float f9 = Float.MAX_VALUE;
                        int i9 = 0;
                        int i10 = -1;
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i9 >= this.f28491m) {
                                break;
                            }
                            C7144b c7144b2 = this.f28486h[i9];
                            if (c7144b2.f28462a.f28521u == C7151i.a.UNRESTRICTED || c7144b2.f28467f || c7144b2.f28463b >= f8) {
                                f7 = f8;
                            } else if (f28475v) {
                                int iMo31522b = c7144b2.f28466e.mo31522b();
                                int i13 = 0;
                                while (i13 < iMo31522b) {
                                    C7151i c7151iMo31524d = c7144b2.f28466e.mo31524d(i13);
                                    float fMo31529i = c7144b2.f28466e.mo31529i(c7151iMo31524d);
                                    if (fMo31529i > f8) {
                                        for (int i14 = 0; i14 < 9; i14++) {
                                            float f10 = c7151iMo31524d.f28519s[i14] / fMo31529i;
                                            if ((f10 < f9 && i14 == i12) || i14 > i12) {
                                                i12 = i14;
                                                i11 = c7151iMo31524d.f28514c;
                                                i10 = i9;
                                                f9 = f10;
                                            }
                                        }
                                    }
                                    i13++;
                                    f8 = f8;
                                }
                                f7 = f8;
                            } else {
                                f7 = f8;
                                for (int i15 = 1; i15 < this.f28490l; i15++) {
                                    C7151i c7151i = this.f28493o.f28471d[i15];
                                    float fMo31529i2 = c7144b2.f28466e.mo31529i(c7151i);
                                    if (fMo31529i2 > f7) {
                                        for (int i16 = 0; i16 < 9; i16++) {
                                            float f11 = c7151i.f28519s[i16] / fMo31529i2;
                                            if ((f11 < f9 && i16 == i12) || i16 > i12) {
                                                i12 = i16;
                                                i10 = i9;
                                                i11 = i15;
                                                f9 = f11;
                                            }
                                        }
                                    }
                                }
                            }
                            i9++;
                            f8 = f7;
                        }
                        float f12 = f8;
                        if (i10 != -1) {
                            C7144b c7144b3 = this.f28486h[i10];
                            c7144b3.f28462a.f28515d = -1;
                            c7144b3.m31559x(this.f28493o.f28471d[i11]);
                            C7151i c7151i2 = c7144b3.f28462a;
                            c7151i2.f28515d = i10;
                            c7151i2.m31612o(this, c7144b3);
                        } else {
                            z7 = true;
                        }
                        if (i8 > this.f28490l / 2) {
                            z7 = true;
                        }
                        f8 = f12;
                    }
                    return i8;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public static AbstractC7147e m31569x() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    private void m31570z() {
        int i7 = this.f28484f * 2;
        this.f28484f = i7;
        this.f28486h = (C7144b[]) Arrays.copyOf(this.f28486h, i7);
        C7145c c7145c = this.f28493o;
        c7145c.f28471d = (C7151i[]) Arrays.copyOf(c7145c.f28471d, this.f28484f);
        int i8 = this.f28484f;
        this.f28489k = new boolean[i8];
        this.f28485g = i8;
        this.f28492n = i8;
    }

    /* JADX INFO: renamed from: A */
    public void m31571A() {
        if (this.f28483e.isEmpty()) {
            m31566n();
            return;
        }
        if (!this.f28487i && !this.f28488j) {
            m31572B(this.f28483e);
            return;
        }
        for (int i7 = 0; i7 < this.f28491m; i7++) {
            if (!this.f28486h[i7].f28467f) {
                m31572B(this.f28483e);
                return;
            }
        }
        m31566n();
    }

    /* JADX INFO: renamed from: B */
    void m31572B(a aVar) {
        m31568u(aVar);
        m31562C(aVar, false);
        m31566n();
    }

    /* JADX INFO: renamed from: E */
    public void m31573E() {
        C7145c c7145c;
        int i7 = 0;
        while (true) {
            c7145c = this.f28493o;
            C7151i[] c7151iArr = c7145c.f28471d;
            if (i7 >= c7151iArr.length) {
                break;
            }
            C7151i c7151i = c7151iArr[i7];
            if (c7151i != null) {
                c7151i.m31609k();
            }
            i7++;
        }
        c7145c.f28470c.mo31595c(this.f28494p, this.f28495q);
        this.f28495q = 0;
        Arrays.fill(this.f28493o.f28471d, (Object) null);
        HashMap map = this.f28482d;
        if (map != null) {
            map.clear();
        }
        this.f28481c = 0;
        this.f28483e.clear();
        this.f28490l = 1;
        for (int i8 = 0; i8 < this.f28491m; i8++) {
            C7144b c7144b = this.f28486h[i8];
            if (c7144b != null) {
                c7144b.f28464c = false;
            }
        }
        m31563D();
        this.f28491m = 0;
        if (f28476w) {
            this.f28496r = new b(this.f28493o);
        } else {
            this.f28496r = new C7144b(this.f28493o);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m31574b(C7370e c7370e, C7370e c7370e2, float f7, int i7) {
        C7369d.a aVar = C7369d.a.LEFT;
        C7151i c7151iM31587q = m31587q(c7370e.mo32549o(aVar));
        C7369d.a aVar2 = C7369d.a.TOP;
        C7151i c7151iM31587q2 = m31587q(c7370e.mo32549o(aVar2));
        C7369d.a aVar3 = C7369d.a.RIGHT;
        C7151i c7151iM31587q3 = m31587q(c7370e.mo32549o(aVar3));
        C7369d.a aVar4 = C7369d.a.BOTTOM;
        C7151i c7151iM31587q4 = m31587q(c7370e.mo32549o(aVar4));
        C7151i c7151iM31587q5 = m31587q(c7370e2.mo32549o(aVar));
        C7151i c7151iM31587q6 = m31587q(c7370e2.mo32549o(aVar2));
        C7151i c7151iM31587q7 = m31587q(c7370e2.mo32549o(aVar3));
        C7151i c7151iM31587q8 = m31587q(c7370e2.mo32549o(aVar4));
        C7144b c7144bM31588r = m31588r();
        double d7 = f7;
        double d8 = i7;
        c7144bM31588r.m31554q(c7151iM31587q2, c7151iM31587q4, c7151iM31587q6, c7151iM31587q8, (float) (Math.sin(d7) * d8));
        m31576d(c7144bM31588r);
        C7144b c7144bM31588r2 = m31588r();
        c7144bM31588r2.m31554q(c7151iM31587q, c7151iM31587q3, c7151iM31587q5, c7151iM31587q7, (float) (Math.cos(d7) * d8));
        m31576d(c7144bM31588r2);
    }

    /* JADX INFO: renamed from: c */
    public void m31575c(C7151i c7151i, C7151i c7151i2, int i7, float f7, C7151i c7151i3, C7151i c7151i4, int i8, int i9) {
        C7144b c7144bM31588r = m31588r();
        c7144bM31588r.m31545h(c7151i, c7151i2, i7, f7, c7151i3, c7151i4, i8);
        if (i9 != 8) {
            c7144bM31588r.m31541d(this, i9);
        }
        m31576d(c7144bM31588r);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX INFO: renamed from: d */
    public void m31576d(C7144b c7144b) {
        C7151i c7151iM31558v;
        if (c7144b == null) {
            return;
        }
        boolean z7 = true;
        if (this.f28491m + 1 >= this.f28492n || this.f28490l + 1 >= this.f28485g) {
            m31570z();
        }
        boolean z8 = false;
        if (!c7144b.f28467f) {
            c7144b.m31537D(this);
            if (c7144b.isEmpty()) {
                return;
            }
            c7144b.m31555r();
            if (c7144b.m31543f(this)) {
                C7151i c7151iM31586p = m31586p();
                c7144b.f28462a = c7151iM31586p;
                int i7 = this.f28491m;
                m31565l(c7144b);
                if (this.f28491m == i7 + 1) {
                    this.f28496r.mo31538a(c7144b);
                    m31562C(this.f28496r, true);
                    if (c7151iM31586p.f28515d == -1) {
                        if (c7144b.f28462a == c7151iM31586p && (c7151iM31558v = c7144b.m31558v(c7151iM31586p)) != null) {
                            c7144b.m31559x(c7151iM31558v);
                        }
                        if (!c7144b.f28467f) {
                            c7144b.f28462a.m31612o(this, c7144b);
                        }
                        if (f28476w) {
                            this.f28493o.f28468a.mo31593a(c7144b);
                        } else {
                            this.f28493o.f28469b.mo31593a(c7144b);
                        }
                        this.f28491m--;
                    }
                } else {
                    z7 = false;
                }
            } else {
                z7 = false;
            }
            if (!c7144b.m31556s()) {
                return;
            } else {
                z8 = z7;
            }
        }
        if (z8) {
            return;
        }
        m31565l(c7144b);
    }

    /* JADX INFO: renamed from: e */
    public C7144b m31577e(C7151i c7151i, C7151i c7151i2, int i7, int i8) {
        if (f28473t && i8 == 8 && c7151i2.f28518r && c7151i.f28515d == -1) {
            c7151i.m31610m(this, c7151i2.f28517f + i7);
            return null;
        }
        C7144b c7144bM31588r = m31588r();
        c7144bM31588r.m31551n(c7151i, c7151i2, i7);
        if (i8 != 8) {
            c7144bM31588r.m31541d(this, i8);
        }
        m31576d(c7144bM31588r);
        return c7144bM31588r;
    }

    /* JADX INFO: renamed from: f */
    public void m31578f(C7151i c7151i, int i7) {
        if (f28473t && c7151i.f28515d == -1) {
            float f7 = i7;
            c7151i.m31610m(this, f7);
            for (int i8 = 0; i8 < this.f28481c + 1; i8++) {
                C7151i c7151i2 = this.f28493o.f28471d[i8];
                if (c7151i2 != null && c7151i2.f28525y && c7151i2.f28526z == c7151i.f28514c) {
                    c7151i2.m31610m(this, c7151i2.f28510A + f7);
                }
            }
            return;
        }
        int i9 = c7151i.f28515d;
        if (i9 == -1) {
            C7144b c7144bM31588r = m31588r();
            c7144bM31588r.m31546i(c7151i, i7);
            m31576d(c7144bM31588r);
            return;
        }
        C7144b c7144b = this.f28486h[i9];
        if (c7144b.f28467f) {
            c7144b.f28463b = i7;
            return;
        }
        if (c7144b.f28466e.mo31522b() == 0) {
            c7144b.f28467f = true;
            c7144b.f28463b = i7;
        } else {
            C7144b c7144bM31588r2 = m31588r();
            c7144bM31588r2.m31550m(c7151i, i7);
            m31576d(c7144bM31588r2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m31579g(C7151i c7151i, C7151i c7151i2, int i7, boolean z7) {
        C7144b c7144bM31588r = m31588r();
        C7151i c7151iM31589t = m31589t();
        c7151iM31589t.f28516e = 0;
        c7144bM31588r.m31552o(c7151i, c7151i2, c7151iM31589t, i7);
        m31576d(c7144bM31588r);
    }

    /* JADX INFO: renamed from: h */
    public void m31580h(C7151i c7151i, C7151i c7151i2, int i7, int i8) {
        C7144b c7144bM31588r = m31588r();
        C7151i c7151iM31589t = m31589t();
        c7151iM31589t.f28516e = 0;
        c7144bM31588r.m31552o(c7151i, c7151i2, c7151iM31589t, i7);
        if (i8 != 8) {
            m31584m(c7144bM31588r, (int) (c7144bM31588r.f28466e.mo31529i(c7151iM31589t) * (-1.0f)), i8);
        }
        m31576d(c7144bM31588r);
    }

    /* JADX INFO: renamed from: i */
    public void m31581i(C7151i c7151i, C7151i c7151i2, int i7, boolean z7) {
        C7144b c7144bM31588r = m31588r();
        C7151i c7151iM31589t = m31589t();
        c7151iM31589t.f28516e = 0;
        c7144bM31588r.m31553p(c7151i, c7151i2, c7151iM31589t, i7);
        m31576d(c7144bM31588r);
    }

    /* JADX INFO: renamed from: j */
    public void m31582j(C7151i c7151i, C7151i c7151i2, int i7, int i8) {
        C7144b c7144bM31588r = m31588r();
        C7151i c7151iM31589t = m31589t();
        c7151iM31589t.f28516e = 0;
        c7144bM31588r.m31553p(c7151i, c7151i2, c7151iM31589t, i7);
        if (i8 != 8) {
            m31584m(c7144bM31588r, (int) (c7144bM31588r.f28466e.mo31529i(c7151iM31589t) * (-1.0f)), i8);
        }
        m31576d(c7144bM31588r);
    }

    /* JADX INFO: renamed from: k */
    public void m31583k(C7151i c7151i, C7151i c7151i2, C7151i c7151i3, C7151i c7151i4, float f7, int i7) {
        C7144b c7144bM31588r = m31588r();
        c7144bM31588r.m31548k(c7151i, c7151i2, c7151i3, c7151i4, f7);
        if (i7 != 8) {
            c7144bM31588r.m31541d(this, i7);
        }
        m31576d(c7144bM31588r);
    }

    /* JADX INFO: renamed from: m */
    void m31584m(C7144b c7144b, int i7, int i8) {
        c7144b.m31542e(m31585o(i8, null), i7);
    }

    /* JADX INFO: renamed from: o */
    public C7151i m31585o(int i7, String str) {
        if (this.f28490l + 1 >= this.f28485g) {
            m31570z();
        }
        C7151i c7151iM31564a = m31564a(C7151i.a.ERROR, str);
        int i8 = this.f28481c + 1;
        this.f28481c = i8;
        this.f28490l++;
        c7151iM31564a.f28514c = i8;
        c7151iM31564a.f28516e = i7;
        this.f28493o.f28471d[i8] = c7151iM31564a;
        this.f28483e.mo31540c(c7151iM31564a);
        return c7151iM31564a;
    }

    /* JADX INFO: renamed from: p */
    public C7151i m31586p() {
        if (this.f28490l + 1 >= this.f28485g) {
            m31570z();
        }
        C7151i c7151iM31564a = m31564a(C7151i.a.SLACK, null);
        int i7 = this.f28481c + 1;
        this.f28481c = i7;
        this.f28490l++;
        c7151iM31564a.f28514c = i7;
        this.f28493o.f28471d[i7] = c7151iM31564a;
        return c7151iM31564a;
    }

    /* JADX INFO: renamed from: q */
    public C7151i m31587q(Object obj) {
        C7151i c7151iM32444i = null;
        if (obj == null) {
            return null;
        }
        if (this.f28490l + 1 >= this.f28485g) {
            m31570z();
        }
        if (obj instanceof C7369d) {
            C7369d c7369d = (C7369d) obj;
            c7151iM32444i = c7369d.m32444i();
            if (c7151iM32444i == null) {
                c7369d.m32454s(this.f28493o);
                c7151iM32444i = c7369d.m32444i();
            }
            int i7 = c7151iM32444i.f28514c;
            if (i7 != -1 && i7 <= this.f28481c && this.f28493o.f28471d[i7] != null) {
                return c7151iM32444i;
            }
            if (i7 != -1) {
                c7151iM32444i.m31609k();
            }
            int i8 = this.f28481c + 1;
            this.f28481c = i8;
            this.f28490l++;
            c7151iM32444i.f28514c = i8;
            c7151iM32444i.f28521u = C7151i.a.UNRESTRICTED;
            this.f28493o.f28471d[i8] = c7151iM32444i;
        }
        return c7151iM32444i;
    }

    /* JADX INFO: renamed from: r */
    public C7144b m31588r() {
        C7144b c7144b;
        if (f28476w) {
            c7144b = (C7144b) this.f28493o.f28468a.mo31594b();
            if (c7144b == null) {
                c7144b = new b(this.f28493o);
                f28478y++;
            } else {
                c7144b.m31560y();
            }
        } else {
            c7144b = (C7144b) this.f28493o.f28469b.mo31594b();
            if (c7144b == null) {
                c7144b = new C7144b(this.f28493o);
                f28477x++;
            } else {
                c7144b.m31560y();
            }
        }
        C7151i.m31605h();
        return c7144b;
    }

    /* JADX INFO: renamed from: t */
    public C7151i m31589t() {
        if (this.f28490l + 1 >= this.f28485g) {
            m31570z();
        }
        C7151i c7151iM31564a = m31564a(C7151i.a.SLACK, null);
        int i7 = this.f28481c + 1;
        this.f28481c = i7;
        this.f28490l++;
        c7151iM31564a.f28514c = i7;
        this.f28493o.f28471d[i7] = c7151iM31564a;
        return c7151iM31564a;
    }

    /* JADX INFO: renamed from: v */
    public void m31590v(AbstractC7147e abstractC7147e) {
    }

    /* JADX INFO: renamed from: w */
    public C7145c m31591w() {
        return this.f28493o;
    }

    /* JADX INFO: renamed from: y */
    public int m31592y(Object obj) {
        C7151i c7151iM32444i = ((C7369d) obj).m32444i();
        if (c7151iM32444i != null) {
            return (int) (c7151iM32444i.f28517f + 0.5f);
        }
        return 0;
    }
}
