package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcsj implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcsj(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcsj zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcsj(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcsi((InterfaceC3750e) this.zza.zzb(), (zzbyp) this.zzb.zzb());
    }
}
