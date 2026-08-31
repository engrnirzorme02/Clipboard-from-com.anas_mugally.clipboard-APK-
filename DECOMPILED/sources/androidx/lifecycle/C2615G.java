package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.lifecycle.G */
/* JADX INFO: loaded from: classes.dex */
public final class C2615G implements InterfaceC2657s {

    /* JADX INFO: renamed from: t */
    public static final b f10393t = new b(null);

    /* JADX INFO: renamed from: u */
    private static final C2615G f10394u = new C2615G();

    /* JADX INFO: renamed from: a */
    private int f10395a;

    /* JADX INFO: renamed from: b */
    private int f10396b;

    /* JADX INFO: renamed from: e */
    private Handler f10399e;

    /* JADX INFO: renamed from: c */
    private boolean f10397c = true;

    /* JADX INFO: renamed from: d */
    private boolean f10398d = true;

    /* JADX INFO: renamed from: f */
    private final C2659u f10400f = new C2659u(this);

    /* JADX INFO: renamed from: r */
    private final Runnable f10401r = new Runnable() { // from class: androidx.lifecycle.F
        @Override // java.lang.Runnable
        public final void run() {
            C2615G.m12530j(this.f10392a);
        }
    };

    /* JADX INFO: renamed from: s */
    private final FragmentC2617I.a f10402s = new d();

    /* JADX INFO: renamed from: androidx.lifecycle.G$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f10403a = new a();

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public static final void m12538a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            AbstractC6118n.m27187e(activity, "activity");
            AbstractC6118n.m27187e(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.G$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2657s m12539a() {
            return C2615G.f10394u;
        }

        /* JADX INFO: renamed from: b */
        public final void m12540b(Context context) {
            AbstractC6118n.m27187e(context, "context");
            C2615G.f10394u.m12535i(context);
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.G$c */
    public static final class c extends AbstractC2646h {

        /* JADX INFO: renamed from: androidx.lifecycle.G$c$a */
        public static final class a extends AbstractC2646h {
            final /* synthetic */ C2615G this$0;

            a(C2615G c2615g) {
                this.this$0 = c2615g;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                AbstractC6118n.m27187e(activity, "activity");
                this.this$0.m12532f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                AbstractC6118n.m27187e(activity, "activity");
                this.this$0.m12533g();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC2646h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC6118n.m27187e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC2617I.f10407b.m12548b(activity).m12546e(C2615G.this.f10402s);
            }
        }

        @Override // androidx.lifecycle.AbstractC2646h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
            C2615G.this.m12531e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            AbstractC6118n.m27187e(activity, "activity");
            a.m12538a(activity, new a(C2615G.this));
        }

        @Override // androidx.lifecycle.AbstractC2646h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
            C2615G.this.m12534h();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.G$d */
    public static final class d implements FragmentC2617I.a {
        d() {
        }

        @Override // androidx.lifecycle.FragmentC2617I.a
        /* JADX INFO: renamed from: a */
        public void mo12541a() {
            C2615G.this.m12533g();
        }

        @Override // androidx.lifecycle.FragmentC2617I.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.FragmentC2617I.a
        public void onResume() {
            C2615G.this.m12532f();
        }
    }

    private C2615G() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m12530j(C2615G c2615g) {
        c2615g.m12536k();
        c2615g.m12537l();
    }

    @Override // androidx.lifecycle.InterfaceC2657s
    /* JADX INFO: renamed from: P */
    public AbstractC2650l mo419P() {
        return this.f10400f;
    }

    /* JADX INFO: renamed from: e */
    public final void m12531e() {
        int i7 = this.f10396b - 1;
        this.f10396b = i7;
        if (i7 == 0) {
            Handler handler = this.f10399e;
            AbstractC6118n.m27184b(handler);
            handler.postDelayed(this.f10401r, 700L);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12532f() {
        int i7 = this.f10396b + 1;
        this.f10396b = i7;
        if (i7 == 1) {
            if (this.f10397c) {
                this.f10400f.m12651i(AbstractC2650l.a.ON_RESUME);
                this.f10397c = false;
            } else {
                Handler handler = this.f10399e;
                AbstractC6118n.m27184b(handler);
                handler.removeCallbacks(this.f10401r);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12533g() {
        int i7 = this.f10395a + 1;
        this.f10395a = i7;
        if (i7 == 1 && this.f10398d) {
            this.f10400f.m12651i(AbstractC2650l.a.ON_START);
            this.f10398d = false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12534h() {
        this.f10395a--;
        m12537l();
    }

    /* JADX INFO: renamed from: i */
    public final void m12535i(Context context) {
        AbstractC6118n.m27187e(context, "context");
        this.f10399e = new Handler();
        this.f10400f.m12651i(AbstractC2650l.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        AbstractC6118n.m27185c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* JADX INFO: renamed from: k */
    public final void m12536k() {
        if (this.f10396b == 0) {
            this.f10397c = true;
            this.f10400f.m12651i(AbstractC2650l.a.ON_PAUSE);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m12537l() {
        if (this.f10395a == 0 && this.f10397c) {
            this.f10400f.m12651i(AbstractC2650l.a.ON_STOP);
            this.f10398d = true;
        }
    }
}
