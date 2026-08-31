package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.content.AbstractC2436b;
import java.util.ArrayList;
import java.util.Iterator;
import p029D3.AbstractC0196h;
import p053G3.AbstractC0481a;
import p061H3.InterfaceC0500b;
import p069I3.AbstractC0623j;
import p069I3.C0622i;
import p069I3.C0627n;
import p069I3.InterfaceC0630q;
import p104N.AbstractC0910g;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6743d;
import p325p3.AbstractC6747h;
import p333q3.AbstractC6826a;
import p333q3.AbstractC6827b;
import p333q3.AbstractC6830e;
import p333q3.C6829d;
import p333q3.C6831f;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.e */
/* JADX INFO: loaded from: classes2.dex */
class C4520e {

    /* JADX INFO: renamed from: C */
    static final TimeInterpolator f17135C = AbstractC6826a.f27406c;

    /* JADX INFO: renamed from: D */
    private static final int f17136D = AbstractC6742c.f26224I;

    /* JADX INFO: renamed from: E */
    private static final int f17137E = AbstractC6742c.f26234S;

    /* JADX INFO: renamed from: F */
    private static final int f17138F = AbstractC6742c.f26225J;

    /* JADX INFO: renamed from: G */
    private static final int f17139G = AbstractC6742c.f26232Q;

    /* JADX INFO: renamed from: H */
    static final int[] f17140H = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: I */
    static final int[] f17141I = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: J */
    static final int[] f17142J = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: K */
    static final int[] f17143K = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: L */
    static final int[] f17144L = {R.attr.state_enabled};

    /* JADX INFO: renamed from: M */
    static final int[] f17145M = new int[0];

    /* JADX INFO: renamed from: B */
    private ViewTreeObserver.OnPreDrawListener f17147B;

    /* JADX INFO: renamed from: a */
    C0627n f17148a;

    /* JADX INFO: renamed from: b */
    C0622i f17149b;

    /* JADX INFO: renamed from: c */
    Drawable f17150c;

    /* JADX INFO: renamed from: d */
    C4518c f17151d;

    /* JADX INFO: renamed from: e */
    Drawable f17152e;

    /* JADX INFO: renamed from: f */
    boolean f17153f;

    /* JADX INFO: renamed from: h */
    float f17155h;

    /* JADX INFO: renamed from: i */
    float f17156i;

    /* JADX INFO: renamed from: j */
    float f17157j;

    /* JADX INFO: renamed from: k */
    int f17158k;

    /* JADX INFO: renamed from: l */
    private StateListAnimator f17159l;

    /* JADX INFO: renamed from: m */
    private Animator f17160m;

    /* JADX INFO: renamed from: n */
    private C6831f f17161n;

    /* JADX INFO: renamed from: o */
    private C6831f f17162o;

    /* JADX INFO: renamed from: q */
    private int f17164q;

    /* JADX INFO: renamed from: s */
    private ArrayList f17166s;

    /* JADX INFO: renamed from: t */
    private ArrayList f17167t;

    /* JADX INFO: renamed from: u */
    private ArrayList f17168u;

    /* JADX INFO: renamed from: v */
    final FloatingActionButton f17169v;

    /* JADX INFO: renamed from: w */
    final InterfaceC0500b f17170w;

    /* JADX INFO: renamed from: g */
    boolean f17154g = true;

    /* JADX INFO: renamed from: p */
    private float f17163p = 1.0f;

    /* JADX INFO: renamed from: r */
    private int f17165r = 0;

    /* JADX INFO: renamed from: x */
    private final Rect f17171x = new Rect();

    /* JADX INFO: renamed from: y */
    private final RectF f17172y = new RectF();

    /* JADX INFO: renamed from: z */
    private final RectF f17173z = new RectF();

    /* JADX INFO: renamed from: A */
    private final Matrix f17146A = new Matrix();

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.e$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        private boolean f17174a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f17175b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ g f17176c;

