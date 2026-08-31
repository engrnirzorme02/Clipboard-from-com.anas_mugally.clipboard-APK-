package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.BinderC3253E;
import com.google.android.gms.ads.internal.client.BinderC3293R1;
import com.google.android.gms.ads.internal.client.BinderC3329c2;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3365l2;
import com.google.android.gms.ads.internal.client.C3368m1;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p314o2.AbstractC6553e;
import p314o2.AbstractC6560l;
import p314o2.C6561m;
import p314o2.C6571w;
import p314o2.InterfaceC6565q;
import p324p2.AbstractC6736c;
import p324p2.InterfaceC6738e;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbmg extends AbstractC6736c {
    private final Context zza;
    private final C3365l2 zzb;
    private final InterfaceC3312Y zzc;
    private final AtomicReference zzd;
    private final zzbot zze;
    private final long zzf;
    private InterfaceC6738e zzg;
    private AbstractC6560l zzh;
    private InterfaceC6565q zzi;
    private final AtomicLong zzj;

    public zzbmg(Context context, InterfaceC3312Y interfaceC3312Y) {
        this.zze = new zzbot();
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference();
        this.zzb = C3365l2.f14001a;
        this.zzc = interfaceC3312Y;
    }

    public final String getAdUnitId() {
        String strZzu;
        String str;
        AtomicReference atomicReference = this.zzd;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzu = this.zzc.zzu();
            } catch (RemoteException e7) {
                AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                strZzu = null;
            }
            if (strZzu == null) {
                this.zzd.set("");
            } else {
                this.zzd.set(strZzu);
            }
            str = (String) this.zzd.get();
        }
        return str;
    }

    public final InterfaceC6738e getAppEventListener() {
        return this.zzg;
    }

    public final AbstractC6560l getFullScreenContentCallback() {
        return this.zzh;
    }

    public final InterfaceC6565q getOnPaidEventListener() {
        return null;
    }

    public final long getPlacementId() {
        AtomicLong atomicLong = this.zzj;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    InterfaceC3312Y interfaceC3312Y = this.zzc;
                    if (interfaceC3312Y != null) {
                        long jZzU = interfaceC3312Y.zzU();
                        AtomicLong atomicLong2 = this.zzj;
                        atomicLong2.set(jZzU);
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

    @Override // p004A2.AbstractC0012a
    public final C6571w getResponseInfo() {
        InterfaceC3328c1 interfaceC3328c1Zzt = null;
        try {
            InterfaceC3312Y interfaceC3312Y = this.zzc;
            if (interfaceC3312Y != null) {
                interfaceC3328c1Zzt = interfaceC3312Y.zzt();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
        return C6571w.m27862f(interfaceC3328c1Zzt);
    }

    public final void setAppEventListener(InterfaceC6738e interfaceC6738e) {
        try {
            this.zzg = interfaceC6738e;
            InterfaceC3312Y interfaceC3312Y = this.zzc;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzi(interfaceC6738e != null ? new zzayx(interfaceC6738e) : null);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p004A2.AbstractC0012a
    public final void setFullScreenContentCallback(AbstractC6560l abstractC6560l) {
        try {
            this.zzh = abstractC6560l;
            InterfaceC3312Y interfaceC3312Y = this.zzc;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzS(new BinderC3253E(abstractC6560l));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p004A2.AbstractC0012a
    public final void setImmersiveMode(boolean z7) {
        try {
            InterfaceC3312Y interfaceC3312Y = this.zzc;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzK(z7);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void setOnPaidEventListener(InterfaceC6565q interfaceC6565q) {
        try {
            InterfaceC3312Y interfaceC3312Y = this.zzc;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzP(new BinderC3293R1(interfaceC6565q));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void setPlacementId(long j7) {
        try {
            InterfaceC3312Y interfaceC3312Y = this.zzc;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzT(j7);
                this.zzj.set(j7);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p004A2.AbstractC0012a
    public final void show(Activity activity) {
        if (activity == null) {
            AbstractC7599p.m33331f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            InterfaceC3312Y interfaceC3312Y = this.zzc;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzR(BinderC3773b.m18221N0(activity));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void zza(C3368m1 c3368m1, AbstractC6553e abstractC6553e) {
        try {
            InterfaceC3312Y interfaceC3312Y = this.zzc;
            if (interfaceC3312Y != null) {
                c3368m1.m17284o(this.zzf);
                interfaceC3312Y.zzQ(this.zzb.m17269a(this.zza, c3368m1), new BinderC3329c2(abstractC6553e, this));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            abstractC6553e.onAdFailedToLoad(new C6561m(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    public zzbmg(Context context, String str) {
        zzbot zzbotVar = new zzbot();
        this.zze = zzbotVar;
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = C3365l2.f14001a;
        this.zzc = C3244B.m17191b().m17346b(context, new C3369m2(), str, zzbotVar);
    }

    public zzbmg(Context context, String str, InterfaceC3312Y interfaceC3312Y) {
        C3365l2 c3365l2 = C3365l2.f14001a;
        this.zze = new zzbot();
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = c3365l2;
        this.zzc = interfaceC3312Y;
    }
}
