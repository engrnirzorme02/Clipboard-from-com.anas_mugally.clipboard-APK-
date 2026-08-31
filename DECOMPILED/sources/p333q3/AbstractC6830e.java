package p333q3;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: renamed from: q3.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6830e implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    private final float[] f27411a = new float[9];

    /* JADX INFO: renamed from: b */
    private final float[] f27412b = new float[9];

    /* JADX INFO: renamed from: c */
    private final Matrix f27413c = new Matrix();

    /* JADX INFO: renamed from: a */
    public Matrix mo20586a(float f7, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f27411a);
        matrix2.getValues(this.f27412b);
        for (int i7 = 0; i7 < 9; i7++) {
            float[] fArr = this.f27412b;
            float f8 = fArr[i7];
            float f9 = this.f27411a[i7];
            fArr[i7] = f9 + ((f8 - f9) * f7);
        }
        this.f27413c.setValues(this.f27412b);
        return this.f27413c;
    }
}
