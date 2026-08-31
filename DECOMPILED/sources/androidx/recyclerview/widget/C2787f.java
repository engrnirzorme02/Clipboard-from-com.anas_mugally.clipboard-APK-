package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;
import java.util.List;
import p111O.AbstractC1030Z;
import p111O.C1072s;
import p386x0.AbstractC7380b;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f */
/* JADX INFO: loaded from: classes.dex */
public class C2787f extends RecyclerView.AbstractC2764o implements RecyclerView.InterfaceC2767r {

    /* JADX INFO: renamed from: A */
    private f f11156A;

    /* JADX INFO: renamed from: C */
    private Rect f11158C;

    /* JADX INFO: renamed from: D */
    private long f11159D;

    /* JADX INFO: renamed from: d */
    float f11163d;

    /* JADX INFO: renamed from: e */
    float f11164e;

    /* JADX INFO: renamed from: f */
    private float f11165f;

    /* JADX INFO: renamed from: g */
    private float f11166g;

    /* JADX INFO: renamed from: h */
    float f11167h;

    /* JADX INFO: renamed from: i */
    float f11168i;

    /* JADX INFO: renamed from: j */
    private float f11169j;

    /* JADX INFO: renamed from: k */
    private float f11170k;

    /* JADX INFO: renamed from: m */
    e f11172m;

    /* JADX INFO: renamed from: o */
    int f11174o;

    /* JADX INFO: renamed from: q */
    private int f11176q;

    /* JADX INFO: renamed from: r */
    RecyclerView f11177r;

    /* JADX INFO: renamed from: t */
    VelocityTracker f11179t;

    /* JADX INFO: renamed from: u */
    private List f11180u;

    /* JADX INFO: renamed from: v */
    private List f11181v;

    /* JADX INFO: renamed from: z */
    C1072s f11185z;

    /* JADX INFO: renamed from: a */
    final List f11160a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final float[] f11161b = new float[2];

    /* JADX INFO: renamed from: c */
    RecyclerView.AbstractC2749E f11162c = null;

    /* JADX INFO: renamed from: l */
    int f11171l = -1;

    /* JADX INFO: renamed from: n */
    private int f11173n = 0;

    /* JADX INFO: renamed from: p */
    List f11175p = new ArrayList();

    /* JADX INFO: renamed from: s */
    final Runnable f11178s = new a();

    /* JADX INFO: renamed from: w */
    private RecyclerView.InterfaceC2760k f11182w = null;

    /* JADX INFO: renamed from: x */
    View f11183x = null;

    /* JADX INFO: renamed from: y */
    int f11184y = -1;

