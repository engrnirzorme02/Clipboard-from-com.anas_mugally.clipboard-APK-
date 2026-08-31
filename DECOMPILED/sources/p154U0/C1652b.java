package p154U0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p112O0.AbstractC1097j;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: U0.b */
/* JADX INFO: loaded from: classes.dex */
public class C1652b extends AbstractC1653c {

    /* JADX INFO: renamed from: i */
    private static final String f5447i = AbstractC1097j.m4846f("BatteryNotLowTracker");

    public C1652b(Context context, InterfaceC2010a interfaceC2010a) {
        super(context, interfaceC2010a);
    }

    @Override // p154U0.AbstractC1653c
    /* JADX INFO: renamed from: g */
    public IntentFilter mo6901g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p154U0.AbstractC1653c
    /* JADX INFO: renamed from: h */
    public void mo6902h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        AbstractC1097j.m4844c().mo4847a(f5447i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            m6909d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            m6909d(Boolean.FALSE);
        }
    }

    @Override // p154U0.AbstractC1654d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo6900b() {
        Intent intentRegisterReceiver = this.f5453b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        AbstractC1097j.m4844c().mo4848b(f5447i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
