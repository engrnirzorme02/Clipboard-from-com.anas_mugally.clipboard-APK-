package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgam implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;

    private zzgam(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
    }

    public static zzgam zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzgam(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzhqg zzhqgVar = this.zzc;
        zzhqg zzhqgVar2 = this.zzb;
        zzhpr zzhprVarZzc = zzhpw.zzc(this.zza);
        zzhpr zzhprVarZzc2 = zzhpw.zzc(zzhqgVar2);
        ExecutorService executorService = (ExecutorService) zzhqgVar.zzb();
        zzfui zzfuiVar = (zzfui) this.zzd.zzb();
        return new zzgal(zzhprVarZzc, zzhprVarZzc2, executorService, zzfuiVar.zzi().zza(), zzfuiVar.zzi().zzb(), zzfuiVar.zzi().zzc());
    }
}
