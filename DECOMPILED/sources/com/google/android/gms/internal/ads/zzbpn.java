package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AbstractBinderC3336e1;
import com.google.android.gms.ads.internal.client.InterfaceC3352i1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbpn extends AbstractBinderC3336e1 {
    private final Object zza = new Object();
    private volatile InterfaceC3352i1 zzb;

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zzg(boolean z7) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final float zzj() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final float zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zzl(InterfaceC3352i1 interfaceC3352i1) {
        synchronized (this.zza) {
            this.zzb = interfaceC3352i1;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final InterfaceC3352i1 zzo() {
        InterfaceC3352i1 interfaceC3352i1;
        synchronized (this.zza) {
            interfaceC3352i1 = this.zzb;
        }
        return interfaceC3352i1;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}
