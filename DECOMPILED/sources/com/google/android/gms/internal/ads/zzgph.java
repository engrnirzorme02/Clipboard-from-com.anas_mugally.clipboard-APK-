package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgph extends zzgoo implements zzgpc {
    private final ScheduledFuture zza;

    zzgph(InterfaceFutureC1673e interfaceFutureC1673e, ScheduledFuture scheduledFuture) {
        super(interfaceFutureC1673e);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgon, java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        boolean zCancel = zza().cancel(z7);
        if (zCancel) {
            this.zza.cancel(z7);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
