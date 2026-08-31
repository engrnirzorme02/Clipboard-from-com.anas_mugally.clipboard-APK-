package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgon extends zzgjr implements Future {
    protected zzgon() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z7) {
        return zza().cancel(z7);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return zza().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zza().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zza().isDone();
    }

    protected abstract Future zza();

    @Override // com.google.android.gms.internal.ads.zzgjr
    protected /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return zza().get(j7, timeUnit);
    }
}
