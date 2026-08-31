package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdhe implements zzhpx {
    private final zzhqg zza;

    private zzdhe(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdhe zza(zzhqg zzhqgVar) {
        return new zzdhe(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdhb) this.zza).zza().zzd() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        zzhqf.zzb(setSingleton);
        return setSingleton;
    }
}
