package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdey implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdey(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdey zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdey(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdex((zzdpu) this.zza.zzb(), ((zzcrl) this.zzb).zza());
    }
}
