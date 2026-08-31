package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.c */
/* JADX INFO: loaded from: classes.dex */
public class C2835c extends AbstractC2832L {

    /* JADX INFO: renamed from: androidx.transition.c$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC2843k.f {

        /* JADX INFO: renamed from: a */
        private final View f11474a;

        /* JADX INFO: renamed from: b */
        private boolean f11475b = false;

        a(View view) {
            this.f11474a = view;
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: a */
        public void mo14096a(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: b */
        public void mo14097b(AbstractC2843k abstractC2843k) {
            this.f11474a.setTag(AbstractC2840h.f11498d, Float.valueOf(this.f11474a.getVisibility() == 0 ? AbstractC2857y.m14213b(this.f11474a) : 0.0f));
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: d */
        public void mo14098d(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: e */
        public void mo14099e(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: f */
        public void mo14119f(AbstractC2843k abstractC2843k, boolean z7) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: g */
        public void mo14100g(AbstractC2843k abstractC2843k) {
            this.f11474a.setTag(AbstractC2840h.f11498d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC2857y.m14216e(this.f11474a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f11474a.hasOverlappingRendering() && this.f11474a.getLayerType() == 0) {
                this.f11475b = true;
                this.f11474a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (this.f11475b) {
                this.f11474a.setLayerType(0, null);
            }
            if (z7) {
                return;
            }
            AbstractC2857y.m14216e(this.f11474a, 1.0f);
            AbstractC2857y.m14212a(this.f11474a);
        }
    }

    public C2835c(int i7) {
        m14092m0(i7);
    }

    /* JADX INFO: renamed from: n0 */
    private Animator m14117n0(View view, float f7, float f8) {
        if (f7 == f8) {
            return null;
        }
        AbstractC2857y.m14216e(view, f7);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) AbstractC2857y.f11577b, f8);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        m14180y().mo14158a(aVar);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: o0 */
    private static float m14118o0(C2854v c2854v, float f7) {
        Float f8;
        return (c2854v == null || (f8 = (Float) c2854v.f11568a.get("android:fade:transitionAlpha")) == null) ? f7 : f8.floatValue();
    }

    @Override // androidx.transition.AbstractC2832L, androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: i */
    public void mo14087i(C2854v c2854v) {
        super.mo14087i(c2854v);
        Float fValueOf = (Float) c2854v.f11569b.getTag(AbstractC2840h.f11498d);
        if (fValueOf == null) {
            fValueOf = c2854v.f11569b.getVisibility() == 0 ? Float.valueOf(AbstractC2857y.m14213b(c2854v.f11569b)) : Float.valueOf(0.0f);
        }
        c2854v.f11568a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.AbstractC2832L
    /* JADX INFO: renamed from: i0 */
    public Animator mo14088i0(ViewGroup viewGroup, View view, C2854v c2854v, C2854v c2854v2) {
        AbstractC2857y.m14214c(view);
        return m14117n0(view, m14118o0(c2854v, 0.0f), 1.0f);
    }

    @Override // androidx.transition.AbstractC2832L
    /* JADX INFO: renamed from: k0 */
    public Animator mo14090k0(ViewGroup viewGroup, View view, C2854v c2854v, C2854v c2854v2) {
        AbstractC2857y.m14214c(view);
        Animator animatorM14117n0 = m14117n0(view, m14118o0(c2854v, 1.0f), 0.0f);
        if (animatorM14117n0 == null) {
            AbstractC2857y.m14216e(view, m14118o0(c2854v2, 1.0f));
        }
        return animatorM14117n0;
    }

    public C2835c() {
    }
}
