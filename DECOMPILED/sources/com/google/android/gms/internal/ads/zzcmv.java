package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmv implements zzhpx {
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
    private final zzhqg zzm;
    private final zzhqg zzn;
    private final zzhqg zzo;

    private zzcmv(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11, zzhqg zzhqgVar12, zzhqg zzhqgVar13, zzhqg zzhqgVar14, zzhqg zzhqgVar15, zzhqg zzhqgVar16, zzhqg zzhqgVar17) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar3;
        this.zzc = zzhqgVar4;
        this.zzd = zzhqgVar5;
        this.zze = zzhqgVar6;
        this.zzf = zzhqgVar7;
        this.zzg = zzhqgVar8;
        this.zzh = zzhqgVar9;
        this.zzi = zzhqgVar10;
        this.zzj = zzhqgVar11;
        this.zzk = zzhqgVar12;
        this.zzl = zzhqgVar14;
        this.zzm = zzhqgVar15;
        this.zzn = zzhqgVar16;
        this.zzo = zzhqgVar17;
    }

    public static zzcmv zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11, zzhqg zzhqgVar12, zzhqg zzhqgVar13, zzhqg zzhqgVar14, zzhqg zzhqgVar15, zzhqg zzhqgVar16, zzhqg zzhqgVar17) {
        return new zzcmv(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9, zzhqgVar10, zzhqgVar11, zzhqgVar12, zzhqgVar13, zzhqgVar14, zzhqgVar15, zzhqgVar16, zzhqgVar17);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcmu(((zzchd) this.zza).zza(), zzfgc.zzc(), (Executor) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), ((zzcrm) this.zzd).zza(), ((zzcrj) this.zze).zza(), (zzfjr) this.zzf.zzb(), (zzfdp) this.zzg.zzb(), (View) this.zzh.zzb(), (zzcek) this.zzi.zzb(), (zzauu) this.zzj.zzb(), (zzbdp) this.zzk.zzb(), zzcjn.zzc(), (zzfib) this.zzl.zzb(), ((zzcvf) this.zzm).zza(), (zzcyh) this.zzn.zzb(), (zzcum) this.zzo.zzb());
    }
}
