package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p248g0.AbstractC5453c;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final List f10044a;

    /* JADX INFO: renamed from: b */
    private final List f10045b;

    /* JADX INFO: renamed from: c */
    private View.OnApplyWindowInsetsListener f10046c;

    /* JADX INFO: renamed from: d */
    private boolean f10047d;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentContainerView$a */
    public static final class C2580a {

        /* JADX INFO: renamed from: a */
        public static final C2580a f10048a = new C2580a();

        private C2580a() {
        }

        /* JADX INFO: renamed from: a */
        public final WindowInsets m12010a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View v7, WindowInsets insets) {
            AbstractC6118n.m27187e(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            AbstractC6118n.m27187e(v7, "v");
            AbstractC6118n.m27187e(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v7, insets);
            AbstractC6118n.m27186d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC6118n.m27187e(context, "context");
    }

    /* JADX INFO: renamed from: a */
    private final void m12009a(View view) {
        if (this.f10045b.contains(view)) {
            this.f10044a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int i7, ViewGroup.LayoutParams layoutParams) {
        AbstractC6118n.m27187e(child, "child");
        if (AbstractC2599q.m12288C0(child) != null) {
            super.addView(child, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        C0982A0 c0982a0M4450V;
        AbstractC6118n.m27187e(insets, "insets");
        C0982A0 c0982a0M4265x = C0982A0.m4265x(insets);
        AbstractC6118n.m27186d(c0982a0M4265x, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f10046c;
        if (onApplyWindowInsetsListener != null) {
            C2580a c2580a = C2580a.f10048a;
            AbstractC6118n.m27184b(onApplyWindowInsetsListener);
            c0982a0M4450V = C0982A0.m4265x(c2580a.m12010a(onApplyWindowInsetsListener, this, insets));
        } else {
            c0982a0M4450V = AbstractC1030Z.m4450V(this, c0982a0M4265x);
        }
        AbstractC6118n.m27186d(c0982a0M4450V, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c0982a0M4450V.m4281p()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                AbstractC1030Z.m4467g(getChildAt(i7), c0982a0M4450V);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC6118n.m27187e(canvas, "canvas");
        if (this.f10047d) {
            Iterator it = this.f10044a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j7) {
        AbstractC6118n.m27187e(canvas, "canvas");
        AbstractC6118n.m27187e(child, "child");
        if (this.f10047d && !this.f10044a.isEmpty() && this.f10044a.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j7);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        AbstractC6118n.m27187e(view, "view");
        this.f10045b.remove(view);
        if (this.f10044a.remove(view)) {
            this.f10047d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC2591i> F getFragment() {
        return (F) AbstractC2599q.m12310j0(this).m12376g0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        AbstractC6118n.m27187e(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                AbstractC6118n.m27186d(view, "view");
                m12009a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        AbstractC6118n.m27187e(view, "view");
        m12009a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i7) {
        View view = getChildAt(i7);
        AbstractC6118n.m27186d(view, "view");
        m12009a(view);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        AbstractC6118n.m27187e(view, "view");
        m12009a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View view = getChildAt(i10);
            AbstractC6118n.m27186d(view, "view");
            m12009a(view);
        }
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View view = getChildAt(i10);
            AbstractC6118n.m27186d(view, "view");
            m12009a(view);
        }
        super.removeViewsInLayout(i7, i8);
    }

    public final void setDrawDisappearingViewsLast(boolean z7) {
        this.f10047d = z7;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f10046c = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        AbstractC6118n.m27187e(view, "view");
        if (view.getParent() == this) {
            this.f10045b.add(view);
        }
        super.startViewTransition(view);
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i7, int i8, AbstractC6112h abstractC6112h) {
        this(context, attributeSet, (i8 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i7) {
        String str;
        super(context, attributeSet, i7);
        AbstractC6118n.m27187e(context, "context");
        this.f10044a = new ArrayList();
        this.f10045b = new ArrayList();
        this.f10047d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = AbstractC5453c.f20757e;
            AbstractC6118n.m27186d(FragmentContainerView, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(AbstractC5453c.f20758f);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, AbstractC2599q fm) {
        String str;
        super(context, attrs);
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(attrs, "attrs");
        AbstractC6118n.m27187e(fm, "fm");
        this.f10044a = new ArrayList();
        this.f10045b = new ArrayList();
        this.f10047d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = AbstractC5453c.f20757e;
        AbstractC6118n.m27186d(FragmentContainerView, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(AbstractC5453c.f20758f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(AbstractC5453c.f20759g);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12376g0 = fm.m12376g0(id);
        if (classAttribute != null && abstractComponentCallbacksC2591iM12376g0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iMo12267a = fm.m12399t0().mo12267a(context.getClassLoader(), classAttribute);
            AbstractC6118n.m27186d(abstractComponentCallbacksC2591iMo12267a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC2591iMo12267a.m12124H0(context, attrs, null);
            fm.m12391n().m12513s(true).m12506c(this, abstractComponentCallbacksC2591iMo12267a, string).mo12019j();
        }
        fm.m12359T0(this);
    }
}
