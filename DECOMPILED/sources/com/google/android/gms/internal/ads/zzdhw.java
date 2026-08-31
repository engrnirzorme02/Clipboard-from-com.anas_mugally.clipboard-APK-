package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdhw implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdhw(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdhw zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdhw(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddt((Context) this.zza.zzb(), new HashSet(), ((zzcrj) this.zzb).zza());
    }
}
