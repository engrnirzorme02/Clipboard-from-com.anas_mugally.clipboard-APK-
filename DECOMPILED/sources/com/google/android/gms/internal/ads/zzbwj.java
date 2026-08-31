package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.BinderC3291Q1;
import com.google.android.gms.ads.internal.client.BinderC3293R1;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3365l2;
import com.google.android.gms.ads.internal.client.C3368m1;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p068I2.AbstractC0608c;
import p068I2.AbstractC0609d;
import p068I2.AbstractC0610e;
import p068I2.InterfaceC0606a;
import p068I2.InterfaceC0607b;
import p314o2.AbstractC6560l;
import p314o2.C6571w;
import p314o2.InterfaceC6565q;
import p314o2.InterfaceC6566r;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwj extends AbstractC0608c {
    private final AtomicReference zza;
    private final zzbwa zzb;
    private final Context zzc;
    private final zzbws zzd;
    private InterfaceC0606a zze;
    private InterfaceC6565q zzf;
    private AbstractC6560l zzg;
    private final long zzh;
    private final AtomicLong zzi;

    public zzbwj(Context context, zzbwa zzbwaVar) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference();
        this.zzb = zzbwaVar;
        this.zzd = new zzbws();
    }

    public final Bundle getAdMetadata() {
        try {
            zzbwa zzbwaVar = this.zzb;
            if (zzbwaVar != null) {
                return zzbwaVar.zzg();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        String strZzn;
        String str;
        AtomicReference atomicReference = this.zza;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzn = this.zzb.zzn();
            } catch (RemoteException e7) {
                AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                strZzn = null;
            }
            if (strZzn == null) {
                this.zza.set("");
            } else {
                this.zza.set(strZzn);
            }
            str = (String) this.zza.get();
        }
        return str;
    }

    public final AbstractC6560l getFullScreenContentCallback() {
        return this.zzg;
    }

    public final InterfaceC0606a getOnAdMetadataChangedListener() {
        return this.zze;
    }

    public final InterfaceC6565q getOnPaidEventListener() {
        return null;
    }

    public final long getPlacementId() {
        long j7;
        AtomicLong atomicLong = this.zzi;
        long jZzq = 0;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                zzbwa zzbwaVar = this.zzb;
                if (zzbwaVar != null) {
                    jZzq = zzbwaVar.zzq();
                }
            } catch (RemoteException e7) {
                AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            }
            AtomicLong atomicLong2 = this.zzi;
            atomicLong2.set(jZzq);
            j7 = atomicLong2.get();
        }
        return j7;
    }

    @Override // p068I2.AbstractC0608c
    public final C6571w getResponseInfo() {
        InterfaceC3328c1 interfaceC3328c1Zzm = null;
        try {
            zzbwa zzbwaVar = this.zzb;
            if (zzbwaVar != null) {
                interfaceC3328c1Zzm = zzbwaVar.zzm();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
        return C6571w.m27862f(interfaceC3328c1Zzm);
    }

    public final InterfaceC0607b getRewardItem() {
        try {
            zzbwa zzbwaVar = this.zzb;
            zzbvx zzbvxVarZzl = zzbwaVar != null ? zzbwaVar.zzl() : null;
            return zzbvxVarZzl == null ? InterfaceC0607b.f2323a : new zzbwk(zzbvxVarZzl);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return InterfaceC0607b.f2323a;
        }
    }

    @Override // p068I2.AbstractC0608c
    public final void setFullScreenContentCallback(AbstractC6560l abstractC6560l) {
        this.zzg = abstractC6560l;
        this.zzd.zzb(abstractC6560l);
    }

    public final void setImmersiveMode(boolean z7) {
        try {
            zzbwa zzbwaVar = this.zzb;
            if (zzbwaVar != null) {
                zzbwaVar.zzp(z7);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void setOnAdMetadataChangedListener(InterfaceC0606a interfaceC0606a) {
        try {
            this.zze = interfaceC0606a;
            zzbwa zzbwaVar = this.zzb;
            if (zzbwaVar != null) {
                zzbwaVar.zzf(new BinderC3291Q1(interfaceC0606a));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void setOnPaidEventListener(InterfaceC6565q interfaceC6565q) {
        try {
            zzbwa zzbwaVar = this.zzb;
            if (zzbwaVar != null) {
                zzbwaVar.zzo(new BinderC3293R1(interfaceC6565q));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void setPlacementId(long j7) {
        try {
            zzbwa zzbwaVar = this.zzb;
            if (zzbwaVar != null) {
                zzbwaVar.zzr(j7);
                this.zzi.set(j7);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void setServerSideVerificationOptions(AbstractC0610e abstractC0610e) {
    }

    @Override // p068I2.AbstractC0608c
    public final void show(Activity activity, InterfaceC6566r interfaceC6566r) {
        zzbws zzbwsVar = this.zzd;
        zzbwsVar.zzc(interfaceC6566r);
        if (activity == null) {
            AbstractC7599p.m33331f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbwa zzbwaVar = this.zzb;
            if (zzbwaVar != null) {
                zzbwaVar.zze(zzbwsVar);
                zzbwaVar.zzb(BinderC3773b.m18221N0(activity));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void zza(C3368m1 c3368m1, AbstractC0609d abstractC0609d) {
        try {
            zzbwa zzbwaVar = this.zzb;
            if (zzbwaVar != null) {
                c3368m1.m17284o(this.zzh);
                zzbwaVar.zzc(C3365l2.f14001a.m17269a(this.zzc, c3368m1), new zzbwn(abstractC0609d, this));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public zzbwj(Context context, String str) {
        this(context, str, C3244B.m17191b().m17350f(context, str, new zzbot()));
    }

    public zzbwj(Context context, String str, zzbwa zzbwaVar) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference(str);
        this.zzb = zzbwaVar;
        this.zzd = new zzbws();
    }
}
