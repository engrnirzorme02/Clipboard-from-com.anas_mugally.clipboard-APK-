package p385x;

import java.util.ArrayList;

/* JADX INFO: renamed from: x.c */
/* JADX INFO: loaded from: classes.dex */
public class C7368c {

    /* JADX INFO: renamed from: a */
    protected C7370e f29346a;

    /* JADX INFO: renamed from: b */
    protected C7370e f29347b;

    /* JADX INFO: renamed from: c */
    protected C7370e f29348c;

    /* JADX INFO: renamed from: d */
    protected C7370e f29349d;

    /* JADX INFO: renamed from: e */
    protected C7370e f29350e;

    /* JADX INFO: renamed from: f */
    protected C7370e f29351f;

    /* JADX INFO: renamed from: g */
    protected C7370e f29352g;

    /* JADX INFO: renamed from: h */
    protected ArrayList f29353h;

    /* JADX INFO: renamed from: i */
    protected int f29354i;

    /* JADX INFO: renamed from: j */
    protected int f29355j;

    /* JADX INFO: renamed from: k */
    protected float f29356k = 0.0f;

    /* JADX INFO: renamed from: l */
    int f29357l;

    /* JADX INFO: renamed from: m */
    int f29358m;

    /* JADX INFO: renamed from: n */
    int f29359n;

    /* JADX INFO: renamed from: o */
    boolean f29360o;

    /* JADX INFO: renamed from: p */
    private int f29361p;

    /* JADX INFO: renamed from: q */
    private boolean f29362q;

    /* JADX INFO: renamed from: r */
    protected boolean f29363r;

    /* JADX INFO: renamed from: s */
    protected boolean f29364s;

    /* JADX INFO: renamed from: t */
    protected boolean f29365t;

    /* JADX INFO: renamed from: u */
    protected boolean f29366u;

    /* JADX INFO: renamed from: v */
    private boolean f29367v;

    public C7368c(C7370e c7370e, int i7, boolean z7) {
        this.f29346a = c7370e;
        this.f29361p = i7;
        this.f29362q = z7;
    }

    /* JADX INFO: renamed from: b */
    private void m32433b() {
        int i7 = this.f29361p * 2;
        C7370e c7370e = this.f29346a;
        this.f29360o = true;
        C7370e c7370e2 = c7370e;
        boolean z7 = false;
        while (!z7) {
            this.f29354i++;
            C7370e[] c7370eArr = c7370e.f29399F0;
            int i8 = this.f29361p;
            C7370e c7370e3 = null;
            c7370eArr[i8] = null;
            c7370e.f29397E0[i8] = null;
            if (c7370e.m32506V() != 8) {
                this.f29357l++;
                C7370e.b bVarM32564u = c7370e.m32564u(this.f29361p);
                C7370e.b bVar = C7370e.b.MATCH_CONSTRAINT;
                if (bVarM32564u != bVar) {
                    this.f29358m += c7370e.m32474E(this.f29361p);
                }
                int iM32441f = this.f29358m + c7370e.f29420W[i7].m32441f();
                this.f29358m = iM32441f;
                int i9 = i7 + 1;
                this.f29358m = iM32441f + c7370e.f29420W[i9].m32441f();
                int iM32441f2 = this.f29359n + c7370e.f29420W[i7].m32441f();
                this.f29359n = iM32441f2;
                this.f29359n = iM32441f2 + c7370e.f29420W[i9].m32441f();
                if (this.f29347b == null) {
                    this.f29347b = c7370e;
                }
                this.f29349d = c7370e;
                C7370e.b[] bVarArr = c7370e.f29423Z;
                int i10 = this.f29361p;
                if (bVarArr[i10] == bVar) {
                    int i11 = c7370e.f29472y[i10];
                    if (i11 == 0 || i11 == 3 || i11 == 2) {
                        this.f29355j++;
                        float f7 = c7370e.f29395D0[i10];
                        if (f7 > 0.0f) {
                            this.f29356k += f7;
                        }
                        if (m32434c(c7370e, i10)) {
                            if (f7 < 0.0f) {
                                this.f29363r = true;
                            } else {
                                this.f29364s = true;
                            }
                            if (this.f29353h == null) {
                                this.f29353h = new ArrayList();
                            }
                            this.f29353h.add(c7370e);
                        }
                        if (this.f29351f == null) {
                            this.f29351f = c7370e;
                        }
                        C7370e c7370e4 = this.f29352g;
                        if (c7370e4 != null) {
                            c7370e4.f29397E0[this.f29361p] = c7370e;
                        }
                        this.f29352g = c7370e;
                    }
                    if (this.f29361p == 0) {
                        if (c7370e.f29468w != 0 || c7370e.f29474z != 0 || c7370e.f29388A != 0) {
                            this.f29360o = false;
                        }
                    } else if (c7370e.f29470x != 0 || c7370e.f29392C != 0 || c7370e.f29394D != 0) {
                        this.f29360o = false;
                    }
                    if (c7370e.f29431d0 != 0.0f) {
                        this.f29360o = false;
                        this.f29366u = true;
                    }
                }
            }
            if (c7370e2 != c7370e) {
                c7370e2.f29399F0[this.f29361p] = c7370e;
            }
            C7369d c7369d = c7370e.f29420W[i7 + 1].f29373f;
            if (c7369d != null) {
                C7370e c7370e5 = c7369d.f29371d;
                C7369d c7369d2 = c7370e5.f29420W[i7].f29373f;
                if (c7369d2 != null && c7369d2.f29371d == c7370e) {
                    c7370e3 = c7370e5;
                }
            }
            if (c7370e3 == null) {
                c7370e3 = c7370e;
                z7 = true;
            }
            c7370e2 = c7370e;
            c7370e = c7370e3;
        }
        C7370e c7370e6 = this.f29347b;
        if (c7370e6 != null) {
            this.f29358m -= c7370e6.f29420W[i7].m32441f();
        }
        C7370e c7370e7 = this.f29349d;
        if (c7370e7 != null) {
            this.f29358m -= c7370e7.f29420W[i7 + 1].m32441f();
        }
        this.f29348c = c7370e;
        if (this.f29361p == 0 && this.f29362q) {
            this.f29350e = c7370e;
        } else {
            this.f29350e = this.f29346a;
        }
        this.f29365t = this.f29364s && this.f29363r;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m32434c(C7370e c7370e, int i7) {
        if (c7370e.m32506V() == 8 || c7370e.f29423Z[i7] != C7370e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i8 = c7370e.f29472y[i7];
        return i8 == 0 || i8 == 3;
    }

    /* JADX INFO: renamed from: a */
    public void m32435a() {
        if (!this.f29367v) {
            m32433b();
        }
        this.f29367v = true;
    }
}
