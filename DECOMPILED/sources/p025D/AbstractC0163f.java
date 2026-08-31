package p025D;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p009B.AbstractC0041d;

/* JADX INFO: renamed from: D.f */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0163f {
    /* JADX INFO: renamed from: a */
    private static a m802a(a aVar, int i7, int i8, boolean z7, int i9) {
        if (aVar != null) {
            return aVar;
        }
        return z7 ? new a(i7, i9, i8) : new a(i7, i8);
    }

    /* JADX INFO: renamed from: b */
    static Shader m803b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM852q = AbstractC0168k.m852q(resources, theme, attributeSet, AbstractC0041d.f335F);
        float fM845j = AbstractC0168k.m845j(typedArrayM852q, xmlPullParser, "startX", AbstractC0041d.f344O, 0.0f);
        float fM845j2 = AbstractC0168k.m845j(typedArrayM852q, xmlPullParser, "startY", AbstractC0041d.f345P, 0.0f);
        float fM845j3 = AbstractC0168k.m845j(typedArrayM852q, xmlPullParser, "endX", AbstractC0041d.f346Q, 0.0f);
        float fM845j4 = AbstractC0168k.m845j(typedArrayM852q, xmlPullParser, "endY", AbstractC0041d.f347R, 0.0f);
        float fM845j5 = AbstractC0168k.m845j(typedArrayM852q, xmlPullParser, "centerX", AbstractC0041d.f339J, 0.0f);
        float fM845j6 = AbstractC0168k.m845j(typedArrayM852q, xmlPullParser, "centerY", AbstractC0041d.f340K, 0.0f);
        int iM846k = AbstractC0168k.m846k(typedArrayM852q, xmlPullParser, "type", AbstractC0041d.f338I, 0);
        int iM841f = AbstractC0168k.m841f(typedArrayM852q, xmlPullParser, "startColor", AbstractC0041d.f336G, 0);
        boolean zM851p = AbstractC0168k.m851p(xmlPullParser, "centerColor");
        int iM841f2 = AbstractC0168k.m841f(typedArrayM852q, xmlPullParser, "centerColor", AbstractC0041d.f343N, 0);
        int iM841f3 = AbstractC0168k.m841f(typedArrayM852q, xmlPullParser, "endColor", AbstractC0041d.f337H, 0);
        int iM846k2 = AbstractC0168k.m846k(typedArrayM852q, xmlPullParser, "tileMode", AbstractC0041d.f342M, 0);
        float fM845j7 = AbstractC0168k.m845j(typedArrayM852q, xmlPullParser, "gradientRadius", AbstractC0041d.f341L, 0.0f);
        typedArrayM852q.recycle();
        a aVarM802a = m802a(m804c(resources, xmlPullParser, attributeSet, theme), iM841f, iM841f3, zM851p, iM841f2);
        if (iM846k != 1) {
            return iM846k != 2 ? new LinearGradient(fM845j, fM845j2, fM845j3, fM845j4, aVarM802a.f784a, aVarM802a.f785b, m805d(iM846k2)) : new SweepGradient(fM845j5, fM845j6, aVarM802a.f784a, aVarM802a.f785b);
        }
        if (fM845j7 > 0.0f) {
            return new RadialGradient(fM845j5, fM845j6, fM845j7, aVarM802a.f784a, aVarM802a.f785b, m805d(iM846k2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX INFO: renamed from: c */
    private static a m804c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM852q = AbstractC0168k.m852q(resources, theme, attributeSet, AbstractC0041d.f348S);
                int i7 = AbstractC0041d.f349T;
                boolean zHasValue = typedArrayM852q.hasValue(i7);
                int i8 = AbstractC0041d.f350U;
                boolean zHasValue2 = typedArrayM852q.hasValue(i8);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayM852q.getColor(i7, 0);
                float f7 = typedArrayM852q.getFloat(i8, 0.0f);
                typedArrayM852q.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f7));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static Shader.TileMode m805d(int i7) {
        if (i7 != 1) {
            return i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: renamed from: D.f$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        final int[] f784a;

        /* JADX INFO: renamed from: b */
        final float[] f785b;

        a(List list, List list2) {
            int size = list.size();
            this.f784a = new int[size];
            this.f785b = new float[size];
            for (int i7 = 0; i7 < size; i7++) {
                this.f784a[i7] = ((Integer) list.get(i7)).intValue();
                this.f785b[i7] = ((Float) list2.get(i7)).floatValue();
            }
        }

        a(int i7, int i8) {
            this.f784a = new int[]{i7, i8};
            this.f785b = new float[]{0.0f, 1.0f};
        }

        a(int i7, int i8, int i9) {
            this.f784a = new int[]{i7, i8, i9};
            this.f785b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
