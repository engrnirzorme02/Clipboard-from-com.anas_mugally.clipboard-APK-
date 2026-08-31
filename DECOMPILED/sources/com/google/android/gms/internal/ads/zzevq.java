package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevq implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;

    private zzevq(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7) {
        this.zza = zzhqgVar2;
        this.zzb = zzhqgVar3;
        this.zzc = zzhqgVar5;
        this.zzd = zzhqgVar6;
        this.zze = zzhqgVar7;
    }

    public static zzevq zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7) {
        return new zzevq(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7);
    }

    public static zzevo zzc(zzbyn zzbynVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i7, boolean z7, boolean z8) {
        return new zzevo(zzbynVar, context, scheduledExecutorService, executor, i7, z7, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevo(zzckr.zza(), ((zzchd) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzfgc.zzc(), ((zzeww) this.zzc).zzb().intValue(), ((zzewx) this.zzd).zzb().booleanValue(), ((zzewy) this.zze).zzb().booleanValue());
    }
}
