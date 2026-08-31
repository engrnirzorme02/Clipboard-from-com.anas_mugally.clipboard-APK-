package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyy implements zzhpx {
    private final zzhqg zza;

    private zzdyy(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzdyy zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdyy(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdyx zzb() {
        return new zzdyx(((zzchd) this.zza).zza(), zzfgc.zzc());
    }
}
