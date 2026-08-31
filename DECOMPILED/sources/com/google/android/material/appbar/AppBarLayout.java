package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.AbstractC2263x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.drawable.AbstractC4498d;
import com.google.android.material.internal.AbstractC4543s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p029D3.AbstractC0196h;
import p041F.AbstractC0400a;
import p045F3.AbstractC0423c;
import p065I.AbstractC0577a;
import p069I3.AbstractC0623j;
import p069I3.C0622i;
import p093L3.AbstractC0842a;
import p104N.AbstractC0905b;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p111O.C1032a;
import p111O.InterfaceC0983B;
import p111O.InterfaceC0993G;
import p118P.C1170s;
import p146T.AbstractC1446a;
import p263i.AbstractC5659a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6747h;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p333q3.AbstractC6826a;
import p397y3.AbstractC7539a;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC2422b {

    /* JADX INFO: renamed from: M */
    private static final int f16282M = AbstractC6751l.f26542g;

    /* JADX INFO: renamed from: A */
    private ValueAnimator f16283A;

    /* JADX INFO: renamed from: B */
    private ValueAnimator.AnimatorUpdateListener f16284B;

    /* JADX INFO: renamed from: C */
    private final List f16285C;

    /* JADX INFO: renamed from: D */
    private final LinkedHashSet f16286D;

    /* JADX INFO: renamed from: E */
    private final long f16287E;

    /* JADX INFO: renamed from: F */
    private final TimeInterpolator f16288F;

    /* JADX INFO: renamed from: G */
    private int[] f16289G;

    /* JADX INFO: renamed from: H */
    private int f16290H;

    /* JADX INFO: renamed from: I */
    private Drawable f16291I;

    /* JADX INFO: renamed from: J */
    private Integer f16292J;

    /* JADX INFO: renamed from: K */
    private final float f16293K;

    /* JADX INFO: renamed from: L */
    private Behavior f16294L;

    /* JADX INFO: renamed from: a */
    private int f16295a;

    /* JADX INFO: renamed from: b */
    private int f16296b;

    /* JADX INFO: renamed from: c */
    private int f16297c;

    /* JADX INFO: renamed from: d */
    private int f16298d;

    /* JADX INFO: renamed from: e */
    private boolean f16299e;

    /* JADX INFO: renamed from: f */
    private int f16300f;

    /* JADX INFO: renamed from: r */
    private C0982A0 f16301r;

    /* JADX INFO: renamed from: s */
    private List f16302s;

    /* JADX INFO: renamed from: t */
    private boolean f16303t;

    /* JADX INFO: renamed from: u */
    private boolean f16304u;

    /* JADX INFO: renamed from: v */
    private boolean f16305v;

    /* JADX INFO: renamed from: w */
    private boolean f16306w;

    /* JADX INFO: renamed from: x */
    private ColorStateList f16307x;

    /* JADX INFO: renamed from: y */
    private int f16308y;

    /* JADX INFO: renamed from: z */
    private WeakReference f16309z;

    protected static class BaseBehavior<T extends AppBarLayout> extends AbstractC4400c {

        /* JADX INFO: renamed from: v */
        private int f16310v;

        /* JADX INFO: renamed from: w */
        private int f16311w;

        /* JADX INFO: renamed from: x */
        private ValueAnimator f16312x;

        /* JADX INFO: renamed from: y */
        private C4393c f16313y;

        /* JADX INFO: renamed from: z */
        private WeakReference f16314z;

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C4391a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CoordinatorLayout f16315a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AppBarLayout f16316b;

            C4391a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f16315a = coordinatorLayout;
                this.f16316b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m19522T(this.f16315a, this.f16316b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        class C4392b extends C1032a {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ AppBarLayout f16318d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ CoordinatorLayout f16319e;

            C4392b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f16318d = appBarLayout;
                this.f16319e = coordinatorLayout;
            }

            @Override // p111O.C1032a
            /* JADX INFO: renamed from: g */
            public void mo4585g(View view, C1170s c1170s) {
                View viewM19469j0;
                super.mo4585g(view, c1170s);
                c1170s.m5069m0(ScrollView.class.getName());
                if (this.f16318d.getTotalScrollRange() == 0 || (viewM19469j0 = BaseBehavior.this.m19469j0(this.f16319e)) == null || !BaseBehavior.this.m19465f0(this.f16318d)) {
                    return;
                }
                if (BaseBehavior.this.mo19475Q() != (-this.f16318d.getTotalScrollRange())) {
                    c1170s.m5052b(C1170s.a.f4121q);
                    c1170s.m5023H0(true);
                }
                if (BaseBehavior.this.mo19475Q() != 0) {
                    if (!viewM19469j0.canScrollVertically(-1)) {
                        c1170s.m5052b(C1170s.a.f4122r);
                        c1170s.m5023H0(true);
                    } else if ((-this.f16318d.getDownNestedPreScrollRange()) != 0) {
                        c1170s.m5052b(C1170s.a.f4122r);
                        c1170s.m5023H0(true);
                    }
                }
            }

            @Override // p111O.C1032a
            /* JADX INFO: renamed from: j */
            public boolean mo4588j(View view, int i7, Bundle bundle) {
                if (i7 == 4096) {
                    this.f16318d.setExpanded(false);
                    return true;
                }
                if (i7 != 8192) {
                    return super.mo4588j(view, i7, bundle);
                }
                if (BaseBehavior.this.mo19475Q() != 0) {
                    View viewM19469j0 = BaseBehavior.this.m19469j0(this.f16319e);
                    if (!viewM19469j0.canScrollVertically(-1)) {
                        this.f16318d.setExpanded(true);
                        return true;
                    }
                    int i8 = -this.f16318d.getDownNestedPreScrollRange();
                    if (i8 != 0) {
                        BaseBehavior.this.mo10516u(this.f16319e, this.f16318d, viewM19469j0, 0, i8, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        /* JADX INFO: renamed from: A0 */
        private void m19454A0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iMo19475Q = mo19475Q() - topInset;
            int iM19468i0 = m19468i0(appBarLayout, iMo19475Q);
            if (iM19468i0 >= 0) {
                View childAt = appBarLayout.getChildAt(iM19468i0);
                C4397d c4397d = (C4397d) childAt.getLayoutParams();
                int iM19509c = c4397d.m19509c();
                if ((iM19509c & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (iM19468i0 == 0 && appBarLayout.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (m19464e0(iM19509c, 2)) {
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (m19464e0(iM19509c, 5)) {
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (iMo19475Q < minimumHeight2) {
                            topInset2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (m19464e0(iM19509c, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) c4397d).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) c4397d).bottomMargin;
                    }
                    m19460Z(coordinatorLayout, appBarLayout, AbstractC0577a.m2541b(m19462b0(iMo19475Q, minimumHeight, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* JADX INFO: renamed from: B0 */
        private void m19455B0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, int i8, boolean z7) {
            View viewM19467h0 = m19467h0(appBarLayout, i7);
            boolean zM19441C = false;
            if (viewM19467h0 != null) {
                int iM19509c = ((C4397d) viewM19467h0.getLayoutParams()).m19509c();
                if ((iM19509c & 1) != 0) {
                    int minimumHeight = viewM19467h0.getMinimumHeight();
                    if (i8 <= 0 || (iM19509c & 12) == 0 ? !((iM19509c & 2) == 0 || (-i7) < (viewM19467h0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i7) >= (viewM19467h0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zM19441C = true;
                    }
                }
            }
            if (appBarLayout.m19447o()) {
                zM19441C = appBarLayout.m19441C(m19466g0(coordinatorLayout));
            }
            boolean zM19453z = appBarLayout.m19453z(zM19441C);
            if (z7 || (zM19453z && m19471z0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        /* JADX INFO: renamed from: Y */
        private void m19459Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (AbstractC1030Z.m4440L(coordinatorLayout)) {
                return;
            }
            AbstractC1030Z.m4474j0(coordinatorLayout, new C4392b(appBarLayout, coordinatorLayout));
        }

        /* JADX INFO: renamed from: Z */
        private void m19460Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, float f7) {
            int iAbs = Math.abs(mo19475Q() - i7);
            float fAbs = Math.abs(f7);
            m19461a0(coordinatorLayout, appBarLayout, i7, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        /* JADX INFO: renamed from: a0 */
        private void m19461a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, int i8) {
            int iMo19475Q = mo19475Q();
            if (iMo19475Q == i7) {
                ValueAnimator valueAnimator = this.f16312x;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f16312x.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f16312x;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f16312x = valueAnimator3;
                valueAnimator3.setInterpolator(AbstractC6826a.f27408e);
                this.f16312x.addUpdateListener(new C4391a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f16312x.setDuration(Math.min(i8, 600));
            this.f16312x.setIntValues(iMo19475Q, i7);
            this.f16312x.start();
        }

        /* JADX INFO: renamed from: b0 */
        private int m19462b0(int i7, int i8, int i9) {
            return i7 < (i8 + i9) / 2 ? i8 : i9;
        }

        /* JADX INFO: renamed from: d0 */
        private boolean m19463d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.m19446k() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        /* JADX INFO: renamed from: e0 */
        private static boolean m19464e0(int i7, int i8) {
            return (i7 & i8) == i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f0 */
        public boolean m19465f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                if (((C4397d) appBarLayout.getChildAt(i7).getLayoutParams()).f16329a != 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: g0 */
        private View m19466g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if ((childAt instanceof InterfaceC0983B) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: h0 */
        private static View m19467h0(AppBarLayout appBarLayout, int i7) {
            int iAbs = Math.abs(i7);
            int childCount = appBarLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = appBarLayout.getChildAt(i8);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: i0 */
        private int m19468i0(AppBarLayout appBarLayout, int i7) {
            int childCount = appBarLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = appBarLayout.getChildAt(i8);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C4397d c4397d = (C4397d) childAt.getLayoutParams();
                if (m19464e0(c4397d.m19509c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c4397d).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c4397d).bottomMargin;
                }
                int i9 = -i7;
                if (top <= i9 && bottom >= i9) {
                    return i8;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j0 */
        public View m19469j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (((CoordinatorLayout.C2426f) childAt.getLayoutParams()).m10530f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: m0 */
        private int m19470m0(AppBarLayout appBarLayout, int i7) {
            int iAbs = Math.abs(i7);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = appBarLayout.getChildAt(i8);
                C4397d c4397d = (C4397d) childAt.getLayoutParams();
                Interpolator interpolatorM19510d = c4397d.m19510d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorM19510d == null) {
                        break;
                    }
                    int iM19509c = c4397d.m19509c();
                    if ((iM19509c & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) c4397d).topMargin + ((LinearLayout.LayoutParams) c4397d).bottomMargin;
                        if ((iM19509c & 2) != 0) {
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f7 = topInset;
                    return Integer.signum(i7) * (childAt.getTop() + Math.round(f7 * interpolatorM19510d.getInterpolation((iAbs - childAt.getTop()) / f7)));
                }
            }
            return i7;
        }

        /* JADX INFO: renamed from: z0 */
        private boolean m19471z0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listM10489w = coordinatorLayout.m10489w(appBarLayout);
            int size = listM10489w.size();
            for (int i7 = 0; i7 < size; i7++) {
                CoordinatorLayout.AbstractC2423c abstractC2423cM10530f = ((CoordinatorLayout.C2426f) ((View) listM10489w.get(i7)).getLayoutParams()).m10530f();
                if (abstractC2423cM10530f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) abstractC2423cM10530f).m19526O() != 0;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.AbstractC4400c
        /* JADX INFO: renamed from: Q */
        int mo19475Q() {
            return mo19496I() + this.f16310v;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4400c
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean mo19472L(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f16314z;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4400c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int mo19473O(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4400c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int mo19474P(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4400c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void mo19476R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m19454A0(coordinatorLayout, appBarLayout);
            if (appBarLayout.m19447o()) {
                appBarLayout.m19453z(appBarLayout.m19441C(m19466g0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.AbstractC4402e, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean mo10511p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7) {
            boolean zMo10511p = super.mo10511p(coordinatorLayout, appBarLayout, i7);
            int pendingAction = appBarLayout.getPendingAction();
            C4393c c4393c = this.f16313y;
            if (c4393c == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z7 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i8 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z7) {
                            m19460Z(coordinatorLayout, appBarLayout, i8, 0.0f);
                        } else {
                            m19522T(coordinatorLayout, appBarLayout, i8);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z7) {
                            m19460Z(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            m19522T(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (c4393c.f16321c) {
                m19522T(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (c4393c.f16322d) {
                m19522T(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(c4393c.f16323e);
                m19522T(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f16313y.f16325r ? childAt.getMinimumHeight() + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f16313y.f16324f)));
            }
            appBarLayout.m19451v();
            this.f16313y = null;
            mo19497K(AbstractC0577a.m2541b(mo19496I(), -appBarLayout.getTotalScrollRange(), 0));
            m19455B0(coordinatorLayout, appBarLayout, mo19496I(), 0, true);
            appBarLayout.m19449t(mo19496I());
            m19459Y(coordinatorLayout, appBarLayout);
            return zMo10511p;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean mo10512q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, int i8, int i9, int i10) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C2426f) appBarLayout.getLayoutParams())).height != -2) {
                return super.mo10512q(coordinatorLayout, appBarLayout, i7, i8, i9, i10);
            }
            coordinatorLayout.m10477R(appBarLayout, i7, i8, View.MeasureSpec.makeMeasureSpec(0, 0), i10);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public void mo10516u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int[] iArr, int i9) {
            AppBarLayout appBarLayout2;
            int i10;
            int downNestedPreScrollRange;
            if (i8 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i8 < 0) {
                    i10 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i10;
                } else {
                    i10 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i11 = i10;
                int i12 = downNestedPreScrollRange;
                if (i11 != i12) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = m19521S(coordinatorLayout, appBarLayout2, i8, i11, i12);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.m19447o()) {
                appBarLayout2.m19453z(appBarLayout2.m19441C(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void mo10519x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i12;
            if (i10 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i12 = i10;
                iArr[1] = m19521S(coordinatorLayout2, appBarLayout2, i12, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i12 = i10;
            }
            if (i12 == 0) {
                m19459Y(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void mo10493B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof C4393c) {
                m19490w0((C4393c) parcelable, true);
                super.mo10493B(coordinatorLayout, appBarLayout, this.f16313y.m6085a());
            } else {
                super.mo10493B(coordinatorLayout, appBarLayout, parcelable);
                this.f16313y = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable mo10494C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableMo10494C = super.mo10494C(coordinatorLayout, appBarLayout);
            C4393c c4393cM19491x0 = m19491x0(parcelableMo10494C, appBarLayout);
            return c4393cM19491x0 == null ? parcelableMo10494C : c4393cM19491x0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean mo10496E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i7, int i8) {
            ValueAnimator valueAnimator;
            boolean z7 = (i7 & 2) != 0 && (appBarLayout.m19447o() || appBarLayout.m19448q() || m19463d0(coordinatorLayout, appBarLayout, view));
            if (z7 && (valueAnimator = this.f16312x) != null) {
                valueAnimator.cancel();
            }
            this.f16314z = null;
            this.f16311w = i8;
            return z7;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void mo10498G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7) {
            if (this.f16311w == 0 || i7 == 1) {
                m19454A0(coordinatorLayout, appBarLayout);
                if (appBarLayout.m19447o()) {
                    appBarLayout.m19453z(appBarLayout.m19441C(view));
                }
            }
            this.f16314z = new WeakReference(view);
        }

        /* JADX INFO: renamed from: w0 */
        void m19490w0(C4393c c4393c, boolean z7) {
            if (this.f16313y == null || z7) {
                this.f16313y = c4393c;
            }
        }

        /* JADX INFO: renamed from: x0 */
        C4393c m19491x0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iMo19496I = mo19496I();
            int childCount = appBarLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = appBarLayout.getChildAt(i7);
                int bottom = childAt.getBottom() + iMo19496I;
                if (childAt.getTop() + iMo19496I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC1446a.f4974b;
                    }
                    C4393c c4393c = new C4393c(parcelable);
                    boolean z7 = iMo19496I == 0;
                    c4393c.f16322d = z7;
                    c4393c.f16321c = !z7 && (-iMo19496I) >= appBarLayout.getTotalScrollRange();
                    c4393c.f16323e = i7;
                    c4393c.f16325r = bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset();
                    c4393c.f16324f = bottom / childAt.getHeight();
                    return c4393c;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4400c
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int mo19477U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, int i8, int i9) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int iMo19475Q = mo19475Q();
            int i10 = 0;
            if (i8 == 0 || iMo19475Q < i8 || iMo19475Q > i9) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                this.f16310v = 0;
            } else {
                int iM2541b = AbstractC0577a.m2541b(i7, i8, i9);
                if (iMo19475Q != iM2541b) {
                    int iM19470m0 = appBarLayout.m19445i() ? m19470m0(appBarLayout, iM2541b) : iM2541b;
                    boolean zMo19497K = mo19497K(iM19470m0);
                    int i11 = iMo19475Q - iM2541b;
                    this.f16310v = iM2541b - iM19470m0;
                    if (zMo19497K) {
                        while (i10 < appBarLayout.getChildCount()) {
                            C4397d c4397d = (C4397d) appBarLayout.getChildAt(i10).getLayoutParams();
                            AbstractC4395b abstractC4395bM19508b = c4397d.m19508b();
                            if (abstractC4395bM19508b != null && (c4397d.m19509c() & 1) != 0) {
                                abstractC4395bM19508b.mo19505a(appBarLayout, appBarLayout.getChildAt(i10), mo19496I());
                            }
                            i10++;
                        }
                    }
                    if (!zMo19497K && appBarLayout.m19445i()) {
                        coordinatorLayout.m10481g(appBarLayout);
                    }
                    appBarLayout.m19449t(mo19496I());
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                    m19455B0(coordinatorLayout2, appBarLayout2, iM2541b, iM2541b < iMo19475Q ? -1 : 1, false);
                    i10 = i11;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                }
            }
            m19459Y(coordinatorLayout2, appBarLayout2);
            return i10;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        protected static class C4393c extends AbstractC1446a {
            public static final Parcelable.Creator<C4393c> CREATOR = new a();

            /* JADX INFO: renamed from: c */
            boolean f16321c;

            /* JADX INFO: renamed from: d */
            boolean f16322d;

            /* JADX INFO: renamed from: e */
            int f16323e;

            /* JADX INFO: renamed from: f */
            float f16324f;

            /* JADX INFO: renamed from: r */
            boolean f16325r;

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c$a */
            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public C4393c createFromParcel(Parcel parcel) {
                    return new C4393c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public C4393c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C4393c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public C4393c[] newArray(int i7) {
                    return new C4393c[i7];
                }
            }

            public C4393c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f16321c = parcel.readByte() != 0;
                this.f16322d = parcel.readByte() != 0;
                this.f16323e = parcel.readInt();
                this.f16324f = parcel.readFloat();
                this.f16325r = parcel.readByte() != 0;
            }

            @Override // p146T.AbstractC1446a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i7) {
                super.writeToParcel(parcel, i7);
                parcel.writeByte(this.f16321c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f16322d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f16323e);
                parcel.writeFloat(this.f16324f);
                parcel.writeByte(this.f16325r ? (byte) 1 : (byte) 0);
            }

            public C4393c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AbstractC4400c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo10499H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo10499H(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AbstractC4402e
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ int mo19496I() {
            return super.mo19496I();
        }

        @Override // com.google.android.material.appbar.AbstractC4402e
        /* JADX INFO: renamed from: K */
        public /* bridge */ /* synthetic */ boolean mo19497K(int i7) {
            return super.mo19497K(i7);
        }

        @Override // com.google.android.material.appbar.AbstractC4400c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: o */
        public /* bridge */ /* synthetic */ boolean mo10510o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo10510o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean mo10511p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7) {
            return super.mo10511p(coordinatorLayout, appBarLayout, i7);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean mo10512q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, int i8, int i9, int i10) {
            return super.mo10512q(coordinatorLayout, appBarLayout, i7, i8, i9, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ void mo10516u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int[] iArr, int i9) {
            super.mo10516u(coordinatorLayout, appBarLayout, view, i7, i8, iArr, i9);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void mo10519x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            super.mo10519x(coordinatorLayout, appBarLayout, view, i7, i8, i9, i10, i11, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: s0 */
        public /* bridge */ /* synthetic */ void mo10493B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo10493B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable mo10494C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo10494C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean mo10496E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i7, int i8) {
            return super.mo10496E(coordinatorLayout, appBarLayout, view, view2, i7, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: v0 */
        public /* bridge */ /* synthetic */ void mo10498G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7) {
            super.mo10498G(coordinatorLayout, appBarLayout, view, i7);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC4401d {
        public ScrollingViewBehavior() {
        }

        /* JADX INFO: renamed from: V */
        private static int m19498V(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC2423c abstractC2423cM10530f = ((CoordinatorLayout.C2426f) appBarLayout.getLayoutParams()).m10530f();
            if (abstractC2423cM10530f instanceof BaseBehavior) {
                return ((BaseBehavior) abstractC2423cM10530f).mo19475Q();
            }
            return 0;
        }

        /* JADX INFO: renamed from: W */
        private void m19499W(View view, View view2) {
            CoordinatorLayout.AbstractC2423c abstractC2423cM10530f = ((CoordinatorLayout.C2426f) view2.getLayoutParams()).m10530f();
            if (abstractC2423cM10530f instanceof BaseBehavior) {
                AbstractC1030Z.m4449U(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC2423cM10530f).f16310v) + m19527Q()) - m19525M(view2));
            }
        }

        /* JADX INFO: renamed from: X */
        private void m19500X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m19447o()) {
                    appBarLayout.m19453z(appBarLayout.m19441C(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: A */
        public boolean mo10492A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z7) {
            AppBarLayout appBarLayoutMo19501L = mo19501L(coordinatorLayout.m10488v(view));
            if (appBarLayoutMo19501L != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f16355d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutMo19501L.m19452w(false, !z7);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.AbstractC4401d
        /* JADX INFO: renamed from: N */
        float mo19502N(View view) {
            int i7;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iM19498V = m19498V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iM19498V > downNestedPreScrollRange) && (i7 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iM19498V / i7) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.AbstractC4401d
        /* JADX INFO: renamed from: P */
        int mo19503P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo19503P(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4401d
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout mo19501L(List list) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) list.get(i7);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: i */
        public boolean mo10504i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: l */
        public boolean mo10507l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m19499W(view, view2);
            m19500X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: m */
        public void mo10508m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AbstractC1030Z.m4474j0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.AbstractC4402e, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: p */
        public /* bridge */ /* synthetic */ boolean mo10511p(CoordinatorLayout coordinatorLayout, View view, int i7) {
            return super.mo10511p(coordinatorLayout, view, i7);
        }

        @Override // com.google.android.material.appbar.AbstractC4401d, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: q */
        public /* bridge */ /* synthetic */ boolean mo10512q(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10) {
            return super.mo10512q(coordinatorLayout, view, i7, i8, i9, i10);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f26928h6);
            m19528S(typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6752m.f26939i6, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C4394a implements InterfaceC0993G {
        C4394a() {
        }

        @Override // p111O.InterfaceC0993G
        /* JADX INFO: renamed from: a */
        public C0982A0 mo4369a(View view, C0982A0 c0982a0) {
            return AppBarLayout.this.m19450u(c0982a0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public static abstract class AbstractC4395b {
        /* JADX INFO: renamed from: a */
        public abstract void mo19505a(AppBarLayout appBarLayout, View view, float f7);
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C4396c extends AbstractC4395b {

        /* JADX INFO: renamed from: a */
        private final Rect f16327a = new Rect();

        /* JADX INFO: renamed from: b */
        private final Rect f16328b = new Rect();

        /* JADX INFO: renamed from: b */
        private static void m19506b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC4395b
        /* JADX INFO: renamed from: a */
        public void mo19505a(AppBarLayout appBarLayout, View view, float f7) {
            m19506b(this.f16327a, appBarLayout, view);
            float fAbs = this.f16327a.top - Math.abs(f7);
            if (fAbs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float fM2540a = 1.0f - AbstractC0577a.m2540a(Math.abs(fAbs / this.f16327a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f16327a.height() * 0.3f) * (1.0f - (fM2540a * fM2540a)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f16328b);
            this.f16328b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f16328b.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.f16328b);
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26242a);
    }

    /* JADX INFO: renamed from: B */
    private boolean m19422B() {
        return this.f16291I != null && getTopInset() > 0;
    }

    /* JADX INFO: renamed from: D */
    private boolean m19423D() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    private void m19424E(float f7, float f8) {
        ValueAnimator valueAnimator = this.f16283A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, f8);
        this.f16283A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f16287E);
        this.f16283A.setInterpolator(this.f16288F);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f16284B;
        if (animatorUpdateListener != null) {
            this.f16283A.addUpdateListener(animatorUpdateListener);
        }
        this.f16283A.start();
    }

    /* JADX INFO: renamed from: F */
    private void m19425F() {
        setWillNotDraw(!m19422B());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19426a(AppBarLayout appBarLayout, C0622i c0622i, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c0622i.m2717f0(fFloatValue);
        Drawable drawable = appBarLayout.f16291I;
        if (drawable instanceof C0622i) {
            ((C0622i) drawable).m2717f0(fFloatValue);
        }
        Iterator it = appBarLayout.f16285C.iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            c0622i.m2700G();
            throw null;
        }
        Iterator it2 = appBarLayout.f16286D.iterator();
        if (it2.hasNext()) {
            AbstractC2263x.m9328a(it2.next());
            c0622i.m2700G();
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m19427b(AppBarLayout appBarLayout, ColorStateList colorStateList, C0622i c0622i, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int iM33179j = AbstractC7539a.m33179j(appBarLayout.f16290H, colorStateList.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        c0622i.m2718g0(ColorStateList.valueOf(iM33179j));
        if (appBarLayout.f16291I != null && (num2 = appBarLayout.f16292J) != null && num2.equals(num)) {
            appBarLayout.f16291I.setTint(iM33179j);
        }
        if (!appBarLayout.f16285C.isEmpty()) {
            Iterator it = appBarLayout.f16285C.iterator();
            while (it.hasNext()) {
                AbstractC2263x.m9328a(it.next());
                if (c0622i.m2697D() != null) {
                    throw null;
                }
            }
        }
        if (appBarLayout.f16286D.isEmpty()) {
            return;
        }
        Iterator it2 = appBarLayout.f16286D.iterator();
        if (it2.hasNext()) {
            AbstractC2263x.m9328a(it2.next());
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m19428c() {
        WeakReference weakReference = this.f16309z;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f16309z = null;
    }

    /* JADX INFO: renamed from: d */
    private Integer m19429d() {
        Drawable drawable = this.f16291I;
        if (drawable instanceof C0622i) {
            return Integer.valueOf(((C0622i) drawable).m2700G());
        }
        ColorStateList colorStateListM20435g = AbstractC4498d.m20435g(drawable);
        if (colorStateListM20435g != null) {
            return Integer.valueOf(colorStateListM20435g.getDefaultColor());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private View m19430e(View view) {
        int i7;
        if (this.f16309z == null && (i7 = this.f16308y) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i7) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f16308y);
            }
            if (viewFindViewById != null) {
                this.f16309z = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f16309z;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    private boolean m19431j() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (((C4397d) getChildAt(i7).getLayoutParams()).m19511e()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private void m19432l(final C0622i c0622i, final ColorStateList colorStateList) {
        final Integer numM33175f = AbstractC7539a.m33175f(getContext(), AbstractC6742c.f26262k);
        this.f16284B = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.m19427b(this.f16339a, colorStateList, c0622i, numM33175f, valueAnimator);
            }
        };
    }

    /* JADX INFO: renamed from: m */
    private void m19433m(Context context, final C0622i c0622i) {
        c0622i.m2710U(context);
        this.f16284B = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.m19426a(this.f16343a, c0622i, valueAnimator);
            }
        };
    }

    /* JADX INFO: renamed from: n */
    private void m19434n() {
        Behavior behavior = this.f16294L;
        BaseBehavior.C4393c c4393cM19491x0 = (behavior == null || this.f16296b == -1 || this.f16300f != 0) ? null : behavior.m19491x0(AbstractC1446a.f4974b, this);
        this.f16296b = -1;
        this.f16297c = -1;
        this.f16298d = -1;
        if (c4393cM19491x0 != null) {
            this.f16294L.m19490w0(c4393cM19491x0, false);
        }
    }

    /* JADX INFO: renamed from: p */
    private boolean m19435p() {
        return getBackground() instanceof C0622i;
    }

    /* JADX INFO: renamed from: r */
    private C0622i m19436r(Drawable drawable) {
        if (drawable instanceof C0622i) {
            return (C0622i) drawable;
        }
        ColorStateList colorStateListM20435g = AbstractC4498d.m20435g(drawable);
        if (colorStateListM20435g == null) {
            return null;
        }
        C0622i c0622i = new C0622i();
        c0622i.m2718g0(colorStateListM20435g);
        return c0622i;
    }

    /* JADX INFO: renamed from: s */
    private Drawable m19437s(Context context, Drawable drawable) {
        C0622i c0622iM19436r = m19436r(drawable);
        if (c0622iM19436r == null || c0622iM19436r.m2697D() == null) {
            return drawable;
        }
        this.f16290H = c0622iM19436r.m2697D().getDefaultColor();
        ColorStateList colorStateList = this.f16307x;
        if (colorStateList != null) {
            m19432l(c0622iM19436r, colorStateList);
            return c0622iM19436r;
        }
        m19433m(context, c0622iM19436r);
        return c0622iM19436r;
    }

    /* JADX INFO: renamed from: x */
    private void m19438x(boolean z7, boolean z8, boolean z9) {
        this.f16300f = (z7 ? 1 : 2) | (z8 ? 4 : 0) | (z9 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: renamed from: y */
    private boolean m19439y(boolean z7) {
        if (this.f16304u == z7) {
            return false;
        }
        this.f16304u = z7;
        refreshDrawableState();
        return true;
    }

    /* JADX INFO: renamed from: A */
    boolean m19440A(boolean z7, boolean z8) {
        if (!z8 || this.f16305v == z7) {
            return false;
        }
        this.f16305v = z7;
        refreshDrawableState();
        if (!m19435p()) {
            return true;
        }
        if (this.f16307x != null) {
            m19424E(z7 ? 0.0f : 1.0f, z7 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f16306w) {
            return true;
        }
        m19424E(z7 ? 0.0f : this.f16293K, z7 ? this.f16293K : 0.0f);
        return true;
    }

    /* JADX INFO: renamed from: C */
    boolean m19441C(View view) {
        View viewM19430e = m19430e(view);
        if (viewM19430e != null) {
            view = viewM19430e;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4397d;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m19422B()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f16295a);
            this.f16291I.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16291I;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C4397d generateDefaultLayoutParams() {
        return new C4397d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4397d generateLayoutParams(AttributeSet attributeSet) {
        return new C4397d(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC2422b
    public CoordinatorLayout.AbstractC2423c getBehavior() {
        Behavior behavior = new Behavior();
        this.f16294L = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i7 = this.f16297c;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C4397d c4397d = (C4397d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = c4397d.f16329a;
                if ((i9 & 5) != 5) {
                    if (i8 > 0) {
                        break;
                    }
                } else {
                    int i10 = ((LinearLayout.LayoutParams) c4397d).topMargin + ((LinearLayout.LayoutParams) c4397d).bottomMargin;
                    if ((i9 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i9 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i10 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i8 += iMin;
                    }
                    iMin = i10 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i8 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i8);
        this.f16297c = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i7 = this.f16298d;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C4397d c4397d = (C4397d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c4397d).topMargin + ((LinearLayout.LayoutParams) c4397d).bottomMargin;
                int i9 = c4397d.f16329a;
                if ((i9 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i9 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f16298d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f16308y;
    }

    public C0622i getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C0622i) {
            return (C0622i) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i7 = (minimumHeight * 2) + topInset;
            return i7 < getHeight() ? i7 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i8 = (minimumHeight2 * 2) + topInset;
        return i8 < getHeight() ? i8 : minimumHeight2 + topInset;
    }

    int getPendingAction() {
        return this.f16300f;
    }

    public Drawable getStatusBarForeground() {
        return this.f16291I;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C0982A0 c0982a0 = this.f16301r;
        if (c0982a0 != null) {
            return c0982a0.m4278l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i7 = this.f16296b;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C4397d c4397d = (C4397d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = c4397d.f16329a;
                if ((i9 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) c4397d).topMargin + ((LinearLayout.LayoutParams) c4397d).bottomMargin;
                if (i8 == 0 && childAt.getFitsSystemWindows()) {
                    minimumHeight -= getTopInset();
                }
                if ((i9 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f16296b = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C4397d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C4397d((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C4397d((ViewGroup.MarginLayoutParams) layoutParams) : new C4397d(layoutParams);
    }

    /* JADX INFO: renamed from: i */
    boolean m19445i() {
        return this.f16299e;
    }

    /* JADX INFO: renamed from: k */
    boolean m19446k() {
        return getTotalScrollRange() != 0;
    }

    /* JADX INFO: renamed from: o */
    public boolean m19447o() {
        return this.f16306w;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0623j.m2750e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        if (this.f16289G == null) {
            this.f16289G = new int[4];
        }
        int[] iArr = this.f16289G;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + iArr.length);
        boolean z7 = this.f16304u;
        int i8 = AbstractC6742c.f26261j0;
        if (!z7) {
            i8 = -i8;
        }
        iArr[0] = i8;
        iArr[1] = (z7 && this.f16305v) ? AbstractC6742c.f26263k0 : -AbstractC6742c.f26263k0;
        int i9 = AbstractC6742c.f26253f0;
        if (!z7) {
            i9 = -i9;
        }
        iArr[2] = i9;
        iArr[3] = (z7 && this.f16305v) ? AbstractC6742c.f26251e0 : -AbstractC6742c.f26251e0;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m19428c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        boolean z8 = true;
        if (getFitsSystemWindows() && m19423D()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                AbstractC1030Z.m4449U(getChildAt(childCount), topInset);
            }
        }
        m19434n();
        this.f16299e = false;
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            if (((C4397d) getChildAt(i11).getLayoutParams()).m19510d() != null) {
                this.f16299e = true;
                break;
            }
        }
        Drawable drawable = this.f16291I;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f16303t) {
            return;
        }
        if (!this.f16306w && !m19431j()) {
            z8 = false;
        }
        m19439y(z8);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i8);
        if (mode != 1073741824 && getFitsSystemWindows() && m19423D()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = AbstractC0577a.m2541b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i8));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m19434n();
    }

    /* JADX INFO: renamed from: q */
    public boolean m19448q() {
        return this.f16305v;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(m19437s(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        AbstractC0623j.m2749d(this, f7);
    }

    public void setExpanded(boolean z7) {
        m19452w(z7, isLaidOut());
    }

    public void setLiftOnScroll(boolean z7) {
        this.f16306w = z7;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f16307x != colorStateList) {
            this.f16307x = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f16308y = -1;
        if (view == null) {
            m19428c();
        } else {
            this.f16309z = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i7) {
        this.f16308y = i7;
        m19428c();
    }

    public void setLiftableOverrideEnabled(boolean z7) {
        this.f16303t = z7;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i7) {
        if (i7 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i7);
    }

    void setPendingAction(int i7) {
        this.f16300f = i7;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f16291I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f16291I = drawable != null ? drawable.mutate() : null;
            this.f16292J = m19429d();
            Drawable drawable3 = this.f16291I;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f16291I.setState(getDrawableState());
                }
                AbstractC0400a.m1707m(this.f16291I, getLayoutDirection());
                this.f16291I.setVisible(getVisibility() == 0, false);
                this.f16291I.setCallback(this);
            }
            m19425F();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i7) {
        setStatusBarForeground(new ColorDrawable(i7));
    }

    public void setStatusBarForegroundResource(int i7) {
        setStatusBarForeground(AbstractC5659a.m25175b(getContext(), i7));
    }

    @Deprecated
    public void setTargetElevation(float f7) {
        AbstractC4404g.m19536b(this, f7);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z7 = i7 == 0;
        Drawable drawable = this.f16291I;
        if (drawable != null) {
            drawable.setVisible(z7, false);
        }
    }

    /* JADX INFO: renamed from: t */
    void m19449t(int i7) {
        this.f16295a = i7;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.f16302s;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                AbstractC2263x.m9328a(this.f16302s.get(i8));
            }
        }
    }

    /* JADX INFO: renamed from: u */
    C0982A0 m19450u(C0982A0 c0982a0) {
        C0982A0 c0982a1 = getFitsSystemWindows() ? c0982a0 : null;
        if (!AbstractC0905b.m4125a(this.f16301r, c0982a1)) {
            this.f16301r = c0982a1;
            m19425F();
            requestLayout();
        }
        return c0982a0;
    }

    /* JADX INFO: renamed from: v */
    void m19451v() {
        this.f16300f = 0;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16291I;
    }

    /* JADX INFO: renamed from: w */
    public void m19452w(boolean z7, boolean z8) {
        m19438x(z7, z8, true);
    }

    /* JADX INFO: renamed from: z */
    boolean m19453z(boolean z7) {
        return m19440A(z7, !this.f16303t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16282M;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        this.f16296b = -1;
        this.f16297c = -1;
        this.f16298d = -1;
        this.f16300f = 0;
        this.f16285C = new ArrayList();
        this.f16286D = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            AbstractC4404g.m19535a(this);
        }
        AbstractC4404g.m19537c(this, attributeSet, i7, i8);
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, AbstractC6752m.f26844a, i7, i8, new int[0]);
        this.f16307x = AbstractC0423c.m1825a(context2, typedArrayM20818i, AbstractC6752m.f26921h);
        this.f16287E = AbstractC0196h.m978f(context2, AbstractC6742c.f26226K, getResources().getInteger(AbstractC6747h.f26444a));
        this.f16288F = AbstractC0196h.m979g(context2, AbstractC6742c.f26236U, AbstractC6826a.f27404a);
        int i9 = AbstractC6752m.f26899f;
        if (typedArrayM20818i.hasValue(i9)) {
            m19438x(typedArrayM20818i.getBoolean(i9, false), false, false);
        }
        int i10 = AbstractC6752m.f26888e;
        if (typedArrayM20818i.hasValue(i10)) {
            AbstractC4404g.m19536b(this, typedArrayM20818i.getDimensionPixelSize(i10, 0));
        }
        setBackground(typedArrayM20818i.getDrawable(AbstractC6752m.f26855b));
        int i11 = AbstractC6752m.f26877d;
        if (typedArrayM20818i.hasValue(i11)) {
            setKeyboardNavigationCluster(typedArrayM20818i.getBoolean(i11, false));
        }
        int i12 = AbstractC6752m.f26866c;
        if (typedArrayM20818i.hasValue(i12)) {
            setTouchscreenBlocksFocus(typedArrayM20818i.getBoolean(i12, false));
        }
        this.f16293K = getResources().getDimension(AbstractC6744e.f26332a);
        this.f16306w = typedArrayM20818i.getBoolean(AbstractC6752m.f26910g, false);
        this.f16308y = typedArrayM20818i.getResourceId(AbstractC6752m.f26932i, -1);
        setStatusBarForeground(typedArrayM20818i.getDrawable(AbstractC6752m.f26943j));
        typedArrayM20818i.recycle();
        AbstractC1030Z.m4494t0(this, new C4394a());
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C4397d extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a */
        int f16329a;

        /* JADX INFO: renamed from: b */
        private AbstractC4395b f16330b;

        /* JADX INFO: renamed from: c */
        Interpolator f16331c;

        public C4397d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16329a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f26965l);
            this.f16329a = typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f26987n, 0);
            m19512f(typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f26976m, 0));
            int i7 = AbstractC6752m.f26998o;
            if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                this.f16331c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i7, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        private AbstractC4395b m19507a(int i7) {
            if (i7 != 1) {
                return null;
            }
            return new C4396c();
        }

        /* JADX INFO: renamed from: b */
        public AbstractC4395b m19508b() {
            return this.f16330b;
        }

        /* JADX INFO: renamed from: c */
        public int m19509c() {
            return this.f16329a;
        }

        /* JADX INFO: renamed from: d */
        public Interpolator m19510d() {
            return this.f16331c;
        }

        /* JADX INFO: renamed from: e */
        boolean m19511e() {
            int i7 = this.f16329a;
            return (i7 & 1) == 1 && (i7 & 10) != 0;
        }

        /* JADX INFO: renamed from: f */
        public void m19512f(int i7) {
            this.f16330b = m19507a(i7);
        }

        public C4397d(int i7, int i8) {
            super(i7, i8);
            this.f16329a = 1;
        }

        public C4397d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16329a = 1;
        }

        public C4397d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16329a = 1;
        }

        public C4397d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16329a = 1;
        }
    }
}
