package p045F3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import p009B.AbstractC0041d;
import p025D.AbstractC0165h;
import p255h.AbstractC5529j;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: F3.d */
/* JADX INFO: loaded from: classes2.dex */
public class C0424d {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f1669a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f1670b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f1671c;

    /* JADX INFO: renamed from: d */
    public final String f1672d;

    /* JADX INFO: renamed from: e */
    public String f1673e;

    /* JADX INFO: renamed from: f */
    public final int f1674f;

    /* JADX INFO: renamed from: g */
    public final int f1675g;

    /* JADX INFO: renamed from: h */
    public final boolean f1676h;

    /* JADX INFO: renamed from: i */
    public final float f1677i;

    /* JADX INFO: renamed from: j */
    public final float f1678j;

    /* JADX INFO: renamed from: k */
    public final float f1679k;

    /* JADX INFO: renamed from: l */
    public final boolean f1680l;

    /* JADX INFO: renamed from: m */
    public final float f1681m;

    /* JADX INFO: renamed from: n */
    private ColorStateList f1682n;

    /* JADX INFO: renamed from: o */
    private float f1683o;

    /* JADX INFO: renamed from: p */
    private final int f1684p;

    /* JADX INFO: renamed from: q */
    private boolean f1685q = false;

    /* JADX INFO: renamed from: r */
    private boolean f1686r = false;

    /* JADX INFO: renamed from: s */
    private Typeface f1687s;

    /* JADX INFO: renamed from: F3.d$a */
    class a extends AbstractC0165h.e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC0426f f1688a;

        a(AbstractC0426f abstractC0426f) {
            this.f1688a = abstractC0426f;
        }

        @Override // p025D.AbstractC0165h.e
        /* JADX INFO: renamed from: f */
        public void mo831f(int i7) {
            C0424d.this.f1685q = true;
            this.f1688a.mo1813a(i7);
        }

