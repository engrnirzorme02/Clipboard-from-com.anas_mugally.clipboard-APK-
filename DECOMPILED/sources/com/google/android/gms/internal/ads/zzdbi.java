package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdbi implements zzhpx {
    private final zzhqg zza;

    private zzdbi(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdbi zza(zzhqg zzhqgVar) {
        return new zzdbi(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdbh(((zzhqj) this.zza).zzb());
    }
}
