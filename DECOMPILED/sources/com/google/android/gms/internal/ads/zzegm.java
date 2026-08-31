package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegm implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;
    private final zzhqg zzf;
    private final zzhqg zzg;

    private zzegm(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar3;
        this.zzc = zzhqgVar4;
        this.zzd = zzhqgVar5;
        this.zze = zzhqgVar6;
        this.zzf = zzhqgVar7;
        this.zzg = zzhqgVar8;
    }

    public static zzegm zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9) {
        return new zzegm(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzegl((zzdhd) this.zza.zzb(), zzfgc.zzc(), ((zzdlo) this.zzb).zzb(), (zzfeb) this.zzc.zzb(), (zzdod) this.zzd.zzb(), (zzdsg) this.zze.zzb(), ((zzchs) this.zzf).zza(), (Context) this.zzg.zzb(), zzcjp.zzc());
    }
}
