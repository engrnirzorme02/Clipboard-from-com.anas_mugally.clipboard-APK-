package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebh implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzebh(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzebh zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzebh(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzebg zzb() {
        return new zzebg(((zzebd) this.zza).zzb(), (zzgpd) this.zzb.zzb());
    }
}
