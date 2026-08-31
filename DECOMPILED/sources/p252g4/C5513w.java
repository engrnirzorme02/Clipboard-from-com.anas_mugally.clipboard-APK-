package p252g4;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p164V3.C1762g;
import p228d4.C5235g;
import p228d4.C5240l;
import p228d4.InterfaceC5229a;
import p236e4.InterfaceC5344a;
import p244f4.InterfaceC5437a;
import p244f4.InterfaceC5438b;
import p260h4.C5653i;
import p268i4.C5710f;
import p268i4.C5718n;
import p300m4.C6346g;
import p316o4.InterfaceC6589j;
import p326p4.C6753a;
import p326p4.C6755c;

/* JADX INFO: renamed from: g4.w */
/* JADX INFO: loaded from: classes.dex */
public class C5513w {

    /* JADX INFO: renamed from: a */
    private final Context f20918a;

    /* JADX INFO: renamed from: b */
    private final C1762g f20919b;

    /* JADX INFO: renamed from: c */
    private final C5465C f20920c;

    /* JADX INFO: renamed from: f */
    private C5514x f20923f;

    /* JADX INFO: renamed from: g */
    private C5514x f20924g;

    /* JADX INFO: renamed from: h */
    private boolean f20925h;

    /* JADX INFO: renamed from: i */
    private C5506p f20926i;

    /* JADX INFO: renamed from: j */
    private final C5470H f20927j;

    /* JADX INFO: renamed from: k */
    private final C6346g f20928k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5438b f20929l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC5344a f20930m;

    /* JADX INFO: renamed from: n */
    private final C5503m f20931n;

    /* JADX INFO: renamed from: o */
    private final InterfaceC5229a f20932o;

    /* JADX INFO: renamed from: p */
    private final C5240l f20933p;

    /* JADX INFO: renamed from: q */
    private final C5653i f20934q;

    /* JADX INFO: renamed from: e */
    private final long f20922e = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    private final C5475M f20921d = new C5475M();

    public C5513w(C1762g c1762g, C5470H c5470h, InterfaceC5229a interfaceC5229a, C5465C c5465c, InterfaceC5438b interfaceC5438b, InterfaceC5344a interfaceC5344a, C6346g c6346g, C5503m c5503m, C5240l c5240l, C5653i c5653i) {
        this.f20919b = c1762g;
        this.f20920c = c5465c;
        this.f20918a = c1762g.m7405l();
        this.f20927j = c5470h;
        this.f20932o = interfaceC5229a;
        this.f20929l = interfaceC5438b;
        this.f20930m = interfaceC5344a;
        this.f20928k = c6346g;
        this.f20931n = c5503m;
        this.f20933p = c5240l;
        this.f20934q = c5653i;
    }

