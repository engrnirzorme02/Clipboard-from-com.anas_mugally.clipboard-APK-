package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzetb implements zzeup {
    private final zzeup zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzetb(zzeup zzeupVar, long j7, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeupVar;
        this.zzb = j7;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        InterfaceFutureC1673e interfaceFutureC1673eZza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcC)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j7 = this.zzb;
        if (j7 > 0) {
            interfaceFutureC1673eZza = zzgot.zzi(interfaceFutureC1673eZza, j7, timeUnit, this.zzc);
        }
        return zzgot.zzh(interfaceFutureC1673eZza, Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzeta
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, zzbzh.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return this.zza.zzb();
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(Throwable th) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcA)).booleanValue()) {
            zzeup zzeupVar = this.zza;
            zzbyv zzbyvVarM32354l = C7351t.m32354l();
            int iZzb = zzeupVar.zzb();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzb).length() + 22);
            sb.append("OptionalSignalTimeout:");
            sb.append(iZzb);
            zzbyvVarM32354l.zzg(th, sb.toString());
        }
        return zzgot.zza(null);
    }
}
