package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrc implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdrc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdrc zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdrc(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdrb((zzbbh) this.zza.zzb(), (zzfaf) this.zzb.zzb());
    }
}
