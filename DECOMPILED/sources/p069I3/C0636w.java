package p069I3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: I3.w */
/* JADX INFO: loaded from: classes2.dex */
public class C0636w {

    /* JADX INFO: renamed from: a */
    int f2503a;

    /* JADX INFO: renamed from: b */
    private a f2504b;

    /* JADX INFO: renamed from: c */
    int[][] f2505c = new int[10][];

    /* JADX INFO: renamed from: d */
    a[] f2506d = new a[10];

    /* JADX INFO: renamed from: I3.w$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public b f2507a;

        a(b bVar) {
            this.f2507a = bVar;
        }
    }

    /* JADX INFO: renamed from: I3.w$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        c f2508a;

        /* JADX INFO: renamed from: b */
        float f2509b;

        b(c cVar, float f7) {
            this.f2508a = cVar;
            this.f2509b = f7;
        }

        /* JADX INFO: renamed from: a */
        public int m2936a(int i7) {
            c cVar = this.f2508a;
            if (cVar == c.PERCENT) {
                return (int) (this.f2509b * i7);
            }
            if (cVar == c.PIXELS) {
                return (int) this.f2509b;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: I3.w$c */
    public enum c {
        PERCENT,
        PIXELS
    }

    /* JADX INFO: renamed from: a */
    private void m2928a(int[] iArr, a aVar) {
        int i7 = this.f2503a;
        if (i7 == 0 || iArr.length == 0) {
            this.f2504b = aVar;
        }
        if (i7 >= this.f2505c.length) {
            m2931f(i7, i7 + 10);
        }
        int[][] iArr2 = this.f2505c;
        int i8 = this.f2503a;
        iArr2[i8] = iArr;
        this.f2506d[i8] = aVar;
        this.f2503a = i8 + 1;
    }

    /* JADX INFO: renamed from: b */
    public static C0636w m2929b(Context context, TypedArray typedArray, int i7) {
        int next;
        int resourceId = typedArray.getResourceId(i7, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                C0636w c0636w = new C0636w();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    c0636w.m2933h(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return c0636w;
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private b m2930d(TypedArray typedArray, int i7, b bVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i7);
        if (typedValuePeekValue != null) {
            int i8 = typedValuePeekValue.type;
            if (i8 == 5) {
                return new b(c.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i8 == 6) {
                return new b(c.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bVar;
    }

    /* JADX INFO: renamed from: f */
    private void m2931f(int i7, int i8) {
        int[][] iArr = new int[i8][];
        System.arraycopy(this.f2505c, 0, iArr, 0, i7);
        this.f2505c = iArr;
        a[] aVarArr = new a[i8];
        System.arraycopy(this.f2506d, 0, aVarArr, 0, i7);
        this.f2506d = aVarArr;
    }

    /* JADX INFO: renamed from: g */
    private int m2932g(int[] iArr) {
        int[][] iArr2 = this.f2505c;
        for (int i7 = 0; i7 < this.f2503a; i7++) {
            if (StateSet.stateSetMatches(iArr2[i7], iArr)) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    private void m2933h(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, AbstractC6752m.f26614E7) : theme.obtainStyledAttributes(attributeSet, AbstractC6752m.f26614E7, 0, 0);
                b bVarM2930d = m2930d(typedArrayObtainAttributes, AbstractC6752m.f26625F7, null);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i7 = 0;
                for (int i8 = 0; i8 < attributeCount; i8++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                    if (attributeNameResource != AbstractC6742c.f26279s0) {
                        int i9 = i7 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i7] = attributeNameResource;
                        i7 = i9;
                    }
                }
                m2928a(StateSet.trimStateSet(iArr, i7), new a(bVarM2930d));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public int m2934c(int i7) {
        float fMax;
        int i8 = -i7;
        for (int i9 = 0; i9 < this.f2503a; i9++) {
            b bVar = this.f2506d[i9].f2507a;
            c cVar = bVar.f2508a;
            if (cVar == c.PIXELS) {
                fMax = Math.max(i8, bVar.f2509b);
            } else {
                if (cVar == c.PERCENT) {
                    fMax = Math.max(i8, i7 * bVar.f2509b);
                }
            }
            i8 = (int) fMax;
        }
        return i8;
    }

    /* JADX INFO: renamed from: e */
    public a m2935e(int[] iArr) {
        int iM2932g = m2932g(iArr);
        if (iM2932g < 0) {
            iM2932g = m2932g(StateSet.WILD_CARD);
        }
        return iM2932g < 0 ? this.f2504b : this.f2506d[iM2932g];
    }
}
