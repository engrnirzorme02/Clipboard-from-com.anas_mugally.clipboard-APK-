package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvy implements zzhpx {
    private final zzhqg zza;

    private zzdvy(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdvy zza(zzhqg zzhqgVar) {
        return new zzdvy(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdwv(((zzchd) this.zza).zza());
    }
}
