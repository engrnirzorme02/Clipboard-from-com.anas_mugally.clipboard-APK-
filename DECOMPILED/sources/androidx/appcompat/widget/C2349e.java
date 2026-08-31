package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p111O.AbstractC1030Z;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.widget.e */
/* JADX INFO: loaded from: classes.dex */
class C2349e {

    /* JADX INFO: renamed from: a */
    private final View f8221a;

    /* JADX INFO: renamed from: d */
    private C2344b0 f8224d;

    /* JADX INFO: renamed from: e */
    private C2344b0 f8225e;

    /* JADX INFO: renamed from: f */
    private C2344b0 f8226f;

    /* JADX INFO: renamed from: c */
    private int f8223c = -1;

    /* JADX INFO: renamed from: b */
    private final C2359j f8222b = C2359j.m10088b();

    C2349e(View view) {
        this.f8221a = view;
    }

    /* JADX INFO: renamed from: a */
    private boolean m10047a(Drawable drawable) {
        if (this.f8226f == null) {
            this.f8226f = new C2344b0();
        }
        C2344b0 c2344b0 = this.f8226f;
        c2344b0.m9999a();
        ColorStateList colorStateListM4489r = AbstractC1030Z.m4489r(this.f8221a);
        if (colorStateListM4489r != null) {
            c2344b0.f8182d = true;
            c2344b0.f8179a = colorStateListM4489r;
        }
        PorterDuff.Mode modeM4491s = AbstractC1030Z.m4491s(this.f8221a);
        if (modeM4491s != null) {
            c2344b0.f8181c = true;
            c2344b0.f8180b = modeM4491s;
        }
        if (!c2344b0.f8182d && !c2344b0.f8181c) {
            return false;
        }
        C2359j.m10091i(drawable, c2344b0, this.f8221a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: k */
    private boolean m10048k() {
        return this.f8224d != null;
    }

    /* JADX INFO: renamed from: b */
    void m10049b() {
        Drawable background = this.f8221a.getBackground();
        if (background != null) {
            if (m10048k() && m10047a(background)) {
                return;
            }
            C2344b0 c2344b0 = this.f8225e;
            if (c2344b0 != null) {
                C2359j.m10091i(background, c2344b0, this.f8221a.getDrawableState());
                return;
            }
            C2344b0 c2344b1 = this.f8224d;
            if (c2344b1 != null) {
                C2359j.m10091i(background, c2344b1, this.f8221a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    ColorStateList m10050c() {
        C2344b0 c2344b0 = this.f8225e;
        if (c2344b0 != null) {
            return c2344b0.f8179a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    PorterDuff.Mode m10051d() {
        C2344b0 c2344b0 = this.f8225e;
        if (c2344b0 != null) {
            return c2344b0.f8180b;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    void m10052e(AttributeSet attributeSet, int i7) {
        Context context = this.f8221a.getContext();
        int[] iArr = AbstractC5529j.f21354z3;
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, iArr, i7, 0);
        View view = this.f8221a;
        AbstractC1030Z.m4470h0(view, view.getContext(), iArr, attributeSet, c2348d0M10025v.m10043r(), i7, 0);
        try {
            int i8 = AbstractC5529j.f21118A3;
            if (c2348d0M10025v.m10044s(i8)) {
                this.f8223c = c2348d0M10025v.m10039n(i8, -1);
                ColorStateList colorStateListM10094f = this.f8222b.m10094f(this.f8221a.getContext(), this.f8223c);
                if (colorStateListM10094f != null) {
                    m10055h(colorStateListM10094f);
                }
            }
            int i9 = AbstractC5529j.f21123B3;
            if (c2348d0M10025v.m10044s(i9)) {
                AbstractC1030Z.m4482n0(this.f8221a, c2348d0M10025v.m10028c(i9));
            }
            int i10 = AbstractC5529j.f21128C3;
            if (c2348d0M10025v.m10044s(i10)) {
                AbstractC1030Z.m4484o0(this.f8221a, AbstractC2315M.m9771e(c2348d0M10025v.m10036k(i10, -1), null));
            }
        } finally {
            c2348d0M10025v.m10046x();
        }
    }

    /* JADX INFO: renamed from: f */
    void m10053f(Drawable drawable) {
        this.f8223c = -1;
        m10055h(null);
        m10049b();
    }

    /* JADX INFO: renamed from: g */
    void m10054g(int i7) {
        this.f8223c = i7;
        C2359j c2359j = this.f8222b;
        m10055h(c2359j != null ? c2359j.m10094f(this.f8221a.getContext(), i7) : null);
        m10049b();
    }

    /* JADX INFO: renamed from: h */
    void m10055h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f8224d == null) {
                this.f8224d = new C2344b0();
            }
            C2344b0 c2344b0 = this.f8224d;
            c2344b0.f8179a = colorStateList;
            c2344b0.f8182d = true;
        } else {
            this.f8224d = null;
        }
        m10049b();
    }

    /* JADX INFO: renamed from: i */
    void m10056i(ColorStateList colorStateList) {
        if (this.f8225e == null) {
            this.f8225e = new C2344b0();
        }
        C2344b0 c2344b0 = this.f8225e;
        c2344b0.f8179a = colorStateList;
        c2344b0.f8182d = true;
        m10049b();
    }

    /* JADX INFO: renamed from: j */
    void m10057j(PorterDuff.Mode mode) {
        if (this.f8225e == null) {
            this.f8225e = new C2344b0();
        }
        C2344b0 c2344b0 = this.f8225e;
        c2344b0.f8180b = mode;
        c2344b0.f8181c = true;
        m10049b();
    }
}
