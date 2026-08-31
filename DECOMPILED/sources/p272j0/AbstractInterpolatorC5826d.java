package p272j0;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: j0.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractInterpolatorC5826d implements Interpolator {

    /* JADX INFO: renamed from: a */
    private final float[] f22956a;

    /* JADX INFO: renamed from: b */
    private final float f22957b;

    protected AbstractInterpolatorC5826d(float[] fArr) {
        this.f22956a = fArr;
        this.f22957b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f7) {
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f22956a;
        int iMin = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
        float f8 = this.f22957b;
        float f9 = (f7 - (iMin * f8)) / f8;
        float[] fArr2 = this.f22956a;
        float f10 = fArr2[iMin];
        return f10 + (f9 * (fArr2[iMin + 1] - f10));
    }
}
