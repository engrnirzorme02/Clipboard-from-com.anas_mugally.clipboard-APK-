package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcoj implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzcoj(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzcoj zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzcoj(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    public static zzcyt zzd(ScheduledExecutorService scheduledExecutorService, InterfaceC3750e interfaceC3750e, zzdsm zzdsmVar) {
        return new zzcyt(scheduledExecutorService, interfaceC3750e, zzdsmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcyt zzb() {
        return zzd((ScheduledExecutorService) this.zza.zzb(), (InterfaceC3750e) this.zzb.zzb(), (zzdsm) this.zzc.zzb());
    }
}
