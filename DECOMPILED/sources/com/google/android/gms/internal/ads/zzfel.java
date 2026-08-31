package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfel implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzfel(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzfel zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzfel(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfek(((zzchd) this.zza).zza(), ((zzchv) this.zzb).zzb());
    }
}
