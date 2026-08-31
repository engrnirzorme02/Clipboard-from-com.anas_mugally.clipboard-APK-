package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgfv implements ServiceConnection {
    final /* synthetic */ zzggb zza;

    /* synthetic */ zzgfv(zzggb zzggbVar, byte[] bArr) {
        Objects.requireNonNull(zzggbVar);
        this.zza = zzggbVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzggb zzggbVar = this.zza;
        zzggbVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzggbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgef zzgefVarZzb = zzgee.zzb(iBinder);
                zzgfv zzgfvVar = this.zza;
                zzggb zzggbVar2 = zzgfvVar.zza;
                zzggbVar2.zzn(zzgefVarZzb);
                zzggbVar2.zzi().zza("linkToDeath", new Object[0]);
                try {
                    IInterface iInterfaceZzm = zzggbVar2.zzm();
                    if (iInterfaceZzm == null) {
                        throw null;
                    }
                    iInterfaceZzm.asBinder().linkToDeath(zzggbVar2.zzl(), 0);
                    zzggb zzggbVar3 = zzgfvVar.zza;
                    zzggbVar3.zzk(false);
                    synchronized (zzggbVar3.zzj()) {
                        try {
                            Iterator it = zzggbVar3.zzj().iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            zzggbVar3.zzj().clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RemoteException e7) {
                    zzgfvVar.zza.zzi().zzd(e7, "linkToDeath failed", new Object[0]);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzggb zzggbVar = this.zza;
        zzggbVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzggbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgft
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzggb zzggbVar2 = this.zza.zza;
                zzggbVar2.zzi().zza("unlinkToDeath", new Object[0]);
                IInterface iInterfaceZzm = zzggbVar2.zzm();
                iInterfaceZzm.getClass();
                iInterfaceZzm.asBinder().unlinkToDeath(zzggbVar2.zzl(), 0);
                zzggbVar2.zzn(null);
                zzggbVar2.zzk(false);
            }
        });
    }
}
