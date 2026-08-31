package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.AbstractC2860b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p037E3.C0379a;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.d */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4561d extends Drawable implements Animatable {

    /* JADX INFO: renamed from: B */
    private static final Property f17481B = new c(Float.class, "growFraction");

    /* JADX INFO: renamed from: a */
    final Context f17483a;

    /* JADX INFO: renamed from: b */
    final AbstractC4559b f17484b;

    /* JADX INFO: renamed from: d */
    private ValueAnimator f17486d;

    /* JADX INFO: renamed from: e */
    private ValueAnimator f17487e;

    /* JADX INFO: renamed from: f */
    private boolean f17488f;

    /* JADX INFO: renamed from: r */
    private boolean f17489r;

    /* JADX INFO: renamed from: s */
    private float f17490s;

    /* JADX INFO: renamed from: u */
    private List f17492u;

    /* JADX INFO: renamed from: v */
    private AbstractC2860b f17493v;

    /* JADX INFO: renamed from: w */
    private boolean f17494w;

    /* JADX INFO: renamed from: x */
    private float f17495x;

    /* JADX INFO: renamed from: z */
    private int f17497z;

    /* JADX INFO: renamed from: t */
    private float f17491t = -1.0f;

    /* JADX INFO: renamed from: y */
    final Paint f17496y = new Paint();

    /* JADX INFO: renamed from: A */
    Rect f17482A = new Rect();

    /* JADX INFO: renamed from: c */
    C0379a f17485c = new C0379a();

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.d$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AbstractC4561d.this.m20932f();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.d$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC4561d.super.setVisible(false, false);
            AbstractC4561d.this.m20931e();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.d$c */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(AbstractC4561d abstractC4561d) {
            return Float.valueOf(abstractC4561d.m20938h());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(AbstractC4561d abstractC4561d, Float f7) {
            abstractC4561d.m20940p(f7.floatValue());
        }
    }

    AbstractC4561d(Context context, AbstractC4559b abstractC4559b) {
        this.f17483a = context;
        this.f17484b = abstractC4559b;
        setAlpha(255);
    }

    /* JADX INFO: renamed from: d */
    private void m20930d(ValueAnimator... valueAnimatorArr) {
        boolean z7 = this.f17494w;
        this.f17494w = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f17494w = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m20931e() {
        AbstractC2860b abstractC2860b = this.f17493v;
        if (abstractC2860b != null) {
            abstractC2860b.mo14226b(this);
        }
        List list = this.f17492u;
        if (list == null || this.f17494w) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC2860b) it.next()).mo14226b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m20932f() {
        AbstractC2860b abstractC2860b = this.f17493v;
        if (abstractC2860b != null) {
            abstractC2860b.mo14227c(this);
        }
        List list = this.f17492u;
        if (list == null || this.f17494w) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC2860b) it.next()).mo14227c(this);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m20933g(ValueAnimator... valueAnimatorArr) {
        boolean z7 = this.f17494w;
        this.f17494w = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f17494w = z7;
    }

    /* JADX INFO: renamed from: k */
    private boolean m20934k() {
        return this instanceof C4560c;
    }

    /* JADX INFO: renamed from: n */
    private void m20935n() {
        if (this.f17486d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<AbstractC4561d, Float>) f17481B, 0.0f, 1.0f);
            this.f17486d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f17486d.setInterpolator(AbstractC6826a.f27405b);
            m20937r(this.f17486d);
        }
        if (this.f17487e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<AbstractC4561d, Float>) f17481B, 1.0f, 0.0f);
            this.f17487e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f17487e.setInterpolator(AbstractC6826a.f27405b);
            m20936q(this.f17487e);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m20936q(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f17487e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f17487e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    /* JADX INFO: renamed from: r */
    private void m20937r(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f17486d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f17486d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17497z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    float m20938h() {
        if (this.f17484b.m20899d() || this.f17484b.m20898c()) {
            return (this.f17489r || this.f17488f) ? this.f17490s : this.f17495x;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: i */
    float m20939i() {
        float f7 = this.f17491t;
        if (f7 > 0.0f) {
            return f7;
        }
        if (this.f17484b.m20897b(m20934k()) && this.f17484b.f17467m != 0) {
            float fM1613a = this.f17485c.m1613a(this.f17483a.getContentResolver());
            if (fM1613a > 0.0f) {
                int i7 = (int) ((((m20934k() ? this.f17484b.f17464j : this.f17484b.f17465k) * 1000.0f) / this.f17484b.f17467m) * fM1613a);
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) i7)) / i7;
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public boolean isRunning() {
        return mo20920m() || mo20919l();
    }

    /* JADX INFO: renamed from: j */
    public boolean mo20918j() {
        return mo20922s(false, false, false);
    }

    /* JADX INFO: renamed from: l */
    public boolean mo20919l() {
        ValueAnimator valueAnimator = this.f17487e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f17489r;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo20920m() {
        ValueAnimator valueAnimator = this.f17486d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f17488f;
    }

    /* JADX INFO: renamed from: o */
    public void mo20921o(AbstractC2860b abstractC2860b) {
        if (this.f17492u == null) {
            this.f17492u = new ArrayList();
        }
        if (this.f17492u.contains(abstractC2860b)) {
            return;
        }
        this.f17492u.add(abstractC2860b);
    }

    /* JADX INFO: renamed from: p */
    void m20940p(float f7) {
        if (this.f17495x != f7) {
            this.f17495x = f7;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean mo20922s(boolean z7, boolean z8, boolean z9) {
        return mo20923t(z7, z8, z9 && this.f17485c.m1613a(this.f17483a.getContentResolver()) > 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f17497z = i7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f17496y.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        return mo20922s(z7, z8, true);
    }

    public void start() {
        mo20923t(true, true, false);
    }

    public void stop() {
        mo20923t(false, true, false);
    }

    /* JADX INFO: renamed from: t */
    boolean mo20923t(boolean z7, boolean z8, boolean z9) {
        m20935n();
        if (!isVisible() && !z7) {
            return false;
        }
        ValueAnimator valueAnimator = z7 ? this.f17486d : this.f17487e;
        ValueAnimator valueAnimator2 = z7 ? this.f17487e : this.f17486d;
        if (!z9) {
            if (valueAnimator2.isRunning()) {
                m20930d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m20933g(valueAnimator);
            }
            return super.setVisible(z7, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z10 = !z7 || super.setVisible(z7, false);
        if (!(z7 ? this.f17484b.m20899d() : this.f17484b.m20898c())) {
            m20933g(valueAnimator);
            return z10;
        }
        if (z8 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z10;
        }
        valueAnimator.resume();
        return z10;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo20924u(AbstractC2860b abstractC2860b) {
        List list = this.f17492u;
        if (list == null || !list.contains(abstractC2860b)) {
            return false;
        }
        this.f17492u.remove(abstractC2860b);
        if (!this.f17492u.isEmpty()) {
            return true;
        }
        this.f17492u = null;
        return true;
    }
}
