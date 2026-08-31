package p223d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.content.InterfaceC2437c;
import androidx.core.content.InterfaceC2438d;
import androidx.lifecycle.AbstractC2622N;
import androidx.lifecycle.AbstractC2641d0;
import androidx.lifecycle.AbstractC2643e0;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.C2626S;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.C2637b0;
import androidx.lifecycle.C2659u;
import androidx.lifecycle.FragmentC2617I;
import androidx.lifecycle.InterfaceC2639c0;
import androidx.lifecycle.InterfaceC2648j;
import androidx.lifecycle.InterfaceC2654p;
import androidx.lifecycle.InterfaceC2657s;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p010B0.AbstractC0054m;
import p010B0.C0047f;
import p010B0.C0049h;
import p010B0.InterfaceC0050i;
import p017C.AbstractActivityC0106g;
import p017C.AbstractC0101b;
import p017C.AbstractC0102c;
import p017C.C0108i;
import p017C.C0118s;
import p017C.InterfaceC0115p;
import p017C.InterfaceC0116q;
import p066I0.AbstractC0578a;
import p104N.InterfaceC0904a;
import p111O.C1082x;
import p111O.InterfaceC1080w;
import p111O.InterfaceC1086z;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p231e.C5248a;
import p231e.InterfaceC5249b;
import p238e6.InterfaceC5356a;
import p239f.AbstractC5382c;
import p239f.AbstractC5385f;
import p239f.C5387h;
import p239f.InterfaceC5381b;
import p239f.InterfaceC5386g;
import p247g.AbstractC5447a;
import p304n0.AbstractC6428a;
import p304n0.C6429b;

