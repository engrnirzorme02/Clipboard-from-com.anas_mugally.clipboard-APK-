package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejx implements zzhpx {
    private final zzhqg zza;

    private zzejx(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzejx zzc(zzhqg zzhqgVar) {
        return new zzejx(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzejw zzb() {
        return new zzejw((zzdgh) this.zza.zzb());
    }
}
