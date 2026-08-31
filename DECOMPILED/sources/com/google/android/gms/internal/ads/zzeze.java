package com.google.android.gms.internal.ads;

import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzeze implements zzffk {
    private final zzfab zza;

    public zzeze(zzfab zzfabVar) {
        this.zza = zzfabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffk
    public final InterfaceFutureC1673e zza(zzffl zzfflVar) {
        zzezh zzezhVar = (zzezh) zzfflVar;
        return ((zzezd) this.zza).zzb(zzezhVar.zzb, zzezhVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzffk
    public final void zzb(zzffa zzffaVar) {
        zzffaVar.zza = ((zzezd) this.zza).zza();
    }
}
