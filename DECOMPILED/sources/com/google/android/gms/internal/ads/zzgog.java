package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgog extends zzgpa {
    private final Executor zza;
    final /* synthetic */ zzgoh zzb;

    zzgog(zzgoh zzgohVar, Executor executor) {
        Objects.requireNonNull(zzgohVar);
        this.zzb = zzgohVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgpa
    final boolean zzd() {
        return this.zzb.isDone();
    }

    final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e7) {
            this.zzb.zzb(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final void zzg(Throwable th) {
        zzgoh zzgohVar = this.zzb;
        zzgohVar.zzD(null);
        if (th instanceof ExecutionException) {
            zzgohVar.zzb(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzgohVar.cancel(false);
        } else {
            zzgohVar.zzb(th);
        }
    }
}
