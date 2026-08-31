package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdok implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdok(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdok zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdok(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdoj((zzcwz) this.zza.zzb(), ((zzcrj) this.zzb).zza());
    }
}
