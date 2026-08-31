package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeto implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeto(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeto zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeto(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetm((String) this.zza.zzb(), ((Integer) this.zzb.zzb()).intValue());
    }
}
