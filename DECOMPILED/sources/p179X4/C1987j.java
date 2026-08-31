package p179X4;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p186Y4.InterfaceC2043k;

/* JADX INFO: renamed from: X4.j */
/* JADX INFO: loaded from: classes.dex */
final class C1987j implements InterfaceC1991n {

    /* JADX INFO: renamed from: a */
    private final Context f6592a;

    /* JADX INFO: renamed from: b */
    private final ConnectivityManager f6593b;

    /* JADX INFO: renamed from: c */
    private Runnable f6594c;

    /* JADX INFO: renamed from: d */
    private final List f6595d = new ArrayList();

    /* JADX INFO: renamed from: X4.j$a */
    class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AtomicBoolean f6596a;

        a(AtomicBoolean atomicBoolean) {
            this.f6596a = atomicBoolean;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f6596a.compareAndSet(true, false)) {
                C1987j.this.m8336j();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (this.f6596a.compareAndSet(true, false)) {
                C1987j.this.m8336j();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f6596a.compareAndSet(true, false)) {
                C1987j.this.m8336j();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: renamed from: X4.j$b */
    class b implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AtomicBoolean f6598a;

        b(AtomicBoolean atomicBoolean) {
            this.f6598a = atomicBoolean;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i7) {
            if (i7 == 20) {
                this.f6598a.set(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4.j$c */
    class c extends ConnectivityManager.NetworkCallback {
        private c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C1987j.this.m8334i(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            C1987j.this.m8334i(false);
        }

        /* synthetic */ c(C1987j c1987j, a aVar) {
            this();
        }
    }

    C1987j(Context context) {
        AbstractC2034b.m8460d(context != null, "Context must be non-null", new Object[0]);
        this.f6592a = context;
        this.f6593b = (ConnectivityManager) context.getSystemService("connectivity");
        m8331f();
        m8332g();
    }

    /* JADX INFO: renamed from: f */
    private void m8331f() {
        Application application = (Application) this.f6592a.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new a(atomicBoolean));
        application.registerComponentCallbacks(new b(atomicBoolean));
    }

    /* JADX INFO: renamed from: g */
    private void m8332g() {
        a aVar = null;
        if (this.f6593b != null) {
            final c cVar = new c(this, aVar);
            this.f6593b.registerDefaultNetworkCallback(cVar);
            this.f6594c = new Runnable() { // from class: X4.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6588a.f6593b.unregisterNetworkCallback(cVar);
                }
            };
        } else {
            final d dVar = new d(this, aVar);
            this.f6592a.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f6594c = new Runnable() { // from class: X4.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6590a.f6592a.unregisterReceiver(dVar);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public boolean m8333h() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f6592a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m8334i(boolean z7) {
        synchronized (this.f6595d) {
            try {
                Iterator it = this.f6595d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2043k) it.next()).accept(z7 ? InterfaceC1991n.a.REACHABLE : InterfaceC1991n.a.UNREACHABLE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p179X4.InterfaceC1991n
    /* JADX INFO: renamed from: a */
    public void mo8335a(InterfaceC2043k interfaceC2043k) {
        synchronized (this.f6595d) {
            this.f6595d.add(interfaceC2043k);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m8336j() {
        AbstractC2049q.m8502a("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (m8333h()) {
            m8334i(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4.j$d */
    class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private boolean f6601a;

        private d() {
            this.f6601a = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean zM8333h = C1987j.this.m8333h();
            if (C1987j.this.m8333h() && !this.f6601a) {
                C1987j.this.m8334i(true);
            } else if (!zM8333h && this.f6601a) {
                C1987j.this.m8334i(false);
            }
            this.f6601a = zM8333h;
        }

        /* synthetic */ d(C1987j c1987j, a aVar) {
            this();
        }
    }
}
