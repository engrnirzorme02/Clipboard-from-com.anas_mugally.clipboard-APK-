package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.internal.AbstractC4546v;
import p045F3.AbstractC0423c;
import p053G3.AbstractC0481a;
import p069I3.C0622i;
import p069I3.C0627n;
import p069I3.C0635v;
import p069I3.InterfaceC0630q;
import p224d0.C5208l;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6752m;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: com.google.android.material.button.e */
/* JADX INFO: loaded from: classes2.dex */
class C4439e {

    /* JADX INFO: renamed from: a */
    private final MaterialButton f16601a;

    /* JADX INFO: renamed from: b */
    private C0627n f16602b;

    /* JADX INFO: renamed from: c */
    private C0635v f16603c;

    /* JADX INFO: renamed from: d */
    private C5208l f16604d;

    /* JADX INFO: renamed from: e */
    private C0622i.d f16605e;

    /* JADX INFO: renamed from: f */
    private int f16606f;

    /* JADX INFO: renamed from: g */
    private int f16607g;

    /* JADX INFO: renamed from: h */
    private int f16608h;

    /* JADX INFO: renamed from: i */
    private int f16609i;

    /* JADX INFO: renamed from: j */
    private int f16610j;

    /* JADX INFO: renamed from: k */
    private int f16611k;

    /* JADX INFO: renamed from: l */
    private PorterDuff.Mode f16612l;

    /* JADX INFO: renamed from: m */
    private ColorStateList f16613m;

    /* JADX INFO: renamed from: n */
    private ColorStateList f16614n;

    /* JADX INFO: renamed from: o */
    private ColorStateList f16615o;

    /* JADX INFO: renamed from: p */
    private Drawable f16616p;

    /* JADX INFO: renamed from: t */
    private boolean f16620t;

    /* JADX INFO: renamed from: v */
    private LayerDrawable f16622v;

    /* JADX INFO: renamed from: w */
    private int f16623w;

    /* JADX INFO: renamed from: q */
    private boolean f16617q = false;

    /* JADX INFO: renamed from: r */
    private boolean f16618r = false;

    /* JADX INFO: renamed from: s */
    private boolean f16619s = false;

    /* JADX INFO: renamed from: u */
    private boolean f16621u = true;

    C4439e(MaterialButton materialButton, C0627n c0627n) {
        this.f16601a = materialButton;
        this.f16602b = c0627n;
    }

    /* JADX INFO: renamed from: L */
    private void m19766L(int i7, int i8) {
        int paddingStart = this.f16601a.getPaddingStart();
        int paddingTop = this.f16601a.getPaddingTop();
        int paddingEnd = this.f16601a.getPaddingEnd();
        int paddingBottom = this.f16601a.getPaddingBottom();
        int i9 = this.f16608h;
        int i10 = this.f16609i;
        this.f16609i = i8;
        this.f16608h = i7;
        if (!this.f16618r) {
            m19767M();
        }
        this.f16601a.setPaddingRelative(paddingStart, (paddingTop + i7) - i9, paddingEnd, (paddingBottom + i8) - i10);
    }

