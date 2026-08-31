package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgdz implements zzgoq {
    final /* synthetic */ zzgdy zza;

    zzgdz(zzgea zzgeaVar, zzgdy zzgdyVar) {
        this.zza = zzgdyVar;
        Objects.requireNonNull(zzgeaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzgdy zzgdyVar = this.zza;
        zzgdyVar.zzb(th);
        zzgdyVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}
