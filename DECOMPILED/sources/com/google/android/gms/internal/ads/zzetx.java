package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzetx implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;
    private final zzhqg zzf;
    private final zzhqg zzg;
    private final zzhqg zzh;
    private final zzhqg zzi;

    private zzetx(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10) {
        this.zza = zzhqgVar2;
        this.zzb = zzhqgVar3;
        this.zzc = zzhqgVar4;
        this.zzd = zzhqgVar5;
        this.zze = zzhqgVar6;
        this.zzf = zzhqgVar7;
        this.zzg = zzhqgVar8;
        this.zzh = zzhqgVar9;
        this.zzi = zzhqgVar10;
    }

    public static zzetx zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10) {
        return new zzetx(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9, zzhqgVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetv(zzfgc.zzc(), (ScheduledExecutorService) this.zza.zzb(), (String) this.zzb.zzb(), (zzekd) this.zzc.zzb(), (Context) this.zzd.zzb(), ((zzcvj) this.zze).zza(), (zzejy) this.zzf.zzb(), (zzdqc) this.zzg.zzb(), (zzduz) this.zzh.zzb(), ((Integer) this.zzi.zzb()).intValue());
    }
}
