package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesg implements zzhpx {
    private final zzhqg zza;

    private zzesg(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzesg zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzesg(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzese zzb() {
        return new zzese(zzfgc.zzc(), (zzdvs) this.zza.zzb());
    }
}
