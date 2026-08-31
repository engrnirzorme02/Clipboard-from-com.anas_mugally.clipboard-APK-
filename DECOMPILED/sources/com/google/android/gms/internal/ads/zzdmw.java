package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmw implements zzhpx {
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

    private zzdmw(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10) {
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
    }

    public static zzdmw zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10) {
        return new zzdmw(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9, zzhqgVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdmu(((zzcvj) this.zza).zza(), (Executor) this.zzb.zzb(), (zzdpi) this.zzc.zzb(), (Context) this.zzd.zzb(), (zzdsm) this.zze.zzb(), (zzfjv) this.zzf.zzb(), (zzecn) this.zzg.zzb(), (zzdod) this.zzh.zzb(), (zzdsg) this.zzi.zzb(), (zzdtp) this.zzj.zzb());
    }
}
