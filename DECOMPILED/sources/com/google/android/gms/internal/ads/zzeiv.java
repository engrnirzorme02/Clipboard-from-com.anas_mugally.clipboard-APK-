package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeiv implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeiv(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeiv zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeiv(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeiu zzb() {
        return new zzeiu((zzejy) this.zza.zzb(), (zzdqc) this.zzb.zzb());
    }
}
