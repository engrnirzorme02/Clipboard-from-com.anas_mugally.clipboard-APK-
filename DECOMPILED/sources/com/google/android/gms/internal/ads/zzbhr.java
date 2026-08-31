package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AbstractBinderC3269J0;
import com.google.android.gms.ads.internal.client.C3275L0;
import com.google.android.gms.ads.internal.client.InterfaceC3272K0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.ArrayList;
import java.util.List;
import p314o2.C6573y;
import p340r2.AbstractC6886d;
import p340r2.AbstractC6890h;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhr extends AbstractC6890h {
    private final zzbhq zza;
    private final zzbfx zzc;
    private final List zzb = new ArrayList();
    private final C6573y zzd = new C6573y();
    private final List zze = new ArrayList();

    public zzbhr(zzbhq zzbhqVar) {
        zzbfw zzbfuVar;
        IBinder iBinder;
        this.zza = zzbhqVar;
        zzbfx zzbfxVar = null;
        try {
            List listZzf = zzbhqVar.zzf();
            if (listZzf != null) {
                for (Object obj : listZzf) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzbfuVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbfuVar = iInterfaceQueryLocalInterface instanceof zzbfw ? (zzbfw) iInterfaceQueryLocalInterface : new zzbfu(iBinder);
                    }
                    if (zzbfuVar != null) {
                        this.zzb.add(new zzbfx(zzbfuVar));
                    }
                }
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
        try {
            List listZzz = this.zza.zzz();
            if (listZzz != null) {
                for (Object obj2 : listZzz) {
                    InterfaceC3272K0 interfaceC3272K0M17210L0 = obj2 instanceof IBinder ? AbstractBinderC3269J0.m17210L0((IBinder) obj2) : null;
                    if (interfaceC3272K0M17210L0 != null) {
                        this.zze.add(new C3275L0(interfaceC3272K0M17210L0));
                    }
                }
            }
        } catch (RemoteException e8) {
            AbstractC7599p.m33329d("", e8);
        }
        try {
            zzbfw zzbfwVarZzh = this.zza.zzh();
            if (zzbfwVarZzh != null) {
                zzbfxVar = new zzbfx(zzbfwVarZzh);
            }
        } catch (RemoteException e9) {
            AbstractC7599p.m33329d("", e9);
        }
        this.zzc = zzbfxVar;
        try {
            if (this.zza.zzq() != null) {
                new zzbfq(this.zza.zzq());
            }
        } catch (RemoteException e10) {
            AbstractC7599p.m33329d("", e10);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzs(bundle);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzt(bundle);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    @Override // p340r2.AbstractC6890h
    public final String zza() {
        try {
            return this.zza.zze();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // p340r2.AbstractC6890h
    public final List zzb() {
        return this.zzb;
    }

    @Override // p340r2.AbstractC6890h
    public final String zzc() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // p340r2.AbstractC6890h
    public final AbstractC6886d zzd() {
        return this.zzc;
    }

    @Override // p340r2.AbstractC6890h
    public final String zze() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // p340r2.AbstractC6890h
    public final String zzf() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // p340r2.AbstractC6890h
    public final Double zzg() {
        try {
            double dZzk = this.zza.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // p340r2.AbstractC6890h
    public final String zzh() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // p340r2.AbstractC6890h
    public final String zzi() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // p340r2.AbstractC6890h
    public final C6573y zzj() {
        try {
            zzbhq zzbhqVar = this.zza;
            if (zzbhqVar.zzn() != null) {
                this.zzd.m27869b(zzbhqVar.zzn());
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Exception occurred while getting video controller", e7);
        }
        return this.zzd;
    }

    @Override // p340r2.AbstractC6890h
    public final Object zzk() {
        try {
            InterfaceC3772a interfaceC3772aZzv = this.zza.zzv();
            if (interfaceC3772aZzv != null) {
                return BinderC3773b.m18220M0(interfaceC3772aZzv);
            }
            return null;
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }
}
