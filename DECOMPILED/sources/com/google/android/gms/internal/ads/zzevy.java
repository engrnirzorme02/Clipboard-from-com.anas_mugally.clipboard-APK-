package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevy implements zzeup {
    private final zzbyv zza;
    private final ScheduledExecutorService zzb;
    private final zzgpd zzc;

    zzevy(String str, zzbak zzbakVar, zzbyv zzbyvVar, ScheduledExecutorService scheduledExecutorService, zzgpd zzgpdVar) {
        this.zza = zzbyvVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdo)).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdt)).booleanValue()) {
                InterfaceFutureC1673e interfaceFutureC1673eZza = zzftu.zza(Tasks.forResult(null), null);
                zzgpd zzgpdVar = this.zzc;
                InterfaceFutureC1673e interfaceFutureC1673eZzj = zzgot.zzj(interfaceFutureC1673eZza, zzevx.zza, zzgpdVar);
                if (((Boolean) zzbdv.zza.zze()).booleanValue()) {
                    interfaceFutureC1673eZzj = zzgot.zzi(interfaceFutureC1673eZzj, ((Long) zzbdv.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgot.zzg(interfaceFutureC1673eZzj, Exception.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzevw
                    @Override // com.google.android.gms.internal.ads.zzggr
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzgpdVar);
            }
        }
        return zzgot.zza(new zzevz(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 43;
    }

    final /* synthetic */ zzevz zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzevz(null, -1);
    }
}
