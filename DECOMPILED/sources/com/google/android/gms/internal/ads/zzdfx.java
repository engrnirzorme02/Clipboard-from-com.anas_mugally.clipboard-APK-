package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdfx implements zzhpx {
    private final zzhqg zza;

    private zzdfx(zzdfe zzdfeVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzdfx zza(zzdfe zzdfeVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdfx(zzdfeVar, zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddr((zzdgu) this.zza.zzb(), zzfgc.zzc());
    }
}
