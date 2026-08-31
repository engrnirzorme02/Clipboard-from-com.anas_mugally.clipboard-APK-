package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3446N;

/* JADX INFO: loaded from: classes2.dex */
public final class zzckb implements zzhpx {
    private final zzhqg zza;

    private zzckb(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzckb zza(zzhqg zzhqgVar) {
        return new zzckb(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3446N(((zzchd) this.zza).zza());
    }
}
