package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcpb implements zzhpx {
    private final zzcor zza;
    private final zzhqg zzb;

    private zzcpb(zzcor zzcorVar, zzhqg zzhqgVar) {
        this.zza = zzcorVar;
        this.zzb = zzhqgVar;
    }

    public static zzcpb zza(zzcor zzcorVar, zzhqg zzhqgVar) {
        return new zzcpb(zzcorVar, zzhqgVar);
    }

    public static Set zzc(zzcor zzcorVar, zzcqh zzcqhVar) {
        Set setSingleton = Collections.singleton(new zzddr(zzcqhVar, zzbzh.zzg));
        zzhqf.zzb(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcqh) this.zzb.zzb());
    }
}
