package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpv implements zzhpx {
    private final zzhqg zza;

    private zzdpv(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdpv zza(zzhqg zzhqgVar) {
        return new zzdpv(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdpu(((zzfte) this.zza).zzb());
    }
}
