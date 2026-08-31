package p154U0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p112O0.AbstractC1097j;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: U0.a */
/* JADX INFO: loaded from: classes.dex */
public class C1651a extends AbstractC1653c {

    /* JADX INFO: renamed from: i */
    private static final String f5446i = AbstractC1097j.m4846f("BatteryChrgTracker");

    public C1651a(Context context, InterfaceC2010a interfaceC2010a) {
        super(context, interfaceC2010a);
    }

    /* JADX INFO: renamed from: j */
    private boolean m6899j(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // p154U0.AbstractC1653c
    /* JADX INFO: renamed from: g */
    public IntentFilter mo6901g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // p154U0.AbstractC1653c
    /* JADX INFO: renamed from: h */
    public void mo6902h(Context context, Intent intent) {
        byte b7 = 0;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        AbstractC1097j.m4844c().mo4847a(f5446i, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    b7 = -1;
                }
                break;
            case -54942926:
                b7 = !action.equals("android.os.action.DISCHARGING") ? (byte) -1 : (byte) 1;
                break;
            case 948344062:
                b7 = !action.equals("android.os.action.CHARGING") ? (byte) -1 : (byte) 2;
                break;
            case 1019184907:
                b7 = !action.equals("android.intent.action.ACTION_POWER_CONNECTED") ? (byte) -1 : (byte) 3;
                break;
            default:
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
                m6909d(Boolean.FALSE);
                break;
            case 1:
                m6909d(Boolean.FALSE);
                break;
            case 2:
                m6909d(Boolean.TRUE);
                break;
            case 3:
                m6909d(Boolean.TRUE);
                break;
        }
    }

    @Override // p154U0.AbstractC1654d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo6900b() {
        Intent intentRegisterReceiver = this.f5453b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(m6899j(intentRegisterReceiver));
        }
        AbstractC1097j.m4844c().mo4848b(f5446i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
