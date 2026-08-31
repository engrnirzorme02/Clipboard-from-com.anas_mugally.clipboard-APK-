package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.AbstractC2860b;
import androidx.vectordrawable.graphics.drawable.AbstractC2862d;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.Iterator;
import p065I.AbstractC0577a;
import p325p3.AbstractC6740a;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.j */
/* JADX INFO: loaded from: classes2.dex */
final class C4567j extends AbstractC4563f {

    /* JADX INFO: renamed from: k */
    private static final int[] f17540k = {533, 567, 850, 750};

    /* JADX INFO: renamed from: l */
    private static final int[] f17541l = {1267, zzbbn.zzq.zzf, 333, 0};

    /* JADX INFO: renamed from: m */
    private static final Property f17542m = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: c */
    private ObjectAnimator f17543c;

    /* JADX INFO: renamed from: d */
    private ObjectAnimator f17544d;

    /* JADX INFO: renamed from: e */
    private final Interpolator[] f17545e;

    /* JADX INFO: renamed from: f */
    private final AbstractC4559b f17546f;

    /* JADX INFO: renamed from: g */
    private int f17547g;

    /* JADX INFO: renamed from: h */
    private boolean f17548h;

    /* JADX INFO: renamed from: i */
    private float f17549i;

    /* JADX INFO: renamed from: j */
    AbstractC2860b f17550j;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.j$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C4567j c4567j = C4567j.this;
            c4567j.f17547g = (c4567j.f17547g + 1) % C4567j.this.f17546f.f17459e.length;
            C4567j.this.f17548h = true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.j$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C4567j.this.mo20955a();
            C4567j c4567j = C4567j.this;
            AbstractC2860b abstractC2860b = c4567j.f17550j;
            if (abstractC2860b != null) {
                abstractC2860b.mo14226b(c4567j.f17517a);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.j$c */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C4567j c4567j) {
            return Float.valueOf(c4567j.m20992n());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C4567j c4567j, Float f7) {
            c4567j.m20998r(f7.floatValue());
        }
    }

    public C4567j(Context context, C4568k c4568k) {
        super(2);
        this.f17547g = 0;
        this.f17550j = null;
        this.f17546f = c4568k;
        this.f17545e = new Interpolator[]{AbstractC2862d.m14236a(context, AbstractC6740a.f26204a), AbstractC2862d.m14236a(context, AbstractC6740a.f26205b), AbstractC2862d.m14236a(context, AbstractC6740a.f26206c), AbstractC2862d.m14236a(context, AbstractC6740a.f26207d)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public float m20992n() {
        return this.f17549i;
    }

    /* JADX INFO: renamed from: o */
    private void m20993o() {
        if (this.f17543c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C4567j, Float>) f17542m, 0.0f, 1.0f);
            this.f17543c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f17546f.f17468n * 1800.0f));
            this.f17543c.setInterpolator(null);
            this.f17543c.setRepeatCount(-1);
            this.f17543c.addListener(new a());
        }
        if (this.f17544d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<C4567j, Float>) f17542m, 1.0f);
            this.f17544d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f17546f.f17468n * 1800.0f));
            this.f17544d.setInterpolator(null);
            this.f17544d.addListener(new b());
        }
    }

    /* JADX INFO: renamed from: p */
    private void m20994p() {
        if (this.f17548h) {
            Iterator it = this.f17518b.iterator();
            while (it.hasNext()) {
                ((AbstractC4562e.a) it.next()).f17507c = this.f17546f.f17459e[this.f17547g];
            }
            this.f17548h = false;
        }
    }

    /* JADX INFO: renamed from: s */
    private void m20995s() {
        m20993o();
        this.f17543c.setDuration((long) (this.f17546f.f17468n * 1800.0f));
        this.f17544d.setDuration((long) (this.f17546f.f17468n * 1800.0f));
    }

    /* JADX INFO: renamed from: t */
    private void m20996t(int i7) {
        for (int i8 = 0; i8 < this.f17518b.size(); i8++) {
            AbstractC4562e.a aVar = (AbstractC4562e.a) this.f17518b.get(i8);
            int[] iArr = f17541l;
            int i9 = i8 * 2;
            int i10 = iArr[i9];
            int[] iArr2 = f17540k;
            aVar.f17505a = AbstractC0577a.m2540a(this.f17545e[i9].getInterpolation(m20956b(i7, i10, iArr2[i9])), 0.0f, 1.0f);
            int i11 = i9 + 1;
            aVar.f17506b = AbstractC0577a.m2540a(this.f17545e[i11].getInterpolation(m20956b(i7, iArr[i11], iArr2[i11])), 0.0f, 1.0f);
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: a */
    public void mo20955a() {
        ObjectAnimator objectAnimator = this.f17543c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: c */
    public void mo20957c() {
        m20995s();
        m20997q();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: d */
    public void mo20958d(AbstractC2860b abstractC2860b) {
        this.f17550j = abstractC2860b;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: f */
    public void mo20960f() {
        ObjectAnimator objectAnimator = this.f17544d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        mo20955a();
        if (this.f17517a.isVisible()) {
            this.f17544d.setFloatValues(this.f17549i, 1.0f);
            this.f17544d.setDuration((long) ((1.0f - this.f17549i) * 1800.0f));
            this.f17544d.start();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: g */
    public void mo20961g() {
        m20993o();
        m20997q();
        this.f17543c.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4563f
    /* JADX INFO: renamed from: h */
    public void mo20962h() {
        this.f17550j = null;
    }

    /* JADX INFO: renamed from: q */
    void m20997q() {
        this.f17547g = 0;
        Iterator it = this.f17518b.iterator();
        while (it.hasNext()) {
            ((AbstractC4562e.a) it.next()).f17507c = this.f17546f.f17459e[0];
        }
    }

    /* JADX INFO: renamed from: r */
    void m20998r(float f7) {
        this.f17549i = f7;
        m20996t((int) (f7 * 1800.0f));
        m20994p();
        this.f17517a.invalidateSelf();
    }
}
