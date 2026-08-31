package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzerj implements zzhpx {
    private final zzhqg zza;

    private zzerj(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzerj zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzerj(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeri zzb() {
        return new zzeri(((zzchd) this.zza).zza(), zzfgc.zzc());
    }
}
