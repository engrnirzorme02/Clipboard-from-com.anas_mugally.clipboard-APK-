package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdtf implements zzhpx {
    private final zzdtb zza;
    private final zzhqg zzb;

    private zzdtf(zzdtb zzdtbVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzdtbVar;
        this.zzb = zzhqgVar;
    }

    public static zzdtf zza(zzdtb zzdtbVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdtf(zzdtbVar, zzhqgVar, zzhqgVar2);
    }

    public static Set zzc(zzdtb zzdtbVar, zzdtl zzdtlVar, Executor executor) {
        Set setZzd = zzdtb.zzd(zzdtlVar, executor);
        zzhqf.zzb(setZzd);
        return setZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzdtl) this.zzb.zzb(), zzfgc.zzc());
    }
}
