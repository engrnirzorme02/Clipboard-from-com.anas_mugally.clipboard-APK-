package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeaq implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;

    private zzeaq(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar4;
        this.zzc = zzhqgVar5;
        this.zzd = zzhqgVar6;
        this.zze = zzhqgVar8;
    }

    public static zzeaq zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8) {
        return new zzeaq(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeap(((zzchd) this.zza).zza(), zzfgc.zzc(), zzcic.zza(), ((zzchp) this.zzb).zzb(), ((zzeay) this.zzc).zzb(), (ArrayDeque) this.zzd.zzb(), zzchz.zza(), (zzfie) this.zze.zzb());
    }
}
