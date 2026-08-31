package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.AbstractC2263x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.AbstractC2436b;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p029D3.AbstractC0196h;
import p325p3.AbstractC6742c;
import p333q3.AbstractC6826a;

/* JADX INFO: loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC2423c {

    /* JADX INFO: renamed from: a */
    private AbstractC4416d f16390a;

    /* JADX INFO: renamed from: b */
    private AccessibilityManager f16391b;

    /* JADX INFO: renamed from: c */
    private AccessibilityManager.TouchExplorationStateChangeListener f16392c;

    /* JADX INFO: renamed from: d */
    private boolean f16393d;

    /* JADX INFO: renamed from: e */
    private final LinkedHashSet f16394e;

    /* JADX INFO: renamed from: f */
    private int f16395f;

    /* JADX INFO: renamed from: r */
    private int f16396r;

    /* JADX INFO: renamed from: s */
    private TimeInterpolator f16397s;

    /* JADX INFO: renamed from: t */
    private TimeInterpolator f16398t;

    /* JADX INFO: renamed from: u */
    private int f16399u;

    /* JADX INFO: renamed from: v */
    private int f16400v;

    /* JADX INFO: renamed from: w */
    private int f16401w;

    /* JADX INFO: renamed from: x */
    private ViewPropertyAnimator f16402x;

    /* JADX INFO: renamed from: y */
    private boolean f16403y;

    /* JADX INFO: renamed from: z */
    private static final int f16389z = AbstractC6742c.f26224I;

    /* JADX INFO: renamed from: A */
    private static final int f16387A = AbstractC6742c.f26227L;

    /* JADX INFO: renamed from: B */
    private static final int f16388B = AbstractC6742c.f26234S;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideViewOnScrollBehavior$a */
    class ViewOnAttachStateChangeListenerC4407a implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC4407a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideViewOnScrollBehavior.this.f16392c == null || HideViewOnScrollBehavior.this.f16391b == null) {
                return;
            }
            HideViewOnScrollBehavior.this.f16391b.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f16392c);
            HideViewOnScrollBehavior.this.f16392c = null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideViewOnScrollBehavior$b */
    class C4408b extends AnimatorListenerAdapter {
        C4408b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.f16402x = null;
        }
    }

    public HideViewOnScrollBehavior() {
        this.f16393d = true;
        this.f16394e = new LinkedHashSet();
        this.f16399u = 0;
        this.f16400v = 2;
        this.f16401w = 0;
        this.f16403y = false;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m19552I(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z7) {
        if (hideViewOnScrollBehavior.f16393d && z7 && hideViewOnScrollBehavior.m19565S()) {
            hideViewOnScrollBehavior.m19566V(view);
        }
    }

    /* JADX INFO: renamed from: N */
    private void m19557N(View view, int i7, long j7, TimeInterpolator timeInterpolator) {
        this.f16402x = this.f16390a.mo19587d(view, i7).setInterpolator(timeInterpolator).setDuration(j7).setListener(new C4408b());
    }

    /* JADX INFO: renamed from: O */
    private void m19558O(final View view) {
        if (this.f16391b == null) {
            this.f16391b = (AccessibilityManager) AbstractC2436b.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f16391b == null || this.f16392c != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: s3.b
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z7) {
                HideViewOnScrollBehavior.m19552I(this.f28013a, view, z7);
            }
        };
        this.f16392c = touchExplorationStateChangeListener;
        this.f16391b.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC4407a());
    }

    /* JADX INFO: renamed from: P */
    private boolean m19559P(int i7) {
        return i7 == 80 || i7 == 81;
    }

    /* JADX INFO: renamed from: Q */
    private boolean m19560Q(int i7) {
        return i7 == 3 || i7 == 19;
    }

    /* JADX INFO: renamed from: T */
    private void m19561T(View view, int i7) {
        if (this.f16403y) {
            return;
        }
        int i8 = ((CoordinatorLayout.C2426f) view.getLayoutParams()).f9257c;
        if (m19559P(i8)) {
            m19562U(1);
        } else {
            m19562U(m19560Q(Gravity.getAbsoluteGravity(i8, i7)) ? 2 : 0);
        }
    }

    /* JADX INFO: renamed from: U */
    private void m19562U(int i7) {
        AbstractC4416d abstractC4416d = this.f16390a;
        if (abstractC4416d == null || abstractC4416d.mo19586c() != i7) {
            if (i7 == 0) {
                this.f16390a = new C4415c();
                return;
            }
            if (i7 == 1) {
                this.f16390a = new C4413a();
                return;
            }
            if (i7 == 2) {
                this.f16390a = new C4414b();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i7 + ". Must be 0, 1 or 2.");
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m19563Z(View view, int i7) {
        this.f16400v = i7;
        Iterator it = this.f16394e.iterator();
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

    /* JADX INFO: renamed from: R */
    public boolean m19564R() {
        return this.f16400v == 2;
    }

    /* JADX INFO: renamed from: S */
    public boolean m19565S() {
        return this.f16400v == 1;
    }

    /* JADX INFO: renamed from: V */
    public void m19566V(View view) {
        m19567W(view, true);
    }

    /* JADX INFO: renamed from: W */
    public void m19567W(View view, boolean z7) {
        if (m19564R()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f16402x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        m19563Z(view, 2);
        int iMo19585b = this.f16390a.mo19585b();
        if (z7) {
            m19557N(view, iMo19585b, this.f16395f, this.f16397s);
        } else {
            this.f16390a.mo19588e(view, iMo19585b);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m19568X(View view) {
        m19569Y(view, true);
    }

    /* JADX INFO: renamed from: Y */
    public void m19569Y(View view, boolean z7) {
        AccessibilityManager accessibilityManager;
        if (m19565S()) {
            return;
        }
        if (this.f16393d && (accessibilityManager = this.f16391b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f16402x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        m19563Z(view, 1);
        int i7 = this.f16399u + this.f16401w;
        if (z7) {
            m19557N(view, i7, this.f16396r, this.f16398t);
        } else {
            this.f16390a.mo19588e(view, i7);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: p */
    public boolean mo10511p(CoordinatorLayout coordinatorLayout, View view, int i7) {
        m19558O(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        m19561T(view, i7);
        this.f16399u = this.f16390a.mo19584a(view, marginLayoutParams);
        this.f16395f = AbstractC0196h.m978f(view.getContext(), f16389z, 225);
        this.f16396r = AbstractC0196h.m978f(view.getContext(), f16387A, 175);
        Context context = view.getContext();
        int i8 = f16388B;
        this.f16397s = AbstractC0196h.m979g(context, i8, AbstractC6826a.f27407d);
        this.f16398t = AbstractC0196h.m979g(view.getContext(), i8, AbstractC6826a.f27406c);
        return super.mo10511p(coordinatorLayout, view, i7);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: x */
    public void mo10519x(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (i8 > 0) {
            m19568X(view);
        } else if (i8 < 0) {
            m19566V(view);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16393d = true;
        this.f16394e = new LinkedHashSet();
        this.f16399u = 0;
        this.f16400v = 2;
        this.f16401w = 0;
        this.f16403y = false;
    }
}
