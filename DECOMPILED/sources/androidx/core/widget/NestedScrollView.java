package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;
import p009B.AbstractC0038a;
import p111O.AbstractC0981A;
import p111O.AbstractC1030Z;
import p111O.C0985C;
import p111O.C0991F;
import p111O.C1003L;
import p111O.C1032a;
import p111O.C1064o;
import p111O.InterfaceC0983B;
import p111O.InterfaceC0989E;
import p111O.InterfaceC1066p;
import p118P.AbstractC1172u;
import p118P.C1170s;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0989E, InterfaceC0983B {

    /* JADX INFO: renamed from: P */
    private static final float f9307P = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: Q */
    private static final C2444a f9308Q = new C2444a();

    /* JADX INFO: renamed from: R */
    private static final int[] f9309R = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    private int f9310A;

    /* JADX INFO: renamed from: B */
    private int f9311B;

    /* JADX INFO: renamed from: C */
    private int f9312C;

    /* JADX INFO: renamed from: D */
    private int f9313D;

    /* JADX INFO: renamed from: E */
    private final int[] f9314E;

    /* JADX INFO: renamed from: F */
    private final int[] f9315F;

    /* JADX INFO: renamed from: G */
    private int f9316G;

    /* JADX INFO: renamed from: H */
    private int f9317H;

    /* JADX INFO: renamed from: I */
    private C2449f f9318I;

    /* JADX INFO: renamed from: J */
    private final C0991F f9319J;

    /* JADX INFO: renamed from: K */
    private final C0985C f9320K;

    /* JADX INFO: renamed from: L */
    private float f9321L;

    /* JADX INFO: renamed from: M */
    private InterfaceC2448e f9322M;

    /* JADX INFO: renamed from: N */
    final C2447d f9323N;

    /* JADX INFO: renamed from: O */
    C1064o f9324O;

    /* JADX INFO: renamed from: a */
    private final float f9325a;

    /* JADX INFO: renamed from: b */
    private long f9326b;

    /* JADX INFO: renamed from: c */
    private final Rect f9327c;

    /* JADX INFO: renamed from: d */
    private OverScroller f9328d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f9329e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f9330f;

    /* JADX INFO: renamed from: r */
    C1003L f9331r;

    /* JADX INFO: renamed from: s */
    private int f9332s;

    /* JADX INFO: renamed from: t */
    private boolean f9333t;

    /* JADX INFO: renamed from: u */
    private boolean f9334u;

    /* JADX INFO: renamed from: v */
    private View f9335v;

    /* JADX INFO: renamed from: w */
    private boolean f9336w;

    /* JADX INFO: renamed from: x */
    private VelocityTracker f9337x;

    /* JADX INFO: renamed from: y */
    private boolean f9338y;

    /* JADX INFO: renamed from: z */
    private boolean f9339z;

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$a */
    static class C2444a extends C1032a {
        C2444a() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: f */
        public void mo4584f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4584f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AbstractC1172u.m5120a(accessibilityEvent, nestedScrollView.getScrollX());
            AbstractC1172u.m5121b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            int scrollRange;
            super.mo4585g(view, c1170s);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c1170s.m5069m0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c1170s.m5023H0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c1170s.m5052b(C1170s.a.f4122r);
                c1170s.m5052b(C1170s.a.f4089C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c1170s.m5052b(C1170s.a.f4121q);
                c1170s.m5052b(C1170s.a.f4091E);
            }
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: j */
        public boolean mo4588j(View view, int i7, Bundle bundle) {
            if (super.mo4588j(view, i7, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i7 != 4096) {
                if (i7 == 8192 || i7 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m10661X(0, iMax, true);
                    return true;
                }
                if (i7 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m10661X(0, iMin, true);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$b */
    static class C2445b {
        /* JADX INFO: renamed from: a */
        static boolean m10673a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$c */
    private static final class C2446c {
        /* JADX INFO: renamed from: a */
        public static void m10674a(View view, float f7) {
            try {
                view.setFrameContentVelocity(f7);
            } catch (LinkageError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$d */
    class C2447d implements InterfaceC1066p {
        C2447d() {
        }

        @Override // p111O.InterfaceC1066p
        /* JADX INFO: renamed from: a */
        public boolean mo4752a(float f7) {
            if (f7 == 0.0f) {
                return false;
            }
            mo4754c();
            NestedScrollView.this.m10670v((int) f7);
            return true;
        }

        @Override // p111O.InterfaceC1066p
        /* JADX INFO: renamed from: b */
        public float mo4753b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // p111O.InterfaceC1066p
        /* JADX INFO: renamed from: c */
        public void mo4754c() {
            NestedScrollView.this.f9328d.abortAnimation();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$e */
    public interface InterfaceC2448e {
        /* JADX INFO: renamed from: a */
        void m10675a(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10);
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$f */
    static class C2449f extends View.BaseSavedState {
        public static final Parcelable.Creator<C2449f> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        public int f9341a;

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$f$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2449f createFromParcel(Parcel parcel) {
                return new C2449f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2449f[] newArray(int i7) {
                return new C2449f[i7];
            }
        }

        C2449f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f9341a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f9341a);
        }

        C2449f(Parcel parcel) {
            super(parcel);
            this.f9341a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0038a.f281c);
    }

    /* JADX INFO: renamed from: A */
    private void m10626A() {
        VelocityTracker velocityTracker = this.f9337x;
        if (velocityTracker == null) {
            this.f9337x = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* JADX INFO: renamed from: B */
    private void m10627B() {
        this.f9328d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f9310A = viewConfiguration.getScaledTouchSlop();
        this.f9311B = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9312C = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: C */
    private void m10628C() {
        if (this.f9337x == null) {
            this.f9337x = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: D */
    private void m10629D(int i7, int i8) {
        this.f9332s = i7;
        this.f9313D = i8;
        m10662Y(2, 0);
    }

    /* JADX INFO: renamed from: E */
    private boolean m10630E(View view) {
        return !m10632G(view, 0, getHeight());
    }

    /* JADX INFO: renamed from: F */
    private static boolean m10631F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m10631F((View) parent, view2);
    }

    /* JADX INFO: renamed from: G */
    private boolean m10632G(View view, int i7, int i8) {
        view.getDrawingRect(this.f9327c);
        offsetDescendantRectToMyCoords(view, this.f9327c);
        return this.f9327c.bottom + i7 >= getScrollY() && this.f9327c.top - i7 <= getScrollY() + i8;
    }

    /* JADX INFO: renamed from: H */
    private void m10633H(int i7, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f9320K.m4344e(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    /* JADX INFO: renamed from: I */
    private void m10634I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9313D) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f9332s = (int) motionEvent.getY(i7);
            this.f9313D = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f9337x;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    private void m10635L() {
        VelocityTracker velocityTracker = this.f9337x;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9337x = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX INFO: renamed from: M */
    private int m10636M(int i7, float f7) {
        float fM10731d;
        int iRound;
        float width = f7 / getWidth();
        float height = i7 / getHeight();
        float f8 = 0.0f;
        if (AbstractC2453d.m10729b(this.f9329e) == 0.0f) {
            if (AbstractC2453d.m10729b(this.f9330f) != 0.0f) {
                fM10731d = AbstractC2453d.m10731d(this.f9330f, height, 1.0f - width);
                if (AbstractC2453d.m10729b(this.f9330f) == 0.0f) {
                    this.f9330f.onRelease();
                }
            }
            iRound = Math.round(f8 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fM10731d = -AbstractC2453d.m10731d(this.f9329e, -height, width);
        if (AbstractC2453d.m10729b(this.f9329e) == 0.0f) {
            this.f9329e.onRelease();
        }
        f8 = fM10731d;
        iRound = Math.round(f8 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    /* JADX INFO: renamed from: N */
    private void m10637N(boolean z7) {
        if (z7) {
            m10662Y(2, 1);
        } else {
            m10663a0(1);
        }
        this.f9317H = getScrollY();
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: O */
    private boolean m10638O(int i7, int i8, int i9) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z7 = false;
        boolean z8 = i7 == 33;
        View viewM10653u = m10653u(z8, i8, i9);
        if (viewM10653u == null) {
            viewM10653u = this;
        }
        if (i8 < scrollY || i9 > i10) {
            m10639P(z8 ? i8 - scrollY : i9 - i10, 0, 1, true);
            z7 = true;
        }
        if (viewM10653u != findFocus()) {
            viewM10653u.requestFocus(i7);
        }
        return z7;
    }

    /* JADX INFO: renamed from: P */
    private int m10639P(int i7, int i8, int i9, boolean z7) {
        return m10658Q(i7, -1, null, i8, i9, z7);
    }

    /* JADX INFO: renamed from: R */
    private void m10640R(View view) {
        view.getDrawingRect(this.f9327c);
        offsetDescendantRectToMyCoords(view, this.f9327c);
        int iM10665g = m10665g(this.f9327c);
        if (iM10665g != 0) {
            scrollBy(0, iM10665g);
        }
    }

    /* JADX INFO: renamed from: S */
    private boolean m10641S(Rect rect, boolean z7) {
        int iM10665g = m10665g(rect);
        boolean z8 = iM10665g != 0;
        if (z8) {
            if (z7) {
                scrollBy(0, iM10665g);
                return z8;
            }
            m10659U(0, iM10665g);
        }
        return z8;
    }

    /* JADX INFO: renamed from: T */
    private boolean m10642T(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        return m10654x(-i7) < AbstractC2453d.m10729b(edgeEffect) * ((float) getHeight());
    }

    /* JADX INFO: renamed from: V */
    private void m10643V(int i7, int i8, int i9, boolean z7) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f9326b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f9328d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY, i9);
            m10637N(z7);
        } else {
            if (!this.f9328d.isFinished()) {
                m10645a();
            }
            scrollBy(i7, i8);
        }
        this.f9326b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: Z */
    private boolean m10644Z(MotionEvent motionEvent) {
        boolean z7;
        if (AbstractC2453d.m10729b(this.f9329e) != 0.0f) {
            AbstractC2453d.m10731d(this.f9329e, 0.0f, motionEvent.getX() / getWidth());
            z7 = true;
        } else {
            z7 = false;
        }
        if (AbstractC2453d.m10729b(this.f9330f) == 0.0f) {
            return z7;
        }
        AbstractC2453d.m10731d(this.f9330f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m10645a() {
        this.f9328d.abortAnimation();
        m10663a0(1);
    }

    /* JADX INFO: renamed from: d */
    private boolean m10647d() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    /* JADX INFO: renamed from: e */
    private boolean m10648e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private static int m10649f(int i7, int i8, int i9) {
        if (i8 >= i9 || i7 < 0) {
            return 0;
        }
        return i8 + i7 > i9 ? i9 - i8 : i7;
    }

    private C1003L getScrollFeedbackProvider() {
        if (this.f9331r == null) {
            this.f9331r = C1003L.m4382a(this);
        }
        return this.f9331r;
    }

    /* JADX INFO: renamed from: q */
    private void m10650q(int i7) {
        if (i7 != 0) {
            if (this.f9339z) {
                m10659U(0, i7);
            } else {
                scrollBy(0, i7);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private boolean m10651r(int i7) {
        if (AbstractC2453d.m10729b(this.f9329e) != 0.0f) {
            if (m10642T(this.f9329e, i7)) {
                this.f9329e.onAbsorb(i7);
                return true;
            }
            m10670v(-i7);
            return true;
        }
        if (AbstractC2453d.m10729b(this.f9330f) == 0.0f) {
            return false;
        }
        int i8 = -i7;
        if (m10642T(this.f9330f, i8)) {
            this.f9330f.onAbsorb(i8);
            return true;
        }
        m10670v(i8);
        return true;
    }

    /* JADX INFO: renamed from: s */
    private void m10652s() {
        this.f9313D = -1;
        this.f9336w = false;
        m10635L();
        m10663a0(0);
        this.f9329e.onRelease();
        this.f9330f.onRelease();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX INFO: renamed from: u */
    private View m10653u(boolean z7, int i7, int i8) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top < i8) {
                boolean z9 = i7 < top && bottom < i8;
                if (view == null) {
                    view = view2;
                    z8 = z9;
                } else {
                    boolean z10 = (z7 && top < view.getTop()) || (!z7 && bottom > view.getBottom());
                    if (z8) {
                        if (z9 && z10) {
                            view = view2;
                        }
                    } else if (z9) {
                        view = view2;
                        z8 = true;
                    } else if (z10) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: x */
    private float m10654x(int i7) {
        double dLog = Math.log((Math.abs(i7) * 0.35f) / (this.f9325a * 0.015f));
        float f7 = f9307P;
        return (float) (((double) (this.f9325a * 0.015f)) * Math.exp((((double) f7) / (((double) f7) - 1.0d)) * dLog));
    }

    /* JADX INFO: renamed from: z */
    private boolean m10655z(int i7, int i8) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i8 >= childAt.getTop() - scrollY && i8 < childAt.getBottom() - scrollY && i7 >= childAt.getLeft() && i7 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    boolean m10656J(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7) {
        boolean z8;
        boolean z9;
        int i15;
        int overScrollMode = getOverScrollMode();
        boolean z10 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z11 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z12 = overScrollMode == 0 || (overScrollMode == 1 && z10);
        boolean z13 = overScrollMode == 0 || (overScrollMode == 1 && z11);
        int i16 = i9 + i7;
        int i17 = !z12 ? 0 : i13;
        int i18 = i10 + i8;
        int i19 = !z13 ? 0 : i14;
        int i20 = -i17;
        int i21 = i17 + i11;
        int i22 = -i19;
        int i23 = i19 + i12;
        if (i16 > i21) {
            i16 = i21;
            z8 = true;
        } else if (i16 < i20) {
            z8 = true;
            i16 = i20;
        } else {
            z8 = false;
        }
        if (i18 > i23) {
            i18 = i23;
            z9 = true;
        } else if (i18 < i22) {
            z9 = true;
            i18 = i22;
        } else {
            z9 = false;
        }
        if (!z9 || m10672y(1)) {
            i15 = i16;
        } else {
            int i24 = i16;
            this.f9328d.springBack(i24, i18, 0, 0, 0, getScrollRange());
            i15 = i24;
        }
        onOverScrolled(i15, i18, z8, z9);
        return z8 || z9;
    }

    /* JADX INFO: renamed from: K */
    public boolean m10657K(int i7) {
        boolean z7 = i7 == 130;
        int height = getHeight();
        if (z7) {
            this.f9327c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f9327c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f9327c.top = getScrollY() - height;
            Rect rect2 = this.f9327c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f9327c;
        int i8 = rect3.top;
        int i9 = height + i8;
        rect3.bottom = i9;
        return m10638O(i7, i8, i9);
    }

    /* JADX INFO: renamed from: Q */
    int m10658Q(int i7, int i8, MotionEvent motionEvent, int i9, int i10, boolean z7) {
        int i11;
        int i12;
        VelocityTracker velocityTracker;
        if (i10 == 1) {
            m10662Y(2, i10);
        }
        boolean z8 = false;
        if (m10667i(0, i7, this.f9315F, this.f9314E, i10)) {
            int i13 = i7 - this.f9315F[1];
            i12 = this.f9314E[1];
            i11 = i13;
        } else {
            i11 = i7;
            i12 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z9 = m10647d() && !z7;
        int i14 = i11;
        boolean z10 = m10656J(0, i11, 0, scrollY, 0, scrollRange, 0, 0, true) && !m10672y(i10);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().m4384c(motionEvent.getDeviceId(), motionEvent.getSource(), i8, scrollY2);
        }
        int[] iArr = this.f9315F;
        iArr[1] = 0;
        m10668p(0, scrollY2, 0, i14 - scrollY2, this.f9314E, i10, iArr);
        int i15 = i12 + this.f9314E[1];
        int i16 = i14 - this.f9315F[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z9) {
                AbstractC2453d.m10731d(this.f9329e, (-i16) / getHeight(), i9 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().m4383b(motionEvent.getDeviceId(), motionEvent.getSource(), i8, true);
                }
                if (!this.f9330f.isFinished()) {
                    this.f9330f.onRelease();
                }
            }
        } else if (i17 > scrollRange && z9) {
            AbstractC2453d.m10731d(this.f9330f, i16 / getHeight(), 1.0f - (i9 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().m4383b(motionEvent.getDeviceId(), motionEvent.getSource(), i8, false);
            }
            if (!this.f9329e.isFinished()) {
                this.f9329e.onRelease();
            }
        }
        if (this.f9329e.isFinished() && this.f9330f.isFinished()) {
            z8 = z10;
        } else {
            postInvalidateOnAnimation();
        }
        if (z8 && i10 == 0 && (velocityTracker = this.f9337x) != null) {
            velocityTracker.clear();
        }
        if (i10 == 1) {
            m10663a0(i10);
            this.f9329e.onRelease();
            this.f9330f.onRelease();
        }
        return i15;
    }

    /* JADX INFO: renamed from: U */
    public final void m10659U(int i7, int i8) {
        m10643V(i7, i8, 250, false);
    }

    /* JADX INFO: renamed from: W */
    void m10660W(int i7, int i8, int i9, boolean z7) {
        m10643V(i7 - getScrollX(), i8 - getScrollY(), i9, z7);
    }

    /* JADX INFO: renamed from: X */
    void m10661X(int i7, int i8, boolean z7) {
        m10660W(i7, i8, 250, z7);
    }

    /* JADX INFO: renamed from: Y */
    public boolean m10662Y(int i7, int i8) {
        return this.f9320K.m4351p(i7, i8);
    }

    /* JADX INFO: renamed from: a0 */
    public void m10663a0(int i7) {
        this.f9320K.m4353r(i7);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* JADX INFO: renamed from: c */
    public boolean m10664c(int i7) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m10632G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m10639P(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f9327c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f9327c);
            m10639P(m10665g(this.f9327c), 0, 1, true);
            viewFindNextFocus.requestFocus(i7);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && m10630E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f9328d.isFinished()) {
            return;
        }
        this.f9328d.computeScrollOffset();
        int currY = this.f9328d.getCurrY();
        int iM10666h = m10666h(currY - this.f9317H);
        this.f9317H = currY;
        int[] iArr = this.f9315F;
        iArr[1] = 0;
        m10667i(0, iM10666h, iArr, null, 1);
        int i7 = iM10666h - this.f9315F[1];
        int scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            C2446c.m10674a(this, Math.abs(this.f9328d.getCurrVelocity()));
        }
        if (i7 != 0) {
            int scrollY = getScrollY();
            m10656J(0, i7, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i8 = i7 - scrollY2;
            int[] iArr2 = this.f9315F;
            iArr2[1] = 0;
            m10668p(0, scrollY2, 0, i8, this.f9314E, 1, iArr2);
            i7 = i8 - this.f9315F[1];
        }
        if (i7 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i7 < 0) {
                    if (this.f9329e.isFinished()) {
                        this.f9329e.onAbsorb((int) this.f9328d.getCurrVelocity());
                    }
                } else if (this.f9330f.isFinished()) {
                    this.f9330f.onAbsorb((int) this.f9328d.getCurrVelocity());
                }
            }
            m10645a();
        }
        if (this.f9328d.isFinished()) {
            m10663a0(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m10669t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f8, boolean z7) {
        return this.f9320K.m4340a(f7, f8, z7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f9320K.m4341b(f7, f8);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return m10667i(i7, i8, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f9320K.m4345f(i7, i8, i9, i10, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f9329e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (C2445b.m10673a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (C2445b.m10673a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f9329e.setSize(width, height);
            if (this.f9329e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f9330f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (C2445b.m10673a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (C2445b.m10673a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f9330f.setSize(width2, height2);
        if (this.f9330f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    /* JADX INFO: renamed from: g */
    protected int m10665g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i8, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f9319J.m4363a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f9321L == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f9321L = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f9321L;
    }

    /* JADX INFO: renamed from: h */
    int m10666h(int i7) {
        int height = getHeight();
        if (i7 > 0 && AbstractC2453d.m10729b(this.f9329e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * AbstractC2453d.m10731d(this.f9329e, ((-i7) * 4.0f) / height, 0.5f));
            if (iRound != i7) {
                this.f9329e.finish();
            }
            return i7 - iRound;
        }
        if (i7 >= 0 || AbstractC2453d.m10729b(this.f9330f) == 0.0f) {
            return i7;
        }
        float f7 = height;
        int iRound2 = Math.round((f7 / 4.0f) * AbstractC2453d.m10731d(this.f9330f, (i7 * 4.0f) / f7, 0.5f));
        if (iRound2 != i7) {
            this.f9330f.finish();
        }
        return i7 - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m10672y(0);
    }

    /* JADX INFO: renamed from: i */
    public boolean m10667i(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return this.f9320K.m4343d(i7, i8, iArr, iArr2, i9);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f9320K.m4348l();
    }

    @Override // p111O.InterfaceC0989E
    /* JADX INFO: renamed from: j */
    public void mo4361j(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        m10633H(i10, i11, iArr);
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: k */
    public void mo4355k(View view, int i7, int i8, int i9, int i10, int i11) {
        m10633H(i10, i11, null);
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: l */
    public boolean mo4356l(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: m */
    public void mo4357m(View view, View view2, int i7, int i8) {
        this.f9319J.m4365c(view, view2, i7, i8);
        m10662Y(2, i8);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i7, int i8) {
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: n */
    public void mo4358n(View view, int i7) {
        this.f9319J.m4367e(view, i7);
        m10663a0(i7);
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: o */
    public void mo4359o(View view, int i7, int i8, int[] iArr, int i9) {
        m10667i(i7, i8, iArr, null, i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9334u = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i7;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f9336w) {
            if (AbstractC0981A.m4263b(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i7 = 9;
                width = (int) motionEvent.getX();
            } else if (AbstractC0981A.m4263b(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i7 = 26;
                axisValue = axisValue2;
            } else {
                i7 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m10658Q(-((int) (axisValue * getVerticalScrollFactorCompat())), i7, motionEvent, width, 1, AbstractC0981A.m4263b(motionEvent, 8194));
                if (i7 == 0) {
                    return true;
                }
                this.f9324O.m4750g(motionEvent, i7);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z7 = true;
        if (action == 2 && this.f9336w) {
            return true;
        }
        int i7 = action & 255;
        if (i7 == 0) {
            int y7 = (int) motionEvent.getY();
            if (m10655z((int) motionEvent.getX(), y7)) {
                this.f9332s = y7;
                this.f9313D = motionEvent.getPointerId(0);
                m10626A();
                this.f9337x.addMovement(motionEvent);
                this.f9328d.computeScrollOffset();
                if (!m10644Z(motionEvent) && this.f9328d.isFinished()) {
                    z7 = false;
                }
                this.f9336w = z7;
                m10662Y(2, 0);
            } else {
                if (!m10644Z(motionEvent) && this.f9328d.isFinished()) {
                    z7 = false;
                }
                this.f9336w = z7;
                m10635L();
            }
        } else if (i7 == 1) {
            this.f9336w = false;
            this.f9313D = -1;
            m10635L();
            if (this.f9328d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m10663a0(0);
        } else if (i7 == 2) {
            int i8 = this.f9313D;
            if (i8 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i8);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                } else {
                    int y8 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y8 - this.f9332s) > this.f9310A && (2 & getNestedScrollAxes()) == 0) {
                        this.f9336w = true;
                        this.f9332s = y8;
                        m10628C();
                        this.f9337x.addMovement(motionEvent);
                        this.f9316G = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i7 == 3) {
            this.f9336w = false;
            this.f9313D = -1;
            m10635L();
            if (this.f9328d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m10663a0(0);
        } else if (i7 == 6) {
            m10634I(motionEvent);
        }
        return this.f9336w;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        int measuredHeight = 0;
        this.f9333t = false;
        View view = this.f9335v;
        if (view != null && m10631F(view, this)) {
            m10640R(this.f9335v);
        }
        this.f9335v = null;
        if (!this.f9334u) {
            if (this.f9318I != null) {
                scrollTo(getScrollX(), this.f9318I.f9341a);
                this.f9318I = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM10649f = m10649f(scrollY, paddingTop, measuredHeight);
            if (iM10649f != scrollY) {
                scrollTo(getScrollX(), iM10649f);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f9334u = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f9338y && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        if (z7) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        m10670v((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        mo4359o(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        m10633H(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        mo4357m(view, view2, i7, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i7, int i8, boolean z7, boolean z8) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (viewFindNextFocus == null || m10630E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i7, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2449f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2449f c2449f = (C2449f) parcelable;
        super.onRestoreInstanceState(c2449f.getSuperState());
        this.f9318I = c2449f;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C2449f c2449f = new C2449f(super.onSaveInstanceState());
        c2449f.f9341a = getScrollY();
        return c2449f;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        InterfaceC2448e interfaceC2448e = this.f9322M;
        if (interfaceC2448e != null) {
            interfaceC2448e.m10675a(this, i7, i8, i9, i10);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m10632G(viewFindFocus, 0, i10)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f9327c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f9327c);
        m10650q(m10665g(this.f9327c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return mo4356l(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo4358n(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        m10628C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9316G = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f9316G);
        if (actionMasked == 0) {
            nestedScrollView = this;
            if (getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.f9336w && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.f9328d.isFinished()) {
                m10645a();
            }
            m10629D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f9313D);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f9313D + " in onTouchEvent");
                } else {
                    int y7 = (int) motionEvent.getY(iFindPointerIndex);
                    int i7 = this.f9332s - y7;
                    int iM10636M = i7 - m10636M(i7, motionEvent.getX(iFindPointerIndex));
                    if (!this.f9336w && Math.abs(iM10636M) > this.f9310A) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f9336w = true;
                        iM10636M = iM10636M > 0 ? iM10636M - this.f9310A : iM10636M + this.f9310A;
                    }
                    int i8 = iM10636M;
                    if (this.f9336w) {
                        nestedScrollView = this;
                        int iM10658Q = nestedScrollView.m10658Q(i8, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        nestedScrollView.f9332s = y7 - iM10658Q;
                        nestedScrollView.f9316G += iM10658Q;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f9336w && getChildCount() > 0 && this.f9328d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m10652s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f9332s = (int) motionEvent.getY(actionIndex);
                this.f9313D = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m10634I(motionEvent);
                this.f9332s = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f9313D));
            }
            nestedScrollView = this;
        } else {
            nestedScrollView = this;
            VelocityTracker velocityTracker = nestedScrollView.f9337x;
            velocityTracker.computeCurrentVelocity(zzbbn.zzq.zzf, nestedScrollView.f9312C);
            int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.f9313D);
            if (Math.abs(yVelocity) >= nestedScrollView.f9311B) {
                if (!m10651r(yVelocity)) {
                    int i9 = -yVelocity;
                    float f7 = i9;
                    if (!dispatchNestedPreFling(0.0f, f7)) {
                        dispatchNestedFling(0.0f, f7, true);
                        m10670v(i9);
                    }
                }
            } else if (nestedScrollView.f9328d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m10652s();
        }
        VelocityTracker velocityTracker2 = nestedScrollView.f9337x;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m10668p(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        this.f9320K.m4344e(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f9333t) {
            this.f9335v = view2;
        } else {
            m10640R(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m10641S(rect, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        if (z7) {
            m10635L();
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f9333t = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM10649f = m10649f(i7, width, width2);
            int iM10649f2 = m10649f(i8, height, height2);
            if (iM10649f == getScrollX() && iM10649f2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM10649f, iM10649f2);
        }
    }

    public void setFillViewport(boolean z7) {
        if (z7 != this.f9338y) {
            this.f9338y = z7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        this.f9320K.m4349m(z7);
    }

    public void setOnScrollChangeListener(InterfaceC2448e interfaceC2448e) {
        this.f9322M = interfaceC2448e;
    }

    public void setSmoothScrollingEnabled(boolean z7) {
        this.f9339z = z7;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return m10662Y(i7, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m10663a0(0);
    }

    /* JADX INFO: renamed from: t */
    public boolean m10669t(KeyEvent keyEvent) {
        this.f9327c.setEmpty();
        if (!m10648e()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? m10671w(33) : m10664c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? m10671w(130) : m10664c(130);
            }
            if (keyCode == 62) {
                m10657K(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return m10671w(33);
            }
            if (keyCode == 93) {
                return m10671w(130);
            }
            if (keyCode == 122) {
                m10657K(33);
                return false;
            }
            if (keyCode == 123) {
                m10657K(130);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public void m10670v(int i7) {
        if (getChildCount() > 0) {
            this.f9328d.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, C3553a.e.API_PRIORITY_OTHER, 0, 0);
            m10637N(true);
            if (Build.VERSION.SDK_INT >= 35) {
                C2446c.m10674a(this, Math.abs(this.f9328d.getCurrVelocity()));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m10671w(int i7) {
        int childCount;
        boolean z7 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f9327c;
        rect.top = 0;
        rect.bottom = height;
        if (z7 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f9327c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f9327c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f9327c;
        return m10638O(i7, rect3.top, rect3.bottom);
    }

    /* JADX INFO: renamed from: y */
    public boolean m10672y(int i7) {
        return this.f9320K.m4347k(i7);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f9327c = new Rect();
        this.f9333t = true;
        this.f9334u = false;
        this.f9335v = null;
        this.f9336w = false;
        this.f9339z = true;
        this.f9313D = -1;
        this.f9314E = new int[2];
        this.f9315F = new int[2];
        C2447d c2447d = new C2447d();
        this.f9323N = c2447d;
        this.f9324O = new C1064o(getContext(), c2447d);
        this.f9329e = AbstractC2453d.m10728a(context, attributeSet);
        this.f9330f = AbstractC2453d.m10728a(context, attributeSet);
        this.f9325a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m10627B();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9309R, i7, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f9319J = new C0991F(this);
        this.f9320K = new C0985C(this);
        setNestedScrollingEnabled(true);
        AbstractC1030Z.m4474j0(this, f9308Q);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7) {
        if (getChildCount() <= 0) {
            super.addView(view, i7);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
