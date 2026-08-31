package p025D;

/* JADX INFO: renamed from: D.l */
/* JADX INFO: loaded from: classes.dex */
final class C0169l {

    /* JADX INFO: renamed from: k */
    static final C0169l f801k = m853k(AbstractC0159b.f767c, (float) ((((double) AbstractC0159b.m760h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a */
    private final float f802a;

    /* JADX INFO: renamed from: b */
    private final float f803b;

    /* JADX INFO: renamed from: c */
    private final float f804c;

    /* JADX INFO: renamed from: d */
    private final float f805d;

    /* JADX INFO: renamed from: e */
    private final float f806e;

    /* JADX INFO: renamed from: f */
    private final float f807f;

    /* JADX INFO: renamed from: g */
    private final float[] f808g;

    /* JADX INFO: renamed from: h */
    private final float f809h;

    /* JADX INFO: renamed from: i */
    private final float f810i;

    /* JADX INFO: renamed from: j */
    private final float f811j;

    private C0169l(float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr, float f13, float f14, float f15) {
        this.f807f = f7;
        this.f802a = f8;
        this.f803b = f9;
        this.f804c = f10;
        this.f805d = f11;
        this.f806e = f12;
        this.f808g = fArr;
        this.f809h = f13;
        this.f810i = f14;
        this.f811j = f15;
    }

    /* JADX INFO: renamed from: k */
    static C0169l m853k(float[] fArr, float f7, float f8, float f9, boolean z7) {
        float[][] fArr2 = AbstractC0159b.f765a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = f11 + (fArr3[1] * f12);
        float f14 = fArr[2];
        float f15 = f13 + (fArr3[2] * f14);
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[0] * f10) + (fArr4[1] * f12) + (fArr4[2] * f14);
        float[] fArr5 = fArr2[2];
        float f17 = (f10 * fArr5[0]) + (f12 * fArr5[1]) + (f14 * fArr5[2]);
        float f18 = (f9 / 10.0f) + 0.8f;
        float fM756d = ((double) f18) >= 0.9d ? AbstractC0159b.m756d(0.59f, 0.69f, (f18 - 0.9f) * 10.0f) : AbstractC0159b.m756d(0.525f, 0.59f, (f18 - 0.8f) * 10.0f);
        float fExp = z7 ? 1.0f : (1.0f - (((float) Math.exp(((-f7) - 42.0f) / 92.0f)) * 0.2777778f)) * f18;
        double d7 = fExp;
        if (d7 > 1.0d) {
            fExp = 1.0f;
        } else if (d7 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp};
        float f19 = 1.0f / ((5.0f * f7) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (f20 * f7) + (0.1f * f21 * f21 * ((float) Math.cbrt(((double) f7) * 5.0d)));
        float fM760h = AbstractC0159b.m760h(f8) / fArr[1];
        double d8 = fM760h;
        float fSqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d8, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f17)) / 100.0d, 0.42d)};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[2];
        float[] fArr8 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        return new C0169l(fM760h, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fM756d, f18, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    /* JADX INFO: renamed from: a */
    float m854a() {
        return this.f802a;
    }

    /* JADX INFO: renamed from: b */
    float m855b() {
        return this.f805d;
    }

    /* JADX INFO: renamed from: c */
    float m856c() {
        return this.f809h;
    }

    /* JADX INFO: renamed from: d */
    float m857d() {
        return this.f810i;
    }

    /* JADX INFO: renamed from: e */
    float m858e() {
        return this.f807f;
    }

    /* JADX INFO: renamed from: f */
    float m859f() {
        return this.f803b;
    }

    /* JADX INFO: renamed from: g */
    float m860g() {
        return this.f806e;
    }

    /* JADX INFO: renamed from: h */
    float m861h() {
        return this.f804c;
    }

    /* JADX INFO: renamed from: i */
    float[] m862i() {
        return this.f808g;
    }

    /* JADX INFO: renamed from: j */
    float m863j() {
        return this.f811j;
    }
}
