package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzgpr extends zzgpa {
    final /* synthetic */ zzgps zza;
    private final Callable zzb;

    zzgpr(zzgps zzgpsVar, Callable callable) {
        Objects.requireNonNull(zzgpsVar);
        this.zza = zzgpsVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final Object zza() {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final void zzf(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
