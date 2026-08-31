package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.widget.AbstractC2458i;
import java.lang.ref.WeakReference;
import p025D.AbstractC0165h;
import p104N.AbstractC0912i;
import p111O.AbstractC1030Z;
import p125Q.AbstractC1241a;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.widget.A */
/* JADX INFO: loaded from: classes.dex */
class C2289A {

    /* JADX INFO: renamed from: a */
    private final TextView f7773a;

    /* JADX INFO: renamed from: b */
    private C2344b0 f7774b;

    /* JADX INFO: renamed from: c */
    private C2344b0 f7775c;

    /* JADX INFO: renamed from: d */
    private C2344b0 f7776d;

    /* JADX INFO: renamed from: e */
    private C2344b0 f7777e;

    /* JADX INFO: renamed from: f */
    private C2344b0 f7778f;

    /* JADX INFO: renamed from: g */
    private C2344b0 f7779g;

    /* JADX INFO: renamed from: h */
    private C2344b0 f7780h;

    /* JADX INFO: renamed from: i */
    private final C2304C f7781i;

    /* JADX INFO: renamed from: j */
    private int f7782j = 0;

    /* JADX INFO: renamed from: k */
    private int f7783k = -1;

    /* JADX INFO: renamed from: l */
    private Typeface f7784l;

    /* JADX INFO: renamed from: m */
    private boolean f7785m;

    /* JADX INFO: renamed from: androidx.appcompat.widget.A$a */
    class a extends AbstractC0165h.e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f7786a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f7787b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ WeakReference f7788c;

        a(int i7, int i8, WeakReference weakReference) {
            this.f7786a = i7;
            this.f7787b = i8;
            this.f7788c = weakReference;
        }

        @Override // p025D.AbstractC0165h.e
        /* JADX INFO: renamed from: f */
        public void mo831f(int i7) {
        }

