package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdfv implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdfv(zzdfe zzdfeVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdfv zzc(zzdfe zzdfeVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdfv(zzdfeVar, zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbxo zzb() {
        return new zzbxo(((zzchd) this.zza).zza(), ((zzcvj) this.zzb).zza().zzg);
    }
}
