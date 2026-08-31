package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p029D3.AbstractC0196h;
import p041F.AbstractC0400a;
import p045F3.AbstractC0423c;
import p069I3.AbstractC0618e;
import p069I3.C0619f;
import p069I3.C0622i;
import p069I3.C0626m;
import p069I3.C0627n;
import p255h.AbstractC5520a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6752m;
import p333q3.AbstractC6826a;
import p345s.AbstractC6940c;
import p345s.AbstractC6941d;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: com.google.android.material.card.b */
/* JADX INFO: loaded from: classes2.dex */
class C4442b {

    /* JADX INFO: renamed from: y */
    private static final double f16633y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z */
    private static final Drawable f16634z;

    /* JADX INFO: renamed from: a */
    private final MaterialCardView f16635a;

    /* JADX INFO: renamed from: c */
    private final C0622i f16637c;

    /* JADX INFO: renamed from: d */
    private final C0622i f16638d;

    /* JADX INFO: renamed from: e */
    private int f16639e;

    /* JADX INFO: renamed from: f */
    private int f16640f;

    /* JADX INFO: renamed from: g */
    private int f16641g;

    /* JADX INFO: renamed from: h */
    private int f16642h;

    /* JADX INFO: renamed from: i */
    private Drawable f16643i;

    /* JADX INFO: renamed from: j */
    private Drawable f16644j;

    /* JADX INFO: renamed from: k */
    private ColorStateList f16645k;

    /* JADX INFO: renamed from: l */
    private ColorStateList f16646l;

    /* JADX INFO: renamed from: m */
    private C0627n f16647m;

    /* JADX INFO: renamed from: n */
    private ColorStateList f16648n;

    /* JADX INFO: renamed from: o */
    private Drawable f16649o;

    /* JADX INFO: renamed from: p */
    private LayerDrawable f16650p;

    /* JADX INFO: renamed from: q */
    private C0622i f16651q;

    /* JADX INFO: renamed from: s */
    private boolean f16653s;

    /* JADX INFO: renamed from: t */
    private ValueAnimator f16654t;

    /* JADX INFO: renamed from: u */
    private final TimeInterpolator f16655u;

    /* JADX INFO: renamed from: v */
    private final int f16656v;

    /* JADX INFO: renamed from: w */
    private final int f16657w;

    /* JADX INFO: renamed from: b */
    private final Rect f16636b = new Rect();

    /* JADX INFO: renamed from: r */
    private boolean f16652r = false;

    /* JADX INFO: renamed from: x */
    private float f16658x = 0.0f;

