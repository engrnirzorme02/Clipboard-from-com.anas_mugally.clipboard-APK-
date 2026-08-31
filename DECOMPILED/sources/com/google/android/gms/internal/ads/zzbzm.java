package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public class zzbzm implements InterfaceFutureC1673e {
    private final zzgpm zza = zzgpm.zze();

    private static final boolean zza(boolean z7) {
        if (!z7) {
            C7351t.m32354l().zzh(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z7;
    }

    @Override // p157U3.InterfaceFutureC1673e
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z7) {
        return this.zza.cancel(z7);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    public final boolean zzc(Object obj) {
        boolean zZza = this.zza.zza(obj);
        zza(zZza);
        return zZza;
    }

    public final boolean zzd(Throwable th) {
        boolean zZzb = this.zza.zzb(th);
        zza(zZzb);
        return zZzb;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return this.zza.get(j7, timeUnit);
    }
}
