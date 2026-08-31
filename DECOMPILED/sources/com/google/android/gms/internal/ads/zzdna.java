package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdna implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdna(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdna zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdna(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdmz((zzdip) this.zza.zzb(), ((zzdjm) this.zzb).zza());
    }
}
