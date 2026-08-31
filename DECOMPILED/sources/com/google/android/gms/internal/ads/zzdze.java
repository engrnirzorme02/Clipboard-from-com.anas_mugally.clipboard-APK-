package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdze implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdze(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdze zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdze(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzd zzb() {
        return new zzdzd(((zzchd) this.zza).zza(), (zzbxr) this.zzb.zzb());
    }
}