        @Override // p025D.AbstractC0165h.e
        /* JADX INFO: renamed from: g */
        public void mo832g(Typeface typeface) {
            int i7;
            if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f7786a) != -1) {
                typeface = e.m9626a(typeface, i7, (this.f7787b & 2) != 0);
            }
            C2289A.this.m9609n(this.f7788c, typeface);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.A$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TextView f7790a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Typeface f7791b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f7792c;

        b(TextView textView, Typeface typeface, int i7) {
            this.f7790a = textView;
            this.f7791b = typeface;
            this.f7792c = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7790a.setTypeface(this.f7791b, this.f7792c);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.A$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static LocaleList m9620a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* JADX INFO: renamed from: b */
        static void m9621b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.A$d */
    static class d {
        /* JADX INFO: renamed from: a */
        static int m9622a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* JADX INFO: renamed from: b */
        static void m9623b(TextView textView, int i7, int i8, int i9, int i10) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }

        /* JADX INFO: renamed from: c */
        static void m9624c(TextView textView, int[] iArr, int i7) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
        }

        /* JADX INFO: renamed from: d */
        static boolean m9625d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.A$e */
    static class e {
        /* JADX INFO: renamed from: a */
        static Typeface m9626a(Typeface typeface, int i7, boolean z7) {
            return Typeface.create(typeface, i7, z7);
        }
    }

    C2289A(TextView textView) {
        this.f7773a = textView;
        this.f7781i = new C2304C(textView);
    }

    /* JADX INFO: renamed from: B */
    private void m9591B(int i7, float f7) {
        this.f7781i.m9736t(i7, f7);
    }

    /* JADX INFO: renamed from: C */
    private void m9592C(Context context, C2348d0 c2348d0) {
        String strM10040o;
        this.f7782j = c2348d0.m10036k(AbstractC5529j.f21137E2, this.f7782j);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            int iM10036k = c2348d0.m10036k(AbstractC5529j.f21176N2, -1);
            this.f7783k = iM10036k;
            if (iM10036k != -1) {
                this.f7782j &= 2;
            }
        }
        int i8 = AbstractC5529j.f21172M2;
        if (!c2348d0.m10044s(i8) && !c2348d0.m10044s(AbstractC5529j.f21180O2)) {
            int i9 = AbstractC5529j.f21132D2;
            if (c2348d0.m10044s(i9)) {
                this.f7785m = false;
                int iM10036k2 = c2348d0.m10036k(i9, 1);
                if (iM10036k2 == 1) {
                    this.f7784l = Typeface.SANS_SERIF;
                    return;
                } else if (iM10036k2 == 2) {
                    this.f7784l = Typeface.SERIF;
                    return;
                } else {
                    if (iM10036k2 != 3) {
                        return;
                    }
                    this.f7784l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f7784l = null;
        int i10 = AbstractC5529j.f21180O2;
        if (c2348d0.m10044s(i10)) {
            i8 = i10;
        }
        int i11 = this.f7783k;
        int i12 = this.f7782j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM10035j = c2348d0.m10035j(i8, this.f7782j, new a(i11, i12, new WeakReference(this.f7773a)));
                if (typefaceM10035j != null) {
                    if (i7 < 28 || this.f7783k == -1) {
                        this.f7784l = typefaceM10035j;
                    } else {
                        this.f7784l = e.m9626a(Typeface.create(typefaceM10035j, 0), this.f7783k, (this.f7782j & 2) != 0);
                    }
                }
                this.f7785m = this.f7784l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f7784l != null || (strM10040o = c2348d0.m10040o(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f7783k == -1) {
            this.f7784l = Typeface.create(strM10040o, this.f7782j);
        } else {
            this.f7784l = e.m9626a(Typeface.create(strM10040o, 0), this.f7783k, (this.f7782j & 2) != 0);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9593a(Drawable drawable, C2344b0 c2344b0) {
        if (drawable == null || c2344b0 == null) {
            return;
        }
        C2359j.m10091i(drawable, c2344b0, this.f7773a.getDrawableState());
    }

    /* JADX INFO: renamed from: d */
    private static C2344b0 m9594d(Context context, C2359j c2359j, int i7) {
        ColorStateList colorStateListM10094f = c2359j.m10094f(context, i7);
        if (colorStateListM10094f == null) {
            return null;
        }
        C2344b0 c2344b0 = new C2344b0();
        c2344b0.f8182d = true;
        c2344b0.f8179a = colorStateListM10094f;
        return c2344b0;
    }

    /* JADX INFO: renamed from: y */
    private void m9595y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f7773a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f7773a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f7773a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f7773a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f7773a.getCompoundDrawables();
        TextView textView2 = this.f7773a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: z */
    private void m9596z() {
        C2344b0 c2344b0 = this.f7780h;
        this.f7774b = c2344b0;
        this.f7775c = c2344b0;
        this.f7776d = c2344b0;
        this.f7777e = c2344b0;
        this.f7778f = c2344b0;
        this.f7779g = c2344b0;
    }

    /* JADX INFO: renamed from: A */
    void m9597A(int i7, float f7) {
        if (AbstractC2362k0.f8292c || m9607l()) {
            return;
        }
        m9591B(i7, f7);
    }

    /* JADX INFO: renamed from: b */
    void m9598b() {
        if (this.f7774b != null || this.f7775c != null || this.f7776d != null || this.f7777e != null) {
            Drawable[] compoundDrawables = this.f7773a.getCompoundDrawables();
            m9593a(compoundDrawables[0], this.f7774b);
            m9593a(compoundDrawables[1], this.f7775c);
            m9593a(compoundDrawables[2], this.f7776d);
            m9593a(compoundDrawables[3], this.f7777e);
        }
        if (this.f7778f == null && this.f7779g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f7773a.getCompoundDrawablesRelative();
        m9593a(compoundDrawablesRelative[0], this.f7778f);
        m9593a(compoundDrawablesRelative[2], this.f7779g);
    }

    /* JADX INFO: renamed from: c */
    void m9599c() {
        this.f7781i.m9723a();
    }

    /* JADX INFO: renamed from: e */
    int m9600e() {
        return this.f7781i.m9725f();
    }

    /* JADX INFO: renamed from: f */
    int m9601f() {
        return this.f7781i.m9726g();
    }

    /* JADX INFO: renamed from: g */
    int m9602g() {
        return this.f7781i.m9727h();
    }

    /* JADX INFO: renamed from: h */
    int[] m9603h() {
        return this.f7781i.m9728i();
    }

    /* JADX INFO: renamed from: i */
    int m9604i() {
        return this.f7781i.m9729j();
    }

    /* JADX INFO: renamed from: j */
    ColorStateList m9605j() {
        C2344b0 c2344b0 = this.f7780h;
        if (c2344b0 != null) {
            return c2344b0.f8179a;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    PorterDuff.Mode m9606k() {
        C2344b0 c2344b0 = this.f7780h;
        if (c2344b0 != null) {
            return c2344b0.f8180b;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    boolean m9607l() {
        return this.f7781i.m9731n();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    /* JADX INFO: renamed from: m */
    void m9608m(AttributeSet attributeSet, int i7) {
        boolean zM10026a;
        boolean z7;
        String strM10040o;
        String strM10040o2;
        int iM4142a;
        float fM10031f;
        Context context = this.f7773a.getContext();
        C2359j c2359jM10088b = C2359j.m10088b();
        int[] iArr = AbstractC5529j.f21217Y;
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, iArr, i7, 0);
        TextView textView = this.f7773a;
        AbstractC1030Z.m4470h0(textView, textView.getContext(), iArr, attributeSet, c2348d0M10025v.m10043r(), i7, 0);
        int iM10039n = c2348d0M10025v.m10039n(AbstractC5529j.f21221Z, -1);
        int i8 = AbstractC5529j.f21236c0;
        if (c2348d0M10025v.m10044s(i8)) {
            this.f7774b = m9594d(context, c2359jM10088b, c2348d0M10025v.m10039n(i8, 0));
        }
        int i9 = AbstractC5529j.f21226a0;
        if (c2348d0M10025v.m10044s(i9)) {
            this.f7775c = m9594d(context, c2359jM10088b, c2348d0M10025v.m10039n(i9, 0));
        }
        int i10 = AbstractC5529j.f21241d0;
        if (c2348d0M10025v.m10044s(i10)) {
            this.f7776d = m9594d(context, c2359jM10088b, c2348d0M10025v.m10039n(i10, 0));
        }
        int i11 = AbstractC5529j.f21231b0;
        if (c2348d0M10025v.m10044s(i11)) {
            this.f7777e = m9594d(context, c2359jM10088b, c2348d0M10025v.m10039n(i11, 0));
        }
        int i12 = AbstractC5529j.f21246e0;
        if (c2348d0M10025v.m10044s(i12)) {
            this.f7778f = m9594d(context, c2359jM10088b, c2348d0M10025v.m10039n(i12, 0));
        }
        int i13 = AbstractC5529j.f21251f0;
        if (c2348d0M10025v.m10044s(i13)) {
            this.f7779g = m9594d(context, c2359jM10088b, c2348d0M10025v.m10039n(i13, 0));
        }
        c2348d0M10025v.m10046x();
        boolean z8 = this.f7773a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z9 = true;
        if (iM10039n != -1) {
            C2348d0 c2348d0M10023t = C2348d0.m10023t(context, iM10039n, AbstractC5529j.f21122B2);
            if (z8) {
                zM10026a = false;
                z7 = false;
            } else {
                int i14 = AbstractC5529j.f21188Q2;
                if (c2348d0M10023t.m10044s(i14)) {
                    zM10026a = c2348d0M10023t.m10026a(i14, false);
                    z7 = true;
                } else {
                    zM10026a = false;
                    z7 = false;
                }
            }
            m9592C(context, c2348d0M10023t);
            int i15 = AbstractC5529j.f21192R2;
            strM10040o = c2348d0M10023t.m10044s(i15) ? c2348d0M10023t.m10040o(i15) : null;
            int i16 = AbstractC5529j.f21184P2;
            strM10040o2 = c2348d0M10023t.m10044s(i16) ? c2348d0M10023t.m10040o(i16) : null;
            c2348d0M10023t.m10046x();
        } else {
            zM10026a = false;
            z7 = false;
            strM10040o = null;
            strM10040o2 = null;
        }
        C2348d0 c2348d0M10025v2 = C2348d0.m10025v(context, attributeSet, AbstractC5529j.f21122B2, i7, 0);
        if (z8) {
            z9 = z7;
        } else {
            int i17 = AbstractC5529j.f21188Q2;
            if (c2348d0M10025v2.m10044s(i17)) {
                zM10026a = c2348d0M10025v2.m10026a(i17, false);
            } else {
                z9 = z7;
            }
        }
        int i18 = Build.VERSION.SDK_INT;
        int i19 = AbstractC5529j.f21192R2;
        if (c2348d0M10025v2.m10044s(i19)) {
            strM10040o = c2348d0M10025v2.m10040o(i19);
        }
        int i20 = AbstractC5529j.f21184P2;
        if (c2348d0M10025v2.m10044s(i20)) {
            strM10040o2 = c2348d0M10025v2.m10040o(i20);
        }
        if (i18 >= 28) {
            int i21 = AbstractC5529j.f21127C2;
            if (c2348d0M10025v2.m10044s(i21) && c2348d0M10025v2.m10031f(i21, -1) == 0) {
                this.f7773a.setTextSize(0, 0.0f);
            }
        }
        m9592C(context, c2348d0M10025v2);
        c2348d0M10025v2.m10046x();
        if (!z8 && z9) {
            m9614s(zM10026a);
        }
        Typeface typeface = this.f7784l;
        if (typeface != null) {
            if (this.f7783k == -1) {
                this.f7773a.setTypeface(typeface, this.f7782j);
            } else {
                this.f7773a.setTypeface(typeface);
            }
        }
        if (strM10040o2 != null) {
            d.m9625d(this.f7773a, strM10040o2);
        }
        if (strM10040o != null) {
            c.m9621b(this.f7773a, c.m9620a(strM10040o));
        }
        this.f7781i.m9732o(attributeSet, i7);
        if (AbstractC2362k0.f8292c && this.f7781i.m9729j() != 0) {
            int[] iArrM9728i = this.f7781i.m9728i();
            if (iArrM9728i.length > 0) {
                if (d.m9622a(this.f7773a) != -1.0f) {
                    d.m9623b(this.f7773a, this.f7781i.m9726g(), this.f7781i.m9725f(), this.f7781i.m9727h(), 0);
                } else {
                    d.m9624c(this.f7773a, iArrM9728i, 0);
                }
            }
        }
        C2348d0 c2348d0M10024u = C2348d0.m10024u(context, attributeSet, AbstractC5529j.f21256g0);
        int iM10039n2 = c2348d0M10024u.m10039n(AbstractC5529j.f21296o0, -1);
        Drawable drawableM10092c = iM10039n2 != -1 ? c2359jM10088b.m10092c(context, iM10039n2) : null;
        int iM10039n3 = c2348d0M10024u.m10039n(AbstractC5529j.f21321t0, -1);
        Drawable drawableM10092c2 = iM10039n3 != -1 ? c2359jM10088b.m10092c(context, iM10039n3) : null;
        int iM10039n4 = c2348d0M10024u.m10039n(AbstractC5529j.f21301p0, -1);
        Drawable drawableM10092c3 = iM10039n4 != -1 ? c2359jM10088b.m10092c(context, iM10039n4) : null;
        int iM10039n5 = c2348d0M10024u.m10039n(AbstractC5529j.f21286m0, -1);
        Drawable drawableM10092c4 = iM10039n5 != -1 ? c2359jM10088b.m10092c(context, iM10039n5) : null;
        int iM10039n6 = c2348d0M10024u.m10039n(AbstractC5529j.f21306q0, -1);
        Drawable drawableM10092c5 = iM10039n6 != -1 ? c2359jM10088b.m10092c(context, iM10039n6) : null;
        int iM10039n7 = c2348d0M10024u.m10039n(AbstractC5529j.f21291n0, -1);
        m9595y(drawableM10092c, drawableM10092c2, drawableM10092c3, drawableM10092c4, drawableM10092c5, iM10039n7 != -1 ? c2359jM10088b.m10092c(context, iM10039n7) : null);
        int i22 = AbstractC5529j.f21311r0;
        if (c2348d0M10024u.m10044s(i22)) {
            AbstractC2458i.m10755f(this.f7773a, c2348d0M10024u.m10028c(i22));
        }
        int i23 = AbstractC5529j.f21316s0;
        if (c2348d0M10024u.m10044s(i23)) {
            AbstractC2458i.m10756g(this.f7773a, AbstractC2315M.m9771e(c2348d0M10024u.m10036k(i23, -1), null));
        }
        int iM10031f = c2348d0M10024u.m10031f(AbstractC5529j.f21331v0, -1);
        int iM10031f2 = c2348d0M10024u.m10031f(AbstractC5529j.f21336w0, -1);
        int i24 = AbstractC5529j.f21341x0;
        if (c2348d0M10024u.m10044s(i24)) {
            TypedValue typedValueM10045w = c2348d0M10024u.m10045w(i24);
            if (typedValueM10045w == null || typedValueM10045w.type != 5) {
                fM10031f = c2348d0M10024u.m10031f(i24, -1);
                iM4142a = -1;
            } else {
                iM4142a = AbstractC0912i.m4142a(typedValueM10045w.data);
                fM10031f = TypedValue.complexToFloat(typedValueM10045w.data);
            }
        } else {
            iM4142a = -1;
            fM10031f = -1.0f;
        }
        c2348d0M10024u.m10046x();
        if (iM10031f != -1) {
            AbstractC2458i.m10757h(this.f7773a, iM10031f);
        }
        if (iM10031f2 != -1) {
            AbstractC2458i.m10758i(this.f7773a, iM10031f2);
        }
        if (fM10031f != -1.0f) {
            if (iM4142a == -1) {
                AbstractC2458i.m10759j(this.f7773a, (int) fM10031f);
            } else {
                AbstractC2458i.m10760k(this.f7773a, iM4142a, fM10031f);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    void m9609n(WeakReference weakReference, Typeface typeface) {
        if (this.f7785m) {
            this.f7784l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f7782j));
                } else {
                    textView.setTypeface(typeface, this.f7782j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    void m9610o(boolean z7, int i7, int i8, int i9, int i10) {
        if (AbstractC2362k0.f8292c) {
            return;
        }
        m9599c();
    }

    /* JADX INFO: renamed from: p */
    void m9611p() {
        m9598b();
    }

    /* JADX INFO: renamed from: q */
    void m9612q(Context context, int i7) {
        String strM10040o;
        C2348d0 c2348d0M10023t = C2348d0.m10023t(context, i7, AbstractC5529j.f21122B2);
        int i8 = AbstractC5529j.f21188Q2;
        if (c2348d0M10023t.m10044s(i8)) {
            m9614s(c2348d0M10023t.m10026a(i8, false));
        }
        int i9 = AbstractC5529j.f21127C2;
        if (c2348d0M10023t.m10044s(i9) && c2348d0M10023t.m10031f(i9, -1) == 0) {
            this.f7773a.setTextSize(0, 0.0f);
        }
        m9592C(context, c2348d0M10023t);
        int i10 = AbstractC5529j.f21184P2;
        if (c2348d0M10023t.m10044s(i10) && (strM10040o = c2348d0M10023t.m10040o(i10)) != null) {
            d.m9625d(this.f7773a, strM10040o);
        }
        c2348d0M10023t.m10046x();
        Typeface typeface = this.f7784l;
        if (typeface != null) {
            this.f7773a.setTypeface(typeface, this.f7782j);
        }
    }

    /* JADX INFO: renamed from: r */
    void m9613r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        AbstractC1241a.m5470e(editorInfo, textView.getText());
    }

    /* JADX INFO: renamed from: s */
    void m9614s(boolean z7) {
        this.f7773a.setAllCaps(z7);
    }

    /* JADX INFO: renamed from: t */
    void m9615t(int i7, int i8, int i9, int i10) {
        this.f7781i.m9733p(i7, i8, i9, i10);
    }

    /* JADX INFO: renamed from: u */
    void m9616u(int[] iArr, int i7) {
        this.f7781i.m9734q(iArr, i7);
    }

    /* JADX INFO: renamed from: v */
    void m9617v(int i7) {
        this.f7781i.m9735r(i7);
    }

    /* JADX INFO: renamed from: w */
    void m9618w(ColorStateList colorStateList) {
        if (this.f7780h == null) {
            this.f7780h = new C2344b0();
        }
        C2344b0 c2344b0 = this.f7780h;
        c2344b0.f8179a = colorStateList;
        c2344b0.f8182d = colorStateList != null;
        m9596z();
    }

    /* JADX INFO: renamed from: x */
    void m9619x(PorterDuff.Mode mode) {
        if (this.f7780h == null) {
            this.f7780h = new C2344b0();
        }
        C2344b0 c2344b0 = this.f7780h;
        c2344b0.f8180b = mode;
        c2344b0.f8181c = mode != null;
        m9596z();
    }
}
