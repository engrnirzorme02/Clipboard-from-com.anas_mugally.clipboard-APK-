package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdga implements zzhpx {
    private final zzdfe zza;
    private final zzhqg zzb;

    private zzdga(zzdfe zzdfeVar, zzhqg zzhqgVar) {
        this.zza = zzdfeVar;
        this.zzb = zzhqgVar;
    }

    public static zzdga zza(zzdfe zzdfeVar, zzhqg zzhqgVar) {
        return new zzdga(zzdfeVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzg((Executor) this.zzb.zzb());
    }
}
