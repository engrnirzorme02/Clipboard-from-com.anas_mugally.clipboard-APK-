package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdkq implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdkq(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdkq zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdkq(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkp((zzdpi) this.zza.zzb(), ((zzdhv) this.zzb).zza());
    }
}
