package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.AbstractC2319Q;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: com.google.android.material.internal.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4531g extends AbstractC2319Q {

    /* JADX INFO: renamed from: A */
    private Drawable f17296A;

    /* JADX INFO: renamed from: B */
    private final Rect f17297B;

    /* JADX INFO: renamed from: C */
    private final Rect f17298C;

    /* JADX INFO: renamed from: D */
    private int f17299D;

    /* JADX INFO: renamed from: E */
    protected boolean f17300E;

    /* JADX INFO: renamed from: F */
    boolean f17301F;

    public AbstractC4531g(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17297B = new Rect();
        this.f17298C = new Rect();
        this.f17299D = 119;
        this.f17300E = true;
        this.f17301F = false;
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context, attributeSet, AbstractC6752m.f27122z2, i7, 0, new int[0]);
        this.f17299D = typedArrayM20818i.getInt(AbstractC6752m.f26576B2, this.f17299D);
        Drawable drawable = typedArrayM20818i.getDrawable(AbstractC6752m.f26565A2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f17300E = typedArrayM20818i.getBoolean(AbstractC6752m.f26587C2, true);
        typedArrayM20818i.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f17296A;
        if (drawable != null) {
            if (this.f17301F) {
                this.f17301F = false;
                Rect rect = this.f17297B;
                Rect rect2 = this.f17298C;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f17300E) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f17299D, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f7, float f8) {
        super.drawableHotspotChanged(f7, f8);
        Drawable drawable = this.f17296A;
        if (drawable != null) {
            drawable.setHotspot(f7, f8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17296A;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f17296A.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f17296A;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f17299D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17296A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC2319Q, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        this.f17301F = z7 | this.f17301F;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f17301F = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f17296A;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f17296A);
            }
            this.f17296A = drawable;
            this.f17301F = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f17299D == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i7) {
        if (this.f17299D != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f17299D = i7;
            if (i7 == 119 && this.f17296A != null) {
                this.f17296A.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17296A;
    }
}
