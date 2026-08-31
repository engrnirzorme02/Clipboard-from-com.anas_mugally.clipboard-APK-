package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedy implements zzhpx {
    private final zzhqg zza;

    private zzedy(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzedy zzc(zzhqg zzhqgVar) {
        return new zzedy(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzedx zzb() {
        return new zzedx(((zzchd) this.zza).zza());
    }
}
