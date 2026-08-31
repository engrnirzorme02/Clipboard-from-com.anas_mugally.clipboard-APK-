package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzfbs implements zzgoq {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ zzfbv zzd;
    final /* synthetic */ zzfbw zze;

    zzfbs(zzfbw zzfbwVar, zzelx zzelxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzfbv zzfbvVar) {
        this.zza = zzelxVar;
        this.zzb = zzfibVar;
        this.zzc = zzfhrVar;
        this.zzd = zzfbvVar;
        Objects.requireNonNull(zzfbwVar);
        this.zze = zzfbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfib zzfibVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgk)).booleanValue()) {
            AbstractC3490o0.m17546l("Rewarded ad failed to load", th);
        }
        zzfbw zzfbwVar = this.zze;
        zzdor zzdorVar = (zzdor) zzfbwVar.zzh().zzd();
        final C3324b1 c3324b1Zzb = zzdorVar == null ? zzfee.zzb(th, null) : zzdorVar.zza().zzg(th);
        synchronized (zzfbwVar) {
            try {
                if (zzdorVar != null) {
                    zzdorVar.zze().zzdN(c3324b1Zzb);
                    zzfbwVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbr
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdN(c3324b1Zzb);
                        }
                    });
                } else {
                    zzfbwVar.zzg().zzdN(c3324b1Zzb);
                    zzfbwVar.zze(this.zzd).zzh().zza().zzd().zzo();
                }
                zzfdz.zza(c3324b1Zzb.f13918a, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                    zzfie zzfieVarZzi = zzfbwVar.zzi();
                    zzfhr zzfhrVar = this.zzc;
                    zzfhrVar.zzh(c3324b1Zzb);
                    zzfhrVar.zzj(th);
                    zzfhrVar.zzd(false);
                    zzfieVarZzi.zzb(zzfhrVar.zzm());
                } else {
                    zzfibVar.zzf(c3324b1Zzb);
                    zzfhr zzfhrVar2 = this.zzc;
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
        zzfbw zzfbwVar = this.zze;
        zzdom zzdomVar = (zzdom) obj;
        synchronized (zzfbwVar) {
            if (zzdomVar != null) {
                try {
                    zzdomVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzdomVar.zzq().zzd(zzfbwVar.zzg());
            this.zza.zzb(zzdomVar);
            Executor executorZzf = zzfbwVar.zzf();
            final zzfbn zzfbnVarZzg = zzfbwVar.zzg();
            Objects.requireNonNull(zzfbnVarZzg);
            executorZzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfbnVarZzg.zzg();
                }
            });
            zzfbwVar.zzg().onAdMetadataChanged();
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzfieVarZzi = zzfbwVar.zzi();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzg(zzdomVar.zzr().zzb);
                zzfhrVar.zzi(zzdomVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzfieVarZzi.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zze(zzdomVar.zzr().zzb);
                zzfibVar.zzg(zzdomVar.zzn().zze());
                zzfhr zzfhrVar2 = this.zzc;
                zzfhrVar2.zzd(true);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }
}
