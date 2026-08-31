package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.drawable.AbstractC4498d;
import p033E.AbstractC0246a;
import p069I3.C0627n;
import p069I3.C0628o;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.c */
/* JADX INFO: loaded from: classes2.dex */
class C4518c extends Drawable {

    /* JADX INFO: renamed from: b */
    private final Paint f17110b;

    /* JADX INFO: renamed from: h */
    float f17116h;

    /* JADX INFO: renamed from: i */
    private int f17117i;

    /* JADX INFO: renamed from: j */
    private int f17118j;

    /* JADX INFO: renamed from: k */
    private int f17119k;

    /* JADX INFO: renamed from: l */
    private int f17120l;

    /* JADX INFO: renamed from: m */
    private int f17121m;

    /* JADX INFO: renamed from: o */
    private C0627n f17123o;

    /* JADX INFO: renamed from: p */
    private ColorStateList f17124p;

    /* JADX INFO: renamed from: a */
    private final C0628o f17109a = C0628o.m2822l();

    /* JADX INFO: renamed from: c */
    private final Path f17111c = new Path();

    /* JADX INFO: renamed from: d */
    private final Rect f17112d = new Rect();

    /* JADX INFO: renamed from: e */
    private final RectF f17113e = new RectF();

    /* JADX INFO: renamed from: f */
    private final RectF f17114f = new RectF();

    /* JADX INFO: renamed from: g */
    private final b f17115g = new b();

    /* JADX INFO: renamed from: n */
    private boolean f17122n = true;

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.c$b */
    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return C4518c.this;
        }
    }

    C4518c(C0627n c0627n) {
        this.f17123o = c0627n;
        Paint paint = new Paint(1);
        this.f17110b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: a */
    private Shader m20526a() {
        Rect rect = this.f17112d;
        copyBounds(rect);
        float fHeight = this.f17116h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{AbstractC0246a.m1178g(this.f17117i, this.f17121m), AbstractC0246a.m1178g(this.f17118j, this.f17121m), AbstractC0246a.m1178g(AbstractC0246a.m1182k(this.f17118j, 0), this.f17121m), AbstractC0246a.m1178g(AbstractC0246a.m1182k(this.f17120l, 0), this.f17121m), AbstractC0246a.m1178g(this.f17120l, this.f17121m), AbstractC0246a.m1178g(this.f17119k, this.f17121m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: b */
    protected RectF m20527b() {
        this.f17114f.set(getBounds());
        return this.f17114f;
    }

    /* JADX INFO: renamed from: c */
    void m20528c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f17121m = colorStateList.getColorForState(getState(), this.f17121m);
        }
        this.f17124p = colorStateList;
        this.f17122n = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    public void m20529d(float f7) {
        if (this.f17116h != f7) {
            this.f17116h = f7;
            this.f17110b.setStrokeWidth(f7 * 1.3333f);
            this.f17122n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f17122n) {
            this.f17110b.setShader(m20526a());
            this.f17122n = false;
        }
        float strokeWidth = this.f17110b.getStrokeWidth() / 2.0f;
        copyBounds(this.f17112d);
        this.f17113e.set(this.f17112d);
        float fMin = Math.min(this.f17123o.m2771r().mo2655a(m20527b()), this.f17113e.width() / 2.0f);
        if (this.f17123o.m2775v(m20527b())) {
            this.f17113e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f17113e, fMin, fMin, this.f17110b);
        }
    }

    /* JADX INFO: renamed from: e */
    void m20530e(int i7, int i8, int i9, int i10) {
        this.f17117i = i7;
        this.f17118j = i8;
        this.f17119k = i9;
        this.f17120l = i10;
    }

    /* JADX INFO: renamed from: f */
    public void m20531f(C0627n c0627n) {
        this.f17123o = c0627n;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f17115g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f17116h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f17123o.m2775v(m20527b())) {
            outline.setRoundRect(getBounds(), this.f17123o.m2771r().mo2655a(m20527b()));
        } else {
            copyBounds(this.f17112d);
            this.f17113e.set(this.f17112d);
            this.f17109a.m2827e(this.f17123o, 1.0f, this.f17113e, this.f17111c);
            AbstractC4498d.m20440l(outline, this.f17111c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f17123o.m2775v(m20527b())) {
            return true;
        }
        int iRound = Math.round(this.f17116h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f17124p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f17122n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f17124p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f17121m)) != this.f17121m) {
            this.f17122n = true;
            this.f17121m = colorForState;
        }
        if (this.f17122n) {
            invalidateSelf();
        }
        return this.f17122n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f17110b.setAlpha(i7);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f17110b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
