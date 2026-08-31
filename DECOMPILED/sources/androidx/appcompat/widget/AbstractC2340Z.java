package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p033E.AbstractC0246a;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.widget.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2340Z {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f8153a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    static final int[] f8154b = {-16842910};

    /* JADX INFO: renamed from: c */
    static final int[] f8155c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    static final int[] f8156d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e */
    static final int[] f8157e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f */
    static final int[] f8158f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g */
    static final int[] f8159g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h */
    static final int[] f8160h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i */
    static final int[] f8161i = new int[0];

    /* JADX INFO: renamed from: j */
    private static final int[] f8162j = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m9984a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC5529j.f21346y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(AbstractC5529j.f21130D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m9985b(Context context, int i7) {
        ColorStateList colorStateListM9988e = m9988e(context, i7);
        if (colorStateListM9988e != null && colorStateListM9988e.isStateful()) {
            return colorStateListM9988e.getColorForState(f8154b, colorStateListM9988e.getDefaultColor());
        }
        TypedValue typedValueM9989f = m9989f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueM9989f, true);
        return m9987d(context, i7, typedValueM9989f.getFloat());
    }

    /* JADX INFO: renamed from: c */
    public static int m9986c(Context context, int i7) {
        int[] iArr = f8162j;
        iArr[0] = i7;
        C2348d0 c2348d0M10024u = C2348d0.m10024u(context, null, iArr);
        try {
            return c2348d0M10024u.m10027b(0, 0);
        } finally {
            c2348d0M10024u.m10046x();
        }
    }

    /* JADX INFO: renamed from: d */
    static int m9987d(Context context, int i7, float f7) {
        int iM9986c = m9986c(context, i7);
        return AbstractC0246a.m1182k(iM9986c, Math.round(Color.alpha(iM9986c) * f7));
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m9988e(Context context, int i7) {
        int[] iArr = f8162j;
        iArr[0] = i7;
        C2348d0 c2348d0M10024u = C2348d0.m10024u(context, null, iArr);
        try {
            return c2348d0M10024u.m10028c(0);
        } finally {
            c2348d0M10024u.m10046x();
        }
    }

    /* JADX INFO: renamed from: f */
    private static TypedValue m9989f() {
        ThreadLocal threadLocal = f8153a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
