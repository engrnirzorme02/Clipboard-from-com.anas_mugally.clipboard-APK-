package p033E;

import android.graphics.Color;

/* JADX INFO: renamed from: E.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0246a {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f982a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m1172a(int i7, int i8, int i9, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d7 = ((double) i7) / 255.0d;
        double dPow = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        double d8 = ((double) i8) / 255.0d;
        double dPow2 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        double d9 = ((double) i9) / 255.0d;
        double dPow3 = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    /* JADX INFO: renamed from: b */
    public static int m1173b(double d7, double d8, double d9) {
        double d10 = (((3.2406d * d7) + ((-1.5372d) * d8)) + ((-0.4986d) * d9)) / 100.0d;
        double d11 = ((((-0.9689d) * d7) + (1.8758d * d8)) + (0.0415d * d9)) / 100.0d;
        double d12 = (((0.0557d * d7) + ((-0.204d) * d8)) + (1.057d * d9)) / 100.0d;
        return Color.rgb(m1180i((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d), 0, 255), m1180i((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d), 0, 255), m1180i((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d), 0, 255));
    }

    /* JADX INFO: renamed from: c */
    public static int m1174c(int i7, int i8, float f7) {
        float f8 = 1.0f - f7;
        return Color.argb((int) ((Color.alpha(i7) * f8) + (Color.alpha(i8) * f7)), (int) ((Color.red(i7) * f8) + (Color.red(i8) * f7)), (int) ((Color.green(i7) * f8) + (Color.green(i8) * f7)), (int) ((Color.blue(i7) * f8) + (Color.blue(i8) * f7)));
    }

    /* JADX INFO: renamed from: d */
    public static double m1175d(int i7) {
        double[] dArrM1181j = m1181j();
        m1176e(i7, dArrM1181j);
        return dArrM1181j[1] / 100.0d;
    }

    /* JADX INFO: renamed from: e */
    public static void m1176e(int i7, double[] dArr) {
        m1172a(Color.red(i7), Color.green(i7), Color.blue(i7), dArr);
    }

    /* JADX INFO: renamed from: f */
    private static int m1177f(int i7, int i8) {
        return 255 - (((255 - i8) * (255 - i7)) / 255);
    }

    /* JADX INFO: renamed from: g */
    public static int m1178g(int i7, int i8) {
        int iAlpha = Color.alpha(i8);
        int iAlpha2 = Color.alpha(i7);
        int iM1177f = m1177f(iAlpha2, iAlpha);
        return Color.argb(iM1177f, m1179h(Color.red(i7), iAlpha2, Color.red(i8), iAlpha, iM1177f), m1179h(Color.green(i7), iAlpha2, Color.green(i8), iAlpha, iM1177f), m1179h(Color.blue(i7), iAlpha2, Color.blue(i8), iAlpha, iM1177f));
    }

    /* JADX INFO: renamed from: h */
    private static int m1179h(int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (((i7 * 255) * i8) + ((i9 * i10) * (255 - i8))) / (i11 * 255);
    }

    /* JADX INFO: renamed from: i */
    private static int m1180i(int i7, int i8, int i9) {
        return i7 < i8 ? i8 : Math.min(i7, i9);
    }

    /* JADX INFO: renamed from: j */
    private static double[] m1181j() {
        ThreadLocal threadLocal = f982a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    /* JADX INFO: renamed from: k */
    public static int m1182k(int i7, int i8) {
        if (i8 < 0 || i8 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i7 & 16777215) | (i8 << 24);
    }
}
