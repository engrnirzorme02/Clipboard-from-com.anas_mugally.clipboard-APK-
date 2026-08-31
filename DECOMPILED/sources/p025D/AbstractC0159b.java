package p025D;

import android.graphics.Color;
import p033E.AbstractC0246a;

/* JADX INFO: renamed from: D.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0159b {

    /* JADX INFO: renamed from: a */
    static final float[][] f765a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    static final float[][] f766b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    static final float[] f767c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    static final float[][] f768d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: a */
    static int m753a(float f7) {
        if (f7 < 1.0f) {
            return -16777216;
        }
        if (f7 > 99.0f) {
            return -1;
        }
        float f8 = (f7 + 16.0f) / 116.0f;
        float f9 = f7 > 8.0f ? f8 * f8 * f8 : f7 / 903.2963f;
        float f10 = f8 * f8 * f8;
        boolean z7 = f10 > 0.008856452f;
        float f11 = z7 ? f10 : ((f8 * 116.0f) - 16.0f) / 903.2963f;
        if (!z7) {
            f10 = ((f8 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f767c;
        return AbstractC0246a.m1173b(f11 * fArr[0], f9 * fArr[1], f10 * fArr[2]);
    }

    /* JADX INFO: renamed from: b */
    static float m754b(int i7) {
        return m755c(m759g(i7));
    }

    /* JADX INFO: renamed from: c */
    static float m755c(float f7) {
        float f8 = f7 / 100.0f;
        return f8 <= 0.008856452f ? f8 * 903.2963f : (((float) Math.cbrt(f8)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: renamed from: d */
    static float m756d(float f7, float f8, float f9) {
        return f7 + ((f8 - f7) * f9);
    }

    /* JADX INFO: renamed from: e */
    static float m757e(int i7) {
        float f7 = i7 / 255.0f;
        return (f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: f */
    static void m758f(int i7, float[] fArr) {
        float fM757e = m757e(Color.red(i7));
        float fM757e2 = m757e(Color.green(i7));
        float fM757e3 = m757e(Color.blue(i7));
        float[][] fArr2 = f768d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fM757e) + (fArr3[1] * fM757e2) + (fArr3[2] * fM757e3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fM757e) + (fArr4[1] * fM757e2) + (fArr4[2] * fM757e3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fM757e * fArr5[0]) + (fM757e2 * fArr5[1]) + (fM757e3 * fArr5[2]);
    }

    /* JADX INFO: renamed from: g */
    static float m759g(int i7) {
        float fM757e = m757e(Color.red(i7));
        float fM757e2 = m757e(Color.green(i7));
        float fM757e3 = m757e(Color.blue(i7));
        float[] fArr = f768d[1];
        return (fM757e * fArr[0]) + (fM757e2 * fArr[1]) + (fM757e3 * fArr[2]);
    }

    /* JADX INFO: renamed from: h */
    static float m760h(float f7) {
        return (f7 > 8.0f ? (float) Math.pow((((double) f7) + 16.0d) / 116.0d, 3.0d) : f7 / 903.2963f) * 100.0f;
    }
}
