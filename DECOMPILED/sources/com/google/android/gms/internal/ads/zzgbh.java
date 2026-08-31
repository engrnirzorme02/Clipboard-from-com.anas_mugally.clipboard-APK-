package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbh implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzgbh(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzgbh zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzgbh(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzaxq zzaxqVarZzb = zzfpe.zzb((Context) this.zza.zzb(), (zzfoh) this.zzb.zzb());
        zzhqf.zzb(zzaxqVarZzb);
        return zzaxqVarZzb;
    }
}
