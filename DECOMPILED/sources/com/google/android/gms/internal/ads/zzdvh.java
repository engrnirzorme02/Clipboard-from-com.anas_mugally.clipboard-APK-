package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvh implements zzhpx {
    private final zzhqg zza;

    private zzdvh(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzdvh zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdvh(zzhqgVar, zzhqgVar2);
    }

    public static zzddr zzc(zzdvg zzdvgVar, Executor executor) {
        return new zzddr(zzdvgVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzdvg) this.zza.zzb(), zzfgc.zzc());
    }
}
