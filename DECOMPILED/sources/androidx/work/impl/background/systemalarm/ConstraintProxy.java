package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import p112O0.AbstractC1097j;
import p112O0.C1089b;
import p112O0.EnumC1098k;
import p168W0.C1814p;

/* JADX INFO: loaded from: classes.dex */
abstract class ConstraintProxy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static final String f11906a = AbstractC1097j.m4846f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    /* JADX INFO: renamed from: a */
    static void m14542a(Context context, List list) {
        Iterator it = list.iterator();
        boolean zM4816f = false;
        boolean zM4817g = false;
        boolean zM4819i = false;
        boolean z7 = false;
        while (it.hasNext()) {
            C1089b c1089b = ((C1814p) it.next()).f5901j;
            zM4816f |= c1089b.m4816f();
            zM4817g |= c1089b.m4817g();
            zM4819i |= c1089b.m4819i();
            z7 |= c1089b.m4812b() != EnumC1098k.NOT_REQUIRED;
            if (zM4816f && zM4817g && zM4819i && z7) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m14543a(context, zM4816f, zM4817g, zM4819i, z7));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC1097j.m4844c().mo4847a(f11906a, String.format("onReceive : %s", intent), new Throwable[0]);
        context.startService(C2903b.m14550a(context));
    }
}
