package p071I5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.util.Log;
import p063H5.AbstractC0517L;
import p063H5.AbstractC0526V;
import p063H5.AbstractC0527W;
import p063H5.AbstractC0528X;
import p063H5.AbstractC0543g;
import p063H5.AbstractC0574z;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.EnumC0561p;
import p079J5.C0693g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: I5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0638a extends AbstractC0574z {

    /* JADX INFO: renamed from: c */
    private static final AbstractC0528X f2513c = m2938j();

    /* JADX INFO: renamed from: a */
    private final AbstractC0527W f2514a;

    /* JADX INFO: renamed from: b */
    private Context f2515b;

    /* JADX INFO: renamed from: I5.a$b */
    static final class b extends AbstractC0526V {

        /* JADX INFO: renamed from: a */
        private final AbstractC0526V f2516a;

        /* JADX INFO: renamed from: b */
        private final Context f2517b;

        /* JADX INFO: renamed from: c */
        private final ConnectivityManager f2518c;

        /* JADX INFO: renamed from: d */
        private final Object f2519d = new Object();

        /* JADX INFO: renamed from: e */
        private Runnable f2520e;

        /* JADX INFO: renamed from: I5.a$b$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ c f2521a;

            a(c cVar) {
                this.f2521a = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2518c.unregisterNetworkCallback(this.f2521a);
            }
        }

        /* JADX INFO: renamed from: I5.a$b$b, reason: collision with other inner class name */
        class RunnableC7633b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ d f2523a;

            RunnableC7633b(d dVar) {
                this.f2523a = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2517b.unregisterReceiver(this.f2523a);
            }
        }

        /* JADX INFO: renamed from: I5.a$b$c */
        private class c extends ConnectivityManager.NetworkCallback {
            private c() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b.this.f2516a.mo2245j();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z7) {
                if (z7) {
                    return;
                }
                b.this.f2516a.mo2245j();
            }
        }

        /* JADX INFO: renamed from: I5.a$b$d */
        private class d extends BroadcastReceiver {

            /* JADX INFO: renamed from: a */
            private boolean f2526a;

            private d() {
                this.f2526a = false;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z7 = this.f2526a;
                boolean z8 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f2526a = z8;
                if (!z8 || z7) {
                    return;
                }
                b.this.f2516a.mo2245j();
            }
        }

        b(AbstractC0526V abstractC0526V, Context context) {
            this.f2516a = abstractC0526V;
            this.f2517b = context;
            if (context == null) {
                this.f2518c = null;
                return;
            }
            this.f2518c = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                m2944q();
            } catch (SecurityException e7) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e7);
            }
        }

        /* JADX INFO: renamed from: q */
        private void m2944q() {
            if (this.f2518c != null) {
                c cVar = new c();
                this.f2518c.registerDefaultNetworkCallback(cVar);
                this.f2520e = new a(cVar);
            } else {
                d dVar = new d();
                this.f2517b.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f2520e = new RunnableC7633b(dVar);
            }
        }

        /* JADX INFO: renamed from: r */
        private void m2945r() {
            synchronized (this.f2519d) {
                try {
                    Runnable runnable = this.f2520e;
                    if (runnable != null) {
                        runnable.run();
                        this.f2520e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p063H5.AbstractC0537d
        /* JADX INFO: renamed from: a */
        public String mo2404a() {
            return this.f2516a.mo2404a();
        }

        @Override // p063H5.AbstractC0537d
        /* JADX INFO: renamed from: f */
        public AbstractC0543g mo2405f(C0532a0 c0532a0, C0535c c0535c) {
            return this.f2516a.mo2405f(c0532a0, c0535c);
        }

        @Override // p063H5.AbstractC0526V
        /* JADX INFO: renamed from: j */
        public void mo2245j() {
            this.f2516a.mo2245j();
        }

        @Override // p063H5.AbstractC0526V
        /* JADX INFO: renamed from: k */
        public EnumC0561p mo2246k(boolean z7) {
            return this.f2516a.mo2246k(z7);
        }

        @Override // p063H5.AbstractC0526V
        /* JADX INFO: renamed from: l */
        public void mo2247l(EnumC0561p enumC0561p, Runnable runnable) {
            this.f2516a.mo2247l(enumC0561p, runnable);
        }

        @Override // p063H5.AbstractC0526V
        /* JADX INFO: renamed from: m */
        public AbstractC0526V mo2248m() {
            m2945r();
            return this.f2516a.mo2248m();
        }
    }

    private C0638a(AbstractC0527W abstractC0527W) {
        this.f2514a = (AbstractC0527W) AbstractC1209m.m5303o(abstractC0527W, "delegateBuilder");
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /* JADX INFO: renamed from: j */
    private static AbstractC0528X m2938j() {
        try {
            try {
                AbstractC0528X abstractC0528X = (AbstractC0528X) C0693g.class.asSubclass(AbstractC0528X.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                if (AbstractC0517L.m2166a(abstractC0528X)) {
                    return abstractC0528X;
                }
                Log.w("AndroidChannelBuilder", "OkHttpChannelProvider.isAvailable() returned false");
                return null;
            } catch (Exception e7) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e7);
                return null;
            }
        } catch (ClassCastException e8) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e8);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C0638a m2939k(AbstractC0527W abstractC0527W) {
        return new C0638a(abstractC0527W);
    }

    @Override // p063H5.AbstractC0573y, p063H5.AbstractC0527W
    /* JADX INFO: renamed from: a */
    public AbstractC0526V mo2250a() {
        return new b(this.f2514a.mo2250a(), this.f2515b);
    }

    @Override // p063H5.AbstractC0574z, p063H5.AbstractC0573y
    /* JADX INFO: renamed from: e */
    protected AbstractC0527W mo2535e() {
        return this.f2514a;
    }

    /* JADX INFO: renamed from: i */
    public C0638a m2940i(Context context) {
        this.f2515b = context;
        return this;
    }
}
