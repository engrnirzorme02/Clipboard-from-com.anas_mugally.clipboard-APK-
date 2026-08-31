package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdoi implements zzhpx {
    private final zzhqg zza;

    private zzdoi(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdoi zzc(zzhqg zzhqgVar) {
        return new zzdoi(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdoh zzb() {
        return new zzdoh(((zzdjm) this.zza).zza());
    }
}
