package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdec implements zzhpx {
    private final zzhqg zza;

    private zzdec(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdec zza(zzhqg zzhqgVar) {
        return new zzdec(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdeb(((zzhqj) this.zza).zzb());
    }
}
