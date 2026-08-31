package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C2303B;
import p045F3.AbstractC0422b;
import p045F3.AbstractC0423c;
import p093L3.AbstractC0842a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6752m;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialTextView extends C2303B {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX INFO: renamed from: s */
    private void m21742s(Resources.Theme theme, int i7) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i7, AbstractC6752m.f26829Y4);
        int iM21746w = m21746w(getContext(), typedArrayObtainStyledAttributes, AbstractC6752m.f26861b5, AbstractC6752m.f26883d5);
        typedArrayObtainStyledAttributes.recycle();
        if (iM21746w >= 0) {
            setLineHeight(iM21746w);
        }
    }

    /* JADX INFO: renamed from: t */
    private static boolean m21743t(Context context) {
        return AbstractC0422b.m1818b(context, AbstractC6742c.f26271o0, true);
    }

    /* JADX INFO: renamed from: u */
    private static int m21744u(Resources.Theme theme, AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, AbstractC6752m.f26894e5, i7, i8);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26905f5, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: v */
    private void m21745v(AttributeSet attributeSet, int i7, int i8) {
        int iM21744u;
        Context context = getContext();
        if (m21743t(context)) {
            Resources.Theme theme = context.getTheme();
            if (m21747x(context, theme, attributeSet, i7, i8) || (iM21744u = m21744u(theme, attributeSet, i7, i8)) == -1) {
                return;
            }
            m21742s(theme, iM21744u);
        }
    }

    /* JADX INFO: renamed from: w */
    private static int m21746w(Context context, TypedArray typedArray, int... iArr) {
        int iM1827c = -1;
        for (int i7 = 0; i7 < iArr.length && iM1827c < 0; i7++) {
            iM1827c = AbstractC0423c.m1827c(context, typedArray, iArr[i7], -1);
        }
        return iM1827c;
    }

    /* JADX INFO: renamed from: x */
    private static boolean m21747x(Context context, Resources.Theme theme, AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, AbstractC6752m.f26894e5, i7, i8);
        int iM21746w = m21746w(context, typedArrayObtainStyledAttributes, AbstractC6752m.f26916g5, AbstractC6752m.f26927h5);
        typedArrayObtainStyledAttributes.recycle();
        return iM21746w != -1;
    }

    @Override // androidx.appcompat.widget.C2303B, android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        if (m21743t(context)) {
            m21742s(context.getTheme(), i7);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i7) {
        super(AbstractC0842a.m3884d(context, attributeSet, i7, 0), attributeSet, i7);
        m21745v(attributeSet, i7, 0);
    }
}
