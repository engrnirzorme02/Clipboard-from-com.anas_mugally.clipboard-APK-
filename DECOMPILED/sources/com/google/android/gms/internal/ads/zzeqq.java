package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqq implements zzhpx {
    private final zzhqg zza;

    private zzeqq(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzeqq zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeqq(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetb(zzern.zzc(), ((Integer) C3250D.m17200c().zzd(zzbci.zzna)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}
