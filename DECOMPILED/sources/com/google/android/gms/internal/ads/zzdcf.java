package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdcf implements zzhpx {
    private final zzdbs zza;

    private zzdcf(zzdbs zzdbsVar) {
        this.zza = zzdbsVar;
    }

    public static zzdcf zza(zzdbs zzdbsVar) {
        return new zzdcf(zzdbsVar);
    }

    public static Set zzc(zzdbs zzdbsVar) {
        return zzdbsVar.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return this.zza.zzm();
    }
}
