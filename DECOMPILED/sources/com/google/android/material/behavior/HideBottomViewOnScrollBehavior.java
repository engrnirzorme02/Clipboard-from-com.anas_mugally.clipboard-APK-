package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.AbstractC2263x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.AbstractC2436b;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p029D3.AbstractC0196h;
import p325p3.AbstractC6742c;
import p333q3.AbstractC6826a;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC2423c {

    /* JADX INFO: renamed from: x */
    private static final int f16370x = AbstractC6742c.f26224I;

    /* JADX INFO: renamed from: y */
    private static final int f16371y = AbstractC6742c.f26227L;

    /* JADX INFO: renamed from: z */
    private static final int f16372z = AbstractC6742c.f26234S;

    /* JADX INFO: renamed from: a */
    private final LinkedHashSet f16373a;

    /* JADX INFO: renamed from: b */
    private int f16374b;

    /* JADX INFO: renamed from: c */
    private int f16375c;

    /* JADX INFO: renamed from: d */
    private TimeInterpolator f16376d;

    /* JADX INFO: renamed from: e */
    private TimeInterpolator f16377e;

    /* JADX INFO: renamed from: f */
    private int f16378f;

    /* JADX INFO: renamed from: r */
    private AccessibilityManager f16379r;

    /* JADX INFO: renamed from: s */
    private AccessibilityManager.TouchExplorationStateChangeListener f16380s;

    /* JADX INFO: renamed from: t */
    private boolean f16381t;

    /* JADX INFO: renamed from: u */
    private int f16382u;

    /* JADX INFO: renamed from: v */
    private int f16383v;

    /* JADX INFO: renamed from: w */
    private ViewPropertyAnimator f16384w;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class ViewOnAttachStateChangeListenerC4405a implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC4405a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideBottomViewOnScrollBehavior.this.f16380s == null || HideBottomViewOnScrollBehavior.this.f16379r == null) {
                return;
            }
            HideBottomViewOnScrollBehavior.this.f16379r.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.f16380s);
            HideBottomViewOnScrollBehavior.this.f16380s = null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$b */
    class C4406b extends AnimatorListenerAdapter {
        C4406b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f16384w = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f16373a = new LinkedHashSet();
        this.f16378f = 0;
        this.f16381t = true;
        this.f16382u = 2;
        this.f16383v = 0;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m19538I(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z7) {
        if (!z7) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.m19546P()) {
            hideBottomViewOnScrollBehavior.m19550T(view);
        }
    }

    /* JADX INFO: renamed from: N */
    private void m19543N(View view, int i7, long j7, TimeInterpolator timeInterpolator) {
        this.f16384w = view.animate().translationY(i7).setInterpolator(timeInterpolator).setDuration(j7).setListener(new C4406b());
    }

    /* JADX INFO: renamed from: O */
    private void m19544O(final View view) {
        if (this.f16379r == null) {
            this.f16379r = (AccessibilityManager) AbstractC2436b.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f16379r == null || this.f16380s != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: s3.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z7) {
                HideBottomViewOnScrollBehavior.m19538I(this.f28011a, view, z7);
            }
        };
        this.f16380s = touchExplorationStateChangeListener;
        this.f16379r.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC4405a());
    }

    /* JADX INFO: renamed from: V */
    private void m19545V(View view, int i7) {
        this.f16382u = i7;
        Iterator it = this.f16373a.iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: E */
    public boolean mo10496E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7, int i8) {
        return i7 == 2;
    }

    /* JADX INFO: renamed from: P */
    public boolean m19546P() {
        return this.f16382u == 1;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m19547Q() {
        return this.f16382u == 2;
    }

    /* JADX INFO: renamed from: R */
    public void m19548R(View view) {
        m19549S(view, true);
    }

    /* JADX INFO: renamed from: S */
    public void m19549S(View view, boolean z7) {
        AccessibilityManager accessibilityManager;
        if (m19546P()) {
            return;
        }
        if (this.f16381t && (accessibilityManager = this.f16379r) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f16384w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        m19545V(view, 1);
        int i7 = this.f16378f + this.f16383v;
        if (z7) {
            m19543N(view, i7, this.f16375c, this.f16377e);
        } else {
            view.setTranslationY(i7);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m19550T(View view) {
        m19551U(view, true);
    }

    /* JADX INFO: renamed from: U */
    public void m19551U(View view, boolean z7) {
        if (m19547Q()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f16384w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        m19545V(view, 2);
        if (z7) {
            m19543N(view, 0, this.f16374b, this.f16376d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: p */
    public boolean mo10511p(CoordinatorLayout coordinatorLayout, View view, int i7) {
        this.f16378f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f16374b = AbstractC0196h.m978f(view.getContext(), f16370x, 225);
        this.f16375c = AbstractC0196h.m978f(view.getContext(), f16371y, 175);
        Context context = view.getContext();
        int i8 = f16372z;
        this.f16376d = AbstractC0196h.m979g(context, i8, AbstractC6826a.f27407d);
        this.f16377e = AbstractC0196h.m979g(view.getContext(), i8, AbstractC6826a.f27406c);
        m19544O(view);
        return super.mo10511p(coordinatorLayout, view, i7);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: x */
    public void mo10519x(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (i8 > 0) {
            m19548R(view);
        } else if (i8 < 0) {
            m19550T(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16373a = new LinkedHashSet();
        this.f16378f = 0;
        this.f16381t = true;
        this.f16382u = 2;
        this.f16383v = 0;
    }
}
