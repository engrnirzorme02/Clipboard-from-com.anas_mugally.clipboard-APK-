package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AbstractBinderC3336e1;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.client.InterfaceC3352i1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdit extends AbstractBinderC3336e1 {
    private final Object zza = new Object();
    private final InterfaceC3340f1 zzb;
    private final zzbpm zzc;

    public zzdit(InterfaceC3340f1 interfaceC3340f1, zzbpm zzbpmVar) {
        this.zzb = interfaceC3340f1;
        this.zzc = zzbpmVar;
    }

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
    public final float zzj() {
        zzbpm zzbpmVar = this.zzc;
        if (zzbpmVar != null) {
            return zzbpmVar.zzA();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final float zzk() {
        zzbpm zzbpmVar = this.zzc;
        if (zzbpmVar != null) {
            return zzbpmVar.zzB();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zzl(InterfaceC3352i1 interfaceC3352i1) {
        synchronized (this.zza) {
            try {
                InterfaceC3340f1 interfaceC3340f1 = this.zzb;
                if (interfaceC3340f1 != null) {
                    interfaceC3340f1.zzl(interfaceC3352i1);
                }
            } catch (Throwable th) {
                throw th;
            }
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
        synchronized (this.zza) {
            try {
                InterfaceC3340f1 interfaceC3340f1 = this.zzb;
                if (interfaceC3340f1 == null) {
                    return null;
                }
                return interfaceC3340f1.zzo();
            } catch (Throwable th) {
                throw th;
            }
        }
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