    /* JADX INFO: renamed from: B */
    private final RecyclerView.InterfaceC2769t f11157B = new b();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2787f c2787f = C2787f.this;
            if (c2787f.f11162c == null || !c2787f.m13772E()) {
                return;
            }
            C2787f c2787f2 = C2787f.this;
            RecyclerView.AbstractC2749E abstractC2749E = c2787f2.f11162c;
            if (abstractC2749E != null) {
                c2787f2.m13782z(abstractC2749E);
            }
            C2787f c2787f3 = C2787f.this;
            c2787f3.f11177r.removeCallbacks(c2787f3.f11178s);
            AbstractC1030Z.m4458b0(C2787f.this.f11177r, this);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$b */
    class b implements RecyclerView.InterfaceC2769t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2769t
        /* JADX INFO: renamed from: a */
        public void mo13485a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C2787f.this.f11185z.m4768a(motionEvent);
            VelocityTracker velocityTracker = C2787f.this.f11179t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C2787f.this.f11171l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(C2787f.this.f11171l);
            if (iFindPointerIndex >= 0) {
                C2787f.this.m13777o(actionMasked, motionEvent, iFindPointerIndex);
            }
            C2787f c2787f = C2787f.this;
            RecyclerView.AbstractC2749E abstractC2749E = c2787f.f11162c;
            if (abstractC2749E == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        c2787f.m13775L(motionEvent, c2787f.f11174o, iFindPointerIndex);
                        C2787f.this.m13782z(abstractC2749E);
                        C2787f c2787f2 = C2787f.this;
                        c2787f2.f11177r.removeCallbacks(c2787f2.f11178s);
                        C2787f.this.f11178s.run();
                        C2787f.this.f11177r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    C2787f c2787f3 = C2787f.this;
                    if (pointerId == c2787f3.f11171l) {
                        c2787f3.f11171l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        C2787f c2787f4 = C2787f.this;
                        c2787f4.m13775L(motionEvent, c2787f4.f11174o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = c2787f.f11179t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            C2787f.this.m13773F(null, 0);
            C2787f.this.f11171l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2769t
        /* JADX INFO: renamed from: c */
        public boolean mo13486c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            g gVarM13779s;
            C2787f.this.f11185z.m4768a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C2787f.this.f11171l = motionEvent.getPointerId(0);
                C2787f.this.f11163d = motionEvent.getX();
                C2787f.this.f11164e = motionEvent.getY();
                C2787f.this.m13769A();
                C2787f c2787f = C2787f.this;
                if (c2787f.f11162c == null && (gVarM13779s = c2787f.m13779s(motionEvent)) != null) {
                    C2787f c2787f2 = C2787f.this;
                    c2787f2.f11163d -= gVarM13779s.f11208j;
                    c2787f2.f11164e -= gVarM13779s.f11209k;
                    c2787f2.m13778r(gVarM13779s.f11203e, true);
                    if (C2787f.this.f11160a.remove(gVarM13779s.f11203e.f10894a)) {
                        C2787f c2787f3 = C2787f.this;
                        c2787f3.f11172m.mo13791c(c2787f3.f11177r, gVarM13779s.f11203e);
                    }
                    C2787f.this.m13773F(gVarM13779s.f11203e, gVarM13779s.f11204f);
                    C2787f c2787f4 = C2787f.this;
                    c2787f4.m13775L(motionEvent, c2787f4.f11174o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C2787f c2787f5 = C2787f.this;
                c2787f5.f11171l = -1;
                c2787f5.m13773F(null, 0);
            } else {
                int i7 = C2787f.this.f11171l;
                if (i7 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i7)) >= 0) {
                    C2787f.this.m13777o(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = C2787f.this.f11179t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return C2787f.this.f11162c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2769t
        /* JADX INFO: renamed from: e */
        public void mo13487e(boolean z7) {
            if (z7) {
                C2787f.this.m13773F(null, 0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$c */
    class c extends g {

        /* JADX INFO: renamed from: o */
        final /* synthetic */ int f11188o;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ RecyclerView.AbstractC2749E f11189p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.AbstractC2749E abstractC2749E, int i7, int i8, float f7, float f8, float f9, float f10, int i9, RecyclerView.AbstractC2749E abstractC2749E2) {
            super(abstractC2749E, i7, i8, f7, f8, f9, f10);
            this.f11188o = i9;
            this.f11189p = abstractC2749E2;
        }

        @Override // androidx.recyclerview.widget.C2787f.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f11210l) {
                return;
            }
            if (this.f11188o <= 0) {
                C2787f c2787f = C2787f.this;
                c2787f.f11172m.mo13791c(c2787f.f11177r, this.f11189p);
            } else {
                C2787f.this.f11160a.add(this.f11189p.f10894a);
                this.f11207i = true;
                int i7 = this.f11188o;
                if (i7 > 0) {
                    C2787f.this.m13770B(this, i7);
                }
            }
            C2787f c2787f2 = C2787f.this;
            View view = c2787f2.f11183x;
            View view2 = this.f11189p.f10894a;
            if (view == view2) {
                c2787f2.m13771D(view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ g f11191a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f11192b;

        d(g gVar, int i7) {
            this.f11191a = gVar;
            this.f11192b = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = C2787f.this.f11177r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f11191a;
            if (gVar.f11210l || gVar.f11203e.m13276l() == -1) {
                return;
            }
            RecyclerView.AbstractC2762m itemAnimator = C2787f.this.f11177r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.m13353q(null)) && !C2787f.this.m13781x()) {
                C2787f.this.f11172m.mo13788B(this.f11191a.f11203e, this.f11192b);
            } else {
                C2787f.this.f11177r.post(this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$e */
    public static abstract class e {

        /* JADX INFO: renamed from: b */
        private static final Interpolator f11194b = new a();

        /* JADX INFO: renamed from: c */
        private static final Interpolator f11195c = new b();

        /* JADX INFO: renamed from: a */
        private int f11196a = -1;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.f$e$a */
        class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f7) {
                return f7 * f7 * f7 * f7 * f7;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.f$e$b */
        class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f7) {
                float f8 = f7 - 1.0f;
                return (f8 * f8 * f8 * f8 * f8) + 1.0f;
            }
        }

        /* JADX INFO: renamed from: e */
        public static int m13783e(int i7, int i8) {
            int i9;
            int i10 = i7 & 789516;
            if (i10 == 0) {
                return i7;
            }
            int i11 = i7 & (~i10);
            if (i8 == 0) {
                i9 = i10 << 2;
            } else {
                int i12 = i10 << 1;
                i11 |= (-789517) & i12;
                i9 = (i12 & 789516) << 2;
            }
            return i11 | i9;
        }

        /* JADX INFO: renamed from: i */
        private int m13784i(RecyclerView recyclerView) {
            if (this.f11196a == -1) {
                this.f11196a = recyclerView.getResources().getDimensionPixelSize(AbstractC7380b.f29585d);
            }
            return this.f11196a;
        }

        /* JADX INFO: renamed from: s */
        public static int m13785s(int i7, int i8) {
            return i8 << (i7 * 8);
        }

        /* JADX INFO: renamed from: t */
        public static int m13786t(int i7, int i8) {
            return m13785s(2, i7) | m13785s(1, i8) | m13785s(0, i8 | i7);
        }

        /* JADX INFO: renamed from: A */
        public void mo13787A(RecyclerView.AbstractC2749E abstractC2749E, int i7) {
            if (abstractC2749E != null) {
                C2789h.f11214a.mo13818b(abstractC2749E.f10894a);
            }
        }

        /* JADX INFO: renamed from: B */
        public abstract void mo13788B(RecyclerView.AbstractC2749E abstractC2749E, int i7);

        /* JADX INFO: renamed from: a */
        public boolean m13789a(RecyclerView recyclerView, RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2749E abstractC2749E2) {
            return true;
        }

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC2749E m13790b(RecyclerView.AbstractC2749E abstractC2749E, List list, int i7, int i8) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = abstractC2749E.f10894a.getWidth() + i7;
            int height = i8 + abstractC2749E.f10894a.getHeight();
            int left2 = i7 - abstractC2749E.f10894a.getLeft();
            int top2 = i8 - abstractC2749E.f10894a.getTop();
            int size = list.size();
            RecyclerView.AbstractC2749E abstractC2749E2 = null;
            int i9 = -1;
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.AbstractC2749E abstractC2749E3 = (RecyclerView.AbstractC2749E) list.get(i10);
                if (left2 > 0 && (right = abstractC2749E3.f10894a.getRight() - width) < 0 && abstractC2749E3.f10894a.getRight() > abstractC2749E.f10894a.getRight() && (iAbs4 = Math.abs(right)) > i9) {
                    abstractC2749E2 = abstractC2749E3;
                    i9 = iAbs4;
                }
                if (left2 < 0 && (left = abstractC2749E3.f10894a.getLeft() - i7) > 0 && abstractC2749E3.f10894a.getLeft() < abstractC2749E.f10894a.getLeft() && (iAbs3 = Math.abs(left)) > i9) {
                    abstractC2749E2 = abstractC2749E3;
                    i9 = iAbs3;
                }
                if (top2 < 0 && (top = abstractC2749E3.f10894a.getTop() - i8) > 0 && abstractC2749E3.f10894a.getTop() < abstractC2749E.f10894a.getTop() && (iAbs2 = Math.abs(top)) > i9) {
                    abstractC2749E2 = abstractC2749E3;
                    i9 = iAbs2;
                }
                if (top2 > 0 && (bottom = abstractC2749E3.f10894a.getBottom() - height) < 0 && abstractC2749E3.f10894a.getBottom() > abstractC2749E.f10894a.getBottom() && (iAbs = Math.abs(bottom)) > i9) {
                    abstractC2749E2 = abstractC2749E3;
                    i9 = iAbs;
                }
            }
            return abstractC2749E2;
        }

        /* JADX INFO: renamed from: c */
        public void mo13791c(RecyclerView recyclerView, RecyclerView.AbstractC2749E abstractC2749E) {
            C2789h.f11214a.mo13817a(abstractC2749E.f10894a);
        }

        /* JADX INFO: renamed from: d */
        public int m13792d(int i7, int i8) {
            int i9;
            int i10 = i7 & 3158064;
            if (i10 == 0) {
                return i7;
            }
            int i11 = i7 & (~i10);
            if (i8 == 0) {
                i9 = i10 >> 2;
            } else {
                int i12 = i10 >> 1;
                i11 |= (-3158065) & i12;
                i9 = (i12 & 3158064) >> 2;
            }
            return i11 | i9;
        }

        /* JADX INFO: renamed from: f */
        final int m13793f(RecyclerView recyclerView, RecyclerView.AbstractC2749E abstractC2749E) {
            return m13792d(mo13797k(recyclerView, abstractC2749E), AbstractC1030Z.m4505z(recyclerView));
        }

        /* JADX INFO: renamed from: g */
        public long m13794g(RecyclerView recyclerView, int i7, float f7, float f8) {
            RecyclerView.AbstractC2762m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i7 == 8 ? 200L : 250L;
            }
            return i7 == 8 ? itemAnimator.m13350n() : itemAnimator.m13351o();
        }

        /* JADX INFO: renamed from: h */
        public int m13795h() {
            return 0;
        }

        /* JADX INFO: renamed from: j */
        public float m13796j(RecyclerView.AbstractC2749E abstractC2749E) {
            return 0.5f;
        }

        /* JADX INFO: renamed from: k */
        public abstract int mo13797k(RecyclerView recyclerView, RecyclerView.AbstractC2749E abstractC2749E);

        /* JADX INFO: renamed from: l */
        public float m13798l(float f7) {
            return f7;
        }

        /* JADX INFO: renamed from: m */
        public float m13799m(RecyclerView.AbstractC2749E abstractC2749E) {
            return 0.5f;
        }

        /* JADX INFO: renamed from: n */
        public float m13800n(float f7) {
            return f7;
        }

        /* JADX INFO: renamed from: o */
        boolean m13801o(RecyclerView recyclerView, RecyclerView.AbstractC2749E abstractC2749E) {
            return (m13793f(recyclerView, abstractC2749E) & 16711680) != 0;
        }

        /* JADX INFO: renamed from: p */
        public int m13802p(RecyclerView recyclerView, int i7, int i8, int i9, long j7) {
            int iSignum = (int) (((int) (((int) Math.signum(i8)) * m13784i(recyclerView) * f11195c.getInterpolation(Math.min(1.0f, (Math.abs(i8) * 1.0f) / i7)))) * f11194b.getInterpolation(j7 <= 2000 ? j7 / 2000.0f : 1.0f));
            if (iSignum == 0) {
                return i8 > 0 ? 1 : -1;
            }
            return iSignum;
        }

        /* JADX INFO: renamed from: q */
        public abstract boolean mo13803q();

        /* JADX INFO: renamed from: r */
        public abstract boolean mo13804r();

        /* JADX INFO: renamed from: u */
        public void m13805u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC2749E abstractC2749E, float f7, float f8, int i7, boolean z7) {
            C2789h.f11214a.mo13820d(canvas, recyclerView, abstractC2749E.f10894a, f7, f8, i7, z7);
        }

        /* JADX INFO: renamed from: v */
        public void m13806v(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC2749E abstractC2749E, float f7, float f8, int i7, boolean z7) {
            C2789h.f11214a.mo13819c(canvas, recyclerView, abstractC2749E.f10894a, f7, f8, i7, z7);
        }

        /* JADX INFO: renamed from: w */
        void m13807w(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC2749E abstractC2749E, List list, int i7, float f7, float f8) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                g gVar = (g) list.get(i8);
                gVar.m13816e();
                int iSave = canvas.save();
                m13805u(canvas, recyclerView, gVar.f11203e, gVar.f11208j, gVar.f11209k, gVar.f11204f, false);
                canvas.restoreToCount(iSave);
            }
            if (abstractC2749E != null) {
                int iSave2 = canvas.save();
                m13805u(canvas, recyclerView, abstractC2749E, f7, f8, i7, true);
                canvas.restoreToCount(iSave2);
            }
        }

        /* JADX INFO: renamed from: x */
        void m13808x(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC2749E abstractC2749E, List list, int i7, float f7, float f8) {
            int size = list.size();
            boolean z7 = false;
            for (int i8 = 0; i8 < size; i8++) {
                g gVar = (g) list.get(i8);
                int iSave = canvas.save();
                m13806v(canvas, recyclerView, gVar.f11203e, gVar.f11208j, gVar.f11209k, gVar.f11204f, false);
                canvas.restoreToCount(iSave);
            }
            if (abstractC2749E != null) {
                int iSave2 = canvas.save();
                m13806v(canvas, recyclerView, abstractC2749E, f7, f8, i7, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i9 = size - 1; i9 >= 0; i9--) {
                g gVar2 = (g) list.get(i9);
                boolean z8 = gVar2.f11211m;
                if (z8 && !gVar2.f11207i) {
                    list.remove(i9);
                } else if (!z8) {
                    z7 = true;
                }
            }
            if (z7) {
                recyclerView.invalidate();
            }
        }

        /* JADX INFO: renamed from: y */
        public abstract boolean mo13809y(RecyclerView recyclerView, RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2749E abstractC2749E2);

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: z */
        public void m13810z(RecyclerView recyclerView, RecyclerView.AbstractC2749E abstractC2749E, int i7, RecyclerView.AbstractC2749E abstractC2749E2, int i8, int i9, int i10) {
            RecyclerView.AbstractC2765p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).mo13051d(abstractC2749E.f10894a, abstractC2749E2.f10894a, i9, i10);
                return;
            }
            if (layoutManager.mo13060q()) {
                if (layoutManager.m13417W(abstractC2749E2.f10894a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.m13181k1(i8);
                }
                if (layoutManager.m13420Z(abstractC2749E2.f10894a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.m13181k1(i8);
                }
            }
            if (layoutManager.mo13062r()) {
                if (layoutManager.m13421a0(abstractC2749E2.f10894a) <= recyclerView.getPaddingTop()) {
                    recyclerView.m13181k1(i8);
                }
                if (layoutManager.m13414U(abstractC2749E2.f10894a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.m13181k1(i8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$f */
    private class f extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        private boolean f11197a = true;

        f() {
        }

        /* JADX INFO: renamed from: a */
        void m13811a() {
            this.f11197a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewM13780t;
            RecyclerView.AbstractC2749E abstractC2749EM13173g0;
            if (!this.f11197a || (viewM13780t = C2787f.this.m13780t(motionEvent)) == null || (abstractC2749EM13173g0 = C2787f.this.f11177r.m13173g0(viewM13780t)) == null) {
                return;
            }
            C2787f c2787f = C2787f.this;
            if (c2787f.f11172m.m13801o(c2787f.f11177r, abstractC2749EM13173g0)) {
                int pointerId = motionEvent.getPointerId(0);
                int i7 = C2787f.this.f11171l;
                if (pointerId == i7) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i7);
                    float x7 = motionEvent.getX(iFindPointerIndex);
                    float y7 = motionEvent.getY(iFindPointerIndex);
                    C2787f c2787f2 = C2787f.this;
                    c2787f2.f11163d = x7;
                    c2787f2.f11164e = y7;
                    c2787f2.f11168i = 0.0f;
                    c2787f2.f11167h = 0.0f;
                    if (c2787f2.f11172m.mo13804r()) {
                        C2787f.this.m13773F(abstractC2749EM13173g0, 2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$g */
    static class g implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        final float f11199a;

        /* JADX INFO: renamed from: b */
        final float f11200b;

        /* JADX INFO: renamed from: c */
        final float f11201c;

        /* JADX INFO: renamed from: d */
        final float f11202d;

        /* JADX INFO: renamed from: e */
        final RecyclerView.AbstractC2749E f11203e;

        /* JADX INFO: renamed from: f */
        final int f11204f;

        /* JADX INFO: renamed from: g */
        final ValueAnimator f11205g;

        /* JADX INFO: renamed from: h */
        final int f11206h;

        /* JADX INFO: renamed from: i */
        boolean f11207i;

        /* JADX INFO: renamed from: j */
        float f11208j;

        /* JADX INFO: renamed from: k */
        float f11209k;

        /* JADX INFO: renamed from: l */
        boolean f11210l = false;

        /* JADX INFO: renamed from: m */
        boolean f11211m = false;

        /* JADX INFO: renamed from: n */
        private float f11212n;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.f$g$a */
        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.m13814c(valueAnimator.getAnimatedFraction());
            }
        }

        g(RecyclerView.AbstractC2749E abstractC2749E, int i7, int i8, float f7, float f8, float f9, float f10) {
            this.f11204f = i8;
            this.f11206h = i7;
            this.f11203e = abstractC2749E;
            this.f11199a = f7;
            this.f11200b = f8;
            this.f11201c = f9;
            this.f11202d = f10;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f11205g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(abstractC2749E.f10894a);
            valueAnimatorOfFloat.addListener(this);
            m13814c(0.0f);
        }

        /* JADX INFO: renamed from: a */
        public void m13812a() {
            this.f11205g.cancel();
        }

        /* JADX INFO: renamed from: b */
        public void m13813b(long j7) {
            this.f11205g.setDuration(j7);
        }

        /* JADX INFO: renamed from: c */
        public void m13814c(float f7) {
            this.f11212n = f7;
        }

        /* JADX INFO: renamed from: d */
        public void m13815d() {
            this.f11203e.m13262K(false);
            this.f11205g.start();
        }

        /* JADX INFO: renamed from: e */
        public void m13816e() {
            float f7 = this.f11199a;
            float f8 = this.f11201c;
            if (f7 == f8) {
                this.f11208j = this.f11203e.f10894a.getTranslationX();
            } else {
                this.f11208j = f7 + (this.f11212n * (f8 - f7));
            }
            float f9 = this.f11200b;
            float f10 = this.f11202d;
            if (f9 == f10) {
                this.f11209k = this.f11203e.f10894a.getTranslationY();
            } else {
                this.f11209k = f9 + (this.f11212n * (f10 - f9));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m13814c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f11211m) {
                this.f11203e.m13262K(true);
            }
            this.f11211m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$h */
    public interface h {
        /* JADX INFO: renamed from: d */
        void mo13051d(View view, View view2, int i7, int i8);
    }

    public C2787f(e eVar) {
        this.f11172m = eVar;
    }

    /* JADX INFO: renamed from: C */
    private void m13756C() {
        VelocityTracker velocityTracker = this.f11179t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11179t = null;
        }
    }

    /* JADX INFO: renamed from: G */
    private void m13757G() {
        this.f11176q = ViewConfiguration.get(this.f11177r.getContext()).getScaledTouchSlop();
        this.f11177r.m13174h(this);
        this.f11177r.m13180k(this.f11157B);
        this.f11177r.m13178j(this);
        m13758I();
    }

    /* JADX INFO: renamed from: I */
    private void m13758I() {
        this.f11156A = new f();
        this.f11185z = new C1072s(this.f11177r.getContext(), this.f11156A);
    }

    /* JADX INFO: renamed from: J */
    private void m13759J() {
        f fVar = this.f11156A;
        if (fVar != null) {
            fVar.m13811a();
            this.f11156A = null;
        }
        if (this.f11185z != null) {
            this.f11185z = null;
        }
    }

    /* JADX INFO: renamed from: K */
    private int m13760K(RecyclerView.AbstractC2749E abstractC2749E) {
        if (this.f11173n == 2) {
            return 0;
        }
        int iMo13797k = this.f11172m.mo13797k(this.f11177r, abstractC2749E);
        int iM13792d = (this.f11172m.m13792d(iMo13797k, AbstractC1030Z.m4505z(this.f11177r)) & 65280) >> 8;
        if (iM13792d == 0) {
            return 0;
        }
        int i7 = (iMo13797k & 65280) >> 8;
        if (Math.abs(this.f11167h) > Math.abs(this.f11168i)) {
            int iM13762n = m13762n(abstractC2749E, iM13792d);
            if (iM13762n > 0) {
                return (i7 & iM13762n) == 0 ? e.m13783e(iM13762n, AbstractC1030Z.m4505z(this.f11177r)) : iM13762n;
            }
            int iM13763p = m13763p(abstractC2749E, iM13792d);
            if (iM13763p > 0) {
                return iM13763p;
            }
        } else {
            int iM13763p2 = m13763p(abstractC2749E, iM13792d);
            if (iM13763p2 > 0) {
                return iM13763p2;
            }
            int iM13762n2 = m13762n(abstractC2749E, iM13792d);
            if (iM13762n2 > 0) {
                return (i7 & iM13762n2) == 0 ? e.m13783e(iM13762n2, AbstractC1030Z.m4505z(this.f11177r)) : iM13762n2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    private void m13761l() {
    }

    /* JADX INFO: renamed from: n */
    private int m13762n(RecyclerView.AbstractC2749E abstractC2749E, int i7) {
        if ((i7 & 12) == 0) {
            return 0;
        }
        int i8 = this.f11167h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f11179t;
        if (velocityTracker != null && this.f11171l > -1) {
            velocityTracker.computeCurrentVelocity(zzbbn.zzq.zzf, this.f11172m.m13800n(this.f11166g));
            float xVelocity = this.f11179t.getXVelocity(this.f11171l);
            float yVelocity = this.f11179t.getYVelocity(this.f11171l);
            int i9 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i9 & i7) != 0 && i8 == i9 && fAbs >= this.f11172m.m13798l(this.f11165f) && fAbs > Math.abs(yVelocity)) {
                return i9;
            }
        }
        float width = this.f11177r.getWidth() * this.f11172m.m13799m(abstractC2749E);
        if ((i7 & i8) == 0 || Math.abs(this.f11167h) <= width) {
            return 0;
        }
        return i8;
    }

    /* JADX INFO: renamed from: p */
    private int m13763p(RecyclerView.AbstractC2749E abstractC2749E, int i7) {
        if ((i7 & 3) == 0) {
            return 0;
        }
        int i8 = this.f11168i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f11179t;
        if (velocityTracker != null && this.f11171l > -1) {
            velocityTracker.computeCurrentVelocity(zzbbn.zzq.zzf, this.f11172m.m13800n(this.f11166g));
            float xVelocity = this.f11179t.getXVelocity(this.f11171l);
            float yVelocity = this.f11179t.getYVelocity(this.f11171l);
            int i9 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i9 & i7) != 0 && i9 == i8 && fAbs >= this.f11172m.m13798l(this.f11165f) && fAbs > Math.abs(xVelocity)) {
                return i9;
            }
        }
        float height = this.f11177r.getHeight() * this.f11172m.m13799m(abstractC2749E);
        if ((i7 & i8) == 0 || Math.abs(this.f11168i) <= height) {
            return 0;
        }
        return i8;
    }

    /* JADX INFO: renamed from: q */
    private void m13764q() {
        this.f11177r.m13160Y0(this);
        this.f11177r.m13165a1(this.f11157B);
        this.f11177r.m13162Z0(this);
        for (int size = this.f11175p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f11175p.get(0);
            gVar.m13812a();
            this.f11172m.mo13791c(this.f11177r, gVar.f11203e);
        }
        this.f11175p.clear();
        this.f11183x = null;
        this.f11184y = -1;
        m13756C();
        m13759J();
    }

    /* JADX INFO: renamed from: u */
    private List m13765u(RecyclerView.AbstractC2749E abstractC2749E) {
        RecyclerView.AbstractC2749E abstractC2749E2 = abstractC2749E;
        List list = this.f11180u;
        if (list == null) {
            this.f11180u = new ArrayList();
            this.f11181v = new ArrayList();
        } else {
            list.clear();
            this.f11181v.clear();
        }
        int iM13795h = this.f11172m.m13795h();
        int iRound = Math.round(this.f11169j + this.f11167h) - iM13795h;
        int iRound2 = Math.round(this.f11170k + this.f11168i) - iM13795h;
        int i7 = iM13795h * 2;
        int width = abstractC2749E2.f10894a.getWidth() + iRound + i7;
        int height = abstractC2749E2.f10894a.getHeight() + iRound2 + i7;
        int i8 = (iRound + width) / 2;
        int i9 = (iRound2 + height) / 2;
        RecyclerView.AbstractC2765p layoutManager = this.f11177r.getLayoutManager();
        int iM13407P = layoutManager.m13407P();
        int i10 = 0;
        while (i10 < iM13407P) {
            View viewM13405O = layoutManager.m13405O(i10);
            if (viewM13405O != abstractC2749E2.f10894a && viewM13405O.getBottom() >= iRound2 && viewM13405O.getTop() <= height && viewM13405O.getRight() >= iRound && viewM13405O.getLeft() <= width) {
                RecyclerView.AbstractC2749E abstractC2749EM13173g0 = this.f11177r.m13173g0(viewM13405O);
                if (this.f11172m.m13789a(this.f11177r, this.f11162c, abstractC2749EM13173g0)) {
                    int iAbs = Math.abs(i8 - ((viewM13405O.getLeft() + viewM13405O.getRight()) / 2));
                    int iAbs2 = Math.abs(i9 - ((viewM13405O.getTop() + viewM13405O.getBottom()) / 2));
                    int i11 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.f11180u.size();
                    int i12 = 0;
                    for (int i13 = 0; i13 < size && i11 > ((Integer) this.f11181v.get(i13)).intValue(); i13++) {
                        i12++;
                    }
                    this.f11180u.add(i12, abstractC2749EM13173g0);
                    this.f11181v.add(i12, Integer.valueOf(i11));
                }
            }
            i10++;
            abstractC2749E2 = abstractC2749E;
        }
        return this.f11180u;
    }

    /* JADX INFO: renamed from: v */
    private RecyclerView.AbstractC2749E m13766v(MotionEvent motionEvent) {
        View viewM13780t;
        RecyclerView.AbstractC2765p layoutManager = this.f11177r.getLayoutManager();
        int i7 = this.f11171l;
        if (i7 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i7);
        float x7 = motionEvent.getX(iFindPointerIndex) - this.f11163d;
        float y7 = motionEvent.getY(iFindPointerIndex) - this.f11164e;
        float fAbs = Math.abs(x7);
        float fAbs2 = Math.abs(y7);
        int i8 = this.f11176q;
        if (fAbs < i8 && fAbs2 < i8) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.mo13060q()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.mo13062r()) && (viewM13780t = m13780t(motionEvent)) != null) {
            return this.f11177r.m13173g0(viewM13780t);
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    private void m13767w(float[] fArr) {
        if ((this.f11174o & 12) != 0) {
            fArr[0] = (this.f11169j + this.f11167h) - this.f11162c.f10894a.getLeft();
        } else {
            fArr[0] = this.f11162c.f10894a.getTranslationX();
        }
        if ((this.f11174o & 3) != 0) {
            fArr[1] = (this.f11170k + this.f11168i) - this.f11162c.f10894a.getTop();
        } else {
            fArr[1] = this.f11162c.f10894a.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: y */
    private static boolean m13768y(View view, float f7, float f8, float f9, float f10) {
        return f7 >= f9 && f7 <= f9 + ((float) view.getWidth()) && f8 >= f10 && f8 <= f10 + ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: A */
    void m13769A() {
        VelocityTracker velocityTracker = this.f11179t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f11179t = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: B */
    void m13770B(g gVar, int i7) {
        this.f11177r.post(new d(gVar, i7));
    }

    /* JADX INFO: renamed from: D */
    void m13771D(View view) {
        if (view == this.f11183x) {
            this.f11183x = null;
            if (this.f11182w != null) {
                this.f11177r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX INFO: renamed from: E */
    boolean m13772E() {
        int iM13802p;
        int iM13802p2;
        if (this.f11162c == null) {
            this.f11159D = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f11159D;
        long j8 = j7 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j7;
        RecyclerView.AbstractC2765p layoutManager = this.f11177r.getLayoutManager();
        if (this.f11158C == null) {
            this.f11158C = new Rect();
        }
        layoutManager.m13452p(this.f11162c.f10894a, this.f11158C);
        if (layoutManager.mo13060q()) {
            int i7 = (int) (this.f11169j + this.f11167h);
            int paddingLeft = (i7 - this.f11158C.left) - this.f11177r.getPaddingLeft();
            float f7 = this.f11167h;
            if ((f7 >= 0.0f || paddingLeft >= 0) && (f7 <= 0.0f || (paddingLeft = ((i7 + this.f11162c.f10894a.getWidth()) + this.f11158C.right) - (this.f11177r.getWidth() - this.f11177r.getPaddingRight())) <= 0)) {
                iM13802p = 0;
            } else {
                iM13802p = paddingLeft;
            }
        } else {
            iM13802p = 0;
        }
        if (layoutManager.mo13062r()) {
            int i8 = (int) (this.f11170k + this.f11168i);
            iM13802p2 = (i8 - this.f11158C.top) - this.f11177r.getPaddingTop();
            float f8 = this.f11168i;
            if ((f8 >= 0.0f || iM13802p2 >= 0) && (f8 <= 0.0f || (iM13802p2 = ((i8 + this.f11162c.f10894a.getHeight()) + this.f11158C.bottom) - (this.f11177r.getHeight() - this.f11177r.getPaddingBottom())) <= 0)) {
                iM13802p2 = 0;
            }
        } else {
            iM13802p2 = 0;
        }
        if (iM13802p != 0) {
            iM13802p = this.f11172m.m13802p(this.f11177r, this.f11162c.f10894a.getWidth(), iM13802p, this.f11177r.getWidth(), j8);
        }
        int i9 = iM13802p;
        if (iM13802p2 != 0) {
            iM13802p2 = this.f11172m.m13802p(this.f11177r, this.f11162c.f10894a.getHeight(), iM13802p2, this.f11177r.getHeight(), j8);
        }
        if (i9 == 0 && iM13802p2 == 0) {
            this.f11159D = Long.MIN_VALUE;
            return false;
        }
        if (this.f11159D == Long.MIN_VALUE) {
            this.f11159D = jCurrentTimeMillis;
        }
        this.f11177r.scrollBy(i9, iM13802p2);
        return true;
    }

    /* JADX INFO: renamed from: F */
    void m13773F(RecyclerView.AbstractC2749E abstractC2749E, int i7) {
        boolean z7;
        float fSignum;
        float fSignum2;
        if (abstractC2749E == this.f11162c && i7 == this.f11173n) {
            return;
        }
        this.f11159D = Long.MIN_VALUE;
        int i8 = this.f11173n;
        m13778r(abstractC2749E, true);
        this.f11173n = i7;
        if (i7 == 2) {
            if (abstractC2749E == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f11183x = abstractC2749E.f10894a;
            m13761l();
        }
        int i9 = (1 << ((i7 * 8) + 8)) - 1;
        RecyclerView.AbstractC2749E abstractC2749E2 = this.f11162c;
        boolean z8 = false;
        if (abstractC2749E2 != null) {
            if (abstractC2749E2.f10894a.getParent() != null) {
                int iM13760K = i8 == 2 ? 0 : m13760K(abstractC2749E2);
                m13756C();
                int i10 = 4;
                if (iM13760K == 1 || iM13760K == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f11168i) * this.f11177r.getHeight();
                } else if (iM13760K == 4 || iM13760K == 8 || iM13760K == 16 || iM13760K == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f11167h) * this.f11177r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i8 == 2) {
                    i10 = 8;
                } else if (iM13760K > 0) {
                    i10 = 2;
                }
                m13767w(this.f11161b);
                float[] fArr = this.f11161b;
                float f7 = fArr[0];
                float f8 = fArr[1];
                z7 = false;
                c cVar = new c(abstractC2749E2, i10, i8, f7, f8, fSignum, fSignum2, iM13760K, abstractC2749E2);
                cVar.m13813b(this.f11172m.m13794g(this.f11177r, i10, fSignum - f7, fSignum2 - f8));
                this.f11175p.add(cVar);
                cVar.m13815d();
                z8 = true;
            } else {
                z7 = false;
                m13771D(abstractC2749E2.f10894a);
                this.f11172m.mo13791c(this.f11177r, abstractC2749E2);
                z8 = false;
            }
            this.f11162c = null;
        } else {
            z7 = false;
        }
        if (abstractC2749E != null) {
            this.f11174o = (this.f11172m.m13793f(this.f11177r, abstractC2749E) & i9) >> (this.f11173n * 8);
            this.f11169j = abstractC2749E.f10894a.getLeft();
            this.f11170k = abstractC2749E.f10894a.getTop();
            this.f11162c = abstractC2749E;
            if (i7 == 2) {
                abstractC2749E.f10894a.performHapticFeedback(z7 ? 1 : 0);
            }
        }
        ViewParent parent = this.f11177r.getParent();
        if (parent != null) {
            if (this.f11162c != null) {
                z7 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z7);
        }
        if (!z8) {
            this.f11177r.getLayoutManager().m13471z1();
        }
        this.f11172m.mo13787A(this.f11162c, this.f11173n);
        this.f11177r.invalidate();
    }

    /* JADX INFO: renamed from: H */
    public void m13774H(RecyclerView.AbstractC2749E abstractC2749E) {
        if (!this.f11172m.m13801o(this.f11177r, abstractC2749E)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (abstractC2749E.f10894a.getParent() != this.f11177r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        m13769A();
        this.f11168i = 0.0f;
        this.f11167h = 0.0f;
        m13773F(abstractC2749E, 2);
    }

    /* JADX INFO: renamed from: L */
    void m13775L(MotionEvent motionEvent, int i7, int i8) {
        float x7 = motionEvent.getX(i8);
        float y7 = motionEvent.getY(i8);
        float f7 = x7 - this.f11163d;
        this.f11167h = f7;
        this.f11168i = y7 - this.f11164e;
        if ((i7 & 4) == 0) {
            this.f11167h = Math.max(0.0f, f7);
        }
        if ((i7 & 8) == 0) {
            this.f11167h = Math.min(0.0f, this.f11167h);
        }
        if ((i7 & 1) == 0) {
            this.f11168i = Math.max(0.0f, this.f11168i);
        }
        if ((i7 & 2) == 0) {
            this.f11168i = Math.min(0.0f, this.f11168i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2767r
    /* JADX INFO: renamed from: b */
    public void mo13482b(View view) {
        m13771D(view);
        RecyclerView.AbstractC2749E abstractC2749EM13173g0 = this.f11177r.m13173g0(view);
        if (abstractC2749EM13173g0 == null) {
            return;
        }
        RecyclerView.AbstractC2749E abstractC2749E = this.f11162c;
        if (abstractC2749E != null && abstractC2749EM13173g0 == abstractC2749E) {
            m13773F(null, 0);
            return;
        }
        m13778r(abstractC2749EM13173g0, false);
        if (this.f11160a.remove(abstractC2749EM13173g0.f10894a)) {
            this.f11172m.mo13791c(this.f11177r, abstractC2749EM13173g0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2767r
    /* JADX INFO: renamed from: d */
    public void mo13483d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2764o
    /* JADX INFO: renamed from: g */
    public void mo13365g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C2746B c2746b) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2764o
    /* JADX INFO: renamed from: i */
    public void mo13367i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C2746B c2746b) {
        float f7;
        float f8;
        this.f11184y = -1;
        if (this.f11162c != null) {
            m13767w(this.f11161b);
            float[] fArr = this.f11161b;
            float f9 = fArr[0];
            f8 = fArr[1];
            f7 = f9;
        } else {
            f7 = 0.0f;
            f8 = 0.0f;
        }
        this.f11172m.m13807w(canvas, recyclerView, this.f11162c, this.f11175p, this.f11173n, f7, f8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2764o
    /* JADX INFO: renamed from: k */
    public void mo13369k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C2746B c2746b) {
        float f7;
        float f8;
        if (this.f11162c != null) {
            m13767w(this.f11161b);
            float[] fArr = this.f11161b;
            float f9 = fArr[0];
            f8 = fArr[1];
            f7 = f9;
        } else {
            f7 = 0.0f;
            f8 = 0.0f;
        }
        this.f11172m.m13808x(canvas, recyclerView, this.f11162c, this.f11175p, this.f11173n, f7, f8);
    }

    /* JADX INFO: renamed from: m */
    public void m13776m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f11177r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m13764q();
        }
        this.f11177r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f11165f = resources.getDimension(AbstractC7380b.f29587f);
            this.f11166g = resources.getDimension(AbstractC7380b.f29586e);
            m13757G();
        }
    }

    /* JADX INFO: renamed from: o */
    void m13777o(int i7, MotionEvent motionEvent, int i8) {
        RecyclerView.AbstractC2749E abstractC2749EM13766v;
        int iM13793f;
        if (this.f11162c != null || i7 != 2 || this.f11173n == 2 || !this.f11172m.mo13803q() || this.f11177r.getScrollState() == 1 || (abstractC2749EM13766v = m13766v(motionEvent)) == null || (iM13793f = (this.f11172m.m13793f(this.f11177r, abstractC2749EM13766v) & 65280) >> 8) == 0) {
            return;
        }
        float x7 = motionEvent.getX(i8);
        float y7 = motionEvent.getY(i8);
        float f7 = x7 - this.f11163d;
        float f8 = y7 - this.f11164e;
        float fAbs = Math.abs(f7);
        float fAbs2 = Math.abs(f8);
        int i9 = this.f11176q;
        if (fAbs >= i9 || fAbs2 >= i9) {
            if (fAbs > fAbs2) {
                if (f7 < 0.0f && (iM13793f & 4) == 0) {
                    return;
                }
                if (f7 > 0.0f && (iM13793f & 8) == 0) {
                    return;
                }
            } else {
                if (f8 < 0.0f && (iM13793f & 1) == 0) {
                    return;
                }
                if (f8 > 0.0f && (iM13793f & 2) == 0) {
                    return;
                }
            }
            this.f11168i = 0.0f;
            this.f11167h = 0.0f;
            this.f11171l = motionEvent.getPointerId(0);
            m13773F(abstractC2749EM13766v, 1);
        }
    }

    /* JADX INFO: renamed from: r */
    void m13778r(RecyclerView.AbstractC2749E abstractC2749E, boolean z7) {
        for (int size = this.f11175p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f11175p.get(size);
            if (gVar.f11203e == abstractC2749E) {
                gVar.f11210l |= z7;
                if (!gVar.f11211m) {
                    gVar.m13812a();
                }
                this.f11175p.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    g m13779s(MotionEvent motionEvent) {
        if (this.f11175p.isEmpty()) {
            return null;
        }
        View viewM13780t = m13780t(motionEvent);
        for (int size = this.f11175p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f11175p.get(size);
            if (gVar.f11203e.f10894a == viewM13780t) {
                return gVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    View m13780t(MotionEvent motionEvent) {
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        RecyclerView.AbstractC2749E abstractC2749E = this.f11162c;
        if (abstractC2749E != null) {
            View view = abstractC2749E.f10894a;
            if (m13768y(view, x7, y7, this.f11169j + this.f11167h, this.f11170k + this.f11168i)) {
                return view;
            }
        }
        for (int size = this.f11175p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f11175p.get(size);
            View view2 = gVar.f11203e.f10894a;
            if (m13768y(view2, x7, y7, gVar.f11208j, gVar.f11209k)) {
                return view2;
            }
        }
        return this.f11177r.m13154S(x7, y7);
    }

    /* JADX INFO: renamed from: x */
    boolean m13781x() {
        int size = this.f11175p.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((g) this.f11175p.get(i7)).f11211m) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    void m13782z(RecyclerView.AbstractC2749E abstractC2749E) {
        if (!this.f11177r.isLayoutRequested() && this.f11173n == 2) {
            float fM13796j = this.f11172m.m13796j(abstractC2749E);
            int i7 = (int) (this.f11169j + this.f11167h);
            int i8 = (int) (this.f11170k + this.f11168i);
            if (Math.abs(i8 - abstractC2749E.f10894a.getTop()) >= abstractC2749E.f10894a.getHeight() * fM13796j || Math.abs(i7 - abstractC2749E.f10894a.getLeft()) >= abstractC2749E.f10894a.getWidth() * fM13796j) {
                List listM13765u = m13765u(abstractC2749E);
                if (listM13765u.size() == 0) {
                    return;
                }
                RecyclerView.AbstractC2749E abstractC2749EM13790b = this.f11172m.m13790b(abstractC2749E, listM13765u, i7, i8);
                if (abstractC2749EM13790b == null) {
                    this.f11180u.clear();
                    this.f11181v.clear();
                    return;
                }
                int iM13276l = abstractC2749EM13790b.m13276l();
                int iM13276l2 = abstractC2749E.m13276l();
                if (this.f11172m.mo13809y(this.f11177r, abstractC2749E, abstractC2749EM13790b)) {
                    this.f11172m.m13810z(this.f11177r, abstractC2749E, iM13276l2, abstractC2749EM13790b, iM13276l, i7, i8);
                }
            }
        }
    }
}
