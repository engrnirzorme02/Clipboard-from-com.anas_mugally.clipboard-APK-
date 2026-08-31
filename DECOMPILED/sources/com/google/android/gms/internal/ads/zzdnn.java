package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdnn implements zzgoq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbjl zzb;

    zzdnn(zzdnx zzdnxVar, String str, zzbjl zzbjlVar) {
        this.zza = str;
        this.zzb = zzbjlVar;
        Objects.requireNonNull(zzdnxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcek) obj).zzab(this.zza, this.zzb);
    }
}
