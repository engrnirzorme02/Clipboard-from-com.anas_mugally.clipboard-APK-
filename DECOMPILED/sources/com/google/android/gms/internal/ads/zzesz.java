package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesz implements zzhpx {
    private final zzhqg zza;

    private zzesz(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzesz zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzesz(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzesx zzb() {
        return new zzesx(zzfgc.zzc(), (zzdtp) this.zza.zzb());
    }
}
