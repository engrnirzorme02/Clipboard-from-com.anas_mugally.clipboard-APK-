package p061H3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p033E.AbstractC0246a;

/* JADX INFO: renamed from: H3.a */
/* JADX INFO: loaded from: classes2.dex */
public class C0499a {

    /* JADX INFO: renamed from: i */
    private static final int[] f1878i = new int[3];

    /* JADX INFO: renamed from: j */
    private static final float[] f1879j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    private static final int[] f1880k = new int[4];

    /* JADX INFO: renamed from: l */
    private static final float[] f1881l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    private final Paint f1882a;

    /* JADX INFO: renamed from: b */
    private final Paint f1883b;

    /* JADX INFO: renamed from: c */
    private final Paint f1884c;

    /* JADX INFO: renamed from: d */
    private int f1885d;

    /* JADX INFO: renamed from: e */
    private int f1886e;

    /* JADX INFO: renamed from: f */
    private int f1887f;

    /* JADX INFO: renamed from: g */
    private final Path f1888g;

    /* JADX INFO: renamed from: h */
    private final Paint f1889h;

    public C0499a() {
        this(-16777216);
    }

    /* JADX INFO: renamed from: a */
    public void m2110a(Canvas canvas, Matrix matrix, RectF rectF, int i7, float f7, float f8) {
        float f9;
        boolean z7 = f8 < 0.0f;
        Path path = this.f1888g;
        if (z7) {
            int[] iArr = f1880k;
            iArr[0] = 0;
            iArr[1] = this.f1887f;
            iArr[2] = this.f1886e;
            iArr[3] = this.f1885d;
            f9 = f7;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f9 = f7;
            path.arcTo(rectF, f9, f8);
            path.close();
            float f10 = -i7;
            rectF.inset(f10, f10);
            int[] iArr2 = f1880k;
            iArr2[0] = 0;
            iArr2[1] = this.f1885d;
            iArr2[2] = this.f1886e;
            iArr2[3] = this.f1887f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f11 = 1.0f - (i7 / fWidth);
        float[] fArr = f1881l;
        fArr[1] = f11;
        fArr[2] = ((1.0f - f11) / 2.0f) + f11;
        this.f1883b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f1880k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z7) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f1889h);
        }
        canvas.drawArc(rectF, f9, f8, true, this.f1883b);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public void m2111b(Canvas canvas, Matrix matrix, RectF rectF, int i7) {
        rectF.bottom += i7;
        rectF.offset(0.0f, -i7);
        int[] iArr = f1878i;
        iArr[0] = this.f1887f;
        iArr[1] = this.f1886e;
        iArr[2] = this.f1885d;
        Paint paint = this.f1884c;
        float f7 = rectF.left;
        paint.setShader(new LinearGradient(f7, rectF.top, f7, rectF.bottom, iArr, f1879j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f1884c);
        canvas.restore();
    }

    /* JADX INFO: renamed from: c */
    public Paint m2112c() {
        return this.f1882a;
    }

    /* JADX INFO: renamed from: d */
    public void m2113d(int i7) {
        this.f1885d = AbstractC0246a.m1182k(i7, 68);
        this.f1886e = AbstractC0246a.m1182k(i7, 20);
        this.f1887f = AbstractC0246a.m1182k(i7, 0);
        this.f1882a.setColor(this.f1885d);
    }

    public C0499a(int i7) {
        this.f1888g = new Path();
        Paint paint = new Paint();
        this.f1889h = paint;
        this.f1882a = new Paint();
        m2113d(i7);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f1883b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f1884c = new Paint(paint2);
    }
}
