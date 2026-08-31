package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcml implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcml(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcml zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcml(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcmk(((zzcrj) this.zza).zza(), ((zzchv) this.zzb).zzb());
    }
}
