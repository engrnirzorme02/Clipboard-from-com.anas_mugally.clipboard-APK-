package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqs implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeqs(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeqs zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeqs(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetb(((zzerv) this.zza).zzb(), ((Integer) C3250D.m17200c().zzd(zzbci.zzno)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
