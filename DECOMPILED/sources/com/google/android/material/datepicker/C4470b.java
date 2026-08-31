package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import p045F3.AbstractC0423c;
import p069I3.C0622i;
import p069I3.C0627n;
import p104N.AbstractC0910g;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes2.dex */
final class C4470b {

    /* JADX INFO: renamed from: a */
    private final Rect f16861a;

    /* JADX INFO: renamed from: b */
    private final ColorStateList f16862b;

    /* JADX INFO: renamed from: c */
    private final ColorStateList f16863c;

    /* JADX INFO: renamed from: d */
    private final ColorStateList f16864d;

    /* JADX INFO: renamed from: e */
    private final int f16865e;

    /* JADX INFO: renamed from: f */
    private final C0627n f16866f;

    private C4470b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i7, C0627n c0627n, Rect rect) {
        AbstractC0910g.m4136d(rect.left);
        AbstractC0910g.m4136d(rect.top);
        AbstractC0910g.m4136d(rect.right);
        AbstractC0910g.m4136d(rect.bottom);
        this.f16861a = rect;
        this.f16862b = colorStateList2;
        this.f16863c = colorStateList;
        this.f16864d = colorStateList3;
        this.f16865e = i7;
        this.f16866f = c0627n;
    }

    /* JADX INFO: renamed from: a */
    static C4470b m20259a(Context context, int i7) {
        AbstractC0910g.m4134b(i7 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC6752m.f26786U3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC6752m.f26797V3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC6752m.f26818X3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC6752m.f26808W3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC6752m.f26828Y3, 0));
        ColorStateList colorStateListM1825a = AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, AbstractC6752m.f26838Z3);
        ColorStateList colorStateListM1825a2 = AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, AbstractC6752m.f26893e4);
        ColorStateList colorStateListM1825a3 = AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, AbstractC6752m.f26871c4);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6752m.f26882d4, 0);
        C0627n c0627nM2802m = C0627n.m2755b(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26849a4, 0), typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26860b4, 0)).m2802m();
        typedArrayObtainStyledAttributes.recycle();
        return new C4470b(colorStateListM1825a, colorStateListM1825a2, colorStateListM1825a3, dimensionPixelSize, c0627nM2802m, rect);
    }

    /* JADX INFO: renamed from: b */
    int m20260b() {
        return this.f16861a.bottom;
    }

    /* JADX INFO: renamed from: c */
    int m20261c() {
        return this.f16861a.top;
    }

    /* JADX INFO: renamed from: d */
    void m20262d(TextView textView) {
        m20263e(textView, null, null);
    }

    /* JADX INFO: renamed from: e */
    void m20263e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        C0622i c0622i = new C0622i();
        C0622i c0622i2 = new C0622i();
        c0622i.setShapeAppearanceModel(this.f16866f);
        c0622i2.setShapeAppearanceModel(this.f16866f);
        if (colorStateList == null) {
            colorStateList = this.f16863c;
        }
        c0622i.m2718g0(colorStateList);
        c0622i.m2730q0(this.f16865e, this.f16864d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f16862b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f16862b.withAlpha(30), c0622i, c0622i2);
        Rect rect = this.f16861a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
