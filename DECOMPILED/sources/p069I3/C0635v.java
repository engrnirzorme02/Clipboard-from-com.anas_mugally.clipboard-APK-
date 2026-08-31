package p069I3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: I3.v */
/* JADX INFO: loaded from: classes2.dex */
public class C0635v {

    /* JADX INFO: renamed from: a */
    final int f2487a;

    /* JADX INFO: renamed from: b */
    final C0627n f2488b;

    /* JADX INFO: renamed from: c */
    final int[][] f2489c;

    /* JADX INFO: renamed from: d */
    final C0627n[] f2490d;

    /* JADX INFO: renamed from: e */
    final C0634u f2491e;

    /* JADX INFO: renamed from: f */
    final C0634u f2492f;

    /* JADX INFO: renamed from: g */
    final C0634u f2493g;

    /* JADX INFO: renamed from: h */
    final C0634u f2494h;

    /* JADX INFO: renamed from: I3.v$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private int f2495a;

        /* JADX INFO: renamed from: b */
        private C0627n f2496b;

        /* JADX INFO: renamed from: c */
        private int[][] f2497c;

        /* JADX INFO: renamed from: d */
        private C0627n[] f2498d;

        /* JADX INFO: renamed from: e */
        private C0634u f2499e;

        /* JADX INFO: renamed from: f */
        private C0634u f2500f;

        /* JADX INFO: renamed from: g */
        private C0634u f2501g;

        /* JADX INFO: renamed from: h */
        private C0634u f2502h;

        /* JADX INFO: renamed from: k */
        private boolean m2922k(int i7, int i8) {
            return (i8 | i7) == i7;
        }

        /* JADX INFO: renamed from: l */
        private void m2923l(int i7, int i8) {
            int[][] iArr = new int[i8][];
            System.arraycopy(this.f2497c, 0, iArr, 0, i7);
            this.f2497c = iArr;
            C0627n[] c0627nArr = new C0627n[i8];
            System.arraycopy(this.f2498d, 0, c0627nArr, 0, i7);
            this.f2498d = c0627nArr;
        }

        /* JADX INFO: renamed from: m */
        private void m2924m() {
            this.f2496b = new C0627n();
            this.f2497c = new int[10][];
            this.f2498d = new C0627n[10];
        }

