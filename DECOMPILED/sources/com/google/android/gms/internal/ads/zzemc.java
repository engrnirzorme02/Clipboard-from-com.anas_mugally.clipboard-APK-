package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzemc implements zzgoq {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ zzdhd zzd;
    final /* synthetic */ zzemf zze;

    zzemc(zzemf zzemfVar, zzelx zzelxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzdhd zzdhdVar) {
        this.zza = zzelxVar;
        this.zzb = zzfibVar;
        this.zzc = zzfhrVar;
        this.zzd = zzdhdVar;
        Objects.requireNonNull(zzemfVar);
        this.zze = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfib zzfibVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgk)).booleanValue()) {
            AbstractC3490o0.m17546l("Native ad failed to load", th);
        }
        zzdhd zzdhdVar = this.zzd;
        final C3324b1 c3324b1Zzg = zzdhdVar.zza().zzg(th);
        zzdhdVar.zzb().zzdN(c3324b1Zzg);
        zzemf zzemfVar = this.zze;
        zzemfVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze.zzf().zze().zzdN(c3324b1Zzg);
            }
        });
        zzfdz.zza(c3324b1Zzg.f13918a, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
            zzfie zzfieVarZzg = zzemfVar.zzg();
            zzfhr zzfhrVar = this.zzc;
            zzfhrVar.zzh(c3324b1Zzg);
            zzfhrVar.zzj(th);
            zzfhrVar.zzd(false);
            zzfieVarZzg.zzb(zzfhrVar.zzm());
            return;
        }
        zzfibVar.zzf(c3324b1Zzg);
        zzfhr zzfhrVar2 = this.zzc;
        zzfhrVar2.zzj(th);
        zzfhrVar2.zzd(false);
        zzfibVar.zza(zzfhrVar2);
        zzfibVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfib zzfibVar;
        zzemf zzemfVar = this.zze;
        zzcqs zzcqsVar = (zzcqs) obj;
        synchronized (zzemfVar) {
            if (zzcqsVar != null) {
                try {
                    zzcqsVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzcqsVar.zzq().zza(zzemfVar.zzf().zzc());
            this.zza.zzb(zzcqsVar);
            zzemfVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze.zzf().zzd().zzg();
                }
            });
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzfieVarZzg = zzemfVar.zzg();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzg(zzcqsVar.zzr().zzb);
                zzfhrVar.zzi(zzcqsVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzfieVarZzg.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zze(zzcqsVar.zzr().zzb);
                zzfibVar.zzg(zzcqsVar.zzn().zze());
                zzfhr zzfhrVar2 = this.zzc;
                zzfhrVar2.zzd(true);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }
}
