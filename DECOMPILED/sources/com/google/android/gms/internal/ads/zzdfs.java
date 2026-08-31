package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdfs implements zzhpx {
    private final zzdfe zza;
    private final zzhqg zzb;

    private zzdfs(zzdfe zzdfeVar, zzhqg zzhqgVar) {
        this.zza = zzdfeVar;
        this.zzb = zzhqgVar;
    }

    public static zzdfs zza(zzdfe zzdfeVar, zzhqg zzhqgVar) {
        return new zzdfs(zzdfeVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZze = this.zza.zze((zzcuj) this.zzb.zzb());
        zzhqf.zzb(setZze);
        return setZze;
    }
}
