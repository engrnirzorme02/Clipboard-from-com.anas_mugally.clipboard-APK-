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
import p068I2.AbstractC0610e;
import p068I2.InterfaceC0606a;
import p068I2.InterfaceC0607b;
import p076J2.AbstractC0679a;
import p076J2.AbstractC0680b;
import p314o2.AbstractC6560l;
import p314o2.C6571w;
import p314o2.InterfaceC6565q;
import p314o2.InterfaceC6566r;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwu extends AbstractC0679a {
    private final String zza;
    private final zzbwa zzb;
    private final Context zzc;
    private AbstractC6560l zze;
    private InterfaceC0606a zzf;
    private InterfaceC6565q zzg;
    private final long zzh = System.currentTimeMillis();
    private final AtomicLong zzi = new AtomicLong();
    private final zzbws zzd = new zzbws();

    public zzbwu(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = C3244B.m17191b().m17350f(context, str, new zzbot());
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
        return this.zza;
    }

    public final AbstractC6560l getFullScreenContentCallback() {
        return this.zze;
    }

    public final InterfaceC0606a getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final InterfaceC6565q getOnPaidEventListener() {
        return null;
    }

    public final long getPlacementId() {
        AtomicLong atomicLong = this.zzi;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    zzbwa zzbwaVar = this.zzb;
                    if (zzbwaVar != null) {
                        long jZzq = zzbwaVar.zzq();
                        AtomicLong atomicLong2 = this.zzi;
                        atomicLong2.set(jZzq);
                        return atomicLong2.get();
                    }
                } catch (RemoteException e7) {
                    AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                }
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p076J2.AbstractC0679a
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
            if (zzbvxVarZzl != null) {
                return new zzbwk(zzbvxVarZzl);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
        return InterfaceC0607b.f2323a;
    }

    @Override // p076J2.AbstractC0679a
    public final void setFullScreenContentCallback(AbstractC6560l abstractC6560l) {
        this.zze = abstractC6560l;
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
        this.zzf = interfaceC0606a;
        try {
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
        try {
            zzbwa zzbwaVar = this.zzb;
            if (zzbwaVar != null) {
                zzbwaVar.zzh(new zzbwo(abstractC0610e));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p076J2.AbstractC0679a
    public final void show(Activity activity, InterfaceC6566r interfaceC6566r) {
        zzbws zzbwsVar = this.zzd;
        zzbwsVar.zzc(interfaceC6566r);
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

    public final void zza(C3368m1 c3368m1, AbstractC0680b abstractC0680b) {
        try {
            zzbwa zzbwaVar = this.zzb;
            if (zzbwaVar != null) {
                c3368m1.m17284o(this.zzh);
                zzbwaVar.zzd(C3365l2.f14001a.m17269a(this.zzc, c3368m1), new zzbwt(abstractC0680b, this));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }
}
