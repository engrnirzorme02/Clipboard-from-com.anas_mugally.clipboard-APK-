package p025D;

import p033E.AbstractC0246a;

/* JADX INFO: renamed from: D.a */
/* JADX INFO: loaded from: classes.dex */
public class C0158a {

    /* JADX INFO: renamed from: a */
    private final float f756a;

    /* JADX INFO: renamed from: b */
    private final float f757b;

    /* JADX INFO: renamed from: c */
    private final float f758c;

    /* JADX INFO: renamed from: d */
    private final float f759d;

    /* JADX INFO: renamed from: e */
    private final float f760e;

    /* JADX INFO: renamed from: f */
    private final float f761f;

    /* JADX INFO: renamed from: g */
    private final float f762g;

    /* JADX INFO: renamed from: h */
    private final float f763h;

    /* JADX INFO: renamed from: i */
    private final float f764i;

    C0158a(float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f756a = f7;
        this.f757b = f8;
        this.f758c = f9;
        this.f759d = f10;
        this.f760e = f11;
        this.f761f = f12;
        this.f762g = f13;
        this.f763h = f14;
        this.f764i = f15;
    }

    /* JADX INFO: renamed from: b */
    private static C0158a m737b(float f7, float f8, float f9) {
        float f10 = 100.0f;
        float f11 = 1000.0f;
        float f12 = 0.0f;
        C0158a c0158a = null;
        float f13 = 1000.0f;
        while (Math.abs(f12 - f10) > 0.01f) {
            float f14 = ((f10 - f12) / 2.0f) + f12;
            int iM752p = m740e(f14, f8, f7).m752p();
            float fM754b = AbstractC0159b.m754b(iM752p);
            float fAbs = Math.abs(f9 - fM754b);
            if (fAbs < 0.2f) {
                C0158a c0158aM738c = m738c(iM752p);
                float fM744a = c0158aM738c.m744a(m740e(c0158aM738c.m749k(), c0158aM738c.m747i(), f7));
                if (fM744a <= 1.0f) {
                    c0158a = c0158aM738c;
                    f11 = fAbs;
                    f13 = fM744a;
                }
            }
            if (f11 == 0.0f && f13 == 0.0f) {
                return c0158a;
            }
            if (fM754b < f9) {
                f12 = f14;
            } else {
                f10 = f14;
            }
        }
        return c0158a;
    }

