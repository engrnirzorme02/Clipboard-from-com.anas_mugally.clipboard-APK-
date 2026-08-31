package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.AbstractC2436b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001A.AbstractC0000a;
import p001A.AbstractC0001b;
import p001A.AbstractC0002c;
import p041F.AbstractC0400a;
import p104N.AbstractC0905b;
import p104N.C0909f;
import p104N.InterfaceC0907d;
import p111O.AbstractC1030Z;
import p111O.AbstractC1074t;
import p111O.C0982A0;
import p111O.C0991F;
import p111O.InterfaceC0987D;
import p111O.InterfaceC0989E;
import p111O.InterfaceC0993G;
import p146T.AbstractC1446a;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0987D, InterfaceC0989E {

    /* JADX INFO: renamed from: F */
    static final String f9228F;

    /* JADX INFO: renamed from: G */
    static final Class[] f9229G;

    /* JADX INFO: renamed from: H */
    static final ThreadLocal f9230H;

    /* JADX INFO: renamed from: I */
    static final Comparator f9231I;

    /* JADX INFO: renamed from: J */
    private static final InterfaceC0907d f9232J;

    /* JADX INFO: renamed from: A */
    private boolean f9233A;

    /* JADX INFO: renamed from: B */
    private Drawable f9234B;

    /* JADX INFO: renamed from: C */
    ViewGroup.OnHierarchyChangeListener f9235C;

    /* JADX INFO: renamed from: D */
    private InterfaceC0993G f9236D;

    /* JADX INFO: renamed from: E */
    private final C0991F f9237E;

    /* JADX INFO: renamed from: a */
    private final List f9238a;

    /* JADX INFO: renamed from: b */
    private final C2430a f9239b;

    /* JADX INFO: renamed from: c */
    private final List f9240c;

    /* JADX INFO: renamed from: d */
    private Paint f9241d;

    /* JADX INFO: renamed from: e */
    private final int[] f9242e;

    /* JADX INFO: renamed from: f */
    private final int[] f9243f;

    /* JADX INFO: renamed from: r */
    private final int[] f9244r;

    /* JADX INFO: renamed from: s */
    private boolean f9245s;

    /* JADX INFO: renamed from: t */
    private boolean f9246t;

    /* JADX INFO: renamed from: u */
    private int[] f9247u;

    /* JADX INFO: renamed from: v */
    private View f9248v;

    /* JADX INFO: renamed from: w */
    private View f9249w;

    /* JADX INFO: renamed from: x */
    private ViewTreeObserverOnPreDrawListenerC2427g f9250x;

    /* JADX INFO: renamed from: y */
    private boolean f9251y;

    /* JADX INFO: renamed from: z */
    private C0982A0 f9252z;

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C2421a implements InterfaceC0993G {
        C2421a() {
        }

        @Override // p111O.InterfaceC0993G
        /* JADX INFO: renamed from: a */
        public C0982A0 mo4369a(View view, C0982A0 c0982a0) {
            return CoordinatorLayout.this.m10482g0(c0982a0);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC2422b {
        AbstractC2423c getBehavior();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC2423c {
        public AbstractC2423c() {
        }

        /* JADX INFO: renamed from: A */
        public boolean mo10492A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z7) {
            return false;
        }

        /* JADX INFO: renamed from: B */
        public void mo10493B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: C */
        public Parcelable mo10494C(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* JADX INFO: renamed from: D */
        public boolean m10495D(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7) {
            return false;
        }

        /* JADX INFO: renamed from: E */
        public boolean mo10496E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7, int i8) {
            if (i8 == 0) {
                return m10495D(coordinatorLayout, view, view2, view3, i7);
            }
            return false;
        }

        /* JADX INFO: renamed from: F */
        public void m10497F(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* JADX INFO: renamed from: G */
        public void mo10498G(CoordinatorLayout coordinatorLayout, View view, View view2, int i7) {
            if (i7 == 0) {
                m10497F(coordinatorLayout, view, view2);
            }
        }

        /* JADX INFO: renamed from: H */
        public boolean mo10499H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public boolean m10500e(CoordinatorLayout coordinatorLayout, View view) {
            return m10503h(coordinatorLayout, view) > 0.0f;
        }

        /* JADX INFO: renamed from: f */
        public boolean mo10501f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m10502g(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        /* JADX INFO: renamed from: h */
        public float m10503h(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        /* JADX INFO: renamed from: i */
        public boolean mo10504i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* JADX INFO: renamed from: j */
        public C0982A0 m10505j(CoordinatorLayout coordinatorLayout, View view, C0982A0 c0982a0) {
            return c0982a0;
        }

        /* JADX INFO: renamed from: k */
        public void mo10506k(C2426f c2426f) {
        }

        /* JADX INFO: renamed from: l */
        public boolean mo10507l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* JADX INFO: renamed from: m */
        public void mo10508m(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* JADX INFO: renamed from: n */
        public void mo10509n() {
        }

        /* JADX INFO: renamed from: o */
        public boolean mo10510o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: p */
        public boolean mo10511p(CoordinatorLayout coordinatorLayout, View view, int i7) {
            return false;
        }

        /* JADX INFO: renamed from: q */
        public boolean mo10512q(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10) {
            return false;
        }

        /* JADX INFO: renamed from: r */
        public boolean m10513r(CoordinatorLayout coordinatorLayout, View view, View view2, float f7, float f8, boolean z7) {
            return false;
        }

        /* JADX INFO: renamed from: s */
        public boolean mo10514s(CoordinatorLayout coordinatorLayout, View view, View view2, float f7, float f8) {
            return false;
        }

        /* JADX INFO: renamed from: t */
        public void m10515t(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int[] iArr) {
        }

        /* JADX INFO: renamed from: u */
        public void mo10516u(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int[] iArr, int i9) {
            if (i9 == 0) {
                m10515t(coordinatorLayout, view, view2, i7, i8, iArr);
            }
        }

        /* JADX INFO: renamed from: v */
        public void m10517v(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int i9, int i10) {
        }

        /* JADX INFO: renamed from: w */
        public void m10518w(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int i9, int i10, int i11) {
            if (i11 == 0) {
                m10517v(coordinatorLayout, view, view2, i7, i8, i9, i10);
            }
        }

        /* JADX INFO: renamed from: x */
        public void mo10519x(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            iArr[0] = iArr[0] + i9;
            iArr[1] = iArr[1] + i10;
            m10518w(coordinatorLayout, view, view2, i7, i8, i9, i10, i11);
        }

        /* JADX INFO: renamed from: y */
        public void m10520y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7) {
        }

        /* JADX INFO: renamed from: z */
        public void m10521z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7, int i8) {
            if (i8 == 0) {
                m10520y(coordinatorLayout, view, view2, view3, i7);
            }
        }

        public AbstractC2423c(Context context, AttributeSet attributeSet) {
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC2424d {
        Class value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class ViewGroupOnHierarchyChangeListenerC2425e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC2425e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f9235C;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m10475P(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f9235C;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class ViewTreeObserverOnPreDrawListenerC2427g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC2427g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m10475P(0);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    static class C2429i implements Comparator {
        C2429i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fM4439K = AbstractC1030Z.m4439K(view);
            float fM4439K2 = AbstractC1030Z.m4439K(view2);
            if (fM4439K > fM4439K2) {
                return -1;
            }
            return fM4439K < fM4439K2 ? 1 : 0;
        }
    }

    static {
        Package r7 = CoordinatorLayout.class.getPackage();
        f9228F = r7 != null ? r7.getName() : null;
        f9231I = new C2429i();
        f9229G = new Class[]{Context.class, AttributeSet.class};
        f9230H = new ThreadLocal();
        f9232J = new C0909f(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: A */
    private int m10438A(int i7) {
        int[] iArr = this.f9247u;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i7);
            return 0;
        }
        if (i7 >= 0 && i7 < iArr.length) {
            return iArr[i7];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i7 + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: D */
    private void m10439D(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i7) : i7));
        }
        Comparator comparator = f9231I;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* JADX INFO: renamed from: E */
    private boolean m10440E(View view) {
        return this.f9239b.m10557k(view);
    }

    /* JADX INFO: renamed from: G */
    private void m10441G(View view, int i7) {
        C2426f c2426f = (C2426f) view.getLayoutParams();
        Rect rectM10455a = m10455a();
        rectM10455a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2426f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2426f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c2426f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin);
        if (this.f9252z != null && AbstractC1030Z.m4499w(this) && !AbstractC1030Z.m4499w(view)) {
            rectM10455a.left += this.f9252z.m4276j();
            rectM10455a.top += this.f9252z.m4278l();
            rectM10455a.right -= this.f9252z.m4277k();
            rectM10455a.bottom -= this.f9252z.m4275i();
        }
        Rect rectM10455a2 = m10455a();
        AbstractC1074t.m4770a(m10459c0(c2426f.f9257c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM10455a, rectM10455a2, i7);
        view.layout(rectM10455a2.left, rectM10455a2.top, rectM10455a2.right, rectM10455a2.bottom);
        m10454Y(rectM10455a);
        m10454Y(rectM10455a2);
    }

    /* JADX INFO: renamed from: H */
    private void m10442H(View view, View view2, int i7) {
        Rect rectM10455a = m10455a();
        Rect rectM10455a2 = m10455a();
        try {
            m10490x(view2, rectM10455a);
            m10491y(view, i7, rectM10455a, rectM10455a2);
            view.layout(rectM10455a2.left, rectM10455a2.top, rectM10455a2.right, rectM10455a2.bottom);
        } finally {
            m10454Y(rectM10455a);
            m10454Y(rectM10455a2);
        }
    }

    /* JADX INFO: renamed from: I */
    private void m10443I(View view, int i7, int i8) {
        int i9;
        C2426f c2426f = (C2426f) view.getLayoutParams();
        int iM4771b = AbstractC1074t.m4771b(m10461d0(c2426f.f9257c), i8);
        int i10 = iM4771b & 7;
        int i11 = iM4771b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i8 == 1) {
            i7 = width - i7;
        }
        int iM10438A = m10438A(i7) - measuredWidth;
        if (i10 == 1) {
            iM10438A += measuredWidth / 2;
        } else if (i10 == 5) {
            iM10438A += measuredWidth;
        }
        if (i11 != 16) {
            i9 = i11 != 80 ? 0 : measuredHeight;
        } else {
            i9 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2426f).leftMargin, Math.min(iM10438A, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c2426f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2426f).topMargin, Math.min(i9, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* JADX INFO: renamed from: J */
    private int m10444J() {
        return (int) (getHeight() * 0.2f);
    }

    /* JADX INFO: renamed from: K */
    private boolean m10445K(View view, int i7) {
        mo4356l(this, view, 2, 1);
        mo4359o(view, 0, i7, this.f9244r, 1);
        int[] iArr = this.f9244r;
        int i8 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        mo4361j(view, 0, i8, 0, i7, 1, iArr);
        mo4358n(view, 1);
        return this.f9244r[1] > 0;
    }

    /* JADX INFO: renamed from: L */
    private boolean m10446L(int i7) {
        return m10445K(m10469q(this), i7);
    }

    /* JADX INFO: renamed from: M */
    private MotionEvent m10447M(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    /* JADX INFO: renamed from: N */
    private void m10448N(View view, Rect rect, int i7) {
        boolean z7;
        boolean z8;
        int width;
        int i8;
        int i9;
        int i10;
        int height;
        int i11;
        int i12;
        int i13;
        if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
            C2426f c2426f = (C2426f) view.getLayoutParams();
            AbstractC2423c abstractC2423cM10530f = c2426f.m10530f();
            Rect rectM10455a = m10455a();
            Rect rectM10455a2 = m10455a();
            rectM10455a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (abstractC2423cM10530f == null || !abstractC2423cM10530f.mo10501f(this, view, rectM10455a)) {
                rectM10455a.set(rectM10455a2);
            } else if (!rectM10455a2.contains(rectM10455a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM10455a.toShortString() + " | Bounds:" + rectM10455a2.toShortString());
            }
            m10454Y(rectM10455a2);
            if (rectM10455a.isEmpty()) {
                m10454Y(rectM10455a);
                return;
            }
            int iM4771b = AbstractC1074t.m4771b(c2426f.f9262h, i7);
            boolean z9 = true;
            if ((iM4771b & 48) != 48 || (i12 = (rectM10455a.top - ((ViewGroup.MarginLayoutParams) c2426f).topMargin) - c2426f.f9264j) >= (i13 = rect.top)) {
                z7 = false;
            } else {
                m10465f0(view, i13 - i12);
                z7 = true;
            }
            if ((iM4771b & 80) == 80 && (height = ((getHeight() - rectM10455a.bottom) - ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin) + c2426f.f9264j) < (i11 = rect.bottom)) {
                m10465f0(view, height - i11);
                z7 = true;
            }
            if (!z7) {
                m10465f0(view, 0);
            }
            if ((iM4771b & 3) != 3 || (i9 = (rectM10455a.left - ((ViewGroup.MarginLayoutParams) c2426f).leftMargin) - c2426f.f9263i) >= (i10 = rect.left)) {
                z8 = false;
            } else {
                m10463e0(view, i10 - i9);
                z8 = true;
            }
            if ((iM4771b & 5) != 5 || (width = ((getWidth() - rectM10455a.right) - ((ViewGroup.MarginLayoutParams) c2426f).rightMargin) + c2426f.f9263i) >= (i8 = rect.right)) {
                z9 = z8;
            } else {
                m10463e0(view, width - i8);
            }
            if (!z9) {
                m10463e0(view, 0);
            }
            m10454Y(rectM10455a);
        }
    }

    /* JADX INFO: renamed from: S */
    private int m10449S() {
        return getHeight();
    }

    /* JADX INFO: renamed from: T */
    static AbstractC2423c m10450T(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f9228F;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f9230H;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f9229G);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (AbstractC2423c) constructor.newInstance(context, attributeSet);
        } catch (Exception e7) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e7);
        }
    }

    /* JADX INFO: renamed from: U */
    private boolean m10451U(AbstractC2423c abstractC2423c, View view, MotionEvent motionEvent, int i7) {
        if (i7 == 0) {
            return abstractC2423c.mo10510o(this, view, motionEvent);
        }
        if (i7 == 1) {
            return abstractC2423c.mo10499H(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: V */
    private boolean m10452V(MotionEvent motionEvent, int i7) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f9240c;
        m10439D(list);
        int size = list.size();
        MotionEvent motionEventM10447M = null;
        boolean zM10451U = false;
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) list.get(i8);
            C2426f c2426f = (C2426f) view.getLayoutParams();
            AbstractC2423c abstractC2423cM10530f = c2426f.m10530f();
            if (!(zM10451U || z7) || actionMasked == 0) {
                if (!z7 && !zM10451U && abstractC2423cM10530f != null && (zM10451U = m10451U(abstractC2423cM10530f, view, motionEvent, i7))) {
                    this.f9248v = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i9 = 0; i9 < i8; i9++) {
                            View view2 = (View) list.get(i9);
                            AbstractC2423c abstractC2423cM10530f2 = ((C2426f) view2.getLayoutParams()).m10530f();
                            if (abstractC2423cM10530f2 != null) {
                                if (motionEventM10447M == null) {
                                    motionEventM10447M = m10447M(motionEvent);
                                }
                                m10451U(abstractC2423cM10530f2, view2, motionEventM10447M, i7);
                            }
                        }
                    }
                }
                boolean zM10527c = c2426f.m10527c();
                boolean zM10533i = c2426f.m10533i(this, view);
                z7 = zM10533i && !zM10527c;
                if (zM10533i && !z7) {
                    break;
                }
            } else if (abstractC2423cM10530f != null) {
                if (motionEventM10447M == null) {
                    motionEventM10447M = m10447M(motionEvent);
                }
                m10451U(abstractC2423cM10530f, view, motionEventM10447M, i7);
            }
        }
        list.clear();
        if (motionEventM10447M != null) {
            motionEventM10447M.recycle();
        }
        return zM10451U;
    }

    /* JADX INFO: renamed from: W */
    private void m10453W() {
        this.f9238a.clear();
        this.f9239b.m10551c();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            C2426f c2426fM10472C = m10472C(childAt);
            c2426fM10472C.m10528d(this, childAt);
            this.f9239b.m10550b(childAt);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (i8 != i7) {
                    View childAt2 = getChildAt(i8);
                    if (c2426fM10472C.m10526b(this, childAt, childAt2)) {
                        if (!this.f9239b.m10552d(childAt2)) {
                            this.f9239b.m10550b(childAt2);
                        }
                        this.f9239b.m10549a(childAt2, childAt);
                    }
                }
            }
        }
        this.f9238a.addAll(this.f9239b.m10556j());
        Collections.reverse(this.f9238a);
    }

    /* JADX INFO: renamed from: Y */
    private static void m10454Y(Rect rect) {
        rect.setEmpty();
        f9232J.mo4130a(rect);
    }

    /* JADX INFO: renamed from: a */
    private static Rect m10455a() {
        Rect rect = (Rect) f9232J.mo4131b();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: a0 */
    private void m10456a0() {
        View view = this.f9248v;
        if (view != null) {
            AbstractC2423c abstractC2423cM10530f = ((C2426f) view.getLayoutParams()).m10530f();
            if (abstractC2423cM10530f != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                abstractC2423cM10530f.mo10499H(this, this.f9248v, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.f9248v = null;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ((C2426f) getChildAt(i7).getLayoutParams()).m10537m();
        }
        this.f9245s = false;
    }

    /* JADX INFO: renamed from: b0 */
    private static int m10457b0(int i7) {
        if (i7 == 0) {
            return 17;
        }
        return i7;
    }

    /* JADX INFO: renamed from: c */
    private void m10458c() {
        int childCount = getChildCount();
        MotionEvent motionEventObtain = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            AbstractC2423c abstractC2423cM10530f = ((C2426f) childAt.getLayoutParams()).m10530f();
            if (abstractC2423cM10530f != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                abstractC2423cM10530f.mo10510o(this, childAt, motionEventObtain);
            }
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: c0 */
    private static int m10459c0(int i7) {
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        return (i7 & 112) == 0 ? i7 | 48 : i7;
    }

    /* JADX INFO: renamed from: d */
    private static int m10460d(int i7, int i8, int i9) {
        if (i7 < i8) {
            return i8;
        }
        return i7 > i9 ? i9 : i7;
    }

    /* JADX INFO: renamed from: d0 */
    private static int m10461d0(int i7) {
        if (i7 == 0) {
            return 8388661;
        }
        return i7;
    }

    /* JADX INFO: renamed from: e */
    private void m10462e(C2426f c2426f, Rect rect, int i7, int i8) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2426f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i7) - ((ViewGroup.MarginLayoutParams) c2426f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2426f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i8) - ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin));
        rect.set(iMax, iMax2, i7 + iMax, i8 + iMax2);
    }

    /* JADX INFO: renamed from: e0 */
    private void m10463e0(View view, int i7) {
        C2426f c2426f = (C2426f) view.getLayoutParams();
        int i8 = c2426f.f9263i;
        if (i8 != i7) {
            AbstractC1030Z.m4448T(view, i7 - i8);
            c2426f.f9263i = i7;
        }
    }

    /* JADX INFO: renamed from: f */
    private C0982A0 m10464f(C0982A0 c0982a0) {
        AbstractC2423c abstractC2423cM10530f;
        if (c0982a0.m4281p()) {
            return c0982a0;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (AbstractC1030Z.m4499w(childAt) && (abstractC2423cM10530f = ((C2426f) childAt.getLayoutParams()).m10530f()) != null) {
                c0982a0 = abstractC2423cM10530f.m10505j(this, childAt, c0982a0);
                if (c0982a0.m4281p()) {
                    return c0982a0;
                }
            }
        }
        return c0982a0;
    }

    /* JADX INFO: renamed from: f0 */
    private void m10465f0(View view, int i7) {
        C2426f c2426f = (C2426f) view.getLayoutParams();
        int i8 = c2426f.f9264j;
        if (i8 != i7) {
            AbstractC1030Z.m4449U(view, i7 - i8);
            c2426f.f9264j = i7;
        }
    }

    private int getFullContentHeight() {
        int height = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            C2426f c2426f = (C2426f) childAt.getLayoutParams();
            height += childAt.getHeight() + ((ViewGroup.MarginLayoutParams) c2426f).topMargin + ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin;
        }
        return height;
    }

    /* JADX INFO: renamed from: h */
    private int m10466h() {
        return getFullContentHeight() - getHeight();
    }

    /* JADX INFO: renamed from: h0 */
    private void m10467h0() {
        if (!AbstractC1030Z.m4499w(this)) {
            AbstractC1030Z.m4494t0(this, null);
            return;
        }
        if (this.f9236D == null) {
            this.f9236D = new C2421a();
        }
        AbstractC1030Z.m4494t0(this, this.f9236D);
        setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: i */
    private int m10468i() {
        return -getFullContentHeight();
    }

    /* JADX INFO: renamed from: q */
    private View m10469q(View view) {
        while (view != null) {
            if (view.isFocused()) {
                return view;
            }
            view = view instanceof ViewGroup ? ((ViewGroup) view).getFocusedChild() : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    private void m10470z(int i7, Rect rect, Rect rect2, C2426f c2426f, int i8, int i9) {
        int iWidth;
        int iHeight;
        int iM4771b = AbstractC1074t.m4771b(m10457b0(c2426f.f9257c), i7);
        int iM4771b2 = AbstractC1074t.m4771b(m10459c0(c2426f.f9258d), i7);
        int i10 = iM4771b & 7;
        int i11 = iM4771b & 112;
        int i12 = iM4771b2 & 7;
        int i13 = iM4771b2 & 112;
        if (i12 != 1) {
            iWidth = i12 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i13 != 16) {
            iHeight = i13 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i10 == 1) {
            iWidth -= i8 / 2;
        } else if (i10 != 5) {
            iWidth -= i8;
        }
        if (i11 == 16) {
            iHeight -= i9 / 2;
        } else if (i11 != 80) {
            iHeight -= i9;
        }
        rect2.set(iWidth, iHeight, i8 + iWidth, i9 + iHeight);
    }

    /* JADX INFO: renamed from: B */
    void m10471B(View view, Rect rect) {
        rect.set(((C2426f) view.getLayoutParams()).m10532h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    C2426f m10472C(View view) {
        C2426f c2426f = (C2426f) view.getLayoutParams();
        if (!c2426f.f9256b) {
            if (view instanceof InterfaceC2422b) {
                AbstractC2423c behavior = ((InterfaceC2422b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c2426f.m10538o(behavior);
                c2426f.f9256b = true;
                return c2426f;
            }
            InterfaceC2424d interfaceC2424d = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC2424d = (InterfaceC2424d) superclass.getAnnotation(InterfaceC2424d.class);
                if (interfaceC2424d != null) {
                    break;
                }
            }
            if (interfaceC2424d != null) {
                try {
                    c2426f.m10538o((AbstractC2423c) interfaceC2424d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e7) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC2424d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e7);
                }
            }
            c2426f.f9256b = true;
        }
        return c2426f;
    }

    /* JADX INFO: renamed from: F */
    public boolean m10473F(View view, int i7, int i8) {
        Rect rectM10455a = m10455a();
        m10490x(view, rectM10455a);
        try {
            return rectM10455a.contains(i7, i8);
        } finally {
            m10454Y(rectM10455a);
        }
    }

    /* JADX INFO: renamed from: O */
    void m10474O(View view, int i7) {
        AbstractC2423c abstractC2423cM10530f;
        C2426f c2426f = (C2426f) view.getLayoutParams();
        if (c2426f.f9265k != null) {
            Rect rectM10455a = m10455a();
            Rect rectM10455a2 = m10455a();
            Rect rectM10455a3 = m10455a();
            m10490x(c2426f.f9265k, rectM10455a);
            m10487u(view, false, rectM10455a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m10470z(i7, rectM10455a, rectM10455a3, c2426f, measuredWidth, measuredHeight);
            boolean z7 = (rectM10455a3.left == rectM10455a2.left && rectM10455a3.top == rectM10455a2.top) ? false : true;
            m10462e(c2426f, rectM10455a3, measuredWidth, measuredHeight);
            int i8 = rectM10455a3.left - rectM10455a2.left;
            int i9 = rectM10455a3.top - rectM10455a2.top;
            if (i8 != 0) {
                AbstractC1030Z.m4448T(view, i8);
            }
            if (i9 != 0) {
                AbstractC1030Z.m4449U(view, i9);
            }
            if (z7 && (abstractC2423cM10530f = c2426f.m10530f()) != null) {
                abstractC2423cM10530f.mo10507l(this, view, c2426f.f9265k);
            }
            m10454Y(rectM10455a);
            m10454Y(rectM10455a2);
            m10454Y(rectM10455a3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX INFO: renamed from: P */
    final void m10475P(int i7) {
        int i8;
        AbstractC2423c abstractC2423cM10530f;
        boolean zMo10507l;
        int layoutDirection = getLayoutDirection();
        int size = this.f9238a.size();
        Rect rectM10455a = m10455a();
        Rect rectM10455a2 = m10455a();
        Rect rectM10455a3 = m10455a();
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) this.f9238a.get(i9);
            C2426f c2426f = (C2426f) view.getLayoutParams();
            if (i7 != 0 || view.getVisibility() != 8) {
                for (int i10 = 0; i10 < i9; i10++) {
                    if (c2426f.f9266l == ((View) this.f9238a.get(i10))) {
                        m10474O(view, layoutDirection);
                    }
                }
                m10487u(view, true, rectM10455a2);
                if (c2426f.f9261g != 0 && !rectM10455a2.isEmpty()) {
                    int iM4771b = AbstractC1074t.m4771b(c2426f.f9261g, layoutDirection);
                    int i11 = iM4771b & 112;
                    if (i11 == 48) {
                        rectM10455a.top = Math.max(rectM10455a.top, rectM10455a2.bottom);
                    } else if (i11 == 80) {
                        rectM10455a.bottom = Math.max(rectM10455a.bottom, getHeight() - rectM10455a2.top);
                    }
                    int i12 = iM4771b & 7;
                    if (i12 == 3) {
                        rectM10455a.left = Math.max(rectM10455a.left, rectM10455a2.right);
                    } else if (i12 == 5) {
                        rectM10455a.right = Math.max(rectM10455a.right, getWidth() - rectM10455a2.left);
                    }
                }
                if (c2426f.f9262h != 0 && view.getVisibility() == 0) {
                    m10448N(view, rectM10455a, layoutDirection);
                }
                if (i7 != 2) {
                    m10471B(view, rectM10455a3);
                    if (!rectM10455a3.equals(rectM10455a2)) {
                        m10478X(view, rectM10455a2);
                        for (i8 = i9 + 1; i8 < size; i8++) {
                            View view2 = (View) this.f9238a.get(i8);
                            C2426f c2426f2 = (C2426f) view2.getLayoutParams();
                            abstractC2423cM10530f = c2426f2.m10530f();
                            if (abstractC2423cM10530f == null && abstractC2423cM10530f.mo10504i(this, view2, view)) {
                                if (i7 == 0 && c2426f2.m10531g()) {
                                    c2426f2.m10535k();
                                } else {
                                    if (i7 != 2) {
                                        zMo10507l = abstractC2423cM10530f.mo10507l(this, view2, view);
                                    } else {
                                        abstractC2423cM10530f.mo10508m(this, view2, view);
                                        zMo10507l = true;
                                    }
                                    if (i7 == 1) {
                                        c2426f2.m10539p(zMo10507l);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i8 < size) {
                        View view3 = (View) this.f9238a.get(i8);
                        C2426f c2426f3 = (C2426f) view3.getLayoutParams();
                        abstractC2423cM10530f = c2426f3.m10530f();
                        if (abstractC2423cM10530f == null) {
                        }
                    }
                }
            }
        }
        m10454Y(rectM10455a);
        m10454Y(rectM10455a2);
        m10454Y(rectM10455a3);
    }

    /* JADX INFO: renamed from: Q */
    public void m10476Q(View view, int i7) {
        C2426f c2426f = (C2426f) view.getLayoutParams();
        if (c2426f.m10525a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = c2426f.f9265k;
        if (view2 != null) {
            m10442H(view, view2, i7);
            return;
        }
        int i8 = c2426f.f9259e;
        if (i8 >= 0) {
            m10443I(view, i8, i7);
        } else {
            m10441G(view, i7);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m10477R(View view, int i7, int i8, int i9, int i10) {
        measureChildWithMargins(view, i7, i8, i9, i10);
    }

    /* JADX INFO: renamed from: X */
    void m10478X(View view, Rect rect) {
        ((C2426f) view.getLayoutParams()).m10540q(rect);
    }

    /* JADX INFO: renamed from: Z */
    void m10479Z() {
        if (this.f9246t && this.f9250x != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f9250x);
        }
        this.f9251y = false;
    }

    /* JADX INFO: renamed from: b */
    void m10480b() {
        if (this.f9246t) {
            if (this.f9250x == null) {
                this.f9250x = new ViewTreeObserverOnPreDrawListenerC2427g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f9250x);
        }
        this.f9251y = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2426f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!zDispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? m10446L(-m10449S()) : m10446L(-m10444J());
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? m10446L(m10449S()) : m10446L(m10444J());
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? m10446L(m10468i()) : m10446L(m10466h());
            }
            if (keyCode == 92) {
                return m10446L(-m10449S());
            }
            if (keyCode == 93) {
                return m10446L(m10449S());
            }
            if (keyCode == 122) {
                return m10446L(m10468i());
            }
            if (keyCode == 123) {
                return m10446L(m10466h());
            }
        }
        return zDispatchKeyEvent;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j7) {
        C2426f c2426f = (C2426f) view.getLayoutParams();
        AbstractC2423c abstractC2423c = c2426f.f9255a;
        if (abstractC2423c != null) {
            float fM10503h = abstractC2423c.m10503h(this, view);
            if (fM10503h > 0.0f) {
                if (this.f9241d == null) {
                    this.f9241d = new Paint();
                }
                this.f9241d.setColor(c2426f.f9255a.m10502g(this, view));
                this.f9241d.setAlpha(m10460d(Math.round(fM10503h * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f9241d);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9234B;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10481g(View view) {
        ArrayList arrayListM10554h = this.f9239b.m10554h(view);
        if (arrayListM10554h == null || arrayListM10554h.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < arrayListM10554h.size(); i7++) {
            View view2 = (View) arrayListM10554h.get(i7);
            AbstractC2423c abstractC2423cM10530f = ((C2426f) view2.getLayoutParams()).m10530f();
            if (abstractC2423cM10530f != null) {
                abstractC2423cM10530f.mo10507l(this, view2, view);
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    final C0982A0 m10482g0(C0982A0 c0982a0) {
        if (AbstractC0905b.m4125a(this.f9252z, c0982a0)) {
            return c0982a0;
        }
        this.f9252z = c0982a0;
        boolean z7 = false;
        boolean z8 = c0982a0 != null && c0982a0.m4278l() > 0;
        this.f9233A = z8;
        if (!z8 && getBackground() == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        C0982A0 c0982a0M10464f = m10464f(c0982a0);
        requestLayout();
        return c0982a0M10464f;
    }

    final List<View> getDependencySortedChildren() {
        m10453W();
        return Collections.unmodifiableList(this.f9238a);
    }

    public final C0982A0 getLastWindowInsets() {
        return this.f9252z;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f9237E.m4363a();
    }

    public Drawable getStatusBarBackground() {
        return this.f9234B;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // p111O.InterfaceC0989E
    /* JADX INFO: renamed from: j */
    public void mo4361j(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        AbstractC2423c abstractC2423cM10530f;
        int childCount = getChildCount();
        boolean z7 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C2426f c2426f = (C2426f) childAt.getLayoutParams();
                if (c2426f.m10534j(i11) && (abstractC2423cM10530f = c2426f.m10530f()) != null) {
                    int[] iArr2 = this.f9242e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC2423cM10530f.mo10519x(this, childAt, view, i7, i8, i9, i10, i11, iArr2);
                    iMax = i9 > 0 ? Math.max(iMax, this.f9242e[0]) : Math.min(iMax, this.f9242e[0]);
                    iMax2 = i10 > 0 ? Math.max(iMax2, this.f9242e[1]) : Math.min(iMax2, this.f9242e[1]);
                    z7 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z7) {
            m10475P(1);
        }
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: k */
    public void mo4355k(View view, int i7, int i8, int i9, int i10, int i11) {
        mo4361j(view, i7, i8, i9, i10, 0, this.f9243f);
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: l */
    public boolean mo4356l(View view, View view2, int i7, int i8) {
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C2426f c2426f = (C2426f) childAt.getLayoutParams();
                AbstractC2423c abstractC2423cM10530f = c2426f.m10530f();
                if (abstractC2423cM10530f != null) {
                    boolean zMo10496E = abstractC2423cM10530f.mo10496E(this, childAt, view, view2, i7, i8);
                    z7 |= zMo10496E;
                    c2426f.m10541r(i8, zMo10496E);
                } else {
                    c2426f.m10541r(i8, false);
                }
            }
        }
        return z7;
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: m */
    public void mo4357m(View view, View view2, int i7, int i8) {
        AbstractC2423c abstractC2423cM10530f;
        View view3;
        View view4;
        int i9;
        int i10;
        this.f9237E.m4365c(view, view2, i7, i8);
        this.f9249w = view2;
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            C2426f c2426f = (C2426f) childAt.getLayoutParams();
            if (c2426f.m10534j(i8) && (abstractC2423cM10530f = c2426f.m10530f()) != null) {
                view3 = view;
                view4 = view2;
                i9 = i7;
                i10 = i8;
                abstractC2423cM10530f.m10521z(this, childAt, view3, view4, i9, i10);
            } else {
                view3 = view;
                view4 = view2;
                i9 = i7;
                i10 = i8;
            }
            i11++;
            view = view3;
            view2 = view4;
            i7 = i9;
            i8 = i10;
        }
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: n */
    public void mo4358n(View view, int i7) {
        this.f9237E.m4367e(view, i7);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C2426f c2426f = (C2426f) childAt.getLayoutParams();
            if (c2426f.m10534j(i7)) {
                AbstractC2423c abstractC2423cM10530f = c2426f.m10530f();
                if (abstractC2423cM10530f != null) {
                    abstractC2423cM10530f.mo10498G(this, childAt, view, i7);
                }
                c2426f.m10536l(i7);
                c2426f.m10535k();
            }
        }
        this.f9249w = null;
    }

    @Override // p111O.InterfaceC0987D
    /* JADX INFO: renamed from: o */
    public void mo4359o(View view, int i7, int i8, int[] iArr, int i9) {
        AbstractC2423c abstractC2423cM10530f;
        int childCount = getChildCount();
        boolean z7 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C2426f c2426f = (C2426f) childAt.getLayoutParams();
                if (c2426f.m10534j(i9) && (abstractC2423cM10530f = c2426f.m10530f()) != null) {
                    int[] iArr2 = this.f9242e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC2423cM10530f.mo10516u(this, childAt, view, i7, i8, iArr2, i9);
                    iMax = i7 > 0 ? Math.max(iMax, this.f9242e[0]) : Math.min(iMax, this.f9242e[0]);
                    iMax2 = i8 > 0 ? Math.max(iMax2, this.f9242e[1]) : Math.min(iMax2, this.f9242e[1]);
                    z7 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z7) {
            m10475P(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m10456a0();
        if (this.f9251y) {
            if (this.f9250x == null) {
                this.f9250x = new ViewTreeObserverOnPreDrawListenerC2427g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f9250x);
        }
        if (this.f9252z == null && AbstractC1030Z.m4499w(this)) {
            AbstractC1030Z.m4468g0(this);
        }
        this.f9246t = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m10456a0();
        if (this.f9251y && this.f9250x != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f9250x);
        }
        View view = this.f9249w;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f9246t = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f9233A || this.f9234B == null) {
            return;
        }
        C0982A0 c0982a0 = this.f9252z;
        int iM4278l = c0982a0 != null ? c0982a0.m4278l() : 0;
        if (iM4278l > 0) {
            this.f9234B.setBounds(0, 0, getWidth(), iM4278l);
            this.f9234B.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m10456a0();
        }
        boolean zM10452V = m10452V(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM10452V;
        }
        this.f9248v = null;
        m10456a0();
        return zM10452V;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        AbstractC2423c abstractC2423cM10530f;
        int layoutDirection = getLayoutDirection();
        int size = this.f9238a.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f9238a.get(i11);
            if (view.getVisibility() != 8 && ((abstractC2423cM10530f = ((C2426f) view.getLayoutParams()).m10530f()) == null || !abstractC2423cM10530f.mo10511p(this, view, layoutDirection))) {
                m10476Q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC2423c abstractC2423cM10530f;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        View view;
        int i19;
        int i20;
        boolean zMo10512q;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m10453W();
        coordinatorLayout.m10483p();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z7 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        int i21 = paddingLeft + paddingRight;
        int i22 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z8 = coordinatorLayout.f9252z != null && AbstractC1030Z.m4499w(coordinatorLayout);
        int size3 = coordinatorLayout.f9238a.size();
        int i23 = 0;
        int iCombineMeasuredStates = 0;
        while (i23 < size3) {
            View view2 = (View) coordinatorLayout.f9238a.get(i23);
            int i24 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i14 = size3;
                i10 = i23;
                i19 = paddingRight;
                i15 = layoutDirection;
                suggestedMinimumWidth = i24;
                i12 = paddingLeft;
            } else {
                C2426f c2426f = (C2426f) view2.getLayoutParams();
                int i25 = c2426f.f9259e;
                if (i25 < 0 || mode == 0) {
                    i9 = suggestedMinimumHeight;
                } else {
                    int iM10438A = coordinatorLayout.m10438A(i25);
                    int iM4771b = AbstractC1074t.m4771b(m10461d0(c2426f.f9257c), layoutDirection) & 7;
                    i9 = suggestedMinimumHeight;
                    if ((iM4771b != 3 || z7) && !(iM4771b == 5 && z7)) {
                        if ((iM4771b == 5 && !z7) || (iM4771b == 3 && z7)) {
                            iMax = Math.max(0, iM10438A - paddingLeft);
                        }
                        if (z8 || AbstractC1030Z.m4499w(view2)) {
                            iMakeMeasureSpec = i7;
                            iMakeMeasureSpec2 = i8;
                        } else {
                            int iM4276j = coordinatorLayout.f9252z.m4276j() + coordinatorLayout.f9252z.m4277k();
                            int iM4278l = coordinatorLayout.f9252z.m4278l() + coordinatorLayout.f9252z.m4275i();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM4276j, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM4278l, mode2);
                        }
                        abstractC2423cM10530f = c2426f.m10530f();
                        if (abstractC2423cM10530f != null) {
                            i14 = size3;
                            int i26 = iMakeMeasureSpec;
                            view = view2;
                            i12 = paddingLeft;
                            i13 = i24;
                            i15 = layoutDirection;
                            i16 = i9;
                            i19 = paddingRight;
                            i20 = iCombineMeasuredStates;
                            int i27 = iMakeMeasureSpec2;
                            zMo10512q = abstractC2423cM10530f.mo10512q(this, view, i26, i11, i27, 0);
                            i18 = i26;
                            i17 = i27;
                            if (zMo10512q) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i13, i21 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2426f).leftMargin + ((ViewGroup.MarginLayoutParams) c2426f).rightMargin);
                            int iMax2 = Math.max(i16, i22 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2426f).topMargin + ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            i12 = paddingLeft;
                            i13 = i24;
                            i14 = size3;
                            i15 = layoutDirection;
                            i16 = i9;
                            i17 = iMakeMeasureSpec2;
                            i18 = iMakeMeasureSpec;
                            view = view2;
                            i19 = paddingRight;
                            i20 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.m10477R(view3, i18, i11, i17, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i13, i21 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2426f).leftMargin + ((ViewGroup.MarginLayoutParams) c2426f).rightMargin);
                        int iMax3 = Math.max(i16, i22 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2426f).topMargin + ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM10438A);
                    }
                    int i28 = i23;
                    i11 = iMax;
                    i10 = i28;
                    if (z8) {
                        iMakeMeasureSpec = i7;
                        iMakeMeasureSpec2 = i8;
                    } else {
                        iMakeMeasureSpec = i7;
                        iMakeMeasureSpec2 = i8;
                    }
                    abstractC2423cM10530f = c2426f.m10530f();
                    if (abstractC2423cM10530f != null) {
                        i14 = size3;
                        int i29 = iMakeMeasureSpec;
                        view = view2;
                        i12 = paddingLeft;
                        i13 = i24;
                        i15 = layoutDirection;
                        i16 = i9;
                        i19 = paddingRight;
                        i20 = iCombineMeasuredStates;
                        int i210 = iMakeMeasureSpec2;
                        zMo10512q = abstractC2423cM10530f.mo10512q(this, view, i29, i11, i210, 0);
                        i18 = i29;
                        i17 = i210;
                        if (zMo10512q) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i13, i21 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2426f).leftMargin + ((ViewGroup.MarginLayoutParams) c2426f).rightMargin);
                        int iMax4 = Math.max(i16, i22 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2426f).topMargin + ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        i12 = paddingLeft;
                        i13 = i24;
                        i14 = size3;
                        i15 = layoutDirection;
                        i16 = i9;
                        i17 = iMakeMeasureSpec2;
                        i18 = iMakeMeasureSpec;
                        view = view2;
                        i19 = paddingRight;
                        i20 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.m10477R(view4, i18, i11, i17, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i13, i21 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2426f).leftMargin + ((ViewGroup.MarginLayoutParams) c2426f).rightMargin);
                    int iMax5 = Math.max(i16, i22 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2426f).topMargin + ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i10 = i23;
                i11 = 0;
                if (z8) {
                    iMakeMeasureSpec = i7;
                    iMakeMeasureSpec2 = i8;
                } else {
                    iMakeMeasureSpec = i7;
                    iMakeMeasureSpec2 = i8;
                }
                abstractC2423cM10530f = c2426f.m10530f();
                if (abstractC2423cM10530f != null) {
                    i14 = size3;
                    int i211 = iMakeMeasureSpec;
                    view = view2;
                    i12 = paddingLeft;
                    i13 = i24;
                    i15 = layoutDirection;
                    i16 = i9;
                    i19 = paddingRight;
                    i20 = iCombineMeasuredStates;
                    int i212 = iMakeMeasureSpec2;
                    zMo10512q = abstractC2423cM10530f.mo10512q(this, view, i211, i11, i212, 0);
                    i18 = i211;
                    i17 = i212;
                    if (zMo10512q) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i13, i21 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2426f).leftMargin + ((ViewGroup.MarginLayoutParams) c2426f).rightMargin);
                    int iMax6 = Math.max(i16, i22 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2426f).topMargin + ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    i12 = paddingLeft;
                    i13 = i24;
                    i14 = size3;
                    i15 = layoutDirection;
                    i16 = i9;
                    i17 = iMakeMeasureSpec2;
                    i18 = iMakeMeasureSpec;
                    view = view2;
                    i19 = paddingRight;
                    i20 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.m10477R(view5, i18, i11, i17, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i13, i21 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2426f).leftMargin + ((ViewGroup.MarginLayoutParams) c2426f).rightMargin);
                int iMax7 = Math.max(i16, i22 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2426f).topMargin + ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i23 = i10 + 1;
            paddingLeft = i12;
            paddingRight = i19;
            size3 = i14;
            layoutDirection = i15;
        }
        int i30 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i7, (-16777216) & i30), View.resolveSizeAndState(suggestedMinimumHeight, i8, i30 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        AbstractC2423c abstractC2423cM10530f;
        View view2;
        float f9;
        float f10;
        boolean z8;
        int childCount = getChildCount();
        int i7 = 0;
        boolean zM10513r = false;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f9 = f7;
                f10 = f8;
                z8 = z7;
            } else {
                C2426f c2426f = (C2426f) childAt.getLayoutParams();
                if (c2426f.m10534j(0) && (abstractC2423cM10530f = c2426f.m10530f()) != null) {
                    view2 = view;
                    f9 = f7;
                    f10 = f8;
                    z8 = z7;
                    zM10513r |= abstractC2423cM10530f.m10513r(this, childAt, view2, f9, f10, z8);
                } else {
                    view2 = view;
                    f9 = f7;
                    f10 = f8;
                    z8 = z7;
                }
            }
            i7++;
            view = view2;
            f7 = f9;
            f8 = f10;
            z7 = z8;
        }
        if (zM10513r) {
            m10475P(1);
        }
        return zM10513r;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        AbstractC2423c abstractC2423cM10530f;
        View view2;
        float f9;
        float f10;
        int childCount = getChildCount();
        int i7 = 0;
        boolean zMo10514s = false;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f9 = f7;
                f10 = f8;
            } else {
                C2426f c2426f = (C2426f) childAt.getLayoutParams();
                if (c2426f.m10534j(0) && (abstractC2423cM10530f = c2426f.m10530f()) != null) {
                    view2 = view;
                    f9 = f7;
                    f10 = f8;
                    zMo10514s |= abstractC2423cM10530f.mo10514s(this, childAt, view2, f9, f10);
                } else {
                    view2 = view;
                    f9 = f7;
                    f10 = f8;
                }
            }
            i7++;
            view = view2;
            f7 = f9;
            f8 = f10;
        }
        return zMo10514s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        mo4359o(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        mo4355k(view, i7, i8, i9, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        mo4357m(view, view2, i7, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C2428h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2428h c2428h = (C2428h) parcelable;
        super.onRestoreInstanceState(c2428h.m6085a());
        SparseArray sparseArray = c2428h.f9274c;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            AbstractC2423c abstractC2423cM10530f = m10472C(childAt).m10530f();
            if (id != -1 && abstractC2423cM10530f != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC2423cM10530f.mo10493B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableMo10494C;
        C2428h c2428h = new C2428h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            AbstractC2423c abstractC2423cM10530f = ((C2426f) childAt.getLayoutParams()).m10530f();
            if (id != -1 && abstractC2423cM10530f != null && (parcelableMo10494C = abstractC2423cM10530f.mo10494C(this, childAt)) != null) {
                sparseArray.append(id, parcelableMo10494C);
            }
        }
        c2428h.f9274c = sparseArray;
        return c2428h;
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
        boolean zM10452V;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f9248v;
        boolean z7 = false;
        if (view != null) {
            AbstractC2423c abstractC2423cM10530f = ((C2426f) view.getLayoutParams()).m10530f();
            zM10452V = abstractC2423cM10530f != null ? abstractC2423cM10530f.mo10499H(this, this.f9248v, motionEvent) : false;
        } else {
            zM10452V = m10452V(motionEvent, 1);
            if (actionMasked != 0 && zM10452V) {
                z7 = true;
            }
        }
        if (this.f9248v == null || actionMasked == 3) {
            zM10452V |= super.onTouchEvent(motionEvent);
        } else if (z7) {
            MotionEvent motionEventM10447M = m10447M(motionEvent);
            super.onTouchEvent(motionEventM10447M);
            motionEventM10447M.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zM10452V;
        }
        this.f9248v = null;
        m10456a0();
        return zM10452V;
    }

    /* JADX INFO: renamed from: p */
    void m10483p() {
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (m10440E(getChildAt(i7))) {
                z7 = true;
                break;
            }
        }
        if (z7 != this.f9251y) {
            if (z7) {
                m10480b();
            } else {
                m10479Z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2426f generateDefaultLayoutParams() {
        return new C2426f(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        AbstractC2423c abstractC2423cM10530f = ((C2426f) view.getLayoutParams()).m10530f();
        if (abstractC2423cM10530f == null || !abstractC2423cM10530f.mo10492A(this, view, rect, z7)) {
            return super.requestChildRectangleOnScreen(view, rect, z7);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        super.requestDisallowInterceptTouchEvent(z7);
        if (!z7 || this.f9245s) {
            return;
        }
        if (this.f9248v == null) {
            m10458c();
        }
        m10456a0();
        this.f9245s = true;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C2426f generateLayoutParams(AttributeSet attributeSet) {
        return new C2426f(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z7) {
        super.setFitsSystemWindows(z7);
        m10467h0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9235C = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f9234B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f9234B = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f9234B.setState(getDrawableState());
                }
                AbstractC0400a.m1707m(this.f9234B, getLayoutDirection());
                this.f9234B.setVisible(getVisibility() == 0, false);
                this.f9234B.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i7) {
        setStatusBarBackground(new ColorDrawable(i7));
    }

    public void setStatusBarBackgroundResource(int i7) {
        setStatusBarBackground(i7 != 0 ? AbstractC2436b.getDrawable(getContext(), i7) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z7 = i7 == 0;
        Drawable drawable = this.f9234B;
        if (drawable == null || drawable.isVisible() == z7) {
            return;
        }
        this.f9234B.setVisible(z7, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public C2426f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2426f) {
            return new C2426f((C2426f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2426f((ViewGroup.MarginLayoutParams) layoutParams) : new C2426f(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    void m10487u(View view, boolean z7, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z7) {
            m10490x(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: v */
    public List m10488v(View view) {
        List listM10555i = this.f9239b.m10555i(view);
        return listM10555i == null ? Collections.EMPTY_LIST : listM10555i;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9234B;
    }

    /* JADX INFO: renamed from: w */
    public List m10489w(View view) {
        List listM10553g = this.f9239b.m10553g(view);
        return listM10553g == null ? Collections.EMPTY_LIST : listM10553g;
    }

    /* JADX INFO: renamed from: x */
    void m10490x(View view, Rect rect) {
        AbstractC2431b.m10558a(this, view, rect);
    }

    /* JADX INFO: renamed from: y */
    void m10491y(View view, int i7, Rect rect, Rect rect2) {
        C2426f c2426f = (C2426f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m10470z(i7, rect, rect2, c2426f, measuredWidth, measuredHeight);
        m10462e(c2426f, rect2, measuredWidth, measuredHeight);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0000a.f0a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i7);
        this.f9238a = new ArrayList();
        this.f9239b = new C2430a();
        this.f9240c = new ArrayList();
        this.f9242e = new int[2];
        this.f9243f = new int[2];
        this.f9244r = new int[2];
        this.f9237E = new C0991F(this);
        if (i7 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0002c.f2a, 0, AbstractC0001b.f1a);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0002c.f2a, i7, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i7 == 0) {
            coordinatorLayout = this;
            context2 = context;
            AbstractC1030Z.m4470h0(coordinatorLayout, context2, AbstractC0002c.f2a, attributeSet, typedArray, 0, AbstractC0001b.f1a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            AbstractC1030Z.m4470h0(coordinatorLayout, context2, AbstractC0002c.f2a, attributeSet, typedArray, i7, 0);
        }
        int resourceId = typedArray.getResourceId(AbstractC0002c.f3b, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f9247u = resources.getIntArray(resourceId);
            float f7 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f9247u.length;
            for (int i8 = 0; i8 < length; i8++) {
                int[] iArr = coordinatorLayout.f9247u;
                iArr[i8] = (int) (iArr[i8] * f7);
            }
        }
        coordinatorLayout.f9234B = typedArray.getDrawable(AbstractC0002c.f4c);
        typedArray.recycle();
        m10467h0();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC2425e());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    protected static class C2428h extends AbstractC1446a {
        public static final Parcelable.Creator<C2428h> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        SparseArray f9274c;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2428h createFromParcel(Parcel parcel) {
                return new C2428h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2428h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2428h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C2428h[] newArray(int i7) {
                return new C2428h[i7];
            }
        }

        public C2428h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i7 = parcel.readInt();
            int[] iArr = new int[i7];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f9274c = new SparseArray(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                this.f9274c.append(iArr[i8], parcelableArray[i8]);
            }
        }

        @Override // p146T.AbstractC1446a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            SparseArray sparseArray = this.f9274c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = this.f9274c.keyAt(i8);
                parcelableArr[i8] = (Parcelable) this.f9274c.valueAt(i8);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i7);
        }

        public C2428h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C2426f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        AbstractC2423c f9255a;

        /* JADX INFO: renamed from: b */
        boolean f9256b;

        /* JADX INFO: renamed from: c */
        public int f9257c;

        /* JADX INFO: renamed from: d */
        public int f9258d;

        /* JADX INFO: renamed from: e */
        public int f9259e;

        /* JADX INFO: renamed from: f */
        int f9260f;

        /* JADX INFO: renamed from: g */
        public int f9261g;

        /* JADX INFO: renamed from: h */
        public int f9262h;

        /* JADX INFO: renamed from: i */
        int f9263i;

        /* JADX INFO: renamed from: j */
        int f9264j;

        /* JADX INFO: renamed from: k */
        View f9265k;

        /* JADX INFO: renamed from: l */
        View f9266l;

        /* JADX INFO: renamed from: m */
        private boolean f9267m;

        /* JADX INFO: renamed from: n */
        private boolean f9268n;

        /* JADX INFO: renamed from: o */
        private boolean f9269o;

        /* JADX INFO: renamed from: p */
        private boolean f9270p;

        /* JADX INFO: renamed from: q */
        final Rect f9271q;

        /* JADX INFO: renamed from: r */
        Object f9272r;

        public C2426f(int i7, int i8) {
            super(i7, i8);
            this.f9256b = false;
            this.f9257c = 0;
            this.f9258d = 0;
            this.f9259e = -1;
            this.f9260f = -1;
            this.f9261g = 0;
            this.f9262h = 0;
            this.f9271q = new Rect();
        }

        /* JADX INFO: renamed from: n */
        private void m10522n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f9260f);
            this.f9265k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f9266l = null;
                    this.f9265k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f9260f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f9266l = null;
                this.f9265k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f9266l = null;
                    this.f9265k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f9266l = viewFindViewById;
        }

        /* JADX INFO: renamed from: s */
        private boolean m10523s(View view, int i7) {
            int iM4771b = AbstractC1074t.m4771b(((C2426f) view.getLayoutParams()).f9261g, i7);
            return iM4771b != 0 && (AbstractC1074t.m4771b(this.f9262h, i7) & iM4771b) == iM4771b;
        }

        /* JADX INFO: renamed from: t */
        private boolean m10524t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f9265k.getId() != this.f9260f) {
                return false;
            }
            View view2 = this.f9265k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f9266l = null;
                    this.f9265k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f9266l = view2;
            return true;
        }

        /* JADX INFO: renamed from: a */
        boolean m10525a() {
            return this.f9265k == null && this.f9260f != -1;
        }

        /* JADX INFO: renamed from: b */
        boolean m10526b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f9266l || m10523s(view2, coordinatorLayout.getLayoutDirection())) {
                return true;
            }
            AbstractC2423c abstractC2423c = this.f9255a;
            return abstractC2423c != null && abstractC2423c.mo10504i(coordinatorLayout, view, view2);
        }

        /* JADX INFO: renamed from: c */
        boolean m10527c() {
            if (this.f9255a == null) {
                this.f9267m = false;
            }
            return this.f9267m;
        }

        /* JADX INFO: renamed from: d */
        View m10528d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f9260f == -1) {
                this.f9266l = null;
                this.f9265k = null;
                return null;
            }
            if (this.f9265k == null || !m10524t(view, coordinatorLayout)) {
                m10522n(view, coordinatorLayout);
            }
            return this.f9265k;
        }

        /* JADX INFO: renamed from: e */
        public int m10529e() {
            return this.f9260f;
        }

        /* JADX INFO: renamed from: f */
        public AbstractC2423c m10530f() {
            return this.f9255a;
        }

        /* JADX INFO: renamed from: g */
        boolean m10531g() {
            return this.f9270p;
        }

        /* JADX INFO: renamed from: h */
        Rect m10532h() {
            return this.f9271q;
        }

        /* JADX INFO: renamed from: i */
        boolean m10533i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z7 = this.f9267m;
            if (z7) {
                return true;
            }
            AbstractC2423c abstractC2423c = this.f9255a;
            boolean zM10500e = (abstractC2423c != null ? abstractC2423c.m10500e(coordinatorLayout, view) : false) | z7;
            this.f9267m = zM10500e;
            return zM10500e;
        }

        /* JADX INFO: renamed from: j */
        boolean m10534j(int i7) {
            if (i7 == 0) {
                return this.f9268n;
            }
            if (i7 != 1) {
                return false;
            }
            return this.f9269o;
        }

        /* JADX INFO: renamed from: k */
        void m10535k() {
            this.f9270p = false;
        }

        /* JADX INFO: renamed from: l */
        void m10536l(int i7) {
            m10541r(i7, false);
        }

        /* JADX INFO: renamed from: m */
        void m10537m() {
            this.f9267m = false;
        }

        /* JADX INFO: renamed from: o */
        public void m10538o(AbstractC2423c abstractC2423c) {
            AbstractC2423c abstractC2423c2 = this.f9255a;
            if (abstractC2423c2 != abstractC2423c) {
                if (abstractC2423c2 != null) {
                    abstractC2423c2.mo10509n();
                }
                this.f9255a = abstractC2423c;
                this.f9272r = null;
                this.f9256b = true;
                if (abstractC2423c != null) {
                    abstractC2423c.mo10506k(this);
                }
            }
        }

        /* JADX INFO: renamed from: p */
        void m10539p(boolean z7) {
            this.f9270p = z7;
        }

        /* JADX INFO: renamed from: q */
        void m10540q(Rect rect) {
            this.f9271q.set(rect);
        }

        /* JADX INFO: renamed from: r */
        void m10541r(int i7, boolean z7) {
            if (i7 == 0) {
                this.f9268n = z7;
            } else {
                if (i7 != 1) {
                    return;
                }
                this.f9269o = z7;
            }
        }

        C2426f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9256b = false;
            this.f9257c = 0;
            this.f9258d = 0;
            this.f9259e = -1;
            this.f9260f = -1;
            this.f9261g = 0;
            this.f9262h = 0;
            this.f9271q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0002c.f5d);
            this.f9257c = typedArrayObtainStyledAttributes.getInteger(AbstractC0002c.f6e, 0);
            this.f9260f = typedArrayObtainStyledAttributes.getResourceId(AbstractC0002c.f7f, -1);
            this.f9258d = typedArrayObtainStyledAttributes.getInteger(AbstractC0002c.f8g, 0);
            this.f9259e = typedArrayObtainStyledAttributes.getInteger(AbstractC0002c.f12k, -1);
            this.f9261g = typedArrayObtainStyledAttributes.getInt(AbstractC0002c.f11j, 0);
            this.f9262h = typedArrayObtainStyledAttributes.getInt(AbstractC0002c.f10i, 0);
            int i7 = AbstractC0002c.f9h;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i7);
            this.f9256b = zHasValue;
            if (zHasValue) {
                this.f9255a = CoordinatorLayout.m10450T(context, attributeSet, typedArrayObtainStyledAttributes.getString(i7));
            }
            typedArrayObtainStyledAttributes.recycle();
            AbstractC2423c abstractC2423c = this.f9255a;
            if (abstractC2423c != null) {
                abstractC2423c.mo10506k(this);
            }
        }

        public C2426f(C2426f c2426f) {
            super((ViewGroup.MarginLayoutParams) c2426f);
            this.f9256b = false;
            this.f9257c = 0;
            this.f9258d = 0;
            this.f9259e = -1;
            this.f9260f = -1;
            this.f9261g = 0;
            this.f9262h = 0;
            this.f9271q = new Rect();
        }

        public C2426f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9256b = false;
            this.f9257c = 0;
            this.f9258d = 0;
            this.f9259e = -1;
            this.f9260f = -1;
            this.f9261g = 0;
            this.f9262h = 0;
            this.f9271q = new Rect();
        }

        public C2426f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9256b = false;
            this.f9257c = 0;
            this.f9258d = 0;
            this.f9259e = -1;
            this.f9260f = -1;
            this.f9261g = 0;
            this.f9262h = 0;
            this.f9271q = new Rect();
        }
    }
}
