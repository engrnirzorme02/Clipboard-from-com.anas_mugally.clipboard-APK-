package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzchp implements zzhpx {
    private final zzhqg zza;

    private zzchp(zzcgx zzcgxVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzchp zzc(zzcgx zzcgxVar, zzhqg zzhqgVar) {
        return new zzchp(zzcgxVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzckv zzb() {
        zzcgv zzcgvVar = (zzcgv) this.zza.zzb();
        zzhqf.zzb(zzcgvVar);
        return zzcgvVar;
    }
}
