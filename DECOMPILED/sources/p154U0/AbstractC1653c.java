package p154U0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p112O0.AbstractC1097j;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: U0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1653c extends AbstractC1654d {

    /* JADX INFO: renamed from: h */
    private static final String f5448h = AbstractC1097j.m4846f("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g */
    private final BroadcastReceiver f5449g;

    /* JADX INFO: renamed from: U0.c$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AbstractC1653c.this.mo6902h(context, intent);
            }
        }
    }

    public AbstractC1653c(Context context, InterfaceC2010a interfaceC2010a) {
        super(context, interfaceC2010a);
        this.f5449g = new a();
    }

    @Override // p154U0.AbstractC1654d
    /* JADX INFO: renamed from: e */
    public void mo6905e() {
        AbstractC1097j.m4844c().mo4847a(f5448h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f5453b.registerReceiver(this.f5449g, mo6901g());
    }

    @Override // p154U0.AbstractC1654d
    /* JADX INFO: renamed from: f */
    public void mo6906f() {
        AbstractC1097j.m4844c().mo4847a(f5448h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f5453b.unregisterReceiver(this.f5449g);
    }

    /* JADX INFO: renamed from: g */
    public abstract IntentFilter mo6901g();

    /* JADX INFO: renamed from: h */
    public abstract void mo6902h(Context context, Intent intent);
}
