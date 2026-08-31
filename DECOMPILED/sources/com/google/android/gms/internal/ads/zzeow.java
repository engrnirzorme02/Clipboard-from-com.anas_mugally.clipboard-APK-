package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeow implements zzhpx {
    private final zzhqg zza;

    private zzeow(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzeow zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeow(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeou zzb() {
        return new zzeou(zzfgc.zzc(), ((zzchd) this.zza).zza());
    }
}
