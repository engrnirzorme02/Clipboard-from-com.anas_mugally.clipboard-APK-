package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzelp implements zzelx {
    final /* synthetic */ zzelq zza;

    zzelp(zzelq zzelqVar) {
        Objects.requireNonNull(zzelqVar);
        this.zza = zzelqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        zzelq zzelqVar = this.zza;
        synchronized (zzelqVar) {
            zzelqVar.zzM(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzelq zzelqVar = this.zza;
        zzdfa zzdfaVar = (zzdfa) obj;
        synchronized (zzelqVar) {
            zzelqVar.zzM(zzdfaVar);
            zzelqVar.zzL().zzj();
        }
    }
}
