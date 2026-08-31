package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzehs implements zzhpx {
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
    private final zzhqg zzl;

    private zzehs(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11, zzhqg zzhqgVar12, zzhqg zzhqgVar13) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar5;
        this.zzf = zzhqgVar6;
        this.zzg = zzhqgVar7;
        this.zzh = zzhqgVar9;
        this.zzi = zzhqgVar10;
        this.zzj = zzhqgVar11;
        this.zzk = zzhqgVar12;
        this.zzl = zzhqgVar13;
    }

    public static zzehs zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11, zzhqg zzhqgVar12, zzhqg zzhqgVar13) {
        return new zzehs(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9, zzhqgVar10, zzhqgVar11, zzhqgVar12, zzhqgVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehr zzb() {
        return new zzehr(((zzchd) this.zza).zza(), (zzfhh) this.zzb.zzb(), (zzehk) this.zzc.zzb(), (zzcvu) this.zzd.zzb(), (zzfjr) this.zze.zzb(), (zzfjv) this.zzf.zzb(), (zzcqv) this.zzg.zzb(), zzfgc.zzc(), (ScheduledExecutorService) this.zzh.zzb(), (zzeee) this.zzi.zzb(), (zzfib) this.zzj.zzb(), ((zzegw) this.zzk).zzb(), (zzdsg) this.zzl.zzb());
    }
}
