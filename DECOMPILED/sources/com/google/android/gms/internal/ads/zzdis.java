package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdis implements zzhpx {
    private final zzhqg zza;

    private zzdis(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdis zza(zzhqg zzhqgVar) {
        return new zzdis(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdir(((zzdid) this.zza).zzb());
    }
}
