package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebp implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzebp(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzebp zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzebp(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzebo zzb() {
        return new zzebo(((zzebh) this.zza).zzb(), ((zzcgy) this.zzb).zzb());
    }
}
