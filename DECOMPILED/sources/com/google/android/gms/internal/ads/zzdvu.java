package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvu implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdvu(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdvu zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdvu(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdvn((zzdux) this.zza.zzb(), (zzdpz) this.zzb.zzb());
    }
}
