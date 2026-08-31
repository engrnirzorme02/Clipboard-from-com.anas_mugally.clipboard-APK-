package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxi implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdxi(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar3;
        this.zzb = zzhqgVar4;
    }

    public static zzdxi zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzdxi(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdxh zzb() {
        return new zzdxh(zzfgi.zzc(), zzfgc.zzc(), ((zzdxv) this.zza).zzb(), zzhpw.zzc(this.zzb));
    }
}
