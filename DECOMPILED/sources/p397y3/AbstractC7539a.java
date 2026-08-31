package p397y3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.AbstractC2436b;
import p033E.AbstractC0246a;
import p045F3.AbstractC0422b;

/* JADX INFO: renamed from: y3.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7539a {
    /* JADX INFO: renamed from: a */
    public static int m33170a(int i7, int i8) {
        return AbstractC0246a.m1182k(i7, (Color.alpha(i7) * i8) / 255);
    }

    /* JADX INFO: renamed from: b */
    public static int m33171b(Context context, int i7, int i8) {
        Integer numM33175f = m33175f(context, i7);
        return numM33175f != null ? numM33175f.intValue() : i8;
    }

    /* JADX INFO: renamed from: c */
    public static int m33172c(Context context, int i7, String str) {
        return m33181l(context, AbstractC0422b.m1823g(context, i7, str));
    }

    /* JADX INFO: renamed from: d */
    public static int m33173d(View view, int i7) {
        return m33181l(view.getContext(), AbstractC0422b.m1824h(view, i7));
    }

    /* JADX INFO: renamed from: e */
    public static int m33174e(View view, int i7, int i8) {
        return m33171b(view.getContext(), i7, i8);
    }

    /* JADX INFO: renamed from: f */
    public static Integer m33175f(Context context, int i7) {
        TypedValue typedValueM1817a = AbstractC0422b.m1817a(context, i7);
        if (typedValueM1817a != null) {
            return Integer.valueOf(m33181l(context, typedValueM1817a));
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m33176g(Context context, int i7) {
        TypedValue typedValueM1817a = AbstractC0422b.m1817a(context, i7);
        if (typedValueM1817a == null) {
            return null;
        }
        int i8 = typedValueM1817a.resourceId;
        if (i8 != 0) {
            return AbstractC2436b.getColorStateList(context, i8);
        }
        int i9 = typedValueM1817a.data;
        if (i9 != 0) {
            return ColorStateList.valueOf(i9);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m33177h(int i7) {
        return i7 != 0 && AbstractC0246a.m1175d(i7) > 0.5d;
    }

    /* JADX INFO: renamed from: i */
    public static int m33178i(int i7, int i8) {
        return AbstractC0246a.m1178g(i8, i7);
    }

    /* JADX INFO: renamed from: j */
    public static int m33179j(int i7, int i8, float f7) {
        return m33178i(i7, AbstractC0246a.m1182k(i8, Math.round(Color.alpha(i8) * f7)));
    }

    /* JADX INFO: renamed from: k */
    public static int m33180k(View view, int i7, int i8, float f7) {
        return m33179j(m33173d(view, i7), m33173d(view, i8), f7);
    }

    /* JADX INFO: renamed from: l */
    private static int m33181l(Context context, TypedValue typedValue) {
        int i7 = typedValue.resourceId;
        return i7 != 0 ? AbstractC2436b.getColor(context, i7) : typedValue.data;
    }
}
