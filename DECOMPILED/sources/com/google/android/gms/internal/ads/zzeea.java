package com.google.android.gms.internal.ads;

import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeea implements zzedz {
    public final zzedz zza;
    private final zzggr zzb;

    public zzeea(zzedz zzedzVar, zzggr zzggrVar) {
        this.zza = zzedzVar;
        this.zzb = zzggrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        return this.zza.zza(zzfcuVar, zzfcjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final InterfaceFutureC1673e zzb(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        return zzgot.zzk(this.zza.zzb(zzfcuVar, zzfcjVar), this.zzb, zzbzh.zza);
    }
}
