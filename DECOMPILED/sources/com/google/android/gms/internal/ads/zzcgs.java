package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgs implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcgs(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcgs zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcgs(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcgr((zzcgj) this.zza.zzb(), (zzdsm) this.zzb.zzb());
    }
}
