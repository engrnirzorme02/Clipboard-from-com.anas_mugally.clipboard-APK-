package p029D3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import p033E.AbstractC0249d;
import p045F3.AbstractC0422b;
import p224d0.C5208l;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: D3.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0196h {
    /* JADX INFO: renamed from: a */
    private static float m973a(String[] strArr, int i7) {
        float f7 = Float.parseFloat(strArr[i7]);
        if (f7 >= 0.0f && f7 <= 1.0f) {
            return f7;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f7);
    }

    /* JADX INFO: renamed from: b */
    private static String m974b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* JADX INFO: renamed from: c */
    private static TimeInterpolator m975c(String str) {
        if (!m977e(str, "cubic-bezier")) {
            if (m977e(str, "path")) {
                return new PathInterpolator(AbstractC0249d.m1195e(m974b(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = m974b(str, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(m973a(strArrSplit, 0), m973a(strArrSplit, 1), m973a(strArrSplit, 2), m973a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m976d(String str) {
        return m977e(str, "cubic-bezier") || m977e(str, "path");
    }

    /* JADX INFO: renamed from: e */
    private static boolean m977e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: f */
    public static int m978f(Context context, int i7, int i8) {
        return AbstractC0422b.m1820d(context, i7, i8);
    }

    /* JADX INFO: renamed from: g */
    public static TimeInterpolator m979g(Context context, int i7, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return m976d(strValueOf) ? m975c(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    /* JADX INFO: renamed from: h */
    public static C5208l m980h(Context context, int i7, int i8) {
        TypedValue typedValueM1817a = AbstractC0422b.m1817a(context, i7);
        TypedArray typedArrayObtainStyledAttributes = typedValueM1817a == null ? context.obtainStyledAttributes(null, AbstractC6752m.f26710N4, 0, i8) : context.obtainStyledAttributes(typedValueM1817a.resourceId, AbstractC6752m.f26710N4);
        C5208l c5208l = new C5208l();
        try {
            float f7 = typedArrayObtainStyledAttributes.getFloat(AbstractC6752m.f26732P4, Float.MIN_VALUE);
            if (f7 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f8 = typedArrayObtainStyledAttributes.getFloat(AbstractC6752m.f26721O4, Float.MIN_VALUE);
            if (f8 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            c5208l.m24092h(f7);
            c5208l.m24090f(f8);
            typedArrayObtainStyledAttributes.recycle();
            return c5208l;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
