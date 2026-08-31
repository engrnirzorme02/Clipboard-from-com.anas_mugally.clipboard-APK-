package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.AbstractC2454e;
import p111O.AbstractC1030Z;
import p255h.AbstractC5529j;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: androidx.appcompat.widget.p */
/* JADX INFO: loaded from: classes.dex */
public class C2367p {

    /* JADX INFO: renamed from: a */
    private final ImageView f8300a;

    /* JADX INFO: renamed from: b */
    private C2344b0 f8301b;

    /* JADX INFO: renamed from: c */
    private C2344b0 f8302c;

    /* JADX INFO: renamed from: d */
    private C2344b0 f8303d;

    /* JADX INFO: renamed from: e */
    private int f8304e = 0;

    public C2367p(ImageView imageView) {
        this.f8300a = imageView;
    }

    /* JADX INFO: renamed from: a */
    private boolean m10127a(Drawable drawable) {
        if (this.f8303d == null) {
            this.f8303d = new C2344b0();
        }
        C2344b0 c2344b0 = this.f8303d;
        c2344b0.m9999a();
        ColorStateList colorStateListM10736a = AbstractC2454e.m10736a(this.f8300a);
        if (colorStateListM10736a != null) {
            c2344b0.f8182d = true;
            c2344b0.f8179a = colorStateListM10736a;
        }
        PorterDuff.Mode modeM10737b = AbstractC2454e.m10737b(this.f8300a);
        if (modeM10737b != null) {
            c2344b0.f8181c = true;
            c2344b0.f8180b = modeM10737b;
        }
        if (!c2344b0.f8182d && !c2344b0.f8181c) {
            return false;
        }
        C2359j.m10091i(drawable, c2344b0, this.f8300a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: l */
    private boolean m10128l() {
        return this.f8301b != null;
    }

    /* JADX INFO: renamed from: b */
    void m10129b() {
        if (this.f8300a.getDrawable() != null) {
            this.f8300a.getDrawable().setLevel(this.f8304e);
        }
    }

    /* JADX INFO: renamed from: c */
    void m10130c() {
        Drawable drawable = this.f8300a.getDrawable();
        if (drawable != null) {
            AbstractC2315M.m9768b(drawable);
        }
        if (drawable != null) {
            if (m10128l() && m10127a(drawable)) {
                return;
            }
            C2344b0 c2344b0 = this.f8302c;
            if (c2344b0 != null) {
                C2359j.m10091i(drawable, c2344b0, this.f8300a.getDrawableState());
                return;
            }
            C2344b0 c2344b1 = this.f8301b;
            if (c2344b1 != null) {
                C2359j.m10091i(drawable, c2344b1, this.f8300a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    ColorStateList m10131d() {
        C2344b0 c2344b0 = this.f8302c;
        if (c2344b0 != null) {
            return c2344b0.f8179a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    PorterDuff.Mode m10132e() {
        C2344b0 c2344b0 = this.f8302c;
        if (c2344b0 != null) {
            return c2344b0.f8180b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    boolean m10133f() {
        return !(this.f8300a.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: g */
    public void m10134g(AttributeSet attributeSet, int i7) {
        int iM10039n;
        Context context = this.f8300a.getContext();
        int[] iArr = AbstractC5529j.f21181P;
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, iArr, i7, 0);
        ImageView imageView = this.f8300a;
        AbstractC1030Z.m4470h0(imageView, imageView.getContext(), iArr, attributeSet, c2348d0M10025v.m10043r(), i7, 0);
        try {
            Drawable drawable = this.f8300a.getDrawable();
            if (drawable == null && (iM10039n = c2348d0M10025v.m10039n(AbstractC5529j.f21185Q, -1)) != -1 && (drawable = AbstractC5659a.m25175b(this.f8300a.getContext(), iM10039n)) != null) {
                this.f8300a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC2315M.m9768b(drawable);
            }
            int i8 = AbstractC5529j.f21189R;
            if (c2348d0M10025v.m10044s(i8)) {
                AbstractC2454e.m10738c(this.f8300a, c2348d0M10025v.m10028c(i8));
            }
            int i9 = AbstractC5529j.f21193S;
            if (c2348d0M10025v.m10044s(i9)) {
                AbstractC2454e.m10739d(this.f8300a, AbstractC2315M.m9771e(c2348d0M10025v.m10036k(i9, -1), null));
            }
        } finally {
            c2348d0M10025v.m10046x();
        }
    }

    /* JADX INFO: renamed from: h */
    void m10135h(Drawable drawable) {
        this.f8304e = drawable.getLevel();
    }

    /* JADX INFO: renamed from: i */
    public void m10136i(int i7) {
        if (i7 != 0) {
            Drawable drawableM25175b = AbstractC5659a.m25175b(this.f8300a.getContext(), i7);
            if (drawableM25175b != null) {
                AbstractC2315M.m9768b(drawableM25175b);
            }
            this.f8300a.setImageDrawable(drawableM25175b);
        } else {
            this.f8300a.setImageDrawable(null);
        }
        m10130c();
    }

    /* JADX INFO: renamed from: j */
    void m10137j(ColorStateList colorStateList) {
        if (this.f8302c == null) {
            this.f8302c = new C2344b0();
        }
        C2344b0 c2344b0 = this.f8302c;
        c2344b0.f8179a = colorStateList;
        c2344b0.f8182d = true;
        m10130c();
    }

    /* JADX INFO: renamed from: k */
    void m10138k(PorterDuff.Mode mode) {
        if (this.f8302c == null) {
            this.f8302c = new C2344b0();
        }
        C2344b0 c2344b0 = this.f8302c;
        c2344b0.f8180b = mode;
        c2344b0.f8181c = true;
        m10130c();
    }
}
