package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxv implements zzhpx {
    private final zzhqg zza;

    private zzdxv(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzdxv zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdxv(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdyr zzb() {
        return new zzdyr((Context) this.zza.zzb(), zzfgc.zzc());
    }
}
