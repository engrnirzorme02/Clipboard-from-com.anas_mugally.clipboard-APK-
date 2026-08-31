package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.AbstractC4543s;
import p069I3.AbstractC0623j;
import p069I3.C0627n;
import p069I3.InterfaceC0630q;
import p093L3.AbstractC0842a;
import p263i.AbstractC5659a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC0630q {

    /* JADX INFO: renamed from: u */
    private final C4442b f16628u;

    /* JADX INFO: renamed from: v */
    private boolean f16629v;

    /* JADX INFO: renamed from: w */
    private boolean f16630w;

    /* JADX INFO: renamed from: x */
    private boolean f16631x;

    /* JADX INFO: renamed from: y */
    private static final int[] f16626y = {R.attr.state_checkable};

    /* JADX INFO: renamed from: z */
    private static final int[] f16627z = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    private static final int[] f16624A = {AbstractC6742c.f26255g0};

    /* JADX INFO: renamed from: B */
    private static final int f16625B = AbstractC6751l.f26556u;

    /* JADX INFO: renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface InterfaceC4440a {
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    private void m19809d() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f16628u.m19858i();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f16628u.m19859j().getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: e */
    public boolean m19810e() {
        C4442b c4442b = this.f16628u;
        return c4442b != null && c4442b.m19832D();
    }

    /* JADX INFO: renamed from: f */
    public boolean m19811f() {
        return this.f16631x;
    }

    /* JADX INFO: renamed from: g */
    void m19812g(int i7, int i8, int i9, int i10) {
        super.m10220b(i7, i8, i9, i10);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f16628u.m19861k();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f16628u.m19862l();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f16628u.m19863m();
    }

    public int getCheckedIconGravity() {
        return this.f16628u.m19864n();
    }

    public int getCheckedIconMargin() {
        return this.f16628u.m19865o();
    }

    public int getCheckedIconSize() {
        return this.f16628u.m19866p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f16628u.m19867q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f16628u.m19830A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f16628u.m19830A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f16628u.m19830A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f16628u.m19830A().top;
    }

    public float getProgress() {
        return this.f16628u.m19869u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f16628u.m19868s();
    }

    public ColorStateList getRippleColor() {
        return this.f16628u.m19870v();
    }

    public C0627n getShapeAppearanceModel() {
        return this.f16628u.m19871w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f16628u.m19872x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f16628u.m19873y();
    }

    public int getStrokeWidth() {
        return this.f16628u.m19874z();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f16630w;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16628u.m19854d0();
        AbstractC0623j.m2751f(this, this.f16628u.m19859j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 3);
        if (m19810e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16626y);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16627z);
        }
        if (m19811f()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16624A);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m19810e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        this.f16628u.m19834H(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f16629v) {
            if (!this.f16628u.m19831C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f16628u.m19835I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i7) {
        this.f16628u.m19836J(ColorStateList.valueOf(i7));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f7) {
        super.setCardElevation(f7);
        this.f16628u.m19856f0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f16628u.m19837K(colorStateList);
    }

    public void setCheckable(boolean z7) {
        this.f16628u.m19838L(z7);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z7) {
        if (this.f16630w != z7) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f16628u.m19841O(drawable);
    }

    public void setCheckedIconGravity(int i7) {
        if (this.f16628u.m19864n() != i7) {
            this.f16628u.m19842P(i7);
        }
    }

    public void setCheckedIconMargin(int i7) {
        this.f16628u.m19843Q(i7);
    }

    public void setCheckedIconMarginResource(int i7) {
        if (i7 != -1) {
            this.f16628u.m19843Q(getResources().getDimensionPixelSize(i7));
        }
    }

    public void setCheckedIconResource(int i7) {
        this.f16628u.m19841O(AbstractC5659a.m25175b(getContext(), i7));
    }

    public void setCheckedIconSize(int i7) {
        this.f16628u.m19844R(i7);
    }

    public void setCheckedIconSizeResource(int i7) {
        if (i7 != 0) {
            this.f16628u.m19844R(getResources().getDimensionPixelSize(i7));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f16628u.m19845S(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z7) {
        super.setClickable(z7);
        C4442b c4442b = this.f16628u;
        if (c4442b != null) {
            c4442b.m19854d0();
        }
    }

    public void setDragged(boolean z7) {
        if (this.f16631x != z7) {
            this.f16631x = z7;
            refreshDrawableState();
            m19809d();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f7) {
        super.setMaxCardElevation(f7);
        this.f16628u.m19857h0();
    }

    public void setOnCheckedChangeListener(InterfaceC4440a interfaceC4440a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z7) {
        super.setPreventCornerOverlap(z7);
        this.f16628u.m19857h0();
        this.f16628u.m19855e0();
    }

    public void setProgress(float f7) {
        this.f16628u.m19847U(f7);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f7) {
        super.setRadius(f7);
        this.f16628u.m19846T(f7);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f16628u.m19848V(colorStateList);
    }

    public void setRippleColorResource(int i7) {
        this.f16628u.m19848V(AbstractC5659a.m25174a(getContext(), i7));
    }

    @Override // p069I3.InterfaceC0630q
    public void setShapeAppearanceModel(C0627n c0627n) {
        setClipToOutline(c0627n.m2775v(getBoundsAsRectF()));
        this.f16628u.m19849W(c0627n);
    }

    public void setStrokeColor(int i7) {
        setStrokeColor(ColorStateList.valueOf(i7));
    }

    public void setStrokeWidth(int i7) {
        this.f16628u.m19851Y(i7);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z7) {
        super.setUseCompatPadding(z7);
        this.f16628u.m19857h0();
        this.f16628u.m19855e0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m19810e() && isEnabled()) {
            this.f16630w = !this.f16630w;
            refreshDrawableState();
            m19809d();
            this.f16628u.m19840N(this.f16630w, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26217B);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f16628u.m19836J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f16628u.m19850X(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16625B;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        this.f16630w = false;
        this.f16631x = false;
        this.f16629v = true;
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(getContext(), attributeSet, AbstractC6752m.f26904f4, i7, i8, new int[0]);
        C4442b c4442b = new C4442b(this, attributeSet, i7, i8);
        this.f16628u = c4442b;
        c4442b.m19836J(super.getCardBackgroundColor());
        c4442b.m19852Z(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c4442b.m19833G(typedArrayM20818i);
        typedArrayM20818i.recycle();
    }
}
