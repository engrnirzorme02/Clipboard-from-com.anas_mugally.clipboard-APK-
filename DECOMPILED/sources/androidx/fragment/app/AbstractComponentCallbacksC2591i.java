package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import androidx.lifecycle.AbstractC2622N;
import androidx.lifecycle.AbstractC2641d0;
import androidx.lifecycle.AbstractC2643e0;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.AbstractC2664z;
import androidx.lifecycle.C2611C;
import androidx.lifecycle.C2626S;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.C2637b0;
import androidx.lifecycle.C2659u;
import androidx.lifecycle.InterfaceC2639c0;
import androidx.lifecycle.InterfaceC2648j;
import androidx.lifecycle.InterfaceC2654p;
import androidx.lifecycle.InterfaceC2657s;
import androidx.loader.app.AbstractC2665a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p010B0.AbstractC0054m;
import p010B0.C0047f;
import p010B0.C0049h;
import p010B0.InterfaceC0050i;
import p017C.AbstractC0102c;
import p017C.AbstractC0120u;
import p111O.AbstractC1078v;
import p239f.AbstractC5382c;
import p239f.AbstractC5385f;
import p239f.InterfaceC5381b;
import p239f.InterfaceC5386g;
import p247g.AbstractC5447a;
import p256h0.AbstractC5540k;
import p264i0.C5662c;
import p304n0.AbstractC6428a;
import p304n0.C6429b;
import p321p.InterfaceC6714a;

