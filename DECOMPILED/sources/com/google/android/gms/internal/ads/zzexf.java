package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexf implements zzeup {
    private final zzbyv zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzgpd zzd;
    private final int zze;
    private final int zzf;

    zzexf(zzbyv zzbyvVar, boolean z7, zzbyl zzbylVar, zzgpd zzgpdVar, String str, ScheduledExecutorService scheduledExecutorService, int i7, int i8) {
        this.zza = zzbyvVar;
        this.zzb = z7;
        this.zzd = zzgpdVar;
        this.zzc = scheduledExecutorService;
        this.zze = i7;
        this.zzf = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        if ((!((Boolean) C3250D.m17200c().zzd(zzbci.zzhu)).booleanValue() || !this.zzb) && this.zzf != 2) {
            if (!Arrays.asList(((String) C3250D.m17200c().zzd(zzbci.zzhw)).split(",")).contains(String.valueOf(this.zze))) {
                return zzgot.zza(new zzexg(null));
            }
            InterfaceFutureC1673e interfaceFutureC1673eZza = zzgot.zza(null);
            zzgpd zzgpdVar = this.zzd;
            return zzgot.zzg(zzgot.zzi(zzgot.zzk(interfaceFutureC1673eZza, zzexe.zza, zzgpdVar), ((Long) zzbex.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzexd
                @Override // com.google.android.gms.internal.ads.zzggr
                public final /* synthetic */ Object apply(Object obj) {
                    return this.zza.zzc((Exception) obj);
                }
            }, zzgpdVar);
        }
        return zzgot.zza(new zzexg(null));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 50;
    }

    final /* synthetic */ zzexg zzc(Exception exc) {
        this.zza.zzg(exc, "TrustlessTokenSignal");
        return new zzexg(null);
    }
}
