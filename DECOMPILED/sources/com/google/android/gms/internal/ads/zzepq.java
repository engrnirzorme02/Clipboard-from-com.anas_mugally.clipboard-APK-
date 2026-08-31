package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepq implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzepq(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar4;
    }

    public static zzepq zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzepq(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzepd(((zzeny) this.zza).zzb(), ((Long) zzbdx.zza.zze()).longValue(), (InterfaceC3750e) this.zzb.zzb(), zzfgc.zzc(), (zzdsm) this.zzc.zzb());
    }
}
