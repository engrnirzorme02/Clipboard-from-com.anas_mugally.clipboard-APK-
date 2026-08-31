package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqw implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeqw(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeqw zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeqw(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetb(((zzesn) this.zza).zzb(), ((Integer) C3250D.m17200c().zzd(zzbci.zznp)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
