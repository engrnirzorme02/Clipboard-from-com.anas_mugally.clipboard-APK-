package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebj implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzebj(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzebj zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzebj(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzebi(((zzebu) this.zza).zzb(), ((zzcgy) this.zzb).zzb());
    }
}
