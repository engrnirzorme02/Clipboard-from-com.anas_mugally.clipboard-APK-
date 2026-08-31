package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.InterfaceC3494q0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgy implements zzhpx {
    private final zzhqg zza;

    private zzcgy(zzcgx zzcgxVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcgy zzc(zzcgx zzcgxVar, zzhqg zzhqgVar) {
        return new zzcgy(zzcgxVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3494q0 zzb() {
        return ((zzbyv) this.zza.zzb()).zzo();
    }
}
