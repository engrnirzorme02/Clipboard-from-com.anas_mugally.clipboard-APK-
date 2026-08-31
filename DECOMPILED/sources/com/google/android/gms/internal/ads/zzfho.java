package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfho implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzfho(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzfho zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzfho(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfhn(((zzchd) this.zza).zza(), (zzfib) this.zzb.zzb());
    }
}
