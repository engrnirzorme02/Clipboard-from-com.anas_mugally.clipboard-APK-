package p333q3;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: renamed from: q3.d */
/* JADX INFO: loaded from: classes2.dex */
public class C6829d extends Property {

    /* JADX INFO: renamed from: a */
    private final Matrix f27410a;

    public C6829d() {
        super(Matrix.class, "imageMatrixProperty");
        this.f27410a = new Matrix();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f27410a.set(imageView.getImageMatrix());
        return this.f27410a;
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
