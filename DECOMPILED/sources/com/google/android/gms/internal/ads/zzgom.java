package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgom extends zzgol {
    private final InterfaceFutureC1673e zza;

    zzgom(InterfaceFutureC1673e interfaceFutureC1673e) {
        interfaceFutureC1673e.getClass();
        this.zza = interfaceFutureC1673e;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm, com.google.android.gms.internal.ads.zzgnn, p157U3.InterfaceFutureC1673e
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgnm, java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return this.zza.cancel(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzgnm, java.util.concurrent.Future
    public final Object get() {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgnm, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzgnm, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgnm, java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return this.zza.get(j7, timeUnit);
    }
}
