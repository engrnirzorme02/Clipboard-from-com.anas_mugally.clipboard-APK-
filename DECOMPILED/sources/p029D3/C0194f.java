package p029D3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import p223d.C5173c;
import p272j0.C5824b;
import p325p3.AbstractC6744e;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: D3.f */
/* JADX INFO: loaded from: classes2.dex */
public class C0194f extends AbstractC0189a {

    /* JADX INFO: renamed from: g */
    private final float f863g;

    /* JADX INFO: renamed from: h */
    private final float f864h;

    /* JADX INFO: renamed from: D3.f$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0194f.this.f851b.setTranslationY(0.0f);
            C0194f.this.m964k(0.0f);
        }
    }

    public C0194f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f863g = resources.getDimension(AbstractC6744e.f26354l);
        this.f864h = resources.getDimension(AbstractC6744e.f26356m);
    }

    /* JADX INFO: renamed from: g */
    private Animator m959g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f851b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f851b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f851b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i7), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C5824b());
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    public void m960f() {
        if (super.m940b() == null) {
            return;
        }
        Animator animatorM959g = m959g();
        animatorM959g.setDuration(this.f854e);
        animatorM959g.start();
    }

    /* JADX INFO: renamed from: h */
    public void m961h(C5173c c5173c, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f851b, (Property<View, Float>) View.TRANSLATION_Y, this.f851b.getHeight() * this.f851b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new C5824b());
        objectAnimatorOfFloat.setDuration(AbstractC6826a.m29845c(this.f852c, this.f853d, c5173c.m23958a()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: i */
    public void m962i(C5173c c5173c, Animator.AnimatorListener animatorListener) {
        Animator animatorM959g = m959g();
        animatorM959g.setDuration(AbstractC6826a.m29845c(this.f852c, this.f853d, c5173c.m23958a()));
        if (animatorListener != null) {
            animatorM959g.addListener(animatorListener);
        }
        animatorM959g.start();
    }

    /* JADX INFO: renamed from: j */
    public void m963j(C5173c c5173c) {
        super.m942d(c5173c);
    }

    /* JADX INFO: renamed from: k */
    public void m964k(float f7) {
        float fM939a = m939a(f7);
        float width = this.f851b.getWidth();
        float height = this.f851b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f8 = this.f863g / width;
        float f9 = this.f864h / height;
        float fM29843a = 1.0f - AbstractC6826a.m29843a(0.0f, f8, fM939a);
        float fM29843a2 = 1.0f - AbstractC6826a.m29843a(0.0f, f9, fM939a);
        if (Float.isNaN(fM29843a) || Float.isNaN(fM29843a2)) {
            return;
        }
        this.f851b.setScaleX(fM29843a);
        this.f851b.setPivotY(height);
        this.f851b.setScaleY(fM29843a2);
        View view = this.f851b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fM29843a2 != 0.0f ? fM29843a / fM29843a2 : 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m965l(C5173c c5173c) {
        if (super.m943e(c5173c) == null) {
            return;
        }
        m964k(c5173c.m23958a());
    }
}
