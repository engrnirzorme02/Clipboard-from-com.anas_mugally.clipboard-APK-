package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzera implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzera(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzera zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzera(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetb(((zzetl) this.zza).zzb(), ((Integer) C3250D.m17200c().zzd(zzbci.zzmU)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
