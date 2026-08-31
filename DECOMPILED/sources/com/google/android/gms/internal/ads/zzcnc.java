package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnc implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcnc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcnc zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcnc(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcnb(((zzchd) this.zza).zza(), (zzayf) this.zzb.zzb());
    }
}
