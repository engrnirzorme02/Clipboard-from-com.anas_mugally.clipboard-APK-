package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdjb implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdjb(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdjb zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdjb(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdiy(((zzcrj) this.zza).zza(), ((zzdhs) this.zzb).zza());
    }
}
