package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkj implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzfkj(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzfkj zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzfkj(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfki((zzfko) this.zza.zzb(), (zzfkb) this.zzb.zzb());
    }
}
