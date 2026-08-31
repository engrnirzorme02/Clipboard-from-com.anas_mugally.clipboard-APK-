package p252g4;

import java.util.concurrent.atomic.AtomicBoolean;
import p228d4.C5235g;
import p228d4.InterfaceC5229a;
import p316o4.InterfaceC6589j;

/* JADX INFO: renamed from: g4.A */
/* JADX INFO: loaded from: classes.dex */
class C5463A implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private final a f20766a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC6589j f20767b;

    /* JADX INFO: renamed from: c */
    private final Thread.UncaughtExceptionHandler f20768c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5229a f20769d;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f20770e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g4.A$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo24672a(InterfaceC6589j interfaceC6589j, Thread thread, Throwable th);
    }

    public C5463A(a aVar, InterfaceC6589j interfaceC6589j, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC5229a interfaceC5229a) {
        this.f20766a = aVar;
        this.f20767b = interfaceC6589j;
        this.f20768c = uncaughtExceptionHandler;
        this.f20769d = interfaceC5229a;
    }

    /* JADX INFO: renamed from: b */
    private boolean m24670b(Thread thread, Throwable th) {
        if (thread == null) {
            C5235g.m24179f().m24182d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            C5235g.m24179f().m24182d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f20769d.mo24158b()) {
            return true;
        }
        C5235g.m24179f().m24180b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    /* JADX INFO: renamed from: a */
    boolean m24671a() {
        return this.f20770e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f20770e.set(true);
        try {
            if (m24670b(thread, th)) {
                this.f20766a.mo24672a(this.f20767b, thread, th);
            } else {
                C5235g.m24179f().m24180b("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e7) {
            C5235g.m24179f().m24183e("An error occurred in the uncaught exception handler", e7);
        } finally {
            if (this.f20768c != null) {
                C5235g.m24179f().m24180b("Completed exception processing. Invoking default exception handler.");
                this.f20768c.uncaughtException(thread, th);
            } else {
                C5235g.m24179f().m24180b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f20770e.set(false);
        }
    }
}
