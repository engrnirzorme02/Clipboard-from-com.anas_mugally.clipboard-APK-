package p154U0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import p073J.AbstractC0670a;
import p112O0.AbstractC1097j;
import p140S0.C1383b;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: U0.e */
/* JADX INFO: loaded from: classes.dex */
public class C1655e extends AbstractC1654d {

    /* JADX INFO: renamed from: j */
    static final String f5459j = AbstractC1097j.m4846f("NetworkStateTracker");

    /* JADX INFO: renamed from: g */
    private final ConnectivityManager f5460g;

    /* JADX INFO: renamed from: h */
    private b f5461h;

    /* JADX INFO: renamed from: i */
    private a f5462i;

    /* JADX INFO: renamed from: U0.e$a */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            AbstractC1097j.m4844c().mo4847a(C1655e.f5459j, "Network broadcast received", new Throwable[0]);
            C1655e c1655e = C1655e.this;
            c1655e.m6909d(c1655e.m6911g());
        }
    }

    /* JADX INFO: renamed from: U0.e$b */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC1097j.m4844c().mo4847a(C1655e.f5459j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            C1655e c1655e = C1655e.this;
            c1655e.m6909d(c1655e.m6911g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC1097j.m4844c().mo4847a(C1655e.f5459j, "Network connection lost", new Throwable[0]);
            C1655e c1655e = C1655e.this;
            c1655e.m6909d(c1655e.m6911g());
        }
    }

    public C1655e(Context context, InterfaceC2010a interfaceC2010a) {
        super(context, interfaceC2010a);
        this.f5460g = (ConnectivityManager) this.f5453b.getSystemService("connectivity");
        if (m6910j()) {
            this.f5461h = new b();
        } else {
            this.f5462i = new a();
        }
    }

    /* JADX INFO: renamed from: j */
    private static boolean m6910j() {
        return true;
    }

    @Override // p154U0.AbstractC1654d
    /* JADX INFO: renamed from: e */
    public void mo6905e() {
        if (!m6910j()) {
            AbstractC1097j.m4844c().mo4847a(f5459j, "Registering broadcast receiver", new Throwable[0]);
            this.f5453b.registerReceiver(this.f5462i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            AbstractC1097j.m4844c().mo4847a(f5459j, "Registering network callback", new Throwable[0]);
            this.f5460g.registerDefaultNetworkCallback(this.f5461h);
        } catch (IllegalArgumentException | SecurityException e7) {
            AbstractC1097j.m4844c().mo4848b(f5459j, "Received exception while registering network callback", e7);
        }
    }

    @Override // p154U0.AbstractC1654d
    /* JADX INFO: renamed from: f */
    public void mo6906f() {
        if (!m6910j()) {
            AbstractC1097j.m4844c().mo4847a(f5459j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f5453b.unregisterReceiver(this.f5462i);
            return;
        }
        try {
            AbstractC1097j.m4844c().mo4847a(f5459j, "Unregistering network callback", new Throwable[0]);
            this.f5460g.unregisterNetworkCallback(this.f5461h);
        } catch (IllegalArgumentException | SecurityException e7) {
            AbstractC1097j.m4844c().mo4848b(f5459j, "Received exception while unregistering network callback", e7);
        }
    }

    /* JADX INFO: renamed from: g */
    C1383b m6911g() {
        NetworkInfo activeNetworkInfo = this.f5460g.getActiveNetworkInfo();
        boolean z7 = false;
        boolean z8 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zM6913i = m6913i();
        boolean zM3183a = AbstractC0670a.m3183a(this.f5460g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z7 = true;
        }
        return new C1383b(z8, zM6913i, zM3183a, z7);
    }

    @Override // p154U0.AbstractC1654d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1383b mo6900b() {
        return m6911g();
    }

    /* JADX INFO: renamed from: i */
    boolean m6913i() {
        try {
            NetworkCapabilities networkCapabilities = this.f5460g.getNetworkCapabilities(this.f5460g.getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e7) {
            AbstractC1097j.m4844c().mo4848b(f5459j, "Unable to validate active network", e7);
            return false;
        }
    }
}
