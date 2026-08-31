package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3369m2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzelr implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;
    private final zzhqg zzf;
    private final zzhqg zzg;
    private final zzhqg zzh;
    private final zzhqg zzi;

    private zzelr(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar5;
        this.zzf = zzhqgVar6;
        this.zzg = zzhqgVar7;
        this.zzh = zzhqgVar8;
        this.zzi = zzhqgVar9;
    }

    public static zzelr zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9) {
        return new zzelr(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzelq((Context) this.zza.zzb(), (C3369m2) this.zzb.zzb(), (String) this.zzc.zzb(), (zzfan) this.zzd.zzb(), (zzeli) this.zze.zzb(), (zzfbn) this.zzf.zzb(), ((zzchs) this.zzg).zza(), (zzauu) this.zzh.zzb(), (zzdsm) this.zzi.zzb());
    }
}
