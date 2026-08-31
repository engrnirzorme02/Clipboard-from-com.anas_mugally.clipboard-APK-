package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdgf implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdgf(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdgf zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdgf(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdge((zzcyd) this.zza.zzb(), (zzddl) this.zzb.zzb());
    }
}
