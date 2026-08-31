package com.google.android.gms.internal.ads;

import p404z2.C7605v;

/* JADX INFO: loaded from: classes2.dex */
public final class zzckc implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzckc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzckc zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzckc(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7605v(((zzchd) this.zza).zza(), (String) this.zzb.zzb());
    }
}
