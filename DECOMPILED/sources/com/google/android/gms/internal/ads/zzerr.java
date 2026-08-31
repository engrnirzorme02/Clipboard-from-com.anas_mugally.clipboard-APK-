package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzerr implements zzhpx {
    private final zzhqg zza;

    private zzerr(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzerr zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzerr(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzerp zzb() {
        return new zzerp(zzfgc.zzc(), ((zzchd) this.zza).zza());
    }
}
