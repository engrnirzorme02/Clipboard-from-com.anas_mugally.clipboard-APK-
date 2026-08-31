package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzeyt implements zzgoq {
    final /* synthetic */ zzfib zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzcpp zzc;
    final /* synthetic */ zzeyx zzd;

    zzeyt(zzeyx zzeyxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzcpp zzcppVar) {
        this.zza = zzfibVar;
        this.zzb = zzfhrVar;
        this.zzc = zzcppVar;
        Objects.requireNonNull(zzeyxVar);
        this.zzd = zzeyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfib zzfibVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgk)).booleanValue()) {
            AbstractC3490o0.m17546l("Banner ad failed to load", th);
        }
        zzeyx zzeyxVar = this.zzd;
        synchronized (zzeyxVar) {
            try {
                zzcpp zzcppVar = this.zzc;
                C3324b1 c3324b1Zzg = zzcppVar.zzc().zzg(th);
                zzeyxVar.zzs(c3324b1Zzg);
                zzcppVar.zzb().zzdN(c3324b1Zzg);
                zzfdz.zza(c3324b1Zzg.f13918a, th, "BannerAdLoader.onFailure");
                if (zzeyxVar.zzr()) {
                    zzeyxVar.zzn();
                    zzeyxVar.zzo().zzd(zzeyxVar.zzq().zzc());
                }
                if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zza) == null) {
                    zzfie zzfieVarZzp = zzeyxVar.zzp();
                    zzfhr zzfhrVar = this.zzb;
                    zzfhrVar.zzh(c3324b1Zzg);
                    zzfhrVar.zzj(th);
                    zzfhrVar.zzd(false);
                    zzfieVarZzp.zzb(zzfhrVar.zzm());
                } else {
                    zzfibVar.zzf(c3324b1Zzg);
                    zzfhr zzfhrVar2 = this.zzb;
                    zzfhrVar2.zzj(th);
                    zzfhrVar2.zzd(false);
                    zzfibVar.zza(zzfhrVar2);
                    zzfibVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfib zzfibVar;
        zzeyx zzeyxVar = this.zzd;
        zzcok zzcokVar = (zzcok) obj;
        synchronized (zzeyxVar) {
            if (zzcokVar != null) {
                try {
                    zzcokVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zzeyxVar.zzr()) {
                zzeyxVar.zzc();
            }
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zza) == null) {
                zzfie zzfieVarZzp = zzeyxVar.zzp();
                zzfhr zzfhrVar = this.zzb;
                zzfhrVar.zzg(zzcokVar.zzr().zzb);
                zzfhrVar.zzi(zzcokVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzfieVarZzp.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zze(zzcokVar.zzr().zzb);
                zzfibVar.zzg(zzcokVar.zzn().zze());
                zzfhr zzfhrVar2 = this.zzb;
                zzfhrVar2.zzd(true);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }
}
