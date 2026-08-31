package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgnp extends AbstractExecutorService implements zzgpd {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzgps.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (InterfaceFutureC1673e) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgpd
    /* JADX INFO: renamed from: zza */
    public final InterfaceFutureC1673e submit(Runnable runnable) {
        return (InterfaceFutureC1673e) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgpd
    /* JADX INFO: renamed from: zzb */
    public final InterfaceFutureC1673e submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC1673e) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpd
    /* JADX INFO: renamed from: zzc */
    public final InterfaceFutureC1673e submit(Callable callable) {
        return (InterfaceFutureC1673e) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new zzgps(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC1673e) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    public final /* synthetic */ Future submit(Callable callable) {
        return (InterfaceFutureC1673e) super.submit(callable);
    }
}
