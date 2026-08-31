package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeux implements zzhpx {
    private final zzhqg zza;

    private zzeux(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzeux zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeux(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeuv zzb() {
        return new zzeuv(((zzchd) this.zza).zza(), zzfgc.zzc());
    }
}