        /* JADX INFO: renamed from: i */
        public b m2925i(int[] iArr, C0627n c0627n) {
            int i7 = this.f2495a;
            if (i7 == 0 || iArr.length == 0) {
                this.f2496b = c0627n;
            }
            if (i7 >= this.f2497c.length) {
                m2923l(i7, i7 + 10);
            }
            int[][] iArr2 = this.f2497c;
            int i8 = this.f2495a;
            iArr2[i8] = iArr;
            this.f2498d[i8] = c0627n;
            this.f2495a = i8 + 1;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C0635v m2926j() {
            if (this.f2495a == 0) {
                return null;
            }
            return new C0635v(this);
        }

        /* JADX INFO: renamed from: n */
        public b m2927n(C0634u c0634u, int i7) {
            if (m2922k(i7, 1)) {
                this.f2499e = c0634u;
            }
            if (m2922k(i7, 2)) {
                this.f2500f = c0634u;
            }
            if (m2922k(i7, 4)) {
                this.f2501g = c0634u;
            }
            if (m2922k(i7, 8)) {
                this.f2502h = c0634u;
            }
            return this;
        }

        public b(C0635v c0635v) {
            int i7 = c0635v.f2487a;
            this.f2495a = i7;
            this.f2496b = c0635v.f2488b;
            int[][] iArr = c0635v.f2489c;
            int[][] iArr2 = new int[iArr.length][];
            this.f2497c = iArr2;
            this.f2498d = new C0627n[c0635v.f2490d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(c0635v.f2490d, 0, this.f2498d, 0, this.f2495a);
            this.f2499e = c0635v.f2491e;
            this.f2500f = c0635v.f2492f;
            this.f2501g = c0635v.f2493g;
            this.f2502h = c0635v.f2494h;
        }

        public b(C0627n c0627n) {
            m2924m();
            m2925i(StateSet.WILD_CARD, c0627n);
        }

        private b(Context context, int i7) {
            int next;
            m2924m();
            try {
                XmlResourceParser xml = context.getResources().getXml(i7);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            C0635v.m2908g(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
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
                m2924m();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0635v m2906b(Context context, TypedArray typedArray, int i7) {
        int resourceId = typedArray.getResourceId(i7, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new b(context, resourceId).m2926j();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private int m2907e(int[] iArr) {
        int[][] iArr2 = this.f2489c;
        for (int i7 = 0; i7 < this.f2487a; i7++) {
            if (StateSet.stateSetMatches(iArr2[i7], iArr)) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m2908g(b bVar, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, AbstractC6752m.f26677K4) : theme.obtainStyledAttributes(attributeSet, AbstractC6752m.f26677K4, 0, 0);
                C0627n c0627nM2802m = C0627n.m2755b(context, typedArrayObtainAttributes.getResourceId(AbstractC6752m.f26688L4, 0), typedArrayObtainAttributes.getResourceId(AbstractC6752m.f26699M4, 0)).m2802m();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i7 = 0;
                for (int i8 = 0; i8 < attributeCount; i8++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                    if (attributeNameResource != AbstractC6742c.f26240Y && attributeNameResource != AbstractC6742c.f26241Z) {
                        int i9 = i7 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i7] = attributeNameResource;
                        i7 = i9;
                    }
                }
                bVar.m2925i(StateSet.trimStateSet(iArr, i7), c0627nM2802m);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m2909h(int i7) {
        int i8 = i7 & 5;
        return ((i7 & 10) >> 1) | (i8 << 1);
    }

    /* JADX INFO: renamed from: c */
    public C0627n m2910c(boolean z7) {
        if (!z7 || (this.f2491e == null && this.f2492f == null && this.f2493g == null && this.f2494h == null)) {
            return this.f2488b;
        }
        C0627n.b bVarM2776w = this.f2488b.m2776w();
        C0634u c0634u = this.f2491e;
        if (c0634u != null) {
            bVarM2776w.m2797E(c0634u.m2903e());
        }
        C0634u c0634u2 = this.f2492f;
        if (c0634u2 != null) {
            bVarM2776w.m2801I(c0634u2.m2903e());
        }
        C0634u c0634u3 = this.f2493g;
        if (c0634u3 != null) {
            bVarM2776w.m2811w(c0634u3.m2903e());
        }
        C0634u c0634u4 = this.f2494h;
        if (c0634u4 != null) {
            bVarM2776w.m2793A(c0634u4.m2903e());
        }
        return bVarM2776w.m2802m();
    }

    /* JADX INFO: renamed from: d */
    protected C0627n m2911d(int[] iArr) {
        int iM2907e = m2907e(iArr);
        if (iM2907e < 0) {
            iM2907e = m2907e(StateSet.WILD_CARD);
        }
        if (this.f2491e == null && this.f2492f == null && this.f2493g == null && this.f2494h == null) {
            return this.f2490d[iM2907e];
        }
        C0627n.b bVarM2776w = this.f2490d[iM2907e].m2776w();
        C0634u c0634u = this.f2491e;
        if (c0634u != null) {
            bVarM2776w.m2797E(c0634u.m2902d(iArr));
        }
        C0634u c0634u2 = this.f2492f;
        if (c0634u2 != null) {
            bVarM2776w.m2801I(c0634u2.m2902d(iArr));
        }
        C0634u c0634u3 = this.f2493g;
        if (c0634u3 != null) {
            bVarM2776w.m2811w(c0634u3.m2902d(iArr));
        }
        C0634u c0634u4 = this.f2494h;
        if (c0634u4 != null) {
            bVarM2776w.m2793A(c0634u4.m2902d(iArr));
        }
        return bVarM2776w.m2802m();
    }

    /* JADX INFO: renamed from: f */
    public boolean m2912f() {
        C0634u c0634u;
        C0634u c0634u2;
        C0634u c0634u3;
        C0634u c0634u4;
        return this.f2487a > 1 || ((c0634u = this.f2491e) != null && c0634u.m2904h()) || (((c0634u2 = this.f2492f) != null && c0634u2.m2904h()) || (((c0634u3 = this.f2493g) != null && c0634u3.m2904h()) || ((c0634u4 = this.f2494h) != null && c0634u4.m2904h())));
    }

    /* JADX INFO: renamed from: i */
    public b m2913i() {
        return new b(this);
    }

    private C0635v(b bVar) {
        this.f2487a = bVar.f2495a;
        this.f2488b = bVar.f2496b;
        this.f2489c = bVar.f2497c;
        this.f2490d = bVar.f2498d;
        this.f2491e = bVar.f2499e;
        this.f2492f = bVar.f2500f;
        this.f2493g = bVar.f2501g;
        this.f2494h = bVar.f2502h;
    }
}
