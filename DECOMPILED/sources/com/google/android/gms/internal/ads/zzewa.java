package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewa implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzewa(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar3;
        this.zzc = zzhqgVar4;
    }

    public static zzewa zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        return new zzewa(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5);
    }

    public static zzevy zzc(String str, zzbak zzbakVar, zzbyv zzbyvVar, ScheduledExecutorService scheduledExecutorService, zzgpd zzgpdVar) {
        return new zzevy(str, zzbakVar, zzbyvVar, scheduledExecutorService, zzgpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevy(((zzewv) this.zza).zza(), zzckj.zza(), (zzbyv) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzfgc.zzc());
    }
}
