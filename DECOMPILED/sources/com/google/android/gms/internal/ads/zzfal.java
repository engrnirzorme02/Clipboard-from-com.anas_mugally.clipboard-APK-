package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfal implements zzgoq {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ zzdgh zzd;
    final /* synthetic */ zzfan zze;

    zzfal(zzfan zzfanVar, zzelx zzelxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzdgh zzdghVar) {
        this.zza = zzelxVar;
        this.zzb = zzfibVar;
        this.zzc = zzfhrVar;
        this.zzd = zzdghVar;
        Objects.requireNonNull(zzfanVar);
        this.zze = zzfanVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfib zzfibVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgk)).booleanValue()) {
            AbstractC3490o0.m17546l("Interstitial ad failed to load", th);
        }
        zzdgh zzdghVar = this.zzd;
        final C3324b1 c3324b1Zzg = zzdghVar.zzb().zzg(th);
        zzfan zzfanVar = this.zze;
        synchronized (zzfanVar) {
            try {
                zzfanVar.zzi(null);
                zzdghVar.zza().zzdN(c3324b1Zzg);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zziV)).booleanValue()) {
                    zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfai
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzdN(c3324b1Zzg);
                        }
                    });
                    zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfaj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdN(c3324b1Zzg);
                        }
                    });
                }
                zzfdz.zza(c3324b1Zzg.f13918a, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                    zzfie zzfieVarZzh = zzfanVar.zzh();
                    zzfhr zzfhrVar = this.zzc;
                    zzfhrVar.zzh(c3324b1Zzg);
                    zzfhrVar.zzj(th);
                    zzfhrVar.zzd(false);
                    zzfieVarZzh.zzb(zzfhrVar.zzm());
                } else {
                    zzfibVar.zzf(c3324b1Zzg);
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
        zzfan zzfanVar = this.zze;
        zzdfa zzdfaVar = (zzdfa) obj;
        synchronized (zzfanVar) {
            if (zzdfaVar != null) {
                try {
                    zzdfaVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzfanVar.zzi(null);
            zzbbz zzbbzVar = zzbci.zziV;
            if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
                zzczi zzcziVarZzq = zzdfaVar.zzq();
                zzcziVarZzq.zza(zzfanVar.zzf());
                zzcziVarZzq.zzd(zzfanVar.zzg());
            }
            this.zza.zzb(zzdfaVar);
            if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
                zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfak
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzg();
                    }
                });
                zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfah
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzg().zzg();
                    }
                });
            }
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzfieVarZzh = zzfanVar.zzh();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzg(zzdfaVar.zzr().zzb);
                zzfhrVar.zzi(zzdfaVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzfieVarZzh.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zze(zzdfaVar.zzr().zzb);
                zzfibVar.zzg(zzdfaVar.zzn().zze());
                zzfhr zzfhrVar2 = this.zzc;
                zzfhrVar2.zzd(true);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }
}
