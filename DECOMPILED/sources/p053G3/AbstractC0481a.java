package p053G3;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p033E.AbstractC0246a;

/* JADX INFO: renamed from: G3.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0481a {

    /* JADX INFO: renamed from: a */
    private static final int[] f1802a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b */
    private static final int[] f1803b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c */
    private static final int[] f1804c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d */
    private static final int[] f1805d = {R.attr.state_selected};

    /* JADX INFO: renamed from: e */
    private static final int[] f1806e = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: f */
    static final String f1807f = AbstractC0481a.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m2062a(ColorStateList colorStateList) {
        int[] iArr = f1803b;
        return new ColorStateList(new int[][]{f1805d, iArr, StateSet.NOTHING}, new int[]{m2064c(colorStateList, f1804c), m2064c(colorStateList, iArr), m2064c(colorStateList, f1802a)});
    }

    /* JADX INFO: renamed from: b */
    private static int m2063b(int i7) {
        return AbstractC0246a.m1182k(i7, Math.min(Color.alpha(i7) * 2, 255));
    }

    /* JADX INFO: renamed from: c */
    private static int m2064c(ColorStateList colorStateList, int[] iArr) {
        return m2063b(colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m2065d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f1806e, 0)) != 0) {
            Log.w(f1807f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2066e(int[] iArr) {
        boolean z7 = false;
        boolean z8 = false;
        for (int i7 : iArr) {
            if (i7 == 16842910) {
                z7 = true;
            } else if (i7 == 16842908 || i7 == 16842919 || i7 == 16843623) {
                z8 = true;
            }
        }
        return z7 && z8;
    }
}
