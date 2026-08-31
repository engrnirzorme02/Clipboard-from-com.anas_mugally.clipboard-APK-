package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcy implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzgcy(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzgcy zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzgcy(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgcx((zzgdn) this.zza.zzb(), ((zzhqj) this.zzb).zzb());
    }
}
