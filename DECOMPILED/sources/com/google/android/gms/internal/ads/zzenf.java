package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenf implements zzhpx {
    private final zzhqg zza;

    private zzenf(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzenf zza(zzhqg zzhqgVar) {
        return new zzenf(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzene((Set) this.zza.zzb());
    }
}
