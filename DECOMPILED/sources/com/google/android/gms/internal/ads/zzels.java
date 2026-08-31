package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzels implements zzelx {
    final /* synthetic */ zzelt zza;

    zzels(zzelt zzeltVar) {
        Objects.requireNonNull(zzeltVar);
        this.zza = zzeltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqs zzcqsVar = (zzcqs) obj;
        zzelt zzeltVar = this.zza;
        synchronized (zzeltVar) {
            zzeltVar.zze(zzcqsVar.zzn());
            zzcqsVar.zzj();
        }
    }
}
