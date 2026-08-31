package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxs implements zzhpx {
    private final zzhqg zza;

    private zzdxs(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzdxs zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdxs(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddr(((zzdze) this.zza).zzb(), zzfgc.zzc());
    }
}
