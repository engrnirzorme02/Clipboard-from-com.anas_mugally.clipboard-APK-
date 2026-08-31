package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdkx implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;
    private final zzhqg zzf;
    private final zzhqg zzg;
    private final zzhqg zzh;
    private final zzhqg zzi;
    private final zzhqg zzj;
    private final zzhqg zzk;

    private zzdkx(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar5;
        this.zzf = zzhqgVar6;
        this.zzg = zzhqgVar7;
        this.zzh = zzhqgVar8;
        this.zzi = zzhqgVar9;
        this.zzj = zzhqgVar10;
        this.zzk = zzhqgVar11;
    }

    public static zzdkx zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11) {
        return new zzdkx(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9, zzhqgVar10, zzhqgVar11);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkw(((zzdla) this.zza).zzc(), ((zzdlb) this.zzb).zzc(), ((zzdlf) this.zzc).zza(), (zzcwk) this.zzd.zzb(), (zzcyl) this.zze.zzb(), (zzcvq) this.zzf.zzb(), (zzddx) this.zzg.zzb(), (Context) this.zzh.zzb(), ((zzcrj) this.zzi).zza(), ((zzchs) this.zzj).zza(), ((zzcvj) this.zzk).zza());
    }
}
