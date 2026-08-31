package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdkz implements zzhpx {
    private final zzhqg zza;

    private zzdkz(zzdky zzdkyVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdkz zza(zzdky zzdkyVar, zzhqg zzhqgVar) {
        return new zzdkz(zzdkyVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdkw zzdkwVar = (zzdkw) this.zza.zzb();
        zzhqf.zzb(zzdkwVar);
        return zzdkwVar;
    }
}
