package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgpp extends zzgok {
    private InterfaceFutureC1673e zza;
    private ScheduledFuture zzb;

    private zzgpp(InterfaceFutureC1673e interfaceFutureC1673e) {
        interfaceFutureC1673e.getClass();
        this.zza = interfaceFutureC1673e;
    }

    static InterfaceFutureC1673e zze(InterfaceFutureC1673e interfaceFutureC1673e, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgpp zzgppVar = new zzgpp(interfaceFutureC1673e);
        zzgpn zzgpnVar = new zzgpn(zzgppVar);
        zzgppVar.zzb = scheduledExecutorService.schedule(zzgpnVar, j7, timeUnit);
        interfaceFutureC1673e.addListener(zzgpnVar, zzgoi.INSTANCE);
        return zzgppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final String zzd() {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (interfaceFutureC1673e == null) {
            return null;
        }
        String string = interfaceFutureC1673e.toString();
        StringBuilder sb = new StringBuilder(string.length() + 14);
        sb.append("inputFuture=[");
        sb.append(string);
        sb.append("]");
        String string2 = sb.toString();
        if (scheduledFuture == null) {
            return string2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return string2;
        }
        StringBuilder sb2 = new StringBuilder(string2.length() + 19 + String.valueOf(delay).length() + 4);
        sb2.append(string2);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    final /* synthetic */ InterfaceFutureC1673e zzf() {
        return this.zza;
    }

    final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }
}
