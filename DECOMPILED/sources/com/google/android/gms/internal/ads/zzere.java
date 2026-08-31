package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzere implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzere(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzere zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzere(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetb((zzepd) this.zza.zzb(), ((Integer) C3250D.m17200c().zzd(zzbci.zzmQ)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