/* JADX INFO: renamed from: d.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC5187q extends AbstractActivityC0106g implements InterfaceC2657s, InterfaceC2639c0, InterfaceC2648j, InterfaceC0050i, InterfaceC5167J, InterfaceC5386g, InterfaceC2437c, InterfaceC2438d, InterfaceC0115p, InterfaceC0116q, InterfaceC1080w, InterfaceC5196z {

    /* JADX INFO: renamed from: G */
    private static final c f19793G = new c(null);

    /* JADX INFO: renamed from: A */
    private final CopyOnWriteArrayList f19794A;

    /* JADX INFO: renamed from: B */
    private final CopyOnWriteArrayList f19795B;

    /* JADX INFO: renamed from: C */
    private boolean f19796C;

    /* JADX INFO: renamed from: D */
    private boolean f19797D;

    /* JADX INFO: renamed from: E */
    private final InterfaceC1429g f19798E;

    /* JADX INFO: renamed from: F */
    private final InterfaceC1429g f19799F;

    /* JADX INFO: renamed from: c */
    private final C5248a f19800c = new C5248a();

    /* JADX INFO: renamed from: d */
    private final C1082x f19801d = new C1082x(new Runnable() { // from class: d.e
        @Override // java.lang.Runnable
        public final void run() {
            AbstractActivityC5187q.m23984v0(this.f19779a);
        }
    });

    /* JADX INFO: renamed from: e */
    private final C0049h f19802e;

    /* JADX INFO: renamed from: f */
    private C2637b0 f19803f;

    /* JADX INFO: renamed from: r */
    private final e f19804r;

    /* JADX INFO: renamed from: s */
    private final InterfaceC1429g f19805s;

    /* JADX INFO: renamed from: t */
    private int f19806t;

    /* JADX INFO: renamed from: u */
    private final AtomicInteger f19807u;

    /* JADX INFO: renamed from: v */
    private final AbstractC5385f f19808v;

    /* JADX INFO: renamed from: w */
    private final CopyOnWriteArrayList f19809w;

    /* JADX INFO: renamed from: x */
    private final CopyOnWriteArrayList f19810x;

    /* JADX INFO: renamed from: y */
    private final CopyOnWriteArrayList f19811y;

    /* JADX INFO: renamed from: z */
    private final CopyOnWriteArrayList f19812z;

    /* JADX INFO: renamed from: d.q$a */
    public static final class a implements InterfaceC2654p {
        a() {
        }

        @Override // androidx.lifecycle.InterfaceC2654p
        /* JADX INFO: renamed from: n */
        public void mo173n(InterfaceC2657s source, AbstractC2650l.a event) {
            AbstractC6118n.m27187e(source, "source");
            AbstractC6118n.m27187e(event, "event");
            AbstractActivityC5187q.this.m23981p0();
            AbstractActivityC5187q.this.mo419P().mo12628d(this);
        }
    }

    /* JADX INFO: renamed from: d.q$b */
    private static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f19814a = new b();

        private b() {
        }

        /* JADX INFO: renamed from: a */
        public final OnBackInvokedDispatcher m23996a(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            AbstractC6118n.m27186d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            return onBackInvokedDispatcher;
        }
    }

    /* JADX INFO: renamed from: d.q$c */
    private static final class c {
        public /* synthetic */ c(AbstractC6112h abstractC6112h) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: d.q$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private Object f19815a;

        /* JADX INFO: renamed from: b */
        private C2637b0 f19816b;

        /* JADX INFO: renamed from: a */
        public final C2637b0 m23997a() {
            return this.f19816b;
        }

        /* JADX INFO: renamed from: b */
        public final void m23998b(Object obj) {
            this.f19815a = obj;
        }

        /* JADX INFO: renamed from: c */
        public final void m23999c(C2637b0 c2637b0) {
            this.f19816b = c2637b0;
        }
    }

    /* JADX INFO: renamed from: d.q$e */
    private interface e extends Executor {
        /* JADX INFO: renamed from: d */
        void mo24000d();

        /* JADX INFO: renamed from: l0 */
        void mo24001l0(View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d.q$f */
    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a */
        private final long f19817a = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: b */
        private Runnable f19818b;

        /* JADX INFO: renamed from: c */
        private boolean f19819c;

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m24003b(f fVar) {
            Runnable runnable = fVar.f19818b;
            if (runnable != null) {
                AbstractC6118n.m27184b(runnable);
                runnable.run();
                fVar.f19818b = null;
            }
        }

        @Override // p223d.AbstractActivityC5187q.e
        /* JADX INFO: renamed from: d */
        public void mo24000d() {
            AbstractActivityC5187q.this.getWindow().getDecorView().removeCallbacks(this);
            AbstractActivityC5187q.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC6118n.m27187e(runnable, "runnable");
            this.f19818b = runnable;
            View decorView = AbstractActivityC5187q.this.getWindow().getDecorView();
            AbstractC6118n.m27186d(decorView, "getDecorView(...)");
            if (!this.f19819c) {
                decorView.postOnAnimation(new Runnable() { // from class: d.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC5187q.f.m24003b(this.f19822a);
                    }
                });
            } else if (AbstractC6118n.m27183a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // p223d.AbstractActivityC5187q.e
        /* JADX INFO: renamed from: l0 */
        public void mo24001l0(View view) {
            AbstractC6118n.m27187e(view, "view");
            if (this.f19819c) {
                return;
            }
            this.f19819c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f19818b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f19817a) {
                    this.f19819c = false;
                    AbstractActivityC5187q.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f19818b = null;
            if (AbstractActivityC5187q.this.m23992s0().m24017c()) {
                this.f19819c = false;
                AbstractActivityC5187q.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractActivityC5187q.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: renamed from: d.q$g */
    public static final class g extends AbstractC5385f {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: u */
        public static final void m24006u(g gVar, int i7, AbstractC5447a.a aVar) {
            gVar.m24406g(i7, aVar.m24654a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public static final void m24007v(g gVar, int i7, IntentSender.SendIntentException sendIntentException) {
            gVar.m24405f(i7, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // p239f.AbstractC5385f
        /* JADX INFO: renamed from: k */
        public void mo24008k(final int i7, AbstractC5447a contract, Object obj, AbstractC0102c abstractC0102c) {
            Bundle bundleExtra;
            final int i8;
            AbstractC6118n.m27187e(contract, "contract");
            AbstractActivityC5187q abstractActivityC5187q = AbstractActivityC5187q.this;
            final AbstractC5447a.a aVarMo24653b = contract.mo24653b(abstractActivityC5187q, obj);
            if (aVarMo24653b != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC5187q.g.m24006u(this.f19823a, i7, aVarMo24653b);
                    }
                });
                return;
            }
            Intent intentMo12416a = contract.mo12416a(abstractActivityC5187q, obj);
            if (intentMo12416a.getExtras() != null) {
                Bundle extras = intentMo12416a.getExtras();
                AbstractC6118n.m27184b(extras);
                if (extras.getClassLoader() == null) {
                    intentMo12416a.setExtrasClassLoader(abstractActivityC5187q.getClassLoader());
                }
            }
            if (intentMo12416a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentMo12416a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentMo12416a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if (AbstractC6118n.m27183a("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentMo12416a.getAction())) {
                String[] stringArrayExtra = intentMo12416a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC0101b.m388d(abstractActivityC5187q, stringArrayExtra, i7);
                return;
            }
            if (!AbstractC6118n.m27183a("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentMo12416a.getAction())) {
                AbstractC0101b.m390f(abstractActivityC5187q, intentMo12416a, i7, bundle);
                return;
            }
            C5387h c5387h = (C5387h) intentMo12416a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC6118n.m27184b(c5387h);
                i8 = i7;
                try {
                    AbstractC0101b.m391g(abstractActivityC5187q, c5387h.m24419d(), i8, c5387h.m24416a(), c5387h.m24417b(), c5387h.m24418c(), 0, bundle);
                    C1444v c1444v = C1444v.f4971a;
                } catch (IntentSender.SendIntentException e7) {
                    e = e7;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractActivityC5187q.g.m24007v(this.f19826a, i8, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e8) {
                e = e8;
                i8 = i7;
            }
        }
    }

    public AbstractActivityC5187q() {
        C0049h c0049hM197b = C0049h.f384c.m197b(this);
        this.f19802e = c0049hM197b;
        this.f19804r = m23979n0();
        this.f19805s = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: d.h
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AbstractActivityC5187q.m23982q0(this.f19783a);
            }
        });
        this.f19807u = new AtomicInteger();
        this.f19808v = new g();
        this.f19809w = new CopyOnWriteArrayList();
        this.f19810x = new CopyOnWriteArrayList();
        this.f19811y = new CopyOnWriteArrayList();
        this.f19812z = new CopyOnWriteArrayList();
        this.f19794A = new CopyOnWriteArrayList();
        this.f19795B = new CopyOnWriteArrayList();
        if (mo419P() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        mo419P().mo12625a(new InterfaceC2654p() { // from class: d.i
            @Override // androidx.lifecycle.InterfaceC2654p
            /* JADX INFO: renamed from: n */
            public final void mo173n(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar) {
                AbstractActivityC5187q.m23972e0(this.f19784a, interfaceC2657s, aVar);
            }
        });
        mo419P().mo12625a(new InterfaceC2654p() { // from class: d.j
            @Override // androidx.lifecycle.InterfaceC2654p
            /* JADX INFO: renamed from: n */
            public final void mo173n(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar) {
                AbstractActivityC5187q.m23973f0(this.f19785a, interfaceC2657s, aVar);
            }
        });
        mo419P().mo12625a(new a());
        c0049hM197b.m192c();
        AbstractC2622N.m12559c(this);
        mo198A().m187c("android:support:activity-result", new C0047f.b() { // from class: d.k
            @Override // p010B0.C0047f.b
            /* JADX INFO: renamed from: a */
            public final Bundle mo174a() {
                return AbstractActivityC5187q.m23974g0(this.f19786a);
            }
        });
        m23990l0(new InterfaceC5249b() { // from class: d.l
            @Override // p231e.InterfaceC5249b
            /* JADX INFO: renamed from: a */
            public final void mo9134a(Context context) {
                AbstractActivityC5187q.m23975h0(this.f19787a, context);
            }
        });
        this.f19798E = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: d.m
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AbstractActivityC5187q.m23980o0(this.f19788a);
            }
        });
        this.f19799F = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: d.n
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AbstractActivityC5187q.m23985w0(this.f19789a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m23972e0(AbstractActivityC5187q abstractActivityC5187q, InterfaceC2657s interfaceC2657s, AbstractC2650l.a event) {
        Window window;
        View viewPeekDecorView;
        AbstractC6118n.m27187e(interfaceC2657s, "<unused var>");
        AbstractC6118n.m27187e(event, "event");
        if (event != AbstractC2650l.a.ON_STOP || (window = abstractActivityC5187q.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m23973f0(AbstractActivityC5187q abstractActivityC5187q, InterfaceC2657s interfaceC2657s, AbstractC2650l.a event) {
        AbstractC6118n.m27187e(interfaceC2657s, "<unused var>");
        AbstractC6118n.m27187e(event, "event");
        if (event == AbstractC2650l.a.ON_DESTROY) {
            abstractActivityC5187q.f19800c.m24245b();
            if (!abstractActivityC5187q.isChangingConfigurations()) {
                abstractActivityC5187q.mo11963v().m12604a();
            }
            abstractActivityC5187q.f19804r.mo24000d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final Bundle m23974g0(AbstractActivityC5187q abstractActivityC5187q) {
        Bundle bundle = new Bundle();
        abstractActivityC5187q.f19808v.m24408m(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m23975h0(AbstractActivityC5187q abstractActivityC5187q, Context it) {
        AbstractC6118n.m27187e(it, "it");
        Bundle bundleM185a = abstractActivityC5187q.mo198A().m185a("android:support:activity-result");
        if (bundleM185a != null) {
            abstractActivityC5187q.f19808v.m24407l(bundleM185a);
        }
    }

    /* JADX INFO: renamed from: j0 */
    private final void m23977j0(final C5165H c5165h) {
        mo419P().mo12625a(new InterfaceC2654p() { // from class: d.g
            @Override // androidx.lifecycle.InterfaceC2654p
            /* JADX INFO: renamed from: n */
            public final void mo173n(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar) {
                AbstractActivityC5187q.m23978k0(c5165h, this, interfaceC2657s, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m23978k0(C5165H c5165h, AbstractActivityC5187q abstractActivityC5187q, InterfaceC2657s interfaceC2657s, AbstractC2650l.a event) {
        AbstractC6118n.m27187e(interfaceC2657s, "<unused var>");
        AbstractC6118n.m27187e(event, "event");
        if (event == AbstractC2650l.a.ON_CREATE) {
            c5165h.m23940v(b.f19814a.m23996a(abstractActivityC5187q));
        }
    }

    /* JADX INFO: renamed from: n0 */
    private final e m23979n0() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C2626S m23980o0(AbstractActivityC5187q abstractActivityC5187q) {
        return new C2626S(abstractActivityC5187q.getApplication(), abstractActivityC5187q, abstractActivityC5187q.getIntent() != null ? abstractActivityC5187q.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public final void m23981p0() {
        if (this.f19803f == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.f19803f = dVar.m23997a();
            }
            if (this.f19803f == null) {
                this.f19803f = new C2637b0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C5195y m23982q0(final AbstractActivityC5187q abstractActivityC5187q) {
        return new C5195y(abstractActivityC5187q.f19804r, new InterfaceC5356a() { // from class: d.f
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AbstractActivityC5187q.m23983r0(this.f19780a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C1444v m23983r0(AbstractActivityC5187q abstractActivityC5187q) {
        abstractActivityC5187q.reportFullyDrawn();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m23984v0(AbstractActivityC5187q abstractActivityC5187q) {
        abstractActivityC5187q.m23994u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C5165H m23985w0(final AbstractActivityC5187q abstractActivityC5187q) {
        final C5165H c5165h = new C5165H(new Runnable() { // from class: d.o
            @Override // java.lang.Runnable
            public final void run() {
                AbstractActivityC5187q.m23986x0(this.f19790a);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!AbstractC6118n.m27183a(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC5187q.m23987y0(this.f19791a, c5165h);
                    }
                });
                return c5165h;
            }
            abstractActivityC5187q.m23977j0(c5165h);
        }
        return c5165h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m23986x0(AbstractActivityC5187q abstractActivityC5187q) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e7) {
            if (!AbstractC6118n.m27183a(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e7;
            }
        } catch (NullPointerException e8) {
            if (!AbstractC6118n.m27183a(e8.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m23987y0(AbstractActivityC5187q abstractActivityC5187q, C5165H c5165h) {
        abstractActivityC5187q.m23977j0(c5165h);
    }

    @Override // p010B0.InterfaceC0050i
    /* JADX INFO: renamed from: A */
    public final C0047f mo198A() {
        return this.f19802e.m191b();
    }

    /* JADX INFO: renamed from: A0 */
    public final AbstractC5382c m23988A0(AbstractC5447a contract, InterfaceC5381b callback) {
        AbstractC6118n.m27187e(contract, "contract");
        AbstractC6118n.m27187e(callback, "callback");
        return m23989B0(contract, this.f19808v, callback);
    }

    /* JADX INFO: renamed from: B0 */
    public final AbstractC5382c m23989B0(AbstractC5447a contract, AbstractC5385f registry, InterfaceC5381b callback) {
        AbstractC6118n.m27187e(contract, "contract");
        AbstractC6118n.m27187e(registry, "registry");
        AbstractC6118n.m27187e(callback, "callback");
        return registry.m24409n("activity_rq#" + this.f19807u.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.content.InterfaceC2438d
    /* JADX INFO: renamed from: H */
    public final void mo10597H(InterfaceC0904a listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f19810x.remove(listener);
    }

    @Override // p017C.InterfaceC0115p
    /* JADX INFO: renamed from: J */
    public final void mo559J(InterfaceC0904a listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f19812z.remove(listener);
    }

    @Override // androidx.core.content.InterfaceC2438d
    /* JADX INFO: renamed from: K */
    public final void mo10598K(InterfaceC0904a listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f19810x.add(listener);
    }

    @Override // p017C.AbstractActivityC0106g, androidx.lifecycle.InterfaceC2657s
    /* JADX INFO: renamed from: P */
    public AbstractC2650l mo419P() {
        return super.mo419P();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m23993t0();
        e eVar = this.f19804r;
        View decorView = getWindow().getDecorView();
        AbstractC6118n.m27186d(decorView, "getDecorView(...)");
        eVar.mo24001l0(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // p223d.InterfaceC5167J
    /* JADX INFO: renamed from: b */
    public final C5165H mo12238b() {
        return (C5165H) this.f19799F.getValue();
    }

    @Override // p111O.InterfaceC1080w
    /* JADX INFO: renamed from: e */
    public void mo4782e(InterfaceC1086z provider) {
        AbstractC6118n.m27187e(provider, "provider");
        this.f19801d.m4790f(provider);
    }

    @Override // androidx.core.content.InterfaceC2437c
    /* JADX INFO: renamed from: g */
    public final void mo10595g(InterfaceC0904a listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f19809w.add(listener);
    }

    @Override // p017C.InterfaceC0116q
    /* JADX INFO: renamed from: h */
    public final void mo561h(InterfaceC0904a listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f19794A.remove(listener);
    }

    @Override // p017C.InterfaceC0116q
    /* JADX INFO: renamed from: l */
    public final void mo562l(InterfaceC0904a listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f19794A.add(listener);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m23990l0(InterfaceC5249b listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f19800c.m24244a(listener);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m23991m0(InterfaceC0904a listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f19811y.add(listener);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f19808v.m24405f(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        mo12238b().m23939s();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC6118n.m27187e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f19809w.iterator();
        AbstractC6118n.m27186d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC0904a) it.next()).accept(newConfig);
        }
    }

    @Override // p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f19802e.m193d(bundle);
        this.f19800c.m24246c(this);
        super.onCreate(bundle);
        FragmentC2617I.f10407b.m12549c(this);
        int i7 = this.f19806t;
        if (i7 != 0) {
            setContentView(i7);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        AbstractC6118n.m27187e(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        this.f19801d.m4786b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem item) {
        AbstractC6118n.m27187e(item, "item");
        if (super.onMenuItemSelected(i7, item)) {
            return true;
        }
        if (i7 == 0) {
            return this.f19801d.m4788d(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z7) {
        if (this.f19796C) {
            return;
        }
        Iterator it = this.f19812z.iterator();
        AbstractC6118n.m27186d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC0904a) it.next()).accept(new C0108i(z7));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        AbstractC6118n.m27187e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f19811y.iterator();
        AbstractC6118n.m27186d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC0904a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        AbstractC6118n.m27187e(menu, "menu");
        this.f19801d.m4787c(menu);
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z7) {
        if (this.f19797D) {
            return;
        }
        Iterator it = this.f19794A.iterator();
        AbstractC6118n.m27186d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC0904a) it.next()).accept(new C0118s(z7));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        AbstractC6118n.m27187e(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        this.f19801d.m4789e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        AbstractC6118n.m27187e(permissions, "permissions");
        AbstractC6118n.m27187e(grantResults, "grantResults");
        if (this.f19808v.m24405f(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i7, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objM23995z0 = m23995z0();
        C2637b0 c2637b0M23997a = this.f19803f;
        if (c2637b0M23997a == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            c2637b0M23997a = dVar.m23997a();
        }
        if (c2637b0M23997a == null && objM23995z0 == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.m23998b(objM23995z0);
        dVar2.m23999c(c2637b0M23997a);
        return dVar2;
    }

    @Override // p017C.AbstractActivityC0106g, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC6118n.m27187e(outState, "outState");
        if (mo419P() instanceof C2659u) {
            AbstractC2650l abstractC2650lMo419P = mo419P();
            AbstractC6118n.m27185c(abstractC2650lMo419P, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C2659u) abstractC2650lMo419P).m12652n(AbstractC2650l.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.f19802e.m194e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.f19810x.iterator();
        AbstractC6118n.m27186d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC0904a) it.next()).accept(Integer.valueOf(i7));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f19795B.iterator();
        AbstractC6118n.m27186d(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC2648j
    /* JADX INFO: renamed from: p */
    public C2635a0.c mo11961p() {
        return (C2635a0.c) this.f19798E.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC2648j
    /* JADX INFO: renamed from: q */
    public AbstractC6428a mo11962q() {
        C6429b c6429b = new C6429b(null, 1, null);
        if (getApplication() != null) {
            c6429b.m27642c(C2635a0.a.f10448h, getApplication());
        }
        c6429b.m27642c(AbstractC2622N.f10416a, this);
        c6429b.m27642c(AbstractC2622N.f10417b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c6429b.m27642c(AbstractC2622N.f10418c, extras);
        }
        return c6429b;
    }

    @Override // p017C.InterfaceC0115p
    /* JADX INFO: renamed from: r */
    public final void mo560r(InterfaceC0904a listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f19812z.add(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0578a.m2546d()) {
                AbstractC0578a.m2543a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            m23992s0().m24016b();
        } finally {
            AbstractC0578a.m2544b();
        }
    }

    @Override // p111O.InterfaceC1080w
    /* JADX INFO: renamed from: s */
    public void mo4783s(InterfaceC1086z provider) {
        AbstractC6118n.m27187e(provider, "provider");
        this.f19801d.m4785a(provider);
    }

    /* JADX INFO: renamed from: s0 */
    public C5195y m23992s0() {
        return (C5195y) this.f19805s.getValue();
    }

    @Override // android.app.Activity
    public void setContentView(int i7) {
        m23993t0();
        e eVar = this.f19804r;
        View decorView = getWindow().getDecorView();
        AbstractC6118n.m27186d(decorView, "getDecorView(...)");
        eVar.mo24001l0(decorView);
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i7) {
        AbstractC6118n.m27187e(intent, "intent");
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i7, Intent intent2, int i8, int i9, int i10) throws IntentSender.SendIntentException {
        AbstractC6118n.m27187e(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i8, i9, i10);
    }

    @Override // p239f.InterfaceC5386g
    /* JADX INFO: renamed from: t */
    public final AbstractC5385f mo12243t() {
        return this.f19808v;
    }

    /* JADX INFO: renamed from: t0 */
    public void m23993t0() {
        View decorView = getWindow().getDecorView();
        AbstractC6118n.m27186d(decorView, "getDecorView(...)");
        AbstractC2641d0.m12618a(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC6118n.m27186d(decorView2, "getDecorView(...)");
        AbstractC2643e0.m12619a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC6118n.m27186d(decorView3, "getDecorView(...)");
        AbstractC0054m.m206a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC6118n.m27186d(decorView4, "getDecorView(...)");
        AbstractC5170M.m23952a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC6118n.m27186d(decorView5, "getDecorView(...)");
        AbstractC5169L.m23951a(decorView5, this);
    }

    /* JADX INFO: renamed from: u0 */
    public void m23994u0() {
        invalidateOptionsMenu();
    }

    @Override // androidx.lifecycle.InterfaceC2639c0
    /* JADX INFO: renamed from: v */
    public C2637b0 mo11963v() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m23981p0();
        C2637b0 c2637b0 = this.f19803f;
        AbstractC6118n.m27184b(c2637b0);
        return c2637b0;
    }

    @Override // androidx.core.content.InterfaceC2437c
    /* JADX INFO: renamed from: w */
    public final void mo10596w(InterfaceC0904a listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f19809w.remove(listener);
    }

    /* JADX INFO: renamed from: z0 */
    public Object m23995z0() {
        return null;
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        AbstractC6118n.m27187e(intent, "intent");
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i7, Intent intent2, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC6118n.m27187e(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z7, Configuration newConfig) {
        AbstractC6118n.m27187e(newConfig, "newConfig");
        this.f19796C = true;
        try {
            super.onMultiWindowModeChanged(z7, newConfig);
            this.f19796C = false;
            Iterator it = this.f19812z.iterator();
            AbstractC6118n.m27186d(it, "iterator(...)");
            while (it.hasNext()) {
                ((InterfaceC0904a) it.next()).accept(new C0108i(z7, newConfig));
            }
        } catch (Throwable th) {
            this.f19796C = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z7, Configuration newConfig) {
        AbstractC6118n.m27187e(newConfig, "newConfig");
        this.f19797D = true;
        try {
            super.onPictureInPictureModeChanged(z7, newConfig);
            this.f19797D = false;
            Iterator it = this.f19794A.iterator();
            AbstractC6118n.m27186d(it, "iterator(...)");
            while (it.hasNext()) {
                ((InterfaceC0904a) it.next()).accept(new C0118s(z7, newConfig));
            }
        } catch (Throwable th) {
            this.f19797D = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m23993t0();
        e eVar = this.f19804r;
        View decorView = getWindow().getDecorView();
        AbstractC6118n.m27186d(decorView, "getDecorView(...)");
        eVar.mo24001l0(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m23993t0();
        e eVar = this.f19804r;
        View decorView = getWindow().getDecorView();
        AbstractC6118n.m27186d(decorView, "getDecorView(...)");
        eVar.mo24001l0(decorView);
        super.setContentView(view, layoutParams);
    }
}
