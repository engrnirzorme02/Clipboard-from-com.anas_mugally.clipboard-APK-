package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxy implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzbxy(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzbxy zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzbxy(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbxx((Context) this.zza.zzb(), ((zzbxl) this.zzb).zzb());
    }
}
