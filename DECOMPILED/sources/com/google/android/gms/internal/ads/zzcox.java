package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcox implements zzhpx {
    private final zzcor zza;
    private final zzhqg zzb;

    private zzcox(zzcor zzcorVar, zzhqg zzhqgVar) {
        this.zza = zzcorVar;
        this.zzb = zzhqgVar;
    }

    public static zzcox zzc(zzcor zzcorVar, zzhqg zzhqgVar) {
        return new zzcox(zzcorVar, zzhqgVar);
    }

    public static zzcok zzd(zzcor zzcorVar, Object obj) {
        return (zzcon) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcok zzb() {
        return ((zzcoo) this.zzb).zzb();
    }
}
