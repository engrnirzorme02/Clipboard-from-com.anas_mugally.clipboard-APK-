package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzgpj extends zzgpf implements zzgpe {
    final ScheduledExecutorService zza;

    zzgpj(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzd */
    public final zzgpc schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgps zzgpsVarZze = zzgps.zze(runnable, null);
        return new zzgph(zzgpsVarZze, scheduledExecutorService.schedule(zzgpsVarZze, j7, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zze */
    public final zzgpc schedule(Callable callable, long j7, TimeUnit timeUnit) {
        zzgps zzgpsVar = new zzgps(callable);
        return new zzgph(zzgpsVar, this.zza.schedule(zzgpsVar, j7, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzf */
    public final zzgpc scheduleAtFixedRate(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        zzgpi zzgpiVar = new zzgpi(runnable);
        return new zzgph(zzgpiVar, this.zza.scheduleAtFixedRate(zzgpiVar, j7, j8, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzg */
    public final zzgpc scheduleWithFixedDelay(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        zzgpi zzgpiVar = new zzgpi(runnable);
        return new zzgph(zzgpiVar, this.zza.scheduleWithFixedDelay(zzgpiVar, j7, j8, timeUnit));
    }
}
