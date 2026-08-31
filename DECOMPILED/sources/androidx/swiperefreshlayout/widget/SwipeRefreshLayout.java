package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.content.AbstractC2436b;
import androidx.core.widget.AbstractC2456g;
import p111O.AbstractC1030Z;
import p111O.C0985C;
import p111O.C0991F;
import p111O.InterfaceC0983B;
import p111O.InterfaceC0987D;
import p111O.InterfaceC0989E;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC0989E, InterfaceC0987D, InterfaceC0983B {

    /* JADX INFO: renamed from: d0 */
    private static final String f11321d0 = "SwipeRefreshLayout";

    /* JADX INFO: renamed from: e0 */
    private static final int[] f11322e0 = {R.attr.enabled};

    /* JADX INFO: renamed from: A */
    private float f11323A;

    /* JADX INFO: renamed from: B */
    private boolean f11324B;

    /* JADX INFO: renamed from: C */
    private int f11325C;

    /* JADX INFO: renamed from: D */
    boolean f11326D;

    /* JADX INFO: renamed from: E */
    private boolean f11327E;

    /* JADX INFO: renamed from: F */
    private final DecelerateInterpolator f11328F;

    /* JADX INFO: renamed from: G */
    C2819a f11329G;

    /* JADX INFO: renamed from: H */
    private int f11330H;

    /* JADX INFO: renamed from: I */
    protected int f11331I;

    /* JADX INFO: renamed from: J */
    float f11332J;

    /* JADX INFO: renamed from: K */
    protected int f11333K;

    /* JADX INFO: renamed from: L */
    int f11334L;

    /* JADX INFO: renamed from: M */
    int f11335M;

    /* JADX INFO: renamed from: N */
    C2820b f11336N;

    /* JADX INFO: renamed from: O */
    private Animation f11337O;

    /* JADX INFO: renamed from: P */
    private Animation f11338P;

    /* JADX INFO: renamed from: Q */
    private Animation f11339Q;

    /* JADX INFO: renamed from: R */
    private Animation f11340R;

    /* JADX INFO: renamed from: S */
    private Animation f11341S;

    /* JADX INFO: renamed from: T */
    boolean f11342T;

    /* JADX INFO: renamed from: U */
    private int f11343U;

    /* JADX INFO: renamed from: V */
    boolean f11344V;

    /* JADX INFO: renamed from: W */
    private boolean f11345W;

    /* JADX INFO: renamed from: a */
    private View f11346a;

    /* JADX INFO: renamed from: a0 */
    private Animation.AnimationListener f11347a0;

    /* JADX INFO: renamed from: b */
    InterfaceC2817j f11348b;

    /* JADX INFO: renamed from: b0 */
    private final Animation f11349b0;

    /* JADX INFO: renamed from: c */
    boolean f11350c;

    /* JADX INFO: renamed from: c0 */
    private final Animation f11351c0;

    /* JADX INFO: renamed from: d */
    private int f11352d;

    /* JADX INFO: renamed from: e */
    private float f11353e;

    /* JADX INFO: renamed from: f */
    private float f11354f;

    /* JADX INFO: renamed from: r */
    private final C0991F f11355r;

    /* JADX INFO: renamed from: s */
    private final C0985C f11356s;

    /* JADX INFO: renamed from: t */
    private final int[] f11357t;

    /* JADX INFO: renamed from: u */
    private final int[] f11358u;

    /* JADX INFO: renamed from: v */
    private final int[] f11359v;

    /* JADX INFO: renamed from: w */
    private boolean f11360w;

    /* JADX INFO: renamed from: x */
    private int f11361x;

    /* JADX INFO: renamed from: y */
    int f11362y;

    /* JADX INFO: renamed from: z */
    private float f11363z;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    class AnimationAnimationListenerC2808a implements Animation.AnimationListener {
        AnimationAnimationListenerC2808a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC2817j interfaceC2817j;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f11350c) {
                swipeRefreshLayout.m14012r();
                return;
            }
            swipeRefreshLayout.f11336N.setAlpha(255);
            SwipeRefreshLayout.this.f11336N.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f11342T && (interfaceC2817j = swipeRefreshLayout2.f11348b) != null) {
                interfaceC2817j.mo14014F();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f11362y = swipeRefreshLayout3.f11329G.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    class C2809b extends Animation {
        C2809b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f7);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    class C2810c extends Animation {
        C2810c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f7);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    class C2811d extends Animation {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f11367a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f11368b;

        C2811d(int i7, int i8) {
            this.f11367a = i7;
            this.f11368b = i8;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            C2820b c2820b = SwipeRefreshLayout.this.f11336N;
            int i7 = this.f11367a;
            c2820b.setAlpha((int) (i7 + ((this.f11368b - i7) * f7)));
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    class AnimationAnimationListenerC2812e implements Animation.AnimationListener {
        AnimationAnimationListenerC2812e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f11326D) {
                return;
            }
            swipeRefreshLayout.m14013x(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    class C2813f extends Animation {
        C2813f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.f11344V ? swipeRefreshLayout.f11334L - Math.abs(swipeRefreshLayout.f11333K) : swipeRefreshLayout.f11334L;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i7 = swipeRefreshLayout2.f11331I;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i7 + ((int) ((iAbs - i7) * f7))) - swipeRefreshLayout2.f11329G.getTop());
            SwipeRefreshLayout.this.f11336N.m14027e(1.0f - f7);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    class C2814g extends Animation {
        C2814g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            SwipeRefreshLayout.this.m14011p(f7);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    class C2815h extends Animation {
        C2815h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f8 = swipeRefreshLayout.f11332J;
            swipeRefreshLayout.setAnimationProgress(f8 + ((-f8) * f7));
            SwipeRefreshLayout.this.m14011p(f7);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface InterfaceC2816i {
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface InterfaceC2817j {
        /* JADX INFO: renamed from: F */
        void mo14014F();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11350c = false;
        this.f11353e = -1.0f;
        this.f11357t = new int[2];
        this.f11358u = new int[2];
        this.f11359v = new int[2];
        this.f11325C = -1;
        this.f11330H = -1;
        this.f11347a0 = new AnimationAnimationListenerC2808a();
        this.f11349b0 = new C2813f();
        this.f11351c0 = new C2814g();
        this.f11352d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f11361x = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f11328F = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f11343U = (int) (displayMetrics.density * 40.0f);
        m13996d();
        setChildrenDrawingOrderEnabled(true);
        int i7 = (int) (displayMetrics.density * 64.0f);
        this.f11334L = i7;
        this.f11353e = i7;
        this.f11355r = new C0991F(this);
        this.f11356s = new C0985C(this);
        setNestedScrollingEnabled(true);
        int i8 = -this.f11343U;
        this.f11362y = i8;
        this.f11333K = i8;
        m14011p(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11322e0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m13994a(int i7, Animation.AnimationListener animationListener) {
        this.f11331I = i7;
        this.f11349b0.reset();
        this.f11349b0.setDuration(200L);
        this.f11349b0.setInterpolator(this.f11328F);
        if (animationListener != null) {
            this.f11329G.m14018b(animationListener);
        }
        this.f11329G.clearAnimation();
        this.f11329G.startAnimation(this.f11349b0);
    }

    /* JADX INFO: renamed from: b */
    private void m13995b(int i7, Animation.AnimationListener animationListener) {
        if (this.f11326D) {
            m14007y(i7, animationListener);
            return;
        }
        this.f11331I = i7;
        this.f11351c0.reset();
        this.f11351c0.setDuration(200L);
        this.f11351c0.setInterpolator(this.f11328F);
        if (animationListener != null) {
            this.f11329G.m14018b(animationListener);
        }
        this.f11329G.clearAnimation();
        this.f11329G.startAnimation(this.f11351c0);
    }

    /* JADX INFO: renamed from: d */
    private void m13996d() {
        this.f11329G = new C2819a(getContext());
        C2820b c2820b = new C2820b(getContext());
        this.f11336N = c2820b;
        c2820b.m14032l(1);
        this.f11329G.setImageDrawable(this.f11336N);
        this.f11329G.setVisibility(8);
        addView(this.f11329G);
    }

    /* JADX INFO: renamed from: f */
    private void m13997f() {
        if (this.f11346a == null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (!childAt.equals(this.f11329G)) {
                    this.f11346a = childAt;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m13998g(float f7) {
        if (f7 > this.f11353e) {
            m14002s(true, true);
            return;
        }
        this.f11350c = false;
        this.f11336N.m14030j(0.0f, 0.0f);
        m13995b(this.f11362y, !this.f11326D ? new AnimationAnimationListenerC2812e() : null);
        this.f11336N.m14026d(false);
    }

    /* JADX INFO: renamed from: h */
    private boolean m13999h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    private void m14000i(float f7) {
        this.f11336N.m14026d(true);
        float fMin = Math.min(1.0f, Math.abs(f7 / this.f11353e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f7) - this.f11353e;
        int i7 = this.f11335M;
        if (i7 <= 0) {
            i7 = this.f11344V ? this.f11334L - this.f11333K : this.f11334L;
        }
        float f8 = i7;
        double dMax = Math.max(0.0f, Math.min(fAbs, f8 * 2.0f) / f8) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i8 = this.f11333K + ((int) ((f8 * fMin) + (f8 * fPow * 2.0f)));
        if (this.f11329G.getVisibility() != 0) {
            this.f11329G.setVisibility(0);
        }
        if (!this.f11326D) {
            this.f11329G.setScaleX(1.0f);
            this.f11329G.setScaleY(1.0f);
        }
        if (this.f11326D) {
            setAnimationProgress(Math.min(1.0f, f7 / this.f11353e));
        }
        if (f7 < this.f11353e) {
            if (this.f11336N.getAlpha() > 76 && !m13999h(this.f11339Q)) {
                m14006w();
            }
        } else if (this.f11336N.getAlpha() < 255 && !m13999h(this.f11340R)) {
            m14005v();
        }
        this.f11336N.m14030j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f11336N.m14027e(Math.min(1.0f, fMax));
        this.f11336N.m14029g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i8 - this.f11362y);
    }

    /* JADX INFO: renamed from: q */
    private void m14001q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f11325C) {
            this.f11325C = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m14002s(boolean z7, boolean z8) {
        if (this.f11350c != z7) {
            this.f11342T = z8;
            m13997f();
            this.f11350c = z7;
            if (z7) {
                m13994a(this.f11362y, this.f11347a0);
            } else {
                m14013x(this.f11347a0);
            }
        }
    }

    private void setColorViewAlpha(int i7) {
        this.f11329G.getBackground().setAlpha(i7);
        this.f11336N.setAlpha(i7);
    }

    /* JADX INFO: renamed from: t */
    private Animation m14003t(int i7, int i8) {
        C2811d c2811d = new C2811d(i7, i8);
        c2811d.setDuration(300L);
        this.f11329G.m14018b(null);
        this.f11329G.clearAnimation();
        this.f11329G.startAnimation(c2811d);
        return c2811d;
    }

    /* JADX INFO: renamed from: u */
    private void m14004u(float f7) {
        float f8 = this.f11323A;
        float f9 = f7 - f8;
        int i7 = this.f11352d;
        if (f9 <= i7 || this.f11324B) {
            return;
        }
        this.f11363z = f8 + i7;
        this.f11324B = true;
        this.f11336N.setAlpha(76);
    }

    /* JADX INFO: renamed from: v */
    private void m14005v() {
        this.f11340R = m14003t(this.f11336N.getAlpha(), 255);
    }

    /* JADX INFO: renamed from: w */
    private void m14006w() {
        this.f11339Q = m14003t(this.f11336N.getAlpha(), 76);
    }

    /* JADX INFO: renamed from: y */
    private void m14007y(int i7, Animation.AnimationListener animationListener) {
        this.f11331I = i7;
        this.f11332J = this.f11329G.getScaleX();
        C2815h c2815h = new C2815h();
        this.f11341S = c2815h;
        c2815h.setDuration(150L);
        if (animationListener != null) {
            this.f11329G.m14018b(animationListener);
        }
        this.f11329G.clearAnimation();
        this.f11329G.startAnimation(this.f11341S);
    }

    /* JADX INFO: renamed from: z */
    private void m14008z(Animation.AnimationListener animationListener) {
        this.f11329G.setVisibility(0);
        this.f11336N.setAlpha(255);
        C2809b c2809b = new C2809b();
        this.f11337O = c2809b;
        c2809b.setDuration(this.f11361x);
        if (animationListener != null) {
            this.f11329G.m14018b(animationListener);
        }
        this.f11329G.clearAnimation();
        this.f11329G.startAnimation(this.f11337O);
    }

    /* JADX INFO: renamed from: c */
    public boolean m14009c() {
        View view = this.f11346a;
        return view instanceof ListView ? AbstractC2456g.m10744a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f8, boolean z7) {
        return this.f11356s.m4340a(f7, f8, z7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f11356s.m4341b(f7, f8);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return this.f11356s.m4342c(i7, i8, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f11356s.m4345f(i7, i8, i9, i10, iArr);
    }

    /* JADX INFO: renamed from: e */
    public void m14010e(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        if (i11 == 0) {
            this.f11356s.m4344e(i7, i8, i9, i10, iArr, i11, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i7, int i8) {
        int i9 = this.f11330H;
        if (i9 < 0) {
            return i8;
        }
        if (i8 == i7 - 1) {
            return i9;
        }
        return i8 >= i9 ? i8 + 1 : i8;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f11355r.m4363a();
    }

    public int getProgressCircleDiameter() {
        return this.f11343U;
    }

    public int getProgressViewEndOffset() {
        return this.f11334L;
    }

    public int getProgressViewStartOffset() {
        return this.f11333K;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f11356s.m4346j();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f11356s.m4348l();
    }

    @Override // p111O.InterfaceC0989E
    /* JADX INFO: renamed from: j */
    public void mo4361j(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (i11 != 0) {
            return;
        }
        int i12 = iArr[1];
        m14010e(i7, i8, i9, i10, this.f11358u, i11, iArr);
        int i13 = i10 - (iArr[1] - i12);
        int i14 = i13 == 0 ? i10 + this.f11358u[1] : i13;
        if (i14 >= 0 || m14009c()) {
            return;
        }
        float fAbs = this.f11354f + Math.abs(i14);
        this.f11354f = fAbs;
        m14000i(fAbs);
        iArr[1] = iArr[1] + i13;
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: k */
    public void mo4355k(View view, int i7, int i8, int i9, int i10, int i11) {
        mo4361j(view, i7, i8, i9, i10, i11, this.f11359v);
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: l */
    public boolean mo4356l(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            return onStartNestedScroll(view, view2, i7);
        }
        return false;
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: m */
    public void mo4357m(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: n */
    public void mo4358n(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: o */
    public void mo4359o(View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m14012r();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m13997f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11327E && actionMasked == 0) {
            this.f11327E = false;
        }
        if (!isEnabled() || this.f11327E || m14009c() || this.f11350c || this.f11360w) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f11333K - this.f11329G.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f11325C = pointerId;
            this.f11324B = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f11323A = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f11324B = false;
            this.f11325C = -1;
        } else if (actionMasked == 2) {
            int i7 = this.f11325C;
            if (i7 == -1) {
                Log.e(f11321d0, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i7);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            m14004u(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f11324B = false;
            this.f11325C = -1;
        } else if (actionMasked == 6) {
            m14001q(motionEvent);
        }
        return this.f11324B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f11346a == null) {
            m13997f();
        }
        View view = this.f11346a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f11329G.getMeasuredWidth();
        int measuredHeight2 = this.f11329G.getMeasuredHeight();
        int i11 = measuredWidth / 2;
        int i12 = measuredWidth2 / 2;
        int i13 = this.f11362y;
        this.f11329G.layout(i11 - i12, i13, i11 + i12, measuredHeight2 + i13);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f11346a == null) {
            m13997f();
        }
        View view = this.f11346a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f11329G.measure(View.MeasureSpec.makeMeasureSpec(this.f11343U, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f11343U, 1073741824));
        this.f11330H = -1;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (getChildAt(i9) == this.f11329G) {
                this.f11330H = i9;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        return dispatchNestedFling(f7, f8, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        if (i8 > 0) {
            float f7 = this.f11354f;
            if (f7 > 0.0f) {
                float f8 = i8;
                if (f8 > f7) {
                    iArr[1] = (int) f7;
                    this.f11354f = 0.0f;
                } else {
                    this.f11354f = f7 - f8;
                    iArr[1] = i8;
                }
                m14000i(this.f11354f);
            }
        }
        if (this.f11344V && i8 > 0 && this.f11354f == 0.0f && Math.abs(i8 - iArr[1]) > 0) {
            this.f11329G.setVisibility(8);
        }
        int[] iArr2 = this.f11357t;
        if (dispatchNestedPreScroll(i7 - iArr[0], i8 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        mo4361j(view, i7, i8, i9, i10, 0, this.f11359v);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f11355r.m4364b(view, view2, i7);
        startNestedScroll(i7 & 2);
        this.f11354f = 0.0f;
        this.f11360w = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        C2818k c2818k = (C2818k) parcelable;
        super.onRestoreInstanceState(c2818k.getSuperState());
        setRefreshing(c2818k.f11374a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new C2818k(super.onSaveInstanceState(), this.f11350c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return (!isEnabled() || this.f11327E || this.f11350c || (i7 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f11355r.m4366d(view);
        this.f11360w = false;
        float f7 = this.f11354f;
        if (f7 > 0.0f) {
            m13998g(f7);
            this.f11354f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11327E && actionMasked == 0) {
            this.f11327E = false;
        }
        if (!isEnabled() || this.f11327E || m14009c() || this.f11350c || this.f11360w) {
            return false;
        }
        if (actionMasked == 0) {
            this.f11325C = motionEvent.getPointerId(0);
            this.f11324B = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f11325C);
                if (iFindPointerIndex < 0) {
                    Log.e(f11321d0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f11324B) {
                    float y7 = (motionEvent.getY(iFindPointerIndex) - this.f11363z) * 0.5f;
                    this.f11324B = false;
                    m13998g(y7);
                }
                this.f11325C = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f11325C);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f11321d0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y8 = motionEvent.getY(iFindPointerIndex2);
                m14004u(y8);
                if (this.f11324B) {
                    float f7 = (y8 - this.f11363z) * 0.5f;
                    if (f7 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m14000i(f7);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f11321d0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f11325C = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m14001q(motionEvent);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    void m14011p(float f7) {
        int i7 = this.f11331I;
        setTargetOffsetTopAndBottom((i7 + ((int) ((this.f11333K - i7) * f7))) - this.f11329G.getTop());
    }

    /* JADX INFO: renamed from: r */
    void m14012r() {
        this.f11329G.clearAnimation();
        this.f11336N.stop();
        this.f11329G.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f11326D) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f11333K - this.f11362y);
        }
        this.f11362y = this.f11329G.getTop();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        ViewParent parent;
        View view = this.f11346a;
        if (view == null || AbstractC1030Z.m4445Q(view)) {
            super.requestDisallowInterceptTouchEvent(z7);
        } else {
            if (this.f11345W || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z7);
        }
    }

    void setAnimationProgress(float f7) {
        this.f11329G.setScaleX(f7);
        this.f11329G.setScaleY(f7);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m13997f();
        this.f11336N.m14028f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr2[i7] = AbstractC2436b.getColor(context, iArr[i7]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i7) {
        this.f11353e = i7;
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        if (z7) {
            return;
        }
        m14012r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z7) {
        this.f11345W = z7;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        this.f11356s.m4349m(z7);
    }

    public void setOnChildScrollUpCallback(InterfaceC2816i interfaceC2816i) {
    }

    public void setOnRefreshListener(InterfaceC2817j interfaceC2817j) {
        this.f11348b = interfaceC2817j;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i7) {
        setProgressBackgroundColorSchemeResource(i7);
    }

    public void setProgressBackgroundColorSchemeColor(int i7) {
        this.f11329G.setBackgroundColor(i7);
    }

    public void setProgressBackgroundColorSchemeResource(int i7) {
        setProgressBackgroundColorSchemeColor(AbstractC2436b.getColor(getContext(), i7));
    }

    public void setRefreshing(boolean z7) {
        if (!z7 || this.f11350c == z7) {
            m14002s(z7, false);
            return;
        }
        this.f11350c = z7;
        setTargetOffsetTopAndBottom((!this.f11344V ? this.f11334L + this.f11333K : this.f11334L) - this.f11362y);
        this.f11342T = false;
        m14008z(this.f11347a0);
    }

    public void setSize(int i7) {
        if (i7 == 0 || i7 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i7 == 0) {
                this.f11343U = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f11343U = (int) (displayMetrics.density * 40.0f);
            }
            this.f11329G.setImageDrawable(null);
            this.f11336N.m14032l(i7);
            this.f11329G.setImageDrawable(this.f11336N);
        }
    }

    public void setSlingshotDistance(int i7) {
        this.f11335M = i7;
    }

    void setTargetOffsetTopAndBottom(int i7) {
        this.f11329G.bringToFront();
        AbstractC1030Z.m4449U(this.f11329G, i7);
        this.f11362y = this.f11329G.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return this.f11356s.m4350o(i7);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f11356s.m4352q();
    }

    /* JADX INFO: renamed from: x */
    void m14013x(Animation.AnimationListener animationListener) {
        C2810c c2810c = new C2810c();
        this.f11338P = c2810c;
        c2810c.setDuration(150L);
        this.f11329G.m14018b(animationListener);
        this.f11329G.clearAnimation();
        this.f11329G.startAnimation(this.f11338P);
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$k */
    static class C2818k extends View.BaseSavedState {
        public static final Parcelable.Creator<C2818k> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        final boolean f11374a;

        /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$k$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2818k createFromParcel(Parcel parcel) {
                return new C2818k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2818k[] newArray(int i7) {
                return new C2818k[i7];
            }
        }

        C2818k(Parcelable parcelable, boolean z7) {
            super(parcelable);
            this.f11374a = z7;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f11374a ? (byte) 1 : (byte) 0);
        }

        C2818k(Parcel parcel) {
            super(parcel);
            this.f11374a = parcel.readByte() != 0;
        }
    }
}
