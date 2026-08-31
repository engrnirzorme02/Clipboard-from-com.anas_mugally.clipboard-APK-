package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcpf implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcpf(zzcor zzcorVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcpf zzc(zzcor zzcorVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcpf(zzcorVar, zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbxo zzb() {
        return new zzbxo(((zzchd) this.zza).zza(), ((zzcvj) this.zzb).zza().zzg);
    }
}
