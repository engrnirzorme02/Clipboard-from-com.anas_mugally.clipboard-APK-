package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdtm implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdtm(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdtm zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdtm(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdtl((zzdsz) this.zza.zzb(), (zzcgv) this.zzb.zzb());
    }
}