/* JADX INFO: renamed from: androidx.fragment.app.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC2591i implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC2657s, InterfaceC2639c0, InterfaceC2648j, InterfaceC0050i {

    /* JADX INFO: renamed from: n0 */
    static final Object f10118n0 = new Object();

    /* JADX INFO: renamed from: A */
    boolean f10119A;

    /* JADX INFO: renamed from: B */
    boolean f10120B;

    /* JADX INFO: renamed from: C */
    boolean f10121C;

    /* JADX INFO: renamed from: D */
    int f10122D;

    /* JADX INFO: renamed from: E */
    AbstractC2599q f10123E;

    /* JADX INFO: renamed from: F */
    AbstractC2596n f10124F;

    /* JADX INFO: renamed from: G */
    AbstractC2599q f10125G;

    /* JADX INFO: renamed from: H */
    AbstractComponentCallbacksC2591i f10126H;

    /* JADX INFO: renamed from: I */
    int f10127I;

    /* JADX INFO: renamed from: J */
    int f10128J;

    /* JADX INFO: renamed from: K */
    String f10129K;

    /* JADX INFO: renamed from: L */
    boolean f10130L;

    /* JADX INFO: renamed from: M */
    boolean f10131M;

    /* JADX INFO: renamed from: N */
    boolean f10132N;

    /* JADX INFO: renamed from: O */
    boolean f10133O;

    /* JADX INFO: renamed from: P */
    boolean f10134P;

    /* JADX INFO: renamed from: Q */
    boolean f10135Q;

    /* JADX INFO: renamed from: R */
    private boolean f10136R;

    /* JADX INFO: renamed from: S */
    ViewGroup f10137S;

    /* JADX INFO: renamed from: T */
    View f10138T;

    /* JADX INFO: renamed from: U */
    boolean f10139U;

    /* JADX INFO: renamed from: V */
    boolean f10140V;

    /* JADX INFO: renamed from: W */
    j f10141W;

    /* JADX INFO: renamed from: X */
    Handler f10142X;

    /* JADX INFO: renamed from: Y */
    Runnable f10143Y;

    /* JADX INFO: renamed from: Z */
    boolean f10144Z;

    /* JADX INFO: renamed from: a */
    int f10145a;

    /* JADX INFO: renamed from: a0 */
    LayoutInflater f10146a0;

    /* JADX INFO: renamed from: b */
    Bundle f10147b;

    /* JADX INFO: renamed from: b0 */
    boolean f10148b0;

    /* JADX INFO: renamed from: c */
    SparseArray f10149c;

    /* JADX INFO: renamed from: c0 */
    public String f10150c0;

    /* JADX INFO: renamed from: d */
    Bundle f10151d;

    /* JADX INFO: renamed from: d0 */
    AbstractC2650l.b f10152d0;

    /* JADX INFO: renamed from: e */
    Boolean f10153e;

    /* JADX INFO: renamed from: e0 */
    C2659u f10154e0;

    /* JADX INFO: renamed from: f */
    String f10155f;

    /* JADX INFO: renamed from: f0 */
    C2575B f10156f0;

    /* JADX INFO: renamed from: g0 */
    C2611C f10157g0;

    /* JADX INFO: renamed from: h0 */
    C2635a0.c f10158h0;

    /* JADX INFO: renamed from: i0 */
    C0049h f10159i0;

    /* JADX INFO: renamed from: j0 */
    private int f10160j0;

    /* JADX INFO: renamed from: k0 */
    private final AtomicInteger f10161k0;

    /* JADX INFO: renamed from: l0 */
    private final ArrayList f10162l0;

    /* JADX INFO: renamed from: m0 */
    private final m f10163m0;

    /* JADX INFO: renamed from: r */
    Bundle f10164r;

    /* JADX INFO: renamed from: s */
    AbstractComponentCallbacksC2591i f10165s;

    /* JADX INFO: renamed from: t */
    String f10166t;

    /* JADX INFO: renamed from: u */
    int f10167u;

    /* JADX INFO: renamed from: v */
    private Boolean f10168v;

    /* JADX INFO: renamed from: w */
    boolean f10169w;

    /* JADX INFO: renamed from: x */
    boolean f10170x;

    /* JADX INFO: renamed from: y */
    boolean f10171y;

    /* JADX INFO: renamed from: z */
    boolean f10172z;

    /* JADX INFO: renamed from: androidx.fragment.app.i$a */
    class a extends AbstractC5382c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AtomicReference f10173a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC5447a f10174b;

        a(AtomicReference atomicReference, AbstractC5447a abstractC5447a) {
            this.f10173a = atomicReference;
            this.f10174b = abstractC5447a;
        }

        @Override // p239f.AbstractC5382c
        /* JADX INFO: renamed from: b */
        public void mo12217b(Object obj, AbstractC0102c abstractC0102c) {
            AbstractC5382c abstractC5382c = (AbstractC5382c) this.f10173a.get();
            if (abstractC5382c == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC5382c.mo12217b(obj, abstractC0102c);
        }

        @Override // p239f.AbstractC5382c
        /* JADX INFO: renamed from: c */
        public void mo12218c() {
            AbstractC5382c abstractC5382c = (AbstractC5382c) this.f10173a.getAndSet(null);
            if (abstractC5382c != null) {
                abstractC5382c.mo12218c();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC2591i.this.m12145P1();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$c */
    class c extends m {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i.m
        /* JADX INFO: renamed from: a */
        void mo12219a() {
            AbstractComponentCallbacksC2591i.this.f10159i0.m192c();
            AbstractC2622N.m12559c(AbstractComponentCallbacksC2591i.this);
            Bundle bundle = AbstractComponentCallbacksC2591i.this.f10147b;
            AbstractComponentCallbacksC2591i.this.f10159i0.m193d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC2591i.this.m12168g(false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC2579F f10179a;

        e(AbstractC2579F abstractC2579F) {
            this.f10179a = abstractC2579F;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10179a.m11980k();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$f */
    class f extends AbstractC5540k {
        f() {
        }

        @Override // p256h0.AbstractC5540k
        /* JADX INFO: renamed from: d */
        public View mo12098d(int i7) {
            View view = AbstractComponentCallbacksC2591i.this.f10138T;
            if (view != null) {
                return view.findViewById(i7);
            }
            throw new IllegalStateException("Fragment " + AbstractComponentCallbacksC2591i.this + " does not have a view");
        }

        @Override // p256h0.AbstractC5540k
        /* JADX INFO: renamed from: f */
        public boolean mo12099f() {
            return AbstractComponentCallbacksC2591i.this.f10138T != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$g */
    class g implements InterfaceC2654p {
        g() {
        }

        @Override // androidx.lifecycle.InterfaceC2654p
        /* JADX INFO: renamed from: n */
        public void mo173n(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar) {
            View view;
            if (aVar != AbstractC2650l.a.ON_STOP || (view = AbstractComponentCallbacksC2591i.this.f10138T) == null) {
                return;
            }
            k.m12221a(view);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$h */
    class h implements InterfaceC6714a {
        h() {
        }

        @Override // p321p.InterfaceC6714a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC5385f apply(Void r7) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = AbstractComponentCallbacksC2591i.this;
            Object obj = abstractComponentCallbacksC2591i.f10124F;
            return obj instanceof InterfaceC5386g ? ((InterfaceC5386g) obj).mo12243t() : abstractComponentCallbacksC2591i.m12211x1().mo12243t();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$i */
    class i extends m {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6714a f10184a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AtomicReference f10185b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC5447a f10186c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC5381b f10187d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC6714a interfaceC6714a, AtomicReference atomicReference, AbstractC5447a abstractC5447a, InterfaceC5381b interfaceC5381b) {
            super(null);
            this.f10184a = interfaceC6714a;
            this.f10185b = atomicReference;
            this.f10186c = abstractC5447a;
            this.f10187d = interfaceC5381b;
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i.m
        /* JADX INFO: renamed from: a */
        void mo12219a() {
            String strM12181l = AbstractComponentCallbacksC2591i.this.m12181l();
            this.f10185b.set(((AbstractC5385f) this.f10184a.apply(null)).m24409n(strM12181l, AbstractComponentCallbacksC2591i.this, this.f10186c, this.f10187d));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$j */
    static class j {

        /* JADX INFO: renamed from: a */
        View f10189a;

        /* JADX INFO: renamed from: b */
        boolean f10190b;

        /* JADX INFO: renamed from: c */
        int f10191c;

        /* JADX INFO: renamed from: d */
        int f10192d;

        /* JADX INFO: renamed from: e */
        int f10193e;

        /* JADX INFO: renamed from: f */
        int f10194f;

        /* JADX INFO: renamed from: g */
        int f10195g;

        /* JADX INFO: renamed from: h */
        ArrayList f10196h;

        /* JADX INFO: renamed from: i */
        ArrayList f10197i;

        /* JADX INFO: renamed from: j */
        Object f10198j = null;

        /* JADX INFO: renamed from: k */
        Object f10199k;

        /* JADX INFO: renamed from: l */
        Object f10200l;

        /* JADX INFO: renamed from: m */
        Object f10201m;

        /* JADX INFO: renamed from: n */
        Object f10202n;

        /* JADX INFO: renamed from: o */
        Object f10203o;

        /* JADX INFO: renamed from: p */
        Boolean f10204p;

        /* JADX INFO: renamed from: q */
        Boolean f10205q;

        /* JADX INFO: renamed from: r */
        float f10206r;

        /* JADX INFO: renamed from: s */
        View f10207s;

        /* JADX INFO: renamed from: t */
        boolean f10208t;

        j() {
            Object obj = AbstractComponentCallbacksC2591i.f10118n0;
            this.f10199k = obj;
            this.f10200l = null;
            this.f10201m = obj;
            this.f10202n = null;
            this.f10203o = obj;
            this.f10206r = 1.0f;
            this.f10207s = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$k */
    static class k {
        /* JADX INFO: renamed from: a */
        static void m12221a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$l */
    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$m */
    private static abstract class m {
        private m() {
        }

        /* JADX INFO: renamed from: a */
        abstract void mo12219a();

        /* synthetic */ m(b bVar) {
            this();
        }
    }

    public AbstractComponentCallbacksC2591i() {
        this.f10145a = -1;
        this.f10155f = UUID.randomUUID().toString();
        this.f10166t = null;
        this.f10168v = null;
        this.f10125G = new C2600r();
        this.f10135Q = true;
        this.f10140V = true;
        this.f10143Y = new b();
        this.f10152d0 = AbstractC2650l.b.RESUMED;
        this.f10157g0 = new C2611C();
        this.f10161k0 = new AtomicInteger();
        this.f10162l0 = new ArrayList();
        this.f10163m0 = new c();
        m12103d0();
    }

    /* JADX INFO: renamed from: B1 */
    private void m12100B1() {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f10138T != null) {
            Bundle bundle = this.f10147b;
            m12113C1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.f10147b = null;
    }

    /* JADX INFO: renamed from: H */
    private int m12101H() {
        AbstractC2650l.b bVar = this.f10152d0;
        return (bVar == AbstractC2650l.b.INITIALIZED || this.f10126H == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f10126H.m12101H());
    }

    /* JADX INFO: renamed from: Z */
    private AbstractComponentCallbacksC2591i m12102Z(boolean z7) {
        String str;
        if (z7) {
            C5662c.m25183h(this);
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10165s;
        if (abstractComponentCallbacksC2591i != null) {
            return abstractComponentCallbacksC2591i;
        }
        AbstractC2599q abstractC2599q = this.f10123E;
        if (abstractC2599q == null || (str = this.f10166t) == null) {
            return null;
        }
        return abstractC2599q.m12373e0(str);
    }

    /* JADX INFO: renamed from: d0 */
    private void m12103d0() {
        this.f10154e0 = new C2659u(this);
        this.f10159i0 = C0049h.m190a(this);
        this.f10158h0 = null;
        if (this.f10162l0.contains(this.f10163m0)) {
            return;
        }
        m12108w1(this.f10163m0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m12104f(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        abstractComponentCallbacksC2591i.f10156f0.m11958e(abstractComponentCallbacksC2591i.f10151d);
        abstractComponentCallbacksC2591i.f10151d = null;
    }

    /* JADX INFO: renamed from: f0 */
    public static AbstractComponentCallbacksC2591i m12105f0(Context context, String str, Bundle bundle) {
        try {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) AbstractC2595m.m12266d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle == null) {
                return abstractComponentCallbacksC2591i;
            }
            bundle.setClassLoader(abstractComponentCallbacksC2591i.getClass().getClassLoader());
            abstractComponentCallbacksC2591i.m12117E1(bundle);
            return abstractComponentCallbacksC2591i;
        } catch (IllegalAccessException e7) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e7);
        } catch (InstantiationException e8) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (NoSuchMethodException e9) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e9);
        } catch (InvocationTargetException e10) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e10);
        }
    }

    /* JADX INFO: renamed from: j */
    private j m12106j() {
        if (this.f10141W == null) {
            this.f10141W = new j();
        }
        return this.f10141W;
    }

    /* JADX INFO: renamed from: u1 */
    private AbstractC5382c m12107u1(AbstractC5447a abstractC5447a, InterfaceC6714a interfaceC6714a, InterfaceC5381b interfaceC5381b) {
        if (this.f10145a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            m12108w1(new i(interfaceC6714a, atomicReference, abstractC5447a, interfaceC5381b));
            return new a(atomicReference, abstractC5447a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    /* JADX INFO: renamed from: w1 */
    private void m12108w1(m mVar) {
        if (this.f10145a >= 0) {
            mVar.mo12219a();
        } else {
            this.f10162l0.add(mVar);
        }
    }

    @Override // p010B0.InterfaceC0050i
    /* JADX INFO: renamed from: A */
    public final C0047f mo198A() {
        return this.f10159i0.m191b();
    }

    /* JADX INFO: renamed from: A0 */
    public void mo675A0() {
        this.f10136R = true;
    }

    /* JADX INFO: renamed from: A1 */
    void m12109A1() {
        Bundle bundle;
        Bundle bundle2 = this.f10147b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f10125G.m12377g1(bundle);
        this.f10125G.m12326A();
    }

    /* JADX INFO: renamed from: B */
    public Object m12110B() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return null;
        }
        return jVar.f10200l;
    }

    /* JADX INFO: renamed from: B0 */
    public void m12111B0() {
    }

    /* JADX INFO: renamed from: C */
    AbstractC0120u m12112C() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: C0 */
    public void mo676C0() {
        this.f10136R = true;
    }

    /* JADX INFO: renamed from: C1 */
    final void m12113C1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f10149c;
        if (sparseArray != null) {
            this.f10138T.restoreHierarchyState(sparseArray);
            this.f10149c = null;
        }
        this.f10136R = false;
        mo12084V0(bundle);
        if (this.f10136R) {
            if (this.f10138T != null) {
                this.f10156f0.m11955a(AbstractC2650l.a.ON_CREATE);
            }
        } else {
            throw new C2582H("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* JADX INFO: renamed from: D */
    View m12114D() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return null;
        }
        return jVar.f10207s;
    }

    /* JADX INFO: renamed from: D0 */
    public void mo12078D0() {
        this.f10136R = true;
    }

    /* JADX INFO: renamed from: D1 */
    void m12115D1(int i7, int i8, int i9, int i10) {
        if (this.f10141W == null && i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        m12106j().f10191c = i7;
        m12106j().f10192d = i8;
        m12106j().f10193e = i9;
        m12106j().f10194f = i10;
    }

    /* JADX INFO: renamed from: E */
    public final Object m12116E() {
        AbstractC2596n abstractC2596n = this.f10124F;
        if (abstractC2596n == null) {
            return null;
        }
        return abstractC2596n.mo12240n();
    }

    /* JADX INFO: renamed from: E0 */
    public LayoutInflater mo12079E0(Bundle bundle) {
        return m12121G(bundle);
    }

    /* JADX INFO: renamed from: E1 */
    public void m12117E1(Bundle bundle) {
        if (this.f10123E != null && m12185m0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f10164r = bundle;
    }

    /* JADX INFO: renamed from: F */
    public final LayoutInflater m12118F() {
        LayoutInflater layoutInflater = this.f10146a0;
        return layoutInflater == null ? m12170g1(null) : layoutInflater;
    }

    /* JADX INFO: renamed from: F0 */
    public void m12119F0(boolean z7) {
    }

    /* JADX INFO: renamed from: F1 */
    void m12120F1(View view) {
        m12106j().f10207s = view;
    }

    /* JADX INFO: renamed from: G */
    public LayoutInflater m12121G(Bundle bundle) {
        AbstractC2596n abstractC2596n = this.f10124F;
        if (abstractC2596n == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo12241o = abstractC2596n.mo12241o();
        AbstractC1078v.m4780a(layoutInflaterMo12241o, this.f10125G.m12405w0());
        return layoutInflaterMo12241o;
    }

    /* JADX INFO: renamed from: G0 */
    public void m12122G0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f10136R = true;
    }

    /* JADX INFO: renamed from: G1 */
    public void m12123G1(n nVar) {
        Bundle bundle;
        if (this.f10123E != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (nVar == null || (bundle = nVar.f10209a) == null) {
            bundle = null;
        }
        this.f10147b = bundle;
    }

    /* JADX INFO: renamed from: H0 */
    public void m12124H0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f10136R = true;
        AbstractC2596n abstractC2596n = this.f10124F;
        Activity activityM12268i = abstractC2596n == null ? null : abstractC2596n.m12268i();
        if (activityM12268i != null) {
            this.f10136R = false;
            m12122G0(activityM12268i, attributeSet, bundle);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public void m12125H1(boolean z7) {
        if (this.f10135Q != z7) {
            this.f10135Q = z7;
            if (this.f10134P && m12169g0() && !m12171h0()) {
                this.f10124F.mo12242q();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    int m12126I() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return 0;
        }
        return jVar.f10195g;
    }

    /* JADX INFO: renamed from: I0 */
    public void m12127I0(boolean z7) {
    }

    /* JADX INFO: renamed from: I1 */
    void m12128I1(int i7) {
        if (this.f10141W == null && i7 == 0) {
            return;
        }
        m12106j();
        this.f10141W.f10195g = i7;
    }

    /* JADX INFO: renamed from: J */
    public final AbstractComponentCallbacksC2591i m12129J() {
        return this.f10126H;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m12130J0(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: renamed from: J1 */
    void m12131J1(boolean z7) {
        if (this.f10141W == null) {
            return;
        }
        m12106j().f10190b = z7;
    }

    /* JADX INFO: renamed from: K */
    public final AbstractC2599q m12132K() {
        AbstractC2599q abstractC2599q = this.f10123E;
        if (abstractC2599q != null) {
            return abstractC2599q;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX INFO: renamed from: K0 */
    public void m12133K0(Menu menu) {
    }

    /* JADX INFO: renamed from: K1 */
    void m12134K1(float f7) {
        m12106j().f10206r = f7;
    }

    /* JADX INFO: renamed from: L */
    boolean m12135L() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return false;
        }
        return jVar.f10190b;
    }

    /* JADX INFO: renamed from: L0 */
    public void mo677L0() {
        this.f10136R = true;
    }

    /* JADX INFO: renamed from: L1 */
    public void m12136L1(boolean z7) {
        C5662c.m25184i(this);
        this.f10132N = z7;
        AbstractC2599q abstractC2599q = this.f10123E;
        if (abstractC2599q == null) {
            this.f10133O = true;
        } else if (z7) {
            abstractC2599q.m12383j(this);
        } else {
            abstractC2599q.m12374e1(this);
        }
    }

    /* JADX INFO: renamed from: M */
    int m12137M() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return 0;
        }
        return jVar.f10193e;
    }

    /* JADX INFO: renamed from: M0 */
    public void m12138M0(boolean z7) {
    }

    /* JADX INFO: renamed from: M1 */
    void m12139M1(ArrayList arrayList, ArrayList arrayList2) {
        m12106j();
        j jVar = this.f10141W;
        jVar.f10196h = arrayList;
        jVar.f10197i = arrayList2;
    }

    /* JADX INFO: renamed from: N */
    int m12140N() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return 0;
        }
        return jVar.f10194f;
    }

    /* JADX INFO: renamed from: N0 */
    public void m12141N0(Menu menu) {
    }

    /* JADX INFO: renamed from: N1 */
    public void mo678N1(boolean z7) {
        C5662c.m25185j(this, z7);
        if (!this.f10140V && z7 && this.f10145a < 5 && this.f10123E != null && m12169g0() && this.f10148b0) {
            AbstractC2599q abstractC2599q = this.f10123E;
            abstractC2599q.m12360U0(abstractC2599q.m12400u(this));
        }
        this.f10140V = z7;
        this.f10139U = this.f10145a < 5 && !z7;
        if (this.f10147b != null) {
            this.f10153e = Boolean.valueOf(z7);
        }
    }

    /* JADX INFO: renamed from: O */
    float m12142O() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f10206r;
    }

    /* JADX INFO: renamed from: O0 */
    public void m12143O0(boolean z7) {
    }

    /* JADX INFO: renamed from: O1 */
    public void m12144O1(Intent intent, int i7, Bundle bundle) {
        if (this.f10124F != null) {
            m12132K().m12354Q0(this, intent, i7, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // androidx.lifecycle.InterfaceC2657s
    /* JADX INFO: renamed from: P */
    public AbstractC2650l mo419P() {
        return this.f10154e0;
    }

    /* JADX INFO: renamed from: P0 */
    public void mo679P0(int i7, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: renamed from: P1 */
    public void m12145P1() {
        if (this.f10141W == null || !m12106j().f10208t) {
            return;
        }
        if (this.f10124F == null) {
            m12106j().f10208t = false;
        } else if (Looper.myLooper() != this.f10124F.m12270k().getLooper()) {
            this.f10124F.m12270k().postAtFrontOfQueue(new d());
        } else {
            m12168g(true);
        }
    }

    /* JADX INFO: renamed from: Q */
    public Object m12146Q() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f10201m;
        return obj == f10118n0 ? m12110B() : obj;
    }

    /* JADX INFO: renamed from: Q0 */
    public void mo680Q0() {
        this.f10136R = true;
    }

    /* JADX INFO: renamed from: R */
    public final Resources m12147R() {
        return m12214y1().getResources();
    }

    /* JADX INFO: renamed from: R0 */
    public void mo12080R0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: S */
    public Object m12148S() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f10199k;
        return obj == f10118n0 ? m12209x() : obj;
    }

    /* JADX INFO: renamed from: S0 */
    public void mo12081S0() {
        this.f10136R = true;
    }

    /* JADX INFO: renamed from: T */
    public Object m12149T() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return null;
        }
        return jVar.f10202n;
    }

    /* JADX INFO: renamed from: T0 */
    public void mo5868T0() {
        this.f10136R = true;
    }

    /* JADX INFO: renamed from: U */
    public Object m12150U() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f10203o;
        return obj == f10118n0 ? m12149T() : obj;
    }

    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
    }

    /* JADX INFO: renamed from: V */
    ArrayList m12151V() {
        ArrayList arrayList;
        j jVar = this.f10141W;
        return (jVar == null || (arrayList = jVar.f10196h) == null) ? new ArrayList() : arrayList;
    }

    /* JADX INFO: renamed from: V0 */
    public void mo12084V0(Bundle bundle) {
        this.f10136R = true;
    }

    /* JADX INFO: renamed from: W */
    ArrayList m12152W() {
        ArrayList arrayList;
        j jVar = this.f10141W;
        return (jVar == null || (arrayList = jVar.f10197i) == null) ? new ArrayList() : arrayList;
    }

    /* JADX INFO: renamed from: W0 */
    void m12153W0(Bundle bundle) {
        this.f10125G.m12357S0();
        this.f10145a = 3;
        this.f10136R = false;
        mo12094p0(bundle);
        if (this.f10136R) {
            m12100B1();
            this.f10125G.m12404w();
        } else {
            throw new C2582H("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    /* JADX INFO: renamed from: X */
    public final String m12154X(int i7) {
        return m12147R().getString(i7);
    }

    /* JADX INFO: renamed from: X0 */
    void m12155X0() {
        Iterator it = this.f10162l0.iterator();
        while (it.hasNext()) {
            ((m) it.next()).mo12219a();
        }
        this.f10162l0.clear();
        this.f10125G.m12387l(this.f10124F, mo12093h(), this);
        this.f10145a = 0;
        this.f10136R = false;
        mo12095s0(this.f10124F.m12269j());
        if (this.f10136R) {
            this.f10123E.m12337G(this);
            this.f10125G.m12406x();
        } else {
            throw new C2582H("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final String m12156Y(int i7, Object... objArr) {
        return m12147R().getString(i7, objArr);
    }

    /* JADX INFO: renamed from: Y0 */
    void m12157Y0(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    /* JADX INFO: renamed from: Z0 */
    boolean m12158Z0(MenuItem menuItem) {
        if (this.f10130L) {
            return false;
        }
        if (m12205u0(menuItem)) {
            return true;
        }
        return this.f10125G.m12410z(menuItem);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m12159a0() {
        return this.f10140V;
    }

    /* JADX INFO: renamed from: a1 */
    void m12160a1(Bundle bundle) {
        this.f10125G.m12357S0();
        this.f10145a = 1;
        this.f10136R = false;
        this.f10154e0.mo12625a(new g());
        mo681v0(bundle);
        this.f10148b0 = true;
        if (this.f10136R) {
            this.f10154e0.m12651i(AbstractC2650l.a.ON_CREATE);
            return;
        }
        throw new C2582H("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* JADX INFO: renamed from: b0 */
    public View m12161b0() {
        return this.f10138T;
    }

    /* JADX INFO: renamed from: b1 */
    boolean m12162b1(Menu menu, MenuInflater menuInflater) {
        boolean z7 = false;
        if (this.f10130L) {
            return false;
        }
        if (this.f10134P && this.f10135Q) {
            m12213y0(menu, menuInflater);
            z7 = true;
        }
        return this.f10125G.m12328B(menu, menuInflater) | z7;
    }

    /* JADX INFO: renamed from: c0 */
    public AbstractC2664z m12163c0() {
        return this.f10157g0;
    }

    /* JADX INFO: renamed from: c1 */
    void mo12089c1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f10125G.m12357S0();
        this.f10121C = true;
        this.f10156f0 = new C2575B(this, mo11963v(), new Runnable() { // from class: h0.f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractComponentCallbacksC2591i.m12104f(this.f21368a);
            }
        });
        View viewMo682z0 = mo682z0(layoutInflater, viewGroup, bundle);
        this.f10138T = viewMo682z0;
        if (viewMo682z0 == null) {
            if (this.f10156f0.m11957d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f10156f0 = null;
            return;
        }
        this.f10156f0.m11956c();
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f10138T + " for Fragment " + this);
        }
        AbstractC2641d0.m12618a(this.f10138T, this.f10156f0);
        AbstractC2643e0.m12619a(this.f10138T, this.f10156f0);
        AbstractC0054m.m206a(this.f10138T, this.f10156f0);
        this.f10157g0.mo12526q(this.f10156f0);
    }

    /* JADX INFO: renamed from: d1 */
    void m12164d1() {
        this.f10125G.m12330C();
        this.f10154e0.m12651i(AbstractC2650l.a.ON_DESTROY);
        this.f10145a = 0;
        this.f10136R = false;
        this.f10148b0 = false;
        mo675A0();
        if (this.f10136R) {
            return;
        }
        throw new C2582H("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* JADX INFO: renamed from: e0 */
    void m12165e0() {
        m12103d0();
        this.f10150c0 = this.f10155f;
        this.f10155f = UUID.randomUUID().toString();
        this.f10169w = false;
        this.f10170x = false;
        this.f10172z = false;
        this.f10119A = false;
        this.f10120B = false;
        this.f10122D = 0;
        this.f10123E = null;
        this.f10125G = new C2600r();
        this.f10124F = null;
        this.f10127I = 0;
        this.f10128J = 0;
        this.f10129K = null;
        this.f10130L = false;
        this.f10131M = false;
    }

    /* JADX INFO: renamed from: e1 */
    void m12166e1() {
        this.f10125G.m12331D();
        if (this.f10138T != null && this.f10156f0.mo419P().mo12626b().m12634d(AbstractC2650l.b.CREATED)) {
            this.f10156f0.m11955a(AbstractC2650l.a.ON_DESTROY);
        }
        this.f10145a = 1;
        this.f10136R = false;
        mo676C0();
        if (this.f10136R) {
            AbstractC2665a.m12681b(this).mo12684d();
            this.f10121C = false;
        } else {
            throw new C2582H("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: f1 */
    void m12167f1() {
        this.f10145a = -1;
        this.f10136R = false;
        mo12078D0();
        this.f10146a0 = null;
        if (this.f10136R) {
            if (this.f10125G.m12340H0()) {
                return;
            }
            this.f10125G.m12330C();
            this.f10125G = new C2600r();
            return;
        }
        throw new C2582H("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* JADX INFO: renamed from: g */
    void m12168g(boolean z7) {
        ViewGroup viewGroup;
        AbstractC2599q abstractC2599q;
        j jVar = this.f10141W;
        if (jVar != null) {
            jVar.f10208t = false;
        }
        if (this.f10138T == null || (viewGroup = this.f10137S) == null || (abstractC2599q = this.f10123E) == null) {
            return;
        }
        AbstractC2579F abstractC2579FM11972r = AbstractC2579F.m11972r(viewGroup, abstractC2599q);
        abstractC2579FM11972r.m11985t();
        if (z7) {
            this.f10124F.m12270k().post(new e(abstractC2579FM11972r));
        } else {
            abstractC2579FM11972r.m11980k();
        }
        Handler handler = this.f10142X;
        if (handler != null) {
            handler.removeCallbacks(this.f10143Y);
            this.f10142X = null;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m12169g0() {
        return this.f10124F != null && this.f10169w;
    }

    /* JADX INFO: renamed from: g1 */
    LayoutInflater m12170g1(Bundle bundle) {
        LayoutInflater layoutInflaterMo12079E0 = mo12079E0(bundle);
        this.f10146a0 = layoutInflaterMo12079E0;
        return layoutInflaterMo12079E0;
    }

    /* JADX INFO: renamed from: h */
    AbstractC5540k mo12093h() {
        return new f();
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m12171h0() {
        if (this.f10130L) {
            return true;
        }
        AbstractC2599q abstractC2599q = this.f10123E;
        return abstractC2599q != null && abstractC2599q.m12344L0(this.f10126H);
    }

    /* JADX INFO: renamed from: h1 */
    void m12172h1() {
        onLowMemory();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public void mo12173i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f10127I));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f10128J));
        printWriter.print(" mTag=");
        printWriter.println(this.f10129K);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f10145a);
        printWriter.print(" mWho=");
        printWriter.print(this.f10155f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f10122D);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f10169w);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f10170x);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f10172z);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f10119A);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f10130L);
        printWriter.print(" mDetached=");
        printWriter.print(this.f10131M);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f10135Q);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f10134P);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f10132N);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f10140V);
        if (this.f10123E != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f10123E);
        }
        if (this.f10124F != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f10124F);
        }
        if (this.f10126H != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f10126H);
        }
        if (this.f10164r != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f10164r);
        }
        if (this.f10147b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f10147b);
        }
        if (this.f10149c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f10149c);
        }
        if (this.f10151d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f10151d);
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12102Z = m12102Z(false);
        if (abstractComponentCallbacksC2591iM12102Z != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC2591iM12102Z);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f10167u);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m12135L());
        if (m12207w() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m12207w());
        }
        if (m12215z() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m12215z());
        }
        if (m12137M() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m12137M());
        }
        if (m12140N() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m12140N());
        }
        if (this.f10137S != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f10137S);
        }
        if (this.f10138T != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f10138T);
        }
        if (m12196r() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m12196r());
        }
        if (m12204u() != null) {
            AbstractC2665a.m12681b(this).mo12682a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f10125G + ":");
        this.f10125G.m12361V(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: i0 */
    final boolean m12174i0() {
        return this.f10122D > 0;
    }

    /* JADX INFO: renamed from: i1 */
    void m12175i1(boolean z7) {
        m12127I0(z7);
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m12176j0() {
        if (!this.f10135Q) {
            return false;
        }
        AbstractC2599q abstractC2599q = this.f10123E;
        return abstractC2599q == null || abstractC2599q.m12346M0(this.f10126H);
    }

    /* JADX INFO: renamed from: j1 */
    boolean m12177j1(MenuItem menuItem) {
        if (this.f10130L) {
            return false;
        }
        if (this.f10134P && this.f10135Q && m12130J0(menuItem)) {
            return true;
        }
        return this.f10125G.m12341I(menuItem);
    }

    /* JADX INFO: renamed from: k */
    AbstractComponentCallbacksC2591i m12178k(String str) {
        return str.equals(this.f10155f) ? this : this.f10125G.m12381i0(str);
    }

    /* JADX INFO: renamed from: k0 */
    boolean m12179k0() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return false;
        }
        return jVar.f10208t;
    }

    /* JADX INFO: renamed from: k1 */
    void m12180k1(Menu menu) {
        if (this.f10130L) {
            return;
        }
        if (this.f10134P && this.f10135Q) {
            m12133K0(menu);
        }
        this.f10125G.m12342J(menu);
    }

    /* JADX INFO: renamed from: l */
    String m12181l() {
        return "fragment_" + this.f10155f + "_rq#" + this.f10161k0.getAndIncrement();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m12182l0() {
        return this.f10170x;
    }

    /* JADX INFO: renamed from: l1 */
    void m12183l1() {
        this.f10125G.m12343L();
        if (this.f10138T != null) {
            this.f10156f0.m11955a(AbstractC2650l.a.ON_PAUSE);
        }
        this.f10154e0.m12651i(AbstractC2650l.a.ON_PAUSE);
        this.f10145a = 6;
        this.f10136R = false;
        mo677L0();
        if (this.f10136R) {
            return;
        }
        throw new C2582H("Fragment " + this + " did not call through to super.onPause()");
    }

    /* JADX INFO: renamed from: m */
    public final AbstractActivityC2592j m12184m() {
        AbstractC2596n abstractC2596n = this.f10124F;
        if (abstractC2596n == null) {
            return null;
        }
        return (AbstractActivityC2592j) abstractC2596n.m12268i();
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m12185m0() {
        AbstractC2599q abstractC2599q = this.f10123E;
        if (abstractC2599q == null) {
            return false;
        }
        return abstractC2599q.m12352P0();
    }

    /* JADX INFO: renamed from: m1 */
    void m12186m1(boolean z7) {
        m12138M0(z7);
    }

    /* JADX INFO: renamed from: n */
    public boolean m12187n() {
        Boolean bool;
        j jVar = this.f10141W;
        if (jVar == null || (bool = jVar.f10205q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m12188n0() {
        View view;
        return (!m12169g0() || m12171h0() || (view = this.f10138T) == null || view.getWindowToken() == null || this.f10138T.getVisibility() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: n1 */
    boolean m12189n1(Menu menu) {
        boolean z7 = false;
        if (this.f10130L) {
            return false;
        }
        if (this.f10134P && this.f10135Q) {
            m12141N0(menu);
            z7 = true;
        }
        return this.f10125G.m12347N(menu) | z7;
    }

    /* JADX INFO: renamed from: o */
    public boolean m12190o() {
        Boolean bool;
        j jVar = this.f10141W;
        if (jVar == null || (bool = jVar.f10204p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: o0 */
    void m12191o0() {
        this.f10125G.m12357S0();
    }

    /* JADX INFO: renamed from: o1 */
    void m12192o1() {
        boolean zM12348N0 = this.f10123E.m12348N0(this);
        Boolean bool = this.f10168v;
        if (bool == null || bool.booleanValue() != zM12348N0) {
            this.f10168v = Boolean.valueOf(zM12348N0);
            m12143O0(zM12348N0);
            this.f10125G.m12349O();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f10136R = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m12211x1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f10136R = true;
    }

    @Override // androidx.lifecycle.InterfaceC2648j
    /* JADX INFO: renamed from: p */
    public C2635a0.c mo11961p() {
        Application application;
        if (this.f10123E == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f10158h0 == null) {
            Context applicationContext = m12214y1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && AbstractC2599q.m12289I0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + m12214y1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f10158h0 = new C2626S(application, this, m12199s());
        }
        return this.f10158h0;
    }

    /* JADX INFO: renamed from: p0 */
    public void mo12094p0(Bundle bundle) {
        this.f10136R = true;
    }

    /* JADX INFO: renamed from: p1 */
    void m12193p1() {
        this.f10125G.m12357S0();
        this.f10125G.m12366Z(true);
        this.f10145a = 7;
        this.f10136R = false;
        mo680Q0();
        if (!this.f10136R) {
            throw new C2582H("Fragment " + this + " did not call through to super.onResume()");
        }
        C2659u c2659u = this.f10154e0;
        AbstractC2650l.a aVar = AbstractC2650l.a.ON_RESUME;
        c2659u.m12651i(aVar);
        if (this.f10138T != null) {
            this.f10156f0.m11955a(aVar);
        }
        this.f10125G.m12351P();
    }

    @Override // androidx.lifecycle.InterfaceC2648j
    /* JADX INFO: renamed from: q */
    public AbstractC6428a mo11962q() {
        Application application;
        Context applicationContext = m12214y1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m12214y1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C6429b c6429b = new C6429b();
        if (application != null) {
            c6429b.m27642c(C2635a0.a.f10448h, application);
        }
        c6429b.m27642c(AbstractC2622N.f10416a, this);
        c6429b.m27642c(AbstractC2622N.f10417b, this);
        if (m12199s() != null) {
            c6429b.m27642c(AbstractC2622N.f10418c, m12199s());
        }
        return c6429b;
    }

    /* JADX INFO: renamed from: q0 */
    public void mo12194q0(int i7, int i8, Intent intent) {
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i8 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: q1 */
    void m12195q1(Bundle bundle) {
        mo12080R0(bundle);
    }

    /* JADX INFO: renamed from: r */
    View m12196r() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return null;
        }
        return jVar.f10189a;
    }

    /* JADX INFO: renamed from: r0 */
    public void m12197r0(Activity activity) {
        this.f10136R = true;
    }

    /* JADX INFO: renamed from: r1 */
    void m12198r1() {
        this.f10125G.m12357S0();
        this.f10125G.m12366Z(true);
        this.f10145a = 5;
        this.f10136R = false;
        mo12081S0();
        if (!this.f10136R) {
            throw new C2582H("Fragment " + this + " did not call through to super.onStart()");
        }
        C2659u c2659u = this.f10154e0;
        AbstractC2650l.a aVar = AbstractC2650l.a.ON_START;
        c2659u.m12651i(aVar);
        if (this.f10138T != null) {
            this.f10156f0.m11955a(aVar);
        }
        this.f10125G.m12353Q();
    }

    /* JADX INFO: renamed from: s */
    public final Bundle m12199s() {
        return this.f10164r;
    }

    /* JADX INFO: renamed from: s0 */
    public void mo12095s0(Context context) {
        this.f10136R = true;
        AbstractC2596n abstractC2596n = this.f10124F;
        Activity activityM12268i = abstractC2596n == null ? null : abstractC2596n.m12268i();
        if (activityM12268i != null) {
            this.f10136R = false;
            m12197r0(activityM12268i);
        }
    }

    /* JADX INFO: renamed from: s1 */
    void m12200s1() {
        this.f10125G.m12356S();
        if (this.f10138T != null) {
            this.f10156f0.m11955a(AbstractC2650l.a.ON_STOP);
        }
        this.f10154e0.m12651i(AbstractC2650l.a.ON_STOP);
        this.f10145a = 4;
        this.f10136R = false;
        mo5868T0();
        if (this.f10136R) {
            return;
        }
        throw new C2582H("Fragment " + this + " did not call through to super.onStop()");
    }

    public void startActivityForResult(Intent intent, int i7) {
        m12144O1(intent, i7, null);
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC2599q m12201t() {
        if (this.f10124F != null) {
            return this.f10125G;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX INFO: renamed from: t0 */
    public void m12202t0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
    }

    /* JADX INFO: renamed from: t1 */
    void m12203t1() {
        Bundle bundle = this.f10147b;
        mo1869U0(this.f10138T, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f10125G.m12358T();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f10155f);
        if (this.f10127I != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f10127I));
        }
        if (this.f10129K != null) {
            sb.append(" tag=");
            sb.append(this.f10129K);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public Context m12204u() {
        AbstractC2596n abstractC2596n = this.f10124F;
        if (abstractC2596n == null) {
            return null;
        }
        return abstractC2596n.m12269j();
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m12205u0(MenuItem menuItem) {
        return false;
    }

    @Override // androidx.lifecycle.InterfaceC2639c0
    /* JADX INFO: renamed from: v */
    public C2637b0 mo11963v() {
        if (this.f10123E == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m12101H() != AbstractC2650l.b.INITIALIZED.ordinal()) {
            return this.f10123E.m12332D0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        this.f10136R = true;
        m12109A1();
        if (this.f10125G.m12350O0(1)) {
            return;
        }
        this.f10125G.m12326A();
    }

    /* JADX INFO: renamed from: v1 */
    public final AbstractC5382c m12206v1(AbstractC5447a abstractC5447a, InterfaceC5381b interfaceC5381b) {
        return m12107u1(abstractC5447a, new h(), interfaceC5381b);
    }

    /* JADX INFO: renamed from: w */
    int m12207w() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return 0;
        }
        return jVar.f10191c;
    }

    /* JADX INFO: renamed from: w0 */
    public Animation m12208w0(int i7, boolean z7, int i8) {
        return null;
    }

    /* JADX INFO: renamed from: x */
    public Object m12209x() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return null;
        }
        return jVar.f10198j;
    }

    /* JADX INFO: renamed from: x0 */
    public Animator m12210x0(int i7, boolean z7, int i8) {
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractActivityC2592j m12211x1() {
        AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
        if (abstractActivityC2592jM12184m != null) {
            return abstractActivityC2592jM12184m;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX INFO: renamed from: y */
    AbstractC0120u m12212y() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public void m12213y0(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: renamed from: y1 */
    public final Context m12214y1() {
        Context contextM12204u = m12204u();
        if (contextM12204u != null) {
            return contextM12204u;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX INFO: renamed from: z */
    int m12215z() {
        j jVar = this.f10141W;
        if (jVar == null) {
            return 0;
        }
        return jVar.f10192d;
    }

    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7 = this.f10160j0;
        if (i7 != 0) {
            return layoutInflater.inflate(i7, viewGroup, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: z1 */
    public final View m12216z1() {
        View viewM12161b0 = m12161b0();
        if (viewM12161b0 != null) {
            return viewM12161b0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$n */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        final Bundle f10209a;

        /* JADX INFO: renamed from: androidx.fragment.app.i$n$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i7) {
                return new n[i7];
            }
        }

        n(Bundle bundle) {
            this.f10209a = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeBundle(this.f10209a);
        }

        n(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f10209a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    public AbstractComponentCallbacksC2591i(int i7) {
        this();
        this.f10160j0 = i7;
    }
}
