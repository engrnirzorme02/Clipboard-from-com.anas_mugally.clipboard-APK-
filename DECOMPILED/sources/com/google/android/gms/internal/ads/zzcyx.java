package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcyx implements zzhpx {
    private final zzhqg zza;

    private zzcyx(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcyx zzc(zzhqg zzhqgVar) {
        return new zzcyx(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcyw zzb() {
        return new zzcyw(((zzhqj) this.zza).zzb());
    }
}
