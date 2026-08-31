package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeny implements zzhpx {
    private final zzhqg zza;

    private zzeny(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzeny zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeny(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzenw zzb() {
        return new zzenw(zzfgc.zzc(), (zzbyv) this.zza.zzb());
    }
}
