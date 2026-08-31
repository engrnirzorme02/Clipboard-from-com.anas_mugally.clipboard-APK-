package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p325p3.AbstractC6746g;
import p333q3.AbstractC6826a;
import p333q3.AbstractC6827b;
import p333q3.C6828c;
import p333q3.C6831f;
import p333q3.C6832g;
import p333q3.C6833h;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    private final Rect f18212c;

    /* JADX INFO: renamed from: d */
    private final RectF f18213d;

    /* JADX INFO: renamed from: e */
    private final RectF f18214e;

    /* JADX INFO: renamed from: f */
    private final int[] f18215f;

    /* JADX INFO: renamed from: r */
    private float f18216r;

    /* JADX INFO: renamed from: s */
    private float f18217s;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C4678a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f18218a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f18219b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f18220c;

        C4678a(boolean z7, View view, View view2) {
            this.f18218a = z7;
            this.f18219b = view;
            this.f18220c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f18218a) {
                return;
            }
            this.f18219b.setVisibility(4);
            this.f18220c.setAlpha(1.0f);
            this.f18220c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f18218a) {
                this.f18219b.setVisibility(0);
                this.f18220c.setAlpha(0.0f);
                this.f18220c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    protected static class C4679b {

        /* JADX INFO: renamed from: a */
        public C6831f f18222a;

        /* JADX INFO: renamed from: b */
        public C6833h f18223b;

        protected C4679b() {
        }
    }

    public FabTransformationBehavior() {
        this.f18212c = new Rect();
        this.f18213d = new RectF();
        this.f18214e = new RectF();
        this.f18215f = new int[2];
    }

    /* JADX INFO: renamed from: O */
    private ViewGroup m21804O(View view) {
        View viewFindViewById = view.findViewById(AbstractC6746g.f26397E);
        return viewFindViewById != null ? m21819e0(viewFindViewById) : m21819e0(view);
    }

    /* JADX INFO: renamed from: P */
    private void m21805P(View view, C4679b c4679b, C6832g c6832g, C6832g c6832g2, float f7, float f8, float f9, float f10, RectF rectF) {
        float fM21810U = m21810U(c4679b, c6832g, f7, f9);
        float fM21810U2 = m21810U(c4679b, c6832g2, f8, f10);
        Rect rect = this.f18212c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f18213d;
        rectF2.set(rect);
        RectF rectF3 = this.f18214e;
        m21811V(view, rectF3);
        rectF3.offset(fM21810U, fM21810U2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* JADX INFO: renamed from: Q */
    private void m21806Q(View view, RectF rectF) {
        m21811V(view, rectF);
        rectF.offset(this.f18216r, this.f18217s);
    }

    /* JADX INFO: renamed from: R */
    private Pair m21807R(float f7, float f8, boolean z7, C4679b c4679b) {
        C6832g c6832gM29858h;
        C6832g c6832gM29858h2;
        if (f7 == 0.0f || f8 == 0.0f) {
            c6832gM29858h = c4679b.f18222a.m29858h("translationXLinear");
            c6832gM29858h2 = c4679b.f18222a.m29858h("translationYLinear");
        } else if ((!z7 || f8 >= 0.0f) && (z7 || f8 <= 0.0f)) {
            c6832gM29858h = c4679b.f18222a.m29858h("translationXCurveDownwards");
            c6832gM29858h2 = c4679b.f18222a.m29858h("translationYCurveDownwards");
        } else {
            c6832gM29858h = c4679b.f18222a.m29858h("translationXCurveUpwards");
            c6832gM29858h2 = c4679b.f18222a.m29858h("translationYCurveUpwards");
        }
        return new Pair(c6832gM29858h, c6832gM29858h2);
    }

    /* JADX INFO: renamed from: S */
    private float m21808S(View view, View view2, C6833h c6833h) {
        float fCenterX;
        float fCenterX2;
        float f7;
        RectF rectF = this.f18213d;
        RectF rectF2 = this.f18214e;
        m21806Q(view, rectF);
        m21811V(view2, rectF2);
        int i7 = c6833h.f27421a & 7;
        if (i7 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i7 != 3) {
                if (i7 != 5) {
                    f7 = 0.0f;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f7 + c6833h.f27422b;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f7 = fCenterX - fCenterX2;
        return f7 + c6833h.f27422b;
    }

    /* JADX INFO: renamed from: T */
    private float m21809T(View view, View view2, C6833h c6833h) {
        float fCenterY;
        float fCenterY2;
        float f7;
        RectF rectF = this.f18213d;
        RectF rectF2 = this.f18214e;
        m21806Q(view, rectF);
        m21811V(view2, rectF2);
        int i7 = c6833h.f27421a & 112;
        if (i7 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i7 != 48) {
                if (i7 != 80) {
                    f7 = 0.0f;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f7 + c6833h.f27423c;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f7 = fCenterY - fCenterY2;
        return f7 + c6833h.f27423c;
    }

    /* JADX INFO: renamed from: U */
    private float m21810U(C4679b c4679b, C6832g c6832g, float f7, float f8) {
        long jM29865c = c6832g.m29865c();
        long jM29866d = c6832g.m29866d();
        C6832g c6832gM29858h = c4679b.f18222a.m29858h("expansion");
        return AbstractC6826a.m29843a(f7, f8, c6832g.m29867e().getInterpolation((((c6832gM29858h.m29865c() + c6832gM29858h.m29866d()) + 17) - jM29865c) / jM29866d));
    }

    /* JADX INFO: renamed from: V */
    private void m21811V(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f18215f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* JADX INFO: renamed from: W */
    private void m21812W(View view, View view2, boolean z7, boolean z8, C4679b c4679b, List list, List list2) {
        ViewGroup viewGroupM21804O;
        ObjectAnimator objectAnimatorOfFloat;
        if ((view2 instanceof ViewGroup) && (viewGroupM21804O = m21804O(view2)) != null) {
            if (z7) {
                if (!z8) {
                    C6828c.f27409a.set(viewGroupM21804O, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM21804O, (Property<ViewGroup, Float>) C6828c.f27409a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM21804O, (Property<ViewGroup, Float>) C6828c.f27409a, 0.0f);
            }
            c4679b.f18222a.m29858h("contentFade").m29864a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX INFO: renamed from: X */
    private void m21813X(View view, View view2, boolean z7, boolean z8, C4679b c4679b, List list, List list2) {
    }

    /* JADX INFO: renamed from: Y */
    private void m21814Y(View view, View view2, boolean z7, C4679b c4679b, List list) {
        float fM21808S = m21808S(view, view2, c4679b.f18223b);
        float fM21809T = m21809T(view, view2, c4679b.f18223b);
        Pair pairM21807R = m21807R(fM21808S, fM21809T, z7, c4679b);
        C6832g c6832g = (C6832g) pairM21807R.first;
        C6832g c6832g2 = (C6832g) pairM21807R.second;
        Property property = View.TRANSLATION_X;
        if (!z7) {
            fM21808S = this.f18216r;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fM21808S);
        Property property2 = View.TRANSLATION_Y;
        if (!z7) {
            fM21809T = this.f18217s;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fM21809T);
        c6832g.m29864a(objectAnimatorOfFloat);
        c6832g2.m29864a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: Z */
    private void m21815Z(View view, View view2, boolean z7, boolean z8, C4679b c4679b, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float elevation = view2.getElevation() - view.getElevation();
        if (z7) {
            if (!z8) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        c4679b.f18222a.m29858h("elevation").m29864a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: a0 */
    private void m21816a0(View view, View view2, boolean z7, boolean z8, C4679b c4679b, float f7, float f8, List list, List list2) {
    }

    /* JADX INFO: renamed from: b0 */
    private void m21817b0(View view, View view2, boolean z7, boolean z8, C4679b c4679b, List list, List list2) {
    }

    /* JADX INFO: renamed from: c0 */
    private void m21818c0(View view, View view2, boolean z7, boolean z8, C4679b c4679b, List list, List list2, RectF rectF) {
        C6832g c6832g;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fM21808S = m21808S(view, view2, c4679b.f18223b);
        float fM21809T = m21809T(view, view2, c4679b.f18223b);
        Pair pairM21807R = m21807R(fM21808S, fM21809T, z7, c4679b);
        C6832g c6832g2 = (C6832g) pairM21807R.first;
        C6832g c6832g3 = (C6832g) pairM21807R.second;
        if (z7) {
            if (!z8) {
                view2.setTranslationX(-fM21808S);
                view2.setTranslationY(-fM21809T);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            m21805P(view2, c4679b, c6832g2, c6832g3, -fM21808S, -fM21809T, 0.0f, 0.0f, rectF);
            c6832g2 = c6832g2;
            c6832g = c6832g3;
        } else {
            c6832g = c6832g3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM21808S);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM21809T);
        }
        c6832g2.m29864a(objectAnimatorOfFloat);
        c6832g.m29864a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: e0 */
    private ViewGroup m21819e0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: N */
    protected AnimatorSet mo21803N(View view, View view2, boolean z7, boolean z8) {
        C4679b c4679bMo21820d0 = mo21820d0(view2.getContext(), z7);
        if (z7) {
            this.f18216r = view.getTranslationX();
            this.f18217s = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m21815Z(view, view2, z7, z8, c4679bMo21820d0, arrayList, arrayList2);
        RectF rectF = this.f18213d;
        m21818c0(view, view2, z7, z8, c4679bMo21820d0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        m21814Y(view, view2, z7, c4679bMo21820d0, arrayList);
        m21817b0(view, view2, z7, z8, c4679bMo21820d0, arrayList, arrayList2);
        m21816a0(view, view2, z7, z8, c4679bMo21820d0, fWidth, fHeight, arrayList, arrayList2);
        m21813X(view, view2, z7, z8, c4679bMo21820d0, arrayList, arrayList2);
        m21812W(view, view2, z7, z8, c4679bMo21820d0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC6827b.m29846a(animatorSet, arrayList);
        animatorSet.addListener(new C4678a(z7, view2, view));
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i7));
        }
        return animatorSet;
    }

    /* JADX INFO: renamed from: d0 */
    protected abstract C4679b mo21820d0(Context context, boolean z7);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: i */
    public boolean mo10504i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: k */
    public void mo10506k(CoordinatorLayout.C2426f c2426f) {
        if (c2426f.f9262h == 0) {
            c2426f.f9262h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18212c = new Rect();
        this.f18213d = new RectF();
        this.f18214e = new RectF();
        this.f18215f = new int[2];
    }
}
