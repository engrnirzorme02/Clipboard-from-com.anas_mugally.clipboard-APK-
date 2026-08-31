package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgk implements zzhpx {
    private final zzhqg zza;

    private zzcgk(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcgk zza(zzhqg zzhqgVar) {
        return new zzcgk(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcgj(((zzchd) this.zza).zza());
    }
}
