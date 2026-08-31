package com.google.android.gms.internal.ads;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesc implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzesc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzesc zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzesc(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzesa zzb() {
        return new zzesa(((zzchd) this.zza).zza(), (Intent) this.zzb.zzb());
    }
}
