package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AbstractBinderC3336e1;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.internal.client.InterfaceC3352i1;
import com.google.android.gms.common.util.AbstractC3751f;
import java.util.HashMap;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcfq extends AbstractBinderC3336e1 {
    private final zzcbd zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private InterfaceC3352i1 zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbhe zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcfq(zzcbd zzcbdVar, float f7, boolean z7, boolean z8) {
        this.zza = zzcbdVar;
        this.zzi = f7;
        this.zzc = z7;
        this.zzd = z8;
    }

    private final void zzw(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzt(map2);
            }
        });
    }

    private final void zzx(final int i7, final int i8, final boolean z7, final boolean z8) {
        zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(i7, i8, z7, z8);
            }
        });
    }

    public final void zzc(C3321a2 c3321a2) {
        Object obj = this.zzb;
        boolean z7 = c3321a2.f13911b;
        boolean z8 = c3321a2.f13912c;
        synchronized (obj) {
            this.zzl = z7;
            this.zzm = z8;
        }
        boolean z9 = c3321a2.f13910a;
        zzw("initialState", AbstractC3751f.m18164c("muteStart", true != z9 ? "0" : "1", "customControlsRequested", true != z7 ? "0" : "1", "clickToExpandRequested", true != z8 ? "0" : "1"));
    }

    public final void zzd(float f7) {
        synchronized (this.zzb) {
            this.zzj = f7;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zze() {
        zzw("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zzf() {
        zzw("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zzg(boolean z7) {
        zzw(true != z7 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final boolean zzh() {
        boolean z7;
        synchronized (this.zzb) {
            z7 = this.zzh;
        }
        return z7;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final int zzi() {
        int i7;
        synchronized (this.zzb) {
            i7 = this.zze;
        }
        return i7;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final float zzj() {
        float f7;
        synchronized (this.zzb) {
            f7 = this.zzi;
        }
        return f7;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final float zzk() {
        float f7;
        synchronized (this.zzb) {
            f7 = this.zzj;
        }
        return f7;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zzl(InterfaceC3352i1 interfaceC3352i1) {
        synchronized (this.zzb) {
            this.zzf = interfaceC3352i1;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final float zzm() {
        float f7;
        synchronized (this.zzb) {
            f7 = this.zzk;
        }
        return f7;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final boolean zzn() {
        boolean z7;
        synchronized (this.zzb) {
            try {
                z7 = false;
                if (this.zzc && this.zzl) {
                    z7 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final InterfaceC3352i1 zzo() {
        InterfaceC3352i1 interfaceC3352i1;
        synchronized (this.zzb) {
            interfaceC3352i1 = this.zzf;
        }
        return interfaceC3352i1;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final boolean zzp() {
        boolean z7;
        Object obj = this.zzb;
        boolean zZzn = zzn();
        synchronized (obj) {
            z7 = false;
            if (!zZzn) {
                try {
                    if (this.zzm && this.zzd) {
                        z7 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z7;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zzq() {
        zzw("stop", null);
    }

    public final void zzr() {
        boolean z7;
        int i7;
        synchronized (this.zzb) {
            z7 = this.zzh;
            i7 = this.zze;
            this.zze = 3;
        }
        zzx(i7, 3, z7, z7);
    }

    public final void zzs(float f7, float f8, int i7, boolean z7, float f9) {
        boolean z8;
        boolean z9;
        int i8;
        synchronized (this.zzb) {
            try {
                z8 = true;
                if (f8 == this.zzi && f9 == this.zzk) {
                    z8 = false;
                }
                this.zzi = f8;
                if (!((Boolean) C3250D.m17200c().zzd(zzbci.zznD)).booleanValue()) {
                    this.zzj = f7;
                }
                z9 = this.zzh;
                this.zzh = z7;
                i8 = this.zze;
                this.zze = i7;
                float f10 = this.zzk;
                this.zzk = f9;
                if (Math.abs(f9 - f10) > 1.0E-4f) {
                    this.zza.zzE().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            try {
                zzbhe zzbheVar = this.zzn;
                if (zzbheVar != null) {
                    zzbheVar.zze();
                }
            } catch (RemoteException e7) {
                AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            }
        }
        zzx(i8, i7, z9, z7);
    }

    final /* synthetic */ void zzt(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    final /* synthetic */ void zzu(int i7, int i8, boolean z7, boolean z8) {
        int i9;
        boolean z9;
        boolean z10;
        InterfaceC3352i1 interfaceC3352i1;
        InterfaceC3352i1 interfaceC3352i2;
        InterfaceC3352i1 interfaceC3352i3;
        synchronized (this.zzb) {
            try {
                boolean z11 = this.zzg;
                if (z11 || i8 != 1) {
                    i9 = i8;
                    z9 = false;
                } else {
                    i8 = 1;
                    i9 = 1;
                    z9 = true;
                }
                boolean z12 = i7 != i8;
                if (z12 && i9 == 1) {
                    z10 = true;
                    i9 = 1;
                } else {
                    z10 = false;
                }
                boolean z13 = z12 && i9 == 2;
                boolean z14 = z12 && i9 == 3;
                this.zzg = z11 || z9;
                if (z9) {
                    try {
                        InterfaceC3352i1 interfaceC3352i4 = this.zzf;
                        if (interfaceC3352i4 != null) {
                            interfaceC3352i4.zze();
                        }
                    } catch (RemoteException e7) {
                        AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                    }
                }
                if (z10 && (interfaceC3352i3 = this.zzf) != null) {
                    interfaceC3352i3.zzf();
                }
                if (z13 && (interfaceC3352i2 = this.zzf) != null) {
                    interfaceC3352i2.zzg();
                }
                if (z14) {
                    InterfaceC3352i1 interfaceC3352i5 = this.zzf;
                    if (interfaceC3352i5 != null) {
                        interfaceC3352i5.zzh();
                    }
                    this.zza.zzz();
                }
                if (z7 != z8 && (interfaceC3352i1 = this.zzf) != null) {
                    interfaceC3352i1.zzi(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzv(zzbhe zzbheVar) {
        synchronized (this.zzb) {
            this.zzn = zzbheVar;
        }
    }
}
