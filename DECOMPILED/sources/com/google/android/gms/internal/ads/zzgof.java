package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzgof extends zzgog {
    final /* synthetic */ zzgoh zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgof(zzgoh zzgohVar, Callable callable, Executor executor) {
        super(zzgohVar, executor);
        Objects.requireNonNull(zzgohVar);
        this.zza = zzgohVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final Object zza() {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgog
    final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final String zzc() {
        return this.zzc.toString();
    }
}
