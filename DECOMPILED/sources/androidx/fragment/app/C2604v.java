package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.InterfaceC2639c0;
import p111O.AbstractC1030Z;
import p248g0.AbstractC5452b;
import p264i0.C5662c;

/* JADX INFO: renamed from: androidx.fragment.app.v */
/* JADX INFO: loaded from: classes.dex */
class C2604v {

    /* JADX INFO: renamed from: a */
    private final C2598p f10328a;

    /* JADX INFO: renamed from: b */
    private final C2605w f10329b;

    /* JADX INFO: renamed from: c */
    private final AbstractComponentCallbacksC2591i f10330c;

    /* JADX INFO: renamed from: d */
    private boolean f10331d = false;

    /* JADX INFO: renamed from: e */
    private int f10332e = -1;

    /* JADX INFO: renamed from: androidx.fragment.app.v$a */
    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f10333a;

        a(View view) {
            this.f10333a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f10333a.removeOnAttachStateChangeListener(this);
            AbstractC1030Z.m4468g0(this.f10333a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.v$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f10335a;

        static {
            int[] iArr = new int[AbstractC2650l.b.values().length];
            f10335a = iArr;
            try {
                iArr[AbstractC2650l.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10335a[AbstractC2650l.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10335a[AbstractC2650l.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10335a[AbstractC2650l.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    C2604v(C2598p c2598p, C2605w c2605w, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        this.f10328a = c2598p;
        this.f10329b = c2605w;
        this.f10330c = abstractComponentCallbacksC2591i;
    }

    /* JADX INFO: renamed from: l */
    private boolean m12455l(View view) {
        if (view == this.f10330c.f10138T) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f10330c.f10138T) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    void m12456a() {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f10330c);
        }
        Bundle bundle = this.f10330c.f10147b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f10330c.m12153W0(bundle2);
        this.f10328a.m12272a(this.f10330c, bundle2, false);
    }

    /* JADX INFO: renamed from: b */
    void m12457b() {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12311k0 = AbstractC2599q.m12311k0(this.f10330c.f10137S);
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12129J = this.f10330c.m12129J();
        if (abstractComponentCallbacksC2591iM12311k0 != null && !abstractComponentCallbacksC2591iM12311k0.equals(abstractComponentCallbacksC2591iM12129J)) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
            C5662c.m25187l(abstractComponentCallbacksC2591i, abstractComponentCallbacksC2591iM12311k0, abstractComponentCallbacksC2591i.f10128J);
        }
        int iM12488j = this.f10329b.m12488j(this.f10330c);
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = this.f10330c;
        abstractComponentCallbacksC2591i2.f10137S.addView(abstractComponentCallbacksC2591i2.f10138T, iM12488j);
    }

    /* JADX INFO: renamed from: c */
    void m12458c() {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f10330c);
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = abstractComponentCallbacksC2591i.f10165s;
        C2604v c2604vM12492n = null;
        if (abstractComponentCallbacksC2591i2 != null) {
            C2604v c2604vM12492n2 = this.f10329b.m12492n(abstractComponentCallbacksC2591i2.f10155f);
            if (c2604vM12492n2 == null) {
                throw new IllegalStateException("Fragment " + this.f10330c + " declared target fragment " + this.f10330c.f10165s + " that does not belong to this FragmentManager!");
            }
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i3 = this.f10330c;
            abstractComponentCallbacksC2591i3.f10166t = abstractComponentCallbacksC2591i3.f10165s.f10155f;
            abstractComponentCallbacksC2591i3.f10165s = null;
            c2604vM12492n = c2604vM12492n2;
        } else {
            String str = abstractComponentCallbacksC2591i.f10166t;
            if (str != null && (c2604vM12492n = this.f10329b.m12492n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f10330c + " declared target fragment " + this.f10330c.f10166t + " that does not belong to this FragmentManager!");
            }
        }
        if (c2604vM12492n != null) {
            c2604vM12492n.m12467m();
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i4 = this.f10330c;
        abstractComponentCallbacksC2591i4.f10124F = abstractComponentCallbacksC2591i4.f10123E.m12403v0();
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i5 = this.f10330c;
        abstractComponentCallbacksC2591i5.f10126H = abstractComponentCallbacksC2591i5.f10123E.m12409y0();
        this.f10328a.m12278g(this.f10330c, false);
        this.f10330c.m12155X0();
        this.f10328a.m12273b(this.f10330c, false);
    }

    /* JADX INFO: renamed from: d */
    int m12459d() {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
        if (abstractComponentCallbacksC2591i.f10123E == null) {
            return abstractComponentCallbacksC2591i.f10145a;
        }
        int iMin = this.f10332e;
        int i7 = b.f10335a[abstractComponentCallbacksC2591i.f10152d0.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i7 != 3) {
                iMin = i7 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = this.f10330c;
        if (abstractComponentCallbacksC2591i2.f10172z) {
            if (abstractComponentCallbacksC2591i2.f10119A) {
                iMin = Math.max(this.f10332e, 2);
                View view = this.f10330c.f10138T;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f10332e < 4 ? Math.min(iMin, abstractComponentCallbacksC2591i2.f10145a) : Math.min(iMin, 1);
            }
        }
        if (!this.f10330c.f10169w) {
            iMin = Math.min(iMin, 1);
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i3 = this.f10330c;
        ViewGroup viewGroup = abstractComponentCallbacksC2591i3.f10137S;
        AbstractC2579F.c.a aVarM11983p = viewGroup != null ? AbstractC2579F.m11972r(viewGroup, abstractComponentCallbacksC2591i3.m12132K()).m11983p(this) : null;
        if (aVarM11983p == AbstractC2579F.c.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarM11983p == AbstractC2579F.c.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i4 = this.f10330c;
            if (abstractComponentCallbacksC2591i4.f10170x) {
                iMin = abstractComponentCallbacksC2591i4.m12174i0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i5 = this.f10330c;
        if (abstractComponentCallbacksC2591i5.f10139U && abstractComponentCallbacksC2591i5.f10145a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f10330c);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    void m12460e() {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f10330c);
        }
        Bundle bundle = this.f10330c.f10147b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
        if (abstractComponentCallbacksC2591i.f10148b0) {
            abstractComponentCallbacksC2591i.f10145a = 1;
            abstractComponentCallbacksC2591i.m12109A1();
        } else {
            this.f10328a.m12279h(abstractComponentCallbacksC2591i, bundle2, false);
            this.f10330c.m12160a1(bundle2);
            this.f10328a.m12274c(this.f10330c, bundle2, false);
        }
    }

    /* JADX INFO: renamed from: f */
    void m12461f() {
        String resourceName;
        if (this.f10330c.f10172z) {
            return;
        }
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f10330c);
        }
        Bundle bundle = this.f10330c.f10147b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterM12170g1 = this.f10330c.m12170g1(bundle2);
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
        ViewGroup viewGroup2 = abstractComponentCallbacksC2591i.f10137S;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i7 = abstractComponentCallbacksC2591i.f10128J;
            if (i7 != 0) {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f10330c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC2591i.f10123E.m12396q0().mo12098d(this.f10330c.f10128J);
                if (viewGroup == null) {
                    AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = this.f10330c;
                    if (!abstractComponentCallbacksC2591i2.f10120B) {
                        try {
                            resourceName = abstractComponentCallbacksC2591i2.m12147R().getResourceName(this.f10330c.f10128J);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f10330c.f10128J) + " (" + resourceName + ") for fragment " + this.f10330c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C5662c.m25186k(this.f10330c, viewGroup);
                }
            }
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i3 = this.f10330c;
        abstractComponentCallbacksC2591i3.f10137S = viewGroup;
        abstractComponentCallbacksC2591i3.mo12089c1(layoutInflaterM12170g1, viewGroup, bundle2);
        if (this.f10330c.f10138T != null) {
            if (AbstractC2599q.m12289I0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f10330c);
            }
            this.f10330c.f10138T.setSaveFromParentEnabled(false);
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i4 = this.f10330c;
            abstractComponentCallbacksC2591i4.f10138T.setTag(AbstractC5452b.f20750a, abstractComponentCallbacksC2591i4);
            if (viewGroup != null) {
                m12457b();
            }
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i5 = this.f10330c;
            if (abstractComponentCallbacksC2591i5.f10130L) {
                abstractComponentCallbacksC2591i5.f10138T.setVisibility(8);
            }
            if (AbstractC1030Z.m4443O(this.f10330c.f10138T)) {
                AbstractC1030Z.m4468g0(this.f10330c.f10138T);
            } else {
                View view = this.f10330c.f10138T;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f10330c.m12203t1();
            C2598p c2598p = this.f10328a;
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i6 = this.f10330c;
            c2598p.m12284m(abstractComponentCallbacksC2591i6, abstractComponentCallbacksC2591i6.f10138T, bundle2, false);
            int visibility = this.f10330c.f10138T.getVisibility();
            this.f10330c.m12134K1(this.f10330c.f10138T.getAlpha());
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i7 = this.f10330c;
            if (abstractComponentCallbacksC2591i7.f10137S != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC2591i7.f10138T.findFocus();
                if (viewFindFocus != null) {
                    this.f10330c.m12120F1(viewFindFocus);
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f10330c);
                    }
                }
                this.f10330c.f10138T.setAlpha(0.0f);
            }
        }
        this.f10330c.f10145a = 2;
    }

    /* JADX INFO: renamed from: g */
    void m12462g() {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12484f;
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f10330c);
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
        boolean zIsChangingConfigurations = true;
        boolean z7 = abstractComponentCallbacksC2591i.f10170x && !abstractComponentCallbacksC2591i.m12174i0();
        if (z7) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = this.f10330c;
            if (!abstractComponentCallbacksC2591i2.f10171y) {
                this.f10329b.m12478B(abstractComponentCallbacksC2591i2.f10155f, null);
            }
        }
        if (!z7 && !this.f10329b.m12494p().m12450q(this.f10330c)) {
            String str = this.f10330c.f10166t;
            if (str != null && (abstractComponentCallbacksC2591iM12484f = this.f10329b.m12484f(str)) != null && abstractComponentCallbacksC2591iM12484f.f10132N) {
                this.f10330c.f10165s = abstractComponentCallbacksC2591iM12484f;
            }
            this.f10330c.f10145a = 0;
            return;
        }
        AbstractC2596n abstractC2596n = this.f10330c.f10124F;
        if (abstractC2596n instanceof InterfaceC2639c0) {
            zIsChangingConfigurations = this.f10329b.m12494p().m12447n();
        } else if (abstractC2596n.m12269j() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) abstractC2596n.m12269j()).isChangingConfigurations();
        }
        if ((z7 && !this.f10330c.f10171y) || zIsChangingConfigurations) {
            this.f10329b.m12494p().m12441f(this.f10330c);
        }
        this.f10330c.m12164d1();
        this.f10328a.m12275d(this.f10330c, false);
        for (C2604v c2604v : this.f10329b.m12489k()) {
            if (c2604v != null) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v.m12466k();
                if (this.f10330c.f10155f.equals(abstractComponentCallbacksC2591iM12466k.f10166t)) {
                    abstractComponentCallbacksC2591iM12466k.f10165s = this.f10330c;
                    abstractComponentCallbacksC2591iM12466k.f10166t = null;
                }
            }
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i3 = this.f10330c;
        String str2 = abstractComponentCallbacksC2591i3.f10166t;
        if (str2 != null) {
            abstractComponentCallbacksC2591i3.f10165s = this.f10329b.m12484f(str2);
        }
        this.f10329b.m12497s(this);
    }

    /* JADX INFO: renamed from: h */
    void m12463h() {
        View view;
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f10330c);
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
        ViewGroup viewGroup = abstractComponentCallbacksC2591i.f10137S;
        if (viewGroup != null && (view = abstractComponentCallbacksC2591i.f10138T) != null) {
            viewGroup.removeView(view);
        }
        this.f10330c.m12166e1();
        this.f10328a.m12285n(this.f10330c, false);
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = this.f10330c;
        abstractComponentCallbacksC2591i2.f10137S = null;
        abstractComponentCallbacksC2591i2.f10138T = null;
        abstractComponentCallbacksC2591i2.f10156f0 = null;
        abstractComponentCallbacksC2591i2.f10157g0.mo12526q(null);
        this.f10330c.f10119A = false;
    }

