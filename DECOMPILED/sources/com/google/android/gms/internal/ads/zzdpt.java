package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpt implements zzhpx {
    private final zzhqg zza;

    private zzdpt(zzdps zzdpsVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdpt zza(zzdps zzdpsVar, zzhqg zzhqgVar) {
        return new zzdpt(zzdpsVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddr(((zzdpr) this.zza).zzb(), zzbzh.zzf);
    }
}
