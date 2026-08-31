package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import p036E2.C0334b0;
import p036E2.C0352k0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdo implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;

    private zzbdo(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
    }

    public static zzbdo zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzbdo(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbdn zzb() {
        return new zzbdn((ScheduledExecutorService) this.zza.zzb(), (C0352k0) this.zzb.zzb(), (C0334b0) this.zzc.zzb(), (zzdsr) this.zzd.zzb());
    }
}
