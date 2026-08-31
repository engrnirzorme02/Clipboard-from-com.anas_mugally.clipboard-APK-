package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqy implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeqy(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeqy zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeqy(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetb(((zzesz) this.zza).zzb(), ((Integer) C3250D.m17200c().zzd(zzbci.zzmY)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
