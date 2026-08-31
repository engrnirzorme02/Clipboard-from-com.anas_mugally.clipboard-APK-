package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcb implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;
    private final zzhqg zzf;
    private final zzhqg zzg;
    private final zzhqg zzh;

    private zzfcb(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar5;
        this.zzf = zzhqgVar6;
        this.zzg = zzhqgVar7;
        this.zzh = zzhqgVar8;
    }

    public static zzfcb zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8) {
        return new zzfcb(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfca((String) this.zza.zzb(), (zzfbw) this.zzb.zzb(), (Context) this.zzc.zzb(), (zzfbn) this.zzd.zzb(), (zzfcv) this.zze.zzb(), ((zzchs) this.zzf).zza(), (zzauu) this.zzg.zzb(), (zzdsm) this.zzh.zzb());
    }
}
