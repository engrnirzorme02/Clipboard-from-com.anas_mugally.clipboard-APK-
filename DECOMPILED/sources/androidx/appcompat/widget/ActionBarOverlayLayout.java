package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC2285j;
import com.google.android.gms.common.api.C3553a;
import p033E.C0247b;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p111O.C0991F;
import p111O.InterfaceC0987D;
import p111O.InterfaceC0989E;
import p255h.AbstractC5520a;
import p255h.AbstractC5525f;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC2309G, InterfaceC0987D, InterfaceC0989E {

    /* JADX INFO: renamed from: R */
    static final int[] f7818R = {AbstractC5520a.f20964b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: S */
    private static final C0982A0 f7819S = new C0982A0.a().m4292d(C0247b.m1184b(0, 1, 0, 1)).m4289a();

    /* JADX INFO: renamed from: T */
    private static final Rect f7820T = new Rect();

    /* JADX INFO: renamed from: A */
    private final Rect f7821A;

    /* JADX INFO: renamed from: B */
    private final Rect f7822B;

    /* JADX INFO: renamed from: C */
    private final Rect f7823C;

    /* JADX INFO: renamed from: D */
    private final Rect f7824D;

    /* JADX INFO: renamed from: E */
    private final Rect f7825E;

    /* JADX INFO: renamed from: F */
    private C0982A0 f7826F;

    /* JADX INFO: renamed from: G */
    private C0982A0 f7827G;

    /* JADX INFO: renamed from: H */
    private C0982A0 f7828H;

    /* JADX INFO: renamed from: I */
    private C0982A0 f7829I;

    /* JADX INFO: renamed from: J */
    private InterfaceC2295d f7830J;

    /* JADX INFO: renamed from: K */
    private OverScroller f7831K;

    /* JADX INFO: renamed from: L */
    ViewPropertyAnimator f7832L;

    /* JADX INFO: renamed from: M */
    final AnimatorListenerAdapter f7833M;

    /* JADX INFO: renamed from: N */
    private final Runnable f7834N;

    /* JADX INFO: renamed from: O */
    private final Runnable f7835O;

    /* JADX INFO: renamed from: P */
    private final C0991F f7836P;

    /* JADX INFO: renamed from: Q */
    private final C2297f f7837Q;

    /* JADX INFO: renamed from: a */
    private int f7838a;

    /* JADX INFO: renamed from: b */
    private int f7839b;

    /* JADX INFO: renamed from: c */
    private ContentFrameLayout f7840c;

    /* JADX INFO: renamed from: d */
    ActionBarContainer f7841d;

    /* JADX INFO: renamed from: e */
    private InterfaceC2310H f7842e;

    /* JADX INFO: renamed from: f */
    private Drawable f7843f;

    /* JADX INFO: renamed from: r */
    private boolean f7844r;

    /* JADX INFO: renamed from: s */
    private boolean f7845s;

    /* JADX INFO: renamed from: t */
    private boolean f7846t;

    /* JADX INFO: renamed from: u */
    boolean f7847u;

    /* JADX INFO: renamed from: v */
    private int f7848v;

    /* JADX INFO: renamed from: w */
    private int f7849w;

    /* JADX INFO: renamed from: x */
    private final Rect f7850x;

    /* JADX INFO: renamed from: y */
    private final Rect f7851y;

    /* JADX INFO: renamed from: z */
    private final Rect f7852z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C2292a extends AnimatorListenerAdapter {
        C2292a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f7832L = null;
            actionBarOverlayLayout.f7847u = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f7832L = null;
            actionBarOverlayLayout.f7847u = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class RunnableC2293b implements Runnable {
        RunnableC2293b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m9658v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f7832L = actionBarOverlayLayout.f7841d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f7833M);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class RunnableC2294c implements Runnable {
        RunnableC2294c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m9658v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f7832L = actionBarOverlayLayout.f7841d.animate().translationY(-ActionBarOverlayLayout.this.f7841d.getHeight()).setListener(ActionBarOverlayLayout.this.f7833M);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC2295d {
        /* JADX INFO: renamed from: a */
        void mo9343a();

        /* JADX INFO: renamed from: b */
        void mo9344b();

        /* JADX INFO: renamed from: c */
        void mo9345c(boolean z7);

        /* JADX INFO: renamed from: d */
        void mo9346d();

        /* JADX INFO: renamed from: e */
        void mo9347e();

        void onWindowVisibilityChanged(int i7);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C2296e extends ViewGroup.MarginLayoutParams {
        public C2296e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2296e(int i7, int i8) {
            super(i7, i8);
        }

        public C2296e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$f */
    private static final class C2297f extends View {
        C2297f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7839b = 0;
        this.f7850x = new Rect();
        this.f7851y = new Rect();
        this.f7852z = new Rect();
        this.f7821A = new Rect();
        this.f7822B = new Rect();
        this.f7823C = new Rect();
        this.f7824D = new Rect();
        this.f7825E = new Rect();
        C0982A0 c0982a0 = C0982A0.f3748b;
        this.f7826F = c0982a0;
        this.f7827G = c0982a0;
        this.f7828H = c0982a0;
        this.f7829I = c0982a0;
        this.f7833M = new C2292a();
        this.f7834N = new RunnableC2293b();
        this.f7835O = new RunnableC2294c();
        m9643w(context);
        this.f7836P = new C0991F(this);
        C2297f c2297f = new C2297f(context);
        this.f7837Q = c2297f;
        addView(c2297f);
    }

    /* JADX INFO: renamed from: B */
    private void m9637B() {
        m9658v();
        this.f7834N.run();
    }

    /* JADX INFO: renamed from: C */
    private boolean m9638C(float f7) {
        this.f7831K.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, C3553a.e.API_PRIORITY_OTHER);
        return this.f7831K.getFinalY() > this.f7841d.getHeight();
    }

    /* JADX INFO: renamed from: p */
    private void m9639p() {
        m9658v();
        this.f7835O.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    private boolean m9640q(View view, Rect rect, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        C2296e c2296e = (C2296e) view.getLayoutParams();
        if (z7) {
            int i7 = ((ViewGroup.MarginLayoutParams) c2296e).leftMargin;
            int i8 = rect.left;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c2296e).leftMargin = i8;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (z8) {
            int i9 = ((ViewGroup.MarginLayoutParams) c2296e).topMargin;
            int i10 = rect.top;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) c2296e).topMargin = i10;
                z11 = true;
            }
        }
        if (z10) {
            int i11 = ((ViewGroup.MarginLayoutParams) c2296e).rightMargin;
            int i12 = rect.right;
            if (i11 != i12) {
                ((ViewGroup.MarginLayoutParams) c2296e).rightMargin = i12;
                z11 = true;
            }
        }
        if (z9) {
            int i13 = ((ViewGroup.MarginLayoutParams) c2296e).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) c2296e).bottomMargin = i14;
                return true;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: r */
    private boolean m9641r() {
        AbstractC1030Z.m4465f(this.f7837Q, f7819S, this.f7821A);
        return !this.f7821A.equals(f7820T);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    private InterfaceC2310H m9642u(View view) {
        if (view instanceof InterfaceC2310H) {
            return (InterfaceC2310H) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: w */
    private void m9643w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f7818R);
        this.f7838a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f7843f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f7831K = new OverScroller(context);
    }

    /* JADX INFO: renamed from: y */
    private void m9644y() {
        m9658v();
        postDelayed(this.f7835O, 600L);
    }

    /* JADX INFO: renamed from: z */
    private void m9645z() {
        m9658v();
        postDelayed(this.f7834N, 600L);
    }

    /* JADX INFO: renamed from: A */
    void m9646A() {
        if (this.f7840c == null) {
            this.f7840c = (ContentFrameLayout) findViewById(AbstractC5525f.f21054b);
            this.f7841d = (ActionBarContainer) findViewById(AbstractC5525f.f21055c);
            this.f7842e = m9642u(findViewById(AbstractC5525f.f21053a));
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC2309G
    /* JADX INFO: renamed from: a */
    public void mo9647a(Menu menu, InterfaceC2285j.a aVar) {
        m9646A();
        this.f7842e.mo9743a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.InterfaceC2309G
    /* JADX INFO: renamed from: b */
    public boolean mo9648b() {
        m9646A();
        return this.f7842e.mo9744b();
    }

    @Override // androidx.appcompat.widget.InterfaceC2309G
    /* JADX INFO: renamed from: c */
    public void mo9649c() {
        m9646A();
        this.f7842e.mo9745c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2296e;
    }

    @Override // androidx.appcompat.widget.InterfaceC2309G
    /* JADX INFO: renamed from: d */
    public boolean mo9650d() {
        m9646A();
        return this.f7842e.mo9746d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f7843f != null) {
            int bottom = this.f7841d.getVisibility() == 0 ? (int) (this.f7841d.getBottom() + this.f7841d.getTranslationY() + 0.5f) : 0;
            this.f7843f.setBounds(0, bottom, getWidth(), this.f7843f.getIntrinsicHeight() + bottom);
            this.f7843f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC2309G
    /* JADX INFO: renamed from: e */
    public boolean mo9651e() {
        m9646A();
        return this.f7842e.mo9747e();
    }

    @Override // androidx.appcompat.widget.InterfaceC2309G
    /* JADX INFO: renamed from: f */
    public boolean mo9652f() {
        m9646A();
        return this.f7842e.mo9748f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC2309G
    /* JADX INFO: renamed from: g */
    public boolean mo9653g() {
        m9646A();
        return this.f7842e.mo9749g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f7841d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f7836P.m4363a();
    }

    public CharSequence getTitle() {
        m9646A();
        return this.f7842e.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC2309G
    /* JADX INFO: renamed from: h */
    public void mo9654h(int i7) {
        m9646A();
        if (i7 == 2) {
            this.f7842e.mo9760r();
        } else if (i7 == 5) {
            this.f7842e.mo9761s();
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC2309G
    /* JADX INFO: renamed from: i */
    public void mo9655i() {
        m9646A();
        this.f7842e.mo9750h();
    }

    @Override // p111O.InterfaceC0989E
    /* JADX INFO: renamed from: j */
    public void mo4361j(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        mo4355k(view, i7, i8, i9, i10, i11);
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: k */
    public void mo4355k(View view, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i7, i8, i9, i10);
        }
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: l */
    public boolean mo4356l(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
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

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m9646A();
        C0982A0 c0982a0M4266y = C0982A0.m4266y(windowInsets, this);
        boolean zM9640q = m9640q(this.f7841d, new Rect(c0982a0M4266y.m4276j(), c0982a0M4266y.m4278l(), c0982a0M4266y.m4277k(), c0982a0M4266y.m4275i()), true, true, false, true);
        AbstractC1030Z.m4465f(this, c0982a0M4266y, this.f7850x);
        Rect rect = this.f7850x;
        C0982A0 c0982a0M4280n = c0982a0M4266y.m4280n(rect.left, rect.top, rect.right, rect.bottom);
        this.f7826F = c0982a0M4280n;
        boolean z7 = true;
        if (!this.f7827G.equals(c0982a0M4280n)) {
            this.f7827G = this.f7826F;
            zM9640q = true;
        }
        if (this.f7851y.equals(this.f7850x)) {
            z7 = zM9640q;
        } else {
            this.f7851y.set(this.f7850x);
        }
        if (z7) {
            requestLayout();
        }
        return c0982a0M4266y.m4267a().m4269c().m4268b().m4288w();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m9643w(getContext());
        AbstractC1030Z.m4468g0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9658v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C2296e c2296e = (C2296e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) c2296e).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) c2296e).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int measuredHeight;
        m9646A();
        measureChildWithMargins(this.f7841d, i7, 0, i8, 0);
        C2296e c2296e = (C2296e) this.f7841d.getLayoutParams();
        int iMax = Math.max(0, this.f7841d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2296e).leftMargin + ((ViewGroup.MarginLayoutParams) c2296e).rightMargin);
        int iMax2 = Math.max(0, this.f7841d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2296e).topMargin + ((ViewGroup.MarginLayoutParams) c2296e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f7841d.getMeasuredState());
        boolean z7 = (AbstractC1030Z.m4438J(this) & 256) != 0;
        if (z7) {
            measuredHeight = this.f7838a;
            if (this.f7845s && this.f7841d.getTabContainer() != null) {
                measuredHeight += this.f7838a;
            }
        } else {
            measuredHeight = this.f7841d.getVisibility() != 8 ? this.f7841d.getMeasuredHeight() : 0;
        }
        this.f7852z.set(this.f7850x);
        this.f7828H = this.f7826F;
        if (this.f7844r || z7 || !m9641r()) {
            this.f7828H = new C0982A0.a(this.f7828H).m4292d(C0247b.m1184b(this.f7828H.m4276j(), this.f7828H.m4278l() + measuredHeight, this.f7828H.m4277k(), this.f7828H.m4275i())).m4289a();
        } else {
            Rect rect = this.f7852z;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f7828H = this.f7828H.m4280n(0, measuredHeight, 0, 0);
        }
        m9640q(this.f7840c, this.f7852z, true, true, true, true);
        if (!this.f7829I.equals(this.f7828H)) {
            C0982A0 c0982a0 = this.f7828H;
            this.f7829I = c0982a0;
            AbstractC1030Z.m4467g(this.f7840c, c0982a0);
        }
        measureChildWithMargins(this.f7840c, i7, 0, i8, 0);
        C2296e c2296e2 = (C2296e) this.f7840c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f7840c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2296e2).leftMargin + ((ViewGroup.MarginLayoutParams) c2296e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f7840c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2296e2).topMargin + ((ViewGroup.MarginLayoutParams) c2296e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f7840c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        if (!this.f7846t || !z7) {
            return false;
        }
        if (m9638C(f8)) {
            m9639p();
        } else {
            m9637B();
        }
        this.f7847u = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f7848v + i8;
        this.f7848v = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f7836P.m4364b(view, view2, i7);
        this.f7848v = getActionBarHideOffset();
        m9658v();
        InterfaceC2295d interfaceC2295d = this.f7830J;
        if (interfaceC2295d != null) {
            interfaceC2295d.mo9347e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f7841d.getVisibility() != 0) {
            return false;
        }
        return this.f7846t;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f7846t && !this.f7847u) {
            if (this.f7848v <= this.f7841d.getHeight()) {
                m9645z();
            } else {
                m9644y();
            }
        }
        InterfaceC2295d interfaceC2295d = this.f7830J;
        if (interfaceC2295d != null) {
            interfaceC2295d.mo9344b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        m9646A();
        int i8 = this.f7849w ^ i7;
        this.f7849w = i7;
        boolean z7 = (i7 & 4) == 0;
        boolean z8 = (i7 & 256) != 0;
        InterfaceC2295d interfaceC2295d = this.f7830J;
        if (interfaceC2295d != null) {
            interfaceC2295d.mo9345c(!z8);
            if (z7 || !z8) {
                this.f7830J.mo9343a();
            } else {
                this.f7830J.mo9346d();
            }
        }
        if ((i8 & 256) == 0 || this.f7830J == null) {
            return;
        }
        AbstractC1030Z.m4468g0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f7839b = i7;
        InterfaceC2295d interfaceC2295d = this.f7830J;
        if (interfaceC2295d != null) {
            interfaceC2295d.onWindowVisibilityChanged(i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C2296e generateDefaultLayoutParams() {
        return new C2296e(-1, -1);
    }

    public void setActionBarHideOffset(int i7) {
        m9658v();
        this.f7841d.setTranslationY(-Math.max(0, Math.min(i7, this.f7841d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC2295d interfaceC2295d) {
        this.f7830J = interfaceC2295d;
        if (getWindowToken() != null) {
            this.f7830J.onWindowVisibilityChanged(this.f7839b);
            int i7 = this.f7849w;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                AbstractC1030Z.m4468g0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z7) {
        this.f7845s = z7;
    }

    public void setHideOnContentScrollEnabled(boolean z7) {
        if (z7 != this.f7846t) {
            this.f7846t = z7;
            if (z7) {
                return;
            }
            m9658v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        m9646A();
        this.f7842e.setIcon(i7);
    }

    public void setLogo(int i7) {
        m9646A();
        this.f7842e.mo9754l(i7);
    }

    public void setOverlayMode(boolean z7) {
        this.f7844r = z7;
    }

    public void setShowingForActionMode(boolean z7) {
    }

    public void setUiOptions(int i7) {
    }

    @Override // androidx.appcompat.widget.InterfaceC2309G
    public void setWindowCallback(Window.Callback callback) {
        m9646A();
        this.f7842e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC2309G
    public void setWindowTitle(CharSequence charSequence) {
        m9646A();
        this.f7842e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public C2296e generateLayoutParams(AttributeSet attributeSet) {
        return new C2296e(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: v */
    void m9658v() {
        removeCallbacks(this.f7834N);
        removeCallbacks(this.f7835O);
        ViewPropertyAnimator viewPropertyAnimator = this.f7832L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m9659x() {
        return this.f7844r;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2296e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m9646A();
        this.f7842e.setIcon(drawable);
    }
}
