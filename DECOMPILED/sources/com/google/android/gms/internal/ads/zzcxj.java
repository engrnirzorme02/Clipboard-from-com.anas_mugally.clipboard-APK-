package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcxj implements zzhpx {
    private final zzhqg zza;

    private zzcxj(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcxj zzc(zzhqg zzhqgVar) {
        return new zzcxj(zzhqgVar);
    }

    public static zzcxi zzd(Set set) {
        return new zzcxi(set);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcxi zzb() {
        return new zzcxi(((zzhqj) this.zza).zzb());
    }
}