        a(boolean z7, g gVar) {
            this.f17175b = z7;
            this.f17176c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f17174a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4520e.this.f17165r = 0;
            C4520e.this.f17160m = null;
            if (this.f17174a) {
                return;
            }
            FloatingActionButton floatingActionButton = C4520e.this.f17169v;
            boolean z7 = this.f17175b;
            floatingActionButton.m20839b(z7 ? 8 : 4, z7);
            g gVar = this.f17176c;
            if (gVar != null) {
                gVar.m20591b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4520e.this.f17169v.m20839b(0, this.f17175b);
            C4520e.this.f17165r = 1;
            C4520e.this.f17160m = animator;
            this.f17174a = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.e$b */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f17178a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ g f17179b;

        b(boolean z7, g gVar) {
            this.f17178a = z7;
            this.f17179b = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4520e.this.f17165r = 0;
            C4520e.this.f17160m = null;
            g gVar = this.f17179b;
            if (gVar != null) {
                gVar.m20590a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4520e.this.f17169v.m20839b(0, this.f17178a);
            C4520e.this.f17165r = 2;
            C4520e.this.f17160m = animator;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.e$c */
    class c extends AbstractC6830e {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f7, Matrix matrix, Matrix matrix2) {
            C4520e.this.f17163p = f7;
            return super.evaluate(f7, matrix, matrix2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.e$d */
    class d implements TypeEvaluator {

        /* JADX INFO: renamed from: a */
        final FloatEvaluator f17182a = new FloatEvaluator();

        d() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f7, Float f8, Float f9) {
            float fFloatValue = this.f17182a.evaluate(f7, (Number) f8, (Number) f9).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.e$e */
    static class e extends C0622i {
        e(C0627n c0627n) {
            super(c0627n);
        }

        @Override // p069I3.C0622i, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.e$f */
    interface f {
        /* JADX INFO: renamed from: a */
        void m20588a();

        /* JADX INFO: renamed from: b */
        void m20589b();
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.e$g */
    interface g {
        /* JADX INFO: renamed from: a */
        void m20590a();

        /* JADX INFO: renamed from: b */
        void m20591b();
    }

    C4520e(FloatingActionButton floatingActionButton, InterfaceC0500b interfaceC0500b) {
        this.f17169v = floatingActionButton;
        this.f17170w = interfaceC0500b;
    }

    /* JADX INFO: renamed from: W */
    private boolean m20532W() {
        return this.f17169v.isLaidOut() && !this.f17169v.isInEditMode();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20533a(C4520e c4520e, float f7, float f8, float f9, float f10, float f11, float f12, float f13, Matrix matrix, ValueAnimator valueAnimator) {
        c4520e.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c4520e.f17169v.setAlpha(AbstractC6826a.m29844b(f7, f8, 0.0f, 0.2f, fFloatValue));
        c4520e.f17169v.setScaleX(AbstractC6826a.m29843a(f9, f10, fFloatValue));
        c4520e.f17169v.setScaleY(AbstractC6826a.m29843a(f11, f10, fFloatValue));
        c4520e.f17163p = AbstractC6826a.m29843a(f12, f13, fFloatValue);
        c4520e.m20538e(AbstractC6826a.m29843a(f12, f13, fFloatValue), matrix);
        c4520e.f17169v.setImageMatrix(matrix);
    }

    /* JADX INFO: renamed from: b0 */
    private void m20535b0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    /* JADX INFO: renamed from: e */
    private void m20538e(float f7, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f17169v.getDrawable();
        if (drawable == null || this.f17164q == 0) {
            return;
        }
        RectF rectF = this.f17172y;
        RectF rectF2 = this.f17173z;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i7 = this.f17164q;
        rectF2.set(0.0f, 0.0f, i7, i7);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i8 = this.f17164q;
        matrix.postScale(f7, f7, i8 / 2.0f, i8 / 2.0f);
    }

    /* JADX INFO: renamed from: f */
    private AnimatorSet m20539f(C6831f c6831f, float f7, float f8, float f9) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17169v, (Property<FloatingActionButton, Float>) View.ALPHA, f7);
        c6831f.m29858h("opacity").m29864a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f17169v, (Property<FloatingActionButton, Float>) View.SCALE_X, f8);
        c6831f.m29858h("scale").m29864a(objectAnimatorOfFloat2);
        m20535b0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f17169v, (Property<FloatingActionButton, Float>) View.SCALE_Y, f8);
        c6831f.m29858h("scale").m29864a(objectAnimatorOfFloat3);
        m20535b0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        m20538e(f9, this.f17146A);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f17169v, new C6829d(), new c(), new Matrix(this.f17146A));
        c6831f.m29858h("iconScale").m29864a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC6827b.m29846a(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: h */
    private AnimatorSet m20540h(final float f7, final float f8, final float f9, int i7, int i8) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.f17169v.getAlpha();
        final float scaleX = this.f17169v.getScaleX();
        final float scaleY = this.f17169v.getScaleY();
        final float f10 = this.f17163p;
        final Matrix matrix = new Matrix(this.f17146A);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4520e.m20533a(this.f17126a, alpha, f7, scaleX, f8, scaleY, f10, f9, matrix, valueAnimator);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        AbstractC6827b.m29846a(animatorSet, arrayList);
        animatorSet.setDuration(AbstractC0196h.m978f(this.f17169v.getContext(), i7, this.f17169v.getContext().getResources().getInteger(AbstractC6747h.f26445b)));
        animatorSet.setInterpolator(AbstractC0196h.m979g(this.f17169v.getContext(), i8, AbstractC6826a.f27405b));
        return animatorSet;
    }

    /* JADX INFO: renamed from: i */
    private StateListAnimator m20541i(float f7, float f8, float f9) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(f17140H, m20542j(f7, f9));
        stateListAnimator.addState(f17141I, m20542j(f7, f8));
        stateListAnimator.addState(f17142J, m20542j(f7, f8));
        stateListAnimator.addState(f17143K, m20542j(f7, f8));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f17169v, "elevation", f7).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.f17169v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(f17135C);
        stateListAnimator.addState(f17144L, animatorSet);
        stateListAnimator.addState(f17145M, m20542j(0.0f, 0.0f));
        return stateListAnimator;
    }

    /* JADX INFO: renamed from: j */
    private Animator m20542j(float f7, float f8) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f17169v, "elevation", f7).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f17169v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f8).setDuration(100L));
        animatorSet.setInterpolator(f17135C);
        return animatorSet;
    }

