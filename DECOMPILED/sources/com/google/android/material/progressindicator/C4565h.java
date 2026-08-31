package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import p021C3.AbstractC0141a;
import p065I.AbstractC0577a;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.h */
/* JADX INFO: loaded from: classes2.dex */
final class C4565h extends AbstractC4562e {

    /* JADX INFO: renamed from: f */
    private float f17522f;

    /* JADX INFO: renamed from: g */
    private float f17523g;

    /* JADX INFO: renamed from: h */
    private float f17524h;

    /* JADX INFO: renamed from: i */
    private float f17525i;

    /* JADX INFO: renamed from: j */
    private float f17526j;

    /* JADX INFO: renamed from: k */
    private float f17527k;

    /* JADX INFO: renamed from: l */
    private int f17528l;

    /* JADX INFO: renamed from: m */
    private boolean f17529m;

    /* JADX INFO: renamed from: n */
    private float f17530n;

    /* JADX INFO: renamed from: o */
    Pair f17531o;

    C4565h(C4568k c4568k) {
        super(c4568k);
        this.f17522f = 300.0f;
        this.f17531o = new Pair(new AbstractC4562e.b(), new AbstractC4562e.b());
    }

    /* JADX INFO: renamed from: j */
    private void m20969j(PathMeasure pathMeasure, Path path, Pair pair, float f7, float f8, float f9, float f10) {
        int i7 = this.f17529m ? ((C4568k) this.f17500a).f17464j : ((C4568k) this.f17500a).f17465k;
        if (pathMeasure == this.f17503d && i7 != this.f17528l) {
            this.f17528l = i7;
            mo20949g();
        }
        path.rewind();
        float f11 = (-this.f17522f) / 2.0f;
        boolean zM20897b = ((C4568k) this.f17500a).m20897b(this.f17529m);
        if (zM20897b) {
            float f12 = this.f17522f;
            float f13 = this.f17527k;
            float f14 = f12 / f13;
            float f15 = f10 / f14;
            float f16 = f14 / (f14 + 1.0f);
            f7 = (f7 + f15) * f16;
            f8 = (f8 + f15) * f16;
            f11 -= f10 * f13;
        }
        float length = f7 * pathMeasure.getLength();
        float length2 = f8 * pathMeasure.getLength();
        pathMeasure.getSegment(length, length2, path, true);
        AbstractC4562e.b bVar = (AbstractC4562e.b) pair.first;
        bVar.m20952a();
        pathMeasure.getPosTan(length, bVar.f17513a, bVar.f17514b);
        AbstractC4562e.b bVar2 = (AbstractC4562e.b) pair.second;
        bVar2.m20952a();
        pathMeasure.getPosTan(length2, bVar2.f17513a, bVar2.f17514b);
        this.f17504e.reset();
        this.f17504e.setTranslate(f11, 0.0f);
        bVar.m20954c(f11, 0.0f);
        bVar2.m20954c(f11, 0.0f);
        if (zM20897b) {
            float f17 = this.f17526j * f9;
            this.f17504e.postScale(1.0f, f17);
            bVar.m20953b(1.0f, f17);
            bVar2.m20953b(1.0f, f17);
        }
        path.transform(this.f17504e);
    }

