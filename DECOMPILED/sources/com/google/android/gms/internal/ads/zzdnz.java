package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdnz implements zzhpx {
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

    private zzdnz(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar5;
        this.zzf = zzhqgVar7;
        this.zzg = zzhqgVar8;
        this.zzh = zzhqgVar9;
        this.zzi = zzhqgVar10;
        this.zzj = zzhqgVar11;
    }

    public static zzdnz zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11) {
        return new zzdnz(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9, zzhqgVar10, zzhqgVar11);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdnv(((zzchd) this.zza).zza(), (Executor) this.zzb.zzb(), (zzauu) this.zzc.zzb(), ((zzchs) this.zzd).zza(), ((zzcjm) this.zze).zza(), zzcke.zza(), (zzecn) this.zzf.zzb(), (zzfjv) this.zzg.zzb(), (zzdsm) this.zzh.zzb(), (zzecy) this.zzi.zzb(), (zzfdg) this.zzj.zzb());
    }
}
