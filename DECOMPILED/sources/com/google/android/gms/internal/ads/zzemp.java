package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemp implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzemp(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzemp zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzemp(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemn((InterfaceC3750e) this.zza.zzb(), ((zzcvj) this.zzb).zza());
    }
}
