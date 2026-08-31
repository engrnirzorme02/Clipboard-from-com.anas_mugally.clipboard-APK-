package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdid implements zzhpx {
    private final zzhqg zza;

    private zzdid(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdid zzc(zzhqg zzhqgVar) {
        return new zzdid(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdic zzb() {
        return new zzdic(((zzdjm) this.zza).zza());
    }
}
