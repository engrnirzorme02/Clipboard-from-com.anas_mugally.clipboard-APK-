package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcux implements zzhpx {
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

    private zzcux(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11, zzhqg zzhqgVar12, zzhqg zzhqgVar13) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar6;
        this.zzf = zzhqgVar7;
        this.zzg = zzhqgVar8;
        this.zzh = zzhqgVar9;
        this.zzi = zzhqgVar10;
        this.zzj = zzhqgVar11;
        this.zzk = zzhqgVar12;
        this.zzl = zzhqgVar13;
    }

    public static zzcux zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10, zzhqg zzhqgVar11, zzhqg zzhqgVar12, zzhqg zzhqgVar13) {
        return new zzcux(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9, zzhqgVar10, zzhqgVar11, zzhqgVar12, zzhqgVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcuw zzb() {
        return new zzcuw((zzfhh) this.zza.zzb(), ((zzchs) this.zzb).zza(), (ApplicationInfo) this.zzc.zzb(), ((zzdxu) this.zzd).zzb(), zzepw.zzc(), (PackageInfo) this.zze.zzb(), zzhpw.zzc(this.zzf), ((zzcgy) this.zzg).zzb(), (String) this.zzh.zzb(), ((zzeut) this.zzi).zzb(), ((zzcvj) this.zzj).zza(), (zzdbl) this.zzk.zzb(), ((Integer) this.zzl.zzb()).intValue());
    }
}
