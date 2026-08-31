package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsy implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdsy(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdsy zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdsy(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdsx((String) this.zza.zzb(), (zzdsr) this.zzb.zzb());
    }
}
