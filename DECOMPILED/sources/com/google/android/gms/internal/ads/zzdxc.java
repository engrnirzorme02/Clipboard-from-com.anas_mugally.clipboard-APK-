package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxc implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdxc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdxc zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdxc(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdxb(((zzchd) this.zza).zza(), (zzdsm) this.zzb.zzb());
    }
}
