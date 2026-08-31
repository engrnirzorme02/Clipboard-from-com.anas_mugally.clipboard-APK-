package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C2348d0;
import p045F3.AbstractC0422b;
import p255h.AbstractC5520a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: com.google.android.material.internal.s */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4543s {

    /* JADX INFO: renamed from: a */
    private static final int[] f17376a = {AbstractC5520a.f20985w};

    /* JADX INFO: renamed from: b */
    private static final int[] f17377b = {AbstractC6742c.f26260j};

    /* JADX INFO: renamed from: a */
    public static void m20810a(Context context) {
        m20814e(context, f17376a, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: b */
    private static void m20811b(Context context, AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f26660I9, i7, i8);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26682K9, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z7) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(AbstractC6742c.f26280t, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m20812c(context);
            }
        }
        m20810a(context);
    }

    /* JADX INFO: renamed from: c */
    public static void m20812c(Context context) {
        m20814e(context, f17377b, "Theme.MaterialComponents");
    }

    /* JADX INFO: renamed from: d */
    private static void m20813d(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        boolean zM20815f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f26660I9, i7, i8);
        if (!typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26693L9, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zM20815f = typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26671J9, -1) != -1;
        } else {
            zM20815f = m20815f(context, attributeSet, iArr, i7, i8, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zM20815f) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m20814e(Context context, int[] iArr, String str) {
        if (m20817h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* JADX INFO: renamed from: f */
    private static boolean m20815f(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
        for (int i9 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i9, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m20816g(Context context) {
        return AbstractC0422b.m1818b(context, AbstractC6742c.f26278s, false);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m20817h(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i7 = 0; i7 < iArr.length; i7++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i7)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static TypedArray m20818i(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        m20811b(context, attributeSet, i7, i8);
        m20813d(context, attributeSet, iArr, i7, i8, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
    }

    /* JADX INFO: renamed from: j */
    public static C2348d0 m20819j(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        m20811b(context, attributeSet, i7, i8);
        m20813d(context, attributeSet, iArr, i7, i8, iArr2);
        return C2348d0.m10025v(context, attributeSet, iArr, i7, i8);
    }
}
