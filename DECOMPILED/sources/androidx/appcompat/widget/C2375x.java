package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p041F.AbstractC0400a;
import p111O.AbstractC1030Z;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.widget.x */
/* JADX INFO: loaded from: classes.dex */
class C2375x extends C2370s {

    /* JADX INFO: renamed from: d */
    private final SeekBar f8320d;

    /* JADX INFO: renamed from: e */
    private Drawable f8321e;

    /* JADX INFO: renamed from: f */
    private ColorStateList f8322f;

    /* JADX INFO: renamed from: g */
    private PorterDuff.Mode f8323g;

    /* JADX INFO: renamed from: h */
    private boolean f8324h;

    /* JADX INFO: renamed from: i */
    private boolean f8325i;

    C2375x(SeekBar seekBar) {
        super(seekBar);
        this.f8322f = null;
        this.f8323g = null;
        this.f8324h = false;
        this.f8325i = false;
        this.f8320d = seekBar;
    }

    /* JADX INFO: renamed from: f */
    private void m10153f() {
        Drawable drawable = this.f8321e;
        if (drawable != null) {
            if (this.f8324h || this.f8325i) {
                Drawable drawableM1712r = AbstractC0400a.m1712r(drawable.mutate());
                this.f8321e = drawableM1712r;
                if (this.f8324h) {
                    AbstractC0400a.m1709o(drawableM1712r, this.f8322f);
                }
                if (this.f8325i) {
                    AbstractC0400a.m1710p(this.f8321e, this.f8323g);
                }
                if (this.f8321e.isStateful()) {
                    this.f8321e.setState(this.f8320d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C2370s
    /* JADX INFO: renamed from: c */
    void mo10145c(AttributeSet attributeSet, int i7) {
        super.mo10145c(attributeSet, i7);
        Context context = this.f8320d.getContext();
        int[] iArr = AbstractC5529j.f21197T;
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, iArr, i7, 0);
        SeekBar seekBar = this.f8320d;
        AbstractC1030Z.m4470h0(seekBar, seekBar.getContext(), iArr, attributeSet, c2348d0M10025v.m10043r(), i7, 0);
        Drawable drawableM10033h = c2348d0M10025v.m10033h(AbstractC5529j.f21201U);
        if (drawableM10033h != null) {
            this.f8320d.setThumb(drawableM10033h);
        }
        m10157j(c2348d0M10025v.m10032g(AbstractC5529j.f21205V));
        int i8 = AbstractC5529j.f21213X;
        if (c2348d0M10025v.m10044s(i8)) {
            this.f8323g = AbstractC2315M.m9771e(c2348d0M10025v.m10036k(i8, -1), this.f8323g);
            this.f8325i = true;
        }
        int i9 = AbstractC5529j.f21209W;
        if (c2348d0M10025v.m10044s(i9)) {
            this.f8322f = c2348d0M10025v.m10028c(i9);
            this.f8324h = true;
        }
        c2348d0M10025v.m10046x();
        m10153f();
    }

    /* JADX INFO: renamed from: g */
    void m10154g(Canvas canvas) {
        if (this.f8321e != null) {
            int max = this.f8320d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f8321e.getIntrinsicWidth();
                int intrinsicHeight = this.f8321e.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i8 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f8321e.setBounds(-i7, -i8, i7, i8);
                float width = ((this.f8320d.getWidth() - this.f8320d.getPaddingLeft()) - this.f8320d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f8320d.getPaddingLeft(), this.f8320d.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f8321e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    void m10155h() {
        Drawable drawable = this.f8321e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f8320d.getDrawableState())) {
            this.f8320d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: i */
    void m10156i() {
        Drawable drawable = this.f8321e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: j */
    void m10157j(Drawable drawable) {
        Drawable drawable2 = this.f8321e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8321e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f8320d);
            AbstractC0400a.m1707m(drawable, this.f8320d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f8320d.getDrawableState());
            }
            m10153f();
        }
        this.f8320d.invalidate();
    }
}
