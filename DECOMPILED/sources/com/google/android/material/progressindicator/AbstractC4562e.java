package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: com.google.android.material.progressindicator.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4562e {

    /* JADX INFO: renamed from: a */
    AbstractC4559b f17500a;

    /* JADX INFO: renamed from: b */
    final Path f17501b;

    /* JADX INFO: renamed from: c */
    final Path f17502c;

    /* JADX INFO: renamed from: d */
    final PathMeasure f17503d;

    /* JADX INFO: renamed from: e */
    final Matrix f17504e;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: com.google.android.material.progressindicator.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        float f17505a;

        /* JADX INFO: renamed from: b */
        float f17506b;

        /* JADX INFO: renamed from: c */
        int f17507c;

        /* JADX INFO: renamed from: d */
        int f17508d;

        /* JADX INFO: renamed from: e */
        float f17509e = 1.0f;

        /* JADX INFO: renamed from: f */
        float f17510f;

        /* JADX INFO: renamed from: g */
        float f17511g;

        /* JADX INFO: renamed from: h */
        boolean f17512h;

        protected a() {
        }
    }

    public AbstractC4562e(AbstractC4559b abstractC4559b) {
        Path path = new Path();
        this.f17501b = path;
        this.f17502c = new Path();
        this.f17503d = new PathMeasure(path, false);
        this.f17500a = abstractC4559b;
        this.f17504e = new Matrix();
    }

    /* JADX INFO: renamed from: a */
    abstract void mo20943a(Canvas canvas, Rect rect, float f7, boolean z7, boolean z8);

    /* JADX INFO: renamed from: b */
    abstract void mo20944b(Canvas canvas, Paint paint, int i7, int i8);

    /* JADX INFO: renamed from: c */
    abstract void mo20945c(Canvas canvas, Paint paint, a aVar, int i7);

    /* JADX INFO: renamed from: d */
    abstract void mo20946d(Canvas canvas, Paint paint, float f7, float f8, int i7, int i8, int i9);

    /* JADX INFO: renamed from: e */
    abstract int mo20947e();

    /* JADX INFO: renamed from: f */
    abstract int mo20948f();

    /* JADX INFO: renamed from: g */
    abstract void mo20949g();

    /* JADX INFO: renamed from: h */
    void m20950h(Canvas canvas, Rect rect, float f7, boolean z7, boolean z8) {
        this.f17500a.mo20901h();
        mo20943a(canvas, rect, f7, z7, z8);
    }

    /* JADX INFO: renamed from: i */
    float m20951i(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.e$b */
    protected class b {

        /* JADX INFO: renamed from: a */
        float[] f17513a;

        /* JADX INFO: renamed from: b */
        float[] f17514b;

        /* JADX INFO: renamed from: c */
        final Matrix f17515c;

        public b() {
            this.f17513a = new float[2];
            this.f17514b = new float[]{1.0f, 0.0f};
            this.f17515c = new Matrix();
        }

        /* JADX INFO: renamed from: a */
        public void m20952a() {
            Arrays.fill(this.f17513a, 0.0f);
            Arrays.fill(this.f17514b, 0.0f);
            this.f17514b[0] = 1.0f;
            this.f17515c.reset();
        }

        /* JADX INFO: renamed from: b */
        void m20953b(float f7, float f8) {
            float[] fArr = this.f17513a;
            fArr[0] = fArr[0] * f7;
            fArr[1] = fArr[1] * f8;
            float[] fArr2 = this.f17514b;
            fArr2[0] = fArr2[0] * f7;
            fArr2[1] = fArr2[1] * f8;
        }

        /* JADX INFO: renamed from: c */
        void m20954c(float f7, float f8) {
            float[] fArr = this.f17513a;
            fArr[0] = fArr[0] + f7;
            fArr[1] = fArr[1] + f8;
        }

        public b(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.f17513a = fArr3;
            this.f17514b = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.f17514b, 0, 2);
            this.f17515c = new Matrix();
        }
    }
}
