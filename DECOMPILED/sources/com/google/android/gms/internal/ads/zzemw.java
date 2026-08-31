package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemw implements zzeup {
    private final InterfaceFutureC1673e zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    zzemw(InterfaceFutureC1673e interfaceFutureC1673e, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = interfaceFutureC1673e;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zza;
        zzemv zzemvVar = zzemv.zza;
        Executor executor = this.zzb;
        InterfaceFutureC1673e interfaceFutureC1673eZzj = zzgot.zzj(interfaceFutureC1673e, zzemvVar, executor);
        zzbbz zzbbzVar = zzbci.zznn;
        if (((Integer) C3250D.m17200c().zzd(zzbbzVar)).intValue() > 0) {
            interfaceFutureC1673eZzj = zzgot.zzi(interfaceFutureC1673eZzj, ((Integer) C3250D.m17200c().zzd(zzbbzVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgot.zzh(interfaceFutureC1673eZzj, Throwable.class, zzemu.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 6;
    }
}
