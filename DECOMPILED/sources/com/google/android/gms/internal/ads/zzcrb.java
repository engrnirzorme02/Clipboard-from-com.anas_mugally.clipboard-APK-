package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcrb implements zzgoq {
    final /* synthetic */ zzgoq zza;
    final /* synthetic */ zzcrh zzb;

    zzcrb(zzcrh zzcrhVar, zzgoq zzgoqVar) {
        this.zza = zzgoqVar;
        Objects.requireNonNull(zzcrhVar);
        this.zzb = zzcrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        this.zza.zza(th);
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze(((zzcra) obj).zza, this.zza);
    }
}
