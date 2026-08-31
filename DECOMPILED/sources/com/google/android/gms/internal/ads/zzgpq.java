package com.google.android.gms.internal.ads;

import java.util.Objects;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgpq extends zzgpa {
    final /* synthetic */ zzgps zza;
    private final zzgoa zzb;

    zzgpq(zzgps zzgpsVar, zzgoa zzgoaVar) {
        Objects.requireNonNull(zzgpsVar);
        this.zza = zzgpsVar;
        this.zzb = zzgoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final /* bridge */ /* synthetic */ Object zza() {
        zzgoa zzgoaVar = this.zzb;
        InterfaceFutureC1673e interfaceFutureC1673eZza = zzgoaVar.zza();
        zzghc.zzl(interfaceFutureC1673eZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgoaVar);
        return interfaceFutureC1673eZza;
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
    final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((InterfaceFutureC1673e) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
