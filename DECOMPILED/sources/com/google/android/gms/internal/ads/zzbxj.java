package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxj implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzbxj(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzbxj zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzbxj(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbxi((InterfaceC3750e) this.zza.zzb(), (InterfaceC3494q0) this.zzb.zzb(), (zzbxr) this.zzc.zzb());
    }
}
