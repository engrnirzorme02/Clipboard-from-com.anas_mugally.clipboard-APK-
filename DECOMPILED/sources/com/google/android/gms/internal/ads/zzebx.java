package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebx implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzebx(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzebx zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzebx(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzebw zzb() {
        return new zzebw((zzebk) this.zza.zzb(), ((zzebp) this.zzb).zzb());
    }
}
