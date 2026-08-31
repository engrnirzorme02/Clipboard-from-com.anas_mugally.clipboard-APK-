package p069I3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: I3.u */
/* JADX INFO: loaded from: classes2.dex */
public class C0634u {

    /* JADX INFO: renamed from: a */
    int f2483a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0617d f2484b;

    /* JADX INFO: renamed from: c */
    int[][] f2485c = new int[10][];

    /* JADX INFO: renamed from: d */
    InterfaceC0617d[] f2486d = new InterfaceC0617d[10];

    /* JADX INFO: renamed from: a */
    private void m2896a(int[] iArr, InterfaceC0617d interfaceC0617d) {
        int i7 = this.f2483a;
        if (i7 == 0 || iArr.length == 0) {
            this.f2484b = interfaceC0617d;
        }
        if (i7 >= this.f2485c.length) {
            m2899f(i7, i7 + 10);
        }
        int[][] iArr2 = this.f2485c;
        int i8 = this.f2483a;
        iArr2[i8] = iArr;
        this.f2486d[i8] = interfaceC0617d;
        this.f2483a = i8 + 1;
    }

    /* JADX INFO: renamed from: b */
    public static C0634u m2897b(InterfaceC0617d interfaceC0617d) {
        C0634u c0634u = new C0634u();
        c0634u.m2896a(StateSet.WILD_CARD, interfaceC0617d);
        return c0634u;
    }

    /* JADX INFO: renamed from: c */
    public static C0634u m2898c(Context context, TypedArray typedArray, int i7, InterfaceC0617d interfaceC0617d) {
        int next;
        int resourceId = typedArray.getResourceId(i7, 0);
        if (resourceId != 0 && context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            try {
                XmlResourceParser xml = context.getResources().getXml(resourceId);
                try {
                    C0634u c0634u = new C0634u();
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
                        c0634u.m2901i(context, xml, attributeSetAsAttributeSet, context.getTheme());
                    }
                    xml.close();
                    return c0634u;
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
                return m2897b(interfaceC0617d);
            }
        }
        return m2897b(C0627n.m2761m(typedArray, i7, interfaceC0617d));
    }

    /* JADX INFO: renamed from: f */
    private void m2899f(int i7, int i8) {
        int[][] iArr = new int[i8][];
        System.arraycopy(this.f2485c, 0, iArr, 0, i7);
        this.f2485c = iArr;
        InterfaceC0617d[] interfaceC0617dArr = new InterfaceC0617d[i8];
        System.arraycopy(this.f2486d, 0, interfaceC0617dArr, 0, i7);
        this.f2486d = interfaceC0617dArr;
    }

    /* JADX INFO: renamed from: g */
    private int m2900g(int[] iArr) {
        int[][] iArr2 = this.f2485c;
        for (int i7 = 0; i7 < this.f2483a; i7++) {
            if (StateSet.stateSetMatches(iArr2[i7], iArr)) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    private void m2901i(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, AbstractC6752m.f26972l6) : theme.obtainStyledAttributes(attributeSet, AbstractC6752m.f26972l6, 0, 0);
                InterfaceC0617d interfaceC0617dM2761m = C0627n.m2761m(typedArrayObtainAttributes, AbstractC6752m.f27038r6, new C0614a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i7 = 0;
                for (int i8 = 0; i8 < attributeCount; i8++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                    if (attributeNameResource != AbstractC6742c.f26264l) {
                        int i9 = i7 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i7] = attributeNameResource;
                        i7 = i9;
                    }
                }
                m2896a(StateSet.trimStateSet(iArr, i7), interfaceC0617dM2761m);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0617d m2902d(int[] iArr) {
        int iM2900g = m2900g(iArr);
        if (iM2900g < 0) {
            iM2900g = m2900g(StateSet.WILD_CARD);
        }
        return iM2900g < 0 ? this.f2484b : this.f2486d[iM2900g];
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC0617d m2903e() {
        return this.f2484b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m2904h() {
        return this.f2483a > 1;
    }
}
