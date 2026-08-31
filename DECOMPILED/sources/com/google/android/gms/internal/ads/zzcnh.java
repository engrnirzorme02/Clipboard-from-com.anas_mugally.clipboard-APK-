package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnh implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcnh(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcnh zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzcnh(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzayf zzayfVar = (zzayf) this.zza.zzb();
        return new zzcna(zzayfVar.zzd(), (zzbom) this.zzb.zzb(), zzfga.zzc());
    }
}
