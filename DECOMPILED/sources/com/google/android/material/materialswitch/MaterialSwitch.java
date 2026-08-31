package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C2348d0;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.drawable.AbstractC4498d;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4546v;
import p033E.AbstractC0246a;
import p093L3.AbstractC0842a;
import p263i.AbstractC5659a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: v0 */
    private static final int f17388v0 = AbstractC6751l.f26550o;

    /* JADX INFO: renamed from: w0 */
    private static final int[] f17389w0 = {AbstractC6742c.f26265l0};

    /* JADX INFO: renamed from: i0 */
    private Drawable f17390i0;

    /* JADX INFO: renamed from: j0 */
    private Drawable f17391j0;

    /* JADX INFO: renamed from: k0 */
    private int f17392k0;

    /* JADX INFO: renamed from: l0 */
    private Drawable f17393l0;

    /* JADX INFO: renamed from: m0 */
    private Drawable f17394m0;

    /* JADX INFO: renamed from: n0 */
    private ColorStateList f17395n0;

    /* JADX INFO: renamed from: o0 */
    private ColorStateList f17396o0;

    /* JADX INFO: renamed from: p0 */
    private PorterDuff.Mode f17397p0;

    /* JADX INFO: renamed from: q0 */
    private ColorStateList f17398q0;

    /* JADX INFO: renamed from: r0 */
    private ColorStateList f17399r0;

    /* JADX INFO: renamed from: s0 */
    private PorterDuff.Mode f17400s0;

    /* JADX INFO: renamed from: t0 */
    private int[] f17401t0;

    /* JADX INFO: renamed from: u0 */
    private int[] f17402u0;

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26221F);
    }

    /* JADX INFO: renamed from: r */
    private void m20843r() {
        this.f17390i0 = AbstractC4498d.m20431c(this.f17390i0, this.f17395n0, getThumbTintMode());
        this.f17391j0 = AbstractC4498d.m20431c(this.f17391j0, this.f17396o0, this.f17397p0);
        m20846u();
        Drawable drawable = this.f17390i0;
        Drawable drawable2 = this.f17391j0;
        int i7 = this.f17392k0;
        super.setThumbDrawable(AbstractC4498d.m20430b(drawable, drawable2, i7, i7));
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: s */
    private void m20844s() {
        this.f17393l0 = AbstractC4498d.m20431c(this.f17393l0, this.f17398q0, getTrackTintMode());
        this.f17394m0 = AbstractC4498d.m20431c(this.f17394m0, this.f17399r0, this.f17400s0);
        m20846u();
        Drawable layerDrawable = this.f17393l0;
        if (layerDrawable != null && this.f17394m0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f17393l0, this.f17394m0});
        } else if (layerDrawable == null) {
            layerDrawable = this.f17394m0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    /* JADX INFO: renamed from: t */
    private static void m20845t(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f7) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(AbstractC0246a.m1174c(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f7));
    }

    /* JADX INFO: renamed from: u */
    private void m20846u() {
        if (this.f17395n0 == null && this.f17396o0 == null && this.f17398q0 == null && this.f17399r0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f17395n0;
        if (colorStateList != null) {
            m20845t(this.f17390i0, colorStateList, this.f17401t0, this.f17402u0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f17396o0;
        if (colorStateList2 != null) {
            m20845t(this.f17391j0, colorStateList2, this.f17401t0, this.f17402u0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f17398q0;
        if (colorStateList3 != null) {
            m20845t(this.f17393l0, colorStateList3, this.f17401t0, this.f17402u0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f17399r0;
        if (colorStateList4 != null) {
            m20845t(this.f17394m0, colorStateList4, this.f17401t0, this.f17402u0, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.f17390i0;
    }

    public Drawable getThumbIconDrawable() {
        return this.f17391j0;
    }

    public int getThumbIconSize() {
        return this.f17392k0;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f17396o0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f17397p0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f17395n0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f17394m0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f17399r0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f17400s0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.f17393l0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f17398q0;
    }

    @Override // android.view.View
    public void invalidate() {
        m20846u();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (this.f17391j0 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17389w0);
        }
        this.f17401t0 = AbstractC4498d.m20438j(iArrOnCreateDrawableState);
        this.f17402u0 = AbstractC4498d.m20434f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.f17390i0 = drawable;
        m20843r();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f17391j0 = drawable;
        m20843r();
    }

    public void setThumbIconResource(int i7) {
        setThumbIconDrawable(AbstractC5659a.m25175b(getContext(), i7));
    }

    public void setThumbIconSize(int i7) {
        if (this.f17392k0 != i7) {
            this.f17392k0 = i7;
            m20843r();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f17396o0 = colorStateList;
        m20843r();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f17397p0 = mode;
        m20843r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f17395n0 = colorStateList;
        m20843r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m20843r();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f17394m0 = drawable;
        m20844s();
    }

    public void setTrackDecorationResource(int i7) {
        setTrackDecorationDrawable(AbstractC5659a.m25175b(getContext(), i7));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f17399r0 = colorStateList;
        m20844s();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f17400s0 = mode;
        m20844s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f17393l0 = drawable;
        m20844s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f17398q0 = colorStateList;
        m20844s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        m20844s();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17388v0;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        this.f17392k0 = -1;
        Context context2 = getContext();
        this.f17390i0 = super.getThumbDrawable();
        this.f17395n0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f17393l0 = super.getTrackDrawable();
        this.f17398q0 = super.getTrackTintList();
        super.setTrackTintList(null);
        C2348d0 c2348d0M20819j = AbstractC4543s.m20819j(context2, attributeSet, AbstractC6752m.f26743Q4, i7, i8, new int[0]);
        this.f17391j0 = c2348d0M20819j.m10032g(AbstractC6752m.f26754R4);
        this.f17392k0 = c2348d0M20819j.m10031f(AbstractC6752m.f26765S4, -1);
        this.f17396o0 = c2348d0M20819j.m10028c(AbstractC6752m.f26776T4);
        int iM10036k = c2348d0M20819j.m10036k(AbstractC6752m.f26787U4, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f17397p0 = AbstractC4546v.m20835j(iM10036k, mode);
        this.f17394m0 = c2348d0M20819j.m10032g(AbstractC6752m.f26798V4);
        this.f17399r0 = c2348d0M20819j.m10028c(AbstractC6752m.f26809W4);
        this.f17400s0 = AbstractC4546v.m20835j(c2348d0M20819j.m10036k(AbstractC6752m.f26819X4, -1), mode);
        c2348d0M20819j.m10046x();
        setEnforceSwitchWidth(false);
        m20843r();
        m20844s();
    }
}