    /* JADX INFO: renamed from: M */
    private void m19767M() {
        this.f16601a.setInternalBackground(m19771a());
        C0622i c0622iM19790g = m19790g();
        if (c0622iM19790g != null) {
            c0622iM19790g.m2717f0(this.f16623w);
            c0622iM19790g.setState(this.f16601a.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: N */
    private void m19768N() {
        C0622i c0622iM19790g = m19790g();
        if (c0622iM19790g != null) {
            C0635v c0635v = this.f16603c;
            if (c0635v != null) {
                c0622iM19790g.m2727o0(c0635v);
            } else {
                c0622iM19790g.setShapeAppearanceModel(this.f16602b);
            }
            C5208l c5208l = this.f16604d;
            if (c5208l != null) {
                c0622iM19790g.m2716e0(c5208l);
            }
        }
        C0622i c0622iM19773p = m19773p();
        if (c0622iM19773p != null) {
            C0635v c0635v2 = this.f16603c;
            if (c0635v2 != null) {
                c0622iM19773p.m2727o0(c0635v2);
            } else {
                c0622iM19773p.setShapeAppearanceModel(this.f16602b);
            }
            C5208l c5208l2 = this.f16604d;
            if (c5208l2 != null) {
                c0622iM19773p.m2716e0(c5208l2);
            }
        }
        InterfaceC0630q interfaceC0630qM19789f = m19789f();
        if (interfaceC0630qM19789f != null) {
            interfaceC0630qM19789f.setShapeAppearanceModel(this.f16602b);
            if (interfaceC0630qM19789f instanceof C0622i) {
                C0622i c0622i = (C0622i) interfaceC0630qM19789f;
                C0635v c0635v3 = this.f16603c;
                if (c0635v3 != null) {
                    c0622i.m2727o0(c0635v3);
                }
                C5208l c5208l3 = this.f16604d;
                if (c5208l3 != null) {
                    c0622i.m2716e0(c5208l3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    private void m19769O() {
        C0622i c0622iM19790g = m19790g();
        C0622i c0622iM19773p = m19773p();
        if (c0622iM19790g != null) {
            c0622iM19790g.m2730q0(this.f16611k, this.f16614n);
            if (c0622iM19773p != null) {
                c0622iM19773p.m2728p0(this.f16611k, this.f16617q ? AbstractC7539a.m33173d(this.f16601a, AbstractC6742c.f26262k) : 0);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    private InsetDrawable m19770P(Drawable drawable) {
        return new InsetDrawable(drawable, this.f16606f, this.f16608h, this.f16607g, this.f16609i);
    }

    /* JADX INFO: renamed from: a */
    private Drawable m19771a() {
        C0622i c0622i = new C0622i(this.f16602b);
        C0635v c0635v = this.f16603c;
        if (c0635v != null) {
            c0622i.m2727o0(c0635v);
        }
        C5208l c5208l = this.f16604d;
        if (c5208l != null) {
            c0622i.m2716e0(c5208l);
        }
        C0622i.d dVar = this.f16605e;
        if (dVar != null) {
            c0622i.m2720i0(dVar);
        }
        c0622i.m2710U(this.f16601a.getContext());
        c0622i.setTintList(this.f16613m);
        PorterDuff.Mode mode = this.f16612l;
        if (mode != null) {
            c0622i.setTintMode(mode);
        }
        c0622i.m2730q0(this.f16611k, this.f16614n);
        C0622i c0622i2 = new C0622i(this.f16602b);
        C0635v c0635v2 = this.f16603c;
        if (c0635v2 != null) {
            c0622i2.m2727o0(c0635v2);
        }
        C5208l c5208l2 = this.f16604d;
        if (c5208l2 != null) {
            c0622i2.m2716e0(c5208l2);
        }
        c0622i2.setTint(0);
        c0622i2.m2728p0(this.f16611k, this.f16617q ? AbstractC7539a.m33173d(this.f16601a, AbstractC6742c.f26262k) : 0);
        C0622i c0622i3 = new C0622i(this.f16602b);
        this.f16616p = c0622i3;
        C0635v c0635v3 = this.f16603c;
        if (c0635v3 != null) {
            c0622i3.m2727o0(c0635v3);
        }
        C5208l c5208l3 = this.f16604d;
        if (c5208l3 != null) {
            ((C0622i) this.f16616p).m2716e0(c5208l3);
        }
        this.f16616p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC0481a.m2065d(this.f16615o), m19770P(new LayerDrawable(new Drawable[]{c0622i2, c0622i})), this.f16616p);
        this.f16622v = rippleDrawable;
        return rippleDrawable;
    }

    /* JADX INFO: renamed from: h */
    private C0622i m19772h(boolean z7) {
        LayerDrawable layerDrawable = this.f16622v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C0622i) ((LayerDrawable) ((InsetDrawable) this.f16622v.getDrawable(0)).getDrawable()).getDrawable(!z7 ? 1 : 0);
    }

    /* JADX INFO: renamed from: p */
    private C0622i m19773p() {
        return m19772h(true);
    }

    /* JADX INFO: renamed from: A */
    public void m19774A(int i7) {
        m19766L(this.f16608h, i7);
    }

    /* JADX INFO: renamed from: B */
    public void m19775B(int i7) {
        m19766L(i7, this.f16609i);
    }

    /* JADX INFO: renamed from: C */
    void m19776C(ColorStateList colorStateList) {
        if (this.f16615o != colorStateList) {
            this.f16615o = colorStateList;
            if (this.f16601a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f16601a.getBackground()).setColor(AbstractC0481a.m2065d(colorStateList));
            }
        }
    }

    /* JADX INFO: renamed from: D */
    void m19777D(C0627n c0627n) {
        this.f16602b = c0627n;
        this.f16603c = null;
        m19768N();
    }

    /* JADX INFO: renamed from: E */
    void m19778E(boolean z7) {
        this.f16617q = z7;
        m19769O();
    }

    /* JADX INFO: renamed from: F */
    void m19779F(C0635v c0635v) {
        this.f16603c = c0635v;
        m19768N();
    }

    /* JADX INFO: renamed from: G */
    void m19780G(ColorStateList colorStateList) {
        if (this.f16614n != colorStateList) {
            this.f16614n = colorStateList;
            m19769O();
        }
    }

    /* JADX INFO: renamed from: H */
    void m19781H(int i7) {
        if (this.f16611k != i7) {
            this.f16611k = i7;
            m19769O();
        }
    }

    /* JADX INFO: renamed from: I */
    void m19782I(ColorStateList colorStateList) {
        if (this.f16613m != colorStateList) {
            this.f16613m = colorStateList;
            if (m19790g() != null) {
                m19790g().setTintList(this.f16613m);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    void m19783J(PorterDuff.Mode mode) {
        if (this.f16612l != mode) {
            this.f16612l = mode;
            if (m19790g() == null || this.f16612l == null) {
                return;
            }
            m19790g().setTintMode(this.f16612l);
        }
    }

    /* JADX INFO: renamed from: K */
    void m19784K(boolean z7) {
        this.f16621u = z7;
    }

    /* JADX INFO: renamed from: b */
    int m19785b() {
        return this.f16610j;
    }

    /* JADX INFO: renamed from: c */
    C5208l m19786c() {
        return this.f16604d;
    }

    /* JADX INFO: renamed from: d */
    public int m19787d() {
        return this.f16609i;
    }

    /* JADX INFO: renamed from: e */
    public int m19788e() {
        return this.f16608h;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0630q m19789f() {
        LayerDrawable layerDrawable = this.f16622v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f16622v.getNumberOfLayers() > 2 ? (InterfaceC0630q) this.f16622v.getDrawable(2) : (InterfaceC0630q) this.f16622v.getDrawable(1);
    }

    /* JADX INFO: renamed from: g */
    C0622i m19790g() {
        return m19772h(false);
    }

    /* JADX INFO: renamed from: i */
    ColorStateList m19791i() {
        return this.f16615o;
    }

    /* JADX INFO: renamed from: j */
    C0627n m19792j() {
        return this.f16602b;
    }

    /* JADX INFO: renamed from: k */
    C0635v m19793k() {
        return this.f16603c;
    }

    /* JADX INFO: renamed from: l */
    ColorStateList m19794l() {
        return this.f16614n;
    }

    /* JADX INFO: renamed from: m */
    int m19795m() {
        return this.f16611k;
    }

    /* JADX INFO: renamed from: n */
    ColorStateList m19796n() {
        return this.f16613m;
    }

    /* JADX INFO: renamed from: o */
    PorterDuff.Mode m19797o() {
        return this.f16612l;
    }

    /* JADX INFO: renamed from: q */
    boolean m19798q() {
        return this.f16618r;
    }

    /* JADX INFO: renamed from: r */
    boolean m19799r() {
        return this.f16620t;
    }

    /* JADX INFO: renamed from: s */
    boolean m19800s() {
        return this.f16621u;
    }

    /* JADX INFO: renamed from: t */
    void m19801t(TypedArray typedArray) {
        this.f16606f = typedArray.getDimensionPixelOffset(AbstractC6752m.f26881d3, 0);
        this.f16607g = typedArray.getDimensionPixelOffset(AbstractC6752m.f26892e3, 0);
        this.f16608h = typedArray.getDimensionPixelOffset(AbstractC6752m.f26903f3, 0);
        this.f16609i = typedArray.getDimensionPixelOffset(AbstractC6752m.f26914g3, 0);
        int i7 = AbstractC6752m.f26958k3;
        if (typedArray.hasValue(i7)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i7, -1);
            this.f16610j = dimensionPixelSize;
            m19777D(this.f16602b.m2777x(dimensionPixelSize));
            this.f16619s = true;
        }
        this.f16611k = typedArray.getDimensionPixelSize(AbstractC6752m.f27090w3, 0);
        this.f16612l = AbstractC4546v.m20835j(typedArray.getInt(AbstractC6752m.f26947j3, -1), PorterDuff.Mode.SRC_IN);
        this.f16613m = AbstractC0423c.m1825a(this.f16601a.getContext(), typedArray, AbstractC6752m.f26936i3);
        this.f16614n = AbstractC0423c.m1825a(this.f16601a.getContext(), typedArray, AbstractC6752m.f27079v3);
        this.f16615o = AbstractC0423c.m1825a(this.f16601a.getContext(), typedArray, AbstractC6752m.f27057t3);
        this.f16620t = typedArray.getBoolean(AbstractC6752m.f26925h3, false);
        this.f16623w = typedArray.getDimensionPixelSize(AbstractC6752m.f26969l3, 0);
        this.f16621u = typedArray.getBoolean(AbstractC6752m.f27101x3, true);
        int paddingStart = this.f16601a.getPaddingStart();
        int paddingTop = this.f16601a.getPaddingTop();
        int paddingEnd = this.f16601a.getPaddingEnd();
        int paddingBottom = this.f16601a.getPaddingBottom();
        if (typedArray.hasValue(AbstractC6752m.f26859b3)) {
            m19803v();
        } else {
            m19767M();
        }
        this.f16601a.setPaddingRelative(paddingStart + this.f16606f, paddingTop + this.f16608h, paddingEnd + this.f16607g, paddingBottom + this.f16609i);
    }

    /* JADX INFO: renamed from: u */
    void m19802u(int i7) {
        if (m19790g() != null) {
            m19790g().setTint(i7);
        }
    }

    /* JADX INFO: renamed from: v */
    void m19803v() {
        this.f16618r = true;
        this.f16601a.setSupportBackgroundTintList(this.f16613m);
        this.f16601a.setSupportBackgroundTintMode(this.f16612l);
    }

    /* JADX INFO: renamed from: w */
    void m19804w(boolean z7) {
        this.f16620t = z7;
    }

    /* JADX INFO: renamed from: x */
    void m19805x(int i7) {
        if (this.f16619s && this.f16610j == i7) {
            return;
        }
        this.f16610j = i7;
        this.f16619s = true;
        m19777D(this.f16602b.m2777x(i7));
    }

    /* JADX INFO: renamed from: y */
    void m19806y(C0622i.d dVar) {
        this.f16605e = dVar;
        C0622i c0622iM19790g = m19790g();
        if (c0622iM19790g != null) {
            c0622iM19790g.m2720i0(dVar);
        }
    }

    /* JADX INFO: renamed from: z */
    void m19807z(C5208l c5208l) {
        this.f16604d = c5208l;
        if (this.f16603c != null) {
            m19768N();
        }
    }
}
