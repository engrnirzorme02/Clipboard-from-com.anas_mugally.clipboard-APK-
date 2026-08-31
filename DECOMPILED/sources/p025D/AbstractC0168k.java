package p025D;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: D.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0168k {
    /* JADX INFO: renamed from: a */
    public static int m836a(Context context, int i7, int i8) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.resourceId != 0 ? i7 : i8;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m837b(TypedArray typedArray, int i7, int i8, boolean z7) {
        return typedArray.getBoolean(i7, typedArray.getBoolean(i8, z7));
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m838c(TypedArray typedArray, int i7, int i8) {
        Drawable drawable = typedArray.getDrawable(i7);
        return drawable == null ? typedArray.getDrawable(i8) : drawable;
    }

    /* JADX INFO: renamed from: d */
    public static int m839d(TypedArray typedArray, int i7, int i8, int i9) {
        return typedArray.getInt(i7, typedArray.getInt(i8, i9));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m840e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, boolean z7) {
        return !m851p(xmlPullParser, str) ? z7 : typedArray.getBoolean(i7, z7);
    }

    /* JADX INFO: renamed from: f */
    public static int m841f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, int i8) {
        return !m851p(xmlPullParser, str) ? i8 : typedArray.getColor(i7, i8);
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m842g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7) {
        if (!m851p(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i7, typedValue);
        int i8 = typedValue.type;
        if (i8 != 2) {
            return (i8 < 28 || i8 > 31) ? AbstractC0160c.m764d(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme) : m843h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i7 + ": " + typedValue);
    }

    /* JADX INFO: renamed from: h */
    private static ColorStateList m843h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* JADX INFO: renamed from: i */
    public static C0161d m844i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7, int i8) {
        if (m851p(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i9 = typedValue.type;
            if (i9 >= 28 && i9 <= 31) {
                return C0161d.m770b(typedValue.data);
            }
            C0161d c0161dM773g = C0161d.m773g(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme);
            if (c0161dM773g != null) {
                return c0161dM773g;
            }
        }
        return C0161d.m770b(i8);
    }

    /* JADX INFO: renamed from: j */
    public static float m845j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, float f7) {
        return !m851p(xmlPullParser, str) ? f7 : typedArray.getFloat(i7, f7);
    }

    /* JADX INFO: renamed from: k */
    public static int m846k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, int i8) {
        return !m851p(xmlPullParser, str) ? i8 : typedArray.getInt(i7, i8);
    }

    /* JADX INFO: renamed from: l */
    public static int m847l(TypedArray typedArray, int i7, int i8, int i9) {
        return typedArray.getResourceId(i7, typedArray.getResourceId(i8, i9));
    }

    /* JADX INFO: renamed from: m */
    public static String m848m(TypedArray typedArray, int i7, int i8) {
        String string = typedArray.getString(i7);
        return string == null ? typedArray.getString(i8) : string;
    }

    /* JADX INFO: renamed from: n */
    public static CharSequence m849n(TypedArray typedArray, int i7, int i8) {
        CharSequence text = typedArray.getText(i7);
        return text == null ? typedArray.getText(i8) : text;
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence[] m850o(TypedArray typedArray, int i7, int i8) {
        CharSequence[] textArray = typedArray.getTextArray(i7);
        return textArray == null ? typedArray.getTextArray(i8) : textArray;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m851p(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: q */
    public static TypedArray m852q(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
