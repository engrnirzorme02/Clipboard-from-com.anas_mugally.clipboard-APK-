package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcsp implements zzhpx {
    private final zzhqg zza;

    private zzcsp(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzcsp zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcsp(zzhqgVar, zzhqgVar2);
    }

    public static zzddr zzc(zzcmu zzcmuVar, Executor executor) {
        return new zzddr(zzcmuVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzcmu) this.zza.zzb(), zzfgc.zzc());
    }
}
