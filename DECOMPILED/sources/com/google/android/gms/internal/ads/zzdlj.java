package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3446N;
import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdlj implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdlj(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdlj zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzdlj(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdli((C3446N) this.zza.zzb(), (InterfaceC3750e) this.zzb.zzb(), zzfgc.zzc());
    }
}
