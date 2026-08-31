package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.cardview.widget.d */
/* JADX INFO: loaded from: classes.dex */
class C2388d extends Drawable {

    /* JADX INFO: renamed from: a */
    private float f8435a;

    /* JADX INFO: renamed from: c */
    private final RectF f8437c;

    /* JADX INFO: renamed from: d */
    private final Rect f8438d;

    /* JADX INFO: renamed from: e */
    private float f8439e;

    /* JADX INFO: renamed from: h */
    private ColorStateList f8442h;

    /* JADX INFO: renamed from: i */
    private PorterDuffColorFilter f8443i;

    /* JADX INFO: renamed from: j */
    private ColorStateList f8444j;

    /* JADX INFO: renamed from: f */
    private boolean f8440f = false;

    /* JADX INFO: renamed from: g */
    private boolean f8441g = true;

    /* JADX INFO: renamed from: k */
    private PorterDuff.Mode f8445k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    private final Paint f8436b = new Paint(5);

    C2388d(ColorStateList colorStateList, float f7) {
        this.f8435a = f7;
        m10244e(colorStateList);
        this.f8437c = new RectF();
        this.f8438d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    private PorterDuffColorFilter m10243a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: e */
    private void m10244e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f8442h = colorStateList;
        this.f8436b.setColor(colorStateList.getColorForState(getState(), this.f8442h.getDefaultColor()));
    }

    /* JADX INFO: renamed from: i */
    private void m10245i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f8437c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f8438d.set(rect);
        if (this.f8440f) {
            this.f8438d.inset((int) Math.ceil(AbstractC2389e.m10252a(this.f8439e, this.f8435a, this.f8441g)), (int) Math.ceil(AbstractC2389e.m10253b(this.f8439e, this.f8435a, this.f8441g)));
            this.f8437c.set(this.f8438d);
        }
    }

    /* JADX INFO: renamed from: b */
    public ColorStateList m10246b() {
        return this.f8442h;
    }

    /* JADX INFO: renamed from: c */
    float m10247c() {
        return this.f8439e;
    }

    /* JADX INFO: renamed from: d */
    public float m10248d() {
        return this.f8435a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z7;
        Paint paint = this.f8436b;
        if (this.f8443i == null || paint.getColorFilter() != null) {
            z7 = false;
        } else {
            paint.setColorFilter(this.f8443i);
            z7 = true;
        }
        RectF rectF = this.f8437c;
        float f7 = this.f8435a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (z7) {
            paint.setColorFilter(null);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m10249f(ColorStateList colorStateList) {
        m10244e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    void m10250g(float f7, boolean z7, boolean z8) {
        if (f7 == this.f8439e && this.f8440f == z7 && this.f8441g == z8) {
            return;
        }
        this.f8439e = f7;
        this.f8440f = z7;
        this.f8441g = z8;
        m10245i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f8438d, this.f8435a);
    }

    /* JADX INFO: renamed from: h */
    void m10251h(float f7) {
        if (f7 == this.f8435a) {
            return;
        }
        this.f8435a = f7;
        m10245i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f8444j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f8442h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m10245i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f8442h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z7 = colorForState != this.f8436b.getColor();
        if (z7) {
            this.f8436b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f8444j;
        if (colorStateList2 == null || (mode = this.f8445k) == null) {
            return z7;
        }
        this.f8443i = m10243a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f8436b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8436b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f8444j = colorStateList;
        this.f8443i = m10243a(colorStateList, this.f8445k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f8445k = mode;
        this.f8443i = m10243a(this.f8444j, mode);
        invalidateSelf();
    }
}
