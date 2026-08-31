package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzqp;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.G6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4046G6 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private final C4164X2 f15240a;

    public C4046G6(C4164X2 c4164x2) {
        this.f15240a = c4164x2;
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ void m18521a() {
        this.f15240a.m18672N().m18465o(((Long) AbstractC4209d2.f15602D.m18706b(null)).longValue());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b7;
        if (intent == null) {
            this.f15240a.mo18421a().m18854r().m18834a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f15240a.mo18421a().m18854r().m18834a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                b7 = 1;
            } else {
                b7 = -1;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            b7 = 0;
        } else {
            b7 = -1;
        }
        if (b7 != 0) {
            if (b7 != 1) {
                this.f15240a.mo18421a().m18854r().m18834a("App receiver called with unknown action");
                return;
            }
            C4164X2 c4164x2 = this.f15240a;
            c4164x2.mo18421a().m18859w().m18834a("[sgtm] App Receiver notified batches are available");
            c4164x2.mo18422b().m18639t(new Runnable() { // from class: com.google.android.gms.measurement.internal.D6
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f15165a.m18521a();
                }
            });
            return;
        }
        final C4164X2 c4164x3 = this.f15240a;
        zzqp.zza();
        if (c4164x3.m18686w().m18800H(null, AbstractC4209d2.f15631R0)) {
            c4164x3.mo18421a().m18859w().m18834a("App receiver notified triggers are available");
            c4164x3.mo18422b().m18639t(new Runnable() { // from class: com.google.android.gms.measurement.internal.E6
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C4164X2 c4164x4 = c4164x3;
                    if (!c4164x4.m18661C().m19373G()) {
                        c4164x4.mo18421a().m18854r().m18834a("registerTrigger called but app not eligible");
                        return;
                    }
                    c4164x4.m18660B().m19304t0();
                    final C4371x4 c4371x4M18660B = c4164x4.m18660B();
                    Objects.requireNonNull(c4371x4M18660B);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.F6
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            c4371x4M18660B.m19306u0();
                        }
                    }).start();
                }
            });
        }
    }
}
