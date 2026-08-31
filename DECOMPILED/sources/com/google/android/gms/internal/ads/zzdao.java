package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdao implements zzhpx {
    private final zzhqg zza;

    private zzdao(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdao zza(zzhqg zzhqgVar) {
        return new zzdao(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdan(((zzhqj) this.zza).zzb());
    }
}
