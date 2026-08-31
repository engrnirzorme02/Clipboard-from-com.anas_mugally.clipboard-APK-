package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzclv implements zzhpx {
    private final zzhqg zza;

    private zzclv(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzclv zza(zzhqg zzhqgVar) {
        return new zzclv(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzclu((Context) this.zza.zzb());
    }
}
