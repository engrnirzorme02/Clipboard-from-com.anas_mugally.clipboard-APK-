package p021C3;

/* JADX INFO: renamed from: C3.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0141a {
    /* JADX INFO: renamed from: a */
    public static boolean m609a(float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f7 = fArr[0];
        for (int i7 = 1; i7 < fArr.length; i7++) {
            if (fArr[i7] != f7) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static float m610b(float f7, float f8, float f9, float f10) {
        return (float) Math.hypot(f9 - f7, f10 - f8);
    }

    /* JADX INFO: renamed from: c */
    public static float m611c(float f7, float f8, float f9) {
        return ((1.0f - f9) * f7) + (f9 * f8);
    }
}
