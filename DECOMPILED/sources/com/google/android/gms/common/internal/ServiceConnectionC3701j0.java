package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC3701j0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final int f14802a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractC3686c f14803b;

    public ServiceConnectionC3701j0(AbstractC3686c abstractC3686c, int i7) {
        this.f14803b = abstractC3686c;
        this.f14802a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC3686c abstractC3686c = this.f14803b;
        if (iBinder == null) {
            AbstractC3686c.zzk(abstractC3686c, 16);
            return;
        }
        synchronized (abstractC3686c.zzq) {
            try {
                AbstractC3686c abstractC3686c2 = this.f14803b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC3686c2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3708n)) ? new C3680Y(iBinder) : (InterfaceC3708n) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14803b.zzl(0, null, this.f14802a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f14803b.zzq) {
            this.f14803b.zzr = null;
        }
        AbstractC3686c abstractC3686c = this.f14803b;
        int i7 = this.f14802a;
        Handler handler = abstractC3686c.zzb;
        handler.sendMessage(handler.obtainMessage(6, i7, 1));
    }
}