        @Override // p025D.AbstractC0165h.e
        /* JADX INFO: renamed from: g */
        public void mo832g(Typeface typeface) {
            C0424d c0424d = C0424d.this;
            c0424d.f1687s = Typeface.create(typeface, c0424d.f1674f);
            C0424d.this.f1685q = true;
            this.f1688a.mo1814b(C0424d.this.f1687s, false);
        }
    }

    /* JADX INFO: renamed from: F3.d$b */
    class b extends AbstractC0426f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f1690a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextPaint f1691b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC0426f f1692c;

        b(Context context, TextPaint textPaint, AbstractC0426f abstractC0426f) {
            this.f1690a = context;
            this.f1691b = textPaint;
            this.f1692c = abstractC0426f;
        }

        @Override // p045F3.AbstractC0426f
        /* JADX INFO: renamed from: a */
        public void mo1813a(int i7) {
            this.f1692c.mo1813a(i7);
        }

        @Override // p045F3.AbstractC0426f
        /* JADX INFO: renamed from: b */
        public void mo1814b(Typeface typeface, boolean z7) {
            C0424d.this.m1851r(this.f1690a, this.f1691b, typeface);
            this.f1692c.mo1814b(typeface, z7);
        }
    }

    public C0424d(Context context, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC5529j.f21122B2);
        m1848o(typedArrayObtainStyledAttributes.getDimension(AbstractC5529j.f21127C2, 0.0f));
        m1847n(AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, AbstractC5529j.f21142F2));
        this.f1669a = AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, AbstractC5529j.f21147G2);
        this.f1670b = AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, AbstractC5529j.f21152H2);
        this.f1674f = typedArrayObtainStyledAttributes.getInt(AbstractC5529j.f21137E2, 0);
        this.f1675g = typedArrayObtainStyledAttributes.getInt(AbstractC5529j.f21132D2, 1);
        int iM1830f = AbstractC0423c.m1830f(typedArrayObtainStyledAttributes, AbstractC5529j.f21180O2, AbstractC5529j.f21172M2);
        this.f1684p = typedArrayObtainStyledAttributes.getResourceId(iM1830f, 0);
        this.f1672d = typedArrayObtainStyledAttributes.getString(iM1830f);
        this.f1676h = typedArrayObtainStyledAttributes.getBoolean(AbstractC5529j.f21188Q2, false);
        this.f1671c = AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, AbstractC5529j.f21156I2);
        this.f1677i = typedArrayObtainStyledAttributes.getFloat(AbstractC5529j.f21160J2, 0.0f);
        this.f1678j = typedArrayObtainStyledAttributes.getFloat(AbstractC5529j.f21164K2, 0.0f);
        this.f1679k = typedArrayObtainStyledAttributes.getFloat(AbstractC5529j.f21168L2, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i7, AbstractC6752m.f26829Y4);
        int i8 = AbstractC6752m.f26839Z4;
        this.f1680l = typedArrayObtainStyledAttributes2.hasValue(i8);
        this.f1681m = typedArrayObtainStyledAttributes2.getFloat(i8, 0.0f);
        this.f1673e = typedArrayObtainStyledAttributes2.getString(AbstractC0423c.m1830f(typedArrayObtainStyledAttributes2, AbstractC6752m.f26872c5, AbstractC6752m.f26850a5));
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: d */
    private void m1837d() {
        String str;
        if (this.f1687s == null && (str = this.f1672d) != null) {
            this.f1687s = Typeface.create(str, this.f1674f);
        }
        if (this.f1687s == null) {
            int i7 = this.f1675g;
            if (i7 == 1) {
                this.f1687s = Typeface.SANS_SERIF;
            } else if (i7 == 2) {
                this.f1687s = Typeface.SERIF;
            } else if (i7 != 3) {
                this.f1687s = Typeface.DEFAULT;
            } else {
                this.f1687s = Typeface.MONOSPACE;
            }
            this.f1687s = Typeface.create(this.f1687s, this.f1674f);
        }
    }

    /* JADX INFO: renamed from: i */
    private Typeface m1838i(Context context) {
        Typeface typefaceCreate;
        if (this.f1686r) {
            return null;
        }
        this.f1686r = true;
        String strM1840m = m1840m(context, this.f1684p);
        if (strM1840m == null || (typefaceCreate = Typeface.create(strM1840m, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.f1674f);
    }

    /* JADX INFO: renamed from: l */
    private boolean m1839l(Context context) {
        if (AbstractC0425e.m1852a()) {
            m1842f(context);
            return true;
        }
        if (this.f1685q) {
            return true;
        }
        int i7 = this.f1684p;
        if (i7 == 0) {
            return false;
        }
        Typeface typefaceM811c = AbstractC0165h.m811c(context, i7);
        if (typefaceM811c != null) {
            this.f1687s = typefaceM811c;
            this.f1685q = true;
            return true;
        }
        Typeface typefaceM1838i = m1838i(context);
        if (typefaceM1838i == null) {
            return false;
        }
        this.f1687s = typefaceM1838i;
        this.f1685q = true;
        return true;
    }

    /* JADX INFO: renamed from: m */
    private static String m1840m(Context context, int i7) {
        Resources resources = context.getResources();
        if (i7 != 0 && resources.getResourceTypeName(i7).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i7);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), AbstractC0041d.f358h);
                        String string = typedArrayObtainAttributes.getString(AbstractC0041d.f366p);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Typeface m1841e() {
        m1837d();
        return this.f1687s;
    }

    /* JADX INFO: renamed from: f */
    public Typeface m1842f(Context context) {
        if (this.f1685q) {
            return this.f1687s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM815g = AbstractC0165h.m815g(context, this.f1684p);
                this.f1687s = typefaceM815g;
                if (typefaceM815g != null) {
                    this.f1687s = Typeface.create(typefaceM815g, this.f1674f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e7) {
                Log.d("TextAppearance", "Error loading font " + this.f1672d, e7);
            }
        }
        m1837d();
        this.f1685q = true;
        return this.f1687s;
    }

    /* JADX INFO: renamed from: g */
    public void m1843g(Context context, AbstractC0426f abstractC0426f) {
        if (!m1839l(context)) {
            m1837d();
        }
        int i7 = this.f1684p;
        if (i7 == 0) {
            this.f1685q = true;
        }
        if (this.f1685q) {
            abstractC0426f.mo1814b(this.f1687s, true);
            return;
        }
        try {
            AbstractC0165h.m817i(context, i7, new a(abstractC0426f), null);
        } catch (Resources.NotFoundException unused) {
            this.f1685q = true;
            abstractC0426f.mo1813a(1);
        } catch (Exception e7) {
            Log.d("TextAppearance", "Error loading font " + this.f1672d, e7);
            this.f1685q = true;
            abstractC0426f.mo1813a(-3);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1844h(Context context, TextPaint textPaint, AbstractC0426f abstractC0426f) {
        m1851r(context, textPaint, m1841e());
        m1843g(context, new b(context, textPaint, abstractC0426f));
    }

    /* JADX INFO: renamed from: j */
    public ColorStateList m1845j() {
        return this.f1682n;
    }

    /* JADX INFO: renamed from: k */
    public float m1846k() {
        return this.f1683o;
    }

    /* JADX INFO: renamed from: n */
    public void m1847n(ColorStateList colorStateList) {
        this.f1682n = colorStateList;
    }

    /* JADX INFO: renamed from: o */
    public void m1848o(float f7) {
        this.f1683o = f7;
    }

    /* JADX INFO: renamed from: p */
    public void m1849p(Context context, TextPaint textPaint, AbstractC0426f abstractC0426f) {
        m1850q(context, textPaint, abstractC0426f);
        ColorStateList colorStateList = this.f1682n;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f7 = this.f1679k;
        float f8 = this.f1677i;
        float f9 = this.f1678j;
        ColorStateList colorStateList2 = this.f1671c;
        textPaint.setShadowLayer(f7, f8, f9, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: q */
    public void m1850q(Context context, TextPaint textPaint, AbstractC0426f abstractC0426f) {
        Typeface typeface;
        if (m1839l(context) && this.f1685q && (typeface = this.f1687s) != null) {
            m1851r(context, textPaint, typeface);
        } else {
            m1844h(context, textPaint, abstractC0426f);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m1851r(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM1856a = AbstractC0430j.m1856a(context, typeface);
        if (typefaceM1856a != null) {
            typeface = typefaceM1856a;
        }
        textPaint.setTypeface(typeface);
        int i7 = this.f1674f & (~typeface.getStyle());
        textPaint.setFakeBoldText((i7 & 1) != 0);
        textPaint.setTextSkewX((i7 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1683o);
        textPaint.setFontVariationSettings(this.f1673e);
        if (this.f1680l) {
            textPaint.setLetterSpacing(this.f1681m);
        }
    }
}
