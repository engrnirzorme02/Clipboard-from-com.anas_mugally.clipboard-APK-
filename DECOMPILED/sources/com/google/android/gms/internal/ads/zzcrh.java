package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcrh {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final InterfaceFutureC1673e zzc;
    private volatile boolean zzd = true;

    public zzcrh(Executor executor, ScheduledExecutorService scheduledExecutorService, InterfaceFutureC1673e interfaceFutureC1673e) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = interfaceFutureC1673e;
    }

    public final void zza(zzgoq zzgoqVar) {
        zzgot.zzq(this.zzc, new zzcrb(this, zzgoqVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(zzgoq zzgoqVar, InterfaceFutureC1673e interfaceFutureC1673e, zzcqs zzcqsVar) {
        if (zzcqsVar != null) {
            zzgoqVar.zzb(zzcqsVar);
        }
        return zzgot.zzi(interfaceFutureC1673e, ((Long) zzbew.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    final /* synthetic */ void zze(List list, final zzgoq zzgoqVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgoqVar.zza(new zzdwz(3));
                }
            });
            return;
        }
        InterfaceFutureC1673e interfaceFutureC1673eZza = zzgot.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final InterfaceFutureC1673e interfaceFutureC1673e = (InterfaceFutureC1673e) it.next();
            zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzcrd
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                    zzgoqVar.zza((Throwable) obj);
                    return zzgot.zza(null);
                }
            };
            Executor executor = this.zza;
            interfaceFutureC1673eZza = zzgot.zzj(zzgot.zzh(interfaceFutureC1673eZza, Throwable.class, zzgobVar, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzcre
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                    return this.zza.zzc(zzgoqVar, interfaceFutureC1673e, (zzcqs) obj);
                }
            }, executor);
        }
        zzgot.zzq(interfaceFutureC1673eZza, new zzcrc(this, zzgoqVar), this.zza);
    }

    final /* synthetic */ void zzf() {
        zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
