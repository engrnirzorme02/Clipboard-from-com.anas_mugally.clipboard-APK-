package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzc implements zzhpx {
    private final zzhqg zza;

    private zzdzc(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdzc zzc(zzhqg zzhqgVar) {
        return new zzdzc(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzb zzb() {
        return new zzdzb(((zzchd) this.zza).zza());
    }
}
