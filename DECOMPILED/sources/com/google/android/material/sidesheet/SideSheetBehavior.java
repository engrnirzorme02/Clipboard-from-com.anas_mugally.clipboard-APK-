package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.AbstractC2263x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p029D3.C0195g;
import p029D3.InterfaceC0190b;
import p045F3.AbstractC0423c;
import p065I.AbstractC0577a;
import p069I3.C0622i;
import p069I3.C0627n;
import p111O.AbstractC1030Z;
import p118P.C1170s;
import p118P.InterfaceC1173v;
import p146T.AbstractC1446a;
import p153U.C1650c;
import p223d.C5173c;
import p325p3.AbstractC6750k;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p333q3.AbstractC6826a;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC2423c implements InterfaceC0190b {

    /* JADX INFO: renamed from: K */
    private static final int f17567K = AbstractC6750k.f26500V;

    /* JADX INFO: renamed from: L */
    private static final int f17568L = AbstractC6751l.f26552q;

    /* JADX INFO: renamed from: A */
    private int f17569A;

    /* JADX INFO: renamed from: B */
    private int f17570B;

    /* JADX INFO: renamed from: C */
    private WeakReference f17571C;

    /* JADX INFO: renamed from: D */
    private WeakReference f17572D;

    /* JADX INFO: renamed from: E */
    private int f17573E;

    /* JADX INFO: renamed from: F */
    private VelocityTracker f17574F;

    /* JADX INFO: renamed from: G */
    private C0195g f17575G;

    /* JADX INFO: renamed from: H */
    private int f17576H;

    /* JADX INFO: renamed from: I */
    private final Set f17577I;

    /* JADX INFO: renamed from: J */
    private final C1650c.c f17578J;

    /* JADX INFO: renamed from: a */
    private AbstractC4575c f17579a;

    /* JADX INFO: renamed from: b */
    private float f17580b;

    /* JADX INFO: renamed from: c */
    private C0622i f17581c;

    /* JADX INFO: renamed from: d */
    private ColorStateList f17582d;

    /* JADX INFO: renamed from: e */
    private C0627n f17583e;

    /* JADX INFO: renamed from: f */
    private final C4572d f17584f;

    /* JADX INFO: renamed from: r */
    private float f17585r;

    /* JADX INFO: renamed from: s */
    private boolean f17586s;

    /* JADX INFO: renamed from: t */
    private int f17587t;

    /* JADX INFO: renamed from: u */
    private int f17588u;

    /* JADX INFO: renamed from: v */
    private C1650c f17589v;

    /* JADX INFO: renamed from: w */
    private boolean f17590w;

    /* JADX INFO: renamed from: x */
    private float f17591x;

    /* JADX INFO: renamed from: y */
    private int f17592y;

    /* JADX INFO: renamed from: z */
    private int f17593z;

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$a */
    class C4569a extends C1650c.c {
        C4569a() {
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: a */
        public int mo6886a(View view, int i7, int i8) {
            return AbstractC0577a.m2541b(i7, SideSheetBehavior.this.f17579a.mo21075g(), SideSheetBehavior.this.f17579a.mo21074f());
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: b */
        public int mo6887b(View view, int i7, int i8) {
            return view.getTop();
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: d */
        public int mo6889d(View view) {
            return SideSheetBehavior.this.f17592y + SideSheetBehavior.this.m21058k0();
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: j */
        public void mo6895j(int i7) {
            if (i7 == 1 && SideSheetBehavior.this.f17586s) {
                SideSheetBehavior.this.m21050G0(1);
            }
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: k */
        public void mo6896k(View view, int i7, int i8, int i9, int i10) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewM21054f0 = SideSheetBehavior.this.m21054f0();
            if (viewM21054f0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM21054f0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f17579a.mo21084p(marginLayoutParams, view.getLeft(), view.getRight());
                viewM21054f0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.m21032a0(view, i7);
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: l */
        public void mo6897l(View view, float f7, float f8) {
            int iM21028W = SideSheetBehavior.this.m21028W(view, f7, f8);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.m21013L0(view, iM21028W, sideSheetBehavior.m21052K0());
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: m */
        public boolean mo6898m(View view, int i7) {
            return (SideSheetBehavior.this.f17587t == 1 || SideSheetBehavior.this.f17571C == null || SideSheetBehavior.this.f17571C.get() != view) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b */
    class C4570b extends AnimatorListenerAdapter {
        C4570b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.m21050G0(5);
            if (SideSheetBehavior.this.f17571C == null || SideSheetBehavior.this.f17571C.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f17571C.get()).requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$d */
    class C4572d {

        /* JADX INFO: renamed from: a */
        private int f17597a;

        /* JADX INFO: renamed from: b */
        private boolean f17598b;

        /* JADX INFO: renamed from: c */
        private final Runnable f17599c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.C4572d.m21067a(this.f17603a);
            }
        };

        C4572d() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m21067a(C4572d c4572d) {
            c4572d.f17598b = false;
            if (SideSheetBehavior.this.f17589v != null && SideSheetBehavior.this.f17589v.m6880m(true)) {
                c4572d.m21068b(c4572d.f17597a);
            } else if (SideSheetBehavior.this.f17587t == 2) {
                SideSheetBehavior.this.m21050G0(c4572d.f17597a);
            }
        }

        /* JADX INFO: renamed from: b */
        void m21068b(int i7) {
            if (SideSheetBehavior.this.f17571C == null || SideSheetBehavior.this.f17571C.get() == null) {
                return;
            }
            this.f17597a = i7;
            if (this.f17598b) {
                return;
            }
            ((View) SideSheetBehavior.this.f17571C.get()).postOnAnimation(this.f17599c);
            this.f17598b = true;
        }
    }

    public SideSheetBehavior() {
        this.f17584f = new C4572d();
        this.f17586s = true;
        this.f17587t = 5;
        this.f17588u = 5;
        this.f17591x = 0.1f;
        this.f17573E = -1;
        this.f17577I = new LinkedHashSet();
        this.f17578J = new C4569a();
    }

    /* JADX INFO: renamed from: A0 */
    private void m21004A0(View view, Runnable runnable) {
        if (m21042v0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: D0 */
    private void m21005D0(int i7) {
        AbstractC4575c abstractC4575c = this.f17579a;
        if (abstractC4575c == null || abstractC4575c.mo21078j() != i7) {
            if (i7 == 0) {
                this.f17579a = new C4574b(this);
                if (this.f17583e == null || m21039s0()) {
                    return;
                }
                C0627n.b bVarM2776w = this.f17583e.m2776w();
                bVarM2776w.m2800H(0.0f).m2814z(0.0f);
                m21019O0(bVarM2776w.m2802m());
                return;
            }
            if (i7 == 1) {
                this.f17579a = new C4573a(this);
                if (this.f17583e == null || m21038r0()) {
                    return;
                }
                C0627n.b bVarM2776w2 = this.f17583e.m2776w();
                bVarM2776w2.m2796D(0.0f).m2810v(0.0f);
                m21019O0(bVarM2776w2.m2802m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i7 + ". Must be 0 or 1.");
        }
    }

    /* JADX INFO: renamed from: E0 */
    private void m21006E0(View view, int i7) {
        m21005D0(Gravity.getAbsoluteGravity(((CoordinatorLayout.C2426f) view.getLayoutParams()).f9257c, i7) == 3 ? 1 : 0);
    }

    /* JADX INFO: renamed from: H0 */
    private boolean m21007H0() {
        if (this.f17589v != null) {
            return this.f17586s || this.f17587t == 1;
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ boolean m21008I(SideSheetBehavior sideSheetBehavior, int i7, View view, InterfaceC1173v.a aVar) {
        sideSheetBehavior.m21049F0(i7);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m21009J(SideSheetBehavior sideSheetBehavior, int i7) {
        View view = (View) sideSheetBehavior.f17571C.get();
        if (view != null) {
            sideSheetBehavior.m21013L0(view, i7, false);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m21010J0(View view) {
        return (view.isShown() || AbstractC1030Z.m4483o(view) != null) && this.f17586s;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m21011K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i7, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f17579a.mo21083o(marginLayoutParams, AbstractC6826a.m29845c(i7, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public void m21013L0(View view, int i7, boolean z7) {
        if (!m21043w0(view, i7, z7)) {
            m21050G0(i7);
        } else {
            m21050G0(2);
            this.f17584f.m21068b(i7);
        }
    }

    /* JADX INFO: renamed from: M0 */
    private void m21015M0() {
        View view;
        WeakReference weakReference = this.f17571C;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC1030Z.m4462d0(view, 262144);
        AbstractC1030Z.m4462d0(view, 1048576);
        if (this.f17587t != 5) {
            m21045y0(view, C1170s.a.f4129y, 5);
        }
        if (this.f17587t != 3) {
            m21045y0(view, C1170s.a.f4127w, 3);
        }
    }

    /* JADX INFO: renamed from: N0 */
    private void m21017N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.f17571C;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f17571C.get();
        View viewM21054f0 = m21054f0();
        if (viewM21054f0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM21054f0.getLayoutParams()) == null) {
            return;
        }
        this.f17579a.mo21083o(marginLayoutParams, (int) ((this.f17592y * view.getScaleX()) + this.f17570B));
        viewM21054f0.requestLayout();
    }

    /* JADX INFO: renamed from: O0 */
    private void m21019O0(C0627n c0627n) {
        C0622i c0622i = this.f17581c;
        if (c0622i != null) {
            c0622i.setShapeAppearanceModel(c0627n);
        }
    }

    /* JADX INFO: renamed from: P0 */
    private void m21021P0(View view) {
        int i7 = this.f17587t == 5 ? 4 : 0;
        if (view.getVisibility() != i7) {
            view.setVisibility(i7);
        }
    }

    /* JADX INFO: renamed from: U */
    private int m21026U(int i7, View view) {
        int i8 = this.f17587t;
        if (i8 == 1 || i8 == 2) {
            return i7 - this.f17579a.mo21076h(view);
        }
        if (i8 == 3) {
            return 0;
        }
        if (i8 == 5) {
            return this.f17579a.mo21073e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f17587t);
    }

    /* JADX INFO: renamed from: V */
    private float m21027V(float f7, float f8) {
        return Math.abs(f7 - f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public int m21028W(View view, float f7, float f8) {
        if (m21041u0(f7)) {
            return 3;
        }
        if (m21051I0(view, f7)) {
            return (this.f17579a.mo21081m(f7, f8) || this.f17579a.mo21080l(view)) ? 5 : 3;
        }
        if (f7 != 0.0f && AbstractC4576d.m21085a(f7, f8)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - m21055g0()) < Math.abs(left - this.f17579a.mo21073e()) ? 3 : 5;
    }

    /* JADX INFO: renamed from: X */
    private void m21029X() {
        WeakReference weakReference = this.f17572D;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f17572D = null;
    }

    /* JADX INFO: renamed from: Y */
    private InterfaceC1173v m21030Y(final int i7) {
        return new InterfaceC1173v() { // from class: J3.a
            @Override // p118P.InterfaceC1173v
            /* JADX INFO: renamed from: a */
            public final boolean mo3201a(View view, InterfaceC1173v.a aVar) {
                return SideSheetBehavior.m21008I(this.f2645a, i7, view, aVar);
            }
        };
    }

    /* JADX INFO: renamed from: Z */
    private void m21031Z(Context context) {
        if (this.f17583e == null) {
            return;
        }
        C0622i c0622i = new C0622i(this.f17583e);
        this.f17581c = c0622i;
        c0622i.m2710U(context);
        ColorStateList colorStateList = this.f17582d;
        if (colorStateList != null) {
            this.f17581c.m2718g0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f17581c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m21032a0(View view, int i7) {
        if (this.f17577I.isEmpty()) {
            return;
        }
        this.f17579a.mo21070b(i7);
        Iterator it = this.f17577I.iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m21033b0(View view) {
        if (AbstractC1030Z.m4483o(view) == null) {
            AbstractC1030Z.m4478l0(view, view.getResources().getString(f17567K));
        }
    }

    /* JADX INFO: renamed from: c0 */
    private int m21034c0(int i7, int i8, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i8, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), 1073741824);
        }
        if (size != 0) {
            i9 = Math.min(size, i9);
        }
        return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: e0 */
    private ValueAnimator.AnimatorUpdateListener m21035e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewM21054f0 = m21054f0();
        if (viewM21054f0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM21054f0.getLayoutParams()) == null) {
            return null;
        }
        final int iMo21071c = this.f17579a.mo21071c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: J3.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.m21011K(this.f2649a, marginLayoutParams, iMo21071c, viewM21054f0, valueAnimator);
            }
        };
    }

    /* JADX INFO: renamed from: h0 */
    private int m21036h0() {
        AbstractC4575c abstractC4575c = this.f17579a;
        return (abstractC4575c == null || abstractC4575c.mo21078j() == 0) ? 5 : 3;
    }

    /* JADX INFO: renamed from: q0 */
    private CoordinatorLayout.C2426f m21037q0() {
        View view;
        WeakReference weakReference = this.f17571C;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.C2426f)) {
            return null;
        }
        return (CoordinatorLayout.C2426f) view.getLayoutParams();
    }

    /* JADX INFO: renamed from: r0 */
    private boolean m21038r0() {
        CoordinatorLayout.C2426f c2426fM21037q0 = m21037q0();
        return c2426fM21037q0 != null && ((ViewGroup.MarginLayoutParams) c2426fM21037q0).leftMargin > 0;
    }

    /* JADX INFO: renamed from: s0 */
    private boolean m21039s0() {
        CoordinatorLayout.C2426f c2426fM21037q0 = m21037q0();
        return c2426fM21037q0 != null && ((ViewGroup.MarginLayoutParams) c2426fM21037q0).rightMargin > 0;
    }

    /* JADX INFO: renamed from: t0 */
    private boolean m21040t0(MotionEvent motionEvent) {
        return m21007H0() && m21027V((float) this.f17576H, motionEvent.getX()) > ((float) this.f17589v.m6885z());
    }

    /* JADX INFO: renamed from: u0 */
    private boolean m21041u0(float f7) {
        return this.f17579a.mo21079k(f7);
    }

    /* JADX INFO: renamed from: v0 */
    private boolean m21042v0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: w0 */
    private boolean m21043w0(View view, int i7, boolean z7) {
        int iM21059l0 = m21059l0(i7);
        C1650c c1650cM21063p0 = m21063p0();
        if (c1650cM21063p0 == null) {
            return false;
        }
        if (z7) {
            return c1650cM21063p0.m6872O(iM21059l0, view.getTop());
        }
        return c1650cM21063p0.m6874Q(view, iM21059l0, view.getTop());
    }

    /* JADX INFO: renamed from: x0 */
    private void m21044x0(CoordinatorLayout coordinatorLayout) {
        int i7;
        View viewFindViewById;
        if (this.f17572D != null || (i7 = this.f17573E) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i7)) == null) {
            return;
        }
        this.f17572D = new WeakReference(viewFindViewById);
    }

    /* JADX INFO: renamed from: y0 */
    private void m21045y0(View view, C1170s.a aVar, int i7) {
        AbstractC1030Z.m4466f0(view, aVar, null, m21030Y(i7));
    }

    /* JADX INFO: renamed from: z0 */
    private void m21046z0() {
        VelocityTracker velocityTracker = this.f17574F;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17574F = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: B */
    public void mo10493B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        C4571c c4571c = (C4571c) parcelable;
        if (c4571c.m6085a() != null) {
            super.mo10493B(coordinatorLayout, view, c4571c.m6085a());
        }
        int i7 = c4571c.f17596c;
        if (i7 == 1 || i7 == 2) {
            i7 = 5;
        }
        this.f17587t = i7;
        this.f17588u = i7;
    }

    /* JADX INFO: renamed from: B0 */
    public void m21047B0(int i7) {
        this.f17573E = i7;
        m21029X();
        WeakReference weakReference = this.f17571C;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i7 == -1 || !view.isLaidOut()) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: C */
    public Parcelable mo10494C(CoordinatorLayout coordinatorLayout, View view) {
        return new C4571c(super.mo10494C(coordinatorLayout, view), this);
    }

    /* JADX INFO: renamed from: C0 */
    public void m21048C0(boolean z7) {
        this.f17586s = z7;
    }

    /* JADX INFO: renamed from: F0 */
    public void m21049F0(final int i7) {
        if (i7 == 1 || i7 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i7 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f17571C;
        if (weakReference == null || weakReference.get() == null) {
            m21050G0(i7);
        } else {
            m21004A0((View) this.f17571C.get(), new Runnable() { // from class: J3.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.m21009J(this.f2647a, i7);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G0 */
    void m21050G0(int i7) {
        View view;
        if (this.f17587t == i7) {
            return;
        }
        this.f17587t = i7;
        if (i7 == 3 || i7 == 5) {
            this.f17588u = i7;
        }
        WeakReference weakReference = this.f17571C;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        m21021P0(view);
        Iterator it = this.f17577I.iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
        m21015M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: H */
    public boolean mo10499H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f17587t == 1 && actionMasked == 0) {
            return true;
        }
        if (m21007H0()) {
            this.f17589v.m6867F(motionEvent);
        }
        if (actionMasked == 0) {
            m21046z0();
        }
        if (this.f17574F == null) {
            this.f17574F = VelocityTracker.obtain();
        }
        this.f17574F.addMovement(motionEvent);
        if (m21007H0() && actionMasked == 2 && !this.f17590w && m21040t0(motionEvent)) {
            this.f17589v.m6877b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f17590w;
    }

    /* JADX INFO: renamed from: I0 */
    boolean m21051I0(View view, float f7) {
        return this.f17579a.mo21082n(view, f7);
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m21052K0() {
        return true;
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: a */
    public void mo944a(C5173c c5173c) {
        C0195g c0195g = this.f17575G;
        if (c0195g == null) {
            return;
        }
        c0195g.m972l(c5173c, m21036h0());
        m21017N0();
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: b */
    public void mo945b() {
        C0195g c0195g = this.f17575G;
        if (c0195g == null) {
            return;
        }
        C5173c c5173cM941c = c0195g.m941c();
        if (c5173cM941c == null || Build.VERSION.SDK_INT < 34) {
            m21049F0(5);
        } else {
            this.f17575G.m969h(c5173cM941c, m21036h0(), new C4570b(), m21035e0());
        }
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: c */
    public void mo946c(C5173c c5173c) {
        C0195g c0195g = this.f17575G;
        if (c0195g == null) {
            return;
        }
        c0195g.m970j(c5173c);
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: d */
    public void mo947d() {
        C0195g c0195g = this.f17575G;
        if (c0195g == null) {
            return;
        }
        c0195g.m968f();
    }

    /* JADX INFO: renamed from: d0 */
    int m21053d0() {
        return this.f17592y;
    }

    /* JADX INFO: renamed from: f0 */
    public View m21054f0() {
        WeakReference weakReference = this.f17572D;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public int m21055g0() {
        return this.f17579a.mo21072d();
    }

    /* JADX INFO: renamed from: i0 */
    public float m21056i0() {
        return this.f17591x;
    }

    /* JADX INFO: renamed from: j0 */
    float m21057j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: k */
    public void mo10506k(CoordinatorLayout.C2426f c2426f) {
        super.mo10506k(c2426f);
        this.f17571C = null;
        this.f17589v = null;
        this.f17575G = null;
    }

    /* JADX INFO: renamed from: k0 */
    int m21058k0() {
        return this.f17570B;
    }

    /* JADX INFO: renamed from: l0 */
    int m21059l0(int i7) {
        if (i7 == 3) {
            return m21055g0();
        }
        if (i7 == 5) {
            return this.f17579a.mo21073e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i7);
    }

    /* JADX INFO: renamed from: m0 */
    int m21060m0() {
        return this.f17569A;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: n */
    public void mo10509n() {
        super.mo10509n();
        this.f17571C = null;
        this.f17589v = null;
        this.f17575G = null;
    }

    /* JADX INFO: renamed from: n0 */
    int m21061n0() {
        return this.f17593z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: o */
    public boolean mo10510o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C1650c c1650c;
        if (!m21010J0(view)) {
            this.f17590w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m21046z0();
        }
        if (this.f17574F == null) {
            this.f17574F = VelocityTracker.obtain();
        }
        this.f17574F.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f17576H = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f17590w) {
            this.f17590w = false;
            return false;
        }
        return (this.f17590w || (c1650c = this.f17589v) == null || !c1650c.m6873P(motionEvent)) ? false : true;
    }

    /* JADX INFO: renamed from: o0 */
    int m21062o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: p */
    public boolean mo10511p(CoordinatorLayout coordinatorLayout, View view, int i7) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f17571C == null) {
            this.f17571C = new WeakReference(view);
            this.f17575G = new C0195g(view);
            C0622i c0622i = this.f17581c;
            if (c0622i != null) {
                view.setBackground(c0622i);
                C0622i c0622i2 = this.f17581c;
                float elevation = this.f17585r;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c0622i2.m2717f0(elevation);
            } else {
                ColorStateList colorStateList = this.f17582d;
                if (colorStateList != null) {
                    AbstractC1030Z.m4482n0(view, colorStateList);
                }
            }
            m21021P0(view);
            m21015M0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            m21033b0(view);
        }
        m21006E0(view, i7);
        if (this.f17589v == null) {
            this.f17589v = C1650c.m6856o(coordinatorLayout, this.f17578J);
        }
        int iMo21076h = this.f17579a.mo21076h(view);
        coordinatorLayout.m10476Q(view, i7);
        this.f17593z = coordinatorLayout.getWidth();
        this.f17569A = this.f17579a.mo21077i(coordinatorLayout);
        this.f17592y = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f17570B = marginLayoutParams != null ? this.f17579a.mo21069a(marginLayoutParams) : 0;
        AbstractC1030Z.m4448T(view, m21026U(iMo21076h, view));
        m21044x0(coordinatorLayout);
        Iterator it = this.f17577I.iterator();
        while (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
        }
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    C1650c m21063p0() {
        return this.f17589v;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: q */
    public boolean mo10512q(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m21034c0(i7, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, -1, marginLayoutParams.width), m21034c0(i9, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, -1, marginLayoutParams.height));
        return true;
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$c */
    protected static class C4571c extends AbstractC1446a {
        public static final Parcelable.Creator<C4571c> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        final int f17596c;

        /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$c$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C4571c createFromParcel(Parcel parcel) {
                return new C4571c(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C4571c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4571c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C4571c[] newArray(int i7) {
                return new C4571c[i7];
            }
        }

        public C4571c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17596c = parcel.readInt();
        }

        @Override // p146T.AbstractC1446a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f17596c);
        }

        public C4571c(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f17596c = sideSheetBehavior.f17587t;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17584f = new C4572d();
        this.f17586s = true;
        this.f17587t = 5;
        this.f17588u = 5;
        this.f17591x = 0.1f;
        this.f17573E = -1;
        this.f17577I = new LinkedHashSet();
        this.f17578J = new C4569a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f27104x6);
        int i7 = AbstractC6752m.f27126z6;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            this.f17582d = AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, i7);
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC6752m.f26591C6)) {
            this.f17583e = C0627n.m2758e(context, attributeSet, 0, f17568L).m2802m();
        }
        int i8 = AbstractC6752m.f26580B6;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            m21047B0(typedArrayObtainStyledAttributes.getResourceId(i8, -1));
        }
        m21031Z(context);
        this.f17585r = typedArrayObtainStyledAttributes.getDimension(AbstractC6752m.f27115y6, -1.0f);
        m21048C0(typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26569A6, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f17580b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
