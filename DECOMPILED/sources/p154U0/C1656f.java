package p154U0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p112O0.AbstractC1097j;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: U0.f */
/* JADX INFO: loaded from: classes.dex */
public class C1656f extends AbstractC1653c {

    /* JADX INFO: renamed from: i */
    private static final String f5465i = AbstractC1097j.m4846f("StorageNotLowTracker");

    public C1656f(Context context, InterfaceC2010a interfaceC2010a) {
        super(context, interfaceC2010a);
    }

    @Override // p154U0.AbstractC1653c
    /* JADX INFO: renamed from: g */
    public IntentFilter mo6901g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // p154U0.AbstractC1653c
    /* JADX INFO: renamed from: h */
    public void mo6902h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        AbstractC1097j.m4844c().mo4847a(f5465i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            m6909d(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            m6909d(Boolean.TRUE);
        }
    }

    @Override // p154U0.AbstractC1654d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo6900b() {
        Intent intentRegisterReceiver = this.f5453b.registerReceiver(null, mo6901g());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
