package p025D;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p009B.AbstractC0038a;
import p009B.AbstractC0041d;
import p065I.AbstractC0577a;

/* JADX INFO: renamed from: D.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0160c {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f769a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m761a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m762b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m762b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m765e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* JADX INFO: renamed from: c */
    private static TypedValue m763c() {
        ThreadLocal threadLocal = f769a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m764d(Resources resources, int i7, Resources.Theme theme) {
        try {
            return m761a(resources, resources.getXml(i7), theme);
        } catch (Exception e7) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e7);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX INFO: renamed from: e */
    private static ColorStateList m765e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f7;
        int i7 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrM806a = new int[20];
        int i8 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i7 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM768h = m768h(resources, theme, attributeSet, AbstractC0041d.f352b);
                int i9 = AbstractC0041d.f353c;
                int resourceId = typedArrayM768h.getResourceId(i9, -1);
                if (resourceId == -1 || m766f(resources, resourceId)) {
                    color = typedArrayM768h.getColor(i9, -65281);
                } else {
                    try {
                        color = m761a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayM768h.getColor(AbstractC0041d.f353c, -65281);
                    }
                }
                int i10 = AbstractC0041d.f354d;
                float f8 = 1.0f;
                if (typedArrayM768h.hasValue(i10)) {
                    f8 = typedArrayM768h.getFloat(i10, 1.0f);
                } else {
                    int i11 = AbstractC0041d.f356f;
                    if (typedArrayM768h.hasValue(i11)) {
                        f8 = typedArrayM768h.getFloat(i11, 1.0f);
                    }
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i12 = AbstractC0041d.f355e;
                    if (typedArrayM768h.hasValue(i12)) {
                        f7 = typedArrayM768h.getFloat(i12, -1.0f);
                    } else {
                        f7 = typedArrayM768h.getFloat(AbstractC0041d.f357g, -1.0f);
                    }
                } else {
                    f7 = typedArrayM768h.getFloat(AbstractC0041d.f357g, -1.0f);
                }
                typedArrayM768h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i13 = 0;
                for (int i14 = 0; i14 < attributeCount; i14++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i14);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != AbstractC0038a.f279a && attributeNameResource != AbstractC0038a.f280b) {
                        int i15 = i13 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i14, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i13] = attributeNameResource;
                        i13 = i15;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i13);
                iArrM806a = AbstractC0164g.m806a(iArrM806a, i8, m767g(color, f8, f7));
                iArr = (int[][]) AbstractC0164g.m807b(iArr, i8, iArrTrimStateSet);
                i8++;
            }
            i7 = 1;
        }
        int[] iArr3 = new int[i8];
        int[][] iArr4 = new int[i8][];
        System.arraycopy(iArrM806a, 0, iArr3, 0, i8);
        System.arraycopy(iArr, 0, iArr4, 0, i8);
        return new ColorStateList(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: f */
    private static boolean m766f(Resources resources, int i7) {
        TypedValue typedValueM763c = m763c();
        resources.getValue(i7, typedValueM763c, true);
        int i8 = typedValueM763c.type;
        return i8 >= 28 && i8 <= 31;
    }

    /* JADX INFO: renamed from: g */
    private static int m767g(int i7, float f7, float f8) {
        boolean z7 = f8 >= 0.0f && f8 <= 100.0f;
        if (f7 == 1.0f && !z7) {
            return i7;
        }
        int iM2541b = AbstractC0577a.m2541b((int) ((Color.alpha(i7) * f7) + 0.5f), 0, 255);
        if (z7) {
            C0158a c0158aM738c = C0158a.m738c(i7);
            i7 = C0158a.m742m(c0158aM738c.m748j(), c0158aM738c.m747i(), f8);
        }
        return (i7 & 16777215) | (iM2541b << 24);
    }

    /* JADX INFO: renamed from: h */
    private static TypedArray m768h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
