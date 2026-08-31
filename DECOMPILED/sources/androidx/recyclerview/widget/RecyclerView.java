package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.app.AbstractC2263x;
import androidx.core.widget.AbstractC2453d;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p081K.AbstractC0723o;
import p104N.AbstractC0910g;
import p111O.AbstractC0981A;
import p111O.AbstractC1030Z;
import p111O.AbstractC1039c0;
import p111O.C0985C;
import p111O.C1032a;
import p111O.InterfaceC0983B;
import p118P.AbstractC1153b;
import p118P.C1170s;
import p146T.AbstractC1446a;
import p386x0.AbstractC7379a;
import p386x0.AbstractC7380b;
import p386x0.AbstractC7382d;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0983B {

    /* JADX INFO: renamed from: M0 */
    private static final int[] f10769M0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: N0 */
    static final boolean f10770N0 = false;

    /* JADX INFO: renamed from: O0 */
    static final boolean f10771O0 = true;

    /* JADX INFO: renamed from: P0 */
    static final boolean f10772P0 = true;

    /* JADX INFO: renamed from: Q0 */
    static final boolean f10773Q0 = true;

    /* JADX INFO: renamed from: R0 */
    private static final boolean f10774R0 = false;

    /* JADX INFO: renamed from: S0 */
    private static final boolean f10775S0 = false;

    /* JADX INFO: renamed from: T0 */
    private static final Class[] f10776T0;

    /* JADX INFO: renamed from: U0 */
    static final Interpolator f10777U0;

    /* JADX INFO: renamed from: A */
    private final ArrayList f10778A;

    /* JADX INFO: renamed from: A0 */
    private InterfaceC2760k f10779A0;

    /* JADX INFO: renamed from: B */
    private InterfaceC2769t f10780B;

    /* JADX INFO: renamed from: B0 */
    private final int[] f10781B0;

    /* JADX INFO: renamed from: C */
    boolean f10782C;

    /* JADX INFO: renamed from: C0 */
    private C0985C f10783C0;

    /* JADX INFO: renamed from: D */
    boolean f10784D;

    /* JADX INFO: renamed from: D0 */
    private final int[] f10785D0;

    /* JADX INFO: renamed from: E */
    boolean f10786E;

    /* JADX INFO: renamed from: E0 */
    private final int[] f10787E0;

    /* JADX INFO: renamed from: F */
    boolean f10788F;

    /* JADX INFO: renamed from: F0 */
    final int[] f10789F0;

    /* JADX INFO: renamed from: G */
    private int f10790G;

    /* JADX INFO: renamed from: G0 */
    final List f10791G0;

    /* JADX INFO: renamed from: H */
    boolean f10792H;

    /* JADX INFO: renamed from: H0 */
    private Runnable f10793H0;

    /* JADX INFO: renamed from: I */
    boolean f10794I;

    /* JADX INFO: renamed from: I0 */
    private boolean f10795I0;

    /* JADX INFO: renamed from: J */
    private boolean f10796J;

    /* JADX INFO: renamed from: J0 */
    private int f10797J0;

    /* JADX INFO: renamed from: K */
    private int f10798K;

    /* JADX INFO: renamed from: K0 */
    private int f10799K0;

    /* JADX INFO: renamed from: L */
    boolean f10800L;

    /* JADX INFO: renamed from: L0 */
    private final C2800s.b f10801L0;

    /* JADX INFO: renamed from: M */
    private final AccessibilityManager f10802M;

    /* JADX INFO: renamed from: N */
    private List f10803N;

    /* JADX INFO: renamed from: O */
    boolean f10804O;

    /* JADX INFO: renamed from: P */
    boolean f10805P;

    /* JADX INFO: renamed from: Q */
    private int f10806Q;

    /* JADX INFO: renamed from: R */
    private int f10807R;

    /* JADX INFO: renamed from: S */
    private C2761l f10808S;

    /* JADX INFO: renamed from: T */
    private EdgeEffect f10809T;

    /* JADX INFO: renamed from: U */
    private EdgeEffect f10810U;

    /* JADX INFO: renamed from: V */
    private EdgeEffect f10811V;

    /* JADX INFO: renamed from: W */
    private EdgeEffect f10812W;

    /* JADX INFO: renamed from: a */
    private final C2774y f10813a;

    /* JADX INFO: renamed from: a0 */
    AbstractC2762m f10814a0;

    /* JADX INFO: renamed from: b */
    final C2772w f10815b;

    /* JADX INFO: renamed from: b0 */
    private int f10816b0;

    /* JADX INFO: renamed from: c */
    C2775z f10817c;

    /* JADX INFO: renamed from: c0 */
    private int f10818c0;

    /* JADX INFO: renamed from: d */
    C2782a f10819d;

    /* JADX INFO: renamed from: d0 */
    private VelocityTracker f10820d0;

    /* JADX INFO: renamed from: e */
    C2783b f10821e;

    /* JADX INFO: renamed from: e0 */
    private int f10822e0;

    /* JADX INFO: renamed from: f */
    final C2800s f10823f;

    /* JADX INFO: renamed from: f0 */
    private int f10824f0;

    /* JADX INFO: renamed from: g0 */
    private int f10825g0;

    /* JADX INFO: renamed from: h0 */
    private int f10826h0;

    /* JADX INFO: renamed from: i0 */
    private int f10827i0;

    /* JADX INFO: renamed from: j0 */
    private AbstractC2768s f10828j0;

    /* JADX INFO: renamed from: k0 */
    private final int f10829k0;

    /* JADX INFO: renamed from: l0 */
    private final int f10830l0;

    /* JADX INFO: renamed from: m0 */
    private float f10831m0;

    /* JADX INFO: renamed from: n0 */
    private float f10832n0;

    /* JADX INFO: renamed from: o0 */
    private boolean f10833o0;

    /* JADX INFO: renamed from: p0 */
    final RunnableC2748D f10834p0;

    /* JADX INFO: renamed from: q0 */
    RunnableC2786e f10835q0;

    /* JADX INFO: renamed from: r */
    boolean f10836r;

    /* JADX INFO: renamed from: r0 */
    RunnableC2786e.b f10837r0;

    /* JADX INFO: renamed from: s */
    final Runnable f10838s;

    /* JADX INFO: renamed from: s0 */
    final C2746B f10839s0;

    /* JADX INFO: renamed from: t */
    final Rect f10840t;

    /* JADX INFO: renamed from: t0 */
    private AbstractC2770u f10841t0;

    /* JADX INFO: renamed from: u */
    private final Rect f10842u;

    /* JADX INFO: renamed from: u0 */
    private List f10843u0;

    /* JADX INFO: renamed from: v */
    final RectF f10844v;

    /* JADX INFO: renamed from: v0 */
    boolean f10845v0;

    /* JADX INFO: renamed from: w */
    AbstractC2757h f10846w;

    /* JADX INFO: renamed from: w0 */
    boolean f10847w0;

    /* JADX INFO: renamed from: x */
    AbstractC2765p f10848x;

    /* JADX INFO: renamed from: x0 */
    private AbstractC2762m.b f10849x0;

    /* JADX INFO: renamed from: y */
    final List f10850y;

    /* JADX INFO: renamed from: y0 */
    boolean f10851y0;

    /* JADX INFO: renamed from: z */
    final ArrayList f10852z;

    /* JADX INFO: renamed from: z0 */
    C2795n f10853z0;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$A */
    public static abstract class AbstractC2745A {

        /* JADX INFO: renamed from: b */
        private RecyclerView f10855b;

        /* JADX INFO: renamed from: c */
        private AbstractC2765p f10856c;

        /* JADX INFO: renamed from: d */
        private boolean f10857d;

        /* JADX INFO: renamed from: e */
        private boolean f10858e;

        /* JADX INFO: renamed from: f */
        private View f10859f;

        /* JADX INFO: renamed from: h */
        private boolean f10861h;

        /* JADX INFO: renamed from: a */
        private int f10854a = -1;

        /* JADX INFO: renamed from: g */
        private final a f10860g = new a(0, 0);

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$A$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private int f10862a;

            /* JADX INFO: renamed from: b */
            private int f10863b;

            /* JADX INFO: renamed from: c */
            private int f10864c;

            /* JADX INFO: renamed from: d */
            private int f10865d;

            /* JADX INFO: renamed from: e */
            private Interpolator f10866e;

            /* JADX INFO: renamed from: f */
            private boolean f10867f;

            /* JADX INFO: renamed from: g */
            private int f10868g;

            public a(int i7, int i8) {
                this(i7, i8, Integer.MIN_VALUE, null);
            }

            /* JADX INFO: renamed from: e */
            private void m13233e() {
                if (this.f10866e != null && this.f10864c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f10864c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* JADX INFO: renamed from: a */
            boolean m13234a() {
                return this.f10865d >= 0;
            }

            /* JADX INFO: renamed from: b */
            public void m13235b(int i7) {
                this.f10865d = i7;
            }

            /* JADX INFO: renamed from: c */
            void m13236c(RecyclerView recyclerView) {
                int i7 = this.f10865d;
                if (i7 >= 0) {
                    this.f10865d = -1;
                    recyclerView.m13209x0(i7);
                    this.f10867f = false;
                } else {
                    if (!this.f10867f) {
                        this.f10868g = 0;
                        return;
                    }
                    m13233e();
                    recyclerView.f10834p0.m13249e(this.f10862a, this.f10863b, this.f10864c, this.f10866e);
                    int i8 = this.f10868g + 1;
                    this.f10868g = i8;
                    if (i8 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f10867f = false;
                }
            }

            /* JADX INFO: renamed from: d */
            public void m13237d(int i7, int i8, int i9, Interpolator interpolator) {
                this.f10862a = i7;
                this.f10863b = i8;
                this.f10864c = i9;
                this.f10866e = interpolator;
                this.f10867f = true;
            }

            public a(int i7, int i8, int i9, Interpolator interpolator) {
                this.f10865d = -1;
                this.f10867f = false;
                this.f10868g = 0;
                this.f10862a = i7;
                this.f10863b = i8;
                this.f10864c = i9;
                this.f10866e = interpolator;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$A$b */
        public interface b {
            /* JADX INFO: renamed from: c */
            PointF mo13049c(int i7);
        }

        /* JADX INFO: renamed from: a */
        public PointF mo13215a(int i7) {
            Object objM13219e = m13219e();
            if (objM13219e instanceof b) {
                return ((b) objM13219e).mo13049c(i7);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* JADX INFO: renamed from: b */
        public View m13216b(int i7) {
            return this.f10855b.f10848x.mo13038I(i7);
        }

        /* JADX INFO: renamed from: c */
        public int m13217c() {
            return this.f10855b.f10848x.m13407P();
        }

        /* JADX INFO: renamed from: d */
        public int m13218d(View view) {
            return this.f10855b.m13172f0(view);
        }

        /* JADX INFO: renamed from: e */
        public AbstractC2765p m13219e() {
            return this.f10856c;
        }

        /* JADX INFO: renamed from: f */
        public int m13220f() {
            return this.f10854a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m13221g() {
            return this.f10857d;
        }

        /* JADX INFO: renamed from: h */
        public boolean m13222h() {
            return this.f10858e;
        }

        /* JADX INFO: renamed from: i */
        protected void m13223i(PointF pointF) {
            float f7 = pointF.x;
            float f8 = pointF.y;
            float fSqrt = (float) Math.sqrt((f7 * f7) + (f8 * f8));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        /* JADX INFO: renamed from: j */
        void m13224j(int i7, int i8) {
            PointF pointFMo13215a;
            RecyclerView recyclerView = this.f10855b;
            if (this.f10854a == -1 || recyclerView == null) {
                m13232r();
            }
            if (this.f10857d && this.f10859f == null && this.f10856c != null && (pointFMo13215a = mo13215a(this.f10854a)) != null) {
                float f7 = pointFMo13215a.x;
                if (f7 != 0.0f || pointFMo13215a.y != 0.0f) {
                    recyclerView.m13179j1((int) Math.signum(f7), (int) Math.signum(pointFMo13215a.y), null);
                }
            }
            this.f10857d = false;
            View view = this.f10859f;
            if (view != null) {
                if (m13218d(view) == this.f10854a) {
                    mo13229o(this.f10859f, recyclerView.f10839s0, this.f10860g);
                    this.f10860g.m13236c(recyclerView);
                    m13232r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f10859f = null;
                }
            }
            if (this.f10858e) {
                mo13226l(i7, i8, recyclerView.f10839s0, this.f10860g);
                boolean zM13234a = this.f10860g.m13234a();
                this.f10860g.m13236c(recyclerView);
                if (zM13234a && this.f10858e) {
                    this.f10857d = true;
                    recyclerView.f10834p0.m13248d();
                }
            }
        }

        /* JADX INFO: renamed from: k */
        protected void m13225k(View view) {
            if (m13218d(view) == m13220f()) {
                this.f10859f = view;
            }
        }

        /* JADX INFO: renamed from: l */
        protected abstract void mo13226l(int i7, int i8, C2746B c2746b, a aVar);

        /* JADX INFO: renamed from: m */
        protected abstract void mo13227m();

        /* JADX INFO: renamed from: n */
        protected abstract void mo13228n();

        /* JADX INFO: renamed from: o */
        protected abstract void mo13229o(View view, C2746B c2746b, a aVar);

        /* JADX INFO: renamed from: p */
        public void m13230p(int i7) {
            this.f10854a = i7;
        }

        /* JADX INFO: renamed from: q */
        void m13231q(RecyclerView recyclerView, AbstractC2765p abstractC2765p) {
            recyclerView.f10834p0.m13250f();
            if (this.f10861h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f10855b = recyclerView;
            this.f10856c = abstractC2765p;
            int i7 = this.f10854a;
            if (i7 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f10839s0.f10869a = i7;
            this.f10858e = true;
            this.f10857d = true;
            this.f10859f = m13216b(m13220f());
            mo13227m();
            this.f10855b.f10834p0.m13248d();
            this.f10861h = true;
        }

        /* JADX INFO: renamed from: r */
        protected final void m13232r() {
            if (this.f10858e) {
                this.f10858e = false;
                mo13228n();
                this.f10855b.f10839s0.f10869a = -1;
                this.f10859f = null;
                this.f10854a = -1;
                this.f10857d = false;
                this.f10856c.m13442k1(this);
                this.f10856c = null;
                this.f10855b = null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$B */
    public static class C2746B {

        /* JADX INFO: renamed from: b */
        private SparseArray f10870b;

        /* JADX INFO: renamed from: m */
        int f10881m;

        /* JADX INFO: renamed from: n */
        long f10882n;

        /* JADX INFO: renamed from: o */
        int f10883o;

        /* JADX INFO: renamed from: p */
        int f10884p;

        /* JADX INFO: renamed from: q */
        int f10885q;

        /* JADX INFO: renamed from: a */
        int f10869a = -1;

        /* JADX INFO: renamed from: c */
        int f10871c = 0;

        /* JADX INFO: renamed from: d */
        int f10872d = 0;

        /* JADX INFO: renamed from: e */
        int f10873e = 1;

        /* JADX INFO: renamed from: f */
        int f10874f = 0;

        /* JADX INFO: renamed from: g */
        boolean f10875g = false;

        /* JADX INFO: renamed from: h */
        boolean f10876h = false;

        /* JADX INFO: renamed from: i */
        boolean f10877i = false;

        /* JADX INFO: renamed from: j */
        boolean f10878j = false;

        /* JADX INFO: renamed from: k */
        boolean f10879k = false;

        /* JADX INFO: renamed from: l */
        boolean f10880l = false;

        /* JADX INFO: renamed from: a */
        void m13238a(int i7) {
            if ((this.f10873e & i7) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.f10873e));
        }

        /* JADX INFO: renamed from: b */
        public int m13239b() {
            return this.f10876h ? this.f10871c - this.f10872d : this.f10874f;
        }

        /* JADX INFO: renamed from: c */
        public int m13240c() {
            return this.f10869a;
        }

        /* JADX INFO: renamed from: d */
        public boolean m13241d() {
            return this.f10869a != -1;
        }

        /* JADX INFO: renamed from: e */
        public boolean m13242e() {
            return this.f10876h;
        }

        /* JADX INFO: renamed from: f */
        void m13243f(AbstractC2757h abstractC2757h) {
            this.f10873e = 1;
            this.f10874f = abstractC2757h.mo8548g();
            this.f10876h = false;
            this.f10877i = false;
            this.f10878j = false;
        }

        /* JADX INFO: renamed from: g */
        public boolean m13244g() {
            return this.f10880l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f10869a + ", mData=" + this.f10870b + ", mItemCount=" + this.f10874f + ", mIsMeasuring=" + this.f10878j + ", mPreviousLayoutItemCount=" + this.f10871c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f10872d + ", mStructureChanged=" + this.f10875g + ", mInPreLayout=" + this.f10876h + ", mRunSimpleAnimations=" + this.f10879k + ", mRunPredictiveAnimations=" + this.f10880l + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$C */
    public static abstract class AbstractC2747C {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$D */
    class RunnableC2748D implements Runnable {

        /* JADX INFO: renamed from: a */
        private int f10886a;

        /* JADX INFO: renamed from: b */
        private int f10887b;

        /* JADX INFO: renamed from: c */
        OverScroller f10888c;

        /* JADX INFO: renamed from: d */
        Interpolator f10889d;

        /* JADX INFO: renamed from: e */
        private boolean f10890e;

        /* JADX INFO: renamed from: f */
        private boolean f10891f;

        RunnableC2748D() {
            Interpolator interpolator = RecyclerView.f10777U0;
            this.f10889d = interpolator;
            this.f10890e = false;
            this.f10891f = false;
            this.f10888c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* JADX INFO: renamed from: a */
        private int m13245a(int i7, int i8) {
            int iAbs = Math.abs(i7);
            int iAbs2 = Math.abs(i8);
            boolean z7 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z7 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z7) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        /* JADX INFO: renamed from: c */
        private void m13246c() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC1030Z.m4458b0(RecyclerView.this, this);
        }

        /* JADX INFO: renamed from: b */
        public void m13247b(int i7, int i8) {
            RecyclerView.this.setScrollState(2);
            this.f10887b = 0;
            this.f10886a = 0;
            Interpolator interpolator = this.f10889d;
            Interpolator interpolator2 = RecyclerView.f10777U0;
            if (interpolator != interpolator2) {
                this.f10889d = interpolator2;
                this.f10888c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f10888c.fling(0, 0, i7, i8, Integer.MIN_VALUE, C3553a.e.API_PRIORITY_OTHER, Integer.MIN_VALUE, C3553a.e.API_PRIORITY_OTHER);
            m13248d();
        }

        /* JADX INFO: renamed from: d */
        void m13248d() {
            if (this.f10890e) {
                this.f10891f = true;
            } else {
                m13246c();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m13249e(int i7, int i8, int i9, Interpolator interpolator) {
            if (i9 == Integer.MIN_VALUE) {
                i9 = m13245a(i7, i8);
            }
            int i10 = i9;
            if (interpolator == null) {
                interpolator = RecyclerView.f10777U0;
            }
            if (this.f10889d != interpolator) {
                this.f10889d = interpolator;
                this.f10888c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f10887b = 0;
            this.f10886a = 0;
            RecyclerView.this.setScrollState(2);
            this.f10888c.startScroll(0, 0, i7, i8, i10);
            m13248d();
        }

        /* JADX INFO: renamed from: f */
        public void m13250f() {
            RecyclerView.this.removeCallbacks(this);
            this.f10888c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i7;
            int i8;
            int i9;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10848x == null) {
                m13250f();
                return;
            }
            this.f10891f = false;
            this.f10890e = true;
            recyclerView.m13204v();
            OverScroller overScroller = this.f10888c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i10 = currX - this.f10886a;
                int i11 = currY - this.f10887b;
                this.f10886a = currX;
                this.f10887b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f10789F0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m13134G(i10, i11, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f10789F0;
                    i10 -= iArr2[0];
                    i11 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m13201u(i10, i11);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f10846w != null) {
                    int[] iArr3 = recyclerView3.f10789F0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m13179j1(i10, i11, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f10789F0;
                    int i12 = iArr4[0];
                    int i13 = iArr4[1];
                    i10 -= i12;
                    i11 -= i13;
                    AbstractC2745A abstractC2745A = recyclerView4.f10848x.f10943g;
                    if (abstractC2745A != null && !abstractC2745A.m13221g() && abstractC2745A.m13222h()) {
                        int iM13239b = RecyclerView.this.f10839s0.m13239b();
                        if (iM13239b == 0) {
                            abstractC2745A.m13232r();
                        } else if (abstractC2745A.m13220f() >= iM13239b) {
                            abstractC2745A.m13230p(iM13239b - 1);
                            abstractC2745A.m13224j(i12, i13);
                        } else {
                            abstractC2745A.m13224j(i12, i13);
                        }
                    }
                    i8 = i13;
                    i7 = i12;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                int i14 = i10;
                int i15 = i11;
                if (!RecyclerView.this.f10852z.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f10789F0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m13136H(i7, i8, i14, i15, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f10789F0;
                int i16 = i14 - iArr6[0];
                int i17 = i15 - iArr6[1];
                if (i7 != 0 || i8 != 0) {
                    recyclerView6.m13140J(i7, i8);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z7 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i16 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i17 != 0));
                AbstractC2745A abstractC2745A2 = RecyclerView.this.f10848x.f10943g;
                if ((abstractC2745A2 == null || !abstractC2745A2.m13221g()) && z7) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i16 < 0) {
                            i9 = -currVelocity;
                        } else {
                            i9 = i16 > 0 ? currVelocity : 0;
                        }
                        if (i17 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i17 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.m13163a(i9, currVelocity);
                    }
                    if (RecyclerView.f10773Q0) {
                        RecyclerView.this.f10837r0.m13751b();
                    }
                } else {
                    m13248d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC2786e runnableC2786e = recyclerView7.f10835q0;
                    if (runnableC2786e != null) {
                        runnableC2786e.m13747f(recyclerView7, i7, i8);
                    }
                }
            }
            AbstractC2745A abstractC2745A3 = RecyclerView.this.f10848x.f10943g;
            if (abstractC2745A3 != null && abstractC2745A3.m13221g()) {
                abstractC2745A3.m13224j(0, 0);
            }
            this.f10890e = false;
            if (this.f10891f) {
                m13246c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.m13207w1(1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$E */
    public static abstract class AbstractC2749E {

        /* JADX INFO: renamed from: t */
        private static final List f10893t = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: a */
        public final View f10894a;

        /* JADX INFO: renamed from: b */
        WeakReference f10895b;

        /* JADX INFO: renamed from: j */
        int f10903j;

        /* JADX INFO: renamed from: r */
        RecyclerView f10911r;

        /* JADX INFO: renamed from: s */
        AbstractC2757h f10912s;

        /* JADX INFO: renamed from: c */
        int f10896c = -1;

        /* JADX INFO: renamed from: d */
        int f10897d = -1;

        /* JADX INFO: renamed from: e */
        long f10898e = -1;

        /* JADX INFO: renamed from: f */
        int f10899f = -1;

        /* JADX INFO: renamed from: g */
        int f10900g = -1;

        /* JADX INFO: renamed from: h */
        AbstractC2749E f10901h = null;

        /* JADX INFO: renamed from: i */
        AbstractC2749E f10902i = null;

        /* JADX INFO: renamed from: k */
        List f10904k = null;

        /* JADX INFO: renamed from: l */
        List f10905l = null;

        /* JADX INFO: renamed from: m */
        private int f10906m = 0;

        /* JADX INFO: renamed from: n */
        C2772w f10907n = null;

        /* JADX INFO: renamed from: o */
        boolean f10908o = false;

        /* JADX INFO: renamed from: p */
        private int f10909p = 0;

        /* JADX INFO: renamed from: q */
        int f10910q = -1;

        public AbstractC2749E(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f10894a = view;
        }

        /* JADX INFO: renamed from: i */
        private void m13251i() {
            if (this.f10904k == null) {
                ArrayList arrayList = new ArrayList();
                this.f10904k = arrayList;
                this.f10905l = Collections.unmodifiableList(arrayList);
            }
        }

        /* JADX INFO: renamed from: A */
        boolean m13252A() {
            return this.f10907n != null;
        }

        /* JADX INFO: renamed from: B */
        boolean m13253B() {
            return (this.f10903j & 256) != 0;
        }

        /* JADX INFO: renamed from: C */
        boolean m13254C() {
            return (this.f10903j & 2) != 0;
        }

        /* JADX INFO: renamed from: D */
        boolean m13255D() {
            return (this.f10903j & 2) != 0;
        }

        /* JADX INFO: renamed from: E */
        void m13256E(int i7, boolean z7) {
            if (this.f10897d == -1) {
                this.f10897d = this.f10896c;
            }
            if (this.f10900g == -1) {
                this.f10900g = this.f10896c;
            }
            if (z7) {
                this.f10900g += i7;
            }
            this.f10896c += i7;
            if (this.f10894a.getLayoutParams() != null) {
                ((C2766q) this.f10894a.getLayoutParams()).f10963c = true;
            }
        }

        /* JADX INFO: renamed from: F */
        void m13257F(RecyclerView recyclerView) {
            int i7 = this.f10910q;
            if (i7 != -1) {
                this.f10909p = i7;
            } else {
                this.f10909p = AbstractC1030Z.m4501x(this.f10894a);
            }
            recyclerView.m13185m1(this, 4);
        }

        /* JADX INFO: renamed from: G */
        void m13258G(RecyclerView recyclerView) {
            recyclerView.m13185m1(this, this.f10909p);
            this.f10909p = 0;
        }

        /* JADX INFO: renamed from: H */
        void m13259H() {
            this.f10903j = 0;
            this.f10896c = -1;
            this.f10897d = -1;
            this.f10898e = -1L;
            this.f10900g = -1;
            this.f10906m = 0;
            this.f10901h = null;
            this.f10902i = null;
            m13271f();
            this.f10909p = 0;
            this.f10910q = -1;
            RecyclerView.m13122s(this);
        }

        /* JADX INFO: renamed from: I */
        void m13260I() {
            if (this.f10897d == -1) {
                this.f10897d = this.f10896c;
            }
        }

        /* JADX INFO: renamed from: J */
        void m13261J(int i7, int i8) {
            this.f10903j = (i7 & i8) | (this.f10903j & (~i8));
        }

        /* JADX INFO: renamed from: K */
        public final void m13262K(boolean z7) {
            int i7 = this.f10906m;
            int i8 = z7 ? i7 - 1 : i7 + 1;
            this.f10906m = i8;
            if (i8 < 0) {
                this.f10906m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z7 && i8 == 1) {
                this.f10903j |= 16;
            } else if (z7 && i8 == 0) {
                this.f10903j &= -17;
            }
        }

        /* JADX INFO: renamed from: L */
        void m13263L(C2772w c2772w, boolean z7) {
            this.f10907n = c2772w;
            this.f10908o = z7;
        }

        /* JADX INFO: renamed from: M */
        boolean m13264M() {
            return (this.f10903j & 16) != 0;
        }

        /* JADX INFO: renamed from: N */
        boolean m13265N() {
            return (this.f10903j & 128) != 0;
        }

        /* JADX INFO: renamed from: O */
        void m13266O() {
            this.f10907n.m13514J(this);
        }

        /* JADX INFO: renamed from: P */
        boolean m13267P() {
            return (this.f10903j & 32) != 0;
        }

        /* JADX INFO: renamed from: c */
        void m13268c(Object obj) {
            if (obj == null) {
                m13269d(1024);
            } else if ((1024 & this.f10903j) == 0) {
                m13251i();
                this.f10904k.add(obj);
            }
        }

        /* JADX INFO: renamed from: d */
        void m13269d(int i7) {
            this.f10903j = i7 | this.f10903j;
        }

        /* JADX INFO: renamed from: e */
        void m13270e() {
            this.f10897d = -1;
            this.f10900g = -1;
        }

        /* JADX INFO: renamed from: f */
        void m13271f() {
            List list = this.f10904k;
            if (list != null) {
                list.clear();
            }
            this.f10903j &= -1025;
        }

        /* JADX INFO: renamed from: g */
        void m13272g() {
            this.f10903j &= -33;
        }

        /* JADX INFO: renamed from: h */
        void m13273h() {
            this.f10903j &= -257;
        }

        /* JADX INFO: renamed from: j */
        boolean m13274j() {
            return (this.f10903j & 16) == 0 && AbstractC1030Z.m4441M(this.f10894a);
        }

        /* JADX INFO: renamed from: k */
        void m13275k(int i7, int i8, boolean z7) {
            m13269d(8);
            m13256E(i8, z7);
            this.f10896c = i7;
        }

        /* JADX INFO: renamed from: l */
        public final int m13276l() {
            RecyclerView recyclerView = this.f10911r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m13170d0(this);
        }

        /* JADX INFO: renamed from: m */
        public final int m13277m() {
            return m13278n();
        }

        /* JADX INFO: renamed from: n */
        public final int m13278n() {
            RecyclerView recyclerView;
            AbstractC2757h adapter;
            int iM13170d0;
            if (this.f10912s == null || (recyclerView = this.f10911r) == null || (adapter = recyclerView.getAdapter()) == null || (iM13170d0 = this.f10911r.m13170d0(this)) == -1) {
                return -1;
            }
            return adapter.m13319f(this.f10912s, this, iM13170d0);
        }

        /* JADX INFO: renamed from: o */
        public final long m13279o() {
            return this.f10898e;
        }

        /* JADX INFO: renamed from: p */
        public final int m13280p() {
            return this.f10899f;
        }

        /* JADX INFO: renamed from: q */
        public final int m13281q() {
            int i7 = this.f10900g;
            return i7 == -1 ? this.f10896c : i7;
        }

        /* JADX INFO: renamed from: r */
        public final int m13282r() {
            return this.f10897d;
        }

        /* JADX INFO: renamed from: s */
        List m13283s() {
            if ((this.f10903j & 1024) != 0) {
                return f10893t;
            }
            List list = this.f10904k;
            return (list == null || list.size() == 0) ? f10893t : this.f10905l;
        }

        /* JADX INFO: renamed from: t */
        boolean m13284t(int i7) {
            return (i7 & this.f10903j) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f10896c + " id=" + this.f10898e + ", oldPos=" + this.f10897d + ", pLpos:" + this.f10900g);
            if (m13252A()) {
                sb.append(" scrap ");
                sb.append(this.f10908o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m13288x()) {
                sb.append(" invalid");
            }
            if (!m13287w()) {
                sb.append(" unbound");
            }
            if (m13255D()) {
                sb.append(" update");
            }
            if (m13290z()) {
                sb.append(" removed");
            }
            if (m13265N()) {
                sb.append(" ignored");
            }
            if (m13253B()) {
                sb.append(" tmpDetached");
            }
            if (!m13289y()) {
                sb.append(" not recyclable(" + this.f10906m + ")");
            }
            if (m13285u()) {
                sb.append(" undefined adapter position");
            }
            if (this.f10894a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* JADX INFO: renamed from: u */
        boolean m13285u() {
            return (this.f10903j & 512) != 0 || m13288x();
        }

        /* JADX INFO: renamed from: v */
        boolean m13286v() {
            return (this.f10894a.getParent() == null || this.f10894a.getParent() == this.f10911r) ? false : true;
        }

        /* JADX INFO: renamed from: w */
        boolean m13287w() {
            return (this.f10903j & 1) != 0;
        }

        /* JADX INFO: renamed from: x */
        boolean m13288x() {
            return (this.f10903j & 4) != 0;
        }

        /* JADX INFO: renamed from: y */
        public final boolean m13289y() {
            return (this.f10903j & 16) == 0 && !AbstractC1030Z.m4441M(this.f10894a);
        }

        /* JADX INFO: renamed from: z */
        boolean m13290z() {
            return (this.f10903j & 8) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class RunnableC2750a implements Runnable {
        RunnableC2750a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f10788F || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f10782C) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f10794I) {
                recyclerView2.f10792H = true;
            } else {
                recyclerView2.m13204v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class RunnableC2751b implements Runnable {
        RunnableC2751b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2762m abstractC2762m = RecyclerView.this.f10814a0;
            if (abstractC2762m != null) {
                abstractC2762m.mo13358v();
            }
            RecyclerView.this.f10851y0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c */
    class InterpolatorC2752c implements Interpolator {
        InterpolatorC2752c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C2753d implements C2800s.b {
        C2753d() {
        }

        @Override // androidx.recyclerview.widget.C2800s.b
        /* JADX INFO: renamed from: a */
        public void mo13291a(AbstractC2749E abstractC2749E) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10848x.m13457r1(abstractC2749E.f10894a, recyclerView.f10815b);
        }

        @Override // androidx.recyclerview.widget.C2800s.b
        /* JADX INFO: renamed from: b */
        public void mo13292b(AbstractC2749E abstractC2749E, AbstractC2762m.c cVar, AbstractC2762m.c cVar2) {
            RecyclerView.this.m13184m(abstractC2749E, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C2800s.b
        /* JADX INFO: renamed from: c */
        public void mo13293c(AbstractC2749E abstractC2749E, AbstractC2762m.c cVar, AbstractC2762m.c cVar2) {
            RecyclerView.this.f10815b.m13514J(abstractC2749E);
            RecyclerView.this.m13188o(abstractC2749E, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C2800s.b
        /* JADX INFO: renamed from: d */
        public void mo13294d(AbstractC2749E abstractC2749E, AbstractC2762m.c cVar, AbstractC2762m.c cVar2) {
            abstractC2749E.m13262K(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10804O) {
                if (recyclerView.f10814a0.mo13339b(abstractC2749E, abstractC2749E, cVar, cVar2)) {
                    RecyclerView.this.m13149O0();
                }
            } else if (recyclerView.f10814a0.mo13341d(abstractC2749E, cVar, cVar2)) {
                RecyclerView.this.m13149O0();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C2754e implements C2783b.b {
        C2754e() {
        }

        @Override // androidx.recyclerview.widget.C2783b.b
        /* JADX INFO: renamed from: a */
        public View mo13295a(int i7) {
            return RecyclerView.this.getChildAt(i7);
        }

        @Override // androidx.recyclerview.widget.C2783b.b
        /* JADX INFO: renamed from: b */
        public void mo13296b(View view) {
            AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(view);
            if (abstractC2749EM13111h0 != null) {
                abstractC2749EM13111h0.m13257F(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C2783b.b
        /* JADX INFO: renamed from: c */
        public void mo13297c() {
            int iMo13300f = mo13300f();
            for (int i7 = 0; i7 < iMo13300f; i7++) {
                View viewMo13295a = mo13295a(i7);
                RecyclerView.this.m13127A(viewMo13295a);
                viewMo13295a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C2783b.b
        /* JADX INFO: renamed from: d */
        public int mo13298d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C2783b.b
        /* JADX INFO: renamed from: e */
        public AbstractC2749E mo13299e(View view) {
            return RecyclerView.m13111h0(view);
        }

        @Override // androidx.recyclerview.widget.C2783b.b
        /* JADX INFO: renamed from: f */
        public int mo13300f() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C2783b.b
        /* JADX INFO: renamed from: g */
        public void mo13301g(int i7) {
            AbstractC2749E abstractC2749EM13111h0;
            View viewMo13295a = mo13295a(i7);
            if (viewMo13295a != null && (abstractC2749EM13111h0 = RecyclerView.m13111h0(viewMo13295a)) != null) {
                if (abstractC2749EM13111h0.m13253B() && !abstractC2749EM13111h0.m13265N()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + abstractC2749EM13111h0 + RecyclerView.this.m13151Q());
                }
                abstractC2749EM13111h0.m13269d(256);
            }
            RecyclerView.this.detachViewFromParent(i7);
        }

        @Override // androidx.recyclerview.widget.C2783b.b
        /* JADX INFO: renamed from: h */
        public void mo13302h(View view) {
            AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(view);
            if (abstractC2749EM13111h0 != null) {
                abstractC2749EM13111h0.m13258G(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C2783b.b
        /* JADX INFO: renamed from: i */
        public void mo13303i(View view, int i7) {
            RecyclerView.this.addView(view, i7);
            RecyclerView.this.m13212z(view);
        }

        @Override // androidx.recyclerview.widget.C2783b.b
        /* JADX INFO: renamed from: j */
        public void mo13304j(int i7) {
            View childAt = RecyclerView.this.getChildAt(i7);
            if (childAt != null) {
                RecyclerView.this.m13127A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i7);
        }

        @Override // androidx.recyclerview.widget.C2783b.b
        /* JADX INFO: renamed from: k */
        public void mo13305k(View view, int i7, ViewGroup.LayoutParams layoutParams) {
            AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(view);
            if (abstractC2749EM13111h0 != null) {
                if (!abstractC2749EM13111h0.m13253B() && !abstractC2749EM13111h0.m13265N()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC2749EM13111h0 + RecyclerView.this.m13151Q());
                }
                abstractC2749EM13111h0.m13273h();
            }
            RecyclerView.this.attachViewToParent(view, i7, layoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C2755f implements C2782a.a {
        C2755f() {
        }

        @Override // androidx.recyclerview.widget.C2782a.a
        /* JADX INFO: renamed from: a */
        public void mo13306a(int i7, int i8) {
            RecyclerView.this.m13132E0(i7, i8);
            RecyclerView.this.f10845v0 = true;
        }

        @Override // androidx.recyclerview.widget.C2782a.a
        /* JADX INFO: renamed from: b */
        public void mo13307b(C2782a.b bVar) {
            m13314i(bVar);
        }

        @Override // androidx.recyclerview.widget.C2782a.a
        /* JADX INFO: renamed from: c */
        public void mo13308c(int i7, int i8, Object obj) {
            RecyclerView.this.m13214z1(i7, i8, obj);
            RecyclerView.this.f10847w0 = true;
        }

        @Override // androidx.recyclerview.widget.C2782a.a
        /* JADX INFO: renamed from: d */
        public void mo13309d(C2782a.b bVar) {
            m13314i(bVar);
        }

        @Override // androidx.recyclerview.widget.C2782a.a
        /* JADX INFO: renamed from: e */
        public AbstractC2749E mo13310e(int i7) {
            AbstractC2749E abstractC2749EM13166b0 = RecyclerView.this.m13166b0(i7, true);
            if (abstractC2749EM13166b0 == null || RecyclerView.this.f10821e.m13692n(abstractC2749EM13166b0.f10894a)) {
                return null;
            }
            return abstractC2749EM13166b0;
        }

        @Override // androidx.recyclerview.widget.C2782a.a
        /* JADX INFO: renamed from: f */
        public void mo13311f(int i7, int i8) {
            RecyclerView.this.m13133F0(i7, i8, false);
            RecyclerView.this.f10845v0 = true;
        }

        @Override // androidx.recyclerview.widget.C2782a.a
        /* JADX INFO: renamed from: g */
        public void mo13312g(int i7, int i8) {
            RecyclerView.this.m13131D0(i7, i8);
            RecyclerView.this.f10845v0 = true;
        }

        @Override // androidx.recyclerview.widget.C2782a.a
        /* JADX INFO: renamed from: h */
        public void mo13313h(int i7, int i8) {
            RecyclerView.this.m13133F0(i7, i8, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10845v0 = true;
            recyclerView.f10839s0.f10872d += i8;
        }

        /* JADX INFO: renamed from: i */
        void m13314i(C2782a.b bVar) {
            int i7 = bVar.f11045a;
            if (i7 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f10848x.mo12979W0(recyclerView, bVar.f11046b, bVar.f11048d);
                return;
            }
            if (i7 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f10848x.mo12983Z0(recyclerView2, bVar.f11046b, bVar.f11048d);
            } else if (i7 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f10848x.mo12985b1(recyclerView3, bVar.f11046b, bVar.f11048d, bVar.f11047c);
            } else {
                if (i7 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f10848x.mo12981Y0(recyclerView4, bVar.f11046b, bVar.f11048d, 1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$g */
    static /* synthetic */ class C2756g {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f10918a;

        static {
            int[] iArr = new int[AbstractC2757h.a.values().length];
            f10918a = iArr;
            try {
                iArr[AbstractC2757h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10918a[AbstractC2757h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class AbstractC2757h {

        /* JADX INFO: renamed from: a */
        private final C2758i f10919a = new C2758i();

        /* JADX INFO: renamed from: b */
        private boolean f10920b = false;

        /* JADX INFO: renamed from: c */
        private a f10921c = a.ALLOW;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX INFO: renamed from: A */
        public void m13315A(AbstractC2759j abstractC2759j) {
            this.f10919a.unregisterObserver(abstractC2759j);
        }

        /* JADX INFO: renamed from: c */
        public final void m13316c(AbstractC2749E abstractC2749E, int i7) {
            boolean z7 = abstractC2749E.f10912s == null;
            if (z7) {
                abstractC2749E.f10896c = i7;
                if (m13321k()) {
                    abstractC2749E.f10898e = mo3680h(i7);
                }
                abstractC2749E.m13261J(1, 519);
                AbstractC0723o.m3486a("RV OnBindView");
            }
            abstractC2749E.f10912s = this;
            m13326r(abstractC2749E, i7, abstractC2749E.m13283s());
            if (z7) {
                abstractC2749E.m13271f();
                ViewGroup.LayoutParams layoutParams = abstractC2749E.f10894a.getLayoutParams();
                if (layoutParams instanceof C2766q) {
                    ((C2766q) layoutParams).f10963c = true;
                }
                AbstractC0723o.m3487b();
            }
        }

        /* JADX INFO: renamed from: d */
        boolean m13317d() {
            int i7 = C2756g.f10918a[this.f10921c.ordinal()];
            return i7 != 1 && (i7 != 2 || mo8548g() > 0);
        }

        /* JADX INFO: renamed from: e */
        public final AbstractC2749E m13318e(ViewGroup viewGroup, int i7) {
            try {
                AbstractC0723o.m3486a("RV CreateView");
                AbstractC2749E abstractC2749EMo3683s = mo3683s(viewGroup, i7);
                if (abstractC2749EMo3683s.f10894a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                abstractC2749EMo3683s.f10899f = i7;
                AbstractC0723o.m3487b();
                return abstractC2749EMo3683s;
            } catch (Throwable th) {
                AbstractC0723o.m3487b();
                throw th;
            }
        }

        /* JADX INFO: renamed from: f */
        public int m13319f(AbstractC2757h abstractC2757h, AbstractC2749E abstractC2749E, int i7) {
            if (abstractC2757h == this) {
                return i7;
            }
            return -1;
        }

        /* JADX INFO: renamed from: g */
        public abstract int mo8548g();

        /* JADX INFO: renamed from: h */
        public long mo3680h(int i7) {
            return -1L;
        }

        /* JADX INFO: renamed from: i */
        public int mo8549i(int i7) {
            return 0;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m13320j() {
            return this.f10919a.m13330a();
        }

        /* JADX INFO: renamed from: k */
        public final boolean m13321k() {
            return this.f10920b;
        }

        /* JADX INFO: renamed from: l */
        public final void m13322l() {
            this.f10919a.m13331b();
        }

        /* JADX INFO: renamed from: m */
        public final void m13323m(int i7) {
            this.f10919a.m13333d(i7, 1);
        }

        /* JADX INFO: renamed from: n */
        public final void m13324n(int i7, int i8) {
            this.f10919a.m13332c(i7, i8);
        }

        /* JADX INFO: renamed from: o */
        public final void m13325o(int i7, int i8) {
            this.f10919a.m13333d(i7, i8);
        }

        /* JADX INFO: renamed from: p */
        public void mo3681p(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: q */
        public abstract void mo3682q(AbstractC2749E abstractC2749E, int i7);

        /* JADX INFO: renamed from: r */
        public void m13326r(AbstractC2749E abstractC2749E, int i7, List list) {
            mo3682q(abstractC2749E, i7);
        }

        /* JADX INFO: renamed from: s */
        public abstract AbstractC2749E mo3683s(ViewGroup viewGroup, int i7);

        /* JADX INFO: renamed from: t */
        public void mo3684t(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: u */
        public boolean mo3685u(AbstractC2749E abstractC2749E) {
            return false;
        }

        /* JADX INFO: renamed from: v */
        public void mo3686v(AbstractC2749E abstractC2749E) {
        }

        /* JADX INFO: renamed from: w */
        public void m13327w(AbstractC2749E abstractC2749E) {
        }

        /* JADX INFO: renamed from: x */
        public void mo3687x(AbstractC2749E abstractC2749E) {
        }

        /* JADX INFO: renamed from: y */
        public void m13328y(AbstractC2759j abstractC2759j) {
            this.f10919a.registerObserver(abstractC2759j);
        }

        /* JADX INFO: renamed from: z */
        public void m13329z(boolean z7) {
            if (m13320j()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f10920b = z7;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$i */
    static class C2758i extends Observable {
        C2758i() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m13330a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* JADX INFO: renamed from: b */
        public void m13331b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC2759j) ((Observable) this).mObservers.get(size)).mo3689a();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m13332c(int i7, int i8) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC2759j) ((Observable) this).mObservers.get(size)).mo3691c(i7, i8, 1);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m13333d(int i7, int i8) {
            m13334e(i7, i8, null);
        }

        /* JADX INFO: renamed from: e */
        public void m13334e(int i7, int i8, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC2759j) ((Observable) this).mObservers.get(size)).mo3690b(i7, i8, obj);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class AbstractC2759j {
        /* JADX INFO: renamed from: a */
        public abstract void mo3689a();

        /* JADX INFO: renamed from: b */
        public abstract void mo3690b(int i7, int i8, Object obj);

        /* JADX INFO: renamed from: c */
        public abstract void mo3691c(int i7, int i8, int i9);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public interface InterfaceC2760k {
        /* JADX INFO: renamed from: a */
        int m13335a(int i7, int i8);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static class C2761l {
        /* JADX INFO: renamed from: a */
        protected EdgeEffect m13336a(RecyclerView recyclerView, int i7) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class AbstractC2762m {

        /* JADX INFO: renamed from: a */
        private b f10926a = null;

        /* JADX INFO: renamed from: b */
        private ArrayList f10927b = new ArrayList();

        /* JADX INFO: renamed from: c */
        private long f10928c = 120;

        /* JADX INFO: renamed from: d */
        private long f10929d = 120;

        /* JADX INFO: renamed from: e */
        private long f10930e = 250;

        /* JADX INFO: renamed from: f */
        private long f10931f = 250;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void m13360a();
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        interface b {
            /* JADX INFO: renamed from: a */
            void mo13361a(AbstractC2749E abstractC2749E);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            public int f10932a;

            /* JADX INFO: renamed from: b */
            public int f10933b;

            /* JADX INFO: renamed from: c */
            public int f10934c;

            /* JADX INFO: renamed from: d */
            public int f10935d;

            /* JADX INFO: renamed from: a */
            public c m13362a(AbstractC2749E abstractC2749E) {
                return m13363b(abstractC2749E, 0);
            }

            /* JADX INFO: renamed from: b */
            public c m13363b(AbstractC2749E abstractC2749E, int i7) {
                View view = abstractC2749E.f10894a;
                this.f10932a = view.getLeft();
                this.f10933b = view.getTop();
                this.f10934c = view.getRight();
                this.f10935d = view.getBottom();
                return this;
            }
        }

        /* JADX INFO: renamed from: e */
        static int m13337e(AbstractC2749E abstractC2749E) {
            int i7 = abstractC2749E.f10903j;
            int i8 = i7 & 14;
            if (abstractC2749E.m13288x()) {
                return 4;
            }
            if ((i7 & 4) == 0) {
                int iM13282r = abstractC2749E.m13282r();
                int iM13276l = abstractC2749E.m13276l();
                if (iM13282r != -1 && iM13276l != -1 && iM13282r != iM13276l) {
                    return i8 | 2048;
                }
            }
            return i8;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo13338a(AbstractC2749E abstractC2749E, c cVar, c cVar2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo13339b(AbstractC2749E abstractC2749E, AbstractC2749E abstractC2749E2, c cVar, c cVar2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo13340c(AbstractC2749E abstractC2749E, c cVar, c cVar2);

        /* JADX INFO: renamed from: d */
        public abstract boolean mo13341d(AbstractC2749E abstractC2749E, c cVar, c cVar2);

        /* JADX INFO: renamed from: f */
        public abstract boolean mo13342f(AbstractC2749E abstractC2749E);

        /* JADX INFO: renamed from: g */
        public boolean mo13343g(AbstractC2749E abstractC2749E, List list) {
            return mo13342f(abstractC2749E);
        }

        /* JADX INFO: renamed from: h */
        public final void m13344h(AbstractC2749E abstractC2749E) {
            m13355s(abstractC2749E);
            b bVar = this.f10926a;
            if (bVar != null) {
                bVar.mo13361a(abstractC2749E);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m13345i() {
            if (this.f10927b.size() <= 0) {
                this.f10927b.clear();
            } else {
                AbstractC2263x.m9328a(this.f10927b.get(0));
                throw null;
            }
        }

        /* JADX INFO: renamed from: j */
        public abstract void mo13346j(AbstractC2749E abstractC2749E);

        /* JADX INFO: renamed from: k */
        public abstract void mo13347k();

        /* JADX INFO: renamed from: l */
        public long m13348l() {
            return this.f10928c;
        }

        /* JADX INFO: renamed from: m */
        public long m13349m() {
            return this.f10931f;
        }

        /* JADX INFO: renamed from: n */
        public long m13350n() {
            return this.f10930e;
        }

        /* JADX INFO: renamed from: o */
        public long m13351o() {
            return this.f10929d;
        }

        /* JADX INFO: renamed from: p */
        public abstract boolean mo13352p();

        /* JADX INFO: renamed from: q */
        public final boolean m13353q(a aVar) {
            boolean zMo13352p = mo13352p();
            if (aVar != null) {
                if (!zMo13352p) {
                    aVar.m13360a();
                    return zMo13352p;
                }
                this.f10927b.add(aVar);
            }
            return zMo13352p;
        }

        /* JADX INFO: renamed from: r */
        public c m13354r() {
            return new c();
        }

        /* JADX INFO: renamed from: s */
        public void m13355s(AbstractC2749E abstractC2749E) {
        }

        /* JADX INFO: renamed from: t */
        public c m13356t(C2746B c2746b, AbstractC2749E abstractC2749E) {
            return m13354r().m13362a(abstractC2749E);
        }

        /* JADX INFO: renamed from: u */
        public c m13357u(C2746B c2746b, AbstractC2749E abstractC2749E, int i7, List list) {
            return m13354r().m13362a(abstractC2749E);
        }

        /* JADX INFO: renamed from: v */
        public abstract void mo13358v();

        /* JADX INFO: renamed from: w */
        void m13359w(b bVar) {
            this.f10926a = bVar;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n */
    private class C2763n implements AbstractC2762m.b {
        C2763n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2762m.b
        /* JADX INFO: renamed from: a */
        public void mo13361a(AbstractC2749E abstractC2749E) {
            abstractC2749E.m13262K(true);
            if (abstractC2749E.f10901h != null && abstractC2749E.f10902i == null) {
                abstractC2749E.f10901h = null;
            }
            abstractC2749E.f10902i = null;
            if (abstractC2749E.m13264M() || RecyclerView.this.m13159X0(abstractC2749E.f10894a) || !abstractC2749E.m13253B()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC2749E.f10894a, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class AbstractC2764o {
        /* JADX INFO: renamed from: f */
        public void m13364f(Rect rect, int i7, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* JADX INFO: renamed from: g */
        public void mo13365g(Rect rect, View view, RecyclerView recyclerView, C2746B c2746b) {
            m13364f(rect, ((C2766q) view.getLayoutParams()).m13478a(), recyclerView);
        }

        /* JADX INFO: renamed from: h */
        public void m13366h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: i */
        public void mo13367i(Canvas canvas, RecyclerView recyclerView, C2746B c2746b) {
            m13366h(canvas, recyclerView);
        }

        /* JADX INFO: renamed from: j */
        public void m13368j(Canvas canvas, RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: k */
        public void mo13369k(Canvas canvas, RecyclerView recyclerView, C2746B c2746b) {
            m13368j(canvas, recyclerView);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class AbstractC2765p {

        /* JADX INFO: renamed from: a */
        C2783b f10937a;

        /* JADX INFO: renamed from: b */
        RecyclerView f10938b;

        /* JADX INFO: renamed from: c */
        private final C2799r.b f10939c;

        /* JADX INFO: renamed from: d */
        private final C2799r.b f10940d;

        /* JADX INFO: renamed from: e */
        C2799r f10941e;

        /* JADX INFO: renamed from: f */
        C2799r f10942f;

        /* JADX INFO: renamed from: g */
        AbstractC2745A f10943g;

        /* JADX INFO: renamed from: h */
        boolean f10944h;

        /* JADX INFO: renamed from: i */
        boolean f10945i;

        /* JADX INFO: renamed from: j */
        boolean f10946j;

        /* JADX INFO: renamed from: k */
        private boolean f10947k;

        /* JADX INFO: renamed from: l */
        private boolean f10948l;

        /* JADX INFO: renamed from: m */
        int f10949m;

        /* JADX INFO: renamed from: n */
        boolean f10950n;

        /* JADX INFO: renamed from: o */
        private int f10951o;

        /* JADX INFO: renamed from: p */
        private int f10952p;

        /* JADX INFO: renamed from: q */
        private int f10953q;

        /* JADX INFO: renamed from: r */
        private int f10954r;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        class a implements C2799r.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.C2799r.b
            /* JADX INFO: renamed from: a */
            public View mo13472a(int i7) {
                return AbstractC2765p.this.m13405O(i7);
            }

            @Override // androidx.recyclerview.widget.C2799r.b
            /* JADX INFO: renamed from: b */
            public int mo13473b(View view) {
                return AbstractC2765p.this.m13417W(view) - ((ViewGroup.MarginLayoutParams) ((C2766q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C2799r.b
            /* JADX INFO: renamed from: c */
            public int mo13474c() {
                return AbstractC2765p.this.m13438j0();
            }

            @Override // androidx.recyclerview.widget.C2799r.b
            /* JADX INFO: renamed from: d */
            public int mo13475d() {
                return AbstractC2765p.this.m13460t0() - AbstractC2765p.this.m13441k0();
            }

            @Override // androidx.recyclerview.widget.C2799r.b
            /* JADX INFO: renamed from: e */
            public int mo13476e(View view) {
                return AbstractC2765p.this.m13420Z(view) + ((ViewGroup.MarginLayoutParams) ((C2766q) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        class b implements C2799r.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.C2799r.b
            /* JADX INFO: renamed from: a */
            public View mo13472a(int i7) {
                return AbstractC2765p.this.m13405O(i7);
            }

            @Override // androidx.recyclerview.widget.C2799r.b
            /* JADX INFO: renamed from: b */
            public int mo13473b(View view) {
                return AbstractC2765p.this.m13421a0(view) - ((ViewGroup.MarginLayoutParams) ((C2766q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C2799r.b
            /* JADX INFO: renamed from: c */
            public int mo13474c() {
                return AbstractC2765p.this.m13443l0();
            }

            @Override // androidx.recyclerview.widget.C2799r.b
            /* JADX INFO: renamed from: d */
            public int mo13475d() {
                return AbstractC2765p.this.m13424c0() - AbstractC2765p.this.m13436i0();
            }

            @Override // androidx.recyclerview.widget.C2799r.b
            /* JADX INFO: renamed from: e */
            public int mo13476e(View view) {
                return AbstractC2765p.this.m13414U(view) + ((ViewGroup.MarginLayoutParams) ((C2766q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        public interface c {
            /* JADX INFO: renamed from: a */
            void mo13477a(int i7, int i8);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        public static class d {

            /* JADX INFO: renamed from: a */
            public int f10957a;

            /* JADX INFO: renamed from: b */
            public int f10958b;

            /* JADX INFO: renamed from: c */
            public boolean f10959c;

            /* JADX INFO: renamed from: d */
            public boolean f10960d;
        }

        public AbstractC2765p() {
            a aVar = new a();
            this.f10939c = aVar;
            b bVar = new b();
            this.f10940d = bVar;
            this.f10941e = new C2799r(aVar);
            this.f10942f = new C2799r(bVar);
            this.f10944h = false;
            this.f10945i = false;
            this.f10946j = false;
            this.f10947k = true;
            this.f10948l = true;
        }

        /* JADX INFO: renamed from: A1 */
        private void m13370A1(C2772w c2772w, int i7, View view) {
            AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(view);
            if (abstractC2749EM13111h0.m13265N()) {
                return;
            }
            if (abstractC2749EM13111h0.m13288x() && !abstractC2749EM13111h0.m13290z() && !this.f10938b.f10846w.m13321k()) {
                m13465v1(i7);
                c2772w.m13508C(abstractC2749EM13111h0);
            } else {
                m13382D(i7);
                c2772w.m13509D(view);
                this.f10938b.f10823f.m13917k(abstractC2749EM13111h0);
            }
        }

        /* JADX INFO: renamed from: B0 */
        private static boolean m13371B0(int i7, int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            if (i9 > 0 && i7 != i9) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i7;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i7;
            }
            return true;
        }

        /* JADX INFO: renamed from: E */
        private void m13372E(int i7, View view) {
            this.f10937a.m13684d(i7);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        /* JADX INFO: renamed from: Q */
        public static int m13373Q(int i7, int i8, int i9, int i10, boolean z7) {
            int iMax = Math.max(0, i7 - i9);
            if (z7) {
                if (i10 >= 0) {
                    i8 = 1073741824;
                } else if (i10 != -1 || (i8 != Integer.MIN_VALUE && (i8 == 0 || i8 != 1073741824))) {
                    i8 = 0;
                    i10 = 0;
                } else {
                    i10 = iMax;
                }
            } else if (i10 >= 0) {
                i8 = 1073741824;
            } else if (i10 == -1) {
                i10 = iMax;
            } else if (i10 != -2) {
                i8 = 0;
                i10 = 0;
            } else if (i8 == Integer.MIN_VALUE || i8 == 1073741824) {
                i10 = iMax;
                i8 = Integer.MIN_VALUE;
            } else {
                i10 = iMax;
                i8 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i10, i8);
        }

        /* JADX INFO: renamed from: R */
        private int[] m13374R(View view, Rect rect) {
            int iM13438j0 = m13438j0();
            int iM13443l0 = m13443l0();
            int iM13460t0 = m13460t0() - m13441k0();
            int iM13424c0 = m13424c0() - m13436i0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i7 = left - iM13438j0;
            int iMin = Math.min(0, i7);
            int i8 = top - iM13443l0;
            int iMin2 = Math.min(0, i8);
            int i9 = iWidth - iM13460t0;
            int iMax = Math.max(0, i9);
            int iMax2 = Math.max(0, iHeight - iM13424c0);
            if (m13426e0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i7, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i9);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i8, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        /* JADX INFO: renamed from: l */
        private void m13375l(View view, int i7, boolean z7) {
            AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(view);
            if (z7 || abstractC2749EM13111h0.m13290z()) {
                this.f10938b.f10823f.m13908b(abstractC2749EM13111h0);
            } else {
                this.f10938b.f10823f.m13921p(abstractC2749EM13111h0);
            }
            C2766q c2766q = (C2766q) view.getLayoutParams();
            if (abstractC2749EM13111h0.m13267P() || abstractC2749EM13111h0.m13252A()) {
                if (abstractC2749EM13111h0.m13252A()) {
                    abstractC2749EM13111h0.m13266O();
                } else {
                    abstractC2749EM13111h0.m13272g();
                }
                this.f10937a.m13683c(view, i7, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f10938b) {
                int iM13691m = this.f10937a.m13691m(view);
                if (i7 == -1) {
                    i7 = this.f10937a.m13687g();
                }
                if (iM13691m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f10938b.indexOfChild(view) + this.f10938b.m13151Q());
                }
                if (iM13691m != i7) {
                    this.f10938b.f10848x.m13390G0(iM13691m, i7);
                }
            } else {
                this.f10937a.m13681a(view, i7, false);
                c2766q.f10963c = true;
                AbstractC2745A abstractC2745A = this.f10943g;
                if (abstractC2745A != null && abstractC2745A.m13222h()) {
                    this.f10943g.m13225k(view);
                }
            }
            if (c2766q.f10964d) {
                abstractC2749EM13111h0.f10894a.invalidate();
                c2766q.f10964d = false;
            }
        }

        /* JADX INFO: renamed from: n0 */
        public static d m13376n0(Context context, AttributeSet attributeSet, int i7, int i8) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7382d.f29594f, i7, i8);
            dVar.f10957a = typedArrayObtainStyledAttributes.getInt(AbstractC7382d.f29595g, 1);
            dVar.f10958b = typedArrayObtainStyledAttributes.getInt(AbstractC7382d.f29605q, 1);
            dVar.f10959c = typedArrayObtainStyledAttributes.getBoolean(AbstractC7382d.f29604p, false);
            dVar.f10960d = typedArrayObtainStyledAttributes.getBoolean(AbstractC7382d.f29606r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        /* JADX INFO: renamed from: t */
        public static int m13377t(int i7, int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i8, i9) : size;
            }
            return Math.min(size, Math.max(i8, i9));
        }

        /* JADX INFO: renamed from: y0 */
        private boolean m13378y0(RecyclerView recyclerView, int i7, int i8) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iM13438j0 = m13438j0();
            int iM13443l0 = m13443l0();
            int iM13460t0 = m13460t0() - m13441k0();
            int iM13424c0 = m13424c0() - m13436i0();
            Rect rect = this.f10938b.f10840t;
            mo13415V(focusedChild, rect);
            return rect.left - i7 < iM13460t0 && rect.right - i7 > iM13438j0 && rect.top - i8 < iM13424c0 && rect.bottom - i8 > iM13443l0;
        }

        /* JADX INFO: renamed from: A */
        public abstract int mo12965A(C2746B c2746b);

        /* JADX INFO: renamed from: A0 */
        public boolean m13379A0(C2772w c2772w, C2746B c2746b) {
            return false;
        }

        /* JADX INFO: renamed from: B */
        public abstract int mo12966B(C2746B c2746b);

        /* JADX INFO: renamed from: B1 */
        public abstract int mo12967B1(int i7, C2772w c2772w, C2746B c2746b);

        /* JADX INFO: renamed from: C */
        public void m13380C(C2772w c2772w) {
            for (int iM13407P = m13407P() - 1; iM13407P >= 0; iM13407P--) {
                m13370A1(c2772w, iM13407P, m13405O(iM13407P));
            }
        }

        /* JADX INFO: renamed from: C0 */
        public boolean m13381C0() {
            AbstractC2745A abstractC2745A = this.f10943g;
            return abstractC2745A != null && abstractC2745A.m13222h();
        }

        /* JADX INFO: renamed from: C1 */
        public abstract void mo13033C1(int i7);

        /* JADX INFO: renamed from: D */
        public void m13382D(int i7) {
            m13372E(i7, m13405O(i7));
        }

        /* JADX INFO: renamed from: D0 */
        public boolean m13383D0(View view, boolean z7, boolean z8) {
            boolean z9 = this.f10941e.m13900b(view, 24579) && this.f10942f.m13900b(view, 24579);
            return z7 ? z9 : !z9;
        }

        /* JADX INFO: renamed from: D1 */
        public abstract int mo12968D1(int i7, C2772w c2772w, C2746B c2746b);

        /* JADX INFO: renamed from: E0 */
        public void m13384E0(View view, int i7, int i8, int i9, int i10) {
            C2766q c2766q = (C2766q) view.getLayoutParams();
            Rect rect = c2766q.f10962b;
            view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) c2766q).leftMargin, i8 + rect.top + ((ViewGroup.MarginLayoutParams) c2766q).topMargin, (i9 - rect.right) - ((ViewGroup.MarginLayoutParams) c2766q).rightMargin, (i10 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c2766q).bottomMargin);
        }

        /* JADX INFO: renamed from: E1 */
        void m13385E1(RecyclerView recyclerView) {
            m13388F1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* JADX INFO: renamed from: F */
        void m13386F(RecyclerView recyclerView) {
            this.f10945i = true;
            mo13400L0(recyclerView);
        }

        /* JADX INFO: renamed from: F0 */
        public void mo13387F0(View view, int i7, int i8) {
            C2766q c2766q = (C2766q) view.getLayoutParams();
            Rect rectM13183l0 = this.f10938b.m13183l0(view);
            int i9 = i7 + rectM13183l0.left + rectM13183l0.right;
            int i10 = i8 + rectM13183l0.top + rectM13183l0.bottom;
            int iM13373Q = m13373Q(m13460t0(), m13462u0(), m13438j0() + m13441k0() + ((ViewGroup.MarginLayoutParams) c2766q).leftMargin + ((ViewGroup.MarginLayoutParams) c2766q).rightMargin + i9, ((ViewGroup.MarginLayoutParams) c2766q).width, mo13060q());
            int iM13373Q2 = m13373Q(m13424c0(), m13425d0(), m13443l0() + m13436i0() + ((ViewGroup.MarginLayoutParams) c2766q).topMargin + ((ViewGroup.MarginLayoutParams) c2766q).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) c2766q).height, mo13062r());
            if (m13399K1(view, iM13373Q, iM13373Q2, c2766q)) {
                view.measure(iM13373Q, iM13373Q2);
            }
        }

        /* JADX INFO: renamed from: F1 */
        void m13388F1(int i7, int i8) {
            this.f10953q = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            this.f10951o = mode;
            if (mode == 0 && !RecyclerView.f10771O0) {
                this.f10953q = 0;
            }
            this.f10954r = View.MeasureSpec.getSize(i8);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.f10952p = mode2;
            if (mode2 != 0 || RecyclerView.f10771O0) {
                return;
            }
            this.f10954r = 0;
        }

        /* JADX INFO: renamed from: G */
        void m13389G(RecyclerView recyclerView, C2772w c2772w) {
            this.f10945i = false;
            mo13040N0(recyclerView, c2772w);
        }

        /* JADX INFO: renamed from: G0 */
        public void m13390G0(int i7, int i8) {
            View viewM13405O = m13405O(i7);
            if (viewM13405O != null) {
                m13382D(i7);
                m13447n(viewM13405O, i8);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i7 + this.f10938b.toString());
            }
        }

        /* JADX INFO: renamed from: G1 */
        public void m13391G1(int i7, int i8) {
            this.f10938b.setMeasuredDimension(i7, i8);
        }

        /* JADX INFO: renamed from: H */
        public View m13392H(View view) {
            View viewM13155T;
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView == null || (viewM13155T = recyclerView.m13155T(view)) == null || this.f10937a.m13692n(viewM13155T)) {
                return null;
            }
            return viewM13155T;
        }

        /* JADX INFO: renamed from: H0 */
        public void mo13393H0(int i7) {
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView != null) {
                recyclerView.m13128B0(i7);
            }
        }

        /* JADX INFO: renamed from: H1 */
        public void mo12970H1(Rect rect, int i7, int i8) {
            m13391G1(m13377t(i7, rect.width() + m13438j0() + m13441k0(), m13434h0()), m13377t(i8, rect.height() + m13443l0() + m13436i0(), m13431g0()));
        }

        /* JADX INFO: renamed from: I */
        public View mo13038I(int i7) {
            int iM13407P = m13407P();
            for (int i8 = 0; i8 < iM13407P; i8++) {
                View viewM13405O = m13405O(i8);
                AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(viewM13405O);
                if (abstractC2749EM13111h0 != null && abstractC2749EM13111h0.m13281q() == i7 && !abstractC2749EM13111h0.m13265N() && (this.f10938b.f10839s0.m13242e() || !abstractC2749EM13111h0.m13290z())) {
                    return viewM13405O;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: I0 */
        public void mo13394I0(int i7) {
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView != null) {
                recyclerView.m13130C0(i7);
            }
        }

        /* JADX INFO: renamed from: I1 */
        void m13395I1(int i7, int i8) {
            int iM13407P = m13407P();
            if (iM13407P == 0) {
                this.f10938b.m13208x(i7, i8);
                return;
            }
            int i9 = Integer.MIN_VALUE;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MAX_VALUE;
            for (int i13 = 0; i13 < iM13407P; i13++) {
                View viewM13405O = m13405O(i13);
                Rect rect = this.f10938b.f10840t;
                mo13415V(viewM13405O, rect);
                int i14 = rect.left;
                if (i14 < i12) {
                    i12 = i14;
                }
                int i15 = rect.right;
                if (i15 > i9) {
                    i9 = i15;
                }
                int i16 = rect.top;
                if (i16 < i10) {
                    i10 = i16;
                }
                int i17 = rect.bottom;
                if (i17 > i11) {
                    i11 = i17;
                }
            }
            this.f10938b.f10840t.set(i12, i10, i9, i11);
            mo12970H1(this.f10938b.f10840t, i7, i8);
        }

        /* JADX INFO: renamed from: J */
        public abstract C2766q mo12971J();

        /* JADX INFO: renamed from: J0 */
        public void mo13396J0(AbstractC2757h abstractC2757h, AbstractC2757h abstractC2757h2) {
        }

        /* JADX INFO: renamed from: J1 */
        void m13397J1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f10938b = null;
                this.f10937a = null;
                this.f10953q = 0;
                this.f10954r = 0;
            } else {
                this.f10938b = recyclerView;
                this.f10937a = recyclerView.f10821e;
                this.f10953q = recyclerView.getWidth();
                this.f10954r = recyclerView.getHeight();
            }
            this.f10951o = 1073741824;
            this.f10952p = 1073741824;
        }

        /* JADX INFO: renamed from: K */
        public C2766q mo12972K(Context context, AttributeSet attributeSet) {
            return new C2766q(context, attributeSet);
        }

        /* JADX INFO: renamed from: K0 */
        public boolean m13398K0(RecyclerView recyclerView, ArrayList arrayList, int i7, int i8) {
            return false;
        }

        /* JADX INFO: renamed from: K1 */
        boolean m13399K1(View view, int i7, int i8, C2766q c2766q) {
            return (!view.isLayoutRequested() && this.f10947k && m13371B0(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) c2766q).width) && m13371B0(view.getHeight(), i8, ((ViewGroup.MarginLayoutParams) c2766q).height)) ? false : true;
        }

        /* JADX INFO: renamed from: L */
        public C2766q mo12973L(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C2766q) {
                return new C2766q((C2766q) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2766q((ViewGroup.MarginLayoutParams) layoutParams) : new C2766q(layoutParams);
        }

        /* JADX INFO: renamed from: L0 */
        public void mo13400L0(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: L1 */
        boolean mo13039L1() {
            return false;
        }

        /* JADX INFO: renamed from: M */
        public int m13401M() {
            return -1;
        }

        /* JADX INFO: renamed from: M0 */
        public void m13402M0(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: M1 */
        boolean m13403M1(View view, int i7, int i8, C2766q c2766q) {
            return (this.f10947k && m13371B0(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) c2766q).width) && m13371B0(view.getMeasuredHeight(), i8, ((ViewGroup.MarginLayoutParams) c2766q).height)) ? false : true;
        }

        /* JADX INFO: renamed from: N */
        public int m13404N(View view) {
            return ((C2766q) view.getLayoutParams()).f10962b.bottom;
        }

        /* JADX INFO: renamed from: N0 */
        public void mo13040N0(RecyclerView recyclerView, C2772w c2772w) {
            m13402M0(recyclerView);
        }

        /* JADX INFO: renamed from: N1 */
        public abstract void mo13041N1(RecyclerView recyclerView, C2746B c2746b, int i7);

        /* JADX INFO: renamed from: O */
        public View m13405O(int i7) {
            C2783b c2783b = this.f10937a;
            if (c2783b != null) {
                return c2783b.m13686f(i7);
            }
            return null;
        }

        /* JADX INFO: renamed from: O0 */
        public abstract View mo12974O0(View view, int i7, C2772w c2772w, C2746B c2746b);

        /* JADX INFO: renamed from: O1 */
        public void m13406O1(AbstractC2745A abstractC2745A) {
            AbstractC2745A abstractC2745A2 = this.f10943g;
            if (abstractC2745A2 != null && abstractC2745A != abstractC2745A2 && abstractC2745A2.m13222h()) {
                this.f10943g.m13232r();
            }
            this.f10943g = abstractC2745A;
            abstractC2745A.m13231q(this.f10938b, this);
        }

        /* JADX INFO: renamed from: P */
        public int m13407P() {
            C2783b c2783b = this.f10937a;
            if (c2783b != null) {
                return c2783b.m13687g();
            }
            return 0;
        }

        /* JADX INFO: renamed from: P0 */
        public void mo13042P0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f10938b;
            m13409Q0(recyclerView.f10815b, recyclerView.f10839s0, accessibilityEvent);
        }

        /* JADX INFO: renamed from: P1 */
        void m13408P1() {
            AbstractC2745A abstractC2745A = this.f10943g;
            if (abstractC2745A != null) {
                abstractC2745A.m13232r();
            }
        }

        /* JADX INFO: renamed from: Q0 */
        public void m13409Q0(C2772w c2772w, C2746B c2746b, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z7 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f10938b.canScrollVertically(-1) && !this.f10938b.canScrollHorizontally(-1) && !this.f10938b.canScrollHorizontally(1)) {
                z7 = false;
            }
            accessibilityEvent.setScrollable(z7);
            AbstractC2757h abstractC2757h = this.f10938b.f10846w;
            if (abstractC2757h != null) {
                accessibilityEvent.setItemCount(abstractC2757h.mo8548g());
            }
        }

        /* JADX INFO: renamed from: Q1 */
        public boolean mo12975Q1() {
            return false;
        }

        /* JADX INFO: renamed from: R0 */
        void m13410R0(C1170s c1170s) {
            RecyclerView recyclerView = this.f10938b;
            mo13412S0(recyclerView.f10815b, recyclerView.f10839s0, c1170s);
        }

        /* JADX INFO: renamed from: S */
        public boolean m13411S() {
            RecyclerView recyclerView = this.f10938b;
            return recyclerView != null && recyclerView.f10836r;
        }

        /* JADX INFO: renamed from: S0 */
        public void mo13412S0(C2772w c2772w, C2746B c2746b, C1170s c1170s) {
            if (this.f10938b.canScrollVertically(-1) || this.f10938b.canScrollHorizontally(-1)) {
                c1170s.m5051a(8192);
                c1170s.m5023H0(true);
            }
            if (this.f10938b.canScrollVertically(1) || this.f10938b.canScrollHorizontally(1)) {
                c1170s.m5051a(4096);
                c1170s.m5023H0(true);
            }
            c1170s.m5072o0(C1170s.f.m5111b(mo12991p0(c2772w, c2746b), mo12977T(c2772w, c2746b), m13379A0(c2772w, c2746b), m13454q0(c2772w, c2746b)));
        }

        /* JADX INFO: renamed from: T */
        public int mo12977T(C2772w c2772w, C2746B c2746b) {
            return -1;
        }

        /* JADX INFO: renamed from: T0 */
        void m13413T0(View view, C1170s c1170s) {
            AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(view);
            if (abstractC2749EM13111h0 == null || abstractC2749EM13111h0.m13290z() || this.f10937a.m13692n(abstractC2749EM13111h0.f10894a)) {
                return;
            }
            RecyclerView recyclerView = this.f10938b;
            mo12978U0(recyclerView.f10815b, recyclerView.f10839s0, view, c1170s);
        }

        /* JADX INFO: renamed from: U */
        public int m13414U(View view) {
            return view.getBottom() + m13404N(view);
        }

        /* JADX INFO: renamed from: U0 */
        public void mo12978U0(C2772w c2772w, C2746B c2746b, View view, C1170s c1170s) {
        }

        /* JADX INFO: renamed from: V */
        public void mo13415V(View view, Rect rect) {
            RecyclerView.m13112i0(view, rect);
        }

        /* JADX INFO: renamed from: V0 */
        public View m13416V0(View view, int i7) {
            return null;
        }

        /* JADX INFO: renamed from: W */
        public int m13417W(View view) {
            return view.getLeft() - m13429f0(view);
        }

        /* JADX INFO: renamed from: W0 */
        public void mo12979W0(RecyclerView recyclerView, int i7, int i8) {
        }

        /* JADX INFO: renamed from: X */
        public int m13418X(View view) {
            Rect rect = ((C2766q) view.getLayoutParams()).f10962b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* JADX INFO: renamed from: X0 */
        public void mo12980X0(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: Y */
        public int m13419Y(View view) {
            Rect rect = ((C2766q) view.getLayoutParams()).f10962b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* JADX INFO: renamed from: Y0 */
        public void mo12981Y0(RecyclerView recyclerView, int i7, int i8, int i9) {
        }

        /* JADX INFO: renamed from: Z */
        public int m13420Z(View view) {
            return view.getRight() + m13450o0(view);
        }

        /* JADX INFO: renamed from: Z0 */
        public void mo12983Z0(RecyclerView recyclerView, int i7, int i8) {
        }

        /* JADX INFO: renamed from: a0 */
        public int m13421a0(View view) {
            return view.getTop() - m13456r0(view);
        }

        /* JADX INFO: renamed from: a1 */
        public void m13422a1(RecyclerView recyclerView, int i7, int i8) {
        }

        /* JADX INFO: renamed from: b0 */
        public View m13423b0() {
            View focusedChild;
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f10937a.m13692n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* JADX INFO: renamed from: b1 */
        public void mo12985b1(RecyclerView recyclerView, int i7, int i8, Object obj) {
            m13422a1(recyclerView, i7, i8);
        }

        /* JADX INFO: renamed from: c0 */
        public int m13424c0() {
            return this.f10954r;
        }

        /* JADX INFO: renamed from: c1 */
        public abstract void mo12986c1(C2772w c2772w, C2746B c2746b);

        /* JADX INFO: renamed from: d0 */
        public int m13425d0() {
            return this.f10952p;
        }

        /* JADX INFO: renamed from: d1 */
        public void mo12987d1(C2746B c2746b) {
        }

        /* JADX INFO: renamed from: e0 */
        public int m13426e0() {
            return AbstractC1030Z.m4505z(this.f10938b);
        }

        /* JADX INFO: renamed from: e1 */
        public void m13427e1(C2772w c2772w, C2746B c2746b, int i7, int i8) {
            this.f10938b.m13208x(i7, i8);
        }

        /* JADX INFO: renamed from: f */
        public int m13428f() {
            RecyclerView recyclerView = this.f10938b;
            AbstractC2757h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo8548g();
            }
            return 0;
        }

        /* JADX INFO: renamed from: f0 */
        public int m13429f0(View view) {
            return ((C2766q) view.getLayoutParams()).f10962b.left;
        }

        /* JADX INFO: renamed from: f1 */
        public boolean m13430f1(RecyclerView recyclerView, View view, View view2) {
            return m13381C0() || recyclerView.m13205v0();
        }

        /* JADX INFO: renamed from: g0 */
        public int m13431g0() {
            return AbstractC1030Z.m4425A(this.f10938b);
        }

        /* JADX INFO: renamed from: g1 */
        public boolean m13432g1(RecyclerView recyclerView, C2746B c2746b, View view, View view2) {
            return m13430f1(recyclerView, view, view2);
        }

        /* JADX INFO: renamed from: h */
        public void m13433h(View view) {
            m13435i(view, -1);
        }

        /* JADX INFO: renamed from: h0 */
        public int m13434h0() {
            return AbstractC1030Z.m4427B(this.f10938b);
        }

        /* JADX INFO: renamed from: h1 */
        public void mo13055h1(Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: i */
        public void m13435i(View view, int i7) {
            m13375l(view, i7, true);
        }

        /* JADX INFO: renamed from: i0 */
        public int m13436i0() {
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* JADX INFO: renamed from: i1 */
        public Parcelable mo13057i1() {
            return null;
        }

        /* JADX INFO: renamed from: j */
        public void m13437j(View view) {
            m13440k(view, -1);
        }

        /* JADX INFO: renamed from: j0 */
        public int m13438j0() {
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* JADX INFO: renamed from: j1 */
        public void mo13439j1(int i7) {
        }

        /* JADX INFO: renamed from: k */
        public void m13440k(View view, int i7) {
            m13375l(view, i7, false);
        }

        /* JADX INFO: renamed from: k0 */
        public int m13441k0() {
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* JADX INFO: renamed from: k1 */
        void m13442k1(AbstractC2745A abstractC2745A) {
            if (this.f10943g == abstractC2745A) {
                this.f10943g = null;
            }
        }

        /* JADX INFO: renamed from: l0 */
        public int m13443l0() {
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX INFO: renamed from: l1 */
        boolean m13444l1(int i7, Bundle bundle) {
            RecyclerView recyclerView = this.f10938b;
            return mo13446m1(recyclerView.f10815b, recyclerView.f10839s0, i7, bundle);
        }

        /* JADX INFO: renamed from: m */
        public void mo13058m(String str) {
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView != null) {
                recyclerView.m13190p(str);
            }
        }

        /* JADX INFO: renamed from: m0 */
        public int m13445m0(View view) {
            return ((C2766q) view.getLayoutParams()).m13478a();
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0044 A[PHI: r8
          0x0044: PHI (r8v8 int) = (r8v4 int), (r8v12 int) binds: [B:24:0x0063, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: m1 */
        public boolean mo13446m1(C2772w c2772w, C2746B c2746b, int i7, Bundle bundle) {
            int iM13424c0;
            int iM13460t0;
            int i8;
            int i9;
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView == null) {
                return false;
            }
            if (i7 == 4096) {
                iM13424c0 = recyclerView.canScrollVertically(1) ? (m13424c0() - m13443l0()) - m13436i0() : 0;
                if (this.f10938b.canScrollHorizontally(1)) {
                    iM13460t0 = (m13460t0() - m13438j0()) - m13441k0();
                    i8 = iM13424c0;
                    i9 = iM13460t0;
                } else {
                    i8 = iM13424c0;
                    i9 = 0;
                }
            } else if (i7 != 8192) {
                i9 = 0;
                i8 = 0;
            } else {
                iM13424c0 = recyclerView.canScrollVertically(-1) ? -((m13424c0() - m13443l0()) - m13436i0()) : 0;
                if (this.f10938b.canScrollHorizontally(-1)) {
                    iM13460t0 = -((m13460t0() - m13438j0()) - m13441k0());
                    i8 = iM13424c0;
                    i9 = iM13460t0;
                } else {
                    i8 = iM13424c0;
                    i9 = 0;
                }
            }
            if (i8 == 0 && i9 == 0) {
                return false;
            }
            this.f10938b.m13195r1(i9, i8, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* JADX INFO: renamed from: n */
        public void m13447n(View view, int i7) {
            m13449o(view, i7, (C2766q) view.getLayoutParams());
        }

        /* JADX INFO: renamed from: n1 */
        boolean m13448n1(View view, int i7, Bundle bundle) {
            RecyclerView recyclerView = this.f10938b;
            return m13451o1(recyclerView.f10815b, recyclerView.f10839s0, view, i7, bundle);
        }

        /* JADX INFO: renamed from: o */
        public void m13449o(View view, int i7, C2766q c2766q) {
            AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(view);
            if (abstractC2749EM13111h0.m13290z()) {
                this.f10938b.f10823f.m13908b(abstractC2749EM13111h0);
            } else {
                this.f10938b.f10823f.m13921p(abstractC2749EM13111h0);
            }
            this.f10937a.m13683c(view, i7, c2766q, abstractC2749EM13111h0.m13290z());
        }

        /* JADX INFO: renamed from: o0 */
        public int m13450o0(View view) {
            return ((C2766q) view.getLayoutParams()).f10962b.right;
        }

        /* JADX INFO: renamed from: o1 */
        public boolean m13451o1(C2772w c2772w, C2746B c2746b, View view, int i7, Bundle bundle) {
            return false;
        }

        /* JADX INFO: renamed from: p */
        public void m13452p(View view, Rect rect) {
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m13183l0(view));
            }
        }

        /* JADX INFO: renamed from: p0 */
        public int mo12991p0(C2772w c2772w, C2746B c2746b) {
            return -1;
        }

        /* JADX INFO: renamed from: p1 */
        public void m13453p1(C2772w c2772w) {
            for (int iM13407P = m13407P() - 1; iM13407P >= 0; iM13407P--) {
                if (!RecyclerView.m13111h0(m13405O(iM13407P)).m13265N()) {
                    m13459s1(iM13407P, c2772w);
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public abstract boolean mo13060q();

        /* JADX INFO: renamed from: q0 */
        public int m13454q0(C2772w c2772w, C2746B c2746b) {
            return 0;
        }

        /* JADX INFO: renamed from: q1 */
        void m13455q1(C2772w c2772w) {
            int iM13526j = c2772w.m13526j();
            for (int i7 = iM13526j - 1; i7 >= 0; i7--) {
                View viewM13530n = c2772w.m13530n(i7);
                AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(viewM13530n);
                if (!abstractC2749EM13111h0.m13265N()) {
                    abstractC2749EM13111h0.m13262K(false);
                    if (abstractC2749EM13111h0.m13253B()) {
                        this.f10938b.removeDetachedView(viewM13530n, false);
                    }
                    AbstractC2762m abstractC2762m = this.f10938b.f10814a0;
                    if (abstractC2762m != null) {
                        abstractC2762m.mo13346j(abstractC2749EM13111h0);
                    }
                    abstractC2749EM13111h0.m13262K(true);
                    c2772w.m13539y(viewM13530n);
                }
            }
            c2772w.m13521e();
            if (iM13526j > 0) {
                this.f10938b.invalidate();
            }
        }

        /* JADX INFO: renamed from: r */
        public abstract boolean mo13062r();

        /* JADX INFO: renamed from: r0 */
        public int m13456r0(View view) {
            return ((C2766q) view.getLayoutParams()).f10962b.top;
        }

        /* JADX INFO: renamed from: r1 */
        public void m13457r1(View view, C2772w c2772w) {
            m13463u1(view);
            c2772w.m13507B(view);
        }

        /* JADX INFO: renamed from: s */
        public boolean mo12992s(C2766q c2766q) {
            return c2766q != null;
        }

        /* JADX INFO: renamed from: s0 */
        public void m13458s0(View view, boolean z7, Rect rect) {
            Matrix matrix;
            if (z7) {
                Rect rect2 = ((C2766q) view.getLayoutParams()).f10962b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f10938b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f10938b.f10844v;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX INFO: renamed from: s1 */
        public void m13459s1(int i7, C2772w c2772w) {
            View viewM13405O = m13405O(i7);
            m13465v1(i7);
            c2772w.m13507B(viewM13405O);
        }

        /* JADX INFO: renamed from: t0 */
        public int m13460t0() {
            return this.f10953q;
        }

        /* JADX INFO: renamed from: t1 */
        public boolean m13461t1(Runnable runnable) {
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* JADX INFO: renamed from: u */
        public void mo13065u(int i7, int i8, C2746B c2746b, c cVar) {
        }

        /* JADX INFO: renamed from: u0 */
        public int m13462u0() {
            return this.f10951o;
        }

        /* JADX INFO: renamed from: u1 */
        public void m13463u1(View view) {
            this.f10937a.m13694p(view);
        }

        /* JADX INFO: renamed from: v */
        public void mo13066v(int i7, c cVar) {
        }

        /* JADX INFO: renamed from: v0 */
        boolean m13464v0() {
            int iM13407P = m13407P();
            for (int i7 = 0; i7 < iM13407P; i7++) {
                ViewGroup.LayoutParams layoutParams = m13405O(i7).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: v1 */
        public void m13465v1(int i7) {
            if (m13405O(i7) != null) {
                this.f10937a.m13695q(i7);
            }
        }

        /* JADX INFO: renamed from: w */
        public abstract int mo13067w(C2746B c2746b);

        /* JADX INFO: renamed from: w0 */
        public boolean m13466w0() {
            return this.f10945i;
        }

        /* JADX INFO: renamed from: w1 */
        public boolean m13467w1(RecyclerView recyclerView, View view, Rect rect, boolean z7) {
            return mo13468x1(recyclerView, view, rect, z7, false);
        }

        /* JADX INFO: renamed from: x */
        public abstract int mo12995x(C2746B c2746b);

        /* JADX INFO: renamed from: x0 */
        public abstract boolean mo13068x0();

        /* JADX INFO: renamed from: x1 */
        public boolean mo13468x1(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
            int[] iArrM13374R = m13374R(view, rect);
            int i7 = iArrM13374R[0];
            int i8 = iArrM13374R[1];
            if ((z8 && !m13378y0(recyclerView, i7, i8)) || (i7 == 0 && i8 == 0)) {
                return false;
            }
            if (z7) {
                recyclerView.scrollBy(i7, i8);
            } else {
                recyclerView.m13189o1(i7, i8);
            }
            return true;
        }

        /* JADX INFO: renamed from: y */
        public abstract int mo12996y(C2746B c2746b);

        /* JADX INFO: renamed from: y1 */
        public void m13469y1() {
            RecyclerView recyclerView = this.f10938b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* JADX INFO: renamed from: z */
        public abstract int mo13069z(C2746B c2746b);

        /* JADX INFO: renamed from: z0 */
        public final boolean m13470z0() {
            return this.f10948l;
        }

        /* JADX INFO: renamed from: z1 */
        public void m13471z1() {
            this.f10944h = true;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public interface InterfaceC2767r {
        /* JADX INFO: renamed from: b */
        void mo13482b(View view);

        /* JADX INFO: renamed from: d */
        void mo13483d(View view);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public static abstract class AbstractC2768s {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo13484a(int i7, int i8);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public interface InterfaceC2769t {
        /* JADX INFO: renamed from: a */
        void mo13485a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* JADX INFO: renamed from: c */
        boolean mo13486c(RecyclerView recyclerView, MotionEvent motionEvent);

        /* JADX INFO: renamed from: e */
        void mo13487e(boolean z7);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static abstract class AbstractC2770u {
        /* JADX INFO: renamed from: a */
        public void mo13488a(RecyclerView recyclerView, int i7) {
        }

        /* JADX INFO: renamed from: b */
        public void mo13489b(RecyclerView recyclerView, int i7, int i8) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static class C2771v {

        /* JADX INFO: renamed from: a */
        SparseArray f10965a = new SparseArray();

        /* JADX INFO: renamed from: b */
        private int f10966b = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        static class a {

            /* JADX INFO: renamed from: a */
            final ArrayList f10967a = new ArrayList();

            /* JADX INFO: renamed from: b */
            int f10968b = 5;

            /* JADX INFO: renamed from: c */
            long f10969c = 0;

            /* JADX INFO: renamed from: d */
            long f10970d = 0;

            a() {
            }
        }

        /* JADX INFO: renamed from: g */
        private a m13490g(int i7) {
            a aVar = (a) this.f10965a.get(i7);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f10965a.put(i7, aVar2);
            return aVar2;
        }

        /* JADX INFO: renamed from: a */
        void m13491a() {
            this.f10966b++;
        }

        /* JADX INFO: renamed from: b */
        public void m13492b() {
            for (int i7 = 0; i7 < this.f10965a.size(); i7++) {
                ((a) this.f10965a.valueAt(i7)).f10967a.clear();
            }
        }

        /* JADX INFO: renamed from: c */
        void m13493c() {
            this.f10966b--;
        }

        /* JADX INFO: renamed from: d */
        void m13494d(int i7, long j7) {
            a aVarM13490g = m13490g(i7);
            aVarM13490g.f10970d = m13499j(aVarM13490g.f10970d, j7);
        }

        /* JADX INFO: renamed from: e */
        void m13495e(int i7, long j7) {
            a aVarM13490g = m13490g(i7);
            aVarM13490g.f10969c = m13499j(aVarM13490g.f10969c, j7);
        }

        /* JADX INFO: renamed from: f */
        public AbstractC2749E m13496f(int i7) {
            a aVar = (a) this.f10965a.get(i7);
            if (aVar == null || aVar.f10967a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f10967a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((AbstractC2749E) arrayList.get(size)).m13286v()) {
                    return (AbstractC2749E) arrayList.remove(size);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: h */
        void m13497h(AbstractC2757h abstractC2757h, AbstractC2757h abstractC2757h2, boolean z7) {
            if (abstractC2757h != null) {
                m13493c();
            }
            if (!z7 && this.f10966b == 0) {
                m13492b();
            }
            if (abstractC2757h2 != null) {
                m13491a();
            }
        }

        /* JADX INFO: renamed from: i */
        public void m13498i(AbstractC2749E abstractC2749E) {
            int iM13280p = abstractC2749E.m13280p();
            ArrayList arrayList = m13490g(iM13280p).f10967a;
            if (((a) this.f10965a.get(iM13280p)).f10968b <= arrayList.size()) {
                return;
            }
            abstractC2749E.m13259H();
            arrayList.add(abstractC2749E);
        }

        /* JADX INFO: renamed from: j */
        long m13499j(long j7, long j8) {
            return j7 == 0 ? j8 : ((j7 / 4) * 3) + (j8 / 4);
        }

        /* JADX INFO: renamed from: k */
        boolean m13500k(int i7, long j7, long j8) {
            long j9 = m13490g(i7).f10970d;
            return j9 == 0 || j7 + j9 < j8;
        }

        /* JADX INFO: renamed from: l */
        boolean m13501l(int i7, long j7, long j8) {
            long j9 = m13490g(i7).f10969c;
            return j9 == 0 || j7 + j9 < j8;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public final class C2772w {

        /* JADX INFO: renamed from: a */
        final ArrayList f10971a;

        /* JADX INFO: renamed from: b */
        ArrayList f10972b;

        /* JADX INFO: renamed from: c */
        final ArrayList f10973c;

        /* JADX INFO: renamed from: d */
        private final List f10974d;

        /* JADX INFO: renamed from: e */
        private int f10975e;

        /* JADX INFO: renamed from: f */
        int f10976f;

        /* JADX INFO: renamed from: g */
        C2771v f10977g;

        public C2772w() {
            ArrayList arrayList = new ArrayList();
            this.f10971a = arrayList;
            this.f10972b = null;
            this.f10973c = new ArrayList();
            this.f10974d = Collections.unmodifiableList(arrayList);
            this.f10975e = 2;
            this.f10976f = 2;
        }

        /* JADX INFO: renamed from: H */
        private boolean m13502H(AbstractC2749E abstractC2749E, int i7, int i8, long j7) {
            abstractC2749E.f10912s = null;
            abstractC2749E.f10911r = RecyclerView.this;
            int iM13280p = abstractC2749E.m13280p();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j7 != Long.MAX_VALUE && !this.f10977g.m13500k(iM13280p, nanoTime, j7)) {
                return false;
            }
            RecyclerView.this.f10846w.m13316c(abstractC2749E, i7);
            this.f10977g.m13494d(abstractC2749E.m13280p(), RecyclerView.this.getNanoTime() - nanoTime);
            m13503b(abstractC2749E);
            if (!RecyclerView.this.f10839s0.m13242e()) {
                return true;
            }
            abstractC2749E.f10900g = i8;
            return true;
        }

        /* JADX INFO: renamed from: b */
        private void m13503b(AbstractC2749E abstractC2749E) {
            if (RecyclerView.this.m13202u0()) {
                View view = abstractC2749E.f10894a;
                if (AbstractC1030Z.m4501x(view) == 0) {
                    AbstractC1030Z.m4488q0(view, 1);
                }
                C2795n c2795n = RecyclerView.this.f10853z0;
                if (c2795n == null) {
                    return;
                }
                C1032a c1032aM13871n = c2795n.m13871n();
                if (c1032aM13871n instanceof C2795n.a) {
                    ((C2795n.a) c1032aM13871n).m13874o(view);
                }
                AbstractC1030Z.m4474j0(view, c1032aM13871n);
            }
        }

        /* JADX INFO: renamed from: q */
        private void m13504q(ViewGroup viewGroup, boolean z7) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m13504q((ViewGroup) childAt, true);
                }
            }
            if (z7) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* JADX INFO: renamed from: r */
        private void m13505r(AbstractC2749E abstractC2749E) {
            View view = abstractC2749E.f10894a;
            if (view instanceof ViewGroup) {
                m13504q((ViewGroup) view, false);
            }
        }

        /* JADX INFO: renamed from: A */
        void m13506A(int i7) {
            m13518a((AbstractC2749E) this.f10973c.get(i7), true);
            this.f10973c.remove(i7);
        }

        /* JADX INFO: renamed from: B */
        public void m13507B(View view) {
            AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(view);
            if (abstractC2749EM13111h0.m13253B()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (abstractC2749EM13111h0.m13252A()) {
                abstractC2749EM13111h0.m13266O();
            } else if (abstractC2749EM13111h0.m13267P()) {
                abstractC2749EM13111h0.m13272g();
            }
            m13508C(abstractC2749EM13111h0);
            if (RecyclerView.this.f10814a0 == null || abstractC2749EM13111h0.m13289y()) {
                return;
            }
            RecyclerView.this.f10814a0.mo13346j(abstractC2749EM13111h0);
        }

        /* JADX INFO: renamed from: C */
        void m13508C(AbstractC2749E abstractC2749E) {
            boolean z7;
            boolean z8 = false;
            boolean z9 = true;
            if (abstractC2749E.m13252A() || abstractC2749E.f10894a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(abstractC2749E.m13252A());
                sb.append(" isAttached:");
                sb.append(abstractC2749E.f10894a.getParent() != null);
                sb.append(RecyclerView.this.m13151Q());
                throw new IllegalArgumentException(sb.toString());
            }
            if (abstractC2749E.m13253B()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC2749E + RecyclerView.this.m13151Q());
            }
            if (abstractC2749E.m13265N()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m13151Q());
            }
            boolean zM13274j = abstractC2749E.m13274j();
            AbstractC2757h abstractC2757h = RecyclerView.this.f10846w;
            if ((abstractC2757h != null && zM13274j && abstractC2757h.mo3685u(abstractC2749E)) || abstractC2749E.m13289y()) {
                if (this.f10976f <= 0 || abstractC2749E.m13284t(526)) {
                    z7 = false;
                } else {
                    int size = this.f10973c.size();
                    if (size >= this.f10976f && size > 0) {
                        m13506A(0);
                        size--;
                    }
                    if (RecyclerView.f10773Q0 && size > 0 && !RecyclerView.this.f10837r0.m13753d(abstractC2749E.f10896c)) {
                        int i7 = size - 1;
                        while (i7 >= 0) {
                            if (!RecyclerView.this.f10837r0.m13753d(((AbstractC2749E) this.f10973c.get(i7)).f10896c)) {
                                break;
                            } else {
                                i7--;
                            }
                        }
                        size = i7 + 1;
                    }
                    this.f10973c.add(size, abstractC2749E);
                    z7 = true;
                }
                if (z7) {
                    z9 = false;
                } else {
                    m13518a(abstractC2749E, true);
                }
                z8 = z7;
            } else {
                z9 = false;
            }
            RecyclerView.this.f10823f.m13922q(abstractC2749E);
            if (z8 || z9 || !zM13274j) {
                return;
            }
            abstractC2749E.f10912s = null;
            abstractC2749E.f10911r = null;
        }

        /* JADX INFO: renamed from: D */
        void m13509D(View view) {
            AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(view);
            if (!abstractC2749EM13111h0.m13284t(12) && abstractC2749EM13111h0.m13254C() && !RecyclerView.this.m13193q(abstractC2749EM13111h0)) {
                if (this.f10972b == null) {
                    this.f10972b = new ArrayList();
                }
                abstractC2749EM13111h0.m13263L(this, true);
                this.f10972b.add(abstractC2749EM13111h0);
                return;
            }
            if (!abstractC2749EM13111h0.m13288x() || abstractC2749EM13111h0.m13290z() || RecyclerView.this.f10846w.m13321k()) {
                abstractC2749EM13111h0.m13263L(this, false);
                this.f10971a.add(abstractC2749EM13111h0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m13151Q());
            }
        }

        /* JADX INFO: renamed from: E */
        void m13510E(C2771v c2771v) {
            C2771v c2771v2 = this.f10977g;
            if (c2771v2 != null) {
                c2771v2.m13493c();
            }
            this.f10977g = c2771v;
            if (c2771v == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f10977g.m13491a();
        }

        /* JADX INFO: renamed from: F */
        void m13511F(AbstractC2747C abstractC2747C) {
        }

        /* JADX INFO: renamed from: G */
        public void m13512G(int i7) {
            this.f10975e = i7;
            m13515K();
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:67:0x014a  */
        /* JADX WARN: Code duplicated, block: B:73:0x0176  */
        /* JADX WARN: Code duplicated, block: B:75:0x017c  */
        /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:85:0x01af  */
        /* JADX WARN: Code duplicated, block: B:87:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:88:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:91:0x01cb A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:93:0x01ce  */
        /* JADX INFO: renamed from: I */
        AbstractC2749E m13513I(int i7, boolean z7, long j7) {
            AbstractC2749E abstractC2749EM13318e;
            boolean z8;
            AbstractC2749E abstractC2749E;
            boolean z9;
            boolean zM13502H;
            ViewGroup.LayoutParams layoutParams;
            C2766q c2766q;
            int iM13667m;
            RecyclerView recyclerViewM13100X;
            if (i7 < 0 || i7 >= RecyclerView.this.f10839s0.m13239b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i7 + "(" + i7 + "). Item count:" + RecyclerView.this.f10839s0.m13239b() + RecyclerView.this.m13151Q());
            }
            if (RecyclerView.this.f10839s0.m13242e()) {
                abstractC2749EM13318e = m13524h(i7);
                if (abstractC2749EM13318e != null) {
                    z8 = true;
                }
                if (abstractC2749EM13318e == null && (abstractC2749EM13318e = m13529m(i7, z7)) != null) {
                    if (m13516L(abstractC2749EM13318e)) {
                        z8 = true;
                    } else {
                        if (!z7) {
                            abstractC2749EM13318e.m13269d(4);
                            if (abstractC2749EM13318e.m13252A()) {
                                RecyclerView.this.removeDetachedView(abstractC2749EM13318e.f10894a, false);
                                abstractC2749EM13318e.m13266O();
                            } else if (abstractC2749EM13318e.m13267P()) {
                                abstractC2749EM13318e.m13272g();
                            }
                            m13508C(abstractC2749EM13318e);
                        }
                        abstractC2749EM13318e = null;
                    }
                }
                if (abstractC2749EM13318e == null) {
                    iM13667m = RecyclerView.this.f10819d.m13667m(i7);
                    if (iM13667m >= 0 || iM13667m >= RecyclerView.this.f10846w.mo8548g()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i7 + "(offset:" + iM13667m + ").state:" + RecyclerView.this.f10839s0.m13239b() + RecyclerView.this.m13151Q());
                    }
                    int iMo8549i = RecyclerView.this.f10846w.mo8549i(iM13667m);
                    if (RecyclerView.this.f10846w.m13321k() && (abstractC2749EM13318e = m13528l(RecyclerView.this.f10846w.mo3680h(iM13667m), iMo8549i, z7)) != null) {
                        abstractC2749EM13318e.f10896c = iM13667m;
                        z8 = true;
                    }
                    if (abstractC2749EM13318e == null) {
                        AbstractC2749E abstractC2749EM13496f = m13525i().m13496f(iMo8549i);
                        if (abstractC2749EM13496f != null) {
                            abstractC2749EM13496f.m13259H();
                            if (RecyclerView.f10770N0) {
                                m13505r(abstractC2749EM13496f);
                            }
                        }
                        abstractC2749EM13318e = abstractC2749EM13496f;
                    }
                    if (abstractC2749EM13318e == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j7 != Long.MAX_VALUE && !this.f10977g.m13501l(iMo8549i, nanoTime, j7)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        abstractC2749EM13318e = recyclerView.f10846w.m13318e(recyclerView, iMo8549i);
                        if (RecyclerView.f10773Q0 && (recyclerViewM13100X = RecyclerView.m13100X(abstractC2749EM13318e.f10894a)) != null) {
                            abstractC2749EM13318e.f10895b = new WeakReference(recyclerViewM13100X);
                        }
                        this.f10977g.m13495e(iMo8549i, RecyclerView.this.getNanoTime() - nanoTime);
                    }
                }
                abstractC2749E = abstractC2749EM13318e;
                z9 = z8;
                if (z9 && !RecyclerView.this.f10839s0.m13242e() && abstractC2749E.m13284t(8192)) {
                    abstractC2749E.m13261J(0, 8192);
                    if (RecyclerView.this.f10839s0.f10879k) {
                        int iM13337e = AbstractC2762m.m13337e(abstractC2749E) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.m13156T0(abstractC2749E, recyclerView2.f10814a0.m13357u(recyclerView2.f10839s0, abstractC2749E, iM13337e, abstractC2749E.m13283s()));
                    }
                }
                if (RecyclerView.this.f10839s0.m13242e() || !abstractC2749E.m13287w()) {
                    if (abstractC2749E.m13287w() || abstractC2749E.m13255D() || abstractC2749E.m13288x()) {
                        zM13502H = m13502H(abstractC2749E, RecyclerView.this.f10819d.m13667m(i7), i7, j7);
                    }
                    layoutParams = abstractC2749E.f10894a.getLayoutParams();
                    if (layoutParams == null) {
                        c2766q = (C2766q) RecyclerView.this.generateDefaultLayoutParams();
                        abstractC2749E.f10894a.setLayoutParams(c2766q);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        c2766q = (C2766q) layoutParams;
                    } else {
                        c2766q = (C2766q) RecyclerView.this.generateLayoutParams(layoutParams);
                        abstractC2749E.f10894a.setLayoutParams(c2766q);
                    }
                    c2766q.f10961a = abstractC2749E;
                    c2766q.f10964d = !z9 && zM13502H;
                    return abstractC2749E;
                }
                abstractC2749E.f10900g = i7;
                zM13502H = false;
                layoutParams = abstractC2749E.f10894a.getLayoutParams();
                if (layoutParams == null) {
                    c2766q = (C2766q) RecyclerView.this.generateDefaultLayoutParams();
                    abstractC2749E.f10894a.setLayoutParams(c2766q);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    c2766q = (C2766q) RecyclerView.this.generateLayoutParams(layoutParams);
                    abstractC2749E.f10894a.setLayoutParams(c2766q);
                } else {
                    c2766q = (C2766q) layoutParams;
                }
                c2766q.f10961a = abstractC2749E;
                c2766q.f10964d = !z9 && zM13502H;
                return abstractC2749E;
            }
            abstractC2749EM13318e = null;
            z8 = false;
            if (abstractC2749EM13318e == null) {
                if (m13516L(abstractC2749EM13318e)) {
                    if (!z7) {
                        abstractC2749EM13318e.m13269d(4);
                        if (abstractC2749EM13318e.m13252A()) {
                            RecyclerView.this.removeDetachedView(abstractC2749EM13318e.f10894a, false);
                            abstractC2749EM13318e.m13266O();
                        } else if (abstractC2749EM13318e.m13267P()) {
                            abstractC2749EM13318e.m13272g();
                        }
                        m13508C(abstractC2749EM13318e);
                    }
                    abstractC2749EM13318e = null;
                } else {
                    z8 = true;
                }
            }
            if (abstractC2749EM13318e == null) {
                iM13667m = RecyclerView.this.f10819d.m13667m(i7);
                if (iM13667m >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i7 + "(offset:" + iM13667m + ").state:" + RecyclerView.this.f10839s0.m13239b() + RecyclerView.this.m13151Q());
            }
            abstractC2749E = abstractC2749EM13318e;
            z9 = z8;
            if (z9) {
                abstractC2749E.m13261J(0, 8192);
                if (RecyclerView.this.f10839s0.f10879k) {
                    int iM13337e2 = AbstractC2762m.m13337e(abstractC2749E) | 4096;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.m13156T0(abstractC2749E, recyclerView3.f10814a0.m13357u(recyclerView3.f10839s0, abstractC2749E, iM13337e2, abstractC2749E.m13283s()));
                }
            }
            if (RecyclerView.this.f10839s0.m13242e()) {
                if (abstractC2749E.m13287w()) {
                }
                zM13502H = m13502H(abstractC2749E, RecyclerView.this.f10819d.m13667m(i7), i7, j7);
            } else {
                if (abstractC2749E.m13287w()) {
                }
                zM13502H = m13502H(abstractC2749E, RecyclerView.this.f10819d.m13667m(i7), i7, j7);
            }
            layoutParams = abstractC2749E.f10894a.getLayoutParams();
            if (layoutParams == null) {
                c2766q = (C2766q) RecyclerView.this.generateDefaultLayoutParams();
                abstractC2749E.f10894a.setLayoutParams(c2766q);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                c2766q = (C2766q) RecyclerView.this.generateLayoutParams(layoutParams);
                abstractC2749E.f10894a.setLayoutParams(c2766q);
            } else {
                c2766q = (C2766q) layoutParams;
            }
            c2766q.f10961a = abstractC2749E;
            c2766q.f10964d = !z9 && zM13502H;
            return abstractC2749E;
        }

        /* JADX INFO: renamed from: J */
        void m13514J(AbstractC2749E abstractC2749E) {
            if (abstractC2749E.f10908o) {
                this.f10972b.remove(abstractC2749E);
            } else {
                this.f10971a.remove(abstractC2749E);
            }
            abstractC2749E.f10907n = null;
            abstractC2749E.f10908o = false;
            abstractC2749E.m13272g();
        }

        /* JADX INFO: renamed from: K */
        void m13515K() {
            AbstractC2765p abstractC2765p = RecyclerView.this.f10848x;
            this.f10976f = this.f10975e + (abstractC2765p != null ? abstractC2765p.f10949m : 0);
            for (int size = this.f10973c.size() - 1; size >= 0 && this.f10973c.size() > this.f10976f; size--) {
                m13506A(size);
            }
        }

        /* JADX INFO: renamed from: L */
        boolean m13516L(AbstractC2749E abstractC2749E) {
            if (abstractC2749E.m13290z()) {
                return RecyclerView.this.f10839s0.m13242e();
            }
            int i7 = abstractC2749E.f10896c;
            if (i7 >= 0 && i7 < RecyclerView.this.f10846w.mo8548g()) {
                if (RecyclerView.this.f10839s0.m13242e() || RecyclerView.this.f10846w.mo8549i(abstractC2749E.f10896c) == abstractC2749E.m13280p()) {
                    return !RecyclerView.this.f10846w.m13321k() || abstractC2749E.m13279o() == RecyclerView.this.f10846w.mo3680h(abstractC2749E.f10896c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC2749E + RecyclerView.this.m13151Q());
        }

        /* JADX INFO: renamed from: M */
        void m13517M(int i7, int i8) {
            int i9;
            int i10 = i8 + i7;
            for (int size = this.f10973c.size() - 1; size >= 0; size--) {
                AbstractC2749E abstractC2749E = (AbstractC2749E) this.f10973c.get(size);
                if (abstractC2749E != null && (i9 = abstractC2749E.f10896c) >= i7 && i9 < i10) {
                    abstractC2749E.m13269d(2);
                    m13506A(size);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void m13518a(AbstractC2749E abstractC2749E, boolean z7) {
            RecyclerView.m13122s(abstractC2749E);
            View view = abstractC2749E.f10894a;
            C2795n c2795n = RecyclerView.this.f10853z0;
            if (c2795n != null) {
                C1032a c1032aM13871n = c2795n.m13871n();
                AbstractC1030Z.m4474j0(view, c1032aM13871n instanceof C2795n.a ? ((C2795n.a) c1032aM13871n).m13873n(view) : null);
            }
            if (z7) {
                m13523g(abstractC2749E);
            }
            abstractC2749E.f10912s = null;
            abstractC2749E.f10911r = null;
            m13525i().m13498i(abstractC2749E);
        }

        /* JADX INFO: renamed from: c */
        public void m13519c() {
            this.f10971a.clear();
            m13540z();
        }

        /* JADX INFO: renamed from: d */
        void m13520d() {
            int size = this.f10973c.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC2749E) this.f10973c.get(i7)).m13270e();
            }
            int size2 = this.f10971a.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((AbstractC2749E) this.f10971a.get(i8)).m13270e();
            }
            ArrayList arrayList = this.f10972b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    ((AbstractC2749E) this.f10972b.get(i9)).m13270e();
                }
            }
        }

        /* JADX INFO: renamed from: e */
        void m13521e() {
            this.f10971a.clear();
            ArrayList arrayList = this.f10972b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* JADX INFO: renamed from: f */
        public int m13522f(int i7) {
            if (i7 >= 0 && i7 < RecyclerView.this.f10839s0.m13239b()) {
                return !RecyclerView.this.f10839s0.m13242e() ? i7 : RecyclerView.this.f10819d.m13667m(i7);
            }
            throw new IndexOutOfBoundsException("invalid position " + i7 + ". State item count is " + RecyclerView.this.f10839s0.m13239b() + RecyclerView.this.m13151Q());
        }

        /* JADX INFO: renamed from: g */
        void m13523g(AbstractC2749E abstractC2749E) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f10850y.size() > 0) {
                AbstractC2263x.m9328a(RecyclerView.this.f10850y.get(0));
                throw null;
            }
            AbstractC2757h abstractC2757h = RecyclerView.this.f10846w;
            if (abstractC2757h != null) {
                abstractC2757h.mo3687x(abstractC2749E);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10839s0 != null) {
                recyclerView.f10823f.m13922q(abstractC2749E);
            }
        }

        /* JADX INFO: renamed from: h */
        AbstractC2749E m13524h(int i7) {
            int size;
            int iM13667m;
            ArrayList arrayList = this.f10972b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    AbstractC2749E abstractC2749E = (AbstractC2749E) this.f10972b.get(i8);
                    if (!abstractC2749E.m13267P() && abstractC2749E.m13281q() == i7) {
                        abstractC2749E.m13269d(32);
                        return abstractC2749E;
                    }
                }
                if (RecyclerView.this.f10846w.m13321k() && (iM13667m = RecyclerView.this.f10819d.m13667m(i7)) > 0 && iM13667m < RecyclerView.this.f10846w.mo8548g()) {
                    long jMo3680h = RecyclerView.this.f10846w.mo3680h(iM13667m);
                    for (int i9 = 0; i9 < size; i9++) {
                        AbstractC2749E abstractC2749E2 = (AbstractC2749E) this.f10972b.get(i9);
                        if (!abstractC2749E2.m13267P() && abstractC2749E2.m13279o() == jMo3680h) {
                            abstractC2749E2.m13269d(32);
                            return abstractC2749E2;
                        }
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        C2771v m13525i() {
            if (this.f10977g == null) {
                this.f10977g = new C2771v();
            }
            return this.f10977g;
        }

        /* JADX INFO: renamed from: j */
        int m13526j() {
            return this.f10971a.size();
        }

        /* JADX INFO: renamed from: k */
        public List m13527k() {
            return this.f10974d;
        }

        /* JADX INFO: renamed from: l */
        AbstractC2749E m13528l(long j7, int i7, boolean z7) {
            for (int size = this.f10971a.size() - 1; size >= 0; size--) {
                AbstractC2749E abstractC2749E = (AbstractC2749E) this.f10971a.get(size);
                if (abstractC2749E.m13279o() == j7 && !abstractC2749E.m13267P()) {
                    if (i7 == abstractC2749E.m13280p()) {
                        abstractC2749E.m13269d(32);
                        if (abstractC2749E.m13290z() && !RecyclerView.this.f10839s0.m13242e()) {
                            abstractC2749E.m13261J(2, 14);
                        }
                        return abstractC2749E;
                    }
                    if (!z7) {
                        this.f10971a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC2749E.f10894a, false);
                        m13539y(abstractC2749E.f10894a);
                    }
                }
            }
            int size2 = this.f10973c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC2749E abstractC2749E2 = (AbstractC2749E) this.f10973c.get(size2);
                if (abstractC2749E2.m13279o() == j7 && !abstractC2749E2.m13286v()) {
                    if (i7 == abstractC2749E2.m13280p()) {
                        if (!z7) {
                            this.f10973c.remove(size2);
                        }
                        return abstractC2749E2;
                    }
                    if (!z7) {
                        m13506A(size2);
                        return null;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: m */
        AbstractC2749E m13529m(int i7, boolean z7) {
            View viewM13685e;
            int size = this.f10971a.size();
            for (int i8 = 0; i8 < size; i8++) {
                AbstractC2749E abstractC2749E = (AbstractC2749E) this.f10971a.get(i8);
                if (!abstractC2749E.m13267P() && abstractC2749E.m13281q() == i7 && !abstractC2749E.m13288x() && (RecyclerView.this.f10839s0.f10876h || !abstractC2749E.m13290z())) {
                    abstractC2749E.m13269d(32);
                    return abstractC2749E;
                }
            }
            if (z7 || (viewM13685e = RecyclerView.this.f10821e.m13685e(i7)) == null) {
                int size2 = this.f10973c.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    AbstractC2749E abstractC2749E2 = (AbstractC2749E) this.f10973c.get(i9);
                    if (!abstractC2749E2.m13288x() && abstractC2749E2.m13281q() == i7 && !abstractC2749E2.m13286v()) {
                        if (!z7) {
                            this.f10973c.remove(i9);
                        }
                        return abstractC2749E2;
                    }
                }
                return null;
            }
            AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(viewM13685e);
            RecyclerView.this.f10821e.m13697s(viewM13685e);
            int iM13691m = RecyclerView.this.f10821e.m13691m(viewM13685e);
            if (iM13691m != -1) {
                RecyclerView.this.f10821e.m13684d(iM13691m);
                m13509D(viewM13685e);
                abstractC2749EM13111h0.m13269d(8224);
                return abstractC2749EM13111h0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC2749EM13111h0 + RecyclerView.this.m13151Q());
        }

        /* JADX INFO: renamed from: n */
        View m13530n(int i7) {
            return ((AbstractC2749E) this.f10971a.get(i7)).f10894a;
        }

        /* JADX INFO: renamed from: o */
        public View m13531o(int i7) {
            return m13532p(i7, false);
        }

        /* JADX INFO: renamed from: p */
        View m13532p(int i7, boolean z7) {
            return m13513I(i7, z7, Long.MAX_VALUE).f10894a;
        }

        /* JADX INFO: renamed from: s */
        void m13533s() {
            int size = this.f10973c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C2766q c2766q = (C2766q) ((AbstractC2749E) this.f10973c.get(i7)).f10894a.getLayoutParams();
                if (c2766q != null) {
                    c2766q.f10963c = true;
                }
            }
        }

        /* JADX INFO: renamed from: t */
        void m13534t() {
            int size = this.f10973c.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC2749E abstractC2749E = (AbstractC2749E) this.f10973c.get(i7);
                if (abstractC2749E != null) {
                    abstractC2749E.m13269d(6);
                    abstractC2749E.m13268c(null);
                }
            }
            AbstractC2757h abstractC2757h = RecyclerView.this.f10846w;
            if (abstractC2757h == null || !abstractC2757h.m13321k()) {
                m13540z();
            }
        }

        /* JADX INFO: renamed from: u */
        void m13535u(int i7, int i8) {
            int size = this.f10973c.size();
            for (int i9 = 0; i9 < size; i9++) {
                AbstractC2749E abstractC2749E = (AbstractC2749E) this.f10973c.get(i9);
                if (abstractC2749E != null && abstractC2749E.f10896c >= i7) {
                    abstractC2749E.m13256E(i8, false);
                }
            }
        }

        /* JADX INFO: renamed from: v */
        void m13536v(int i7, int i8) {
            int i9;
            int i10;
            int i11;
            int i12;
            if (i7 < i8) {
                i9 = -1;
                i11 = i7;
                i10 = i8;
            } else {
                i9 = 1;
                i10 = i7;
                i11 = i8;
            }
            int size = this.f10973c.size();
            for (int i13 = 0; i13 < size; i13++) {
                AbstractC2749E abstractC2749E = (AbstractC2749E) this.f10973c.get(i13);
                if (abstractC2749E != null && (i12 = abstractC2749E.f10896c) >= i11 && i12 <= i10) {
                    if (i12 == i7) {
                        abstractC2749E.m13256E(i8 - i7, false);
                    } else {
                        abstractC2749E.m13256E(i9, false);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: w */
        void m13537w(int i7, int i8, boolean z7) {
            int i9 = i7 + i8;
            for (int size = this.f10973c.size() - 1; size >= 0; size--) {
                AbstractC2749E abstractC2749E = (AbstractC2749E) this.f10973c.get(size);
                if (abstractC2749E != null) {
                    int i10 = abstractC2749E.f10896c;
                    if (i10 >= i9) {
                        abstractC2749E.m13256E(-i8, z7);
                    } else if (i10 >= i7) {
                        abstractC2749E.m13269d(8);
                        m13506A(size);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: x */
        void m13538x(AbstractC2757h abstractC2757h, AbstractC2757h abstractC2757h2, boolean z7) {
            m13519c();
            m13525i().m13497h(abstractC2757h, abstractC2757h2, z7);
        }

        /* JADX INFO: renamed from: y */
        void m13539y(View view) {
            AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(view);
            abstractC2749EM13111h0.f10907n = null;
            abstractC2749EM13111h0.f10908o = false;
            abstractC2749EM13111h0.m13272g();
            m13508C(abstractC2749EM13111h0);
        }

        /* JADX INFO: renamed from: z */
        void m13540z() {
            for (int size = this.f10973c.size() - 1; size >= 0; size--) {
                m13506A(size);
            }
            this.f10973c.clear();
            if (RecyclerView.f10773Q0) {
                RecyclerView.this.f10837r0.m13751b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public interface InterfaceC2773x {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y */
    private class C2774y extends AbstractC2759j {
        C2774y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2759j
        /* JADX INFO: renamed from: a */
        public void mo3689a() {
            RecyclerView.this.m13190p(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10839s0.f10875g = true;
            recyclerView.m13153R0(true);
            if (RecyclerView.this.f10819d.m13670p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2759j
        /* JADX INFO: renamed from: b */
        public void mo3690b(int i7, int i8, Object obj) {
            RecyclerView.this.m13190p(null);
            if (RecyclerView.this.f10819d.m13672r(i7, i8, obj)) {
                m13541d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2759j
        /* JADX INFO: renamed from: c */
        public void mo3691c(int i7, int i8, int i9) {
            RecyclerView.this.m13190p(null);
            if (RecyclerView.this.f10819d.m13673s(i7, i8, i9)) {
                m13541d();
            }
        }

        /* JADX INFO: renamed from: d */
        void m13541d() {
            if (RecyclerView.f10772P0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f10784D && recyclerView.f10782C) {
                    AbstractC1030Z.m4458b0(recyclerView, recyclerView.f10838s);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f10800L = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f10776T0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f10777U0 = new InterpolatorC2752c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: A0 */
    private void m13086A0(int i7, int i8, MotionEvent motionEvent, int i9) {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10794I) {
            return;
        }
        int[] iArr = this.f10789F0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zMo13060q = abstractC2765p.mo13060q();
        boolean zMo13062r = this.f10848x.mo13062r();
        m13203u1(zMo13062r ? (zMo13060q ? 1 : 0) | 2 : zMo13060q ? 1 : 0, i9);
        if (m13134G(zMo13060q ? i7 : 0, zMo13062r ? i8 : 0, this.f10789F0, this.f10785D0, i9)) {
            int[] iArr2 = this.f10789F0;
            i7 -= iArr2[0];
            i8 -= iArr2[1];
        }
        m13177i1(zMo13060q ? i7 : 0, zMo13062r ? i8 : 0, motionEvent, i9);
        RunnableC2786e runnableC2786e = this.f10835q0;
        if (runnableC2786e != null && (i7 != 0 || i8 != 0)) {
            runnableC2786e.m13747f(this, i7, i8);
        }
        m13207w1(i9);
    }

    /* JADX INFO: renamed from: B */
    private void m13087B() {
        int i7 = this.f10798K;
        this.f10798K = 0;
        if (i7 == 0 || !m13202u0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AbstractC1153b.m4980b(accessibilityEventObtain, i7);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    /* JADX INFO: renamed from: D */
    private void m13088D() {
        this.f10839s0.m13238a(1);
        m13152R(this.f10839s0);
        this.f10839s0.f10878j = false;
        m13200t1();
        this.f10823f.m13912f();
        m13139I0();
        m13094Q0();
        m13110g1();
        C2746B c2746b = this.f10839s0;
        c2746b.f10877i = c2746b.f10879k && this.f10847w0;
        this.f10847w0 = false;
        this.f10845v0 = false;
        c2746b.f10876h = c2746b.f10880l;
        c2746b.f10874f = this.f10846w.mo8548g();
        m13099W(this.f10781B0);
        if (this.f10839s0.f10879k) {
            int iM13687g = this.f10821e.m13687g();
            for (int i7 = 0; i7 < iM13687g; i7++) {
                AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13686f(i7));
                if (!abstractC2749EM13111h0.m13265N() && (!abstractC2749EM13111h0.m13288x() || this.f10846w.m13321k())) {
                    this.f10823f.m13911e(abstractC2749EM13111h0, this.f10814a0.m13357u(this.f10839s0, abstractC2749EM13111h0, AbstractC2762m.m13337e(abstractC2749EM13111h0), abstractC2749EM13111h0.m13283s()));
                    if (this.f10839s0.f10877i && abstractC2749EM13111h0.m13254C() && !abstractC2749EM13111h0.m13290z() && !abstractC2749EM13111h0.m13265N() && !abstractC2749EM13111h0.m13288x()) {
                        this.f10823f.m13909c(m13171e0(abstractC2749EM13111h0), abstractC2749EM13111h0);
                    }
                }
            }
        }
        if (this.f10839s0.f10880l) {
            m13175h1();
            C2746B c2746b2 = this.f10839s0;
            boolean z7 = c2746b2.f10875g;
            c2746b2.f10875g = false;
            this.f10848x.mo12986c1(this.f10815b, c2746b2);
            this.f10839s0.f10875g = z7;
            for (int i8 = 0; i8 < this.f10821e.m13687g(); i8++) {
                AbstractC2749E abstractC2749EM13111h1 = m13111h0(this.f10821e.m13686f(i8));
                if (!abstractC2749EM13111h1.m13265N() && !this.f10823f.m13915i(abstractC2749EM13111h1)) {
                    int iM13337e = AbstractC2762m.m13337e(abstractC2749EM13111h1);
                    boolean zM13284t = abstractC2749EM13111h1.m13284t(8192);
                    if (!zM13284t) {
                        iM13337e |= 4096;
                    }
                    AbstractC2762m.c cVarM13357u = this.f10814a0.m13357u(this.f10839s0, abstractC2749EM13111h1, iM13337e, abstractC2749EM13111h1.m13283s());
                    if (zM13284t) {
                        m13156T0(abstractC2749EM13111h1, cVarM13357u);
                    } else {
                        this.f10823f.m13907a(abstractC2749EM13111h1, cVarM13357u);
                    }
                }
            }
            m13198t();
        } else {
            m13198t();
        }
        m13141J0();
        m13206v1(false);
        this.f10839s0.f10873e = 2;
    }

    /* JADX INFO: renamed from: E */
    private void m13089E() {
        m13200t1();
        m13139I0();
        this.f10839s0.m13238a(6);
        this.f10819d.m13665j();
        this.f10839s0.f10874f = this.f10846w.mo8548g();
        this.f10839s0.f10872d = 0;
        if (this.f10817c != null && this.f10846w.m13317d()) {
            Parcelable parcelable = this.f10817c.f10980c;
            if (parcelable != null) {
                this.f10848x.mo13055h1(parcelable);
            }
            this.f10817c = null;
        }
        C2746B c2746b = this.f10839s0;
        c2746b.f10876h = false;
        this.f10848x.mo12986c1(this.f10815b, c2746b);
        C2746B c2746b2 = this.f10839s0;
        c2746b2.f10875g = false;
        c2746b2.f10879k = c2746b2.f10879k && this.f10814a0 != null;
        c2746b2.f10873e = 4;
        m13141J0();
        m13206v1(false);
    }

    /* JADX INFO: renamed from: F */
    private void m13090F() {
        RecyclerView recyclerView;
        this.f10839s0.m13238a(4);
        m13200t1();
        m13139I0();
        C2746B c2746b = this.f10839s0;
        c2746b.f10873e = 1;
        if (c2746b.f10879k) {
            for (int iM13687g = this.f10821e.m13687g() - 1; iM13687g >= 0; iM13687g--) {
                AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13686f(iM13687g));
                if (!abstractC2749EM13111h0.m13265N()) {
                    long jM13171e0 = m13171e0(abstractC2749EM13111h0);
                    AbstractC2762m.c cVarM13356t = this.f10814a0.m13356t(this.f10839s0, abstractC2749EM13111h0);
                    AbstractC2749E abstractC2749EM13913g = this.f10823f.m13913g(jM13171e0);
                    if (abstractC2749EM13913g == null || abstractC2749EM13913g.m13265N()) {
                        this.f10823f.m13910d(abstractC2749EM13111h0, cVarM13356t);
                    } else {
                        boolean zM13914h = this.f10823f.m13914h(abstractC2749EM13913g);
                        boolean zM13914h2 = this.f10823f.m13914h(abstractC2749EM13111h0);
                        if (zM13914h && abstractC2749EM13913g == abstractC2749EM13111h0) {
                            this.f10823f.m13910d(abstractC2749EM13111h0, cVarM13356t);
                        } else {
                            AbstractC2762m.c cVarM13919n = this.f10823f.m13919n(abstractC2749EM13913g);
                            this.f10823f.m13910d(abstractC2749EM13111h0, cVarM13356t);
                            AbstractC2762m.c cVarM13918m = this.f10823f.m13918m(abstractC2749EM13111h0);
                            if (cVarM13919n == null) {
                                m13116m0(jM13171e0, abstractC2749EM13111h0, abstractC2749EM13913g);
                            } else {
                                m13117n(abstractC2749EM13913g, abstractC2749EM13111h0, cVarM13919n, cVarM13918m, zM13914h, zM13914h2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f10823f.m13920o(recyclerView.f10801L0);
        } else {
            recyclerView = this;
        }
        recyclerView.f10848x.m13455q1(recyclerView.f10815b);
        C2746B c2746b2 = recyclerView.f10839s0;
        c2746b2.f10871c = c2746b2.f10874f;
        recyclerView.f10804O = false;
        recyclerView.f10805P = false;
        c2746b2.f10879k = false;
        c2746b2.f10880l = false;
        recyclerView.f10848x.f10944h = false;
        ArrayList arrayList = recyclerView.f10815b.f10972b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC2765p abstractC2765p = recyclerView.f10848x;
        if (abstractC2765p.f10950n) {
            abstractC2765p.f10949m = 0;
            abstractC2765p.f10950n = false;
            recyclerView.f10815b.m13515K();
        }
        recyclerView.f10848x.mo12987d1(recyclerView.f10839s0);
        m13141J0();
        m13206v1(false);
        recyclerView.f10823f.m13912f();
        int[] iArr = recyclerView.f10781B0;
        if (m13125y(iArr[0], iArr[1])) {
            m13140J(0, 0);
        }
        m13096U0();
        m13106e1();
    }

    /* JADX INFO: renamed from: L */
    private boolean m13091L(MotionEvent motionEvent) {
        InterfaceC2769t interfaceC2769t = this.f10780B;
        if (interfaceC2769t == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m13097V(motionEvent);
        }
        interfaceC2769t.mo13485a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f10780B = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    private void m13092L0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10818c0) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f10818c0 = motionEvent.getPointerId(i7);
            int x7 = (int) (motionEvent.getX(i7) + 0.5f);
            this.f10825g0 = x7;
            this.f10822e0 = x7;
            int y7 = (int) (motionEvent.getY(i7) + 0.5f);
            this.f10826h0 = y7;
            this.f10824f0 = y7;
        }
    }

    /* JADX INFO: renamed from: P0 */
    private boolean m13093P0() {
        return this.f10814a0 != null && this.f10848x.mo12975Q1();
    }

    /* JADX INFO: renamed from: Q0 */
    private void m13094Q0() {
        boolean z7;
        if (this.f10804O) {
            this.f10819d.m13676w();
            if (this.f10805P) {
                this.f10848x.mo12980X0(this);
            }
        }
        if (m13093P0()) {
            this.f10819d.m13674u();
        } else {
            this.f10819d.m13665j();
        }
        boolean z8 = this.f10845v0 || this.f10847w0;
        this.f10839s0.f10879k = this.f10788F && this.f10814a0 != null && ((z7 = this.f10804O) || z8 || this.f10848x.f10944h) && (!z7 || this.f10846w.m13321k());
        C2746B c2746b = this.f10839s0;
        c2746b.f10880l = c2746b.f10879k && z8 && !this.f10804O && m13093P0();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    /* JADX INFO: renamed from: S0 */
    private void m13095S0(float f7, float f8, float f9, float f10) {
        boolean z7;
        boolean z8 = true;
        if (f8 >= 0.0f) {
            if (f8 > 0.0f) {
                m13148O();
                AbstractC2453d.m10730c(this.f10811V, f8 / getWidth(), f9 / getHeight());
            } else {
                z7 = false;
            }
            if (f10 < 0.0f) {
                m13150P();
                AbstractC2453d.m10730c(this.f10810U, (-f10) / getHeight(), f7 / getWidth());
            } else if (f10 > 0.0f) {
                m13144M();
                AbstractC2453d.m10730c(this.f10812W, f10 / getHeight(), 1.0f - (f7 / getWidth()));
            } else {
                z8 = z7;
            }
            if (z8 && f8 == 0.0f && f10 == 0.0f) {
                return;
            }
            AbstractC1030Z.m4456a0(this);
        }
        m13146N();
        AbstractC2453d.m10730c(this.f10809T, (-f8) / getWidth(), 1.0f - (f9 / getHeight()));
        z7 = true;
        if (f10 < 0.0f) {
            m13150P();
            AbstractC2453d.m10730c(this.f10810U, (-f10) / getHeight(), f7 / getWidth());
        } else if (f10 > 0.0f) {
            m13144M();
            AbstractC2453d.m10730c(this.f10812W, f10 / getHeight(), 1.0f - (f7 / getWidth()));
        } else {
            z8 = z7;
        }
        if (z8) {
        }
        AbstractC1030Z.m4456a0(this);
    }

    /* JADX INFO: renamed from: U0 */
    private void m13096U0() {
        View viewFindViewById;
        if (!this.f10833o0 || this.f10846w == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f10775S0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f10821e.m13692n(focusedChild)) {
                    return;
                }
            } else if (this.f10821e.m13687g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewM13101Y = null;
        AbstractC2749E abstractC2749EM13164a0 = (this.f10839s0.f10882n == -1 || !this.f10846w.m13321k()) ? null : m13164a0(this.f10839s0.f10882n);
        if (abstractC2749EM13164a0 != null && !this.f10821e.m13692n(abstractC2749EM13164a0.f10894a) && abstractC2749EM13164a0.f10894a.hasFocusable()) {
            viewM13101Y = abstractC2749EM13164a0.f10894a;
        } else if (this.f10821e.m13687g() > 0) {
            viewM13101Y = m13101Y();
        }
        if (viewM13101Y != null) {
            int i7 = this.f10839s0.f10883o;
            if (i7 != -1 && (viewFindViewById = viewM13101Y.findViewById(i7)) != null && viewFindViewById.isFocusable()) {
                viewM13101Y = viewFindViewById;
            }
            viewM13101Y.requestFocus();
        }
    }

    /* JADX INFO: renamed from: V */
    private boolean m13097V(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f10778A.size();
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC2769t interfaceC2769t = (InterfaceC2769t) this.f10778A.get(i7);
            if (interfaceC2769t.mo13486c(this, motionEvent) && action != 3) {
                this.f10780B = interfaceC2769t;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V0 */
    private void m13098V0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f10809T;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f10809T.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f10810U;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f10810U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10811V;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f10811V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10812W;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f10812W.isFinished();
        }
        if (zIsFinished) {
            AbstractC1030Z.m4456a0(this);
        }
    }

    /* JADX INFO: renamed from: W */
    private void m13099W(int[] iArr) {
        int iM13687g = this.f10821e.m13687g();
        if (iM13687g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i7 = C3553a.e.API_PRIORITY_OTHER;
        int i8 = Integer.MIN_VALUE;
        for (int i9 = 0; i9 < iM13687g; i9++) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13686f(i9));
            if (!abstractC2749EM13111h0.m13265N()) {
                int iM13281q = abstractC2749EM13111h0.m13281q();
                if (iM13281q < i7) {
                    i7 = iM13281q;
                }
                if (iM13281q > i8) {
                    i8 = iM13281q;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
    }

    /* JADX INFO: renamed from: X */
    static RecyclerView m13100X(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            RecyclerView recyclerViewM13100X = m13100X(viewGroup.getChildAt(i7));
            if (recyclerViewM13100X != null) {
                return recyclerViewM13100X;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Y */
    private View m13101Y() {
        AbstractC2749E abstractC2749EM13161Z;
        C2746B c2746b = this.f10839s0;
        int i7 = c2746b.f10881m;
        if (i7 == -1) {
            i7 = 0;
        }
        int iM13239b = c2746b.m13239b();
        for (int i8 = i7; i8 < iM13239b; i8++) {
            AbstractC2749E abstractC2749EM13161Z2 = m13161Z(i8);
            if (abstractC2749EM13161Z2 == null) {
                break;
            }
            if (abstractC2749EM13161Z2.f10894a.hasFocusable()) {
                return abstractC2749EM13161Z2.f10894a;
            }
        }
        int iMin = Math.min(iM13239b, i7);
        do {
            iMin--;
            if (iMin < 0 || (abstractC2749EM13161Z = m13161Z(iMin)) == null) {
                return null;
            }
        } while (!abstractC2749EM13161Z.f10894a.hasFocusable());
        return abstractC2749EM13161Z.f10894a;
    }

    /* JADX INFO: renamed from: d1 */
    private void m13104d1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f10840t.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C2766q) {
            C2766q c2766q = (C2766q) layoutParams;
            if (!c2766q.f10963c) {
                Rect rect = c2766q.f10962b;
                Rect rect2 = this.f10840t;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f10840t);
            offsetRectIntoDescendantCoords(view, this.f10840t);
        }
        this.f10848x.mo13468x1(this, view, this.f10840t, !this.f10788F, view2 == null);
    }

    /* JADX INFO: renamed from: e1 */
    private void m13106e1() {
        C2746B c2746b = this.f10839s0;
        c2746b.f10882n = -1L;
        c2746b.f10881m = -1;
        c2746b.f10883o = -1;
    }

    /* JADX INFO: renamed from: f1 */
    private void m13108f1() {
        VelocityTracker velocityTracker = this.f10820d0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m13207w1(0);
        m13098V0();
    }

    /* JADX INFO: renamed from: g */
    private void m13109g(AbstractC2749E abstractC2749E) {
        View view = abstractC2749E.f10894a;
        boolean z7 = view.getParent() == this;
        this.f10815b.m13514J(m13173g0(view));
        if (abstractC2749E.m13253B()) {
            this.f10821e.m13683c(view, -1, view.getLayoutParams(), true);
        } else if (z7) {
            this.f10821e.m13690k(view);
        } else {
            this.f10821e.m13682b(view, true);
        }
    }

    /* JADX INFO: renamed from: g1 */
    private void m13110g1() {
        int iM13276l;
        View focusedChild = (this.f10833o0 && hasFocus() && this.f10846w != null) ? getFocusedChild() : null;
        AbstractC2749E abstractC2749EM13157U = focusedChild != null ? m13157U(focusedChild) : null;
        if (abstractC2749EM13157U == null) {
            m13106e1();
            return;
        }
        this.f10839s0.f10882n = this.f10846w.m13321k() ? abstractC2749EM13157U.m13279o() : -1L;
        C2746B c2746b = this.f10839s0;
        if (this.f10804O) {
            iM13276l = -1;
        } else {
            iM13276l = abstractC2749EM13157U.m13290z() ? abstractC2749EM13157U.f10897d : abstractC2749EM13157U.m13276l();
        }
        c2746b.f10881m = iM13276l;
        this.f10839s0.f10883o = m13113j0(abstractC2749EM13157U.f10894a);
    }

    private C0985C getScrollingChildHelper() {
        if (this.f10783C0 == null) {
            this.f10783C0 = new C0985C(this);
        }
        return this.f10783C0;
    }

    /* JADX INFO: renamed from: h0 */
    static AbstractC2749E m13111h0(View view) {
        if (view == null) {
            return null;
        }
        return ((C2766q) view.getLayoutParams()).f10961a;
    }

    /* JADX INFO: renamed from: i0 */
    static void m13112i0(View view, Rect rect) {
        C2766q c2766q = (C2766q) view.getLayoutParams();
        Rect rect2 = c2766q.f10962b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c2766q).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c2766q).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c2766q).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c2766q).bottomMargin);
    }

    /* JADX INFO: renamed from: j0 */
    private int m13113j0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* JADX INFO: renamed from: k0 */
    private String m13114k0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    /* JADX INFO: renamed from: l1 */
    private void m13115l1(AbstractC2757h abstractC2757h, boolean z7, boolean z8) {
        AbstractC2757h abstractC2757h2 = this.f10846w;
        if (abstractC2757h2 != null) {
            abstractC2757h2.m13315A(this.f10813a);
            this.f10846w.mo3684t(this);
        }
        if (!z7 || z8) {
            m13158W0();
        }
        this.f10819d.m13676w();
        AbstractC2757h abstractC2757h3 = this.f10846w;
        this.f10846w = abstractC2757h;
        if (abstractC2757h != null) {
            abstractC2757h.m13328y(this.f10813a);
            abstractC2757h.mo3681p(this);
        }
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            abstractC2765p.mo13396J0(abstractC2757h3, this.f10846w);
        }
        this.f10815b.m13538x(abstractC2757h3, this.f10846w, z7);
        this.f10839s0.f10875g = true;
    }

    /* JADX INFO: renamed from: m0 */
    private void m13116m0(long j7, AbstractC2749E abstractC2749E, AbstractC2749E abstractC2749E2) {
        int iM13687g = this.f10821e.m13687g();
        for (int i7 = 0; i7 < iM13687g; i7++) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13686f(i7));
            if (abstractC2749EM13111h0 != abstractC2749E && m13171e0(abstractC2749EM13111h0) == j7) {
                AbstractC2757h abstractC2757h = this.f10846w;
                if (abstractC2757h == null || !abstractC2757h.m13321k()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC2749EM13111h0 + " \n View Holder 2:" + abstractC2749E + m13151Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + abstractC2749EM13111h0 + " \n View Holder 2:" + abstractC2749E + m13151Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC2749E2 + " cannot be found but it is necessary for " + abstractC2749E + m13151Q());
    }

    /* JADX INFO: renamed from: n */
    private void m13117n(AbstractC2749E abstractC2749E, AbstractC2749E abstractC2749E2, AbstractC2762m.c cVar, AbstractC2762m.c cVar2, boolean z7, boolean z8) {
        abstractC2749E.m13262K(false);
        if (z7) {
            m13109g(abstractC2749E);
        }
        if (abstractC2749E != abstractC2749E2) {
            if (z8) {
                m13109g(abstractC2749E2);
            }
            abstractC2749E.f10901h = abstractC2749E2;
            m13109g(abstractC2749E);
            this.f10815b.m13514J(abstractC2749E);
            abstractC2749E2.m13262K(false);
            abstractC2749E2.f10902i = abstractC2749E;
        }
        if (this.f10814a0.mo13339b(abstractC2749E, abstractC2749E2, cVar, cVar2)) {
            m13149O0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m13118o0() {
        int iM13687g = this.f10821e.m13687g();
        for (int i7 = 0; i7 < iM13687g; i7++) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13686f(i7));
            if (abstractC2749EM13111h0 != null && !abstractC2749EM13111h0.m13265N() && abstractC2749EM13111h0.m13254C()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q0 */
    private void m13119q0() {
        if (AbstractC1030Z.m4503y(this) == 0) {
            AbstractC1030Z.m4492s0(this, 8);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m13120r() {
        m13108f1();
        setScrollState(0);
    }

    /* JADX INFO: renamed from: r0 */
    private void m13121r0() {
        this.f10821e = new C2783b(new C2754e());
    }

    /* JADX INFO: renamed from: s */
    static void m13122s(AbstractC2749E abstractC2749E) {
        WeakReference weakReference = abstractC2749E.f10895b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC2749E.f10894a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC2749E.f10895b = null;
        }
    }

    /* JADX INFO: renamed from: w */
    private void m13123w(Context context, String str, AttributeSet attributeSet, int i7, int i8) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strM13114k0 = m13114k0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strM13114k0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC2765p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f10776T0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i7), Integer.valueOf(i8)};
                } catch (NoSuchMethodException e7) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e8) {
                        e8.initCause(e7);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strM13114k0, e8);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC2765p) constructor.newInstance(objArr));
            } catch (ClassCastException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strM13114k0, e9);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strM13114k0, e10);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strM13114k0, e11);
            } catch (InstantiationException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM13114k0, e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM13114k0, e13);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    private boolean m13124w0(View view, View view2, int i7) {
        int i8;
        if (view2 == null || view2 == this || view2 == view || m13155T(view2) == null) {
            return false;
        }
        if (view == null || m13155T(view) == null) {
            return true;
        }
        this.f10840t.set(0, 0, view.getWidth(), view.getHeight());
        this.f10842u.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f10840t);
        offsetDescendantRectToMyCoords(view2, this.f10842u);
        byte b7 = -1;
        int i9 = this.f10848x.m13426e0() == 1 ? -1 : 1;
        Rect rect = this.f10840t;
        int i10 = rect.left;
        Rect rect2 = this.f10842u;
        int i11 = rect2.left;
        if ((i10 < i11 || rect.right <= i11) && rect.right < rect2.right) {
            i8 = 1;
        } else {
            int i12 = rect.right;
            int i13 = rect2.right;
            i8 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? -1 : 0;
        }
        int i14 = rect.top;
        int i15 = rect2.top;
        if ((i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom) {
            b7 = 1;
        } else {
            int i16 = rect.bottom;
            int i17 = rect2.bottom;
            if ((i16 <= i17 && i14 < i17) || i14 <= i15) {
                b7 = 0;
            }
        }
        if (i7 == 1) {
            return b7 < 0 || (b7 == 0 && i8 * i9 < 0);
        }
        if (i7 == 2) {
            return b7 > 0 || (b7 == 0 && i8 * i9 > 0);
        }
        if (i7 == 17) {
            return i8 < 0;
        }
        if (i7 == 33) {
            return b7 < 0;
        }
        if (i7 == 66) {
            return i8 > 0;
        }
        if (i7 == 130) {
            return b7 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i7 + m13151Q());
    }

    /* JADX INFO: renamed from: y */
    private boolean m13125y(int i7, int i8) {
        m13099W(this.f10781B0);
        int[] iArr = this.f10781B0;
        return (iArr[0] == i7 && iArr[1] == i8) ? false : true;
    }

    /* JADX INFO: renamed from: y1 */
    private void m13126y1() {
        this.f10834p0.m13250f();
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            abstractC2765p.m13408P1();
        }
    }

    /* JADX INFO: renamed from: A */
    void m13127A(View view) {
        AbstractC2749E abstractC2749EM13111h0 = m13111h0(view);
        m13137H0(view);
        AbstractC2757h abstractC2757h = this.f10846w;
        if (abstractC2757h != null && abstractC2749EM13111h0 != null) {
            abstractC2757h.m13327w(abstractC2749EM13111h0);
        }
        List list = this.f10803N;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC2767r) this.f10803N.get(size)).mo13482b(view);
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m13128B0(int i7) {
        int iM13687g = this.f10821e.m13687g();
        for (int i8 = 0; i8 < iM13687g; i8++) {
            this.f10821e.m13686f(i8).offsetLeftAndRight(i7);
        }
    }

    /* JADX INFO: renamed from: C */
    void m13129C() {
        if (this.f10846w == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f10848x == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f10839s0.f10878j = false;
        boolean z7 = this.f10795I0 && !(this.f10797J0 == getWidth() && this.f10799K0 == getHeight());
        this.f10797J0 = 0;
        this.f10799K0 = 0;
        this.f10795I0 = false;
        if (this.f10839s0.f10873e == 1) {
            m13088D();
            this.f10848x.m13385E1(this);
            m13089E();
        } else if (this.f10819d.m13671q() || z7 || this.f10848x.m13460t0() != getWidth() || this.f10848x.m13424c0() != getHeight()) {
            this.f10848x.m13385E1(this);
            m13089E();
        } else {
            this.f10848x.m13385E1(this);
        }
        m13090F();
    }

    /* JADX INFO: renamed from: C0 */
    public void m13130C0(int i7) {
        int iM13687g = this.f10821e.m13687g();
        for (int i8 = 0; i8 < iM13687g; i8++) {
            this.f10821e.m13686f(i8).offsetTopAndBottom(i7);
        }
    }

    /* JADX INFO: renamed from: D0 */
    void m13131D0(int i7, int i8) {
        int iM13689j = this.f10821e.m13689j();
        for (int i9 = 0; i9 < iM13689j; i9++) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13688i(i9));
            if (abstractC2749EM13111h0 != null && !abstractC2749EM13111h0.m13265N() && abstractC2749EM13111h0.f10896c >= i7) {
                abstractC2749EM13111h0.m13256E(i8, false);
                this.f10839s0.f10875g = true;
            }
        }
        this.f10815b.m13535u(i7, i8);
        requestLayout();
    }

    /* JADX INFO: renamed from: E0 */
    void m13132E0(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int iM13689j = this.f10821e.m13689j();
        if (i7 < i8) {
            i11 = -1;
            i10 = i7;
            i9 = i8;
        } else {
            i9 = i7;
            i10 = i8;
            i11 = 1;
        }
        for (int i13 = 0; i13 < iM13689j; i13++) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13688i(i13));
            if (abstractC2749EM13111h0 != null && (i12 = abstractC2749EM13111h0.f10896c) >= i10 && i12 <= i9) {
                if (i12 == i7) {
                    abstractC2749EM13111h0.m13256E(i8 - i7, false);
                } else {
                    abstractC2749EM13111h0.m13256E(i11, false);
                }
                this.f10839s0.f10875g = true;
            }
        }
        this.f10815b.m13536v(i7, i8);
        requestLayout();
    }

    /* JADX INFO: renamed from: F0 */
    void m13133F0(int i7, int i8, boolean z7) {
        int i9 = i7 + i8;
        int iM13689j = this.f10821e.m13689j();
        for (int i10 = 0; i10 < iM13689j; i10++) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13688i(i10));
            if (abstractC2749EM13111h0 != null && !abstractC2749EM13111h0.m13265N()) {
                int i11 = abstractC2749EM13111h0.f10896c;
                if (i11 >= i9) {
                    abstractC2749EM13111h0.m13256E(-i8, z7);
                    this.f10839s0.f10875g = true;
                } else if (i11 >= i7) {
                    abstractC2749EM13111h0.m13275k(i7 - 1, -i8, z7);
                    this.f10839s0.f10875g = true;
                }
            }
        }
        this.f10815b.m13537w(i7, i8, z7);
        requestLayout();
    }

    /* JADX INFO: renamed from: G */
    public boolean m13134G(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return getScrollingChildHelper().m4343d(i7, i8, iArr, iArr2, i9);
    }

    /* JADX INFO: renamed from: G0 */
    public void m13135G0(View view) {
    }

    /* JADX INFO: renamed from: H */
    public final void m13136H(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        getScrollingChildHelper().m4344e(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    /* JADX INFO: renamed from: H0 */
    public void m13137H0(View view) {
    }

    /* JADX INFO: renamed from: I */
    void m13138I(int i7) {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            abstractC2765p.mo13439j1(i7);
        }
        m13145M0(i7);
        AbstractC2770u abstractC2770u = this.f10841t0;
        if (abstractC2770u != null) {
            abstractC2770u.mo13488a(this, i7);
        }
        List list = this.f10843u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC2770u) this.f10843u0.get(size)).mo13488a(this, i7);
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    void m13139I0() {
        this.f10806Q++;
    }

    /* JADX INFO: renamed from: J */
    void m13140J(int i7, int i8) {
        this.f10807R++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i8);
        m13147N0(i7, i8);
        AbstractC2770u abstractC2770u = this.f10841t0;
        if (abstractC2770u != null) {
            abstractC2770u.mo13489b(this, i7, i8);
        }
        List list = this.f10843u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC2770u) this.f10843u0.get(size)).mo13489b(this, i7, i8);
            }
        }
        this.f10807R--;
    }

    /* JADX INFO: renamed from: J0 */
    void m13141J0() {
        m13143K0(true);
    }

    /* JADX INFO: renamed from: K */
    void m13142K() {
        int i7;
        for (int size = this.f10791G0.size() - 1; size >= 0; size--) {
            AbstractC2749E abstractC2749E = (AbstractC2749E) this.f10791G0.get(size);
            if (abstractC2749E.f10894a.getParent() == this && !abstractC2749E.m13265N() && (i7 = abstractC2749E.f10910q) != -1) {
                AbstractC1030Z.m4488q0(abstractC2749E.f10894a, i7);
                abstractC2749E.f10910q = -1;
            }
        }
        this.f10791G0.clear();
    }

    /* JADX INFO: renamed from: K0 */
    void m13143K0(boolean z7) {
        int i7 = this.f10806Q - 1;
        this.f10806Q = i7;
        if (i7 < 1) {
            this.f10806Q = 0;
            if (z7) {
                m13087B();
                m13142K();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    void m13144M() {
        if (this.f10812W != null) {
            return;
        }
        EdgeEffect edgeEffectM13336a = this.f10808S.m13336a(this, 3);
        this.f10812W = edgeEffectM13336a;
        if (this.f10836r) {
            edgeEffectM13336a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM13336a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m13145M0(int i7) {
    }

    /* JADX INFO: renamed from: N */
    void m13146N() {
        if (this.f10809T != null) {
            return;
        }
        EdgeEffect edgeEffectM13336a = this.f10808S.m13336a(this, 0);
        this.f10809T = edgeEffectM13336a;
        if (this.f10836r) {
            edgeEffectM13336a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM13336a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m13147N0(int i7, int i8) {
    }

    /* JADX INFO: renamed from: O */
    void m13148O() {
        if (this.f10811V != null) {
            return;
        }
        EdgeEffect edgeEffectM13336a = this.f10808S.m13336a(this, 2);
        this.f10811V = edgeEffectM13336a;
        if (this.f10836r) {
            edgeEffectM13336a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM13336a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: O0 */
    void m13149O0() {
        if (this.f10851y0 || !this.f10782C) {
            return;
        }
        AbstractC1030Z.m4458b0(this, this.f10793H0);
        this.f10851y0 = true;
    }

    /* JADX INFO: renamed from: P */
    void m13150P() {
        if (this.f10810U != null) {
            return;
        }
        EdgeEffect edgeEffectM13336a = this.f10808S.m13336a(this, 1);
        this.f10810U = edgeEffectM13336a;
        if (this.f10836r) {
            edgeEffectM13336a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM13336a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: Q */
    String m13151Q() {
        return " " + super.toString() + ", adapter:" + this.f10846w + ", layout:" + this.f10848x + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: R */
    final void m13152R(C2746B c2746b) {
        if (getScrollState() != 2) {
            c2746b.f10884p = 0;
            c2746b.f10885q = 0;
        } else {
            OverScroller overScroller = this.f10834p0.f10888c;
            c2746b.f10884p = overScroller.getFinalX() - overScroller.getCurrX();
            c2746b.f10885q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* JADX INFO: renamed from: R0 */
    void m13153R0(boolean z7) {
        this.f10805P = z7 | this.f10805P;
        this.f10804O = true;
        m13213z0();
    }

    /* JADX INFO: renamed from: S */
    public View m13154S(float f7, float f8) {
        for (int iM13687g = this.f10821e.m13687g() - 1; iM13687g >= 0; iM13687g--) {
            View viewM13686f = this.f10821e.m13686f(iM13687g);
            float translationX = viewM13686f.getTranslationX();
            float translationY = viewM13686f.getTranslationY();
            if (f7 >= viewM13686f.getLeft() + translationX && f7 <= viewM13686f.getRight() + translationX && f8 >= viewM13686f.getTop() + translationY && f8 <= viewM13686f.getBottom() + translationY) {
                return viewM13686f;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: T */
    public View m13155T(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: T0 */
    void m13156T0(AbstractC2749E abstractC2749E, AbstractC2762m.c cVar) {
        abstractC2749E.m13261J(0, 8192);
        if (this.f10839s0.f10877i && abstractC2749E.m13254C() && !abstractC2749E.m13290z() && !abstractC2749E.m13265N()) {
            this.f10823f.m13909c(m13171e0(abstractC2749E), abstractC2749E);
        }
        this.f10823f.m13911e(abstractC2749E, cVar);
    }

    /* JADX INFO: renamed from: U */
    public AbstractC2749E m13157U(View view) {
        View viewM13155T = m13155T(view);
        if (viewM13155T == null) {
            return null;
        }
        return m13173g0(viewM13155T);
    }

    /* JADX INFO: renamed from: W0 */
    void m13158W0() {
        AbstractC2762m abstractC2762m = this.f10814a0;
        if (abstractC2762m != null) {
            abstractC2762m.mo13347k();
        }
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            abstractC2765p.m13453p1(this.f10815b);
            this.f10848x.m13455q1(this.f10815b);
        }
        this.f10815b.m13519c();
    }

    /* JADX INFO: renamed from: X0 */
    boolean m13159X0(View view) {
        m13200t1();
        boolean zM13696r = this.f10821e.m13696r(view);
        if (zM13696r) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(view);
            this.f10815b.m13514J(abstractC2749EM13111h0);
            this.f10815b.m13508C(abstractC2749EM13111h0);
        }
        m13206v1(!zM13696r);
        return zM13696r;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m13160Y0(AbstractC2764o abstractC2764o) {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            abstractC2765p.mo13058m("Cannot remove item decoration during a scroll  or layout");
        }
        this.f10852z.remove(abstractC2764o);
        if (this.f10852z.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m13211y0();
        requestLayout();
    }

    /* JADX INFO: renamed from: Z */
    public AbstractC2749E m13161Z(int i7) {
        AbstractC2749E abstractC2749E = null;
        if (this.f10804O) {
            return null;
        }
        int iM13689j = this.f10821e.m13689j();
        for (int i8 = 0; i8 < iM13689j; i8++) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13688i(i8));
            if (abstractC2749EM13111h0 != null && !abstractC2749EM13111h0.m13290z() && m13170d0(abstractC2749EM13111h0) == i7) {
                if (!this.f10821e.m13692n(abstractC2749EM13111h0.f10894a)) {
                    return abstractC2749EM13111h0;
                }
                abstractC2749E = abstractC2749EM13111h0;
            }
        }
        return abstractC2749E;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m13162Z0(InterfaceC2767r interfaceC2767r) {
        List list = this.f10803N;
        if (list == null) {
            return;
        }
        list.remove(interfaceC2767r);
    }

    /* JADX INFO: renamed from: a */
    void m13163a(int i7, int i8) {
        if (i7 < 0) {
            m13146N();
            if (this.f10809T.isFinished()) {
                this.f10809T.onAbsorb(-i7);
            }
        } else if (i7 > 0) {
            m13148O();
            if (this.f10811V.isFinished()) {
                this.f10811V.onAbsorb(i7);
            }
        }
        if (i8 < 0) {
            m13150P();
            if (this.f10810U.isFinished()) {
                this.f10810U.onAbsorb(-i8);
            }
        } else if (i8 > 0) {
            m13144M();
            if (this.f10812W.isFinished()) {
                this.f10812W.onAbsorb(i8);
            }
        }
        if (i7 == 0 && i8 == 0) {
            return;
        }
        AbstractC1030Z.m4456a0(this);
    }

    /* JADX INFO: renamed from: a0 */
    public AbstractC2749E m13164a0(long j7) {
        AbstractC2757h abstractC2757h = this.f10846w;
        AbstractC2749E abstractC2749E = null;
        if (abstractC2757h != null && abstractC2757h.m13321k()) {
            int iM13689j = this.f10821e.m13689j();
            for (int i7 = 0; i7 < iM13689j; i7++) {
                AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13688i(i7));
                if (abstractC2749EM13111h0 != null && !abstractC2749EM13111h0.m13290z() && abstractC2749EM13111h0.m13279o() == j7) {
                    if (!this.f10821e.m13692n(abstractC2749EM13111h0.f10894a)) {
                        return abstractC2749EM13111h0;
                    }
                    abstractC2749E = abstractC2749EM13111h0;
                }
            }
        }
        return abstractC2749E;
    }

    /* JADX INFO: renamed from: a1 */
    public void m13165a1(InterfaceC2769t interfaceC2769t) {
        this.f10778A.remove(interfaceC2769t);
        if (this.f10780B == interfaceC2769t) {
            this.f10780B = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i7, int i8) {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p == null || !abstractC2765p.m13398K0(this, arrayList, i7, i8)) {
            super.addFocusables(arrayList, i7, i8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b0 */
    AbstractC2749E m13166b0(int i7, boolean z7) {
        int iM13689j = this.f10821e.m13689j();
        AbstractC2749E abstractC2749E = null;
        for (int i8 = 0; i8 < iM13689j; i8++) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13688i(i8));
            if (abstractC2749EM13111h0 != null && !abstractC2749EM13111h0.m13290z()) {
                if (z7) {
                    if (abstractC2749EM13111h0.f10896c != i7) {
                        continue;
                    } else {
                        if (this.f10821e.m13692n(abstractC2749EM13111h0.f10894a)) {
                            return abstractC2749EM13111h0;
                        }
                        abstractC2749E = abstractC2749EM13111h0;
                    }
                } else if (abstractC2749EM13111h0.m13281q() != i7) {
                    continue;
                } else {
                    if (this.f10821e.m13692n(abstractC2749EM13111h0.f10894a)) {
                        return abstractC2749EM13111h0;
                    }
                    abstractC2749E = abstractC2749EM13111h0;
                }
            }
        }
        return abstractC2749E;
    }

    /* JADX INFO: renamed from: b1 */
    public void m13167b1(AbstractC2770u abstractC2770u) {
        List list = this.f10843u0;
        if (list != null) {
            list.remove(abstractC2770u);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: c0 */
    public boolean m13168c0(int i7, int i8) {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f10794I) {
            return false;
        }
        int iMo13060q = abstractC2765p.mo13060q();
        boolean zMo13062r = this.f10848x.mo13062r();
        if (iMo13060q == 0 || Math.abs(i7) < this.f10829k0) {
            i7 = 0;
        }
        if (!zMo13062r || Math.abs(i8) < this.f10829k0) {
            i8 = 0;
        }
        if (i7 == 0 && i8 == 0) {
            return false;
        }
        float f7 = i7;
        float f8 = i8;
        if (!dispatchNestedPreFling(f7, f8)) {
            boolean z7 = iMo13060q != 0 || zMo13062r;
            dispatchNestedFling(f7, f8, z7);
            AbstractC2768s abstractC2768s = this.f10828j0;
            if (abstractC2768s != null && abstractC2768s.mo13484a(i7, i8)) {
                return true;
            }
            if (z7) {
                if (zMo13062r) {
                    iMo13060q = (iMo13060q == true ? 1 : 0) | 2;
                }
                m13203u1(iMo13060q, 1);
                int i9 = this.f10830l0;
                int iMax = Math.max(-i9, Math.min(i7, i9));
                int i10 = this.f10830l0;
                this.f10834p0.m13247b(iMax, Math.max(-i10, Math.min(i8, i10)));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c1 */
    void m13169c1() {
        AbstractC2749E abstractC2749E;
        int iM13687g = this.f10821e.m13687g();
        for (int i7 = 0; i7 < iM13687g; i7++) {
            View viewM13686f = this.f10821e.m13686f(i7);
            AbstractC2749E abstractC2749EM13173g0 = m13173g0(viewM13686f);
            if (abstractC2749EM13173g0 != null && (abstractC2749E = abstractC2749EM13173g0.f10902i) != null) {
                View view = abstractC2749E.f10894a;
                int left = viewM13686f.getLeft();
                int top = viewM13686f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2766q) && this.f10848x.mo12992s((C2766q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null && abstractC2765p.mo13060q()) {
            return this.f10848x.mo13067w(this.f10839s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null && abstractC2765p.mo13060q()) {
            return this.f10848x.mo12995x(this.f10839s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null && abstractC2765p.mo13060q()) {
            return this.f10848x.mo12996y(this.f10839s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null && abstractC2765p.mo13062r()) {
            return this.f10848x.mo13069z(this.f10839s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null && abstractC2765p.mo13062r()) {
            return this.f10848x.mo12965A(this.f10839s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null && abstractC2765p.mo13062r()) {
            return this.f10848x.mo12966B(this.f10839s0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    int m13170d0(AbstractC2749E abstractC2749E) {
        if (abstractC2749E.m13284t(524) || !abstractC2749E.m13287w()) {
            return -1;
        }
        return this.f10819d.m13663e(abstractC2749E.f10896c);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f8, boolean z7) {
        return getScrollingChildHelper().m4340a(f7, f8, z7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return getScrollingChildHelper().m4341b(f7, f8);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m4342c(i7, i8, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().m4345f(i7, i8, i9, i10, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z7;
        super.draw(canvas);
        int size = this.f10852z.size();
        boolean z8 = false;
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC2764o) this.f10852z.get(i7)).mo13369k(canvas, this, this.f10839s0);
        }
        EdgeEffect edgeEffect = this.f10809T;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z7 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f10836r ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f10809T;
            z7 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f10810U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f10836r) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f10810U;
            z7 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f10811V;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f10836r ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f10811V;
            z7 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f10812W;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f10836r) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f10812W;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z8 = true;
            }
            z7 |= z8;
            canvas.restoreToCount(iSave4);
        }
        if ((z7 || this.f10814a0 == null || this.f10852z.size() <= 0 || !this.f10814a0.mo13352p()) ? z7 : true) {
            AbstractC1030Z.m4456a0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    /* JADX INFO: renamed from: e0 */
    long m13171e0(AbstractC2749E abstractC2749E) {
        return this.f10846w.m13321k() ? abstractC2749E.m13279o() : abstractC2749E.f10896c;
    }

    /* JADX INFO: renamed from: f0 */
    public int m13172f0(View view) {
        AbstractC2749E abstractC2749EM13111h0 = m13111h0(view);
        if (abstractC2749EM13111h0 != null) {
            return abstractC2749EM13111h0.m13281q();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i7) {
        View viewMo12974O0;
        boolean z7;
        View viewM13416V0 = this.f10848x.m13416V0(view, i7);
        if (viewM13416V0 != null) {
            return viewM13416V0;
        }
        boolean z8 = (this.f10846w == null || this.f10848x == null || m13205v0() || this.f10794I) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z8 && (i7 == 2 || i7 == 1)) {
            if (this.f10848x.mo13062r()) {
                int i8 = i7 == 2 ? 130 : 33;
                z7 = focusFinder.findNextFocus(this, view, i8) == null;
                if (f10774R0) {
                    i7 = i8;
                }
            } else {
                z7 = false;
            }
            if (!z7 && this.f10848x.mo13060q()) {
                int i9 = (this.f10848x.m13426e0() == 1) ^ (i7 == 2) ? 66 : 17;
                boolean z9 = focusFinder.findNextFocus(this, view, i9) == null;
                if (f10774R0) {
                    i7 = i9;
                }
                z7 = z9;
            }
            if (z7) {
                m13204v();
                if (m13155T(view) == null) {
                    return null;
                }
                m13200t1();
                this.f10848x.mo12974O0(view, i7, this.f10815b, this.f10839s0);
                m13206v1(false);
            }
            viewMo12974O0 = focusFinder.findNextFocus(this, view, i7);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i7);
            if (viewFindNextFocus == null && z8) {
                m13204v();
                if (m13155T(view) == null) {
                    return null;
                }
                m13200t1();
                viewMo12974O0 = this.f10848x.mo12974O0(view, i7, this.f10815b, this.f10839s0);
                m13206v1(false);
            } else {
                viewMo12974O0 = viewFindNextFocus;
            }
        }
        if (viewMo12974O0 == null || viewMo12974O0.hasFocusable()) {
            return m13124w0(view, viewMo12974O0, i7) ? viewMo12974O0 : super.focusSearch(view, i7);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i7);
        }
        m13104d1(viewMo12974O0, null);
        return view;
    }

    /* JADX INFO: renamed from: g0 */
    public AbstractC2749E m13173g0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m13111h0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            return abstractC2765p.mo12971J();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m13151Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            return abstractC2765p.mo12972K(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m13151Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC2757h getAdapter() {
        return this.f10846w;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC2765p abstractC2765p = this.f10848x;
        return abstractC2765p != null ? abstractC2765p.m13401M() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i7, int i8) {
        InterfaceC2760k interfaceC2760k = this.f10779A0;
        return interfaceC2760k == null ? super.getChildDrawingOrder(i7, i8) : interfaceC2760k.m13335a(i7, i8);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f10836r;
    }

    public C2795n getCompatAccessibilityDelegate() {
        return this.f10853z0;
    }

    public C2761l getEdgeEffectFactory() {
        return this.f10808S;
    }

    public AbstractC2762m getItemAnimator() {
        return this.f10814a0;
    }

    public int getItemDecorationCount() {
        return this.f10852z.size();
    }

    public AbstractC2765p getLayoutManager() {
        return this.f10848x;
    }

    public int getMaxFlingVelocity() {
        return this.f10830l0;
    }

    public int getMinFlingVelocity() {
        return this.f10829k0;
    }

    long getNanoTime() {
        if (f10773Q0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC2768s getOnFlingListener() {
        return this.f10828j0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f10833o0;
    }

    public C2771v getRecycledViewPool() {
        return this.f10815b.m13525i();
    }

    public int getScrollState() {
        return this.f10816b0;
    }

    /* JADX INFO: renamed from: h */
    public void m13174h(AbstractC2764o abstractC2764o) {
        m13176i(abstractC2764o, -1);
    }

    /* JADX INFO: renamed from: h1 */
    void m13175h1() {
        int iM13689j = this.f10821e.m13689j();
        for (int i7 = 0; i7 < iM13689j; i7++) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13688i(i7));
            if (!abstractC2749EM13111h0.m13265N()) {
                abstractC2749EM13111h0.m13260I();
            }
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m4346j();
    }

    /* JADX INFO: renamed from: i */
    public void m13176i(AbstractC2764o abstractC2764o, int i7) {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            abstractC2765p.mo13058m("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f10852z.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i7 < 0) {
            this.f10852z.add(abstractC2764o);
        } else {
            this.f10852z.add(i7, abstractC2764o);
        }
        m13211y0();
        requestLayout();
    }

    /* JADX INFO: renamed from: i1 */
    boolean m13177i1(int i7, int i8, MotionEvent motionEvent, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        m13204v();
        if (this.f10846w != null) {
            int[] iArr = this.f10789F0;
            iArr[0] = 0;
            iArr[1] = 0;
            m13179j1(i7, i8, iArr);
            int[] iArr2 = this.f10789F0;
            int i14 = iArr2[0];
            int i15 = iArr2[1];
            i12 = i7 - i14;
            i13 = i8 - i15;
            i11 = i15;
            i10 = i14;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (!this.f10852z.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f10789F0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m13136H(i10, i11, i12, i13, this.f10785D0, i9, iArr3);
        int[] iArr4 = this.f10789F0;
        int i16 = iArr4[0];
        int i17 = i12 - i16;
        int i18 = iArr4[1];
        int i19 = i13 - i18;
        boolean z7 = (i16 == 0 && i18 == 0) ? false : true;
        int i20 = this.f10825g0;
        int[] iArr5 = this.f10785D0;
        int i21 = iArr5[0];
        this.f10825g0 = i20 - i21;
        int i22 = this.f10826h0;
        int i23 = iArr5[1];
        this.f10826h0 = i22 - i23;
        int[] iArr6 = this.f10787E0;
        iArr6[0] = iArr6[0] + i21;
        iArr6[1] = iArr6[1] + i23;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC0981A.m4263b(motionEvent, 8194)) {
                m13095S0(motionEvent.getX(), i17, motionEvent.getY(), i19);
            }
            m13201u(i7, i8);
        }
        if (i10 != 0 || i11 != 0) {
            m13140J(i10, i11);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z7 && i10 == 0 && i11 == 0) ? false : true;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f10782C;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f10794I;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m4348l();
    }

    /* JADX INFO: renamed from: j */
    public void m13178j(InterfaceC2767r interfaceC2767r) {
        if (this.f10803N == null) {
            this.f10803N = new ArrayList();
        }
        this.f10803N.add(interfaceC2767r);
    }

    /* JADX INFO: renamed from: j1 */
    void m13179j1(int i7, int i8, int[] iArr) {
        m13200t1();
        m13139I0();
        AbstractC0723o.m3486a("RV Scroll");
        m13152R(this.f10839s0);
        int iMo12967B1 = i7 != 0 ? this.f10848x.mo12967B1(i7, this.f10815b, this.f10839s0) : 0;
        int iMo12968D1 = i8 != 0 ? this.f10848x.mo12968D1(i8, this.f10815b, this.f10839s0) : 0;
        AbstractC0723o.m3487b();
        m13169c1();
        m13141J0();
        m13206v1(false);
        if (iArr != null) {
            iArr[0] = iMo12967B1;
            iArr[1] = iMo12968D1;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m13180k(InterfaceC2769t interfaceC2769t) {
        this.f10778A.add(interfaceC2769t);
    }

    /* JADX INFO: renamed from: k1 */
    public void m13181k1(int i7) {
        if (this.f10794I) {
            return;
        }
        m13210x1();
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC2765p.mo13033C1(i7);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m13182l(AbstractC2770u abstractC2770u) {
        if (this.f10843u0 == null) {
            this.f10843u0 = new ArrayList();
        }
        this.f10843u0.add(abstractC2770u);
    }

    /* JADX INFO: renamed from: l0 */
    Rect m13183l0(View view) {
        C2766q c2766q = (C2766q) view.getLayoutParams();
        if (!c2766q.f10963c) {
            return c2766q.f10962b;
        }
        if (this.f10839s0.m13242e() && (c2766q.m13479b() || c2766q.m13481d())) {
            return c2766q.f10962b;
        }
        Rect rect = c2766q.f10962b;
        rect.set(0, 0, 0, 0);
        int size = this.f10852z.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f10840t.set(0, 0, 0, 0);
            ((AbstractC2764o) this.f10852z.get(i7)).mo13365g(this.f10840t, view, this, this.f10839s0);
            int i8 = rect.left;
            Rect rect2 = this.f10840t;
            rect.left = i8 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c2766q.f10963c = false;
        return rect;
    }

    /* JADX INFO: renamed from: m */
    void m13184m(AbstractC2749E abstractC2749E, AbstractC2762m.c cVar, AbstractC2762m.c cVar2) {
        abstractC2749E.m13262K(false);
        if (this.f10814a0.mo13338a(abstractC2749E, cVar, cVar2)) {
            m13149O0();
        }
    }

    /* JADX INFO: renamed from: m1 */
    boolean m13185m1(AbstractC2749E abstractC2749E, int i7) {
        if (!m13205v0()) {
            AbstractC1030Z.m4488q0(abstractC2749E.f10894a, i7);
            return true;
        }
        abstractC2749E.f10910q = i7;
        this.f10791G0.add(abstractC2749E);
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m13186n0() {
        return !this.f10788F || this.f10804O || this.f10819d.m13670p();
    }

    /* JADX INFO: renamed from: n1 */
    boolean m13187n1(AccessibilityEvent accessibilityEvent) {
        if (!m13205v0()) {
            return false;
        }
        int iM4979a = accessibilityEvent != null ? AbstractC1153b.m4979a(accessibilityEvent) : 0;
        this.f10798K |= iM4979a != 0 ? iM4979a : 0;
        return true;
    }

    /* JADX INFO: renamed from: o */
    void m13188o(AbstractC2749E abstractC2749E, AbstractC2762m.c cVar, AbstractC2762m.c cVar2) {
        m13109g(abstractC2749E);
        abstractC2749E.m13262K(false);
        if (this.f10814a0.mo13340c(abstractC2749E, cVar, cVar2)) {
            m13149O0();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m13189o1(int i7, int i8) {
        m13192p1(i7, i8, null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f10806Q = 0;
        this.f10782C = true;
        this.f10788F = this.f10788F && !isLayoutRequested();
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            abstractC2765p.m13386F(this);
        }
        this.f10851y0 = false;
        if (f10773Q0) {
            ThreadLocal threadLocal = RunnableC2786e.f11141e;
            RunnableC2786e runnableC2786e = (RunnableC2786e) threadLocal.get();
            this.f10835q0 = runnableC2786e;
            if (runnableC2786e == null) {
                this.f10835q0 = new RunnableC2786e();
                Display displayM4493t = AbstractC1030Z.m4493t(this);
                if (isInEditMode() || displayM4493t == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayM4493t.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC2786e runnableC2786e2 = this.f10835q0;
                runnableC2786e2.f11145c = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC2786e2);
            }
            this.f10835q0.m13746a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC2786e runnableC2786e;
        super.onDetachedFromWindow();
        AbstractC2762m abstractC2762m = this.f10814a0;
        if (abstractC2762m != null) {
            abstractC2762m.mo13347k();
        }
        m13210x1();
        this.f10782C = false;
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            abstractC2765p.m13389G(this, this.f10815b);
        }
        this.f10791G0.clear();
        removeCallbacks(this.f10793H0);
        this.f10823f.m13916j();
        if (!f10773Q0 || (runnableC2786e = this.f10835q0) == null) {
            return;
        }
        runnableC2786e.m13749j(this);
        this.f10835q0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f10852z.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC2764o) this.f10852z.get(i7)).mo13367i(canvas, this, this.f10839s0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f7;
        float axisValue;
        if (this.f10848x != null && !this.f10794I && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f7 = this.f10848x.mo13062r() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f10848x.mo13060q() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f10848x.mo13062r()) {
                    f7 = -axisValue2;
                } else if (this.f10848x.mo13060q()) {
                    axisValue = axisValue2;
                    f7 = 0.0f;
                } else {
                    f7 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f7 = 0.0f;
                axisValue = 0.0f;
            }
            if (f7 != 0.0f || axisValue != 0.0f) {
                m13086A0((int) (axisValue * this.f10831m0), (int) (f7 * this.f10832n0), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        if (this.f10794I) {
            return false;
        }
        this.f10780B = null;
        if (m13097V(motionEvent)) {
            m13120r();
            return true;
        }
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p == null) {
            return false;
        }
        boolean zMo13060q = abstractC2765p.mo13060q();
        boolean zMo13062r = this.f10848x.mo13062r();
        if (this.f10820d0 == null) {
            this.f10820d0 = VelocityTracker.obtain();
        }
        this.f10820d0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f10796J) {
                this.f10796J = false;
            }
            this.f10818c0 = motionEvent.getPointerId(0);
            int x7 = (int) (motionEvent.getX() + 0.5f);
            this.f10825g0 = x7;
            this.f10822e0 = x7;
            int y7 = (int) (motionEvent.getY() + 0.5f);
            this.f10826h0 = y7;
            this.f10824f0 = y7;
            if (this.f10816b0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m13207w1(1);
            }
            int[] iArr = this.f10787E0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i7 = zMo13060q;
            if (zMo13062r) {
                i7 = (zMo13060q ? 1 : 0) | 2;
            }
            m13203u1(i7, 0);
        } else if (actionMasked == 1) {
            this.f10820d0.clear();
            m13207w1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f10818c0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f10818c0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x8 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y8 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f10816b0 != 1) {
                int i8 = x8 - this.f10822e0;
                int i9 = y8 - this.f10824f0;
                if (!zMo13060q || Math.abs(i8) <= this.f10827i0) {
                    z7 = false;
                } else {
                    this.f10825g0 = x8;
                    z7 = true;
                }
                if (zMo13062r && Math.abs(i9) > this.f10827i0) {
                    this.f10826h0 = y8;
                    z7 = true;
                }
                if (z7) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m13120r();
        } else if (actionMasked == 5) {
            this.f10818c0 = motionEvent.getPointerId(actionIndex);
            int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f10825g0 = x9;
            this.f10822e0 = x9;
            int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f10826h0 = y9;
            this.f10824f0 = y9;
        } else if (actionMasked == 6) {
            m13092L0(motionEvent);
        }
        return this.f10816b0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        AbstractC0723o.m3486a("RV OnLayout");
        m13129C();
        AbstractC0723o.m3487b();
        this.f10788F = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p == null) {
            m13208x(i7, i8);
            return;
        }
        boolean z7 = false;
        if (abstractC2765p.mo13068x0()) {
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.f10848x.m13427e1(this.f10815b, this.f10839s0, i7, i8);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z7 = true;
            }
            this.f10795I0 = z7;
            if (z7 || this.f10846w == null) {
                return;
            }
            if (this.f10839s0.f10873e == 1) {
                m13088D();
            }
            this.f10848x.m13388F1(i7, i8);
            this.f10839s0.f10878j = true;
            m13089E();
            this.f10848x.m13395I1(i7, i8);
            if (this.f10848x.mo13039L1()) {
                this.f10848x.m13388F1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f10839s0.f10878j = true;
                m13089E();
                this.f10848x.m13395I1(i7, i8);
            }
            this.f10797J0 = getMeasuredWidth();
            this.f10799K0 = getMeasuredHeight();
            return;
        }
        if (this.f10784D) {
            this.f10848x.m13427e1(this.f10815b, this.f10839s0, i7, i8);
            return;
        }
        if (this.f10800L) {
            m13200t1();
            m13139I0();
            m13094Q0();
            m13141J0();
            C2746B c2746b = this.f10839s0;
            if (c2746b.f10880l) {
                c2746b.f10876h = true;
            } else {
                this.f10819d.m13665j();
                this.f10839s0.f10876h = false;
            }
            this.f10800L = false;
            m13206v1(false);
        } else if (this.f10839s0.f10880l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC2757h abstractC2757h = this.f10846w;
        if (abstractC2757h != null) {
            this.f10839s0.f10874f = abstractC2757h.mo8548g();
        } else {
            this.f10839s0.f10874f = 0;
        }
        m13200t1();
        this.f10848x.m13427e1(this.f10815b, this.f10839s0, i7, i8);
        m13206v1(false);
        this.f10839s0.f10876h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (m13205v0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2775z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2775z c2775z = (C2775z) parcelable;
        this.f10817c = c2775z;
        super.onRestoreInstanceState(c2775z.m6085a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C2775z c2775z = new C2775z(super.onSaveInstanceState());
        C2775z c2775z2 = this.f10817c;
        if (c2775z2 != null) {
            c2775z.m13542b(c2775z2);
            return c2775z;
        }
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            c2775z.f10980c = abstractC2765p.mo13057i1();
            return c2775z;
        }
        c2775z.f10980c = null;
        return c2775z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 == i9 && i8 == i10) {
            return;
        }
        m13199t0();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v45 int) = (r1v26 int), (r1v49 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        boolean z7;
        if (this.f10794I || this.f10796J) {
            return false;
        }
        if (m13091L(motionEvent)) {
            m13120r();
            return true;
        }
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p == null) {
            return false;
        }
        boolean zMo13060q = abstractC2765p.mo13060q();
        boolean zMo13062r = this.f10848x.mo13062r();
        if (this.f10820d0 == null) {
            this.f10820d0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f10787E0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f10787E0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f10820d0.addMovement(motionEventObtain);
                this.f10820d0.computeCurrentVelocity(zzbbn.zzq.zzf, this.f10830l0);
                float f7 = zMo13060q ? -this.f10820d0.getXVelocity(this.f10818c0) : 0.0f;
                float f8 = zMo13062r ? -this.f10820d0.getYVelocity(this.f10818c0) : 0.0f;
                if ((f7 == 0.0f && f8 == 0.0f) || !m13168c0((int) f7, (int) f8)) {
                    setScrollState(0);
                }
                m13108f1();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f10818c0);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f10818c0 + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x7 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y7 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.f10825g0 - x7;
                int iMax2 = this.f10826h0 - y7;
                if (this.f10816b0 != 1) {
                    if (zMo13060q) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.f10827i0) : Math.min(0, iMax + this.f10827i0);
                        if (iMax != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    } else {
                        z7 = false;
                    }
                    if (zMo13062r) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f10827i0) : Math.min(0, iMax2 + this.f10827i0);
                        if (iMax2 != 0) {
                            z7 = true;
                        }
                    }
                    if (z7) {
                        setScrollState(1);
                    }
                }
                int i8 = iMax;
                int i9 = iMax2;
                if (this.f10816b0 == 1) {
                    int[] iArr3 = this.f10789F0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (m13134G(zMo13060q ? i8 : 0, zMo13062r ? i9 : 0, iArr3, this.f10785D0, 0)) {
                        int[] iArr4 = this.f10789F0;
                        i8 -= iArr4[0];
                        i9 -= iArr4[1];
                        int[] iArr5 = this.f10787E0;
                        int i10 = iArr5[0];
                        int[] iArr6 = this.f10785D0;
                        iArr5[0] = i10 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.f10785D0;
                    this.f10825g0 = x7 - iArr7[0];
                    this.f10826h0 = y7 - iArr7[1];
                    if (m13177i1(zMo13060q ? i8 : 0, zMo13062r ? i9 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC2786e runnableC2786e = this.f10835q0;
                    if (runnableC2786e != null && (i8 != 0 || i9 != 0)) {
                        runnableC2786e.m13747f(this, i8, i9);
                    }
                }
            } else if (actionMasked == 3) {
                m13120r();
            } else if (actionMasked == 5) {
                this.f10818c0 = motionEvent.getPointerId(actionIndex);
                int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f10825g0 = x8;
                this.f10822e0 = x8;
                int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f10826h0 = y8;
                this.f10824f0 = y8;
            } else if (actionMasked == 6) {
                m13092L0(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.f10818c0 = motionEvent.getPointerId(0);
        int x9 = (int) (motionEvent.getX() + 0.5f);
        this.f10825g0 = x9;
        this.f10822e0 = x9;
        int y9 = (int) (motionEvent.getY() + 0.5f);
        this.f10826h0 = y9;
        this.f10824f0 = y9;
        if (zMo13062r) {
            i7 = zMo13060q;
            i7 = (zMo13060q ? 1 : 0) | 2;
        }
        i7 = zMo13060q;
        m13203u1(i7, 0);
        this.f10820d0.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    void m13190p(String str) {
        if (m13205v0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m13151Q());
        }
        if (this.f10807R > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m13151Q()));
        }
    }

    /* JADX INFO: renamed from: p0 */
    void m13191p0() {
        this.f10819d = new C2782a(new C2755f());
    }

    /* JADX INFO: renamed from: p1 */
    public void m13192p1(int i7, int i8, Interpolator interpolator) {
        m13194q1(i7, i8, interpolator, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: q */
    boolean m13193q(AbstractC2749E abstractC2749E) {
        AbstractC2762m abstractC2762m = this.f10814a0;
        return abstractC2762m == null || abstractC2762m.mo13343g(abstractC2749E, abstractC2749E.m13283s());
    }

    /* JADX INFO: renamed from: q1 */
    public void m13194q1(int i7, int i8, Interpolator interpolator, int i9) {
        m13195r1(i7, i8, interpolator, i9, false);
    }

    /* JADX INFO: renamed from: r1 */
    void m13195r1(int i7, int i8, Interpolator interpolator, int i9, boolean z7) {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10794I) {
            return;
        }
        if (!abstractC2765p.mo13060q()) {
            i7 = 0;
        }
        if (!this.f10848x.mo13062r()) {
            i8 = 0;
        }
        if (i7 == 0 && i8 == 0) {
            return;
        }
        if (i9 != Integer.MIN_VALUE && i9 <= 0) {
            scrollBy(i7, i8);
            return;
        }
        if (z7) {
            int i10 = i7 != 0 ? 1 : 0;
            if (i8 != 0) {
                i10 |= 2;
            }
            m13203u1(i10, 1);
        }
        this.f10834p0.m13249e(i7, i8, i9, interpolator);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z7) {
        AbstractC2749E abstractC2749EM13111h0 = m13111h0(view);
        if (abstractC2749EM13111h0 != null) {
            if (abstractC2749EM13111h0.m13253B()) {
                abstractC2749EM13111h0.m13273h();
            } else if (!abstractC2749EM13111h0.m13265N()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC2749EM13111h0 + m13151Q());
            }
        }
        view.clearAnimation();
        m13127A(view);
        super.removeDetachedView(view, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f10848x.m13432g1(this, this.f10839s0, view, view2) && view2 != null) {
            m13104d1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        return this.f10848x.m13467w1(this, view, rect, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        int size = this.f10778A.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((InterfaceC2769t) this.f10778A.get(i7)).mo13487e(z7);
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f10790G != 0 || this.f10794I) {
            this.f10792H = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s0 */
    void m13196s0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C2785d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC7380b.f29582a), resources.getDimensionPixelSize(AbstractC7380b.f29584c), resources.getDimensionPixelOffset(AbstractC7380b.f29583b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m13151Q());
        }
    }

    /* JADX INFO: renamed from: s1 */
    public void m13197s1(int i7) {
        if (this.f10794I) {
            return;
        }
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC2765p.mo13041N1(this, this.f10839s0, i7);
        }
    }

    @Override // android.view.View
    public void scrollBy(int i7, int i8) {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10794I) {
            return;
        }
        boolean zMo13060q = abstractC2765p.mo13060q();
        boolean zMo13062r = this.f10848x.mo13062r();
        if (zMo13060q || zMo13062r) {
            if (!zMo13060q) {
                i7 = 0;
            }
            if (!zMo13062r) {
                i8 = 0;
            }
            m13177i1(i7, i8, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i8) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m13187n1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C2795n c2795n) {
        this.f10853z0 = c2795n;
        AbstractC1030Z.m4474j0(this, c2795n);
    }

    public void setAdapter(AbstractC2757h abstractC2757h) {
        setLayoutFrozen(false);
        m13115l1(abstractC2757h, false, true);
        m13153R0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC2760k interfaceC2760k) {
        if (interfaceC2760k == this.f10779A0) {
            return;
        }
        this.f10779A0 = interfaceC2760k;
        setChildrenDrawingOrderEnabled(interfaceC2760k != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z7) {
        if (z7 != this.f10836r) {
            m13199t0();
        }
        this.f10836r = z7;
        super.setClipToPadding(z7);
        if (this.f10788F) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C2761l c2761l) {
        AbstractC0910g.m4139g(c2761l);
        this.f10808S = c2761l;
        m13199t0();
    }

    public void setHasFixedSize(boolean z7) {
        this.f10784D = z7;
    }

    public void setItemAnimator(AbstractC2762m abstractC2762m) {
        AbstractC2762m abstractC2762m2 = this.f10814a0;
        if (abstractC2762m2 != null) {
            abstractC2762m2.mo13347k();
            this.f10814a0.m13359w(null);
        }
        this.f10814a0 = abstractC2762m;
        if (abstractC2762m != null) {
            abstractC2762m.m13359w(this.f10849x0);
        }
    }

    public void setItemViewCacheSize(int i7) {
        this.f10815b.m13512G(i7);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z7) {
        suppressLayout(z7);
    }

    public void setLayoutManager(AbstractC2765p abstractC2765p) {
        if (abstractC2765p == this.f10848x) {
            return;
        }
        m13210x1();
        if (this.f10848x != null) {
            AbstractC2762m abstractC2762m = this.f10814a0;
            if (abstractC2762m != null) {
                abstractC2762m.mo13347k();
            }
            this.f10848x.m13453p1(this.f10815b);
            this.f10848x.m13455q1(this.f10815b);
            this.f10815b.m13519c();
            if (this.f10782C) {
                this.f10848x.m13389G(this, this.f10815b);
            }
            this.f10848x.m13397J1(null);
            this.f10848x = null;
        } else {
            this.f10815b.m13519c();
        }
        this.f10821e.m13693o();
        this.f10848x = abstractC2765p;
        if (abstractC2765p != null) {
            if (abstractC2765p.f10938b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC2765p + " is already attached to a RecyclerView:" + abstractC2765p.f10938b.m13151Q());
            }
            abstractC2765p.m13397J1(this);
            if (this.f10782C) {
                this.f10848x.m13386F(this);
            }
        }
        this.f10815b.m13515K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        getScrollingChildHelper().m4349m(z7);
    }

    public void setOnFlingListener(AbstractC2768s abstractC2768s) {
        this.f10828j0 = abstractC2768s;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC2770u abstractC2770u) {
        this.f10841t0 = abstractC2770u;
    }

    public void setPreserveFocusAfterLayout(boolean z7) {
        this.f10833o0 = z7;
    }

    public void setRecycledViewPool(C2771v c2771v) {
        this.f10815b.m13510E(c2771v);
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC2773x interfaceC2773x) {
    }

    void setScrollState(int i7) {
        if (i7 == this.f10816b0) {
            return;
        }
        this.f10816b0 = i7;
        if (i7 != 2) {
            m13126y1();
        }
        m13138I(i7);
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                this.f10827i0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
        }
        this.f10827i0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC2747C abstractC2747C) {
        this.f10815b.m13511F(abstractC2747C);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().m4350o(i7);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m4352q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z7) {
        if (z7 != this.f10794I) {
            m13190p("Do not suppressLayout in layout or scroll");
            if (z7) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f10794I = true;
                this.f10796J = true;
                m13210x1();
                return;
            }
            this.f10794I = false;
            if (this.f10792H && this.f10848x != null && this.f10846w != null) {
                requestLayout();
            }
            this.f10792H = false;
        }
    }

    /* JADX INFO: renamed from: t */
    void m13198t() {
        int iM13689j = this.f10821e.m13689j();
        for (int i7 = 0; i7 < iM13689j; i7++) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13688i(i7));
            if (!abstractC2749EM13111h0.m13265N()) {
                abstractC2749EM13111h0.m13270e();
            }
        }
        this.f10815b.m13520d();
    }

    /* JADX INFO: renamed from: t0 */
    void m13199t0() {
        this.f10812W = null;
        this.f10810U = null;
        this.f10811V = null;
        this.f10809T = null;
    }

    /* JADX INFO: renamed from: t1 */
    void m13200t1() {
        int i7 = this.f10790G + 1;
        this.f10790G = i7;
        if (i7 != 1 || this.f10794I) {
            return;
        }
        this.f10792H = false;
    }

    /* JADX INFO: renamed from: u */
    void m13201u(int i7, int i8) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f10809T;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            zIsFinished = false;
        } else {
            this.f10809T.onRelease();
            zIsFinished = this.f10809T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f10811V;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.f10811V.onRelease();
            zIsFinished |= this.f10811V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10810U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.f10810U.onRelease();
            zIsFinished |= this.f10810U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10812W;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.f10812W.onRelease();
            zIsFinished |= this.f10812W.isFinished();
        }
        if (zIsFinished) {
            AbstractC1030Z.m4456a0(this);
        }
    }

    /* JADX INFO: renamed from: u0 */
    boolean m13202u0() {
        AccessibilityManager accessibilityManager = this.f10802M;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* JADX INFO: renamed from: u1 */
    public boolean m13203u1(int i7, int i8) {
        return getScrollingChildHelper().m4351p(i7, i8);
    }

    /* JADX INFO: renamed from: v */
    void m13204v() {
        if (!this.f10788F || this.f10804O) {
            AbstractC0723o.m3486a("RV FullInvalidate");
            m13129C();
            AbstractC0723o.m3487b();
            return;
        }
        if (this.f10819d.m13670p()) {
            if (!this.f10819d.m13669o(4) || this.f10819d.m13669o(11)) {
                if (this.f10819d.m13670p()) {
                    AbstractC0723o.m3486a("RV FullInvalidate");
                    m13129C();
                    AbstractC0723o.m3487b();
                    return;
                }
                return;
            }
            AbstractC0723o.m3486a("RV PartialInvalidate");
            m13200t1();
            m13139I0();
            this.f10819d.m13674u();
            if (!this.f10792H) {
                if (m13118o0()) {
                    m13129C();
                } else {
                    this.f10819d.m13664i();
                }
            }
            m13206v1(true);
            m13141J0();
            AbstractC0723o.m3487b();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m13205v0() {
        return this.f10806Q > 0;
    }

    /* JADX INFO: renamed from: v1 */
    void m13206v1(boolean z7) {
        if (this.f10790G < 1) {
            this.f10790G = 1;
        }
        if (!z7 && !this.f10794I) {
            this.f10792H = false;
        }
        if (this.f10790G == 1) {
            if (z7 && this.f10792H && !this.f10794I && this.f10848x != null && this.f10846w != null) {
                m13129C();
            }
            if (!this.f10794I) {
                this.f10792H = false;
            }
        }
        this.f10790G--;
    }

    /* JADX INFO: renamed from: w1 */
    public void m13207w1(int i7) {
        getScrollingChildHelper().m4353r(i7);
    }

    /* JADX INFO: renamed from: x */
    void m13208x(int i7, int i8) {
        setMeasuredDimension(AbstractC2765p.m13377t(i7, getPaddingLeft() + getPaddingRight(), AbstractC1030Z.m4427B(this)), AbstractC2765p.m13377t(i8, getPaddingTop() + getPaddingBottom(), AbstractC1030Z.m4425A(this)));
    }

    /* JADX INFO: renamed from: x0 */
    void m13209x0(int i7) {
        if (this.f10848x == null) {
            return;
        }
        setScrollState(2);
        this.f10848x.mo13033C1(i7);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: x1 */
    public void m13210x1() {
        setScrollState(0);
        m13126y1();
    }

    /* JADX INFO: renamed from: y0 */
    void m13211y0() {
        int iM13689j = this.f10821e.m13689j();
        for (int i7 = 0; i7 < iM13689j; i7++) {
            ((C2766q) this.f10821e.m13688i(i7).getLayoutParams()).f10963c = true;
        }
        this.f10815b.m13533s();
    }

    /* JADX INFO: renamed from: z */
    void m13212z(View view) {
        AbstractC2749E abstractC2749EM13111h0 = m13111h0(view);
        m13135G0(view);
        AbstractC2757h abstractC2757h = this.f10846w;
        if (abstractC2757h != null && abstractC2749EM13111h0 != null) {
            abstractC2757h.mo3686v(abstractC2749EM13111h0);
        }
        List list = this.f10803N;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC2767r) this.f10803N.get(size)).mo13483d(view);
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    void m13213z0() {
        int iM13689j = this.f10821e.m13689j();
        for (int i7 = 0; i7 < iM13689j; i7++) {
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(this.f10821e.m13688i(i7));
            if (abstractC2749EM13111h0 != null && !abstractC2749EM13111h0.m13265N()) {
                abstractC2749EM13111h0.m13269d(6);
            }
        }
        m13211y0();
        this.f10815b.m13534t();
    }

    /* JADX INFO: renamed from: z1 */
    void m13214z1(int i7, int i8, Object obj) {
        int i9;
        int iM13689j = this.f10821e.m13689j();
        int i10 = i7 + i8;
        for (int i11 = 0; i11 < iM13689j; i11++) {
            View viewM13688i = this.f10821e.m13688i(i11);
            AbstractC2749E abstractC2749EM13111h0 = m13111h0(viewM13688i);
            if (abstractC2749EM13111h0 != null && !abstractC2749EM13111h0.m13265N() && (i9 = abstractC2749EM13111h0.f10896c) >= i7 && i9 < i10) {
                abstractC2749EM13111h0.m13269d(2);
                abstractC2749EM13111h0.m13268c(obj);
                ((C2766q) viewM13688i.getLayoutParams()).f10963c = true;
            }
        }
        this.f10815b.m13517M(i7, i8);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC7379a.f29581a);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static class C2775z extends AbstractC1446a {
        public static final Parcelable.Creator<C2775z> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        Parcelable f10980c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2775z createFromParcel(Parcel parcel) {
                return new C2775z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2775z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2775z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C2775z[] newArray(int i7) {
                return new C2775z[i7];
            }
        }

        C2775z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10980c = parcel.readParcelable(classLoader == null ? AbstractC2765p.class.getClassLoader() : classLoader);
        }

        /* JADX INFO: renamed from: b */
        void m13542b(C2775z c2775z) {
            this.f10980c = c2775z.f10980c;
        }

        @Override // p146T.AbstractC1446a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeParcelable(this.f10980c, 0);
        }

        C2775z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10813a = new C2774y();
        this.f10815b = new C2772w();
        this.f10823f = new C2800s();
        this.f10838s = new RunnableC2750a();
        this.f10840t = new Rect();
        this.f10842u = new Rect();
        this.f10844v = new RectF();
        this.f10850y = new ArrayList();
        this.f10852z = new ArrayList();
        this.f10778A = new ArrayList();
        this.f10790G = 0;
        this.f10804O = false;
        this.f10805P = false;
        this.f10806Q = 0;
        this.f10807R = 0;
        this.f10808S = new C2761l();
        this.f10814a0 = new C2784c();
        this.f10816b0 = 0;
        this.f10818c0 = -1;
        this.f10831m0 = Float.MIN_VALUE;
        this.f10832n0 = Float.MIN_VALUE;
        this.f10833o0 = true;
        this.f10834p0 = new RunnableC2748D();
        this.f10837r0 = f10773Q0 ? new RunnableC2786e.b() : null;
        this.f10839s0 = new C2746B();
        this.f10845v0 = false;
        this.f10847w0 = false;
        this.f10849x0 = new C2763n();
        this.f10851y0 = false;
        this.f10781B0 = new int[2];
        this.f10785D0 = new int[2];
        this.f10787E0 = new int[2];
        this.f10789F0 = new int[2];
        this.f10791G0 = new ArrayList();
        this.f10793H0 = new RunnableC2751b();
        this.f10797J0 = 0;
        this.f10799K0 = 0;
        this.f10801L0 = new C2753d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10827i0 = viewConfiguration.getScaledTouchSlop();
        this.f10831m0 = AbstractC1039c0.m4625e(viewConfiguration, context);
        this.f10832n0 = AbstractC1039c0.m4628h(viewConfiguration, context);
        this.f10829k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10830l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f10814a0.m13359w(this.f10849x0);
        m13191p0();
        m13121r0();
        m13119q0();
        if (AbstractC1030Z.m4501x(this) == 0) {
            AbstractC1030Z.m4488q0(this, 1);
        }
        this.f10802M = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C2795n(this));
        int[] iArr = AbstractC7382d.f29594f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        AbstractC1030Z.m4470h0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        String string = typedArrayObtainStyledAttributes.getString(AbstractC7382d.f29603o);
        if (typedArrayObtainStyledAttributes.getInt(AbstractC7382d.f29597i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f10836r = typedArrayObtainStyledAttributes.getBoolean(AbstractC7382d.f29596h, true);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(AbstractC7382d.f29598j, false);
        this.f10786E = z7;
        if (z7) {
            m13196s0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(AbstractC7382d.f29601m), typedArrayObtainStyledAttributes.getDrawable(AbstractC7382d.f29602n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(AbstractC7382d.f29599k), typedArrayObtainStyledAttributes.getDrawable(AbstractC7382d.f29600l));
        }
        typedArrayObtainStyledAttributes.recycle();
        m13123w(context, string, attributeSet, i7, 0);
        int[] iArr2 = f10769M0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        AbstractC1030Z.m4470h0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i7, 0);
        boolean z8 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z8);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static class C2766q extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        AbstractC2749E f10961a;

        /* JADX INFO: renamed from: b */
        final Rect f10962b;

        /* JADX INFO: renamed from: c */
        boolean f10963c;

        /* JADX INFO: renamed from: d */
        boolean f10964d;

        public C2766q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10962b = new Rect();
            this.f10963c = true;
            this.f10964d = false;
        }

        /* JADX INFO: renamed from: a */
        public int m13478a() {
            return this.f10961a.m13281q();
        }

        /* JADX INFO: renamed from: b */
        public boolean m13479b() {
            return this.f10961a.m13254C();
        }

        /* JADX INFO: renamed from: c */
        public boolean m13480c() {
            return this.f10961a.m13290z();
        }

        /* JADX INFO: renamed from: d */
        public boolean m13481d() {
            return this.f10961a.m13288x();
        }

        public C2766q(int i7, int i8) {
            super(i7, i8);
            this.f10962b = new Rect();
            this.f10963c = true;
            this.f10964d = false;
        }

        public C2766q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10962b = new Rect();
            this.f10963c = true;
            this.f10964d = false;
        }

        public C2766q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10962b = new Rect();
            this.f10963c = true;
            this.f10964d = false;
        }

        public C2766q(C2766q c2766q) {
            super((ViewGroup.LayoutParams) c2766q);
            this.f10962b = new Rect();
            this.f10963c = true;
            this.f10964d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC2765p abstractC2765p = this.f10848x;
        if (abstractC2765p != null) {
            return abstractC2765p.mo12973L(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m13151Q());
    }
}
