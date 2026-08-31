package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzexp implements zzgoq {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ zzexq zzd;
    final /* synthetic */ zzext zze;

    zzexp(zzext zzextVar, zzelx zzelxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzexq zzexqVar) {
        this.zza = zzelxVar;
        this.zzb = zzfibVar;
        this.zzc = zzfhrVar;
        this.zzd = zzexqVar;
        Objects.requireNonNull(zzextVar);
        this.zze = zzextVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfib zzfibVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgk)).booleanValue()) {
            AbstractC3490o0.m17546l("App open ad failed to load", th);
        }
        zzext zzextVar = this.zze;
        zzcnu zzcnuVar = (zzcnu) zzextVar.zzj().zzd();
        final C3324b1 c3324b1Zzb = zzcnuVar == null ? zzfee.zzb(th, null) : zzcnuVar.zza().zzg(th);
        synchronized (zzextVar) {
            try {
                zzextVar.zzl(null);
                if (zzcnuVar != null) {
                    zzcnuVar.zze().zzdN(c3324b1Zzb);
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zziU)).booleanValue()) {
                        zzextVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexo
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze.zzi().zzdN(c3324b1Zzb);
                            }
                        });
                    }
                } else {
                    zzextVar.zzi().zzdN(c3324b1Zzb);
                    ((zzcnu) zzextVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
                }
                zzfdz.zza(c3324b1Zzb.f13918a, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                    zzfie zzfieVarZzk = zzextVar.zzk();
                    zzfhr zzfhrVar = this.zzc;
                    zzfhrVar.zzh(c3324b1Zzb);
                    zzfhrVar.zzj(th);
                    zzfhrVar.zzd(false);
                    zzfieVarZzk.zzb(zzfhrVar.zzm());
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
        zzext zzextVar = this.zze;
        zzcqs zzcqsVar = (zzcqs) obj;
        synchronized (zzextVar) {
            if (zzcqsVar != null) {
                try {
                    zzcqsVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzextVar.zzl(null);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zziU)).booleanValue()) {
                zzcqsVar.zzq().zzc(zzextVar.zzi());
            }
            this.zza.zzb(zzcqsVar);
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzfieVarZzk = zzextVar.zzk();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzg(zzcqsVar.zzr().zzb);
                zzfhrVar.zzi(zzcqsVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzfieVarZzk.zzb(zzfhrVar.zzm());
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
