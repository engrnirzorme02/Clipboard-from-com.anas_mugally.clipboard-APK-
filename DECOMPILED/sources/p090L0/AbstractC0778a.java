package p090L0;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.C2391b;
import androidx.collection.C2397h;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractC2599q;
import androidx.fragment.app.AbstractC2606x;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.InterfaceC2654p;
import androidx.lifecycle.InterfaceC2657s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import p104N.AbstractC0910g;
import p111O.AbstractC1030Z;

/* JADX INFO: renamed from: L0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0778a extends RecyclerView.AbstractC2757h implements InterfaceC0780c {

    /* JADX INFO: renamed from: d */
    final AbstractC2650l f3162d;

    /* JADX INFO: renamed from: e */
    final AbstractC2599q f3163e;

    /* JADX INFO: renamed from: f */
    final C2397h f3164f;

    /* JADX INFO: renamed from: g */
    private final C2397h f3165g;

    /* JADX INFO: renamed from: h */
    private final C2397h f3166h;

    /* JADX INFO: renamed from: i */
    private g f3167i;

    /* JADX INFO: renamed from: j */
    boolean f3168j;

    /* JADX INFO: renamed from: k */
    private boolean f3169k;

    /* JADX INFO: renamed from: L0.a$a */
    class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ FrameLayout f3170a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C0779b f3171b;

        a(FrameLayout frameLayout, C0779b c0779b) {
            this.f3170a = frameLayout;
            this.f3171b = c0779b;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            if (this.f3170a.getParent() != null) {
                this.f3170a.removeOnLayoutChangeListener(this);
                AbstractC0778a.this.m3676Q(this.f3171b);
            }
        }
    }

    /* JADX INFO: renamed from: L0.a$b */
    class b implements InterfaceC2654p {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0779b f3173a;

        b(C0779b c0779b) {
            this.f3173a = c0779b;
        }

        @Override // androidx.lifecycle.InterfaceC2654p
        /* JADX INFO: renamed from: n */
        public void mo173n(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar) {
            if (AbstractC0778a.this.m3677U()) {
                return;
            }
            interfaceC2657s.mo419P().mo12628d(this);
            if (AbstractC1030Z.m4443O(this.f3173a.m3699R())) {
                AbstractC0778a.this.m3676Q(this.f3173a);
            }
        }
    }

    /* JADX INFO: renamed from: L0.a$c */
    class c extends AbstractC2599q.k {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractComponentCallbacksC2591i f3175a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FrameLayout f3176b;

        c(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, FrameLayout frameLayout) {
            this.f3175a = abstractComponentCallbacksC2591i;
            this.f3176b = frameLayout;
        }

        @Override // androidx.fragment.app.AbstractC2599q.k
        /* JADX INFO: renamed from: m */
        public void mo3688m(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, View view, Bundle bundle) {
            if (abstractComponentCallbacksC2591i == this.f3175a) {
                abstractC2599q.m12398s1(this);
                AbstractC0778a.this.m3667B(view, this.f3176b);
            }
        }
    }

    /* JADX INFO: renamed from: L0.a$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0778a abstractC0778a = AbstractC0778a.this;
            abstractC0778a.f3168j = false;
            abstractC0778a.m3670G();
        }
    }

    /* JADX INFO: renamed from: L0.a$e */
    class e implements InterfaceC2654p {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Handler f3179a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f3180b;

        e(Handler handler, Runnable runnable) {
            this.f3179a = handler;
            this.f3180b = runnable;
        }

        @Override // androidx.lifecycle.InterfaceC2654p
        /* JADX INFO: renamed from: n */
        public void mo173n(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar) {
            if (aVar == AbstractC2650l.a.ON_DESTROY) {
                this.f3179a.removeCallbacks(this.f3180b);
                interfaceC2657s.mo419P().mo12628d(this);
            }
        }
    }

    /* JADX INFO: renamed from: L0.a$f */
    private static abstract class f extends RecyclerView.AbstractC2759j {
        private f() {
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

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: L0.a$g */
    class g {

        /* JADX INFO: renamed from: a */
        private ViewPager2.AbstractC2879i f3182a;

        /* JADX INFO: renamed from: b */
        private RecyclerView.AbstractC2759j f3183b;

        /* JADX INFO: renamed from: c */
        private InterfaceC2654p f3184c;

        /* JADX INFO: renamed from: d */
        private ViewPager2 f3185d;

        /* JADX INFO: renamed from: e */
        private long f3186e = -1;

        /* JADX INFO: renamed from: L0.a$g$a */
        class a extends ViewPager2.AbstractC2879i {
            a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
            /* JADX INFO: renamed from: a */
            public void mo3696a(int i7) {
                g.this.m3695d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
            /* JADX INFO: renamed from: c */
            public void mo3697c(int i7) {
                g.this.m3695d(false);
            }
        }

        /* JADX INFO: renamed from: L0.a$g$b */
        class b extends f {
            b() {
                super(null);
            }

            @Override // p090L0.AbstractC0778a.f, androidx.recyclerview.widget.RecyclerView.AbstractC2759j
            /* JADX INFO: renamed from: a */
            public void mo3689a() {
                g.this.m3695d(true);
            }
        }

        /* JADX INFO: renamed from: L0.a$g$c */
        class c implements InterfaceC2654p {
            c() {
            }

            @Override // androidx.lifecycle.InterfaceC2654p
            /* JADX INFO: renamed from: n */
            public void mo173n(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar) {
                g.this.m3695d(false);
            }
        }

        g() {
        }

        /* JADX INFO: renamed from: a */
        private ViewPager2 m3692a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* JADX INFO: renamed from: b */
        void m3693b(RecyclerView recyclerView) {
            this.f3185d = m3692a(recyclerView);
            a aVar = new a();
            this.f3182a = aVar;
            this.f3185d.m14395g(aVar);
            b bVar = new b();
            this.f3183b = bVar;
            AbstractC0778a.this.m13328y(bVar);
            c cVar = new c();
            this.f3184c = cVar;
            AbstractC0778a.this.f3162d.mo12625a(cVar);
        }

        /* JADX INFO: renamed from: c */
        void m3694c(RecyclerView recyclerView) {
            m3692a(recyclerView).m14399n(this.f3182a);
            AbstractC0778a.this.m13315A(this.f3183b);
            AbstractC0778a.this.f3162d.mo12628d(this.f3184c);
            this.f3185d = null;
        }

        /* JADX INFO: renamed from: d */
        void m3695d(boolean z7) {
            int currentItem;
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i;
            if (AbstractC0778a.this.m3677U() || this.f3185d.getScrollState() != 0 || AbstractC0778a.this.f3164f.m10286f() || AbstractC0778a.this.mo8548g() == 0 || (currentItem = this.f3185d.getCurrentItem()) >= AbstractC0778a.this.mo8548g()) {
                return;
            }
            long jMo3680h = AbstractC0778a.this.mo3680h(currentItem);
            if ((jMo3680h != this.f3186e || z7) && (abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) AbstractC0778a.this.f3164f.m10284d(jMo3680h)) != null && abstractComponentCallbacksC2591i.m12169g0()) {
                this.f3186e = jMo3680h;
                AbstractC2606x abstractC2606xM12391n = AbstractC0778a.this.f3163e.m12391n();
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = null;
                for (int i7 = 0; i7 < AbstractC0778a.this.f3164f.m10291k(); i7++) {
                    long jM10287g = AbstractC0778a.this.f3164f.m10287g(i7);
                    AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i3 = (AbstractComponentCallbacksC2591i) AbstractC0778a.this.f3164f.m10292l(i7);
                    if (abstractComponentCallbacksC2591i3.m12169g0()) {
                        if (jM10287g != this.f3186e) {
                            abstractC2606xM12391n.mo12024r(abstractComponentCallbacksC2591i3, AbstractC2650l.b.STARTED);
                        } else {
                            abstractComponentCallbacksC2591i2 = abstractComponentCallbacksC2591i3;
                        }
                        abstractComponentCallbacksC2591i3.m12125H1(jM10287g == this.f3186e);
                    }
                }
                if (abstractComponentCallbacksC2591i2 != null) {
                    abstractC2606xM12391n.mo12024r(abstractComponentCallbacksC2591i2, AbstractC2650l.b.RESUMED);
                }
                if (abstractC2606xM12391n.mo12022n()) {
                    return;
                }
                abstractC2606xM12391n.mo12018i();
            }
        }
    }

    public AbstractC0778a(AbstractActivityC2592j abstractActivityC2592j) {
        this(abstractActivityC2592j.m12232H0(), abstractActivityC2592j.mo419P());
    }

    /* JADX INFO: renamed from: E */
    private static String m3658E(String str, long j7) {
        return str + j7;
    }

    /* JADX INFO: renamed from: F */
    private void m3659F(int i7) {
        long jMo3680h = mo3680h(i7);
        if (this.f3164f.m10283c(jMo3680h)) {
            return;
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iMo3669D = mo3669D(i7);
        abstractComponentCallbacksC2591iMo3669D.m12123G1((AbstractComponentCallbacksC2591i.n) this.f3165g.m10284d(jMo3680h));
        this.f3164f.m10288h(jMo3680h, abstractComponentCallbacksC2591iMo3669D);
    }

    /* JADX INFO: renamed from: H */
    private boolean m3660H(long j7) {
        View viewM12161b0;
        if (this.f3166h.m10283c(j7)) {
            return true;
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) this.f3164f.m10284d(j7);
        return (abstractComponentCallbacksC2591i == null || (viewM12161b0 = abstractComponentCallbacksC2591i.m12161b0()) == null || viewM12161b0.getParent() == null) ? false : true;
    }

    /* JADX INFO: renamed from: I */
    private static boolean m3661I(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* JADX INFO: renamed from: J */
    private Long m3662J(int i7) {
        Long lValueOf = null;
        for (int i8 = 0; i8 < this.f3166h.m10291k(); i8++) {
            if (((Integer) this.f3166h.m10292l(i8)).intValue() == i7) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f3166h.m10287g(i8));
            }
        }
        return lValueOf;
    }

    /* JADX INFO: renamed from: P */
    private static long m3663P(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* JADX INFO: renamed from: R */
    private void m3664R(long j7) {
        ViewParent parent;
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) this.f3164f.m10284d(j7);
        if (abstractComponentCallbacksC2591i == null) {
            return;
        }
        if (abstractComponentCallbacksC2591i.m12161b0() != null && (parent = abstractComponentCallbacksC2591i.m12161b0().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!m3668C(j7)) {
            this.f3165g.m10289i(j7);
        }
        if (!abstractComponentCallbacksC2591i.m12169g0()) {
            this.f3164f.m10289i(j7);
            return;
        }
        if (m3677U()) {
            this.f3169k = true;
            return;
        }
        if (abstractComponentCallbacksC2591i.m12169g0() && m3668C(j7)) {
            this.f3165g.m10288h(j7, this.f3163e.m12384j1(abstractComponentCallbacksC2591i));
        }
        this.f3163e.m12391n().mo12023o(abstractComponentCallbacksC2591i).mo12018i();
        this.f3164f.m10289i(j7);
    }

    /* JADX INFO: renamed from: S */
    private void m3665S() {
        Handler handler = new Handler(Looper.getMainLooper());
        d dVar = new d();
        this.f3162d.mo12625a(new e(handler, dVar));
        handler.postDelayed(dVar, 10000L);
    }

    /* JADX INFO: renamed from: T */
    private void m3666T(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, FrameLayout frameLayout) {
        this.f3163e.m12370b1(new c(abstractComponentCallbacksC2591i, frameLayout), false);
    }

    /* JADX INFO: renamed from: B */
    void m3667B(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: renamed from: C */
    public boolean m3668C(long j7) {
        return j7 >= 0 && j7 < ((long) mo8548g());
    }

    /* JADX INFO: renamed from: D */
    public abstract AbstractComponentCallbacksC2591i mo3669D(int i7);

    /* JADX INFO: renamed from: G */
    void m3670G() {
        if (!this.f3169k || m3677U()) {
            return;
        }
        C2391b c2391b = new C2391b();
        for (int i7 = 0; i7 < this.f3164f.m10291k(); i7++) {
            long jM10287g = this.f3164f.m10287g(i7);
            if (!m3668C(jM10287g)) {
                c2391b.add(Long.valueOf(jM10287g));
                this.f3166h.m10289i(jM10287g);
            }
        }
        if (!this.f3168j) {
            this.f3169k = false;
            for (int i8 = 0; i8 < this.f3164f.m10291k(); i8++) {
                long jM10287g2 = this.f3164f.m10287g(i8);
                if (!m3660H(jM10287g2)) {
                    c2391b.add(Long.valueOf(jM10287g2));
                }
            }
        }
        Iterator it = c2391b.iterator();
        while (it.hasNext()) {
            m3664R(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void mo3682q(C0779b c0779b, int i7) {
        long jM13279o = c0779b.m13279o();
        int id = c0779b.m3699R().getId();
        Long lM3662J = m3662J(id);
        if (lM3662J != null && lM3662J.longValue() != jM13279o) {
            m3664R(lM3662J.longValue());
            this.f3166h.m10289i(lM3662J.longValue());
        }
        this.f3166h.m10288h(jM13279o, Integer.valueOf(id));
        m3659F(i7);
        FrameLayout frameLayoutM3699R = c0779b.m3699R();
        if (AbstractC1030Z.m4443O(frameLayoutM3699R)) {
            if (frameLayoutM3699R.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayoutM3699R.addOnLayoutChangeListener(new a(frameLayoutM3699R, c0779b));
        }
        m3670G();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final C0779b mo3683s(ViewGroup viewGroup, int i7) {
        return C0779b.m3698Q(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final boolean mo3685u(C0779b c0779b) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void mo3686v(C0779b c0779b) {
        m3676Q(c0779b);
        m3670G();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void mo3687x(C0779b c0779b) {
        Long lM3662J = m3662J(c0779b.m3699R().getId());
        if (lM3662J != null) {
            m3664R(lM3662J.longValue());
            this.f3166h.m10289i(lM3662J.longValue());
        }
    }

    /* JADX INFO: renamed from: Q */
    void m3676Q(C0779b c0779b) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) this.f3164f.m10284d(c0779b.m13279o());
        if (abstractComponentCallbacksC2591i == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutM3699R = c0779b.m3699R();
        View viewM12161b0 = abstractComponentCallbacksC2591i.m12161b0();
        if (!abstractComponentCallbacksC2591i.m12169g0() && viewM12161b0 != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (abstractComponentCallbacksC2591i.m12169g0() && viewM12161b0 == null) {
            m3666T(abstractComponentCallbacksC2591i, frameLayoutM3699R);
            return;
        }
        if (abstractComponentCallbacksC2591i.m12169g0() && viewM12161b0.getParent() != null) {
            if (viewM12161b0.getParent() != frameLayoutM3699R) {
                m3667B(viewM12161b0, frameLayoutM3699R);
                return;
            }
            return;
        }
        if (abstractComponentCallbacksC2591i.m12169g0()) {
            m3667B(viewM12161b0, frameLayoutM3699R);
            return;
        }
        if (m3677U()) {
            if (this.f3163e.m12340H0()) {
                return;
            }
            this.f3162d.mo12625a(new b(c0779b));
            return;
        }
        m3666T(abstractComponentCallbacksC2591i, frameLayoutM3699R);
        this.f3163e.m12391n().m12507d(abstractComponentCallbacksC2591i, "f" + c0779b.m13279o()).mo12024r(abstractComponentCallbacksC2591i, AbstractC2650l.b.STARTED).mo12018i();
        this.f3167i.m3695d(false);
    }

    /* JADX INFO: renamed from: U */
    boolean m3677U() {
        return this.f3163e.m12352P0();
    }

    @Override // p090L0.InterfaceC0780c
    /* JADX INFO: renamed from: a */
    public final Parcelable mo3678a() {
        Bundle bundle = new Bundle(this.f3164f.m10291k() + this.f3165g.m10291k());
        for (int i7 = 0; i7 < this.f3164f.m10291k(); i7++) {
            long jM10287g = this.f3164f.m10287g(i7);
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) this.f3164f.m10284d(jM10287g);
            if (abstractComponentCallbacksC2591i != null && abstractComponentCallbacksC2591i.m12169g0()) {
                this.f3163e.m12369a1(bundle, m3658E("f#", jM10287g), abstractComponentCallbacksC2591i);
            }
        }
        for (int i8 = 0; i8 < this.f3165g.m10291k(); i8++) {
            long jM10287g2 = this.f3165g.m10287g(i8);
            if (m3668C(jM10287g2)) {
                bundle.putParcelable(m3658E("s#", jM10287g2), (Parcelable) this.f3165g.m10284d(jM10287g2));
            }
        }
        return bundle;
    }

    @Override // p090L0.InterfaceC0780c
    /* JADX INFO: renamed from: b */
    public final void mo3679b(Parcelable parcelable) {
        if (!this.f3165g.m10286f() || !this.f3164f.m10286f()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m3661I(str, "f#")) {
                this.f3164f.m10288h(m3663P(str, "f#"), this.f3163e.m12397r0(bundle, str));
            } else {
                if (!m3661I(str, "s#")) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jM3663P = m3663P(str, "s#");
                AbstractComponentCallbacksC2591i.n nVar = (AbstractComponentCallbacksC2591i.n) bundle.getParcelable(str);
                if (m3668C(jM3663P)) {
                    this.f3165g.m10288h(jM3663P, nVar);
                }
            }
        }
        if (this.f3164f.m10286f()) {
            return;
        }
        this.f3169k = true;
        this.f3168j = true;
        m3670G();
        m3665S();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: h */
    public long mo3680h(int i7) {
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: p */
    public void mo3681p(RecyclerView recyclerView) {
        AbstractC0910g.m4133a(this.f3167i == null);
        g gVar = new g();
        this.f3167i = gVar;
        gVar.m3693b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: t */
    public void mo3684t(RecyclerView recyclerView) {
        this.f3167i.m3694c(recyclerView);
        this.f3167i = null;
    }

    public AbstractC0778a(AbstractC2599q abstractC2599q, AbstractC2650l abstractC2650l) {
        this.f3164f = new C2397h();
        this.f3165g = new C2397h();
        this.f3166h = new C2397h();
        this.f3168j = false;
        this.f3169k = false;
        this.f3163e = abstractC2599q;
        this.f3162d = abstractC2650l;
        super.m13329z(true);
    }
}
