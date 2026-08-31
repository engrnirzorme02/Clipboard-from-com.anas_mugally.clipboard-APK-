package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcoo implements zzhpx {
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

    private zzcoo(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10) {
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

    public static zzcoo zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9, zzhqg zzhqgVar10) {
        return new zzcoo(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9, zzhqgVar10);
    }

    public static zzcon zzd(zzcqr zzcqrVar, Context context, zzfck zzfckVar, View view, zzcek zzcekVar, zzcqq zzcqqVar, zzdje zzdjeVar, zzdeb zzdebVar, zzhpr zzhprVar, Executor executor) {
        return new zzcon(zzcqrVar, context, zzfckVar, view, zzcekVar, zzcqqVar, zzdjeVar, zzdebVar, zzhprVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcon zzb() {
        return new zzcon(((zzcsz) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcou) this.zzc).zza(), ((zzcot) this.zzd).zza(), ((zzcpi) this.zze).zza(), ((zzcov) this.zzf).zza(), ((zzdhb) this.zzg).zza(), (zzdeb) this.zzh.zzb(), zzhpw.zzc(this.zzi), (Executor) this.zzj.zzb());
    }
}