    /* JADX INFO: renamed from: com.google.android.material.card.b$a */
    class a extends InsetDrawable {
        a(Drawable drawable, int i7, int i8, int i9, int i10) {
            super(drawable, i7, i8, i9, i10);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f16634z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C4442b(MaterialCardView materialCardView, AttributeSet attributeSet, int i7, int i8) {
        this.f16635a = materialCardView;
        C0622i c0622i = new C0622i(materialCardView.getContext(), attributeSet, i7, i8);
        this.f16637c = c0622i;
        c0622i.m2710U(materialCardView.getContext());
        c0622i.m2725m0(-12303292);
        C0627n.b bVarM2776w = c0622i.m2703J().m2776w();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC6941d.f27881a, i7, AbstractC6940c.f27880a);
        int i9 = AbstractC6941d.f27885e;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            bVarM2776w.m2803o(typedArrayObtainStyledAttributes.getDimension(i9, 0.0f));
        }
        this.f16638d = new C0622i();
        m19849W(bVarM2776w.m2802m());
        this.f16655u = AbstractC0196h.m979g(materialCardView.getContext(), AbstractC6742c.f26235T, AbstractC6826a.f27404a);
        this.f16656v = AbstractC0196h.m978f(materialCardView.getContext(), AbstractC6742c.f26229N, 300);
        this.f16657w = AbstractC0196h.m978f(materialCardView.getContext(), AbstractC6742c.f26228M, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: B */
    private Drawable m19813B(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f16635a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(m19823f());
            iCeil = (int) Math.ceil(m19822e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: E */
    private boolean m19814E() {
        return (this.f16641g & 80) == 80;
    }

    /* JADX INFO: renamed from: F */
    private boolean m19815F() {
        return (this.f16641g & 8388613) == 8388613;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19816a(C4442b c4442b, ValueAnimator valueAnimator) {
        c4442b.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c4442b.f16644j.setAlpha((int) (255.0f * fFloatValue));
        c4442b.f16658x = fFloatValue;
    }

    /* JADX INFO: renamed from: a0 */
    private boolean m19817a0() {
        return this.f16635a.getPreventCornerOverlap() && !m19824g();
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m19818b0() {
        return this.f16635a.getPreventCornerOverlap() && m19824g() && this.f16635a.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: c */
    private float m19819c() {
        return Math.max(Math.max(m19821d(this.f16647m.m2770q(), this.f16637c.m2706N()), m19821d(this.f16647m.m2772s(), this.f16637c.m2707O())), Math.max(m19821d(this.f16647m.m2765k(), this.f16637c.m2736y()), m19821d(this.f16647m.m2763i(), this.f16637c.m2735x())));
    }

    /* JADX INFO: renamed from: c0 */
    private boolean m19820c0() {
        if (this.f16635a.isClickable()) {
            return true;
        }
        View view = this.f16635a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    /* JADX INFO: renamed from: d */
    private float m19821d(AbstractC0618e abstractC0618e, float f7) {
        if (abstractC0618e instanceof C0626m) {
            return (float) ((1.0d - f16633y) * ((double) f7));
        }
        if (abstractC0618e instanceof C0619f) {
            return f7 / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: e */
    private float m19822e() {
        return this.f16635a.getMaxCardElevation() + (m19818b0() ? m19819c() : 0.0f);
    }

    /* JADX INFO: renamed from: f */
    private float m19823f() {
        return (this.f16635a.getMaxCardElevation() * 1.5f) + (m19818b0() ? m19819c() : 0.0f);
    }

    /* JADX INFO: renamed from: g */
    private boolean m19824g() {
        return this.f16637c.m2712X();
    }

    /* JADX INFO: renamed from: g0 */
    private void m19825g0(Drawable drawable) {
        if (this.f16635a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f16635a.getForeground()).setDrawable(drawable);
        } else {
            this.f16635a.setForeground(m19813B(drawable));
        }
    }

    /* JADX INFO: renamed from: h */
    private Drawable m19826h() {
        this.f16651q = new C0622i(this.f16647m);
        return new RippleDrawable(this.f16645k, null, this.f16651q);
    }

    /* JADX INFO: renamed from: i0 */
    private void m19827i0() {
        Drawable drawable = this.f16649o;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.f16645k);
        }
    }

    /* JADX INFO: renamed from: r */
    private Drawable m19828r() {
        if (this.f16649o == null) {
            this.f16649o = m19826h();
        }
        if (this.f16650p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f16649o, this.f16638d, this.f16644j});
            this.f16650p = layerDrawable;
            layerDrawable.setId(2, AbstractC6746g.f26396D);
        }
        return this.f16650p;
    }

    /* JADX INFO: renamed from: t */
    private float m19829t() {
        if (this.f16635a.getPreventCornerOverlap() && this.f16635a.getUseCompatPadding()) {
            return (float) ((1.0d - f16633y) * ((double) this.f16635a.getCardViewRadius()));
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: A */
    Rect m19830A() {
        return this.f16636b;
    }

    /* JADX INFO: renamed from: C */
    boolean m19831C() {
        return this.f16652r;
    }

    /* JADX INFO: renamed from: D */
    boolean m19832D() {
        return this.f16653s;
    }

    /* JADX INFO: renamed from: G */
    void m19833G(TypedArray typedArray) {
        ColorStateList colorStateListM1825a = AbstractC0423c.m1825a(this.f16635a.getContext(), typedArray, AbstractC6752m.f27003o4);
        this.f16648n = colorStateListM1825a;
        if (colorStateListM1825a == null) {
            this.f16648n = ColorStateList.valueOf(-1);
        }
        this.f16642h = typedArray.getDimensionPixelSize(AbstractC6752m.f27014p4, 0);
        boolean z7 = typedArray.getBoolean(AbstractC6752m.f26915g4, false);
        this.f16653s = z7;
        this.f16635a.setLongClickable(z7);
        this.f16646l = AbstractC0423c.m1825a(this.f16635a.getContext(), typedArray, AbstractC6752m.f26981m4);
        m19841O(AbstractC0423c.m1828d(this.f16635a.getContext(), typedArray, AbstractC6752m.f26937i4));
        m19844R(typedArray.getDimensionPixelSize(AbstractC6752m.f26970l4, 0));
        m19843Q(typedArray.getDimensionPixelSize(AbstractC6752m.f26959k4, 0));
        this.f16641g = typedArray.getInteger(AbstractC6752m.f26948j4, 8388661);
        ColorStateList colorStateListM1825a2 = AbstractC0423c.m1825a(this.f16635a.getContext(), typedArray, AbstractC6752m.f26992n4);
        this.f16645k = colorStateListM1825a2;
        if (colorStateListM1825a2 == null) {
            this.f16645k = ColorStateList.valueOf(AbstractC7539a.m33173d(this.f16635a, AbstractC5520a.f20982t));
        }
        m19837K(AbstractC0423c.m1825a(this.f16635a.getContext(), typedArray, AbstractC6752m.f26926h4));
        m19827i0();
        m19856f0();
        m19860j0();
        this.f16635a.setBackgroundInternal(m19813B(this.f16637c));
        Drawable drawableM19828r = m19820c0() ? m19828r() : this.f16638d;
        this.f16643i = drawableM19828r;
        this.f16635a.setForeground(m19813B(drawableM19828r));
    }

    /* JADX INFO: renamed from: H */
    void m19834H(int i7, int i8) {
        int iCeil;
        int iCeil2;
        int i9;
        int i10;
        if (this.f16650p != null) {
            if (this.f16635a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(m19823f() * 2.0f);
                iCeil2 = (int) Math.ceil(m19822e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i11 = m19815F() ? ((i7 - this.f16639e) - this.f16640f) - iCeil2 : this.f16639e;
            int i12 = m19814E() ? this.f16639e : ((i8 - this.f16639e) - this.f16640f) - iCeil;
            int i13 = m19815F() ? this.f16639e : ((i7 - this.f16639e) - this.f16640f) - iCeil2;
            int i14 = m19814E() ? ((i8 - this.f16639e) - this.f16640f) - iCeil : this.f16639e;
            if (this.f16635a.getLayoutDirection() == 1) {
                i10 = i13;
                i9 = i11;
            } else {
                i9 = i13;
                i10 = i11;
            }
            this.f16650p.setLayerInset(2, i10, i14, i9, i12);
        }
    }

    /* JADX INFO: renamed from: I */
    void m19835I(boolean z7) {
        this.f16652r = z7;
    }

    /* JADX INFO: renamed from: J */
    void m19836J(ColorStateList colorStateList) {
        this.f16637c.m2718g0(colorStateList);
    }

    /* JADX INFO: renamed from: K */
    void m19837K(ColorStateList colorStateList) {
        C0622i c0622i = this.f16638d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c0622i.m2718g0(colorStateList);
    }

    /* JADX INFO: renamed from: L */
    void m19838L(boolean z7) {
        this.f16653s = z7;
    }

    /* JADX INFO: renamed from: M */
    public void m19839M(boolean z7) {
        m19840N(z7, false);
    }

    /* JADX INFO: renamed from: N */
    public void m19840N(boolean z7, boolean z8) {
        Drawable drawable = this.f16644j;
        if (drawable != null) {
            if (z8) {
                m19853b(z7);
            } else {
                drawable.setAlpha(z7 ? 255 : 0);
                this.f16658x = z7 ? 1.0f : 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    void m19841O(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = AbstractC0400a.m1712r(drawable).mutate();
            this.f16644j = drawableMutate;
            drawableMutate.setTintList(this.f16646l);
            m19839M(this.f16635a.isChecked());
        } else {
            this.f16644j = f16634z;
        }
        LayerDrawable layerDrawable = this.f16650p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(AbstractC6746g.f26396D, this.f16644j);
        }
    }

    /* JADX INFO: renamed from: P */
    void m19842P(int i7) {
        this.f16641g = i7;
        m19834H(this.f16635a.getMeasuredWidth(), this.f16635a.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: Q */
    void m19843Q(int i7) {
        this.f16639e = i7;
    }

    /* JADX INFO: renamed from: R */
    void m19844R(int i7) {
        this.f16640f = i7;
    }

    /* JADX INFO: renamed from: S */
    void m19845S(ColorStateList colorStateList) {
        this.f16646l = colorStateList;
        Drawable drawable = this.f16644j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    /* JADX INFO: renamed from: T */
    void m19846T(float f7) {
        m19849W(this.f16647m.m2777x(f7));
        this.f16643i.invalidateSelf();
        if (m19818b0() || m19817a0()) {
            m19855e0();
        }
        if (m19818b0()) {
            m19857h0();
        }
    }

    /* JADX INFO: renamed from: U */
    void m19847U(float f7) {
        this.f16637c.m2719h0(f7);
        C0622i c0622i = this.f16638d;
        if (c0622i != null) {
            c0622i.m2719h0(f7);
        }
        C0622i c0622i2 = this.f16651q;
        if (c0622i2 != null) {
            c0622i2.m2719h0(f7);
        }
    }

    /* JADX INFO: renamed from: V */
    void m19848V(ColorStateList colorStateList) {
        this.f16645k = colorStateList;
        m19827i0();
    }

    /* JADX INFO: renamed from: W */
    void m19849W(C0627n c0627n) {
        this.f16647m = c0627n;
        this.f16637c.setShapeAppearanceModel(c0627n);
        C0622i c0622i = this.f16637c;
        c0622i.m2724l0(!c0622i.m2712X());
        C0622i c0622i2 = this.f16638d;
        if (c0622i2 != null) {
            c0622i2.setShapeAppearanceModel(c0627n);
        }
        C0622i c0622i3 = this.f16651q;
        if (c0622i3 != null) {
            c0622i3.setShapeAppearanceModel(c0627n);
        }
    }

    /* JADX INFO: renamed from: X */
    void m19850X(ColorStateList colorStateList) {
        if (this.f16648n == colorStateList) {
            return;
        }
        this.f16648n = colorStateList;
        m19860j0();
    }

    /* JADX INFO: renamed from: Y */
    void m19851Y(int i7) {
        if (i7 == this.f16642h) {
            return;
        }
        this.f16642h = i7;
        m19860j0();
    }

    /* JADX INFO: renamed from: Z */
    void m19852Z(int i7, int i8, int i9, int i10) {
        this.f16636b.set(i7, i8, i9, i10);
        m19855e0();
    }

    /* JADX INFO: renamed from: b */
    public void m19853b(boolean z7) {
        float f7 = z7 ? 1.0f : 0.0f;
        float f8 = z7 ? 1.0f - this.f16658x : this.f16658x;
        ValueAnimator valueAnimator = this.f16654t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16654t = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f16658x, f7);
        this.f16654t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C4442b.m19816a(this.f16632a, valueAnimator2);
            }
        });
        this.f16654t.setInterpolator(this.f16655u);
        this.f16654t.setDuration((long) ((z7 ? this.f16656v : this.f16657w) * f8));
        this.f16654t.start();
    }

    /* JADX INFO: renamed from: d0 */
    void m19854d0() {
        Drawable drawable = this.f16643i;
        Drawable drawableM19828r = m19820c0() ? m19828r() : this.f16638d;
        this.f16643i = drawableM19828r;
        if (drawable != drawableM19828r) {
            m19825g0(drawableM19828r);
        }
    }

    /* JADX INFO: renamed from: e0 */
    void m19855e0() {
        int iM19819c = (int) (((m19817a0() || m19818b0()) ? m19819c() : 0.0f) - m19829t());
        MaterialCardView materialCardView = this.f16635a;
        Rect rect = this.f16636b;
        materialCardView.m19812g(rect.left + iM19819c, rect.top + iM19819c, rect.right + iM19819c, rect.bottom + iM19819c);
    }

    /* JADX INFO: renamed from: f0 */
    void m19856f0() {
        this.f16637c.m2717f0(this.f16635a.getCardElevation());
    }

    /* JADX INFO: renamed from: h0 */
    void m19857h0() {
        if (!m19831C()) {
            this.f16635a.setBackgroundInternal(m19813B(this.f16637c));
        }
        this.f16635a.setForeground(m19813B(this.f16643i));
    }

    /* JADX INFO: renamed from: i */
    void m19858i() {
        Drawable drawable = this.f16649o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i7 = bounds.bottom;
            this.f16649o.setBounds(bounds.left, bounds.top, bounds.right, i7 - 1);
            this.f16649o.setBounds(bounds.left, bounds.top, bounds.right, i7);
        }
    }

    /* JADX INFO: renamed from: j */
    C0622i m19859j() {
        return this.f16637c;
    }

    /* JADX INFO: renamed from: j0 */
    void m19860j0() {
        this.f16638d.m2730q0(this.f16642h, this.f16648n);
    }

    /* JADX INFO: renamed from: k */
    ColorStateList m19861k() {
        return this.f16637c.m2697D();
    }

    /* JADX INFO: renamed from: l */
    ColorStateList m19862l() {
        return this.f16638d.m2697D();
    }

    /* JADX INFO: renamed from: m */
    Drawable m19863m() {
        return this.f16644j;
    }

    /* JADX INFO: renamed from: n */
    int m19864n() {
        return this.f16641g;
    }

    /* JADX INFO: renamed from: o */
    int m19865o() {
        return this.f16639e;
    }

    /* JADX INFO: renamed from: p */
    int m19866p() {
        return this.f16640f;
    }

    /* JADX INFO: renamed from: q */
    ColorStateList m19867q() {
        return this.f16646l;
    }

    /* JADX INFO: renamed from: s */
    float m19868s() {
        return this.f16637c.m2706N();
    }

    /* JADX INFO: renamed from: u */
    float m19869u() {
        return this.f16637c.m2698E();
    }

    /* JADX INFO: renamed from: v */
    ColorStateList m19870v() {
        return this.f16645k;
    }

    /* JADX INFO: renamed from: w */
    C0627n m19871w() {
        return this.f16647m;
    }

    /* JADX INFO: renamed from: x */
    int m19872x() {
        ColorStateList colorStateList = this.f16648n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: y */
    ColorStateList m19873y() {
        return this.f16648n;
    }

    /* JADX INFO: renamed from: z */
    int m19874z() {
        return this.f16642h;
    }
}
