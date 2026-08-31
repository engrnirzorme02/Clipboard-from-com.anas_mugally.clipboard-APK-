package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepd implements zzeup {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final InterfaceC3750e zzc;
    private final Executor zzd;
    private final zzeup zze;
    private final long zzf;
    private final zzdsm zzg;

    public zzepd(zzeup zzeupVar, long j7, InterfaceC3750e interfaceC3750e, Executor executor, zzdsm zzdsmVar) {
        this.zzc = interfaceC3750e;
        this.zze = zzeupVar;
        this.zzf = j7;
        this.zzd = executor;
        this.zzg = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        zzepa zzepaVar;
        zzepa zzepaVar2;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmC)).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmB)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzbzh.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzepc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzc();
                    }
                };
                long j7 = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j7, j7, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.zza;
                    zzepaVar = (zzepa) atomicReference.get();
                    if (zzepaVar == null) {
                        zzepa zzepaVar3 = new zzepa(this.zze.zza(), this.zzf, this.zzc);
                        atomicReference.set(zzepaVar3);
                        return zzepaVar3.zza;
                    }
                    if (!((Boolean) this.zzb.get()).booleanValue() && zzepaVar.zza()) {
                        InterfaceFutureC1673e interfaceFutureC1673e = zzepaVar.zza;
                        zzeup zzeupVar = this.zze;
                        zzepaVar2 = new zzepa(zzeupVar.zza(), this.zzf, this.zzc);
                        this.zza.set(zzepaVar2);
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmD)).booleanValue()) {
                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmE)).booleanValue()) {
                                zzdsl zzdslVarZza = this.zzg.zza();
                                zzdslVarZza.zzc("action", "scs");
                                zzdslVarZza.zzc("sid", String.valueOf(zzeupVar.zzb()));
                                zzdslVarZza.zzd();
                            }
                            return interfaceFutureC1673e;
                        }
                        zzepaVar = zzepaVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzepaVar = (zzepa) atomicReference2.get();
            if (zzepaVar == null || zzepaVar.zza()) {
                zzeup zzeupVar2 = this.zze;
                zzepaVar2 = new zzepa(zzeupVar2.zza(), this.zzf, this.zzc);
                atomicReference2.set(zzepaVar2);
                zzepaVar = zzepaVar2;
            }
        }
        return zzepaVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return this.zze.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }

    final /* synthetic */ void zzd() {
        this.zza.set(new zzepa(this.zze.zza(), this.zzf, this.zzc));
    }
}
