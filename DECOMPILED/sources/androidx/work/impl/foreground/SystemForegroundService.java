package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractServiceC2662x;
import p112O0.AbstractC1097j;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC2662x implements C2910a.b {

    /* JADX INFO: renamed from: f */
    private static final String f11956f = AbstractC1097j.m4846f("SystemFgService");

    /* JADX INFO: renamed from: r */
    private static SystemForegroundService f11957r = null;

    /* JADX INFO: renamed from: b */
    private Handler f11958b;

    /* JADX INFO: renamed from: c */
    private boolean f11959c;

    /* JADX INFO: renamed from: d */
    C2910a f11960d;

    /* JADX INFO: renamed from: e */
    NotificationManager f11961e;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    class RunnableC2907a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f11962a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Notification f11963b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f11964c;

        RunnableC2907a(int i7, Notification notification, int i8) {
            this.f11962a = i7;
            this.f11963b = notification;
            this.f11964c = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f11962a, this.f11963b, this.f11964c);
            } else {
                SystemForegroundService.this.startForeground(this.f11962a, this.f11963b);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    class RunnableC2908b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f11966a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Notification f11967b;

        RunnableC2908b(int i7, Notification notification) {
            this.f11966a = i7;
            this.f11967b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f11961e.notify(this.f11966a, this.f11967b);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    class RunnableC2909c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f11969a;

        RunnableC2909c(int i7) {
            this.f11969a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f11961e.cancel(this.f11969a);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m14581f() {
        this.f11958b = new Handler(Looper.getMainLooper());
        this.f11961e = (NotificationManager) getApplicationContext().getSystemService("notification");
        C2910a c2910a = new C2910a(getApplicationContext());
        this.f11960d = c2910a;
        c2910a.m14594m(this);
    }

    @Override // androidx.work.impl.foreground.C2910a.b
    /* JADX INFO: renamed from: c */
    public void mo14582c(int i7, int i8, Notification notification) {
        this.f11958b.post(new RunnableC2907a(i7, notification, i8));
    }

    @Override // androidx.work.impl.foreground.C2910a.b
    /* JADX INFO: renamed from: d */
    public void mo14583d(int i7, Notification notification) {
        this.f11958b.post(new RunnableC2908b(i7, notification));
    }

    @Override // androidx.work.impl.foreground.C2910a.b
    /* JADX INFO: renamed from: e */
    public void mo14584e(int i7) {
        this.f11958b.post(new RunnableC2909c(i7));
    }

    @Override // androidx.lifecycle.AbstractServiceC2662x, android.app.Service
    public void onCreate() {
        super.onCreate();
        f11957r = this;
        m14581f();
    }

    @Override // androidx.lifecycle.AbstractServiceC2662x, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f11960d.m14592k();
    }

    @Override // androidx.lifecycle.AbstractServiceC2662x, android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f11959c) {
            AbstractC1097j.m4844c().mo4849d(f11956f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f11960d.m14592k();
            m14581f();
            this.f11959c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f11960d.m14593l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.C2910a.b
    public void stop() {
        this.f11959c = true;
        AbstractC1097j.m4844c().mo4847a(f11956f, "All commands completed.", new Throwable[0]);
        stopForeground(true);
        f11957r = null;
        stopSelf();
    }
}