    /* JADX INFO: renamed from: k */
    private void m20970k(Canvas canvas, Paint paint, float f7, float f8, int i7, int i8, int i9, float f9, float f10, boolean z7) {
        float f11;
        float fM611c;
        Paint paint2;
        Canvas canvas2;
        float fM2540a = AbstractC0577a.m2540a(f7, 0.0f, 1.0f);
        float fM2540a2 = AbstractC0577a.m2540a(f8, 0.0f, 1.0f);
        float fM611c2 = AbstractC0141a.m611c(1.0f - this.f17530n, 1.0f, fM2540a);
        float fM611c3 = AbstractC0141a.m611c(1.0f - this.f17530n, 1.0f, fM2540a2);
        int iM2540a = (int) ((i8 * AbstractC0577a.m2540a(fM611c2, 0.0f, 0.01f)) / 0.01f);
        int iM2540a2 = (int) ((i9 * (1.0f - AbstractC0577a.m2540a(fM611c3, 0.99f, 1.0f))) / 0.01f);
        float f12 = this.f17522f;
        int i10 = (int) ((fM611c2 * f12) + iM2540a);
        int i11 = (int) ((fM611c3 * f12) - iM2540a2);
        float f13 = this.f17524h;
        float f14 = this.f17525i;
        if (f13 != f14) {
            float fMax = Math.max(f13, f14);
            float f15 = this.f17522f;
            float f16 = fMax / f15;
            float fM611c4 = AbstractC0141a.m611c(this.f17524h, this.f17525i, AbstractC0577a.m2540a(i10 / f15, 0.0f, f16) / f16);
            float f17 = this.f17524h;
            float f18 = this.f17525i;
            float f19 = this.f17522f;
            fM611c = AbstractC0141a.m611c(f17, f18, AbstractC0577a.m2540a((f19 - i11) / f19, 0.0f, f16) / f16);
            f11 = fM611c4;
        } else {
            f11 = f13;
            fM611c = f11;
        }
        float f20 = (-this.f17522f) / 2.0f;
        boolean z8 = ((C4568k) this.f17500a).m20897b(this.f17529m) && z7 && f9 > 0.0f;
        if (i10 <= i11) {
            float f21 = i10 + f11;
            float f22 = i11 - fM611c;
            float f23 = f11 * 2.0f;
            float f24 = 2.0f * fM611c;
            paint.setColor(i7);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f17523g);
            ((AbstractC4562e.b) this.f17531o.first).m20952a();
            ((AbstractC4562e.b) this.f17531o.second).m20952a();
            ((AbstractC4562e.b) this.f17531o.first).m20954c(f21 + f20, 0.0f);
            ((AbstractC4562e.b) this.f17531o.second).m20954c(f20 + f22, 0.0f);
            if (i10 == 0 && f22 + fM611c < f21 + f11) {
                Pair pair = this.f17531o;
                AbstractC4562e.b bVar = (AbstractC4562e.b) pair.first;
                float f25 = this.f17523g;
                m20972m(canvas, paint, bVar, f23, f25, f11, (AbstractC4562e.b) pair.second, f24, f25, fM611c, true);
                return;
            }
            if (f21 - f11 > f22 - fM611c) {
                Pair pair2 = this.f17531o;
                AbstractC4562e.b bVar2 = (AbstractC4562e.b) pair2.second;
                float f26 = this.f17523g;
                m20972m(canvas, paint, bVar2, f24, f26, fM611c, (AbstractC4562e.b) pair2.first, f23, f26, f11, false);
                return;
            }
            float f27 = fM611c;
            float f28 = f11;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(((C4568k) this.f17500a).mo20900g() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z8) {
                paint2 = paint;
                PathMeasure pathMeasure = this.f17503d;
                Path path = this.f17502c;
                Pair pair3 = this.f17531o;
                float f29 = this.f17522f;
                m20969j(pathMeasure, path, pair3, f21 / f29, f22 / f29, f9, f10);
                canvas2 = canvas;
                canvas2.drawPath(this.f17502c, paint2);
            } else {
                Pair pair4 = this.f17531o;
                Object obj = pair4.first;
                float f30 = ((AbstractC4562e.b) obj).f17513a[0];
                float f31 = ((AbstractC4562e.b) obj).f17513a[1];
                Object obj2 = pair4.second;
                canvas.drawLine(f30, f31, ((AbstractC4562e.b) obj2).f17513a[0], ((AbstractC4562e.b) obj2).f17513a[1], paint);
                paint2 = paint;
                canvas2 = canvas;
            }
            if (((C4568k) this.f17500a).mo20900g()) {
                return;
            }
            if (f21 > 0.0f && f28 > 0.0f) {
                m20971l(canvas2, paint2, (AbstractC4562e.b) this.f17531o.first, f23, this.f17523g, f28);
            }
            if (f22 >= this.f17522f || f27 <= 0.0f) {
                return;
            }
            m20971l(canvas, paint, (AbstractC4562e.b) this.f17531o.second, f24, this.f17523g, f27);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m20971l(Canvas canvas, Paint paint, AbstractC4562e.b bVar, float f7, float f8, float f9) {
        m20972m(canvas, paint, bVar, f7, f8, f9, null, 0.0f, 0.0f, 0.0f, false);
    }

    /* JADX INFO: renamed from: m */
    private void m20972m(Canvas canvas, Paint paint, AbstractC4562e.b bVar, float f7, float f8, float f9, AbstractC4562e.b bVar2, float f10, float f11, float f12, boolean z7) {
        char c7;
        float f13;
        float f14;
        float fMin = Math.min(f8, this.f17523g);
        float f15 = (-f7) / 2.0f;
        float f16 = (-fMin) / 2.0f;
        float f17 = f7 / 2.0f;
        float f18 = fMin / 2.0f;
        RectF rectF = new RectF(f15, f16, f17, f18);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (bVar2 != null) {
            float fMin2 = Math.min(f11, this.f17523g);
            float fMin3 = Math.min(f10 / 2.0f, (f12 * fMin2) / this.f17523g);
            RectF rectF2 = new RectF();
            if (z7) {
                c7 = 0;
                float f19 = (bVar2.f17513a[0] - fMin3) - (bVar.f17513a[0] - f9);
                if (f19 > 0.0f) {
                    bVar2.m20954c((-f19) / 2.0f, 0.0f);
                    f14 = f10 + f19;
                } else {
                    f14 = f10;
                }
                rectF2.set(0.0f, f16, f17, f18);
            } else {
                c7 = 0;
                float f20 = (bVar2.f17513a[0] + fMin3) - (bVar.f17513a[0] + f9);
                if (f20 < 0.0f) {
                    bVar2.m20954c((-f20) / 2.0f, 0.0f);
                    f13 = f10 - f20;
                } else {
                    f13 = f10;
                }
                rectF2.set(f15, f16, 0.0f, f18);
                f14 = f13;
            }
            RectF rectF3 = new RectF((-f14) / 2.0f, (-fMin2) / 2.0f, f14 / 2.0f, fMin2 / 2.0f);
            float[] fArr = bVar2.f17513a;
            canvas.translate(fArr[c7], fArr[1]);
            canvas.rotate(m20951i(bVar2.f17514b));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-m20951i(bVar2.f17514b));
            float[] fArr2 = bVar2.f17513a;
            canvas.translate(-fArr2[c7], -fArr2[1]);
            float[] fArr3 = bVar.f17513a;
            canvas.translate(fArr3[c7], fArr3[1]);
            canvas.rotate(m20951i(bVar.f17514b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f9, f9, paint);
        } else {
            float[] fArr4 = bVar.f17513a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(m20951i(bVar.f17514b));
            canvas.drawRoundRect(rectF, f9, f9, paint);
        }
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4562e
    /* JADX INFO: renamed from: a */
    void mo20943a(Canvas canvas, Rect rect, float f7, boolean z7, boolean z8) {
        if (this.f17522f != rect.width()) {
            this.f17522f = rect.width();
            mo20949g();
        }
        float fMo20947e = mo20947e();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - fMo20947e) / 2.0f));
        if (((C4568k) this.f17500a).f17555q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f8 = this.f17522f / 2.0f;
        float f9 = fMo20947e / 2.0f;
        canvas.clipRect(-f8, -f9, f8, f9);
        AbstractC4559b abstractC4559b = this.f17500a;
        this.f17523g = ((C4568k) abstractC4559b).f17455a * f7;
        this.f17524h = Math.min(((C4568k) abstractC4559b).f17455a / 2, ((C4568k) abstractC4559b).m20896a()) * f7;
        AbstractC4559b abstractC4559b2 = this.f17500a;
        this.f17526j = ((C4568k) abstractC4559b2).f17466l * f7;
        this.f17525i = Math.min(((C4568k) abstractC4559b2).f17455a / 2.0f, ((C4568k) abstractC4559b2).m21001i()) * f7;
        if (z7 || z8) {
            if ((z7 && ((C4568k) this.f17500a).f17461g == 2) || (z8 && ((C4568k) this.f17500a).f17462h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z7 || (z8 && ((C4568k) this.f17500a).f17462h != 3)) {
                canvas.translate(0.0f, (((C4568k) this.f17500a).f17455a * (1.0f - f7)) / 2.0f);
            }
        }
        if (z8 && ((C4568k) this.f17500a).f17462h == 3) {
            this.f17530n = f7;
        } else {
            this.f17530n = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4562e
    /* JADX INFO: renamed from: b */
    void mo20944b(Canvas canvas, Paint paint, int i7, int i8) {
        int iM33170a = AbstractC7539a.m33170a(i7, i8);
        this.f17529m = false;
        if (((C4568k) this.f17500a).f17556r <= 0 || iM33170a == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iM33170a);
        AbstractC4559b abstractC4559b = this.f17500a;
        AbstractC4562e.b bVar = new AbstractC4562e.b(new float[]{(this.f17522f / 2.0f) - (((C4568k) abstractC4559b).f17557s != null ? ((C4568k) abstractC4559b).f17557s.floatValue() + (((C4568k) this.f17500a).f17556r / 2.0f) : this.f17523g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        AbstractC4559b abstractC4559b2 = this.f17500a;
        m20971l(canvas, paint, bVar, ((C4568k) abstractC4559b2).f17556r, ((C4568k) abstractC4559b2).f17556r, (this.f17524h * ((C4568k) abstractC4559b2).f17556r) / this.f17523g);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4562e
    /* JADX INFO: renamed from: c */
    void mo20945c(Canvas canvas, Paint paint, AbstractC4562e.a aVar, int i7) {
        int iM33170a = AbstractC7539a.m33170a(aVar.f17507c, i7);
        this.f17529m = aVar.f17512h;
        float f7 = aVar.f17505a;
        float f8 = aVar.f17506b;
        int i8 = aVar.f17508d;
        m20970k(canvas, paint, f7, f8, iM33170a, i8, i8, aVar.f17509e, aVar.f17510f, true);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4562e
    /* JADX INFO: renamed from: d */
    void mo20946d(Canvas canvas, Paint paint, float f7, float f8, int i7, int i8, int i9) {
        int iM33170a = AbstractC7539a.m33170a(i7, i8);
        this.f17529m = false;
        m20970k(canvas, paint, f7, f8, iM33170a, i9, i9, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4562e
    /* JADX INFO: renamed from: e */
    int mo20947e() {
        AbstractC4559b abstractC4559b = this.f17500a;
        return ((C4568k) abstractC4559b).f17455a + (((C4568k) abstractC4559b).f17466l * 2);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4562e
    /* JADX INFO: renamed from: f */
    int mo20948f() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4562e
    /* JADX INFO: renamed from: g */
    void mo20949g() {
        this.f17501b.rewind();
        if (((C4568k) this.f17500a).m20897b(this.f17529m)) {
            int i7 = this.f17529m ? ((C4568k) this.f17500a).f17464j : ((C4568k) this.f17500a).f17465k;
            float f7 = this.f17522f;
            int i8 = (int) (f7 / i7);
            this.f17527k = f7 / i8;
            for (int i9 = 0; i9 <= i8; i9++) {
                int i10 = i9 * 2;
                float f8 = i10 + 1;
                this.f17501b.cubicTo(i10 + 0.48f, 0.0f, f8 - 0.48f, 1.0f, f8, 1.0f);
                float f9 = i10 + 2;
                this.f17501b.cubicTo(f8 + 0.48f, 1.0f, f9 - 0.48f, 0.0f, f9, 0.0f);
            }
            this.f17504e.reset();
            this.f17504e.setScale(this.f17527k / 2.0f, -2.0f);
            this.f17504e.postTranslate(0.0f, 1.0f);
            this.f17501b.transform(this.f17504e);
        } else {
            this.f17501b.lineTo(this.f17522f, 0.0f);
        }
        this.f17503d.setPath(this.f17501b, false);
    }
}
