package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegu {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcqv zzc;
    private final zzehk zzd;
    private final zzfjr zze;
    private final zzgpm zzf = zzgpm.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzegv zzh;
    private zzfcu zzi;

    zzegu(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcqv zzcqvVar, zzehk zzehkVar, zzfjr zzfjrVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcqvVar;
        this.zzd = zzehkVar;
        this.zze = zzfjrVar;
    }

    private final synchronized InterfaceFutureC1673e zzd(zzfcj zzfcjVar) {
        Iterator it = zzfcjVar.zza.iterator();
        while (it.hasNext()) {
            zzedz zzedzVarZza = this.zzc.zza(zzfcjVar.zzb, (String) it.next());
            if (zzedzVarZza != null && zzedzVarZza.zza(this.zzi, zzfcjVar)) {
                return zzgot.zzi(zzedzVarZza.zzb(this.zzi, zzfcjVar), zzfcjVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgot.zzc(new zzdwz(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzfcj zzfcjVar) {
        InterfaceFutureC1673e interfaceFutureC1673eZzd = zzd(zzfcjVar);
        this.zzd.zze(this.zzi, zzfcjVar, interfaceFutureC1673eZzd, this.zze);
        zzgot.zzq(interfaceFutureC1673eZzd, new zzegt(this, zzfcjVar), this.zza);
    }

    public final synchronized InterfaceFutureC1673e zza(zzfcu zzfcuVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                List list = zzfcuVar.zzb.zza;
                if (list.isEmpty()) {
                    this.zzf.zzb(new zzeho(3, zzehr.zzb(zzfcuVar)));
                } else {
                    this.zzi = zzfcuVar;
                    zzehk zzehkVar = this.zzd;
                    this.zzh = new zzegv(zzfcuVar, zzehkVar, this.zzf);
                    zzehkVar.zzc(list);
                    zzfcj zzfcjVarZza = this.zzh.zza();
                    while (zzfcjVarZza != null) {
                        zzb(zzfcjVarZza);
                        zzfcjVarZza = this.zzh.zza();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzf;
    }

    final /* synthetic */ zzegv zzc() {
        return this.zzh;
    }
}
