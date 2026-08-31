package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaaa implements zzabp {
    final /* synthetic */ zzsq zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzaae zzd;

    zzaaa(zzaae zzaaeVar, zzsq zzsqVar, int i7, long j7) {
        this.zza = zzsqVar;
        this.zzb = i7;
        this.zzc = j7;
        Objects.requireNonNull(zzaaeVar);
        this.zzd = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zza(long j7) {
        this.zzd.zzax(this.zza, this.zzb, this.zzc, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zzb() {
        this.zzd.zzau(this.zza, this.zzb, this.zzc);
    }
}
