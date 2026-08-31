package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgdm implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzgdm(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzgdm zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzgdm(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgdl((Context) this.zza.zzb(), (ExecutorService) this.zzb.zzb());
    }
}
