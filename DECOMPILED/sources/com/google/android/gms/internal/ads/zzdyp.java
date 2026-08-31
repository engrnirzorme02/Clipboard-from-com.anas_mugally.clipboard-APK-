package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyp implements zzhpx {
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

    private zzdyp(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11, zzhqg zzhqgVar12, zzhqg zzhqgVar13) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar6;
        this.zzf = zzhqgVar7;
        this.zzg = zzhqgVar8;
        this.zzh = zzhqgVar11;
        this.zzi = zzhqgVar12;
        this.zzj = zzhqgVar13;
    }

    public static zzdyp zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11, zzhqg zzhqgVar12, zzhqg zzhqgVar13) {
        return new zzdyp(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9, zzhqgVar10, zzhqgVar11, zzhqgVar12, zzhqgVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdyo zzb() {
        return new zzdyo((zzcgv) this.zza.zzb(), ((zzchd) this.zzb).zza(), ((zzchs) this.zzc).zza(), ((zzcvj) this.zzd).zza(), zzfgc.zzc(), (String) this.zze.zzb(), (zzfib) this.zzf.zzb(), (zzdsg) this.zzg.zzb(), zzcic.zza(), zzchz.zza(), (ScheduledExecutorService) this.zzh.zzb(), (zzfjv) this.zzi.zzb(), ((zzcyx) this.zzj).zzb());
    }
}
