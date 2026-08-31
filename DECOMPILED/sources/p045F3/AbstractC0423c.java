package p045F3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C2348d0;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: F3.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0423c {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m1825a(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        ColorStateList colorStateListM25174a;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateListM25174a = AbstractC5659a.m25174a(context, resourceId)) == null) ? typedArray.getColorStateList(i7) : colorStateListM25174a;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m1826b(Context context, C2348d0 c2348d0, int i7) {
        int iM10039n;
        ColorStateList colorStateListM25174a;
        return (!c2348d0.m10044s(i7) || (iM10039n = c2348d0.m10039n(i7, 0)) == 0 || (colorStateListM25174a = AbstractC5659a.m25174a(context, iM10039n)) == null) ? c2348d0.m10028c(i7) : colorStateListM25174a;
    }

    /* JADX INFO: renamed from: c */
    public static int m1827c(Context context, TypedArray typedArray, int i7, int i8) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i7, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i7, i8);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i8);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m1828d(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        Drawable drawableM25175b;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (drawableM25175b = AbstractC5659a.m25175b(context, resourceId)) == null) ? typedArray.getDrawable(i7) : drawableM25175b;
    }

    /* JADX INFO: renamed from: e */
    public static float m1829e(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    /* JADX INFO: renamed from: f */
    static int m1830f(TypedArray typedArray, int i7, int i8) {
        return typedArray.hasValue(i7) ? i7 : i8;
    }

    /* JADX INFO: renamed from: g */
    public static C0424d m1831g(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        if (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) {
            return null;
        }
        return new C0424d(context, resourceId);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1832h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1833i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
