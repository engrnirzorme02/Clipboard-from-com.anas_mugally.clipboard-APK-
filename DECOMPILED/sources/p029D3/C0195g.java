package p029D3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import p223d.C5173c;
import p272j0.C5824b;
import p325p3.AbstractC6744e;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: D3.g */
/* JADX INFO: loaded from: classes2.dex */
public class C0195g extends AbstractC0189a {

    /* JADX INFO: renamed from: g */
    private final float f866g;

    /* JADX INFO: renamed from: h */
    private final float f867h;

    /* JADX INFO: renamed from: i */
    private final float f868i;

    /* JADX INFO: renamed from: D3.g$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f869a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f870b;

        a(boolean z7, int i7) {
            this.f869a = z7;
            this.f870b = i7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0195g.this.f851b.setTranslationX(0.0f);
            C0195g.this.m971k(0.0f, this.f869a, this.f870b);
        }
    }

    public C0195g(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f866g = resources.getDimension(AbstractC6744e.f26360o);
        this.f867h = resources.getDimension(AbstractC6744e.f26358n);
        this.f868i = resources.getDimension(AbstractC6744e.f26362p);
    }

    /* JADX INFO: renamed from: g */
    private boolean m966g(int i7, int i8) {
        return (Gravity.getAbsoluteGravity(i7, this.f851b.getLayoutDirection()) & i8) == i8;
    }

    /* JADX INFO: renamed from: i */
    private int m967i(boolean z7) {
        ViewGroup.LayoutParams layoutParams = this.f851b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z7 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    /* JADX INFO: renamed from: f */
    public void m968f() {
        if (super.m940b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f851b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f851b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f851b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i7), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f854e);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: h */
    public void m969h(C5173c c5173c, int i7, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z7 = c5173c.m23959b() == 0;
        boolean zM966g = m966g(i7, 3);
        float width = (this.f851b.getWidth() * this.f851b.getScaleX()) + m967i(zM966g);
        View view = this.f851b;
        Property property = View.TRANSLATION_X;
        if (zM966g) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new C5824b());
        objectAnimatorOfFloat.setDuration(AbstractC6826a.m29845c(this.f852c, this.f853d, c5173c.m23958a()));
        objectAnimatorOfFloat.addListener(new a(z7, i7));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: j */
    public void m970j(C5173c c5173c) {
        super.m942d(c5173c);
    }

    /* JADX INFO: renamed from: k */
    public void m971k(float f7, boolean z7, int i7) {
        float fM939a = m939a(f7);
        boolean zM966g = m966g(i7, 3);
        boolean z8 = z7 == zM966g;
        int width = this.f851b.getWidth();
        int height = this.f851b.getHeight();
        float f8 = width;
        if (f8 > 0.0f) {
            float f9 = height;
            if (f9 <= 0.0f) {
                return;
            }
            float f10 = this.f866g / f8;
            float f11 = this.f867h / f8;
            float f12 = this.f868i / f9;
            View view = this.f851b;
            if (zM966g) {
                f8 = 0.0f;
            }
            view.setPivotX(f8);
            if (!z8) {
                f11 = -f10;
            }
            float fM29843a = AbstractC6826a.m29843a(0.0f, f11, fM939a);
            float f13 = fM29843a + 1.0f;
            float fM29843a2 = 1.0f - AbstractC6826a.m29843a(0.0f, f12, fM939a);
            if (Float.isNaN(f13) || Float.isNaN(fM29843a2)) {
                return;
            }
            this.f851b.setScaleX(f13);
            this.f851b.setScaleY(fM29843a2);
            View view2 = this.f851b;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    childAt.setPivotX(zM966g ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f14 = z8 ? 1.0f - fM29843a : 1.0f;
                    float f15 = fM29843a2 != 0.0f ? (f13 / fM29843a2) * f14 : 1.0f;
                    if (!Float.isNaN(f14) && !Float.isNaN(f15)) {
                        childAt.setScaleX(f14);
                        childAt.setScaleY(f15);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m972l(C5173c c5173c, int i7) {
        if (super.m943e(c5173c) == null) {
            return;
        }
        m971k(c5173c.m23958a(), c5173c.m23959b() == 0, i7);
    }
}
