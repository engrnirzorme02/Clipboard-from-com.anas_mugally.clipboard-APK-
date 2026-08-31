package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p116O4.AbstractC1145a;
import p116O4.InterfaceC1146b;
import p116O4.InterfaceC1148d;
import p163V2.C1730a;
import p164V3.AbstractC1757b;
import p164V3.C1762g;
import p171W3.InterfaceC1862a;
import p198a2.InterfaceC2194j;
import p201a5.InterfaceC2234a;
import p211b5.InterfaceC2972b;
import p217c3.ThreadFactoryC3009b;
import p219c5.InterfaceC3022e;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: m */
    private static C4974Y f18788m;

    /* JADX INFO: renamed from: o */
    static ScheduledExecutorService f18790o;

    /* JADX INFO: renamed from: a */
    private final C1762g f18791a;

    /* JADX INFO: renamed from: b */
    private final Context f18792b;

    /* JADX INFO: renamed from: c */
    private final C4951B f18793c;

    /* JADX INFO: renamed from: d */
    private final C4969T f18794d;

    /* JADX INFO: renamed from: e */
    private final C4956a f18795e;

    /* JADX INFO: renamed from: f */
    private final Executor f18796f;

    /* JADX INFO: renamed from: g */
    private final Executor f18797g;

    /* JADX INFO: renamed from: h */
    private final Task f18798h;

    /* JADX INFO: renamed from: i */
    private final C4957G f18799i;

    /* JADX INFO: renamed from: j */
    private boolean f18800j;

    /* JADX INFO: renamed from: k */
    private final Application.ActivityLifecycleCallbacks f18801k;

    /* JADX INFO: renamed from: l */
    private static final long f18787l = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: n */
    static InterfaceC2972b f18789n = new InterfaceC2972b() { // from class: com.google.firebase.messaging.q
        @Override // p211b5.InterfaceC2972b
        public final Object get() {
            return FirebaseMessaging.m22298c();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    class C4956a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1148d f18802a;

        /* JADX INFO: renamed from: b */
        private boolean f18803b;

        /* JADX INFO: renamed from: c */
        private InterfaceC1146b f18804c;

        /* JADX INFO: renamed from: d */
        private Boolean f18805d;

        C4956a(InterfaceC1148d interfaceC1148d) {
            this.f18802a = interfaceC1148d;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m22325a(C4956a c4956a, AbstractC1145a abstractC1145a) {
            if (c4956a.m22328c()) {
                FirebaseMessaging.this.m22295A();
            }
        }

        /* JADX INFO: renamed from: d */
        private Boolean m22326d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextM7405l = FirebaseMessaging.this.f18791a.m7405l();
            SharedPreferences sharedPreferences = contextM7405l.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextM7405l.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextM7405l.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        synchronized void m22327b() {
            try {
                if (this.f18803b) {
                    return;
                }
                Boolean boolM22326d = m22326d();
                this.f18805d = boolM22326d;
                if (boolM22326d == null) {
                    InterfaceC1146b interfaceC1146b = new InterfaceC1146b() { // from class: com.google.firebase.messaging.y
                        @Override // p116O4.InterfaceC1146b
                        /* JADX INFO: renamed from: a */
                        public final void mo4969a(AbstractC1145a abstractC1145a) {
                            FirebaseMessaging.C4956a.m22325a(this.f18990a, abstractC1145a);
                        }
                    };
                    this.f18804c = interfaceC1146b;
                    this.f18802a.mo4971b(AbstractC1757b.class, interfaceC1146b);
                }
                this.f18803b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        synchronized boolean m22328c() {
            Boolean bool;
            try {
                m22327b();
                bool = this.f18805d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f18791a.m7409v();
        }
    }

    FirebaseMessaging(C1762g c1762g, InterfaceC2234a interfaceC2234a, InterfaceC2972b interfaceC2972b, InterfaceC2972b interfaceC2972b2, InterfaceC3022e interfaceC3022e, InterfaceC2972b interfaceC2972b3, InterfaceC1148d interfaceC1148d) {
        this(c1762g, interfaceC2234a, interfaceC2972b, interfaceC2972b2, interfaceC3022e, interfaceC2972b3, interfaceC1148d, new C4957G(c1762g.m7405l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m22295A() {
        if (m22317D(m22321q())) {
            m22314z();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m22296a(FirebaseMessaging firebaseMessaging, String str, C4974Y.a aVar, String str2) {
        m22307o(firebaseMessaging.f18792b).m22424f(firebaseMessaging.m22308p(), str, str2, firebaseMessaging.f18799i.m22344a());
        if (aVar == null || !str2.equals(aVar.f18869a)) {
            firebaseMessaging.m22312u(str2);
        }
        return Tasks.forResult(str2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m22297b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.m22322v()) {
            firebaseMessaging.m22295A();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC2194j m22298c() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m22300e(FirebaseMessaging firebaseMessaging, C1730a c1730a) {
        firebaseMessaging.getClass();
        if (c1730a != null) {
            AbstractC4955F.m22293y(c1730a.m7351T());
            firebaseMessaging.m22310s();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m22302g(FirebaseMessaging firebaseMessaging, C4983d0 c4983d0) {
        if (firebaseMessaging.m22322v()) {
            c4983d0.m22486p();
        }
    }

    static synchronized FirebaseMessaging getInstance(C1762g c1762g) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) c1762g.m7404j(FirebaseMessaging.class);
        AbstractC3718s.m18084m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX INFO: renamed from: n */
    public static synchronized FirebaseMessaging m22306n() {
        return getInstance(C1762g.m7394m());
    }

    /* JADX INFO: renamed from: o */
    private static synchronized C4974Y m22307o(Context context) {
        try {
            if (f18788m == null) {
                f18788m = new C4974Y(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18788m;
    }

    /* JADX INFO: renamed from: p */
    private String m22308p() {
        return "[DEFAULT]".equals(this.f18791a.m7406o()) ? "" : this.f18791a.m7408q();
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC2194j m22309r() {
        return (InterfaceC2194j) f18789n.get();
    }

    /* JADX INFO: renamed from: s */
    private void m22310s() {
        this.f18793c.m22253e().addOnSuccessListener(this.f18796f, new OnSuccessListener() { // from class: com.google.firebase.messaging.v
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.m22300e(this.f18983a, (C1730a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m22311t() {
        AbstractC4963M.m22380c(this.f18792b);
        AbstractC4965O.m22389f(this.f18792b, this.f18793c, m22313y());
        if (m22313y()) {
            m22310s();
        }
    }

    /* JADX INFO: renamed from: u */
    private void m22312u(String str) {
        if ("[DEFAULT]".equals(this.f18791a.m7406o())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f18791a.m7406o());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C5000m(this.f18792b).m22539g(intent);
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m22313y() {
        AbstractC4963M.m22380c(this.f18792b);
        if (!AbstractC4963M.m22381d(this.f18792b)) {
            return false;
        }
        if (this.f18791a.m7404j(InterfaceC1862a.class) != null) {
            return true;
        }
        return AbstractC4955F.m22269a() && f18789n != null;
    }

    /* JADX INFO: renamed from: z */
    private synchronized void m22314z() {
        if (!this.f18800j) {
            m22316C(0L);
        }
    }

    /* JADX INFO: renamed from: B */
    public Task m22315B(final String str) {
        return this.f18798h.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.p
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return ((C4983d0) obj).m22487q(str);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    synchronized void m22316C(long j7) {
        m22319l(new RunnableC4975Z(this, Math.min(Math.max(30L, 2 * j7), f18787l)), j7);
        this.f18800j = true;
    }

    /* JADX INFO: renamed from: D */
    boolean m22317D(C4974Y.a aVar) {
        return aVar == null || aVar.m22427b(this.f18799i.m22344a());
    }

    /* JADX INFO: renamed from: k */
    String m22318k() throws IOException {
        final C4974Y.a aVarM22321q = m22321q();
        if (!m22317D(aVarM22321q)) {
            return aVarM22321q.f18869a;
        }
        final String strM22341c = C4957G.m22341c(this.f18791a);
        try {
            return (String) Tasks.await(this.f18794d.m22400b(strM22341c, new C4969T.a() { // from class: com.google.firebase.messaging.w
                @Override // com.google.firebase.messaging.C4969T.a
                public final Task start() {
                    FirebaseMessaging firebaseMessaging = this.f18984a;
                    return firebaseMessaging.f18793c.m22254f().onSuccessTask(firebaseMessaging.f18797g, new SuccessContinuation() { // from class: com.google.firebase.messaging.x
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public final Task then(Object obj) {
                            return FirebaseMessaging.m22296a(firebaseMessaging, str, aVar, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e7) {
            throw new IOException(e7);
        }
    }

    /* JADX INFO: renamed from: l */
    void m22319l(Runnable runnable, long j7) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f18790o == null) {
                    f18790o = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3009b("TAG"));
                }
                f18790o.schedule(runnable, j7, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    Context m22320m() {
        return this.f18792b;
    }

    /* JADX INFO: renamed from: q */
    C4974Y.a m22321q() {
        return m22307o(this.f18792b).m22422d(m22308p(), C4957G.m22341c(this.f18791a));
    }

    /* JADX INFO: renamed from: v */
    public boolean m22322v() {
        return this.f18795e.m22328c();
    }

    /* JADX INFO: renamed from: w */
    boolean m22323w() {
        return this.f18799i.m22348g();
    }

    /* JADX INFO: renamed from: x */
    synchronized void m22324x(boolean z7) {
        this.f18800j = z7;
    }

    FirebaseMessaging(C1762g c1762g, InterfaceC2234a interfaceC2234a, InterfaceC2972b interfaceC2972b, InterfaceC2972b interfaceC2972b2, InterfaceC3022e interfaceC3022e, InterfaceC2972b interfaceC2972b3, InterfaceC1148d interfaceC1148d, C4957G c4957g) {
        this(c1762g, interfaceC2234a, interfaceC2972b3, interfaceC1148d, c4957g, new C4951B(c1762g, c4957g, interfaceC2972b, interfaceC2972b2, interfaceC3022e), AbstractC5001n.m22546f(), AbstractC5001n.m22543c(), AbstractC5001n.m22542b());
    }

    FirebaseMessaging(C1762g c1762g, InterfaceC2234a interfaceC2234a, InterfaceC2972b interfaceC2972b, InterfaceC1148d interfaceC1148d, C4957G c4957g, C4951B c4951b, Executor executor, Executor executor2, Executor executor3) {
        this.f18800j = false;
        f18789n = interfaceC2972b;
        this.f18791a = c1762g;
        this.f18795e = new C4956a(interfaceC1148d);
        Context contextM7405l = c1762g.m7405l();
        this.f18792b = contextM7405l;
        C5002o c5002o = new C5002o();
        this.f18801k = c5002o;
        this.f18799i = c4957g;
        this.f18793c = c4951b;
        this.f18794d = new C4969T(executor);
        this.f18796f = executor2;
        this.f18797g = executor3;
        Context contextM7405l2 = c1762g.m7405l();
        if (contextM7405l2 instanceof Application) {
            ((Application) contextM7405l2).registerActivityLifecycleCallbacks(c5002o);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextM7405l2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC2234a != null) {
            interfaceC2234a.m9050a(new InterfaceC2234a.a() { // from class: com.google.firebase.messaging.r
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.s
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m22297b(this.f18980a);
            }
        });
        Task taskM22476f = C4983d0.m22476f(this, c4957g, c4951b, contextM7405l, AbstractC5001n.m22547g());
        this.f18798h = taskM22476f;
        taskM22476f.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.t
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.m22302g(this.f18981a, (C4983d0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f18982a.m22311t();
            }
        });
    }
}
