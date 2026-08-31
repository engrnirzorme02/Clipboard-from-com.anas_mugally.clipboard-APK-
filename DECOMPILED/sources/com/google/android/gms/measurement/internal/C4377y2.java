package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y2 */
/* JADX INFO: loaded from: classes2.dex */
final class C4377y2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private final C4317q6 f16241a;

    /* JADX INFO: renamed from: b */
    private boolean f16242b;

    /* JADX INFO: renamed from: c */
    private boolean f16243c;

    C4377y2(C4317q6 c4317q6) {
        AbstractC3718s.m18083l(c4317q6);
        this.f16241a = c4317q6;
    }

    /* JADX INFO: renamed from: a */
    public final void m19327a() {
        C4317q6 c4317q6 = this.f16241a;
        c4317q6.m18907O0();
        c4317q6.mo18422b().mo18427h();
        if (this.f16242b) {
            return;
        }
        c4317q6.mo18424e().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f16243c = c4317q6.m18897E0().m19104m();
        c4317q6.mo18421a().m18859w().m18835b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f16243c));
        this.f16242b = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m19328b() {
        C4317q6 c4317q6 = this.f16241a;
        c4317q6.m18907O0();
        c4317q6.mo18422b().mo18427h();
        c4317q6.mo18422b().mo18427h();
        if (this.f16242b) {
            c4317q6.mo18421a().m18859w().m18834a("Unregistering connectivity change receiver");
            this.f16242b = false;
            this.f16243c = false;
            try {
                c4317q6.mo18424e().unregisterReceiver(this);
            } catch (IllegalArgumentException e7) {
                this.f16241a.mo18421a().m18851o().m18835b("Failed to unregister the network broadcast receiver", e7);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4317q6 m19329c() {
        return this.f16241a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C4317q6 c4317q6 = this.f16241a;
        c4317q6.m18907O0();
        String action = intent.getAction();
        c4317q6.mo18421a().m18859w().m18835b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            c4317q6.mo18421a().m18854r().m18835b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM19104m = c4317q6.m18897E0().m19104m();
        if (this.f16243c != zM19104m) {
            this.f16243c = zM19104m;
            c4317q6.mo18422b().m18639t(new RunnableC4369x2(this, zM19104m));
        }
    }
}
