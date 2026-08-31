package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhk implements zzhpx {
    private final zzhqg zza;

    private zzfhk(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzfhk zzc(zzhqg zzhqgVar) {
        return new zzfhk(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfhg zzb() {
        return new zzfhg(((zzhqj) this.zza).zzb());
    }
}