    /* JADX INFO: renamed from: i */
    void m12464i() {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f10330c);
        }
        this.f10330c.m12167f1();
        this.f10328a.m12276e(this.f10330c, false);
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
        abstractComponentCallbacksC2591i.f10145a = -1;
        abstractComponentCallbacksC2591i.f10124F = null;
        abstractComponentCallbacksC2591i.f10126H = null;
        abstractComponentCallbacksC2591i.f10123E = null;
        if ((!abstractComponentCallbacksC2591i.f10170x || abstractComponentCallbacksC2591i.m12174i0()) && !this.f10329b.m12494p().m12450q(this.f10330c)) {
            return;
        }
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f10330c);
        }
        this.f10330c.m12165e0();
    }

    /* JADX INFO: renamed from: j */
    void m12465j() {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
        if (abstractComponentCallbacksC2591i.f10172z && abstractComponentCallbacksC2591i.f10119A && !abstractComponentCallbacksC2591i.f10121C) {
            if (AbstractC2599q.m12289I0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f10330c);
            }
            Bundle bundle = this.f10330c.f10147b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = this.f10330c;
            abstractComponentCallbacksC2591i2.mo12089c1(abstractComponentCallbacksC2591i2.m12170g1(bundle2), null, bundle2);
            View view = this.f10330c.f10138T;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i3 = this.f10330c;
                abstractComponentCallbacksC2591i3.f10138T.setTag(AbstractC5452b.f20750a, abstractComponentCallbacksC2591i3);
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i4 = this.f10330c;
                if (abstractComponentCallbacksC2591i4.f10130L) {
                    abstractComponentCallbacksC2591i4.f10138T.setVisibility(8);
                }
                this.f10330c.m12203t1();
                C2598p c2598p = this.f10328a;
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i5 = this.f10330c;
                c2598p.m12284m(abstractComponentCallbacksC2591i5, abstractComponentCallbacksC2591i5.f10138T, bundle2, false);
                this.f10330c.f10145a = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    AbstractComponentCallbacksC2591i m12466k() {
        return this.f10330c;
    }

    /* JADX INFO: renamed from: m */
    void m12467m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f10331d) {
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m12466k());
                return;
            }
            return;
        }
        try {
            this.f10331d = true;
            boolean z7 = false;
            while (true) {
                int iM12459d = m12459d();
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
                int i7 = abstractComponentCallbacksC2591i.f10145a;
                if (iM12459d == i7) {
                    if (!z7 && i7 == -1 && abstractComponentCallbacksC2591i.f10170x && !abstractComponentCallbacksC2591i.m12174i0() && !this.f10330c.f10171y) {
                        if (AbstractC2599q.m12289I0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f10330c);
                        }
                        this.f10329b.m12494p().m12441f(this.f10330c);
                        this.f10329b.m12497s(this);
                        if (AbstractC2599q.m12289I0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f10330c);
                        }
                        this.f10330c.m12165e0();
                    }
                    AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = this.f10330c;
                    if (abstractComponentCallbacksC2591i2.f10144Z) {
                        if (abstractComponentCallbacksC2591i2.f10138T != null && (viewGroup = abstractComponentCallbacksC2591i2.f10137S) != null) {
                            AbstractC2579F abstractC2579FM11972r = AbstractC2579F.m11972r(viewGroup, abstractComponentCallbacksC2591i2.m12132K());
                            if (this.f10330c.f10130L) {
                                abstractC2579FM11972r.m11976g(this);
                            } else {
                                abstractC2579FM11972r.m11978i(this);
                            }
                        }
                        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i3 = this.f10330c;
                        AbstractC2599q abstractC2599q = abstractComponentCallbacksC2591i3.f10123E;
                        if (abstractC2599q != null) {
                            abstractC2599q.m12338G0(abstractComponentCallbacksC2591i3);
                        }
                        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i4 = this.f10330c;
                        abstractComponentCallbacksC2591i4.f10144Z = false;
                        abstractComponentCallbacksC2591i4.m12119F0(abstractComponentCallbacksC2591i4.f10130L);
                        this.f10330c.f10125G.m12339H();
                    }
                    return;
                }
                if (iM12459d <= i7) {
                    switch (i7 - 1) {
                        case -1:
                            m12464i();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC2591i.f10171y && this.f10329b.m12495q(abstractComponentCallbacksC2591i.f10155f) == null) {
                                this.f10329b.m12478B(this.f10330c.f10155f, m12472r());
                            }
                            m12462g();
                            break;
                        case 1:
                            m12463h();
                            this.f10330c.f10145a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC2591i.f10119A = false;
                            abstractComponentCallbacksC2591i.f10145a = 2;
                            break;
                        case 3:
                            if (AbstractC2599q.m12289I0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f10330c);
                            }
                            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i5 = this.f10330c;
                            if (abstractComponentCallbacksC2591i5.f10171y) {
                                this.f10329b.m12478B(abstractComponentCallbacksC2591i5.f10155f, m12472r());
                            } else if (abstractComponentCallbacksC2591i5.f10138T != null && abstractComponentCallbacksC2591i5.f10149c == null) {
                                m12473s();
                            }
                            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i6 = this.f10330c;
                            if (abstractComponentCallbacksC2591i6.f10138T != null && (viewGroup2 = abstractComponentCallbacksC2591i6.f10137S) != null) {
                                AbstractC2579F.m11972r(viewGroup2, abstractComponentCallbacksC2591i6.m12132K()).m11977h(this);
                            }
                            this.f10330c.f10145a = 3;
                            break;
                        case 4:
                            m12476v();
                            break;
                        case 5:
                            abstractComponentCallbacksC2591i.f10145a = 5;
                            break;
                        case 6:
                            m12468n();
                            break;
                    }
                } else {
                    switch (i7 + 1) {
                        case 0:
                            m12458c();
                            break;
                        case 1:
                            m12460e();
                            break;
                        case 2:
                            m12465j();
                            m12461f();
                            break;
                        case 3:
                            m12456a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC2591i.f10138T != null && (viewGroup3 = abstractComponentCallbacksC2591i.f10137S) != null) {
                                AbstractC2579F.m11972r(viewGroup3, abstractComponentCallbacksC2591i.m12132K()).m11975f(AbstractC2579F.c.b.m12005h(this.f10330c.f10138T.getVisibility()), this);
                            }
                            this.f10330c.f10145a = 4;
                            break;
                        case 5:
                            m12475u();
                            break;
                        case 6:
                            abstractComponentCallbacksC2591i.f10145a = 6;
                            break;
                        case 7:
                            m12470p();
                            break;
                    }
                }
                z7 = true;
            }
        } finally {
            this.f10331d = false;
        }
    }

    /* JADX INFO: renamed from: n */
    void m12468n() {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f10330c);
        }
        this.f10330c.m12183l1();
        this.f10328a.m12277f(this.f10330c, false);
    }

    /* JADX INFO: renamed from: o */
    void m12469o(ClassLoader classLoader) {
        Bundle bundle = this.f10330c.f10147b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f10330c.f10147b.getBundle("savedInstanceState") == null) {
            this.f10330c.f10147b.putBundle("savedInstanceState", new Bundle());
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
        abstractComponentCallbacksC2591i.f10149c = abstractComponentCallbacksC2591i.f10147b.getSparseParcelableArray("viewState");
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = this.f10330c;
        abstractComponentCallbacksC2591i2.f10151d = abstractComponentCallbacksC2591i2.f10147b.getBundle("viewRegistryState");
        C2603u c2603u = (C2603u) this.f10330c.f10147b.getParcelable("state");
        if (c2603u != null) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i3 = this.f10330c;
            abstractComponentCallbacksC2591i3.f10166t = c2603u.f10325w;
            abstractComponentCallbacksC2591i3.f10167u = c2603u.f10326x;
            Boolean bool = abstractComponentCallbacksC2591i3.f10153e;
            if (bool != null) {
                abstractComponentCallbacksC2591i3.f10140V = bool.booleanValue();
                this.f10330c.f10153e = null;
            } else {
                abstractComponentCallbacksC2591i3.f10140V = c2603u.f10327y;
            }
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i4 = this.f10330c;
        if (abstractComponentCallbacksC2591i4.f10140V) {
            return;
        }
        abstractComponentCallbacksC2591i4.f10139U = true;
    }

    /* JADX INFO: renamed from: p */
    void m12470p() {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f10330c);
        }
        View viewM12114D = this.f10330c.m12114D();
        if (viewM12114D != null && m12455l(viewM12114D)) {
            boolean zRequestFocus = viewM12114D.requestFocus();
            if (AbstractC2599q.m12289I0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(viewM12114D);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f10330c);
                sb.append(" resulting in focused view ");
                sb.append(this.f10330c.f10138T.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f10330c.m12120F1(null);
        this.f10330c.m12193p1();
        this.f10328a.m12280i(this.f10330c, false);
        this.f10329b.m12478B(this.f10330c.f10155f, null);
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
        abstractComponentCallbacksC2591i.f10147b = null;
        abstractComponentCallbacksC2591i.f10149c = null;
        abstractComponentCallbacksC2591i.f10151d = null;
    }

    /* JADX INFO: renamed from: q */
    AbstractComponentCallbacksC2591i.n m12471q() {
        if (this.f10330c.f10145a > -1) {
            return new AbstractComponentCallbacksC2591i.n(m12472r());
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    Bundle m12472r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10330c;
        if (abstractComponentCallbacksC2591i.f10145a == -1 && (bundle = abstractComponentCallbacksC2591i.f10147b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C2603u(this.f10330c));
        if (this.f10330c.f10145a > -1) {
            Bundle bundle3 = new Bundle();
            this.f10330c.m12195q1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f10328a.m12281j(this.f10330c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f10330c.f10159i0.m194e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleM12382i1 = this.f10330c.f10125G.m12382i1();
            if (!bundleM12382i1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleM12382i1);
            }
            if (this.f10330c.f10138T != null) {
                m12473s();
            }
            SparseArray<? extends Parcelable> sparseArray = this.f10330c.f10149c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f10330c.f10151d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f10330c.f10164r;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: s */
    void m12473s() {
        if (this.f10330c.f10138T == null) {
            return;
        }
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f10330c + " with view " + this.f10330c.f10138T);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f10330c.f10138T.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f10330c.f10149c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f10330c.f10156f0.m11959f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f10330c.f10151d = bundle;
    }

    /* JADX INFO: renamed from: t */
    void m12474t(int i7) {
        this.f10332e = i7;
    }

    /* JADX INFO: renamed from: u */
    void m12475u() {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f10330c);
        }
        this.f10330c.m12198r1();
        this.f10328a.m12282k(this.f10330c, false);
    }

    /* JADX INFO: renamed from: v */
    void m12476v() {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f10330c);
        }
        this.f10330c.m12200s1();
        this.f10328a.m12283l(this.f10330c, false);
    }

    C2604v(C2598p c2598p, C2605w c2605w, ClassLoader classLoader, AbstractC2595m abstractC2595m, Bundle bundle) {
        this.f10328a = c2598p;
        this.f10329b = c2605w;
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12452a = ((C2603u) bundle.getParcelable("state")).m12452a(abstractC2595m, classLoader);
        this.f10330c = abstractComponentCallbacksC2591iM12452a;
        abstractComponentCallbacksC2591iM12452a.f10147b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC2591iM12452a.m12117E1(bundle2);
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC2591iM12452a);
        }
    }

    C2604v(C2598p c2598p, C2605w c2605w, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Bundle bundle) {
        this.f10328a = c2598p;
        this.f10329b = c2605w;
        this.f10330c = abstractComponentCallbacksC2591i;
        abstractComponentCallbacksC2591i.f10149c = null;
        abstractComponentCallbacksC2591i.f10151d = null;
        abstractComponentCallbacksC2591i.f10122D = 0;
        abstractComponentCallbacksC2591i.f10119A = false;
        abstractComponentCallbacksC2591i.f10169w = false;
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = abstractComponentCallbacksC2591i.f10165s;
        abstractComponentCallbacksC2591i.f10166t = abstractComponentCallbacksC2591i2 != null ? abstractComponentCallbacksC2591i2.f10155f : null;
        abstractComponentCallbacksC2591i.f10165s = null;
        abstractComponentCallbacksC2591i.f10147b = bundle;
        abstractComponentCallbacksC2591i.f10164r = bundle.getBundle("arguments");
    }
}
