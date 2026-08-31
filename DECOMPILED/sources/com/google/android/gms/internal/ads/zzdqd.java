package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqd implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdqd(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdqd zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdqd(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdqc(((zzckh) this.zza).zzb(), (zzdpz) this.zzb.zzb());
    }
}
