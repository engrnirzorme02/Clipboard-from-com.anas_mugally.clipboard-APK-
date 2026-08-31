package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import p112O0.AbstractC1097j;
import p119P0.C1182i;
import p175X0.AbstractC1929g;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    static final String f11907a = AbstractC1097j.m4846f("ConstrntProxyUpdtRecvr");

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    class RunnableC2901a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Intent f11908a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f11909b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ BroadcastReceiver.PendingResult f11910c;

        RunnableC2901a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f11908a = intent;
            this.f11909b = context;
            this.f11910c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f11908a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f11908a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f11908a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f11908a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC1097j.m4844c().mo4847a(ConstraintProxyUpdateReceiver.f11907a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                AbstractC1929g.m7977a(this.f11909b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                AbstractC1929g.m7977a(this.f11909b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                AbstractC1929g.m7977a(this.f11909b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                AbstractC1929g.m7977a(this.f11909b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f11910c.finish();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Intent m14543a(Context context, boolean z7, boolean z8, boolean z9, boolean z10) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z7).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z8).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z9).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z10);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C1182i.m5164k(context).m5174p().mo8371b(new RunnableC2901a(intent, context, goAsync()));
        } else {
            AbstractC1097j.m4844c().mo4847a(f11907a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