    /* JADX INFO: renamed from: A */
    void m20543A() {
        C0622i c0622i = this.f17149b;
        if (c0622i != null) {
            AbstractC0623j.m2751f(this.f17169v, c0622i);
        }
    }

    /* JADX INFO: renamed from: B */
    void m20544B() {
        m20567Z();
    }

    /* JADX INFO: renamed from: C */
    void m20545C() {
        ViewTreeObserver viewTreeObserver = this.f17169v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f17147B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f17147B = null;
        }
    }

    /* JADX INFO: renamed from: D */
    void m20546D(float f7, float f8, float f9) {
        if (this.f17169v.getStateListAnimator() == this.f17159l) {
            StateListAnimator stateListAnimatorM20541i = m20541i(f7, f8, f9);
            this.f17159l = stateListAnimatorM20541i;
            this.f17169v.setStateListAnimator(stateListAnimatorM20541i);
        }
        if (m20564V()) {
            m20567Z();
        }
    }

    /* JADX INFO: renamed from: E */
    void m20547E(Rect rect) {
        AbstractC0910g.m4140h(this.f17152e, "Didn't initialize content background");
        if (!m20564V()) {
            this.f17170w.mo2115d(this.f17152e);
        } else {
            this.f17170w.mo2115d(new InsetDrawable(this.f17152e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    /* JADX INFO: renamed from: F */
    void m20548F() {
        ArrayList arrayList = this.f17168u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f) it.next()).m20589b();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    void m20549G() {
        ArrayList arrayList = this.f17168u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f) it.next()).m20588a();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    void m20550H(ColorStateList colorStateList) {
        C0622i c0622i = this.f17149b;
        if (c0622i != null) {
            c0622i.setTintList(colorStateList);
        }
        C4518c c4518c = this.f17151d;
        if (c4518c != null) {
            c4518c.m20528c(colorStateList);
        }
    }

    /* JADX INFO: renamed from: I */
    void m20551I(PorterDuff.Mode mode) {
        C0622i c0622i = this.f17149b;
        if (c0622i != null) {
            c0622i.setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: J */
    final void m20552J(float f7) {
        if (this.f17155h != f7) {
            this.f17155h = f7;
            m20546D(f7, this.f17156i, this.f17157j);
        }
    }

    /* JADX INFO: renamed from: K */
    void m20553K(boolean z7) {
        this.f17153f = z7;
    }

    /* JADX INFO: renamed from: L */
    final void m20554L(C6831f c6831f) {
        this.f17162o = c6831f;
    }

    /* JADX INFO: renamed from: M */
    final void m20555M(float f7) {
        if (this.f17156i != f7) {
            this.f17156i = f7;
            m20546D(this.f17155h, f7, this.f17157j);
        }
    }

    /* JADX INFO: renamed from: N */
    final void m20556N(float f7) {
        this.f17163p = f7;
        Matrix matrix = this.f17146A;
        m20538e(f7, matrix);
        this.f17169v.setImageMatrix(matrix);
    }

    /* JADX INFO: renamed from: O */
    final void m20557O(int i7) {
        if (this.f17164q != i7) {
            this.f17164q = i7;
            m20566Y();
        }
    }

    /* JADX INFO: renamed from: P */
    void m20558P(int i7) {
        this.f17158k = i7;
    }

    /* JADX INFO: renamed from: Q */
    final void m20559Q(float f7) {
        if (this.f17157j != f7) {
            this.f17157j = f7;
            m20546D(this.f17155h, this.f17156i, f7);
        }
    }

    /* JADX INFO: renamed from: R */
    void m20560R(ColorStateList colorStateList) {
        Drawable drawable = this.f17150c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(AbstractC0481a.m2065d(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(AbstractC0481a.m2065d(colorStateList));
        }
    }

    /* JADX INFO: renamed from: S */
    void m20561S(boolean z7) {
        this.f17154g = z7;
        m20567Z();
    }

    /* JADX INFO: renamed from: T */
    final void m20562T(C0627n c0627n) {
        this.f17148a = c0627n;
        C0622i c0622i = this.f17149b;
        if (c0622i != null) {
            c0622i.setShapeAppearanceModel(c0627n);
        }
        Object obj = this.f17150c;
        if (obj instanceof InterfaceC0630q) {
            ((InterfaceC0630q) obj).setShapeAppearanceModel(c0627n);
        }
        C4518c c4518c = this.f17151d;
        if (c4518c != null) {
            c4518c.m20531f(c0627n);
        }
    }

    /* JADX INFO: renamed from: U */
    final void m20563U(C6831f c6831f) {
        this.f17161n = c6831f;
    }

    /* JADX INFO: renamed from: V */
    boolean m20564V() {
        return this.f17170w.mo2116e() || m20582w();
    }

    /* JADX INFO: renamed from: X */
    void m20565X(g gVar, boolean z7) {
        AnimatorSet animatorSetM20540h;
        C4520e c4520e;
        if (m20585z()) {
            return;
        }
        Animator animator = this.f17160m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z8 = this.f17161n == null;
        if (!m20532W()) {
            this.f17169v.m20839b(0, z7);
            this.f17169v.setAlpha(1.0f);
            this.f17169v.setScaleY(1.0f);
            this.f17169v.setScaleX(1.0f);
            m20556N(1.0f);
            if (gVar != null) {
                gVar.m20590a();
                return;
            }
            return;
        }
        if (this.f17169v.getVisibility() != 0) {
            this.f17169v.setAlpha(0.0f);
            this.f17169v.setScaleY(z8 ? 0.4f : 0.0f);
            this.f17169v.setScaleX(z8 ? 0.4f : 0.0f);
            m20556N(z8 ? 0.4f : 0.0f);
        }
        C6831f c6831f = this.f17161n;
        if (c6831f != null) {
            animatorSetM20540h = m20539f(c6831f, 1.0f, 1.0f, 1.0f);
            c4520e = this;
        } else {
            animatorSetM20540h = m20540h(1.0f, 1.0f, 1.0f, f17136D, f17137E);
            c4520e = this;
        }
        animatorSetM20540h.addListener(new b(z7, gVar));
        ArrayList arrayList = c4520e.f17166s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM20540h.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetM20540h.start();
    }

    /* JADX INFO: renamed from: Y */
    final void m20566Y() {
        m20556N(this.f17163p);
    }

    /* JADX INFO: renamed from: Z */
    final void m20567Z() {
        Rect rect = this.f17171x;
        m20576q(rect);
        m20547E(rect);
        this.f17170w.mo2114a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: a0 */
    void m20568a0(float f7) {
        C0622i c0622i = this.f17149b;
        if (c0622i != null) {
            c0622i.m2717f0(f7);
        }
    }

    /* JADX INFO: renamed from: g */
    C4518c m20569g(int i7, ColorStateList colorStateList) {
        Context context = this.f17169v.getContext();
        C4518c c4518c = new C4518c((C0627n) AbstractC0910g.m4139g(this.f17148a));
        c4518c.m20530e(AbstractC2436b.getColor(context, AbstractC6743d.f26291e), AbstractC2436b.getColor(context, AbstractC6743d.f26290d), AbstractC2436b.getColor(context, AbstractC6743d.f26288b), AbstractC2436b.getColor(context, AbstractC6743d.f26289c));
        c4518c.m20529d(i7);
        c4518c.m20528c(colorStateList);
        return c4518c;
    }

    /* JADX INFO: renamed from: k */
    C0622i m20570k() {
        return new e((C0627n) AbstractC0910g.m4139g(this.f17148a));
    }

    /* JADX INFO: renamed from: l */
    final Drawable m20571l() {
        return this.f17152e;
    }

    /* JADX INFO: renamed from: m */
    float m20572m() {
        return this.f17169v.getElevation();
    }

    /* JADX INFO: renamed from: n */
    boolean m20573n() {
        return this.f17153f;
    }

    /* JADX INFO: renamed from: o */
    final C6831f m20574o() {
        return this.f17162o;
    }

    /* JADX INFO: renamed from: p */
    float m20575p() {
        return this.f17156i;
    }

    /* JADX INFO: renamed from: q */
    void m20576q(Rect rect) {
        if (this.f17170w.mo2116e()) {
            int iM20580u = m20580u();
            float fM20572m = this.f17154g ? m20572m() + this.f17157j : 0.0f;
            int iMax = Math.max(iM20580u, (int) Math.ceil(fM20572m));
            int iMax2 = Math.max(iM20580u, (int) Math.ceil(fM20572m * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
            return;
        }
        if (!m20582w()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f17158k - this.f17169v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    /* JADX INFO: renamed from: r */
    float m20577r() {
        return this.f17157j;
    }

    /* JADX INFO: renamed from: s */
    final C0627n m20578s() {
        return this.f17148a;
    }

    /* JADX INFO: renamed from: t */
    final C6831f m20579t() {
        return this.f17161n;
    }

    /* JADX INFO: renamed from: u */
    int m20580u() {
        if (this.f17153f) {
            return Math.max((this.f17158k - this.f17169v.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: v */
    void m20581v(g gVar, boolean z7) {
        C4520e c4520e;
        AnimatorSet animatorSetM20540h;
        if (m20584y()) {
            return;
        }
        Animator animator = this.f17160m;
        if (animator != null) {
            animator.cancel();
        }
        if (!m20532W()) {
            this.f17169v.m20839b(z7 ? 8 : 4, z7);
            if (gVar != null) {
                gVar.m20591b();
                return;
            }
            return;
        }
        C6831f c6831f = this.f17162o;
        if (c6831f != null) {
            animatorSetM20540h = m20539f(c6831f, 0.0f, 0.0f, 0.0f);
            c4520e = this;
        } else {
            c4520e = this;
            animatorSetM20540h = c4520e.m20540h(0.0f, 0.4f, 0.4f, f17138F, f17139G);
        }
        animatorSetM20540h.addListener(new a(z7, gVar));
        ArrayList arrayList = c4520e.f17167t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM20540h.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetM20540h.start();
    }

    /* JADX INFO: renamed from: w */
    final boolean m20582w() {
        return this.f17153f && this.f17169v.getSizeDimension() < this.f17158k;
    }

    /* JADX INFO: renamed from: x */
    void m20583x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i7) {
        Drawable layerDrawable;
        C0622i c0622iM20570k = m20570k();
        this.f17149b = c0622iM20570k;
        c0622iM20570k.setTintList(colorStateList);
        if (mode != null) {
            this.f17149b.setTintMode(mode);
        }
        this.f17149b.m2710U(this.f17169v.getContext());
        if (i7 > 0) {
            this.f17151d = m20569g(i7, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) AbstractC0910g.m4139g(this.f17151d), (Drawable) AbstractC0910g.m4139g(this.f17149b)});
        } else {
            this.f17151d = null;
            layerDrawable = this.f17149b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC0481a.m2065d(colorStateList2), layerDrawable, null);
        this.f17150c = rippleDrawable;
        this.f17152e = rippleDrawable;
    }

    /* JADX INFO: renamed from: y */
    boolean m20584y() {
        if (this.f17169v.getVisibility() == 0) {
            return this.f17165r == 1;
        }
        return this.f17165r != 2;
    }

    /* JADX INFO: renamed from: z */
    boolean m20585z() {
        if (this.f17169v.getVisibility() != 0) {
            return this.f17165r == 2;
        }
        return this.f17165r != 1;
    }
}
