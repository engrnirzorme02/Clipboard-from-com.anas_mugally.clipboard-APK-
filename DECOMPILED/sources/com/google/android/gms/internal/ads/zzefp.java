package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefp extends zzbvr implements zzcxc {
    private zzbvs zza;
    private zzcxb zzb;
    private zzdek zzc;

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zza(zzcxb zzcxbVar) {
        this.zzb = zzcxbVar;
    }

    public final synchronized void zzc(zzbvs zzbvsVar) {
        this.zza = zzbvsVar;
    }

    public final synchronized void zzd(zzdek zzdekVar) {
        this.zzc = zzdekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zze(InterfaceC3772a interfaceC3772a) {
        zzdek zzdekVar = this.zzc;
        if (zzdekVar != null) {
            final zzeec zzeecVar = ((zzeip) zzdekVar).zzc;
            final zzfcj zzfcjVar = ((zzeip) zzdekVar).zzb;
            final zzfcu zzfcuVar = ((zzeip) zzdekVar).zza;
            final zzeip zzeipVar = (zzeip) zzdekVar;
            ((zzeip) zzdekVar).zzd.zzc().execute(new Runnable(zzeipVar, zzfcuVar, zzfcjVar, zzeecVar) { // from class: com.google.android.gms.internal.ads.zzeio
                private final /* synthetic */ zzfcu zza;
                private final /* synthetic */ zzfcj zzb;
                private final /* synthetic */ zzeec zzc;

                {
                    this.zza = zzfcuVar;
                    this.zzb = zzfcjVar;
                    this.zzc = zzeecVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeis.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzf(InterfaceC3772a interfaceC3772a, int i7) {
        zzdek zzdekVar = this.zzc;
        if (zzdekVar != null) {
            String str = ((zzeip) zzdekVar).zzc.zza;
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzg(InterfaceC3772a interfaceC3772a) {
        zzcxb zzcxbVar = this.zzb;
        if (zzcxbVar != null) {
            zzcxbVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzh(InterfaceC3772a interfaceC3772a) {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzi(InterfaceC3772a interfaceC3772a) {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzj(InterfaceC3772a interfaceC3772a) {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            zzbvsVar.zzj(interfaceC3772a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzk(InterfaceC3772a interfaceC3772a, zzbvt zzbvtVar) {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzd.zzb(zzbvtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzl(InterfaceC3772a interfaceC3772a) {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzm(InterfaceC3772a interfaceC3772a, int i7) {
        zzcxb zzcxbVar = this.zzb;
        if (zzcxbVar != null) {
            zzcxbVar.zzb(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzn(InterfaceC3772a interfaceC3772a) {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzo(InterfaceC3772a interfaceC3772a) {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzp(InterfaceC3772a interfaceC3772a) {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzd.zzb(null);
        }
    }
}
