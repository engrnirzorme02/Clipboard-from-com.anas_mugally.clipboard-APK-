package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcst implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcst(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcst zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcst(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcss((zzcsw) this.zza.zzb(), ((zzcvj) this.zzb).zza());
    }
}
