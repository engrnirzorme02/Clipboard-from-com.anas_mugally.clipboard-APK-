package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3703k0 extends AbstractC3677V {

    /* JADX INFO: renamed from: g */
    public final IBinder f14804g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ AbstractC3686c f14805h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3703k0(AbstractC3686c abstractC3686c, int i7, IBinder iBinder, Bundle bundle) {
        super(abstractC3686c, i7, bundle);
        this.f14805h = abstractC3686c;
        this.f14804g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3677V
    /* JADX INFO: renamed from: f */
    protected final void mo17992f(C1837b c1837b) {
        if (this.f14805h.zzx != null) {
            this.f14805h.zzx.onConnectionFailed(c1837b);
        }
        this.f14805h.onConnectionFailed(c1837b);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3677V
    /* JADX INFO: renamed from: g */
    protected final boolean mo17993g() {
        try {
            IBinder iBinder = this.f14804g;
            AbstractC3718s.m18083l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f14805h.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f14805h.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = this.f14805h.createServiceInterface(this.f14804g);
            if (iInterfaceCreateServiceInterface == null || !(AbstractC3686c.zzn(this.f14805h, 2, 4, iInterfaceCreateServiceInterface) || AbstractC3686c.zzn(this.f14805h, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            this.f14805h.zzC = null;
            AbstractC3686c abstractC3686c = this.f14805h;
            Bundle connectionHint = abstractC3686c.getConnectionHint();
            if (abstractC3686c.zzw == null) {
                return true;
            }
            this.f14805h.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