    /* JADX INFO: renamed from: c */
    static C0158a m738c(int i7) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        m739d(i7, C0169l.f801k, fArr, fArr2);
        return new C0158a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    /* JADX INFO: renamed from: d */
    static void m739d(int i7, C0169l c0169l, float[] fArr, float[] fArr2) {
        AbstractC0159b.m758f(i7, fArr2);
        float[][] fArr3 = AbstractC0159b.f765a;
        float f7 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f8 = fArr4[0] * f7;
        float f9 = fArr2[1];
        float f10 = f8 + (fArr4[1] * f9);
        float f11 = fArr2[2];
        float f12 = f10 + (fArr4[2] * f11);
        float[] fArr5 = fArr3[1];
        float f13 = (fArr5[0] * f7) + (fArr5[1] * f9) + (fArr5[2] * f11);
        float[] fArr6 = fArr3[2];
        float f14 = (f7 * fArr6[0]) + (f9 * fArr6[1]) + (f11 * fArr6[2]);
        float f15 = c0169l.m862i()[0] * f12;
        float f16 = c0169l.m862i()[1] * f13;
        float f17 = c0169l.m862i()[2] * f14;
        float fPow = (float) Math.pow(((double) (c0169l.m856c() * Math.abs(f15))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (c0169l.m856c() * Math.abs(f16))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (c0169l.m856c() * Math.abs(f17))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f15) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f16) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f17) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d7 = fSignum3;
        float f18 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d7)) / 11.0f;
        float f19 = ((float) (((double) (fSignum + fSignum2)) - (d7 * 2.0d))) / 9.0f;
        float f20 = fSignum2 * 20.0f;
        float f21 = (((fSignum * 20.0f) + f20) + (21.0f * fSignum3)) / 20.0f;
        float f22 = (((fSignum * 40.0f) + f20) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f23 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f22 * c0169l.m859f()) / c0169l.m854a(), c0169l.m855b() * c0169l.m863j())) * 100.0f;
        float fM855b = (4.0f / c0169l.m855b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (c0169l.m854a() + 4.0f) * c0169l.m857d();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0169l.m858e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0169l.m860g()) * c0169l.m861h()) * ((float) Math.sqrt((f18 * f18) + (f19 * f19)))) / (f21 + 0.305f), 0.9d));
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float fM857d = c0169l.m857d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((fPow5 * c0169l.m855b()) / (c0169l.m854a() + 4.0f))) * 50.0f;
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fM857d) + 1.0f)) * 43.85965f;
        double d8 = f23;
        float fCos = ((float) Math.cos(d8)) * fLog;
        float fSin = fLog * ((float) Math.sin(d8));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fM855b;
            fArr[2] = fM857d;
            fArr[3] = fSqrt2;
            fArr[4] = f24;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    /* JADX INFO: renamed from: e */
    private static C0158a m740e(float f7, float f8, float f9) {
        return m741f(f7, f8, f9, C0169l.f801k);
    }

    /* JADX INFO: renamed from: f */
    private static C0158a m741f(float f7, float f8, float f9, C0169l c0169l) {
        double d7 = ((double) f7) / 100.0d;
        float fM855b = (4.0f / c0169l.m855b()) * ((float) Math.sqrt(d7)) * (c0169l.m854a() + 4.0f) * c0169l.m857d();
        float fM857d = c0169l.m857d() * f8;
        float fSqrt = ((float) Math.sqrt(((f8 / ((float) Math.sqrt(d7))) * c0169l.m855b()) / (c0169l.m854a() + 4.0f))) * 50.0f;
        float f10 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float fLog = ((float) Math.log((((double) fM857d) * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f9) / 180.0f;
        return new C0158a(f9, f8, f7, fM855b, fM857d, fSqrt, f10, ((float) Math.cos(d8)) * fLog, fLog * ((float) Math.sin(d8)));
    }

    /* JADX INFO: renamed from: m */
    public static int m742m(float f7, float f8, float f9) {
        return m743n(f7, f8, f9, C0169l.f801k);
    }

    /* JADX INFO: renamed from: n */
    static int m743n(float f7, float f8, float f9, C0169l c0169l) {
        if (f8 < 1.0d || Math.round(f9) <= 0.0d || Math.round(f9) >= 100.0d) {
            return AbstractC0159b.m753a(f9);
        }
        float fMin = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
        C0158a c0158a = null;
        boolean z7 = true;
        float f10 = 0.0f;
        float f11 = f8;
        while (Math.abs(f10 - f8) >= 0.4f) {
            C0158a c0158aM737b = m737b(fMin, f11, f9);
            if (!z7) {
                if (c0158aM737b == null) {
                    f8 = f11;
                } else {
                    f10 = f11;
                    c0158a = c0158aM737b;
                }
                f11 = ((f8 - f10) / 2.0f) + f10;
            } else {
                if (c0158aM737b != null) {
                    return c0158aM737b.m751o(c0169l);
                }
                f11 = ((f8 - f10) / 2.0f) + f10;
                z7 = false;
            }
        }
        return c0158a == null ? AbstractC0159b.m753a(f9) : c0158a.m751o(c0169l);
    }

    /* JADX INFO: renamed from: a */
    float m744a(C0158a c0158a) {
        float fM750l = m750l() - c0158a.m750l();
        float fM745g = m745g() - c0158a.m745g();
        float fM746h = m746h() - c0158a.m746h();
        return (float) (Math.pow(Math.sqrt((fM750l * fM750l) + (fM745g * fM745g) + (fM746h * fM746h)), 0.63d) * 1.41d);
    }

    /* JADX INFO: renamed from: g */
    float m745g() {
        return this.f763h;
    }

    /* JADX INFO: renamed from: h */
    float m746h() {
        return this.f764i;
    }

    /* JADX INFO: renamed from: i */
    float m747i() {
        return this.f757b;
    }

    /* JADX INFO: renamed from: j */
    float m748j() {
        return this.f756a;
    }

    /* JADX INFO: renamed from: k */
    float m749k() {
        return this.f758c;
    }

    /* JADX INFO: renamed from: l */
    float m750l() {
        return this.f762g;
    }

    /* JADX INFO: renamed from: o */
    int m751o(C0169l c0169l) {
        float fPow = (float) Math.pow(((double) ((((double) m747i()) == 0.0d || ((double) m749k()) == 0.0d) ? 0.0f : m747i() / ((float) Math.sqrt(((double) m749k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, c0169l.m858e()), 0.73d), 1.1111111111111112d);
        double dM748j = (m748j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dM748j) + 3.8d)) * 0.25f;
        float fM854a = c0169l.m854a() * ((float) Math.pow(((double) m749k()) / 100.0d, (1.0d / ((double) c0169l.m855b())) / ((double) c0169l.m863j())));
        float fM860g = fCos * 3846.1538f * c0169l.m860g() * c0169l.m861h();
        float fM859f = fM854a / c0169l.m859f();
        float fSin = (float) Math.sin(dM748j);
        float fCos2 = (float) Math.cos(dM748j);
        float f7 = (((0.305f + fM859f) * 23.0f) * fPow) / (((fM860g * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f8 = fCos2 * f7;
        float f9 = f7 * fSin;
        float f10 = fM859f * 460.0f;
        float f11 = (((451.0f * f8) + f10) + (288.0f * f9)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
        float fSignum = Math.signum(f11) * (100.0f / c0169l.m856c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f12) * (100.0f / c0169l.m856c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f13) * (100.0f / c0169l.m856c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float f14 = fSignum / c0169l.m862i()[0];
        float f15 = fSignum2 / c0169l.m862i()[1];
        float f16 = fSignum3 / c0169l.m862i()[2];
        float[][] fArr = AbstractC0159b.f766b;
        float[] fArr2 = fArr[0];
        float f17 = (fArr2[0] * f14) + (fArr2[1] * f15) + (fArr2[2] * f16);
        float[] fArr3 = fArr[1];
        float f18 = (fArr3[0] * f14) + (fArr3[1] * f15) + (fArr3[2] * f16);
        float[] fArr4 = fArr[2];
        return AbstractC0246a.m1173b(f17, f18, (f14 * fArr4[0]) + (f15 * fArr4[1]) + (f16 * fArr4[2]));
    }

    /* JADX INFO: renamed from: p */
    int m752p() {
        return m751o(C0169l.f801k);
    }
}
