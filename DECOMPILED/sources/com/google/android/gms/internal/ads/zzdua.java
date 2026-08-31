package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdua implements zzhpx {
    private final zzhqg zza;

    private zzdua(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdua zzc(zzhqg zzhqgVar) {
        return new zzdua(zzhqgVar);
    }

    public static zzdtz zzd(zzbkl zzbklVar) {
        return new zzdtz(zzbklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdtz zzb() {
        return new zzdtz((zzbkl) this.zza.zzb());
    }
}
