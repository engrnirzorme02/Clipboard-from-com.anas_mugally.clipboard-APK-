package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C2794m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p082K0.AbstractC0725a;
import p090L0.InterfaceC0780c;
import p111O.AbstractC1030Z;
import p118P.C1170s;
import p118P.InterfaceC1173v;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: F */
    static boolean f11770F = true;

    /* JADX INFO: renamed from: A */
    private RecyclerView.AbstractC2762m f11771A;

    /* JADX INFO: renamed from: B */
    private boolean f11772B;

    /* JADX INFO: renamed from: C */
    private boolean f11773C;

    /* JADX INFO: renamed from: D */
    private int f11774D;

    /* JADX INFO: renamed from: E */
    AbstractC2875e f11775E;

    /* JADX INFO: renamed from: a */
    private final Rect f11776a;

    /* JADX INFO: renamed from: b */
    private final Rect f11777b;

    /* JADX INFO: renamed from: c */
    private C2887b f11778c;

    /* JADX INFO: renamed from: d */
    int f11779d;

    /* JADX INFO: renamed from: e */
    boolean f11780e;

    /* JADX INFO: renamed from: f */
    private RecyclerView.AbstractC2759j f11781f;

    /* JADX INFO: renamed from: r */
    private LinearLayoutManager f11782r;

    /* JADX INFO: renamed from: s */
    private int f11783s;

    /* JADX INFO: renamed from: t */
    private Parcelable f11784t;

    /* JADX INFO: renamed from: u */
    RecyclerView f11785u;

    /* JADX INFO: renamed from: v */
    private C2794m f11786v;

    /* JADX INFO: renamed from: w */
    C2890e f11787w;

    /* JADX INFO: renamed from: x */
    private C2887b f11788x;

    /* JADX INFO: renamed from: y */
    private C2888c f11789y;

    /* JADX INFO: renamed from: z */
    private C2889d f11790z;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$a */
    class C2871a extends AbstractC2877g {
        C2871a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2877g, androidx.recyclerview.widget.RecyclerView.AbstractC2759j
        /* JADX INFO: renamed from: a */
        public void mo3689a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f11780e = true;
            viewPager2.f11787w.m14452l();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$b */
    class C2872b extends AbstractC2879i {
        C2872b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
        /* JADX INFO: renamed from: a */
        public void mo3696a(int i7) {
            if (i7 == 0) {
                ViewPager2.this.m14400o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
        /* JADX INFO: renamed from: c */
        public void mo3697c(int i7) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f11779d != i7) {
                viewPager2.f11779d = i7;
                viewPager2.f11775E.mo14417q();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$c */
    class C2873c extends AbstractC2879i {
        C2873c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
        /* JADX INFO: renamed from: c */
        public void mo3697c(int i7) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f11785u.requestFocus(2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$d */
    class C2874d implements RecyclerView.InterfaceC2767r {
        C2874d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2767r
        /* JADX INFO: renamed from: b */
        public void mo13482b(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2767r
        /* JADX INFO: renamed from: d */
        public void mo13483d(View view) {
            RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) c2766q).width != -1 || ((ViewGroup.MarginLayoutParams) c2766q).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$e */
    private abstract class AbstractC2875e {
        private AbstractC2875e() {
        }

        /* JADX INFO: renamed from: a */
        boolean mo14401a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        boolean mo14402b(int i7) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        boolean mo14403c(int i7, Bundle bundle) {
            return false;
        }

        /* JADX INFO: renamed from: d */
        boolean mo14404d() {
            return false;
        }

        /* JADX INFO: renamed from: e */
        void mo14405e(RecyclerView.AbstractC2757h abstractC2757h) {
        }

        /* JADX INFO: renamed from: f */
        void mo14406f(RecyclerView.AbstractC2757h abstractC2757h) {
        }

        /* JADX INFO: renamed from: g */
        String mo14407g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: h */
        void mo14408h(C2887b c2887b, RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: i */
        void mo14409i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* JADX INFO: renamed from: j */
        void mo14410j(C1170s c1170s) {
        }

        /* JADX INFO: renamed from: k */
        boolean mo14411k(int i7) {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: l */
        boolean mo14412l(int i7, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: m */
        void mo14413m() {
        }

        /* JADX INFO: renamed from: n */
        CharSequence mo14414n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: o */
        void mo14415o(AccessibilityEvent accessibilityEvent) {
        }

        /* JADX INFO: renamed from: p */
        void mo14416p() {
        }

        /* JADX INFO: renamed from: q */
        void mo14417q() {
        }

        /* JADX INFO: renamed from: r */
        void mo14418r() {
        }

        /* JADX INFO: renamed from: s */
        void mo14419s() {
        }

        /* synthetic */ AbstractC2875e(ViewPager2 viewPager2, C2871a c2871a) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$f */
    class C2876f extends AbstractC2875e {
        C2876f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: b */
        public boolean mo14402b(int i7) {
            return (i7 == 8192 || i7 == 4096) && !ViewPager2.this.m14394e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: d */
        public boolean mo14404d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: j */
        public void mo14410j(C1170s c1170s) {
            if (ViewPager2.this.m14394e()) {
                return;
            }
            c1170s.m5058f0(C1170s.a.f4122r);
            c1170s.m5058f0(C1170s.a.f4121q);
            c1170s.m5023H0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: k */
        public boolean mo14411k(int i7) {
            if (mo14402b(i7)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: n */
        public CharSequence mo14414n() {
            if (mo14404d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$g */
    private static abstract class AbstractC2877g extends RecyclerView.AbstractC2759j {
        private AbstractC2877g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2759j
        /* JADX INFO: renamed from: a */
        public abstract void mo3689a();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2759j
        /* JADX INFO: renamed from: b */
        public final void mo3690b(int i7, int i8, Object obj) {
            mo3689a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2759j
        /* JADX INFO: renamed from: c */
        public final void mo3691c(int i7, int i8, int i9) {
            mo3689a();
        }

        /* synthetic */ AbstractC2877g(C2871a c2871a) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$h */
    private class C2878h extends LinearLayoutManager {
        C2878h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* JADX INFO: renamed from: R1 */
        protected void mo13043R1(RecyclerView.C2746B c2746b, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo13043R1(c2746b, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
        /* JADX INFO: renamed from: S0 */
        public void mo13412S0(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, C1170s c1170s) {
            super.mo13412S0(c2772w, c2746b, c1170s);
            ViewPager2.this.f11775E.mo14410j(c1170s);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
        /* JADX INFO: renamed from: m1 */
        public boolean mo13446m1(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, int i7, Bundle bundle) {
            return ViewPager2.this.f11775E.mo14402b(i7) ? ViewPager2.this.f11775E.mo14411k(i7) : super.mo13446m1(c2772w, c2746b, i7, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
        /* JADX INFO: renamed from: x1 */
        public boolean mo13468x1(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class AbstractC2879i {
        /* JADX INFO: renamed from: a */
        public void mo3696a(int i7) {
        }

        /* JADX INFO: renamed from: b */
        public void mo14420b(int i7, float f7, int i8) {
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo3697c(int i7);
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j */
    class C2880j extends AbstractC2875e {

        /* JADX INFO: renamed from: b */
        private final InterfaceC1173v f11798b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC1173v f11799c;

        /* JADX INFO: renamed from: d */
        private RecyclerView.AbstractC2759j f11800d;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        class a implements InterfaceC1173v {
            a() {
            }

            @Override // p118P.InterfaceC1173v
            /* JADX INFO: renamed from: a */
            public boolean mo3201a(View view, InterfaceC1173v.a aVar) {
                C2880j.this.m14423v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        class b implements InterfaceC1173v {
            b() {
            }

            @Override // p118P.InterfaceC1173v
            /* JADX INFO: renamed from: a */
            public boolean mo3201a(View view, InterfaceC1173v.a aVar) {
                C2880j.this.m14423v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        class c extends AbstractC2877g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2877g, androidx.recyclerview.widget.RecyclerView.AbstractC2759j
            /* JADX INFO: renamed from: a */
            public void mo3689a() {
                C2880j.this.m14424w();
            }
        }

        C2880j() {
            super(ViewPager2.this, null);
            this.f11798b = new a();
            this.f11799c = new b();
        }

        /* JADX INFO: renamed from: t */
        private void m14421t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int iMo8548g;
            int iMo8548g2;
            if (ViewPager2.this.getAdapter() == null) {
                iMo8548g = 0;
                iMo8548g2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                iMo8548g = ViewPager2.this.getAdapter().mo8548g();
                iMo8548g2 = 0;
            } else {
                iMo8548g2 = ViewPager2.this.getAdapter().mo8548g();
                iMo8548g = 0;
            }
            C1170s.m4998R0(accessibilityNodeInfo).m5072o0(C1170s.f.m5111b(iMo8548g, iMo8548g2, false, 0));
        }

        /* JADX INFO: renamed from: u */
        private void m14422u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int iMo8548g;
            RecyclerView.AbstractC2757h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (iMo8548g = adapter.mo8548g()) == 0 || !ViewPager2.this.m14394e()) {
                return;
            }
            if (ViewPager2.this.f11779d > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (ViewPager2.this.f11779d < iMo8548g - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: a */
        public boolean mo14401a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: c */
        public boolean mo14403c(int i7, Bundle bundle) {
            return i7 == 8192 || i7 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: e */
        public void mo14405e(RecyclerView.AbstractC2757h abstractC2757h) {
            m14424w();
            if (abstractC2757h != null) {
                abstractC2757h.m13328y(this.f11800d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: f */
        public void mo14406f(RecyclerView.AbstractC2757h abstractC2757h) {
            if (abstractC2757h != null) {
                abstractC2757h.m13315A(this.f11800d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: g */
        public String mo14407g() {
            if (mo14401a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: h */
        public void mo14408h(C2887b c2887b, RecyclerView recyclerView) {
            AbstractC1030Z.m4488q0(recyclerView, 2);
            this.f11800d = new c();
            if (AbstractC1030Z.m4501x(ViewPager2.this) == 0) {
                AbstractC1030Z.m4488q0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: i */
        public void mo14409i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m14421t(accessibilityNodeInfo);
            m14422u(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: l */
        public boolean mo14412l(int i7, Bundle bundle) {
            if (!mo14403c(i7, bundle)) {
                throw new IllegalStateException();
            }
            m14423v(i7 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: m */
        public void mo14413m() {
            m14424w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: o */
        public void mo14415o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo14407g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: p */
        public void mo14416p() {
            m14424w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: q */
        public void mo14417q() {
            m14424w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: r */
        public void mo14418r() {
            m14424w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2875e
        /* JADX INFO: renamed from: s */
        public void mo14419s() {
            m14424w();
        }

        /* JADX INFO: renamed from: v */
        void m14423v(int i7) {
            if (ViewPager2.this.m14394e()) {
                ViewPager2.this.m14398k(i7, true);
            }
        }

        /* JADX INFO: renamed from: w */
        void m14424w() {
            int iMo8548g;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i7 = R.id.accessibilityActionPageLeft;
            AbstractC1030Z.m4462d0(viewPager2, R.id.accessibilityActionPageLeft);
            AbstractC1030Z.m4462d0(viewPager2, R.id.accessibilityActionPageRight);
            AbstractC1030Z.m4462d0(viewPager2, R.id.accessibilityActionPageUp);
            AbstractC1030Z.m4462d0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (iMo8548g = ViewPager2.this.getAdapter().mo8548g()) == 0 || !ViewPager2.this.m14394e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f11779d < iMo8548g - 1) {
                    AbstractC1030Z.m4466f0(viewPager2, new C1170s.a(R.id.accessibilityActionPageDown, null), null, this.f11798b);
                }
                if (ViewPager2.this.f11779d > 0) {
                    AbstractC1030Z.m4466f0(viewPager2, new C1170s.a(R.id.accessibilityActionPageUp, null), null, this.f11799c);
                    return;
                }
                return;
            }
            boolean zM14393d = ViewPager2.this.m14393d();
            int i8 = zM14393d ? 16908360 : 16908361;
            if (zM14393d) {
                i7 = 16908361;
            }
            if (ViewPager2.this.f11779d < iMo8548g - 1) {
                AbstractC1030Z.m4466f0(viewPager2, new C1170s.a(i8, null), null, this.f11798b);
            }
            if (ViewPager2.this.f11779d > 0) {
                AbstractC1030Z.m4466f0(viewPager2, new C1170s.a(i7, null), null, this.f11799c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface InterfaceC2881k {
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$l */
    private class C2882l extends C2794m {
        C2882l() {
        }

        @Override // androidx.recyclerview.widget.C2794m, androidx.recyclerview.widget.AbstractC2798q
        /* JADX INFO: renamed from: f */
        public View mo13869f(RecyclerView.AbstractC2765p abstractC2765p) {
            if (ViewPager2.this.m14392c()) {
                return null;
            }
            return super.mo13869f(abstractC2765p);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$m */
    private class C2883m extends RecyclerView {
        C2883m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f11775E.mo14404d() ? ViewPager2.this.f11775E.mo14414n() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f11779d);
            accessibilityEvent.setToIndex(ViewPager2.this.f11779d);
            ViewPager2.this.f11775E.mo14415o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m14394e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m14394e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$o */
    private static class RunnableC2885o implements Runnable {

        /* JADX INFO: renamed from: a */
        private final int f11810a;

        /* JADX INFO: renamed from: b */
        private final RecyclerView f11811b;

        RunnableC2885o(int i7, RecyclerView recyclerView) {
            this.f11810a = i7;
            this.f11811b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11811b.m13197s1(this.f11810a);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11776a = new Rect();
        this.f11777b = new Rect();
        this.f11778c = new C2887b(3);
        this.f11780e = false;
        this.f11781f = new C2871a();
        this.f11783s = -1;
        this.f11771A = null;
        this.f11772B = false;
        this.f11773C = true;
        this.f11774D = -1;
        m14387b(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private RecyclerView.InterfaceC2767r m14386a() {
        return new C2874d();
    }

    /* JADX INFO: renamed from: b */
    private void m14387b(Context context, AttributeSet attributeSet) {
        this.f11775E = f11770F ? new C2880j() : new C2876f();
        C2883m c2883m = new C2883m(context);
        this.f11785u = c2883m;
        c2883m.setId(AbstractC1030Z.m4475k());
        this.f11785u.setDescendantFocusability(131072);
        C2878h c2878h = new C2878h(context);
        this.f11782r = c2878h;
        this.f11785u.setLayoutManager(c2878h);
        this.f11785u.setScrollingTouchSlop(1);
        m14390l(context, attributeSet);
        this.f11785u.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f11785u.m13178j(m14386a());
        C2890e c2890e = new C2890e(this);
        this.f11787w = c2890e;
        this.f11789y = new C2888c(this, c2890e, this.f11785u);
        C2882l c2882l = new C2882l();
        this.f11786v = c2882l;
        c2882l.m13897b(this.f11785u);
        this.f11785u.m13182l(this.f11787w);
        C2887b c2887b = new C2887b(3);
        this.f11788x = c2887b;
        this.f11787w.m14454o(c2887b);
        C2872b c2872b = new C2872b();
        C2873c c2873c = new C2873c();
        this.f11788x.m14435d(c2872b);
        this.f11788x.m14435d(c2873c);
        this.f11775E.mo14408h(this.f11788x, this.f11785u);
        this.f11788x.m14435d(this.f11778c);
        C2889d c2889d = new C2889d(this.f11782r);
        this.f11790z = c2889d;
        this.f11788x.m14435d(c2889d);
        RecyclerView recyclerView = this.f11785u;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* JADX INFO: renamed from: f */
    private void m14388f(RecyclerView.AbstractC2757h abstractC2757h) {
        if (abstractC2757h != null) {
            abstractC2757h.m13328y(this.f11781f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    private void m14389i() {
        RecyclerView.AbstractC2757h adapter;
        if (this.f11783s == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f11784t;
        if (parcelable != null) {
            if (adapter instanceof InterfaceC0780c) {
                ((InterfaceC0780c) adapter).mo3679b(parcelable);
            }
            this.f11784t = null;
        }
        int iMax = Math.max(0, Math.min(this.f11783s, adapter.mo8548g() - 1));
        this.f11779d = iMax;
        this.f11783s = -1;
        this.f11785u.m13181k1(iMax);
        this.f11775E.mo14413m();
    }

    /* JADX INFO: renamed from: l */
    private void m14390l(Context context, AttributeSet attributeSet) {
        int[] iArr = AbstractC0725a.f2904g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(AbstractC0725a.f2905h, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: m */
    private void m14391m(RecyclerView.AbstractC2757h abstractC2757h) {
        if (abstractC2757h != null) {
            abstractC2757h.m13315A(this.f11781f);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m14392c() {
        return this.f11789y.m14437a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i7) {
        return this.f11785u.canScrollHorizontally(i7);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i7) {
        return this.f11785u.canScrollVertically(i7);
    }

    /* JADX INFO: renamed from: d */
    boolean m14393d() {
        return this.f11782r.m13426e0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C2884n) {
            int i7 = ((C2884n) parcelable).f11807a;
            sparseArray.put(this.f11785u.getId(), sparseArray.get(i7));
            sparseArray.remove(i7);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m14389i();
    }

    /* JADX INFO: renamed from: e */
    public boolean m14394e() {
        return this.f11773C;
    }

    /* JADX INFO: renamed from: g */
    public void m14395g(AbstractC2879i abstractC2879i) {
        this.f11778c.m14435d(abstractC2879i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f11775E.mo14401a() ? this.f11775E.mo14407g() : super.getAccessibilityClassName();
    }

    public RecyclerView.AbstractC2757h getAdapter() {
        return this.f11785u.getAdapter();
    }

    public int getCurrentItem() {
        return this.f11779d;
    }

    public int getItemDecorationCount() {
        return this.f11785u.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f11774D;
    }

    public int getOrientation() {
        return this.f11782r.m13061q2();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f11785u;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f11787w.m14449h();
    }

    /* JADX INFO: renamed from: h */
    public void m14396h() {
        this.f11790z.m14438d();
    }

    /* JADX INFO: renamed from: j */
    public void m14397j(int i7, boolean z7) {
        if (m14392c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        m14398k(i7, z7);
    }

    /* JADX INFO: renamed from: k */
    void m14398k(int i7, boolean z7) {
        RecyclerView.AbstractC2757h adapter = getAdapter();
        if (adapter == null) {
            if (this.f11783s != -1) {
                this.f11783s = Math.max(i7, 0);
                return;
            }
            return;
        }
        if (adapter.mo8548g() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i7, 0), adapter.mo8548g() - 1);
        if (iMin == this.f11779d && this.f11787w.m14451j()) {
            return;
        }
        int i8 = this.f11779d;
        if (iMin == i8 && z7) {
            return;
        }
        double dM14448g = i8;
        this.f11779d = iMin;
        this.f11775E.mo14417q();
        if (!this.f11787w.m14451j()) {
            dM14448g = this.f11787w.m14448g();
        }
        this.f11787w.m14453m(iMin, z7);
        if (!z7) {
            this.f11785u.m13181k1(iMin);
            return;
        }
        double d7 = iMin;
        if (Math.abs(d7 - dM14448g) <= 3.0d) {
            this.f11785u.m13197s1(iMin);
            return;
        }
        this.f11785u.m13181k1(d7 > dM14448g ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f11785u;
        recyclerView.post(new RunnableC2885o(iMin, recyclerView));
    }

    /* JADX INFO: renamed from: n */
    public void m14399n(AbstractC2879i abstractC2879i) {
        this.f11778c.m14436e(abstractC2879i);
    }

    /* JADX INFO: renamed from: o */
    void m14400o() {
        C2794m c2794m = this.f11786v;
        if (c2794m == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewMo13869f = c2794m.mo13869f(this.f11782r);
        if (viewMo13869f == null) {
            return;
        }
        int iM13445m0 = this.f11782r.m13445m0(viewMo13869f);
        if (iM13445m0 != this.f11779d && getScrollState() == 0) {
            this.f11788x.mo3697c(iM13445m0);
        }
        this.f11780e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f11775E.mo14409i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int measuredWidth = this.f11785u.getMeasuredWidth();
        int measuredHeight = this.f11785u.getMeasuredHeight();
        this.f11776a.left = getPaddingLeft();
        this.f11776a.right = (i9 - i7) - getPaddingRight();
        this.f11776a.top = getPaddingTop();
        this.f11776a.bottom = (i10 - i8) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f11776a, this.f11777b);
        RecyclerView recyclerView = this.f11785u;
        Rect rect = this.f11777b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f11780e) {
            m14400o();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        measureChild(this.f11785u, i7, i8);
        int measuredWidth = this.f11785u.getMeasuredWidth();
        int measuredHeight = this.f11785u.getMeasuredHeight();
        int measuredState = this.f11785u.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i7, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i8, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2884n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2884n c2884n = (C2884n) parcelable;
        super.onRestoreInstanceState(c2884n.getSuperState());
        this.f11783s = c2884n.f11808b;
        this.f11784t = c2884n.f11809c;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C2884n c2884n = new C2884n(super.onSaveInstanceState());
        c2884n.f11807a = this.f11785u.getId();
        int i7 = this.f11783s;
        if (i7 == -1) {
            i7 = this.f11779d;
        }
        c2884n.f11808b = i7;
        Parcelable parcelable = this.f11784t;
        if (parcelable != null) {
            c2884n.f11809c = parcelable;
            return c2884n;
        }
        Object adapter = this.f11785u.getAdapter();
        if (adapter instanceof InterfaceC0780c) {
            c2884n.f11809c = ((InterfaceC0780c) adapter).mo3678a();
        }
        return c2884n;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i7, Bundle bundle) {
        return this.f11775E.mo14403c(i7, bundle) ? this.f11775E.mo14412l(i7, bundle) : super.performAccessibilityAction(i7, bundle);
    }

    public void setAdapter(RecyclerView.AbstractC2757h abstractC2757h) {
        RecyclerView.AbstractC2757h adapter = this.f11785u.getAdapter();
        this.f11775E.mo14406f(adapter);
        m14391m(adapter);
        this.f11785u.setAdapter(abstractC2757h);
        this.f11779d = 0;
        m14389i();
        this.f11775E.mo14405e(abstractC2757h);
        m14388f(abstractC2757h);
    }

    public void setCurrentItem(int i7) {
        m14397j(i7, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
        super.setLayoutDirection(i7);
        this.f11775E.mo14416p();
    }

    public void setOffscreenPageLimit(int i7) {
        if (i7 < 1 && i7 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f11774D = i7;
        this.f11785u.requestLayout();
    }

    public void setOrientation(int i7) {
        this.f11782r.m13036E2(i7);
        this.f11775E.mo14418r();
    }

    public void setPageTransformer(InterfaceC2881k interfaceC2881k) {
        if (interfaceC2881k != null) {
            if (!this.f11772B) {
                this.f11771A = this.f11785u.getItemAnimator();
                this.f11772B = true;
            }
            this.f11785u.setItemAnimator(null);
        } else if (this.f11772B) {
            this.f11785u.setItemAnimator(this.f11771A);
            this.f11771A = null;
            this.f11772B = false;
        }
        this.f11790z.m14438d();
        if (interfaceC2881k == null) {
            return;
        }
        this.f11790z.m14439e(interfaceC2881k);
        m14396h();
    }

    public void setUserInputEnabled(boolean z7) {
        this.f11773C = z7;
        this.f11775E.mo14419s();
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$n */
    static class C2884n extends View.BaseSavedState {
        public static final Parcelable.Creator<C2884n> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        int f11807a;

        /* JADX INFO: renamed from: b */
        int f11808b;

        /* JADX INFO: renamed from: c */
        Parcelable f11809c;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$n$a */
        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2884n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2884n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2884n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C2884n[] newArray(int i7) {
                return new C2884n[i7];
            }
        }

        C2884n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m14425a(parcel, classLoader);
        }

        /* JADX INFO: renamed from: a */
        private void m14425a(Parcel parcel, ClassLoader classLoader) {
            this.f11807a = parcel.readInt();
            this.f11808b = parcel.readInt();
            this.f11809c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f11807a);
            parcel.writeInt(this.f11808b);
            parcel.writeParcelable(this.f11809c, i7);
        }

        C2884n(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
