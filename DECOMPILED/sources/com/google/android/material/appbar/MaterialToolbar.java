package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.drawable.AbstractC4498d;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4544t;
import p041F.AbstractC0400a;
import p069I3.AbstractC0623j;
import p069I3.C0622i;
import p093L3.AbstractC0842a;
import p255h.AbstractC5520a;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: n0 */
    private static final int f16332n0 = AbstractC6751l.f26534H;

    /* JADX INFO: renamed from: o0 */
    private static final ImageView.ScaleType[] f16333o0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: i0 */
    private Integer f16334i0;

    /* JADX INFO: renamed from: j0 */
    private boolean f16335j0;

    /* JADX INFO: renamed from: k0 */
    private boolean f16336k0;

    /* JADX INFO: renamed from: l0 */
    private ImageView.ScaleType f16337l0;

    /* JADX INFO: renamed from: m0 */
    private Boolean f16338m0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20962M);
    }

    /* JADX INFO: renamed from: T */
    private Pair m19513T(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i7 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* JADX INFO: renamed from: U */
    private void m19514U(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC4498d.m20435g(background);
        if (colorStateListValueOf != null) {
            C0622i c0622i = new C0622i();
            c0622i.m2718g0(colorStateListValueOf);
            c0622i.m2710U(context);
            c0622i.m2717f0(getElevation());
            setBackground(c0622i);
        }
    }

    /* JADX INFO: renamed from: V */
    private void m19515V(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i7 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i8 = measuredWidth2 + i7;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i7, 0), Math.max(i8 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i7 += iMax;
            i8 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i8 - i7, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i7, view.getTop(), i8, view.getBottom());
    }

    /* JADX INFO: renamed from: W */
    private void m19516W() {
        if (this.f16335j0 || this.f16336k0) {
            TextView textViewM20824e = AbstractC4544t.m20824e(this);
            TextView textViewM20822c = AbstractC4544t.m20822c(this);
            if (textViewM20824e == null && textViewM20822c == null) {
                return;
            }
            Pair pairM19513T = m19513T(textViewM20824e, textViewM20822c);
            if (this.f16335j0 && textViewM20824e != null) {
                m19515V(textViewM20824e, pairM19513T);
            }
            if (!this.f16336k0 || textViewM20822c == null) {
                return;
            }
            m19515V(textViewM20822c, pairM19513T);
        }
    }

    /* JADX INFO: renamed from: X */
    private Drawable m19517X(Drawable drawable) {
        if (drawable == null || this.f16334i0 == null) {
            return drawable;
        }
        Drawable drawableM1712r = AbstractC0400a.m1712r(drawable.mutate());
        drawableM1712r.setTint(this.f16334i0.intValue());
        return drawableM1712r;
    }

    /* JADX INFO: renamed from: Y */
    private void m19518Y() {
        ImageView imageViewM20821b = AbstractC4544t.m20821b(this);
        if (imageViewM20821b != null) {
            Boolean bool = this.f16338m0;
            if (bool != null) {
                imageViewM20821b.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f16337l0;
            if (scaleType != null) {
                imageViewM20821b.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f16337l0;
    }

    public Integer getNavigationIconTint() {
        return this.f16334i0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0623j.m2750e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        m19516W();
        m19518Y();
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        AbstractC0623j.m2749d(this, f7);
    }

    public void setLogoAdjustViewBounds(boolean z7) {
        Boolean bool = this.f16338m0;
        if (bool == null || bool.booleanValue() != z7) {
            this.f16338m0 = Boolean.valueOf(z7);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f16337l0 != scaleType) {
            this.f16337l0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m19517X(drawable));
    }

    public void setNavigationIconTint(int i7) {
        this.f16334i0 = Integer.valueOf(i7);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z7) {
        if (this.f16336k0 != z7) {
            this.f16336k0 = z7;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z7) {
        if (this.f16335j0 != z7) {
            this.f16335j0 = z7;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16332n0;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        Context context2 = getContext();
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, AbstractC6752m.f26949j5, i7, i8, new int[0]);
        int i9 = AbstractC6752m.f26982m5;
        if (typedArrayM20818i.hasValue(i9)) {
            setNavigationIconTint(typedArrayM20818i.getColor(i9, -1));
        }
        this.f16335j0 = typedArrayM20818i.getBoolean(AbstractC6752m.f27004o5, false);
        this.f16336k0 = typedArrayM20818i.getBoolean(AbstractC6752m.f26993n5, false);
        int i10 = typedArrayM20818i.getInt(AbstractC6752m.f26971l5, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f16333o0;
            if (i10 < scaleTypeArr.length) {
                this.f16337l0 = scaleTypeArr[i10];
            }
        }
        int i11 = AbstractC6752m.f26960k5;
        if (typedArrayM20818i.hasValue(i11)) {
            this.f16338m0 = Boolean.valueOf(typedArrayM20818i.getBoolean(i11, false));
        }
        typedArrayM20818i.recycle();
        m19514U(context2);
    }
}
