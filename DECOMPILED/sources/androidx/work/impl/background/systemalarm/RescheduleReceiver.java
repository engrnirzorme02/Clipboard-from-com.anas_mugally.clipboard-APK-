package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p112O0.AbstractC1097j;
import p119P0.C1182i;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static final String f11912a = AbstractC1097j.m4846f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC1097j.m4844c().mo4847a(f11912a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            C1182i.m5164k(context).m5177t(goAsync());
        } catch (IllegalStateException e7) {
            AbstractC1097j.m4844c().mo4848b(f11912a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e7);
        }
    }
}
