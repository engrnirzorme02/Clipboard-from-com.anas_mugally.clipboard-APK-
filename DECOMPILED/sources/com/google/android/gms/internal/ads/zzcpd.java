package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcpd implements zzhpx {
    private final zzcor zza;
    private final zzhqg zzb;

    private zzcpd(zzcor zzcorVar, zzhqg zzhqgVar) {
        this.zza = zzcorVar;
        this.zzb = zzhqgVar;
    }

    public static zzcpd zza(zzcor zzcorVar, zzhqg zzhqgVar) {
        return new zzcpd(zzcorVar, zzhqgVar);
    }

    public static zzddr zzc(zzcor zzcorVar, zzcqf zzcqfVar) {
        return new zzddr(zzcqfVar, zzbzh.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcqf) this.zzb.zzb());
    }
}
