package com.google.android.material.bottomsheet;

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
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.material.internal.AbstractC4546v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p029D3.C0194f;
import p029D3.InterfaceC0190b;
import p033E.C0247b;
import p045F3.AbstractC0423c;
import p065I.AbstractC0577a;
import p069I3.C0622i;
import p069I3.C0627n;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p118P.C1170s;
import p118P.InterfaceC1173v;
import p146T.AbstractC1446a;
import p153U.C1650c;
import p223d.C5173c;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6750k;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC2423c implements InterfaceC0190b {

    /* JADX INFO: renamed from: w0 */
    private static final int f16432w0 = AbstractC6751l.f26543h;

    /* JADX INFO: renamed from: A */
    private boolean f16433A;

    /* JADX INFO: renamed from: B */
    private boolean f16434B;

    /* JADX INFO: renamed from: C */
    private boolean f16435C;

    /* JADX INFO: renamed from: D */
    private boolean f16436D;

    /* JADX INFO: renamed from: E */
    private boolean f16437E;

    /* JADX INFO: renamed from: F */
    private boolean f16438F;

    /* JADX INFO: renamed from: G */
    private boolean f16439G;

    /* JADX INFO: renamed from: H */
    private int f16440H;

    /* JADX INFO: renamed from: I */
    private int f16441I;

    /* JADX INFO: renamed from: J */
    private boolean f16442J;

    /* JADX INFO: renamed from: K */
    private C0627n f16443K;

    /* JADX INFO: renamed from: L */
    private boolean f16444L;

    /* JADX INFO: renamed from: M */
    private final C4426i f16445M;

    /* JADX INFO: renamed from: N */
    private ValueAnimator f16446N;

    /* JADX INFO: renamed from: O */
    int f16447O;

    /* JADX INFO: renamed from: P */
    int f16448P;

    /* JADX INFO: renamed from: Q */
    int f16449Q;

    /* JADX INFO: renamed from: R */
    float f16450R;

    /* JADX INFO: renamed from: S */
    int f16451S;

    /* JADX INFO: renamed from: T */
    float f16452T;

    /* JADX INFO: renamed from: U */
    boolean f16453U;

    /* JADX INFO: renamed from: V */
    private boolean f16454V;

    /* JADX INFO: renamed from: W */
    private boolean f16455W;

    /* JADX INFO: renamed from: X */
    private boolean f16456X;

    /* JADX INFO: renamed from: Y */
    private boolean f16457Y;

    /* JADX INFO: renamed from: Z */
    int f16458Z;

    /* JADX INFO: renamed from: a */
    private int f16459a;

    /* JADX INFO: renamed from: a0 */
    int f16460a0;

    /* JADX INFO: renamed from: b */
    private boolean f16461b;

    /* JADX INFO: renamed from: b0 */
    C1650c f16462b0;

    /* JADX INFO: renamed from: c */
    private boolean f16463c;

    /* JADX INFO: renamed from: c0 */
    private boolean f16464c0;

    /* JADX INFO: renamed from: d */
    private float f16465d;

    /* JADX INFO: renamed from: d0 */
    private int f16466d0;

    /* JADX INFO: renamed from: e */
    private int f16467e;

    /* JADX INFO: renamed from: e0 */
    private boolean f16468e0;

    /* JADX INFO: renamed from: f */
    private int f16469f;

    /* JADX INFO: renamed from: f0 */
    private float f16470f0;

    /* JADX INFO: renamed from: g0 */
    private int f16471g0;

    /* JADX INFO: renamed from: h0 */
    int f16472h0;

    /* JADX INFO: renamed from: i0 */
    int f16473i0;

    /* JADX INFO: renamed from: j0 */
    WeakReference f16474j0;

    /* JADX INFO: renamed from: k0 */
    WeakReference f16475k0;

    /* JADX INFO: renamed from: l0 */
    WeakReference f16476l0;

    /* JADX INFO: renamed from: m0 */
    WeakReference f16477m0;

    /* JADX INFO: renamed from: n0 */
    private final ArrayList f16478n0;

    /* JADX INFO: renamed from: o0 */
    private VelocityTracker f16479o0;

    /* JADX INFO: renamed from: p0 */
    C0194f f16480p0;

    /* JADX INFO: renamed from: q0 */
    int f16481q0;

    /* JADX INFO: renamed from: r */
    private boolean f16482r;

    /* JADX INFO: renamed from: r0 */
    private int f16483r0;

    /* JADX INFO: renamed from: s */
    private int f16484s;

    /* JADX INFO: renamed from: s0 */
    boolean f16485s0;

    /* JADX INFO: renamed from: t */
    private int f16486t;

    /* JADX INFO: renamed from: t0 */
    private Map f16487t0;

    /* JADX INFO: renamed from: u */
    private C0622i f16488u;

    /* JADX INFO: renamed from: u0 */
    final SparseIntArray f16489u0;

    /* JADX INFO: renamed from: v */
    private ColorStateList f16490v;

    /* JADX INFO: renamed from: v0 */
    private final C1650c.c f16491v0;

    /* JADX INFO: renamed from: w */
    private int f16492w;

    /* JADX INFO: renamed from: x */
    private int f16493x;

    /* JADX INFO: renamed from: y */
    private int f16494y;

    /* JADX INFO: renamed from: z */
    private boolean f16495z;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class RunnableC4418a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f16496a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f16497b;

        RunnableC4418a(View view, int i7) {
            this.f16496a = view;
            this.f16497b = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m19633h1(this.f16496a, this.f16497b, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C4419b extends AnimatorListenerAdapter {
        C4419b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.m19670a1(5);
            WeakReference weakReference = BottomSheetBehavior.this.f16474j0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((View) BottomSheetBehavior.this.f16474j0.get()).requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C4420c implements ValueAnimator.AnimatorUpdateListener {
        C4420c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f16488u != null) {
                BottomSheetBehavior.this.f16488u.m2719h0(fFloatValue);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C4421d implements AbstractC4546v.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f16501a;

        C4421d(boolean z7) {
            this.f16501a = z7;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.AbstractC4546v.c
        /* JADX INFO: renamed from: a */
        public C0982A0 mo19682a(View view, C0982A0 c0982a0, AbstractC4546v.d dVar) {
            boolean z7;
            C0247b c0247bM4272f = c0982a0.m4272f(C0982A0.p.m4332e());
            C0247b c0247bM4272f2 = c0982a0.m4272f(C0982A0.p.m4331d());
            BottomSheetBehavior.this.f16441I = c0247bM4272f.f985b;
            boolean zM20834i = AbstractC4546v.m20834i(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f16433A) {
                BottomSheetBehavior.this.f16440H = c0982a0.m4275i();
                paddingBottom = dVar.f17386d + BottomSheetBehavior.this.f16440H;
            }
            if (BottomSheetBehavior.this.f16434B) {
                paddingLeft = (zM20834i ? dVar.f17385c : dVar.f17383a) + c0247bM4272f.f984a;
            }
            if (BottomSheetBehavior.this.f16435C) {
                paddingRight = (zM20834i ? dVar.f17383a : dVar.f17385c) + c0247bM4272f.f986c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z8 = true;
            if (BottomSheetBehavior.this.f16437E) {
                int i7 = marginLayoutParams.leftMargin;
                int i8 = c0247bM4272f.f984a;
                if (i7 != i8) {
                    marginLayoutParams.leftMargin = i8;
                    z7 = true;
                } else {
                    z7 = false;
                }
            } else {
                z7 = false;
            }
            if (BottomSheetBehavior.this.f16438F) {
                int i9 = marginLayoutParams.rightMargin;
                int i10 = c0247bM4272f.f986c;
                if (i9 != i10) {
                    marginLayoutParams.rightMargin = i10;
                    z7 = true;
                }
            }
            if (BottomSheetBehavior.this.f16439G) {
                int i11 = marginLayoutParams.topMargin;
                int i12 = c0247bM4272f.f985b;
                if (i11 != i12) {
                    marginLayoutParams.topMargin = i12;
                } else {
                    z8 = z7;
                }
            } else {
                z8 = z7;
            }
            if (z8) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f16501a) {
                BottomSheetBehavior.this.f16494y = c0247bM4272f2.f987d;
            }
            if (!BottomSheetBehavior.this.f16433A && !this.f16501a) {
                return c0982a0;
            }
            BottomSheetBehavior.this.m19643m1(false);
            return c0982a0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    class C4422e extends C1650c.c {

        /* JADX INFO: renamed from: a */
        private long f16503a;

        C4422e() {
        }

        /* JADX INFO: renamed from: n */
        private boolean m19683n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f16473i0 + bottomSheetBehavior.m19678s0()) / 2;
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: a */
        public int mo6886a(View view, int i7, int i8) {
            return view.getLeft();
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: b */
        public int mo6887b(View view, int i7, int i8) {
            return AbstractC0577a.m2541b(i7, BottomSheetBehavior.this.m19678s0(), mo6890e(view));
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: e */
        public int mo6890e(View view) {
            return BottomSheetBehavior.this.m19636j0() ? BottomSheetBehavior.this.f16473i0 : BottomSheetBehavior.this.f16451S;
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: j */
        public void mo6895j(int i7) {
            if (i7 == 1 && BottomSheetBehavior.this.f16455W) {
                BottomSheetBehavior.this.m19670a1(1);
            }
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: k */
        public void mo6896k(View view, int i7, int i8, int i9, int i10) {
            BottomSheetBehavior.this.m19676o0(i8);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: l */
        public void mo6897l(View view, float f7, float f8) {
            int i7 = 6;
            if (f8 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f16453U && bottomSheetBehavior.m19673e1(view, f8)) {
                    if ((Math.abs(f7) < Math.abs(f8) && f8 > BottomSheetBehavior.this.f16467e) || m19683n(view)) {
                        i7 = 5;
                    } else if (BottomSheetBehavior.this.f16461b || Math.abs(view.getTop() - BottomSheetBehavior.this.m19678s0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f16449Q)) {
                        i7 = 3;
                    }
                } else if (f8 == 0.0f || Math.abs(f7) > Math.abs(f8)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f16461b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i8 = bottomSheetBehavior2.f16449Q;
                        if (top < i8) {
                            if (top < Math.abs(top - bottomSheetBehavior2.f16451S)) {
                                i7 = 3;
                            } else if (BottomSheetBehavior.this.m19674f1()) {
                                i7 = 4;
                            }
                        } else if (Math.abs(top - i8) >= Math.abs(top - BottomSheetBehavior.this.f16451S) || BottomSheetBehavior.this.m19674f1()) {
                            i7 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.f16448P) < Math.abs(top - BottomSheetBehavior.this.f16451S)) {
                        i7 = 3;
                    } else {
                        i7 = 4;
                    }
                } else if (BottomSheetBehavior.this.f16461b) {
                    i7 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.f16449Q) >= Math.abs(top2 - BottomSheetBehavior.this.f16451S) || BottomSheetBehavior.this.m19674f1()) {
                        i7 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f16461b) {
                i7 = 3;
            } else {
                int top3 = view.getTop();
                long jUptimeMillis = SystemClock.uptimeMillis() - this.f16503a;
                if (BottomSheetBehavior.this.m19674f1()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.m19672c1(jUptimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.f16473i0)) {
                        i7 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.f16449Q) {
                }
                i7 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.m19633h1(view, i7, bottomSheetBehavior4.m19675g1());
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: m */
        public boolean mo6898m(View view, int i7) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i8 = bottomSheetBehavior.f16458Z;
            if (i8 == 1 || bottomSheetBehavior.f16485s0) {
                return false;
            }
            if (i8 == 3 && bottomSheetBehavior.f16481q0 == i7) {
                WeakReference weakReference = bottomSheetBehavior.f16477m0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f16503a = SystemClock.uptimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f16474j0;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    class C4423f implements InterfaceC1173v {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f16505a;

        C4423f(int i7) {
            this.f16505a = i7;
        }

        @Override // p118P.InterfaceC1173v
        /* JADX INFO: renamed from: a */
        public boolean mo3201a(View view, InterfaceC1173v.a aVar) {
            BottomSheetBehavior.this.m19669Z0(this.f16505a);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public static abstract class AbstractC4424g {
        /* JADX INFO: renamed from: a */
        void mo19684a(View view) {
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo19685b(View view, float f7);

        /* JADX INFO: renamed from: c */
        public abstract void mo19686c(View view, int i7);
    }

    public BottomSheetBehavior() {
        this.f16459a = 0;
        this.f16461b = true;
        this.f16463c = false;
        this.f16492w = -1;
        this.f16493x = -1;
        this.f16445M = new C4426i(this, null);
        this.f16450R = 0.5f;
        this.f16452T = -1.0f;
        this.f16455W = true;
        this.f16456X = true;
        this.f16458Z = 4;
        this.f16460a0 = 4;
        this.f16470f0 = 0.1f;
        this.f16478n0 = new ArrayList();
        this.f16483r0 = -1;
        this.f16489u0 = new SparseIntArray();
        this.f16491v0 = new C4422e();
    }

    /* JADX INFO: renamed from: C0 */
    private boolean m19599C0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: E0 */
    private boolean m19600E0(CoordinatorLayout coordinatorLayout, int i7, int i8) {
        WeakReference weakReference = this.f16476l0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.m10473F(view, i7, i8);
    }

    /* JADX INFO: renamed from: F0 */
    private boolean m19601F0(CoordinatorLayout coordinatorLayout, int i7, int i8) {
        WeakReference weakReference = this.f16477m0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.m10473F(view, i7, i8);
    }

    /* JADX INFO: renamed from: H0 */
    private void m19602H0(View view, C1170s.a aVar, int i7) {
        AbstractC1030Z.m4466f0(view, aVar, null, m19640l0(i7));
    }

    /* JADX INFO: renamed from: I0 */
    private void m19604I0() {
        this.f16481q0 = -1;
        this.f16483r0 = -1;
        VelocityTracker velocityTracker = this.f16479o0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16479o0 = null;
        }
    }

    /* JADX INFO: renamed from: J0 */
    private void m19606J0(C4425h c4425h) {
        int i7 = this.f16459a;
        if (i7 == 0) {
            return;
        }
        if (i7 == -1 || (i7 & 1) == 1) {
            this.f16469f = c4425h.f16508d;
        }
        if (i7 == -1 || (i7 & 2) == 2) {
            this.f16461b = c4425h.f16509e;
        }
        if (i7 == -1 || (i7 & 4) == 4) {
            this.f16453U = c4425h.f16510f;
        }
        if (i7 == -1 || (i7 & 8) == 8) {
            this.f16454V = c4425h.f16511r;
        }
    }

    /* JADX INFO: renamed from: K0 */
    private void m19608K0(View view, Runnable runnable) {
        if (m19599C0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b0 */
    private int m19625b0(View view, int i7, int i8) {
        return AbstractC1030Z.m4459c(view, view.getResources().getString(i7), m19640l0(i8));
    }

    /* JADX INFO: renamed from: b1 */
    private void m19626b1(View view) {
        boolean z7 = (Build.VERSION.SDK_INT < 29 || m19681z0() || this.f16482r) ? false : true;
        if (this.f16433A || this.f16434B || this.f16435C || this.f16437E || this.f16438F || this.f16439G || z7) {
            AbstractC4546v.m20827b(view, new C4421d(z7));
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m19627d0() {
        int iM19632h0 = m19632h0();
        if (this.f16461b) {
            this.f16451S = Math.max(this.f16473i0 - iM19632h0, this.f16448P);
        } else {
            this.f16451S = this.f16473i0 - iM19632h0;
        }
    }

    /* JADX INFO: renamed from: d1 */
    private boolean m19628d1() {
        if (this.f16462b0 != null) {
            return this.f16455W || this.f16458Z == 1;
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    private float m19629e0(float f7, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f7 > 0.0f) {
                return radius / f7;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: f0 */
    private void m19630f0() {
        this.f16449Q = (int) (this.f16473i0 * (1.0f - this.f16450R));
    }

    /* JADX INFO: renamed from: g0 */
    private float m19631g0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f16488u == null || (weakReference = this.f16474j0) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f16474j0.get();
        if (!m19649x0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(m19629e0(this.f16488u.m2706N(), rootWindowInsets.getRoundedCorner(0)), m19629e0(this.f16488u.m2707O(), rootWindowInsets.getRoundedCorner(1)));
    }

    /* JADX INFO: renamed from: h0 */
    private int m19632h0() {
        int i7;
        if (this.f16482r) {
            return Math.min(Math.max(this.f16484s, this.f16473i0 - ((this.f16472h0 * 9) / 16)), this.f16471g0) + this.f16440H;
        }
        return (this.f16495z || this.f16433A || (i7 = this.f16494y) <= 0) ? this.f16469f + this.f16440H : Math.max(this.f16469f, i7 + this.f16486t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public void m19633h1(View view, int i7, boolean z7) {
        int iM19647v0 = m19647v0(i7);
        C1650c c1650c = this.f16462b0;
        if (c1650c == null || (!z7 ? c1650c.m6874Q(view, view.getLeft(), iM19647v0) : c1650c.m6872O(view.getLeft(), iM19647v0))) {
            m19670a1(i7);
            return;
        }
        m19670a1(2);
        m19639k1(i7, true);
        this.f16445M.m19692c(i7);
    }

    /* JADX INFO: renamed from: i0 */
    private float m19634i0(int i7) {
        float f7;
        float fM19678s0;
        int i8 = this.f16451S;
        if (i7 > i8 || i8 == m19678s0()) {
            int i9 = this.f16451S;
            f7 = i9 - i7;
            fM19678s0 = this.f16473i0 - i9;
        } else {
            int i10 = this.f16451S;
            f7 = i10 - i7;
            fM19678s0 = i10 - m19678s0();
        }
        return f7 / fM19678s0;
    }

    /* JADX INFO: renamed from: i1 */
    private void m19635i1() {
        WeakReference weakReference = this.f16474j0;
        if (weakReference != null) {
            m19637j1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f16475k0;
        if (weakReference2 != null) {
            m19637j1((View) weakReference2.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public boolean m19636j0() {
        return m19651A0() && m19652B0();
    }

    /* JADX INFO: renamed from: j1 */
    private void m19637j1(View view, int i7) {
        if (view == null) {
            return;
        }
        m19638k0(view, i7);
        if (!this.f16461b && this.f16458Z != 6) {
            this.f16489u0.put(i7, m19625b0(view, AbstractC6750k.f26501a, 6));
        }
        if (this.f16453U && m19652B0() && this.f16458Z != 5) {
            m19602H0(view, C1170s.a.f4129y, 5);
        }
        int i8 = this.f16458Z;
        if (i8 == 3) {
            m19602H0(view, C1170s.a.f4128x, this.f16461b ? 4 : 6);
            return;
        }
        if (i8 == 4) {
            m19602H0(view, C1170s.a.f4127w, this.f16461b ? 3 : 6);
        } else {
            if (i8 != 6) {
                return;
            }
            m19602H0(view, C1170s.a.f4128x, 4);
            m19602H0(view, C1170s.a.f4127w, 3);
        }
    }

    /* JADX INFO: renamed from: k0 */
    private void m19638k0(View view, int i7) {
        if (view == null) {
            return;
        }
        AbstractC1030Z.m4462d0(view, 524288);
        AbstractC1030Z.m4462d0(view, 262144);
        AbstractC1030Z.m4462d0(view, 1048576);
        int i8 = this.f16489u0.get(i7, -1);
        if (i8 != -1) {
            AbstractC1030Z.m4462d0(view, i8);
            this.f16489u0.delete(i7);
        }
    }

    /* JADX INFO: renamed from: k1 */
    private void m19639k1(int i7, boolean z7) {
        boolean zM19650y0;
        ValueAnimator valueAnimator;
        if (i7 == 2 || this.f16444L == (zM19650y0 = m19650y0()) || this.f16488u == null) {
            return;
        }
        this.f16444L = zM19650y0;
        if (!z7 || (valueAnimator = this.f16446N) == null) {
            ValueAnimator valueAnimator2 = this.f16446N;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f16446N.cancel();
            }
            this.f16488u.m2719h0(this.f16444L ? m19631g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f16446N.reverse();
        } else {
            this.f16446N.setFloatValues(this.f16488u.m2698E(), zM19650y0 ? m19631g0() : 1.0f);
            this.f16446N.start();
        }
    }

    /* JADX INFO: renamed from: l0 */
    private InterfaceC1173v m19640l0(int i7) {
        return new C4423f(i7);
    }

    /* JADX INFO: renamed from: l1 */
    private void m19641l1(boolean z7) {
        Map map;
        WeakReference weakReference = this.f16474j0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z7) {
                if (this.f16487t0 != null) {
                    return;
                } else {
                    this.f16487t0 = new HashMap(childCount);
                }
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (childAt != this.f16474j0.get()) {
                    if (z7) {
                        this.f16487t0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f16463c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f16463c && (map = this.f16487t0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f16487t0.get(childAt)).intValue());
                    }
                }
            }
            if (!z7) {
                this.f16487t0 = null;
            } else if (this.f16463c) {
                ((View) this.f16474j0.get()).sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m19642m0(Context context) {
        if (this.f16443K == null) {
            return;
        }
        C0622i c0622i = new C0622i(this.f16443K);
        this.f16488u = c0622i;
        c0622i.m2710U(context);
        ColorStateList colorStateList = this.f16490v;
        if (colorStateList != null) {
            this.f16488u.m2718g0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f16488u.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public void m19643m1(boolean z7) {
        View view;
        if (this.f16474j0 != null) {
            m19627d0();
            if (this.f16458Z != 4 || (view = (View) this.f16474j0.get()) == null) {
                return;
            }
            if (z7) {
                m19669Z0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    private void m19644n0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m19631g0(), 1.0f);
        this.f16446N = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f16446N.addUpdateListener(new C4420c());
    }

    /* JADX INFO: renamed from: q0 */
    public static BottomSheetBehavior m19645q0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C2426f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.AbstractC2423c abstractC2423cM10530f = ((CoordinatorLayout.C2426f) layoutParams).m10530f();
        if (abstractC2423cM10530f instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC2423cM10530f;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    /* JADX INFO: renamed from: r0 */
    private int m19646r0(int i7, int i8, int i9, int i10) {
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

    /* JADX INFO: renamed from: v0 */
    private int m19647v0(int i7) {
        if (i7 == 3) {
            return m19678s0();
        }
        if (i7 == 4) {
            return this.f16451S;
        }
        if (i7 == 5) {
            return this.f16473i0;
        }
        if (i7 == 6) {
            return this.f16449Q;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i7);
    }

    /* JADX INFO: renamed from: w0 */
    private float m19648w0() {
        VelocityTracker velocityTracker = this.f16479o0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(zzbbn.zzq.zzf, this.f16465d);
        return this.f16479o0.getYVelocity(this.f16481q0);
    }

    /* JADX INFO: renamed from: x0 */
    private boolean m19649x0() {
        WeakReference weakReference = this.f16474j0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f16474j0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y0 */
    private boolean m19650y0() {
        if (this.f16458Z == 3) {
            return this.f16442J || m19649x0();
        }
        return false;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m19651A0() {
        return this.f16453U;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: B */
    public void mo10493B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        C4425h c4425h = (C4425h) parcelable;
        super.mo10493B(coordinatorLayout, view, c4425h.m6085a());
        m19606J0(c4425h);
        int i7 = c4425h.f16507c;
        if (i7 == 1 || i7 == 2) {
            this.f16458Z = 4;
            this.f16460a0 = 4;
        } else {
            this.f16458Z = i7;
            this.f16460a0 = i7;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m19652B0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: C */
    public Parcelable mo10494C(CoordinatorLayout coordinatorLayout, View view) {
        return new C4425h(super.mo10494C(coordinatorLayout, view), this);
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m19653D0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: E */
    public boolean mo10496E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7, int i8) {
        this.f16466d0 = 0;
        this.f16468e0 = false;
        return (i7 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: G */
    public void mo10498G(CoordinatorLayout coordinatorLayout, View view, View view2, int i7) {
        WeakReference weakReference;
        int i8 = 3;
        if (view.getTop() == m19678s0()) {
            m19670a1(3);
            return;
        }
        if (!m19653D0() || ((weakReference = this.f16477m0) != null && view2 == weakReference.get() && this.f16468e0)) {
            if (this.f16466d0 > 0) {
                if (!this.f16461b && view.getTop() > this.f16449Q) {
                    i8 = 6;
                }
            } else if (this.f16453U && m19673e1(view, m19648w0())) {
                i8 = 5;
            } else if (this.f16466d0 == 0) {
                int top = view.getTop();
                if (!this.f16461b) {
                    int i9 = this.f16449Q;
                    if (top < i9) {
                        if (top >= Math.abs(top - this.f16451S)) {
                            if (m19674f1()) {
                                i8 = 4;
                            } else {
                                i8 = 6;
                            }
                        }
                    } else if (Math.abs(top - i9) < Math.abs(top - this.f16451S)) {
                        i8 = 6;
                    } else {
                        i8 = 4;
                    }
                } else if (Math.abs(top - this.f16448P) >= Math.abs(top - this.f16451S)) {
                    i8 = 4;
                }
            } else {
                if (!this.f16461b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f16449Q) < Math.abs(top2 - this.f16451S)) {
                        i8 = 6;
                    }
                }
                i8 = 4;
            }
            m19633h1(view, i8, false);
            this.f16468e0 = false;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m19654G0(AbstractC4424g abstractC4424g) {
        this.f16478n0.remove(abstractC4424g);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: H */
    public boolean mo10499H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f16458Z == 1 && actionMasked == 0) {
            return true;
        }
        if (m19628d1()) {
            this.f16462b0.m6867F(motionEvent);
        }
        if (actionMasked == 0) {
            m19604I0();
        }
        if (this.f16479o0 == null) {
            this.f16479o0 = VelocityTracker.obtain();
        }
        this.f16479o0.addMovement(motionEvent);
        if (m19628d1() && actionMasked == 2 && !this.f16464c0 && Math.abs(this.f16483r0 - motionEvent.getY()) > this.f16462b0.m6885z()) {
            this.f16462b0.m6877b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f16464c0;
    }

    /* JADX INFO: renamed from: L0 */
    public void m19655L0(boolean z7) {
        this.f16455W = z7;
    }

    /* JADX INFO: renamed from: M0 */
    public void m19656M0(boolean z7) {
        this.f16456X = z7;
    }

    /* JADX INFO: renamed from: N0 */
    public void m19657N0(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f16447O = i7;
        m19639k1(this.f16458Z, true);
    }

    /* JADX INFO: renamed from: O0 */
    public void m19658O0(boolean z7) {
        if (this.f16461b == z7) {
            return;
        }
        this.f16461b = z7;
        if (this.f16474j0 != null) {
            m19627d0();
        }
        m19670a1((this.f16461b && this.f16458Z == 6) ? 3 : this.f16458Z);
        m19639k1(this.f16458Z, true);
        m19635i1();
    }

    /* JADX INFO: renamed from: P0 */
    public void m19659P0(boolean z7) {
        this.f16495z = z7;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m19660Q0(float f7) {
        if (f7 <= 0.0f || f7 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f16450R = f7;
        if (this.f16474j0 != null) {
            m19630f0();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m19661R0(boolean z7) {
        if (this.f16453U != z7) {
            this.f16453U = z7;
            if (!z7 && this.f16458Z == 5) {
                m19669Z0(4);
            }
            m19635i1();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m19662S0(int i7) {
        this.f16493x = i7;
    }

    /* JADX INFO: renamed from: T0 */
    public void m19663T0(int i7) {
        this.f16492w = i7;
    }

    /* JADX INFO: renamed from: U0 */
    public void m19664U0(int i7) {
        m19665V0(i7, false);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m19665V0(int i7, boolean z7) {
        if (i7 == -1) {
            if (this.f16482r) {
                return;
            } else {
                this.f16482r = true;
            }
        } else {
            if (!this.f16482r && this.f16469f == i7) {
                return;
            }
            this.f16482r = false;
            this.f16469f = Math.max(0, i7);
        }
        m19643m1(z7);
    }

    /* JADX INFO: renamed from: W0 */
    public void m19666W0(int i7) {
        this.f16459a = i7;
    }

    /* JADX INFO: renamed from: X0 */
    public void m19667X0(int i7) {
        this.f16467e = i7;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m19668Y0(boolean z7) {
        this.f16454V = z7;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m19669Z0(int i7) {
        if (i7 == 1 || i7 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i7 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f16453U && i7 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i7);
            return;
        }
        int i8 = (i7 == 6 && this.f16461b && m19647v0(i7) <= this.f16448P) ? 3 : i7;
        WeakReference weakReference = this.f16474j0;
        if (weakReference == null || weakReference.get() == null) {
            m19670a1(i7);
        } else {
            View view = (View) this.f16474j0.get();
            m19608K0(view, new RunnableC4418a(view, i8));
        }
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: a */
    public void mo944a(C5173c c5173c) {
        C0194f c0194f = this.f16480p0;
        if (c0194f == null) {
            return;
        }
        c0194f.m965l(c5173c);
    }

    /* JADX INFO: renamed from: a1 */
    void m19670a1(int i7) {
        View view;
        if (this.f16458Z == i7) {
            return;
        }
        this.f16458Z = i7;
        if (i7 == 4 || i7 == 3 || i7 == 6 || (this.f16453U && i7 == 5)) {
            this.f16460a0 = i7;
        }
        WeakReference weakReference = this.f16474j0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i7 == 3) {
            m19641l1(true);
        } else if (i7 == 6 || i7 == 5 || i7 == 4) {
            m19641l1(false);
        }
        m19639k1(i7, true);
        for (int i8 = 0; i8 < this.f16478n0.size(); i8++) {
            ((AbstractC4424g) this.f16478n0.get(i8)).mo19686c(view, i7);
        }
        m19635i1();
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: b */
    public void mo945b() {
        C0194f c0194f = this.f16480p0;
        if (c0194f == null) {
            return;
        }
        C5173c c5173cM941c = c0194f.m941c();
        if (c5173cM941c == null || Build.VERSION.SDK_INT < 34) {
            m19669Z0(this.f16453U ? 5 : 4);
        } else if (this.f16453U) {
            this.f16480p0.m961h(c5173cM941c, new C4419b());
        } else {
            this.f16480p0.m962i(c5173cM941c, null);
            m19669Z0(4);
        }
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: c */
    public void mo946c(C5173c c5173c) {
        C0194f c0194f = this.f16480p0;
        if (c0194f == null) {
            return;
        }
        c0194f.m963j(c5173c);
    }

    /* JADX INFO: renamed from: c0 */
    public void m19671c0(AbstractC4424g abstractC4424g) {
        if (this.f16478n0.contains(abstractC4424g)) {
            return;
        }
        this.f16478n0.add(abstractC4424g);
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m19672c1(long j7, float f7) {
        return false;
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: d */
    public void mo947d() {
        C0194f c0194f = this.f16480p0;
        if (c0194f == null) {
            return;
        }
        c0194f.m960f();
    }

    /* JADX INFO: renamed from: e1 */
    boolean m19673e1(View view, float f7) {
        if (this.f16454V) {
            return true;
        }
        if (m19652B0() && view.getTop() >= this.f16451S) {
            return Math.abs((((float) view.getTop()) + (f7 * this.f16470f0)) - ((float) this.f16451S)) / ((float) m19632h0()) > 0.5f;
        }
        return false;
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m19674f1() {
        return false;
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m19675g1() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: k */
    public void mo10506k(CoordinatorLayout.C2426f c2426f) {
        super.mo10506k(c2426f);
        this.f16474j0 = null;
        this.f16462b0 = null;
        this.f16480p0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: n */
    public void mo10509n() {
        super.mo10509n();
        this.f16474j0 = null;
        this.f16462b0 = null;
        this.f16480p0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: o */
    public boolean mo10510o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i7;
        C1650c c1650c;
        if (!view.isShown() || !this.f16455W) {
            this.f16464c0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m19604I0();
        }
        if (this.f16479o0 == null) {
            this.f16479o0 = VelocityTracker.obtain();
        }
        this.f16479o0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            this.f16483r0 = y7;
            if (this.f16458Z != 2 && m19601F0(coordinatorLayout, x7, y7)) {
                this.f16481q0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!m19600E0(coordinatorLayout, x7, this.f16483r0)) {
                    this.f16485s0 = true;
                }
            }
            this.f16464c0 = this.f16481q0 == -1 && !coordinatorLayout.m10473F(view, x7, this.f16483r0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16485s0 = false;
            this.f16481q0 = -1;
            if (this.f16464c0) {
                this.f16464c0 = false;
                return false;
            }
        }
        if (!this.f16464c0 && (c1650c = this.f16462b0) != null && c1650c.m6873P(motionEvent)) {
            return true;
        }
        WeakReference weakReference = this.f16477m0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        return (actionMasked != 2 || view2 == null || this.f16464c0 || this.f16458Z == 1 || coordinatorLayout.m10473F(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f16462b0 == null || (i7 = this.f16483r0) == -1 || Math.abs(((float) i7) - motionEvent.getY()) <= ((float) this.f16462b0.m6885z())) ? false : true;
    }

    /* JADX INFO: renamed from: o0 */
    void m19676o0(int i7) {
        View view = (View) this.f16474j0.get();
        if (view == null || this.f16478n0.isEmpty()) {
            return;
        }
        float fM19634i0 = m19634i0(i7);
        for (int i8 = 0; i8 < this.f16478n0.size(); i8++) {
            ((AbstractC4424g) this.f16478n0.get(i8)).mo19685b(view, fM19634i0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: p */
    public boolean mo10511p(CoordinatorLayout coordinatorLayout, View view, int i7) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f16474j0 == null) {
            this.f16484s = coordinatorLayout.getResources().getDimensionPixelSize(AbstractC6744e.f26334b);
            m19626b1(view);
            AbstractC1030Z.m4426A0(view, new C4429c(view));
            this.f16474j0 = new WeakReference(view);
            this.f16480p0 = new C0194f(view);
            C0622i c0622i = this.f16488u;
            if (c0622i != null) {
                view.setBackground(c0622i);
                C0622i c0622i2 = this.f16488u;
                float elevation = this.f16452T;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c0622i2.m2717f0(elevation);
            } else {
                ColorStateList colorStateList = this.f16490v;
                if (colorStateList != null) {
                    AbstractC1030Z.m4482n0(view, colorStateList);
                }
            }
            m19635i1();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f16462b0 == null) {
            this.f16462b0 = C1650c.m6856o(coordinatorLayout, this.f16491v0);
        }
        int top = view.getTop();
        coordinatorLayout.m10476Q(view, i7);
        this.f16472h0 = coordinatorLayout.getWidth();
        this.f16473i0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f16471g0 = height;
        int iMin = this.f16473i0;
        int i8 = iMin - height;
        int i9 = this.f16441I;
        if (i8 < i9) {
            if (this.f16436D) {
                int i10 = this.f16493x;
                if (i10 != -1) {
                    iMin = Math.min(iMin, i10);
                }
                this.f16471g0 = iMin;
            } else {
                int iMin2 = iMin - i9;
                int i11 = this.f16493x;
                if (i11 != -1) {
                    iMin2 = Math.min(iMin2, i11);
                }
                this.f16471g0 = iMin2;
            }
        }
        this.f16448P = Math.max(0, this.f16473i0 - this.f16471g0);
        m19630f0();
        m19627d0();
        int i12 = this.f16458Z;
        if (i12 == 3) {
            AbstractC1030Z.m4449U(view, m19678s0());
        } else if (i12 == 6) {
            AbstractC1030Z.m4449U(view, this.f16449Q);
        } else if (this.f16453U && i12 == 5) {
            AbstractC1030Z.m4449U(view, this.f16473i0);
        } else if (i12 == 4) {
            AbstractC1030Z.m4449U(view, this.f16451S);
        } else if (i12 == 1 || i12 == 2) {
            AbstractC1030Z.m4449U(view, top - view.getTop());
        }
        m19639k1(this.f16458Z, false);
        this.f16477m0 = new WeakReference(m19677p0(view));
        for (int i13 = 0; i13 < this.f16478n0.size(); i13++) {
            ((AbstractC4424g) this.f16478n0.get(i13)).mo19684a(view);
        }
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    View m19677p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View viewM19677p0 = m19677p0(viewGroup.getChildAt(i7));
                if (viewM19677p0 != null) {
                    return viewM19677p0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: q */
    public boolean mo10512q(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m19646r0(i7, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, this.f16492w, marginLayoutParams.width), m19646r0(i9, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, this.f16493x, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: s */
    public boolean mo10514s(CoordinatorLayout coordinatorLayout, View view, View view2, float f7, float f8) {
        WeakReference weakReference;
        return m19653D0() && (weakReference = this.f16477m0) != null && view2 == weakReference.get() && (!(this.f16458Z == 3 || this.f16457Y) || super.mo10514s(coordinatorLayout, view, view2, f7, f8));
    }

    /* JADX INFO: renamed from: s0 */
    public int m19678s0() {
        if (this.f16461b) {
            return this.f16448P;
        }
        return Math.max(this.f16447O, this.f16436D ? 0 : this.f16441I);
    }

    /* JADX INFO: renamed from: t0 */
    C0622i m19679t0() {
        return this.f16488u;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: u */
    public void mo10516u(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 1) {
            return;
        }
        WeakReference weakReference = this.f16477m0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!m19653D0() || view2 == view3) {
            int top = view.getTop();
            int i10 = top - i8;
            if (i8 > 0) {
                if (!this.f16468e0 && !this.f16456X && view2 == view3 && view2.canScrollVertically(1)) {
                    this.f16457Y = true;
                    return;
                }
                if (i10 < m19678s0()) {
                    int iM19678s0 = top - m19678s0();
                    iArr[1] = iM19678s0;
                    AbstractC1030Z.m4449U(view, -iM19678s0);
                    m19670a1(3);
                } else {
                    if (!this.f16455W) {
                        return;
                    }
                    iArr[1] = i8;
                    AbstractC1030Z.m4449U(view, -i8);
                    m19670a1(1);
                }
            } else if (i8 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.f16468e0 && !this.f16456X && view2 == view3 && zCanScrollVertically) {
                    this.f16457Y = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i10 > this.f16451S && !m19636j0()) {
                        int i11 = top - this.f16451S;
                        iArr[1] = i11;
                        AbstractC1030Z.m4449U(view, -i11);
                        m19670a1(4);
                    } else {
                        if (!this.f16455W) {
                            return;
                        }
                        iArr[1] = i8;
                        AbstractC1030Z.m4449U(view, -i8);
                        m19670a1(1);
                    }
                }
            }
            m19676o0(view.getTop());
            this.f16466d0 = i8;
            this.f16468e0 = true;
            this.f16457Y = false;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public int m19680u0() {
        return this.f16458Z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: x */
    public void mo10519x(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m19681z0() {
        return this.f16495z;
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$i */
    private class C4426i {

        /* JADX INFO: renamed from: a */
        private int f16512a;

        /* JADX INFO: renamed from: b */
        private boolean f16513b;

        /* JADX INFO: renamed from: c */
        private final Runnable f16514c;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$i$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4426i.this.f16513b = false;
                C1650c c1650c = BottomSheetBehavior.this.f16462b0;
                if (c1650c != null && c1650c.m6880m(true)) {
                    C4426i c4426i = C4426i.this;
                    c4426i.m19692c(c4426i.f16512a);
                    return;
                }
                C4426i c4426i2 = C4426i.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f16458Z == 2) {
                    bottomSheetBehavior.m19670a1(c4426i2.f16512a);
                }
            }
        }

        private C4426i() {
            this.f16514c = new a();
        }

        /* JADX INFO: renamed from: c */
        void m19692c(int i7) {
            WeakReference weakReference = BottomSheetBehavior.this.f16474j0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f16512a = i7;
            if (this.f16513b) {
                return;
            }
            ((View) BottomSheetBehavior.this.f16474j0.get()).postOnAnimation(this.f16514c);
            this.f16513b = true;
        }

        /* synthetic */ C4426i(BottomSheetBehavior bottomSheetBehavior, RunnableC4418a runnableC4418a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    protected static class C4425h extends AbstractC1446a {
        public static final Parcelable.Creator<C4425h> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        final int f16507c;

        /* JADX INFO: renamed from: d */
        int f16508d;

        /* JADX INFO: renamed from: e */
        boolean f16509e;

        /* JADX INFO: renamed from: f */
        boolean f16510f;

        /* JADX INFO: renamed from: r */
        boolean f16511r;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C4425h createFromParcel(Parcel parcel) {
                return new C4425h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C4425h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4425h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C4425h[] newArray(int i7) {
                return new C4425h[i7];
            }
        }

        public C4425h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16507c = parcel.readInt();
            this.f16508d = parcel.readInt();
            this.f16509e = parcel.readInt() == 1;
            this.f16510f = parcel.readInt() == 1;
            this.f16511r = parcel.readInt() == 1;
        }

        @Override // p146T.AbstractC1446a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f16507c);
            parcel.writeInt(this.f16508d);
            parcel.writeInt(this.f16509e ? 1 : 0);
            parcel.writeInt(this.f16510f ? 1 : 0);
            parcel.writeInt(this.f16511r ? 1 : 0);
        }

        public C4425h(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f16507c = bottomSheetBehavior.f16458Z;
            this.f16508d = bottomSheetBehavior.f16469f;
            this.f16509e = bottomSheetBehavior.f16461b;
            this.f16510f = bottomSheetBehavior.f16453U;
            this.f16511r = bottomSheetBehavior.f16454V;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i7;
        super(context, attributeSet);
        this.f16459a = 0;
        this.f16461b = true;
        this.f16463c = false;
        this.f16492w = -1;
        this.f16493x = -1;
        this.f16445M = new C4426i(this, null);
        this.f16450R = 0.5f;
        this.f16452T = -1.0f;
        this.f16455W = true;
        this.f16456X = true;
        this.f16458Z = 4;
        this.f16460a0 = 4;
        this.f16470f0 = 0.1f;
        this.f16478n0 = new ArrayList();
        this.f16483r0 = -1;
        this.f16489u0 = new SparseIntArray();
        this.f16491v0 = new C4422e();
        this.f16486t = context.getResources().getDimensionPixelSize(AbstractC6744e.f26361o0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f26955k0);
        int i8 = AbstractC6752m.f26999o0;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            this.f16490v = AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, i8);
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC6752m.f26640H0)) {
            this.f16443K = C0627n.m2758e(context, attributeSet, AbstractC6742c.f26248d, f16432w0).m2802m();
        }
        m19642m0(context);
        m19644n0();
        this.f16452T = typedArrayObtainStyledAttributes.getDimension(AbstractC6752m.f26988n0, -1.0f);
        int i9 = AbstractC6752m.f26966l0;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            m19663T0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i9, -1));
        }
        int i10 = AbstractC6752m.f26977m0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            m19662S0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i10, -1));
        }
        int i11 = AbstractC6752m.f27076v0;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i11);
        if (typedValuePeekValue != null && (i7 = typedValuePeekValue.data) == -1) {
            m19664U0(i7);
        } else {
            m19664U0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i11, -1));
        }
        m19661R0(typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f27065u0, false));
        m19659P0(typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f27120z0, false));
        m19658O0(typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f27043s0, true));
        m19668Y0(typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f27109y0, false));
        m19655L0(typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f27010p0, true));
        m19656M0(typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f27021q0, true));
        m19666W0(typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f27087w0, 0));
        m19660Q0(typedArrayObtainStyledAttributes.getFloat(AbstractC6752m.f27054t0, 0.5f));
        int i12 = AbstractC6752m.f27032r0;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i12);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            m19657N0(typedValuePeekValue2.data);
        } else {
            m19657N0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i12, 0));
        }
        m19667X0(typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f27098x0, 500));
        this.f16433A = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26596D0, false);
        this.f16434B = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26607E0, false);
        this.f16435C = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26618F0, false);
        this.f16436D = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26629G0, true);
        this.f16437E = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26563A0, false);
        this.f16438F = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26574B0, false);
        this.f16439G = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26585C0, false);
        this.f16442J = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26651I0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f16465d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
