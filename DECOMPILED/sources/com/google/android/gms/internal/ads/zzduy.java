package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduy implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;
    private final zzhqg zzf;
    private final zzhqg zzg;
    private final zzhqg zzh;
    private final zzhqg zzi;

    private zzduy(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar5;
        this.zze = zzhqgVar6;
        this.zzf = zzhqgVar7;
        this.zzg = zzhqgVar8;
        this.zzh = zzhqgVar9;
        this.zzi = zzhqgVar10;
    }

    public static zzduy zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10) {
        return new zzduy(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9, zzhqgVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdux((Executor) this.zza.zzb(), ((zzchd) this.zzb).zza(), ((zzche) this.zzc).zza(), zzfgc.zzc(), (zzdqc) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb(), (zzdsx) this.zzf.zzb(), ((zzchs) this.zzg).zza(), ((zzdcz) this.zzh).zzb(), (zzfie) this.zzi.zzb());
    }
}
