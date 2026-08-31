package p111O;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.AbstractC2263x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p009B.AbstractC0040c;
import p118P.C1170s;
import p118P.InterfaceC1173v;

/* JADX INFO: renamed from: O.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1030Z {

    /* JADX INFO: renamed from: a */
    private static WeakHashMap f3804a = null;

    /* JADX INFO: renamed from: b */
    private static Field f3805b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f3806c = false;

    /* JADX INFO: renamed from: d */
    private static final int[] f3807d = {AbstractC0040c.f305b, AbstractC0040c.f306c, AbstractC0040c.f317n, AbstractC0040c.f328y, AbstractC0040c.f285B, AbstractC0040c.f286C, AbstractC0040c.f287D, AbstractC0040c.f288E, AbstractC0040c.f289F, AbstractC0040c.f290G, AbstractC0040c.f307d, AbstractC0040c.f308e, AbstractC0040c.f309f, AbstractC0040c.f310g, AbstractC0040c.f311h, AbstractC0040c.f312i, AbstractC0040c.f313j, AbstractC0040c.f314k, AbstractC0040c.f315l, AbstractC0040c.f316m, AbstractC0040c.f318o, AbstractC0040c.f319p, AbstractC0040c.f320q, AbstractC0040c.f321r, AbstractC0040c.f322s, AbstractC0040c.f323t, AbstractC0040c.f324u, AbstractC0040c.f325v, AbstractC0040c.f326w, AbstractC0040c.f327x, AbstractC0040c.f329z, AbstractC0040c.f284A};

    /* JADX INFO: renamed from: e */
    private static final InterfaceC0997I f3808e = new InterfaceC0997I() { // from class: O.Y
        @Override // p111O.InterfaceC0997I
        /* JADX INFO: renamed from: a */
        public final C1041d mo4373a(C1041d c1041d) {
            return AbstractC1030Z.m4455a(c1041d);
        }
    };

    /* JADX INFO: renamed from: f */
    private static final e f3809f = new e();

    /* JADX INFO: renamed from: O.Z$a */
    class a extends f {
        a(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo4507c(View view) {
            return Boolean.valueOf(l.m4558c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo4508d(View view, Boolean bool) {
            l.m4561f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo4509g(Boolean bool, Boolean bool2) {
            return !m4528a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: O.Z$b */
    class b extends f {
        b(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo4507c(View view) {
            return l.m4556a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo4508d(View view, CharSequence charSequence) {
            l.m4560e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo4509g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: O.Z$c */
    class c extends f {
        c(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo4507c(View view) {
            return n.m4565b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo4508d(View view, CharSequence charSequence) {
            n.m4567d(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo4509g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: O.Z$d */
    class d extends f {
        d(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo4507c(View view) {
            return Boolean.valueOf(l.m4557b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo4508d(View view, Boolean bool) {
            l.m4559d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p111O.AbstractC1030Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo4509g(Boolean bool, Boolean bool2) {
            return !m4528a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: O.Z$e */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        private final WeakHashMap f3810a = new WeakHashMap();

        e() {
        }

        /* JADX INFO: renamed from: b */
        private void m4522b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z7 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z7) {
                AbstractC1030Z.m4447S(view, z7 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z7));
            }
        }

        /* JADX INFO: renamed from: c */
        private void m4523c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* JADX INFO: renamed from: e */
        private void m4524e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX INFO: renamed from: a */
        void m4525a(View view) {
            this.f3810a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                m4523c(view);
            }
        }

        /* JADX INFO: renamed from: d */
        void m4526d(View view) {
            this.f3810a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m4524e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f3810a.entrySet().iterator();
                while (it.hasNext()) {
                    m4522b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m4523c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: O.Z$f */
    static abstract class f {

        /* JADX INFO: renamed from: a */
        private final int f3811a;

        /* JADX INFO: renamed from: b */
        private final Class f3812b;

        /* JADX INFO: renamed from: c */
        private final int f3813c;

        /* JADX INFO: renamed from: d */
        private final int f3814d;

        f(int i7, Class cls, int i8) {
            this(i7, cls, 0, i8);
        }

        /* JADX INFO: renamed from: b */
        private boolean m4527b() {
            return Build.VERSION.SDK_INT >= this.f3813c;
        }

        /* JADX INFO: renamed from: a */
        boolean m4528a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* JADX INFO: renamed from: c */
        abstract Object mo4507c(View view);

        /* JADX INFO: renamed from: d */
        abstract void mo4508d(View view, Object obj);

        /* JADX INFO: renamed from: e */
        Object m4529e(View view) {
            if (m4527b()) {
                return mo4507c(view);
            }
            Object tag = view.getTag(this.f3811a);
            if (this.f3812b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        void m4530f(View view, Object obj) {
            if (m4527b()) {
                mo4508d(view, obj);
            } else if (mo4509g(m4529e(view), obj)) {
                AbstractC1030Z.m4473j(view);
                view.setTag(this.f3811a, obj);
                AbstractC1030Z.m4447S(view, this.f3814d);
            }
        }

        /* JADX INFO: renamed from: g */
        abstract boolean mo4509g(Object obj, Object obj2);

        f(int i7, Class cls, int i8, int i9) {
            this.f3811a = i7;
            this.f3812b = cls;
            this.f3814d = i8;
            this.f3813c = i9;
        }
    }

    /* JADX INFO: renamed from: O.Z$g */
    static class g {
        /* JADX INFO: renamed from: a */
        static WindowInsets m4531a(View view, WindowInsets windowInsets) {
            return AbstractC1045e0.f3856b ? AbstractC1045e0.m4658b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: b */
        static WindowInsets m4532b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: c */
        static void m4533c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: O.Z$h */
    private static class h {

        /* JADX INFO: renamed from: O.Z$h$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            C0982A0 f3815a = null;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ View f3816b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC0993G f3817c;

            a(View view, InterfaceC0993G interfaceC0993G) {
                this.f3816b = view;
                this.f3817c = interfaceC0993G;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0982A0 c0982a0M4266y = C0982A0.m4266y(windowInsets, view);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 30) {
                    h.m4534a(windowInsets, this.f3816b);
                    if (c0982a0M4266y.equals(this.f3815a)) {
                        return this.f3817c.mo4369a(view, c0982a0M4266y).m4288w();
                    }
                }
                this.f3815a = c0982a0M4266y;
                C0982A0 c0982a0Mo4369a = this.f3817c.mo4369a(view, c0982a0M4266y);
                if (i7 >= 30) {
                    return c0982a0Mo4369a.m4288w();
                }
                AbstractC1030Z.m4468g0(view);
                return c0982a0Mo4369a.m4288w();
            }
        }

        /* JADX INFO: renamed from: a */
        static void m4534a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC0040c.f303T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* JADX INFO: renamed from: b */
        static C0982A0 m4535b(View view, C0982A0 c0982a0, Rect rect) {
            WindowInsets windowInsetsM4288w = c0982a0.m4288w();
            if (windowInsetsM4288w != null) {
                return C0982A0.m4266y(view.computeSystemWindowInsets(windowInsetsM4288w, rect), view);
            }
            rect.setEmpty();
            return c0982a0;
        }

        /* JADX INFO: renamed from: c */
        static ColorStateList m4536c(View view) {
            return view.getBackgroundTintList();
        }

        /* JADX INFO: renamed from: d */
        static PorterDuff.Mode m4537d(View view) {
            return view.getBackgroundTintMode();
        }

        /* JADX INFO: renamed from: e */
        static float m4538e(View view) {
            return view.getElevation();
        }

        /* JADX INFO: renamed from: f */
        static String m4539f(View view) {
            return view.getTransitionName();
        }

        /* JADX INFO: renamed from: g */
        static float m4540g(View view) {
            return view.getTranslationZ();
        }

        /* JADX INFO: renamed from: h */
        static float m4541h(View view) {
            return view.getZ();
        }

        /* JADX INFO: renamed from: i */
        static boolean m4542i(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* JADX INFO: renamed from: j */
        static void m4543j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* JADX INFO: renamed from: k */
        static void m4544k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* JADX INFO: renamed from: l */
        static void m4545l(View view, float f7) {
            view.setElevation(f7);
        }

        /* JADX INFO: renamed from: m */
        static void m4546m(View view, InterfaceC0993G interfaceC0993G) {
            a aVar = interfaceC0993G != null ? new a(view, interfaceC0993G) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC0040c.f296M, aVar);
            }
            if (view.getTag(AbstractC0040c.f295L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC0040c.f303T));
            }
        }

        /* JADX INFO: renamed from: n */
        static void m4547n(View view, String str) {
            view.setTransitionName(str);
        }

        /* JADX INFO: renamed from: o */
        static void m4548o(View view, float f7) {
            view.setTranslationZ(f7);
        }

        /* JADX INFO: renamed from: p */
        static void m4549p(View view, float f7) {
            view.setZ(f7);
        }

        /* JADX INFO: renamed from: q */
        static void m4550q(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: O.Z$i */
    private static class i {
        /* JADX INFO: renamed from: a */
        public static C0982A0 m4551a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0982A0 c0982a0M4265x = C0982A0.m4265x(rootWindowInsets);
            c0982a0M4265x.m4285t(c0982a0M4265x);
            c0982a0M4265x.m4270d(view.getRootView());
            return c0982a0M4265x;
        }

        /* JADX INFO: renamed from: b */
        static void m4552b(View view, int i7, int i8) {
            view.setScrollIndicators(i7, i8);
        }
    }

    /* JADX INFO: renamed from: O.Z$j */
    static class j {
        /* JADX INFO: renamed from: a */
        static void m4553a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* JADX INFO: renamed from: O.Z$k */
    static class k {
        /* JADX INFO: renamed from: a */
        static int m4554a(View view) {
            return view.getImportantForAutofill();
        }

        /* JADX INFO: renamed from: b */
        static void m4555b(View view, int i7) {
            view.setImportantForAutofill(i7);
        }
    }

    /* JADX INFO: renamed from: O.Z$l */
    static class l {
        /* JADX INFO: renamed from: a */
        static CharSequence m4556a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: renamed from: b */
        static boolean m4557b(View view) {
            return view.isAccessibilityHeading();
        }

        /* JADX INFO: renamed from: c */
        static boolean m4558c(View view) {
            return view.isScreenReaderFocusable();
        }

        /* JADX INFO: renamed from: d */
        static void m4559d(View view, boolean z7) {
            view.setAccessibilityHeading(z7);
        }

        /* JADX INFO: renamed from: e */
        static void m4560e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: renamed from: f */
        static void m4561f(View view, boolean z7) {
            view.setScreenReaderFocusable(z7);
        }
    }

    /* JADX INFO: renamed from: O.Z$m */
    private static class m {
        /* JADX INFO: renamed from: a */
        static View.AccessibilityDelegate m4562a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* JADX INFO: renamed from: b */
        static void m4563b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i8) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i7, i8);
        }
    }

    /* JADX INFO: renamed from: O.Z$n */
    private static class n {
        /* JADX INFO: renamed from: a */
        static WindowInsets m4564a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: b */
        static CharSequence m4565b(View view) {
            return view.getStateDescription();
        }

        /* JADX INFO: renamed from: c */
        public static C1034a1 m4566c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return C1034a1.m4591f(windowInsetsController);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        static void m4567d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: O.Z$o */
    private static final class o {
        /* JADX INFO: renamed from: a */
        public static String[] m4568a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* JADX INFO: renamed from: b */
        public static C1041d m4569b(View view, C1041d c1041d) {
            ContentInfo contentInfoM4643f = c1041d.m4643f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM4643f);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoM4643f ? c1041d : C1041d.m4639g(contentInfoPerformReceiveContent);
        }
    }

    /* JADX INFO: renamed from: O.Z$p */
    static class p {

        /* JADX INFO: renamed from: d */
        private static final ArrayList f3818d = new ArrayList();

        /* JADX INFO: renamed from: a */
        private WeakHashMap f3819a = null;

        /* JADX INFO: renamed from: b */
        private SparseArray f3820b = null;

        /* JADX INFO: renamed from: c */
        private WeakReference f3821c = null;

        p() {
        }

        /* JADX INFO: renamed from: a */
        static p m4570a(View view) {
            int i7 = AbstractC0040c.f301R;
            p pVar = (p) view.getTag(i7);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(i7, pVar2);
            return pVar2;
        }

        /* JADX INFO: renamed from: c */
        private View m4571c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f3819a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM4571c = m4571c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM4571c != null) {
                            return viewM4571c;
                        }
                    }
                }
                if (m4573e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        private SparseArray m4572d() {
            if (this.f3820b == null) {
                this.f3820b = new SparseArray();
            }
            return this.f3820b;
        }

        /* JADX INFO: renamed from: e */
        private boolean m4573e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC0040c.f302S);
            if (arrayList == null || (size = arrayList.size() - 1) < 0) {
                return false;
            }
            AbstractC2263x.m9328a(arrayList.get(size));
            throw null;
        }

        /* JADX INFO: renamed from: g */
        private void m4574g() {
            WeakHashMap weakHashMap = this.f3819a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f3818d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f3819a == null) {
                        this.f3819a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f3818d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f3819a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3819a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        boolean m4575b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m4574g();
            }
            View viewM4571c = m4571c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM4571c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m4572d().put(keyCode, new WeakReference(viewM4571c));
                }
            }
            return viewM4571c != null;
        }

        /* JADX INFO: renamed from: f */
        boolean m4576f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f3821c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f3821c = new WeakReference(keyEvent);
            SparseArray sparseArrayM4572d = m4572d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayM4572d.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayM4572d.valueAt(iIndexOfKey);
                sparseArrayM4572d.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayM4572d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                m4573e(view, keyEvent);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m4425A(View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: renamed from: A0 */
    public static void m4426A0(View view, C1063n0.b bVar) {
        C1063n0.m4708d(view, bVar);
    }

    /* JADX INFO: renamed from: B */
    public static int m4427B(View view) {
        return view.getMinimumWidth();
    }

    /* JADX INFO: renamed from: B0 */
    public static void m4428B0(View view, float f7) {
        h.m4549p(view, f7);
    }

    /* JADX INFO: renamed from: C */
    public static String[] m4429C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.m4568a(view) : (String[]) view.getTag(AbstractC0040c.f298O);
    }

    /* JADX INFO: renamed from: C0 */
    private static f m4430C0() {
        return new c(AbstractC0040c.f300Q, CharSequence.class, 64, 30);
    }

    /* JADX INFO: renamed from: D */
    public static ViewParent m4431D(View view) {
        return view.getParentForAccessibility();
    }

    /* JADX INFO: renamed from: D0 */
    public static void m4432D0(View view) {
        h.m4550q(view);
    }

    /* JADX INFO: renamed from: E */
    public static C0982A0 m4433E(View view) {
        return i.m4551a(view);
    }

    /* JADX INFO: renamed from: F */
    public static CharSequence m4434F(View view) {
        return (CharSequence) m4430C0().m4529e(view);
    }

    /* JADX INFO: renamed from: G */
    public static String m4435G(View view) {
        return h.m4539f(view);
    }

    /* JADX INFO: renamed from: H */
    public static float m4436H(View view) {
        return h.m4540g(view);
    }

    /* JADX INFO: renamed from: I */
    public static C1034a1 m4437I(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.m4566c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return AbstractC1061m0.m4702a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static int m4438J(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* JADX INFO: renamed from: K */
    public static float m4439K(View view) {
        return h.m4541h(view);
    }

    /* JADX INFO: renamed from: L */
    public static boolean m4440L(View view) {
        return m4479m(view) != null;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m4441M(View view) {
        return view.hasTransientState();
    }

    /* JADX INFO: renamed from: N */
    public static boolean m4442N(View view) {
        Boolean bool = (Boolean) m4457b().m4529e(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: O */
    public static boolean m4443O(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: P */
    public static boolean m4444P(View view) {
        return view.isLaidOut();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m4445Q(View view) {
        return h.m4542i(view);
    }

    /* JADX INFO: renamed from: R */
    public static boolean m4446R(View view) {
        Boolean bool = (Boolean) m4472i0().m4529e(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: S */
    static void m4447S(View view, int i7) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z7 = m4483o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z7) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z7 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i7);
                if (z7) {
                    accessibilityEventObtain.getText().add(m4483o(view));
                    m4490r0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i7 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i7);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(m4483o(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e7);
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m4448T(View view, int i7) {
        view.offsetLeftAndRight(i7);
    }

    /* JADX INFO: renamed from: U */
    public static void m4449U(View view, int i7) {
        view.offsetTopAndBottom(i7);
    }

    /* JADX INFO: renamed from: V */
    public static C0982A0 m4450V(View view, C0982A0 c0982a0) {
        WindowInsets windowInsetsM4288w = c0982a0.m4288w();
        if (windowInsetsM4288w != null) {
            WindowInsets windowInsetsM4532b = g.m4532b(view, windowInsetsM4288w);
            if (!windowInsetsM4532b.equals(windowInsetsM4288w)) {
                return C0982A0.m4266y(windowInsetsM4532b, view);
            }
        }
        return c0982a0;
    }

    /* JADX INFO: renamed from: W */
    public static void m4451W(View view, C1170s c1170s) {
        view.onInitializeAccessibilityNodeInfo(c1170s.m5041Q0());
    }

    /* JADX INFO: renamed from: X */
    private static f m4452X() {
        return new b(AbstractC0040c.f294K, CharSequence.class, 8, 28);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m4453Y(View view, int i7, Bundle bundle) {
        return view.performAccessibilityAction(i7, bundle);
    }

    /* JADX INFO: renamed from: Z */
    public static C1041d m4454Z(View view, C1041d c1041d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1041d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.m4569b(view, c1041d);
        }
        InterfaceC0995H interfaceC0995H = (InterfaceC0995H) view.getTag(AbstractC0040c.f297N);
        if (interfaceC0995H == null) {
            return m4497v(view).mo4373a(c1041d);
        }
        C1041d c1041dMo4371a = interfaceC0995H.mo4371a(view, c1041d);
        if (c1041dMo4371a == null) {
            return null;
        }
        return m4497v(view).mo4373a(c1041dMo4371a);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1041d m4455a(C1041d c1041d) {
        return c1041d;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m4456a0(View view) {
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: b */
    private static f m4457b() {
        return new d(AbstractC0040c.f293J, Boolean.class, 28);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m4458b0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: renamed from: c */
    public static int m4459c(View view, CharSequence charSequence, InterfaceC1173v interfaceC1173v) {
        int iM4487q = m4487q(view, charSequence);
        if (iM4487q != -1) {
            m4461d(view, new C1170s.a(iM4487q, charSequence, interfaceC1173v));
        }
        return iM4487q;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m4460c0(View view, Runnable runnable, long j7) {
        view.postOnAnimationDelayed(runnable, j7);
    }

    /* JADX INFO: renamed from: d */
    private static void m4461d(View view, C1170s.a aVar) {
        m4473j(view);
        m4464e0(aVar.m5094b(), view);
        m4485p(view).add(aVar);
        m4447S(view, 0);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m4462d0(View view, int i7) {
        m4464e0(i7, view);
        m4447S(view, 0);
    }

    /* JADX INFO: renamed from: e */
    public static C1053i0 m4463e(View view) {
        if (f3804a == null) {
            f3804a = new WeakHashMap();
        }
        C1053i0 c1053i0 = (C1053i0) f3804a.get(view);
        if (c1053i0 != null) {
            return c1053i0;
        }
        C1053i0 c1053i1 = new C1053i0(view);
        f3804a.put(view, c1053i1);
        return c1053i1;
    }

    /* JADX INFO: renamed from: e0 */
    private static void m4464e0(int i7, View view) {
        List listM4485p = m4485p(view);
        for (int i8 = 0; i8 < listM4485p.size(); i8++) {
            if (((C1170s.a) listM4485p.get(i8)).m5094b() == i7) {
                listM4485p.remove(i8);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static C0982A0 m4465f(View view, C0982A0 c0982a0, Rect rect) {
        return h.m4535b(view, c0982a0, rect);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m4466f0(View view, C1170s.a aVar, CharSequence charSequence, InterfaceC1173v interfaceC1173v) {
        if (interfaceC1173v == null && charSequence == null) {
            m4462d0(view, aVar.m5094b());
        } else {
            m4461d(view, aVar.m5093a(charSequence, interfaceC1173v));
        }
    }

    /* JADX INFO: renamed from: g */
    public static C0982A0 m4467g(View view, C0982A0 c0982a0) {
        int i7 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsM4288w = c0982a0.m4288w();
        if (windowInsetsM4288w != null) {
            WindowInsets windowInsetsM4564a = i7 >= 30 ? n.m4564a(view, windowInsetsM4288w) : g.m4531a(view, windowInsetsM4288w);
            if (!windowInsetsM4564a.equals(windowInsetsM4288w)) {
                return C0982A0.m4266y(windowInsetsM4564a, view);
            }
        }
        return c0982a0;
    }

    /* JADX INFO: renamed from: g0 */
    public static void m4468g0(View view) {
        g.m4533c(view);
    }

    /* JADX INFO: renamed from: h */
    static boolean m4469h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.m4570a(view).m4575b(view, keyEvent);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m4470h0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.m4563b(view, context, iArr, attributeSet, typedArray, i7, i8);
        }
    }

    /* JADX INFO: renamed from: i */
    static boolean m4471i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.m4570a(view).m4576f(keyEvent);
    }

    /* JADX INFO: renamed from: i0 */
    private static f m4472i0() {
        return new a(AbstractC0040c.f299P, Boolean.class, 28);
    }

    /* JADX INFO: renamed from: j */
    static void m4473j(View view) {
        C1032a c1032aM4477l = m4477l(view);
        if (c1032aM4477l == null) {
            c1032aM4477l = new C1032a();
        }
        m4474j0(view, c1032aM4477l);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m4474j0(View view, C1032a c1032a) {
        if (c1032a == null && (m4479m(view) instanceof C1032a.a)) {
            c1032a = new C1032a();
        }
        m4490r0(view);
        view.setAccessibilityDelegate(c1032a == null ? null : c1032a.m4583d());
    }

    /* JADX INFO: renamed from: k */
    public static int m4475k() {
        return View.generateViewId();
    }

    /* JADX INFO: renamed from: k0 */
    public static void m4476k0(View view, boolean z7) {
        m4457b().m4530f(view, Boolean.valueOf(z7));
    }

    /* JADX INFO: renamed from: l */
    public static C1032a m4477l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM4479m = m4479m(view);
        if (accessibilityDelegateM4479m == null) {
            return null;
        }
        return accessibilityDelegateM4479m instanceof C1032a.a ? ((C1032a.a) accessibilityDelegateM4479m).f3825a : new C1032a(accessibilityDelegateM4479m);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m4478l0(View view, CharSequence charSequence) {
        m4452X().m4530f(view, charSequence);
        if (charSequence != null) {
            f3809f.m4525a(view);
        } else {
            f3809f.m4526d(view);
        }
    }

    /* JADX INFO: renamed from: m */
    private static View.AccessibilityDelegate m4479m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.m4562a(view) : m4481n(view);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m4480m0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* JADX INFO: renamed from: n */
    private static View.AccessibilityDelegate m4481n(View view) {
        if (f3806c) {
            return null;
        }
        if (f3805b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3805b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3806c = true;
                return null;
            }
        }
        try {
            Object obj = f3805b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3806c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m4482n0(View view, ColorStateList colorStateList) {
        h.m4543j(view, colorStateList);
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence m4483o(View view) {
        return (CharSequence) m4452X().m4529e(view);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m4484o0(View view, PorterDuff.Mode mode) {
        h.m4544k(view, mode);
    }

    /* JADX INFO: renamed from: p */
    private static List m4485p(View view) {
        int i7 = AbstractC0040c.f291H;
        ArrayList arrayList = (ArrayList) view.getTag(i7);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i7, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m4486p0(View view, float f7) {
        h.m4545l(view, f7);
    }

    /* JADX INFO: renamed from: q */
    private static int m4487q(View view, CharSequence charSequence) {
        List listM4485p = m4485p(view);
        for (int i7 = 0; i7 < listM4485p.size(); i7++) {
            if (TextUtils.equals(charSequence, ((C1170s.a) listM4485p.get(i7)).m5095c())) {
                return ((C1170s.a) listM4485p.get(i7)).m5094b();
            }
        }
        int i8 = -1;
        int i9 = 0;
        while (true) {
            int[] iArr = f3807d;
            if (i9 >= iArr.length || i8 != -1) {
                break;
            }
            int i10 = iArr[i9];
            boolean z7 = true;
            for (int i11 = 0; i11 < listM4485p.size(); i11++) {
                z7 &= ((C1170s.a) listM4485p.get(i11)).m5094b() != i10;
            }
            if (z7) {
                i8 = i10;
            }
            i9++;
        }
        return i8;
    }

    /* JADX INFO: renamed from: q0 */
    public static void m4488q0(View view, int i7) {
        view.setImportantForAccessibility(i7);
    }

    /* JADX INFO: renamed from: r */
    public static ColorStateList m4489r(View view) {
        return h.m4536c(view);
    }

    /* JADX INFO: renamed from: r0 */
    private static void m4490r0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: s */
    public static PorterDuff.Mode m4491s(View view) {
        return h.m4537d(view);
    }

    /* JADX INFO: renamed from: s0 */
    public static void m4492s0(View view, int i7) {
        k.m4555b(view, i7);
    }

    /* JADX INFO: renamed from: t */
    public static Display m4493t(View view) {
        return view.getDisplay();
    }

    /* JADX INFO: renamed from: t0 */
    public static void m4494t0(View view, InterfaceC0993G interfaceC0993G) {
        h.m4546m(view, interfaceC0993G);
    }

    /* JADX INFO: renamed from: u */
    public static float m4495u(View view) {
        return h.m4538e(view);
    }

    /* JADX INFO: renamed from: u0 */
    public static void m4496u0(View view, C1001K c1001k) {
        j.m4553a(view, (PointerIcon) (c1001k != null ? c1001k.m4379a() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    private static InterfaceC0997I m4497v(View view) {
        return view instanceof InterfaceC0997I ? (InterfaceC0997I) view : f3808e;
    }

    /* JADX INFO: renamed from: v0 */
    public static void m4498v0(View view, boolean z7) {
        m4472i0().m4530f(view, Boolean.valueOf(z7));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m4499w(View view) {
        return view.getFitsSystemWindows();
    }

    /* JADX INFO: renamed from: w0 */
    public static void m4500w0(View view, int i7, int i8) {
        i.m4552b(view, i7, i8);
    }

    /* JADX INFO: renamed from: x */
    public static int m4501x(View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: renamed from: x0 */
    public static void m4502x0(View view, CharSequence charSequence) {
        m4430C0().m4530f(view, charSequence);
    }

    /* JADX INFO: renamed from: y */
    public static int m4503y(View view) {
        return k.m4554a(view);
    }

    /* JADX INFO: renamed from: y0 */
    public static void m4504y0(View view, String str) {
        h.m4547n(view, str);
    }

    /* JADX INFO: renamed from: z */
    public static int m4505z(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: renamed from: z0 */
    public static void m4506z0(View view, float f7) {
        h.m4548o(view, f7);
    }
}