    /* JADX INFO: renamed from: f */
    private void m24882f() {
        try {
            this.f20925h = Boolean.TRUE.equals((Boolean) this.f20934q.f21640a.m25131c().submit(new Callable() { // from class: g4.r
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f20908a.f20926i.m24867r());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f20925h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m24883h(InterfaceC6589j interfaceC6589j) {
        C5653i.m25136c();
        m24891o();
        try {
            try {
                this.f20929l.mo14979a(new InterfaceC5437a() { // from class: g4.t
                    @Override // p244f4.InterfaceC5437a
                    /* JADX INFO: renamed from: a */
                    public final void mo24643a(String str) {
                        this.f20911a.m24889m(str);
                    }
                });
                this.f20926i.m24863Q();
                if (!interfaceC6589j.mo27919b().f24824b.f24831a) {
                    C5235g.m24179f().m24180b("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f20926i.m24870y(interfaceC6589j)) {
                    C5235g.m24179f().m24188k("Previous sessions could not be finalized.");
                }
                this.f20926i.m24865S(interfaceC6589j.mo27918a());
                m24890n();
            } catch (Exception e7) {
                C5235g.m24179f().m24183e("Crashlytics encountered a problem during asynchronous initialization.", e7);
                m24890n();
            }
        } catch (Throwable th) {
            m24890n();
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m24884j(final InterfaceC6589j interfaceC6589j) {
        Future<?> futureSubmit = this.f20934q.f21640a.m25131c().submit(new Runnable() { // from class: g4.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f20909a.m24883h(interfaceC6589j);
            }
        });
        C5235g.m24179f().m24180b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            C5235g.m24179f().m24183e("Crashlytics was interrupted during initialization.", e7);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e8) {
            C5235g.m24179f().m24183e("Crashlytics encountered a problem during initialization.", e8);
        } catch (TimeoutException e9) {
            C5235g.m24179f().m24183e("Crashlytics timed out during initialization.", e9);
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m24885k() {
        return "20.0.2";
    }

    /* JADX INFO: renamed from: l */
    static boolean m24886l(String str, boolean z7) {
        if (!z7) {
            C5235g.m24179f().m24186i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    /* JADX INFO: renamed from: g */
    boolean m24887g() {
        return this.f20923f.m24895c();
    }

    /* JADX INFO: renamed from: i */
    public Task m24888i(final InterfaceC6589j interfaceC6589j) {
        return this.f20934q.f21640a.m25132e(new Runnable() { // from class: g4.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f20906a.m24883h(interfaceC6589j);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m24889m(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f20922e;
        this.f20934q.f21640a.m25132e(new Runnable() { // from class: g4.u
            @Override // java.lang.Runnable
            public final void run() {
                C5513w c5513w = this.f20912a;
                c5513w.f20934q.f21641b.m25132e(new Runnable() { // from class: g4.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        c5513w.f20926i.m24866V(j, str);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n */
    void m24890n() {
        C5653i.m25136c();
        try {
            if (this.f20923f.m24896d()) {
                return;
            }
            C5235g.m24179f().m24188k("Initialization marker file was not properly removed.");
        } catch (Exception e7) {
            C5235g.m24179f().m24183e("Problem encountered deleting Crashlytics initialization marker.", e7);
        }
    }

    /* JADX INFO: renamed from: o */
    void m24891o() {
        C5653i.m25136c();
        this.f20923f.m24894a();
        C5235g.m24179f().m24186i("Initialization marker file was created.");
    }

    /* JADX INFO: renamed from: p */
    public boolean m24892p(C5488a c5488a, InterfaceC6589j interfaceC6589j) {
        if (!m24886l(c5488a.f20822b, AbstractC5499i.m24791i(this.f20918a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strM24780c = new C5498h().m24780c();
        try {
            this.f20924g = new C5514x("crash_marker", this.f20928k);
            this.f20923f = new C5514x("initialization_marker", this.f20928k);
            C5718n c5718n = new C5718n(strM24780c, this.f20928k, this.f20934q);
            C5710f c5710f = new C5710f(this.f20928k);
            C6753a c6753a = new C6753a(1024, new C6755c(10));
            this.f20933p.m24198b(c5718n);
            this.f20926i = new C5506p(this.f20918a, this.f20927j, this.f20920c, this.f20928k, this.f20924g, c5488a, c5718n, c5710f, C5487Z.m24741j(this.f20918a, this.f20927j, this.f20928k, c5488a, c5710f, c5718n, c6753a, interfaceC6589j, this.f20921d, this.f20931n, this.f20934q), this.f20932o, this.f20930m, this.f20931n, this.f20934q);
            boolean zM24887g = m24887g();
            m24882f();
            this.f20926i.m24869w(strM24780c, Thread.getDefaultUncaughtExceptionHandler(), interfaceC6589j);
            if (!zM24887g || !AbstractC5499i.m24786d(this.f20918a)) {
                C5235g.m24179f().m24180b("Successfully configured exception handler.");
                return true;
            }
            C5235g.m24179f().m24180b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            m24884j(interfaceC6589j);
            return false;
        } catch (Exception e7) {
            C5235g.m24179f().m24183e("Crashlytics was not started due to an exception during initialization", e7);
            this.f20926i = null;
            return false;
        }
    }
}
