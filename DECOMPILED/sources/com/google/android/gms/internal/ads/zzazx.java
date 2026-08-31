package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.BinderC3293R1;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p314o2.AbstractC6560l;
import p314o2.C6571w;
import p314o2.InterfaceC6565q;
import p332q2.AbstractC6824a;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazx extends AbstractC6824a {
    AbstractC6560l zza;
    private final zzbab zzb;
    private final AtomicReference zzc;
    private final zzazy zzd;
    private InterfaceC6565q zze;
    private final AtomicLong zzf;

    public zzazx(zzbab zzbabVar) {
        this.zzd = new zzazy();
        this.zzf = new AtomicLong();
        this.zzb = zzbabVar;
        this.zzc = new AtomicReference();
    }

    public final String getAdUnitId() {
        String strZzj;
        String str;
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzj = this.zzb.zzj();
            } catch (RemoteException e7) {
                AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                strZzj = null;
            }
            if (strZzj == null) {
                this.zzc.set("");
            } else {
                this.zzc.set(strZzj);
            }
            str = (String) this.zzc.get();
        }
        return str;
    }

    public final AbstractC6560l getFullScreenContentCallback() {
        return this.zza;
    }

    public final InterfaceC6565q getOnPaidEventListener() {
        return null;
    }

    public final long getPlacementId() {
        long j7;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long jZzk = this.zzb.zzk();
                    AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(jZzk);
                    j7 = atomicLong2.get();
                } catch (RemoteException e7) {
                    AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j7;
    }

    @Override // p332q2.AbstractC6824a
    public final C6571w getResponseInfo() {
        InterfaceC3328c1 interfaceC3328c1Zzg;
        try {
            interfaceC3328c1Zzg = this.zzb.zzg();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            interfaceC3328c1Zzg = null;
        }
        return C6571w.m27862f(interfaceC3328c1Zzg);
    }

    @Override // p332q2.AbstractC6824a
    public final void setFullScreenContentCallback(AbstractC6560l abstractC6560l) {
        this.zza = abstractC6560l;
        this.zzd.zzb(abstractC6560l);
    }

    public final void setImmersiveMode(boolean z7) {
        try {
            this.zzb.zzh(z7);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void setOnPaidEventListener(InterfaceC6565q interfaceC6565q) {
        try {
            this.zzb.zzi(new BinderC3293R1(interfaceC6565q));
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void setPlacementId(long j7) {
        try {
            this.zzb.zzl(j7);
            this.zzf.set(j7);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p332q2.AbstractC6824a
    public final void show(Activity activity) {
        try {
            this.zzb.zzf(BinderC3773b.m18221N0(activity), this.zzd);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public zzazx(zzbab zzbabVar, String str) {
        this.zzd = new zzazy();
        this.zzf = new AtomicLong();
        this.zzb = zzbabVar;
        this.zzc = new AtomicReference(str);
    }
}
