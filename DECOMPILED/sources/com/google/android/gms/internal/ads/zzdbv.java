package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdbv implements zzhpx {
    private final zzdbs zza;

    private zzdbv(zzdbs zzdbsVar) {
        this.zza = zzdbsVar;
    }

    public static zzdbv zza(zzdbs zzdbsVar) {
        return new zzdbv(zzdbsVar);
    }

    public static Set zzc(zzdbs zzdbsVar) {
        Set set = Collections.EMPTY_SET;
        zzhqf.zzb(set);
        return set;
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
