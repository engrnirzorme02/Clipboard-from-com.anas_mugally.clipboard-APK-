package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.AbstractC2860b;
import p272j0.C5824b;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.i */
/* JADX INFO: loaded from: classes2.dex */
final class C4566i extends AbstractC4563f {

    /* JADX INFO: renamed from: i */
    private static final Property f17532i = new b(Float.class, "animationFraction");

    /* JADX INFO: renamed from: c */
    private ObjectAnimator f17533c;

    /* JADX INFO: renamed from: d */
    private C5824b f17534d;

    /* JADX INFO: renamed from: e */
    private final AbstractC4559b f17535e;

    /* JADX INFO: renamed from: f */
    private int f17536f;

    /* JADX INFO: renamed from: g */
    private boolean f17537g;

    /* JADX INFO: renamed from: h */
    private float f17538h;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.i$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C4566i c4566i = C4566i.this;
            c4566i.f17536f = (c4566i.f17536f + 1) % C4566i.this.f17535e.f17459e.length;
            C4566i.this.f17537g = true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.i$b */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C4566i c4566i) {
            return Float.valueOf(c4566i.m20978n());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C4566i c4566i, Float f7) {
            c4566i.m20984r(f7.floatValue());
        }
    }

    public C4566i(C4568k c4568k) {
        super(3);
        this.f17536f = 1;
        this.f17535e = c4568k;
        this.f17534d = new C5824b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public float m20978n() {
        return this.f17538h;
    }

    /* JADX INFO: renamed from: o */
    private void m20979o() {
        if (this.f17533c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C4566i, Float>) f17532i, 0.0f, 1.0f);
            this.f17533c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f17535e.f17468n * 333.0f));
            this.f17533c.setInterpolator(null);
            this.f17533c.setRepeatCount(-1);
            this.f17533c.addListener(new a());
        }
    }

    /* JADX INFO: renamed from: p */
    private void m20980p() {
        if (!this.f17537g || ((AbstractC4562e.a) this.f17518b.get(1)).f17506b >= 1.0f) {
            return;
        }
        ((AbstractC4562e.a) this.f17518b.get(2)).f17507c = ((AbstractC4562e.a) this.f17518b.get(1)).f17507c;
        ((AbstractC4562e.a) this.f17518b.get(1)).f17507c = ((AbstractC4562e.a) this.f17518b.get(0)).f17507c;
        ((AbstractC4562e.a) this.f17518b.get(0)).f17507c = this.f17535e.f17459e[this.f17536f];
        this.f17537g = false;
    }

    /* JADX INFO: renamed from: s */
    private void m20981s() {
        m20979o();
        this.f17533c.setDuration((long) (this.f17535e.f17468n * 333.0f));
    }

    /* JADX INFO: renamed from: t */
    private void m20982t(int i7) {
        ((AbstractC4562e.a) this.f17518b.get(0)).f17505a = 0.0f;
        float fM20956b = m20956b(i7, 0, 667);
        AbstractC4562e.a aVar = (AbstractC4562e.a) this.f17518b.get(0);
        AbstractC4562e.a aVar2 = (AbstractC4562e.a) this.f17518b.get(1);
        float interpolation = this.f17534d.getInterpolation(fM20956b);
        aVar2.f17505a = interpolation;
        aVar.f17506b = interpolation;
        AbstractC4562e.a aVar3 = (AbstractC4562e.a) this.f17518b.get(1);
        AbstractC4562e.a aVar4 = (AbstractC4562e.a) this.f17518b.get(2);
        float interpolation2 = this.f17534d.getInterpolation(fM20956b + 0.49925038f);
        aVar4.f17505a = interpolation2;
        aVar3.f17506b = interpolation2;
        ((AbstractC4562e.a) this.f17518b.get(2)).f17506b = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: a */
    public void mo20955a() {
        ObjectAnimator objectAnimator = this.f17533c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: c */
    public void mo20957c() {
        m20981s();
        m20983q();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: d */
    public void mo20958d(AbstractC2860b abstractC2860b) {
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: f */
    public void mo20960f() {
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: g */
    public void mo20961g() {
        m20979o();
        m20983q();
        this.f17533c.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: h */
    public void mo20962h() {
    }

    /* JADX INFO: renamed from: q */
    void m20983q() {
        this.f17537g = true;
        this.f17536f = 1;
        for (AbstractC4562e.a aVar : this.f17518b) {
            AbstractC4559b abstractC4559b = this.f17535e;
            aVar.f17507c = abstractC4559b.f17459e[0];
            aVar.f17508d = abstractC4559b.f17463i / 2;
        }
    }

    /* JADX INFO: renamed from: r */
    void m20984r(float f7) {
        this.f17538h = f7;
        m20982t((int) (f7 * 333.0f));
        m20980p();
        this.f17517a.invalidateSelf();
    }
}
